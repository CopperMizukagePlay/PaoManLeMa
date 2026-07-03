package p176x;

import p027d1.C0465c;
import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p107o.C2746i;
import p122q.C2915j;
import p146t1.InterfaceC3238v;
import p147t2.C3250c;
import p150t5.InterfaceC3277a;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.InterfaceC3487b2;
import p162v1.InterfaceC3546v;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x.f */
/* loaded from: classes.dex */
public final class C3791f extends AbstractC3809q implements InterfaceC3786a, InterfaceC3546v, InterfaceC3487b2 {

    /* renamed from: u */
    public static final C3250c f17955u = new C3250c(8);

    /* renamed from: s */
    public C2915j f17956s;

    /* renamed from: t */
    public boolean f17957t;

    /* renamed from: K0 */
    public static final C0465c m5820K0(C3791f c3791f, AbstractC3497e1 abstractC3497e1, InterfaceC3277a interfaceC3277a) {
        C0465c c0465c;
        if (c3791f.f18005r && c3791f.f17957t) {
            AbstractC3497e1 m5381u = AbstractC3498f.m5381u(c3791f);
            if (!abstractC3497e1.mo5333V0().f18005r) {
                abstractC3497e1 = null;
            }
            if (abstractC3497e1 != null && (c0465c = (C0465c) interfaceC3277a.mo52a()) != null) {
                float f7 = m5381u.mo4934j(abstractC3497e1, false).f1625a;
                return c0465c.m1020g((Float.floatToRawIntBits(r4.f1626b) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32));
            }
        }
        return null;
    }

    @Override // p176x.InterfaceC3786a
    /* renamed from: O */
    public final Object mo5818O(AbstractC3497e1 abstractC3497e1, InterfaceC3277a interfaceC3277a, AbstractC2583c abstractC2583c) {
        Object m1130h = AbstractC0525d0.m1130h(new C3790e(this, abstractC3497e1, interfaceC3277a, new C2746i(this, abstractC3497e1, interfaceC3277a), null), abstractC2583c);
        if (m1130h == EnumC2465a.f13750e) {
            return m1130h;
        }
        return C1694m.f10482a;
    }

    @Override // p162v1.InterfaceC3546v
    /* renamed from: U */
    public final void mo5300U(InterfaceC3238v interfaceC3238v) {
        this.f17957t = true;
    }

    @Override // p162v1.InterfaceC3487b2
    /* renamed from: o */
    public final Object mo204o() {
        return f17955u;
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }
}
