package p039e5;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import java.util.List;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.AbstractC2048y5;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p066i3.AbstractC2067b;
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3130g;
import p144t.C3147o0;
import p144t.C3152r;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3800h;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;
import p190z.AbstractC3861e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.a6 */
/* loaded from: classes.dex */
public final class C0701a6 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f2327e;

    /* renamed from: f */
    public final /* synthetic */ Object f2328f;

    /* renamed from: g */
    public final /* synthetic */ Object f2329g;

    /* renamed from: h */
    public final /* synthetic */ boolean f2330h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3277a f2331i;

    public /* synthetic */ C0701a6(List list, InterfaceC3279c interfaceC3279c, boolean z7, InterfaceC3277a interfaceC3277a, int i7) {
        this.f2327e = i7;
        this.f2328f = list;
        this.f2329g = interfaceC3279c;
        this.f2330h = z7;
        this.f2331i = interfaceC3277a;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C3558z c3558z;
        C3504h c3504h;
        switch (this.f2327e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C3807o c3807o = C3807o.f17991a;
                    InterfaceC3810r m338i = AbstractC0154b.m338i(c3807o, 20, 16);
                    C3130g m4843g = AbstractC3136j.m4843g(12);
                    List list = (List) this.f2328f;
                    InterfaceC3279c interfaceC3279c = (InterfaceC3279c) this.f2329g;
                    C3800h c3800h = C3795c.f17976q;
                    C3152r m4857a = AbstractC3150q.m4857a(m4843g, c3800h, c2395p, 6);
                    int m3975r = AbstractC2418w.m3975r(c2395p);
                    InterfaceC2385m1 m3882m = c2395p.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m338i);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z2 = C3507i.f16928b;
                    c2395p.m3863c0();
                    if (c2395p.f13485S) {
                        c2395p.m3880l(c3558z2);
                    } else {
                        c2395p.m3883m0();
                    }
                    C3504h c3504h2 = C3507i.f16931e;
                    AbstractC2418w.m3954C(m4857a, c2395p, c3504h2);
                    C3504h c3504h3 = C3507i.f16930d;
                    AbstractC2418w.m3954C(m3882m, c2395p, c3504h3);
                    C3504h c3504h4 = C3507i.f16932f;
                    if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
                        AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h4);
                    }
                    C3504h c3504h5 = C3507i.f16929c;
                    AbstractC2418w.m3954C(m5823c, c2395p, c3504h5);
                    C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                    AbstractC1850a7.m3108b("STUN 服务器", null, 0L, 0L, C2300k.f13235j, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11250g, c2395p, 196614, 0, 65502);
                    AbstractC1850a7.m3108b("按列表顺序逐个尝试，探测时会自动跳过无效或不可用的服务器。", null, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11255l, c2395p, 6, 0, 65530);
                    InterfaceC3810r m3275C = AbstractC2067b.m3275C(AbstractC0155c.m349h(c3807o, 0.0f, 470, 1), AbstractC2067b.m3297v(c2395p));
                    C3152r m4857a2 = AbstractC3150q.m4857a(AbstractC3136j.m4843g(8), c3800h, c2395p, 6);
                    int m3975r2 = AbstractC2418w.m3975r(c2395p);
                    InterfaceC2385m1 m3882m2 = c2395p.m3882m();
                    InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p, m3275C);
                    c2395p.m3863c0();
                    if (c2395p.f13485S) {
                        c3558z = c3558z2;
                        c2395p.m3880l(c3558z);
                    } else {
                        c3558z = c3558z2;
                        c2395p.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4857a2, c2395p, c3504h2);
                    AbstractC2418w.m3954C(m3882m2, c2395p, c3504h3);
                    if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r2))) {
                        c3504h = c3504h4;
                        AbstractC2487d.m4050n(m3975r2, c2395p, m3975r2, c3504h);
                    } else {
                        c3504h = c3504h4;
                    }
                    AbstractC2418w.m3954C(m5823c2, c2395p, c3504h5);
                    AbstractC1172p7.m2067n(list, interfaceC3279c, !this.f2330h, c2395p, 0);
                    c2395p.m3888r(true);
                    InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, 1.0f);
                    C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15790b, C3795c.f17973n, c2395p, 6);
                    int m3975r3 = AbstractC2418w.m3975r(c2395p);
                    InterfaceC2385m1 m3882m3 = c2395p.m3882m();
                    InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p, m346e);
                    c2395p.m3863c0();
                    if (c2395p.f13485S) {
                        c2395p.m3880l(c3558z);
                    } else {
                        c2395p.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4854a, c2395p, c3504h2);
                    AbstractC2418w.m3954C(m3882m3, c2395p, c3504h3);
                    if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r3))) {
                        AbstractC2487d.m4050n(m3975r3, c2395p, m3975r3, c3504h);
                    }
                    AbstractC2418w.m3954C(m5823c3, c2395p, c3504h5);
                    AbstractC1991r4.m3167h(this.f2331i, null, false, null, null, null, AbstractC0792d1.f3266h, c2395p, 805306368, 510);
                    c2395p.m3888r(true);
                    c2395p.m3888r(true);
                }
                return C1694m.f10482a;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC2048y5.m3210a(AbstractC0155c.m358q(AbstractC0155c.m346e(C3807o.f17991a, 0.94f), 0.0f, 520, 1), AbstractC3861e.m5873a(16), ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11822p, 0L, 6, 0.0f, AbstractC3178i.m4873d(-1729651744, new C0701a6((List) this.f2328f, (InterfaceC3279c) this.f2329g, this.f2330h, this.f2331i, 0), c2395p2), c2395p2, 12607494, 104);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p3 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    boolean booleanValue = ((Boolean) ((InterfaceC2390n2) this.f2328f).getValue()).booleanValue();
                    c2395p3.m3857Z(-1555571132);
                    InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f2329g;
                    Object m3847O = c2395p3.m3847O();
                    if (m3847O == C2375k.f13421a) {
                        m3847O = new C0705aa(interfaceC2425y0, 26);
                        c2395p3.m3877j0(m3847O);
                    }
                    c2395p3.m3888r(false);
                    AbstractC1249rm.m2268k(booleanValue, this.f2330h, this.f2331i, (InterfaceC3277a) m3847O, c2395p3, 3072);
                }
                return C1694m.f10482a;
        }
    }

    public C0701a6(boolean z7, InterfaceC3277a interfaceC3277a, InterfaceC2390n2 interfaceC2390n2, InterfaceC2425y0 interfaceC2425y0) {
        this.f2327e = 2;
        this.f2330h = z7;
        this.f2331i = interfaceC3277a;
        this.f2328f = interfaceC2390n2;
        this.f2329g = interfaceC2425y0;
    }
}
