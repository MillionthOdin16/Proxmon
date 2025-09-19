package io.flutter.embedding.engine.f;

import android.content.res.AssetManager;
import d.a.c.a.b;
import d.a.c.a.r;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class a implements d.a.c.a.b {

    /* renamed from: b, reason: collision with root package name */
    private final FlutterJNI f2474b;

    /* renamed from: c, reason: collision with root package name */
    private final AssetManager f2475c;

    /* renamed from: d, reason: collision with root package name */
    private final io.flutter.embedding.engine.f.b f2476d;

    /* renamed from: e, reason: collision with root package name */
    private final d.a.c.a.b f2477e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2478f;
    private String g;
    private d h;
    private final b.a i = new C0069a();

    /* renamed from: io.flutter.embedding.engine.f.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0069a implements b.a {
        C0069a() {
        }

        @Override // d.a.c.a.b.a
        public void a(ByteBuffer byteBuffer, b.InterfaceC0058b interfaceC0058b) {
            a.this.g = r.f1890b.a(byteBuffer);
            if (a.this.h != null) {
                a.this.h.a(a.this.g);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f2480a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2481b = null;

        /* renamed from: c, reason: collision with root package name */
        public final String f2482c;

        public b(String str, String str2) {
            this.f2480a = str;
            this.f2482c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f2480a.equals(bVar.f2480a)) {
                return this.f2482c.equals(bVar.f2482c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f2480a.hashCode() * 31) + this.f2482c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f2480a + ", function: " + this.f2482c + " )";
        }
    }

    /* loaded from: classes.dex */
    private static class c implements d.a.c.a.b {

        /* renamed from: b, reason: collision with root package name */
        private final io.flutter.embedding.engine.f.b f2483b;

        private c(io.flutter.embedding.engine.f.b bVar) {
            this.f2483b = bVar;
        }

        /* synthetic */ c(io.flutter.embedding.engine.f.b bVar, C0069a c0069a) {
            this(bVar);
        }

        @Override // d.a.c.a.b
        public void a(String str, ByteBuffer byteBuffer, b.InterfaceC0058b interfaceC0058b) {
            this.f2483b.a(str, byteBuffer, interfaceC0058b);
        }

        @Override // d.a.c.a.b
        public void c(String str, b.a aVar) {
            this.f2483b.c(str, aVar);
        }
    }

    /* loaded from: classes.dex */
    interface d {
        void a(String str);
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f2478f = false;
        this.f2474b = flutterJNI;
        this.f2475c = assetManager;
        io.flutter.embedding.engine.f.b bVar = new io.flutter.embedding.engine.f.b(flutterJNI);
        this.f2476d = bVar;
        bVar.c("flutter/isolate", this.i);
        this.f2477e = new c(this.f2476d, null);
        if (flutterJNI.isAttached()) {
            this.f2478f = true;
        }
    }

    @Override // d.a.c.a.b
    @Deprecated
    public void a(String str, ByteBuffer byteBuffer, b.InterfaceC0058b interfaceC0058b) {
        this.f2477e.a(str, byteBuffer, interfaceC0058b);
    }

    @Override // d.a.c.a.b
    @Deprecated
    public void c(String str, b.a aVar) {
        this.f2477e.c(str, aVar);
    }

    public void f(b bVar) {
        if (this.f2478f) {
            d.a.b.f("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        d.a.b.e("DartExecutor", "Executing Dart entrypoint: " + bVar);
        this.f2474b.runBundleAndSnapshotFromLibrary(bVar.f2480a, bVar.f2482c, bVar.f2481b, this.f2475c);
        this.f2478f = true;
    }

    public String g() {
        return this.g;
    }

    public boolean h() {
        return this.f2478f;
    }

    public void i() {
        if (this.f2474b.isAttached()) {
            this.f2474b.notifyLowMemoryWarning();
        }
    }

    public void j() {
        d.a.b.e("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f2474b.setPlatformMessageHandler(this.f2476d);
    }

    public void k() {
        d.a.b.e("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f2474b.setPlatformMessageHandler(null);
    }
}
