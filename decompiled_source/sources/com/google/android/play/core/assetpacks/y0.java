package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Double> f1836a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized double a(String str, o1 o1Var) {
        double d2;
        double d3 = ((r0) o1Var).g;
        Double.isNaN(d3);
        double d4 = d3 + 1.0d;
        double d5 = ((r0) o1Var).h;
        Double.isNaN(d5);
        d2 = d4 / d5;
        this.f1836a.put(str, Double.valueOf(d2));
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(String str) {
        this.f1836a.put(str, Double.valueOf(0.0d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized double c(String str) {
        Double d2 = this.f1836a.get(str);
        if (d2 == null) {
            return 0.0d;
        }
        return d2.doubleValue();
    }
}
