package c.c.a.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private Key f1548a;

    /* renamed from: b, reason: collision with root package name */
    private final Cipher f1549b;

    /* renamed from: c, reason: collision with root package name */
    private final SecureRandom f1550c = new SecureRandom();

    public b(Context context) {
        a aVar = new a(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String string = sharedPreferences.getString("VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", null);
        this.f1549b = Cipher.getInstance("AES/CBC/PKCS7Padding");
        if (string != null) {
            try {
                this.f1548a = aVar.k(Base64.decode(string, 0), "AES");
                return;
            } catch (Exception e2) {
                Log.e("StorageCipher18Impl", "unwrap key failed", e2);
            }
        }
        byte[] bArr = new byte[16];
        this.f1550c.nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f1548a = secretKeySpec;
        edit.putString("VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", Base64.encodeToString(aVar.l(secretKeySpec), 0));
        edit.commit();
    }

    public static void c(SharedPreferences sharedPreferences, Context context) {
        String string = sharedPreferences.getString("VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", null);
        if (string == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove("VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK");
        edit.commit();
        SharedPreferences.Editor edit2 = context.getSharedPreferences("FlutterSecureKeyStorage", 0).edit();
        edit2.putString("VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK", string);
        edit2.commit();
    }

    @Override // c.c.a.b.c
    public byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        this.f1550c.nextBytes(bArr2);
        this.f1549b.init(1, this.f1548a, new IvParameterSpec(bArr2));
        byte[] doFinal = this.f1549b.doFinal(bArr);
        byte[] bArr3 = new byte[doFinal.length + 16];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        System.arraycopy(doFinal, 0, bArr3, 16, doFinal.length);
        return bArr3;
    }

    @Override // c.c.a.b.c
    public byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        int length = bArr.length - 16;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 16, bArr3, 0, length);
        this.f1549b.init(2, this.f1548a, ivParameterSpec);
        return this.f1549b.doFinal(bArr3);
    }
}
