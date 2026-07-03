package p018c0;

import android.content.Context;
import android.graphics.Rect;
import android.net.Network;
import android.net.Uri;
import android.view.ScrollCaptureSession;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import p001a0.C0019e1;
import p001a0.C0053n;
import p001a0.C0066q0;
import p001a0.C0068q2;
import p001a0.C0073s;
import p001a0.C0087w;
import p008b.C0242k0;
import p017c.C0321f;
import p020c2.ScrollCaptureCallbackC0384d;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p035e1.AbstractC0659i0;
import p039e5.AbstractC1092mk;
import p039e5.AbstractC1155ol;
import p039e5.AbstractC1249rm;
import p039e5.C0703a8;
import p039e5.C0800d9;
import p039e5.C0812dl;
import p039e5.C0877fn;
import p039e5.C0907gl;
import p039e5.C0942ho;
import p039e5.C0990jb;
import p039e5.C1001jm;
import p039e5.C1031kl;
import p039e5.C1062ll;
import p039e5.C1074m2;
import p039e5.C1103n0;
import p039e5.C1156om;
import p039e5.C1196q0;
import p039e5.C1234r7;
import p039e5.C1247rk;
import p039e5.C1248rl;
import p039e5.C1339uj;
import p039e5.C1373vm;
import p039e5.C1403wl;
import p039e5.C1404wm;
import p039e5.C1405wn;
import p039e5.C1434xl;
import p039e5.C1451y7;
import p039e5.EnumC0748bl;
import p039e5.EnumC1127no;
import p039e5.EnumC1342um;
import p039e5.EnumC1359v8;
import p039e5.EnumC1402wk;
import p047f6.EnumC1546a;
import p053g5.C1687f;
import p053g5.C1689h;
import p053g5.C1694m;
import p054g6.AbstractC1709j;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p054g6.C1722w;
import p054g6.C1724y;
import p054g6.C1725z;
import p054g6.EnumC1721v;
import p054g6.InterfaceC1702d;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1817y;
import p060h5.C1813u;
import p060h5.C1814v;
import p061h6.C1828j;
import p061h6.C1839u;
import p082k5.C2319i;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p091l6.C2478i;
import p098m5.AbstractC2590j;
import p099m6.C2623x;
import p100n.AbstractC2641f;
import p100n.C2635d;
import p100n.C2648h0;
import p100n.C2675q0;
import p100n.InterfaceC2656k;
import p107o.EnumC2788y0;
import p122q.C2890a2;
import p122q.C2891b;
import p122q.C2915j;
import p122q.C2929n1;
import p122q.InterfaceC2900e;
import p140s2.C3101k;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p158u5.C3376s;
import p161v0.C3469p;
import p161v0.C3472s;
import p170w1.C3705n0;
import p170w1.C3714p1;
import p174w5.AbstractC3784a;
import p177x0.C3812t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.d */
/* loaded from: classes.dex */
public final class C0334d extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f1147i;

    /* renamed from: j */
    public int f1148j;

    /* renamed from: k */
    public Object f1149k;

    /* renamed from: l */
    public Object f1150l;

    /* renamed from: m */
    public final /* synthetic */ Object f1151m;

    /* renamed from: n */
    public final /* synthetic */ Object f1152n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0334d(int i7, Object obj, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2313c interfaceC2313c, int i8) {
        super(2, interfaceC2313c);
        this.f1147i = i8;
        this.f1148j = i7;
        this.f1149k = obj;
        this.f1150l = c2349d1;
        this.f1151m = interfaceC2425y0;
        this.f1152n = interfaceC2425y02;
    }

    /* renamed from: q */
    private final Object m676q(Object obj) {
        Object obj2;
        String str = (String) this.f1150l;
        int i7 = this.f1148j;
        Object obj3 = null;
        boolean z7 = false;
        try {
            if (i7 != 0) {
                if (i7 == 1) {
                    AbstractC1793a0.m2972L(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC1793a0.m2972L(obj);
                if (AbstractC0444k.m937a0(str) || str.equals("*")) {
                    return "";
                }
                String str2 = (String) this.f1151m;
                if (AbstractC0444k.m937a0(str2)) {
                    str2 = "api.nxtrace.org";
                }
                C1403wl c1403wl = new C1403wl(str2, (String) this.f1152n);
                this.f1148j = 1;
                C2325e c2325e = AbstractC0549l0.f1898a;
                obj = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0341k(str, c1403wl, z7 ? 1 : 0, 11), this);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (obj == enumC2465a) {
                    return enumC2465a;
                }
            }
            C1434xl c1434xl = (C1434xl) obj;
            if (c1434xl != null) {
                List m3067O = AbstractC1806n.m3067O(c1434xl.f8841c, c1434xl.f8839a, c1434xl.f8840b);
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : m3067O) {
                    if (!AbstractC0444k.m937a0((String) obj4)) {
                        arrayList.add(obj4);
                    }
                }
                obj2 = AbstractC1805m.m3051o0(arrayList, " · ", null, null, null, 62);
            } else {
                obj2 = null;
            }
        } catch (Throwable th) {
            obj2 = AbstractC1793a0.m2985m(th);
        }
        if (!(obj2 instanceof C1689h)) {
            obj3 = obj2;
        }
        String str3 = (String) obj3;
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m677s(Object obj) {
        Object m2985m;
        Object m2985m2;
        Collection collection;
        Throwable th;
        Collection collection2;
        Object m2985m3;
        int size;
        int i7;
        Collection collection3;
        int i8 = this.f1148j;
        Object obj2 = null;
        Collection collection4 = C1813u.f10860e;
        if (i8 != 0) {
            if (i8 == 1) {
                collection2 = (List) this.f1149k;
                try {
                    AbstractC1793a0.m2972L(obj);
                } catch (Throwable th2) {
                    th = th2;
                    m2985m3 = AbstractC1793a0.m2985m(th);
                    collection = collection2;
                    if (!(m2985m3 instanceof C1689h)) {
                    }
                    collection3 = (List) obj2;
                    if (collection3 != null) {
                    }
                    ArrayList m3058v0 = AbstractC1805m.m3058v0(collection, collection4);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    size = m3058v0.size();
                    i7 = 0;
                    while (i7 < size) {
                    }
                    return arrayList;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            Pattern pattern = AbstractC1155ol.f6638a;
            String m2015c = AbstractC1155ol.m2015c((String) this.f1150l);
            int ordinal = AbstractC1155ol.m2013a(m2015c).ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return collection4;
                    }
                    throw new RuntimeException();
                }
                Object obj3 = this.f1151m;
                Network network = (Network) obj3;
                try {
                    if (network != null) {
                        InetAddress[] allByName = network.getAllByName(m2015c);
                        AbstractC3367j.m5099d(allByName, "getAllByName(...)");
                        m2985m2 = AbstractC1804l.m3031X(allByName);
                    } else {
                        InetAddress[] allByName2 = InetAddress.getAllByName(m2015c);
                        AbstractC3367j.m5099d(allByName2, "getAllByName(...)");
                        m2985m2 = AbstractC1804l.m3031X(allByName2);
                    }
                } catch (Throwable th3) {
                    m2985m2 = AbstractC1793a0.m2985m(th3);
                }
                if (m2985m2 instanceof C1689h) {
                    m2985m2 = null;
                }
                Collection collection5 = (List) m2985m2;
                if (collection5 == null) {
                    collection = collection4;
                } else {
                    collection = collection5;
                }
                Object obj4 = this.f1152n;
                C1405wn c1405wn = (C1405wn) obj4;
                if (c1405wn != null && c1405wn.m2388b()) {
                    Network network2 = (Network) obj3;
                    C1405wn c1405wn2 = (C1405wn) obj4;
                    try {
                        C1074m2 c1074m2 = C1074m2.f5786a;
                        EnumC1127no enumC1127no = EnumC1127no.f6360g;
                        this.f1149k = collection;
                        this.f1148j = 1;
                        obj = C1074m2.f5786a.m1636a(m2015c, network2, c1405wn2, enumC1127no, null, this);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (obj == enumC2465a) {
                            return enumC2465a;
                        }
                        collection2 = collection;
                    } catch (Throwable th4) {
                        th = th4;
                        collection2 = collection;
                        m2985m3 = AbstractC1793a0.m2985m(th);
                        collection = collection2;
                        if (!(m2985m3 instanceof C1689h)) {
                        }
                        collection3 = (List) obj2;
                        if (collection3 != null) {
                        }
                        ArrayList m3058v02 = AbstractC1805m.m3058v0(collection, collection4);
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        size = m3058v02.size();
                        i7 = 0;
                        while (i7 < size) {
                        }
                        return arrayList2;
                    }
                }
                ArrayList m3058v022 = AbstractC1805m.m3058v0(collection, collection4);
                HashSet hashSet22 = new HashSet();
                ArrayList arrayList22 = new ArrayList();
                size = m3058v022.size();
                i7 = 0;
                while (i7 < size) {
                    Object obj5 = m3058v022.get(i7);
                    i7++;
                    String hostAddress = ((InetAddress) obj5).getHostAddress();
                    if (hostAddress == null) {
                        hostAddress = "";
                    }
                    if (hashSet22.add(hostAddress)) {
                        arrayList22.add(obj5);
                    }
                }
                return arrayList22;
            }
            try {
                m2985m = InetAddress.getByName(m2015c);
            } catch (Throwable th5) {
                m2985m = AbstractC1793a0.m2985m(th5);
            }
            if (m2985m instanceof C1689h) {
                m2985m = null;
            }
            InetAddress inetAddress = (InetAddress) m2985m;
            if (inetAddress != null) {
                obj2 = AbstractC3784a.m5817z(inetAddress);
            }
            if (obj2 != null) {
                return obj2;
            }
            return collection4;
        }
        m2985m3 = ((C1234r7) obj).f7296a;
        collection = collection2;
        if (!(m2985m3 instanceof C1689h)) {
            obj2 = m2985m3;
        }
        collection3 = (List) obj2;
        if (collection3 != null) {
            collection4 = collection3;
        }
        ArrayList m3058v0222 = AbstractC1805m.m3058v0(collection, collection4);
        HashSet hashSet222 = new HashSet();
        ArrayList arrayList222 = new ArrayList();
        size = m3058v0222.size();
        i7 = 0;
        while (i7 < size) {
        }
        return arrayList222;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if (r3.mo35f(r4, r16) == r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r3.mo35f(r4, r16) == r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (p054g6.AbstractC1719t.m2776g(r1, r5, r16) == r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (p054g6.AbstractC1719t.m2773d(r1, r2, r16) == r9) goto L28;
     */
    /* JADX WARN: Type inference failed for: r5v5, types: [m5.j, t5.e] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m678t(Object obj) {
        InterfaceC1702d interfaceC1702d = (InterfaceC1702d) this.f1150l;
        C1701c0 c1701c0 = (C1701c0) this.f1151m;
        int i7 = this.f1148j;
        int i8 = 2;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3 && i7 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f1148j = 3;
                }
            }
            AbstractC1793a0.m2972L(obj);
            return C1694m.f10482a;
        }
        AbstractC1793a0.m2972L(obj);
        C1725z c1725z = (C1725z) this.f1149k;
        if (c1725z == C1722w.f10564a) {
            this.f1148j = 1;
        } else {
            InterfaceC2313c interfaceC2313c = null;
            if (c1725z == C1722w.f10565b) {
                C1839u m3093e = c1701c0.m3093e();
                ?? abstractC2590j = new AbstractC2590j(2, null);
                this.f1148j = 2;
            } else {
                C1839u m3093e2 = c1701c0.m3093e();
                C1724y c1724y = new C1724y(c1725z, null);
                int i9 = AbstractC1709j.f10523a;
                int i10 = 7;
                InterfaceC1702d m2774e = AbstractC1719t.m2774e(AbstractC1719t.m2774e(new C0068q2(i10, new C1828j(c1724y, m3093e2, C2319i.f13273e, -2, EnumC1546a.f10128e), new C0990jb(i8, interfaceC2313c, i8))));
                C0334d c0334d = new C0334d(interfaceC1702d, c1701c0, (Float) this.f1152n, interfaceC2313c, 18);
                this.f1148j = 4;
            }
        }
        return enumC2465a;
    }

    /* renamed from: u */
    private final Object m679u(Object obj) {
        C0334d c0334d;
        C2635d c2635d = (C2635d) this.f1150l;
        int i7 = this.f1148j;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
                c0334d = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            if (!AbstractC3367j.m5096a(this.f1149k, c2635d.f14261e.getValue())) {
                C2635d c2635d2 = (C2635d) this.f1150l;
                Object obj2 = this.f1149k;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f1151m;
                C2675q0 c2675q0 = AbstractC2641f.f14295a;
                InterfaceC2656k interfaceC2656k = (InterfaceC2656k) interfaceC2425y0.getValue();
                this.f1148j = 1;
                c0334d = this;
                Object m4205c = C2635d.m4205c(c2635d2, obj2, interfaceC2656k, null, c0334d, 12);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (m4205c == enumC2465a) {
                    return enumC2465a;
                }
            } else {
                return C1694m.f10482a;
            }
        }
        InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) c0334d.f1152n;
        C2675q0 c2675q02 = AbstractC2641f.f14295a;
        InterfaceC3279c interfaceC3279c = (InterfaceC3279c) interfaceC2425y02.getValue();
        if (interfaceC3279c != null) {
            interfaceC3279c.mo23f(c2635d.m4206d());
        }
        return C1694m.f10482a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
    
        if (p054g6.AbstractC1719t.m2776g(r12, r0, r11) == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0097, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0070, code lost:
    
        if (p085l0.AbstractC2418w.m3976s(mo662j()).mo3790m(r5, r11) == r3) goto L20;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [u5.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [m5.j, t5.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0078 -> B:6:0x0042). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0095 -> B:6:0x0042). Please report as a decompilation issue!!! */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m680v(Object obj) {
        InterfaceC0516a0 interfaceC0516a0;
        C3376s c3376s;
        int i7 = this.f1148j;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    C3376s c3376s2 = (C3376s) this.f1150l;
                    InterfaceC0516a0 interfaceC0516a02 = (InterfaceC0516a0) this.f1149k;
                    AbstractC1793a0.m2972L(obj);
                    c3376s = c3376s2;
                    interfaceC0516a0 = interfaceC0516a02;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C3376s c3376s3 = (C3376s) this.f1150l;
                InterfaceC0516a0 interfaceC0516a03 = (InterfaceC0516a0) this.f1149k;
                AbstractC1793a0.m2972L(obj);
                c3376s = c3376s3;
                interfaceC0516a0 = interfaceC0516a03;
                if (c3376s.f16448e == 0.0f) {
                    C0019e1 m3955D = AbstractC2418w.m3955D(new C0053n(17, interfaceC0516a0));
                    ?? abstractC2590j = new AbstractC2590j(2, null);
                    this.f1149k = interfaceC0516a0;
                    this.f1150l = c3376s;
                    this.f1148j = 2;
                }
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            InterfaceC0516a0 interfaceC0516a04 = (InterfaceC0516a0) this.f1149k;
            ?? obj2 = new Object();
            obj2.f16448e = 1.0f;
            interfaceC0516a0 = interfaceC0516a04;
            c3376s = obj2;
        }
        C0087w c0087w = new C0087w((InterfaceC2425y0) this.f1151m, (C2648h0) this.f1152n, c3376s, interfaceC0516a0, 2);
        this.f1149k = interfaceC0516a0;
        this.f1150l = c3376s;
        this.f1148j = 1;
        if (mo662j().mo853h(C3714p1.f17659e) != null) {
            throw new ClassCastException();
        }
    }

    /* renamed from: w */
    private final Object m681w(Object obj) {
        C2915j c2915j = (C2915j) this.f1150l;
        C2891b c2891b = c2915j.f15184w;
        int i7 = this.f1148j;
        try {
            try {
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC0520b1 m1135m = AbstractC0525d0.m1135m(((InterfaceC0516a0) this.f1149k).mo1107i());
                    c2915j.f15179B = true;
                    C2929n1 c2929n1 = c2915j.f15181t;
                    EnumC2788y0 enumC2788y0 = EnumC2788y0.f14796e;
                    C0073s c0073s = new C0073s((C2890a2) this.f1151m, c2915j, (InterfaceC2900e) this.f1152n, m1135m, (InterfaceC2313c) null, 11);
                    this.f1148j = 1;
                    Object m4592e = c2929n1.m4592e(enumC2788y0, c0073s, this);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m4592e == enumC2465a) {
                        return enumC2465a;
                    }
                }
                c2891b.m4569b();
                c2915j.f15179B = false;
                c2891b.m4568a(null);
                c2915j.f15187z = false;
                return C1694m.f10482a;
            } catch (CancellationException e7) {
                throw e7;
            }
        } catch (Throwable th) {
            c2915j.f15179B = false;
            c2891b.m4568a(null);
            c2915j.f15187z = false;
            throw th;
        }
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f1147i) {
            case 0:
                ((C0334d) mo28k((C3705n0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
                return EnumC2465a.f13750e;
            case 1:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 2:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 3:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 4:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15761f /* 5 */:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15759d /* 6 */:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 7:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 8:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15758c /* 9 */:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15760e /* 10 */:
                C0334d c0334d = (C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m = C1694m.f10482a;
                c0334d.mo29m(c1694m);
                return c1694m;
            case 11:
                C0334d c0334d2 = (C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m2 = C1694m.f10482a;
                c0334d2.mo29m(c1694m2);
                return c1694m2;
            case 12:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 13:
                C0334d c0334d3 = (C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m3 = C1694m.f10482a;
                c0334d3.mo29m(c1694m3);
                return c1694m3;
            case 14:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15762g /* 15 */:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 16:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 17:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 18:
                return ((C0334d) mo28k((EnumC1721v) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 19:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 20:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 21:
                ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
                return EnumC2465a.f13750e;
            case 22:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                return ((C0334d) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [t5.c, u5.k] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f1147i) {
            case 0:
                C0334d c0334d = new C0334d((InterfaceC3279c) this.f1150l, (C0335e) this.f1151m, (C0350t) this.f1152n, interfaceC2313c, 0);
                c0334d.f1149k = obj;
                return c0334d;
            case 1:
                return new C0334d((ScrollCaptureCallbackC0384d) this.f1149k, (ScrollCaptureSession) this.f1150l, (Rect) this.f1151m, (Consumer) this.f1152n, interfaceC2313c, 1);
            case 2:
                return new C0334d((C1196q0) this.f1149k, (C0800d9) this.f1150l, (String) this.f1151m, (Uri) this.f1152n, interfaceC2313c, 2);
            case 3:
                return new C0334d((List) this.f1150l, (C1196q0) this.f1151m, (String) this.f1152n, interfaceC2313c, 3);
            case 4:
                return new C0334d((String) this.f1149k, (String) this.f1150l, (List) this.f1151m, (C1451y7) this.f1152n, interfaceC2313c, 4);
            case AbstractC3122c.f15761f /* 5 */:
                C0334d c0334d2 = new C0334d((Context) this.f1150l, (List) this.f1151m, (C3472s) this.f1152n, interfaceC2313c, 5);
                c0334d2.f1149k = obj;
                return c0334d2;
            case AbstractC3122c.f15759d /* 6 */:
                C0334d c0334d3 = new C0334d((Context) this.f1150l, (InterfaceC2425y0) this.f1151m, (C3472s) this.f1152n, interfaceC2313c, 6);
                c0334d3.f1149k = obj;
                return c0334d3;
            case 7:
                return new C0334d((String) this.f1150l, (C1248rl) this.f1151m, (String) this.f1152n, interfaceC2313c, 7);
            case 8:
                C0334d c0334d4 = new C0334d((List) this.f1150l, (String) this.f1151m, (String) this.f1152n, interfaceC2313c, 8);
                c0334d4.f1149k = obj;
                return c0334d4;
            case AbstractC3122c.f15758c /* 9 */:
                return new C0334d((InterfaceC2425y0) this.f1149k, (Context) this.f1150l, (C3469p) this.f1151m, (InterfaceC2425y0) this.f1152n, interfaceC2313c, 9);
            case AbstractC3122c.f15760e /* 10 */:
                return new C0334d(this.f1148j, (String) this.f1149k, (C2349d1) this.f1150l, (InterfaceC2425y0) this.f1151m, (InterfaceC2425y0) this.f1152n, interfaceC2313c, 10);
            case 11:
                return new C0334d(this.f1148j, (C0942ho) this.f1149k, (C2349d1) this.f1150l, (InterfaceC2425y0) this.f1151m, (InterfaceC2425y0) this.f1152n, interfaceC2313c, 11);
            case 12:
                return new C0334d((C0812dl) this.f1149k, (Network) this.f1150l, (C1405wn) this.f1151m, (EnumC1402wk) this.f1152n, interfaceC2313c, 12);
            case 13:
                return new C0334d((InetSocketAddress) this.f1149k, (C1031kl) this.f1150l, (EnumC0748bl) this.f1151m, this.f1148j, (Network) this.f1152n, interfaceC2313c);
            case 14:
                C0334d c0334d5 = new C0334d((List) this.f1150l, (C2478i) this.f1151m, (C1403wl) this.f1152n, interfaceC2313c, 14);
                c0334d5.f1149k = obj;
                return c0334d5;
            case AbstractC3122c.f15762g /* 15 */:
                C0334d c0334d6 = new C0334d((String) this.f1150l, (String) this.f1151m, (String) this.f1152n, interfaceC2313c, 15);
                c0334d6.f1149k = obj;
                return c0334d6;
            case 16:
                return new C0334d((C1001jm) this.f1149k, (String) this.f1150l, (String) this.f1151m, (String) this.f1152n, interfaceC2313c, 16);
            case 17:
                C0334d c0334d7 = new C0334d((String) this.f1150l, (Network) this.f1151m, (C1405wn) this.f1152n, interfaceC2313c, 17);
                c0334d7.f1149k = obj;
                return c0334d7;
            case 18:
                C0334d c0334d8 = new C0334d((InterfaceC1702d) this.f1150l, (C1701c0) this.f1151m, (Float) this.f1152n, interfaceC2313c, 18);
                c0334d8.f1149k = obj;
                return c0334d8;
            case 19:
                return new C0334d((C1725z) this.f1149k, (InterfaceC1702d) this.f1150l, (C1701c0) this.f1151m, (Float) this.f1152n, interfaceC2313c, 19);
            case 20:
                return new C0334d(this.f1149k, (C2635d) this.f1150l, (InterfaceC2425y0) this.f1151m, (InterfaceC2425y0) this.f1152n, interfaceC2313c, 20);
            case 21:
                C0334d c0334d9 = new C0334d((InterfaceC2425y0) this.f1151m, (C2648h0) this.f1152n, interfaceC2313c);
                c0334d9.f1149k = obj;
                return c0334d9;
            case 22:
                C0334d c0334d10 = new C0334d((C2915j) this.f1150l, (C2890a2) this.f1151m, (InterfaceC2900e) this.f1152n, interfaceC2313c, 22);
                c0334d10.f1149k = obj;
                return c0334d10;
            default:
                C0334d c0334d11 = new C0334d((AbstractC3368k) this.f1150l, (AtomicReference) this.f1151m, (InterfaceC3281e) this.f1152n, interfaceC2313c);
                c0334d11.f1149k = obj;
                return c0334d11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x03a7, code lost:
    
        if (r6 == null) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v1, types: [k5.c] */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v3, types: [k5.c] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r2v80, types: [x0.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v86, types: [x0.t] */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v42, types: [t5.c, u5.k] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        Object m850a;
        List m3042f0;
        Object m2381g;
        String str;
        Object obj2;
        Object m2223I;
        Object obj3;
        Object m2223I2;
        String str2;
        Object m1122A;
        Object m1122A2;
        Object m1122A3;
        InetAddress inetAddress;
        String str3;
        InetSocketAddress inetSocketAddress;
        InetSocketAddress inetSocketAddress2;
        String str4;
        String str5;
        Object obj4;
        InetSocketAddress inetSocketAddress3;
        String str6;
        Object m1126d;
        C1687f c1687f;
        Object obj5;
        Object m1122A4;
        C3812t c3812t;
        ?? r22;
        Object mo22d;
        C1814v c1814v;
        int i7 = this.f1147i;
        C1814v c1814v2 = C1814v.f10861e;
        EnumC1359v8 enumC1359v8 = EnumC1359v8.f8125g;
        int i8 = 0;
        InetSocketAddress inetSocketAddress4 = null;
        C1694m c1694m = C1694m.f10482a;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        int i9 = 1;
        Object obj6 = this.f1151m;
        Object obj7 = this.f1152n;
        switch (i7) {
            case 0:
                int i10 = this.f1148j;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C0073s c0073s = new C0073s((C3705n0) this.f1149k, (InterfaceC3279c) this.f1150l, (C0335e) obj6, (C0350t) obj7, (InterfaceC2313c) null, 3);
                    this.f1148j = 1;
                    if (AbstractC0525d0.m1130h(c0073s, this) == enumC2465a) {
                        return enumC2465a;
                    }
                }
                throw new RuntimeException();
            case 1:
                int i11 = this.f1148j;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m850a = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    ScrollCaptureCallbackC0384d scrollCaptureCallbackC0384d = (ScrollCaptureCallbackC0384d) this.f1149k;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.f1150l;
                    Rect rect = (Rect) obj6;
                    C3101k c3101k = new C3101k(rect.left, rect.top, rect.right, rect.bottom);
                    this.f1148j = 1;
                    m850a = ScrollCaptureCallbackC0384d.m850a(scrollCaptureCallbackC0384d, scrollCaptureSession, c3101k, this);
                    if (m850a == enumC2465a) {
                        return enumC2465a;
                    }
                }
                ((Consumer) obj7).accept(AbstractC0659i0.m1424x((C3101k) m850a));
                return c1694m;
            case 2:
                String str7 = (String) obj6;
                C0800d9 c0800d9 = (C0800d9) this.f1150l;
                C1196q0 c1196q0 = (C1196q0) this.f1149k;
                int i12 = this.f1148j;
                if (i12 != 0) {
                    if (i12 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c1196q0.m2112F(c0800d9).delete();
                    c1196q0.m2134y(c0800d9).delete();
                    c1196q0.m2127n(c0800d9).delete();
                    C0321f c0321f = new C0321f(4, c0800d9, (Uri) obj7);
                    this.f1148j = 1;
                    c1196q0.m2121U(str7, c0321f);
                    if (c1694m == enumC2465a) {
                        return enumC2465a;
                    }
                }
                c1196q0.m2122V(str7, new C0242k0(18));
                return c1694m;
            case 3:
                String str8 = (String) obj7;
                C1196q0 c1196q02 = (C1196q0) obj6;
                int i13 = this.f1148j;
                if (i13 != 0) {
                    if (i13 == 1) {
                        m3042f0 = (List) this.f1149k;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    m3042f0 = AbstractC1805m.m3042f0((List) this.f1150l);
                    C1103n0 c1103n0 = new C1103n0(i8, m3042f0);
                    this.f1149k = m3042f0;
                    this.f1148j = 1;
                    c1196q02.m2121U(str8, c1103n0);
                    if (c1694m == enumC2465a) {
                        return enumC2465a;
                    }
                }
                c1196q02.m2122V(str8, new C1103n0(i9, m3042f0));
                return c1694m;
            case 4:
                List list = (List) obj6;
                C1451y7 c1451y7 = (C1451y7) obj7;
                C1701c0 c1701c0 = c1451y7.f9299e;
                int i14 = this.f1148j;
                try {
                    try {
                        if (i14 != 0) {
                            if (i14 == 1) {
                                AbstractC1793a0.m2972L(obj);
                                m2381g = obj;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC1793a0.m2972L(obj);
                            String str9 = (String) this.f1149k;
                            if (AbstractC0444k.m937a0(str9)) {
                                str9 = "api.nxtrace.org";
                            }
                            C1403wl c1403wl = new C1403wl(str9, (String) this.f1150l);
                            this.f1148j = 1;
                            m2381g = C1403wl.m2381g(c1403wl, list, this);
                            if (m2381g == enumC2465a) {
                                return enumC2465a;
                            }
                        }
                        Map map = (Map) m2381g;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1817y.m3082N(map.size()));
                        for (Object obj8 : map.entrySet()) {
                            linkedHashMap.put(((Map.Entry) obj8).getKey(), C1451y7.m2423a(c1451y7, (C1434xl) ((Map.Entry) obj8).getValue()));
                        }
                        C0703a8 c0703a8 = (C0703a8) c1701c0.getValue();
                        if (linkedHashMap.isEmpty()) {
                            str = "Geo 未返回结果";
                        } else {
                            str = "Geo 完成：" + linkedHashMap.size() + "/" + list.size() + " 条";
                        }
                        C0703a8 m1494a = C0703a8.m1494a(c0703a8, null, linkedHashMap, false, str, 895);
                        c1701c0.getClass();
                        c1701c0.m2752j(null, m1494a);
                    } finally {
                        C0703a8 m1494a2 = C0703a8.m1494a((C0703a8) c1701c0.getValue(), null, null, false, null, 1279);
                        c1701c0.getClass();
                        c1701c0.m2752j(null, m1494a2);
                    }
                } catch (Exception e7) {
                    C0703a8 c0703a82 = (C0703a8) c1701c0.getValue();
                    String message = e7.getMessage();
                    if (message == null) {
                        message = e7.getClass().getSimpleName();
                    }
                    C0703a8 m1494a3 = C0703a8.m1494a(c0703a82, null, null, false, "Geo 查询失败：" + message, 1023);
                    c1701c0.getClass();
                    c1701c0.m2752j(null, m1494a3);
                }
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                int i15 = this.f1148j;
                try {
                    if (i15 != 0) {
                        if (i15 == 1) {
                            AbstractC1793a0.m2972L(obj);
                            m2223I = obj;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        Context context = (Context) this.f1150l;
                        List list2 = (List) obj6;
                        this.f1148j = 1;
                        m2223I = AbstractC1249rm.m2223I(context, list2, this);
                        if (m2223I == enumC2465a) {
                            return enumC2465a;
                        }
                    }
                    obj2 = (Map) m2223I;
                } catch (Throwable th) {
                    obj2 = AbstractC1793a0.m2985m(th);
                }
                Object obj9 = c1814v2;
                if (!(obj2 instanceof C1689h)) {
                    obj9 = obj2;
                }
                C3472s c3472s = (C3472s) obj7;
                for (Map.Entry entry : ((Map) obj9).entrySet()) {
                    c3472s.put((String) entry.getKey(), (String) entry.getValue());
                }
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                int i16 = this.f1148j;
                try {
                    if (i16 != 0) {
                        if (i16 == 1) {
                            AbstractC1793a0.m2972L(obj);
                            m2223I2 = obj;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        Context context2 = (Context) this.f1150l;
                        List list3 = (List) ((InterfaceC2425y0) obj6).getValue();
                        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list3));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C0877fn) it.next()).f4045a);
                        }
                        this.f1148j = 1;
                        m2223I2 = AbstractC1249rm.m2223I(context2, arrayList, this);
                        if (m2223I2 == enumC2465a) {
                            return enumC2465a;
                        }
                    }
                    obj3 = (Map) m2223I2;
                } catch (Throwable th2) {
                    obj3 = AbstractC1793a0.m2985m(th2);
                }
                Object obj10 = c1814v2;
                if (!(obj3 instanceof C1689h)) {
                    obj10 = obj3;
                }
                C3472s c3472s2 = (C3472s) obj7;
                for (Map.Entry entry2 : ((Map) obj10).entrySet()) {
                    c3472s2.put((String) entry2.getKey(), (String) entry2.getValue());
                }
                return c1694m;
            case 7:
                String str10 = (String) obj7;
                String str11 = (String) this.f1150l;
                C1248rl c1248rl = (C1248rl) obj6;
                int i17 = this.f1148j;
                String str12 = 0;
                str12 = 0;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            str2 = (String) this.f1149k;
                            AbstractC1793a0.m2972L(obj);
                            m1122A2 = obj;
                            str12 = (String) m1122A2;
                            return new C1404wm(c1248rl.f7391b, str2, str12, false, false);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                    m1122A = obj;
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (str11 != null && !AbstractC0444k.m937a0(str11)) {
                        C2623x c2623x = C1373vm.f8207a;
                        Network network = c1248rl.f7392c;
                        this.f1148j = 1;
                        C2325e c2325e = AbstractC0549l0.f1898a;
                        m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0066q0(network, EnumC1342um.f7976e, str11, (InterfaceC2313c) str12, 4), this);
                        if (m1122A == enumC2465a) {
                            return enumC2465a;
                        }
                    } else {
                        str2 = null;
                        if (str10 != null && !AbstractC0444k.m937a0(str10)) {
                            C2623x c2623x2 = C1373vm.f8207a;
                            Network network2 = c1248rl.f7392c;
                            this.f1149k = str2;
                            this.f1148j = 2;
                            C2325e c2325e2 = AbstractC0549l0.f1898a;
                            m1122A2 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0066q0(network2, EnumC1342um.f7977f, str10, (InterfaceC2313c) str12, 4), this);
                            if (m1122A2 == enumC2465a) {
                                return enumC2465a;
                            }
                            str12 = (String) m1122A2;
                        }
                        return new C1404wm(c1248rl.f7391b, str2, str12, false, false);
                    }
                }
                str2 = (String) m1122A;
                if (str10 != null) {
                    C2623x c2623x22 = C1373vm.f8207a;
                    Network network22 = c1248rl.f7392c;
                    this.f1149k = str2;
                    this.f1148j = 2;
                    C2325e c2325e22 = AbstractC0549l0.f1898a;
                    m1122A2 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0066q0(network22, EnumC1342um.f7977f, str10, (InterfaceC2313c) str12, 4), this);
                    if (m1122A2 == enumC2465a) {
                    }
                    str12 = (String) m1122A2;
                }
                return new C1404wm(c1248rl.f7391b, str2, str12, false, false);
            case 8:
                int i18 = this.f1148j;
                if (i18 != 0) {
                    if (i18 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f1149k;
                List list4 = (List) this.f1150l;
                String str13 = (String) obj6;
                String str14 = (String) obj7;
                ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list4));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(AbstractC0525d0.m1125c(interfaceC0516a0, null, new C0334d(str13, (C1248rl) it2.next(), str14, null, 7), 3));
                }
                this.f1148j = 1;
                Object m1126d2 = AbstractC0525d0.m1126d(arrayList2, this);
                if (m1126d2 == enumC2465a) {
                    return enumC2465a;
                }
                return m1126d2;
            case AbstractC3122c.f15758c /* 9 */:
                int i19 = this.f1148j;
                if (i19 != 0) {
                    if (i19 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f1148j = 1;
                    if (AbstractC0525d0.m1131i(700L, this) == enumC2465a) {
                        return enumC2465a;
                    }
                }
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f1149k;
                float f7 = AbstractC1092mk.f5952h;
                AbstractC1092mk.m1742V0((Context) this.f1150l, (C3469p) obj6, (InterfaceC2425y0) obj7, ((Boolean) interfaceC2425y0.getValue()).booleanValue());
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                String str15 = (String) this.f1149k;
                AbstractC1793a0.m2972L(obj);
                C2349d1 c2349d1 = (C2349d1) this.f1150l;
                float f8 = AbstractC1092mk.f5952h;
                if (c2349d1.m3741g() == this.f1148j) {
                    ((InterfaceC2425y0) obj6).setValue(str15);
                    InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) obj7;
                    if (AbstractC0444k.m928R(str15, "302 跳转增强", false)) {
                        enumC1359v8 = EnumC1359v8.f8124f;
                    }
                    interfaceC2425y02.setValue(enumC1359v8);
                }
                return c1694m;
            case 11:
                AbstractC1793a0.m2972L(obj);
                C2349d1 c2349d12 = (C2349d1) this.f1150l;
                float f9 = AbstractC1092mk.f5952h;
                if (c2349d12.m3741g() == this.f1148j) {
                    ((InterfaceC2425y0) obj6).setValue(enumC1359v8);
                    ((InterfaceC2425y0) obj7).setValue(AbstractC1092mk.m1702M2((C0942ho) this.f1149k));
                }
                return c1694m;
            case 12:
                EnumC1402wk enumC1402wk = (EnumC1402wk) obj7;
                C0812dl c0812dl = (C0812dl) this.f1149k;
                int i20 = this.f1148j;
                ?? r18 = 0;
                InetAddress inetAddress2 = null;
                if (i20 != 0) {
                    if (i20 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1122A3 = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f1148j = 1;
                    C2325e c2325e3 = AbstractC0549l0.f1898a;
                    m1122A3 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0334d(c0812dl.f3515a, (Network) this.f1150l, (C1405wn) obj6, r18, 17), this);
                    if (m1122A3 == enumC2465a) {
                        return enumC2465a;
                    }
                }
                List list5 = (List) m1122A3;
                int ordinal = enumC1402wk.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            Iterator it3 = list5.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    ?? next = it3.next();
                                    if (((InetAddress) next) instanceof Inet6Address) {
                                        inetAddress2 = next;
                                    }
                                }
                            }
                            inetAddress = inetAddress2;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        Iterator it4 = list5.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                Object next2 = it4.next();
                                if (((InetAddress) next2) instanceof Inet4Address) {
                                    r18 = next2;
                                }
                            }
                        }
                        inetAddress = (InetAddress) r18;
                    }
                } else {
                    inetAddress = (InetAddress) AbstractC1805m.m3047k0(list5);
                }
                InetAddress inetAddress3 = inetAddress;
                if (inetAddress3 != null) {
                    return new InetSocketAddress(inetAddress3, c0812dl.f3516b);
                }
                throw new IllegalStateException((c0812dl.m1518a() + " 无可用 " + enumC1402wk.f8488e + " 地址").toString());
            case 13:
                EnumC0748bl enumC0748bl = (EnumC0748bl) obj6;
                String str16 = enumC0748bl.f2842e;
                C1031kl c1031kl = (C1031kl) this.f1150l;
                C1701c0 c1701c02 = c1031kl.f5307d;
                AbstractC1793a0.m2972L(obj);
                InetSocketAddress inetSocketAddress5 = (InetSocketAddress) this.f1149k;
                if (inetSocketAddress5.getAddress() instanceof Inet6Address) {
                    str3 = "::";
                } else {
                    str3 = "0.0.0.0";
                }
                InetSocketAddress inetSocketAddress6 = new InetSocketAddress(InetAddress.getByName(str3), 0);
                C1062ll c1062ll = (C1062ll) c1701c02.getValue();
                SecureRandom secureRandom = C1031kl.f5303g;
                C1031kl.m1631m(c1031kl, C1062ll.m1635a(c1062ll, null, null, null, C1247rk.m2181b(inetSocketAddress5), null, null, null, null, null, null, null, str16.concat(" Binding Test..."), null, null, 57311));
                C0907gl m1628j = C1031kl.m1628j(c1031kl, inetSocketAddress6, inetSocketAddress5, this.f1148j, (Network) obj7, enumC0748bl);
                if (m1628j == null || (inetSocketAddress = m1628j.f4307c.f3774b) == null) {
                    if (m1628j != null) {
                        inetSocketAddress = m1628j.f4307c.f3773a;
                    } else {
                        inetSocketAddress = null;
                    }
                }
                if (m1628j == null || (inetSocketAddress2 = m1628j.f4307c.f3776d) == null) {
                    if (m1628j != null) {
                        inetSocketAddress2 = m1628j.f4307c.f3775c;
                    } else {
                        inetSocketAddress2 = null;
                    }
                }
                if (m1628j == null) {
                    C1031kl.m1631m(c1031kl, C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, "失败", "失败", "None", "未收到 STUN 响应", null, null, 50175));
                } else {
                    InetSocketAddress inetSocketAddress7 = m1628j.f4305a;
                    if (inetSocketAddress == null) {
                        C1031kl.m1631m(c1031kl, C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, "服务器不支持", "失败", "None", "响应缺少 XOR-MAPPED-ADDRESS", null, null, 50175));
                    } else {
                        C1062ll c1062ll2 = (C1062ll) c1701c02.getValue();
                        String m2181b = C1247rk.m2181b(inetSocketAddress7);
                        String m2181b2 = C1247rk.m2181b(inetSocketAddress);
                        if (inetSocketAddress2 != null) {
                            str4 = C1247rk.m2181b(inetSocketAddress2);
                        } else {
                            str4 = null;
                        }
                        if (str4 == null) {
                            str4 = "";
                        }
                        C1031kl.m1631m(c1031kl, C1062ll.m1635a(c1062ll2, null, null, null, null, m2181b, m2181b2, str4, null, "成功", null, "None", null, null, null, 59967));
                        if (inetSocketAddress.equals(inetSocketAddress7)) {
                            str5 = "Direct";
                        } else if (inetSocketAddress2 != null && !AbstractC3367j.m5096a(inetSocketAddress2.getAddress(), inetSocketAddress5.getAddress()) && inetSocketAddress2.getPort() != inetSocketAddress5.getPort()) {
                            C1031kl.m1631m(c1031kl, C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, null, null, null, str16.concat(" Mapping Test II..."), null, null, 57343));
                            C0907gl m1628j2 = C1031kl.m1628j(c1031kl, inetSocketAddress7, new InetSocketAddress(inetSocketAddress2.getAddress(), inetSocketAddress5.getPort()), this.f1148j, (Network) obj7, enumC0748bl);
                            if (m1628j2 != null) {
                                InetSocketAddress inetSocketAddress8 = m1628j2.f4307c.f3774b;
                                obj4 = inetSocketAddress8;
                                break;
                            }
                            if (m1628j2 != null) {
                                obj4 = m1628j2.f4307c.f3773a;
                            } else {
                                obj4 = null;
                            }
                            if (obj4 != null) {
                                if (obj4.equals(inetSocketAddress)) {
                                    str5 = "Endpoint-Independent Mapping";
                                } else {
                                    C1031kl.m1631m(c1031kl, C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, null, null, null, str16.concat(" Mapping Test III..."), null, null, 57343));
                                    C0907gl m1628j3 = C1031kl.m1628j(c1031kl, inetSocketAddress7, inetSocketAddress2, this.f1148j, (Network) obj7, enumC0748bl);
                                    c1031kl = c1031kl;
                                    if (m1628j3 != null && (inetSocketAddress3 = m1628j3.f4307c.f3774b) != null) {
                                        inetSocketAddress4 = inetSocketAddress3;
                                    } else if (m1628j3 != null) {
                                        inetSocketAddress4 = m1628j3.f4307c.f3773a;
                                    }
                                    if (inetSocketAddress4 != null) {
                                        if (inetSocketAddress4.equals(obj4)) {
                                            str5 = "Address-Dependent Mapping";
                                        } else {
                                            str5 = "Address and Port-Dependent Mapping";
                                        }
                                    }
                                }
                            }
                            str6 = "失败";
                            C1031kl.m1631m(c1031kl, C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, null, str6, "None", "探测完成", null, null, 51199));
                        } else {
                            str5 = "服务器不支持";
                        }
                        str6 = str5;
                        C1031kl.m1631m(c1031kl, C1062ll.m1635a((C1062ll) c1701c02.getValue(), null, null, null, null, null, null, null, null, null, str6, "None", "探测完成", null, null, 51199));
                    }
                }
                return c1694m;
            case 14:
                int i21 = this.f1148j;
                if (i21 != 0) {
                    if (i21 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1126d = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC0516a0 interfaceC0516a02 = (InterfaceC0516a0) this.f1149k;
                    List list6 = (List) this.f1150l;
                    C2478i c2478i = (C2478i) obj6;
                    C1403wl c1403wl2 = (C1403wl) obj7;
                    ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(list6));
                    Iterator it5 = list6.iterator();
                    while (it5.hasNext()) {
                        arrayList3.add(AbstractC0525d0.m1125c(interfaceC0516a02, null, new C1339uj(c2478i, (String) it5.next(), c1403wl2, null), 3));
                    }
                    this.f1148j = 1;
                    m1126d = AbstractC0525d0.m1126d(arrayList3, this);
                    if (m1126d == enumC2465a) {
                        return enumC2465a;
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (C1687f c1687f2 : (Iterable) m1126d) {
                    String str17 = (String) c1687f2.f10471e;
                    C1434xl c1434xl = (C1434xl) c1687f2.f10472f;
                    if (c1434xl != null) {
                        c1687f = new C1687f(str17, c1434xl);
                    } else {
                        c1687f = null;
                    }
                    if (c1687f != null) {
                        arrayList4.add(c1687f);
                    }
                }
                return AbstractC1817y.m3086R(arrayList4);
            case AbstractC3122c.f15762g /* 15 */:
                return m676q(obj);
            case 16:
                C1001jm c1001jm = (C1001jm) this.f1149k;
                int i22 = this.f1148j;
                InterfaceC2313c interfaceC2313c = null;
                if (i22 != 0) {
                    if (i22 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        m1122A4 = obj;
                        obj5 = null;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f1148j = 1;
                    C2325e c2325e4 = AbstractC0549l0.f1898a;
                    obj5 = null;
                    m1122A4 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0334d((String) this.f1150l, (String) obj6, (String) obj7, interfaceC2313c, 15), this);
                    if (m1122A4 == enumC2465a) {
                        return enumC2465a;
                    }
                }
                String str18 = (String) m1122A4;
                if (!AbstractC0444k.m937a0(str18)) {
                    C1701c0 c1701c03 = c1001jm.f5111d;
                    C1156om m2016a = C1156om.m2016a((C1156om) c1701c03.getValue(), str18, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, null, null, 131063);
                    c1701c03.getClass();
                    c1701c03.m2752j(obj5, m2016a);
                    return c1694m;
                }
                return c1694m;
            case 17:
                return m677s(obj);
            case 18:
                C1701c0 c1701c04 = (C1701c0) obj6;
                int i23 = this.f1148j;
                if (i23 != 0) {
                    if (i23 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                int ordinal2 = ((EnumC1721v) this.f1149k).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            Float f10 = (Float) obj7;
                            if (f10 != AbstractC1719t.f10555a) {
                                c1701c04.m2752j(null, f10);
                                return c1694m;
                            }
                            c1701c04.getClass();
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        throw new RuntimeException();
                    }
                    return c1694m;
                }
                InterfaceC1702d interfaceC1702d = (InterfaceC1702d) this.f1150l;
                this.f1148j = 1;
                if (interfaceC1702d.mo35f(c1701c04, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            case 19:
                return m678t(obj);
            case 20:
                return m679u(obj);
            case 21:
                return m680v(obj);
            case 22:
                return m681w(obj);
            default:
                AtomicReference atomicReference = (AtomicReference) obj6;
                int i24 = this.f1148j;
                try {
                    if (i24 != 0) {
                        if (i24 != 1) {
                            if (i24 == 2) {
                                ?? r23 = (C3812t) this.f1149k;
                                AbstractC1793a0.m2972L(obj);
                                mo22d = obj;
                                c1814v2 = r23;
                                c1814v = c1814v2;
                                while (!atomicReference.compareAndSet(c1814v, null) && atomicReference.get() == c1814v) {
                                }
                                return mo22d;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c3812t = (C3812t) this.f1149k;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        InterfaceC0516a0 interfaceC0516a03 = (InterfaceC0516a0) this.f1149k;
                        C3812t c3812t2 = new C3812t(AbstractC0525d0.m1135m(interfaceC0516a03.mo1107i()), ((AbstractC3368k) this.f1150l).mo23f(interfaceC0516a03));
                        C3812t c3812t3 = (C3812t) atomicReference.getAndSet(c3812t2);
                        r22 = c3812t2;
                        if (c3812t3 != null) {
                            InterfaceC0520b1 interfaceC0520b1 = c3812t3.f18006a;
                            this.f1149k = c3812t2;
                            this.f1148j = 1;
                            if (AbstractC0525d0.m1129g(interfaceC0520b1, this) != enumC2465a) {
                                c3812t = c3812t2;
                            } else {
                                return enumC2465a;
                            }
                        }
                        Object obj11 = r22.f18007b;
                        this.f1149k = r22;
                        this.f1148j = 2;
                        mo22d = ((InterfaceC3281e) obj7).mo22d(obj11, this);
                        c1814v2 = r22;
                        if (mo22d == enumC2465a) {
                            return enumC2465a;
                        }
                        c1814v = c1814v2;
                        while (!atomicReference.compareAndSet(c1814v, null)) {
                        }
                        return mo22d;
                    }
                    r22 = c3812t;
                    Object obj112 = r22.f18007b;
                    this.f1149k = r22;
                    this.f1148j = 2;
                    mo22d = ((InterfaceC3281e) obj7).mo22d(obj112, this);
                    c1814v2 = r22;
                    if (mo22d == enumC2465a) {
                    }
                    c1814v = c1814v2;
                    while (!atomicReference.compareAndSet(c1814v, null)) {
                    }
                    return mo22d;
                } catch (Throwable th3) {
                    while (!atomicReference.compareAndSet(c1814v2, null) && atomicReference.get() == c1814v2) {
                    }
                    throw th3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0334d(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f1147i = i7;
        this.f1149k = obj;
        this.f1150l = obj2;
        this.f1151m = obj3;
        this.f1152n = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0334d(Object obj, Object obj2, Object obj3, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f1147i = i7;
        this.f1150l = obj;
        this.f1151m = obj2;
        this.f1152n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0334d(InetSocketAddress inetSocketAddress, C1031kl c1031kl, EnumC0748bl enumC0748bl, int i7, Network network, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f1147i = 13;
        this.f1149k = inetSocketAddress;
        this.f1150l = c1031kl;
        this.f1151m = enumC0748bl;
        this.f1148j = i7;
        this.f1152n = network;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0334d(InterfaceC2425y0 interfaceC2425y0, C2648h0 c2648h0, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f1147i = 21;
        this.f1151m = interfaceC2425y0;
        this.f1152n = c2648h0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0334d(InterfaceC3279c interfaceC3279c, AtomicReference atomicReference, InterfaceC3281e interfaceC3281e, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f1147i = 23;
        this.f1150l = (AbstractC3368k) interfaceC3279c;
        this.f1151m = atomicReference;
        this.f1152n = interfaceC3281e;
    }
}
