package p107o;

import p001a0.C0075s1;
import p032d6.AbstractC0525d0;
import p035e1.C0677s;
import p049g1.C1568b;
import p049g1.InterfaceC1570d;
import p137s.InterfaceC3080i;
import p162v1.C3508i0;
import p162v1.InterfaceC3522n;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.y */
/* loaded from: classes.dex */
public final class C2787y extends AbstractC3809q implements InterfaceC3522n {

    /* renamed from: s */
    public final InterfaceC3080i f14792s;

    /* renamed from: t */
    public boolean f14793t;

    /* renamed from: u */
    public boolean f14794u;

    /* renamed from: v */
    public boolean f14795v;

    public C2787y(InterfaceC3080i interfaceC3080i) {
        this.f14792s = interfaceC3080i;
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: C0 */
    public final void mo789C0() {
        AbstractC0525d0.m1141s(m5830y0(), null, new C0075s1(this, null, 5), 3);
    }

    @Override // p162v1.InterfaceC3522n
    /* renamed from: f */
    public final void mo555f(C3508i0 c3508i0) {
        c3508i0.m5460a();
        C1568b c1568b = c3508i0.f16933e;
        if (this.f14793t) {
            InterfaceC1570d.m2535D(c3508i0, C0677s.m1453b(0.3f, C0677s.f2204b), 0L, c1568b.mo2546c(), 0.0f, 122);
        } else {
            if (!this.f14794u && !this.f14795v) {
                return;
            }
            InterfaceC1570d.m2535D(c3508i0, C0677s.m1453b(0.1f, C0677s.f2204b), 0L, c1568b.mo2546c(), 0.0f, 122);
        }
    }
}
