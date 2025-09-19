package com.google.android.play.core.assetpacks;

/* loaded from: classes.dex */
public class a extends c.b.a.a.a.f.q {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i), com.google.android.play.core.assetpacks.a3.a.a(i)));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
