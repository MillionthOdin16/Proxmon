package io.flutter.plugins.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Base64;
import d.a.c.a.h;
import d.a.c.a.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
class a implements i.c {

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f2785b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugins.c.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class AsyncTaskC0082a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SharedPreferences.Editor f2786a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i.d f2787b;

        AsyncTaskC0082a(a aVar, SharedPreferences.Editor editor, i.d dVar) {
            this.f2786a = editor;
            this.f2787b = dVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            return Boolean.valueOf(this.f2786a.commit());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            this.f2787b.success(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f2785b = context.getSharedPreferences("FlutterSharedPreferences", 0);
    }

    private void a(SharedPreferences.Editor editor, i.d dVar) {
        new AsyncTaskC0082a(this, editor, dVar).execute(new Void[0]);
    }

    private List<String> b(String str) {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (ClassNotFoundException e2) {
            e = e2;
        }
        try {
            List<String> list = (List) objectInputStream.readObject();
            objectInputStream.close();
            return list;
        } catch (ClassNotFoundException e3) {
            e = e3;
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            objectInputStream2 = objectInputStream;
            if (objectInputStream2 != null) {
                objectInputStream2.close();
            }
            throw th;
        }
    }

    private String c(List<String> list) {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            objectOutputStream.close();
            return encodeToString;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                objectOutputStream2.close();
            }
            throw th;
        }
    }

    private Map<String, Object> d() {
        Object obj;
        Map<String, ?> all = this.f2785b.getAll();
        HashMap hashMap = new HashMap();
        for (String str : all.keySet()) {
            if (str.startsWith("flutter.")) {
                Object obj2 = all.get(str);
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        obj2 = b(str2.substring(40));
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str2.substring(44), 36);
                        obj2 = obj;
                    } else if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str2.substring(40));
                    }
                    hashMap.put(str, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        obj = arrayList;
                        if (!this.f2785b.edit().remove(str).putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c(arrayList)).commit()) {
                            throw new IOException("Could not migrate set to list");
                        }
                        obj2 = obj;
                    }
                    hashMap.put(str, obj2);
                }
            }
        }
        return hashMap;
    }

    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        SharedPreferences.Editor putBoolean;
        String str = (String) hVar.a("key");
        try {
            String str2 = hVar.f1873a;
            char c2 = 65535;
            switch (str2.hashCode()) {
                case -1354815177:
                    if (str2.equals("commit")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1249367445:
                    if (str2.equals("getAll")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -1096934831:
                    if (str2.equals("setStringList")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -934610812:
                    if (str2.equals("remove")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -905809875:
                    if (str2.equals("setInt")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 94746189:
                    if (str2.equals("clear")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 155439827:
                    if (str2.equals("setDouble")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 589412115:
                    if (str2.equals("setString")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1984457324:
                    if (str2.equals("setBool")) {
                        c2 = 0;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    putBoolean = this.f2785b.edit().putBoolean(str, ((Boolean) hVar.a("value")).booleanValue());
                    break;
                case 1:
                    String d2 = Double.toString(((Number) hVar.a("value")).doubleValue());
                    putBoolean = this.f2785b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d2);
                    break;
                case 2:
                    Number number = (Number) hVar.a("value");
                    if (!(number instanceof BigInteger)) {
                        putBoolean = this.f2785b.edit().putLong(str, number.longValue());
                        break;
                    } else {
                        putBoolean = this.f2785b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy" + ((BigInteger) number).toString(36));
                        break;
                    }
                case 3:
                    String str3 = (String) hVar.a("value");
                    if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        putBoolean = this.f2785b.edit().putString(str, str3);
                        break;
                    }
                    dVar.error("StorageError", "This string cannot be stored as it clashes with special identifier prefixes.", null);
                    return;
                case 4:
                    List<String> list = (List) hVar.a("value");
                    putBoolean = this.f2785b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + c(list));
                    break;
                case 5:
                    dVar.success(Boolean.TRUE);
                    return;
                case 6:
                    dVar.success(d());
                    return;
                case 7:
                    putBoolean = this.f2785b.edit().remove(str);
                    break;
                case '\b':
                    Set<String> keySet = d().keySet();
                    SharedPreferences.Editor edit = this.f2785b.edit();
                    Iterator<String> it = keySet.iterator();
                    while (it.hasNext()) {
                        edit.remove(it.next());
                    }
                    a(edit, dVar);
                    return;
                default:
                    dVar.notImplemented();
                    return;
            }
            a(putBoolean, dVar);
        } catch (IOException e2) {
            dVar.error("IOException encountered", hVar.f1873a, e2);
        }
    }
}
