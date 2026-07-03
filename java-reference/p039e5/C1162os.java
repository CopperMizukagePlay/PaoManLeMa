package p039e5;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p001a0.C0068q2;
import p024c6.AbstractC0444k;
import p027d1.C0464b;
import p035e1.AbstractC0659i0;
import p035e1.C0665l0;
import p035e1.C0677s;
import p050g2.AbstractC1582d0;
import p050g2.AbstractC1586f0;
import p050g2.C1580c0;
import p050g2.C1583e;
import p050g2.C1587g;
import p050g2.C1588g0;
import p050g2.C1592i0;
import p050g2.C1593j;
import p050g2.C1595k;
import p050g2.C1597l;
import p050g2.C1600m0;
import p050g2.C1602n0;
import p050g2.C1606p0;
import p050g2.C1608q0;
import p050g2.C1610s;
import p050g2.C1613v;
import p050g2.C1615x;
import p050g2.EnumC1591i;
import p050g2.InterfaceC1577b;
import p068i5.AbstractC2080d;
import p080k2.AbstractC2305p;
import p080k2.C2298i;
import p080k2.C2299j;
import p080k2.C2300k;
import p092m.AbstractC2487d;
import p103n2.AbstractC2715c;
import p103n2.C2713a;
import p103n2.C2714b;
import p132r2.C3027a;
import p132r2.C3030d;
import p132r2.C3031e;
import p132r2.C3032f;
import p132r2.C3033g;
import p132r2.C3034h;
import p132r2.C3035i;
import p132r2.C3037k;
import p132r2.C3038l;
import p132r2.C3039m;
import p132r2.C3042p;
import p132r2.C3043q;
import p132r2.C3044r;
import p132r2.C3045s;
import p140s2.C3105o;
import p140s2.C3106p;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p153u0.C3336c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.os */
/* loaded from: classes.dex */
public final /* synthetic */ class C1162os implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f6735e;

    public /* synthetic */ C1162os(int i7) {
        this.f6735e = i7;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C1588g0 c1588g0;
        C1588g0 c1588g02;
        C1588g0 c1588g03;
        C1588g0 c1588g04;
        List list;
        String str;
        C3105o c3105o;
        C3105o c3105o2;
        Integer num;
        Integer num2;
        C0677s c0677s;
        C0464b c0464b;
        Float f7;
        Float f8;
        C3106p c3106p;
        String str2;
        C1600m0 c1600m0;
        Float f9;
        Float f10;
        C2713a c2713a;
        C1583e c1583e;
        C3032f c3032f;
        C3034h c3034h;
        C3033g c3033g;
        EnumC1591i enumC1591i;
        Integer num3;
        Integer num4;
        String str3;
        C1613v c1613v;
        C1588g0 c1588g05;
        C1608q0 c1608q0;
        C1606p0 c1606p0;
        C1597l c1597l;
        C1595k c1595k;
        String str4;
        String str5;
        String str6;
        String str7;
        C1600m0 c1600m02;
        C3037k c3037k;
        C3039m c3039m;
        C3105o c3105o3;
        C3043q c3043q;
        C1615x c1615x;
        C3035i c3035i;
        C3031e c3031e;
        C3030d c3030d;
        int i7;
        int i8;
        int i9;
        int i10;
        long j6;
        C3045s c3045s;
        C0677s c0677s2;
        C3105o c3105o4;
        C2300k c2300k;
        C2298i c2298i;
        C2299j c2299j;
        String str8;
        C3105o c3105o5;
        C3027a c3027a;
        C3042p c3042p;
        C2714b c2714b;
        C0677s c0677s3;
        C3038l c3038l;
        C0665l0 c0665l0;
        Boolean bool;
        C1593j c1593j;
        C3044r c3044r;
        Boolean bool2;
        int i11 = 0;
        switch (this.f6735e) {
            case 0:
                String str9 = (String) obj;
                AbstractC3367j.m5100e(str9, "it");
                return AbstractC0444k.m956t0(str9).toString();
            case 1:
                AbstractC3367j.m5100e((String) obj, "it");
                return Boolean.valueOf(!AbstractC0444k.m937a0(r1));
            case 2:
                return Boolean.valueOf(!(((InterfaceC1577b) obj) instanceof C1613v));
            case 3:
                C1610s c1610s = (C1610s) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(c1610s.f10330b);
                sb.append(", ");
                return AbstractC2487d.m4045i(sb, c1610s.f10331c, ')');
            case 4:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) AbstractC1582d0.f10215h.f345g;
                Boolean bool3 = Boolean.FALSE;
                if (AbstractC3367j.m5096a(obj2, bool3) || obj2 == null) {
                    c1588g0 = null;
                } else {
                    c1588g0 = (C1588g0) interfaceC3279c.mo23f(obj2);
                }
                Object obj3 = list2.get(1);
                if (AbstractC3367j.m5096a(obj3, bool3) || obj3 == null) {
                    c1588g02 = null;
                } else {
                    c1588g02 = (C1588g0) interfaceC3279c.mo23f(obj3);
                }
                Object obj4 = list2.get(2);
                if (AbstractC3367j.m5096a(obj4, bool3) || obj4 == null) {
                    c1588g03 = null;
                } else {
                    c1588g03 = (C1588g0) interfaceC3279c.mo23f(obj4);
                }
                Object obj5 = list2.get(3);
                if (AbstractC3367j.m5096a(obj5, bool3) || obj5 == null) {
                    c1588g04 = null;
                } else {
                    c1588g04 = (C1588g0) interfaceC3279c.mo23f(obj5);
                }
                return new C1600m0(c1588g0, c1588g02, c1588g03, c1588g04);
            case AbstractC3122c.f15761f /* 5 */:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj6 = list3.get(1);
                C0068q2 c0068q2 = AbstractC1582d0.f10208a;
                if (AbstractC3367j.m5096a(obj6, Boolean.FALSE) || obj6 == null) {
                    list = null;
                } else {
                    list = (List) ((InterfaceC3279c) c0068q2.f345g).mo23f(obj6);
                }
                Object obj7 = list3.get(0);
                if (obj7 != null) {
                    str = (String) obj7;
                } else {
                    str = null;
                }
                AbstractC3367j.m5097b(str);
                return new C1587g(list, str);
            case AbstractC3122c.f15759d /* 6 */:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C3038l(((Integer) obj).intValue());
            case 7:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list4 = (List) obj;
                return new C3042p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 8:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                C3106p[] c3106pArr = C3105o.f15707b;
                InterfaceC3279c interfaceC3279c2 = AbstractC1582d0.f10224q.f10205f;
                Boolean bool4 = Boolean.FALSE;
                AbstractC3367j.m5096a(obj8, bool4);
                if (obj8 != null) {
                    c3105o = (C3105o) interfaceC3279c2.mo23f(obj8);
                } else {
                    c3105o = null;
                }
                AbstractC3367j.m5097b(c3105o);
                long j7 = c3105o.f15709a;
                Object obj9 = list5.get(1);
                AbstractC3367j.m5096a(obj9, bool4);
                if (obj9 != null) {
                    c3105o2 = (C3105o) interfaceC3279c2.mo23f(obj9);
                } else {
                    c3105o2 = null;
                }
                AbstractC3367j.m5097b(c3105o2);
                return new C3043q(j7, c3105o2.f15709a);
            case AbstractC3122c.f15758c /* 9 */:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C2300k(((Integer) obj).intValue());
            case AbstractC3122c.f15760e /* 10 */:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Float");
                return new C3027a(((Float) obj).floatValue());
            case 11:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                if (obj10 != null) {
                    num = (Integer) obj10;
                } else {
                    num = null;
                }
                AbstractC3367j.m5097b(num);
                int intValue = num.intValue();
                Object obj11 = list6.get(1);
                if (obj11 != null) {
                    num2 = (Integer) obj11;
                } else {
                    num2 = null;
                }
                AbstractC3367j.m5097b(num2);
                return new C1602n0(AbstractC1586f0.m2558b(intValue, num2.intValue()));
            case 12:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i12 = C0677s.f2210h;
                Boolean bool5 = Boolean.FALSE;
                AbstractC3367j.m5096a(obj12, bool5);
                if (obj12 != null) {
                    if (AbstractC3367j.m5096a(obj12, Boolean.FALSE)) {
                        c0677s = new C0677s(C0677s.f2209g);
                    } else {
                        c0677s = new C0677s(AbstractC0659i0.m1403c(((Integer) obj12).intValue()));
                    }
                } else {
                    c0677s = null;
                }
                AbstractC3367j.m5097b(c0677s);
                long j8 = c0677s.f2211a;
                Object obj13 = list7.get(1);
                C1580c0 c1580c0 = AbstractC1582d0.f10225r;
                AbstractC3367j.m5096a(obj13, bool5);
                if (obj13 != null) {
                    c0464b = (C0464b) c1580c0.f10205f.mo23f(obj13);
                } else {
                    c0464b = null;
                }
                AbstractC3367j.m5097b(c0464b);
                long j9 = c0464b.f1623a;
                Object obj14 = list7.get(2);
                if (obj14 != null) {
                    f7 = (Float) obj14;
                } else {
                    f7 = null;
                }
                AbstractC3367j.m5097b(f7);
                return new C0665l0(j8, j9, f7.floatValue());
            case 13:
                if (AbstractC3367j.m5096a(obj, Boolean.FALSE)) {
                    return new C3105o(C3105o.f15708c);
                }
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                if (obj15 != null) {
                    f8 = (Float) obj15;
                } else {
                    f8 = null;
                }
                AbstractC3367j.m5097b(f8);
                float floatValue = f8.floatValue();
                Object obj16 = list8.get(1);
                if (obj16 != null) {
                    c3106p = (C3106p) obj16;
                } else {
                    c3106p = null;
                }
                AbstractC3367j.m5097b(c3106p);
                return new C3105o(AbstractC2080d.m3413z(floatValue, c3106p.f15710a));
            case 14:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                if (obj17 != null) {
                    str2 = (String) obj17;
                } else {
                    str2 = null;
                }
                AbstractC3367j.m5097b(str2);
                Object obj18 = list9.get(1);
                C0068q2 c0068q22 = AbstractC1582d0.f10216i;
                if (AbstractC3367j.m5096a(obj18, Boolean.FALSE) || obj18 == null) {
                    c1600m0 = null;
                } else {
                    c1600m0 = (C1600m0) ((InterfaceC3279c) c0068q22.f345g).mo23f(obj18);
                }
                return new C1597l(str2, c1600m0);
            case AbstractC3122c.f15762g /* 15 */:
                if (AbstractC3367j.m5096a(obj, Boolean.FALSE)) {
                    return new C0464b(9205357640488583168L);
                }
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj19 = list10.get(0);
                if (obj19 != null) {
                    f9 = (Float) obj19;
                } else {
                    f9 = null;
                }
                AbstractC3367j.m5097b(f9);
                float floatValue2 = f9.floatValue();
                Object obj20 = list10.get(1);
                if (obj20 != null) {
                    f10 = (Float) obj20;
                } else {
                    f10 = null;
                }
                AbstractC3367j.m5097b(f10);
                float floatValue3 = f10.floatValue();
                return new C0464b((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(floatValue3) & 4294967295L));
            case 16:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size = list11.size();
                while (i11 < size) {
                    Object obj21 = list11.get(i11);
                    C0068q2 c0068q23 = AbstractC1582d0.f10227t;
                    if (AbstractC3367j.m5096a(obj21, Boolean.FALSE) || obj21 == null) {
                        c2713a = null;
                    } else {
                        c2713a = (C2713a) ((InterfaceC3279c) c0068q23.f345g).mo23f(obj21);
                    }
                    AbstractC3367j.m5097b(c2713a);
                    arrayList.add(c2713a);
                    i11++;
                }
                return new C2714b(arrayList);
            case 17:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i11 < size2) {
                    Object obj22 = list12.get(i11);
                    C0068q2 c0068q24 = AbstractC1582d0.f10209b;
                    if (AbstractC3367j.m5096a(obj22, Boolean.FALSE) || obj22 == null) {
                        c1583e = null;
                    } else {
                        c1583e = (C1583e) ((InterfaceC3279c) c0068q24.f345g).mo23f(obj22);
                    }
                    AbstractC3367j.m5097b(c1583e);
                    arrayList2.add(c1583e);
                    i11++;
                }
                return arrayList2;
            case 18:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.String");
                String str10 = (String) obj;
                AbstractC2715c.f14565a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str10);
                if (AbstractC3367j.m5096a(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str10 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new C2713a(forLanguageTag);
            case 19:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                if (obj23 != null) {
                    c3032f = (C3032f) obj23;
                } else {
                    c3032f = null;
                }
                AbstractC3367j.m5097b(c3032f);
                float f11 = c3032f.f15595a;
                Object obj24 = list13.get(1);
                if (obj24 != null) {
                    c3034h = (C3034h) obj24;
                } else {
                    c3034h = null;
                }
                AbstractC3367j.m5097b(c3034h);
                int i13 = c3034h.f15596a;
                Object obj25 = list13.get(2);
                if (obj25 != null) {
                    c3033g = (C3033g) obj25;
                } else {
                    c3033g = null;
                }
                AbstractC3367j.m5097b(c3033g);
                return new C3035i(f11, i13);
            case 20:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj26 = list14.get(0);
                if (obj26 != null) {
                    enumC1591i = (EnumC1591i) obj26;
                } else {
                    enumC1591i = null;
                }
                AbstractC3367j.m5097b(enumC1591i);
                Object obj27 = list14.get(2);
                if (obj27 != null) {
                    num3 = (Integer) obj27;
                } else {
                    num3 = null;
                }
                AbstractC3367j.m5097b(num3);
                int intValue2 = num3.intValue();
                Object obj28 = list14.get(3);
                if (obj28 != null) {
                    num4 = (Integer) obj28;
                } else {
                    num4 = null;
                }
                AbstractC3367j.m5097b(num4);
                int intValue3 = num4.intValue();
                Object obj29 = list14.get(4);
                if (obj29 != null) {
                    str3 = (String) obj29;
                } else {
                    str3 = null;
                }
                AbstractC3367j.m5097b(str3);
                switch (enumC1591i.ordinal()) {
                    case 0:
                        Object obj30 = list14.get(1);
                        C0068q2 c0068q25 = AbstractC1582d0.f10214g;
                        if (AbstractC3367j.m5096a(obj30, Boolean.FALSE) || obj30 == null) {
                            c1613v = null;
                        } else {
                            c1613v = (C1613v) ((InterfaceC3279c) c0068q25.f345g).mo23f(obj30);
                        }
                        AbstractC3367j.m5097b(c1613v);
                        return new C1583e(c1613v, intValue2, intValue3, str3);
                    case 1:
                        Object obj31 = list14.get(1);
                        C0068q2 c0068q26 = AbstractC1582d0.f10215h;
                        if (AbstractC3367j.m5096a(obj31, Boolean.FALSE) || obj31 == null) {
                            c1588g05 = null;
                        } else {
                            c1588g05 = (C1588g0) ((InterfaceC3279c) c0068q26.f345g).mo23f(obj31);
                        }
                        AbstractC3367j.m5097b(c1588g05);
                        return new C1583e(c1588g05, intValue2, intValue3, str3);
                    case 2:
                        Object obj32 = list14.get(1);
                        C0068q2 c0068q27 = AbstractC1582d0.f10210c;
                        if (AbstractC3367j.m5096a(obj32, Boolean.FALSE) || obj32 == null) {
                            c1608q0 = null;
                        } else {
                            c1608q0 = (C1608q0) ((InterfaceC3279c) c0068q27.f345g).mo23f(obj32);
                        }
                        AbstractC3367j.m5097b(c1608q0);
                        return new C1583e(c1608q0, intValue2, intValue3, str3);
                    case 3:
                        Object obj33 = list14.get(1);
                        C0068q2 c0068q28 = AbstractC1582d0.f10211d;
                        if (AbstractC3367j.m5096a(obj33, Boolean.FALSE) || obj33 == null) {
                            c1606p0 = null;
                        } else {
                            c1606p0 = (C1606p0) ((InterfaceC3279c) c0068q28.f345g).mo23f(obj33);
                        }
                        AbstractC3367j.m5097b(c1606p0);
                        return new C1583e(c1606p0, intValue2, intValue3, str3);
                    case 4:
                        Object obj34 = list14.get(1);
                        C0068q2 c0068q29 = AbstractC1582d0.f10212e;
                        if (AbstractC3367j.m5096a(obj34, Boolean.FALSE) || obj34 == null) {
                            c1597l = null;
                        } else {
                            c1597l = (C1597l) ((InterfaceC3279c) c0068q29.f345g).mo23f(obj34);
                        }
                        AbstractC3367j.m5097b(c1597l);
                        return new C1583e(c1597l, intValue2, intValue3, str3);
                    case AbstractC3122c.f15761f /* 5 */:
                        Object obj35 = list14.get(1);
                        C0068q2 c0068q210 = AbstractC1582d0.f10213f;
                        if (AbstractC3367j.m5096a(obj35, Boolean.FALSE) || obj35 == null) {
                            c1595k = null;
                        } else {
                            c1595k = (C1595k) ((InterfaceC3279c) c0068q210.f345g).mo23f(obj35);
                        }
                        AbstractC3367j.m5097b(c1595k);
                        return new C1583e(c1595k, intValue2, intValue3, str3);
                    case AbstractC3122c.f15759d /* 6 */:
                        Object obj36 = list14.get(1);
                        if (obj36 != null) {
                            str4 = (String) obj36;
                        } else {
                            str4 = null;
                        }
                        AbstractC3367j.m5097b(str4);
                        return new C1583e(new C1592i0(str4), intValue2, intValue3, str3);
                    default:
                        throw new RuntimeException();
                }
            case 21:
                if (obj != null) {
                    str5 = (String) obj;
                } else {
                    str5 = null;
                }
                AbstractC3367j.m5097b(str5);
                return new C1608q0(str5);
            case 22:
                if (obj != null) {
                    str6 = (String) obj;
                } else {
                    str6 = null;
                }
                AbstractC3367j.m5097b(str6);
                return new C1606p0(str6);
            case 23:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list15 = (List) obj;
                Object obj37 = list15.get(0);
                if (obj37 != null) {
                    str7 = (String) obj37;
                } else {
                    str7 = null;
                }
                AbstractC3367j.m5097b(str7);
                Object obj38 = list15.get(1);
                C0068q2 c0068q211 = AbstractC1582d0.f10216i;
                if (AbstractC3367j.m5096a(obj38, Boolean.FALSE) || obj38 == null) {
                    c1600m02 = null;
                } else {
                    c1600m02 = (C1600m0) ((InterfaceC3279c) c0068q211.f345g).mo23f(obj38);
                }
                return new C1595k(str7, c1600m02);
            case 24:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list16 = (List) obj;
                Object obj39 = list16.get(0);
                if (obj39 != null) {
                    c3037k = (C3037k) obj39;
                } else {
                    c3037k = null;
                }
                AbstractC3367j.m5097b(c3037k);
                int i14 = c3037k.f15603a;
                Object obj40 = list16.get(1);
                if (obj40 != null) {
                    c3039m = (C3039m) obj40;
                } else {
                    c3039m = null;
                }
                AbstractC3367j.m5097b(c3039m);
                int i15 = c3039m.f15608a;
                Object obj41 = list16.get(2);
                C3106p[] c3106pArr2 = C3105o.f15707b;
                C1580c0 c1580c02 = AbstractC1582d0.f10224q;
                Boolean bool6 = Boolean.FALSE;
                AbstractC3367j.m5096a(obj41, bool6);
                if (obj41 != null) {
                    c3105o3 = (C3105o) c1580c02.f10205f.mo23f(obj41);
                } else {
                    c3105o3 = null;
                }
                AbstractC3367j.m5097b(c3105o3);
                long j10 = c3105o3.f15709a;
                Object obj42 = list16.get(3);
                C3043q c3043q2 = C3043q.f15613c;
                C0068q2 c0068q212 = AbstractC1582d0.f10219l;
                if (AbstractC3367j.m5096a(obj42, bool6) || obj42 == null) {
                    c3043q = null;
                } else {
                    c3043q = (C3043q) ((InterfaceC3279c) c0068q212.f345g).mo23f(obj42);
                }
                Object obj43 = list16.get(4);
                boolean m5096a = AbstractC3367j.m5096a(obj43, bool6);
                C0068q2 c0068q213 = AbstractC1586f0.f10235a;
                if (m5096a || obj43 == null) {
                    c1615x = null;
                } else {
                    c1615x = (C1615x) ((InterfaceC3279c) c0068q213.f345g).mo23f(obj43);
                }
                Object obj44 = list16.get(5);
                C3035i c3035i2 = C3035i.f15597c;
                C0068q2 c0068q214 = AbstractC1582d0.f10228u;
                if (AbstractC3367j.m5096a(obj44, bool6) || obj44 == null) {
                    c3035i = null;
                } else {
                    c3035i = (C3035i) ((InterfaceC3279c) c0068q214.f345g).mo23f(obj44);
                }
                Object obj45 = list16.get(6);
                boolean m5096a2 = AbstractC3367j.m5096a(obj45, bool6);
                C0068q2 c0068q215 = AbstractC1586f0.f10236b;
                if (m5096a2 || obj45 == null) {
                    c3031e = null;
                } else {
                    c3031e = (C3031e) ((InterfaceC3279c) c0068q215.f345g).mo23f(obj45);
                }
                AbstractC3367j.m5097b(c3031e);
                int i16 = c3031e.f15591a;
                Object obj46 = list16.get(7);
                if (obj46 != null) {
                    c3030d = (C3030d) obj46;
                } else {
                    c3030d = null;
                }
                AbstractC3367j.m5097b(c3030d);
                int i17 = c3030d.f15589a;
                Object obj47 = list16.get(8);
                boolean m5096a3 = AbstractC3367j.m5096a(obj47, bool6);
                C0068q2 c0068q216 = AbstractC1586f0.f10237c;
                if (m5096a3 || obj47 == null) {
                    i7 = i14;
                    i8 = i15;
                    i9 = i17;
                    i10 = i16;
                    j6 = j10;
                    c3045s = null;
                } else {
                    i7 = i14;
                    i8 = i15;
                    i9 = i17;
                    i10 = i16;
                    j6 = j10;
                    c3045s = (C3045s) ((InterfaceC3279c) c0068q216.f345g).mo23f(obj47);
                }
                return new C1613v(i7, i8, j6, c3043q, c1615x, c3035i, i10, i9, c3045s);
            case 25:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list17 = (List) obj;
                Object obj48 = list17.get(0);
                int i18 = C0677s.f2210h;
                Boolean bool7 = Boolean.FALSE;
                AbstractC3367j.m5096a(obj48, bool7);
                if (obj48 != null) {
                    if (obj48.equals(bool7)) {
                        c0677s2 = new C0677s(C0677s.f2209g);
                    } else {
                        c0677s2 = new C0677s(AbstractC0659i0.m1403c(((Integer) obj48).intValue()));
                    }
                } else {
                    c0677s2 = null;
                }
                AbstractC3367j.m5097b(c0677s2);
                long j11 = c0677s2.f2211a;
                Object obj49 = list17.get(1);
                C3106p[] c3106pArr3 = C3105o.f15707b;
                InterfaceC3279c interfaceC3279c3 = AbstractC1582d0.f10224q.f10205f;
                AbstractC3367j.m5096a(obj49, bool7);
                if (obj49 != null) {
                    c3105o4 = (C3105o) interfaceC3279c3.mo23f(obj49);
                } else {
                    c3105o4 = null;
                }
                AbstractC3367j.m5097b(c3105o4);
                long j12 = c3105o4.f15709a;
                Object obj50 = list17.get(2);
                C2300k c2300k2 = C2300k.f13231f;
                C0068q2 c0068q217 = AbstractC1582d0.f10220m;
                if (AbstractC3367j.m5096a(obj50, bool7) || obj50 == null) {
                    c2300k = null;
                } else {
                    c2300k = (C2300k) ((InterfaceC3279c) c0068q217.f345g).mo23f(obj50);
                }
                Object obj51 = list17.get(3);
                if (obj51 != null) {
                    c2298i = (C2298i) obj51;
                } else {
                    c2298i = null;
                }
                Object obj52 = list17.get(4);
                if (obj52 != null) {
                    c2299j = (C2299j) obj52;
                } else {
                    c2299j = null;
                }
                Object obj53 = list17.get(6);
                if (obj53 != null) {
                    str8 = (String) obj53;
                } else {
                    str8 = null;
                }
                Object obj54 = list17.get(7);
                AbstractC3367j.m5096a(obj54, bool7);
                if (obj54 != null) {
                    c3105o5 = (C3105o) interfaceC3279c3.mo23f(obj54);
                } else {
                    c3105o5 = null;
                }
                AbstractC3367j.m5097b(c3105o5);
                long j13 = c3105o5.f15709a;
                Object obj55 = list17.get(8);
                C0068q2 c0068q218 = AbstractC1582d0.f10221n;
                if (AbstractC3367j.m5096a(obj55, bool7) || obj55 == null) {
                    c3027a = null;
                } else {
                    c3027a = (C3027a) ((InterfaceC3279c) c0068q218.f345g).mo23f(obj55);
                }
                Object obj56 = list17.get(9);
                C0068q2 c0068q219 = AbstractC1582d0.f10218k;
                if (AbstractC3367j.m5096a(obj56, bool7) || obj56 == null) {
                    c3042p = null;
                } else {
                    c3042p = (C3042p) ((InterfaceC3279c) c0068q219.f345g).mo23f(obj56);
                }
                Object obj57 = list17.get(10);
                C2714b c2714b2 = C2714b.f14562g;
                C0068q2 c0068q220 = AbstractC1582d0.f10226s;
                if (AbstractC3367j.m5096a(obj57, bool7) || obj57 == null) {
                    c2714b = null;
                } else {
                    c2714b = (C2714b) ((InterfaceC3279c) c0068q220.f345g).mo23f(obj57);
                }
                Object obj58 = list17.get(11);
                AbstractC3367j.m5096a(obj58, bool7);
                if (obj58 != null) {
                    if (obj58.equals(bool7)) {
                        c0677s3 = new C0677s(C0677s.f2209g);
                    } else {
                        c0677s3 = new C0677s(AbstractC0659i0.m1403c(((Integer) obj58).intValue()));
                    }
                } else {
                    c0677s3 = null;
                }
                AbstractC3367j.m5097b(c0677s3);
                long j14 = c0677s3.f2211a;
                Object obj59 = list17.get(12);
                C0068q2 c0068q221 = AbstractC1582d0.f10217j;
                if (AbstractC3367j.m5096a(obj59, bool7) || obj59 == null) {
                    c3038l = null;
                } else {
                    c3038l = (C3038l) ((InterfaceC3279c) c0068q221.f345g).mo23f(obj59);
                }
                Object obj60 = list17.get(13);
                C0665l0 c0665l02 = C0665l0.f2176d;
                C0068q2 c0068q222 = AbstractC1582d0.f10222o;
                if (AbstractC3367j.m5096a(obj60, bool7) || obj60 == null) {
                    c0665l0 = null;
                } else {
                    c0665l0 = (C0665l0) ((InterfaceC3279c) c0068q222.f345g).mo23f(obj60);
                }
                return new C1588g0(j11, j12, c2300k, c2298i, c2299j, (AbstractC2305p) null, str8, j13, c3027a, c3042p, c2714b, j14, c3038l, c0665l0, 49184);
            case 26:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list18 = (List) obj;
                Object obj61 = list18.get(0);
                if (obj61 != null) {
                    bool = (Boolean) obj61;
                } else {
                    bool = null;
                }
                AbstractC3367j.m5097b(bool);
                boolean booleanValue = bool.booleanValue();
                Object obj62 = list18.get(1);
                if (obj62 != null) {
                    c1593j = (C1593j) obj62;
                } else {
                    c1593j = null;
                }
                AbstractC3367j.m5097b(c1593j);
                return new C1615x(booleanValue);
            case 27:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Int");
                return new C3031e(((Integer) obj).intValue());
            case 28:
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list19 = (List) obj;
                Object obj63 = list19.get(0);
                if (obj63 != null) {
                    c3044r = (C3044r) obj63;
                } else {
                    c3044r = null;
                }
                AbstractC3367j.m5097b(c3044r);
                int i19 = c3044r.f15616a;
                Object obj64 = list19.get(1);
                if (obj64 != null) {
                    bool2 = (Boolean) obj64;
                } else {
                    bool2 = null;
                }
                AbstractC3367j.m5097b(bool2);
                return new C3045s(i19, bool2.booleanValue());
            default:
                return new C3336c((Map) obj);
        }
    }
}
