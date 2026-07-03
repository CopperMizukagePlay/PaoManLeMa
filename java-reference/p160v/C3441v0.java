package p160v;

import p001a0.C0005b;
import p005a6.InterfaceC0114e;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0489v;
import p028d2.C0468a;
import p028d2.C0469b;
import p028d2.C0475h;
import p028d2.C0477j;
import p028d2.C0490w;
import p122q.EnumC2931o0;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p162v1.InterfaceC3551w1;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.v0 */
/* loaded from: classes.dex */
public final class C3441v0 extends AbstractC3809q implements InterfaceC3551w1 {

    /* renamed from: s */
    public InterfaceC3277a f16624s;

    /* renamed from: t */
    public InterfaceC3435s0 f16625t;

    /* renamed from: u */
    public EnumC2931o0 f16626u;

    /* renamed from: v */
    public boolean f16627v;

    /* renamed from: w */
    public C0475h f16628w;

    /* renamed from: x */
    public final C3439u0 f16629x = new C3439u0(this, 0);

    /* renamed from: y */
    public C3439u0 f16630y;

    public C3441v0(InterfaceC3277a interfaceC3277a, InterfaceC3435s0 interfaceC3435s0, EnumC2931o0 enumC2931o0, boolean z7) {
        this.f16624s = interfaceC3277a;
        this.f16625t = interfaceC3435s0;
        this.f16626u = enumC2931o0;
        this.f16627v = z7;
        m5187K0();
    }

    /* renamed from: K0 */
    public final void m5187K0() {
        C3439u0 c3439u0;
        this.f16628w = new C0475h(new C3437t0(this, 1), new C3437t0(this, 2));
        if (this.f16627v) {
            c3439u0 = new C3439u0(this, 1);
        } else {
            c3439u0 = null;
        }
        this.f16630y = c3439u0;
    }

    @Override // p162v1.InterfaceC3551w1
    /* renamed from: t */
    public final void mo1002t(C0477j c0477j) {
        InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
        C0490w c0490w = AbstractC0487t.f1752m;
        InterfaceC0114e[] interfaceC0114eArr2 = AbstractC0489v.f1768a;
        InterfaceC0114e interfaceC0114e = interfaceC0114eArr2[6];
        c0490w.m1066a(c0477j, Boolean.TRUE);
        c0477j.m1036d(AbstractC0487t.f1736L, this.f16629x);
        if (this.f16626u == EnumC2931o0.f15240e) {
            C0475h c0475h = this.f16628w;
            if (c0475h != null) {
                C0490w c0490w2 = AbstractC0487t.f1760u;
                InterfaceC0114e interfaceC0114e2 = interfaceC0114eArr2[12];
                c0490w2.m1066a(c0477j, c0475h);
            } else {
                AbstractC3367j.m5105j("scrollAxisRange");
                throw null;
            }
        } else {
            C0475h c0475h2 = this.f16628w;
            if (c0475h2 != null) {
                C0490w c0490w3 = AbstractC0487t.f1759t;
                InterfaceC0114e interfaceC0114e3 = interfaceC0114eArr2[11];
                c0490w3.m1066a(c0477j, c0475h2);
            } else {
                AbstractC3367j.m5105j("scrollAxisRange");
                throw null;
            }
        }
        C3439u0 c3439u0 = this.f16630y;
        if (c3439u0 != null) {
            c0477j.m1036d(AbstractC0476i.f1662f, new C0468a(null, c3439u0));
        }
        c0477j.m1036d(AbstractC0476i.f1656B, new C0468a(null, new C0005b(9, new C3437t0(this, 0))));
        C0469b mo5043d = this.f16625t.mo5043d();
        C0490w c0490w4 = AbstractC0487t.f1745f;
        InterfaceC0114e interfaceC0114e4 = interfaceC0114eArr2[22];
        c0490w4.m1066a(c0477j, mo5043d);
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }
}
