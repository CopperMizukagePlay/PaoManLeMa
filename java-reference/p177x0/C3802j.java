package p177x0;

import p001a0.AbstractC0094y0;
import p140s2.EnumC3103m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x0.j */
/* loaded from: classes.dex */
public final class C3802j implements InterfaceC3797e {

    /* renamed from: a */
    public final float f17984a;

    /* renamed from: b */
    public final float f17985b;

    public C3802j(float f7, float f8) {
        this.f17984a = f7;
        this.f17985b = f8;
    }

    @Override // p177x0.InterfaceC3797e
    /* renamed from: a */
    public final long mo5825a(long j6, long j7, EnumC3103m enumC3103m) {
        float f7 = (((int) (j7 >> 32)) - ((int) (j6 >> 32))) / 2.0f;
        float f8 = (((int) (j7 & 4294967295L)) - ((int) (j6 & 4294967295L))) / 2.0f;
        EnumC3103m enumC3103m2 = EnumC3103m.f15703e;
        float f9 = this.f17984a;
        if (enumC3103m != enumC3103m2) {
            f9 *= -1;
        }
        float f10 = 1;
        float f11 = (f9 + f10) * f7;
        float f12 = (f10 + this.f17985b) * f8;
        return (Math.round(f12) & 4294967295L) | (Math.round(f11) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3802j)) {
            return false;
        }
        C3802j c3802j = (C3802j) obj;
        if (Float.compare(this.f17984a, c3802j.f17984a) == 0 && Float.compare(this.f17985b, c3802j.f17985b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17985b) + (Float.hashCode(this.f17984a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f17984a);
        sb.append(", verticalBias=");
        return AbstractC0094y0.m186m(sb, this.f17985b, ')');
    }
}
