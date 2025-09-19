package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
final class b {
    private static final Handler g = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    protected static final Class<?> f616a = a();

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f617b = b();

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f618c = f();

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f619d = d(f616a);

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f620e = c(f616a);

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f621f = e(f616a);

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f622b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f623c;

        a(d dVar, Object obj) {
            this.f622b = dVar;
            this.f623c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f622b.f628a = this.f623c;
        }
    }

    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0015b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f624b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f625c;

        RunnableC0015b(Application application, d dVar) {
            this.f624b = application;
            this.f625c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f624b.unregisterActivityLifecycleCallbacks(this.f625c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f626b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f627c;

        c(Object obj, Object obj2) {
            this.f626b = obj;
            this.f627c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b.f619d != null) {
                    b.f619d.invoke(this.f626b, this.f627c, Boolean.FALSE, "AppCompat recreation");
                } else {
                    b.f620e.invoke(this.f626b, this.f627c, Boolean.FALSE);
                }
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        Object f628a;

        /* renamed from: b, reason: collision with root package name */
        private Activity f629b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f630c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f631d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f632e = false;

        d(Activity activity) {
            this.f629b = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f629b == activity) {
                this.f629b = null;
                this.f631d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f631d || this.f632e || this.f630c || !b.h(this.f628a, activity)) {
                return;
            }
            this.f632e = true;
            this.f628a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f629b == activity) {
                this.f630c = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    protected static boolean h(Object obj, Activity activity) {
        try {
            Object obj2 = f618c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            g.postAtFrontOfQueue(new c(f617b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f621f == null) {
            return false;
        }
        if (f620e == null && f619d == null) {
            return false;
        }
        try {
            Object obj2 = f618c.get(activity);
            if (obj2 == null || (obj = f617b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            g.post(new a(dVar, obj2));
            try {
                if (g()) {
                    f621f.invoke(obj, obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                g.post(new RunnableC0015b(application, dVar));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
