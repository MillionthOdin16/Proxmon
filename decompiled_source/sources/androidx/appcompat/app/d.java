package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.core.app.h;
import b.a.n.b;

/* loaded from: classes.dex */
public class d extends androidx.fragment.app.c implements e, h.a {
    private f mDelegate;
    private Resources mResources;

    public d() {
    }

    public d(int i) {
        super(i);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.e, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.r(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().i(i);
    }

    public f getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = f.g(this, this);
        }
        return this.mDelegate;
    }

    public b getDrawerToggleDelegate() {
        return getDelegate().k();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().m();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && b1.b()) {
            this.mResources = new b1(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public a getSupportActionBar() {
        return getDelegate().n();
    }

    @Override // androidx.core.app.h.a
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.f.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().p();
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().q(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        f delegate = getDelegate();
        delegate.o();
        delegate.r(bundle);
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(androidx.core.app.h hVar) {
        hVar.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().s();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.j() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onNightModeChanged(int i) {
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().t(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().u();
    }

    public void onPrepareSupportNavigateUpTaskStack(androidx.core.app.h hVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().v(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().w();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().x();
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(b.a.n.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(b.a.n.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        androidx.core.app.h d2 = androidx.core.app.h.d(this);
        onCreateSupportNavigateUpTaskStack(d2);
        onPrepareSupportNavigateUpTaskStack(d2);
        d2.e();
        try {
            androidx.core.app.a.h(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().G(charSequence);
    }

    @Override // androidx.appcompat.app.e
    public b.a.n.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.s()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        getDelegate().B(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        getDelegate().C(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().D(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().E(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().F(i);
    }

    public b.a.n.b startSupportActionMode(b.a aVar) {
        return getDelegate().H(aVar);
    }

    @Override // androidx.fragment.app.c
    public void supportInvalidateOptionsMenu() {
        getDelegate().p();
    }

    public void supportNavigateUpTo(Intent intent) {
        androidx.core.app.f.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().A(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return androidx.core.app.f.f(this, intent);
    }
}
