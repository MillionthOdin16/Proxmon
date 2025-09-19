package b.e.j.a0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    private final int f1172b;

    /* renamed from: c, reason: collision with root package name */
    private final b f1173c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1174d;

    public a(int i, b bVar, int i2) {
        this.f1172b = i;
        this.f1173c = bVar;
        this.f1174d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1172b);
        this.f1173c.F(this.f1174d, bundle);
    }
}
