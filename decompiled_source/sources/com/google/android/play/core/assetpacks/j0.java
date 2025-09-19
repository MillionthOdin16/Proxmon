package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.a.a.a.a.d0<k3> f1655a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(c.b.a.a.a.a.d0<k3> d0Var) {
        this.f1655a = d0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InputStream a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) c.b.a.a.a.f.g.e(this.f1655a.a().i(i, str, str2, i2));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new u0(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), i);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e2) {
            throw new u0("Extractor was interrupted while waiting for chunk file.", e2, i);
        } catch (ExecutionException e3) {
            throw new u0(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), e3, i);
        }
    }
}
