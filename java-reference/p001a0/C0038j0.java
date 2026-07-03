package p001a0;

import p005a6.InterfaceC0114e;
import p019c1.C0373q;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0487t;
import p028d2.AbstractC0489v;
import p028d2.C0468a;
import p028d2.C0477j;
import p028d2.C0490w;
import p034e0.C0622o0;
import p050g2.C1587g;
import p050g2.C1602n0;
import p053g5.C1694m;
import p087l2.C2439d0;
import p087l2.C2446j;
import p087l2.C2447k;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.j0 */
/* loaded from: classes.dex */
public final class C0038j0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ C2439d0 f172f;

    /* renamed from: g */
    public final /* synthetic */ C2459w f173g;

    /* renamed from: h */
    public final /* synthetic */ boolean f174h;

    /* renamed from: i */
    public final /* synthetic */ boolean f175i;

    /* renamed from: j */
    public final /* synthetic */ C2447k f176j;

    /* renamed from: k */
    public final /* synthetic */ C0043k1 f177k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2453q f178l;

    /* renamed from: m */
    public final /* synthetic */ C0622o0 f179m;

    /* renamed from: n */
    public final /* synthetic */ C0373q f180n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0038j0(C2439d0 c2439d0, C2459w c2459w, boolean z7, boolean z8, C2447k c2447k, C0043k1 c0043k1, InterfaceC2453q interfaceC2453q, C0622o0 c0622o0, C0373q c0373q) {
        super(1);
        this.f172f = c2439d0;
        this.f173g = c2459w;
        this.f174h = z7;
        this.f175i = z8;
        this.f176j = c2447k;
        this.f177k = c0043k1;
        this.f178l = interfaceC2453q;
        this.f179m = c0622o0;
        this.f180n = c0373q;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        boolean z7;
        C0477j c0477j = (C0477j) obj;
        C1587g c1587g = this.f172f.f13685a;
        InterfaceC0114e[] interfaceC0114eArr = AbstractC0489v.f1768a;
        C0490w c0490w = AbstractC0487t.f1729E;
        InterfaceC0114e[] interfaceC0114eArr2 = AbstractC0489v.f1768a;
        InterfaceC0114e interfaceC0114e = interfaceC0114eArr2[18];
        c0490w.m1066a(c0477j, c1587g);
        C2459w c2459w = this.f173g;
        long j6 = c2459w.f13724b;
        C0490w c0490w2 = AbstractC0487t.f1730F;
        InterfaceC0114e interfaceC0114e2 = interfaceC0114eArr2[19];
        c0490w2.m1066a(c0477j, new C1602n0(j6));
        C1694m c1694m = C1694m.f10482a;
        boolean z8 = this.f174h;
        if (!z8) {
            c0477j.m1036d(AbstractC0487t.f1748i, c1694m);
        }
        boolean z9 = this.f175i;
        if (z8 && !z9) {
            z7 = true;
        } else {
            z7 = false;
        }
        C0490w c0490w3 = AbstractC0487t.f1737M;
        InterfaceC0114e interfaceC0114e3 = interfaceC0114eArr2[25];
        c0490w3.m1066a(c0477j, Boolean.valueOf(z7));
        C0043k1 c0043k1 = this.f177k;
        AbstractC0489v.m1063a(c0477j, new C0006b0(c0043k1, 2));
        if (z7) {
            c0477j.m1036d(AbstractC0476i.f1666j, new C0468a(null, new C0006b0(c0043k1, c0477j)));
            c0477j.m1036d(AbstractC0476i.f1670n, new C0468a(null, new C0026g0(this.f175i, this.f174h, c0043k1, c0477j, c2459w)));
        }
        InterfaceC2453q interfaceC2453q = this.f178l;
        boolean z10 = this.f174h;
        C0622o0 c0622o0 = this.f179m;
        c0477j.m1036d(AbstractC0476i.f1665i, new C0468a(null, new C0030h0(interfaceC2453q, z10, c2459w, c0622o0, c0043k1)));
        C2447k c2447k = this.f176j;
        int i7 = c2447k.f13703e;
        C0033i c0033i = new C0033i(1, c0043k1, c2447k);
        c0477j.m1036d(AbstractC0487t.f1731G, new C2446j(i7));
        c0477j.m1036d(AbstractC0476i.f1671o, new C0468a(null, c0033i));
        c0477j.m1036d(AbstractC0476i.f1658b, new C0468a(null, new C0034i0(c0043k1, this.f180n, z9, 0)));
        c0477j.m1036d(AbstractC0476i.f1659c, new C0468a(null, new C0022f0(c0622o0, 1)));
        if (!C1602n0.m2586b(j6)) {
            c0477j.m1036d(AbstractC0476i.f1672p, new C0468a(null, new C0022f0(c0622o0, 2)));
            if (z8 && !z9) {
                c0477j.m1036d(AbstractC0476i.f1673q, new C0468a(null, new C0022f0(c0622o0, 3)));
            }
        }
        if (z8 && !z9) {
            c0477j.m1036d(AbstractC0476i.f1674r, new C0468a(null, new C0022f0(c0622o0, 0)));
        }
        return c1694m;
    }
}
