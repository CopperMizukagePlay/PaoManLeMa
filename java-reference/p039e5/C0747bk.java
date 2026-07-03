package p039e5;

import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.layout.AbstractC0155c;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC2019v0;
import p063i0.C2003t0;
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p144t.AbstractC3122c;
import p144t.AbstractC3136j;
import p144t.AbstractC3144n;
import p144t.AbstractC3150q;
import p144t.C3149p0;
import p144t.C3152r;
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
import p190z.AbstractC3861e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.bk */
/* loaded from: classes.dex */
public final class C0747bk implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ String f2835e;

    /* renamed from: f */
    public final /* synthetic */ int f2836f;

    /* renamed from: g */
    public final /* synthetic */ boolean f2837g;

    public C0747bk(String str, int i7, boolean z7) {
        this.f2835e = str;
        this.f2836f = i7;
        this.f2837g = z7;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        C2300k c2300k;
        long j6;
        boolean z7;
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3367j.m5100e((C3149p0) obj, "$this$TextButton");
        if ((intValue & 17) == 16 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17977r, c2395p, 48);
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
            String str = this.f2835e + " " + this.f2836f;
            boolean z8 = this.f2837g;
            if (z8) {
                c2300k = C2300k.f13236k;
            } else {
                c2300k = C2300k.f13234i;
            }
            C2300k c2300k2 = c2300k;
            if (z8) {
                c2395p.m3857Z(978840979);
                j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11807a;
            } else {
                c2395p.m3857Z(978842229);
                j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11823q;
            }
            c2395p.m3888r(false);
            AbstractC1850a7.m3108b(str, null, j6, 0L, c2300k2, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p, 0, 0, 131034);
            c2395p.m3857Z(978843706);
            if (z8) {
                AbstractC3122c.m4828a(c2395p, AbstractC0155c.m347f(c3807o, 6));
                z7 = false;
                AbstractC3144n.m4849a(AbstractC0145a.m319b(AbstractC0155c.m346e(AbstractC0155c.m347f(c3807o, 3), 0.72f), ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11807a, AbstractC3861e.m5873a(2)), c2395p, 0);
            } else {
                z7 = false;
            }
            c2395p.m3888r(z7);
            c2395p.m3888r(true);
        }
        return C1694m.f10482a;
    }
}
