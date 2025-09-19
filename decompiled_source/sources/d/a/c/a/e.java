package d.a.c.a;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final e f1872a = new e();

    private e() {
    }

    @Override // d.a.c.a.j
    public ByteBuffer a(Object obj) {
        return d.f1871a.b(new JSONArray().put(f.a(obj)));
    }

    @Override // d.a.c.a.j
    public h b(ByteBuffer byteBuffer) {
        try {
            Object a2 = d.f1871a.a(byteBuffer);
            if (a2 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) a2;
                Object obj = jSONObject.get("method");
                Object g = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new h((String) obj, g);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + a2);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // d.a.c.a.j
    public Object c(ByteBuffer byteBuffer) {
        try {
            Object a2 = d.f1871a.a(byteBuffer);
            if (a2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) a2;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g = g(jSONArray.opt(1));
                    Object g2 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g == null || (g instanceof String))) {
                        throw new c((String) obj, (String) g, g2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + a2);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // d.a.c.a.j
    public ByteBuffer d(String str, String str2, Object obj, String str3) {
        return d.f1871a.b(new JSONArray().put(str).put(f.a(str2)).put(f.a(obj)).put(f.a(str3)));
    }

    @Override // d.a.c.a.j
    public ByteBuffer e(h hVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", hVar.f1873a);
            jSONObject.put("args", f.a(hVar.f1874b));
            return d.f1871a.b(jSONObject);
        } catch (JSONException e2) {
            throw new IllegalArgumentException("Invalid JSON", e2);
        }
    }

    @Override // d.a.c.a.j
    public ByteBuffer f(String str, String str2, Object obj) {
        return d.f1871a.b(new JSONArray().put(str).put(f.a(str2)).put(f.a(obj)));
    }

    Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
