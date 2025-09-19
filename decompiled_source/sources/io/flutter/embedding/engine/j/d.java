package io.flutter.embedding.engine.j;

import android.os.Build;
import android.view.InputDevice;
import android.view.KeyEvent;
import d.a.c.a.a;
import io.flutter.embedding.engine.j.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final d.a.c.a.a<Object> f2527a;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final KeyEvent f2528a;

        /* renamed from: b, reason: collision with root package name */
        public final Character f2529b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f2528a = keyEvent;
            this.f2529b = ch;
        }
    }

    public d(d.a.c.a.b bVar) {
        this.f2527a = new d.a.c.a.a<>(bVar, "flutter/keyevent", d.a.c.a.d.f1871a);
    }

    private static a.e<Object> a(final a aVar) {
        return new a.e() { // from class: io.flutter.embedding.engine.j.a
            @Override // d.a.c.a.a.e
            public final void a(Object obj) {
                d.c(d.a.this, obj);
            }
        };
    }

    private Map<String, Object> b(b bVar, boolean z) {
        int i;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f2528a.getFlags()));
        int i2 = 0;
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f2528a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f2528a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f2528a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f2528a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f2528a.getMetaState()));
        Character ch = bVar.f2529b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f2528a.getSource()));
        InputDevice device = InputDevice.getDevice(bVar.f2528a.getDeviceId());
        if (device == null || Build.VERSION.SDK_INT < 19) {
            i = 0;
        } else {
            i2 = device.getVendorId();
            i = device.getProductId();
        }
        hashMap.put("vendorId", Integer.valueOf(i2));
        hashMap.put("productId", Integer.valueOf(i));
        hashMap.put("deviceId", Integer.valueOf(bVar.f2528a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f2528a.getRepeatCount()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(a aVar, Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                z = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e2) {
                d.a.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e2);
            }
        }
        aVar.a(z);
    }

    public void d(b bVar, boolean z, a aVar) {
        this.f2527a.d(b(bVar, z), a(aVar));
    }
}
