package p039e5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p024c6.AbstractC0434a;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0450q;
import p024c6.AbstractC0451r;
import p024c6.C0438e;
import p024c6.C0439f;
import p053g5.C1687f;
import p053g5.C1689h;
import p060h5.AbstractC1793a0;
import p066i3.AbstractC2067b;
import p068i5.AbstractC2080d;
import p092m.AbstractC2487d;
import p135r5.AbstractC3063j;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ql */
/* loaded from: classes.dex */
public abstract class AbstractC1217ql {

    /* renamed from: a */
    public static final Set f7128a = AbstractC1793a0.m2971K(10, 100, 1000, 2500, 5000, 10000, 40000, 100000);

    /* renamed from: a */
    public static String m2136a(int i7) {
        if (i7 >= 1000000) {
            return String.format(Locale.US, "%.0f Gbps", Arrays.copyOf(new Object[]{Double.valueOf(i7 / 1000000.0d)}, 1));
        }
        if (i7 >= 10000) {
            return String.format(Locale.US, "%.0f Mbps", Arrays.copyOf(new Object[]{Double.valueOf(i7 / 1000.0d)}, 1));
        }
        if (i7 >= 1000) {
            double d7 = i7 / 1000.0d;
            if (d7 < 100.0d && d7 != ((long) d7)) {
                return String.format(Locale.US, "%.1f Mbps", Arrays.copyOf(new Object[]{Double.valueOf(d7)}, 1));
            }
            return String.format(Locale.US, "%.0f Mbps", Arrays.copyOf(new Object[]{Double.valueOf(d7)}, 1));
        }
        return i7 + " Kbps";
    }

    /* renamed from: b */
    public static String m2137b(Integer num, Integer num2) {
        String str;
        String m4043g;
        String str2 = "-";
        if (num == null || (str = AbstractC2487d.m4043g("", m2139d(num.intValue()))) == null) {
            str = "-";
        }
        if (num2 != null && (m4043g = AbstractC2487d.m4043g("", m2139d(num2.intValue()))) != null) {
            str2 = m4043g;
        }
        return "DL " + str + " · UL " + str2;
    }

    /* renamed from: c */
    public static String m2138c(Integer num, Integer num2) {
        String str;
        String m4043g;
        if (num == null && num2 == null) {
            return null;
        }
        String str2 = "-";
        if (num == null || (str = AbstractC2487d.m4043g("~", m2136a(num.intValue()))) == null) {
            str = "-";
        }
        if (num2 != null && (m4043g = AbstractC2487d.m4043g("~", m2136a(num2.intValue()))) != null) {
            str2 = m4043g;
        }
        return "DL " + str + " · UL " + str2;
    }

    /* renamed from: d */
    public static String m2139d(int i7) {
        if (i7 >= 10000) {
            return String.format(Locale.US, "%.0f Gbps", Arrays.copyOf(new Object[]{Double.valueOf(i7 / 1000.0d)}, 1));
        }
        if (i7 >= 1000 && i7 % 1000 == 0) {
            return (i7 / 1000) + " Gbps";
        }
        if (i7 >= 1000) {
            return String.format(Locale.US, "%.1f Gbps", Arrays.copyOf(new Object[]{Double.valueOf(i7 / 1000.0d)}, 1));
        }
        return i7 + " Mbps";
    }

