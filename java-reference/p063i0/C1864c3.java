package p063i0;

import androidx.compose.p007ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import p028d2.AbstractC0479l;
import p035e1.C0677s;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2390n2;
import p092m.AbstractC2484b0;
import p092m.AbstractC2487d;
import p100n.AbstractC2638e;
import p144t.AbstractC3144n;
import p145t0.C3173d;
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
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.c3 */
/* loaded from: classes.dex */
public final class C1864c3 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ C2045y2 f11002f;

    /* renamed from: g */
    public final /* synthetic */ boolean f11003g;

    /* renamed from: h */
    public final /* synthetic */ boolean f11004h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3281e f11005i;

    /* renamed from: j */
    public final /* synthetic */ boolean f11006j;

    /* renamed from: k */
    public final /* synthetic */ C3173d f11007k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1864c3(C2045y2 c2045y2, boolean z7, boolean z8, InterfaceC3281e interfaceC3281e, boolean z9, C3173d c3173d) {
        super(2);
        this.f11002f = c2045y2;
        this.f11003g = z7;
        this.f11004h = z8;
        this.f11005i = interfaceC3281e;
        this.f11006j = z9;
        this.f11007k = c3173d;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        long j6;
        InterfaceC3810r interfaceC3810r;
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            boolean z7 = this.f11004h;
            boolean z8 = this.f11003g;
            C2045y2 c2045y2 = this.f11002f;
            if (!z7) {
                j6 = c2045y2.f12174f;
            } else if (z8) {
                j6 = c2045y2.f12169a;
            } else {
                j6 = c2045y2.f12172d;
            }
            InterfaceC2390n2 m4035a = AbstractC2484b0.m4035a(j6, AbstractC2638e.m4232r(100, 6, null), c2395p, 48);
            if (this.f11005i != null && (this.f11006j || z8)) {
                C1870d0 c1870d0 = C1870d0.f11043i;
                AtomicInteger atomicInteger = AbstractC0479l.f1687a;
                interfaceC3810r = new ClearAndSetSemanticsElement(c1870d0);
            } else {
                interfaceC3810r = C3807o.f17991a;
            }
            InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17964e, false);
            int m3975r = AbstractC2418w.m3975r(c2395p);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, interfaceC3810r);
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
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
                AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            AbstractC2418w.m3959a(AbstractC1862c1.f10996a.mo3716a(new C0677s(((C0677s) m4035a.getValue()).f2211a)), this.f11007k, c2395p, 8);
            c2395p.m3888r(true);
        }
        return C1694m.f10482a;
    }
}
