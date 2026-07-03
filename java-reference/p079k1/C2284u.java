package p079k1;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.u */
/* loaded from: classes.dex */
public final class C2284u extends AbstractC2286w {

    /* renamed from: b */
    public final float f13203b;

    public C2284u(float f7) {
        super(3);
        this.f13203b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2284u) && Float.compare(this.f13203b, ((C2284u) obj).f13203b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13203b);
    }

    public final String toString() {
        return AbstractC0094y0.m186m(new StringBuilder("RelativeVerticalTo(dy="), this.f13203b, ')');
    }
}
