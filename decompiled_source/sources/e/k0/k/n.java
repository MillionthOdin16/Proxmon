package e.k0.k;

import java.io.IOException;

/* loaded from: classes.dex */
public final class n extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final b f2220b;

    public n(b bVar) {
        super("stream was reset: " + bVar);
        this.f2220b = bVar;
    }
}