    /* renamed from: e */
    public static boolean m2140e(String str) {
        String str2;
        if (str != null) {
            str2 = AbstractC0444k.m956t0(str).toString();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        Locale locale = Locale.US;
        AbstractC3367j.m5099d(locale, "US");
        String lowerCase = str2.toLowerCase(locale);
        AbstractC3367j.m5099d(lowerCase, "toLowerCase(...)");
        if (!AbstractC0451r.m971M(lowerCase, "rmnet", false) && !AbstractC0451r.m971M(lowerCase, "ccmni", false) && !AbstractC0451r.m971M(lowerCase, "wwan", false) && !AbstractC0451r.m971M(lowerCase, "seth", false) && !AbstractC0451r.m971M(lowerCase, "pdp", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static String m2141f(NetworkCapabilities networkCapabilities) {
        Integer num = null;
        if (networkCapabilities != null) {
            int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
            int linkUpstreamBandwidthKbps = networkCapabilities.getLinkUpstreamBandwidthKbps();
            if (linkDownstreamBandwidthKbps > 100 || linkUpstreamBandwidthKbps > 100) {
                Integer valueOf = Integer.valueOf(linkDownstreamBandwidthKbps);
                if (linkDownstreamBandwidthKbps <= 100) {
                    valueOf = null;
                }
                Integer valueOf2 = Integer.valueOf(linkUpstreamBandwidthKbps);
                if (linkUpstreamBandwidthKbps > 100) {
                    num = valueOf2;
                }
                return m2138c(valueOf, num);
            }
        }
        return null;
    }

    /* renamed from: g */
    public static Integer m2142g(String str) {
        String str2;
        Double m964F;
        int rint;
        String str3;
        Integer m973O;
        Pattern compile = Pattern.compile("Speed:\\s*(\\d+)\\s*Mb/s", 66);
        AbstractC3367j.m5099d(compile, "compile(...)");
        Matcher matcher = compile.matcher(str);
        AbstractC3367j.m5099d(matcher, "matcher(...)");
        C0439f m2978f = AbstractC1793a0.m2978f(matcher, 0, str);
        if (m2978f != null && (str3 = (String) ((C0438e) m2978f.m923a()).get(1)) != null && (m973O = AbstractC0451r.m973O(str3)) != null) {
            if (m973O.intValue() <= 0) {
                m973O = null;
            }
            if (m973O != null) {
                return Integer.valueOf(m973O.intValue());
            }
        }
        Pattern compile2 = Pattern.compile("Speed:\\s*(\\d+(?:\\.\\d+)?)\\s*Gb/s", 66);
        AbstractC3367j.m5099d(compile2, "compile(...)");
        Matcher matcher2 = compile2.matcher(str);
        AbstractC3367j.m5099d(matcher2, "matcher(...)");
        C0439f m2978f2 = AbstractC1793a0.m2978f(matcher2, 0, str);
        if (m2978f2 == null || (str2 = (String) ((C0438e) m2978f2.m923a()).get(1)) == null || (m964F = AbstractC0450q.m964F(str2)) == null || (rint = (int) Math.rint(m964F.doubleValue() * 1000.0d)) <= 0) {
            return null;
        }
        return Integer.valueOf(rint);
    }

    /* renamed from: h */
    public static Integer m2143h(String str) {
        String obj;
        Object m2985m;
        if (str == null || (obj = AbstractC0444k.m956t0(str).toString()) == null) {
            return null;
        }
        if (AbstractC0444k.m937a0(obj)) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        try {
            m2985m = AbstractC0451r.m973O(AbstractC0444k.m956t0(AbstractC3063j.m4737N(new File("/sys/class/net/" + obj + "/speed"), AbstractC0434a.f1477a)).toString());
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (m2985m instanceof C1689h) {
            m2985m = null;
        }
        Integer num = (Integer) m2985m;
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        return num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r12 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x00bf, code lost:
    
        if (r12 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (r12 != null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0123  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1393wb m2144i(Context context, C1248rl c1248rl, boolean z7) {
        ConnectivityManager connectivityManager;
        NetworkCapabilities networkCapabilities;
        String str;
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        C1186pl m2145j;
        TransportInfo transportInfo;
        boolean z8;
        C1687f c1687f;
        int[] iArr;
        boolean z9;
        Integer m2228K0;
        int i7;
        C1186pl c1186pl;
        Integer m2143h;
        String m2141f;
        String obj;
        String str2;
        Object m2985m;
        boolean z10;
        Integer num;
        Object obj2;
        boolean z11;
        Integer num2;
        Process start;
        boolean waitFor;
        String str3;
        String str4;
        Integer m2143h2;
        Network network;
        ConnectivityManager connectivityManager2;
        NetworkCapabilities networkCapabilities2;
        WifiManager wifiManager2;
        String str5;
        TransportInfo transportInfo2;
        WifiInfo wifiInfo;
        String str6;
        EnumC1070lt enumC1070lt = EnumC1070lt.f5744e;
        AbstractC3367j.m5100e(context, "context");
        Context applicationContext = context.getApplicationContext();
        Object systemService = applicationContext.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        Network network2 = c1248rl.f7392c;
        if (network2 != null && connectivityManager != null) {
            networkCapabilities = connectivityManager.getNetworkCapabilities(network2);
        } else {
            networkCapabilities = null;
        }
        boolean z12 = true;
        if (z7 && AbstractC2080d.m3395h(applicationContext.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0 && c1248rl.f7393d == enumC1070lt && (network = c1248rl.f7392c) != null) {
            Context applicationContext2 = applicationContext.getApplicationContext();
            Object systemService2 = applicationContext2.getSystemService("connectivity");
            if (systemService2 instanceof ConnectivityManager) {
                connectivityManager2 = (ConnectivityManager) systemService2;
            } else {
                connectivityManager2 = null;
            }
            if (connectivityManager2 != null) {
                if (networkCapabilities == null) {
                    networkCapabilities2 = connectivityManager2.getNetworkCapabilities(network);
                } else {
                    networkCapabilities2 = networkCapabilities;
                }
                if (networkCapabilities2.hasTransport(1)) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        transportInfo2 = networkCapabilities2.getTransportInfo();
                        if (transportInfo2 instanceof WifiInfo) {
                            wifiInfo = (WifiInfo) transportInfo2;
                        } else {
                            wifiInfo = null;
                        }
                        if (wifiInfo != null) {
                            str6 = wifiInfo.getSSID();
                        } else {
                            str6 = null;
                        }
                        str = AbstractC1249rm.m2275n0(str6);
                    }
                    if (AbstractC3367j.m5096a(connectivityManager2.getActiveNetwork(), network) || AbstractC3367j.m5096a(connectivityManager2.getBoundNetworkForProcess(), network)) {
                        Object systemService3 = applicationContext2.getSystemService("wifi");
                        if (systemService3 instanceof WifiManager) {
                            wifiManager2 = (WifiManager) systemService3;
                        } else {
                            wifiManager2 = null;
                        }
                        if (wifiManager2 != null) {
                            WifiInfo connectionInfo2 = wifiManager2.getConnectionInfo();
                            if (connectionInfo2 != null) {
                                str5 = connectionInfo2.getSSID();
                            } else {
                                str5 = null;
                            }
                            str = AbstractC1249rm.m2275n0(str5);
                        }
                    }
                }
            }
        }
        str = null;
        if (c1248rl.f7393d == enumC1070lt) {
            if (Build.VERSION.SDK_INT >= 29 && networkCapabilities != null) {
                transportInfo = networkCapabilities.getTransportInfo();
                if (transportInfo instanceof WifiInfo) {
                    m2145j = m2145j((WifiInfo) transportInfo);
                    if (m2145j != null) {
                        return new C1393wb(2, m2137b(m2145j.f6901a, m2145j.f6902b), null, str);
                    }
                    EnumC1070lt enumC1070lt2 = c1248rl.f7393d;
                    if (enumC1070lt2 == enumC1070lt) {
                        return new C1393wb(3, null, null, str);
                    }
                    if (enumC1070lt2 != EnumC1070lt.f5745f && !m2140e(c1248rl.f7394e)) {
                        z8 = true;
                    } else {
                        Integer m2228K02 = AbstractC1249rm.m2228K0(networkCapabilities);
                        if (m2228K02 != null) {
                            int intValue = m2228K02.intValue();
                            Network network3 = c1248rl.f7392c;
                            ConnectivityManager connectivityManager3 = (ConnectivityManager) applicationContext.getApplicationContext().getSystemService(ConnectivityManager.class);
                            if (connectivityManager3 == null) {
                                iArr = null;
                                z8 = true;
                            } else {
                                LinkedHashSet<Network> linkedHashSet = new LinkedHashSet();
                                Network[] allNetworks = connectivityManager3.getAllNetworks();
                                if (allNetworks != null) {
                                    for (Network network4 : allNetworks) {
                                        linkedHashSet.add(network4);
                                    }
                                }
                                Network network5 = C1247rk.f7378e;
                                if (network5 != null) {
                                    linkedHashSet.add(network5);
                                }
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                for (Network network6 : linkedHashSet) {
                                    NetworkCapabilities networkCapabilities3 = connectivityManager3.getNetworkCapabilities(network6);
                                    if (networkCapabilities3 == null || !networkCapabilities3.hasTransport(0) || (m2228K0 = AbstractC1249rm.m2228K0(networkCapabilities3)) == null) {
                                        z9 = z12;
                                    } else {
                                        z9 = z12;
                                        if (m2228K0.intValue() == intValue) {
                                            int linkDownstreamBandwidthKbps = networkCapabilities3.getLinkDownstreamBandwidthKbps();
                                            int linkUpstreamBandwidthKbps = networkCapabilities3.getLinkUpstreamBandwidthKbps();
                                            if (network3 != null && network3.equals(network6)) {
                                                if (linkDownstreamBandwidthKbps > 100) {
                                                    i8 = linkDownstreamBandwidthKbps;
                                                }
                                                if (linkUpstreamBandwidthKbps > 100) {
                                                    i10 = linkUpstreamBandwidthKbps;
                                                }
                                            }
                                            if (linkDownstreamBandwidthKbps > 100) {
                                                if (i9 >= 0) {
                                                    linkDownstreamBandwidthKbps = Math.min(i9, linkDownstreamBandwidthKbps);
                                                }
                                                i9 = linkDownstreamBandwidthKbps;
                                            }
                                            if (linkUpstreamBandwidthKbps > 100) {
                                                if (i11 >= 0) {
                                                    linkUpstreamBandwidthKbps = Math.min(i11, linkUpstreamBandwidthKbps);
                                                }
                                                i11 = linkUpstreamBandwidthKbps;
                                            }
                                        }
                                    }
                                    z12 = z9;
                                }
                                z8 = z12;
                                if (i8 <= 0) {
                                    i8 = i9;
                                }
                                if (i10 <= 0) {
                                    i10 = i11;
                                }
                                if (i8 <= 0 && i10 <= 0) {
                                    iArr = null;
                                } else {
                                    iArr = new int[]{Math.max(i8, 0), Math.max(i10, 0)};
                                }
                            }
                            if (iArr != null) {
                                int i12 = iArr[0];
                                Integer valueOf = Integer.valueOf(i12);
                                if (i12 <= 0) {
                                    valueOf = null;
                                }
                                int i13 = iArr[z8 ? 1 : 0];
                                Integer valueOf2 = Integer.valueOf(i13);
                                if (i13 <= 0) {
                                    valueOf2 = null;
                                }
                                if (valueOf != null || valueOf2 != null) {
                                    if (valueOf != null) {
                                        i7 = valueOf.intValue();
                                    } else {
                                        i7 = 0;
                                    }
                                    c1687f = new C1687f(Integer.valueOf(i7), valueOf2);
                                    if (c1687f != null) {
                                        return new C1393wb(6, m2138c(Integer.valueOf(((Number) c1687f.f10471e).intValue()), (Integer) c1687f.f10472f), null, null);
                                    }
                                }
                            }
                        } else {
                            z8 = true;
                        }
                        c1687f = null;
                        if (c1687f != null) {
                        }
                    }
                    EnumC1070lt enumC1070lt3 = c1248rl.f7393d;
                    String str7 = c1248rl.f7394e;
                    if (enumC1070lt3 != EnumC1070lt.f5746g && enumC1070lt3 != EnumC1070lt.f5747h) {
                        if (str7 != null) {
                            str3 = AbstractC0444k.m956t0(str7).toString();
                        } else {
                            str3 = null;
                        }
                        String str8 = "";
                        if (str3 == null) {
                            str3 = "";
                        }
                        Locale locale = Locale.US;
                        AbstractC3367j.m5099d(locale, "US");
                        String lowerCase = str3.toLowerCase(locale);
                        AbstractC3367j.m5099d(lowerCase, "toLowerCase(...)");
                        if (!AbstractC0451r.m971M(lowerCase, "eth", false) && !AbstractC0451r.m971M(lowerCase, "en", false)) {
                            if (str7 != null) {
                                str4 = AbstractC0444k.m956t0(str7).toString();
                            } else {
                                str4 = null;
                            }
                            if (str4 != null) {
                                str8 = str4;
                            }
                            String lowerCase2 = str8.toLowerCase(locale);
                            AbstractC3367j.m5099d(lowerCase2, "toLowerCase(...)");
                            if (!AbstractC0451r.m971M(lowerCase2, "usb", false) && !AbstractC0451r.m971M(lowerCase2, "rndis", false) && !AbstractC0451r.m971M(lowerCase2, "ncm", false)) {
                                if (!m2140e(c1248rl.f7394e) && (m2143h2 = m2143h(c1248rl.f7394e)) != null) {
                                    int intValue2 = m2143h2.intValue();
                                    return new C1393wb(6, m2137b(Integer.valueOf(intValue2), Integer.valueOf(intValue2)), null, null);
                                }
                                String m2141f2 = m2141f(networkCapabilities);
                                if (m2141f2 != null) {
                                    return new C1393wb(6, m2141f2, null, null);
                                }
                                return new C1393wb(7, null, null, null);
                            }
                        }
                    }
                    String str9 = c1248rl.f7394e;
                    if (str9 != null && (obj = AbstractC0444k.m956t0(str9).toString()) != null) {
                        if (!AbstractC0444k.m937a0(obj)) {
                            str2 = obj;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            try {
                                start = new ProcessBuilder("ethtool", str2).redirectErrorStream(z8).start();
                                try {
                                    TimeUnit timeUnit = TimeUnit.SECONDS;
                                    waitFor = start.waitFor(2L, TimeUnit.SECONDS);
                                } finally {
                                }
                            } catch (Throwable th) {
                                m2985m = AbstractC1793a0.m2985m(th);
                            }
                            if (!waitFor) {
                                start.destroyForcibly();
                                try {
                                    start.destroyForcibly();
                                } catch (Throwable th2) {
                                    AbstractC1793a0.m2985m(th2);
                                }
                                m2985m = null;
                                z10 = m2985m instanceof C1689h;
                                Object obj3 = m2985m;
                                if (z10) {
                                    obj3 = null;
                                }
                                num = (Integer) obj3;
                                Integer m2143h3 = m2143h(str2);
                                if (num == null) {
                                    num = m2143h3;
                                }
                                try {
                                    obj2 = AbstractC0451r.m973O(AbstractC0444k.m956t0(AbstractC3063j.m4737N(new File("/sys/class/net/" + str2 + "/device/../speed"), AbstractC0434a.f1477a)).toString());
                                } catch (Throwable th3) {
                                    obj2 = AbstractC1793a0.m2985m(th3);
                                }
                                z11 = obj2 instanceof C1689h;
                                Object obj4 = obj2;
                                if (z11) {
                                    obj4 = null;
                                }
                                num2 = (Integer) obj4;
                                if (num2 != null || num2.intValue() <= 0) {
                                    num2 = null;
                                }
                                if (num != null || !f7128a.contains(num)) {
                                    if (num == null && num2 != null) {
                                        num = Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
                                    } else if (num == null) {
                                        if (num2 != null) {
                                            num = num2;
                                        } else {
                                            num = null;
                                        }
                                    }
                                }
                                if (num != null) {
                                    c1186pl = new C1186pl(num, num);
                                    if (c1186pl != null || (m2141f = m2137b(c1186pl.f6901a, c1186pl.f6902b)) == null) {
                                        m2143h = m2143h(c1248rl.f7394e);
                                        if (m2143h == null) {
                                            int intValue3 = m2143h.intValue();
                                            m2141f = m2137b(Integer.valueOf(intValue3), Integer.valueOf(intValue3));
                                        } else {
                                            m2141f = m2141f(networkCapabilities);
                                        }
                                    }
                                    C0884fu c0884fu = C0884fu.f4092a;
                                    return new C1393wb(4, m2141f, C0884fu.f4095d, null);
                                }
                            } else {
                                InputStream inputStream = start.getInputStream();
                                AbstractC3367j.m5099d(inputStream, "getInputStream(...)");
                                Object m2142g = m2142g(AbstractC2067b.m3296u(new BufferedReader(new InputStreamReader(inputStream, AbstractC0434a.f1477a), 8192)));
                                try {
                                    start.destroyForcibly();
                                    m2985m = m2142g;
                                } catch (Throwable th4) {
                                    AbstractC1793a0.m2985m(th4);
                                    m2985m = m2142g;
                                }
                                z10 = m2985m instanceof C1689h;
                                Object obj32 = m2985m;
                                if (z10) {
                                }
                                num = (Integer) obj32;
                                Integer m2143h32 = m2143h(str2);
                                if (num == null) {
                                }
                                obj2 = AbstractC0451r.m973O(AbstractC0444k.m956t0(AbstractC3063j.m4737N(new File("/sys/class/net/" + str2 + "/device/../speed"), AbstractC0434a.f1477a)).toString());
                                z11 = obj2 instanceof C1689h;
                                Object obj42 = obj2;
                                if (z11) {
                                }
                                num2 = (Integer) obj42;
                                if (num2 != null) {
                                }
                                num2 = null;
                                if (num != null) {
                                }
                                if (num == null) {
                                }
                                if (num == null) {
                                }
                                if (num != null) {
                                }
                            }
                        }
                    }
                    c1186pl = null;
                    if (c1186pl != null) {
                    }
                    m2143h = m2143h(c1248rl.f7394e);
                    if (m2143h == null) {
                    }
                    C0884fu c0884fu2 = C0884fu.f4092a;
                    return new C1393wb(4, m2141f, C0884fu.f4095d, null);
                }
            }
            Network network7 = c1248rl.f7392c;
            if (network7 != null && connectivityManager != null && (AbstractC3367j.m5096a(connectivityManager.getActiveNetwork(), network7) || AbstractC3367j.m5096a(connectivityManager.getBoundNetworkForProcess(), network7))) {
                Object systemService4 = applicationContext.getSystemService("wifi");
                if (systemService4 instanceof WifiManager) {
                    wifiManager = (WifiManager) systemService4;
                } else {
                    wifiManager = null;
                }
                if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                    m2145j = m2145j(connectionInfo);
                    if (m2145j != null) {
                    }
                }
            }
        }
        m2145j = null;
        if (m2145j != null) {
        }
    }

    /* renamed from: j */
    public static C1186pl m2145j(WifiInfo wifiInfo) {
        int rxLinkSpeedMbps;
        int txLinkSpeedMbps;
        if (Build.VERSION.SDK_INT >= 30) {
            int linkSpeed = wifiInfo.getLinkSpeed();
            Integer valueOf = Integer.valueOf(linkSpeed);
            if (linkSpeed <= 0) {
                valueOf = null;
            }
            rxLinkSpeedMbps = wifiInfo.getRxLinkSpeedMbps();
            Integer valueOf2 = Integer.valueOf(rxLinkSpeedMbps);
            if (rxLinkSpeedMbps <= 0) {
                valueOf2 = null;
            }
            if (valueOf2 == null) {
                valueOf2 = valueOf;
            }
            txLinkSpeedMbps = wifiInfo.getTxLinkSpeedMbps();
            Integer valueOf3 = Integer.valueOf(txLinkSpeedMbps);
            if (txLinkSpeedMbps <= 0) {
                valueOf3 = null;
            }
            if (valueOf3 != null) {
                valueOf = valueOf3;
            }
            if (valueOf2 != null || valueOf != null) {
                return new C1186pl(valueOf2, valueOf);
            }
        } else {
            int linkSpeed2 = wifiInfo.getLinkSpeed();
            Integer valueOf4 = Integer.valueOf(linkSpeed2);
            if (linkSpeed2 <= 0) {
                valueOf4 = null;
            }
            if (valueOf4 != null) {
                int intValue = valueOf4.intValue();
                return new C1186pl(Integer.valueOf(intValue), Integer.valueOf(intValue));
            }
        }
        return null;
    }
}
