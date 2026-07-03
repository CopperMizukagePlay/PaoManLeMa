package p034e0;

import androidx.compose.foundation.layout.AbstractC0155c;
import com.paoman.lema.R;
import p028d2.AbstractC0479l;
import p028d2.C0480m;
import p053g5.C1694m;
import p063i0.AbstractC1930k;
import p071j0.AbstractC2152t;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p102n1.AbstractC2710c;
import p144t.AbstractC3144n;
import p145t0.C3173d;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.j0 */
/* loaded from: classes.dex */
public final class C0612j0 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f2013f = 1;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3810r f2014g;

    /* renamed from: h */
    public final /* synthetic */ C3173d f2015h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0612j0(InterfaceC3810r interfaceC3810r, C3173d c3173d) {
        super(2);
        this.f2014g = interfaceC3810r;
        this.f2015h = c3173d;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f2013f) {
            case 0:
                ((Number) obj2).intValue();
                int m3957F = AbstractC2418w.m3957F(49);
                AbstractC2710c.m4330b(this.f2014g, this.f2015h, (C2395p) obj, m3957F);
                return C1694m.f10482a;
            default:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    String m3498d = AbstractC2152t.m3498d(R.string.m3c_dialog, c2395p);
                    InterfaceC3810r m356o = AbstractC0155c.m356o(this.f2014g, AbstractC1930k.f11406a, AbstractC1930k.f11407b, 10);
                    boolean m3870g = c2395p.m3870g(m3498d);
                    Object m3847O = c2395p.m3847O();
                    if (m3870g || m3847O == C2375k.f13421a) {
                        m3847O = new C0480m(m3498d, 1);
                        c2395p.m3877j0(m3847O);
                    }
                    InterfaceC3810r mo5829e = m356o.mo5829e(AbstractC0479l.m1037a(C3807o.f17991a, false, (InterfaceC3279c) m3847O));
                    InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17964e, true);
                    int hashCode = Long.hashCode(c2395p.f13486T);
                    InterfaceC2385m1 m3882m = c2395p.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, mo5829e);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z = C3507i.f16928b;
                    c2395p.m3863c0();
                    if (c2395p.f13485S) {
                        c2395p.m3880l(c3558z);
                    } else {
                        c2395p.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4853e, c2395p, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
                    C3504h c3504h = C3507i.f16932f;
                    if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                        AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
                    }
                    AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
                    this.f2015h.mo22d(c2395p, 0);
                    c2395p.m3888r(true);
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0612j0(InterfaceC3810r interfaceC3810r, C3173d c3173d, int i7) {
        super(2);
        this.f2014g = interfaceC3810r;
        this.f2015h = c3173d;
    }
}
