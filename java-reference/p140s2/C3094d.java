package p140s2;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.d */
/* loaded from: classes.dex */
public final class C3094d implements InterfaceC3093c {

    /* renamed from: e */
    public final float f15688e;

    /* renamed from: f */
    public final float f15689f;

    public C3094d(float f7, float f8) {
        this.f15688e = f7;
        this.f15689f = f8;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f15688e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3094d)) {
            return false;
        }
        C3094d c3094d = (C3094d) obj;
        if (Float.compare(this.f15688e, c3094d.f15688e) == 0 && Float.compare(this.f15689f, c3094d.f15689f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15689f) + (Float.hashCode(this.f15688e) * 31);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f15689f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f15688e);
        sb.append(", fontScale=");
        return AbstractC0094y0.m186m(sb, this.f15689f, ')');
    }
}
