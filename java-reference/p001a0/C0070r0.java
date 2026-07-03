package p001a0;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.widget.Toast;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import p009b0.C0259a;
import p018c0.C0334d;
import p018c0.C0341k;
import p024c6.AbstractC0444k;
import p027d1.C0464b;
import p028d2.C0492y;
import p031d5.C0512l;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.EnumC0519b0;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p032d6.InterfaceC0552m0;
import p034e0.C0596b0;
import p034e0.C0600d0;
import p034e0.C0622o0;
import p039e5.AbstractC1249rm;
import p039e5.C0719ao;
import p039e5.C0800d9;
import p039e5.C0910go;
import p039e5.C0918h0;
import p039e5.C0942ho;
import p039e5.C0978j;
import p039e5.C1074m2;
import p039e5.C1100ms;
import p039e5.C1196q0;
import p039e5.C1227r0;
import p039e5.C1234r7;
import p039e5.C1238rb;
import p039e5.C1248rl;
import p039e5.C1403wl;
import p039e5.C1405wn;
import p039e5.C1467yn;
import p039e5.EnumC0704a9;
import p039e5.EnumC1127no;
import p040e6.C1507c;
import p047f6.AbstractC1555j;
import p047f6.C1560o;
import p047f6.EnumC1546a;
import p053g5.C1687f;
import p053g5.C1689h;
import p053g5.C1694m;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p054g6.C1707h;
import p054g6.InterfaceC1702d;
import p054g6.InterfaceC1704e;
import p056h0.C1727a;
import p056h0.C1729c;
import p056h0.C1736j;
import p057h1.C1752b;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1817y;
import p060h5.C1814v;
import p061h6.AbstractC1824f;
import p061h6.C1823e;
import p063i0.C1881e2;
import p063i0.C2008t5;
import p066i3.AbstractC2067b;
import p069i6.AbstractC2100m;
import p071j0.C2121d0;
import p071j0.C2146q;
import p071j0.C2150s;
import p077k.C2194h0;
import p082k5.C2319i;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.C2382l2;
import p085l0.C2393o1;
import p085l0.C2411t1;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2416v0;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p091l6.AbstractC2479j;
import p091l6.C2477h;
import p092m.C2490f;
import p098m5.AbstractC2590j;
import p100n.C2635d;
import p100n.C2643f1;
import p100n.C2649h1;
import p100n.InterfaceC2627a0;
import p107o.C2724a1;
import p107o.C2727b1;
import p107o.EnumC2788y0;
import p117p1.C2857h0;
import p117p1.C2868s;
import p117p1.InterfaceC2872w;
import p122q.C2904f0;
import p122q.C2919k0;
import p122q.C2923l1;
import p122q.C2924m;
import p122q.C2927n;
import p122q.C2929n1;
import p122q.C2940r0;
import p122q.InterfaceC2958x0;
import p137s.C3081j;
import p137s.C3083l;
import p137s.InterfaceC3079h;
import p137s.InterfaceC3080i;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p150t5.InterfaceC3283g;
import p158u5.AbstractC3367j;
import p160v.C3442w;
import p160v.C3444x;
import p162v1.AbstractC3498f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.r0 */
/* loaded from: classes.dex */
public final class C0070r0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f351i;

    /* renamed from: j */
    public int f352j;

    /* renamed from: k */
    public /* synthetic */ Object f353k;

    /* renamed from: l */
    public final /* synthetic */ Object f354l;

    /* renamed from: m */
    public final /* synthetic */ Object f355m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0070r0(C0019e1 c0019e1, InterfaceC0071r1 interfaceC0071r1, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f351i = 1;
        this.f355m = c0019e1;
        this.f354l = interfaceC0071r1;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f351i) {
            case 0:
                return ((C0070r0) mo28k((InterfaceC2872w) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 1:
                return ((C0070r0) mo28k((InterfaceC2872w) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 2:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 3:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 4:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15761f /* 5 */:
                return ((C0070r0) mo28k((C0942ho) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15759d /* 6 */:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 7:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 8:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15758c /* 9 */:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15760e /* 10 */:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 11:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 12:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 13:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 14:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15762g /* 15 */:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 16:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 17:
                return ((C0070r0) mo28k((C2121d0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 18:
                return ((C0070r0) mo28k((C1687f) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 19:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 20:
                return ((C0070r0) mo28k((C2393o1) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 21:
                return ((C0070r0) mo28k((C2393o1) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 22:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 23:
                return ((C0070r0) mo28k((InterfaceC2958x0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 24:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 25:
                return ((C0070r0) mo28k((C2008t5) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 26:
                return ((C0070r0) mo28k((C2923l1) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 27:
                return ((C0070r0) mo28k((InterfaceC2958x0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 28:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                return ((C0070r0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v25, types: [m5.j, t5.f] */
    /* JADX WARN: Type inference failed for: r1v43, types: [m5.j, t5.e] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f351i) {
            case 0:
                C0070r0 c0070r0 = new C0070r0((InterfaceC0071r1) this.f354l, (C0622o0) this.f355m, interfaceC2313c, 0);
                c0070r0.f353k = obj;
                return c0070r0;
            case 1:
                C0070r0 c0070r02 = new C0070r0((C0019e1) this.f355m, (InterfaceC0071r1) this.f354l, interfaceC2313c);
                c0070r02.f353k = obj;
                return c0070r02;
            case 2:
                C0070r0 c0070r03 = new C0070r0((InterfaceC2390n2) this.f354l, (C2635d) this.f355m, interfaceC2313c, 2);
                c0070r03.f353k = obj;
                return c0070r03;
            case 3:
                C0070r0 c0070r04 = new C0070r0((C1196q0) this.f354l, (String) this.f355m, interfaceC2313c, 3);
                c0070r04.f353k = obj;
                return c0070r04;
            case 4:
                return new C0070r0((Context) this.f353k, (String) this.f354l, (InterfaceC2425y0) this.f355m, interfaceC2313c, 4);
            case AbstractC3122c.f15761f /* 5 */:
                C0070r0 c0070r05 = new C0070r0((AtomicLong) this.f354l, (InterfaceC2425y0) this.f355m, interfaceC2313c, 5);
                c0070r05.f353k = obj;
                return c0070r05;
            case AbstractC3122c.f15759d /* 6 */:
                return new C0070r0((Context) this.f353k, (C1227r0) this.f354l, (Uri) this.f355m, interfaceC2313c, 6);
            case 7:
                C0070r0 c0070r06 = new C0070r0((List) this.f354l, (C1403wl) this.f355m, interfaceC2313c, 7);
                c0070r06.f353k = obj;
                return c0070r06;
            case 8:
                C0070r0 c0070r07 = new C0070r0((C0910go) this.f354l, (C1248rl) this.f355m, interfaceC2313c, 8);
                c0070r07.f353k = obj;
                return c0070r07;
            case AbstractC3122c.f15758c /* 9 */:
                C0070r0 c0070r08 = new C0070r0((List) this.f354l, (C1248rl) this.f355m, interfaceC2313c, 9);
                c0070r08.f353k = obj;
                return c0070r08;
            case AbstractC3122c.f15760e /* 10 */:
                return new C0070r0((String) this.f353k, (Network) this.f354l, (C1100ms) this.f355m, interfaceC2313c, 10);
            case 11:
                return new C0070r0((C1736j) this.f353k, (C1729c) this.f354l, (C3083l) this.f355m, interfaceC2313c, 11);
            case 12:
                C0070r0 c0070r09 = new C0070r0((InterfaceC3080i) this.f354l, (C1727a) this.f355m, interfaceC2313c, 12);
                c0070r09.f353k = obj;
                return c0070r09;
            case 13:
                C0070r0 c0070r010 = new C0070r0((InterfaceC1704e) this.f354l, (AbstractC1824f) this.f355m, interfaceC2313c, 13);
                c0070r010.f353k = obj;
                return c0070r010;
            case 14:
                C0070r0 c0070r011 = new C0070r0((InterfaceC3080i) this.f354l, (C1881e2) this.f355m, interfaceC2313c, 14);
                c0070r011.f353k = obj;
                return c0070r011;
            case AbstractC3122c.f15762g /* 15 */:
                return new C0070r0((InterfaceC3281e) this.f354l, this.f353k, (InterfaceC0516a0) this.f355m, interfaceC2313c);
            case 16:
                C0070r0 c0070r012 = new C0070r0((InterfaceC3277a) this.f354l, (InterfaceC3281e) this.f355m, interfaceC2313c, 16);
                c0070r012.f353k = obj;
                return c0070r012;
            case 17:
                C0070r0 c0070r013 = new C0070r0((InterfaceC3282f) this.f354l, (C2150s) this.f355m, interfaceC2313c, 17);
                c0070r013.f353k = obj;
                return c0070r013;
            case 18:
                C0070r0 c0070r014 = new C0070r0((InterfaceC3283g) this.f354l, (C2150s) this.f355m, interfaceC2313c, 18);
                c0070r014.f353k = obj;
                return c0070r014;
            case 19:
                C0070r0 c0070r015 = new C0070r0((C2411t1) this.f354l, (InterfaceC2416v0) this.f355m, interfaceC2313c, 19);
                c0070r015.f353k = obj;
                return c0070r015;
            case 20:
                C0070r0 c0070r016 = new C0070r0((InterfaceC2318h) this.f354l, (InterfaceC1702d) this.f355m, interfaceC2313c, 20);
                c0070r016.f353k = obj;
                return c0070r016;
            case 21:
                C0070r0 c0070r017 = new C0070r0((C2643f1) this.f354l, (InterfaceC2425y0) this.f355m, interfaceC2313c, 21);
                c0070r017.f353k = obj;
                return c0070r017;
            case 22:
                return new C0070r0((C3081j) this.f353k, (InterfaceC3079h) this.f354l, (InterfaceC0552m0) this.f355m, interfaceC2313c, 22);
            case 23:
                C0070r0 c0070r018 = new C0070r0((C2927n) this.f354l, (InterfaceC3281e) this.f355m, interfaceC2313c, 23);
                c0070r018.f353k = obj;
                return c0070r018;
            case 24:
                return new C0070r0((C2927n) this.f353k, (EnumC2788y0) this.f354l, (InterfaceC3281e) this.f355m, interfaceC2313c, 24);
            case 25:
                C0070r0 c0070r019 = new C0070r0((C2904f0) this.f354l, (C2919k0) this.f355m, interfaceC2313c, 25);
                c0070r019.f353k = obj;
                return c0070r019;
            case 26:
                C0070r0 c0070r020 = new C0070r0((C2904f0) this.f354l, (C2929n1) this.f355m, interfaceC2313c, 26);
                c0070r020.f353k = obj;
                return c0070r020;
            case 27:
                C0070r0 c0070r021 = new C0070r0((C2929n1) this.f354l, (InterfaceC3281e) this.f355m, interfaceC2313c);
                c0070r021.f353k = obj;
                return c0070r021;
            case 28:
                return new C0070r0((InterfaceC3282f) this.f353k, (C2940r0) this.f354l, (C2868s) this.f355m, interfaceC2313c);
            default:
                return new C0070r0((C3444x) this.f353k, (InterfaceC2627a0) this.f354l, (C1752b) this.f355m, interfaceC2313c, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:449:0x083e, code lost:
    
        if (r1 == r6) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0861, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x07ce, code lost:
    
        if (p032d6.AbstractC0525d0.m1129g(r7, r17) == r6) goto L424;
     */
    /* JADX WARN: Type inference failed for: r1v95, types: [m5.j, t5.e] */
    /* JADX WARN: Type inference failed for: r1v99, types: [m5.j, t5.f] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        Object obj2;
        Object value;
        LinkedHashMap m3089U;
        Object m1122A;
        String str;
        Object m1130h;
        Object m2985m;
        C1687f c1687f;
        String str2;
        C1467yn m2427a;
        Object m1636a;
        int i7 = 8;
        int i8 = 4;
        int i9 = 9;
        int i10 = 2;
        int i11 = 3;
        int i12 = 0;
        InterfaceC2313c interfaceC2313c = null;
        int i13 = 1;
        switch (this.f351i) {
            case 0:
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                int i14 = this.f352j;
                if (i14 != 0) {
                    if (i14 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C0066q0 c0066q0 = new C0066q0((InterfaceC2872w) this.f353k, (InterfaceC0071r1) this.f354l, (C0622o0) this.f355m, (InterfaceC2313c) null, 0);
                    this.f352j = 1;
                    if (AbstractC0525d0.m1130h(c0066q0, this) == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return C1694m.f10482a;
            case 1:
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                int i15 = this.f352j;
                if (i15 != 0) {
                    if (i15 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC2872w interfaceC2872w = (InterfaceC2872w) this.f353k;
                    C2857h0 c2857h0 = (C2857h0) interfaceC2872w;
                    c2857h0.getClass();
                    C0259a c0259a = new C0259a((C0019e1) this.f355m, new C0512l(AbstractC3498f.m5382v(c2857h0).f16867D), (InterfaceC0071r1) this.f354l, null);
                    this.f352j = 1;
                    if (AbstractC2067b.m3282g(interfaceC2872w, c0259a, this) == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                return C1694m.f10482a;
            case 2:
                EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
                int i16 = this.f352j;
                if (i16 != 0) {
                    if (i16 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f353k;
                    C0019e1 m3955D = AbstractC2418w.m3955D(new C0596b0((InterfaceC2390n2) this.f354l, 1));
                    C0600d0 c0600d0 = new C0600d0(i12, (C2635d) this.f355m, interfaceC0516a0);
                    this.f352j = 1;
                    if (m3955D.mo35f(c0600d0, this) == enumC2465a3) {
                        return enumC2465a3;
                    }
                }
                return C1694m.f10482a;
            case 3:
                C1694m c1694m = C1694m.f10482a;
                String str3 = (String) this.f355m;
                C1196q0 c1196q0 = (C1196q0) this.f354l;
                EnumC2465a enumC2465a4 = EnumC2465a.f13750e;
                int i17 = this.f352j;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            C1701c0 c1701c0 = c1196q0.f6973l;
                            do {
                                value = c1701c0.getValue();
                                Map map = (Map) value;
                                AbstractC3367j.m5100e(map, "<this>");
                                m3089U = AbstractC1817y.m3089U(map);
                                m3089U.remove(str3);
                            } while (!c1701c0.m2750g(value, AbstractC1817y.m3084P(m3089U)));
                            return c1694m;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC0516a0 interfaceC0516a02 = (InterfaceC0516a0) this.f353k;
                    C1196q0.m2095b(c1196q0, str3);
                    InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) c1196q0.f6968g.remove(str3);
                    if (interfaceC0520b1 != null) {
                        this.f353k = interfaceC0516a02;
                        this.f352j = 1;
                        break;
                    }
                }
                Iterator it = ((Iterable) c1196q0.f6971j.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (AbstractC3367j.m5096a(((C0800d9) obj2).f3340a, str3)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                C0800d9 c0800d9 = (C0800d9) obj2;
                if (c0800d9 != null) {
                    String str4 = c0800d9.f3360u;
                    if (!AbstractC0444k.m937a0(str4)) {
                        try {
                            DocumentsContract.deleteDocument(c1196q0.f6962a.getContentResolver(), Uri.parse(str4));
                        } catch (Throwable th) {
                            AbstractC1793a0.m2985m(th);
                        }
                    } else {
                        c1196q0.m2129p(c0800d9).delete();
                    }
                    C1196q0.m2096c(c1196q0, c0800d9);
                    c1196q0.m2112F(c0800d9).delete();
                    c1196q0.m2134y(c0800d9).delete();
                    c1196q0.m2127n(c0800d9).delete();
                }
                C0978j c0978j = new C0978j(str3, 1);
                this.f353k = null;
                this.f352j = 2;
                c1196q0.m2109A(c0978j);
                break;
            case 4:
                EnumC2465a enumC2465a5 = EnumC2465a.f13750e;
                int i18 = this.f352j;
                if (i18 != 0) {
                    if (i18 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                Context context = (Context) this.f353k;
                String str5 = (String) this.f354l;
                EnumC0704a9 enumC0704a9 = (EnumC0704a9) ((InterfaceC2425y0) this.f355m).getValue();
                this.f352j = 1;
                Serializable m2208A0 = AbstractC1249rm.m2208A0(context, str5, enumC0704a9, this);
                if (m2208A0 != enumC2465a5) {
                    return m2208A0;
                }
                return enumC2465a5;
            case AbstractC3122c.f15761f /* 5 */:
                AtomicLong atomicLong = (AtomicLong) this.f354l;
                EnumC2465a enumC2465a6 = EnumC2465a.f13750e;
                int i19 = this.f352j;
                if (i19 != 0) {
                    if (i19 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C0942ho c0942ho = (C0942ho) this.f353k;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j6 = atomicLong.get();
                    if (currentTimeMillis - j6 >= 120 && atomicLong.compareAndSet(j6, currentTimeMillis)) {
                        C2325e c2325e = AbstractC0549l0.f1898a;
                        C1507c c1507c = AbstractC2100m.f12376a;
                        C0341k c0341k = new C0341k(c0942ho, (InterfaceC2425y0) this.f355m, interfaceC2313c, i9);
                        this.f352j = 1;
                        if (AbstractC0525d0.m1122A(c1507c, c0341k, this) == enumC2465a6) {
                            return enumC2465a6;
                        }
                    }
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15759d /* 6 */:
                Context context2 = (Context) this.f353k;
                EnumC2465a enumC2465a7 = EnumC2465a.f13750e;
                int i20 = this.f352j;
                if (i20 != 0) {
                    if (i20 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1122A = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C1238rb c1238rb = C1238rb.f7307a;
                    C1227r0 c1227r0 = (C1227r0) this.f354l;
                    Uri uri = (Uri) this.f355m;
                    this.f352j = 1;
                    C2325e c2325e2 = AbstractC0549l0.f1898a;
                    m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0066q0(context2, c1227r0, uri, (InterfaceC2313c) null, 1), this);
                    if (m1122A == enumC2465a7) {
                        return enumC2465a7;
                    }
                }
                if (((Boolean) m1122A).booleanValue()) {
                    str = "安装包已保存到所选目录";
                } else {
                    str = "保存失败，请重新下载后再试";
                }
                Toast.makeText(context2, str, 0).show();
                return C1694m.f10482a;
            case 7:
                C1403wl c1403wl = (C1403wl) this.f355m;
                EnumC2465a enumC2465a8 = EnumC2465a.f13750e;
                int i21 = this.f352j;
                if (i21 != 0) {
                    if (i21 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                List list = (List) this.f354l;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    String str6 = (String) obj3;
                    if (!AbstractC0444k.m937a0(str6) && !str6.equals("*")) {
                        arrayList.add(obj3);
                    }
                }
                List m3042f0 = AbstractC1805m.m3042f0(arrayList);
                if (m3042f0.isEmpty()) {
                    return C1814v.f10861e;
                }
                if (AbstractC0444k.m937a0(c1403wl.f8494e)) {
                    try {
                        if (AbstractC0444k.m937a0(c1403wl.f8496g) || System.currentTimeMillis() - c1403wl.f8497h >= 1500000) {
                            c1403wl.f8496g = c1403wl.m2386e();
                            c1403wl.f8497h = System.currentTimeMillis();
                        }
                    } catch (Throwable th2) {
                        AbstractC1793a0.m2985m(th2);
                    }
                }
                int i22 = AbstractC2479j.f13773a;
                C0334d c0334d = new C0334d(m3042f0, new C2477h(8), c1403wl, null, 14);
                this.f352j = 1;
                Object m1130h2 = AbstractC0525d0.m1130h(c0334d, this);
                if (m1130h2 == enumC2465a8) {
                    return enumC2465a8;
                }
                return m1130h2;
            case 8:
                C0910go c0910go = (C0910go) this.f354l;
                EnumC2465a enumC2465a9 = EnumC2465a.f13750e;
                int i23 = this.f352j;
                if (i23 != 0) {
                    if (i23 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1130h = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    List<C1467yn> list2 = c0910go.f4326e;
                    ArrayList arrayList2 = new ArrayList();
                    for (C1467yn c1467yn : list2) {
                        try {
                            m2985m = InetAddress.getByName(c1467yn.f9464a);
                        } catch (Throwable th3) {
                            m2985m = AbstractC1793a0.m2985m(th3);
                        }
                        if (m2985m instanceof C1689h) {
                            m2985m = null;
                        }
                        InetAddress inetAddress = (InetAddress) m2985m;
                        if (inetAddress != null) {
                            c1687f = new C1687f(c1467yn.f9464a, inetAddress);
                        } else {
                            c1687f = null;
                        }
                        if (c1687f != null) {
                            arrayList2.add(c1687f);
                        }
                    }
                    List m3035C0 = AbstractC1805m.m3035C0(AbstractC1817y.m3086R(arrayList2).values());
                    int i24 = c0910go.f4325d;
                    Network network = ((C1248rl) this.f355m).f7392c;
                    this.f352j = 1;
                    m1130h = AbstractC0525d0.m1130h(new C0719ao(m3035C0, i24, network, null), this);
                    if (m1130h == enumC2465a9) {
                        return enumC2465a9;
                    }
                }
                List list3 = (List) m1130h;
                int m3082N = AbstractC1817y.m3082N(AbstractC1807o.m3073U(list3));
                if (m3082N < 16) {
                    m3082N = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(m3082N);
                for (Object obj4 : list3) {
                    linkedHashMap.put(((C1467yn) obj4).f9464a, obj4);
                }
                List<C1467yn> list4 = c0910go.f4326e;
                ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(list4));
                for (C1467yn c1467yn2 : list4) {
                    C1467yn c1467yn3 = (C1467yn) linkedHashMap.get(c1467yn2.f9464a);
                    if (c1467yn3 != null) {
                        m2427a = C1467yn.m2427a(c1467yn3, c1467yn2.f9467d, c1467yn2.f9469f, c1467yn2.f9470g, c1467yn2.f9471h, 23);
                    } else {
                        m2427a = C1467yn.m2427a(c1467yn2, null, false, null, null, 239);
                    }
                    arrayList3.add(m2427a);
                }
                C1467yn c1467yn4 = (C1467yn) AbstractC1805m.m3056t0(arrayList3, new C0492y(new C0918h0(7), i11));
                if (c1467yn4 == null || (str2 = c1467yn4.f9464a) == null) {
                    str2 = c0910go.f4327f;
                }
                return C0910go.m1551a(c0910go, arrayList3, str2, 15);
            case AbstractC3122c.f15758c /* 9 */:
                EnumC2465a enumC2465a10 = EnumC2465a.f13750e;
                int i25 = this.f352j;
                if (i25 != 0) {
                    if (i25 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC0516a0 interfaceC0516a03 = (InterfaceC0516a0) this.f353k;
                List list5 = (List) this.f354l;
                C1248rl c1248rl = (C1248rl) this.f355m;
                ArrayList arrayList4 = new ArrayList(AbstractC1807o.m3073U(list5));
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(AbstractC0525d0.m1125c(interfaceC0516a03, null, new C0070r0((C0910go) it2.next(), c1248rl, interfaceC2313c, i7), 3));
                }
                this.f352j = 1;
                Object m1126d = AbstractC0525d0.m1126d(arrayList4, this);
                if (m1126d != enumC2465a10) {
                    return m1126d;
                }
                return enumC2465a10;
            case AbstractC3122c.f15760e /* 10 */:
                EnumC2465a enumC2465a11 = EnumC2465a.f13750e;
                int i26 = this.f352j;
                if (i26 != 0) {
                    if (i26 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1636a = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C1074m2 c1074m2 = C1074m2.f5786a;
                    String str7 = (String) this.f353k;
                    Network network2 = (Network) this.f354l;
                    C1405wn c1405wn = ((C1100ms) this.f355m).f6021H0;
                    EnumC1127no enumC1127no = ((C1100ms) this.f355m).f6019G0;
                    this.f352j = 1;
                    m1636a = C1074m2.f5786a.m1636a(str7, network2, c1405wn, enumC1127no, null, this);
                    if (m1636a == enumC2465a11) {
                        return enumC2465a11;
                    }
                }
                return ((C1234r7) m1636a).f7296a;
            case 11:
                C3083l c3083l = (C3083l) this.f355m;
                C1729c c1729c = (C1729c) this.f354l;
                C2194h0 c2194h0 = c1729c.f10586C;
                EnumC2465a enumC2465a12 = EnumC2465a.f13750e;
                int i27 = this.f352j;
                try {
                    if (i27 != 0) {
                        if (i27 == 1) {
                            AbstractC1793a0.m2972L(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        C1736j c1736j = (C1736j) this.f353k;
                        this.f352j = 1;
                        if (c1736j.m2789a(this) == enumC2465a12) {
                            return enumC2465a12;
                        }
                    }
                    c2194h0.m3596k(c3083l);
                    AbstractC3498f.m5373m(c1729c);
                    return C1694m.f10482a;
                } catch (Throwable th4) {
                    c2194h0.m3596k(c3083l);
                    AbstractC3498f.m5373m(c1729c);
                    throw th4;
                }
            case 12:
                EnumC2465a enumC2465a13 = EnumC2465a.f13750e;
                int i28 = this.f352j;
                if (i28 != 0) {
                    if (i28 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC0516a0 interfaceC0516a04 = (InterfaceC0516a0) this.f353k;
                    InterfaceC1702d mo3477a = ((InterfaceC3080i) this.f354l).mo3477a();
                    C0600d0 c0600d02 = new C0600d0(i11, (C1727a) this.f355m, interfaceC0516a04);
                    this.f352j = 1;
                    if (mo3477a.mo35f(c0600d02, this) == enumC2465a13) {
                        return enumC2465a13;
                    }
                }
                return C1694m.f10482a;
            case 13:
                C1694m c1694m2 = C1694m.f10482a;
                EnumC2465a enumC2465a14 = EnumC2465a.f13750e;
                int i29 = this.f352j;
                if (i29 != 0) {
                    if (i29 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC0516a0 interfaceC0516a05 = (InterfaceC0516a0) this.f353k;
                InterfaceC1704e interfaceC1704e = (InterfaceC1704e) this.f354l;
                AbstractC1824f abstractC1824f = (AbstractC1824f) this.f355m;
                InterfaceC2318h interfaceC2318h = abstractC1824f.f10877e;
                int i30 = abstractC1824f.f10878f;
                if (i30 == -3) {
                    i30 = -2;
                }
                EnumC1546a enumC1546a = abstractC1824f.f10879g;
                EnumC0519b0 enumC0519b0 = EnumC0519b0.f1846g;
                InterfaceC3281e c1823e = new C1823e(abstractC1824f, interfaceC2313c, i12);
                C1560o c1560o = new C1560o(AbstractC0525d0.m1142t(interfaceC0516a05, interfaceC2318h), AbstractC1555j.m2510a(i30, 4, enumC1546a));
                c1560o.m1110l0(enumC0519b0, c1560o, c1823e);
                this.f352j = 1;
                Object m2775f = AbstractC1719t.m2775f(interfaceC1704e, c1560o, true, this);
                if (m2775f != enumC2465a14) {
                    m2775f = c1694m2;
                }
                if (m2775f == enumC2465a14) {
                    return enumC2465a14;
                }
                return c1694m2;
            case 14:
                EnumC2465a enumC2465a15 = EnumC2465a.f13750e;
                int i31 = this.f352j;
                if (i31 != 0) {
                    if (i31 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC0516a0 interfaceC0516a06 = (InterfaceC0516a0) this.f353k;
                    ArrayList arrayList5 = new ArrayList();
                    InterfaceC1702d mo3477a2 = ((InterfaceC3080i) this.f354l).mo3477a();
                    C1707h c1707h = new C1707h(arrayList5, interfaceC0516a06, (C1881e2) this.f355m, i10);
                    this.f352j = 1;
                    if (mo3477a2.mo35f(c1707h, this) == enumC2465a15) {
                        return enumC2465a15;
                    }
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15762g /* 15 */:
                EnumC2465a enumC2465a16 = EnumC2465a.f13750e;
                int i32 = this.f352j;
                if (i32 != 0) {
                    if (i32 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC3281e interfaceC3281e = (InterfaceC3281e) this.f354l;
                    Object obj5 = this.f353k;
                    this.f352j = 1;
                    if (interfaceC3281e.mo22d(obj5, this) == enumC2465a16) {
                        return enumC2465a16;
                    }
                }
                AbstractC0525d0.m1127e((InterfaceC0516a0) this.f355m, new CancellationException());
                return C1694m.f10482a;
            case 16:
                EnumC2465a enumC2465a17 = EnumC2465a.f13750e;
                int i33 = this.f352j;
                if (i33 != 0) {
                    if (i33 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC0516a0 interfaceC0516a07 = (InterfaceC0516a0) this.f353k;
                    Object obj6 = new Object();
                    C0019e1 m3955D2 = AbstractC2418w.m3955D((InterfaceC3277a) this.f354l);
                    C1707h c1707h2 = new C1707h(obj6, interfaceC0516a07, (InterfaceC3281e) this.f355m, i11);
                    this.f352j = 1;
                    if (m3955D2.mo35f(c1707h2, this) == enumC2465a17) {
                        return enumC2465a17;
                    }
                }
                return C1694m.f10482a;
            case 17:
                EnumC2465a enumC2465a18 = EnumC2465a.f13750e;
                int i34 = this.f352j;
                if (i34 != 0) {
                    if (i34 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2121d0 c2121d0 = (C2121d0) this.f353k;
                    InterfaceC3282f interfaceC3282f = (InterfaceC3282f) this.f354l;
                    C2146q c2146q = ((C2150s) this.f355m).f12519l;
                    this.f352j = 1;
                    if (interfaceC3282f.mo24c(c2146q, c2121d0, this) == enumC2465a18) {
                        return enumC2465a18;
                    }
                }
                return C1694m.f10482a;
            case 18:
                EnumC2465a enumC2465a19 = EnumC2465a.f13750e;
                int i35 = this.f352j;
                if (i35 != 0) {
                    if (i35 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C1687f c1687f2 = (C1687f) this.f353k;
                    C2121d0 c2121d02 = (C2121d0) c1687f2.f10471e;
                    Object obj7 = c1687f2.f10472f;
                    InterfaceC3283g interfaceC3283g = (InterfaceC3283g) this.f354l;
                    C2146q c2146q2 = ((C2150s) this.f355m).f12519l;
                    this.f352j = 1;
                    if (interfaceC3283g.mo1493i(c2146q2, c2121d02, obj7, this) == enumC2465a19) {
                        return enumC2465a19;
                    }
                }
                return C1694m.f10482a;
            case 19:
                EnumC2465a enumC2465a20 = EnumC2465a.f13750e;
                int i36 = this.f352j;
                if (i36 != 0) {
                    if (i36 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return C1694m.f10482a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC0516a0 interfaceC0516a08 = (InterfaceC0516a0) this.f353k;
                C2411t1 c2411t1 = (C2411t1) this.f354l;
                InterfaceC2416v0 interfaceC2416v0 = (InterfaceC2416v0) this.f355m;
                this.f352j = 1;
                c2411t1.mo24c(interfaceC0516a08, interfaceC2416v0, this);
                return enumC2465a20;
            case 20:
                InterfaceC1702d interfaceC1702d = (InterfaceC1702d) this.f355m;
                InterfaceC2318h interfaceC2318h2 = (InterfaceC2318h) this.f354l;
                EnumC2465a enumC2465a21 = EnumC2465a.f13750e;
                int i37 = this.f352j;
                if (i37 != 0) {
                    if (i37 != 1 && i37 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2393o1 c2393o1 = (C2393o1) this.f353k;
                    if (AbstractC3367j.m5096a(interfaceC2318h2, C2319i.f13273e)) {
                        C2382l2 c2382l2 = new C2382l2(c2393o1, 0);
                        this.f352j = 1;
                        if (interfaceC1702d.mo35f(c2382l2, this) == enumC2465a21) {
                            return enumC2465a21;
                        }
                    } else {
                        C0062p0 c0062p0 = new C0062p0(interfaceC1702d, c2393o1, interfaceC2313c, 29);
                        this.f352j = 2;
                        if (AbstractC0525d0.m1122A(interfaceC2318h2, c0062p0, this) == enumC2465a21) {
                            return enumC2465a21;
                        }
                    }
                }
                return C1694m.f10482a;
            case 21:
                C2643f1 c2643f1 = (C2643f1) this.f354l;
                EnumC2465a enumC2465a22 = EnumC2465a.f13750e;
                int i38 = this.f352j;
                if (i38 != 0) {
                    if (i38 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2393o1 c2393o12 = (C2393o1) this.f353k;
                    C0019e1 m3955D3 = AbstractC2418w.m3955D(new C2490f(c2643f1, 0));
                    C1707h c1707h3 = new C1707h(c2393o12, c2643f1, (InterfaceC2425y0) this.f355m, i8);
                    this.f352j = 1;
                    if (m3955D3.mo35f(c1707h3, this) == enumC2465a22) {
                        return enumC2465a22;
                    }
                }
                return C1694m.f10482a;
            case 22:
                EnumC2465a enumC2465a23 = EnumC2465a.f13750e;
                int i39 = this.f352j;
                if (i39 != 0) {
                    if (i39 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C3081j c3081j = (C3081j) this.f353k;
                    InterfaceC3079h interfaceC3079h = (InterfaceC3079h) this.f354l;
                    this.f352j = 1;
                    if (c3081j.m4747b(interfaceC3079h, this) == enumC2465a23) {
                        return enumC2465a23;
                    }
                }
                InterfaceC0552m0 interfaceC0552m0 = (InterfaceC0552m0) this.f355m;
                if (interfaceC0552m0 != null) {
                    interfaceC0552m0.mo1155a();
                }
                return C1694m.f10482a;
            case 23:
                C2361g1 c2361g1 = ((C2927n) this.f354l).f15223d;
                EnumC2465a enumC2465a24 = EnumC2465a.f13750e;
                int i40 = this.f352j;
                try {
                    if (i40 != 0) {
                        if (i40 == 1) {
                            AbstractC1793a0.m2972L(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        InterfaceC2958x0 interfaceC2958x0 = (InterfaceC2958x0) this.f353k;
                        c2361g1.setValue(Boolean.TRUE);
                        InterfaceC3281e interfaceC3281e2 = (InterfaceC3281e) this.f355m;
                        this.f352j = 1;
                        if (interfaceC3281e2.mo22d(interfaceC2958x0, this) == enumC2465a24) {
                            return enumC2465a24;
                        }
                    }
                    c2361g1.setValue(Boolean.FALSE);
                    return C1694m.f10482a;
                } catch (Throwable th5) {
                    c2361g1.setValue(Boolean.FALSE);
                    throw th5;
                }
            case 24:
                EnumC2465a enumC2465a25 = EnumC2465a.f13750e;
                int i41 = this.f352j;
                if (i41 != 0) {
                    if (i41 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2927n c2927n = (C2927n) this.f353k;
                    C2727b1 c2727b1 = c2927n.f15222c;
                    C2924m c2924m = c2927n.f15221b;
                    EnumC2788y0 enumC2788y0 = (EnumC2788y0) this.f354l;
                    C0070r0 c0070r0 = new C0070r0(c2927n, (InterfaceC3281e) this.f355m, interfaceC2313c, 23);
                    this.f352j = 1;
                    c2727b1.getClass();
                    if (AbstractC0525d0.m1130h(new C2724a1(enumC2788y0, c2727b1, c0070r0, c2924m, null), this) == enumC2465a25) {
                        return enumC2465a25;
                    }
                }
                return C1694m.f10482a;
            case 25:
                EnumC2465a enumC2465a26 = EnumC2465a.f13750e;
                int i42 = this.f352j;
                if (i42 != 0) {
                    if (i42 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2008t5 c2008t5 = (C2008t5) this.f353k;
                    C2904f0 c2904f0 = (C2904f0) this.f354l;
                    C2649h1 c2649h1 = new C2649h1(i9, c2008t5, (C2919k0) this.f355m);
                    this.f352j = 1;
                    if (c2904f0.mo22d(c2649h1, this) == enumC2465a26) {
                        return enumC2465a26;
                    }
                }
                return C1694m.f10482a;
            case 26:
                EnumC2465a enumC2465a27 = EnumC2465a.f13750e;
                int i43 = this.f352j;
                if (i43 != 0) {
                    if (i43 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2923l1 c2923l1 = (C2923l1) this.f353k;
                    C2904f0 c2904f02 = (C2904f0) this.f354l;
                    C2649h1 c2649h12 = new C2649h1(10, c2923l1, (C2929n1) this.f355m);
                    this.f352j = 1;
                    if (c2904f02.mo22d(c2649h12, this) == enumC2465a27) {
                        return enumC2465a27;
                    }
                }
                return C1694m.f10482a;
            case 27:
                EnumC2465a enumC2465a28 = EnumC2465a.f13750e;
                int i44 = this.f352j;
                if (i44 != 0) {
                    if (i44 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC2958x0 interfaceC2958x02 = (InterfaceC2958x0) this.f353k;
                    C2929n1 c2929n1 = (C2929n1) this.f354l;
                    c2929n1.f15236h = interfaceC2958x02;
                    ?? r12 = (AbstractC2590j) this.f355m;
                    C2923l1 c2923l12 = c2929n1.f15237i;
                    this.f352j = 1;
                    if (r12.mo22d(c2923l12, this) == enumC2465a28) {
                        return enumC2465a28;
                    }
                }
                return C1694m.f10482a;
            case 28:
                EnumC2465a enumC2465a29 = EnumC2465a.f13750e;
                int i45 = this.f352j;
                if (i45 != 0) {
                    if (i45 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    ?? r13 = (AbstractC2590j) this.f353k;
                    C2940r0 c2940r0 = (C2940r0) this.f354l;
                    C0464b c0464b = new C0464b(((C2868s) this.f355m).f15008c);
                    this.f352j = 1;
                    if (r13.mo24c(c2940r0, c0464b, this) == enumC2465a29) {
                        return enumC2465a29;
                    }
                }
                return C1694m.f10482a;
            default:
                C3444x c3444x = (C3444x) this.f353k;
                EnumC2465a enumC2465a30 = EnumC2465a.f13750e;
                int i46 = this.f352j;
                try {
                    if (i46 != 0) {
                        if (i46 == 1) {
                            AbstractC1793a0.m2972L(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        C2635d c2635d = c3444x.f16653p;
                        Float f7 = new Float(0.0f);
                        InterfaceC2627a0 interfaceC2627a0 = (InterfaceC2627a0) this.f354l;
                        C3442w c3442w = new C3442w((C1752b) this.f355m, c3444x, i13);
                        this.f352j = 1;
                        if (C2635d.m4205c(c2635d, f7, interfaceC2627a0, c3442w, this, 4) == enumC2465a30) {
                            return enumC2465a30;
                        }
                    }
                    c3444x.f16648k.setValue(Boolean.TRUE);
                    c3444x.m5192e(false);
                    return C1694m.f10482a;
                } catch (Throwable th6) {
                    int i47 = C3444x.f16637t;
                    c3444x.m5192e(false);
                    throw th6;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0070r0(Object obj, Object obj2, Object obj3, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f351i = i7;
        this.f353k = obj;
        this.f354l = obj2;
        this.f355m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0070r0(Object obj, Object obj2, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f351i = i7;
        this.f354l = obj;
        this.f355m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0070r0(C2929n1 c2929n1, InterfaceC3281e interfaceC3281e, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f351i = 27;
        this.f354l = c2929n1;
        this.f355m = (AbstractC2590j) interfaceC3281e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0070r0(InterfaceC3281e interfaceC3281e, Object obj, InterfaceC0516a0 interfaceC0516a0, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f351i = 15;
        this.f354l = interfaceC3281e;
        this.f353k = obj;
        this.f355m = interfaceC0516a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0070r0(InterfaceC3282f interfaceC3282f, C2940r0 c2940r0, C2868s c2868s, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f351i = 28;
        this.f353k = (AbstractC2590j) interfaceC3282f;
        this.f354l = c2940r0;
        this.f355m = c2868s;
    }
}
