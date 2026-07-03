package p001a0;

import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.p007ui.draw.AbstractC0166a;
import androidx.compose.p007ui.layout.AbstractC0172a;
import androidx.compose.p007ui.viewinterop.AbstractC0174a;
import androidx.lifecycle.InterfaceC0213t;
import p034e0.C0622o0;
import p053g5.C1694m;
import p053g5.InterfaceC1684c;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC2021v2;
import p066i3.AbstractC2067b;
import p071j0.AbstractC2152t;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p107o.C2769p1;
import p122q.C2923l1;
import p122q.C2929n1;
import p144t.AbstractC3122c;
import p144t.AbstractC3136j;
import p144t.AbstractC3144n;
import p144t.AbstractC3150q;
import p144t.C3152r;
import p144t.C3154s;
import p144t.InterfaceC3135i0;
import p145t0.C3173d;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p158u5.AbstractC3373p;
import p158u5.C3376s;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p162v1.InterfaceC3524n1;
import p170w1.AbstractC3674f1;
import p170w1.C3725s0;
import p170w1.C3728t;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.l0 */
/* loaded from: classes.dex */
public final class C0046l0 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f237f;

    /* renamed from: g */
    public final /* synthetic */ Object f238g;

    /* renamed from: h */
    public final /* synthetic */ Object f239h;

    /* renamed from: i */
    public final /* synthetic */ Object f240i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0046l0(Object obj, Object obj2, InterfaceC1684c interfaceC1684c, int i7, int i8) {
        super(2);
        this.f237f = i8;
        this.f238g = obj;
        this.f240i = obj2;
        this.f239h = interfaceC1684c;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        int i7 = this.f237f;
        C1694m c1694m = C1694m.f10482a;
        Object obj3 = this.f239h;
        Object obj4 = this.f240i;
        Object obj5 = this.f238g;
        switch (i7) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0027g1.m58d((InterfaceC3810r) obj5, (C0622o0) obj4, (C3173d) obj3, (C2395p) obj, AbstractC2418w.m3957F(385));
                return c1694m;
            case 1:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    InterfaceC3810r m3275C = AbstractC2067b.m3275C(AbstractC0154b.m341l(AbstractC0154b.m339j((InterfaceC3810r) obj5, 0.0f, AbstractC2021v2.f11951d, 1)), (C2769p1) obj4);
                    C3173d c3173d = (C3173d) obj3;
                    C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p, 0);
                    int m3975r = AbstractC2418w.m3975r(c2395p);
                    InterfaceC2385m1 m3882m = c2395p.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m3275C);
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
                    c3173d.mo24c(C3154s.f15836a, c2395p, 6);
                    c2395p.m3888r(true);
                }
                return c1694m;
            case 2:
                ((Number) obj2).intValue();
                AbstractC2152t.m3495a((InterfaceC0213t) obj5, (InterfaceC3279c) obj4, (InterfaceC3277a) obj3, (C2395p) obj, AbstractC2418w.m3957F(1));
                return c1694m;
            case 3:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    InterfaceC3810r m393c = AbstractC0172a.m393c(C3807o.f17991a, "Container");
                    float f7 = AbstractC1847a4.f10920a;
                    InterfaceC3810r m380c = AbstractC0166a.m380c(m393c, new C0078t0(22, new AbstractC3373p(0, InterfaceC2425y0.class, (InterfaceC2425y0) obj5, "value", "getValue()Ljava/lang/Object;"), (InterfaceC3135i0) obj4));
                    C3173d c3173d2 = (C3173d) obj3;
                    InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17964e, true);
                    int m3975r2 = AbstractC2418w.m3975r(c2395p2);
                    InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
                    InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, m380c);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z2 = C3507i.f16928b;
                    c2395p2.m3863c0();
                    if (c2395p2.f13485S) {
                        c2395p2.m3880l(c3558z2);
                    } else {
                        c2395p2.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4853e, c2395p2, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m2, c2395p2, C3507i.f16930d);
                    C3504h c3504h2 = C3507i.f16932f;
                    if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(m3975r2))) {
                        AbstractC2487d.m4050n(m3975r2, c2395p2, m3975r2, c3504h2);
                    }
                    AbstractC2418w.m3954C(m5823c2, c2395p2, C3507i.f16929c);
                    c3173d2.mo22d(c2395p2, 0);
                    c2395p2.m3888r(true);
                }
                return c1694m;
            case 4:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                C3376s c3376s = (C3376s) obj5;
                C2929n1 c2929n1 = (C2929n1) obj4;
                long m4594g = c2929n1.m4594g(c2929n1.m4590c(floatValue - c3376s.f16448e));
                C2929n1 c2929n12 = ((C2923l1) obj3).f15214a;
                c3376s.f16448e += c2929n1.m4590c(c2929n1.m4593f(C2929n1.m4588a(c2929n12, c2929n12.f15236h, m4594g, 1)));
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                ((Number) obj2).intValue();
                AbstractC0174a.m404b((InterfaceC3279c) obj4, (InterfaceC3810r) obj5, (InterfaceC3279c) obj3, (C2395p) obj, AbstractC2418w.m3957F(49));
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                C2395p c2395p3 = (C2395p) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (c2395p3.m3849R(intValue & 1, z7)) {
                    AbstractC3674f1.m5667a((C3728t) obj5, (C3725s0) obj4, (InterfaceC3281e) obj3, c2395p3, 0);
                } else {
                    c2395p3.m3852U();
                }
                return c1694m;
            default:
                ((Number) obj2).intValue();
                AbstractC3674f1.m5667a((InterfaceC3524n1) obj5, (C3725s0) obj4, (InterfaceC3281e) obj3, (C2395p) obj, AbstractC2418w.m3957F(1));
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0046l0(Object obj, Object obj2, Object obj3, int i7) {
        super(2);
        this.f237f = i7;
        this.f238g = obj;
        this.f240i = obj2;
        this.f239h = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0046l0(InterfaceC3279c interfaceC3279c, InterfaceC3810r interfaceC3810r, InterfaceC3279c interfaceC3279c2, int i7) {
        super(2);
        this.f237f = 5;
        this.f240i = interfaceC3279c;
        this.f238g = interfaceC3810r;
        this.f239h = interfaceC3279c2;
    }
}
