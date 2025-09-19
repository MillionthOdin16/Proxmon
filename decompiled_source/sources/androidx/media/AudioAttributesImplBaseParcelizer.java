package androidx.media;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static c read(androidx.versionedparcelable.a aVar) {
        c cVar = new c();
        cVar.f872a = aVar.p(cVar.f872a, 1);
        cVar.f873b = aVar.p(cVar.f873b, 2);
        cVar.f874c = aVar.p(cVar.f874c, 3);
        cVar.f875d = aVar.p(cVar.f875d, 4);
        return cVar;
    }

    public static void write(c cVar, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.F(cVar.f872a, 1);
        aVar.F(cVar.f873b, 2);
        aVar.F(cVar.f874c, 3);
        aVar.F(cVar.f875d, 4);
    }
}
