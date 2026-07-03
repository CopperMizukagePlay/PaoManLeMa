package p182y;

import p005a6.InterfaceC0114e;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0489v;
import p028d2.C0474g;
import p028d2.C0477j;
import p028d2.C0490w;
import p043f2.EnumC1533a;
import p063i0.C1947m0;
import p107o.C2775s;
import p137s.C3081j;
import p150t5.InterfaceC3279c;
import p170w1.C3701m0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: y.c */
/* loaded from: classes.dex */
public final class C3830c extends C2775s {

    /* renamed from: M */
    public boolean f18039M;

    /* renamed from: N */
    public InterfaceC3279c f18040N;

    /* renamed from: O */
    public final C3701m0 f18041O;

    public C3830c(boolean z7, C3081j c3081j, boolean z8, C0474g c0474g, InterfaceC3279c interfaceC3279c) {
        super(c3081j, null, z8, null, c0474g, new C1947m0(interfaceC3279c, z7, 1));
        this.f18039M = z7;
        this.f18040N = interfaceC3279c;
        this.f18041O = new C3701m0(3, this);
    }

    @Override // p107o.AbstractC2734e
    /* renamed from: N0 */
    public final void mo4396N0(C0477j c0477j) {
        EnumC1533a enumC1533a;
        if (this.f18039M) {
            enumC1533a = EnumC1533a.f10090e;
        } else {
            enumC1533a = EnumC1533a.f10091f;
        }
        InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
        C0490w c0490w = AbstractC0487t.f1733I;
        InterfaceC0114e interfaceC0114e = AbstractC0489v.f1768a[24];
        c0490w.m1066a(c0477j, enumC1533a);
    }
}
