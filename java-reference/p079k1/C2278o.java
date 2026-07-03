package p079k1;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.o */
/* loaded from: classes.dex */
public final class C2278o extends AbstractC2286w {

    /* renamed from: b */
    public final float f13182b;

    /* renamed from: c */
    public final float f13183c;

    /* renamed from: d */
    public final boolean f13184d;

    /* renamed from: e */
    public final boolean f13185e;

    /* renamed from: f */
    public final float f13186f;

    /* renamed from: g */
    public final float f13187g;

    public C2278o(float f7, float f8, boolean z7, boolean z8, float f9, float f10) {
        super(3);
        this.f13182b = f7;
        this.f13183c = f8;
        this.f13184d = z7;
        this.f13185e = z8;
        this.f13186f = f9;
        this.f13187g = f10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2278o) {
                C2278o c2278o = (C2278o) obj;
                if (Float.compare(this.f13182b, c2278o.f13182b) != 0 || Float.compare(this.f13183c, c2278o.f13183c) != 0 || Float.compare(0.0f, 0.0f) != 0 || this.f13184d != c2278o.f13184d || this.f13185e != c2278o.f13185e || Float.compare(this.f13186f, c2278o.f13186f) != 0 || Float.compare(this.f13187g, c2278o.f13187g) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13187g) + AbstractC2487d.m4038b(this.f13186f, AbstractC2487d.m4040d(AbstractC2487d.m4040d(AbstractC2487d.m4038b(0.0f, AbstractC2487d.m4038b(this.f13183c, Float.hashCode(this.f13182b) * 31, 31), 31), 31, this.f13184d), 31, this.f13185e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f13182b);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f13183c);
        sb.append(", theta=0.0, isMoreThanHalf=");
        sb.append(this.f13184d);
        sb.append(", isPositiveArc=");
        sb.append(this.f13185e);
        sb.append(", arcStartDx=");
        sb.append(this.f13186f);
        sb.append(", arcStartDy=");
        return AbstractC0094y0.m186m(sb, this.f13187g, ')');
    }
}
