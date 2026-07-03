package p079k1;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.m */
/* loaded from: classes.dex */
public final class C2276m extends AbstractC2286w {

    /* renamed from: b */
    public final float f13176b;

    /* renamed from: c */
    public final float f13177c;

    public C2276m(float f7, float f8) {
        super(3);
        this.f13176b = f7;
        this.f13177c = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2276m)) {
            return false;
        }
        C2276m c2276m = (C2276m) obj;
        if (Float.compare(this.f13176b, c2276m.f13176b) == 0 && Float.compare(this.f13177c, c2276m.f13177c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13177c) + (Float.hashCode(this.f13176b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f13176b);
        sb.append(", y=");
        return AbstractC0094y0.m186m(sb, this.f13177c, ')');
    }
}
