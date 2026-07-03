package p039e5;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.p007ui.graphics.AbstractC0168a;
import androidx.compose.p007ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p007ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p000a.AbstractC0000a;
import p001a0.C0062p0;
import p035e1.AbstractC0659i0;
import p035e1.C0661j0;
import p035e1.C0677s;
import p050g2.C1604o0;
import p053g5.C1687f;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2050z;
import p063i0.C1904g7;
import p067i4.AbstractC2072e;
import p068i5.C2079c;
import p080k2.AbstractC2305p;
import p080k2.C2300k;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p117p1.AbstractC2847c0;
import p117p1.C2859j;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3122c;
import p144t.AbstractC3136j;
import p144t.AbstractC3144n;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3130g;
import p144t.C3137j0;
import p144t.C3147o0;
import p144t.C3149p0;
import p144t.C3152r;
import p144t.C3154s;
import p144t.C3167y0;
import p145t0.AbstractC3178i;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3800h;
import p177x0.C3801i;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.zg */
/* loaded from: classes.dex */
public final class C1491zg implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ InterfaceC3277a f9882e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3093c f9883f;

    /* renamed from: g */
    public final /* synthetic */ Context f9884g;

    /* renamed from: h */
    public final /* synthetic */ C2349d1 f9885h;

    /* renamed from: i */
    public final /* synthetic */ List f9886i;

    /* renamed from: j */
    public final /* synthetic */ boolean f9887j;

    /* renamed from: k */
    public final /* synthetic */ C0976ir f9888k;

    /* renamed from: l */
    public final /* synthetic */ EnumC1436xn f9889l;

    /* renamed from: m */
    public final /* synthetic */ boolean f9890m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC3277a f9891n;

    /* renamed from: o */
    public final /* synthetic */ long f9892o;

    /* renamed from: p */
    public final /* synthetic */ boolean f9893p;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC3277a f9894q;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC3277a f9895r;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC3277a f9896s;

    public C1491zg(InterfaceC3277a interfaceC3277a, InterfaceC3093c interfaceC3093c, Context context, C2349d1 c2349d1, C2079c c2079c, boolean z7, C0976ir c0976ir, EnumC1436xn enumC1436xn, boolean z8, InterfaceC3277a interfaceC3277a2, long j6, boolean z9, InterfaceC3277a interfaceC3277a3, InterfaceC3277a interfaceC3277a4, InterfaceC3277a interfaceC3277a5) {
        this.f9882e = interfaceC3277a;
        this.f9883f = interfaceC3093c;
        this.f9884g = context;
        this.f9885h = c2349d1;
        this.f9886i = c2079c;
        this.f9887j = z7;
        this.f9888k = c0976ir;
        this.f9889l = enumC1436xn;
        this.f9890m = z8;
        this.f9891n = interfaceC3277a2;
        this.f9892o = j6;
        this.f9893p = z9;
        this.f9894q = interfaceC3277a3;
        this.f9895r = interfaceC3277a4;
        this.f9896s = interfaceC3277a5;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        char c7;
        String format;
        C3558z c3558z;
        C3504h c3504h;
        C3504h c3504h2;
        C3504h c3504h3;
        C3504h c3504h4;
        C3504h c3504h5;
        C2395p c2395p;
        long j6;
        C3558z c3558z2;
        C3149p0 c3149p0;
        C2395p c2395p2;
        C2395p c2395p3 = (C2395p) obj;
        int intValue = ((Number) obj2).intValue();
        Float valueOf = Float.valueOf(-1.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        Float valueOf3 = Float.valueOf(0.0f);
        int i7 = intValue & 3;
        C1694m c1694m = C1694m.f10482a;
        if (i7 == 2 && c2395p3.m3836D()) {
            c2395p3.m3852U();
            return c1694m;
        }
        View view = (View) c2395p3.m3878k(AndroidCompositionLocals_androidKt.f790f);
        c2395p3.m3857Z(-812961955);
        boolean m3874i = c2395p3.m3874i(view);
        Object m3847O = c2395p3.m3847O();
        C2413u0 c2413u0 = C2375k.f13421a;
        if (m3874i || m3847O == c2413u0) {
            m3847O = new C1274sg(view, 0);
            c2395p3.m3877j0(m3847O);
        }
        c2395p3.m3888r(false);
        AbstractC2418w.m3962d(c1694m, (InterfaceC3279c) m3847O, c2395p3);
        c2395p3.m3857Z(-812925163);
        Object m3847O2 = c2395p3.m3847O();
        C2349d1 c2349d1 = this.f9885h;
        if (m3847O2 == c2413u0) {
            m3847O2 = new C0062p0(c2349d1, null, 12);
            c2395p3.m3877j0(m3847O2);
        }
        c2395p3.m3888r(false);
        AbstractC2418w.m3965g(c1694m, c2395p3, (InterfaceC3281e) m3847O2);
        InterfaceC3277a interfaceC3277a = this.f9882e;
        AbstractC0000a.m0a(false, interfaceC3277a, c2395p3, 0, 1);
        final float mo4526y = this.f9883f.mo4526y(2);
        c2395p3.m3857Z(-812916087);
        Object m3847O3 = c2395p3.m3847O();
        if (m3847O3 == c2413u0) {
            m3847O3 = AbstractC1806n.m3067O(new C1687f(valueOf3, valueOf3), new C1687f(valueOf2, valueOf3), new C1687f(valueOf2, valueOf2), new C1687f(valueOf3, valueOf2), new C1687f(valueOf, valueOf2), new C1687f(valueOf, valueOf3), new C1687f(valueOf, valueOf), new C1687f(valueOf3, valueOf));
            c2395p3.m3877j0(m3847O3);
        }
        c2395p3.m3888r(false);
        final C1687f c1687f = (C1687f) ((List) m3847O3).get(c2349d1.m3741g());
        FillElement fillElement = AbstractC0155c.f660c;
        InterfaceC3810r m319b = AbstractC0145a.m319b(fillElement, AbstractC1092mk.f5945a, AbstractC0659i0.f2147a);
        c2395p3.m3857Z(-812900617);
        boolean m3870g = c2395p3.m3870g(interfaceC3277a);
        Object m3847O4 = c2395p3.m3847O();
        if (m3870g || m3847O4 == c2413u0) {
            m3847O4 = new C1336ug(interfaceC3277a);
            c2395p3.m3877j0(m3847O4);
        }
        c2395p3.m3888r(false);
        C2859j c2859j = AbstractC2847c0.f14941a;
        InterfaceC3810r mo5829e = m319b.mo5829e(new SuspendPointerInputElement(interfaceC3277a, null, (PointerInputEventHandler) m3847O4, 6));
        c2395p3.m3857Z(-812895532);
        Context context = this.f9884g;
        boolean m3874i2 = c2395p3.m3874i(context) | c2395p3.m3874i(view);
        Object m3847O5 = c2395p3.m3847O();
        if (m3874i2 || m3847O5 == c2413u0) {
            m3847O5 = new C1398wg(context, view);
            c2395p3.m3877j0(m3847O5);
        }
        c2395p3.m3888r(false);
        InterfaceC3810r m5821a = AbstractC3793a.m5821a(AbstractC3793a.m5821a(mo5829e.mo5829e(new SuspendPointerInputElement(view, null, (PointerInputEventHandler) m3847O5, 6)), new C3167y0(3, 1)), new C3167y0(3, 0));
        InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17964e, false);
        int hashCode = Long.hashCode(c2395p3.f13486T);
        InterfaceC2385m1 m3882m = c2395p3.m3882m();
        InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p3, m5821a);
        InterfaceC3510j.f16935d.getClass();
        C3558z c3558z3 = C3507i.f16928b;
        c2395p3.m3863c0();
        if (c2395p3.f13485S) {
            c2395p3.m3880l(c3558z3);
        } else {
            c2395p3.m3883m0();
        }
        C3504h c3504h6 = C3507i.f16931e;
        AbstractC2418w.m3954C(m4853e, c2395p3, c3504h6);
        C3504h c3504h7 = C3507i.f16930d;
        AbstractC2418w.m3954C(m3882m, c2395p3, c3504h7);
        C3504h c3504h8 = C3507i.f16932f;
        if (c2395p3.f13485S || !AbstractC3367j.m5096a(c2395p3.m3847O(), Integer.valueOf(hashCode))) {
            AbstractC2487d.m4050n(hashCode, c2395p3, hashCode, c3504h8);
        }
        C3504h c3504h9 = C3507i.f16929c;
        AbstractC2418w.m3954C(m5823c, c2395p3, c3504h9);
        c2395p3.m3857Z(659457568);
        boolean m3870g2 = c2395p3.m3870g(c1687f) | c2395p3.m3864d(mo4526y);
        Object m3847O6 = c2395p3.m3847O();
        if (m3870g2 || m3847O6 == c2413u0) {
            m3847O6 = new InterfaceC3279c() { // from class: e5.tg
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj3) {
                    C0661j0 c0661j0 = (C0661j0) obj3;
                    AbstractC3367j.m5100e(c0661j0, "$this$graphicsLayer");
                    C1687f c1687f2 = C1687f.this;
                    float floatValue = ((Number) c1687f2.f10471e).floatValue();
                    float f7 = mo4526y;
                    c0661j0.m1441p(floatValue * f7);
                    c0661j0.m1442q(((Number) c1687f2.f10472f).floatValue() * f7);
                    return C1694m.f10482a;
                }
            };
            c2395p3.m3877j0(m3847O6);
        }
        c2395p3.m3888r(false);
        float f7 = 12;
        InterfaceC3810r m338i = AbstractC0154b.m338i(AbstractC0168a.m384a(fillElement, (InterfaceC3279c) m3847O6), AbstractC1092mk.f5952h, f7);
        C3800h c3800h = C3795c.f17977r;
        C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, c3800h, c2395p3, 48);
        int hashCode2 = Long.hashCode(c2395p3.f13486T);
        InterfaceC2385m1 m3882m2 = c2395p3.m3882m();
        InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p3, m338i);
        c2395p3.m3863c0();
        if (c2395p3.f13485S) {
            c2395p3.m3880l(c3558z3);
        } else {
            c2395p3.m3883m0();
        }
        AbstractC2418w.m3954C(m4857a, c2395p3, c3504h6);
        AbstractC2418w.m3954C(m3882m2, c2395p3, c3504h7);
        if (c2395p3.f13485S || !AbstractC3367j.m5096a(c2395p3.m3847O(), Integer.valueOf(hashCode2))) {
            AbstractC2487d.m4050n(hashCode2, c2395p3, hashCode2, c3504h8);
        }
        AbstractC2418w.m3954C(m5823c2, c2395p3, c3504h9);
        C3807o c3807o = C3807o.f17991a;
        AbstractC3122c.m4828a(c2395p3, C3154s.m4859a(c3807o, 0.2f));
        c2395p3.m3857Z(-1108862354);
        List list = this.f9886i;
        if (!list.isEmpty()) {
            z7 = false;
            AbstractC1092mk.m1816l(list, c2395p3, 0);
            AbstractC3122c.m4828a(c2395p3, AbstractC0155c.m347f(c3807o, 16));
        } else {
            z7 = false;
        }
        c2395p3.m3888r(z7);
        float f8 = AbstractC1092mk.f5953i;
        AbstractC3122c.m4828a(c2395p3, AbstractC0155c.m347f(c3807o, f8));
        InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, 1.0f);
        C3152r m4857a2 = AbstractC3150q.m4857a(AbstractC3136j.m4843g(AbstractC1092mk.f5954j), c3800h, c2395p3, 54);
        int hashCode3 = Long.hashCode(c2395p3.f13486T);
        InterfaceC2385m1 m3882m3 = c2395p3.m3882m();
        InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p3, m346e);
        c2395p3.m3863c0();
        if (c2395p3.f13485S) {
            c2395p3.m3880l(c3558z3);
        } else {
            c2395p3.m3883m0();
        }
        AbstractC2418w.m3954C(m4857a2, c2395p3, c3504h6);
        AbstractC2418w.m3954C(m3882m3, c2395p3, c3504h7);
        if (c2395p3.f13485S || !AbstractC3367j.m5096a(c2395p3.m3847O(), Integer.valueOf(hashCode3))) {
            AbstractC2487d.m4050n(hashCode3, c2395p3, hashCode3, c3504h8);
        }
        AbstractC2418w.m3954C(m5823c3, c2395p3, c3504h9);
        AbstractC1092mk.m1781e(AbstractC0155c.m346e(c3807o, 1.0f), c2395p3, 6);
        InterfaceC3810r m346e2 = AbstractC0155c.m346e(c3807o, 1.0f);
        C0976ir c0976ir = this.f9888k;
        EnumC1436xn enumC1436xn = this.f9889l;
        AbstractC1092mk.m1806j(c0976ir, enumC1436xn, m346e2, c2395p3, 392);
        c2395p3.m3888r(true);
        AbstractC3122c.m4828a(c2395p3, AbstractC0155c.m347f(c3807o, f8));
        InterfaceC3810r m346e3 = AbstractC0155c.m346e(c3807o, 1.0f);
        C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15794f, C3795c.f17975p, c2395p3, 54);
        int hashCode4 = Long.hashCode(c2395p3.f13486T);
        InterfaceC2385m1 m3882m4 = c2395p3.m3882m();
        InterfaceC3810r m5823c4 = AbstractC3793a.m5823c(c2395p3, m346e3);
        c2395p3.m3863c0();
        if (c2395p3.f13485S) {
            c2395p3.m3880l(c3558z3);
        } else {
            c2395p3.m3883m0();
        }
        AbstractC2418w.m3954C(m4854a, c2395p3, c3504h6);
        AbstractC2418w.m3954C(m3882m4, c2395p3, c3504h7);
        if (c2395p3.f13485S || !AbstractC3367j.m5096a(c2395p3.m3847O(), Integer.valueOf(hashCode4))) {
            AbstractC2487d.m4050n(hashCode4, c2395p3, hashCode4, c3504h8);
        }
        AbstractC2418w.m3954C(m5823c4, c2395p3, c3504h9);
        C2394o2 c2394o2 = AbstractC1913h7.f11292a;
        C1604o0 c1604o0 = ((C1904g7) c2395p3.m3878k(c2394o2)).f11257n;
        long j7 = AbstractC1092mk.f5946b;
        AbstractC1850a7.m3108b("运行时间", null, j7, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p3, 390, 0, 65530);
        long j8 = c0976ir.f4981n / 1000;
        if (j8 < 0) {
            j8 = 0;
        }
        long j9 = 3600;
        long j10 = j8 / j9;
        long j11 = 60;
        long j12 = (j8 % j9) / j11;
        long j13 = j8 % j11;
        if (j10 > 0) {
            format = String.format(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j10), Long.valueOf(j12), Long.valueOf(j13)}, 3));
            c7 = 2;
        } else {
            c7 = 2;
            format = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j12), Long.valueOf(j13)}, 2));
        }
        C1604o0 c1604o02 = ((C1904g7) c2395p3.m3878k(c2394o2)).f11248e;
        C2300k c2300k = C2300k.f13236k;
        long j14 = AbstractC1092mk.f5947c;
        AbstractC1850a7.m3108b(format, null, j14, 0L, c2300k, AbstractC2305p.f13244c, 0L, null, 0L, 0, false, 0, 0, c1604o02, c2395p3, 196992, 0, 65434);
        int i8 = 1;
        c2395p3.m3888r(true);
        AbstractC3122c.m4828a(c2395p3, AbstractC0155c.m347f(c3807o, f7));
        InterfaceC3810r m346e4 = AbstractC0155c.m346e(c3807o, 1.0f);
        C3130g m4843g = AbstractC3136j.m4843g(f7);
        C3801i c3801i = C3795c.f17973n;
        C3147o0 m4854a2 = AbstractC3145n0.m4854a(m4843g, c3801i, c2395p3, 6);
        int hashCode5 = Long.hashCode(c2395p3.f13486T);
        InterfaceC2385m1 m3882m5 = c2395p3.m3882m();
        InterfaceC3810r m5823c5 = AbstractC3793a.m5823c(c2395p3, m346e4);
        c2395p3.m3863c0();
        if (c2395p3.f13485S) {
            c3558z = c3558z3;
            c2395p3.m3880l(c3558z);
        } else {
            c3558z = c3558z3;
            c2395p3.m3883m0();
        }
        AbstractC2418w.m3954C(m4854a2, c2395p3, c3504h6);
        AbstractC2418w.m3954C(m3882m5, c2395p3, c3504h7);
        if (c2395p3.f13485S || !AbstractC3367j.m5096a(c2395p3.m3847O(), Integer.valueOf(hashCode5))) {
            c3504h = c3504h8;
            AbstractC2487d.m4050n(hashCode5, c2395p3, hashCode5, c3504h);
        } else {
            c3504h = c3504h8;
        }
        AbstractC2418w.m3954C(m5823c5, c2395p3, c3504h9);
        c2395p3.m3857Z(-99628273);
        boolean z8 = c0976ir.f4983p;
        C3149p0 c3149p02 = C3149p0.f15825a;
        if (z8) {
            c3504h5 = c3504h6;
            c2395p = c2395p3;
            j6 = j14;
            c3149p0 = c3149p02;
            c3504h3 = c3504h9;
            c3558z2 = c3558z;
            c3504h2 = c3504h7;
            c3504h4 = c3504h;
            AbstractC1092mk.m1821m("下载流量", c0976ir.f4974g, AbstractC1092mk.f5948d, c3149p02.m4856a(c3807o, 1.0f, true), c2395p, 390);
        } else {
            c3504h2 = c3504h7;
            c3504h3 = c3504h9;
            c3504h4 = c3504h;
            c3504h5 = c3504h6;
            c2395p = c2395p3;
            j6 = j14;
            c3558z2 = c3558z;
            c3149p0 = c3149p02;
        }
        int i9 = 0;
        c2395p.m3888r(false);
        c2395p.m3857Z(-99617911);
        if (c0976ir.f4984q) {
            AbstractC1092mk.m1821m("上传流量", c0976ir.f4975h, AbstractC1092mk.f5949e, c3149p0.m4856a(c3807o, 1.0f, true), c2395p, 390);
        }
        c2395p.m3888r(false);
        C3149p0 c3149p03 = c3149p0;
        long j15 = j6;
        AbstractC1092mk.m1821m("总流量", this.f9892o, j15, c3149p0.m4856a(c3807o, 1.0f, true), c2395p, 390);
        c2395p.m3888r(true);
        c2395p.m3857Z(-1108780535);
        if (this.f9887j) {
            AbstractC3122c.m4828a(c2395p, AbstractC0155c.m347f(c3807o, 16));
            AbstractC1092mk.m1791g(c0976ir.f4980m, c0976ir.f4983p, c0976ir.f4984q, enumC1436xn, c2395p, 0);
        }
        c2395p.m3888r(false);
        AbstractC3122c.m4828a(c2395p, AbstractC0155c.m347f(c3807o, 20));
        if (this.f9890m) {
            c2395p.m3857Z(-12024246);
            InterfaceC3810r m347f = AbstractC0155c.m347f(AbstractC0155c.m346e(c3807o, 1.0f), 48);
            C3137j0 c3137j0 = AbstractC2050z.f12193a;
            c2395p2 = c2395p;
            AbstractC1991r4.m3166g(this.f9891n, m347f, false, null, AbstractC2050z.m3217d(0L, AbstractC0659i0.m1404d(4287317317L), 0L, 0L, c2395p2, 13), AbstractC2072e.m3325a(1, AbstractC0659i0.m1404d(4284100656L)), null, AbstractC1228r1.f7213I, c2395p2, 806879280, 428);
            c2395p2.m3888r(false);
        } else {
            c2395p.m3857Z(-11540336);
            InterfaceC3810r m346e5 = AbstractC0155c.m346e(c3807o, 1.0f);
            C3147o0 m4854a3 = AbstractC3145n0.m4854a(AbstractC3136j.m4843g(8), c3801i, c2395p, 6);
            int hashCode6 = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m6 = c2395p.m3882m();
            InterfaceC3810r m5823c6 = AbstractC3793a.m5823c(c2395p, m346e5);
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z2);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4854a3, c2395p, c3504h5);
            AbstractC2418w.m3954C(m3882m6, c2395p, c3504h2);
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode6))) {
                AbstractC2487d.m4050n(hashCode6, c2395p, hashCode6, c3504h4);
            }
            AbstractC2418w.m3954C(m5823c6, c2395p, c3504h3);
            boolean z9 = this.f9893p;
            boolean z10 = !z9;
            InterfaceC3810r m4856a = c3149p03.m4856a(c3807o, 1.0f, true);
            float f9 = 48;
            InterfaceC3810r m347f2 = AbstractC0155c.m347f(m4856a, f9);
            C3137j0 c3137j02 = AbstractC2050z.f12193a;
            long j16 = AbstractC1092mk.f5949e;
            c2395p2 = c2395p;
            float f10 = 1;
            AbstractC1991r4.m3166g(this.f9894q, m347f2, z10, null, AbstractC2050z.m3217d(0L, j16, 0L, 0L, c2395p2, 13), AbstractC2072e.m3325a(f10, C0677s.m1453b(0.45f, j16)), null, AbstractC3178i.m4873d(-2101081267, new C1429xg(i9, z9), c2395p2), c2395p2, 806879232, 424);
            InterfaceC3810r m347f3 = AbstractC0155c.m347f(c3149p03.m4856a(c3807o, 1.0f, true), f9);
            long j17 = AbstractC1092mk.f5948d;
            AbstractC1991r4.m3166g(this.f9895r, m347f3, z10, null, AbstractC2050z.m3217d(0L, j17, 0L, 0L, c2395p2, 13), AbstractC2072e.m3325a(f10, C0677s.m1453b(0.45f, j17)), null, AbstractC3178i.m4873d(855118148, new C1429xg(i8, z9), c2395p2), c2395p2, 806879232, 424);
            AbstractC1991r4.m3166g(this.f9896s, AbstractC0155c.m347f(c3149p03.m4856a(c3807o, 1.0f, true), f9), z10, null, AbstractC2050z.m3217d(0L, j15, 0L, 0L, c2395p2, 13), AbstractC2072e.m3325a(f10, j7), null, AbstractC3178i.m4873d(267726405, new C1429xg(2, z9), c2395p2), c2395p2, 806879232, 424);
            c2395p2.m3888r(true);
            c2395p2.m3888r(false);
        }
        AbstractC3122c.m4828a(c2395p2, C3154s.m4859a(c3807o, 0.2f));
        c2395p2.m3888r(true);
        c2395p2.m3888r(true);
        return c1694m;
    }
}
