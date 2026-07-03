package p039e5;

import android.content.Context;
import p017c.C0328m;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p063i0.AbstractC1991r4;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.C3147o0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.lj */
/* loaded from: classes.dex */
public final class C1060lj implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ boolean f5669e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC0516a0 f5670f;

    /* renamed from: g */
    public final /* synthetic */ Context f5671g;

    /* renamed from: h */
    public final /* synthetic */ C1227r0 f5672h;

    /* renamed from: i */
    public final /* synthetic */ C0328m f5673i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2425y0 f5674j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f5675k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2425y0 f5676l;

    /* renamed from: m */
    public final /* synthetic */ C2349d1 f5677m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC2425y0 f5678n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2425y0 f5679o;

    public C1060lj(boolean z7, InterfaceC0516a0 interfaceC0516a0, Context context, C1227r0 c1227r0, C0328m c0328m, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05) {
        this.f5669e = z7;
        this.f5670f = interfaceC0516a0;
        this.f5671g = context;
        this.f5672h = c1227r0;
        this.f5673i = c0328m;
        this.f5674j = interfaceC2425y0;
        this.f5675k = interfaceC2425y02;
        this.f5676l = interfaceC2425y03;
        this.f5677m = c2349d1;
        this.f5678n = interfaceC2425y04;
        this.f5679o = interfaceC2425y05;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        Context context;
        C1227r0 c1227r0;
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.m4843g(8), C3795c.f17973n, c2395p, 6);
            int m3975r = AbstractC2418w.m3975r(c2395p);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, C3807o.f17991a);
            InterfaceC3510j.f16935d.getClass();
            InterfaceC3277a interfaceC3277a = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(interfaceC3277a);
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
            c2395p.m3857Z(745048367);
            Object obj3 = C2375k.f13421a;
            boolean z7 = this.f5669e;
            Context context2 = this.f5671g;
            C1227r0 c1227r02 = this.f5672h;
            InterfaceC2425y0 interfaceC2425y0 = this.f5675k;
            if (z7 && !((Boolean) interfaceC2425y0.getValue()).booleanValue()) {
                c2395p.m3857Z(745050518);
                InterfaceC0516a0 interfaceC0516a0 = this.f5670f;
                boolean m3874i = c2395p.m3874i(interfaceC0516a0) | c2395p.m3874i(context2);
                Object m3847O = c2395p.m3847O();
                if (!m3874i && m3847O != obj3) {
                    context = context2;
                } else {
                    Object c0998jj = new C0998jj(interfaceC0516a0, interfaceC2425y0, this.f5676l, this.f5677m, context2, this.f5678n, 1);
                    context = context2;
                    c2395p.m3877j0(c0998jj);
                    m3847O = c0998jj;
                }
                c2395p.m3888r(false);
                c1227r0 = c1227r02;
                AbstractC1991r4.m3167h((InterfaceC3277a) m3847O, null, false, null, null, null, AbstractC1228r1.f7267s, c2395p, 805306368, 510);
                c2395p.m3857Z(745057053);
                boolean m3870g = c2395p.m3870g(c1227r0);
                Object obj4 = this.f5673i;
                boolean m3874i2 = m3870g | c2395p.m3874i(obj4);
                Object m3847O2 = c2395p.m3847O();
                if (m3874i2 || m3847O2 == obj3) {
                    m3847O2 = new C1384w2(c1227r0, obj4, this.f5679o, 15);
                    c2395p.m3877j0(m3847O2);
                }
                c2395p.m3888r(false);
                AbstractC1991r4.m3167h((InterfaceC3277a) m3847O2, null, false, null, null, null, AbstractC1228r1.f7269t, c2395p, 805306368, 510);
            } else {
                context = context2;
                c1227r0 = c1227r02;
            }
            c2395p.m3888r(false);
            c2395p.m3857Z(745071806);
            boolean m3874i3 = c2395p.m3874i(context) | c2395p.m3870g(c1227r0);
            Object m3847O3 = c2395p.m3847O();
            if (m3874i3 || m3847O3 == obj3) {
                m3847O3 = new C0968ij(context, c1227r0);
                c2395p.m3877j0(m3847O3);
            }
            c2395p.m3888r(false);
            AbstractC1991r4.m3167h((InterfaceC3277a) m3847O3, null, !((Boolean) interfaceC2425y0.getValue()).booleanValue(), null, null, null, AbstractC1228r1.f7271u, c2395p, 805306368, 506);
            c2395p.m3857Z(745080626);
            boolean m3874i4 = c2395p.m3874i(context) | c2395p.m3870g(c1227r0);
            InterfaceC2425y0 interfaceC2425y02 = this.f5674j;
            boolean m3870g2 = m3874i4 | c2395p.m3870g(interfaceC2425y02);
            Object m3847O4 = c2395p.m3847O();
            if (m3870g2 || m3847O4 == obj3) {
                m3847O4 = new C1384w2(context, c1227r0, interfaceC2425y02, 16);
                c2395p.m3877j0(m3847O4);
            }
            c2395p.m3888r(false);
            AbstractC1991r4.m3167h((InterfaceC3277a) m3847O4, null, !((Boolean) interfaceC2425y0.getValue()).booleanValue(), null, null, null, AbstractC1228r1.f7273v, c2395p, 805306368, 506);
            c2395p.m3857Z(745095646);
            boolean m3870g3 = c2395p.m3870g(interfaceC2425y02);
            Object m3847O5 = c2395p.m3847O();
            if (m3870g3 || m3847O5 == obj3) {
                m3847O5 = new C0900ge(interfaceC2425y02, 23);
                c2395p.m3877j0(m3847O5);
            }
            c2395p.m3888r(false);
            AbstractC1991r4.m3167h((InterfaceC3277a) m3847O5, null, !((Boolean) interfaceC2425y0.getValue()).booleanValue(), null, null, null, AbstractC1228r1.f7275w, c2395p, 805306368, 506);
            c2395p.m3888r(true);
        }
        return C1694m.f10482a;
    }
}
