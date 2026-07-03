package p100n;

import p073j2.AbstractC2168e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.d0 */
/* loaded from: classes.dex */
public final class C2636d0 implements InterfaceC2630b0 {

    /* renamed from: a */
    public final int f14267a;

    /* renamed from: b */
    public final int f14268b;

    /* renamed from: c */
    public final InterfaceC2697y f14269c;

    /* renamed from: d */
    public final long f14270d;

    /* renamed from: e */
    public final long f14271e;

    public C2636d0(int i7, int i8, InterfaceC2697y interfaceC2697y) {
        this.f14267a = i7;
        this.f14268b = i8;
        this.f14269c = interfaceC2697y;
        this.f14270d = i7 * 1000000;
        this.f14271e = i8 * 1000000;
    }

    @Override // p100n.InterfaceC2630b0
    /* renamed from: b */
    public final float mo4197b(long j6, float f7, float f8, float f9) {
        float f10;
        long m3531r = AbstractC2168e.m3531r(j6 - this.f14271e, 0L, this.f14270d);
        float f11 = 1.0f;
        if (this.f14267a == 0) {
            f10 = 1.0f;
        } else {
            f10 = ((float) m3531r) / ((float) this.f14270d);
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 <= 1.0f) {
            f11 = f10;
        }
        float mo1295a = this.f14269c.mo1295a(f11);
        C2664m1 c2664m1 = AbstractC2667n1.f14365a;
        return (f8 * mo1295a) + ((1 - mo1295a) * f7);
    }

    @Override // p100n.InterfaceC2630b0
    /* renamed from: c */
    public final float mo4198c(long j6, float f7, float f8, float f9) {
        long m3531r = AbstractC2168e.m3531r(j6 - this.f14271e, 0L, this.f14270d);
        if (m3531r < 0) {
            return 0.0f;
        }
        if (m3531r == 0) {
            return f9;
        }
        return (mo4197b(m3531r, f7, f8, f9) - mo4197b(m3531r - 1000000, f7, f8, f9)) * 1000.0f;
    }

    @Override // p100n.InterfaceC2630b0
    /* renamed from: d */
    public final long mo4199d(float f7, float f8, float f9) {
        return (this.f14268b + this.f14267a) * 1000000;
    }
}
