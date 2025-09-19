package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
class m<T> extends c.b.a.a.a.a.o0 {

    /* renamed from: a, reason: collision with root package name */
    final c.b.a.a.a.f.p<T> f1690a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r f1691b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(r rVar, c.b.a.a.a.f.p<T> pVar) {
        this.f1691b = rVar;
        this.f1690a = pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(r rVar, c.b.a.a.a.f.p pVar, byte[] bArr) {
        this(rVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(r rVar, c.b.a.a.a.f.p pVar, char[] cArr) {
        this(rVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(r rVar, c.b.a.a.a.f.p pVar, int[] iArr) {
        this(rVar, pVar);
    }

    @Override // c.b.a.a.a.a.p0
    public void F() {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1691b.f1743c;
        oVar.b();
        eVar = r.f1740f;
        eVar.f("onRemoveModule()", new Object[0]);
    }

    @Override // c.b.a.a.a.a.p0
    public void K(Bundle bundle, Bundle bundle2) {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1691b.f1743c;
        oVar.b();
        eVar = r.f1740f;
        eVar.f("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // c.b.a.a.a.a.p0
    public void O(int i, Bundle bundle) {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1691b.f1743c;
        oVar.b();
        eVar = r.f1740f;
        eVar.f("onStartDownload(%d)", Integer.valueOf(i));
    }

    @Override // c.b.a.a.a.a.p0
    public void Q(Bundle bundle) {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1691b.f1743c;
        oVar.b();
        eVar = r.f1740f;
        eVar.f("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // c.b.a.a.a.a.p0
    public void a() {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1691b.f1743c;
        oVar.b();
        eVar = r.f1740f;
        eVar.f("onCancelDownloads()", new Object[0]);
    }

    @Override // c.b.a.a.a.a.p0
    public void b(Bundle bundle) {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1691b.f1743c;
        oVar.b();
        int i = bundle.getInt("error_code");
        eVar = r.f1740f;
        eVar.e("onError(%d)", Integer.valueOf(i));
        this.f1690a.d(new a(i));
    }

    @Override // c.b.a.a.a.a.p0
    public void f(Bundle bundle, Bundle bundle2) {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1691b.f1744d;
        oVar.b();
        eVar = r.f1740f;
        eVar.f("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // c.b.a.a.a.a.p0
    public void g(List<Bundle> list) {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1691b.f1743c;
        oVar.b();
        eVar = r.f1740f;
        eVar.f("onGetSessionStates", new Object[0]);
    }

    @Override // c.b.a.a.a.a.p0
    public final void h(int i) {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1691b.f1743c;
        oVar.b();
        eVar = r.f1740f;
        eVar.f("onCancelDownload(%d)", Integer.valueOf(i));
    }

    @Override // c.b.a.a.a.a.p0
    public void i(Bundle bundle) {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1691b.f1743c;
        oVar.b();
        eVar = r.f1740f;
        eVar.f("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // c.b.a.a.a.a.p0
    public final void p(int i) {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1691b.f1743c;
        oVar.b();
        eVar = r.f1740f;
        eVar.f("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override // c.b.a.a.a.a.p0
    public void r(Bundle bundle, Bundle bundle2) {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1691b.f1743c;
        oVar.b();
        eVar = r.f1740f;
        eVar.f("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // c.b.a.a.a.a.p0
    public void s(Bundle bundle) {
        c.b.a.a.a.a.o oVar;
        c.b.a.a.a.a.e eVar;
        oVar = this.f1691b.f1743c;
        oVar.b();
        eVar = r.f1740f;
        eVar.f("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }
}
