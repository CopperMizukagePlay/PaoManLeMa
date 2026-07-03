package p039e5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import androidx.lifecycle.RunnableC0219y;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p001a0.C0062p0;
import p001a0.C0073s;
import p015b6.AbstractC0307n;
import p024c6.AbstractC0434a;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p024c6.C0437d;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p053g5.C1689h;
import p053g5.C1690i;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1817y;
import p060h5.C1813u;
import p060h5.C1814v;
import p066i3.AbstractC2067b;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rk */
/* loaded from: classes.dex */
public final class C1247rk {

    /* renamed from: c */
    public static ConnectivityManager f7376c;

    /* renamed from: d */
    public static C1216qk f7377d;

    /* renamed from: e */
    public static volatile Network f7378e;

    /* renamed from: i */
    public static WifiManager.WifiLock f7382i;

    /* renamed from: j */
    public static PowerManager.WakeLock f7383j;

    /* renamed from: l */
    public static ConnectivityManager f7385l;

    /* renamed from: m */
    public static C1216qk f7386m;

    /* renamed from: n */
    public static volatile Network f7387n;

    /* renamed from: o */
    public static volatile C1334ue f7388o;

    /* renamed from: a */
    public final /* synthetic */ int f7389a;

    /* renamed from: b */
    public static final C1247rk f7375b = new C1247rk(0);

    /* renamed from: f */
    public static final C1247rk f7379f = new C1247rk(1);

    /* renamed from: g */
    public static final C1247rk f7380g = new C1247rk(2);

    /* renamed from: h */
    public static final C1247rk f7381h = new C1247rk(3);

    /* renamed from: k */
    public static final C1247rk f7384k = new C1247rk(4);

    public /* synthetic */ C1247rk(int i7) {
        this.f7389a = i7;
    }

    /* renamed from: a */
    public static final double m2180a(long j6, long j7) {
        if (j6 > 0 && j7 > 0) {
            return ((j6 * 8.0d) / j7) / 1000.0d;
        }
        return 0.0d;
    }

