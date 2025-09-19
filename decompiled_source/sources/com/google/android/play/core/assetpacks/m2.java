package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* loaded from: classes.dex */
final class m2 {
    private static final c.b.a.a.a.a.e h = new c.b.a.a.a.a.e("SliceMetadataManager");

    /* renamed from: b, reason: collision with root package name */
    private final c0 f1699b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1700c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1701d;

    /* renamed from: e, reason: collision with root package name */
    private final long f1702e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1703f;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f1698a = new byte[8192];
    private int g = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m2(c0 c0Var, String str, int i, long j, String str2) {
        this.f1699b = c0Var;
        this.f1700c = str;
        this.f1701d = i;
        this.f1702e = j;
        this.f1703f = str2;
    }

    private final File n() {
        File y = this.f1699b.y(this.f1700c, this.f1701d, this.f1702e, this.f1703f);
        if (!y.exists()) {
            y.mkdirs();
        }
        return y;
    }

    private final File o() {
        File n = this.f1699b.n(this.f1700c, this.f1701d, this.f1702e, this.f1703f);
        n.getParentFile().mkdirs();
        n.createNewFile();
        return n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l2 a() {
        File n = this.f1699b.n(this.f1700c, this.f1701d, this.f1702e, this.f1703f);
        if (!n.exists()) {
            throw new u0("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(n);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new u0("Slice checkpoint file corrupt.");
            }
            try {
                int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty("fileName");
                long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new l2(parseInt, property, parseLong, parseLong2, parseInt2);
            } catch (NumberFormatException e2) {
                throw new u0("Slice checkpoint file corrupt.", e2);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                c.b.a.a.a.a.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(i().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                c.b.a.a.a.a.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(long j, byte[] bArr, int i, int i2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(i(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                c.b.a.a.a.a.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(InputStream inputStream, long j) {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(i(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f1698a);
                if (read > 0) {
                    randomAccessFile.write(this.f1698a, 0, read);
                }
            } while (read == this.f1698a.length);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                c.b.a.a.a.a.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str, long j, long j2, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                c.b.a.a.a.a.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(byte[] bArr) {
        this.g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.g))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException e2) {
            throw new u0("Could not write metadata file.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(byte[] bArr, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File s = this.f1699b.s(this.f1700c, this.f1701d, this.f1702e, this.f1703f);
            if (s.exists()) {
                s.delete();
            }
            fileOutputStream = new FileOutputStream(s);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable th) {
                    c.b.a.a.a.a.c0.a(th, th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(byte[] bArr, InputStream inputStream) {
        this.g++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f1698a);
            while (read > 0) {
                fileOutputStream.write(this.f1698a, 0, read);
                read = inputStream.read(this.f1698a);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                c.b.a.a.a.a.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File i() {
        return new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.g)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                c.b.a.a.a.a.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(byte[] bArr, int i) {
        this.g++;
        FileOutputStream fileOutputStream = new FileOutputStream(i());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                c.b.a.a.a.a.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int l() {
        File n = this.f1699b.n(this.f1700c, this.f1701d, this.f1702e, this.f1703f);
        if (!n.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(n);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new u0("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                c.b.a.a.a.a.c0.a(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        File n = this.f1699b.n(this.f1700c, this.f1701d, this.f1702e, this.f1703f);
        if (!n.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(n);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                h.e("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } finally {
            }
        } catch (IOException e2) {
            h.e("Could not read checkpoint while checking if extraction finished. %s", e2);
            return false;
        }
    }
}
