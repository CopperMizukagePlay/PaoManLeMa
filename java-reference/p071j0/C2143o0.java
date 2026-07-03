package p071j0;

import androidx.compose.p007ui.graphics.AbstractC0168a;
import p050g2.C1604o0;
import p053g5.C1694m;
import p063i0.C1846a3;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2390n2;
import p092m.AbstractC2487d;
import p100n.C2637d1;
import p144t.AbstractC3144n;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.o0 */
/* loaded from: classes.dex */
public final class C2143o0 extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2390n2 f12476f;

    /* renamed from: g */
    public final /* synthetic */ long f12477g;

    /* renamed from: h */
    public final /* synthetic */ C1604o0 f12478h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3281e f12479i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2143o0(C2637d1 c2637d1, long j6, C1604o0 c1604o0, InterfaceC3281e interfaceC3281e) {
        super(3);
        this.f12476f = c2637d1;
        this.f12477g = j6;
        this.f12478h = c1604o0;
        this.f12479i = interfaceC3281e;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        int i7;
        InterfaceC3810r interfaceC3810r = (InterfaceC3810r) obj;
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (c2395p.m3870g(interfaceC3810r)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            intValue |= i7;
        }
        if ((intValue & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            InterfaceC2390n2 interfaceC2390n2 = this.f12476f;
            boolean m3870g = c2395p.m3870g(interfaceC2390n2);
            Object m3847O = c2395p.m3847O();
            if (m3870g || m3847O == C2375k.f13421a) {
                m3847O = new C1846a3(interfaceC2390n2, 2);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3810r m384a = AbstractC0168a.m384a(interfaceC3810r, (InterfaceC3279c) m3847O);
            InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17964e, false);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m384a);
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
            AbstractC2151s0.m3492b(this.f12477g, this.f12478h, this.f12479i, c2395p, 0);
            c2395p.m3888r(true);
        }
        return C1694m.f10482a;
    }
}
