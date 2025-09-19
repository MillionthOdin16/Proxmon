package d.a.c.b;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import com.pichillilorenzo.flutter_inappwebview.BuildConfig;
import io.flutter.embedding.engine.j.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final f f1891a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1892b;

    /* renamed from: c, reason: collision with root package name */
    final f.b f1893c;

    /* renamed from: d.a.c.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0060a implements f.b {
        C0060a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
        @Override // io.flutter.embedding.engine.j.f.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String a(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                d.a.c.b.a r0 = d.a.c.b.a.this
                android.content.Context r0 = d.a.c.b.a.a(r0)
                r1 = 17
                r2 = 0
                if (r9 == 0) goto L4a
                java.util.Locale r3 = d.a.c.b.a.b(r9)
                int r4 = android.os.Build.VERSION.SDK_INT
                if (r4 < r1) goto L34
                android.content.res.Configuration r0 = new android.content.res.Configuration
                d.a.c.b.a r4 = d.a.c.b.a.this
                android.content.Context r4 = d.a.c.b.a.a(r4)
                android.content.res.Resources r4 = r4.getResources()
                android.content.res.Configuration r4 = r4.getConfiguration()
                r0.<init>(r4)
                r0.setLocale(r3)
                d.a.c.b.a r3 = d.a.c.b.a.this
                android.content.Context r3 = d.a.c.b.a.a(r3)
                android.content.Context r0 = r3.createConfigurationContext(r0)
                goto L4a
            L34:
                d.a.c.b.a r4 = d.a.c.b.a.this
                android.content.Context r4 = d.a.c.b.a.a(r4)
                android.content.res.Resources r4 = r4.getResources()
                android.content.res.Configuration r5 = r4.getConfiguration()
                java.util.Locale r6 = r5.locale
                r5.locale = r3
                r4.updateConfiguration(r5, r2)
                goto L4b
            L4a:
                r6 = r2
            L4b:
                d.a.c.b.a r3 = d.a.c.b.a.this
                android.content.Context r3 = d.a.c.b.a.a(r3)
                java.lang.String r3 = r3.getPackageName()
                android.content.res.Resources r4 = r0.getResources()
                java.lang.String r5 = "string"
                int r8 = r4.getIdentifier(r8, r5, r3)
                if (r8 == 0) goto L6a
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r8 = r0.getString(r8)
                goto L6b
            L6a:
                r8 = r2
            L6b:
                if (r9 == 0) goto L84
                int r9 = android.os.Build.VERSION.SDK_INT
                if (r9 >= r1) goto L84
                d.a.c.b.a r9 = d.a.c.b.a.this
                android.content.Context r9 = d.a.c.b.a.a(r9)
                android.content.res.Resources r9 = r9.getResources()
                android.content.res.Configuration r0 = r9.getConfiguration()
                r0.locale = r6
                r9.updateConfiguration(r0, r2)
            L84:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.c.b.a.C0060a.a(java.lang.String, java.lang.String):java.lang.String");
        }
    }

    public a(Context context, f fVar) {
        C0060a c0060a = new C0060a();
        this.f1893c = c0060a;
        this.f1892b = context;
        this.f1891a = fVar;
        fVar.c(c0060a);
    }

    public static Locale b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        int length = split.length;
        String str4 = BuildConfig.VERSION_NAME;
        int i = 1;
        if (length <= 1 || split[1].length() != 4) {
            str2 = BuildConfig.VERSION_NAME;
        } else {
            str2 = split[1];
            i = 2;
        }
        if (split.length > i && split[i].length() >= 2 && split[i].length() <= 3) {
            str4 = split[i];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.f1892b.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i2 = 0; i2 < size; i2++) {
                Locale locale = locales.get(i2);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale lookup = Locale.lookup(arrayList, list);
            if (lookup != null) {
                return lookup;
            }
        } else if (i >= 24) {
            LocaleList locales2 = this.f1892b.getResources().getConfiguration().getLocales();
            for (int i3 = 0; i3 < locales2.size(); i3++) {
                Locale locale2 = locales2.get(i3);
                for (Locale locale3 : list) {
                    if (locale2.equals(locale3)) {
                        return locale3;
                    }
                }
                for (Locale locale4 : list) {
                    if (locale2.getLanguage().equals(locale4.toLanguageTag())) {
                        return locale4;
                    }
                }
                for (Locale locale5 : list) {
                    if (locale2.getLanguage().equals(locale5.getLanguage())) {
                        return locale5;
                    }
                }
            }
        } else {
            Locale locale6 = this.f1892b.getResources().getConfiguration().locale;
            if (locale6 != null) {
                for (Locale locale7 : list) {
                    if (locale6.equals(locale7)) {
                        return locale7;
                    }
                }
                for (Locale locale8 : list) {
                    if (locale6.getLanguage().equals(locale8.toString())) {
                        return locale8;
                    }
                }
            }
        }
        return list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(locales.get(i));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f1891a.b(arrayList);
    }
}
