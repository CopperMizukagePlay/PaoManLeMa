package p032d6;

import java.util.ArrayList;
import java.util.List;
import p001a0.C0068q2;
import p027d1.C0464b;
import p035e1.C0665l0;
import p035e1.C0677s;
import p039e5.AbstractC0945hr;
import p039e5.AbstractC1172p7;
import p039e5.AbstractC1249rm;
import p039e5.C1189po;
import p050g2.AbstractC1582d0;
import p050g2.AbstractC1586f0;
import p050g2.C1580c0;
import p050g2.C1583e;
import p050g2.C1587g;
import p050g2.C1588g0;
import p050g2.C1592i0;
import p050g2.C1595k;
import p050g2.C1597l;
import p050g2.C1600m0;
import p050g2.C1602n0;
import p050g2.C1606p0;
import p050g2.C1608q0;
import p050g2.C1613v;
import p050g2.EnumC1591i;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p080k2.C2298i;
import p080k2.C2299j;
import p080k2.C2300k;
import p082k5.InterfaceC2316f;
import p082k5.InterfaceC2318h;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p103n2.C2713a;
import p103n2.C2714b;
import p132r2.C3027a;
import p132r2.C3030d;
import p132r2.C3031e;
import p132r2.C3032f;
import p132r2.C3034h;
import p132r2.C3035i;
import p132r2.C3037k;
import p132r2.C3038l;
import p132r2.C3039m;
import p132r2.C3042p;
import p132r2.C3043q;
import p140s2.C3105o;
import p140s2.C3106p;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3281e;
import p153u0.C3334a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.u */
/* loaded from: classes.dex */
public final /* synthetic */ class C0575u implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f1929e;

    public /* synthetic */ C0575u(int i7) {
        this.f1929e = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        EnumC1591i enumC1591i;
        Object m2556a;
        int i7 = this.f1929e;
        C1694m c1694m = C1694m.f10482a;
        boolean z7 = false;
        boolean z8 = false;
        switch (i7) {
            case 0:
                return ((InterfaceC2318h) obj).mo855z((InterfaceC2316f) obj2);
            case 1:
                return ((InterfaceC2318h) obj).mo855z((InterfaceC2316f) obj2);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC1172p7.m2037N(AbstractC2418w.m3957F(1), (C2395p) obj);
                return c1694m;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC1172p7.m2073t(AbstractC2418w.m3957F(1), (C2395p) obj);
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                ((Integer) obj2).getClass();
                AbstractC1249rm.m2209B(AbstractC2418w.m3957F(1), (C2395p) obj);
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                ((Integer) obj).intValue();
                C1189po c1189po = (C1189po) obj2;
                AbstractC3367j.m5100e(c1189po, "profile");
                return Integer.valueOf(c1189po.f6926a);
            case 7:
                ((Integer) obj2).getClass();
                AbstractC0945hr.m1587m(AbstractC2418w.m3957F(1), (C2395p) obj);
                return c1694m;
            case 8:
                C1587g c1587g = (C1587g) obj2;
                return AbstractC1806n.m3063K(c1587g.f10239f, AbstractC1582d0.m2556a(c1587g.f10238e, AbstractC1582d0.f10208a, (C3334a) obj));
            case AbstractC3122c.f15758c /* 9 */:
                return Integer.valueOf(((C3038l) obj2).f15607a);
            case AbstractC3122c.f15760e /* 10 */:
                C3042p c3042p = (C3042p) obj2;
                return AbstractC1806n.m3063K(Float.valueOf(c3042p.f15611a), Float.valueOf(c3042p.f15612b));
            case 11:
                C3334a c3334a = (C3334a) obj;
                C3043q c3043q = (C3043q) obj2;
                C3105o c3105o = new C3105o(c3043q.f15614a);
                C1580c0 c1580c0 = AbstractC1582d0.f10224q;
                return AbstractC1806n.m3063K(AbstractC1582d0.m2556a(c3105o, c1580c0, c3334a), AbstractC1582d0.m2556a(new C3105o(c3043q.f15615b), c1580c0, c3334a));
            case 12:
                return Integer.valueOf(((C2300k) obj2).f13237e);
            case 13:
                C1597l c1597l = (C1597l) obj2;
                return AbstractC1806n.m3063K(c1597l.f10286a, AbstractC1582d0.m2556a(c1597l.f10287b, AbstractC1582d0.f10216i, (C3334a) obj));
            case 14:
                return Float.valueOf(((C3027a) obj2).f15585a);
            case AbstractC3122c.f15762g /* 15 */:
                C3334a c3334a2 = (C3334a) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList.add(AbstractC1582d0.m2556a((C1583e) list.get(i8), AbstractC1582d0.f10209b, c3334a2));
                }
                return arrayList;
            case 16:
                C1602n0 c1602n0 = (C1602n0) obj2;
                return AbstractC1806n.m3063K(Integer.valueOf((int) (c1602n0.f10304a >> 32)), Integer.valueOf((int) (4294967295L & c1602n0.f10304a)));
            case 17:
                C3334a c3334a3 = (C3334a) obj;
                C0665l0 c0665l0 = (C0665l0) obj2;
                return AbstractC1806n.m3063K(AbstractC1582d0.m2556a(new C0677s(c0665l0.f2177a), AbstractC1582d0.f10223p, c3334a3), AbstractC1582d0.m2556a(new C0464b(c0665l0.f2178b), AbstractC1582d0.f10225r, c3334a3), Float.valueOf(c0665l0.f2179c));
            case 18:
                C3105o c3105o2 = (C3105o) obj2;
                long j6 = C3105o.f15708c;
                if (c3105o2 != null) {
                    z8 = C3105o.m4794a(c3105o2.f15709a, j6);
                }
                if (z8) {
                    return Boolean.FALSE;
                }
                return AbstractC1806n.m3063K(Float.valueOf(C3105o.m4796c(c3105o2.f15709a)), new C3106p(C3105o.m4795b(c3105o2.f15709a)));
            case 19:
                C0464b c0464b = (C0464b) obj2;
                if (c0464b != null) {
                    z7 = C0464b.m1006b(c0464b.f1623a, 9205357640488583168L);
                }
                if (z7) {
                    return Boolean.FALSE;
                }
                return AbstractC1806n.m3063K(Float.valueOf(Float.intBitsToFloat((int) (c0464b.f1623a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (4294967295L & c0464b.f1623a))));
            case 20:
                C3334a c3334a4 = (C3334a) obj;
                List list2 = ((C2714b) obj2).f14563e;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    arrayList2.add(AbstractC1582d0.m2556a((C2713a) list2.get(i9), AbstractC1582d0.f10227t, c3334a4));
                }
                return arrayList2;
            case 21:
                return ((C2713a) obj2).f14561a.toLanguageTag();
            case 22:
                C3035i c3035i = (C3035i) obj2;
                return AbstractC1806n.m3063K(new C3032f(c3035i.f15598a), new C3034h(c3035i.f15599b), new Object());
            case 23:
                C3334a c3334a5 = (C3334a) obj;
                C1583e c1583e = (C1583e) obj2;
                Object obj3 = c1583e.f10229a;
                if (obj3 instanceof C1613v) {
                    enumC1591i = EnumC1591i.f10263e;
                } else if (obj3 instanceof C1588g0) {
                    enumC1591i = EnumC1591i.f10264f;
                } else if (obj3 instanceof C1608q0) {
                    enumC1591i = EnumC1591i.f10265g;
                } else if (obj3 instanceof C1606p0) {
                    enumC1591i = EnumC1591i.f10266h;
                } else if (obj3 instanceof C1597l) {
                    enumC1591i = EnumC1591i.f10267i;
                } else if (obj3 instanceof C1595k) {
                    enumC1591i = EnumC1591i.f10268j;
                } else if (obj3 instanceof C1592i0) {
                    enumC1591i = EnumC1591i.f10269k;
                } else {
                    throw new UnsupportedOperationException();
                }
                switch (enumC1591i.ordinal()) {
                    case 0:
                        AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        m2556a = AbstractC1582d0.m2556a((C1613v) obj3, AbstractC1582d0.f10214g, c3334a5);
                        break;
                    case 1:
                        AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        m2556a = AbstractC1582d0.m2556a((C1588g0) obj3, AbstractC1582d0.f10215h, c3334a5);
                        break;
                    case 2:
                        AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        m2556a = AbstractC1582d0.m2556a((C1608q0) obj3, AbstractC1582d0.f10210c, c3334a5);
                        break;
                    case 3:
                        AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        m2556a = AbstractC1582d0.m2556a((C1606p0) obj3, AbstractC1582d0.f10211d, c3334a5);
                        break;
                    case 4:
                        AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        m2556a = AbstractC1582d0.m2556a((C1597l) obj3, AbstractC1582d0.f10212e, c3334a5);
                        break;
                    case AbstractC3122c.f15761f /* 5 */:
                        AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        m2556a = AbstractC1582d0.m2556a((C1595k) obj3, AbstractC1582d0.f10213f, c3334a5);
                        break;
                    case AbstractC3122c.f15759d /* 6 */:
                        AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        m2556a = ((C1592i0) obj3).f10271a;
                        break;
                    default:
                        throw new RuntimeException();
                }
                return AbstractC1806n.m3063K(enumC1591i, m2556a, Integer.valueOf(c1583e.f10230b), Integer.valueOf(c1583e.f10231c), c1583e.f10232d);
            case 24:
                C1595k c1595k = (C1595k) obj2;
                return AbstractC1806n.m3063K(c1595k.f10274a, AbstractC1582d0.m2556a(c1595k.f10275b, AbstractC1582d0.f10216i, (C3334a) obj));
            case 25:
                return ((C1608q0) obj2).f10323a;
            case 26:
                return ((C1606p0) obj2).f10320a;
            case 27:
                C3334a c3334a6 = (C3334a) obj;
                C1613v c1613v = (C1613v) obj2;
                C3037k c3037k = new C3037k(c1613v.f10339a);
                C3039m c3039m = new C3039m(c1613v.f10340b);
                Object m2556a2 = AbstractC1582d0.m2556a(new C3105o(c1613v.f10341c), AbstractC1582d0.f10224q, c3334a6);
                C3043q c3043q2 = c1613v.f10342d;
                C3043q c3043q3 = C3043q.f15613c;
                Object m2556a3 = AbstractC1582d0.m2556a(c3043q2, AbstractC1582d0.f10219l, c3334a6);
                Object m2556a4 = AbstractC1582d0.m2556a(c1613v.f10343e, AbstractC1586f0.f10235a, c3334a6);
                C3035i c3035i2 = c1613v.f10344f;
                C3035i c3035i3 = C3035i.f15597c;
                return AbstractC1806n.m3063K(c3037k, c3039m, m2556a2, m2556a3, m2556a4, AbstractC1582d0.m2556a(c3035i2, AbstractC1582d0.f10228u, c3334a6), AbstractC1582d0.m2556a(new C3031e(c1613v.f10345g), AbstractC1586f0.f10236b, c3334a6), new C3030d(c1613v.f10346h), AbstractC1582d0.m2556a(c1613v.f10347i, AbstractC1586f0.f10237c, c3334a6));
            case 28:
                C3334a c3334a7 = (C3334a) obj;
                C1588g0 c1588g0 = (C1588g0) obj2;
                C0677s c0677s = new C0677s(c1588g0.f10242a.mo4717b());
                C1580c0 c1580c02 = AbstractC1582d0.f10223p;
                Object m2556a5 = AbstractC1582d0.m2556a(c0677s, c1580c02, c3334a7);
                C3105o c3105o3 = new C3105o(c1588g0.f10243b);
                C1580c0 c1580c03 = AbstractC1582d0.f10224q;
                Object m2556a6 = AbstractC1582d0.m2556a(c3105o3, c1580c03, c3334a7);
                C2300k c2300k = c1588g0.f10244c;
                C2300k c2300k2 = C2300k.f13231f;
                Object m2556a7 = AbstractC1582d0.m2556a(c2300k, AbstractC1582d0.f10220m, c3334a7);
                C2298i c2298i = c1588g0.f10245d;
                C2299j c2299j = c1588g0.f10246e;
                String str = c1588g0.f10248g;
                Object m2556a8 = AbstractC1582d0.m2556a(new C3105o(c1588g0.f10249h), c1580c03, c3334a7);
                Object m2556a9 = AbstractC1582d0.m2556a(c1588g0.f10250i, AbstractC1582d0.f10221n, c3334a7);
                Object m2556a10 = AbstractC1582d0.m2556a(c1588g0.f10251j, AbstractC1582d0.f10218k, c3334a7);
                C2714b c2714b = c1588g0.f10252k;
                C2714b c2714b2 = C2714b.f14562g;
                Object m2556a11 = AbstractC1582d0.m2556a(c2714b, AbstractC1582d0.f10226s, c3334a7);
                Object m2556a12 = AbstractC1582d0.m2556a(new C0677s(c1588g0.f10253l), c1580c02, c3334a7);
                Object m2556a13 = AbstractC1582d0.m2556a(c1588g0.f10254m, AbstractC1582d0.f10217j, c3334a7);
                C0665l0 c0665l02 = c1588g0.f10255n;
                C0665l0 c0665l03 = C0665l0.f2176d;
                return AbstractC1806n.m3063K(m2556a5, m2556a6, m2556a7, c2298i, c2299j, -1, str, m2556a8, m2556a9, m2556a10, m2556a11, m2556a12, m2556a13, AbstractC1582d0.m2556a(c0665l02, AbstractC1582d0.f10222o, c3334a7));
            default:
                C3334a c3334a8 = (C3334a) obj;
                C1600m0 c1600m0 = (C1600m0) obj2;
                C1588g0 c1588g02 = c1600m0.f10294a;
                C0068q2 c0068q2 = AbstractC1582d0.f10215h;
                return AbstractC1806n.m3063K(AbstractC1582d0.m2556a(c1588g02, c0068q2, c3334a8), AbstractC1582d0.m2556a(c1600m0.f10295b, c0068q2, c3334a8), AbstractC1582d0.m2556a(c1600m0.f10296c, c0068q2, c3334a8), AbstractC1582d0.m2556a(c1600m0.f10297d, c0068q2, c3334a8));
        }
    }

    public /* synthetic */ C0575u(int i7, int i8) {
        this.f1929e = i8;
    }
}
