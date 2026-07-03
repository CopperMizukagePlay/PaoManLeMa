package p079k1;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.s */
/* loaded from: classes.dex */
public final class C2282s extends AbstractC2286w {

    /* renamed from: b */
    public final float f13197b;

    /* renamed from: c */
    public final float f13198c;

    public C2282s(float f7, float f8) {
        super(3);
        this.f13197b = f7;
        this.f13198c = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2282s)) {
            return false;
        }
        C2282s c2282s = (C2282s) obj;
        if (Float.compare(this.f13197b, c2282s.f13197b) == 0 && Float.compare(this.f13198c, c2282s.f13198c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13198c) + (Float.hashCode(this.f13197b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f13197b);
        sb.append(", dy=");
        return AbstractC0094y0.m186m(sb, this.f13198c, ')');
    }
}
