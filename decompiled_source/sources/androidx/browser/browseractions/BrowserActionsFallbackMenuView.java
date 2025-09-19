package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import b.c.a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    private final int f603b;

    /* renamed from: c, reason: collision with root package name */
    private final int f604c;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f603b = getResources().getDimensionPixelOffset(a.browser_actions_context_menu_min_padding);
        this.f604c = getResources().getDimensionPixelOffset(a.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f603b * 2), this.f604c), 1073741824), i2);
    }
}
