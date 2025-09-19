package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import androidx.core.app.g;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends b.e.d.a {

    /* renamed from: c, reason: collision with root package name */
    private static c f611c;

    /* renamed from: androidx.core.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0013a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f612b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f613c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f614d;

        RunnableC0013a(String[] strArr, Activity activity, int i) {
            this.f612b = strArr;
            this.f613c = activity;
            this.f614d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f612b.length];
            PackageManager packageManager = this.f613c.getPackageManager();
            String packageName = this.f613c.getPackageName();
            int length = this.f612b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f612b[i], packageName);
            }
            ((b) this.f613c).onRequestPermissionsResult(this.f614d, this.f612b, iArr);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(Activity activity, String[] strArr, int i);

        boolean b(Activity activity, int i, int i2, Intent intent);
    }

    /* loaded from: classes.dex */
    public interface d {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* loaded from: classes.dex */
    private static class e extends SharedElementCallback {

        /* renamed from: a, reason: collision with root package name */
        private final g f615a;

        /* renamed from: androidx.core.app.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0014a implements g.a {
            C0014a(e eVar, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            }
        }

        e(g gVar) {
            this.f615a = gVar;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f615a.a(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f615a.b(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f615a.c(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f615a.d(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f615a.e(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f615a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f615a.g(list, list2, new C0014a(this, onSharedElementsReadyListener));
        }
    }

    public static void h(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void i(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static c j() {
        return f611c;
    }

    public static void k(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    public static void l(Activity activity) {
        if (Build.VERSION.SDK_INT < 28 && androidx.core.app.b.i(activity)) {
            return;
        }
        activity.recreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(Activity activity, String[] strArr, int i) {
        c cVar = f611c;
        if (cVar == null || !cVar.a(activity, strArr, i)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof d) {
                    ((d) activity).validateRequestPermissionsRequestCode(i);
                }
                activity.requestPermissions(strArr, i);
            } else if (activity instanceof b) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0013a(strArr, activity, i));
            }
        }
    }

    public static void n(Activity activity, g gVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(gVar != null ? new e(gVar) : null);
        }
    }

    public static void o(Activity activity, g gVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(gVar != null ? new e(gVar) : null);
        }
    }

    public static void p(Activity activity, Intent intent, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void q(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    public static void r(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }
}
