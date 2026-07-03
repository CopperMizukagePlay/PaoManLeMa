package p071j0;

import p073j2.AbstractC2168e;
import p140s2.C3101k;
import p140s2.EnumC3103m;
import p177x0.C3798f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.u0 */
/* loaded from: classes.dex */
public final class C2155u0 implements InterfaceC2127g0 {

    /* renamed from: a */
    public final C3798f f12545a;

    public C2155u0(C3798f c3798f) {
        this.f12545a = c3798f;
    }

    @Override // p071j0.InterfaceC2127g0
    /* renamed from: a */
    public final int mo3475a(C3101k c3101k, long j6, int i7, EnumC3103m enumC3103m) {
        int i8 = (int) (j6 >> 32);
        if (i7 >= i8) {
            float f7 = (i8 - i7) / 2.0f;
            float f8 = 0.0f;
            if (enumC3103m != EnumC3103m.f15703e) {
                f8 = 0.0f * (-1);
            }
            return Math.round((1 + f8) * f7);
        }
        return AbstractC2168e.m3530q(this.f12545a.mo5824a(i7, i8, enumC3103m), 0, i8 - i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2155u0) && this.f12545a.equals(((C2155u0) obj).f12545a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.f12545a.f17980a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.f12545a + ", margin=0)";
    }
}
