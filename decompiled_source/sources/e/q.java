package e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q {
    private static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    private final String f2271a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2272b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2273c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2274d;

    /* renamed from: e, reason: collision with root package name */
    private final String f2275e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2276f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    private q(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f2271a = str;
        this.f2272b = str2;
        this.f2273c = j2;
        this.f2274d = str3;
        this.f2275e = str4;
        this.f2276f = z;
        this.g = z2;
        this.i = z3;
        this.h = z4;
    }

    private static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static boolean b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !e.k0.e.K(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static e.q d(long r23, e.y r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.q.d(long, e.y, java.lang.String):e.q");
    }

    public static q e(y yVar, String str) {
        return d(System.currentTimeMillis(), yVar, str);
    }

    public static List<q> f(y yVar, x xVar) {
        List<String> j2 = xVar.j("Set-Cookie");
        int size = j2.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            q e2 = e(yVar, j2.get(i));
            if (e2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e2);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    private static String g(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String b2 = e.k0.e.b(str);
        if (b2 != null) {
            return b2;
        }
        throw new IllegalArgumentException();
    }

    private static long h(String str, int i, int i2) {
        int a2 = a(str, i, i2, false);
        Matcher matcher = m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a2 < i2) {
            int a3 = a(str, a2 + 1, i2, true);
            matcher.region(a2, a3);
            if (i4 == -1 && matcher.usePattern(m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (i6 == -1 && matcher.usePattern(k).matches()) {
                i6 = k.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i3 == -1 && matcher.usePattern(j).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
            }
            a2 = a(str, a3 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i6 == -1) {
            throw new IllegalArgumentException();
        }
        if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        }
        if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        }
        if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(e.k0.e.f1992e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    private static long i(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e2) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e2;
        }
    }

    public String c() {
        return this.f2271a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f2271a.equals(this.f2271a) && qVar.f2272b.equals(this.f2272b) && qVar.f2274d.equals(this.f2274d) && qVar.f2275e.equals(this.f2275e) && qVar.f2273c == this.f2273c && qVar.f2276f == this.f2276f && qVar.g == this.g && qVar.h == this.h && qVar.i == this.i;
    }

    public int hashCode() {
        int hashCode = (((((((527 + this.f2271a.hashCode()) * 31) + this.f2272b.hashCode()) * 31) + this.f2274d.hashCode()) * 31) + this.f2275e.hashCode()) * 31;
        long j2 = this.f2273c;
        return ((((((((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f2276f ? 1 : 0)) * 31) + (!this.g ? 1 : 0)) * 31) + (!this.h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }

    String j(boolean z) {
        String a2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2271a);
        sb.append('=');
        sb.append(this.f2272b);
        if (this.h) {
            if (this.f2273c == Long.MIN_VALUE) {
                a2 = "; max-age=0";
            } else {
                sb.append("; expires=");
                a2 = e.k0.i.d.a(new Date(this.f2273c));
            }
            sb.append(a2);
        }
        if (!this.i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f2274d);
        }
        sb.append("; path=");
        sb.append(this.f2275e);
        if (this.f2276f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public String k() {
        return this.f2272b;
    }

    public String toString() {
        return j(false);
    }
}
