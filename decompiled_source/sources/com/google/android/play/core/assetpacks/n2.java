package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class n2 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    static final FilenameFilter f1710a = new n2();

    private n2() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean matches;
        matches = o2.f1714a.matcher(str).matches();
        return matches;
    }
}
