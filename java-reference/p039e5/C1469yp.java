package p039e5;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0155c;
import p050g2.C1604o0;
import p053g5.C1694m;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3150q;
import p144t.C3152r;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3365h;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.yp */
/* loaded from: classes.dex */
public final class C1469yp implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f9582e = 1;

    /* renamed from: f */
    public final /* synthetic */ Context f9583f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f9584g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f9585h;

    public C1469yp(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02) {
        this.f9583f = context;
        this.f9584g = interfaceC2425y0;
        this.f9585h = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC2425y0 interfaceC2425y0;
        switch (this.f9582e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.m4843g(8), C3795c.f17976q, c2395p, 6);
                    int m3975r = AbstractC2418w.m3975r(c2395p);
                    InterfaceC2385m1 m3882m = c2395p.m3882m();
                    C3807o c3807o = C3807o.f17991a;
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, c3807o);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z = C3507i.f16928b;
                    c2395p.m3863c0();
                    if (c2395p.f13485S) {
                        c2395p.m3880l(c3558z);
                    } else {
                        c2395p.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4857a, c2395p, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
                    C3504h c3504h = C3507i.f16932f;
                    if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
                        AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h);
                    }
                    AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
                    C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                    C1604o0 c1604o0 = ((C1904g7) c2395p.m3878k(c2394o2)).f11255l;
                    C2394o2 c2394o22 = AbstractC2019v0.f11943a;
                    AbstractC1850a7.m3108b("支持 Excel「App导入格式」、JSON、或每行「地域 CIDR」。", null, ((C2003t0) c2395p.m3878k(c2394o22)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p, 6, 0, 65530);
                    InterfaceC2425y0 interfaceC2425y02 = this.f9584g;
                    String str = (String) interfaceC2425y02.getValue();
                    InterfaceC3810r m348g = AbstractC0155c.m348g(AbstractC0155c.m346e(c3807o, 1.0f), 140, 280);
                    c2395p.m3857Z(1991791296);
                    boolean m3870g = c2395p.m3870g(interfaceC2425y02);
                    Object m3847O = c2395p.m3847O();
                    C2413u0 c2413u0 = C2375k.f13421a;
                    InterfaceC2425y0 interfaceC2425y03 = this.f9585h;
                    if (m3870g || m3847O == c2413u0) {
                        m3847O = new C1453y9(interfaceC2425y02, interfaceC2425y03, 1);
                        c2395p.m3877j0(m3847O);
                    }
                    c2395p.m3888r(false);
                    AbstractC1847a4.m3102a(str, (InterfaceC3279c) m3847O, m348g, true, false, null, AbstractC1352v1.f8049R, AbstractC1352v1.f8050S, null, null, null, null, null, null, false, 0, 6, null, null, c2395p, 14159232, 805306368, 7864112);
                    C2395p c2395p2 = c2395p;
                    c2395p2.m3857Z(1991806700);
                    Context context = this.f9583f;
                    boolean m3874i = c2395p2.m3874i(context) | c2395p2.m3870g(interfaceC2425y02);
                    Object m3847O2 = c2395p2.m3847O();
                    if (!m3874i && m3847O2 != c2413u0) {
                        interfaceC2425y0 = interfaceC2425y03;
                    } else {
                        interfaceC2425y0 = interfaceC2425y03;
                        m3847O2 = new C0827e5(context, interfaceC2425y02, interfaceC2425y0);
                        c2395p2.m3877j0(m3847O2);
                    }
                    c2395p2.m3888r(false);
                    AbstractC1991r4.m3167h((InterfaceC3277a) ((AbstractC3365h) m3847O2), null, false, null, null, null, AbstractC1352v1.f8051T, c2395p2, 805306368, 510);
                    String str2 = (String) interfaceC2425y0.getValue();
                    c2395p2.m3857Z(1991810232);
                    if (str2 != null) {
                        AbstractC1850a7.m3108b(str2, null, ((C2003t0) c2395p2.m3878k(c2394o22)).f11829w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(c2394o2)).f11258o, c2395p2, 0, 0, 65530);
                        c2395p2 = c2395p2;
                    }
                    c2395p2.m3888r(false);
                    c2395p2.m3888r(true);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p3 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    c2395p3.m3857Z(1018489173);
                    Context context2 = this.f9583f;
                    boolean m3874i2 = c2395p3.m3874i(context2);
                    Object m3847O3 = c2395p3.m3847O();
                    if (m3874i2 || m3847O3 == C2375k.f13421a) {
                        m3847O3 = new C1391w9(context2, this.f9584g, this.f9585h, 1);
                        c2395p3.m3877j0(m3847O3);
                    }
                    c2395p3.m3888r(false);
                    AbstractC1991r4.m3167h((InterfaceC3277a) m3847O3, null, false, null, null, null, AbstractC1352v1.f8092z, c2395p3, 805306368, 510);
                }
                return C1694m.f10482a;
        }
    }

    public C1469yp(InterfaceC2425y0 interfaceC2425y0, Context context, InterfaceC2425y0 interfaceC2425y02) {
        this.f9584g = interfaceC2425y0;
        this.f9583f = context;
        this.f9585h = interfaceC2425y02;
    }
}
