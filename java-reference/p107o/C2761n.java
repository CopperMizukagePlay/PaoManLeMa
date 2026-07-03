package p107o;

import p001a0.C0019e1;
import p001a0.C0031h1;
import p027d1.C0467e;
import p035e1.AbstractC0670o;
import p035e1.C0671o0;
import p049g1.C1568b;
import p049g1.C1574h;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p066i3.AbstractC2067b;
import p092m.AbstractC2487d;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p162v1.C3508i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.n */
/* loaded from: classes.dex */
public final class C2761n extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ boolean f14720f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC0670o f14721g;

    /* renamed from: h */
    public final /* synthetic */ long f14722h;

    /* renamed from: i */
    public final /* synthetic */ float f14723i;

    /* renamed from: j */
    public final /* synthetic */ float f14724j;

    /* renamed from: k */
    public final /* synthetic */ long f14725k;

    /* renamed from: l */
    public final /* synthetic */ long f14726l;

    /* renamed from: m */
    public final /* synthetic */ C1574h f14727m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2761n(boolean z7, C0671o0 c0671o0, long j6, float f7, float f8, long j7, long j8, C1574h c1574h) {
        super(1);
        this.f14720f = z7;
        this.f14721g = c0671o0;
        this.f14722h = j6;
        this.f14723i = f7;
        this.f14724j = f8;
        this.f14725k = j7;
        this.f14726l = j8;
        this.f14727m = c1574h;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C3508i0 c3508i0 = (C3508i0) obj;
        c3508i0.m5460a();
        C1568b c1568b = c3508i0.f16933e;
        if (this.f14720f) {
            InterfaceC1570d.m2537G(c3508i0, this.f14721g, 0L, 0L, this.f14722h, null, 246);
        } else {
            long j6 = this.f14722h;
            float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
            float f7 = this.f14723i;
            if (intBitsToFloat < f7) {
                float f8 = this.f14724j;
                float m1026d = C0467e.m1026d(c1568b.mo2546c());
                float f9 = this.f14724j;
                float f10 = m1026d - f9;
                float m1024b = C0467e.m1024b(c1568b.mo2546c()) - f9;
                AbstractC0670o abstractC0670o = this.f14721g;
                long j7 = this.f14722h;
                C0031h1 c0031h1 = c1568b.f10182f;
                long m109x = c0031h1.m109x();
                c0031h1.m106u().mo1341m();
                try {
                    ((C0031h1) ((C0019e1) c0031h1.f152f).f109e).m106u().mo1335g(f8, f8, f10, m1024b, 0);
                    InterfaceC1570d.m2537G(c3508i0, abstractC0670o, 0L, 0L, j7, null, 246);
                } finally {
                    AbstractC2487d.m4052p(c0031h1, m109x);
                }
            } else {
                InterfaceC1570d.m2537G(c3508i0, this.f14721g, this.f14725k, this.f14726l, AbstractC2067b.m3273A(f7, j6), this.f14727m, 208);
            }
        }
        return C1694m.f10482a;
    }
}
