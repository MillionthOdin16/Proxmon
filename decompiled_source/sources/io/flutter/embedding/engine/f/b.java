package io.flutter.embedding.engine.f;

import d.a.c.a.b;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b implements d.a.c.a.b, c {

    /* renamed from: b, reason: collision with root package name */
    private final FlutterJNI f2484b;

    /* renamed from: e, reason: collision with root package name */
    private int f2487e = 1;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, b.a> f2485c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, b.InterfaceC0058b> f2486d = new HashMap();

    /* loaded from: classes.dex */
    static class a implements b.InterfaceC0058b {

        /* renamed from: a, reason: collision with root package name */
        private final FlutterJNI f2488a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2489b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f2490c = new AtomicBoolean(false);

        a(FlutterJNI flutterJNI, int i) {
            this.f2488a = flutterJNI;
            this.f2489b = i;
        }

        @Override // d.a.c.a.b.InterfaceC0058b
        public void a(ByteBuffer byteBuffer) {
            if (this.f2490c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f2488a.invokePlatformMessageEmptyResponseCallback(this.f2489b);
            } else {
                this.f2488a.invokePlatformMessageResponseCallback(this.f2489b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(FlutterJNI flutterJNI) {
        this.f2484b = flutterJNI;
    }

    private static void e(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    @Override // d.a.c.a.b
    public void a(String str, ByteBuffer byteBuffer, b.InterfaceC0058b interfaceC0058b) {
        int i;
        d.a.b.e("DartMessenger", "Sending message with callback over channel '" + str + "'");
        if (interfaceC0058b != null) {
            i = this.f2487e;
            this.f2487e = i + 1;
            this.f2486d.put(Integer.valueOf(i), interfaceC0058b);
        } else {
            i = 0;
        }
        if (byteBuffer == null) {
            this.f2484b.dispatchEmptyPlatformMessage(str, i);
        } else {
            this.f2484b.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
        }
    }

    @Override // io.flutter.embedding.engine.f.c
    public void b(int i, ByteBuffer byteBuffer) {
        d.a.b.e("DartMessenger", "Received message reply from Dart.");
        b.InterfaceC0058b remove = this.f2486d.remove(Integer.valueOf(i));
        if (remove != null) {
            try {
                d.a.b.e("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e2) {
                e(e2);
            } catch (Exception e3) {
                d.a.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e3);
            }
        }
    }

    @Override // d.a.c.a.b
    public void c(String str, b.a aVar) {
        if (aVar == null) {
            d.a.b.e("DartMessenger", "Removing handler for channel '" + str + "'");
            this.f2485c.remove(str);
            return;
        }
        d.a.b.e("DartMessenger", "Setting handler for channel '" + str + "'");
        this.f2485c.put(str, aVar);
    }

    @Override // io.flutter.embedding.engine.f.c
    public void d(String str, ByteBuffer byteBuffer, int i) {
        d.a.b.e("DartMessenger", "Received message from Dart over channel '" + str + "'");
        b.a aVar = this.f2485c.get(str);
        if (aVar != null) {
            try {
                d.a.b.e("DartMessenger", "Deferring to registered handler to process message.");
                aVar.a(byteBuffer, new a(this.f2484b, i));
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
                return;
            } catch (Error e2) {
                e(e2);
                return;
            } catch (Exception e3) {
                d.a.b.c("DartMessenger", "Uncaught exception in binary message listener", e3);
            }
        } else {
            d.a.b.e("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f2484b.invokePlatformMessageEmptyResponseCallback(i);
    }
}
