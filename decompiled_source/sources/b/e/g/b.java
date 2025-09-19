package b.e.g;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import b.e.d.d.f;
import b.e.e.k;
import b.e.g.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    static final b.d.e<String, Typeface> f1117a = new b.d.e<>(16);

    /* renamed from: b, reason: collision with root package name */
    private static final b.e.g.c f1118b = new b.e.g.c("fonts", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f1119c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final b.d.g<String, ArrayList<c.d<g>>> f1120d = new b.d.g<>();

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator<byte[]> f1121e = new d();

    /* loaded from: classes.dex */
    class a implements Callable<g> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1122a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.e.g.a f1123b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1124c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f1125d;

        a(Context context, b.e.g.a aVar, int i, String str) {
            this.f1122a = context;
            this.f1123b = aVar;
            this.f1124c = i;
            this.f1125d = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g call() {
            g f2 = b.f(this.f1122a, this.f1123b, this.f1124c);
            Typeface typeface = f2.f1136a;
            if (typeface != null) {
                b.f1117a.d(this.f1125d, typeface);
            }
            return f2;
        }
    }

    /* renamed from: b.e.g.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0031b implements c.d<g> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f.a f1126a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f1127b;

        C0031b(f.a aVar, Handler handler) {
            this.f1126a = aVar;
            this.f1127b = handler;
        }

        @Override // b.e.g.c.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g gVar) {
            int i;
            f.a aVar;
            if (gVar == null) {
                aVar = this.f1126a;
                i = 1;
            } else {
                i = gVar.f1137b;
                if (i == 0) {
                    this.f1126a.b(gVar.f1136a, this.f1127b);
                    return;
                }
                aVar = this.f1126a;
            }
            aVar.a(i, this.f1127b);
        }
    }

    /* loaded from: classes.dex */
    class c implements c.d<g> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1128a;

        c(String str) {
            this.f1128a = str;
        }

        @Override // b.e.g.c.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g gVar) {
            synchronized (b.f1119c) {
                ArrayList<c.d<g>> arrayList = b.f1120d.get(this.f1128a);
                if (arrayList == null) {
                    return;
                }
                b.f1120d.remove(this.f1128a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).a(gVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Comparator<byte[]> {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length == bArr2.length) {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i = bArr[i3];
                        i2 = bArr2[i3];
                    }
                }
                return 0;
            }
            i = bArr.length;
            i2 = bArr2.length;
            return i - i2;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f1129a;

        /* renamed from: b, reason: collision with root package name */
        private final f[] f1130b;

        public e(int i, f[] fVarArr) {
            this.f1129a = i;
            this.f1130b = fVarArr;
        }

        public f[] a() {
            return this.f1130b;
        }

        public int b() {
            return this.f1129a;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f1131a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1132b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1133c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f1134d;

        /* renamed from: e, reason: collision with root package name */
        private final int f1135e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            b.e.i.d.b(uri);
            this.f1131a = uri;
            this.f1132b = i;
            this.f1133c = i2;
            this.f1134d = z;
            this.f1135e = i3;
        }

        public int a() {
            return this.f1135e;
        }

        public int b() {
            return this.f1132b;
        }

        public Uri c() {
            return this.f1131a;
        }

        public int d() {
            return this.f1133c;
        }

        public boolean e() {
            return this.f1134d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        final Typeface f1136a;

        /* renamed from: b, reason: collision with root package name */
        final int f1137b;

        g(Typeface typeface, int i) {
            this.f1136a = typeface;
            this.f1137b = i;
        }
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static e c(Context context, CancellationSignal cancellationSignal, b.e.g.a aVar) {
        ProviderInfo h = h(context.getPackageManager(), aVar, context.getResources());
        return h == null ? new e(1, null) : new e(0, e(context, aVar, h.authority, cancellationSignal));
    }

    private static List<List<byte[]>> d(b.e.g.a aVar, Resources resources) {
        return aVar.a() != null ? aVar.a() : b.e.d.d.c.c(resources, aVar.b());
    }

    static f[] e(Context context, b.e.g.a aVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            cursor = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null, cancellationSignal) : context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    arrayList2.add(new f(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i));
                }
                arrayList = arrayList2;
            }
            return (f[]) arrayList.toArray(new f[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    static g f(Context context, b.e.g.a aVar, int i) {
        try {
            e c2 = c(context, null, aVar);
            if (c2.b() != 0) {
                return new g(null, c2.b() == 1 ? -2 : -3);
            }
            Typeface b2 = b.e.e.d.b(context, null, c2.a(), i);
            return new g(b2, b2 != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static Typeface g(Context context, b.e.g.a aVar, f.a aVar2, Handler handler, boolean z, int i, int i2) {
        String str = aVar.c() + "-" + i2;
        Typeface c2 = f1117a.c(str);
        if (c2 != null) {
            if (aVar2 != null) {
                aVar2.d(c2);
            }
            return c2;
        }
        if (z && i == -1) {
            g f2 = f(context, aVar, i2);
            if (aVar2 != null) {
                int i3 = f2.f1137b;
                if (i3 == 0) {
                    aVar2.b(f2.f1136a, handler);
                } else {
                    aVar2.a(i3, handler);
                }
            }
            return f2.f1136a;
        }
        a aVar3 = new a(context, aVar, i2, str);
        if (z) {
            try {
                return ((g) f1118b.e(aVar3, i)).f1136a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        C0031b c0031b = aVar2 == null ? null : new C0031b(aVar2, handler);
        synchronized (f1119c) {
            ArrayList<c.d<g>> arrayList = f1120d.get(str);
            if (arrayList != null) {
                if (c0031b != null) {
                    arrayList.add(c0031b);
                }
                return null;
            }
            if (c0031b != null) {
                ArrayList<c.d<g>> arrayList2 = new ArrayList<>();
                arrayList2.add(c0031b);
                f1120d.put(str, arrayList2);
            }
            f1118b.d(aVar3, new c(str));
            return null;
        }
    }

    public static ProviderInfo h(PackageManager packageManager, b.e.g.a aVar, Resources resources) {
        String d2 = aVar.d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d2);
        }
        if (!resolveContentProvider.packageName.equals(aVar.e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + d2 + ", but package was not " + aVar.e());
        }
        List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(a2, f1121e);
        List<List<byte[]>> d3 = d(aVar, resources);
        for (int i = 0; i < d3.size(); i++) {
            ArrayList arrayList = new ArrayList(d3.get(i));
            Collections.sort(arrayList, f1121e);
            if (b(a2, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    public static Map<Uri, ByteBuffer> i(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri c2 = fVar.c();
                if (!hashMap.containsKey(c2)) {
                    hashMap.put(c2, k.f(context, cancellationSignal, c2));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
