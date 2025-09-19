package d.a.c.a;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f1873a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1874b;

    public h(String str, Object obj) {
        this.f1873a = str;
        this.f1874b = obj;
    }

    public <T> T a(String str) {
        Object obj = this.f1874b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return (T) ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public <T> T b() {
        return (T) this.f1874b;
    }
}
