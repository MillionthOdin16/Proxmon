package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import c.b.a.a.a.a.r;

/* loaded from: classes.dex */
public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: b, reason: collision with root package name */
    private ResultReceiver f1849b;

    public static void a(Context context) {
        r.a(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundle;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.f1849b) != null) {
            if (i2 == -1) {
                bundle = new Bundle();
                i3 = 1;
            } else if (i2 == 0) {
                bundle = new Bundle();
                i3 = 2;
            }
            resultReceiver.send(i3, bundle);
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f1849b = (ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.f1849b = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        try {
            startIntentSenderForResult(((PendingIntent) getIntent().getExtras().get("confirmation_intent")).getIntentSender(), 0, null, 0, 0, 0);
        } catch (IntentSender.SendIntentException unused) {
            ResultReceiver resultReceiver = this.f1849b;
            if (resultReceiver != null) {
                resultReceiver.send(3, new Bundle());
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f1849b);
    }
}
