package com.pichillilorenzo.flutter_inappwebview.credential_database;

import android.webkit.WebViewDatabase;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace;
import d.a.c.a.h;
import d.a.c.a.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class CredentialDatabaseHandler implements i.c {
    static final String LOG_TAG = "CredentialDatabaseHandler";
    public static CredentialDatabase credentialDatabase;
    public i channel;
    public InAppWebViewFlutterPlugin plugin;

    public CredentialDatabaseHandler(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        i iVar = new i(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_credential_database");
        this.channel = iVar;
        iVar.e(this);
        credentialDatabase = CredentialDatabase.getInstance(inAppWebViewFlutterPlugin.applicationContext);
    }

    public void dispose() {
        this.channel.e(null);
        this.plugin = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Boolean] */
    @Override // d.a.c.a.i.c
    public void onMethodCall(h hVar, i.d dVar) {
        char c2;
        Object arrayList;
        String str = hVar.f1873a;
        switch (str.hashCode()) {
            case -1851697792:
                if (str.equals("clearAllAuthCredentials")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -410271914:
                if (str.equals("getHttpAuthCredentials")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 589173355:
                if (str.equals("removeHttpAuthCredential")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 998955721:
                if (str.equals("setHttpAuthCredential")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1084504936:
                if (str.equals("removeHttpAuthCredentials")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1930845769:
                if (str.equals("getAllAuthCredentials")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            arrayList = new ArrayList();
            for (URLProtectionSpace uRLProtectionSpace : credentialDatabase.protectionSpaceDao.getAll()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<URLCredential> it = credentialDatabase.credentialDao.getAllByProtectionSpaceId(uRLProtectionSpace.getId()).iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().toMap());
                }
                HashMap hashMap = new HashMap();
                hashMap.put("protectionSpace", uRLProtectionSpace.toMap());
                hashMap.put("credentials", arrayList2);
                arrayList.add(hashMap);
            }
        } else {
            if (c2 == 1) {
                String str2 = (String) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
                String str3 = (String) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL);
                String str4 = (String) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM);
                Integer num = (Integer) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT);
                ArrayList arrayList3 = new ArrayList();
                Iterator<URLCredential> it2 = credentialDatabase.getHttpAuthCredentials(str2, str3, str4, num).iterator();
                while (it2.hasNext()) {
                    arrayList3.add(it2.next().toMap());
                }
                dVar.success(arrayList3);
                return;
            }
            if (c2 == 2) {
                credentialDatabase.setHttpAuthCredential((String) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) hVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) hVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
            } else if (c2 == 3) {
                credentialDatabase.removeHttpAuthCredential((String) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) hVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) hVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
            } else if (c2 == 4) {
                credentialDatabase.removeHttpAuthCredentials((String) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) hVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT));
            } else if (c2 != 5) {
                dVar.notImplemented();
                return;
            } else {
                credentialDatabase.clearAllAuthCredentials();
                WebViewDatabase.getInstance(this.plugin.applicationContext).clearHttpAuthUsernamePassword();
            }
            arrayList = Boolean.TRUE;
        }
        dVar.success(arrayList);
    }
}
