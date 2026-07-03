package p001a0;

import android.content.Context;
import android.net.Network;
import com.paoman.lema.FloatingSpeedService;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.SocketFactory;
import p008b.C0242k0;
import p009b0.C0259a;
import p009b0.C0261c;
import p018c0.C0329a;
import p018c0.C0331b;
import p018c0.C0334d;
import p018c0.C0335e;
import p018c0.C0342l;
import p018c0.C0349s;
import p018c0.C0350t;
import p020c2.C0387g;
import p020c2.ScrollCaptureCallbackC0384d;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p034e0.C0600d0;
import p034e0.C0622o0;
import p034e0.C0630s0;
import p034e0.C0639x;
import p039e5.AbstractC0945hr;
import p039e5.AbstractC1092mk;
import p039e5.AbstractC1249rm;
import p039e5.C0721aq;
import p039e5.C0725au;
import p039e5.C1100ms;
import p039e5.C1158oo;
import p039e5.C1196q0;
import p039e5.C1247rk;
import p039e5.C1248rl;
import p039e5.C1467yn;
import p039e5.EnumC0704a9;
import p039e5.EnumC0749bm;
import p053g5.C1689h;
import p053g5.C1694m;
import p054g6.C1718s;
import p054g6.InterfaceC1702d;
import p054g6.InterfaceC1704e;
import p054g6.InterfaceC1713n;
import p056h0.AbstractC1742p;
import p056h0.C1748v;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p063i0.C1843a0;
import p063i0.C1854b2;
import p063i0.C1881e2;
import p063i0.C1960n5;
import p063i0.C1992r5;
import p063i0.C2008t5;
import p063i0.C2016u5;
import p066i3.AbstractC2067b;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p085l0.C2349d1;
import p085l0.C2353e1;
import p085l0.C2361g1;
import p085l0.C2382l2;
import p085l0.C2393o1;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.C2635d;
import p100n.InterfaceC2656k;
import p107o.C2724a1;
import p107o.C2727b1;
import p107o.EnumC2788y0;
import p117p1.C2857h0;
import p117p1.InterfaceC2872w;
import p122q.AbstractC2959x1;
import p137s.C3081j;
import p137s.InterfaceC3079h;
import p137s.InterfaceC3080i;
import p144t.AbstractC3122c;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3469p;
import p170w1.AbstractC3750z1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.p0 */
/* loaded from: classes.dex */
public final class C0062p0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f294i;

    /* renamed from: j */
    public int f295j;

    /* renamed from: k */
    public Object f296k;

    /* renamed from: l */
    public final /* synthetic */ Object f297l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0062p0(Object obj, Object obj2, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f294i = i7;
        this.f296k = obj;
        this.f297l = obj2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f294i) {
            case 0:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 1:
                return ((C0062p0) mo28k((InterfaceC2872w) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 2:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 3:
                ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
                return EnumC2465a.f13750e;
            case 4:
                ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
                return EnumC2465a.f13750e;
            case AbstractC3122c.f15761f /* 5 */:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15759d /* 6 */:
                return ((C0062p0) mo28k((InterfaceC2872w) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 7:
                return ((C0062p0) mo28k((InterfaceC2872w) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 8:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15758c /* 9 */:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15760e /* 10 */:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 11:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 12:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 13:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 14:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15762g /* 15 */:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 16:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 17:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 18:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 19:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 20:
                return ((C0062p0) mo28k(obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 21:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 22:
                return ((C0062p0) mo28k((InterfaceC2872w) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 23:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 24:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 25:
                return ((C0062p0) mo28k((InterfaceC2872w) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 26:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 27:
                return ((C0062p0) mo28k((InterfaceC2872w) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 28:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                return ((C0062p0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f294i) {
            case 0:
                return new C0062p0((InterfaceC2872w) this.f296k, (C0622o0) this.f297l, interfaceC2313c, 0);
            case 1:
                C0062p0 c0062p0 = new C0062p0((C0261c) this.f297l, interfaceC2313c, 1);
                c0062p0.f296k = obj;
                return c0062p0;
            case 2:
                return new C0062p0((C0335e) this.f296k, (C0349s) this.f297l, interfaceC2313c, 2);
            case 3:
                return new C0062p0((InterfaceC0520b1) this.f296k, (C0342l) this.f297l, interfaceC2313c, 3);
            case 4:
                return new C0062p0((C0350t) this.f296k, (C0334d) this.f297l, interfaceC2313c, 4);
            case AbstractC3122c.f15761f /* 5 */:
                return new C0062p0((ScrollCaptureCallbackC0384d) this.f296k, (Runnable) this.f297l, interfaceC2313c, 5);
            case AbstractC3122c.f15759d /* 6 */:
                C0062p0 c0062p02 = new C0062p0((InterfaceC3279c) this.f297l, interfaceC2313c, 6);
                c0062p02.f296k = obj;
                return c0062p02;
            case 7:
                C0062p0 c0062p03 = new C0062p0((InterfaceC0071r1) this.f297l, interfaceC2313c, 7);
                c0062p03.f296k = obj;
                return c0062p03;
            case 8:
                return new C0062p0((C1196q0) this.f297l, interfaceC2313c, 8);
            case AbstractC3122c.f15758c /* 9 */:
                return new C0062p0((Context) this.f296k, (String) this.f297l, interfaceC2313c, 9);
            case AbstractC3122c.f15760e /* 10 */:
                C0062p0 c0062p04 = new C0062p0((FloatingSpeedService) this.f297l, interfaceC2313c, 10);
                c0062p04.f296k = obj;
                return c0062p04;
            case 11:
                C0062p0 c0062p05 = new C0062p0((C2353e1) this.f297l, interfaceC2313c, 11);
                c0062p05.f296k = obj;
                return c0062p05;
            case 12:
                C0062p0 c0062p06 = new C0062p0((C2349d1) this.f297l, interfaceC2313c, 12);
                c0062p06.f296k = obj;
                return c0062p06;
            case 13:
                return new C0062p0((List) this.f296k, (C1248rl) this.f297l, interfaceC2313c, 13);
            case 14:
                return new C0062p0((InetAddress) this.f296k, this.f295j, (Network) this.f297l, interfaceC2313c);
            case AbstractC3122c.f15762g /* 15 */:
                return new C0062p0((InterfaceC2425y0) this.f297l, interfaceC2313c, 15);
            case 16:
                return new C0062p0((C1100ms) this.f296k, (C1248rl) this.f297l, interfaceC2313c, 16);
            case 17:
                return new C0062p0((Long) this.f296k, (C1100ms) this.f297l, interfaceC2313c, 17);
            case 18:
                C0062p0 c0062p07 = new C0062p0((AbstractC1742p) this.f297l, interfaceC2313c, 18);
                c0062p07.f296k = obj;
                return c0062p07;
            case 19:
                return new C0062p0((C1748v) this.f296k, (InterfaceC2656k) this.f297l, interfaceC2313c, 19);
            case 20:
                C0062p0 c0062p08 = new C0062p0((InterfaceC1704e) this.f297l, interfaceC2313c, 20);
                c0062p08.f296k = obj;
                return c0062p08;
            case 21:
                return new C0062p0((InterfaceC3080i) this.f296k, (C3469p) this.f297l, interfaceC2313c, 21);
            case 22:
                C0062p0 c0062p09 = new C0062p0((C0034i0) this.f297l, interfaceC2313c, 22);
                c0062p09.f296k = obj;
                return c0062p09;
            case 23:
                return new C0062p0((C1881e2) this.f296k, (C1854b2) this.f297l, interfaceC2313c, 23);
            case 24:
                return new C0062p0((C1881e2) this.f296k, (InterfaceC3079h) this.f297l, interfaceC2313c, 24);
            case 25:
                C0062p0 c0062p010 = new C0062p0((InterfaceC3277a) this.f297l, interfaceC2313c, 25);
                c0062p010.f296k = obj;
                return c0062p010;
            case 26:
                return new C0062p0((C3081j) this.f296k, (C3469p) this.f297l, interfaceC2313c, 26);
            case 27:
                C0062p0 c0062p011 = new C0062p0((C2016u5) this.f297l, interfaceC2313c, 27);
                c0062p011.f296k = obj;
                return c0062p011;
            case 28:
                return new C0062p0((C2016u5) this.f296k, (C0070r0) this.f297l, interfaceC2313c, 28);
            default:
                return new C0062p0((InterfaceC1702d) this.f296k, (C2393o1) this.f297l, interfaceC2313c, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:348:0x05b4, code lost:
    
        if (r9 == r11) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x06f3, code lost:
    
        if (p032d6.AbstractC0525d0.m1131i(500, r28) != r11) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x06d5, code lost:
    
        if (p032d6.AbstractC0525d0.m1129g(r0, r28) == r11) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0732, code lost:
    
        if (p085l0.AbstractC2418w.m3976s(r1).mo3790m(new p039e5.C1341ul(r0), r28) == r11) goto L392;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x041a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0522 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0506  */
    /* JADX WARN: Type inference failed for: r0v106, types: [g5.h] */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Double] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x0406 -> B:216:0x040a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:264:0x0485 -> B:243:0x048a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:364:0x06f3 -> B:359:0x06d8). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        Iterator it;
        InterfaceC0516a0 interfaceC0516a0;
        C1158oo c1158oo;
        InterfaceC0516a0 interfaceC0516a02;
        InterfaceC0516a0 interfaceC0516a03;
        SocketFactory socketFactory;
        InterfaceC2313c interfaceC2313c;
        String hostAddress;
        String str;
        InterfaceC2425y0 interfaceC2425y0;
        Object m1122A;
        int i7 = this.f294i;
        long j6 = 1000;
        int i8 = 4;
        int i9 = 2;
        int i10 = 0;
        InterfaceC2313c interfaceC2313c2 = null;
        C1694m c1694m = C1694m.f10482a;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        Object obj2 = this.f297l;
        int i11 = 1;
        switch (i7) {
            case 0:
                int i12 = this.f295j;
                if (i12 != 0) {
                    if (i12 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC2872w interfaceC2872w = (InterfaceC2872w) this.f296k;
                C0081u c0081u = new C0081u((C0622o0) obj2, i11);
                this.f295j = 1;
                if (AbstractC2959x1.m4600d(interfaceC2872w, null, null, c0081u, this, 7) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 1:
                int i13 = this.f295j;
                if (i13 != 0) {
                    if (i13 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC2872w interfaceC2872w2 = (InterfaceC2872w) this.f296k;
                C0259a c0259a = new C0259a((C0261c) obj2, interfaceC2313c2, i10);
                this.f295j = 1;
                if (AbstractC2067b.m3282g(interfaceC2872w2, c0259a, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 2:
                int i14 = this.f295j;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1793a0.m2972L(obj);
                        throw new RuntimeException();
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C0329a c0329a = C0329a.f1140g;
                    this.f295j = 1;
                    InterfaceC2318h interfaceC2318h = this.f13999f;
                    AbstractC3367j.m5097b(interfaceC2318h);
                    break;
                }
                InterfaceC1713n m690i = ((C0335e) this.f296k).m690i();
                if (m690i != null) {
                    C0331b c0331b = new C0331b(i10, (C0349s) obj2);
                    this.f295j = 2;
                    C1718s.m2756j((C1718s) m690i, c0331b, this);
                    return enumC2465a;
                }
                return c1694m;
            case 3:
                C0342l c0342l = (C0342l) obj2;
                int i15 = this.f295j;
                try {
                    if (i15 != 0) {
                        if (i15 != 1) {
                            if (i15 != 2) {
                                if (i15 == 3) {
                                    AbstractC1793a0.m2972L(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                AbstractC1793a0.m2972L(obj);
                                c0342l.f1163b.m3730h(0.0f);
                                this.f295j = 3;
                                break;
                            }
                        } else {
                            AbstractC1793a0.m2972L(obj);
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) this.f296k;
                        if (interfaceC0520b1 != null) {
                            this.f295j = 1;
                            break;
                        }
                    }
                    c0342l.f1163b.m3730h(1.0f);
                    this.f295j = 2;
                    if (AbstractC0525d0.m1131i(500L, this) == enumC2465a) {
                        return enumC2465a;
                    }
                    c0342l.f1163b.m3730h(0.0f);
                    this.f295j = 3;
                } catch (Throwable th) {
                    c0342l.f1163b.m3730h(0.0f);
                    throw th;
                }
            case 4:
                int i16 = this.f295j;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                    throw new RuntimeException();
                }
                AbstractC1793a0.m2972L(obj);
                this.f295j = 1;
                AbstractC3750z1.m5758a((C0350t) this.f296k, (C0334d) obj2, this);
                return enumC2465a;
            case AbstractC3122c.f15761f /* 5 */:
                ScrollCaptureCallbackC0384d scrollCaptureCallbackC0384d = (ScrollCaptureCallbackC0384d) this.f296k;
                int i17 = this.f295j;
                if (i17 != 0) {
                    if (i17 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C0387g c0387g = scrollCaptureCallbackC0384d.f1303f;
                    this.f295j = 1;
                    Object m857b = c0387g.m857b(0.0f - c0387g.f1309b, this);
                    if (m857b != enumC2465a) {
                        m857b = c1694m;
                    }
                    if (m857b == enumC2465a) {
                        return enumC2465a;
                    }
                }
                ((C2361g1) scrollCaptureCallbackC0384d.f1300c.f109e).setValue(Boolean.FALSE);
                ((Runnable) obj2).run();
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                int i18 = this.f295j;
                if (i18 != 0) {
                    if (i18 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC2872w interfaceC2872w3 = (InterfaceC2872w) this.f296k;
                C0639x c0639x = new C0639x((InterfaceC3279c) obj2, interfaceC2313c2, i10);
                this.f295j = 1;
                if (((C2857h0) interfaceC2872w3).m4533K0(c0639x, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 7:
                int i19 = this.f295j;
                if (i19 != 0) {
                    if (i19 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                this.f295j = 1;
                Object m1130h = AbstractC0525d0.m1130h(new C0047l1((InterfaceC2872w) this.f296k, (InterfaceC0071r1) obj2, interfaceC2313c2, i10), this);
                if (m1130h != enumC2465a) {
                    m1130h = c1694m;
                }
                if (m1130h == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 8:
                C1196q0 c1196q0 = (C1196q0) obj2;
                ConcurrentHashMap concurrentHashMap = c1196q0.f6968g;
                AtomicBoolean atomicBoolean = c1196q0.f6970i;
                int i20 = this.f295j;
                if (i20 != 0) {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            Iterator it2 = ((Map) c1196q0.f6973l.getValue()).keySet().iterator();
                            while (it2.hasNext()) {
                                c1196q0.m2122V((String) it2.next(), new C0242k0(16));
                            }
                            atomicBoolean.set(true);
                            return c1694m;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f296k;
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    atomicBoolean.set(false);
                    Collection values = concurrentHashMap.values();
                    AbstractC3367j.m5099d(values, "<get-values>(...)");
                    List m3035C0 = AbstractC1805m.m3035C0(values);
                    concurrentHashMap.clear();
                    c1196q0.m2124k();
                    it = m3035C0.iterator();
                }
                while (true) {
                    if (it.hasNext()) {
                        InterfaceC0520b1 interfaceC0520b12 = (InterfaceC0520b1) it.next();
                        AbstractC3367j.m5097b(interfaceC0520b12);
                        this.f296k = it;
                        this.f295j = 1;
                        if (AbstractC0525d0.m1129g(interfaceC0520b12, this) == enumC2465a) {
                        }
                    } else {
                        C0242k0 c0242k0 = new C0242k0(15);
                        this.f296k = null;
                        this.f295j = 2;
                        c1196q0.m2109A(c0242k0);
                        break;
                    }
                }
                return enumC2465a;
            case AbstractC3122c.f15758c /* 9 */:
                int i21 = this.f295j;
                if (i21 != 0) {
                    if (i21 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                this.f295j = 1;
                Serializable m2208A0 = AbstractC1249rm.m2208A0((Context) this.f296k, (String) obj2, EnumC0704a9.f2345f, this);
                if (m2208A0 == enumC2465a) {
                    return enumC2465a;
                }
                return m2208A0;
            case AbstractC3122c.f15760e /* 10 */:
                FloatingSpeedService floatingSpeedService = (FloatingSpeedService) obj2;
                int i22 = this.f295j;
                if (i22 != 0) {
                    if (i22 == 1) {
                        interfaceC0516a0 = (InterfaceC0516a0) this.f296k;
                        AbstractC1793a0.m2972L(obj);
                        C0725au c0725au = floatingSpeedService.f1557u;
                        C0725au m2201t = C1247rk.f7379f.m2201t();
                        if (c0725au == null && m2201t != null) {
                            long max = Math.max(1L, m2201t.f2521c - c0725au.f2521c);
                            long j7 = m2201t.f2519a - c0725au.f2519a;
                            if (j7 < 0) {
                                j7 = 0;
                            }
                            double d7 = max;
                            double d8 = (((j7 * 8.0d) * 1000.0d) / d7) / 1000000.0d;
                            long j8 = m2201t.f2520b - c0725au.f2520b;
                            if (j8 < 0) {
                                j8 = 0;
                            }
                            double d9 = (((j8 * 8.0d) * 1000.0d) / d7) / 1000000.0d;
                            C1158oo c1158oo2 = floatingSpeedService.f1546j;
                            if (c1158oo2 != null) {
                                c1158oo2.m2023f("ROOT Monitor", "网卡实时上下行 · 长按切换单位", floatingSpeedService.m983a(d8), floatingSpeedService.m983a(d9), floatingSpeedService.m987f(), false, false);
                            }
                            C1158oo c1158oo3 = floatingSpeedService.f1546j;
                            if (c1158oo3 != null) {
                                c1158oo3.m2019a((float) d8, (float) d9);
                            }
                        } else {
                            c1158oo = floatingSpeedService.f1546j;
                            if (c1158oo != null) {
                                c1158oo.m2023f("ROOT Monitor", "ROOT Only · 暂无网卡数据", "--", "--", floatingSpeedService.m987f(), false, false);
                            }
                        }
                        floatingSpeedService.f1557u = m2201t;
                        j6 = 1000;
                        i11 = 1;
                        if (AbstractC0525d0.m1139q(interfaceC0516a0) && floatingSpeedService.f1547k == EnumC0749bm.f2844f) {
                            this.f296k = interfaceC0516a0;
                            this.f295j = i11;
                            if (AbstractC0525d0.m1131i(j6, this) == enumC2465a) {
                                return enumC2465a;
                            }
                            C0725au c0725au2 = floatingSpeedService.f1557u;
                            C0725au m2201t2 = C1247rk.f7379f.m2201t();
                            if (c0725au2 == null) {
                            }
                            c1158oo = floatingSpeedService.f1546j;
                            if (c1158oo != null) {
                            }
                            floatingSpeedService.f1557u = m2201t2;
                            j6 = 1000;
                            i11 = 1;
                            return AbstractC0525d0.m1139q(interfaceC0516a0) ? c1694m : c1694m;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                interfaceC0516a0 = (InterfaceC0516a0) this.f296k;
                if (AbstractC0525d0.m1139q(interfaceC0516a0)) {
                }
            case 11:
                int i23 = this.f295j;
                if (i23 != 0) {
                    if (i23 == 1) {
                        interfaceC0516a02 = (InterfaceC0516a0) this.f296k;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    interfaceC0516a02 = (InterfaceC0516a0) this.f296k;
                }
                while (AbstractC0525d0.m1139q(interfaceC0516a02)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    float f7 = AbstractC1092mk.f5952h;
                    ((C2353e1) obj2).m3794h(currentTimeMillis);
                    this.f296k = interfaceC0516a02;
                    this.f295j = 1;
                    if (AbstractC0525d0.m1131i(1000L, this) == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return c1694m;
            case 12:
                int i24 = this.f295j;
                if (i24 != 0) {
                    if (i24 == 1) {
                        interfaceC0516a03 = (InterfaceC0516a0) this.f296k;
                        AbstractC1793a0.m2972L(obj);
                        C2349d1 c2349d1 = (C2349d1) obj2;
                        float f8 = AbstractC1092mk.f5952h;
                        c2349d1.m3742h((c2349d1.m3741g() + 1) % 8);
                        if (AbstractC0525d0.m1139q(interfaceC0516a03)) {
                            this.f296k = interfaceC0516a03;
                            this.f295j = 1;
                            if (AbstractC0525d0.m1131i(30000L, this) == enumC2465a) {
                                return enumC2465a;
                            }
                            C2349d1 c2349d12 = (C2349d1) obj2;
                            float f82 = AbstractC1092mk.f5952h;
                            c2349d12.m3742h((c2349d12.m3741g() + 1) % 8);
                            if (AbstractC0525d0.m1139q(interfaceC0516a03)) {
                                return c1694m;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    interfaceC0516a03 = (InterfaceC0516a0) this.f296k;
                    if (AbstractC0525d0.m1139q(interfaceC0516a03)) {
                    }
                }
            case 13:
                int i25 = this.f295j;
                if (i25 != 0) {
                    if (i25 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C0070r0 c0070r0 = new C0070r0((List) this.f296k, (C1248rl) obj2, interfaceC2313c2, 9);
                this.f295j = 1;
                Object m1130h2 = AbstractC0525d0.m1130h(c0070r0, this);
                if (m1130h2 == enumC2465a) {
                    return enumC2465a;
                }
                return m1130h2;
            case 14:
                AbstractC1793a0.m2972L(obj);
                InetAddress inetAddress = (InetAddress) this.f296k;
                int i26 = this.f295j;
                Network network = (Network) obj2;
                try {
                    if (network != null) {
                        try {
                            socketFactory = network.getSocketFactory();
                            if (socketFactory == null) {
                            }
                            Socket createSocket = socketFactory.createSocket();
                            AbstractC3367j.m5098c(createSocket, "null cannot be cast to non-null type java.net.Socket");
                            long currentTimeMillis2 = System.currentTimeMillis();
                            createSocket.connect(new InetSocketAddress(inetAddress, i26), 2000);
                            double currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                            createSocket.close();
                            interfaceC2313c = Double.valueOf(currentTimeMillis3);
                        } catch (Throwable th2) {
                            interfaceC2313c = AbstractC1793a0.m2985m(th2);
                        }
                        if (!(interfaceC2313c instanceof C1689h)) {
                            interfaceC2313c2 = interfaceC2313c;
                        }
                        Double d10 = (Double) interfaceC2313c2;
                        hostAddress = inetAddress.getHostAddress();
                        if (hostAddress == null) {
                            hostAddress = "";
                        }
                        String str2 = hostAddress;
                        if (inetAddress.getAddress().length != 4) {
                            str = "IPv4";
                        } else {
                            str = "IPv6";
                        }
                        return new C1467yn(str2, str, d10, null, null, 248);
                    }
                    long currentTimeMillis22 = System.currentTimeMillis();
                    createSocket.connect(new InetSocketAddress(inetAddress, i26), 2000);
                    double currentTimeMillis32 = System.currentTimeMillis() - currentTimeMillis22;
                    createSocket.close();
                    interfaceC2313c = Double.valueOf(currentTimeMillis32);
                    if (!(interfaceC2313c instanceof C1689h)) {
                    }
                    Double d102 = (Double) interfaceC2313c2;
                    hostAddress = inetAddress.getHostAddress();
                    if (hostAddress == null) {
                    }
                    String str22 = hostAddress;
                    if (inetAddress.getAddress().length != 4) {
                    }
                    return new C1467yn(str22, str, d102, null, null, 248);
                } finally {
                }
                socketFactory = SocketFactory.getDefault();
                Socket createSocket2 = socketFactory.createSocket();
                AbstractC3367j.m5098c(createSocket2, "null cannot be cast to non-null type java.net.Socket");
            case AbstractC3122c.f15762g /* 15 */:
                int i27 = this.f295j;
                if (i27 != 0) {
                    if (i27 == 1) {
                        interfaceC2425y0 = (InterfaceC2425y0) this.f296k;
                        AbstractC1793a0.m2972L(obj);
                        m1122A = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    interfaceC2425y0 = (InterfaceC2425y0) obj2;
                    C2325e c2325e = AbstractC0549l0.f1898a;
                    ExecutorC2324d executorC2324d = ExecutorC2324d.f13302g;
                    C0721aq c0721aq = new C0721aq(i9, interfaceC2313c2, i10);
                    this.f296k = interfaceC2425y0;
                    this.f295j = 1;
                    m1122A = AbstractC0525d0.m1122A(executorC2324d, c0721aq, this);
                    if (m1122A == enumC2465a) {
                        return enumC2465a;
                    }
                }
                C3137j0 c3137j0 = AbstractC0945hr.f4635a;
                interfaceC2425y0.setValue((Boolean) m1122A);
                return c1694m;
            case 16:
                C1248rl c1248rl = (C1248rl) obj2;
                C1100ms c1100ms = (C1100ms) this.f296k;
                int i28 = this.f295j;
                if (i28 != 0) {
                    if (i28 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f295j = 1;
                    if (AbstractC0525d0.m1131i(250L, this) == enumC2465a) {
                        return enumC2465a;
                    }
                }
                AtomicBoolean atomicBoolean2 = c1100ms.f6079h;
                AtomicBoolean atomicBoolean3 = c1100ms.f6076g;
                AtomicBoolean atomicBoolean4 = c1100ms.f6073f;
                if (!atomicBoolean2.get() && (atomicBoolean4.get() || atomicBoolean3.get())) {
                    boolean m1995o = c1100ms.m1995o(c1248rl);
                    AbstractC1249rm.m2261g0("RESTART readd " + AbstractC1249rm.m2251b0(c1248rl) + " added=" + m1995o);
                    return c1694m;
                }
                AbstractC1249rm.m2234N0("RESTART readd_skipped " + AbstractC1249rm.m2251b0(c1248rl) + " halt=" + c1100ms.f6079h.get() + " runDown=" + atomicBoolean4.get() + " runUp=" + atomicBoolean3.get());
                return c1694m;
            case 17:
                int i29 = this.f295j;
                if (i29 != 0) {
                    if (i29 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    long longValue = ((Long) this.f296k).longValue();
                    this.f295j = 1;
                    if (AbstractC0525d0.m1131i(longValue, this) == enumC2465a) {
                        return enumC2465a;
                    }
                }
                C1247rk c1247rk = C1100ms.f5998o1;
                ((C1100ms) obj2).m1967W0("测速完成");
                return c1694m;
            case 18:
                AbstractC1742p abstractC1742p = (AbstractC1742p) obj2;
                int i30 = this.f295j;
                if (i30 != 0) {
                    if (i30 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC0516a0 interfaceC0516a04 = (InterfaceC0516a0) this.f296k;
                InterfaceC1702d mo3477a = abstractC1742p.f10632s.mo3477a();
                C0600d0 c0600d0 = new C0600d0(i8, abstractC1742p, interfaceC0516a04);
                this.f295j = 1;
                if (mo3477a.mo35f(c0600d0, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 19:
                int i31 = this.f295j;
                if (i31 != 0) {
                    if (i31 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                this.f295j = 1;
                if (C2635d.m4205c((C2635d) ((C1748v) this.f296k).f10652c, new Float(0.0f), (InterfaceC2656k) obj2, null, this, 12) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 20:
                int i32 = this.f295j;
                if (i32 != 0) {
                    if (i32 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                Object obj3 = this.f296k;
                this.f295j = 1;
                if (((InterfaceC1704e) obj2).mo160h(obj3, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 21:
                int i33 = this.f295j;
                if (i33 != 0) {
                    if (i33 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC1702d mo3477a2 = ((InterfaceC3080i) this.f296k).mo3477a();
                C1843a0 c1843a0 = new C1843a0((C3469p) obj2, i10);
                this.f295j = 1;
                if (mo3477a2.mo35f(c1843a0, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 22:
                int i34 = this.f295j;
                if (i34 != 0) {
                    if (i34 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC2872w interfaceC2872w4 = (InterfaceC2872w) this.f296k;
                C0639x c0639x2 = new C0639x((C0034i0) obj2, interfaceC2313c2, i11);
                this.f295j = 1;
                if (AbstractC2067b.m3282g(interfaceC2872w4, c0639x2, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 23:
                int i35 = this.f295j;
                if (i35 != 0) {
                    if (i35 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C1881e2 c1881e2 = (C1881e2) this.f296k;
                C1854b2 c1854b2 = (C1854b2) obj2;
                float f9 = c1854b2.f10944a;
                float f10 = c1854b2.f10945b;
                float f11 = c1854b2.f10947d;
                float f12 = c1854b2.f10946c;
                this.f295j = 1;
                c1881e2.f11131a = f9;
                c1881e2.f11132b = f10;
                c1881e2.f11133c = f11;
                c1881e2.f11134d = f12;
                Object m3116b = c1881e2.m3116b(this);
                if (m3116b != enumC2465a) {
                    m3116b = c1694m;
                }
                if (m3116b == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 24:
                int i36 = this.f295j;
                if (i36 != 0) {
                    if (i36 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                this.f295j = 1;
                if (((C1881e2) this.f296k).m3115a((InterfaceC3079h) obj2, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 25:
                int i37 = this.f295j;
                if (i37 != 0) {
                    if (i37 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC2872w interfaceC2872w5 = (InterfaceC2872w) this.f296k;
                C0630s0 c0630s0 = new C0630s0(i11, (InterfaceC3277a) obj2);
                this.f295j = 1;
                if (AbstractC2959x1.m4600d(interfaceC2872w5, null, null, c0630s0, this, 7) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 26:
                int i38 = this.f295j;
                if (i38 != 0) {
                    if (i38 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C1718s c1718s = ((C3081j) this.f296k).f15679a;
                C1843a0 c1843a02 = new C1843a0((C3469p) obj2, i11);
                this.f295j = 1;
                c1718s.getClass();
                C1718s.m2756j(c1718s, c1843a02, this);
                return enumC2465a;
            case 27:
                C2016u5 c2016u5 = (C2016u5) obj2;
                int i39 = this.f295j;
                if (i39 != 0) {
                    if (i39 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC2872w interfaceC2872w6 = (InterfaceC2872w) this.f296k;
                C1992r5 c1992r5 = new C1992r5(c2016u5, null);
                C1960n5 c1960n5 = new C1960n5(c2016u5, i9);
                this.f295j = 1;
                if (AbstractC2959x1.m4600d(interfaceC2872w6, null, c1992r5, c1960n5, this, 3) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 28:
                C2016u5 c2016u52 = (C2016u5) this.f296k;
                C2361g1 c2361g1 = c2016u52.f11930n;
                int i40 = this.f295j;
                if (i40 != 0) {
                    if (i40 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c2361g1.setValue(Boolean.TRUE);
                    C2727b1 c2727b1 = c2016u52.f11935s;
                    C2008t5 c2008t5 = c2016u52.f11934r;
                    this.f295j = 1;
                    c2727b1.getClass();
                    if (AbstractC0525d0.m1130h(new C2724a1(EnumC2788y0.f14797f, c2727b1, (C0070r0) obj2, c2008t5, null), this) == enumC2465a) {
                        return enumC2465a;
                    }
                }
                c2361g1.setValue(Boolean.FALSE);
                return c1694m;
            default:
                int i41 = this.f295j;
                if (i41 != 0) {
                    if (i41 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC1702d interfaceC1702d = (InterfaceC1702d) this.f296k;
                C2382l2 c2382l2 = new C2382l2((C2393o1) obj2, 1);
                this.f295j = 1;
                if (interfaceC1702d.mo35f(c2382l2, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0062p0(Object obj, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f294i = i7;
        this.f297l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0062p0(InetAddress inetAddress, int i7, Network network, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f294i = 14;
        this.f296k = inetAddress;
        this.f295j = i7;
        this.f297l = network;
    }
}
