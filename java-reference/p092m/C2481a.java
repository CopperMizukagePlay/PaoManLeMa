package p092m;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.a */
/* loaded from: classes.dex */
public final class C2481a {

    /* renamed from: a */
    public final float f13780a;

    /* renamed from: b */
    public final float f13781b;

    public C2481a(float f7, float f8) {
        this.f13780a = f7;
        this.f13781b = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2481a)) {
            return false;
        }
        C2481a c2481a = (C2481a) obj;
        if (Float.compare(this.f13780a, c2481a.f13780a) == 0 && Float.compare(this.f13781b, c2481a.f13781b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13781b) + (Float.hashCode(this.f13780a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f13780a);
        sb.append(", velocityCoefficient=");
        return AbstractC0094y0.m186m(sb, this.f13781b, ')');
    }
}
