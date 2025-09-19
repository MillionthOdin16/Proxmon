package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import b.e.j.b;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class j extends androidx.appcompat.view.menu.c implements MenuItem {

    /* renamed from: d, reason: collision with root package name */
    private final b.e.f.a.b f282d;

    /* renamed from: e, reason: collision with root package name */
    private Method f283e;

    /* loaded from: classes.dex */
    private class a extends b.e.j.b {

        /* renamed from: b, reason: collision with root package name */
        final ActionProvider f284b;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f284b = actionProvider;
        }

        @Override // b.e.j.b
        public boolean a() {
            return this.f284b.hasSubMenu();
        }

        @Override // b.e.j.b
        public View c() {
            return this.f284b.onCreateActionView();
        }

        @Override // b.e.j.b
        public boolean e() {
            return this.f284b.onPerformDefaultAction();
        }

        @Override // b.e.j.b
        public void f(SubMenu subMenu) {
            this.f284b.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    /* loaded from: classes.dex */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d, reason: collision with root package name */
        private b.InterfaceC0037b f286d;

        b(j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // b.e.j.b
        public boolean b() {
            return this.f284b.isVisible();
        }

        @Override // b.e.j.b
        public View d(MenuItem menuItem) {
            return this.f284b.onCreateActionView(menuItem);
        }

        @Override // b.e.j.b
        public boolean g() {
            return this.f284b.overridesItemVisibility();
        }

        @Override // b.e.j.b
        public void j(b.InterfaceC0037b interfaceC0037b) {
            this.f286d = interfaceC0037b;
            this.f284b.setVisibilityListener(interfaceC0037b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            b.InterfaceC0037b interfaceC0037b = this.f286d;
            if (interfaceC0037b != null) {
                interfaceC0037b.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* loaded from: classes.dex */
    static class c extends FrameLayout implements b.a.n.c {

        /* renamed from: b, reason: collision with root package name */
        final CollapsibleActionView f287b;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f287b = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f287b;
        }

        @Override // b.a.n.c
        public void c() {
            this.f287b.onActionViewExpanded();
        }

        @Override // b.a.n.c
        public void d() {
            this.f287b.onActionViewCollapsed();
        }
    }

    /* loaded from: classes.dex */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f288a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f288a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f288a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f288a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    /* loaded from: classes.dex */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f290a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f290a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f290a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, b.e.f.a.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f282d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f282d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f282d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        b.e.j.b b2 = this.f282d.b();
        if (b2 instanceof a) {
            return ((a) b2).f284b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f282d.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f282d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f282d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f282d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f282d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f282d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f282d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f282d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f282d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f282d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f282d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f282d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f282d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f282d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f282d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f282d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f282d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f282d.getTooltipText();
    }

    public void h(boolean z) {
        try {
            if (this.f283e == null) {
                this.f283e = this.f282d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f283e.invoke(this.f282d, Boolean.valueOf(z));
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f282d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f282d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f282d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f282d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f282d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f282d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b.e.j.b bVar = Build.VERSION.SDK_INT >= 16 ? new b(this, this.f236a, actionProvider) : new a(this.f236a, actionProvider);
        b.e.f.a.b bVar2 = this.f282d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f282d.setActionView(i);
        View actionView = this.f282d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f282d.setActionView(new c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f282d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f282d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f282d.setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f282d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f282d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f282d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f282d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f282d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f282d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f282d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f282d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f282d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f282d.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        this.f282d.setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f282d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f282d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f282d.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f282d.setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f282d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f282d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f282d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f282d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f282d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f282d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f282d.setVisible(z);
    }
}
