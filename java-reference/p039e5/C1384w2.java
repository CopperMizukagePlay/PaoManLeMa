package p039e5;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a0.AbstractC0094y0;
import p001a0.C0070r0;
import p015b6.AbstractC0307n;
import p015b6.C0295b;
import p015b6.C0301h;
import p015b6.C0302i;
import p015b6.C0312s;
import p017c.C0328m;
import p018c0.C0334d;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0525d0;
import p032d6.C0565q1;
import p053g5.C1689h;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1817y;
import p060h5.C1813u;
import p060h5.C1815w;
import p067i4.AbstractC2072e;
import p073j2.AbstractC2168e;
import p077k.C2221w;
import p082k5.InterfaceC2313c;
import p085l0.AbstractC2422x0;
import p085l0.C2335a;
import p085l0.C2350d2;
import p085l0.C2395p;
import p085l0.C2429z1;
import p085l0.InterfaceC2425y0;
import p093m0.C2511a;
import p093m0.C2513b;
import p093m0.InterfaceC2528i0;
import p144t.AbstractC3122c;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p153u0.C3343j;
import p158u5.AbstractC3367j;
import p161v0.C3472s;
import p169w0.C3644a;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.w2 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1384w2 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f8287e;

    /* renamed from: f */
    public final /* synthetic */ Object f8288f;

    /* renamed from: g */
    public final /* synthetic */ Object f8289g;

    /* renamed from: h */
    public final /* synthetic */ Object f8290h;

    public /* synthetic */ C1384w2(int i7, Object obj, Object obj2, InterfaceC3279c interfaceC3279c) {
        this.f8287e = i7;
        this.f8288f = interfaceC3279c;
        this.f8290h = obj;
        this.f8289g = obj2;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7;
        int i8;
        Object m2985m;
        Integer num;
        int i9 = this.f8287e;
        int i10 = 3;
        InterfaceC2313c interfaceC2313c = null;
        C1694m c1694m = C1694m.f10482a;
        Object obj = this.f8289g;
        Object obj2 = this.f8288f;
        Object obj3 = this.f8290h;
        switch (i9) {
            case 0:
                List list = (List) obj3;
                ((InterfaceC2425y0) obj).setValue(Integer.valueOf(list.size()));
                ((InterfaceC3279c) obj2).mo23f(AbstractC1805m.m3059w0(list, new C0716al("")));
                return c1694m;
            case 1:
                ((InterfaceC3279c) obj2).mo23f(((C1248rl) obj3).f7390a);
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                ((InterfaceC2425y0) obj).setValue(Boolean.FALSE);
                return c1694m;
            case 2:
                ((InterfaceC3279c) obj2).mo23f(((C0877fn) obj3).f4045a);
                C3137j0 c3137j02 = AbstractC1172p7.f6835a;
                ((InterfaceC2425y0) obj).setValue(Boolean.FALSE);
                return c1694m;
            case 3:
                ((InterfaceC3279c) obj2).mo23f(obj3);
                C3137j0 c3137j03 = AbstractC1172p7.f6835a;
                ((InterfaceC2425y0) obj).setValue(Boolean.FALSE);
                return c1694m;
            case 4:
                ((InterfaceC3279c) obj2).mo23f((EnumC1125nm) obj3);
                C3137j0 c3137j04 = AbstractC1172p7.f6835a;
                ((InterfaceC2425y0) obj).setValue(Boolean.FALSE);
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                ((InterfaceC3279c) obj2).mo23f((EnumC1163ot) obj3);
                C3137j0 c3137j05 = AbstractC1172p7.f6835a;
                ((InterfaceC2425y0) obj).setValue(Boolean.FALSE);
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                C1451y7 c1451y7 = (C1451y7) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                C1701c0 c1701c0 = c1451y7.f9299e;
                AbstractC3367j.m5100e(str, "publicApiHost");
                AbstractC3367j.m5100e(str2, "apiV4Token");
                C0565q1 c0565q1 = c1451y7.f9298d;
                if (c0565q1 != null) {
                    c0565q1.mo1114c(null);
                }
                List m2424b = C1451y7.m2424b((C0703a8) c1701c0.getValue());
                if (m2424b.isEmpty()) {
                    c1701c0.m2752j(null, C0703a8.m1494a((C0703a8) c1701c0.getValue(), null, null, false, "没有可查询的地址", 1023));
                } else {
                    c1701c0.m2752j(null, C0703a8.m1494a((C0703a8) c1701c0.getValue(), null, null, true, AbstractC0094y0.m184k(m2424b.size(), "Geo 查询中（0/", "）…"), 767));
                    c1451y7.f9298d = AbstractC0525d0.m1141s(c1451y7.f9295a, null, new C0334d(str, str2, m2424b, c1451y7, (InterfaceC2313c) null, 4), 3);
                }
                return c1694m;
            case 7:
                Context context = (Context) obj3;
                AbstractC1249rm.m2219G((InterfaceC2425y0) obj, false);
                String str3 = ((C0800d9) obj2).f3341b;
                Object systemService = context.getSystemService("clipboard");
                AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("下载链接", str3));
                Toast.makeText(context, "下载链接已复制", 0).show();
                return c1694m;
            case 8:
                C1196q0 c1196q0 = (C1196q0) obj3;
                AbstractC1249rm.m2219G((InterfaceC2425y0) obj, false);
                String str4 = ((C0800d9) obj2).f3340a;
                AbstractC3367j.m5100e(str4, "id");
                AbstractC0525d0.m1141s(c1196q0.f6966e, null, new C0070r0(c1196q0, str4, interfaceC2313c, i10), 3);
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                C1196q0 c1196q02 = (C1196q0) obj3;
                AbstractC0525d0.m1141s(c1196q02.f6966e, null, new C1257s(c1196q02, ((Boolean) ((InterfaceC2425y0) obj).getValue()).booleanValue(), null), 3);
                ((InterfaceC2425y0) obj2).setValue(Boolean.FALSE);
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                Context context2 = (Context) obj3;
                String str5 = ((String) obj2) + ":" + ((C1394wc) obj).f8330f;
                Object systemService2 = context2.getSystemService("clipboard");
                AbstractC3367j.m5098c(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText("iperf3", str5));
                Toast.makeText(context2, "已复制：" + str5, 0).show();
                return c1694m;
            case 11:
                ((InterfaceC3279c) obj2).mo23f(((C0834ec) obj3).f3671a);
                C3137j0 c3137j06 = AbstractC1302td.f7786a;
                ((InterfaceC2425y0) obj).setValue(Boolean.FALSE);
                return c1694m;
            case 12:
                Object obj4 = C1813u.f10860e;
                C1270sc c1270sc = (C1270sc) obj3;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj2;
                C3137j0 c3137j07 = AbstractC1302td.f7786a;
                Integer m973O = AbstractC0451r.m973O((String) ((InterfaceC2425y0) obj).getValue());
                if (m973O != null) {
                    i7 = AbstractC2168e.m3530q(m973O.intValue(), 1, 65535);
                } else {
                    i7 = 5201;
                }
                int i11 = i7;
                Integer m973O2 = AbstractC0451r.m973O((String) interfaceC2425y0.getValue());
                if (m973O2 != null) {
                    i8 = AbstractC2168e.m3530q(m973O2.intValue(), 1, 600);
                } else {
                    i8 = 1;
                }
                c1270sc.m2331u();
                Context context3 = c1270sc.f7554d;
                if (context3 == null) {
                    c1270sc.m2328p("应用上下文未就绪");
                } else {
                    c1270sc.f7552b.set(true);
                    c1270sc.f7553c.set(false);
                    int m3530q = AbstractC2168e.m3530q(i8, 1, 600);
                    try {
                        ArrayList list2 = Collections.list(NetworkInterface.getNetworkInterfaces());
                        AbstractC3367j.m5099d(list2, "list(...)");
                        C0301h c0301h = new C0301h(AbstractC1805m.m3039c0(list2), true, new C0866fc(0));
                        C0866fc c0866fc = new C0866fc(1);
                        C0312s c0312s = C0312s.f1107m;
                        C0295b c0295b = new C0295b(AbstractC0307n.m667F(new C0301h(new C0302i(c0301h, c0866fc, 0), true, new C0866fc(2)), new C0866fc(3)).iterator(), new C3343j(0));
                        if (!c0295b.hasNext()) {
                            m2985m = obj4;
                        } else {
                            Object next = c0295b.next();
                            if (!c0295b.hasNext()) {
                                m2985m = AbstractC3784a.m5817z(next);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(next);
                                while (c0295b.hasNext()) {
                                    arrayList.add(c0295b.next());
                                }
                                m2985m = arrayList;
                            }
                        }
                    } catch (Throwable th) {
                        m2985m = AbstractC1793a0.m2985m(th);
                    }
                    if (!(m2985m instanceof C1689h)) {
                        obj4 = m2985m;
                    }
                    C1813u c1813u = (List) obj4;
                    String str6 = (String) AbstractC1805m.m3047k0(c1813u);
                    if (str6 == null) {
                        str6 = "0.0.0.0";
                    }
                    C1701c0 c1701c02 = c1270sc.f7559i;
                    C1394wc c1394wc = new C1394wc(EnumC1363vc.f8154f, "正在启动 iperf3 服务端…", null, null, i11, c1813u, "HBCS-IPERF3://" + str6 + ":" + i11, null, 0, 0, m3530q, 2094872);
                    c1701c02.getClass();
                    c1701c02.m2752j(null, c1394wc);
                    c1270sc.f7556f = AbstractC0525d0.m1141s(c1270sc.f7551a, null, new C1239rc(context3, i11, c1270sc, m3530q, null), 3);
                }
                return c1694m;
            case 13:
                ((InterfaceC3279c) obj2).mo23f(null);
                ((InterfaceC3279c) obj3).mo23f(Integer.valueOf(((C1189po) obj).f6926a));
                return c1694m;
            case 14:
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) obj2;
                List<C0910go> list3 = (List) obj3;
                C3472s c3472s = (C3472s) obj;
                float f7 = AbstractC1092mk.f5952h;
                int m3082N = AbstractC1817y.m3082N(AbstractC1807o.m3073U(list3));
                if (m3082N < 16) {
                    m3082N = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(m3082N);
                for (C0910go c0910go : list3) {
                    Set set = (Set) c3472s.get(c0910go.f4322a);
                    if (set == null) {
                        set = C1815w.f10862e;
                    }
                    String str7 = c0910go.f4322a;
                    List list4 = c0910go.f4326e;
                    ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list4));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((C1467yn) it.next()).f9464a);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj5 = arrayList2.get(i12);
                        i12++;
                        if (set.contains((String) obj5)) {
                            arrayList3.add(obj5);
                        }
                    }
                    linkedHashMap.put(str7, arrayList3);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (!((List) entry.getValue()).isEmpty()) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                interfaceC3279c.mo23f(linkedHashMap2);
                return c1694m;
            case AbstractC3122c.f15762g /* 15 */:
                C1227r0 c1227r0 = (C1227r0) obj3;
                float f8 = AbstractC1092mk.f5952h;
                ((InterfaceC2425y0) obj).setValue(c1227r0);
                C1238rb c1238rb = C1238rb.f7307a;
                ((C0328m) obj2).m675K(C1238rb.m2175q(c1227r0.f7197e));
                return c1694m;
            case 16:
                AbstractC1092mk.m1693K3((Context) obj3).edit().putString("ignored_update_version", ((C1227r0) obj2).f7193a).apply();
                AbstractC1092mk.m1847r0((InterfaceC2425y0) obj, false);
                return c1694m;
            case 17:
                C2395p c2395p = (C2395p) obj3;
                C2511a c2511a = (C2511a) obj2;
                C2429z1 c2429z1 = (C2429z1) obj;
                C2513b c2513b = c2395p.f13479M;
                C2511a c2511a2 = c2513b.f13862b;
                try {
                    c2513b.f13862b = c2511a;
                    C2429z1 c2429z12 = c2395p.f13473G;
                    int[] iArr = c2395p.f13502o;
                    C2221w c2221w = c2395p.f13509v;
                    c2395p.f13502o = null;
                    c2395p.f13509v = null;
                    try {
                        c2395p.f13473G = c2429z1;
                        boolean z7 = c2513b.f13865e;
                        try {
                            c2513b.f13865e = false;
                            throw null;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        c2395p.f13473G = c2429z12;
                        c2395p.f13502o = iArr;
                        c2395p.f13509v = c2221w;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c2513b.f13862b = c2511a2;
                    throw th3;
                }
            default:
                C2335a c2335a = (C2335a) obj3;
                C2350d2 c2350d2 = (C2350d2) obj2;
                InterfaceC2528i0 interfaceC2528i0 = (InterfaceC2528i0) obj;
                if (c2335a != null) {
                    c2350d2.m3765a(c2350d2.m3767c(c2335a) - c2350d2.f13378t);
                }
                List m3328d = AbstractC2072e.m3328d(c2350d2, null, c2350d2.f13378t, null);
                C3644a c3644a = (C3644a) AbstractC1805m.m3053q0(m3328d);
                if (c3644a != null) {
                    num = c3644a.f17420a;
                } else {
                    num = null;
                }
                List mo145i = interfaceC2528i0.mo145i(num);
                if (num != null && !mo145i.isEmpty()) {
                    C3644a c3644a2 = (C3644a) AbstractC1805m.m3045i0(mo145i);
                    List m3043g0 = AbstractC1805m.m3043g0(mo145i, 1);
                    c3644a2.getClass();
                    mo145i = AbstractC1805m.m3058v0(AbstractC3784a.m5817z(new C3644a(null, num)), m3043g0);
                }
                return AbstractC1805m.m3058v0(m3328d, mo145i);
        }
    }

    public /* synthetic */ C1384w2(Object obj, Object obj2, Object obj3, int i7) {
        this.f8287e = i7;
        this.f8290h = obj;
        this.f8288f = obj2;
        this.f8289g = obj3;
    }

    public /* synthetic */ C1384w2(Object obj, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, int i7) {
        this.f8287e = i7;
        this.f8290h = obj;
        this.f8289g = interfaceC2425y0;
        this.f8288f = interfaceC2425y02;
    }

    public /* synthetic */ C1384w2(C2395p c2395p, C2511a c2511a, C2429z1 c2429z1, AbstractC2422x0 abstractC2422x0) {
        this.f8287e = 17;
        this.f8290h = c2395p;
        this.f8288f = c2511a;
        this.f8289g = c2429z1;
    }
}
