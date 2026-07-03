package p168w;

import java.util.concurrent.CancellationException;
import p027d1.C0464b;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p085l0.C2345c1;
import p109o1.InterfaceC2796a;
import p128q6.C3002e;
import p140s2.C3107q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.a */
/* loaded from: classes.dex */
public final class C3613a implements InterfaceC2796a {

    /* renamed from: e */
    public final AbstractC3642y f17262e;

    public C3613a(AbstractC3642y abstractC3642y) {
        this.f17262e = abstractC3642y;
    }

    @Override // p109o1.InterfaceC2796a
    /* renamed from: N */
    public final long mo2743N(int i7, long j6, long j7) {
        if (i7 == 2 && C0464b.m1008d(j7) != 0.0f) {
            throw new CancellationException();
        }
        return 0L;
    }

    @Override // p109o1.InterfaceC2796a
    /* renamed from: n */
    public final Object mo2745n(long j6, long j7, InterfaceC2313c interfaceC2313c) {
        return new C3107q(C3107q.m4800a(j7, 0.0f, 0.0f, 1));
    }

    @Override // p109o1.InterfaceC2796a
    /* renamed from: o0 */
    public final long mo4430o0(int i7, long j6) {
        if (i7 == 1) {
            AbstractC3642y abstractC3642y = this.f17262e;
            C3002e c3002e = abstractC3642y.f17396c;
            C3002e c3002e2 = abstractC3642y.f17396c;
            if (Math.abs(((C2345c1) c3002e.f15486d).m3729g()) > 1.0E-6d) {
                float m3729g = ((C2345c1) c3002e2.f15486d).m3729g() * abstractC3642y.m5610l();
                float f7 = ((abstractC3642y.m5609j().f17358b + abstractC3642y.m5609j().f17359c) * (-Math.signum(((C2345c1) c3002e2.f15486d).m3729g()))) + m3729g;
                if (((C2345c1) c3002e2.f15486d).m3729g() > 0.0f) {
                    f7 = m3729g;
                    m3729g = f7;
                }
                float f8 = -abstractC3642y.f17403j.mo116e(-AbstractC2168e.m3529p(C0464b.m1008d(j6), m3729g, f7));
                float m1009e = C0464b.m1009e(j6);
                return (Float.floatToRawIntBits(m1009e) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
            }
            return 0L;
        }
        return 0L;
    }
}
