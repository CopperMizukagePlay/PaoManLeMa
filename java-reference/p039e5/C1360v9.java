package p039e5;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p032d6.InterfaceC0516a0;
import p053g5.C1689h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.C1815w;
import p063i0.AbstractC1991r4;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p144t.AbstractC3122c;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.C3147o0;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3472s;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.v9 */
/* loaded from: classes.dex */
public final class C1360v9 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ List f8127e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f8128f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f8129g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f8130h;

    /* renamed from: i */
    public final /* synthetic */ C3472s f8131i;

    /* renamed from: j */
    public final /* synthetic */ C3472s f8132j;

    /* renamed from: k */
    public final /* synthetic */ C2349d1 f8133k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC3277a f8134l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC2425y0 f8135m;

    /* renamed from: n */
    public final /* synthetic */ C0959i9 f8136n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2425y0 f8137o;

    /* renamed from: p */
    public final /* synthetic */ C1196q0 f8138p;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC2425y0 f8139q;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC0516a0 f8140r;

    /* renamed from: s */
    public final /* synthetic */ Context f8141s;

    /* renamed from: t */
    public final /* synthetic */ C3472s f8142t;

    /* renamed from: u */
    public final /* synthetic */ C3472s f8143u;

    public C1360v9(List list, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, C3472s c3472s, C3472s c3472s2, C2349d1 c2349d1, InterfaceC3277a interfaceC3277a, InterfaceC2425y0 interfaceC2425y04, C0959i9 c0959i9, InterfaceC2425y0 interfaceC2425y05, C1196q0 c1196q0, InterfaceC2425y0 interfaceC2425y06, InterfaceC0516a0 interfaceC0516a0, Context context, C3472s c3472s3, C3472s c3472s4) {
        this.f8127e = list;
        this.f8128f = interfaceC2425y0;
        this.f8129g = interfaceC2425y02;
        this.f8130h = interfaceC2425y03;
        this.f8131i = c3472s;
        this.f8132j = c3472s2;
        this.f8133k = c2349d1;
        this.f8134l = interfaceC3277a;
        this.f8135m = interfaceC2425y04;
        this.f8136n = c0959i9;
        this.f8137o = interfaceC2425y05;
        this.f8138p = c1196q0;
        this.f8139q = interfaceC2425y06;
        this.f8140r = interfaceC0516a0;
        this.f8141s = context;
        this.f8142t = c3472s3;
        this.f8143u = c3472s4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r38.f8127e.isEmpty() == false) goto L26;
     */
    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        C2349d1 c2349d1;
        float f7;
        C2413u0 c2413u0;
        C2395p c2395p;
        boolean z8;
        C2395p c2395p2;
        List list;
        boolean z9;
        boolean z10;
        List list2;
        Object m2985m;
        C2395p c2395p3 = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
            c2395p3.m3852U();
        } else {
            InterfaceC2425y0 interfaceC2425y0 = this.f8128f;
            List list3 = (List) interfaceC2425y0.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                try {
                    m2985m = new URI(((C0781cm) it.next()).f3166a).getHost();
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (m2985m instanceof C1689h) {
                    m2985m = null;
                }
                String str = (String) m2985m;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            List<String> m3042f0 = AbstractC1805m.m3042f0(arrayList);
            InterfaceC2425y0 interfaceC2425y02 = this.f8129g;
            EnumC1390w8 enumC1390w8 = (EnumC1390w8) interfaceC2425y02.getValue();
            EnumC1390w8 enumC1390w82 = EnumC1390w8.f8310f;
            if (enumC1390w8 != enumC1390w82) {
                if (!((List) interfaceC2425y0.getValue()).isEmpty() && !((Boolean) this.f8130h.getValue()).booleanValue()) {
                    if (!m3042f0.isEmpty()) {
                        for (String str2 : m3042f0) {
                            Collection collection = (Collection) this.f8131i.get(str2);
                            if (collection != null && !collection.isEmpty()) {
                                Collection collection2 = (Set) this.f8132j.get(str2);
                                if (collection2 == null) {
                                    collection2 = C1815w.f10862e;
                                }
                                if (!collection2.isEmpty()) {
                                }
                            }
                        }
                    }
                    z7 = true;
                }
                z7 = false;
                break;
            }
            InterfaceC3810r m346e = AbstractC0155c.m346e(C3807o.f17991a, 1.0f);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17974o, c2395p3, 48);
            int m3975r = AbstractC2418w.m3975r(c2395p3);
            InterfaceC2385m1 m3882m = c2395p3.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p3, m346e);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p3.m3863c0();
            if (c2395p3.f13485S) {
                c2395p3.m3880l(c3558z);
            } else {
                c2395p3.m3883m0();
            }
            AbstractC2418w.m3954C(m4854a, c2395p3, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p3, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p3.f13485S || !AbstractC3367j.m5096a(c2395p3.m3847O(), Integer.valueOf(m3975r))) {
                AbstractC2487d.m4050n(m3975r, c2395p3, m3975r, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p3, C3507i.f16929c);
            c2395p3.m3857Z(486824148);
            C2349d1 c2349d12 = this.f8133k;
            int m3741g = c2349d12.m3741g();
            C2413u0 c2413u02 = C2375k.f13421a;
            if (m3741g == 1) {
                c2395p3.m3857Z(486825247);
                boolean m3870g = c2395p3.m3870g(c2349d12);
                Object m3847O = c2395p3.m3847O();
                if (m3870g || m3847O == c2413u02) {
                    m3847O = new C1267s9(c2349d12, 0);
                    c2395p3.m3877j0(m3847O);
                }
                c2395p3.m3888r(false);
                c2395p = c2395p3;
                c2349d1 = c2349d12;
                c2413u0 = c2413u02;
                f7 = 1.0f;
                AbstractC1991r4.m3167h((InterfaceC3277a) m3847O, null, false, null, null, null, AbstractC0951i1.f4708c0, c2395p, 805306368, 510);
            } else {
                c2349d1 = c2349d12;
                f7 = 1.0f;
                c2413u0 = c2413u02;
                c2395p = c2395p3;
            }
            c2395p.m3888r(false);
            if (f7 > 0.0d) {
                float f8 = Float.MAX_VALUE;
                if (f7 <= Float.MAX_VALUE) {
                    f8 = f7;
                }
                AbstractC3122c.m4828a(c2395p, new LayoutWeightElement(f8, true));
                C3173d c3173d = AbstractC0951i1.f4710d0;
                final InterfaceC3277a interfaceC3277a = this.f8134l;
                AbstractC1991r4.m3167h(interfaceC3277a, null, false, null, null, null, c3173d, c2395p, 805306368, 510);
                int m3741g2 = c2349d1.m3741g();
                final InterfaceC2425y0 interfaceC2425y03 = this.f8135m;
                final C0959i9 c0959i9 = this.f8136n;
                final InterfaceC2425y0 interfaceC2425y04 = this.f8137o;
                final C1196q0 c1196q0 = this.f8138p;
                final List list4 = this.f8127e;
                final InterfaceC2425y0 interfaceC2425y05 = this.f8139q;
                final C3472s c3472s = this.f8132j;
                if (m3741g2 == 0) {
                    c2395p.m3857Z(-2088109174);
                    if (((EnumC1390w8) interfaceC2425y02.getValue()) == enumC1390w82) {
                        c2395p.m3857Z(-2088054490);
                        c2395p.m3857Z(486833994);
                        boolean m3870g2 = c2395p.m3870g(interfaceC2425y03) | c2395p.m3870g(c0959i9) | c2395p.m3870g(interfaceC2425y04) | c2395p.m3874i(c1196q0) | c2395p.m3874i(list4) | c2395p.m3870g(interfaceC2425y05) | c2395p.m3870g(interfaceC3277a);
                        Object m3847O2 = c2395p.m3847O();
                        if (!m3870g2 && m3847O2 != c2413u0) {
                            list2 = list4;
                        } else {
                            final int i7 = 0;
                            m3847O2 = new InterfaceC3277a() { // from class: e5.t9
                                @Override // p150t5.InterfaceC3277a
                                /* renamed from: a */
                                public final Object mo52a() {
                                    int i8 = i7;
                                    InterfaceC2425y0 interfaceC2425y06 = interfaceC2425y04;
                                    InterfaceC2425y0 interfaceC2425y07 = interfaceC2425y05;
                                    switch (i8) {
                                        case 0:
                                            AbstractC1249rm.m2215E(c0959i9, c1196q0, list4, c3472s, interfaceC3277a, interfaceC2425y03, interfaceC2425y06, interfaceC2425y07);
                                            break;
                                        default:
                                            AbstractC1249rm.m2215E(c0959i9, c1196q0, list4, c3472s, interfaceC3277a, interfaceC2425y03, interfaceC2425y06, interfaceC2425y07);
                                            break;
                                    }
                                    return C1694m.f10482a;
                                }
                            };
                            list2 = list4;
                            c2395p.m3877j0(m3847O2);
                        }
                        c2395p.m3888r(false);
                        C2395p c2395p4 = c2395p;
                        AbstractC1991r4.m3161b((InterfaceC3277a) m3847O2, null, !list2.isEmpty(), null, null, null, null, null, AbstractC0951i1.f4712e0, c2395p4, 805306368, 506);
                        c2395p2 = c2395p4;
                        c2395p2.m3888r(false);
                        z10 = false;
                        z9 = true;
                    } else {
                        C2413u0 c2413u03 = c2413u0;
                        c2395p.m3857Z(-2087912727);
                        c2395p.m3857Z(486838568);
                        C2349d1 c2349d13 = c2349d1;
                        boolean m3874i = c2395p.m3874i(list4) | c2395p.m3870g(interfaceC2425y02) | c2395p.m3870g(c2349d13);
                        InterfaceC0516a0 interfaceC0516a0 = this.f8140r;
                        boolean m3874i2 = m3874i | c2395p.m3874i(interfaceC0516a0);
                        Context context = this.f8141s;
                        boolean m3874i3 = m3874i2 | c2395p.m3874i(context) | c2395p.m3870g(interfaceC2425y05);
                        Object m3847O3 = c2395p.m3847O();
                        if (!m3874i3 && m3847O3 != c2413u03) {
                            list = list4;
                            z9 = true;
                        } else {
                            list = list4;
                            z9 = true;
                            C1329u9 c1329u9 = new C1329u9(list, interfaceC0516a0, interfaceC2425y02, this.f8130h, this.f8128f, c2349d13, this.f8131i, this.f8142t, c3472s, context, interfaceC2425y05, this.f8143u, 0);
                            c2395p.m3877j0(c1329u9);
                            m3847O3 = c1329u9;
                        }
                        c2395p.m3888r(false);
                        z10 = false;
                        C2395p c2395p5 = c2395p;
                        AbstractC1991r4.m3161b((InterfaceC3277a) m3847O3, null, !list.isEmpty(), null, null, null, null, null, AbstractC0951i1.f4714f0, c2395p5, 805306368, 506);
                        c2395p2 = c2395p5;
                        c2395p2.m3888r(false);
                    }
                    c2395p2.m3888r(z10);
                    z8 = z9;
                } else {
                    C2413u0 c2413u04 = c2413u0;
                    z8 = true;
                    c2395p.m3857Z(-2087756487);
                    c2395p.m3857Z(486843498);
                    boolean m3870g3 = c2395p.m3870g(interfaceC2425y03) | c2395p.m3870g(c0959i9) | c2395p.m3870g(interfaceC2425y04) | c2395p.m3874i(c1196q0) | c2395p.m3874i(list4) | c2395p.m3870g(interfaceC2425y05) | c2395p.m3870g(interfaceC3277a);
                    Object m3847O4 = c2395p.m3847O();
                    if (m3870g3 || m3847O4 == c2413u04) {
                        final int i8 = 1;
                        m3847O4 = new InterfaceC3277a() { // from class: e5.t9
                            @Override // p150t5.InterfaceC3277a
                            /* renamed from: a */
                            public final Object mo52a() {
                                int i82 = i8;
                                InterfaceC2425y0 interfaceC2425y06 = interfaceC2425y04;
                                InterfaceC2425y0 interfaceC2425y07 = interfaceC2425y05;
                                switch (i82) {
                                    case 0:
                                        AbstractC1249rm.m2215E(c0959i9, c1196q0, list4, c3472s, interfaceC3277a, interfaceC2425y03, interfaceC2425y06, interfaceC2425y07);
                                        break;
                                    default:
                                        AbstractC1249rm.m2215E(c0959i9, c1196q0, list4, c3472s, interfaceC3277a, interfaceC2425y03, interfaceC2425y06, interfaceC2425y07);
                                        break;
                                }
                                return C1694m.f10482a;
                            }
                        };
                        c2395p.m3877j0(m3847O4);
                    }
                    c2395p.m3888r(false);
                    C2395p c2395p6 = c2395p;
                    AbstractC1991r4.m3161b((InterfaceC3277a) m3847O4, null, z7, null, null, null, null, null, AbstractC0951i1.f4716g0, c2395p6, 805306368, 506);
                    c2395p2 = c2395p6;
                    c2395p2.m3888r(false);
                }
                c2395p2.m3888r(z8);
            } else {
                throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", f7, "; must be greater than zero").toString());
            }
        }
        return C1694m.f10482a;
    }
}
