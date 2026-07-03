package p035e1;

import p001a0.C0078t0;
import p028d2.C0477j;
import p060h5.C1814v;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3279c;
import p162v1.InterfaceC3549w;
import p162v1.InterfaceC3551w1;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.n */
/* loaded from: classes.dex */
public final class C0668n extends AbstractC3809q implements InterfaceC3549w, InterfaceC3551w1 {

    /* renamed from: s */
    public InterfaceC3279c f2183s;

    public C0668n(InterfaceC3279c interfaceC3279c) {
        this.f2183s = interfaceC3279c;
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(j6);
        return interfaceC3223n0.mo4941K(mo4918e.f16053e, mo4918e.f16054f, C1814v.f10861e, new C0078t0(5, mo4918e, this));
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: g */
    public final boolean mo1447g() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f2183s + ')';
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: t */
    public final void mo1002t(C0477j c0477j) {
    }
}
