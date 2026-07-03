package p039e5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.RouteInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001a0.AbstractC0094y0;
import p001a0.C0098z1;
import p015b6.AbstractC0307n;
import p015b6.C0301h;
import p015b6.C0302i;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0565q1;
import p032d6.C0568r1;
import p053g5.C1689h;
import p053g5.C1694m;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p054g6.C1715p;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1811s;
import p060h5.AbstractC1817y;
import p060h5.C1813u;
import p068i5.AbstractC2080d;
import p068i5.C2079c;
import p069i6.C2090c;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2318h;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p098m5.AbstractC2583c;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ft */
/* loaded from: classes.dex */
public final class C0883ft {

    /* renamed from: j */
    public static final List f4080j = AbstractC1806n.m3067O(56, 1400, 1472, 9000, 65500);

    /* renamed from: k */
    public static final List f4081k = AbstractC1806n.m3067O(80, 443);

    /* renamed from: l */
    public static final Pattern f4082l = Pattern.compile("\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b");

    /* renamed from: a */
    public final C2090c f4083a;

    /* renamed from: b */
    public final AtomicBoolean f4084b;

    /* renamed from: c */
    public C0565q1 f4085c;

    /* renamed from: d */
    public final C1701c0 f4086d;

    /* renamed from: e */
    public final C1715p f4087e;

    /* renamed from: f */
    public volatile List f4088f;

    /* renamed from: g */
    public List f4089g;

    /* renamed from: h */
    public C1224qs f4090h;

    /* renamed from: i */
    public final ConcurrentHashMap f4091i;

