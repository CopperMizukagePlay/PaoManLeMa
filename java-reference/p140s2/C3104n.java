package p140s2;

import p001a0.AbstractC0094y0;
import p147t2.InterfaceC3248a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.n */
/* loaded from: classes.dex */
public final class C3104n implements InterfaceC3248a {

    /* renamed from: a */
    public final float f15706a;

    public C3104n(float f7) {
        this.f15706a = f7;
    }

    @Override // p147t2.InterfaceC3248a
    /* renamed from: a */
    public final float mo4792a(float f7) {
        return f7 / this.f15706a;
    }

    @Override // p147t2.InterfaceC3248a
    /* renamed from: b */
    public final float mo4793b(float f7) {
        return f7 * this.f15706a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3104n) && Float.compare(this.f15706a, ((C3104n) obj).f15706a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15706a);
    }

    public final String toString() {
        return AbstractC0094y0.m186m(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f15706a, ')');
    }
}
