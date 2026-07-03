package p162v1;

import java.util.LinkedHashMap;
import p077k.AbstractC2202l0;
import p077k.C2182b0;
import p092m.AbstractC2487d;
import p140s2.C3100j;
import p140s2.EnumC3103m;
import p146t1.C3211j0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC3529p0 extends AbstractC3526o0 implements InterfaceC3214k0 {

    /* renamed from: s */
    public final AbstractC3497e1 f16985s;

    /* renamed from: u */
    public LinkedHashMap f16987u;

    /* renamed from: w */
    public InterfaceC3220m0 f16989w;

    /* renamed from: x */
    public final C2182b0 f16990x;

    /* renamed from: t */
    public long f16986t = 0;

    /* renamed from: v */
    public final C3211j0 f16988v = new C3211j0(this);

    public AbstractC3529p0(AbstractC3497e1 abstractC3497e1) {
        this.f16985s = abstractC3497e1;
        C2182b0 c2182b0 = AbstractC2202l0.f12710a;
        this.f16990x = new C2182b0();
    }

    /* renamed from: K0 */
    public static final void m5494K0(AbstractC3529p0 abstractC3529p0, InterfaceC3220m0 interfaceC3220m0) {
        LinkedHashMap linkedHashMap;
        if (interfaceC3220m0 != null) {
            abstractC3529p0.m4959p0((interfaceC3220m0.mo4884c() & 4294967295L) | (interfaceC3220m0.mo4886e() << 32));
        } else {
            abstractC3529p0.m4959p0(0L);
        }
        if (!AbstractC3367j.m5096a(abstractC3529p0.f16989w, interfaceC3220m0) && interfaceC3220m0 != null && ((((linkedHashMap = abstractC3529p0.f16987u) != null && !linkedHashMap.isEmpty()) || !interfaceC3220m0.mo4882a().isEmpty()) && !AbstractC3367j.m5096a(interfaceC3220m0.mo4882a(), abstractC3529p0.f16987u))) {
            C3541t0 c3541t0 = abstractC3529p0.f16985s.f16847s.f16873J.f16954q;
            AbstractC3367j.m5097b(c3541t0);
            c3541t0.f17037w.m5457f();
            LinkedHashMap linkedHashMap2 = abstractC3529p0.f16987u;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC3529p0.f16987u = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC3220m0.mo4882a());
        }
        abstractC3529p0.f16989w = interfaceC3220m0;
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: A0 */
    public final InterfaceC3238v mo5315A0() {
        return this.f16988v;
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: B0 */
    public final boolean mo5316B0() {
        if (this.f16989w != null) {
            return true;
        }
        return false;
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: C0 */
    public final C3502g0 mo5317C0() {
        return this.f16985s.f16847s;
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: D0 */
    public final InterfaceC3220m0 mo5318D0() {
        InterfaceC3220m0 interfaceC3220m0 = this.f16989w;
        if (interfaceC3220m0 != null) {
            return interfaceC3220m0;
        }
        throw AbstractC2487d.m4041e("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: E0 */
    public final AbstractC3526o0 mo5319E0() {
        AbstractC3497e1 abstractC3497e1 = this.f16985s.f16849u;
        if (abstractC3497e1 != null) {
            return abstractC3497e1.mo5331T0();
        }
        return null;
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: F0 */
    public final long mo5320F0() {
        return this.f16986t;
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: J0 */
    public final void mo5321J0() {
        mo4940o0(this.f16986t, 0.0f, null);
    }

    /* renamed from: L0 */
    public void mo5495L0() {
        mo5318D0().mo4883b();
    }

    /* renamed from: M0 */
    public final void m5496M0(long j6) {
        if (!C3100j.m4783a(this.f16986t, j6)) {
            this.f16986t = j6;
            AbstractC3497e1 abstractC3497e1 = this.f16985s;
            C3541t0 c3541t0 = abstractC3497e1.f16847s.f16873J.f16954q;
            if (c3541t0 != null) {
                c3541t0.m5505w0();
            }
            AbstractC3526o0.m5486H0(abstractC3497e1);
        }
        if (!this.f16978o) {
            m5493y0(mo5318D0());
        }
    }

    /* renamed from: N0 */
    public final long m5497N0(AbstractC3529p0 abstractC3529p0, boolean z7) {
        long j6 = 0;
        AbstractC3529p0 abstractC3529p02 = this;
        while (!abstractC3529p02.equals(abstractC3529p0)) {
            if (!abstractC3529p02.f16976m || !z7) {
                j6 = C3100j.m4785c(j6, abstractC3529p02.f16986t);
            }
            AbstractC3497e1 abstractC3497e1 = abstractC3529p02.f16985s.f16849u;
            AbstractC3367j.m5097b(abstractC3497e1);
            abstractC3529p02 = abstractC3497e1.mo5331T0();
            AbstractC3367j.m5097b(abstractC3529p02);
        }
        return j6;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f16985s.mo559b();
    }

    @Override // p146t1.InterfaceC3228q
    public final EnumC3103m getLayoutDirection() {
        return this.f16985s.f16847s.f16866C;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f16985s.mo560l();
    }

    @Override // p146t1.AbstractC3239v0, p146t1.InterfaceC3214k0
    /* renamed from: n */
    public final Object mo4921n() {
        return this.f16985s.mo4921n();
    }

    @Override // p146t1.AbstractC3239v0
    /* renamed from: o0 */
    public final void mo4940o0(long j6, float f7, InterfaceC3279c interfaceC3279c) {
        m5496M0(j6);
        if (this.f16977n) {
            return;
        }
        mo5495L0();
    }

    @Override // p162v1.AbstractC3526o0, p146t1.InterfaceC3228q
    /* renamed from: s */
    public final boolean mo4889s() {
        return true;
    }

    @Override // p162v1.AbstractC3526o0
    /* renamed from: z0 */
    public final AbstractC3526o0 mo5360z0() {
        AbstractC3497e1 abstractC3497e1 = this.f16985s.f16848t;
        if (abstractC3497e1 != null) {
            return abstractC3497e1.mo5331T0();
        }
        return null;
    }
}