    /* renamed from: b */
    public static final String m2181b(InetSocketAddress inetSocketAddress) {
        String hostString;
        StringBuilder sb;
        String str;
        SecureRandom secureRandom = C1031kl.f5303g;
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null || (hostString = address.getHostAddress()) == null) {
            hostString = inetSocketAddress.getHostString();
        }
        AbstractC3367j.m5097b(hostString);
        boolean m929S = AbstractC0444k.m929S(hostString, ':');
        int port = inetSocketAddress.getPort();
        if (m929S) {
            sb = new StringBuilder("[");
            sb.append(hostString);
            str = "]:";
        } else {
            sb = new StringBuilder();
            sb.append(hostString);
            str = ":";
        }
        sb.append(str);
        sb.append(port);
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:34|35))(2:36|(1:38)(6:39|(1:41)|42|43|44|(1:46)))|11|(5:14|(4:17|(3:19|20|21)(1:23)|22|15)|24|25|12)|26|27|(1:32)(2:29|30)))|50|6|7|(0)(0)|11|(1:12)|26|27|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0027, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        r9 = p060h5.AbstractC1793a0.m2985m(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:10:0x0023, B:11:0x0055, B:12:0x006e, B:14:0x0074, B:15:0x009e, B:17:0x00a4, B:20:0x00b1, B:25:0x00b5, B:43:0x004a), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [e5.zn, m5.c] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r9v2, types: [g5.h] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.LinkedHashMap, java.util.Map] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable m2182c(List list, String str, String str2, AbstractC2583c abstractC2583c) {
        ?? r02;
        int i7;
        Serializable m2985m;
        if (abstractC2583c instanceof C1498zn) {
            C1498zn c1498zn = (C1498zn) abstractC2583c;
            int i8 = c1498zn.f9931i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1498zn.f9931i = i8 - Integer.MIN_VALUE;
                r02 = c1498zn;
                Object obj = r02.f9930h;
                i7 = r02.f9931i;
                C1814v c1814v = C1814v.f10861e;
                if (i7 == 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (list.isEmpty()) {
                        return c1814v;
                    }
                    if (AbstractC0444k.m937a0(str)) {
                        str = "api.nxtrace.org";
                    }
                    C1403wl c1403wl = new C1403wl(str, str2);
                    r02.f9931i = 1;
                    obj = C1403wl.m2381g(c1403wl, list, r02);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (obj == enumC2465a) {
                        return enumC2465a;
                    }
                }
                Map map = (Map) obj;
                m2985m = new LinkedHashMap(AbstractC1817y.m3082N(map.size()));
                for (Object obj2 : map.entrySet()) {
                    Object key = ((Map.Entry) obj2).getKey();
                    C1434xl c1434xl = (C1434xl) ((Map.Entry) obj2).getValue();
                    List m3067O = AbstractC1806n.m3067O(c1434xl.f8841c, c1434xl.f8839a, c1434xl.f8840b);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : m3067O) {
                        if (!AbstractC0444k.m937a0((String) obj3)) {
                            arrayList.add(obj3);
                        }
                    }
                    m2985m.put(key, AbstractC1805m.m3051o0(arrayList, " · ", null, null, null, 62));
                }
                if (m2985m instanceof C1689h) {
                    return m2985m;
                }
                return c1814v;
            }
        }
        r02 = new AbstractC2583c(abstractC2583c);
        Object obj4 = r02.f9930h;
        i7 = r02.f9931i;
        C1814v c1814v2 = C1814v.f10861e;
        if (i7 == 0) {
        }
        Map map2 = (Map) obj4;
        m2985m = new LinkedHashMap(AbstractC1817y.m3082N(map2.size()));
        while (r10.hasNext()) {
        }
        if (m2985m instanceof C1689h) {
        }
    }

    /* renamed from: d */
    public static final InetSocketAddress m2183d(byte[] bArr, int i7, int i8, byte[] bArr2) {
        int i9;
        SecureRandom secureRandom = C1031kl.f5303g;
        if (i8 >= 8) {
            int i10 = bArr[i7 + 1] & 255;
            int m2195u = m2195u(i7 + 2, bArr);
            if (bArr2 != null) {
                m2195u ^= m2195u(0, bArr2);
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i9 = 16;
                } else {
                    return null;
                }
            } else {
                i9 = 4;
            }
            if (i8 >= i9 + 4) {
                if (bArr2 == null || bArr2.length >= i9) {
                    int i11 = i7 + 4;
                    byte[] m3021N = AbstractC1804l.m3021N(bArr, i11, i9 + i11);
                    if (bArr2 != null) {
                        int length = m3021N.length;
                        for (int i12 = 0; i12 < length; i12++) {
                            m3021N[i12] = (byte) (m3021N[i12] ^ bArr2[i12]);
                        }
                    }
                    return new InetSocketAddress(InetAddress.getByAddress(m3021N), m2195u);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* renamed from: e */
    public static final C0812dl m2184e(String str) {
        SecureRandom secureRandom = C1031kl.f5303g;
        String obj = AbstractC0444k.m956t0(str).toString();
        Locale locale = Locale.ROOT;
        AbstractC3367j.m5099d(locale, "ROOT");
        String lowerCase = obj.toLowerCase(locale);
        AbstractC3367j.m5099d(lowerCase, "toLowerCase(...)");
        if (AbstractC0451r.m971M(lowerCase, "stuns://", false)) {
            obj = AbstractC0444k.m930T(obj, 8);
        } else if (AbstractC0451r.m971M(lowerCase, "stun://", false)) {
            obj = AbstractC0444k.m930T(obj, 7);
        } else if (AbstractC0451r.m971M(lowerCase, "tls://", false)) {
            obj = AbstractC0444k.m930T(obj, 6);
        } else if (AbstractC0451r.m971M(lowerCase, "tcp://", false)) {
            obj = AbstractC0444k.m930T(obj, 6);
        } else if (AbstractC0451r.m971M(lowerCase, "udp://", false)) {
            obj = AbstractC0444k.m930T(obj, 6);
        } else if (AbstractC0451r.m971M(lowerCase, "stuns:", false)) {
            obj = AbstractC0444k.m930T(obj, 6);
        } else if (AbstractC0451r.m971M(lowerCase, "stun:", false)) {
            obj = AbstractC0444k.m930T(obj, 5);
        }
        if (!AbstractC0444k.m937a0(obj)) {
            int i7 = 3478;
            if (AbstractC0451r.m971M(obj, "[", false)) {
                int m934X = AbstractC0444k.m934X(obj, ']', 0, 6);
                if (m934X > 1) {
                    String substring = obj.substring(1, m934X);
                    AbstractC3367j.m5099d(substring, "substring(...)");
                    String substring2 = obj.substring(m934X + 1);
                    AbstractC3367j.m5099d(substring2, "substring(...)");
                    Integer m973O = AbstractC0451r.m973O(AbstractC0444k.m943g0(substring2, ":"));
                    if (m973O != null) {
                        i7 = m973O.intValue();
                    }
                    obj = substring;
                } else {
                    return null;
                }
            } else {
                int m939c0 = AbstractC0444k.m939c0(obj, ':', 0, 6);
                if (m939c0 > 0 && AbstractC0444k.m934X(obj, ':', 0, 6) == m939c0) {
                    String substring3 = obj.substring(0, m939c0);
                    AbstractC3367j.m5099d(substring3, "substring(...)");
                    String substring4 = obj.substring(m939c0 + 1);
                    AbstractC3367j.m5099d(substring4, "substring(...)");
                    Integer m973O2 = AbstractC0451r.m973O(substring4);
                    if (m973O2 != null) {
                        i7 = m973O2.intValue();
                    }
                    obj = substring3;
                }
            }
            String obj2 = AbstractC0444k.m956t0(obj).toString();
            C0812dl c0812dl = new C0812dl(obj2, AbstractC2168e.m3530q(i7, 1, 65535));
            if (!AbstractC0444k.m937a0(obj2)) {
                return c0812dl;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:11|12|13|(6:83|84|85|(1:87)|88|(21:90|16|17|18|19|20|(7:65|66|67|(1:69)|70|(1:72)|73)|22|(5:24|(1:26)|27|(3:29|30|31)(1:33)|32)|34|35|(1:37)|38|(3:40|(2:42|43)(1:45)|44)|46|47|48|(6:51|(1:53)|54|(3:56|57|58)(1:60)|59|49)|61|62|63))|15|16|17|18|19|20|(0)|22|(0)|34|35|(0)|38|(0)|46|47|48|(1:49)|61|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0194, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0195, code lost:
    
        r0 = p060h5.AbstractC1793a0.m2985m(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Type inference failed for: r0v20, types: [e5.m2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [g5.h] */
    /* JADX WARN: Type inference failed for: r23v0, types: [t5.e] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [e5.bo, java.lang.Object, m5.c] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2185f(String str, Network network, C1405wn c1405wn, EnumC1127no enumC1127no, InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        AbstractC2583c abstractC2583c2;
        int i7;
        String m945i0;
        Collection collection;
        C1247rk c1247rk;
        Network network2;
        EnumC1127no enumC1127no2;
        C1247rk c1247rk2;
        EnumC1127no enumC1127no3;
        C1247rk c1247rk3;
        C1234r7 c1234r7;
        Object obj;
        Collection collection2;
        Object m2985m;
        Object m2985m2;
        int size;
        int i8;
        int m3082N;
        int size2;
        if (abstractC2583c instanceof C0751bo) {
            C0751bo c0751bo = (C0751bo) abstractC2583c;
            int i9 = c0751bo.f2856m;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0751bo.f2856m = i9 - Integer.MIN_VALUE;
                abstractC2583c2 = c0751bo;
                ?? r62 = abstractC2583c2;
                Object obj2 = r62.f2855l;
                i7 = r62.f2856m;
                boolean z7 = false;
                int i10 = 0;
                z7 = false;
                int i11 = 16;
                C1814v c1814v = C1814v.f10861e;
                Collection collection3 = C1813u.f10860e;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            m945i0 = r62.f2854k;
                            enumC1127no2 = r62.f2853j;
                            Network network3 = (Network) r62.f2852i;
                            c1247rk2 = r62.f2851h;
                            AbstractC1793a0.m2972L(obj2);
                            network2 = network3;
                            c1247rk = c1247rk2;
                            c1247rk.getClass();
                            Object obj3 = null;
                            try {
                                if (network2 != null) {
                                    try {
                                        InetAddress[] allByName = network2.getAllByName(m945i0);
                                        AbstractC3367j.m5099d(allByName, "getAllByName(...)");
                                        obj = AbstractC1804l.m3031X(allByName);
                                    } catch (Throwable th) {
                                        obj = AbstractC1793a0.m2985m(th);
                                    }
                                    boolean z8 = obj instanceof C1689h;
                                    Object obj4 = obj;
                                    if (z8) {
                                        obj4 = null;
                                    }
                                    Collection collection4 = (List) obj4;
                                    if (collection4 != null) {
                                        collection2 = collection4;
                                        AbstractC3367j.m5100e(m945i0, "hostname");
                                        InetAddress[] allByName2 = InetAddress.getAllByName(m945i0);
                                        AbstractC3367j.m5099d(allByName2, "getAllByName(hostname)");
                                        m2985m = AbstractC1804l.m3031X(allByName2);
                                        if (C1690i.m2747a(m2985m) != null) {
                                            try {
                                                InetAddress[] allByName3 = InetAddress.getAllByName(m945i0);
                                                AbstractC3367j.m5099d(allByName3, "getAllByName(...)");
                                                m2985m2 = AbstractC1804l.m3031X(allByName3);
                                            } catch (Throwable th2) {
                                                m2985m2 = AbstractC1793a0.m2985m(th2);
                                            }
                                            if (!(m2985m2 instanceof C1689h)) {
                                                obj3 = m2985m2;
                                            }
                                            Collection collection5 = (List) obj3;
                                            if (collection5 != null) {
                                                collection3 = collection5;
                                            }
                                            m2985m = collection3;
                                        }
                                        ArrayList m3058v0 = AbstractC1805m.m3058v0(collection2, (List) m2985m);
                                        HashSet hashSet = new HashSet();
                                        ArrayList arrayList = new ArrayList();
                                        size = m3058v0.size();
                                        i8 = 0;
                                        while (i8 < size) {
                                            Object obj5 = m3058v0.get(i8);
                                            i8++;
                                            String hostAddress = ((InetAddress) obj5).getHostAddress();
                                            if (hostAddress == null) {
                                                hostAddress = "";
                                            }
                                            if (hashSet.add(hostAddress)) {
                                                arrayList.add(obj5);
                                            }
                                        }
                                        m3082N = AbstractC1817y.m3082N(AbstractC1807o.m3073U(arrayList));
                                        if (m3082N >= 16) {
                                            i11 = m3082N;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                                        size2 = arrayList.size();
                                        while (i10 < size2) {
                                            Object obj6 = arrayList.get(i10);
                                            i10++;
                                            String hostAddress2 = ((InetAddress) obj6).getHostAddress();
                                            if (hostAddress2 == null) {
                                                hostAddress2 = "";
                                            }
                                            linkedHashMap.put(hostAddress2, AbstractC3784a.m5817z("系统 DNS"));
                                        }
                                        c1234r7 = new C1234r7(arrayList, c1814v, linkedHashMap);
                                        enumC1127no3 = enumC1127no2;
                                        c1247rk3 = c1247rk;
                                        List list = c1234r7.f7296a;
                                        HashSet hashSet2 = new HashSet();
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj7 : list) {
                                            String hostAddress3 = ((InetAddress) obj7).getHostAddress();
                                            if (hostAddress3 == null) {
                                                hostAddress3 = "";
                                            }
                                            if (hashSet2.add(hostAddress3)) {
                                                arrayList2.add(obj7);
                                            }
                                        }
                                        c1247rk3.getClass();
                                        return new C1234r7(m2192o(arrayList2, enumC1127no3), c1234r7.f7297b, c1234r7.f7298c);
                                    }
                                }
                                InetAddress[] allByName22 = InetAddress.getAllByName(m945i0);
                                AbstractC3367j.m5099d(allByName22, "getAllByName(hostname)");
                                m2985m = AbstractC1804l.m3031X(allByName22);
                                if (C1690i.m2747a(m2985m) != null) {
                                }
                                ArrayList m3058v02 = AbstractC1805m.m3058v0(collection2, (List) m2985m);
                                HashSet hashSet3 = new HashSet();
                                ArrayList arrayList3 = new ArrayList();
                                size = m3058v02.size();
                                i8 = 0;
                                while (i8 < size) {
                                }
                                m3082N = AbstractC1817y.m3082N(AbstractC1807o.m3073U(arrayList3));
                                if (m3082N >= 16) {
                                }
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                                size2 = arrayList3.size();
                                while (i10 < size2) {
                                }
                                c1234r7 = new C1234r7(arrayList3, c1814v, linkedHashMap2);
                                enumC1127no3 = enumC1127no2;
                                c1247rk3 = c1247rk;
                                List list2 = c1234r7.f7296a;
                                HashSet hashSet22 = new HashSet();
                                ArrayList arrayList22 = new ArrayList();
                                while (r3.hasNext()) {
                                }
                                c1247rk3.getClass();
                                return new C1234r7(m2192o(arrayList22, enumC1127no3), c1234r7.f7297b, c1234r7.f7298c);
                            } catch (NullPointerException e7) {
                                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(m945i0));
                                unknownHostException.initCause(e7);
                                throw unknownHostException;
                            }
                            collection2 = collection3;
                            AbstractC3367j.m5100e(m945i0, "hostname");
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        enumC1127no3 = (EnumC1127no) r62.f2852i;
                        c1247rk3 = r62.f2851h;
                        AbstractC1793a0.m2972L(obj2);
                        c1234r7 = (C1234r7) obj2;
                        List list22 = c1234r7.f7296a;
                        HashSet hashSet222 = new HashSet();
                        ArrayList arrayList222 = new ArrayList();
                        while (r3.hasNext()) {
                        }
                        c1247rk3.getClass();
                        return new C1234r7(m2192o(arrayList222, enumC1127no3), c1234r7.f7297b, c1234r7.f7298c);
                    }
                } else {
                    AbstractC1793a0.m2972L(obj2);
                    m945i0 = AbstractC0444k.m945i0(str, "[", "]");
                    if (AbstractC1155ol.m2013a(m945i0) != EnumC1124nl.f6341g) {
                        try {
                            collection = m2192o(AbstractC3784a.m5817z(InetAddress.getByName(m945i0)), enumC1127no);
                        } catch (Throwable th3) {
                            collection = AbstractC1793a0.m2985m(th3);
                        }
                        if (!(collection instanceof C1689h)) {
                            collection3 = collection;
                        }
                        C1813u c1813u = (List) collection3;
                        int m3082N2 = AbstractC1817y.m3082N(AbstractC1807o.m3073U(c1813u));
                        if (m3082N2 >= 16) {
                            i11 = m3082N2;
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(i11);
                        Iterator it = c1813u.iterator();
                        while (it.hasNext()) {
                            String hostAddress4 = ((InetAddress) it.next()).getHostAddress();
                            if (hostAddress4 == null) {
                                hostAddress4 = "";
                            }
                            linkedHashMap3.put(hostAddress4, AbstractC3784a.m5817z("系统 DNS"));
                        }
                        return new C1234r7(c1813u, c1814v, linkedHashMap3);
                    }
                    boolean m2388b = c1405wn.m2388b();
                    c1247rk = f7380g;
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m2388b) {
                        ConcurrentHashMap.KeySetView keySetView = AbstractC1265s7.f7527a;
                        if (c1405wn.f8506d && !((List) c1405wn.f8508f.getValue()).isEmpty()) {
                            z7 = true;
                        }
                        AbstractC1265s7.m2308e("RESOLVE custom host=" + m945i0 + " hasEcs=" + z7 + " cacheKey=" + c1405wn.m2387a());
                        r62.f2851h = c1247rk;
                        r62.f2852i = enumC1127no;
                        r62.f2856m = 1;
                        obj2 = C1074m2.f5786a.m1636a(m945i0, network, c1405wn, enumC1127no, interfaceC3281e, r62);
                        if (obj2 == enumC2465a) {
                            return enumC2465a;
                        }
                        enumC1127no3 = enumC1127no;
                        c1247rk3 = c1247rk;
                        c1234r7 = (C1234r7) obj2;
                        List list222 = c1234r7.f7296a;
                        HashSet hashSet2222 = new HashSet();
                        ArrayList arrayList2222 = new ArrayList();
                        while (r3.hasNext()) {
                        }
                        c1247rk3.getClass();
                        return new C1234r7(m2192o(arrayList2222, enumC1127no3), c1234r7.f7297b, c1234r7.f7298c);
                    }
                    if (interfaceC3281e != 0) {
                        C0942ho c0942ho = new C0942ho(1, 1, "系统 DNS", m945i0, "");
                        r62.f2851h = c1247rk;
                        network2 = network;
                        r62.f2852i = network2;
                        r62.f2853j = enumC1127no;
                        r62.f2854k = m945i0;
                        r62.f2856m = 2;
                        if (interfaceC3281e.mo22d(c0942ho, r62) == enumC2465a) {
                            return enumC2465a;
                        }
                        c1247rk2 = c1247rk;
                        enumC1127no2 = enumC1127no;
                        c1247rk = c1247rk2;
                        c1247rk.getClass();
                        Object obj32 = null;
                        if (network2 != null) {
                        }
                        collection2 = collection3;
                        AbstractC3367j.m5100e(m945i0, "hostname");
                        InetAddress[] allByName222 = InetAddress.getAllByName(m945i0);
                        AbstractC3367j.m5099d(allByName222, "getAllByName(hostname)");
                        m2985m = AbstractC1804l.m3031X(allByName222);
                        if (C1690i.m2747a(m2985m) != null) {
                        }
                        ArrayList m3058v022 = AbstractC1805m.m3058v0(collection2, (List) m2985m);
                        HashSet hashSet32 = new HashSet();
                        ArrayList arrayList32 = new ArrayList();
                        size = m3058v022.size();
                        i8 = 0;
                        while (i8 < size) {
                        }
                        m3082N = AbstractC1817y.m3082N(AbstractC1807o.m3073U(arrayList32));
                        if (m3082N >= 16) {
                        }
                        LinkedHashMap linkedHashMap22 = new LinkedHashMap(i11);
                        size2 = arrayList32.size();
                        while (i10 < size2) {
                        }
                        c1234r7 = new C1234r7(arrayList32, c1814v, linkedHashMap22);
                        enumC1127no3 = enumC1127no2;
                        c1247rk3 = c1247rk;
                        List list2222 = c1234r7.f7296a;
                        HashSet hashSet22222 = new HashSet();
                        ArrayList arrayList22222 = new ArrayList();
                        while (r3.hasNext()) {
                        }
                        c1247rk3.getClass();
                        return new C1234r7(m2192o(arrayList22222, enumC1127no3), c1234r7.f7297b, c1234r7.f7298c);
                    }
                    network2 = network;
                    enumC1127no2 = enumC1127no;
                    c1247rk.getClass();
                    Object obj322 = null;
                    if (network2 != null) {
                    }
                    collection2 = collection3;
                    AbstractC3367j.m5100e(m945i0, "hostname");
                    InetAddress[] allByName2222 = InetAddress.getAllByName(m945i0);
                    AbstractC3367j.m5099d(allByName2222, "getAllByName(hostname)");
                    m2985m = AbstractC1804l.m3031X(allByName2222);
                    if (C1690i.m2747a(m2985m) != null) {
                    }
                    ArrayList m3058v0222 = AbstractC1805m.m3058v0(collection2, (List) m2985m);
                    HashSet hashSet322 = new HashSet();
                    ArrayList arrayList322 = new ArrayList();
                    size = m3058v0222.size();
                    i8 = 0;
                    while (i8 < size) {
                    }
                    m3082N = AbstractC1817y.m3082N(AbstractC1807o.m3073U(arrayList322));
                    if (m3082N >= 16) {
                    }
                    LinkedHashMap linkedHashMap222 = new LinkedHashMap(i11);
                    size2 = arrayList322.size();
                    while (i10 < size2) {
                    }
                    c1234r7 = new C1234r7(arrayList322, c1814v, linkedHashMap222);
                    enumC1127no3 = enumC1127no2;
                    c1247rk3 = c1247rk;
                    List list22222 = c1234r7.f7296a;
                    HashSet hashSet222222 = new HashSet();
                    ArrayList arrayList222222 = new ArrayList();
                    while (r3.hasNext()) {
                    }
                    c1247rk3.getClass();
                    return new C1234r7(m2192o(arrayList222222, enumC1127no3), c1234r7.f7297b, c1234r7.f7298c);
                }
            }
        }
        abstractC2583c2 = new AbstractC2583c(abstractC2583c);
        ?? r622 = abstractC2583c2;
        Object obj22 = r622.f2855l;
        i7 = r622.f2856m;
        boolean z72 = false;
        int i102 = 0;
        z72 = false;
        int i112 = 16;
        C1814v c1814v2 = C1814v.f10861e;
        Collection collection32 = C1813u.f10860e;
        if (i7 == 0) {
        }
    }

    /* renamed from: g */
    public static final EnumC0908gm m2186g(EnumC0876fm enumC0876fm, EnumC0876fm enumC0876fm2) {
        boolean z7;
        boolean z8;
        boolean z9;
        List list = C0883ft.f4080j;
        boolean z10 = false;
        EnumC0876fm enumC0876fm3 = EnumC0876fm.f4041e;
        if (enumC0876fm != enumC0876fm3) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (enumC0876fm2 != enumC0876fm3) {
            z8 = true;
        } else {
            z8 = false;
        }
        EnumC0876fm enumC0876fm4 = EnumC0876fm.f4043g;
        if (enumC0876fm == enumC0876fm4) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (enumC0876fm2 == enumC0876fm4) {
            z10 = true;
        }
        if (z7 && z8) {
            if (!z9 && !z10) {
                return EnumC0908gm.f4313k;
            }
            return EnumC0908gm.f4314l;
        }
        if (z7) {
            if (z9) {
                return EnumC0908gm.f4310h;
            }
            return EnumC0908gm.f4309g;
        }
        if (z8) {
            if (z10) {
                return EnumC0908gm.f4312j;
            }
            return EnumC0908gm.f4311i;
        }
        return EnumC0908gm.f4308f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [e5.or] */
    /* renamed from: h */
    public static final ThreadFactoryC1161or m2187h(C1247rk c1247rk, final String str) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        return new ThreadFactory() { // from class: e5.or
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(new RunnableC0219y(8, runnable));
                thread.setName(str + "-" + atomicInteger.incrementAndGet());
                thread.setDaemon(false);
                return thread;
            }
        };
    }

    /* renamed from: i */
    public static final void m2188i(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        SecureRandom secureRandom = C1031kl.f5303g;
        byteArrayOutputStream.write((i7 >>> 24) & 255);
        byteArrayOutputStream.write((i7 >>> 16) & 255);
        byteArrayOutputStream.write((i7 >>> 8) & 255);
        byteArrayOutputStream.write(i7 & 255);
    }

    /* renamed from: j */
    public static final void m2189j(ByteArrayOutputStream byteArrayOutputStream, int i7) {
        SecureRandom secureRandom = C1031kl.f5303g;
        byteArrayOutputStream.write((i7 >>> 8) & 255);
        byteArrayOutputStream.write(i7 & 255);
    }

    /* renamed from: m */
    public static C0875fl m2190m(boolean z7, boolean z8, boolean z9) {
        byte[] bArr;
        int i7;
        int i8;
        if (z7) {
            bArr = new byte[12];
        } else {
            bArr = new byte[16];
        }
        byte[] bArr2 = bArr;
        C1031kl.f5303g.nextBytes(bArr2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (z8 || z9) {
            if (z8) {
                i7 = 4;
            } else {
                i7 = 0;
            }
            if (z9) {
                i8 = 2;
            } else {
                i8 = 0;
            }
            m2189j(byteArrayOutputStream, 3);
            m2189j(byteArrayOutputStream, 4);
            m2188i(byteArrayOutputStream, i7 | i8);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        m2189j(byteArrayOutputStream2, 1);
        m2189j(byteArrayOutputStream2, byteArray.length);
        if (z7) {
            m2188i(byteArrayOutputStream2, 554869826);
            byteArrayOutputStream2.write(bArr2);
            byte[] bArr3 = new byte[16];
            bArr3[0] = (byte) 33;
            bArr3[1] = (byte) 18;
            bArr3[2] = (byte) 164;
            bArr3[3] = (byte) 66;
            AbstractC1804l.m3018K(bArr2, bArr3, 4, 0, 0, 12);
            bArr2 = bArr3;
        } else {
            byteArrayOutputStream2.write(bArr2);
        }
        byteArrayOutputStream2.write(byteArray);
        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
        AbstractC3367j.m5099d(byteArray2, "toByteArray(...)");
        return new C0875fl(byteArray2, bArr2, z7);
    }

    /* renamed from: n */
    public static /* synthetic */ C0875fl m2191n(int i7, boolean z7) {
        boolean z8;
        if ((i7 & 4) != 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        return m2190m(z7, false, z8);
    }

    /* renamed from: o */
    public static List m2192o(List list, EnumC1127no enumC1127no) {
        int ordinal = enumC1127no.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((InetAddress) obj).getAddress().length == 16) {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList;
                }
                throw new RuntimeException();
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((InetAddress) obj2).getAddress().length == 4) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }
        return list;
    }

    /* renamed from: q */
    public static boolean m2193q(String str) {
        if (!AbstractC3367j.m5096a(str, "lo") && !AbstractC3367j.m5096a(str, "dummy0") && !AbstractC0451r.m971M(str, "ifb", false) && !AbstractC0451r.m971M(str, "tun", false) && !AbstractC0451r.m971M(str, "gre", false) && !AbstractC0451r.m971M(str, "gretap", false) && !AbstractC0451r.m971M(str, "erspan", false) && !AbstractC0451r.m971M(str, "ip_vti", false) && !AbstractC0451r.m971M(str, "ip6_vti", false) && !AbstractC0451r.m971M(str, "sit", false) && !AbstractC0451r.m971M(str, "ip6tnl", false) && !AbstractC0451r.m971M(str, "ip6gre", false) && !AbstractC0451r.m971M(str, "rmnet_ipa", false) && !AbstractC0451r.m971M(str, "r_rmnet", false) && !AbstractC0451r.m971M(str, "p2p", false) && !AbstractC0451r.m971M(str, "wifi-aware", false)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0079  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2194s() {
        Object m2985m;
        long currentTimeMillis;
        Process exec;
        boolean waitFor;
        Object obj = null;
        try {
            currentTimeMillis = System.currentTimeMillis();
            exec = Runtime.getRuntime().exec(new String[]{"su", "-c", "cat /proc/net/dev"});
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            waitFor = exec.waitFor(2000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (!waitFor) {
            exec.destroyForcibly();
        } else if (exec.exitValue() == 0) {
            long currentTimeMillis2 = currentTimeMillis + ((System.currentTimeMillis() - currentTimeMillis) / 2);
            InputStream inputStream = exec.getInputStream();
            AbstractC3367j.m5099d(inputStream, "getInputStream(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, AbstractC0434a.f1477a), 8192);
            try {
                String m3296u = AbstractC2067b.m3296u(bufferedReader);
                bufferedReader.close();
                m2985m = ((Object) m3296u) + "\n#sampleTimeMs=" + currentTimeMillis2;
                if (!(m2985m instanceof C1689h)) {
                    obj = m2985m;
                }
                return (String) obj;
            } finally {
            }
        }
        m2985m = null;
        if (!(m2985m instanceof C1689h)) {
        }
        return (String) obj;
    }

    /* renamed from: u */
    public static int m2195u(int i7, byte[] bArr) {
        return (bArr[i7 + 1] & 255) | ((bArr[i7] & 255) << 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0973io m2196x(String str, String str2, String str3) {
        Object m2985m;
        URL url;
        String host;
        String obj;
        int i7;
        AbstractC3367j.m5100e(str, "selectionKey");
        AbstractC3367j.m5100e(str3, "displayLabel");
        Object obj2 = null;
        try {
            url = new URL(AbstractC0444k.m943g0(str2, "fetch+"));
            host = url.getHost();
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (host != null && (obj = AbstractC0444k.m956t0(host).toString()) != null) {
            String m945i0 = AbstractC0444k.m945i0(obj, "[", "]");
            if (AbstractC0444k.m937a0(m945i0)) {
                m945i0 = null;
            }
            if (m945i0 != null) {
                if (url.getPort() > 0) {
                    i7 = url.getPort();
                } else {
                    int defaultPort = url.getDefaultPort();
                    Integer valueOf = Integer.valueOf(defaultPort);
                    if (defaultPort <= 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        i7 = valueOf.intValue();
                    } else {
                        i7 = 443;
                    }
                }
                m2985m = new C0973io(i7, str, str3, m945i0);
                if (!(m2985m instanceof C1689h)) {
                    obj2 = m2985m;
                }
                return (C0973io) obj2;
            }
        }
        m2985m = null;
        if (!(m2985m instanceof C1689h)) {
        }
        return (C0973io) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v17, types: [g5.h] */
    /* renamed from: k */
    public synchronized void m2197k(Context context) {
        ConnectivityManager connectivityManager;
        Object m2985m;
        PowerManager powerManager;
        PowerManager.WakeLock wakeLock;
        WifiManager wifiManager;
        WifiManager.WifiLock wifiLock;
        int i7;
        Object obj;
        switch (this.f7389a) {
            case 0:
                synchronized (this) {
                    try {
                        if (f7377d != null) {
                            m2202v();
                        }
                        Object systemService = context.getApplicationContext().getSystemService("connectivity");
                        if (systemService instanceof ConnectivityManager) {
                            connectivityManager = (ConnectivityManager) systemService;
                        } else {
                            connectivityManager = null;
                        }
                        if (connectivityManager != null) {
                            NetworkRequest build = new NetworkRequest.Builder().addTransportType(0).addCapability(12).build();
                            C1216qk c1216qk = new C1216qk(0);
                            try {
                                connectivityManager.requestNetwork(build, c1216qk);
                                m2985m = C1694m.f10482a;
                            } catch (Throwable th) {
                                m2985m = AbstractC1793a0.m2985m(th);
                            }
                            if (!(m2985m instanceof C1689h)) {
                                f7376c = connectivityManager;
                                f7377d = c1216qk;
                                if (Log.isLoggable("HBCS-NetIface", 4)) {
                                    Log.i("HBCS-NetIface", "CELLULAR_KEEP acquire force=true");
                                }
                            }
                            Throwable m2747a = C1690i.m2747a(m2985m);
                            if (m2747a != null) {
                                String str = "CELLULAR_KEEP acquire_failed err=" + m2747a.getMessage();
                                AbstractC3367j.m5100e(str, "message");
                                if (Log.isLoggable("HBCS-NetIface", 5)) {
                                    Log.w("HBCS-NetIface", str);
                                }
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                synchronized (this) {
                    try {
                        AbstractC3367j.m5100e(context, "context");
                        Context applicationContext = context.getApplicationContext();
                        PowerManager.WakeLock wakeLock2 = null;
                        if (f7382i == null) {
                            Object systemService2 = applicationContext.getSystemService("wifi");
                            if (systemService2 instanceof WifiManager) {
                                wifiManager = (WifiManager) systemService2;
                            } else {
                                wifiManager = null;
                            }
                            if (wifiManager != null) {
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i7 = 4;
                                } else {
                                    i7 = 3;
                                }
                                try {
                                    WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(i7, "SpeedTest:WifiPerf");
                                    createWifiLock.setReferenceCounted(false);
                                    createWifiLock.acquire();
                                    obj = createWifiLock;
                                } catch (Throwable th2) {
                                    obj = AbstractC1793a0.m2985m(th2);
                                }
                                boolean z7 = obj instanceof C1689h;
                                Object obj2 = obj;
                                if (z7) {
                                    obj2 = null;
                                }
                                wifiLock = (WifiManager.WifiLock) obj2;
                            } else {
                                wifiLock = null;
                            }
                            f7382i = wifiLock;
                        }
                        if (f7383j == null) {
                            Object systemService3 = applicationContext.getSystemService("power");
                            if (systemService3 instanceof PowerManager) {
                                powerManager = (PowerManager) systemService3;
                            } else {
                                powerManager = null;
                            }
                            if (powerManager != null) {
                                try {
                                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "SpeedTest:CpuPerf");
                                    newWakeLock.setReferenceCounted(false);
                                    newWakeLock.acquire(7200000L);
                                    wakeLock = newWakeLock;
                                } catch (Throwable th3) {
                                    wakeLock = AbstractC1793a0.m2985m(th3);
                                }
                                if (!(wakeLock instanceof C1689h)) {
                                    wakeLock2 = wakeLock;
                                }
                                wakeLock2 = wakeLock2;
                            }
                            f7383j = wakeLock2;
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* renamed from: l */
    public synchronized void m2198l(Context context, boolean z7) {
        ConnectivityManager connectivityManager;
        Object m2985m;
        AbstractC3367j.m5100e(context, "context");
        boolean z8 = true;
        if (f7386m != null) {
            if (!z7) {
                if (f7387n == null) {
                    z8 = false;
                }
                String str = "WIFI_KEEP acquire skip already_registered held=" + z8;
                AbstractC3367j.m5100e(str, "message");
                if (Log.isLoggable("HBCS-NetIface", 3)) {
                    Log.d("HBCS-NetIface", str);
                }
                return;
            }
            m2202v();
        }
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return;
        }
        NetworkRequest build = new NetworkRequest.Builder().addTransportType(1).addCapability(12).build();
        C1216qk c1216qk = new C1216qk(1);
        try {
            connectivityManager.requestNetwork(build, c1216qk);
            m2985m = C1694m.f10482a;
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (!(m2985m instanceof C1689h)) {
            f7385l = connectivityManager;
            f7386m = c1216qk;
            String str2 = "WIFI_KEEP acquire force=" + z7;
            AbstractC3367j.m5100e(str2, "message");
            if (Log.isLoggable("HBCS-NetIface", 4)) {
                Log.i("HBCS-NetIface", str2);
            }
        }
        Throwable m2747a = C1690i.m2747a(m2985m);
        if (m2747a != null) {
            String str3 = "WIFI_KEEP acquire_failed err=" + m2747a.getMessage();
            AbstractC3367j.m5100e(str3, "message");
            if (Log.isLoggable("HBCS-NetIface", 5)) {
                Log.w("HBCS-NetIface", str3);
            }
        }
    }

    /* renamed from: p */
    public C1196q0 m2199p(Context context) {
        C1196q0 c1196q0;
        C1196q0 c1196q02 = C1196q0.f6961q;
        if (c1196q02 == null) {
            synchronized (this) {
                c1196q0 = C1196q0.f6961q;
                if (c1196q0 == null) {
                    Context applicationContext = context.getApplicationContext();
                    AbstractC3367j.m5099d(applicationContext, "getApplicationContext(...)");
                    c1196q0 = new C1196q0(applicationContext);
                    C1196q0.f6961q = c1196q0;
                }
            }
            return c1196q0;
        }
        return c1196q02;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0135  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0725au m2200r(String str) {
        Object m2985m;
        Object obj;
        int i7;
        Object obj2;
        long currentTimeMillis;
        long j6;
        Long m974P;
        try {
            Iterator it = AbstractC0444k.m940d0(str).iterator();
            while (true) {
                C0437d c0437d = (C0437d) it;
                i7 = 0;
                if (c0437d.hasNext()) {
                    obj2 = c0437d.next();
                    if (AbstractC0451r.m971M((String) obj2, "#sampleTimeMs=", false)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            String str2 = (String) obj2;
            if (str2 != null && (m974P = AbstractC0451r.m974P(AbstractC0444k.m951o0(str2, "=", str2))) != null) {
                currentTimeMillis = m974P.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            j6 = currentTimeMillis;
        } catch (Throwable th) {
            th = th;
        }
        try {
            List m668G = AbstractC0307n.m668G(AbstractC0307n.m667F(AbstractC0444k.m940d0(str), new C0866fc(this)));
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : m668G) {
                String str3 = ((C1093ml) obj3).f5958a;
                if (AbstractC3367j.m5096a(str3, "wlan0") || AbstractC0451r.m971M(str3, "rmnet_data", false) || AbstractC0451r.m971M(str3, "ccmni", false) || AbstractC0451r.m971M(str3, "ccmni_data", false) || AbstractC0451r.m971M(str3, "usb", false)) {
                    arrayList.add(obj3);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = new ArrayList();
                for (Object obj4 : m668G) {
                    if (!m2193q(((C1093ml) obj4).f5958a)) {
                        arrayList.add(obj4);
                    }
                }
            }
            int size = arrayList.size();
            long j7 = 0;
            long j8 = 0;
            while (i7 < size) {
                Object obj5 = arrayList.get(i7);
                i7++;
                C1093ml c1093ml = (C1093ml) obj5;
                j7 += c1093ml.f5959b;
                j8 += c1093ml.f5960c;
                arrayList = arrayList;
            }
            int m3082N = AbstractC1817y.m3082N(AbstractC1807o.m3073U(m668G));
            if (m3082N < 16) {
                m3082N = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(m3082N);
            for (Iterator it2 = m668G.iterator(); it2.hasNext(); it2 = it2) {
                C1093ml c1093ml2 = (C1093ml) it2.next();
                linkedHashMap.put(c1093ml2.f5958a, new C0739bc(c1093ml2.f5959b, c1093ml2.f5960c));
            }
            m2985m = new C0725au(j7, j8, j6, linkedHashMap);
            if (j7 <= 0 && j8 <= 0) {
                m2985m = null;
            }
        } catch (Throwable th2) {
            th = th2;
            m2985m = AbstractC1793a0.m2985m(th);
            if (!(m2985m instanceof C1689h)) {
            }
            return (C0725au) obj;
        }
        if (!(m2985m instanceof C1689h)) {
            obj = null;
        } else {
            obj = m2985m;
        }
        return (C0725au) obj;
    }

    /* renamed from: t */
    public C0725au m2201t() {
        Object m2985m;
        Object obj = null;
        try {
            String m2194s = m2194s();
            if (m2194s == null) {
                m2985m = null;
            } else {
                m2985m = m2200r(m2194s);
            }
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (!(m2985m instanceof C1689h)) {
            obj = m2985m;
        }
        return (C0725au) obj;
    }

    /* renamed from: v */
    public synchronized void m2202v() {
        ConnectivityManager connectivityManager;
        Network network;
        String str;
        ConnectivityManager connectivityManager2;
        Network network2;
        String str2;
        switch (this.f7389a) {
            case 0:
                synchronized (this) {
                    try {
                        connectivityManager = f7376c;
                        C1216qk c1216qk = f7377d;
                        network = f7378e;
                        str = null;
                        f7376c = null;
                        f7377d = null;
                        f7378e = null;
                        if (connectivityManager != null && c1216qk != null) {
                            connectivityManager.unregisterNetworkCallback(c1216qk);
                        }
                    } catch (Throwable th) {
                        AbstractC1793a0.m2985m(th);
                    } finally {
                    }
                    if (network != null || connectivityManager != null) {
                        if (network != null) {
                            String str3 = "Network@" + System.identityHashCode(network);
                            if (str3 == null) {
                                str3 = "default";
                            }
                            str = str3;
                        }
                        String str4 = "CELLULAR_KEEP release hadNetwork=" + str;
                        AbstractC3367j.m5100e(str4, "message");
                        if (Log.isLoggable("HBCS-NetIface", 4)) {
                            Log.i("HBCS-NetIface", str4);
                        }
                    }
                }
                return;
            case 3:
                synchronized (this) {
                    try {
                        WifiManager.WifiLock wifiLock = f7382i;
                        if (wifiLock != null) {
                            try {
                                if (wifiLock.isHeld()) {
                                    wifiLock.release();
                                }
                            } catch (Throwable th2) {
                                AbstractC1793a0.m2985m(th2);
                            }
                        }
                        f7382i = null;
                        PowerManager.WakeLock wakeLock = f7383j;
                        if (wakeLock != null) {
                            try {
                                if (wakeLock.isHeld()) {
                                    wakeLock.release();
                                }
                            } catch (Throwable th3) {
                                AbstractC1793a0.m2985m(th3);
                            }
                        }
                        f7383j = null;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
            default:
                synchronized (this) {
                    try {
                        connectivityManager2 = f7385l;
                        C1216qk c1216qk2 = f7386m;
                        network2 = f7387n;
                        str2 = null;
                        f7385l = null;
                        f7386m = null;
                        f7387n = null;
                        if (connectivityManager2 != null && c1216qk2 != null) {
                            connectivityManager2.unregisterNetworkCallback(c1216qk2);
                        }
                    } catch (Throwable th5) {
                        AbstractC1793a0.m2985m(th5);
                    } finally {
                    }
                    if (network2 != null || connectivityManager2 != null) {
                        if (network2 != null) {
                            String str5 = "Network@" + System.identityHashCode(network2);
                            if (str5 == null) {
                                str5 = "default";
                            }
                            str2 = str5;
                        }
                        String str6 = "WIFI_KEEP release hadNetwork=" + str2;
                        AbstractC3367j.m5100e(str6, "message");
                        if (Log.isLoggable("HBCS-NetIface", 4)) {
                            Log.i("HBCS-NetIface", str6);
                        }
                    }
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m2203w(List list, C1248rl c1248rl, C1405wn c1405wn, EnumC1127no enumC1127no, C1401wj c1401wj, AbstractC2583c abstractC2583c) {
        C0783co c0783co;
        int i7;
        EnumC2465a enumC2465a;
        C1247rk c1247rk;
        C1248rl c1248rl2;
        Object m1122A;
        if (abstractC2583c instanceof C0783co) {
            c0783co = (C0783co) abstractC2583c;
            int i8 = c0783co.f3176l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0783co.f3176l = i8 - Integer.MIN_VALUE;
                Object obj = c0783co.f3174j;
                i7 = c0783co.f3176l;
                enumC2465a = EnumC2465a.f13750e;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1248rl2 = c0783co.f3173i;
                    c1247rk = c0783co.f3172h;
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c0783co.f3172h = this;
                    c0783co.f3173i = c1248rl;
                    c0783co.f3176l = 1;
                    C2325e c2325e = AbstractC0549l0.f1898a;
                    obj = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0073s(list, c1248rl, c1405wn, enumC1127no, c1401wj, null, 9), c0783co);
                    if (obj != enumC2465a) {
                        c1247rk = this;
                        c1248rl2 = c1248rl;
                    }
                    return enumC2465a;
                }
                c0783co.f3172h = null;
                c0783co.f3173i = null;
                c0783co.f3176l = 2;
                c1247rk.getClass();
                C2325e c2325e2 = AbstractC0549l0.f1898a;
                m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0062p0((List) obj, c1248rl2, (InterfaceC2313c) null, 13), c0783co);
                if (m1122A != enumC2465a) {
                    return enumC2465a;
                }
                return m1122A;
            }
        }
        c0783co = new C0783co(this, abstractC2583c);
        Object obj2 = c0783co.f3174j;
        i7 = c0783co.f3176l;
        enumC2465a = EnumC2465a.f13750e;
        if (i7 == 0) {
        }
        c0783co.f3172h = null;
        c0783co.f3173i = null;
        c0783co.f3176l = 2;
        c1247rk.getClass();
        C2325e c2325e22 = AbstractC0549l0.f1898a;
        m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0062p0((List) obj2, c1248rl2, (InterfaceC2313c) null, 13), c0783co);
        if (m1122A != enumC2465a) {
        }
    }
}
