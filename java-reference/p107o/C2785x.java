package p107o;

import p001a0.C0053n;
import p005a6.InterfaceC0114e;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0489v;
import p028d2.C0468a;
import p028d2.C0477j;
import p032d6.AbstractC0525d0;
import p039e5.C1339uj;
import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p117p1.InterfaceC2872w;
import p122q.AbstractC2959x1;
import p122q.C2910h0;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.x */
/* loaded from: classes.dex */
public final class C2785x extends AbstractC2734e {

    /* renamed from: M */
    public InterfaceC3277a f14790M;

    @Override // p107o.AbstractC2734e
    /* renamed from: N0 */
    public final void mo4396N0(C0477j c0477j) {
        if (this.f14790M != null) {
            C0053n c0053n = new C0053n(19, this);
            InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
            c0477j.m1036d(AbstractC0476i.f1659c, new C0468a(null, c0053n));
        }
    }

    @Override // p107o.AbstractC2734e
    /* renamed from: O0 */
    public final Object mo4397O0(InterfaceC2872w interfaceC2872w, C2722a c2722a) {
        C2783w c2783w;
        InterfaceC2313c interfaceC2313c = null;
        if (this.f14642y && this.f14790M != null) {
            c2783w = new C2783w(this, 0);
        } else {
            c2783w = null;
        }
        C2773r c2773r = new C2773r(this, interfaceC2313c, 1);
        C2783w c2783w2 = new C2783w(this, 1);
        C2910h0 c2910h0 = AbstractC2959x1.f15352a;
        Object m1130h = AbstractC0525d0.m1130h(new C1339uj(interfaceC2872w, c2773r, c2783w, (Object) null, c2783w2, (InterfaceC2313c) null, 6), c2722a);
        C1694m c1694m = C1694m.f10482a;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (m1130h != enumC2465a) {
            m1130h = c1694m;
        }
        if (m1130h == enumC2465a) {
            return m1130h;
        }
        return c1694m;
    }
}
