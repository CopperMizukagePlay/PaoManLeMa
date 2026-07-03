package p001a0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p039e5.AbstractC0845en;
import p039e5.AbstractC0945hr;
import p039e5.AbstractC1092mk;
import p039e5.AbstractC1249rm;
import p039e5.C0813dm;
import p039e5.C0866fc;
import p039e5.C0959i9;
import p039e5.C1072m0;
import p039e5.C1100ms;
import p039e5.C1132nt;
import p039e5.C1196q0;
import p039e5.C1247rk;
import p039e5.C1248rl;
import p039e5.C1279sl;
import p039e5.C1403wl;
import p039e5.EnumC1465yl;
import p053g5.C1687f;
import p053g5.C1689h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1817y;
import p060h5.C1813u;
import p068i5.C2077a;
import p068i5.C2079c;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p099m6.AbstractC2595c;
import p099m6.AbstractC2602f0;
import p099m6.C2592a0;
import p099m6.C2594b0;
import p099m6.C2598d0;
import p099m6.C2622w;
import p099m6.C2623x;
import p099m6.C2625z;
import p117p1.InterfaceC2872w;
import p144t.C3137j0;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.l1 */
/* loaded from: classes.dex */
public final class C0047l1 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f241i;

    /* renamed from: j */
    public /* synthetic */ Object f242j;

    /* renamed from: k */
    public final /* synthetic */ Object f243k;

    /* renamed from: l */
    public final /* synthetic */ Object f244l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0047l1(Object obj, Object obj2, Object obj3, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f241i = i7;
        this.f242j = obj;
        this.f243k = obj2;
        this.f244l = obj3;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f241i) {
            case 0:
                return ((C0047l1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                C0047l1 c0047l1 = (C0047l1) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m = C1694m.f10482a;
                c0047l1.mo29m(c1694m);
                return c1694m;
            case 2:
                return ((C0047l1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 3:
                return ((C0047l1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 4:
                C0047l1 c0047l12 = (C0047l1) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m2 = C1694m.f10482a;
                c0047l12.mo29m(c1694m2);
                return c1694m2;
            default:
                return ((C0047l1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f241i) {
            case 0:
                C0047l1 c0047l1 = new C0047l1((InterfaceC2872w) this.f243k, (InterfaceC0071r1) this.f244l, interfaceC2313c, 0);
                c0047l1.f242j = obj;
                return c0047l1;
            case 1:
                return new C0047l1((C1196q0) this.f242j, (InterfaceC2425y0) this.f243k, (InterfaceC2425y0) this.f244l, interfaceC2313c, 1);
            case 2:
                return new C0047l1((C0813dm) this.f242j, (C1248rl) this.f243k, (String) this.f244l, interfaceC2313c, 2);
            case 3:
                C0047l1 c0047l12 = new C0047l1((List) this.f243k, (C1403wl) this.f244l, interfaceC2313c, 3);
                c0047l12.f242j = obj;
                return c0047l12;
            case 4:
                return new C0047l1((Context) this.f242j, (List) this.f243k, (InterfaceC2425y0) this.f244l, interfaceC2313c, 4);
            default:
                return new C0047l1((C1100ms) this.f242j, (String) this.f243k, (Network) this.f244l, interfaceC2313c, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x046d, code lost:
    
        if (r4 == null) goto L103;
     */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        Object obj2;
        String str;
        Object obj3;
        C2592a0 m4189a;
        C2623x c2623x;
        Object m2985m;
        ConnectivityManager connectivityManager;
        List list;
        boolean z7;
        boolean z8;
        boolean z9;
        String obj4;
        Network network;
        switch (this.f241i) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f242j;
                InterfaceC2872w interfaceC2872w = (InterfaceC2872w) this.f243k;
                InterfaceC0071r1 interfaceC0071r1 = (InterfaceC0071r1) this.f244l;
                InterfaceC2313c interfaceC2313c = null;
                AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0058o0(interfaceC2872w, interfaceC0071r1, interfaceC2313c, 1), 1);
                return AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0058o0(interfaceC2872w, interfaceC0071r1, interfaceC2313c, 2), 1);
            case 1:
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f244l;
                AbstractC1793a0.m2972L(obj);
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) this.f243k;
                if (!((Boolean) interfaceC2425y02.getValue()).booleanValue() && ((C0959i9) interfaceC2425y0.getValue()).f4780b && ((C0959i9) interfaceC2425y0.getValue()).f4789k) {
                    interfaceC2425y02.setValue(Boolean.TRUE);
                    C1196q0 c1196q0 = (C1196q0) this.f242j;
                    AbstractC0525d0.m1141s(c1196q0.f6966e, null, new C1072m0(c1196q0, null, 1), 3);
                }
                return C1694m.f10482a;
            case 2:
                C1248rl c1248rl = (C1248rl) this.f243k;
                String str2 = (String) this.f244l;
                AbstractC1793a0.m2972L(obj);
                C0813dm c0813dm = (C0813dm) this.f242j;
                Map map = c0813dm.f3521e;
                if (!map.isEmpty()) {
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((List) ((Map.Entry) obj2).getValue()).contains(str2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj2;
                    if (entry != null && (str = (String) entry.getKey()) != null) {
                        Iterator it2 = c0813dm.f3518b.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (AbstractC3367j.m5096a(((C1248rl) next).f7390a, str)) {
                                    obj3 = next;
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        C1248rl c1248rl2 = (C1248rl) obj3;
                        if (c1248rl2 != null) {
                            c1248rl = c1248rl2;
                        }
                    }
                }
                return new C1687f(str2, AbstractC0845en.m1523c(c1248rl, str2));
            case 3:
                Object obj5 = null;
                C1403wl c1403wl = (C1403wl) this.f244l;
                C2623x c2623x2 = c1403wl.f8495f;
                String str3 = c1403wl.f8491b;
                EnumC1465yl enumC1465yl = c1403wl.f8490a;
                AbstractC1793a0.m2972L(obj);
                List list2 = (List) this.f243k;
                if (list2.isEmpty()) {
                    return "";
                }
                ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list2));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    C1132nt c1132nt = (C1132nt) it3.next();
                    arrayList.add(AbstractC1817y.m3083O(new C1687f("Success", Boolean.valueOf(!AbstractC3367j.m5096a(c1132nt.f6405b, "*"))), new C1687f("Address", AbstractC1817y.m3083O(new C1687f("IP", c1132nt.f6405b), new C1687f("zone", ""))), new C1687f("Hostname", c1132nt.f6406c), new C1687f("TTL", new Integer(c1132nt.f6404a)), new C1687f("Error", obj5), new C1687f("Geo", AbstractC1817y.m3083O(new C1687f("country", c1132nt.f6409f), new C1687f("owner", c1132nt.f6410g)))));
                    it3 = it3;
                    c2623x2 = c2623x2;
                    obj5 = null;
                }
                C2623x c2623x3 = c2623x2;
                String jSONObject = new JSONObject().put("Hops", new JSONArray((Collection) arrayList)).put("TraceMapUrl", "").toString();
                AbstractC3367j.m5099d(jSONObject, "toString(...)");
                C2594b0 m4131e = AbstractC2595c.m4131e(jSONObject, C1403wl.f8489i);
                EnumC1465yl enumC1465yl2 = EnumC1465yl.f9456f;
                if (enumC1465yl == enumC1465yl2) {
                    String m2378c = C1403wl.m2378c(c1403wl, c1403wl.f8492c);
                    if (m2378c == null) {
                        return "";
                    }
                    C2625z m2376a = C1403wl.m2376a(c1403wl, m2378c.concat("/tracemap/api"), c1403wl.f8493d);
                    m2376a.m4192d("POST", m4131e);
                    m2376a.m4191c("User-Agent", "NextTrace/NTrace-core Android HBCS-SpeedTest");
                    m4189a = m2376a.m4189a();
                } else {
                    C2625z c2625z = new C2625z();
                    c2625z.m4194f("https://" + str3 + "/tracemap/api");
                    c2625z.m4191c("Host", str3);
                    c2625z.m4191c("User-Agent", "NextTrace/NTrace-core Android HBCS-SpeedTest");
                    c2625z.m4192d("POST", m4131e);
                    m4189a = c2625z.m4189a();
                }
                if (enumC1465yl == enumC1465yl2) {
                    c2623x = c2623x3;
                } else {
                    String m2385k = C1403wl.m2385k(str3);
                    if (m2385k == null) {
                        return "";
                    }
                    C2622w m4186a = c2623x3.m4186a();
                    m4186a.m4181b(new C1279sl(m2385k, 0));
                    c2623x = new C2623x(m4186a);
                }
                try {
                    C2598d0 m4681e = c2623x.m4187b(m4189a).m4681e();
                    try {
                        if (m4681e.m4142c()) {
                            AbstractC2602f0 abstractC2602f0 = m4681e.f14062k;
                            if (abstractC2602f0 != null) {
                                m2985m = abstractC2602f0.m4148h();
                                break;
                            } else {
                                m2985m = null;
                                break;
                            }
                        }
                        m2985m = "";
                        m4681e.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (m2985m instanceof C1689h) {
                    return "";
                }
                return m2985m;
            case 4:
                AbstractC1793a0.m2972L(obj);
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) this.f244l;
                Context context = (Context) this.f242j;
                List list3 = (List) this.f243k;
                AbstractC3367j.m5100e(context, "context");
                AbstractC3367j.m5100e(list3, "listedTargets");
                Context applicationContext = context.getApplicationContext();
                Object systemService = applicationContext.getSystemService("connectivity");
                if (systemService instanceof ConnectivityManager) {
                    connectivityManager = (ConnectivityManager) systemService;
                } else {
                    connectivityManager = null;
                }
                StringBuilder sb = new StringBuilder();
                String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
                sb.append("=== HBCS 网络接口 Debug（原始 API 输出）===\n");
                sb.append("时间: " + format);
                sb.append('\n');
                sb.append("Android SDK: " + Build.VERSION.SDK_INT);
                sb.append('\n');
                String str4 = Build.MANUFACTURER;
                String str5 = Build.MODEL;
                String str6 = Build.DISPLAY;
                StringBuilder m189p = AbstractC0094y0.m189p("设备: ", str4, " ", str5, " / ");
                m189p.append(str6);
                sb.append(m189p.toString());
                sb.append("\n\n");
                if (connectivityManager == null) {
                    sb.append("[ERROR] ConnectivityManager 不可用\n");
                    AbstractC1249rm.m2233N(sb, list3, AbstractC1092mk.m1760Z2(applicationContext));
                    String sb2 = sb.toString();
                    AbstractC3367j.m5099d(sb2, "toString(...)");
                    obj4 = AbstractC0444k.m958v0(sb2).toString();
                } else {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    Network[] allNetworks = connectivityManager.getAllNetworks();
                    if (allNetworks != null) {
                        list = AbstractC1804l.m3031X(allNetworks);
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = C1813u.f10860e;
                    }
                    List list4 = list;
                    Network network2 = C1247rk.f7387n;
                    Network network3 = C1247rk.f7378e;
                    List m1760Z2 = AbstractC1092mk.m1760Z2(applicationContext);
                    sb.append("--- ConnectivityManager.activeNetwork (raw) ---\n");
                    AbstractC1249rm.m2237P(sb, connectivityManager, activeNetwork);
                    sb.append('\n');
                    sb.append("--- ConnectivityManager.allNetworks (raw) ---");
                    sb.append('\n');
                    sb.append("size=" + list4.size());
                    sb.append('\n');
                    sb.append("networks=" + AbstractC1805m.m3051o0(list4, null, "[", "]", new C0866fc(15), 25));
                    sb.append('\n');
                    sb.append('\n');
                    if (list4.isEmpty()) {
                        sb.append("(empty)");
                        sb.append('\n');
                    } else {
                        int i7 = 0;
                        for (Object obj6 : list4) {
                            int i8 = i7 + 1;
                            if (i7 >= 0) {
                                Network network4 = (Network) obj6;
                                sb.append("----- allNetworks[" + i7 + "] -----");
                                sb.append('\n');
                                AbstractC1249rm.m2237P(sb, connectivityManager, network4);
                                AbstractC3367j.m5097b(network4);
                                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network4);
                                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                sb.append("appFilter.NET_CAPABILITY_INTERNET=" + z7);
                                sb.append('\n');
                                sb.append('\n');
                                i7 = i8;
                            } else {
                                AbstractC1806n.m3072T();
                                throw null;
                            }
                        }
                    }
                    sb.append("--- WifiNetworkKeeper.heldNetwork (raw) ---");
                    sb.append('\n');
                    AbstractC1249rm.m2237P(sb, connectivityManager, network2);
                    if (network2 != null && list4.contains(network2)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    sb.append("inAllNetworks=" + z8);
                    sb.append('\n');
                    sb.append('\n');
                    sb.append("--- MobileNetworkKeeper.heldNetwork (raw) ---");
                    sb.append('\n');
                    AbstractC1249rm.m2237P(sb, connectivityManager, network3);
                    if (network3 != null && list4.contains(network3)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    sb.append("inAllNetworks=" + z9);
                    sb.append('\n');
                    sb.append('\n');
                    C2079c m5802f = AbstractC3784a.m5802f();
                    if (network2 != null) {
                        if (list4.contains(network2)) {
                            network2 = null;
                        }
                        if (network2 != null) {
                            m5802f.add(new C1687f("WifiKeeper", network2));
                        }
                    }
                    if (network3 != null) {
                        if (!list4.contains(network3)) {
                            network = network3;
                        } else {
                            network = null;
                        }
                        if (network != null) {
                            m5802f.add(new C1687f("CellularKeeper", network));
                        }
                    }
                    C2079c m5798b = AbstractC3784a.m5798b(m5802f);
                    if (!m5798b.isEmpty()) {
                        sb.append("--- Keeper 持有但不在 allNetworks（应用会手动并入扫描）---");
                        sb.append('\n');
                        ListIterator listIterator = m5798b.listIterator(0);
                        while (true) {
                            C2077a c2077a = (C2077a) listIterator;
                            if (c2077a.hasNext()) {
                                C1687f c1687f = (C1687f) c2077a.next();
                                String str7 = (String) c1687f.f10471e;
                                Network network5 = (Network) c1687f.f10472f;
                                sb.append("[" + str7 + "]");
                                sb.append('\n');
                                AbstractC1249rm.m2237P(sb, connectivityManager, network5);
                                sb.append('\n');
                            }
                        }
                    }
                    AbstractC1249rm.m2233N(sb, list3, m1760Z2);
                    sb.append("--- 应用识别规则（非系统 raw，仅供对照）---");
                    sb.append('\n');
                    sb.append("currentNetworkTargets 来源:");
                    sb.append('\n');
                    sb.append("  1) ConnectivityManager.allNetworks");
                    sb.append('\n');
                    sb.append("  2) 并入 WifiNetworkKeeper / MobileNetworkKeeper 持有且不在 allNetworks 的 Network");
                    sb.append('\n');
                    sb.append("  3) 丢弃 getNetworkCapabilities==null 或无 NET_CAPABILITY_INTERNET 的 Network");
                    sb.append('\n');
                    sb.append("  4) transport=NetworkCapabilities.hasTransport(TRANSPORT_*)");
                    sb.append('\n');
                    sb.append("  5) interfaceName=LinkProperties.interfaceName");
                    sb.append('\n');
                    String sb3 = sb.toString();
                    AbstractC3367j.m5099d(sb3, "toString(...)");
                    obj4 = AbstractC0444k.m958v0(sb3).toString();
                }
                C3137j0 c3137j0 = AbstractC0945hr.f4635a;
                interfaceC2425y03.setValue(obj4);
                return C1694m.f10482a;
            default:
                AbstractC1793a0.m2972L(obj);
                return C1100ms.m1913g((C1100ms) this.f242j, (String) this.f243k, (Network) this.f244l);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0047l1(Object obj, Object obj2, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f241i = i7;
        this.f243k = obj;
        this.f244l = obj2;
    }
}
