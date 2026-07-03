package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import p035e1.C0677s;
import p053g5.C1694m;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.C2003t0;
import p079k1.C2266e;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p092m.C2493i;
import p102n1.AbstractC2710c;
import p144t.AbstractC3136j;
import p144t.AbstractC3150q;
import p144t.C3152r;
import p150t5.InterfaceC3279c;
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
/* renamed from: e5.pq */
/* loaded from: classes.dex */
public final class C1191pq implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ boolean f6944e;

    /* renamed from: f */
    public final /* synthetic */ boolean f6945f;

    /* renamed from: g */
    public final /* synthetic */ boolean f6946g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3279c f6947h;

    public C1191pq(boolean z7, boolean z8, boolean z9, InterfaceC3279c interfaceC3279c) {
        this.f6944e = z7;
        this.f6945f = z8;
        this.f6946g = z9;
        this.f6947h = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        boolean z7;
        C2395p c2395p = (C2395p) obj2;
        ((Number) obj3).intValue();
        AbstractC3367j.m5100e((C2493i) obj, "$this$AnimatedVisibility");
        InterfaceC3810r m346e = AbstractC0155c.m346e(C3807o.f17991a, 1.0f);
        C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.m4843g(8), C3795c.f17976q, c2395p, 6);
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
        AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.5f, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11784B), c2395p, 0, 3);
        C2266e m4349w = AbstractC2710c.m4349w();
        if (this.f6945f && !this.f6946g) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0945hr.m1558B("断线自动重连", "发现新接口时自动接入，仅在接口配置匹配关闭时生效", m4349w, this.f6944e, z7, this.f6947h, c2395p, 54);
        c2395p.m3888r(true);
        return C1694m.f10482a;
    }
}
