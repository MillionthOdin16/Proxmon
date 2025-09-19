package io.flutter.embedding.engine.j;

import android.os.Build;
import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import d.a.c.a.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final d.a.c.a.i f2531a;

    /* renamed from: b, reason: collision with root package name */
    private b f2532b;

    /* renamed from: c, reason: collision with root package name */
    public final i.c f2533c = new a();

    /* loaded from: classes.dex */
    class a implements i.c {
        a() {
        }

        @Override // d.a.c.a.i.c
        public void onMethodCall(d.a.c.a.h hVar, i.d dVar) {
            if (f.this.f2532b == null) {
                return;
            }
            String str = hVar.f1873a;
            char c2 = 65535;
            if (str.hashCode() == -259484608 && str.equals("Localization.getStringResource")) {
                c2 = 0;
            }
            if (c2 != 0) {
                dVar.notImplemented();
                return;
            }
            JSONObject jSONObject = (JSONObject) hVar.b();
            try {
                dVar.success(f.this.f2532b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e2) {
                dVar.error("error", e2.getMessage(), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        String a(String str, String str2);
    }

    public f(io.flutter.embedding.engine.f.a aVar) {
        d.a.c.a.i iVar = new d.a.c.a.i(aVar, "flutter/localization", d.a.c.a.e.f1872a);
        this.f2531a = iVar;
        iVar.e(this.f2533c);
    }

    public void b(List<Locale> list) {
        d.a.b.e("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            d.a.b.e("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(Build.VERSION.SDK_INT >= 21 ? locale.getScript() : BuildConfig.VERSION_NAME);
            arrayList.add(locale.getVariant());
        }
        this.f2531a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f2532b = bVar;
    }
}
