package p079k1;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.p */
/* loaded from: classes.dex */
public final class C2279p extends AbstractC2286w {

    /* renamed from: b */
    public final float f13188b;

    /* renamed from: c */
    public final float f13189c;

    /* renamed from: d */
    public final float f13190d;

    /* renamed from: e */
    public final float f13191e;

    /* renamed from: f */
    public final float f13192f;

    /* renamed from: g */
    public final float f13193g;

    public C2279p(float f7, float f8, float f9, float f10, float f11, float f12) {
        super(2);
        this.f13188b = f7;
        this.f13189c = f8;
        this.f13190d = f9;
        this.f13191e = f10;
        this.f13192f = f11;
        this.f13193g = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2279p)) {
            return false;
        }
        C2279p c2279p = (C2279p) obj;
        if (Float.compare(this.f13188b, c2279p.f13188b) == 0 && Float.compare(this.f13189c, c2279p.f13189c) == 0 && Float.compare(this.f13190d, c2279p.f13190d) == 0 && Float.compare(this.f13191e, c2279p.f13191e) == 0 && Float.compare(this.f13192f, c2279p.f13192f) == 0 && Float.compare(this.f13193g, c2279p.f13193g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13193g) + AbstractC2487d.m4038b(this.f13192f, AbstractC2487d.m4038b(this.f13191e, AbstractC2487d.m4038b(this.f13190d, AbstractC2487d.m4038b(this.f13189c, Float.hashCode(this.f13188b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f13188b);
        sb.append(", dy1=");
        sb.append(this.f13189c);
        sb.append(", dx2=");
        sb.append(this.f13190d);
        sb.append(", dy2=");
        sb.append(this.f13191e);
        sb.append(", dx3=");
        sb.append(this.f13192f);
        sb.append(", dy3=");
        return AbstractC0094y0.m186m(sb, this.f13193g, ')');
    }
}
