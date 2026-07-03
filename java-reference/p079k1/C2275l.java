package p079k1;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.l */
/* loaded from: classes.dex */
public final class C2275l extends AbstractC2286w {

    /* renamed from: b */
    public final float f13174b;

    /* renamed from: c */
    public final float f13175c;

    public C2275l(float f7, float f8) {
        super(3);
        this.f13174b = f7;
        this.f13175c = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2275l)) {
            return false;
        }
        C2275l c2275l = (C2275l) obj;
        if (Float.compare(this.f13174b, c2275l.f13174b) == 0 && Float.compare(this.f13175c, c2275l.f13175c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13175c) + (Float.hashCode(this.f13174b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f13174b);
        sb.append(", y=");
        return AbstractC0094y0.m186m(sb, this.f13175c, ')');
    }
}
