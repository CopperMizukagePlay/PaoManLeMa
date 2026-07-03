package p039e5;

import android.content.Context;
import android.net.Network;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import p001a0.AbstractC0094y0;
import p001a0.C0047l1;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1689h;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p060h5.C1814v;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p091l6.AbstractC2479j;
import p091l6.C2477h;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.C3379v;
import p195z5.C3877b;
import p195z5.C3878c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.xt */
/* loaded from: classes.dex */
public final class C1442xt extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public Serializable f9222i;

    /* renamed from: j */
    public int f9223j;

    /* renamed from: k */
    public int f9224k;

    /* renamed from: l */
    public /* synthetic */ Object f9225l;

    /* renamed from: m */
    public final /* synthetic */ String f9226m;

    /* renamed from: n */
    public final /* synthetic */ C1473yt f9227n;

    /* renamed from: o */
    public final /* synthetic */ int f9228o;

    /* renamed from: p */
    public final /* synthetic */ C1194pt f9229p;

    /* renamed from: q */
    public final /* synthetic */ String f9230q;

    /* renamed from: r */
    public final /* synthetic */ Network f9231r;

    /* renamed from: s */
    public final /* synthetic */ Context f9232s;

    /* renamed from: t */
    public final /* synthetic */ C1403wl f9233t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1442xt(String str, C1473yt c1473yt, int i7, C1194pt c1194pt, String str2, Network network, Context context, C1403wl c1403wl, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f9226m = str;
        this.f9227n = c1473yt;
        this.f9228o = i7;
        this.f9229p = c1194pt;
        this.f9230q = str2;
        this.f9231r = network;
        this.f9232s = context;
        this.f9233t = c1403wl;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1442xt) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1442xt c1442xt = new C1442xt(this.f9226m, this.f9227n, this.f9228o, this.f9229p, this.f9230q, this.f9231r, this.f9232s, this.f9233t, interfaceC2313c);
        c1442xt.f9225l = obj;
        return c1442xt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1, types: [l6.i, l6.h] */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, u5.v, java.io.Serializable] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        String str;
        int i7;
        C1473yt c1473yt;
        ?? r27;
        EnumC2465a enumC2465a;
        InterfaceC0516a0 interfaceC0516a0;
        ConcurrentHashMap concurrentHashMap;
        int i8;
        int i9;
        C3379v c3379v;
        int i10;
        Object m2381g;
        Object m2985m;
        String str2;
        Iterable iterable;
        Iterator it;
        int i11;
        int i12;
        Object m1122A;
        String str3;
        String str4;
        String str5;
        String str6;
        Object m2985m2;
        String str7;
        String str8;
        Object obj2;
        String str9;
        int i13 = this.f9224k;
        C1403wl c1403wl = this.f9233t;
        String str10 = "";
        C1473yt c1473yt2 = this.f9227n;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        i12 = this.f9223j;
                        c3379v = (C3379v) this.f9225l;
                        try {
                            AbstractC1793a0.m2972L(obj);
                            m1122A = obj;
                            str = "";
                            c1473yt = c1473yt2;
                            try {
                                m2985m2 = (String) m1122A;
                            } catch (Throwable th) {
                                th = th;
                                m2985m2 = AbstractC1793a0.m2985m(th);
                                obj2 = m2985m2;
                                i11 = i12;
                                if (obj2 instanceof C1689h) {
                                }
                                str9 = (String) obj2;
                                if (str9 != null) {
                                }
                                str7 = str;
                                C1701c0 c1701c0 = c1473yt.f9795d;
                                C1504zt c1504zt = (C1504zt) c1701c0.getValue();
                                List list = (List) c3379v.f16451e;
                                int size = list.size();
                                if (i11 != 0) {
                                }
                                C1504zt m2438a = C1504zt.m2438a(c1504zt, null, size, list, str7, str8, 1567);
                                c1701c0.getClass();
                                c1701c0.m2752j(null, m2438a);
                                return C1694m.f10482a;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str = "";
                            c1473yt = c1473yt2;
                            m2985m2 = AbstractC1793a0.m2985m(th);
                            obj2 = m2985m2;
                            i11 = i12;
                            if (obj2 instanceof C1689h) {
                            }
                            str9 = (String) obj2;
                            if (str9 != null) {
                            }
                            str7 = str;
                            C1701c0 c1701c02 = c1473yt.f9795d;
                            C1504zt c1504zt2 = (C1504zt) c1701c02.getValue();
                            List list2 = (List) c3379v.f16451e;
                            int size2 = list2.size();
                            if (i11 != 0) {
                            }
                            C1504zt m2438a2 = C1504zt.m2438a(c1504zt2, null, size2, list2, str7, str8, 1567);
                            c1701c02.getClass();
                            c1701c02.m2752j(null, m2438a2);
                            return C1694m.f10482a;
                        }
                        obj2 = m2985m2;
                        i11 = i12;
                        if (obj2 instanceof C1689h) {
                            obj2 = null;
                        }
                        str9 = (String) obj2;
                        if (str9 != null) {
                            str7 = str9;
                            C1701c0 c1701c022 = c1473yt.f9795d;
                            C1504zt c1504zt22 = (C1504zt) c1701c022.getValue();
                            List list22 = (List) c3379v.f16451e;
                            int size22 = list22.size();
                            if (i11 != 0) {
                                str8 = "路由追踪完成";
                            } else if (((List) c3379v.f16451e).isEmpty()) {
                                str8 = "追踪失败：设备可能不支持 ping -t";
                            } else {
                                str8 = "路由追踪结束（未到达目标）";
                            }
                            C1504zt m2438a22 = C1504zt.m2438a(c1504zt22, null, size22, list22, str7, str8, 1567);
                            c1701c022.getClass();
                            c1701c022.m2752j(null, m2438a22);
                            return C1694m.f10482a;
                        }
                        str7 = str;
                        C1701c0 c1701c0222 = c1473yt.f9795d;
                        C1504zt c1504zt222 = (C1504zt) c1701c0222.getValue();
                        List list222 = (List) c3379v.f16451e;
                        int size222 = list222.size();
                        if (i11 != 0) {
                        }
                        C1504zt m2438a222 = C1504zt.m2438a(c1504zt222, null, size222, list222, str7, str8, 1567);
                        c1701c0222.getClass();
                        c1701c0222.m2752j(null, m2438a222);
                        return C1694m.f10482a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3379v = (C3379v) this.f9222i;
                try {
                    AbstractC1793a0.m2972L(obj);
                    m2381g = obj;
                    str = "";
                    c1473yt = c1473yt2;
                    r27 = 0;
                    i7 = 1;
                    enumC2465a = enumC2465a2;
                } catch (Throwable th3) {
                    th = th3;
                    str = "";
                    c1473yt = c1473yt2;
                    r27 = 0;
                    i7 = 1;
                    enumC2465a = enumC2465a2;
                    m2985m = AbstractC1793a0.m2985m(th);
                    str3 = r27;
                    if (m2985m instanceof C1689h) {
                    }
                    Map map = (Map) m2985m;
                    Iterable<C1132nt> iterable2 = (Iterable) c3379v.f16451e;
                    ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(iterable2));
                    while (r6.hasNext()) {
                    }
                    i9 = 0;
                    c3379v.f16451e = arrayList;
                    str2 = str3;
                    iterable = (Iterable) c3379v.f16451e;
                    if (iterable instanceof Collection) {
                    }
                    it = iterable.iterator();
                    while (it.hasNext()) {
                    }
                    i11 = i9;
                    if (!((Collection) c3379v.f16451e).isEmpty()) {
                    }
                    str7 = str;
                    C1701c0 c1701c02222 = c1473yt.f9795d;
                    C1504zt c1504zt2222 = (C1504zt) c1701c02222.getValue();
                    List list2222 = (List) c3379v.f16451e;
                    int size2222 = list2222.size();
                    if (i11 != 0) {
                    }
                    C1504zt m2438a2222 = C1504zt.m2438a(c1504zt2222, null, size2222, list2222, str7, str8, 1567);
                    c1701c02222.getClass();
                    c1701c02222.m2752j(null, m2438a2222);
                    return C1694m.f10482a;
                }
                try {
                    m2985m = (Map) m2381g;
                    str3 = r27;
                } catch (Throwable th4) {
                    th = th4;
                    m2985m = AbstractC1793a0.m2985m(th);
                    str3 = r27;
                    if (m2985m instanceof C1689h) {
                    }
                    Map map2 = (Map) m2985m;
                    Iterable<C1132nt> iterable22 = (Iterable) c3379v.f16451e;
                    ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(iterable22));
                    while (r6.hasNext()) {
                    }
                    i9 = 0;
                    c3379v.f16451e = arrayList2;
                    str2 = str3;
                    iterable = (Iterable) c3379v.f16451e;
                    if (iterable instanceof Collection) {
                    }
                    it = iterable.iterator();
                    while (it.hasNext()) {
                    }
                    i11 = i9;
                    if (!((Collection) c3379v.f16451e).isEmpty()) {
                    }
                    str7 = str;
                    C1701c0 c1701c022222 = c1473yt.f9795d;
                    C1504zt c1504zt22222 = (C1504zt) c1701c022222.getValue();
                    List list22222 = (List) c3379v.f16451e;
                    int size22222 = list22222.size();
                    if (i11 != 0) {
                    }
                    C1504zt m2438a22222 = C1504zt.m2438a(c1504zt22222, null, size22222, list22222, str7, str8, 1567);
                    c1701c022222.getClass();
                    c1701c022222.m2752j(null, m2438a22222);
                    return C1694m.f10482a;
                }
                if (m2985m instanceof C1689h) {
                    m2985m = C1814v.f10861e;
                }
                Map map22 = (Map) m2985m;
                Iterable<C1132nt> iterable222 = (Iterable) c3379v.f16451e;
                ArrayList arrayList22 = new ArrayList(AbstractC1807o.m3073U(iterable222));
                for (C1132nt c1132nt : iterable222) {
                    if (!AbstractC3367j.m5096a(c1132nt.f6405b, "*")) {
                        C1434xl c1434xl = (C1434xl) map22.get(c1132nt.f6405b);
                        if (c1434xl != null) {
                            str4 = c1434xl.f8841c;
                        } else {
                            str4 = str3;
                        }
                        if (str4 == null) {
                            str4 = str;
                        }
                        if (c1434xl != null) {
                            str5 = c1434xl.f8839a;
                        } else {
                            str5 = str3;
                        }
                        if (c1434xl != null) {
                            str6 = c1434xl.f8840b;
                        } else {
                            str6 = str3;
                        }
                        List m3067O = AbstractC1806n.m3067O(str5, str6);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : m3067O) {
                            String str11 = (String) obj3;
                            if (str11 != null && !AbstractC0444k.m937a0(str11)) {
                                arrayList3.add(obj3);
                            }
                        }
                        c1132nt = C1132nt.m2012a(c1132nt, str4, AbstractC1805m.m3051o0(arrayList3, " ", null, null, null, 62), false, 159);
                    }
                    arrayList22.add(c1132nt);
                }
                i9 = 0;
                c3379v.f16451e = arrayList22;
                str2 = str3;
                iterable = (Iterable) c3379v.f16451e;
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((C1132nt) it.next()).f6411h) {
                            i11 = i7;
                            break;
                        }
                    }
                }
                i11 = i9;
                if (!((Collection) c3379v.f16451e).isEmpty()) {
                    try {
                        List list3 = (List) c3379v.f16451e;
                        this.f9225l = c3379v;
                        this.f9222i = str2;
                        this.f9223j = i11;
                        this.f9224k = 3;
                        C2325e c2325e = AbstractC0549l0.f1898a;
                        m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0047l1(list3, c1403wl, null, 3), this);
                    } catch (Throwable th5) {
                        th = th5;
                        i12 = i11;
                        m2985m2 = AbstractC1793a0.m2985m(th);
                        obj2 = m2985m2;
                        i11 = i12;
                        if (obj2 instanceof C1689h) {
                        }
                        str9 = (String) obj2;
                        if (str9 != null) {
                        }
                        str7 = str;
                        C1701c0 c1701c0222222 = c1473yt.f9795d;
                        C1504zt c1504zt222222 = (C1504zt) c1701c0222222.getValue();
                        List list222222 = (List) c3379v.f16451e;
                        int size222222 = list222222.size();
                        if (i11 != 0) {
                        }
                        C1504zt m2438a222222 = C1504zt.m2438a(c1504zt222222, null, size222222, list222222, str7, str8, 1567);
                        c1701c0222222.getClass();
                        c1701c0222222.m2752j(null, m2438a222222);
                        return C1694m.f10482a;
                    }
                    if (m1122A != enumC2465a) {
                        i12 = i11;
                        m2985m2 = (String) m1122A;
                        obj2 = m2985m2;
                        i11 = i12;
                        if (obj2 instanceof C1689h) {
                        }
                        str9 = (String) obj2;
                        if (str9 != null) {
                        }
                    }
                    return enumC2465a;
                }
                str7 = str;
                C1701c0 c1701c02222222 = c1473yt.f9795d;
                C1504zt c1504zt2222222 = (C1504zt) c1701c02222222.getValue();
                List list2222222 = (List) c3379v.f16451e;
                int size2222222 = list2222222.size();
                if (i11 != 0) {
                }
                C1504zt m2438a2222222 = C1504zt.m2438a(c1504zt2222222, null, size2222222, list2222222, str7, str8, 1567);
                c1701c02222222.getClass();
                c1701c02222222.m2752j(null, m2438a2222222);
                return C1694m.f10482a;
            }
            concurrentHashMap = (ConcurrentHashMap) this.f9222i;
            InterfaceC0516a0 interfaceC0516a02 = (InterfaceC0516a0) this.f9225l;
            AbstractC1793a0.m2972L(obj);
            str = "";
            r27 = 0;
            i7 = 1;
            enumC2465a = enumC2465a2;
            interfaceC0516a0 = interfaceC0516a02;
            c1473yt = c1473yt2;
        } else {
            AbstractC1793a0.m2972L(obj);
            InterfaceC0516a0 interfaceC0516a03 = (InterfaceC0516a0) this.f9225l;
            Pattern pattern = AbstractC1155ol.f6638a;
            EnumC1124nl m2013a = AbstractC1155ol.m2013a(this.f9226m);
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            AtomicInteger atomicInteger2 = new AtomicInteger(-1);
            int i14 = AbstractC2479j.f13773a;
            EnumC2465a enumC2465a3 = enumC2465a2;
            ?? c2477h = new C2477h(18);
            C1194pt c1194pt = this.f9229p;
            int i15 = c1194pt.f6956a;
            int i16 = this.f9228o;
            C1473yt.m2432c(c1473yt2, AbstractC0094y0.m183j(i16, i15, "并发路由追踪：", " 跳 × 每跳 5 探针（超时 3s，最多重试 ", " 次）..."));
            int i17 = 1;
            C3877b c3877b = new C3877b(1, i16, 1);
            ArrayList arrayList4 = new ArrayList(AbstractC1807o.m3073U(c3877b));
            Iterator it2 = c3877b.iterator();
            while (true) {
                C3878c c3878c = (C3878c) it2;
                if (!c3878c.f18168g) {
                    break;
                }
                int nextInt = c3878c.nextInt();
                C2325e c2325e2 = AbstractC0549l0.f1898a;
                AtomicInteger atomicInteger3 = atomicInteger;
                EnumC2465a enumC2465a4 = enumC2465a3;
                C1194pt c1194pt2 = c1194pt;
                arrayList4.add(AbstractC0525d0.m1125c(interfaceC0516a03, ExecutorC2324d.f13302g, new C1411wt(c1473yt2, atomicInteger2, nextInt, c2477h, this.f9230q, this.f9226m, m2013a, c1194pt2, this.f9231r, this.f9232s, concurrentHashMap2, atomicInteger3, null), 2));
                c1473yt2 = c1473yt2;
                c1194pt = c1194pt2;
                atomicInteger = atomicInteger3;
                enumC2465a3 = enumC2465a4;
                i17 = i17;
                str10 = str10;
            }
            str = str10;
            i7 = i17;
            c1473yt = c1473yt2;
            r27 = 0;
            this.f9225l = interfaceC0516a03;
            this.f9222i = concurrentHashMap2;
            this.f9224k = i7;
            enumC2465a = enumC2465a3;
            if (AbstractC0525d0.m1126d(arrayList4, this) != enumC2465a) {
                interfaceC0516a0 = interfaceC0516a03;
                concurrentHashMap = concurrentHashMap2;
            }
            return enumC2465a;
        }
        ?? obj4 = new Object();
        Collection values = concurrentHashMap.values();
        AbstractC3367j.m5099d(values, "<get-values>(...)");
        ArrayList m2433d = C1473yt.m2433d(AbstractC1805m.m3035C0(values));
        obj4.f16451e = m2433d;
        int size3 = m2433d.size();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i19 < size3) {
                Object obj5 = m2433d.get(i19);
                i19++;
                if (((C1132nt) obj5).f6411h) {
                    break;
                }
                i18++;
            } else {
                i18 = -1;
                break;
            }
        }
        if (i18 >= 0) {
            obj4.f16451e = AbstractC1805m.m3062z0((Iterable) obj4.f16451e, i18 + i7);
        } else {
            List list4 = (List) obj4.f16451e;
            ListIterator listIterator = list4.listIterator(list4.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (!AbstractC3367j.m5096a(((C1132nt) listIterator.previous()).f6405b, "*")) {
                        i8 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i8 = -1;
                    break;
                }
            }
            if (i8 >= 0) {
                int i20 = i8 + i7;
                List m3043g0 = AbstractC1805m.m3043g0((Iterable) obj4.f16451e, i20);
                if (m3043g0.size() >= 3) {
                    if (!m3043g0.isEmpty()) {
                        Iterator it3 = m3043g0.iterator();
                        while (it3.hasNext()) {
                            if (!AbstractC3367j.m5096a(((C1132nt) it3.next()).f6405b, "*")) {
                                break;
                            }
                        }
                    }
                    obj4.f16451e = AbstractC1805m.m3062z0((Iterable) obj4.f16451e, i20);
                }
            }
        }
        if (!((Collection) obj4.f16451e).isEmpty()) {
            Iterable iterable3 = (Iterable) obj4.f16451e;
            if ((iterable3 instanceof Collection) && ((Collection) iterable3).isEmpty()) {
                i10 = 0;
            } else {
                Iterator it4 = iterable3.iterator();
                i10 = 0;
                while (it4.hasNext()) {
                    if (!AbstractC3367j.m5096a(((C1132nt) it4.next()).f6405b, "*") && (i10 = i10 + 1) < 0) {
                        AbstractC1806n.m3071S();
                        throw r27;
                    }
                }
            }
            C1473yt.m2432c(c1473yt, "路由完成，并发查询 Geo（" + i10 + " 节点）...");
            try {
                Iterable iterable4 = (Iterable) obj4.f16451e;
                ArrayList arrayList5 = new ArrayList(AbstractC1807o.m3073U(iterable4));
                Iterator it5 = iterable4.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(((C1132nt) it5.next()).f6405b);
                }
                this.f9225l = interfaceC0516a0;
                this.f9222i = obj4;
                this.f9224k = 2;
                m2381g = C1403wl.m2381g(c1403wl, arrayList5, this);
            } catch (Throwable th6) {
                th = th6;
                c3379v = obj4;
                m2985m = AbstractC1793a0.m2985m(th);
                str3 = r27;
                if (m2985m instanceof C1689h) {
                }
                Map map222 = (Map) m2985m;
                Iterable<C1132nt> iterable2222 = (Iterable) c3379v.f16451e;
                ArrayList arrayList222 = new ArrayList(AbstractC1807o.m3073U(iterable2222));
                while (r6.hasNext()) {
                }
                i9 = 0;
                c3379v.f16451e = arrayList222;
                str2 = str3;
                iterable = (Iterable) c3379v.f16451e;
                if (iterable instanceof Collection) {
                }
                it = iterable.iterator();
                while (it.hasNext()) {
                }
                i11 = i9;
                if (!((Collection) c3379v.f16451e).isEmpty()) {
                }
                str7 = str;
                C1701c0 c1701c022222222 = c1473yt.f9795d;
                C1504zt c1504zt22222222 = (C1504zt) c1701c022222222.getValue();
                List list22222222 = (List) c3379v.f16451e;
                int size22222222 = list22222222.size();
                if (i11 != 0) {
                }
                C1504zt m2438a22222222 = C1504zt.m2438a(c1504zt22222222, null, size22222222, list22222222, str7, str8, 1567);
                c1701c022222222.getClass();
                c1701c022222222.m2752j(null, m2438a22222222);
                return C1694m.f10482a;
            }
            if (m2381g != enumC2465a) {
                c3379v = obj4;
                r27 = r27;
                m2985m = (Map) m2381g;
                str3 = r27;
                if (m2985m instanceof C1689h) {
                }
                Map map2222 = (Map) m2985m;
                Iterable<C1132nt> iterable22222 = (Iterable) c3379v.f16451e;
                ArrayList arrayList2222 = new ArrayList(AbstractC1807o.m3073U(iterable22222));
                while (r6.hasNext()) {
                }
                i9 = 0;
                c3379v.f16451e = arrayList2222;
                str2 = str3;
                iterable = (Iterable) c3379v.f16451e;
                if (iterable instanceof Collection) {
                }
                it = iterable.iterator();
                while (it.hasNext()) {
                }
                i11 = i9;
                if (!((Collection) c3379v.f16451e).isEmpty()) {
                }
                str7 = str;
                C1701c0 c1701c0222222222 = c1473yt.f9795d;
                C1504zt c1504zt222222222 = (C1504zt) c1701c0222222222.getValue();
                List list222222222 = (List) c3379v.f16451e;
                int size222222222 = list222222222.size();
                if (i11 != 0) {
                }
                C1504zt m2438a222222222 = C1504zt.m2438a(c1504zt222222222, null, size222222222, list222222222, str7, str8, 1567);
                c1701c0222222222.getClass();
                c1701c0222222222.m2752j(null, m2438a222222222);
                return C1694m.f10482a;
            }
            return enumC2465a;
        }
        i9 = 0;
        c3379v = obj4;
        str2 = r27;
        iterable = (Iterable) c3379v.f16451e;
        if (iterable instanceof Collection) {
        }
        it = iterable.iterator();
        while (it.hasNext()) {
        }
        i11 = i9;
        if (!((Collection) c3379v.f16451e).isEmpty()) {
        }
        str7 = str;
        C1701c0 c1701c02222222222 = c1473yt.f9795d;
        C1504zt c1504zt2222222222 = (C1504zt) c1701c02222222222.getValue();
        List list2222222222 = (List) c3379v.f16451e;
        int size2222222222 = list2222222222.size();
        if (i11 != 0) {
        }
        C1504zt m2438a2222222222 = C1504zt.m2438a(c1504zt2222222222, null, size2222222222, list2222222222, str7, str8, 1567);
        c1701c02222222222.getClass();
        c1701c02222222222.m2752j(null, m2438a2222222222);
        return C1694m.f10482a;
    }
}