    public C0883ft() {
        C0568r1 m1124b = AbstractC0525d0.m1124b();
        C2325e c2325e = AbstractC0549l0.f1898a;
        this.f4083a = AbstractC0525d0.m1123a(AbstractC2080d.m3374B(m1124b, ExecutorC2324d.f13302g));
        this.f4084b = new AtomicBoolean(false);
        C1701c0 m2771b = AbstractC1719t.m2771b(new C0915gt(false, null, null, null, 0, 0, null, false, null, 511));
        this.f4086d = m2771b;
        this.f4087e = new C1715p(m2771b);
        C1813u c1813u = C1813u.f10860e;
        this.f4088f = c1813u;
        this.f4089g = c1813u;
        this.f4091i = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1528a(C0883ft c0883ft, Context context, List list, C1224qs c1224qs, AbstractC2583c abstractC2583c) {
        C1379vs c1379vs;
        int i7;
        C0883ft c0883ft2;
        List list2;
        List list3;
        if (abstractC2583c instanceof C1379vs) {
            c1379vs = (C1379vs) abstractC2583c;
            int i8 = c1379vs.f8278m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1379vs.f8278m = i8 - Integer.MIN_VALUE;
                C1379vs c1379vs2 = c1379vs;
                Object obj = c1379vs2.f8276k;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                i7 = c1379vs2.f8278m;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c1224qs = c1379vs2.f8275j;
                        list2 = c1379vs2.f8274i;
                        c0883ft2 = c1379vs2.f8273h;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    ArrayList arrayList = c1224qs.f7181b;
                    ArrayList arrayList2 = c1224qs.f7182c;
                    boolean z7 = c1224qs.f7183d;
                    c1379vs2.f8273h = c0883ft;
                    c1379vs2.f8274i = list;
                    c1379vs2.f8275j = c1224qs;
                    c1379vs2.f8278m = 1;
                    obj = c0883ft.m1541d(context, list, arrayList, arrayList2, z7, 5, c1379vs2);
                    if (obj == enumC2465a) {
                        return enumC2465a;
                    }
                    c0883ft2 = c0883ft;
                    list2 = list;
                }
                list3 = (List) obj;
                c0883ft2.f4090h = c1224qs;
                if (list3.isEmpty()) {
                    c0883ft2.f4088f = list3;
                    c0883ft2.f4089g = list3;
                    C1701c0 c1701c0 = c0883ft2.f4086d;
                    C0915gt c0915gt = (C0915gt) c1701c0.getValue();
                    ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(list3));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(C1255rs.m2302b((C1255rs) it.next()));
                    }
                    String str = ((C0915gt) c0883ft2.f4086d.getValue()).f4385i;
                    if (!AbstractC0451r.m971M(str, "Ping 监控中", false)) {
                        str = null;
                    }
                    if (str == null) {
                        str = AbstractC2487d.m4058v("Ping 监控中 · ", ((C0915gt) c0883ft2.f4086d.getValue()).f4383g);
                    }
                    c1701c0.m2752j(null, C0915gt.m1552a(c0915gt, true, arrayList3, false, str, 122));
                } else {
                    List m1533i = m1533i(c0883ft2.f4089g, list2);
                    if (!m1533i.isEmpty()) {
                        c0883ft2.f4088f = m1533i;
                        C1701c0 c1701c02 = c0883ft2.f4086d;
                        c1701c02.m2752j(null, C0915gt.m1552a((C0915gt) c1701c02.getValue(), true, null, true, "网关解析暂不可用，沿用上次网关继续探测", 126));
                    }
                }
                return C1694m.f10482a;
            }
        }
        c1379vs = new C1379vs(c0883ft, abstractC2583c);
        C1379vs c1379vs22 = c1379vs;
        Object obj2 = c1379vs22.f8276k;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        i7 = c1379vs22.f8278m;
        if (i7 == 0) {
        }
        list3 = (List) obj2;
        c0883ft2.f4090h = c1224qs;
        if (list3.isEmpty()) {
        }
        return C1694m.f10482a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x02aa, code lost:
    
        if (r11 != null) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1529b(C0883ft c0883ft, Context context, C1248rl c1248rl, List list, boolean z7, AbstractC2583c abstractC2583c) {
        C1503zs c1503zs;
        int i7;
        C1813u c1813u;
        int i8;
        List list2;
        ArrayList arrayList;
        List list3;
        C1286ss c1286ss;
        Object obj;
        ArrayList arrayList2;
        C1286ss c1286ss2;
        List m5817z;
        Network network;
        Context context2;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        C0897gb c0897gb;
        DhcpInfo dhcpInfo;
        int i9;
        String str3;
        String str4;
        C0883ft c0883ft2 = c0883ft;
        C1248rl c1248rl2 = c1248rl;
        c0883ft2.getClass();
        if (abstractC2583c instanceof C1503zs) {
            c1503zs = (C1503zs) abstractC2583c;
            int i10 = c1503zs.f9977o;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1503zs.f9977o = i10 - Integer.MIN_VALUE;
                Object obj4 = c1503zs.f9975m;
                i7 = c1503zs.f9977o;
                String str5 = "";
                if (i7 != 0) {
                    AbstractC1793a0.m2972L(obj4);
                    ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(list));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC0094y0.m191r((String) it.next(), arrayList3);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj5 = arrayList3.get(i11);
                        i11++;
                        if (!AbstractC0444k.m937a0((String) obj5)) {
                            arrayList4.add(obj5);
                        }
                    }
                    Network network2 = c1248rl2.f7392c;
                    boolean isEmpty = arrayList4.isEmpty();
                    C1813u c1813u2 = C1813u.f10860e;
                    if (isEmpty) {
                        AbstractC3367j.m5100e(context, "context");
                        Context applicationContext = context.getApplicationContext();
                        Object systemService = applicationContext.getSystemService("connectivity");
                        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                        if (connectivityManager == null) {
                            c0897gb = new C0897gb(null, null);
                        } else {
                            if (network2 == null) {
                                network = connectivityManager.getActiveNetwork();
                                if (network == null) {
                                    c0897gb = new C0897gb(null, null);
                                }
                            } else {
                                network = network2;
                            }
                            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                            C0929hb c0929hb = C0929hb.f4490a;
                            if (linkProperties == null) {
                                context2 = applicationContext;
                                c1813u = c1813u2;
                            } else {
                                List<RouteInfo> routes = linkProperties.getRoutes();
                                AbstractC3367j.m5099d(routes, "getRoutes(...)");
                                context2 = applicationContext;
                                c1813u = c1813u2;
                                str = (String) AbstractC0307n.m665D(AbstractC0307n.m667F(new C0301h(AbstractC1805m.m3039c0(routes), true, new C0098z1(1, c0929hb, C0929hb.class, "isIpv4DefaultRoute", "isIpv4DefaultRoute(Landroid/net/RouteInfo;)Z", 0, 0, 3)), new C1263s5(18)));
                                if (str == null && (str = (String) AbstractC0307n.m665D(AbstractC0307n.m667F(new C0301h(AbstractC1805m.m3039c0(routes), true, new C1263s5(19)), new C1263s5(20)))) == null && (str = (String) AbstractC0307n.m665D(AbstractC0307n.m667F(AbstractC1805m.m3039c0(routes), new C1263s5(21)))) == null) {
                                    List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
                                    AbstractC3367j.m5099d(linkAddresses, "getLinkAddresses(...)");
                                    Iterator<T> it2 = linkAddresses.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = it2.next();
                                        InetAddress address = ((LinkAddress) obj2).getAddress();
                                        if (address instanceof Inet4Address) {
                                            Inet4Address inet4Address = (Inet4Address) address;
                                            if (!inet4Address.isLoopbackAddress() && !inet4Address.isLinkLocalAddress()) {
                                                break;
                                            }
                                        }
                                    }
                                    LinkAddress linkAddress = (LinkAddress) obj2;
                                    if (linkAddress != null) {
                                        InetAddress address2 = linkAddress.getAddress();
                                        AbstractC3367j.m5098c(address2, "null cannot be cast to non-null type java.net.Inet4Address");
                                        byte[] address3 = ((Inet4Address) address2).getAddress();
                                        if (address3.length == 4) {
                                            str = String.format(Locale.US, "%d.%d.%d.1", Arrays.copyOf(new Object[]{Integer.valueOf(address3[0] & 255), Integer.valueOf(address3[1] & 255), Integer.valueOf(address3[2] & 255)}, 3));
                                        }
                                    }
                                }
                                int i12 = 24;
                                if (str == null) {
                                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                                    if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                                        Object systemService2 = context2.getApplicationContext().getSystemService("wifi");
                                        WifiManager wifiManager = systemService2 instanceof WifiManager ? (WifiManager) systemService2 : null;
                                        if (wifiManager != null && (dhcpInfo = wifiManager.getDhcpInfo()) != null && (i9 = dhcpInfo.gateway) != 0) {
                                            str = String.format(Locale.US, "%d.%d.%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf(i9 & 255), Integer.valueOf((i9 >> 8) & 255), Integer.valueOf((i9 >> 16) & 255), Integer.valueOf((i9 >> 24) & 255)}, 4));
                                        }
                                    }
                                    str = null;
                                }
                                if (linkProperties != null) {
                                    List<RouteInfo> routes2 = linkProperties.getRoutes();
                                    AbstractC3367j.m5099d(routes2, "getRoutes(...)");
                                    str2 = (String) AbstractC0307n.m665D(AbstractC0307n.m667F(new C0301h(AbstractC1805m.m3039c0(routes2), true, new C0098z1(1, c0929hb, C0929hb.class, "isIpv6DefaultRoute", "isIpv6DefaultRoute(Landroid/net/RouteInfo;)Z", 0, 0, 4)), new C1263s5(22)));
                                    if (str2 == null) {
                                        str2 = (String) AbstractC0307n.m665D(AbstractC0307n.m667F(new C0301h(AbstractC1805m.m3039c0(routes2), true, new C1263s5(23)), new C1263s5(i12)));
                                        if (str2 == null) {
                                            str2 = (String) AbstractC0307n.m665D(AbstractC0307n.m667F(AbstractC1805m.m3039c0(routes2), new C1263s5(25)));
                                        }
                                    }
                                    if (str2 != null) {
                                        i8 = 0;
                                    } else {
                                        if (linkProperties != null) {
                                            List<LinkAddress> linkAddresses2 = linkProperties.getLinkAddresses();
                                            AbstractC3367j.m5099d(linkAddresses2, "getLinkAddresses(...)");
                                            Iterator<T> it3 = linkAddresses2.iterator();
                                            while (true) {
                                                if (!it3.hasNext()) {
                                                    obj3 = null;
                                                    break;
                                                }
                                                obj3 = it3.next();
                                                InetAddress address4 = ((LinkAddress) obj3).getAddress();
                                                if (address4 instanceof Inet6Address) {
                                                    Inet6Address inet6Address = (Inet6Address) address4;
                                                    if (!inet6Address.isLoopbackAddress() && !inet6Address.isLinkLocalAddress() && !inet6Address.isSiteLocalAddress()) {
                                                        break;
                                                    }
                                                }
                                            }
                                            LinkAddress linkAddress2 = (LinkAddress) obj3;
                                            if (linkAddress2 != null) {
                                                String hostAddress = linkAddress2.getAddress().getHostAddress();
                                                String m953q0 = hostAddress != null ? AbstractC0444k.m953q0(hostAddress, '%') : null;
                                                if (m953q0 == null) {
                                                    m953q0 = "";
                                                }
                                                if (!AbstractC0444k.m937a0(m953q0)) {
                                                    List m948l0 = AbstractC0444k.m948l0(m953q0, new char[]{':'});
                                                    ArrayList arrayList5 = new ArrayList();
                                                    for (Object obj6 : m948l0) {
                                                        if (((String) obj6).length() > 0) {
                                                            arrayList5.add(obj6);
                                                        }
                                                    }
                                                    if (arrayList5.size() >= 4) {
                                                        i8 = 0;
                                                        str2 = arrayList5.get(0) + ":" + arrayList5.get(1) + ":" + arrayList5.get(2) + ":" + arrayList5.get(3) + "::1";
                                                    }
                                                }
                                            }
                                        }
                                        i8 = 0;
                                        str2 = null;
                                    }
                                    c0897gb = new C0897gb(str, str2);
                                    C2079c m5802f = AbstractC3784a.m5802f();
                                    str3 = c0897gb.f4214a;
                                    if (str3 != null) {
                                        m5802f.add(m1540s(str3, network2));
                                    }
                                    str4 = c0897gb.f4215b;
                                    if (str4 != null) {
                                        m5802f.add(m1540s(str4, network2));
                                    }
                                    list2 = AbstractC3784a.m5798b(m5802f);
                                }
                                str2 = null;
                                if (str2 != null) {
                                }
                                c0897gb = new C0897gb(str, str2);
                                C2079c m5802f2 = AbstractC3784a.m5802f();
                                str3 = c0897gb.f4214a;
                                if (str3 != null) {
                                }
                                str4 = c0897gb.f4215b;
                                if (str4 != null) {
                                }
                                list2 = AbstractC3784a.m5798b(m5802f2);
                            }
                            str = null;
                            int i122 = 24;
                            if (str == null) {
                            }
                            if (linkProperties != null) {
                            }
                            str2 = null;
                            if (str2 != null) {
                            }
                            c0897gb = new C0897gb(str, str2);
                            C2079c m5802f22 = AbstractC3784a.m5802f();
                            str3 = c0897gb.f4214a;
                            if (str3 != null) {
                            }
                            str4 = c0897gb.f4215b;
                            if (str4 != null) {
                            }
                            list2 = AbstractC3784a.m5798b(m5802f22);
                        }
                        c1813u = c1813u2;
                        i8 = 0;
                        C2079c m5802f222 = AbstractC3784a.m5802f();
                        str3 = c0897gb.f4214a;
                        if (str3 != null) {
                        }
                        str4 = c0897gb.f4215b;
                        if (str4 != null) {
                        }
                        list2 = AbstractC3784a.m5798b(m5802f222);
                    } else {
                        c1813u = c1813u2;
                        i8 = 0;
                        list2 = c1813u;
                    }
                    arrayList = new ArrayList();
                    int size2 = arrayList4.size();
                    while (i8 < size2) {
                        Object obj7 = arrayList4.get(i8);
                        i8++;
                        String str6 = (String) obj7;
                        int ordinal = AbstractC1155ol.m2013a(str6).ordinal();
                        if (ordinal == 0 || ordinal == 1) {
                            int ordinal2 = AbstractC1155ol.m2013a(str6).ordinal();
                            if (ordinal2 == 0) {
                                String hostAddress2 = m1535m(str6, network2).getHostAddress();
                                if (hostAddress2 == null) {
                                    hostAddress2 = str6;
                                }
                                c1286ss2 = new C1286ss(EnumC1032km.f5310f, str6, hostAddress2, "");
                            } else if (ordinal2 != 1) {
                                c1286ss2 = null;
                            } else {
                                String hostAddress3 = m1535m(str6, network2).getHostAddress();
                                c1286ss2 = new C1286ss(EnumC1032km.f5311g, str6, hostAddress3 == null ? str6 : hostAddress3, "");
                            }
                            if (c1286ss2 != null) {
                                m5817z = AbstractC3784a.m5817z(c1286ss2);
                                AbstractC1811s.m3076X(m5817z, arrayList);
                            }
                            m5817z = c1813u;
                            AbstractC1811s.m3076X(m5817z, arrayList);
                        } else if (ordinal == 2) {
                            m5817z = m1538p(str6, network2);
                            AbstractC1811s.m3076X(m5817z, arrayList);
                        } else {
                            if (ordinal != 3) {
                                throw new RuntimeException();
                            }
                            m5817z = c1813u;
                            AbstractC1811s.m3076X(m5817z, arrayList);
                        }
                    }
                    list3 = arrayList.isEmpty() ? list2 : arrayList;
                    if (!z7 || (c1248rl2.f7393d != EnumC1070lt.f5745f && !m1532h(c1248rl2.f7394e))) {
                        c1286ss = null;
                        if (c1286ss != null) {
                            if (arrayList.isEmpty() && list2.isEmpty()) {
                                return AbstractC3784a.m5817z(c1286ss);
                            }
                            if (!arrayList.isEmpty()) {
                                return AbstractC1805m.m3059w0(list3, c1286ss);
                            }
                            if (!list2.isEmpty()) {
                                return AbstractC3784a.m5817z(c1286ss);
                            }
                        }
                        return list3;
                    }
                    c1503zs.f9970h = c0883ft2;
                    c1503zs.f9971i = c1248rl2;
                    c1503zs.f9972j = list2;
                    c1503zs.f9973k = arrayList;
                    c1503zs.f9974l = list3;
                    c1503zs.f9977o = 1;
                    Object m1542f = c0883ft2.m1542f(context, c1248rl2, c1503zs);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m1542f == enumC2465a) {
                        return enumC2465a;
                    }
                    obj = m1542f;
                    arrayList2 = arrayList;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list4 = (List) c1503zs.f9974l;
                    arrayList2 = c1503zs.f9973k;
                    List list5 = (List) c1503zs.f9972j;
                    C1248rl c1248rl3 = c1503zs.f9971i;
                    C0883ft c0883ft3 = c1503zs.f9970h;
                    AbstractC1793a0.m2972L(obj4);
                    list3 = list4;
                    c0883ft2 = c0883ft3;
                    obj = obj4;
                    list2 = list5;
                    c1248rl2 = c1248rl3;
                }
                c1286ss = (C1286ss) obj;
                if (c1286ss == null) {
                    ConcurrentHashMap concurrentHashMap = c0883ft2.f4091i;
                    String str7 = c1248rl2.f7390a;
                    if (AbstractC0444k.m937a0(str7)) {
                        String str8 = c1248rl2.f7394e;
                        if (str8 != null) {
                            str5 = str8;
                        }
                    } else {
                        str5 = str7;
                    }
                    concurrentHashMap.put(str5, c1286ss);
                } else {
                    ConcurrentHashMap concurrentHashMap2 = c0883ft2.f4091i;
                    String str9 = c1248rl2.f7390a;
                    if (AbstractC0444k.m937a0(str9)) {
                        String str10 = c1248rl2.f7394e;
                        if (str10 != null) {
                            str5 = str10;
                        }
                    } else {
                        str5 = str9;
                    }
                    c1286ss = (C1286ss) concurrentHashMap2.get(str5);
                }
                arrayList = arrayList2;
                if (c1286ss != null) {
                }
                return list3;
            }
        }
        c1503zs = new C1503zs(c0883ft2, abstractC2583c);
        Object obj42 = c1503zs.f9975m;
        i7 = c1503zs.f9977o;
        String str52 = "";
        if (i7 != 0) {
        }
        c1286ss = (C1286ss) obj;
        if (c1286ss == null) {
        }
        arrayList = arrayList2;
        if (c1286ss != null) {
        }
        return list3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x003b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0325 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x081f  */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x0ae5 -> B:12:0x0aea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0630 -> B:28:0x04fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x07c4 -> B:64:0x0698). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x07e6 -> B:25:0x04c1). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1530c(C0883ft c0883ft, Context context, List list, C1224qs c1224qs, AbstractC2583c abstractC2583c) {
        C0851et c0851et;
        Context context2;
        EnumC0876fm enumC0876fm;
        C1224qs c1224qs2;
        List list2;
        C0883ft c0883ft2;
        String str;
        List list3;
        Context context3;
        boolean z7;
        C0883ft c0883ft3;
        String str2;
        C1224qs c1224qs3;
        boolean booleanValue;
        C1694m c1694m;
        String str3;
        EnumC2465a enumC2465a;
        String str4;
        int size;
        int i7;
        Object obj;
        String str5;
        C0883ft c0883ft4;
        String str6;
        C0851et c0851et2;
        String str7;
        String str8;
        boolean z8;
        EnumC2465a enumC2465a2;
        Object m1541d;
        C1224qs c1224qs4;
        List list4;
        String str9;
        boolean z9;
        List list5;
        List m1533i;
        String m4058v;
        int i8;
        boolean z10;
        C1193ps c1193ps;
        String str10;
        int i9;
        boolean z11;
        String str11;
        Collection collection;
        Iterator it;
        Iterator it2;
        C1224qs c1224qs5;
        Collection collection2;
        EnumC0908gm enumC0908gm;
        EnumC0876fm enumC0876fm2;
        EnumC0876fm enumC0876fm3;
        C0851et c0851et3;
        int i10;
        int i11;
        boolean z12;
        long j6;
        String str12;
        Context context4;
        C1286ss c1286ss;
        Object obj2;
        boolean z13;
        C1255rs c1255rs;
        Collection collection3;
        C0883ft c0883ft5;
        Collection collection4;
        EnumC2465a enumC2465a3;
        String str13;
        int i12;
        ArrayList arrayList;
        Collection collection5;
        String str14;
        C1224qs c1224qs6;
        Context context5;
        Iterator it3;
        long j7;
        C0883ft c0883ft6;
        boolean z14;
        C1255rs c1255rs2;
        C1193ps c1193ps2;
        Collection collection6;
        List list6;
        Object obj3;
        int i13;
        boolean z15;
        ArrayList arrayList2;
        C1286ss c1286ss2;
        C0851et c0851et4;
        Iterator it4;
        String str15;
        C1317ts c1317ts;
        C1255rs c1255rs3;
        EnumC0876fm enumC0876fm4;
        Iterator it5;
        C1193ps c1193ps3;
        int i14;
        String str16;
        C1224qs c1224qs7;
        Collection collection7;
        C0883ft c0883ft7;
        Collection collection8;
        int i15;
        boolean z16;
        C1317ts c1317ts2;
        Collection collection9;
        EnumC0876fm enumC0876fm5;
        long j8;
        Iterator it6;
        Iterator it7;
        C1255rs c1255rs4;
        int i16;
        int i17;
        EnumC2465a enumC2465a4;
        C0851et c0851et5;
        boolean z17;
        boolean z18;
        EnumC0876fm enumC0876fm6;
        EnumC0876fm enumC0876fm7;
        EnumC0908gm m2186g;
        EnumC2465a enumC2465a5;
        int i18;
        boolean z19;
        int i19;
        long j9;
        boolean z20;
        EnumC0908gm enumC0908gm2;
        String str17;
        EnumC2465a enumC2465a6;
        int i20;
        EnumC0876fm enumC0876fm8;
        EnumC0876fm enumC0876fm9;
        Double d7;
        Double d8;
        boolean z21;
        boolean z22;
        int i21;
        int m3528o;
        String str18;
        String m183j;
        int i22;
        String str19;
        double d9;
        String str20;
        EnumC0908gm enumC0908gm3 = EnumC0908gm.f4308f;
        EnumC0876fm enumC0876fm10 = EnumC0876fm.f4042f;
        EnumC0876fm enumC0876fm11 = EnumC0876fm.f4043g;
        EnumC0876fm enumC0876fm12 = EnumC0876fm.f4041e;
        C1694m c1694m2 = C1694m.f10482a;
        if (abstractC2583c instanceof C0851et) {
            c0851et = (C0851et) abstractC2583c;
            int i23 = c0851et.f3849D;
            if ((i23 & Integer.MIN_VALUE) != 0) {
                c0851et.f3849D = i23 - Integer.MIN_VALUE;
                Object obj4 = c0851et.f3847B;
                EnumC2465a enumC2465a7 = EnumC2465a.f13750e;
                String str21 = "|";
                switch (c0851et.f3849D) {
                    case 0:
                        AbstractC1793a0.m2972L(obj4);
                        String m3051o0 = AbstractC1805m.m3051o0(c1224qs.f7182c, " / ", null, null, null, 62);
                        int i24 = c1224qs.f7184e;
                        c0851et.f3850h = c0883ft;
                        context2 = context;
                        c0851et.f3851i = context2;
                        c0851et.f3852j = list;
                        c0851et.f3853k = c1224qs;
                        c0851et.f3854l = m3051o0;
                        c0851et.f3849D = 1;
                        C2325e c2325e = AbstractC0549l0.f1898a;
                        enumC0876fm = enumC0876fm10;
                        obj4 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C1257s(c0883ft, false, i24, null), c0851et);
                        if (obj4 != enumC2465a7) {
                            c1224qs2 = c1224qs;
                            list2 = list;
                            c0883ft2 = c0883ft;
                            str = m3051o0;
                            boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                            int i25 = c1224qs2.f7184e;
                            c0851et.f3850h = c0883ft2;
                            c0851et.f3851i = context2;
                            c0851et.f3852j = list2;
                            c0851et.f3853k = c1224qs2;
                            c0851et.f3854l = str;
                            c0851et.f3865w = booleanValue2;
                            c0851et.f3849D = 2;
                            c0883ft2.getClass();
                            C2325e c2325e2 = AbstractC0549l0.f1898a;
                            String str22 = str;
                            C1224qs c1224qs8 = c1224qs2;
                            obj4 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C1257s(c0883ft2, true, i25, null), c0851et);
                            if (obj4 != enumC2465a7) {
                                Context context6 = context2;
                                list3 = list2;
                                context3 = context6;
                                z7 = booleanValue2;
                                c0883ft3 = c0883ft2;
                                str2 = str22;
                                c1224qs3 = c1224qs8;
                                booleanValue = ((Boolean) obj4).booleanValue();
                                if (!z7 && booleanValue) {
                                    c1694m = c1694m2;
                                    str4 = AbstractC0094y0.m184k(c1224qs3.f7184e, "ICMP ", "B · IPv4/IPv6 双栈，失败时 TCP");
                                } else {
                                    c1694m = c1694m2;
                                    if (z7 && !booleanValue) {
                                        str4 = "TCP（设备不支持 ICMP）";
                                    } else {
                                        int i26 = c1224qs3.f7184e;
                                        if (!z7) {
                                            str3 = "IPv4";
                                        } else {
                                            str3 = "IPv6";
                                        }
                                        enumC2465a = enumC2465a7;
                                        str4 = "ICMP " + i26 + "B · " + str3 + "，失败时 TCP";
                                        ArrayList arrayList3 = c1224qs3.f7182c;
                                        size = arrayList3.size();
                                        i7 = 0;
                                        while (true) {
                                            if (i7 < size) {
                                                obj = arrayList3.get(i7);
                                                i7++;
                                                if (!AbstractC1155ol.m2014b((String) obj)) {
                                                }
                                            } else {
                                                obj = null;
                                            }
                                        }
                                        str5 = (String) obj;
                                        if (str5 != null) {
                                            c0883ft3.f4084b.set(false);
                                            C1701c0 c1701c0 = c0883ft3.f4086d;
                                            C0915gt c0915gt = new C0915gt(false, str2, null, null, 0, 0, null, false, "外网 Ping 目标无效：".concat(str5), 252);
                                            c1701c0.getClass();
                                            c1701c0.m2752j(null, c0915gt);
                                            return c1694m;
                                        }
                                        ArrayList arrayList4 = c1224qs3.f7181b;
                                        ArrayList arrayList5 = c1224qs3.f7182c;
                                        boolean z23 = c1224qs3.f7183d;
                                        c0851et.f3850h = c0883ft3;
                                        c0851et.f3851i = context3;
                                        c0851et.f3852j = list3;
                                        c0851et.f3853k = c1224qs3;
                                        c0851et.f3854l = str2;
                                        c0851et.f3855m = str4;
                                        c0851et.f3865w = z7;
                                        c0851et.f3866x = booleanValue;
                                        c0851et.f3849D = 3;
                                        c0883ft4 = c0883ft3;
                                        str6 = str21;
                                        boolean z24 = z7;
                                        c0851et2 = c0851et;
                                        str7 = "probe";
                                        str8 = "key";
                                        z8 = false;
                                        String str23 = str4;
                                        enumC2465a2 = enumC2465a;
                                        m1541d = c0883ft4.m1541d(context3, list3, arrayList4, arrayList5, z23, 5, c0851et2);
                                        if (m1541d != enumC2465a2) {
                                            c1224qs4 = c1224qs3;
                                            list4 = list3;
                                            str9 = str23;
                                            z9 = z24;
                                            list5 = (List) m1541d;
                                            if (list5.isEmpty()) {
                                                m1533i = list5;
                                            } else {
                                                m1533i = m1533i(c0883ft4.f4089g, list4);
                                            }
                                            if (!m1533i.isEmpty()) {
                                                c0883ft4.f4084b.set(z8);
                                                C1701c0 c1701c02 = c0883ft4.f4086d;
                                                C0915gt c0915gt2 = new C0915gt(false, str2, null, null, 0, 0, null, true, "内网网关获取失败", 124);
                                                c1701c02.getClass();
                                                c1701c02.m2752j(null, c0915gt2);
                                                return c1694m;
                                            }
                                            c0883ft4.f4088f = m1533i;
                                            c0883ft4.f4089g = m1533i;
                                            boolean isEmpty = list5.isEmpty();
                                            C1701c0 c1701c03 = c0883ft4.f4086d;
                                            ArrayList arrayList6 = new ArrayList(AbstractC1807o.m3073U(m1533i));
                                            Iterator it8 = m1533i.iterator();
                                            while (it8.hasNext()) {
                                                arrayList6.add(C1255rs.m2302b((C1255rs) it8.next()));
                                            }
                                            int i27 = c1224qs4.f7184e;
                                            if (isEmpty) {
                                                m4058v = "网关解析暂不可用，沿用上次网关继续探测";
                                            } else {
                                                m4058v = AbstractC2487d.m4058v("Ping 监控中 · ", str9);
                                            }
                                            String str24 = str9;
                                            C0915gt c0915gt3 = new C0915gt(true, str2, arrayList6, null, 0, i27, str24, isEmpty, m4058v, 24);
                                            c1701c03.getClass();
                                            c1701c03.m2752j(null, c0915gt3);
                                            int i28 = c1224qs4.f7184e;
                                            i8 = 900;
                                            if (z9 || booleanValue) {
                                                int i29 = i28 - 1400;
                                                if (i29 < 0) {
                                                    i29 = 0;
                                                }
                                                i8 = 900 + ((i29 / 512) * 100);
                                                if (i8 > 8000) {
                                                    i8 = 8000;
                                                }
                                            }
                                            z10 = z9;
                                            c1193ps = new C1193ps(c1224qs4.f7185f);
                                            c0851et = c0851et2;
                                            str10 = str24;
                                            i9 = 0;
                                            z11 = booleanValue;
                                            str11 = str2;
                                            while (c0883ft4.f4084b.get()) {
                                                InterfaceC2318h interfaceC2318h = c0851et.f13999f;
                                                AbstractC3367j.m5097b(interfaceC2318h);
                                                if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                                                    List list7 = c0883ft4.f4088f;
                                                    if (list7.isEmpty()) {
                                                        c1224qs4.getClass();
                                                        c0851et.f3850h = c0883ft4;
                                                        c0851et.f3851i = context3;
                                                        c0851et.f3852j = c1224qs4;
                                                        c0851et.f3853k = str11;
                                                        c0851et.f3854l = str10;
                                                        c0851et.f3855m = c1193ps;
                                                        c0851et.f3865w = z10;
                                                        c0851et.f3866x = z11;
                                                        c0851et.f3867y = i9;
                                                        c0851et.f3868z = i8;
                                                        c0851et.f3849D = 4;
                                                        String str25 = str10;
                                                        String str26 = str11;
                                                        if (AbstractC0525d0.m1131i(1000L, c0851et) != enumC2465a2) {
                                                            str10 = str25;
                                                            str11 = str26;
                                                        }
                                                    } else {
                                                        String str27 = str10;
                                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                                        Collection collection10 = new ArrayList(AbstractC1807o.m3073U(list7));
                                                        Iterator it9 = list7.iterator();
                                                        int i30 = i9 + 1;
                                                        String str28 = str27;
                                                        long j10 = elapsedRealtime;
                                                        String str29 = str11;
                                                        if (!it9.hasNext()) {
                                                            c1255rs4 = (C1255rs) it9.next();
                                                            collection = collection10;
                                                            List list8 = c1255rs4.f7439e;
                                                            Iterator it10 = it9;
                                                            enumC0908gm = enumC0908gm3;
                                                            enumC0876fm2 = enumC0876fm11;
                                                            enumC0876fm3 = enumC0876fm12;
                                                            enumC2465a4 = enumC2465a2;
                                                            c0883ft7 = c0883ft4;
                                                            i17 = i8;
                                                            z13 = z10;
                                                            j8 = j10;
                                                            str13 = str29;
                                                            i16 = i30;
                                                            collection4 = new ArrayList(AbstractC1807o.m3073U(list8));
                                                            it6 = list8.iterator();
                                                            z12 = z11;
                                                            c0851et5 = c0851et;
                                                            context4 = context3;
                                                            str12 = str28;
                                                            it7 = it10;
                                                            collection9 = collection;
                                                            if (!it6.hasNext()) {
                                                                long j11 = j8;
                                                                c1286ss = (C1286ss) it6.next();
                                                                String str30 = c1286ss.f7666c;
                                                                EnumC1032km enumC1032km = c1286ss.f7664a;
                                                                int i31 = i17;
                                                                if (enumC1032km == EnumC1032km.f5311g) {
                                                                    z17 = true;
                                                                } else {
                                                                    z17 = false;
                                                                }
                                                                c0883ft7.getClass();
                                                                int ordinal = enumC1032km.ordinal();
                                                                if (ordinal != 0) {
                                                                    if (ordinal == 1) {
                                                                        z18 = z12;
                                                                    } else {
                                                                        throw new RuntimeException();
                                                                    }
                                                                } else {
                                                                    z18 = z13;
                                                                }
                                                                int i32 = c1224qs4.f7184e;
                                                                Network network = c1255rs4.f7437c;
                                                                String str31 = c1255rs4.f7438d;
                                                                c0851et5.f3850h = c0883ft7;
                                                                c0851et5.f3851i = context4;
                                                                c0851et5.f3852j = c1224qs4;
                                                                c0851et5.f3853k = str13;
                                                                c0851et5.f3854l = str12;
                                                                c0851et5.f3855m = c1193ps;
                                                                c0851et5.f3856n = collection9;
                                                                c0851et5.f3857o = it7;
                                                                c0851et5.f3858p = c1255rs4;
                                                                c0851et5.f3859q = collection4;
                                                                c0851et5.f3860r = it6;
                                                                c0851et5.f3861s = c1286ss;
                                                                c0851et5.f3862t = collection4;
                                                                c0851et5.f3863u = collection;
                                                                c0851et5.f3864v = null;
                                                                c0851et5.f3865w = z13;
                                                                c0851et5.f3866x = z12;
                                                                c0851et5.f3867y = i16;
                                                                c0851et5.f3868z = i31;
                                                                i11 = i16;
                                                                Iterator it11 = it7;
                                                                c0851et5.f3846A = j11;
                                                                Iterator it12 = it6;
                                                                c0851et5.f3849D = 5;
                                                                c0851et3 = c0851et5;
                                                                Context context7 = context4;
                                                                Object m1545k = c0883ft7.m1545k(str30, z17, z18, i31, i32, network, str31, context7, c0851et3);
                                                                enumC2465a3 = enumC2465a4;
                                                                if (m1545k != enumC2465a3) {
                                                                    c1224qs5 = c1224qs4;
                                                                    it2 = it11;
                                                                    c0883ft5 = c0883ft7;
                                                                    i10 = i31;
                                                                    context4 = context7;
                                                                    it = it12;
                                                                    j6 = j11;
                                                                    collection2 = collection4;
                                                                    obj2 = m1545k;
                                                                    c1255rs = c1255rs4;
                                                                    collection3 = collection9;
                                                                    c1317ts2 = (C1317ts) obj2;
                                                                    collection = collection;
                                                                    String str32 = c1255rs.f7435a;
                                                                    collection9 = collection3;
                                                                    EnumC1032km enumC1032km2 = c1286ss.f7664a;
                                                                    C1255rs c1255rs5 = c1255rs;
                                                                    String str33 = c1286ss.f7666c;
                                                                    int i33 = i10;
                                                                    StringBuilder sb = new StringBuilder();
                                                                    sb.append(str32);
                                                                    sb.append("|gateway|");
                                                                    sb.append(enumC1032km2);
                                                                    String str34 = str6;
                                                                    sb.append(str34);
                                                                    sb.append(str33);
                                                                    String sb2 = sb.toString();
                                                                    c1193ps.getClass();
                                                                    String str35 = str8;
                                                                    AbstractC3367j.m5100e(sb2, str35);
                                                                    AbstractC3367j.m5100e(c1317ts2, str7);
                                                                    C1131ns c1131ns = c1193ps.f6954a;
                                                                    boolean z25 = z12;
                                                                    boolean z26 = z13;
                                                                    double d10 = c1317ts2.f7864b;
                                                                    if (c1317ts2.f7863a) {
                                                                        double d11 = c1131ns.f6400b;
                                                                        double m3528o2 = AbstractC2168e.m3528o(c1131ns.f6399a, 1.0d, 60000.0d);
                                                                        if (d11 >= m3528o2) {
                                                                            m3528o2 = d11;
                                                                        }
                                                                        if (m3528o2 > 60000.0d) {
                                                                            m3528o2 = 60000.0d;
                                                                        }
                                                                        if (d10 <= m3528o2) {
                                                                            if (d10 > AbstractC2168e.m3528o(c1131ns.f6399a, 1.0d, 60000.0d)) {
                                                                                enumC0876fm5 = enumC0876fm;
                                                                            } else {
                                                                                enumC0876fm5 = enumC0876fm3;
                                                                            }
                                                                            collection4.add(c1286ss.m2333a(c1317ts2, c1193ps.m2084a(sb2, enumC0876fm5)));
                                                                            z12 = z25;
                                                                            z13 = z26;
                                                                            str6 = str34;
                                                                            str8 = str35;
                                                                            j8 = j6;
                                                                            collection4 = collection2;
                                                                            it6 = it;
                                                                            c0883ft7 = c0883ft5;
                                                                            it7 = it2;
                                                                            c1255rs4 = c1255rs5;
                                                                            c1224qs4 = c1224qs5;
                                                                            i16 = i11;
                                                                            i17 = i33;
                                                                            enumC2465a4 = enumC2465a3;
                                                                            c0851et5 = c0851et3;
                                                                            if (!it6.hasNext()) {
                                                                                C0851et c0851et6 = c0851et5;
                                                                                int i34 = i16;
                                                                                Iterator it13 = it7;
                                                                                context5 = context4;
                                                                                long j12 = j8;
                                                                                enumC2465a3 = enumC2465a4;
                                                                                list6 = (List) collection4;
                                                                                List list9 = c1255rs4.f7440f;
                                                                                c1255rs3 = c1255rs4;
                                                                                arrayList2 = new ArrayList(AbstractC1807o.m3073U(list9));
                                                                                it5 = list9.iterator();
                                                                                Collection collection11 = collection9;
                                                                                collection7 = collection;
                                                                                collection8 = collection11;
                                                                                str21 = str6;
                                                                                str15 = str13;
                                                                                str16 = str12;
                                                                                i8 = i17;
                                                                                c0851et4 = c0851et6;
                                                                                i14 = i34;
                                                                                j7 = j12;
                                                                                z15 = z12;
                                                                                c1224qs7 = c1224qs4;
                                                                                c1193ps3 = c1193ps;
                                                                                z14 = z13;
                                                                                it4 = it13;
                                                                                EnumC2465a enumC2465a8 = enumC2465a3;
                                                                                C1255rs c1255rs6 = c1255rs3;
                                                                                Context context8 = context5;
                                                                                if (!it5.hasNext()) {
                                                                                    C1286ss c1286ss3 = (C1286ss) it5.next();
                                                                                    int i35 = i8;
                                                                                    EnumC1032km enumC1032km3 = c1286ss3.f7664a;
                                                                                    c0883ft7.getClass();
                                                                                    int ordinal2 = enumC1032km3.ordinal();
                                                                                    if (ordinal2 != 0) {
                                                                                        i15 = i14;
                                                                                        if (ordinal2 == 1) {
                                                                                            z16 = z15;
                                                                                        } else {
                                                                                            throw new RuntimeException();
                                                                                        }
                                                                                    } else {
                                                                                        i15 = i14;
                                                                                        z16 = z14;
                                                                                    }
                                                                                    int i36 = c1224qs7.f7184e;
                                                                                    Network network2 = c1255rs6.f7437c;
                                                                                    String str36 = c1255rs6.f7438d;
                                                                                    C0883ft c0883ft8 = c0883ft7;
                                                                                    c0851et4.f3850h = c0883ft8;
                                                                                    c0851et4.f3851i = context8;
                                                                                    c0851et4.f3852j = c1224qs7;
                                                                                    c0851et4.f3853k = str15;
                                                                                    c0851et4.f3854l = str16;
                                                                                    c0851et4.f3855m = c1193ps3;
                                                                                    String str37 = str16;
                                                                                    c0851et4.f3856n = collection8;
                                                                                    c0851et4.f3857o = it4;
                                                                                    c0851et4.f3858p = c1255rs6;
                                                                                    c0851et4.f3859q = arrayList2;
                                                                                    c0851et4.f3860r = it5;
                                                                                    c0851et4.f3861s = arrayList2;
                                                                                    c0851et4.f3862t = c1286ss3;
                                                                                    c0851et4.f3863u = list6;
                                                                                    c0851et4.f3864v = collection7;
                                                                                    c0851et4.f3865w = z14;
                                                                                    c0851et4.f3866x = z15;
                                                                                    c0851et4.f3867y = i15;
                                                                                    c0851et4.f3868z = i35;
                                                                                    c0851et4.f3846A = j7;
                                                                                    c0851et4.f3849D = 6;
                                                                                    C0851et c0851et7 = c0851et4;
                                                                                    Object m1544j = c0883ft7.m1544j(c1286ss3, z16, i35, i36, network2, str36, context8, c0851et7);
                                                                                    enumC2465a3 = enumC2465a8;
                                                                                    if (m1544j != enumC2465a3) {
                                                                                        arrayList = arrayList2;
                                                                                        i12 = i15;
                                                                                        i13 = i35;
                                                                                        c0851et4 = c0851et7;
                                                                                        str14 = str37;
                                                                                        collection5 = collection8;
                                                                                        c0883ft6 = c0883ft8;
                                                                                        context5 = context8;
                                                                                        c1255rs2 = c1255rs6;
                                                                                        c1224qs6 = c1224qs7;
                                                                                        obj3 = m1544j;
                                                                                        c1193ps2 = c1193ps3;
                                                                                        collection6 = collection7;
                                                                                        it3 = it5;
                                                                                        c1286ss2 = c1286ss3;
                                                                                        c1317ts = (C1317ts) obj3;
                                                                                        Collection collection12 = collection6;
                                                                                        Iterator it14 = it3;
                                                                                        c1255rs3 = c1255rs2;
                                                                                        Iterator it15 = it4;
                                                                                        String str38 = c1255rs2.f7435a + "|external|" + c1286ss2.f7664a + str21 + c1286ss2.f7666c;
                                                                                        c1193ps2.getClass();
                                                                                        AbstractC3367j.m5100e(str38, str8);
                                                                                        AbstractC3367j.m5100e(c1317ts, str7);
                                                                                        C1131ns c1131ns2 = c1193ps2.f6954a;
                                                                                        String str39 = str15;
                                                                                        double d12 = c1317ts.f7864b;
                                                                                        if (c1317ts.f7863a) {
                                                                                            double d13 = c1131ns2.f6402d;
                                                                                            double m3528o3 = AbstractC2168e.m3528o(c1131ns2.f6401c, 1.0d, 60000.0d);
                                                                                            if (d13 >= m3528o3) {
                                                                                                m3528o3 = d13;
                                                                                            }
                                                                                            if (m3528o3 > 60000.0d) {
                                                                                                m3528o3 = 60000.0d;
                                                                                            }
                                                                                            if (d12 <= m3528o3) {
                                                                                                if (d12 > AbstractC2168e.m3528o(c1131ns2.f6401c, 1.0d, 60000.0d)) {
                                                                                                    enumC0876fm4 = enumC0876fm;
                                                                                                } else {
                                                                                                    enumC0876fm4 = enumC0876fm3;
                                                                                                }
                                                                                                arrayList2.add(c1286ss2.m2333a(c1317ts, c1193ps2.m2084a(str38, enumC0876fm4)));
                                                                                                it5 = it14;
                                                                                                it4 = it15;
                                                                                                str15 = str39;
                                                                                                c1193ps3 = c1193ps2;
                                                                                                i14 = i12;
                                                                                                i8 = i13;
                                                                                                arrayList2 = arrayList;
                                                                                                str16 = str14;
                                                                                                c1224qs7 = c1224qs6;
                                                                                                collection7 = collection12;
                                                                                                c0883ft7 = c0883ft6;
                                                                                                collection8 = collection5;
                                                                                                EnumC2465a enumC2465a82 = enumC2465a3;
                                                                                                C1255rs c1255rs62 = c1255rs3;
                                                                                                Context context82 = context5;
                                                                                                if (!it5.hasNext()) {
                                                                                                    String str40 = str16;
                                                                                                    C0851et c0851et8 = c0851et4;
                                                                                                    collection7.add(c1255rs62.m2303a(list6, arrayList2));
                                                                                                    Iterator it16 = it4;
                                                                                                    enumC2465a2 = enumC2465a82;
                                                                                                    it9 = it16;
                                                                                                    collection10 = collection8;
                                                                                                    c0883ft4 = c0883ft7;
                                                                                                    c1224qs4 = c1224qs7;
                                                                                                    str29 = str15;
                                                                                                    z10 = z14;
                                                                                                    i30 = i14;
                                                                                                    c0851et = c0851et8;
                                                                                                    j10 = j7;
                                                                                                    enumC0908gm3 = enumC0908gm;
                                                                                                    enumC0876fm11 = enumC0876fm2;
                                                                                                    enumC0876fm12 = enumC0876fm3;
                                                                                                    c1193ps = c1193ps3;
                                                                                                    z11 = z15;
                                                                                                    context3 = context82;
                                                                                                    str28 = str40;
                                                                                                    str6 = str21;
                                                                                                    if (!it9.hasNext()) {
                                                                                                        EnumC0908gm enumC0908gm4 = enumC0908gm3;
                                                                                                        enumC0876fm6 = enumC0876fm11;
                                                                                                        enumC0876fm7 = enumC0876fm12;
                                                                                                        EnumC2465a enumC2465a9 = enumC2465a2;
                                                                                                        str21 = str6;
                                                                                                        List<C1486zb> list10 = (List) collection10;
                                                                                                        c0883ft4.getClass();
                                                                                                        if (list10.isEmpty()) {
                                                                                                            m2186g = enumC0908gm4;
                                                                                                        } else {
                                                                                                            EnumC0876fm enumC0876fm13 = enumC0876fm7;
                                                                                                            EnumC0876fm enumC0876fm14 = enumC0876fm13;
                                                                                                            for (C1486zb c1486zb : list10) {
                                                                                                                enumC0876fm13 = AbstractC1249rm.m2267j0(enumC0876fm13, AbstractC1249rm.m2225J(c1486zb.f9846c));
                                                                                                                enumC0876fm14 = AbstractC1249rm.m2267j0(enumC0876fm14, AbstractC1249rm.m2225J(c1486zb.f9847d));
                                                                                                            }
                                                                                                            m2186g = C1247rk.m2186g(enumC0876fm13, enumC0876fm14);
                                                                                                        }
                                                                                                        C1701c0 c1701c04 = c0883ft4.f4086d;
                                                                                                        int i37 = c1224qs4.f7184e;
                                                                                                        C1131ns c1131ns3 = c1224qs4.f7185f;
                                                                                                        if (list10.size() <= 1) {
                                                                                                            C1486zb c1486zb2 = (C1486zb) AbstractC1805m.m3047k0(list10);
                                                                                                            if (c1486zb2 != null) {
                                                                                                                enumC0876fm8 = AbstractC1249rm.m2225J(c1486zb2.f9846c);
                                                                                                            } else {
                                                                                                                enumC0876fm8 = enumC0876fm7;
                                                                                                            }
                                                                                                            i18 = i37;
                                                                                                            if (c1486zb2 != null) {
                                                                                                                enumC0876fm9 = AbstractC1249rm.m2225J(c1486zb2.f9847d);
                                                                                                            } else {
                                                                                                                enumC0876fm9 = enumC0876fm7;
                                                                                                            }
                                                                                                            if (c1486zb2 != null) {
                                                                                                                j9 = j10;
                                                                                                                List list11 = c1486zb2.f9846c;
                                                                                                                ArrayList arrayList7 = new ArrayList();
                                                                                                                Iterator it17 = list11.iterator();
                                                                                                                while (it17.hasNext()) {
                                                                                                                    EnumC2465a enumC2465a10 = enumC2465a9;
                                                                                                                    Double d14 = ((C1187pm) it17.next()).f6907e;
                                                                                                                    if (d14 != null) {
                                                                                                                        arrayList7.add(d14);
                                                                                                                    }
                                                                                                                    enumC2465a9 = enumC2465a10;
                                                                                                                }
                                                                                                                enumC2465a5 = enumC2465a9;
                                                                                                                d7 = AbstractC1805m.m3054r0(arrayList7);
                                                                                                            } else {
                                                                                                                enumC2465a5 = enumC2465a9;
                                                                                                                j9 = j10;
                                                                                                                d7 = null;
                                                                                                            }
                                                                                                            if (c1486zb2 != null) {
                                                                                                                List list12 = c1486zb2.f9847d;
                                                                                                                ArrayList arrayList8 = new ArrayList();
                                                                                                                Iterator it18 = list12.iterator();
                                                                                                                while (it18.hasNext()) {
                                                                                                                    Iterator it19 = it18;
                                                                                                                    Double d15 = ((C1187pm) it18.next()).f6907e;
                                                                                                                    if (d15 != null) {
                                                                                                                        arrayList8.add(d15);
                                                                                                                    }
                                                                                                                    it18 = it19;
                                                                                                                }
                                                                                                                d8 = AbstractC1805m.m3054r0(arrayList8);
                                                                                                            } else {
                                                                                                                d8 = null;
                                                                                                            }
                                                                                                            if (enumC0876fm8 != enumC0876fm7) {
                                                                                                                z21 = true;
                                                                                                            } else {
                                                                                                                z21 = false;
                                                                                                            }
                                                                                                            if (enumC0876fm9 != enumC0876fm7) {
                                                                                                                z22 = true;
                                                                                                            } else {
                                                                                                                z22 = false;
                                                                                                            }
                                                                                                            if (z21 && z22) {
                                                                                                                if (enumC0876fm8 == enumC0876fm6 && enumC0876fm9 == enumC0876fm6) {
                                                                                                                    str20 = "内外 RTT 均严重偏高，链路整体拥塞";
                                                                                                                } else if (enumC0876fm8 != enumC0876fm6 && enumC0876fm9 != enumC0876fm6) {
                                                                                                                    str20 = "内外 RTT 均偏高，链路轻微拥塞";
                                                                                                                } else {
                                                                                                                    str20 = "内外链路存在严重拥塞";
                                                                                                                }
                                                                                                                enumC0876fm6 = enumC0876fm6;
                                                                                                                str17 = str20;
                                                                                                                z19 = z11;
                                                                                                                enumC0876fm7 = enumC0876fm7;
                                                                                                            } else {
                                                                                                                Double d16 = d8;
                                                                                                                if (z21) {
                                                                                                                    int ordinal3 = enumC0876fm8.ordinal();
                                                                                                                    enumC0876fm7 = enumC0876fm7;
                                                                                                                    if (ordinal3 != 1) {
                                                                                                                        if (ordinal3 != 2) {
                                                                                                                            z19 = z11;
                                                                                                                        } else {
                                                                                                                            if (d7 != null) {
                                                                                                                                int doubleValue = (int) d7.doubleValue();
                                                                                                                                double d17 = c1131ns3.f6400b;
                                                                                                                                double m3528o4 = AbstractC2168e.m3528o(c1131ns3.f6399a, 1.0d, 60000.0d);
                                                                                                                                if (d17 < m3528o4) {
                                                                                                                                    d9 = m3528o4;
                                                                                                                                } else {
                                                                                                                                    d9 = d17;
                                                                                                                                }
                                                                                                                                if (d9 > 60000.0d) {
                                                                                                                                    d9 = 60000.0d;
                                                                                                                                }
                                                                                                                                str19 = AbstractC0094y0.m183j(doubleValue, (int) d9, "内网 RTT ", "ms > ", "ms，内网拥塞");
                                                                                                                            } else {
                                                                                                                                str19 = "内网网关超时，内网拥塞";
                                                                                                                            }
                                                                                                                            str17 = str19;
                                                                                                                            z19 = z11;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        boolean z27 = z11;
                                                                                                                        if (d7 != null) {
                                                                                                                            i22 = (int) d7.doubleValue();
                                                                                                                        } else {
                                                                                                                            i22 = 0;
                                                                                                                        }
                                                                                                                        str17 = AbstractC0094y0.m183j(i22, (int) AbstractC2168e.m3528o(c1131ns3.f6399a, 1.0d, 60000.0d), "内网 RTT ", "ms > ", "ms，内网轻微拥塞");
                                                                                                                        z19 = z27;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    enumC0876fm7 = enumC0876fm7;
                                                                                                                    boolean z28 = z11;
                                                                                                                    if (z22) {
                                                                                                                        int ordinal4 = enumC0876fm9.ordinal();
                                                                                                                        if (ordinal4 != 1) {
                                                                                                                            if (ordinal4 != 2) {
                                                                                                                                z19 = z28;
                                                                                                                            } else if (d16 != null) {
                                                                                                                                z19 = z28;
                                                                                                                                i21 = (int) d16.doubleValue();
                                                                                                                                i19 = i8;
                                                                                                                                z20 = z10;
                                                                                                                                double d18 = c1131ns3.f6402d;
                                                                                                                                double m3528o5 = AbstractC2168e.m3528o(c1131ns3.f6401c, 1.0d, 60000.0d);
                                                                                                                                if (d18 >= m3528o5) {
                                                                                                                                    m3528o5 = d18;
                                                                                                                                }
                                                                                                                                if (m3528o5 > 60000.0d) {
                                                                                                                                    m3528o5 = 60000.0d;
                                                                                                                                }
                                                                                                                                m3528o = (int) m3528o5;
                                                                                                                                str18 = "ms，外网拥塞";
                                                                                                                            } else {
                                                                                                                                z19 = z28;
                                                                                                                                i19 = i8;
                                                                                                                                z20 = z10;
                                                                                                                                m183j = "外网目标超时，外网拥塞";
                                                                                                                                str17 = m183j;
                                                                                                                                enumC0908gm2 = enumC0908gm4;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            z19 = z28;
                                                                                                                            i19 = i8;
                                                                                                                            z20 = z10;
                                                                                                                            if (d16 != null) {
                                                                                                                                i21 = (int) d16.doubleValue();
                                                                                                                            } else {
                                                                                                                                i21 = 0;
                                                                                                                            }
                                                                                                                            m3528o = (int) AbstractC2168e.m3528o(c1131ns3.f6401c, 1.0d, 60000.0d);
                                                                                                                            str18 = "ms，外网轻微拥塞";
                                                                                                                        }
                                                                                                                        m183j = AbstractC0094y0.m183j(i21, m3528o, "外网 RTT ", "ms > ", str18);
                                                                                                                        str17 = m183j;
                                                                                                                        enumC0908gm2 = enumC0908gm4;
                                                                                                                    } else {
                                                                                                                        z19 = z28;
                                                                                                                        i19 = i8;
                                                                                                                        z20 = z10;
                                                                                                                        m183j = "链路正常";
                                                                                                                        str17 = m183j;
                                                                                                                        enumC0908gm2 = enumC0908gm4;
                                                                                                                    }
                                                                                                                }
                                                                                                                i19 = i8;
                                                                                                                z20 = z10;
                                                                                                                m183j = "链路正常";
                                                                                                                str17 = m183j;
                                                                                                                enumC0908gm2 = enumC0908gm4;
                                                                                                            }
                                                                                                            i19 = i8;
                                                                                                            z20 = z10;
                                                                                                            enumC0908gm2 = enumC0908gm4;
                                                                                                        } else {
                                                                                                            enumC2465a5 = enumC2465a9;
                                                                                                            i18 = i37;
                                                                                                            z19 = z11;
                                                                                                            i19 = i8;
                                                                                                            j9 = j10;
                                                                                                            z20 = z10;
                                                                                                            ArrayList arrayList9 = new ArrayList();
                                                                                                            for (Object obj5 : list10) {
                                                                                                                EnumC0908gm enumC0908gm5 = enumC0908gm4;
                                                                                                                if (((C1486zb) obj5).f9848e != enumC0908gm5) {
                                                                                                                    arrayList9.add(obj5);
                                                                                                                }
                                                                                                                enumC0908gm4 = enumC0908gm5;
                                                                                                            }
                                                                                                            enumC0908gm2 = enumC0908gm4;
                                                                                                            String m3051o02 = AbstractC1805m.m3051o0(arrayList9, "、", null, null, new C0866fc(29), 30);
                                                                                                            if (AbstractC1348us.f8014b[m2186g.ordinal()] == 1) {
                                                                                                                m3051o02 = "全部接口链路正常";
                                                                                                            } else if (AbstractC0444k.m937a0(m3051o02)) {
                                                                                                                m3051o02 = m2186g.f4316e;
                                                                                                            }
                                                                                                            str17 = m3051o02;
                                                                                                        }
                                                                                                        C0915gt c0915gt4 = new C0915gt(true, str29, list10, m2186g, i30, i18, str28, false, str17, 128);
                                                                                                        String str41 = str29;
                                                                                                        int i38 = i30;
                                                                                                        String str42 = str28;
                                                                                                        c1701c04.getClass();
                                                                                                        c1701c04.m2752j(null, c0915gt4);
                                                                                                        long elapsedRealtime2 = 1000 - (SystemClock.elapsedRealtime() - j9);
                                                                                                        if (elapsedRealtime2 < 0) {
                                                                                                            elapsedRealtime2 = 0;
                                                                                                        }
                                                                                                        c0851et.f3850h = c0883ft4;
                                                                                                        c0851et.f3851i = context3;
                                                                                                        c0851et.f3852j = c1224qs4;
                                                                                                        c0851et.f3853k = str41;
                                                                                                        c0851et.f3854l = str42;
                                                                                                        c0851et.f3855m = c1193ps;
                                                                                                        c0851et.f3856n = null;
                                                                                                        c0851et.f3857o = null;
                                                                                                        c0851et.f3858p = null;
                                                                                                        c0851et.f3859q = null;
                                                                                                        c0851et.f3860r = null;
                                                                                                        c0851et.f3861s = null;
                                                                                                        c0851et.f3862t = null;
                                                                                                        c0851et.f3863u = null;
                                                                                                        c0851et.f3864v = null;
                                                                                                        boolean z29 = z20;
                                                                                                        c0851et.f3865w = z29;
                                                                                                        c0851et.f3866x = z19;
                                                                                                        c0851et.f3867y = i38;
                                                                                                        c0851et.f3868z = i19;
                                                                                                        c0851et.f3849D = 7;
                                                                                                        enumC2465a6 = enumC2465a5;
                                                                                                        if (AbstractC0525d0.m1131i(elapsedRealtime2, c0851et) == enumC2465a6) {
                                                                                                            return enumC2465a6;
                                                                                                        }
                                                                                                        z10 = z29;
                                                                                                        str11 = str41;
                                                                                                        str10 = str42;
                                                                                                        i20 = i38;
                                                                                                        z11 = z19;
                                                                                                        str6 = str21;
                                                                                                        i9 = i20;
                                                                                                        enumC0908gm3 = enumC0908gm2;
                                                                                                        enumC0876fm11 = enumC0876fm6;
                                                                                                        i8 = i19;
                                                                                                        enumC2465a2 = enumC2465a6;
                                                                                                        enumC0876fm12 = enumC0876fm7;
                                                                                                        while (c0883ft4.f4084b.get()) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        enumC0876fm4 = enumC0876fm2;
                                                                                        arrayList2.add(c1286ss2.m2333a(c1317ts, c1193ps2.m2084a(str38, enumC0876fm4)));
                                                                                        it5 = it14;
                                                                                        it4 = it15;
                                                                                        str15 = str39;
                                                                                        c1193ps3 = c1193ps2;
                                                                                        i14 = i12;
                                                                                        i8 = i13;
                                                                                        arrayList2 = arrayList;
                                                                                        str16 = str14;
                                                                                        c1224qs7 = c1224qs6;
                                                                                        collection7 = collection12;
                                                                                        c0883ft7 = c0883ft6;
                                                                                        collection8 = collection5;
                                                                                        EnumC2465a enumC2465a822 = enumC2465a3;
                                                                                        C1255rs c1255rs622 = c1255rs3;
                                                                                        Context context822 = context5;
                                                                                        if (!it5.hasNext()) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    enumC0876fm5 = enumC0876fm2;
                                                                    collection4.add(c1286ss.m2333a(c1317ts2, c1193ps.m2084a(sb2, enumC0876fm5)));
                                                                    z12 = z25;
                                                                    z13 = z26;
                                                                    str6 = str34;
                                                                    str8 = str35;
                                                                    j8 = j6;
                                                                    collection4 = collection2;
                                                                    it6 = it;
                                                                    c0883ft7 = c0883ft5;
                                                                    it7 = it2;
                                                                    c1255rs4 = c1255rs5;
                                                                    c1224qs4 = c1224qs5;
                                                                    i16 = i11;
                                                                    i17 = i33;
                                                                    enumC2465a4 = enumC2465a3;
                                                                    c0851et5 = c0851et3;
                                                                    if (!it6.hasNext()) {
                                                                    }
                                                                }
                                                                return enumC2465a3;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    c0883ft4.f4084b.set(false);
                                                    C1701c0 c1701c05 = c0883ft4.f4086d;
                                                    c1701c05.m2752j(null, C0915gt.m1552a((C0915gt) c1701c05.getValue(), false, null, false, "已停止", 254));
                                                    return c1694m;
                                                }
                                            }
                                            c0883ft4.f4084b.set(false);
                                            C1701c0 c1701c052 = c0883ft4.f4086d;
                                            c1701c052.m2752j(null, C0915gt.m1552a((C0915gt) c1701c052.getValue(), false, null, false, "已停止", 254));
                                            return c1694m;
                                        }
                                        return enumC2465a2;
                                    }
                                }
                                enumC2465a = enumC2465a7;
                                ArrayList arrayList32 = c1224qs3.f7182c;
                                size = arrayList32.size();
                                i7 = 0;
                                while (true) {
                                    if (i7 < size) {
                                    }
                                }
                                str5 = (String) obj;
                                if (str5 != null) {
                                }
                            }
                        }
                        return enumC2465a7;
                    case 1:
                        str = c0851et.f3854l;
                        c1224qs2 = (C1224qs) c0851et.f3853k;
                        list2 = (List) c0851et.f3852j;
                        context2 = c0851et.f3851i;
                        c0883ft2 = c0851et.f3850h;
                        AbstractC1793a0.m2972L(obj4);
                        enumC0876fm = enumC0876fm10;
                        boolean booleanValue22 = ((Boolean) obj4).booleanValue();
                        int i252 = c1224qs2.f7184e;
                        c0851et.f3850h = c0883ft2;
                        c0851et.f3851i = context2;
                        c0851et.f3852j = list2;
                        c0851et.f3853k = c1224qs2;
                        c0851et.f3854l = str;
                        c0851et.f3865w = booleanValue22;
                        c0851et.f3849D = 2;
                        c0883ft2.getClass();
                        C2325e c2325e22 = AbstractC0549l0.f1898a;
                        String str222 = str;
                        C1224qs c1224qs82 = c1224qs2;
                        obj4 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C1257s(c0883ft2, true, i252, null), c0851et);
                        if (obj4 != enumC2465a7) {
                        }
                        return enumC2465a7;
                    case 2:
                        z7 = c0851et.f3865w;
                        String str43 = c0851et.f3854l;
                        C1224qs c1224qs9 = (C1224qs) c0851et.f3853k;
                        list3 = (List) c0851et.f3852j;
                        Context context9 = c0851et.f3851i;
                        c0883ft3 = c0851et.f3850h;
                        AbstractC1793a0.m2972L(obj4);
                        str2 = str43;
                        enumC0876fm = enumC0876fm10;
                        c1224qs3 = c1224qs9;
                        context3 = context9;
                        booleanValue = ((Boolean) obj4).booleanValue();
                        if (!z7) {
                        }
                        c1694m = c1694m2;
                        if (z7) {
                        }
                        int i262 = c1224qs3.f7184e;
                        if (!z7) {
                        }
                        enumC2465a = enumC2465a7;
                        str4 = "ICMP " + i262 + "B · " + str3 + "，失败时 TCP";
                        ArrayList arrayList322 = c1224qs3.f7182c;
                        size = arrayList322.size();
                        i7 = 0;
                        while (true) {
                            if (i7 < size) {
                            }
                        }
                        str5 = (String) obj;
                        if (str5 != null) {
                        }
                        break;
                    case 3:
                        boolean z30 = c0851et.f3866x;
                        boolean z31 = c0851et.f3865w;
                        String str44 = (String) c0851et.f3855m;
                        String str45 = c0851et.f3854l;
                        C1224qs c1224qs10 = (C1224qs) c0851et.f3853k;
                        list4 = (List) c0851et.f3852j;
                        Context context10 = c0851et.f3851i;
                        C0883ft c0883ft9 = c0851et.f3850h;
                        AbstractC1793a0.m2972L(obj4);
                        str6 = str21;
                        c0851et2 = c0851et;
                        str2 = str45;
                        str7 = "probe";
                        str8 = "key";
                        z8 = false;
                        str9 = str44;
                        c1224qs4 = c1224qs10;
                        context3 = context10;
                        m1541d = obj4;
                        enumC0876fm = enumC0876fm10;
                        booleanValue = z30;
                        z9 = z31;
                        c1694m = c1694m2;
                        enumC2465a2 = enumC2465a7;
                        c0883ft4 = c0883ft9;
                        list5 = (List) m1541d;
                        if (list5.isEmpty()) {
                        }
                        if (!m1533i.isEmpty()) {
                        }
                        break;
                    case 4:
                        int i39 = c0851et.f3868z;
                        int i40 = c0851et.f3867y;
                        boolean z32 = c0851et.f3866x;
                        boolean z33 = c0851et.f3865w;
                        C1193ps c1193ps4 = (C1193ps) c0851et.f3855m;
                        String str46 = c0851et.f3854l;
                        String str47 = (String) c0851et.f3853k;
                        C1224qs c1224qs11 = (C1224qs) c0851et.f3852j;
                        Context context11 = c0851et.f3851i;
                        C0883ft c0883ft10 = c0851et.f3850h;
                        AbstractC1793a0.m2972L(obj4);
                        enumC0876fm = enumC0876fm10;
                        z11 = z32;
                        context3 = context11;
                        str11 = str47;
                        str6 = str21;
                        str7 = "probe";
                        str8 = "key";
                        c1224qs4 = c1224qs11;
                        c1193ps = c1193ps4;
                        z10 = z33;
                        i8 = i39;
                        c1694m = c1694m2;
                        enumC2465a2 = enumC2465a7;
                        c0883ft4 = c0883ft10;
                        str10 = str46;
                        i9 = i40;
                        while (c0883ft4.f4084b.get()) {
                        }
                        c0883ft4.f4084b.set(false);
                        C1701c0 c1701c0522 = c0883ft4.f4086d;
                        c1701c0522.m2752j(null, C0915gt.m1552a((C0915gt) c1701c0522.getValue(), false, null, false, "已停止", 254));
                        return c1694m;
                    case AbstractC3122c.f15761f /* 5 */:
                        long j13 = c0851et.f3846A;
                        int i41 = c0851et.f3868z;
                        int i42 = c0851et.f3867y;
                        boolean z34 = c0851et.f3866x;
                        boolean z35 = c0851et.f3865w;
                        Collection collection13 = c0851et.f3863u;
                        Collection collection14 = (Collection) c0851et.f3862t;
                        collection = collection13;
                        C1286ss c1286ss4 = (C1286ss) c0851et.f3861s;
                        it = c0851et.f3860r;
                        Collection collection15 = c0851et.f3859q;
                        C1255rs c1255rs7 = c0851et.f3858p;
                        it2 = c0851et.f3857o;
                        Collection collection16 = c0851et.f3856n;
                        C1193ps c1193ps5 = (C1193ps) c0851et.f3855m;
                        String str48 = c0851et.f3854l;
                        String str49 = (String) c0851et.f3853k;
                        c1224qs5 = (C1224qs) c0851et.f3852j;
                        Context context12 = c0851et.f3851i;
                        C0883ft c0883ft11 = c0851et.f3850h;
                        AbstractC1793a0.m2972L(obj4);
                        collection2 = collection15;
                        str6 = str21;
                        enumC0908gm = enumC0908gm3;
                        enumC0876fm2 = enumC0876fm11;
                        enumC0876fm3 = enumC0876fm12;
                        c0851et3 = c0851et;
                        i10 = i41;
                        i11 = i42;
                        z12 = z34;
                        str7 = "probe";
                        str8 = "key";
                        j6 = j13;
                        c1193ps = c1193ps5;
                        str12 = str48;
                        context4 = context12;
                        c1286ss = c1286ss4;
                        obj2 = obj4;
                        enumC0876fm = enumC0876fm10;
                        c1694m = c1694m2;
                        z13 = z35;
                        c1255rs = c1255rs7;
                        collection3 = collection16;
                        c0883ft5 = c0883ft11;
                        collection4 = collection14;
                        enumC2465a3 = enumC2465a7;
                        str13 = str49;
                        c1317ts2 = (C1317ts) obj2;
                        collection = collection;
                        String str322 = c1255rs.f7435a;
                        collection9 = collection3;
                        EnumC1032km enumC1032km22 = c1286ss.f7664a;
                        C1255rs c1255rs52 = c1255rs;
                        String str332 = c1286ss.f7666c;
                        int i332 = i10;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str322);
                        sb3.append("|gateway|");
                        sb3.append(enumC1032km22);
                        String str342 = str6;
                        sb3.append(str342);
                        sb3.append(str332);
                        String sb22 = sb3.toString();
                        c1193ps.getClass();
                        String str352 = str8;
                        AbstractC3367j.m5100e(sb22, str352);
                        AbstractC3367j.m5100e(c1317ts2, str7);
                        C1131ns c1131ns4 = c1193ps.f6954a;
                        boolean z252 = z12;
                        boolean z262 = z13;
                        double d102 = c1317ts2.f7864b;
                        if (c1317ts2.f7863a) {
                        }
                        enumC0876fm5 = enumC0876fm2;
                        collection4.add(c1286ss.m2333a(c1317ts2, c1193ps.m2084a(sb22, enumC0876fm5)));
                        z12 = z252;
                        z13 = z262;
                        str6 = str342;
                        str8 = str352;
                        j8 = j6;
                        collection4 = collection2;
                        it6 = it;
                        c0883ft7 = c0883ft5;
                        it7 = it2;
                        c1255rs4 = c1255rs52;
                        c1224qs4 = c1224qs5;
                        i16 = i11;
                        i17 = i332;
                        enumC2465a4 = enumC2465a3;
                        c0851et5 = c0851et3;
                        if (!it6.hasNext()) {
                        }
                        break;
                    case AbstractC3122c.f15759d /* 6 */:
                        long j14 = c0851et.f3846A;
                        int i43 = c0851et.f3868z;
                        i12 = c0851et.f3867y;
                        boolean z36 = c0851et.f3866x;
                        boolean z37 = c0851et.f3865w;
                        Collection collection17 = c0851et.f3864v;
                        List list13 = (List) c0851et.f3863u;
                        C1286ss c1286ss5 = (C1286ss) c0851et.f3862t;
                        ?? r02 = (Collection) c0851et.f3861s;
                        Iterator it20 = c0851et.f3860r;
                        arrayList = c0851et.f3859q;
                        C1255rs c1255rs8 = c0851et.f3858p;
                        Iterator it21 = c0851et.f3857o;
                        collection5 = c0851et.f3856n;
                        C1193ps c1193ps6 = (C1193ps) c0851et.f3855m;
                        str14 = c0851et.f3854l;
                        String str50 = (String) c0851et.f3853k;
                        c1224qs6 = (C1224qs) c0851et.f3852j;
                        context5 = c0851et.f3851i;
                        C0883ft c0883ft12 = c0851et.f3850h;
                        AbstractC1793a0.m2972L(obj4);
                        enumC0876fm = enumC0876fm10;
                        it3 = it20;
                        j7 = j14;
                        c0883ft6 = c0883ft12;
                        enumC0908gm = enumC0908gm3;
                        enumC0876fm2 = enumC0876fm11;
                        enumC0876fm3 = enumC0876fm12;
                        str7 = "probe";
                        str8 = "key";
                        z14 = z37;
                        c1255rs2 = c1255rs8;
                        c1193ps2 = c1193ps6;
                        collection6 = collection17;
                        list6 = list13;
                        obj3 = obj4;
                        enumC2465a3 = enumC2465a7;
                        i13 = i43;
                        z15 = z36;
                        arrayList2 = r02;
                        c1286ss2 = c1286ss5;
                        c1694m = c1694m2;
                        c0851et4 = c0851et;
                        it4 = it21;
                        str15 = str50;
                        c1317ts = (C1317ts) obj3;
                        Collection collection122 = collection6;
                        Iterator it142 = it3;
                        c1255rs3 = c1255rs2;
                        Iterator it152 = it4;
                        String str382 = c1255rs2.f7435a + "|external|" + c1286ss2.f7664a + str21 + c1286ss2.f7666c;
                        c1193ps2.getClass();
                        AbstractC3367j.m5100e(str382, str8);
                        AbstractC3367j.m5100e(c1317ts, str7);
                        C1131ns c1131ns22 = c1193ps2.f6954a;
                        String str392 = str15;
                        double d122 = c1317ts.f7864b;
                        if (c1317ts.f7863a) {
                        }
                        enumC0876fm4 = enumC0876fm2;
                        arrayList2.add(c1286ss2.m2333a(c1317ts, c1193ps2.m2084a(str382, enumC0876fm4)));
                        it5 = it142;
                        it4 = it152;
                        str15 = str392;
                        c1193ps3 = c1193ps2;
                        i14 = i12;
                        i8 = i13;
                        arrayList2 = arrayList;
                        str16 = str14;
                        c1224qs7 = c1224qs6;
                        collection7 = collection122;
                        c0883ft7 = c0883ft6;
                        collection8 = collection5;
                        EnumC2465a enumC2465a8222 = enumC2465a3;
                        C1255rs c1255rs6222 = c1255rs3;
                        Context context8222 = context5;
                        if (!it5.hasNext()) {
                        }
                        break;
                    case 7:
                        int i44 = c0851et.f3868z;
                        i20 = c0851et.f3867y;
                        boolean z38 = c0851et.f3866x;
                        boolean z39 = c0851et.f3865w;
                        C1193ps c1193ps7 = (C1193ps) c0851et.f3855m;
                        String str51 = c0851et.f3854l;
                        String str52 = (String) c0851et.f3853k;
                        C1224qs c1224qs12 = (C1224qs) c0851et.f3852j;
                        Context context13 = c0851et.f3851i;
                        C0883ft c0883ft13 = c0851et.f3850h;
                        AbstractC1793a0.m2972L(obj4);
                        str11 = str52;
                        enumC0876fm = enumC0876fm10;
                        enumC0876fm6 = enumC0876fm11;
                        enumC0876fm7 = enumC0876fm12;
                        c1694m = c1694m2;
                        enumC2465a6 = enumC2465a7;
                        z11 = z38;
                        str7 = "probe";
                        str8 = "key";
                        i19 = i44;
                        c1224qs4 = c1224qs12;
                        context3 = context13;
                        c0883ft4 = c0883ft13;
                        c1193ps = c1193ps7;
                        str10 = str51;
                        z10 = z39;
                        enumC0908gm2 = enumC0908gm3;
                        str6 = str21;
                        i9 = i20;
                        enumC0908gm3 = enumC0908gm2;
                        enumC0876fm11 = enumC0876fm6;
                        i8 = i19;
                        enumC2465a2 = enumC2465a6;
                        enumC0876fm12 = enumC0876fm7;
                        while (c0883ft4.f4084b.get()) {
                        }
                        c0883ft4.f4084b.set(false);
                        C1701c0 c1701c05222 = c0883ft4.f4086d;
                        c1701c05222.m2752j(null, C0915gt.m1552a((C0915gt) c1701c05222.getValue(), false, null, false, "已停止", 254));
                        return c1694m;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c0851et = new C0851et(c0883ft, abstractC2583c);
        Object obj42 = c0851et.f3847B;
        EnumC2465a enumC2465a72 = EnumC2465a.f13750e;
        String str212 = "|";
        switch (c0851et.f3849D) {
        }
    }

    /* renamed from: e */
    public static String[] m1531e(String str, int i7, int i8, boolean z7, String str2, Integer num) {
        ArrayList m3069Q;
        String obj;
        if (z7) {
            m3069Q = AbstractC1806n.m3069Q("ping6", "-n", "-c", "1", "-W", String.valueOf(i7));
        } else {
            m3069Q = AbstractC1806n.m3069Q("ping", "-n", "-c", "1", "-W", String.valueOf(i7));
        }
        if (str2 != null && (obj = AbstractC0444k.m956t0(str2).toString()) != null) {
            if (AbstractC0444k.m937a0(obj)) {
                obj = null;
            }
            if (obj != null) {
                m3069Q.add("-I");
                m3069Q.add(obj);
            }
        }
        if (i8 > 0) {
            m3069Q.add("-s");
            m3069Q.add(String.valueOf(i8));
        }
        if (num != null) {
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                m3069Q.add("-t");
                m3069Q.add(String.valueOf(intValue));
            }
        }
        m3069Q.add(str);
        return (String[]) m3069Q.toArray(new String[0]);
    }

    /* renamed from: h */
    public static boolean m1532h(String str) {
        if (str == null) {
            str = "";
        }
        if (!AbstractC0451r.m971M(str, "rmnet", false) && !AbstractC0451r.m971M(str, "ccmni", false) && !AbstractC0451r.m971M(str, "wwan", false) && !AbstractC0451r.m971M(str, "seth", false) && !AbstractC0451r.m971M(str, "pdp", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static List m1533i(List list, List list2) {
        C1255rs c1255rs;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list2));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1248rl) it.next()).f7390a);
            }
            List m3060x0 = AbstractC1805m.m3060x0(arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C1255rs) it2.next()).f7435a);
            }
            if (AbstractC1805m.m3060x0(arrayList2).equals(m3060x0)) {
                int m3082N = AbstractC1817y.m3082N(AbstractC1807o.m3073U(list2));
                if (m3082N < 16) {
                    m3082N = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(m3082N);
                for (Object obj : list2) {
                    linkedHashMap.put(((C1248rl) obj).f7390a, obj);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    C1255rs c1255rs2 = (C1255rs) it3.next();
                    C1248rl c1248rl = (C1248rl) linkedHashMap.get(c1255rs2.f7435a);
                    if (c1248rl == null) {
                        c1255rs = null;
                    } else {
                        String str = c1248rl.f7391b;
                        Network network = c1248rl.f7392c;
                        String str2 = c1248rl.f7394e;
                        String str3 = c1255rs2.f7435a;
                        List list3 = c1255rs2.f7439e;
                        List list4 = c1255rs2.f7440f;
                        AbstractC3367j.m5100e(str3, "targetId");
                        AbstractC3367j.m5100e(str, "targetName");
                        c1255rs = new C1255rs(str3, str, network, str2, list3, list4);
                    }
                    if (c1255rs != null) {
                        arrayList3.add(c1255rs);
                    }
                }
                return arrayList3;
            }
        }
        return C1813u.f10860e;
    }

    /* renamed from: l */
    public static String m1534l(Process process) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                sb.append(readLine);
                sb.append('\n');
            }
            bufferedReader.close();
            bufferedReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            try {
                for (String readLine2 = bufferedReader.readLine(); readLine2 != null; readLine2 = bufferedReader.readLine()) {
                    sb.append(readLine2);
                    sb.append('\n');
                }
                bufferedReader.close();
                String sb2 = sb.toString();
                AbstractC3367j.m5099d(sb2, "toString(...)");
                return sb2;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } finally {
            }
        }
    }

    /* renamed from: m */
    public static InetAddress m1535m(String str, Network network) {
        InetAddress inetAddress;
        EnumC1124nl m2013a = AbstractC1155ol.m2013a(str);
        if (m2013a != EnumC1124nl.f6339e && m2013a != EnumC1124nl.f6340f) {
            if (network != null) {
                InetAddress[] allByName = network.getAllByName(str);
                AbstractC3367j.m5099d(allByName, "getAllByName(...)");
                if (allByName.length == 0) {
                    inetAddress = null;
                } else {
                    inetAddress = allByName[0];
                }
                if (inetAddress != null) {
                    return inetAddress;
                }
            }
            InetAddress byName = InetAddress.getByName(str);
            AbstractC3367j.m5099d(byName, "getByName(...)");
            return byName;
        }
        InetAddress byName2 = InetAddress.getByName(str);
        AbstractC3367j.m5099d(byName2, "getByName(...)");
        return byName2;
    }

    /* renamed from: n */
    public static InetAddress m1536n(String str, Network network, EnumC1032km enumC1032km) {
        Object m2985m;
        InetAddress inetAddress;
        int ordinal = AbstractC1155ol.m2013a(str).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                try {
                    if (network != null) {
                        InetAddress[] allByName = network.getAllByName(str);
                        AbstractC3367j.m5099d(allByName, "getAllByName(...)");
                        m2985m = AbstractC1804l.m3031X(allByName);
                    } else {
                        InetAddress[] allByName2 = InetAddress.getAllByName(str);
                        AbstractC3367j.m5099d(allByName2, "getAllByName(...)");
                        m2985m = AbstractC1804l.m3031X(allByName2);
                    }
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (m2985m instanceof C1689h) {
                    m2985m = C1813u.f10860e;
                }
                List list = (List) m2985m;
                int ordinal2 = enumC1032km.ordinal();
                Object obj = null;
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            InetAddress inetAddress2 = (InetAddress) next;
                            if (inetAddress2 instanceof Inet6Address) {
                                Inet6Address inet6Address = (Inet6Address) inetAddress2;
                                if (!inet6Address.isLoopbackAddress() && !inet6Address.isLinkLocalAddress()) {
                                    obj = next;
                                    break;
                                }
                            }
                        }
                        inetAddress = (InetAddress) obj;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (((InetAddress) next2) instanceof Inet4Address) {
                            obj = next2;
                            break;
                        }
                    }
                    inetAddress = (InetAddress) obj;
                }
                if (inetAddress == null) {
                    InetAddress byName = InetAddress.getByName(str);
                    AbstractC3367j.m5099d(byName, "getByName(...)");
                    return byName;
                }
                return inetAddress;
            }
            InetAddress byName2 = InetAddress.getByName(str);
            AbstractC3367j.m5099d(byName2, "getByName(...)");
            return byName2;
        }
        InetAddress byName3 = InetAddress.getByName(str);
        AbstractC3367j.m5099d(byName3, "getByName(...)");
        return byName3;
    }

    /* renamed from: o */
    public static String m1537o(Context context, Network network, String str) {
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        String interfaceName;
        String obj;
        String obj2;
        if (str != null && (obj2 = AbstractC0444k.m956t0(str).toString()) != null) {
            if (AbstractC0444k.m937a0(obj2)) {
                obj2 = null;
            }
            if (obj2 != null) {
                return obj2;
            }
        }
        if (network != null) {
            Object systemService = context.getSystemService("connectivity");
            if (systemService instanceof ConnectivityManager) {
                connectivityManager = (ConnectivityManager) systemService;
            } else {
                connectivityManager = null;
            }
            if (connectivityManager != null && (linkProperties = connectivityManager.getLinkProperties(network)) != null && (interfaceName = linkProperties.getInterfaceName()) != null && (obj = AbstractC0444k.m956t0(interfaceName).toString()) != null && !AbstractC0444k.m937a0(obj)) {
                return obj;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [g5.h] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* renamed from: p */
    public static List m1538p(String str, Network network) {
        ?? m2985m;
        InetAddress inetAddress;
        Object obj;
        String str2;
        int ordinal = AbstractC1155ol.m2013a(str).ordinal();
        EnumC1032km enumC1032km = EnumC1032km.f5310f;
        if (ordinal != 0) {
            EnumC1032km enumC1032km2 = EnumC1032km.f5311g;
            if (ordinal != 1) {
                C1813u c1813u = C1813u.f10860e;
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return c1813u;
                    }
                    throw new RuntimeException();
                }
                try {
                    if (network != null) {
                        InetAddress[] allByName = network.getAllByName(str);
                        AbstractC3367j.m5099d(allByName, "getAllByName(...)");
                        m2985m = AbstractC1804l.m3031X(allByName);
                    } else {
                        InetAddress[] allByName2 = InetAddress.getAllByName(str);
                        AbstractC3367j.m5099d(allByName2, "getAllByName(...)");
                        m2985m = AbstractC1804l.m3031X(allByName2);
                    }
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (!(m2985m instanceof C1689h)) {
                    c1813u = m2985m;
                }
                C1813u c1813u2 = c1813u;
                C2079c m5802f = AbstractC3784a.m5802f();
                Iterator it = c1813u2.iterator();
                while (true) {
                    inetAddress = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((InetAddress) obj) instanceof Inet4Address) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                InetAddress inetAddress2 = (InetAddress) obj;
                if (inetAddress2 != null) {
                    String hostAddress = inetAddress2.getHostAddress();
                    if (hostAddress == null) {
                        hostAddress = str;
                    }
                    m5802f.add(new C1286ss(enumC1032km, str, hostAddress, ""));
                }
                Iterator it2 = c1813u2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ?? next = it2.next();
                    InetAddress inetAddress3 = (InetAddress) next;
                    if (inetAddress3 instanceof Inet6Address) {
                        Inet6Address inet6Address = (Inet6Address) inetAddress3;
                        if (!inet6Address.isLoopbackAddress() && !inet6Address.isLinkLocalAddress()) {
                            inetAddress = next;
                            break;
                        }
                    }
                }
                InetAddress inetAddress4 = inetAddress;
                if (inetAddress4 != null) {
                    String hostAddress2 = inetAddress4.getHostAddress();
                    if (hostAddress2 != null) {
                        str2 = AbstractC0444k.m953q0(hostAddress2, '%');
                    } else {
                        str2 = str;
                    }
                    m5802f.add(new C1286ss(enumC1032km2, str, str2, ""));
                }
                C2079c m5798b = AbstractC3784a.m5798b(m5802f);
                if (m5798b.isEmpty()) {
                    return AbstractC1806n.m3067O(new C1286ss(enumC1032km, str, str, ""), new C1286ss(enumC1032km2, str, str, ""));
                }
                return m5798b;
            }
            String hostAddress3 = m1535m(str, network).getHostAddress();
            if (hostAddress3 == null) {
                hostAddress3 = str;
            }
            return AbstractC3784a.m5817z(new C1286ss(enumC1032km2, str, hostAddress3, ""));
        }
        String hostAddress4 = m1535m(str, network).getHostAddress();
        if (hostAddress4 == null) {
            hostAddress4 = str;
        }
        return AbstractC3784a.m5817z(new C1286ss(enumC1032km, str, hostAddress4, ""));
    }

    /* renamed from: q */
    public static String m1539q(C1224qs c1224qs) {
        return AbstractC1805m.m3051o0(AbstractC1806n.m3067O(AbstractC1805m.m3051o0(c1224qs.f7181b, "|", null, null, null, 62), AbstractC1805m.m3051o0(c1224qs.f7182c, "|", null, null, null, 62), String.valueOf(c1224qs.f7183d), String.valueOf(c1224qs.f7184e), c1224qs.f7185f.toString(), String.valueOf(1000L), String.valueOf(900)), "#", null, null, null, 62);
    }

    /* renamed from: s */
    public static C1286ss m1540s(String str, Network network) {
        EnumC1032km enumC1032km;
        if (AbstractC1348us.f8013a[AbstractC1155ol.m2013a(str).ordinal()] == 1) {
            enumC1032km = EnumC1032km.f5311g;
        } else {
            enumC1032km = EnumC1032km.f5310f;
        }
        String hostAddress = m1535m(str, network).getHostAddress();
        if (hostAddress == null) {
            hostAddress = str;
        }
        return new C1286ss(enumC1032km, str, hostAddress, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d8, code lost:
    
        if (p032d6.AbstractC0525d0.m1131i((r3 * 200) + 200, r1) == r6) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b9 -> B:11:0x00db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00d8 -> B:11:0x00db). Please report as a decompilation issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1541d(Context context, List list, ArrayList arrayList, ArrayList arrayList2, boolean z7, int i7, AbstractC2583c abstractC2583c) {
        C1472ys c1472ys;
        C0883ft c0883ft;
        int i8;
        Context context2;
        List list2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z8;
        C1472ys c1472ys2;
        C0883ft c0883ft2;
        int i9;
        int i10;
        C0883ft c0883ft3;
        Context context3;
        List list3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        boolean z9;
        int i11;
        int i12;
        List list4;
        if (abstractC2583c instanceof C1472ys) {
            c1472ys = (C1472ys) abstractC2583c;
            int i13 = c1472ys.f9791r;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1472ys.f9791r = i13 - Integer.MIN_VALUE;
                c0883ft = this;
                Object obj = c1472ys.f9789p;
                i8 = c1472ys.f9791r;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i8 == 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            i12 = c1472ys.f9788o;
                            i11 = c1472ys.f9787n;
                            z9 = c1472ys.f9786m;
                            ?? r9 = c1472ys.f9785l;
                            ?? r10 = c1472ys.f9784k;
                            list3 = c1472ys.f9783j;
                            context3 = c1472ys.f9782i;
                            c0883ft3 = c1472ys.f9781h;
                            AbstractC1793a0.m2972L(obj);
                            ArrayList arrayList7 = r9;
                            ArrayList arrayList8 = r10;
                            Context context4 = context3;
                            z8 = z9;
                            list2 = list3;
                            arrayList3 = arrayList8;
                            context2 = context4;
                            C0883ft c0883ft4 = c0883ft3;
                            arrayList4 = arrayList7;
                            c0883ft2 = c0883ft4;
                            i10 = i11;
                            int i14 = i12 + 1;
                            c1472ys2 = c1472ys;
                            i9 = i14;
                            if (i9 < i10) {
                                c1472ys2.f9781h = c0883ft2;
                                c1472ys2.f9782i = context2;
                                c1472ys2.f9783j = list2;
                                c1472ys2.f9784k = arrayList3;
                                c1472ys2.f9785l = arrayList4;
                                c1472ys2.f9786m = z8;
                                c1472ys2.f9787n = i10;
                                c1472ys2.f9788o = i9;
                                c1472ys2.f9791r = 1;
                                c0883ft2.getClass();
                                C2325e c2325e = AbstractC0549l0.f1898a;
                                Object m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C1441xs(list2, c0883ft2, context2, arrayList3, z8, arrayList4, null), c1472ys2);
                                if (m1122A != enumC2465a) {
                                    i11 = i10;
                                    obj = m1122A;
                                    C1472ys c1472ys3 = c1472ys2;
                                    i12 = i9;
                                    c1472ys = c1472ys3;
                                    ArrayList arrayList9 = arrayList3;
                                    list3 = list2;
                                    z9 = z8;
                                    context3 = context2;
                                    arrayList5 = arrayList9;
                                    ArrayList arrayList10 = arrayList4;
                                    c0883ft3 = c0883ft2;
                                    arrayList6 = arrayList10;
                                    list4 = (List) obj;
                                    if (list4.isEmpty()) {
                                        return list4;
                                    }
                                    arrayList7 = arrayList6;
                                    arrayList8 = arrayList5;
                                    if (i12 < i11 - 1) {
                                        c1472ys.f9781h = c0883ft3;
                                        c1472ys.f9782i = context3;
                                        c1472ys.f9783j = list3;
                                        c1472ys.f9784k = arrayList5;
                                        c1472ys.f9785l = arrayList6;
                                        c1472ys.f9786m = z9;
                                        c1472ys.f9787n = i11;
                                        c1472ys.f9788o = i12;
                                        c1472ys.f9791r = 2;
                                        arrayList7 = arrayList6;
                                        arrayList8 = arrayList5;
                                    }
                                    Context context42 = context3;
                                    z8 = z9;
                                    list2 = list3;
                                    arrayList3 = arrayList8;
                                    context2 = context42;
                                    C0883ft c0883ft42 = c0883ft3;
                                    arrayList4 = arrayList7;
                                    c0883ft2 = c0883ft42;
                                    i10 = i11;
                                    int i142 = i12 + 1;
                                    c1472ys2 = c1472ys;
                                    i9 = i142;
                                    if (i9 < i10) {
                                        return C1813u.f10860e;
                                    }
                                }
                                return enumC2465a;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i12 = c1472ys.f9788o;
                        i11 = c1472ys.f9787n;
                        z9 = c1472ys.f9786m;
                        ?? r92 = c1472ys.f9785l;
                        ?? r102 = c1472ys.f9784k;
                        list3 = c1472ys.f9783j;
                        context3 = c1472ys.f9782i;
                        c0883ft3 = c1472ys.f9781h;
                        AbstractC1793a0.m2972L(obj);
                        arrayList6 = r92;
                        arrayList5 = r102;
                        list4 = (List) obj;
                        if (list4.isEmpty()) {
                        }
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    context2 = context;
                    list2 = list;
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                    z8 = z7;
                    c1472ys2 = c1472ys;
                    c0883ft2 = c0883ft;
                    i9 = 0;
                    i10 = i7;
                    if (i9 < i10) {
                    }
                }
            }
        }
        c0883ft = this;
        c1472ys = new C1472ys(c0883ft, abstractC2583c);
        Object obj2 = c1472ys.f9789p;
        i8 = c1472ys.f9791r;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        if (i8 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1542f(Context context, C1248rl c1248rl, AbstractC2583c abstractC2583c) {
        C0724at c0724at;
        Object obj;
        int i7;
        ConnectivityManager connectivityManager;
        String str;
        Object m2985m;
        String str2;
        String str3;
        String str4;
        LinkedHashSet linkedHashSet;
        String str5;
        String str6;
        String str7;
        String str8;
        ArrayList arrayList;
        LinkedHashSet linkedHashSet2;
        String m1534l;
        String str9;
        int exitValue;
        String str10;
        Enumeration<InetAddress> inetAddresses;
        Inet4Address inet4Address;
        LinkProperties linkProperties;
        List<LinkAddress> linkAddresses;
        Inet4Address inet4Address2;
        if (abstractC2583c instanceof C0724at) {
            c0724at = (C0724at) abstractC2583c;
            int i8 = c0724at.f2518n;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0724at.f2518n = i8 - Integer.MIN_VALUE;
                C0724at c0724at2 = c0724at;
                obj = c0724at2.f2516l;
                i7 = c0724at2.f2518n;
                String str11 = " excluded=";
                String str12 = "message";
                if (i7 == 0) {
                    if (i7 == 1) {
                        str8 = c0724at2.f2515k;
                        arrayList = c0724at2.f2514j;
                        linkedHashSet2 = c0724at2.f2513i;
                        str7 = c0724at2.f2512h;
                        AbstractC1793a0.m2972L(obj);
                        str6 = "message";
                        str = " excluded=";
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    String m1537o = m1537o(context, c1248rl.f7392c, c1248rl.f7394e);
                    if (m1537o == null) {
                        AbstractC1249rm.m2234N0("CELLULAR_AIR_TRACE skip reason=no_bind_iface " + AbstractC1249rm.m2251b0(c1248rl));
                        return null;
                    }
                    if (!m1532h(m1537o)) {
                        AbstractC1249rm.m2234N0("CELLULAR_AIR_TRACE skip reason=non_cellular_iface bind=" + m1537o + " " + AbstractC1249rm.m2251b0(c1248rl));
                        return null;
                    }
                    Network network = c1248rl.f7392c;
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                    Object systemService = context.getSystemService("connectivity");
                    if (systemService instanceof ConnectivityManager) {
                        connectivityManager = (ConnectivityManager) systemService;
                    } else {
                        connectivityManager = null;
                    }
                    if (connectivityManager != null && (linkProperties = connectivityManager.getLinkProperties(network)) != null && (linkAddresses = linkProperties.getLinkAddresses()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it = linkAddresses.iterator();
                        while (it.hasNext()) {
                            InetAddress address = ((LinkAddress) it.next()).getAddress();
                            if (address instanceof Inet4Address) {
                                inet4Address2 = (Inet4Address) address;
                            } else {
                                inet4Address2 = null;
                            }
                            if (inet4Address2 != null) {
                                arrayList2.add(inet4Address2);
                            }
                        }
                        int size = arrayList2.size();
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj2 = arrayList2.get(i9);
                            i9++;
                            String hostAddress = ((Inet4Address) obj2).getHostAddress();
                            if (hostAddress != null) {
                                linkedHashSet3.add(hostAddress);
                            }
                        }
                    }
                    try {
                        NetworkInterface byName = NetworkInterface.getByName(m1537o);
                        if (byName != null && (inetAddresses = byName.getInetAddresses()) != null) {
                            ArrayList list = Collections.list(inetAddresses);
                            AbstractC3367j.m5099d(list, "list(...)");
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = list.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj3 = list.get(i10);
                                i10++;
                                ArrayList arrayList4 = list;
                                InetAddress inetAddress = (InetAddress) obj3;
                                if (inetAddress instanceof Inet4Address) {
                                    inet4Address = (Inet4Address) inetAddress;
                                } else {
                                    inet4Address = null;
                                }
                                if (inet4Address != null) {
                                    arrayList3.add(inet4Address);
                                }
                                list = arrayList4;
                            }
                            int size3 = arrayList3.size();
                            int i11 = 0;
                            while (i11 < size3) {
                                Object obj4 = arrayList3.get(i11);
                                i11++;
                                String hostAddress2 = ((Inet4Address) obj4).getHostAddress();
                                if (hostAddress2 != null) {
                                    linkedHashSet3.add(hostAddress2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        AbstractC1793a0.m2985m(th);
                    }
                    AbstractC1249rm.m2261g0("CELLULAR_AIR_TRACE start target=1.2.3.4 bind=" + m1537o + " localIpv4=" + linkedHashSet3 + " " + AbstractC1249rm.m2251b0(c1248rl));
                    ArrayList arrayList5 = new ArrayList();
                    int i12 = 1;
                    while (i12 < 6) {
                        try {
                            String str13 = m1537o;
                            try {
                                Process exec = Runtime.getRuntime().exec(m1531e("1.2.3.4", 1, 0, false, str13, Integer.valueOf(i12)));
                                AbstractC3367j.m5097b(exec);
                                m1534l = m1534l(exec);
                                exec.waitFor();
                                Matcher matcher = f4082l.matcher(m1534l);
                                ArrayList arrayList6 = new ArrayList();
                                while (matcher.find()) {
                                    Matcher matcher2 = matcher;
                                    String group = matcher2.group();
                                    if (!AbstractC3367j.m5096a(group, "1.2.3.4") && !linkedHashSet3.contains(group) && !arrayList6.contains(group)) {
                                        arrayList6.add(group);
                                    }
                                    matcher = matcher2;
                                }
                                str9 = (String) AbstractC1805m.m3047k0(arrayList6);
                                exitValue = exec.exitValue();
                                if (str9 == null) {
                                    str10 = "none";
                                } else {
                                    str10 = str9;
                                }
                                str = str11;
                            } catch (Throwable th2) {
                                th = th2;
                                str = str11;
                                m1537o = str13;
                            }
                            try {
                                String str14 = "CELLULAR_AIR_TRACE hop ttl=" + i12 + " bind=" + m1537o + " exit=" + exitValue + " parsed=" + str10 + " output=" + AbstractC0444k.m955s0(AbstractC0307n.m666E(new C0301h(new C0302i(AbstractC0444k.m940d0(m1534l), new C1162os(0), 1), true, new C1162os(1)), " | "), 800);
                                AbstractC3367j.m5100e(str14, str12);
                                if (Log.isLoggable("HBCS-NetIface", 3)) {
                                    Log.d("HBCS-NetIface", str14);
                                }
                                m2985m = str9;
                            } catch (Throwable th3) {
                                th = th3;
                                m2985m = AbstractC1793a0.m2985m(th);
                                if (m2985m instanceof C1689h) {
                                }
                                str2 = (String) m2985m;
                                if (str2 != null) {
                                }
                                i12++;
                                str11 = str5;
                                m1537o = str3;
                                str12 = str4;
                                linkedHashSet3 = linkedHashSet;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str = str11;
                        }
                        if (m2985m instanceof C1689h) {
                            m2985m = null;
                        }
                        str2 = (String) m2985m;
                        if (str2 != null) {
                            str3 = m1537o;
                            str4 = str12;
                            linkedHashSet = linkedHashSet3;
                            str5 = str;
                        } else {
                            arrayList5.add(str2);
                            List m948l0 = AbstractC0444k.m948l0(str2, new char[]{'.'});
                            ArrayList arrayList7 = new ArrayList();
                            Iterator it2 = m948l0.iterator();
                            while (it2.hasNext()) {
                                Integer m973O = AbstractC0451r.m973O((String) it2.next());
                                if (m973O != null) {
                                    arrayList7.add(m973O);
                                }
                            }
                            if (arrayList7.size() == 4) {
                                if (!arrayList7.isEmpty()) {
                                    int size4 = arrayList7.size();
                                    int i13 = 0;
                                    while (i13 < size4) {
                                        Object obj5 = arrayList7.get(i13);
                                        i13++;
                                        int intValue = ((Number) obj5).intValue();
                                        if (intValue < 0 || intValue >= 256) {
                                        }
                                    }
                                }
                                int intValue2 = ((Number) arrayList7.get(0)).intValue();
                                int intValue3 = ((Number) arrayList7.get(1)).intValue();
                                if (intValue2 != 10 && ((intValue2 != 172 || 16 > intValue3 || intValue3 >= 32) && ((intValue2 != 192 || intValue3 != 168) && (intValue2 != 100 || 64 > intValue3 || intValue3 >= 128)))) {
                                    str3 = m1537o;
                                    str4 = str12;
                                    linkedHashSet = linkedHashSet3;
                                    str5 = str;
                                    String str15 = "CELLULAR_AIR_TRACE hop_skip ttl=" + i12 + " bind=" + str3 + " hop=" + str2 + " reason=non_private";
                                    AbstractC3367j.m5100e(str15, str4);
                                    if (!Log.isLoggable("HBCS-NetIface", 3)) {
                                        Log.d("HBCS-NetIface", str15);
                                    }
                                } else {
                                    Network network2 = c1248rl.f7392c;
                                    c0724at2.f2512h = m1537o;
                                    c0724at2.f2513i = linkedHashSet3;
                                    c0724at2.f2514j = arrayList5;
                                    c0724at2.f2515k = str2;
                                    c0724at2.f2518n = 1;
                                    C2325e c2325e = AbstractC0549l0.f1898a;
                                    LinkedHashSet linkedHashSet4 = linkedHashSet3;
                                    str6 = str12;
                                    str7 = m1537o;
                                    obj = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0756bt(1000, this, str2, 56, false, str7, network2, context, null), c0724at2);
                                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                                    if (obj == enumC2465a) {
                                        return enumC2465a;
                                    }
                                    str8 = str2;
                                    arrayList = arrayList5;
                                    linkedHashSet2 = linkedHashSet4;
                                }
                            }
                            str3 = m1537o;
                            str4 = str12;
                            linkedHashSet = linkedHashSet3;
                            str5 = str;
                            String str152 = "CELLULAR_AIR_TRACE hop_skip ttl=" + i12 + " bind=" + str3 + " hop=" + str2 + " reason=non_private";
                            AbstractC3367j.m5100e(str152, str4);
                            if (!Log.isLoggable("HBCS-NetIface", 3)) {
                            }
                        }
                        i12++;
                        str11 = str5;
                        m1537o = str3;
                        str12 = str4;
                        linkedHashSet3 = linkedHashSet;
                    }
                    String str16 = "CELLULAR_AIR_TRACE no_private_hop bind=" + m1537o + " hops=" + arrayList5 + str11 + linkedHashSet3;
                    AbstractC3367j.m5100e(str16, str12);
                    if (Log.isLoggable("HBCS-NetIface", 5)) {
                        Log.w("HBCS-NetIface", str16);
                    }
                    return null;
                }
                if (((C1317ts) obj).f7863a) {
                    StringBuilder m189p = AbstractC0094y0.m189p("CELLULAR_AIR_TRACE first_private_unreachable bind=", str7, " firstPrivateHop=", str8, " hops=");
                    m189p.append(arrayList);
                    m189p.append(str);
                    m189p.append(linkedHashSet2);
                    String sb = m189p.toString();
                    AbstractC3367j.m5100e(sb, str6);
                    if (Log.isLoggable("HBCS-NetIface", 5)) {
                        Log.w("HBCS-NetIface", sb);
                    }
                    return null;
                }
                StringBuilder m189p2 = AbstractC0094y0.m189p("CELLULAR_AIR_TRACE selected bind=", str7, " firstPrivateHop=", str8, " hops=");
                m189p2.append(arrayList);
                String sb2 = m189p2.toString();
                AbstractC3367j.m5100e(sb2, str6);
                if (Log.isLoggable("HBCS-NetIface", 4)) {
                    Log.i("HBCS-NetIface", sb2);
                }
                return new C1286ss(EnumC1032km.f5310f, str8, str8, "蜂窝空口");
            }
        }
        c0724at = new C0724at(this, abstractC2583c);
        C0724at c0724at22 = c0724at;
        obj = c0724at22.f2516l;
        i7 = c0724at22.f2518n;
        String str112 = " excluded=";
        String str122 = "message";
        if (i7 == 0) {
        }
        if (((C1317ts) obj).f7863a) {
        }
    }

    /* renamed from: g */
    public final C1715p m1543g() {
        return this.f4087e;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1544j(C1286ss c1286ss, boolean z7, int i7, int i8, Network network, String str, Context context, AbstractC2583c abstractC2583c) {
        C0788ct c0788ct;
        int i9;
        C0883ft c0883ft;
        int i10;
        Network network2;
        boolean z8;
        int i11;
        Network network3;
        String str2;
        String str3;
        boolean z9;
        String str4;
        Object m1122A;
        C1317ts c1317ts;
        C1286ss c1286ss2 = c1286ss;
        if (abstractC2583c instanceof C0788ct) {
            c0788ct = (C0788ct) abstractC2583c;
            int i12 = c0788ct.f3215n;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0788ct.f3215n = i12 - Integer.MIN_VALUE;
                C0788ct c0788ct2 = c0788ct;
                Object obj = c0788ct2.f3213l;
                i9 = c0788ct2.f3215n;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i9 == 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = c0788ct2.f3212k;
                    network3 = c0788ct2.f3211j;
                    C1286ss c1286ss3 = c0788ct2.f3210i;
                    C0883ft c0883ft2 = c0788ct2.f3209h;
                    AbstractC1793a0.m2972L(obj);
                    c1286ss2 = c1286ss3;
                    c0883ft = c0883ft2;
                } else {
                    AbstractC1793a0.m2972L(obj);
                    String m1537o = m1537o(context, network, str);
                    if (z7 && (network == null || (m1537o != null && !AbstractC0444k.m937a0(m1537o)))) {
                        String str5 = c1286ss2.f7666c;
                        if (c1286ss2.f7664a == EnumC1032km.f5311g) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        c0788ct2.f3209h = this;
                        c0788ct2.f3210i = c1286ss2;
                        c0788ct2.f3211j = network;
                        c0788ct2.f3212k = i7;
                        c0788ct2.f3215n = 1;
                        C2325e c2325e = AbstractC0549l0.f1898a;
                        obj = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0756bt(i7, this, str5, i8, z8, m1537o, network, context, null), c0788ct2);
                        if (obj != enumC2465a) {
                            c0883ft = this;
                            i11 = i7;
                            network3 = network;
                        }
                        return enumC2465a;
                    }
                    c0883ft = this;
                    i10 = i7;
                    network2 = network;
                    str2 = c1286ss2.f7665b;
                    str3 = c1286ss2.f7666c;
                    if (!AbstractC3367j.m5096a(str2, str3) && AbstractC1155ol.m2013a(str2) == EnumC1124nl.f6341g) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        str4 = str2;
                    } else {
                        str4 = str3;
                    }
                    List m5817z = AbstractC3784a.m5817z(new Integer(443));
                    EnumC1032km enumC1032km = c1286ss2.f7664a;
                    c0788ct2.f3209h = null;
                    c0788ct2.f3210i = null;
                    c0788ct2.f3211j = null;
                    c0788ct2.f3215n = 2;
                    c0883ft.getClass();
                    C2325e c2325e2 = AbstractC0549l0.f1898a;
                    m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C1455yb(m5817z, c0883ft, str4, i10, network2, z9, enumC1032km, null), c0788ct2);
                    if (m1122A != enumC2465a) {
                        return enumC2465a;
                    }
                    return m1122A;
                }
                c1317ts = (C1317ts) obj;
                if (!c1317ts.f7863a) {
                    return c1317ts;
                }
                i10 = i11;
                network2 = network3;
                str2 = c1286ss2.f7665b;
                str3 = c1286ss2.f7666c;
                if (!AbstractC3367j.m5096a(str2, str3)) {
                }
                z9 = false;
                if (!z9) {
                }
                List m5817z2 = AbstractC3784a.m5817z(new Integer(443));
                EnumC1032km enumC1032km2 = c1286ss2.f7664a;
                c0788ct2.f3209h = null;
                c0788ct2.f3210i = null;
                c0788ct2.f3211j = null;
                c0788ct2.f3215n = 2;
                c0883ft.getClass();
                C2325e c2325e22 = AbstractC0549l0.f1898a;
                m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C1455yb(m5817z2, c0883ft, str4, i10, network2, z9, enumC1032km2, null), c0788ct2);
                if (m1122A != enumC2465a) {
                }
            }
        }
        c0788ct = new C0788ct(this, abstractC2583c);
        C0788ct c0788ct22 = c0788ct;
        Object obj2 = c0788ct22.f3213l;
        i9 = c0788ct22.f3215n;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        if (i9 == 0) {
        }
        c1317ts = (C1317ts) obj2;
        if (!c1317ts.f7863a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1545k(String str, boolean z7, boolean z8, int i7, int i8, Network network, String str2, Context context, AbstractC2583c abstractC2583c) {
        C0819dt c0819dt;
        int i9;
        EnumC2465a enumC2465a;
        C0883ft c0883ft;
        String str3;
        int i10;
        Network network2;
        Object m1122A;
        C1317ts c1317ts;
        if (abstractC2583c instanceof C0819dt) {
            c0819dt = (C0819dt) abstractC2583c;
            int i11 = c0819dt.f3576n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0819dt.f3576n = i11 - Integer.MIN_VALUE;
                C0819dt c0819dt2 = c0819dt;
                Object obj = c0819dt2.f3574l;
                i9 = c0819dt2.f3576n;
                enumC2465a = EnumC2465a.f13750e;
                if (i9 == 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = c0819dt2.f3573k;
                    network2 = c0819dt2.f3572j;
                    str3 = c0819dt2.f3571i;
                    C0883ft c0883ft2 = c0819dt2.f3570h;
                    AbstractC1793a0.m2972L(obj);
                    c0883ft = c0883ft2;
                } else {
                    AbstractC1793a0.m2972L(obj);
                    String m1537o = m1537o(context, network, str2);
                    if (z8 && (network == null || (m1537o != null && !AbstractC0444k.m937a0(m1537o)))) {
                        c0819dt2.f3570h = this;
                        c0819dt2.f3571i = str;
                        c0819dt2.f3572j = network;
                        c0819dt2.f3573k = i7;
                        c0819dt2.f3576n = 1;
                        C2325e c2325e = AbstractC0549l0.f1898a;
                        obj = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0756bt(i7, this, str, i8, z7, m1537o, network, context, null), c0819dt2);
                        if (obj != enumC2465a) {
                            c0883ft = this;
                            str3 = str;
                            i10 = i7;
                            network2 = network;
                        }
                        return enumC2465a;
                    }
                    c0883ft = this;
                    str3 = str;
                    i10 = i7;
                    network2 = network;
                    c0819dt2.f3570h = null;
                    c0819dt2.f3571i = null;
                    c0819dt2.f3572j = null;
                    c0819dt2.f3576n = 2;
                    c0883ft.getClass();
                    C2325e c2325e2 = AbstractC0549l0.f1898a;
                    m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C1455yb(f4081k, c0883ft, str3, i10, network2, false, null, null), c0819dt2);
                    if (m1122A == enumC2465a) {
                        return enumC2465a;
                    }
                    return m1122A;
                }
                c1317ts = (C1317ts) obj;
                if (c1317ts.f7863a) {
                    return c1317ts;
                }
                c0819dt2.f3570h = null;
                c0819dt2.f3571i = null;
                c0819dt2.f3572j = null;
                c0819dt2.f3576n = 2;
                c0883ft.getClass();
                C2325e c2325e22 = AbstractC0549l0.f1898a;
                m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C1455yb(f4081k, c0883ft, str3, i10, network2, false, null, null), c0819dt2);
                if (m1122A == enumC2465a) {
                }
            }
        }
        c0819dt = new C0819dt(this, abstractC2583c);
        C0819dt c0819dt22 = c0819dt;
        Object obj2 = c0819dt22.f3574l;
        i9 = c0819dt22.f3576n;
        enumC2465a = EnumC2465a.f13750e;
        if (i9 == 0) {
        }
        c1317ts = (C1317ts) obj2;
        if (c1317ts.f7863a) {
        }
        c0819dt22.f3570h = null;
        c0819dt22.f3571i = null;
        c0819dt22.f3572j = null;
        c0819dt22.f3576n = 2;
        c0883ft.getClass();
        C2325e c2325e222 = AbstractC0549l0.f1898a;
        m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C1455yb(f4081k, c0883ft, str3, i10, network2, false, null, null), c0819dt22);
        if (m1122A == enumC2465a) {
        }
    }

    /* renamed from: r */
    public final void m1546r() {
        this.f4084b.set(false);
        C0565q1 c0565q1 = this.f4085c;
        if (c0565q1 != null) {
            c0565q1.mo1114c(null);
        }
        this.f4085c = null;
        this.f4090h = null;
        C1813u c1813u = C1813u.f10860e;
        this.f4088f = c1813u;
        this.f4089g = c1813u;
        this.f4091i.clear();
        C1701c0 c1701c0 = this.f4086d;
        C0915gt c0915gt = new C0915gt(false, null, null, null, 0, 0, null, false, "已停止", 254);
        c1701c0.getClass();
        c1701c0.m2752j(null, c0915gt);
    }
}
