package io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.android.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class FlutterSplashView extends FrameLayout {
    private static String k = "FlutterSplashView";

    /* renamed from: b, reason: collision with root package name */
    private q f2356b;

    /* renamed from: c, reason: collision with root package name */
    private k f2357c;

    /* renamed from: d, reason: collision with root package name */
    private View f2358d;

    /* renamed from: e, reason: collision with root package name */
    private Bundle f2359e;

    /* renamed from: f, reason: collision with root package name */
    private String f2360f;
    private String g;
    private final k.d h;
    private final io.flutter.embedding.engine.renderer.b i;
    private final Runnable j;

    @Keep
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new a();
        private String previousCompletedSplashIsolate;
        private Bundle splashScreenState;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(SavedState.class.getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }
    }

    /* loaded from: classes.dex */
    class a implements k.d {
        a() {
        }

        @Override // io.flutter.embedding.android.k.d
        public void a(io.flutter.embedding.engine.b bVar) {
            FlutterSplashView.this.f2357c.t(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.g(flutterSplashView.f2357c, FlutterSplashView.this.f2356b);
        }

        @Override // io.flutter.embedding.android.k.d
        public void b() {
        }
    }

    /* loaded from: classes.dex */
    class b implements io.flutter.embedding.engine.renderer.b {
        b() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void b() {
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void e() {
            if (FlutterSplashView.this.f2356b != null) {
                FlutterSplashView.this.k();
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f2358d);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            flutterSplashView2.g = flutterSplashView2.f2360f;
        }
    }

    public FlutterSplashView(Context context) {
        this(context, null, 0);
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new a();
        this.i = new b();
        this.j = new c();
        setSaveEnabled(true);
    }

    private boolean h() {
        k kVar = this.f2357c;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
        }
        if (kVar.s()) {
            return this.f2357c.getAttachedFlutterEngine().h().g() != null && this.f2357c.getAttachedFlutterEngine().h().g().equals(this.g);
        }
        throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
    }

    private boolean i() {
        k kVar = this.f2357c;
        return (kVar == null || !kVar.s() || this.f2357c.q() || h()) ? false : true;
    }

    private boolean j() {
        q qVar;
        k kVar = this.f2357c;
        return kVar != null && kVar.s() && (qVar = this.f2356b) != null && qVar.b() && l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f2360f = this.f2357c.getAttachedFlutterEngine().h().g();
        d.a.b.e(k, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f2360f);
        this.f2356b.a(this.j);
    }

    private boolean l() {
        k kVar = this.f2357c;
        if (kVar == null) {
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
        }
        if (kVar.s()) {
            return this.f2357c.q() && !h();
        }
        throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
    }

    public void g(k kVar, q qVar) {
        k kVar2 = this.f2357c;
        if (kVar2 != null) {
            kVar2.u(this.i);
            removeView(this.f2357c);
        }
        View view = this.f2358d;
        if (view != null) {
            removeView(view);
        }
        this.f2357c = kVar;
        addView(kVar);
        this.f2356b = qVar;
        if (qVar != null) {
            if (i()) {
                d.a.b.e(k, "Showing splash screen UI.");
                View c2 = qVar.c(getContext(), this.f2359e);
                this.f2358d = c2;
                addView(c2);
                kVar.i(this.i);
                return;
            }
            if (!j()) {
                if (kVar.s()) {
                    return;
                }
                d.a.b.e(k, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
                kVar.h(this.h);
                return;
            }
            d.a.b.e(k, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
            View c3 = qVar.c(getContext(), this.f2359e);
            this.f2358d = c3;
            addView(c3);
            k();
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.g = savedState.previousCompletedSplashIsolate;
        this.f2359e = savedState.splashScreenState;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.previousCompletedSplashIsolate = this.g;
        q qVar = this.f2356b;
        savedState.splashScreenState = qVar != null ? qVar.d() : null;
        return savedState;
    }
}
