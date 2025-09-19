package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
final class n extends m<ParcelFileDescriptor> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(r rVar, c.b.a.a.a.f.p<ParcelFileDescriptor> pVar) {
        super(rVar, pVar);
    }

    @Override // com.google.android.play.core.assetpacks.m, c.b.a.a.a.a.p0
    public final void K(Bundle bundle, Bundle bundle2) {
        super.K(bundle, bundle2);
        this.f1690a.e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
