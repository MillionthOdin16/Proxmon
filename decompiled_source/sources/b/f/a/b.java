package b.f.a;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    a f1250a;

    /* loaded from: classes.dex */
    interface a {
        CharSequence a(Cursor cursor);

        void b(Cursor cursor);

        Cursor c();

        Cursor d(CharSequence charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.f1250a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f1250a.a((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d2 = this.f1250a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d2 != null) {
            filterResults.count = d2.getCount();
        } else {
            filterResults.count = 0;
            d2 = null;
        }
        filterResults.values = d2;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c2 = this.f1250a.c();
        Object obj = filterResults.values;
        if (obj == null || obj == c2) {
            return;
        }
        this.f1250a.b((Cursor) obj);
    }
}
