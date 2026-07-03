package p071j0;

import androidx.compose.foundation.layout.AbstractC0155c;
import p001a0.AbstractC0025g;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p140s2.C3098h;
import p144t.AbstractC3144n;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3281e;
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
/* renamed from: j0.n0 */
/* loaded from: classes.dex */
public final class C2141n0 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f12469f;

    /* renamed from: g */
    public final /* synthetic */ long f12470g;

    /* renamed from: h */
    public final /* synthetic */ Object f12471h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2141n0(long j6, Object obj, int i7) {
        super(2);
        this.f12469f = i7;
        this.f12470g = j6;
        this.f12471h = obj;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f12469f) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC2151s0.m3493c(this.f12470g, (InterfaceC3281e) this.f12471h, c2395p, 0);
                }
                return C1694m.f10482a;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC2151s0.m3493c(this.f12470g, (InterfaceC3281e) this.f12471h, c2395p2, 0);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p3 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    long j6 = this.f12470g;
                    if (j6 != 9205357640488583168L) {
                        c2395p3.m3857Z(1828881000);
                        InterfaceC3810r m352k = AbstractC0155c.m352k((InterfaceC3810r) this.f12471h, C3098h.m4780b(j6), C3098h.m4779a(j6), 0.0f, 0.0f, 12);
                        InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17965f, false);
                        int hashCode = Long.hashCode(c2395p3.f13486T);
                        InterfaceC2385m1 m3882m = c2395p3.m3882m();
                        InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p3, m352k);
                        InterfaceC3510j.f16935d.getClass();
                        C3558z c3558z = C3507i.f16928b;
                        c2395p3.m3863c0();
                        if (c2395p3.f13485S) {
                            c2395p3.m3880l(c3558z);
                        } else {
                            c2395p3.m3883m0();
                        }
                        AbstractC2418w.m3954C(m4853e, c2395p3, C3507i.f16931e);
                        AbstractC2418w.m3954C(m3882m, c2395p3, C3507i.f16930d);
                        C3504h c3504h = C3507i.f16932f;
                        if (c2395p3.f13485S || !AbstractC3367j.m5096a(c2395p3.m3847O(), Integer.valueOf(hashCode))) {
                            AbstractC2487d.m4050n(hashCode, c2395p3, hashCode, c3504h);
                        }
                        AbstractC2418w.m3954C(m5823c, c2395p3, C3507i.f16929c);
                        AbstractC0025g.m54b(null, c2395p3, 0, 1);
                        c2395p3.m3888r(true);
                        c2395p3.m3888r(false);
                    } else {
                        c2395p3.m3857Z(1829217412);
                        AbstractC0025g.m54b((InterfaceC3810r) this.f12471h, c2395p3, 0, 0);
                        c2395p3.m3888r(false);
                    }
                }
                return C1694m.f10482a;
        }
    }
}
