package c.b.a.a.a.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final e f1421a = new e("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        Signature[] signatureArr;
        try {
            signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (signatureArr == null || (signatureArr.length) == 0) {
            f1421a.g("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        for (Signature signature : signatureArr) {
            String b2 = c.b.a.a.a.d.a.b(signature.toByteArray());
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(b2)) {
                return true;
            }
            if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(b2)) {
                return true;
            }
        }
        return false;
    }
}
