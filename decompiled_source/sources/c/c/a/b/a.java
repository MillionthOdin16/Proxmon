package c.c.a.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f1546a;

    /* renamed from: b, reason: collision with root package name */
    private Context f1547b;

    public a(Context context) {
        this.f1546a = context.getPackageName() + ".FlutterSecureStoragePluginKey";
        this.f1547b = context;
        b(context);
    }

    @SuppressLint({"NewApi"})
    private void a(Context context) {
        AlgorithmParameterSpec build;
        Locale locale = Locale.getDefault();
        try {
            h(Locale.ENGLISH);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 25);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            if (Build.VERSION.SDK_INT < 23) {
                build = f(context, calendar, calendar2);
            } else {
                build = new KeyGenParameterSpec.Builder(this.f1546a, 3).setCertificateSubject(new X500Principal("CN=" + this.f1546a)).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
            }
            keyPairGenerator.initialize(build);
            keyPairGenerator.generateKeyPair();
        } finally {
            h(locale);
        }
    }

    private void b(Context context) {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.getKey(this.f1546a, null) == null) {
            a(context);
        }
    }

    private PrivateKey c() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey(this.f1546a, null);
        if (key != null) {
            if (key instanceof PrivateKey) {
                return (PrivateKey) key;
            }
            throw new Exception("Not an instance of a PrivateKey");
        }
        throw new Exception("No key found under alias: " + this.f1546a);
    }

    private PublicKey d() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Certificate certificate = keyStore.getCertificate(this.f1546a);
        if (certificate == null) {
            throw new Exception("No certificate found under alias: " + this.f1546a);
        }
        PublicKey publicKey = certificate.getPublicKey();
        if (publicKey != null) {
            return publicKey;
        }
        throw new Exception("No key found under alias: " + this.f1546a);
    }

    private Cipher e() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding", Build.VERSION.SDK_INT < 23 ? "AndroidOpenSSL" : "AndroidKeyStoreBCWorkaround");
    }

    private AlgorithmParameterSpec f(Context context, Calendar calendar, Calendar calendar2) {
        return new KeyPairGeneratorSpec.Builder(context).setAlias(this.f1546a).setSubject(new X500Principal("CN=" + this.f1546a)).setSerialNumber(BigInteger.valueOf(1L)).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
    }

    private void g(Context context, Configuration configuration) {
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
    }

    private void h(Locale locale) {
        Locale.setDefault(locale);
        Configuration configuration = this.f1547b.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            i(configuration, locale);
            this.f1547b = this.f1547b.createConfigurationContext(configuration);
        } else {
            j(configuration, locale);
            g(this.f1547b, configuration);
        }
    }

    @TargetApi(24)
    private void i(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }

    private void j(Configuration configuration, Locale locale) {
        configuration.locale = locale;
    }

    public Key k(byte[] bArr, String str) {
        PrivateKey c2 = c();
        Cipher e2 = e();
        e2.init(4, c2);
        return e2.unwrap(bArr, str, 3);
    }

    public byte[] l(Key key) {
        PublicKey d2 = d();
        Cipher e2 = e();
        e2.init(3, d2);
        return e2.wrap(key);
    }
}
