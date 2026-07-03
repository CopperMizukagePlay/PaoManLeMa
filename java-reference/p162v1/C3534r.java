package p162v1;

import p001a0.C0068q2;
import p101n0.C2705e;
import p146t1.AbstractC3239v0;
import p146t1.C3216l;
import p146t1.InterfaceC3217l0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.r */
/* loaded from: classes.dex */
public final class C3534r extends AbstractC3529p0 {
    @Override // p162v1.AbstractC3529p0
    /* renamed from: L0 */
    public final void mo5495L0() {
        C3541t0 c3541t0 = this.f16985s.f16847s.f16873J.f16954q;
        AbstractC3367j.m5097b(c3541t0);
        c3541t0.m5507z0();
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: V */
    public final int mo4916V(int i7) {
        C0068q2 m5446t = this.f16985s.f16847s.m5446t();
        InterfaceC3217l0 m157x = m5446t.m157x();
        C3502g0 c3502g0 = (C3502g0) m5446t.f344f;
        return m157x.mo3112g(c3502g0.f16872I.f16800d, c3502g0.m5438l(), i7);
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: c0 */
    public final int mo4917c0(int i7) {
        C0068q2 m5446t = this.f16985s.f16847s.m5446t();
        InterfaceC3217l0 m157x = m5446t.m157x();
        C3502g0 c3502g0 = (C3502g0) m5446t.f344f;
        return m157x.mo173d(c3502g0.f16872I.f16800d, c3502g0.m5438l(), i7);
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: e */
    public final AbstractC3239v0 mo4918e(long j6) {
        m4960q0(j6);
        AbstractC3497e1 abstractC3497e1 = this.f16985s;
        C2705e m5451y = abstractC3497e1.f16847s.m5451y();
        Object[] objArr = m5451y.f14517e;
        int i7 = m5451y.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            C3541t0 c3541t0 = ((C3502g0) objArr[i8]).f16873J.f16954q;
            AbstractC3367j.m5097b(c3541t0);
            c3541t0.f17028n = EnumC3496e0.f16826g;
        }
        C3502g0 c3502g0 = abstractC3497e1.f16847s;
        AbstractC3529p0.m5494K0(this, c3502g0.f16905z.mo170a(this, c3502g0.m5438l(), j6));
        return this;
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: e0 */
    public final int mo4919e0(int i7) {
        C0068q2 m5446t = this.f16985s.f16847s.m5446t();
        InterfaceC3217l0 m157x = m5446t.m157x();
        C3502g0 c3502g0 = (C3502g0) m5446t.f344f;
        return m157x.mo3109b(c3502g0.f16872I.f16800d, c3502g0.m5438l(), i7);
    }

    @Override // p146t1.InterfaceC3214k0
    /* renamed from: f */
    public final int mo4920f(int i7) {
        C0068q2 m5446t = this.f16985s.f16847s.m5446t();
        InterfaceC3217l0 m157x = m5446t.m157x();
        C3502g0 c3502g0 = (C3502g0) m5446t.f344f;
        return m157x.mo3113h(c3502g0.f16872I.f16800d, c3502g0.m5438l(), i7);
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: u0 */
    public final int mo5491u0(C3216l c3216l) {
        int i7;
        C3541t0 c3541t0 = this.f16985s.f16847s.f16873J.f16954q;
        AbstractC3367j.m5097b(c3541t0);
        C3505h0 c3505h0 = c3541t0.f17037w;
        if (!c3541t0.f17029o) {
            C3514k0 c3514k0 = c3541t0.f17024j;
            if (c3514k0.f16941d == EnumC3489c0.f16792f) {
                c3505h0.f16919f = true;
                if (c3505h0.f16915b) {
                    c3514k0.f16943f = true;
                    c3514k0.f16944g = true;
                }
            } else {
                c3505h0.f16920g = true;
            }
        }
        C3534r c3534r = c3541t0.mo5288q().f17012U;
        if (c3534r != null) {
            c3534r.f16978o = true;
        }
        c3541t0.mo5291x();
        C3534r c3534r2 = c3541t0.mo5288q().f17012U;
        if (c3534r2 != null) {
            c3534r2.f16978o = false;
        }
        Integer num = (Integer) c3505h0.f16922i.get(c3216l);
        if (num != null) {
            i7 = num.intValue();
        } else {
            i7 = Integer.MIN_VALUE;
        }
        this.f16990x.m3555h(i7, c3216l);
        return i7;
    }
}
