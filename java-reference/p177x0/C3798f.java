package p177x0;

import p001a0.AbstractC0094y0;
import p140s2.EnumC3103m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x0.f */
/* loaded from: classes.dex */
public final class C3798f implements InterfaceC3796d {

    /* renamed from: a */
    public final float f17980a;

    public C3798f(float f7) {
        this.f17980a = f7;
    }

    @Override // p177x0.InterfaceC3796d
    /* renamed from: a */
    public final int mo5824a(int i7, int i8, EnumC3103m enumC3103m) {
        return Math.round((1 + this.f17980a) * ((i8 - i7) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3798f) && Float.compare(this.f17980a, ((C3798f) obj).f17980a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17980a);
    }

    public final String toString() {
        return AbstractC0094y0.m186m(new StringBuilder("Horizontal(bias="), this.f17980a, ')');
    }
}
