package e.k0.k;

import java.util.List;

/* loaded from: classes.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f2217a = new a();

    /* loaded from: classes.dex */
    class a implements l {
        a() {
        }

        @Override // e.k0.k.l
        public boolean a(int i, List<c> list) {
            return true;
        }

        @Override // e.k0.k.l
        public boolean b(int i, List<c> list, boolean z) {
            return true;
        }

        @Override // e.k0.k.l
        public void c(int i, b bVar) {
        }

        @Override // e.k0.k.l
        public boolean d(int i, f.e eVar, int i2, boolean z) {
            eVar.l(i2);
            return true;
        }
    }

    boolean a(int i, List<c> list);

    boolean b(int i, List<c> list, boolean z);

    void c(int i, b bVar);

    boolean d(int i, f.e eVar, int i2, boolean z);
}
