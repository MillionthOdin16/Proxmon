package e.k0.h;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private IOException f2044b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f2045c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(IOException iOException) {
        super(iOException);
        this.f2044b = iOException;
        this.f2045c = iOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(IOException iOException) {
        e.k0.e.a(this.f2044b, iOException);
        this.f2045c = iOException;
    }

    public IOException b() {
        return this.f2044b;
    }

    public IOException c() {
        return this.f2045c;
    }
}
