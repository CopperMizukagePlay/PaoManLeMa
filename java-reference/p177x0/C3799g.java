package p177x0;

import p140s2.EnumC3103m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x0.g */
/* loaded from: classes.dex */
public final class C3799g implements InterfaceC3797e {

    /* renamed from: a */
    public final float f17981a;

    public C3799g(float f7) {
        this.f17981a = f7;
    }

    @Override // p177x0.InterfaceC3797e
    /* renamed from: a */
    public final long mo5825a(long j6, long j7, EnumC3103m enumC3103m) {
        long j8 = ((((int) (j7 >> 32)) - ((int) (j6 >> 32))) << 32) | ((((int) (j7 & 4294967295L)) - ((int) (j6 & 4294967295L))) & 4294967295L);
        float f7 = 1;
        float f8 = (this.f17981a + f7) * (((int) (j8 >> 32)) / 2.0f);
        float f9 = (f7 - 1.0f) * (((int) (j8 & 4294967295L)) / 2.0f);
        return (Math.round(f9) & 4294967295L) | (Math.round(f8) << 32);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C3799g) || Float.compare(this.f17981a, ((C3799g) obj).f17981a) != 0 || Float.compare(-1.0f, -1.0f) != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f17981a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f17981a + ", verticalBias=-1.0)";
    }
}
