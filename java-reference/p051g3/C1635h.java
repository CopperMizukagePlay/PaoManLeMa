package p051g3;

import android.graphics.Point;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.h */
/* loaded from: classes.dex */
public final class C1635h {

    /* renamed from: a */
    public final int f10387a;

    /* renamed from: b */
    public final int f10388b;

    /* renamed from: c */
    public final Point f10389c;

    public C1635h(int i7, int i8, Point point) {
        int i9 = point.x;
        int i10 = point.y;
        this.f10387a = i7;
        this.f10388b = i8;
        this.f10389c = new Point(i9, i10);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1635h) {
            C1635h c1635h = (C1635h) obj;
            if (this.f10387a == c1635h.f10387a && this.f10388b == c1635h.f10388b && this.f10389c.equals(c1635h.f10389c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10389c.hashCode() + (((this.f10387a * 31) + this.f10388b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i7 = this.f10387a;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        str = "Invalid";
                    } else {
                        str = "BottomLeft";
                    }
                } else {
                    str = "BottomRight";
                }
            } else {
                str = "TopRight";
            }
        } else {
            str = "TopLeft";
        }
        sb.append(str);
        sb.append(", radius=");
        sb.append(this.f10388b);
        sb.append(", center=");
        sb.append(this.f10389c);
        sb.append('}');
        return sb.toString();
    }
}
