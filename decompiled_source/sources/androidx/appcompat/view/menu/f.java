package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    g f260b;

    /* renamed from: c, reason: collision with root package name */
    private int f261c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f262d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f263e;

    /* renamed from: f, reason: collision with root package name */
    private final LayoutInflater f264f;
    private final int g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f263e = z;
        this.f264f = layoutInflater;
        this.f260b = gVar;
        this.g = i;
        a();
    }

    void a() {
        i v = this.f260b.v();
        if (v != null) {
            ArrayList<i> z = this.f260b.z();
            int size = z.size();
            for (int i = 0; i < size; i++) {
                if (z.get(i) == v) {
                    this.f261c = i;
                    return;
                }
            }
        }
        this.f261c = -1;
    }

    public g b() {
        return this.f260b;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public i getItem(int i) {
        ArrayList<i> z = this.f263e ? this.f260b.z() : this.f260b.E();
        int i2 = this.f261c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return z.get(i);
    }

    public void d(boolean z) {
        this.f262d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> z = this.f263e ? this.f260b.z() : this.f260b.E();
        int i = this.f261c;
        int size = z.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f264f.inflate(this.g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f260b.F() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f262d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
