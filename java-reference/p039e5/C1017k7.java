package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import p053g5.C1694m;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1913h7;
import p063i0.C1904g7;
import p085l0.AbstractC2418w;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.C3147o0;
import p144t.C3149p0;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
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
/* renamed from: e5.k7 */
/* loaded from: classes.dex */
public final class C1017k7 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ EnumC1163ot f5240e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3279c f5241f;

    /* renamed from: g */
    public final /* synthetic */ boolean f5242g;

    /* renamed from: h */
    public final /* synthetic */ String f5243h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f5244i;

    /* renamed from: j */
    public final /* synthetic */ String f5245j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3279c f5246k;

    public C1017k7(EnumC1163ot enumC1163ot, InterfaceC3279c interfaceC3279c, boolean z7, String str, InterfaceC3279c interfaceC3279c2, String str2, InterfaceC3279c interfaceC3279c3) {
        this.f5240e = enumC1163ot;
        this.f5241f = interfaceC3279c;
        this.f5242g = z7;
        this.f5243h = str;
        this.f5244i = interfaceC3279c2;
        this.f5245j = str2;
        this.f5246k = interfaceC3279c3;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C3807o c3807o = C3807o.f17991a;
            InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, 1.0f);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.m4843g(6), C3795c.f17973n, c2395p, 54);
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
            AbstractC2418w.m3954C(m4854a, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
                AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            C3149p0 c3149p0 = C3149p0.f15825a;
            InterfaceC3810r m4856a = c3149p0.m4856a(c3807o, 1.1f, true);
            EnumC1163ot enumC1163ot = this.f5240e;
            InterfaceC3279c interfaceC3279c = this.f5241f;
            boolean z7 = this.f5242g;
            AbstractC1172p7.m2039P(enumC1163ot, interfaceC3279c, m4856a, z7, c2395p, 0);
            InterfaceC3810r m4856a2 = c3149p0.m4856a(c3807o, 0.9f, true);
            C2394o2 c2394o2 = AbstractC1913h7.f11292a;
            AbstractC1847a4.m3102a(this.f5243h, this.f5244i, m4856a2, z7, false, ((C1904g7) c2395p.m3878k(c2394o2)).f11255l, AbstractC0792d1.f3265g0, null, null, null, null, null, null, null, true, 0, 0, null, null, c2395p, 1572864, 12582912, 8257424);
            AbstractC1847a4.m3102a(this.f5245j, this.f5246k, c3149p0.m4856a(c3807o, 0.9f, true), z7, false, ((C1904g7) c2395p.m3878k(c2394o2)).f11255l, AbstractC0792d1.f3267h0, null, null, null, null, null, null, null, true, 0, 0, null, null, c2395p, 1572864, 12582912, 8257424);
            c2395p.m3888r(true);
        }
        return C1694m.f10482a;
    }
}
