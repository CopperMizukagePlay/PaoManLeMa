package p107o;

import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.InterfaceC3487b2;
import p162v1.InterfaceC3525o;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.g0 */
/* loaded from: classes.dex */
public final class C2741g0 extends AbstractC3809q implements InterfaceC3487b2, InterfaceC3525o {

    /* renamed from: u */
    public static final C2730c1 f14664u = new Object();

    /* renamed from: s */
    public boolean f14665s;

    /* renamed from: t */
    public AbstractC3497e1 f14666t;

    /* renamed from: K0 */
    public final C2744h0 m4410K0() {
        if (this.f18005r) {
            InterfaceC3487b2 m5370j = AbstractC3498f.m5370j(this, C2744h0.f14668t);
            if (m5370j instanceof C2744h0) {
                return (C2744h0) m5370j;
            }
            return null;
        }
        return null;
    }

    @Override // p162v1.InterfaceC3487b2
    /* renamed from: o */
    public final Object mo204o() {
        return f14664u;
    }

    @Override // p162v1.InterfaceC3525o
    /* renamed from: x */
    public final void mo790x(AbstractC3497e1 abstractC3497e1) {
        C2744h0 m4410K0;
        this.f14666t = abstractC3497e1;
        if (this.f14665s) {
            if (abstractC3497e1.mo5333V0().f18005r) {
                AbstractC3497e1 abstractC3497e12 = this.f14666t;
                if (abstractC3497e12 != null && abstractC3497e12.mo5333V0().f18005r && (m4410K0 = m4410K0()) != null) {
                    m4410K0.m4415K0(this.f14666t);
                    return;
                }
                return;
            }
            C2744h0 m4410K02 = m4410K0();
            if (m4410K02 != null) {
                m4410K02.m4415K0(null);
            }
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }
}
