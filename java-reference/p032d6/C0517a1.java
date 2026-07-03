package p032d6;

import p060h5.AbstractC1793a0;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.a1 */
/* loaded from: classes.dex */
public final class C0517a1 extends AbstractC0529e1 {

    /* renamed from: i */
    public final /* synthetic */ int f1841i;

    /* renamed from: j */
    public final Object f1842j;

    public /* synthetic */ C0517a1(int i7, Object obj) {
        this.f1841i = i7;
        this.f1842j = obj;
    }

    @Override // p032d6.AbstractC0529e1
    /* renamed from: k */
    public final boolean mo1111k() {
        switch (this.f1841i) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // p032d6.AbstractC0529e1
    /* renamed from: l */
    public final void mo1112l(Throwable th) {
        switch (this.f1841i) {
            case 0:
                ((InterfaceC3279c) this.f1842j).mo23f(th);
                return;
            default:
                C0532f1 c0532f1 = (C0532f1) this.f1842j;
                Object obj = C0541i1.f1886e.get(m1158j());
                if (obj instanceof C0569s) {
                    c0532f1.mo663n(AbstractC1793a0.m2985m(((C0569s) obj).f1923a));
                    return;
                } else {
                    c0532f1.mo663n(AbstractC0525d0.m1147y(obj));
                    return;
                }
        }
    }
}
