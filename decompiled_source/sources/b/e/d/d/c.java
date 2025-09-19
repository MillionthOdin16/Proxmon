package b.e.d.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final C0028c[] f1071a;

        public b(C0028c[] c0028cArr) {
            this.f1071a = c0028cArr;
        }

        public C0028c[] a() {
            return this.f1071a;
        }
    }

    /* renamed from: b.e.d.d.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0028c {

        /* renamed from: a, reason: collision with root package name */
        private final String f1072a;

        /* renamed from: b, reason: collision with root package name */
        private int f1073b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1074c;

        /* renamed from: d, reason: collision with root package name */
        private String f1075d;

        /* renamed from: e, reason: collision with root package name */
        private int f1076e;

        /* renamed from: f, reason: collision with root package name */
        private int f1077f;

        public C0028c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f1072a = str;
            this.f1073b = i;
            this.f1074c = z;
            this.f1075d = str2;
            this.f1076e = i2;
            this.f1077f = i3;
        }

        public String a() {
            return this.f1072a;
        }

        public int b() {
            return this.f1077f;
        }

        public int c() {
            return this.f1076e;
        }

        public String d() {
            return this.f1075d;
        }

        public int e() {
            return this.f1073b;
        }

        public boolean f() {
            return this.f1074c;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        private final b.e.g.a f1078a;

        /* renamed from: b, reason: collision with root package name */
        private final int f1079b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1080c;

        public d(b.e.g.a aVar, int i, int i2) {
            this.f1078a = aVar;
            this.f1080c = i;
            this.f1079b = i2;
        }

        public int a() {
            return this.f1080c;
        }

        public b.e.g.a b() {
            return this.f1078a;
        }

        public int c() {
            return this.f1079b;
        }
    }

    private static int a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.e.c.FontFamily);
        String string = obtainAttributes.getString(b.e.c.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(b.e.c.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(b.e.c.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(b.e.c.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(b.e.c.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(b.e.c.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new d(new b.e.g.a(string, string2, string3, c(resources, resourceId)), integer, integer2);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((C0028c[]) arrayList.toArray(new C0028c[arrayList.size()]));
    }

    private static C0028c f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), b.e.c.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(b.e.c.FontFamilyFont_fontWeight) ? b.e.c.FontFamilyFont_fontWeight : b.e.c.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(b.e.c.FontFamilyFont_fontStyle) ? b.e.c.FontFamilyFont_fontStyle : b.e.c.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(b.e.c.FontFamilyFont_ttcIndex) ? b.e.c.FontFamilyFont_ttcIndex : b.e.c.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(b.e.c.FontFamilyFont_fontVariationSettings) ? b.e.c.FontFamilyFont_fontVariationSettings : b.e.c.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(b.e.c.FontFamilyFont_font) ? b.e.c.FontFamilyFont_font : b.e.c.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0028c(string2, i, z, string, i3, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
