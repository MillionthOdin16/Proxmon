package b.c.b;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f979a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f980b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f981c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f982d;

    /* renamed from: b.c.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0023a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f983a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f984b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f985c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f986d;

        public a a() {
            return new a(this.f983a, this.f984b, this.f985c, this.f986d);
        }

        public C0023a b(int i) {
            this.f983a = Integer.valueOf(i | (-16777216));
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f979a = num;
        this.f980b = num2;
        this.f981c = num3;
        this.f982d = num4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f979a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f980b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f981c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f982d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
