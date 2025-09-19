package io.flutter.embedding.engine.j;

import d.a.c.a.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final d.a.c.a.i f2540a;

    /* renamed from: b, reason: collision with root package name */
    private h f2541b;

    /* renamed from: c, reason: collision with root package name */
    final i.c f2542c = new a();

    /* loaded from: classes.dex */
    class a implements i.c {
        a() {
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00c0. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:24:0x011f A[Catch: JSONException -> 0x0216, TryCatch #9 {JSONException -> 0x0216, blocks: (B:7:0x002c, B:8:0x0030, B:12:0x00c3, B:14:0x00c8, B:16:0x00e1, B:17:0x00f0, B:19:0x00f5, B:27:0x00f9, B:22:0x0113, B:24:0x011f, B:29:0x00fe, B:30:0x012c, B:31:0x0158, B:32:0x0162, B:48:0x01e2, B:42:0x01fc, B:70:0x014f, B:39:0x0153, B:64:0x0185, B:58:0x01a3, B:38:0x01bf, B:76:0x01dc, B:52:0x01f6, B:46:0x0210, B:77:0x0035, B:80:0x0040, B:83:0x004b, B:86:0x0057, B:89:0x0062, B:92:0x006c, B:95:0x0077, B:98:0x0081, B:101:0x008b, B:104:0x0095, B:107:0x009f, B:110:0x00a9, B:113:0x00b4, B:34:0x01a8), top: B:6:0x002c, inners: #6, #8, #10, #11 }] */
        @Override // d.a.c.a.i.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onMethodCall(d.a.c.a.h r6, d.a.c.a.i.d r7) {
            /*
                Method dump skipped, instructions count: 644
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.j.i.a.onMethodCall(d.a.c.a.h, d.a.c.a.i$d):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2544a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2545b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f2546c;

        static {
            int[] iArr = new int[k.values().length];
            f2546c = iArr;
            try {
                iArr[k.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2546c[k.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2546c[k.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2546c[k.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[l.values().length];
            f2545b = iArr2;
            try {
                iArr2[l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2545b[l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[f.values().length];
            f2544a = iArr3;
            try {
                iArr3[f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2544a[f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2544a[f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2544a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f2547a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2548b;

        public c(int i, String str) {
            this.f2547a = i;
            this.f2548b = str;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        /* renamed from: b, reason: collision with root package name */
        private String f2552b;

        d(String str) {
            this.f2552b = str;
        }

        static d a(String str) {
            for (d dVar : values()) {
                if (dVar.f2552b.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        PLAIN_TEXT("text/plain");


        /* renamed from: b, reason: collision with root package name */
        private String f2555b;

        e(String str) {
            this.f2555b = str;
        }

        static e a(String str) {
            for (e eVar : values()) {
                if (eVar.f2555b.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        /* renamed from: b, reason: collision with root package name */
        private String f2560b;

        f(String str) {
            this.f2560b = str;
        }

        static f a(String str) {
            for (f fVar : values()) {
                if (fVar.f2560b.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        /* renamed from: b, reason: collision with root package name */
        private final String f2565b;

        g(String str) {
            this.f2565b = str;
        }

        static g a(String str) {
            String str2;
            for (g gVar : values()) {
                if ((gVar.f2565b == null && str == null) || ((str2 = gVar.f2565b) != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void a();

        void b();

        void c();

        void d(String str);

        void e(EnumC0074i enumC0074i);

        void f(j jVar);

        void g(int i);

        void h(c cVar);

        void i(g gVar);

        void j(List<l> list);

        boolean k();

        CharSequence l(e eVar);

        void m(k kVar);
    }

    /* renamed from: io.flutter.embedding.engine.j.i$i, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0074i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");


        /* renamed from: b, reason: collision with root package name */
        private final String f2569b;

        EnumC0074i(String str) {
            this.f2569b = str;
        }

        static EnumC0074i a(String str) {
            for (EnumC0074i enumC0074i : values()) {
                if (enumC0074i.f2569b.equals(str)) {
                    return enumC0074i;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f2570a;

        /* renamed from: b, reason: collision with root package name */
        public final d f2571b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f2572c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f2573d;

        /* renamed from: e, reason: collision with root package name */
        public final d f2574e;

        /* renamed from: f, reason: collision with root package name */
        public final Integer f2575f;
        public final boolean g;

        public j(Integer num, d dVar, boolean z, Integer num2, d dVar2, Integer num3, boolean z2) {
            this.f2570a = num;
            this.f2571b = dVar;
            this.f2572c = z;
            this.f2573d = num2;
            this.f2574e = dVar2;
            this.f2575f = num3;
            this.g = z2;
        }
    }

    /* loaded from: classes.dex */
    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        /* renamed from: b, reason: collision with root package name */
        private String f2580b;

        k(String str) {
            this.f2580b = str;
        }

        static k a(String str) {
            for (k kVar : values()) {
                if (kVar.f2580b.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    /* loaded from: classes.dex */
    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        /* renamed from: b, reason: collision with root package name */
        private String f2584b;

        l(String str) {
            this.f2584b = str;
        }

        static l a(String str) {
            for (l lVar : values()) {
                if (lVar.f2584b.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public i(io.flutter.embedding.engine.f.a aVar) {
        d.a.c.a.i iVar = new d.a.c.a.i(aVar, "flutter/platform", d.a.c.a.e.f1872a);
        this.f2540a = iVar;
        iVar.e(this.f2542c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c g(JSONObject jSONObject) {
        int i = jSONObject.getInt("primaryColor");
        if (i != 0) {
            i |= -16777216;
        }
        return new c(i, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x003e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L38
            java.lang.String r4 = r10.getString(r1)
            io.flutter.embedding.engine.j.i$f r4 = io.flutter.embedding.engine.j.i.f.a(r4)
            int[] r8 = io.flutter.embedding.engine.j.i.b.f2544a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L2a
            if (r4 == r5) goto L27
            goto L32
        L27:
            r2 = r2 | 8
            goto L32
        L2a:
            r2 = r2 | 2
            goto L32
        L2d:
            r2 = r2 | 4
            goto L32
        L30:
            r2 = r2 | 1
        L32:
            if (r3 != 0) goto L35
            r3 = r2
        L35:
            int r1 = r1 + 1
            goto L4
        L38:
            if (r2 == 0) goto L57
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L4c;
                case 5: goto L4a;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L49;
                case 9: goto L4d;
                case 10: goto L46;
                case 11: goto L45;
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L42;
                default: goto L41;
            }
        L41:
            goto L53
        L42:
            r10 = 13
            return r10
        L45:
            return r6
        L46:
            r10 = 11
            return r10
        L49:
            return r1
        L4a:
            r10 = 12
        L4c:
            return r10
        L4d:
            if (r3 == r6) goto L56
            if (r3 == r5) goto L55
            if (r3 == r1) goto L54
        L53:
            return r7
        L54:
            return r1
        L55:
            return r10
        L56:
            return r0
        L57:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.j.i.h(org.json.JSONArray):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j i(JSONObject jSONObject) {
        return new j(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? d.a(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? jSONObject.getBoolean("systemStatusBarContrastEnforced") : true, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.a(jSONObject.getString("systemNavigationBarIconBrightness")) : null, jSONObject.isNull("systemNavigationBarDividerColor") ? null : Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")), !jSONObject.isNull("systemNavigationBarContrastEnforced") ? jSONObject.getBoolean("systemNavigationBarContrastEnforced") : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k j(String str) {
        int i = b.f2546c[k.a(str).ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<l> k(JSONArray jSONArray) {
        l lVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            int i2 = b.f2545b[l.a(jSONArray.getString(i)).ordinal()];
            if (i2 == 1) {
                lVar = l.TOP_OVERLAYS;
            } else if (i2 == 2) {
                lVar = l.BOTTOM_OVERLAYS;
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.f2541b = hVar;
    }

    public void m(boolean z) {
        d.a.b.e("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f2540a.c("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z)));
    }
}
