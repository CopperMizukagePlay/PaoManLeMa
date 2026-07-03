package p039e5;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import p050g2.C1604o0;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p068i5.AbstractC2080d;
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3150q;
import p144t.C3152r;
import p144t.C3154s;
import p150t5.InterfaceC3282f;
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
/* renamed from: e5.b7 */
/* loaded from: classes.dex */
public final class C0734b7 implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ String f2614e;

    /* renamed from: f */
    public final /* synthetic */ String f2615f;

    /* renamed from: g */
    public final /* synthetic */ long f2616g;

    public C0734b7(String str, String str2, long j6) {
        this.f2614e = str;
        this.f2615f = str2;
        this.f2616g = j6;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3367j.m5100e((C3154s) obj, "$this$Card");
        if ((intValue & 17) == 16 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            float f7 = 2;
            InterfaceC3810r m338i = AbstractC0154b.m338i(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), f7, 5);
            C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.m4843g(f7), C3795c.f17977r, c2395p, 54);
            int m3975r = AbstractC2418w.m3975r(c2395p);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m338i);
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
            AbstractC1850a7.m3108b(this.f2614e, null, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, C1604o0.m2592a(((C1904g7) c2395p.m3878k(c2394o2)).f11258o, 0L, AbstractC2080d.m3405r(10), null, null, 0L, 0L, null, 16777213), c2395p, 0, 3120, 55290);
            AbstractC1850a7.m3108b(this.f2615f, null, this.f2616g, 0L, C2300k.f13235j, null, 0L, null, 0L, 2, false, 1, 0, C1604o0.m2592a(((C1904g7) c2395p.m3878k(c2394o2)).f11258o, 0L, AbstractC2080d.m3405r(11), null, null, 0L, 0L, null, 16777213), c2395p, 196608, 3120, 55258);
            c2395p.m3888r(true);
        }
        return C1694m.f10482a;
    }
}
