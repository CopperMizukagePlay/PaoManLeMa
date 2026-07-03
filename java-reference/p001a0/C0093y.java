package p001a0;

import p034e0.C0622o0;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p092m.AbstractC2487d;
import p140s2.InterfaceC3093c;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.y */
/* loaded from: classes.dex */
public final class C0093y extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ C0622o0 f424f;

    /* renamed from: g */
    public final /* synthetic */ C0043k1 f425g;

    /* renamed from: h */
    public final /* synthetic */ boolean f426h;

    /* renamed from: i */
    public final /* synthetic */ boolean f427i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3279c f428j;

    /* renamed from: k */
    public final /* synthetic */ C2459w f429k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2453q f430l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC3093c f431m;

    /* renamed from: n */
    public final /* synthetic */ int f432n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0093y(C0622o0 c0622o0, C0043k1 c0043k1, boolean z7, boolean z8, InterfaceC3279c interfaceC3279c, C2459w c2459w, InterfaceC2453q interfaceC2453q, InterfaceC3093c interfaceC3093c, int i7) {
        super(2);
        this.f424f = c0622o0;
        this.f425g = c0043k1;
        this.f426h = z7;
        this.f427i = z8;
        this.f428j = interfaceC3279c;
        this.f429k = c2459w;
        this.f430l = interfaceC2453q;
        this.f431m = interfaceC3093c;
        this.f432n = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        if (r3 != false) goto L26;
     */
    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo22d(Object obj, Object obj2) {
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            InterfaceC3093c interfaceC3093c = this.f431m;
            int i7 = this.f432n;
            C0043k1 c0043k1 = this.f425g;
            C0090x c0090x = new C0090x(c0043k1, this.f428j, this.f429k, this.f430l, interfaceC3093c, i7);
            int m3975r = AbstractC2418w.m3975r(c2395p);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, C3807o.f17991a);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(c0090x, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
                AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            boolean z7 = true;
            c2395p.m3888r(true);
            EnumC0091x0 m117a = c0043k1.m117a();
            EnumC0091x0 enumC0091x0 = EnumC0091x0.f416e;
            boolean z8 = this.f426h;
            if (m117a != enumC0091x0 && c0043k1.m119c() != null) {
                InterfaceC3238v m119c = c0043k1.m119c();
                AbstractC3367j.m5097b(m119c);
                if (m119c.mo4923M()) {
                }
            }
            z7 = false;
            C0622o0 c0622o0 = this.f424f;
            AbstractC0027g1.m60f(c0622o0, z7, c2395p, 0);
            if (c0043k1.m117a() == EnumC0091x0.f418g && !this.f427i && z8) {
                c2395p.m3857Z(-2032274);
                AbstractC0027g1.m59e(c0622o0, c2395p, 0);
                c2395p.m3888r(false);
            } else {
                c2395p.m3857Z(-1955394);
                c2395p.m3888r(false);
            }
        }
        return C1694m.f10482a;
    }
}
