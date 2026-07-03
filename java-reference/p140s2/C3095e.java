package p140s2;

import p068i5.AbstractC2080d;
import p092m.AbstractC2487d;
import p147t2.InterfaceC3248a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.e */
/* loaded from: classes.dex */
public final class C3095e implements InterfaceC3093c {

    /* renamed from: e */
    public final float f15690e;

    /* renamed from: f */
    public final float f15691f;

    /* renamed from: g */
    public final InterfaceC3248a f15692g;

    public C3095e(float f7, float f8, InterfaceC3248a interfaceC3248a) {
        this.f15690e = f7;
        this.f15691f = f8;
        this.f15692g = interfaceC3248a;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: L */
    public final float mo4512L(long j6) {
        if (C3106p.m4798a(C3105o.m4795b(j6), 4294967296L)) {
            return this.f15692g.mo4793b(C3105o.m4796c(j6));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f15690e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3095e)) {
            return false;
        }
        C3095e c3095e = (C3095e) obj;
        if (Float.compare(this.f15690e, c3095e.f15690e) == 0 && Float.compare(this.f15691f, c3095e.f15691f) == 0 && AbstractC3367j.m5096a(this.f15692g, c3095e.f15692g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15692g.hashCode() + AbstractC2487d.m4038b(this.f15691f, Float.hashCode(this.f15690e) * 31, 31);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f15691f;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f15690e + ", fontScale=" + this.f15691f + ", converter=" + this.f15692g + ')';
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: v */
    public final long mo4523v(float f7) {
        return AbstractC2080d.m3413z(this.f15692g.mo4792a(f7), 4294967296L);
    }
}
