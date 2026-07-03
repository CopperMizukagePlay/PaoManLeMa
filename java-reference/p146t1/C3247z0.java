package p146t1;

import p001a0.C0056n2;
import p060h5.C1814v;
import p100n.C2649h1;
import p162v1.InterfaceC3487b2;
import p162v1.InterfaceC3549w;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.z0 */
/* loaded from: classes.dex */
public final class C3247z0 extends AbstractC3809q implements InterfaceC3549w, InterfaceC3487b2 {

    /* renamed from: s */
    public RunnableC3226p f16068s;

    /* renamed from: t */
    public final C2649h1 f16069t;

    public C3247z0(RunnableC3226p runnableC3226p) {
        this.f16068s = runnableC3226p;
        this.f16069t = new C2649h1(13, this, runnableC3226p);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(j6);
        return interfaceC3223n0.mo4887I(mo4918e.f16053e, mo4918e.f16054f, C1814v.f10861e, this.f16069t, new C0056n2(mo4918e, 12));
    }

    @Override // p162v1.InterfaceC3487b2
    /* renamed from: o */
    public final Object mo204o() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
