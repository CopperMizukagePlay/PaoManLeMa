package p177x0;

import p001a0.AbstractC0094y0;
import p140s2.EnumC3103m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x0.h */
/* loaded from: classes.dex */
public final class C3800h implements InterfaceC3796d {

    /* renamed from: a */
    public final float f17982a;

    public C3800h(float f7) {
        this.f17982a = f7;
    }

    @Override // p177x0.InterfaceC3796d
    /* renamed from: a */
    public final int mo5824a(int i7, int i8, EnumC3103m enumC3103m) {
        float f7 = (i8 - i7) / 2.0f;
        EnumC3103m enumC3103m2 = EnumC3103m.f15703e;
        float f8 = this.f17982a;
        if (enumC3103m != enumC3103m2) {
            f8 *= -1;
        }
        return Math.round((1 + f8) * f7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3800h) && Float.compare(this.f17982a, ((C3800h) obj).f17982a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17982a);
    }

    public final String toString() {
        return AbstractC0094y0.m186m(new StringBuilder("Horizontal(bias="), this.f17982a, ')');
    }
}
