package com.pichillilorenzo.flutter_inappwebview;

import android.content.Context;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import d.a.c.a.i;
import d.a.c.a.m;
import e.b0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Util {
    public static final String ANDROID_ASSET_URL = "file:///android_asset/";
    static final String LOG_TAG = "Util";

    /* loaded from: classes.dex */
    public static class PrivateKeyAndCertificates {
        public X509Certificate[] certificates;
        public PrivateKey privateKey;

        public PrivateKeyAndCertificates(PrivateKey privateKey, X509Certificate[] x509CertificateArr) {
            this.privateKey = privateKey;
            this.certificates = x509CertificateArr;
        }
    }

    /* loaded from: classes.dex */
    public static class WaitFlutterResult {
        public String error;
        public Object result;

        public WaitFlutterResult(Object obj, String str) {
            this.result = obj;
            this.error = str;
        }
    }

    private Util() {
    }

    public static String JSONStringify(Object obj) {
        return obj == null ? "null" : obj instanceof Map ? new JSONObject((Map) obj).toString() : obj instanceof List ? new JSONArray((Collection) obj).toString() : obj instanceof String ? JSONObject.quote((String) obj) : JSONObject.wrap(obj).toString();
    }

    public static InputStream getFileAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) {
        m mVar = inAppWebViewFlutterPlugin.registrar;
        return inAppWebViewFlutterPlugin.applicationContext.getResources().getAssets().open(mVar != null ? mVar.g(str) : inAppWebViewFlutterPlugin.flutterAssets.a(str));
    }

    public static float getPixelDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static b0 getUnsafeOkHttpClient() {
        try {
            TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: com.pichillilorenzo.flutter_inappwebview.Util.2
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            b0.b bVar = new b0.b();
            bVar.e(socketFactory, (X509TrustManager) trustManagerArr[0]);
            bVar.c(new HostnameVerifier() { // from class: com.pichillilorenzo.flutter_inappwebview.Util.3
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str, SSLSession sSLSession) {
                    return true;
                }
            });
            bVar.b(15L, TimeUnit.SECONDS);
            bVar.f(15L, TimeUnit.SECONDS);
            bVar.d(15L, TimeUnit.SECONDS);
            return bVar.a();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String getUrlAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) {
        m mVar = inAppWebViewFlutterPlugin.registrar;
        String g = mVar != null ? mVar.g(str) : inAppWebViewFlutterPlugin.flutterAssets.a(str);
        IOException e2 = null;
        try {
            InputStream fileAsset = getFileAsset(inAppWebViewFlutterPlugin, str);
            if (fileAsset != null) {
                fileAsset.close();
            }
        } catch (IOException e3) {
            e2 = e3;
        }
        if (e2 != null) {
            throw e2;
        }
        return ANDROID_ASSET_URL + g;
    }

    public static X509Certificate getX509CertFromSslCertHack(SslCertificate sslCertificate) {
        byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        if (byteArray != null) {
            try {
            } catch (CertificateException unused) {
                return null;
            }
        }
        return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
    }

    public static WaitFlutterResult invokeMethodAndWait(final i iVar, final String str, final Object obj) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final HashMap hashMap = new HashMap();
        hashMap.put("result", null);
        hashMap.put("error", null);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview.Util.1
            @Override // java.lang.Runnable
            public void run() {
                i.this.d(str, obj, new i.d() { // from class: com.pichillilorenzo.flutter_inappwebview.Util.1.1
                    @Override // d.a.c.a.i.d
                    public void error(String str2, String str3, Object obj2) {
                        hashMap.put("error", "ERROR: " + str2 + " " + str3);
                        hashMap.put("result", obj2);
                        countDownLatch.countDown();
                    }

                    @Override // d.a.c.a.i.d
                    public void notImplemented() {
                        countDownLatch.countDown();
                    }

                    @Override // d.a.c.a.i.d
                    public void success(Object obj2) {
                        hashMap.put("result", obj2);
                        countDownLatch.countDown();
                    }
                });
            }
        });
        countDownLatch.await();
        return new WaitFlutterResult(hashMap.get("result"), (String) hashMap.get("error"));
    }

    public static PrivateKeyAndCertificates loadPrivateKeyAndCertificate(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, String str2, String str3) {
        try {
            InputStream fileAsset = getFileAsset(inAppWebViewFlutterPlugin, str);
            KeyStore keyStore = KeyStore.getInstance(str3);
            keyStore.load(fileAsset, str2 != null ? str2.toCharArray() : null);
            String nextElement = keyStore.aliases().nextElement();
            Key key = keyStore.getKey(nextElement, str2.toCharArray());
            r0 = key instanceof PrivateKey ? new PrivateKeyAndCertificates((PrivateKey) key, new X509Certificate[]{(X509Certificate) keyStore.getCertificate(nextElement)}) : null;
            fileAsset.close();
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.e(LOG_TAG, e2.getMessage());
        }
        return r0;
    }

    public static void log(String str, String str2) {
        int min;
        int length = str2.length();
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf(10, i);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i + 4000);
                Log.d(str, str2.substring(i, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i = min;
                }
            }
            i = min + 1;
        }
    }

    public static boolean objEquals(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String replaceAll(String str, String str2, String str3) {
        return TextUtils.join(str3, str.split(Pattern.quote(str2)));
    }
}
