package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.Window;
import io.flutter.embedding.engine.j.i;
import java.io.FileNotFoundException;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f2734a;

    /* renamed from: b, reason: collision with root package name */
    private final io.flutter.embedding.engine.j.i f2735b;

    /* renamed from: c, reason: collision with root package name */
    private final d f2736c;

    /* renamed from: d, reason: collision with root package name */
    private i.j f2737d;

    /* renamed from: e, reason: collision with root package name */
    private int f2738e;

    /* renamed from: f, reason: collision with root package name */
    final i.h f2739f;

    /* loaded from: classes.dex */
    class a implements i.h {
        a() {
        }

        @Override // io.flutter.embedding.engine.j.i.h
        public void a() {
            e.this.r();
        }

        @Override // io.flutter.embedding.engine.j.i.h
        public void b() {
            e.this.v();
        }

        @Override // io.flutter.embedding.engine.j.i.h
        public void c() {
            e.this.s();
        }

        @Override // io.flutter.embedding.engine.j.i.h
        public void d(String str) {
            e.this.t(str);
        }

        @Override // io.flutter.embedding.engine.j.i.h
        public void e(i.EnumC0074i enumC0074i) {
            e.this.q(enumC0074i);
        }

        @Override // io.flutter.embedding.engine.j.i.h
        public void f(i.j jVar) {
            e.this.z(jVar);
        }

        @Override // io.flutter.embedding.engine.j.i.h
        public void g(int i) {
            e.this.y(i);
        }

        @Override // io.flutter.embedding.engine.j.i.h
        public void h(i.c cVar) {
            e.this.u(cVar);
        }

        @Override // io.flutter.embedding.engine.j.i.h
        public void i(i.g gVar) {
            e.this.B(gVar);
        }

        @Override // io.flutter.embedding.engine.j.i.h
        public void j(List<i.l> list) {
            e.this.x(list);
        }

        @Override // io.flutter.embedding.engine.j.i.h
        public boolean k() {
            return e.this.n();
        }

        @Override // io.flutter.embedding.engine.j.i.h
        public CharSequence l(i.e eVar) {
            return e.this.p(eVar);
        }

        @Override // io.flutter.embedding.engine.j.i.h
        public void m(i.k kVar) {
            e.this.w(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnSystemUiVisibilityChangeListener {
        b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            io.flutter.embedding.engine.j.i iVar;
            boolean z;
            if ((i & 4) == 0) {
                iVar = e.this.f2735b;
                z = false;
            } else {
                iVar = e.this.f2735b;
                z = true;
            }
            iVar.m(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2742a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2743b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f2744c;

        static {
            int[] iArr = new int[i.d.values().length];
            f2744c = iArr;
            try {
                iArr[i.d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2744c[i.d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[i.l.values().length];
            f2743b = iArr2;
            try {
                iArr2[i.l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2743b[i.l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[i.g.values().length];
            f2742a = iArr3;
            try {
                iArr3[i.g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2742a[i.g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2742a[i.g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2742a[i.g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2742a[i.g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a();
    }

    public e(Activity activity, io.flutter.embedding.engine.j.i iVar, d dVar) {
        a aVar = new a();
        this.f2739f = aVar;
        this.f2734a = activity;
        this.f2735b = iVar;
        iVar.l(aVar);
        this.f2736c = dVar;
        this.f2738e = 1280;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f2734a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence p(i.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f2734a.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null) {
                return null;
            }
            if (eVar != null && eVar != i.e.PLAIN_TEXT) {
                return null;
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getUri() != null) {
                this.f2734a.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", null);
            }
            return itemAt.coerceToText(this.f2734a);
        } catch (FileNotFoundException unused) {
            return null;
        } catch (SecurityException e2) {
            d.a.b.g("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(i.EnumC0074i enumC0074i) {
        if (enumC0074i == i.EnumC0074i.CLICK) {
            this.f2734a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void r() {
        d dVar = this.f2736c;
        if (dVar == null || !dVar.a()) {
            Activity activity = this.f2734a;
            if (activity instanceof androidx.activity.c) {
                ((androidx.activity.c) activity).getOnBackPressedDispatcher().c();
            } else {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(String str) {
        ((ClipboardManager) this.f2734a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(i.c cVar) {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            return;
        }
        if (i < 28 && i > 21) {
            this.f2734a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f2548b, (Bitmap) null, cVar.f2547a));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2734a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f2548b, 0, cVar.f2547a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.f2734a.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(i.k kVar) {
        int i = 1798;
        if (kVar != i.k.LEAN_BACK || Build.VERSION.SDK_INT < 16) {
            if (kVar == i.k.IMMERSIVE && Build.VERSION.SDK_INT >= 19) {
                i = 3846;
            } else if (kVar == i.k.IMMERSIVE_STICKY && Build.VERSION.SDK_INT >= 19) {
                i = 5894;
            } else if (kVar == i.k.EDGE_TO_EDGE && Build.VERSION.SDK_INT >= 16) {
                i = 1792;
            }
        }
        this.f2738e = i;
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(List<i.l> list) {
        int i = (list.size() != 0 || Build.VERSION.SDK_INT < 19) ? 1798 : 5894;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = c.f2743b[list.get(i2).ordinal()];
            if (i3 == 1) {
                i &= -5;
            } else if (i3 == 2) {
                i = i & (-513) & (-3);
            }
        }
        this.f2738e = i;
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(int i) {
        this.f2734a.setRequestedOrientation(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(i.j jVar) {
        Window window = this.f2734a.getWindow();
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (Build.VERSION.SDK_INT >= 23) {
            i.d dVar = jVar.f2571b;
            if (dVar != null) {
                int i = c.f2744c[dVar.ordinal()];
                if (i == 1) {
                    systemUiVisibility |= 8192;
                } else if (i == 2) {
                    systemUiVisibility &= -8193;
                }
            }
            Integer num = jVar.f2570a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        boolean z = jVar.f2572c;
        if (!z && Build.VERSION.SDK_INT >= 29) {
            window.setStatusBarContrastEnforced(z);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i.d dVar2 = jVar.f2574e;
            if (dVar2 != null) {
                int i2 = c.f2744c[dVar2.ordinal()];
                if (i2 == 1) {
                    systemUiVisibility |= 16;
                } else if (i2 == 2) {
                    systemUiVisibility &= -17;
                }
            }
            Integer num2 = jVar.f2573d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        if (jVar.f2575f != null && Build.VERSION.SDK_INT >= 28) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(134217728);
            window.setNavigationBarDividerColor(jVar.f2575f.intValue());
        }
        boolean z2 = jVar.g;
        if (!z2 && Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(z2);
        }
        decorView.setSystemUiVisibility(systemUiVisibility);
        this.f2737d = jVar;
    }

    public void A() {
        this.f2734a.getWindow().getDecorView().setSystemUiVisibility(this.f2738e);
        i.j jVar = this.f2737d;
        if (jVar != null) {
            z(jVar);
        }
    }

    void B(i.g gVar) {
        int i;
        View decorView = this.f2734a.getWindow().getDecorView();
        int i2 = c.f2742a[gVar.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                        if (i2 != 5 || Build.VERSION.SDK_INT < 21) {
                            return;
                        }
                    } else if (Build.VERSION.SDK_INT < 23) {
                        return;
                    } else {
                        i = 6;
                    }
                }
            }
            decorView.performHapticFeedback(i3);
            return;
        }
        i = 0;
        decorView.performHapticFeedback(i);
    }

    public void o() {
        this.f2735b.l(null);
    }
}
