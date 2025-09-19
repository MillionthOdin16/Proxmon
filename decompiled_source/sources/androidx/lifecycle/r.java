package androidx.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, p> f867a = new HashMap<>();

    public final void a() {
        Iterator<p> it = this.f867a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f867a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final p b(String str) {
        return this.f867a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str, p pVar) {
        p put = this.f867a.put(str, pVar);
        if (put != null) {
            put.c();
        }
    }
}
