package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Size2D {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private double height;
    private double width;

    public Size2D(double d2, double d3) {
        this.width = d2;
        this.height = d3;
    }

    public static Size2D fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new Size2D(((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Size2D.class != obj.getClass()) {
            return false;
        }
        Size2D size2D = (Size2D) obj;
        return Double.compare(size2D.width, this.width) == 0 && Double.compare(size2D.height, this.height) == 0;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.width);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.height);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public void setHeight(double d2) {
        this.height = d2;
    }

    public void setWidth(double d2) {
        this.width = d2;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("width", Double.valueOf(this.width));
        hashMap.put("height", Double.valueOf(this.height));
        return hashMap;
    }

    public String toString() {
        return "Size{width=" + this.width + ", height=" + this.height + '}';
    }
}
