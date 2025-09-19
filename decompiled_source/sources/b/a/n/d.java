package b.a.n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    private int f920a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f921b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f922c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f923d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f924e;

    public d() {
        super(null);
    }

    public d(Context context, int i) {
        super(context);
        this.f920a = i;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f921b = theme;
    }

    private Resources b() {
        Resources resources;
        if (this.f924e == null) {
            Configuration configuration = this.f923d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f923d);
                this.f924e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f924e = resources;
        }
        return this.f924e;
    }

    private void d() {
        boolean z = this.f921b == null;
        if (z) {
            this.f921b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f921b.setTo(theme);
            }
        }
        e(this.f921b, this.f920a, z);
    }

    public void a(Configuration configuration) {
        if (this.f924e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f923d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f923d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f920a;
    }

    protected void e(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f922c == null) {
            this.f922c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f922c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f921b;
        if (theme != null) {
            return theme;
        }
        if (this.f920a == 0) {
            this.f920a = b.a.i.Theme_AppCompat_Light;
        }
        d();
        return this.f921b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f920a != i) {
            this.f920a = i;
            d();
        }
    }
}
