package p063i0;

import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.selection.AbstractC0161b;
import p028d2.C0474g;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p107o.InterfaceC2768p0;
import p144t.AbstractC3136j;
import p144t.AbstractC3150q;
import p144t.C3152r;
import p144t.C3154s;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
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
/* renamed from: i0.c6 */
/* loaded from: classes.dex */
public final class C1867c6 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3810r f11017f;

    /* renamed from: g */
    public final /* synthetic */ boolean f11018g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2768p0 f11019h;

    /* renamed from: i */
    public final /* synthetic */ boolean f11020i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3277a f11021j;

    /* renamed from: k */
    public final /* synthetic */ C3173d f11022k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1867c6(InterfaceC3810r interfaceC3810r, boolean z7, InterfaceC2768p0 interfaceC2768p0, boolean z8, InterfaceC3277a interfaceC3277a, C3173d c3173d) {
        super(2);
        this.f11017f = interfaceC3810r;
        this.f11018g = z7;
        this.f11019h = interfaceC2768p0;
        this.f11020i = z8;
        this.f11021j = interfaceC3277a;
        this.f11022k = c3173d;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            InterfaceC3810r m346e = AbstractC0155c.m346e(AbstractC0161b.m371a(this.f11017f, this.f11018g, null, this.f11019h, this.f11020i, new C0474g(4), this.f11021j), 1.0f);
            C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15793e, C3795c.f17977r, c2395p, 54);
            int m3975r = AbstractC2418w.m3975r(c2395p);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m346e);
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
            this.f11022k.mo24c(C3154s.f15836a, c2395p, 6);
            c2395p.m3888r(true);
        }
        return C1694m.f10482a;
    }
}
