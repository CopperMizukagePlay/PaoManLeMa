package p079k1;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.v */
/* loaded from: classes.dex */
public final class C2285v extends AbstractC2286w {

    /* renamed from: b */
    public final float f13204b;

    public C2285v(float f7) {
        super(3);
        this.f13204b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2285v) && Float.compare(this.f13204b, ((C2285v) obj).f13204b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13204b);
    }

    public final String toString() {
        return AbstractC0094y0.m186m(new StringBuilder("VerticalTo(y="), this.f13204b, ')');
    }
}
