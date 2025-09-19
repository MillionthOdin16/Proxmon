package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    private TextView f569a;

    /* renamed from: b, reason: collision with root package name */
    private TextClassifier f570b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(TextView textView) {
        b.e.i.d.b(textView);
        this.f569a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f570b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f569a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void b(TextClassifier textClassifier) {
        this.f570b = textClassifier;
    }
}
