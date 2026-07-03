package p162v1;

import p053g5.C1694m;
import p057h1.C1752b;
import p101n0.C2705e;
import p140s2.C3100j;
import p146t1.AbstractC3237u0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.w0 */
/* loaded from: classes.dex */
public final class C3550w0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f17066f;

    /* renamed from: g */
    public final /* synthetic */ C3553x0 f17067g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3550w0(C3553x0 c3553x0, int i7) {
        super(0);
        this.f17066f = i7;
        this.f17067g = c3553x0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        AbstractC3237u0 placementScope;
        switch (this.f17066f) {
            case 0:
                C3553x0 c3553x0 = this.f17067g;
                C3514k0 c3514k0 = c3553x0.f17086j;
                c3514k0.f16946i = 0;
                C2705e m5451y = c3514k0.f16938a.m5451y();
                Object[] objArr = m5451y.f14517e;
                int i7 = m5451y.f14519g;
                for (int i8 = 0; i8 < i7; i8++) {
                    C3553x0 c3553x02 = ((C3502g0) objArr[i8]).f16873J.f16953p;
                    c3553x02.f17088l = c3553x02.f17089m;
                    c3553x02.f17089m = Integer.MAX_VALUE;
                    c3553x02.f17101y = false;
                    if (c3553x02.f17092p == EnumC3496e0.f16825f) {
                        c3553x02.f17092p = EnumC3496e0.f16826g;
                    }
                }
                C3502g0 c3502g0 = c3514k0.f16938a;
                C3502g0 c3502g02 = c3514k0.f16938a;
                C2705e m5451y2 = c3502g0.m5451y();
                Object[] objArr2 = m5451y2.f14517e;
                int i9 = m5451y2.f14519g;
                for (int i10 = 0; i10 < i9; i10++) {
                    ((C3502g0) objArr2[i10]).f16873J.f16953p.f17071C.f16917d = false;
                }
                c3553x0.mo5288q().mo5318D0().mo4883b();
                C2705e m5451y3 = c3502g02.m5451y();
                Object[] objArr3 = m5451y3.f14517e;
                int i11 = m5451y3.f14519g;
                for (int i12 = 0; i12 < i11; i12++) {
                    C3502g0 c3502g03 = (C3502g0) objArr3[i12];
                    C3514k0 c3514k02 = c3502g03.f16873J;
                    if (c3514k02.f16953p.f17088l != c3502g03.m5448v()) {
                        c3502g02.m5414P();
                        c3502g02.m5401C();
                        if (c3502g03.m5448v() == Integer.MAX_VALUE) {
                            if (c3514k02.f16940c) {
                                C3541t0 c3541t0 = c3514k02.f16954q;
                                AbstractC3367j.m5097b(c3541t0);
                                c3541t0.m5503s0(false);
                            }
                            c3514k02.f16953p.m5532w0();
                        }
                    }
                }
                C2705e m5451y4 = c3502g02.m5451y();
                Object[] objArr4 = m5451y4.f14517e;
                int i13 = m5451y4.f14519g;
                for (int i14 = 0; i14 < i13; i14++) {
                    C3505h0 c3505h0 = ((C3502g0) objArr4[i14]).f16873J.f16953p.f17071C;
                    c3505h0.f16918e = c3505h0.f16917d;
                }
                return C1694m.f10482a;
            case 1:
                C3553x0 c3553x03 = this.f17067g;
                c3553x03.f17086j.m5465a().mo4918e(c3553x03.f17075G);
                return C1694m.f10482a;
            default:
                C3553x0 c3553x04 = this.f17067g;
                C3514k0 c3514k03 = c3553x04.f17086j;
                AbstractC3497e1 abstractC3497e1 = c3514k03.m5465a().f16849u;
                if (abstractC3497e1 == null || (placementScope = abstractC3497e1.f16979p) == null) {
                    placementScope = ((C3728t) AbstractC3511j0.m5464a(c3514k03.f16938a)).getPlacementScope();
                }
                InterfaceC3279c interfaceC3279c = c3553x04.f17080L;
                C1752b c1752b = c3553x04.f17081M;
                if (c1752b != null) {
                    AbstractC3497e1 m5465a = c3514k03.m5465a();
                    long j6 = c3553x04.f17082N;
                    float f7 = c3553x04.f17083O;
                    placementScope.getClass();
                    AbstractC3237u0.m4948a(placementScope, m5465a);
                    m5465a.mo4958m0(C3100j.m4785c(j6, m5465a.f16057i), f7, c1752b);
                } else if (interfaceC3279c == null) {
                    AbstractC3497e1 m5465a2 = c3514k03.m5465a();
                    long j7 = c3553x04.f17082N;
                    float f8 = c3553x04.f17083O;
                    placementScope.getClass();
                    AbstractC3237u0.m4948a(placementScope, m5465a2);
                    m5465a2.mo4940o0(C3100j.m4785c(j7, m5465a2.f16057i), f8, null);
                } else {
                    AbstractC3497e1 m5465a3 = c3514k03.m5465a();
                    long j8 = c3553x04.f17082N;
                    float f9 = c3553x04.f17083O;
                    placementScope.getClass();
                    AbstractC3237u0.m4948a(placementScope, m5465a3);
                    m5465a3.mo4940o0(C3100j.m4785c(j8, m5465a3.f16057i), f9, interfaceC3279c);
                }
                return C1694m.f10482a;
        }
    }
}
