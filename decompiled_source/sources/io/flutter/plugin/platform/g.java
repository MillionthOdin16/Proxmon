package io.flutter.plugin.platform;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class g {
    private final d.a.c.a.g<Object> createArgsCodec;

    public g(d.a.c.a.g<Object> gVar) {
        this.createArgsCodec = gVar;
    }

    public abstract f create(Context context, int i, Object obj);

    public final d.a.c.a.g<Object> getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
