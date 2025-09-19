package b.e.h;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import b.e.i.c;

/* loaded from: classes.dex */
public class a implements Spannable {

    /* renamed from: b, reason: collision with root package name */
    private final Spannable f1155b;

    /* renamed from: c, reason: collision with root package name */
    private final C0033a f1156c;

    /* renamed from: d, reason: collision with root package name */
    private final PrecomputedText f1157d;

    /* renamed from: b.e.h.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0033a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f1158a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f1159b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1160c;

        /* renamed from: d, reason: collision with root package name */
        private final int f1161d;

        /* renamed from: b.e.h.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0034a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f1162a;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f1163b;

            /* renamed from: c, reason: collision with root package name */
            private int f1164c;

            /* renamed from: d, reason: collision with root package name */
            private int f1165d;

            public C0034a(TextPaint textPaint) {
                this.f1162a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f1164c = 1;
                    this.f1165d = 1;
                } else {
                    this.f1165d = 0;
                    this.f1164c = 0;
                }
                this.f1163b = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public C0033a a() {
                return new C0033a(this.f1162a, this.f1163b, this.f1164c, this.f1165d);
            }

            public C0034a b(int i) {
                this.f1164c = i;
                return this;
            }

            public C0034a c(int i) {
                this.f1165d = i;
                return this;
            }

            public C0034a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f1163b = textDirectionHeuristic;
                return this;
            }
        }

        public C0033a(PrecomputedText.Params params) {
            this.f1158a = params.getTextPaint();
            this.f1159b = params.getTextDirection();
            this.f1160c = params.getBreakStrategy();
            this.f1161d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }

        @SuppressLint({"NewApi"})
        C0033a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f1158a = textPaint;
            this.f1159b = textDirectionHeuristic;
            this.f1160c = i;
            this.f1161d = i2;
        }

        public boolean a(C0033a c0033a) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.f1160c != c0033a.b() || this.f1161d != c0033a.c())) || this.f1158a.getTextSize() != c0033a.e().getTextSize() || this.f1158a.getTextScaleX() != c0033a.e().getTextScaleX() || this.f1158a.getTextSkewX() != c0033a.e().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f1158a.getLetterSpacing() != c0033a.e().getLetterSpacing() || !TextUtils.equals(this.f1158a.getFontFeatureSettings(), c0033a.e().getFontFeatureSettings()))) || this.f1158a.getFlags() != c0033a.e().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f1158a.getTextLocales().equals(c0033a.e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f1158a.getTextLocale().equals(c0033a.e().getTextLocale())) {
                return false;
            }
            return this.f1158a.getTypeface() == null ? c0033a.e().getTypeface() == null : this.f1158a.getTypeface().equals(c0033a.e().getTypeface());
        }

        public int b() {
            return this.f1160c;
        }

        public int c() {
            return this.f1161d;
        }

        public TextDirectionHeuristic d() {
            return this.f1159b;
        }

        public TextPaint e() {
            return this.f1158a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0033a)) {
                return false;
            }
            C0033a c0033a = (C0033a) obj;
            if (a(c0033a)) {
                return Build.VERSION.SDK_INT < 18 || this.f1159b == c0033a.d();
            }
            return false;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return c.b(Float.valueOf(this.f1158a.getTextSize()), Float.valueOf(this.f1158a.getTextScaleX()), Float.valueOf(this.f1158a.getTextSkewX()), Float.valueOf(this.f1158a.getLetterSpacing()), Integer.valueOf(this.f1158a.getFlags()), this.f1158a.getTextLocales(), this.f1158a.getTypeface(), Boolean.valueOf(this.f1158a.isElegantTextHeight()), this.f1159b, Integer.valueOf(this.f1160c), Integer.valueOf(this.f1161d));
            }
            if (i >= 21) {
                return c.b(Float.valueOf(this.f1158a.getTextSize()), Float.valueOf(this.f1158a.getTextScaleX()), Float.valueOf(this.f1158a.getTextSkewX()), Float.valueOf(this.f1158a.getLetterSpacing()), Integer.valueOf(this.f1158a.getFlags()), this.f1158a.getTextLocale(), this.f1158a.getTypeface(), Boolean.valueOf(this.f1158a.isElegantTextHeight()), this.f1159b, Integer.valueOf(this.f1160c), Integer.valueOf(this.f1161d));
            }
            if (i < 18 && i < 17) {
                return c.b(Float.valueOf(this.f1158a.getTextSize()), Float.valueOf(this.f1158a.getTextScaleX()), Float.valueOf(this.f1158a.getTextSkewX()), Integer.valueOf(this.f1158a.getFlags()), this.f1158a.getTypeface(), this.f1159b, Integer.valueOf(this.f1160c), Integer.valueOf(this.f1161d));
            }
            return c.b(Float.valueOf(this.f1158a.getTextSize()), Float.valueOf(this.f1158a.getTextScaleX()), Float.valueOf(this.f1158a.getTextSkewX()), Integer.valueOf(this.f1158a.getFlags()), this.f1158a.getTextLocale(), this.f1158a.getTypeface(), this.f1159b, Integer.valueOf(this.f1160c), Integer.valueOf(this.f1161d));
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: b.e.h.a.C0033a.toString():java.lang.String");
        }
    }

    public C0033a a() {
        return this.f1156c;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f1155b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f1155b.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f1155b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f1155b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f1155b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f1157d.getSpans(i, i2, cls) : (T[]) this.f1155b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f1155b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f1155b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1157d.removeSpan(obj);
        } else {
            this.f1155b.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1157d.setSpan(obj, i, i2, i3);
        } else {
            this.f1155b.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f1155b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f1155b.toString();
    }
}
