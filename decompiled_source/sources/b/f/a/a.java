package b.f.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import b.f.a.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b, reason: collision with root package name */
    protected boolean f1243b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f1244c;

    /* renamed from: d, reason: collision with root package name */
    protected Cursor f1245d;

    /* renamed from: e, reason: collision with root package name */
    protected Context f1246e;

    /* renamed from: f, reason: collision with root package name */
    protected int f1247f;
    protected C0038a g;
    protected DataSetObserver h;
    protected b.f.a.b i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b.f.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0038a extends ContentObserver {
        C0038a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            a.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f1243b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f1243b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    public abstract CharSequence a(Cursor cursor);

    public void b(Cursor cursor) {
        Cursor j = j(cursor);
        if (j != null) {
            j.close();
        }
    }

    @Override // b.f.a.b.a
    public Cursor c() {
        return this.f1245d;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i) {
        b bVar;
        if ((i & 1) == 1) {
            i |= 2;
            this.f1244c = true;
        } else {
            this.f1244c = false;
        }
        boolean z = cursor != null;
        this.f1245d = cursor;
        this.f1243b = z;
        this.f1246e = context;
        this.f1247f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.g = new C0038a();
            bVar = new b();
        } else {
            bVar = null;
            this.g = null;
        }
        this.h = bVar;
        if (z) {
            C0038a c0038a = this.g;
            if (c0038a != null) {
                cursor.registerContentObserver(c0038a);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f1243b || (cursor = this.f1245d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1243b) {
            return null;
        }
        this.f1245d.moveToPosition(i);
        if (view == null) {
            view = g(this.f1246e, this.f1245d, viewGroup);
        }
        e(view, this.f1246e, this.f1245d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.i == null) {
            this.i = new b.f.a.b(this);
        }
        return this.i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f1243b || (cursor = this.f1245d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f1245d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f1243b && (cursor = this.f1245d) != null && cursor.moveToPosition(i)) {
            return this.f1245d.getLong(this.f1247f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1243b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f1245d.moveToPosition(i)) {
            if (view == null) {
                view = h(this.f1246e, this.f1245d, viewGroup);
            }
            e(view, this.f1246e, this.f1245d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f1244c || (cursor = this.f1245d) == null || cursor.isClosed()) {
            return;
        }
        this.f1243b = this.f1245d.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f1245d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0038a c0038a = this.g;
            if (c0038a != null) {
                cursor2.unregisterContentObserver(c0038a);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1245d = cursor;
        if (cursor != null) {
            C0038a c0038a2 = this.g;
            if (c0038a2 != null) {
                cursor.registerContentObserver(c0038a2);
            }
            DataSetObserver dataSetObserver2 = this.h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f1247f = cursor.getColumnIndexOrThrow("_id");
            this.f1243b = true;
            notifyDataSetChanged();
        } else {
            this.f1247f = -1;
            this.f1243b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
