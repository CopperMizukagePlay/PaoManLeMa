package p079k1;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.r */
/* loaded from: classes.dex */
public final class C2281r extends AbstractC2286w {

    /* renamed from: b */
    public final float f13195b;

    /* renamed from: c */
    public final float f13196c;

    public C2281r(float f7, float f8) {
        super(3);
        this.f13195b = f7;
        this.f13196c = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2281r)) {
            return false;
        }
        C2281r c2281r = (C2281r) obj;
        if (Float.compare(this.f13195b, c2281r.f13195b) == 0 && Float.compare(this.f13196c, c2281r.f13196c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13196c) + (Float.hashCode(this.f13195b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f13195b);
        sb.append(", dy=");
        return AbstractC0094y0.m186m(sb, this.f13196c, ')');
    }
}
