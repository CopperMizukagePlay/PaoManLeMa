package p034e0;

import androidx.compose.foundation.layout.AbstractC0155c;
import p000a.AbstractC0000a;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p140s2.C3098h;
import p144t.AbstractC3122c;
import p144t.AbstractC3145n0;
import p144t.C3120b;
import p144t.C3147o0;
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
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.c */
/* loaded from: classes.dex */
public final class C0597c extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ long f1960f;

    /* renamed from: g */
    public final /* synthetic */ boolean f1961g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3810r f1962h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC0617m f1963i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0597c(long j6, boolean z7, InterfaceC3810r interfaceC3810r, InterfaceC0617m interfaceC0617m) {
        super(2);
        this.f1960f = j6;
        this.f1961g = z7;
        this.f1962h = interfaceC3810r;
        this.f1963i = interfaceC0617m;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C3120b c3120b;
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            long j6 = this.f1960f;
            C2413u0 c2413u0 = C2375k.f13421a;
            InterfaceC0617m interfaceC0617m = this.f1963i;
            boolean z7 = this.f1961g;
            if (j6 != 9205357640488583168L) {
                c2395p.m3857Z(-837727128);
                if (z7) {
                    c3120b = AbstractC3122c.f15757b;
                } else {
                    c3120b = AbstractC3122c.f15756a;
                }
                InterfaceC3810r m352k = AbstractC0155c.m352k(this.f1962h, C3098h.m4780b(j6), C3098h.m4779a(j6), 0.0f, 0.0f, 12);
                C3147o0 m4854a = AbstractC3145n0.m4854a(c3120b, C3795c.f17973n, c2395p, 0);
                int hashCode = Long.hashCode(c2395p.f13486T);
                InterfaceC2385m1 m3882m = c2395p.m3882m();
                InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m352k);
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
                if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                    AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
                }
                AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
                boolean m3874i = c2395p.m3874i(interfaceC0617m);
                Object m3847O = c2395p.m3847O();
                if (m3874i || m3847O == c2413u0) {
                    m3847O = new C0595b(interfaceC0617m, 0);
                    c2395p.m3877j0(m3847O);
                }
                AbstractC0000a.m5f(C3807o.f17991a, (InterfaceC3277a) m3847O, z7, c2395p, 6);
                c2395p.m3888r(true);
                c2395p.m3888r(false);
            } else {
                c2395p.m3857Z(-836867312);
                boolean m3874i2 = c2395p.m3874i(interfaceC0617m);
                Object m3847O2 = c2395p.m3847O();
                if (m3874i2 || m3847O2 == c2413u0) {
                    m3847O2 = new C0595b(interfaceC0617m, 1);
                    c2395p.m3877j0(m3847O2);
                }
                AbstractC0000a.m5f(this.f1962h, (InterfaceC3277a) m3847O2, z7, c2395p, 0);
                c2395p.m3888r(false);
            }
        }
        return C1694m.f10482a;
    }
}
