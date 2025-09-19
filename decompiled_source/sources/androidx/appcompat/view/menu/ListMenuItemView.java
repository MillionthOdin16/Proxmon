package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.w0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b, reason: collision with root package name */
    private i f220b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f221c;

    /* renamed from: d, reason: collision with root package name */
    private RadioButton f222d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f223e;

    /* renamed from: f, reason: collision with root package name */
    private CheckBox f224f;
    private TextView g;
    private ImageView h;
    private ImageView i;
    private LinearLayout j;
    private Drawable k;
    private int l;
    private Context m;
    private boolean n;
    private Drawable o;
    private boolean p;
    private LayoutInflater q;
    private boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        w0 u = w0.u(getContext(), attributeSet, b.a.j.MenuView, i, 0);
        this.k = u.f(b.a.j.MenuView_android_itemBackground);
        this.l = u.m(b.a.j.MenuView_android_itemTextAppearance, -1);
        this.n = u.a(b.a.j.MenuView_preserveIconSpacing, false);
        this.m = context;
        this.o = u.f(b.a.j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, b.a.a.dropDownListViewStyle, 0);
        this.p = obtainStyledAttributes.hasValue(0);
        u.v();
        obtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i) {
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(b.a.g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f224f = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(b.a.g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f221c = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(b.a.g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f222d = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
        rect.top += this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void d(i iVar, int i) {
        this.f220b = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f220b;
    }

    public void h(boolean z, char c2) {
        int i = (z && this.f220b.A()) ? 0 : 8;
        if (i == 0) {
            this.g.setText(this.f220b.h());
        }
        if (this.g.getVisibility() != i) {
            this.g.setVisibility(i);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        b.e.j.r.K(this, this.k);
        TextView textView = (TextView) findViewById(b.a.f.title);
        this.f223e = textView;
        int i = this.l;
        if (i != -1) {
            textView.setTextAppearance(this.m, i);
        }
        this.g = (TextView) findViewById(b.a.f.shortcut);
        ImageView imageView = (ImageView) findViewById(b.a.f.submenuarrow);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.i = (ImageView) findViewById(b.a.f.group_divider);
        this.j = (LinearLayout) findViewById(b.a.f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f221c != null && this.n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f221c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f222d == null && this.f224f == null) {
            return;
        }
        if (this.f220b.m()) {
            if (this.f222d == null) {
                g();
            }
            compoundButton = this.f222d;
            compoundButton2 = this.f224f;
        } else {
            if (this.f224f == null) {
                e();
            }
            compoundButton = this.f224f;
            compoundButton2 = this.f222d;
        }
        if (z) {
            compoundButton.setChecked(this.f220b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f224f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f222d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f220b.m()) {
            if (this.f222d == null) {
                g();
            }
            compoundButton = this.f222d;
        } else {
            if (this.f224f == null) {
                e();
            }
            compoundButton = this.f224f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f220b.z() || this.r;
        if (z || this.n) {
            if (this.f221c == null && drawable == null && !this.n) {
                return;
            }
            if (this.f221c == null) {
                f();
            }
            if (drawable == null && !this.n) {
                this.f221c.setVisibility(8);
                return;
            }
            ImageView imageView = this.f221c;
            if (!z) {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            if (this.f221c.getVisibility() != 0) {
                this.f221c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f223e.setText(charSequence);
            if (this.f223e.getVisibility() == 0) {
                return;
            }
            textView = this.f223e;
            i = 0;
        } else {
            i = 8;
            if (this.f223e.getVisibility() == 8) {
                return;
            } else {
                textView = this.f223e;
            }
        }
        textView.setVisibility(i);
    }
}
