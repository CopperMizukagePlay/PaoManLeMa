package p079k1;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.j */
/* loaded from: classes.dex */
public final class C2273j extends AbstractC2286w {

    /* renamed from: b */
    public final float f13167b;

    /* renamed from: c */
    public final float f13168c;

    /* renamed from: d */
    public final float f13169d;

    /* renamed from: e */
    public final float f13170e;

    /* renamed from: f */
    public final float f13171f;

    /* renamed from: g */
    public final float f13172g;

    public C2273j(float f7, float f8, float f9, float f10, float f11, float f12) {
        super(2);
        this.f13167b = f7;
        this.f13168c = f8;
        this.f13169d = f9;
        this.f13170e = f10;
        this.f13171f = f11;
        this.f13172g = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2273j)) {
            return false;
        }
        C2273j c2273j = (C2273j) obj;
        if (Float.compare(this.f13167b, c2273j.f13167b) == 0 && Float.compare(this.f13168c, c2273j.f13168c) == 0 && Float.compare(this.f13169d, c2273j.f13169d) == 0 && Float.compare(this.f13170e, c2273j.f13170e) == 0 && Float.compare(this.f13171f, c2273j.f13171f) == 0 && Float.compare(this.f13172g, c2273j.f13172g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13172g) + AbstractC2487d.m4038b(this.f13171f, AbstractC2487d.m4038b(this.f13170e, AbstractC2487d.m4038b(this.f13169d, AbstractC2487d.m4038b(this.f13168c, Float.hashCode(this.f13167b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f13167b);
        sb.append(", y1=");
        sb.append(this.f13168c);
        sb.append(", x2=");
        sb.append(this.f13169d);
        sb.append(", y2=");
        sb.append(this.f13170e);
        sb.append(", x3=");
        sb.append(this.f13171f);
        sb.append(", y3=");
        return AbstractC0094y0.m186m(sb, this.f13172g, ')');
    }
}
