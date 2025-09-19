package b.e.d.d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Shader f1068a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f1069b;

    /* renamed from: c, reason: collision with root package name */
    private int f1070c;

    private b(Shader shader, ColorStateList colorStateList, int i) {
        this.f1068a = shader;
        this.f1069b = colorStateList;
        this.f1070c = i;
    }

    private static b a(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        char c2 = 65535;
        int hashCode = name.hashCode();
        if (hashCode != 89650992) {
            if (hashCode == 1191572447 && name.equals("selector")) {
                c2 = 0;
            }
        } else if (name.equals("gradient")) {
            c2 = 1;
        }
        if (c2 == 0) {
            return c(a.b(resources, xml, asAttributeSet, theme));
        }
        if (c2 == 1) {
            return d(d.b(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b b(int i) {
        return new b(null, null, i);
    }

    static b c(ColorStateList colorStateList) {
        return new b(null, colorStateList, colorStateList.getDefaultColor());
    }

    static b d(Shader shader) {
        return new b(shader, null, 0);
    }

    public static b g(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, i, theme);
        } catch (Exception e2) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
            return null;
        }
    }

    public int e() {
        return this.f1070c;
    }

    public Shader f() {
        return this.f1068a;
    }

    public boolean h() {
        return this.f1068a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f1068a == null && (colorStateList = this.f1069b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f1069b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f1070c) {
                this.f1070c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i) {
        this.f1070c = i;
    }

    public boolean l() {
        return h() || this.f1070c != 0;
    }
}
