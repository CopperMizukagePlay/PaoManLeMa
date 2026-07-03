package p039e5;

import android.net.Network;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import p001a0.AbstractC0094y0;
import p001a0.C0019e1;
import p001a0.C0047l1;
import p001a0.C0062p0;
import p001a0.C0070r0;
import p001a0.C0075s1;
import p006a7.InterfaceC0128k;
import p015b6.C0310q;
import p018c0.C0341k;
import p023c5.C0427s;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0565q1;
import p032d6.C0576u0;
import p034e0.C0598c0;
import p053g5.C1687f;
import p053g5.C1689h;
import p053g5.C1690i;
import p053g5.C1691j;
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
import p060h5.C1803k;
import p060h5.C1813u;
import p060h5.C1814v;
import p060h5.C1815w;
import p066i3.AbstractC2067b;
import p068i5.AbstractC2080d;
import p069i6.C2090c;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p098m5.AbstractC2583c;
import p098m5.AbstractC2590j;
import p099m6.AbstractC2595c;
import p099m6.AbstractC2602f0;
import p099m6.C2592a0;
import p099m6.C2598d0;
import p099m6.C2610k;
import p099m6.C2621v;
import p099m6.C2622w;
import p099m6.C2623x;
import p099m6.C2625z;
import p099m6.EnumC2624y;
import p102n1.AbstractC2710c;
import p106n6.AbstractC2721b;
import p128q6.C3006i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.C3379v;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ms */
/* loaded from: classes.dex */
public final class C1100ms {

    /* renamed from: o1 */
    public static final C1247rk f5998o1;

    /* renamed from: p1 */
    public static final C2610k f5999p1;

    /* renamed from: q1 */
    public static final C2610k f6000q1;

    /* renamed from: r1 */
    public static final C0019e1 f6001r1;

    /* renamed from: s1 */
    public static final C0019e1 f6002s1;

    /* renamed from: t1 */
    public static final C2623x f6003t1;

    /* renamed from: u1 */
    public static final C2623x f6004u1;

    /* renamed from: v1 */
    public static final int f6005v1;

    /* renamed from: A */
    public final ConcurrentHashMap f6006A;

    /* renamed from: A0 */
    public volatile int f6007A0;

    /* renamed from: B */
    public final ConcurrentHashMap f6008B;

    /* renamed from: B0 */
    public volatile EnumC0908gm f6009B0;

    /* renamed from: C */
    public final ConcurrentHashMap f6010C;

    /* renamed from: C0 */
    public volatile C0750bn f6011C0;

    /* renamed from: D */
    public final ConcurrentHashMap f6012D;

    /* renamed from: D0 */
    public volatile String f6013D0;

    /* renamed from: E */
    public final ConcurrentHashMap f6014E;

    /* renamed from: E0 */
    public volatile boolean f6015E0;

    /* renamed from: F */
    public final AtomicInteger f6016F;

    /* renamed from: F0 */
    public volatile C0706ab f6017F0;

    /* renamed from: G */
    public final AtomicInteger f6018G;

    /* renamed from: G0 */
    public volatile EnumC1127no f6019G0;

    /* renamed from: H */
    public final AtomicLong f6020H;

    /* renamed from: H0 */
    public volatile C1405wn f6021H0;

    /* renamed from: I */
    public final AtomicInteger f6022I;

    /* renamed from: I0 */
    public volatile Object f6023I0;

    /* renamed from: J */
    public final AtomicLong f6024J;

    /* renamed from: J0 */
    public volatile String f6025J0;

    /* renamed from: K */
    public final int f6026K;

    /* renamed from: K0 */
    public final AtomicInteger f6027K0;

    /* renamed from: L */
    public final C2610k f6028L;

    /* renamed from: L0 */
    public final AtomicInteger f6029L0;

    /* renamed from: M */
    public final C2610k f6030M;

    /* renamed from: M0 */
    public final AtomicInteger f6031M0;

    /* renamed from: N */
    public final C0019e1 f6032N;

    /* renamed from: N0 */
    public final C1414x1 f6033N0;

    /* renamed from: O */
    public final C0019e1 f6034O;

    /* renamed from: O0 */
    public final ArrayList f6035O0;

    /* renamed from: P */
    public final C2623x f6036P;

    /* renamed from: P0 */
    public final ConcurrentHashMap f6037P0;

    /* renamed from: Q */
    public final C2623x f6038Q;

    /* renamed from: Q0 */
    public final ConcurrentHashMap f6039Q0;

    /* renamed from: R */
    public final C2621v f6040R;

    /* renamed from: R0 */
    public final AtomicInteger f6041R0;

    /* renamed from: S */
    public C0565q1 f6042S;

    /* renamed from: S0 */
    public final ArrayList f6043S0;

    /* renamed from: T */
    public C0565q1 f6044T;

    /* renamed from: T0 */
    public final ArrayList f6045T0;

    /* renamed from: U */
    public C0565q1 f6046U;

    /* renamed from: U0 */
    public Object f6047U0;

    /* renamed from: V */
    public C0565q1 f6048V;

    /* renamed from: V0 */
    public long f6049V0;

    /* renamed from: W */
    public C0565q1 f6050W;

    /* renamed from: W0 */
    public final Object f6051W0;

    /* renamed from: X */
    public long f6052X;

    /* renamed from: X0 */
    public final Object f6053X0;

    /* renamed from: Y */
    public long f6054Y;

    /* renamed from: Y0 */
    public final Object f6055Y0;

    /* renamed from: Z */
    public long f6056Z;

    /* renamed from: Z0 */
    public final AtomicInteger f6057Z0;

    /* renamed from: a */
    public ExecutorService f6058a;

    /* renamed from: a0 */
    public long f6059a0;

    /* renamed from: a1 */
    public long f6060a1;

    /* renamed from: b */
    public C0576u0 f6061b;

    /* renamed from: b0 */
    public long f6062b0;

    /* renamed from: b1 */
    public long f6063b1;

    /* renamed from: c */
    public ExecutorService f6064c;

    /* renamed from: c0 */
    public long f6065c0;

    /* renamed from: c1 */
    public long f6066c1;

    /* renamed from: d */
    public C0576u0 f6067d;

    /* renamed from: d0 */
    public long f6068d0;

    /* renamed from: d1 */
    public long f6069d1;

    /* renamed from: e */
    public final C2090c f6070e;

    /* renamed from: e0 */
    public long f6071e0;

    /* renamed from: e1 */
    public double f6072e1;

    /* renamed from: f */
    public final AtomicBoolean f6073f;

    /* renamed from: f0 */
    public EnumC0757bu f6074f0;

    /* renamed from: f1 */
    public double f6075f1;

    /* renamed from: g */
    public final AtomicBoolean f6076g;

    /* renamed from: g0 */
    public boolean f6077g0;

    /* renamed from: g1 */
    public volatile long f6078g1;

    /* renamed from: h */
    public final AtomicBoolean f6079h;

    /* renamed from: h0 */
    public volatile boolean f6080h0;

    /* renamed from: h1 */
    public volatile int f6081h1;

    /* renamed from: i */
    public final AtomicLong f6082i;

    /* renamed from: i0 */
    public volatile boolean f6083i0;

    /* renamed from: i1 */
    public final C1701c0 f6084i1;

    /* renamed from: j */
    public final AtomicLong f6085j;

    /* renamed from: j0 */
    public boolean f6086j0;

    /* renamed from: j1 */
    public final C1715p f6087j1;

    /* renamed from: k */
    public final C0694a f6088k;

    /* renamed from: k0 */
    public C1096mo f6089k0;

    /* renamed from: k1 */
    public final C1691j f6090k1;

    /* renamed from: l */
    public final C0694a f6091l;

    /* renamed from: l0 */
    public C0789cu f6092l0;

    /* renamed from: l1 */
    public final C1691j f6093l1;

    /* renamed from: m */
    public final C0802db f6094m;

    /* renamed from: m0 */
    public volatile List f6095m0;

    /* renamed from: m1 */
    public final C1691j f6096m1;

    /* renamed from: n */
    public final C0802db f6097n;

    /* renamed from: n0 */
    public volatile List f6098n0;

    /* renamed from: n1 */
    public final C1691j f6099n1;

    /* renamed from: o */
    public final ConcurrentHashMap f6100o;

    /* renamed from: o0 */
    public volatile List f6101o0;

    /* renamed from: p */
    public final ConcurrentHashMap f6102p;

    /* renamed from: p0 */
    public volatile List f6103p0;

    /* renamed from: q */
    public final ConcurrentHashMap f6104q;

    /* renamed from: q0 */
    public volatile Map f6105q0;

    /* renamed from: r */
    public final ConcurrentHashMap f6106r;

    /* renamed from: r0 */
    public volatile Object f6107r0;

    /* renamed from: s */
    public final LinkedHashMap f6108s;

    /* renamed from: s0 */
    public volatile List f6109s0;

    /* renamed from: t */
    public final LinkedHashMap f6110t;

    /* renamed from: t0 */
    public volatile Map f6111t0;

    /* renamed from: u */
    public final LinkedHashMap f6112u;

    /* renamed from: u0 */
    public volatile Map f6113u0;

    /* renamed from: v */
    public final ConcurrentHashMap.KeySetView f6114v;

    /* renamed from: v0 */
    public volatile int f6115v0;

    /* renamed from: w */
    public final ConcurrentHashMap.KeySetView f6116w;

    /* renamed from: w0 */
    public volatile int f6117w0;

    /* renamed from: x */
    public final ConcurrentHashMap.KeySetView f6118x;

    /* renamed from: x0 */
    public volatile int f6119x0;

    /* renamed from: y */
    public final ConcurrentHashMap.KeySetView f6120y;

    /* renamed from: y0 */
    public volatile int f6121y0;

    /* renamed from: z */
    public final ConcurrentHashMap f6122z;

    /* renamed from: z0 */
    public volatile int f6123z0;

    static {
        C1247rk c1247rk = new C1247rk(9);
        f5998o1 = c1247rk;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(64, C1247rk.m2187h(c1247rk, "Mode2Down"));
        AbstractC3367j.m5099d(newFixedThreadPool, "newFixedThreadPool(...)");
        C2610k c2610k = new C2610k();
        c2610k.f14129c = newFixedThreadPool;
        c2610k.m4161e(64);
        c2610k.m4162f(64);
        f5999p1 = c2610k;
        ExecutorService newFixedThreadPool2 = Executors.newFixedThreadPool(64, C1247rk.m2187h(c1247rk, "Mode2Up"));
        AbstractC3367j.m5099d(newFixedThreadPool2, "newFixedThreadPool(...)");
        C2610k c2610k2 = new C2610k();
        c2610k2.f14129c = newFixedThreadPool2;
        c2610k2.m4161e(64);
        c2610k2.m4162f(64);
        f6000q1 = c2610k2;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        C0019e1 c0019e1 = new C0019e1(64);
        f6001r1 = c0019e1;
        C0019e1 c0019e12 = new C0019e1(64);
        f6002s1 = c0019e12;
        C2622w c2622w = new C2622w();
        c2622w.f14166a = c2610k;
        c2622w.f14167b = c0019e1;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        c2622w.m4180a(5000L, timeUnit2);
        c2622w.m4183d(5000L, timeUnit2);
        c2622w.m4185f(5000L, timeUnit2);
        AbstractC3367j.m5100e(timeUnit2, "unit");
        c2622w.f14187v = AbstractC2721b.m4356b("timeout", 0L, timeUnit2);
        c2622w.f14173h = true;
        c2622w.f14174i = true;
        c2622w.f14171f = true;
        c2622w.m4182c(AbstractC3784a.m5817z(EnumC2624y.f14223g));
        C2623x c2623x = new C2623x(c2622w);
        f6003t1 = c2623x;
        C2622w m4186a = c2623x.m4186a();
        m4186a.f14166a = c2610k2;
        m4186a.f14167b = c0019e12;
        m4186a.m4183d(0L, timeUnit2);
        m4186a.m4185f(5000L, timeUnit2);
        f6004u1 = new C2623x(m4186a);
        f6005v1 = -4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1100ms() {
        C1247rk c1247rk = f5998o1;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(32, C1247rk.m2187h(c1247rk, "SpeedDown"));
        AbstractC3367j.m5099d(newFixedThreadPool, "newFixedThreadPool(...)");
        this.f6058a = newFixedThreadPool;
        this.f6061b = new C0576u0(newFixedThreadPool);
        ExecutorService newFixedThreadPool2 = Executors.newFixedThreadPool(32, C1247rk.m2187h(c1247rk, "SpeedUp"));
        AbstractC3367j.m5099d(newFixedThreadPool2, "newFixedThreadPool(...)");
        this.f6064c = newFixedThreadPool2;
        this.f6067d = new C0576u0(newFixedThreadPool2);
        this.f6070e = AbstractC0525d0.m1123a(AbstractC2080d.m3374B(AbstractC0525d0.m1124b(), AbstractC0549l0.f1898a));
        final int i7 = 0;
        this.f6073f = new AtomicBoolean(false);
        this.f6076g = new AtomicBoolean(false);
        this.f6079h = new AtomicBoolean(false);
        this.f6082i = new AtomicLong(0L);
        this.f6085j = new AtomicLong(0L);
        this.f6088k = new C0694a();
        this.f6091l = new C0694a();
        this.f6094m = new C0802db();
        this.f6097n = new C0802db();
        this.f6100o = new ConcurrentHashMap();
        this.f6102p = new ConcurrentHashMap();
        this.f6104q = new ConcurrentHashMap();
        this.f6106r = new ConcurrentHashMap();
        this.f6108s = new LinkedHashMap();
        this.f6110t = new LinkedHashMap();
        this.f6112u = new LinkedHashMap();
        this.f6114v = ConcurrentHashMap.newKeySet();
        this.f6116w = ConcurrentHashMap.newKeySet();
        this.f6118x = ConcurrentHashMap.newKeySet();
        this.f6120y = ConcurrentHashMap.newKeySet();
        this.f6122z = new ConcurrentHashMap();
        this.f6006A = new ConcurrentHashMap();
        this.f6008B = new ConcurrentHashMap();
        this.f6010C = new ConcurrentHashMap();
        this.f6012D = new ConcurrentHashMap();
        this.f6014E = new ConcurrentHashMap();
        this.f6016F = new AtomicInteger(0);
        this.f6018G = new AtomicInteger(0);
        this.f6020H = new AtomicLong(0L);
        this.f6022I = new AtomicInteger(0);
        this.f6024J = new AtomicLong(0L);
        this.f6026K = Process.myUid();
        ExecutorService newFixedThreadPool3 = Executors.newFixedThreadPool(64, C1247rk.m2187h(c1247rk, "OkHttpDown"));
        AbstractC3367j.m5099d(newFixedThreadPool3, "newFixedThreadPool(...)");
        C2610k c2610k = new C2610k();
        c2610k.f14129c = newFixedThreadPool3;
        c2610k.m4161e(64);
        c2610k.m4162f(64);
        this.f6028L = c2610k;
        ExecutorService newFixedThreadPool4 = Executors.newFixedThreadPool(64, C1247rk.m2187h(c1247rk, "OkHttpUp"));
        AbstractC3367j.m5099d(newFixedThreadPool4, "newFixedThreadPool(...)");
        C2610k c2610k2 = new C2610k();
        c2610k2.f14129c = newFixedThreadPool4;
        c2610k2.m4161e(64);
        c2610k2.m4162f(64);
        this.f6030M = c2610k2;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f6032N = new C0019e1(64);
        this.f6034O = new C0019e1(64);
        this.f6036P = m2009z(false);
        final int i8 = 1;
        this.f6038Q = m2009z(true);
        Pattern pattern = C2621v.f14160c;
        this.f6040R = AbstractC2595c.m4135i("application/octet-stream");
        this.f6074f0 = EnumC0757bu.f2914e;
        this.f6089k0 = new C1096mo(0.0d, 0.0d, 0.0d, 7);
        this.f6092l0 = new C0789cu(0L, 0L, 0L, 7);
        C1813u c1813u = C1813u.f10860e;
        this.f6095m0 = c1813u;
        this.f6098n0 = c1813u;
        this.f6101o0 = c1813u;
        this.f6103p0 = c1813u;
        C1814v c1814v = C1814v.f10861e;
        this.f6105q0 = c1814v;
        this.f6107r0 = c1814v;
        this.f6109s0 = c1813u;
        this.f6111t0 = c1814v;
        this.f6113u0 = c1814v;
        this.f6115v0 = 12;
        this.f6117w0 = 12;
        this.f6119x0 = 4;
        this.f6121y0 = 4;
        this.f6123z0 = 32;
        this.f6007A0 = 32;
        this.f6009B0 = EnumC0908gm.f4308f;
        this.f6011C0 = new C0750bn();
        this.f6013D0 = "未启用";
        this.f6015E0 = true;
        this.f6017F0 = new C0706ab(0, 0, 0, 0, 0, 0, 0, 0, false, 0, 1023);
        this.f6019G0 = EnumC1127no.f6360g;
        this.f6021H0 = new C1405wn();
        this.f6023I0 = c1814v;
        this.f6025J0 = "";
        this.f6027K0 = new AtomicInteger(0);
        this.f6029L0 = new AtomicInteger(0);
        this.f6031M0 = new AtomicInteger(0);
        this.f6033N0 = new C1414x1(0);
        this.f6035O0 = new ArrayList();
        this.f6037P0 = new ConcurrentHashMap();
        this.f6039Q0 = new ConcurrentHashMap();
        this.f6041R0 = new AtomicInteger(0);
        this.f6043S0 = new ArrayList();
        this.f6045T0 = new ArrayList();
        this.f6047U0 = c1813u;
        this.f6051W0 = new Object();
        this.f6053X0 = new Object();
        this.f6055Y0 = new Object();
        this.f6057Z0 = new AtomicInteger(0);
        this.f6078g1 = 1000L;
        this.f6081h1 = 120;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        C1701c0 m2771b = AbstractC1719t.m2771b(new C0976ir(objArr, objArr2, 0.0d, 0.0d, 0.0d, 0.0d, 0L, 0L, null, null, 0.0d, 0.0d, null, 0L, null, false, false, null, null, null, 0L, 0.0d, 0.0d, null, Integer.MAX_VALUE));
        this.f6084i1 = m2771b;
        this.f6087j1 = new C1715p(m2771b);
        System.setProperty("http.keepAlive", "true");
        System.setProperty("http.maxConnections", "64");
        this.f6090k1 = AbstractC2710c.m4327J(new InterfaceC3277a(this) { // from class: e5.mr

            /* renamed from: f */
            public final /* synthetic */ C1100ms f5997f;

            {
                this.f5997f = this;
            }

            @Override // p150t5.InterfaceC3277a
            /* renamed from: a */
            public final Object mo52a() {
                switch (i7) {
                    case 0:
                        C2622w m4186a = this.f5997f.f6036P.m4186a();
                        SocketFactory socketFactory = SocketFactory.getDefault();
                        AbstractC3367j.m5099d(socketFactory, "getDefault(...)");
                        m4186a.m4184e(new C1254rr(socketFactory, 4194304));
                        return new C2623x(m4186a);
                    case 1:
                        C2622w m4186a2 = this.f5997f.f6038Q.m4186a();
                        SocketFactory socketFactory2 = SocketFactory.getDefault();
                        AbstractC3367j.m5099d(socketFactory2, "getDefault(...)");
                        m4186a2.m4184e(new C1254rr(socketFactory2, 4194304));
                        return new C2623x(m4186a2);
                    case 2:
                        C2622w m4186a3 = C1100ms.f6003t1.m4186a();
                        m4186a3.f14170e = new C1130nr(this.f5997f, 0);
                        return new C2623x(m4186a3);
                    default:
                        C2622w m4186a4 = C1100ms.f6004u1.m4186a();
                        m4186a4.f14170e = new C1130nr(this.f5997f, 1);
                        return new C2623x(m4186a4);
                }
            }
        });
        this.f6093l1 = AbstractC2710c.m4327J(new InterfaceC3277a(this) { // from class: e5.mr

            /* renamed from: f */
            public final /* synthetic */ C1100ms f5997f;

            {
                this.f5997f = this;
            }

            @Override // p150t5.InterfaceC3277a
            /* renamed from: a */
            public final Object mo52a() {
                switch (i8) {
                    case 0:
                        C2622w m4186a = this.f5997f.f6036P.m4186a();
                        SocketFactory socketFactory = SocketFactory.getDefault();
                        AbstractC3367j.m5099d(socketFactory, "getDefault(...)");
                        m4186a.m4184e(new C1254rr(socketFactory, 4194304));
                        return new C2623x(m4186a);
                    case 1:
                        C2622w m4186a2 = this.f5997f.f6038Q.m4186a();
                        SocketFactory socketFactory2 = SocketFactory.getDefault();
                        AbstractC3367j.m5099d(socketFactory2, "getDefault(...)");
                        m4186a2.m4184e(new C1254rr(socketFactory2, 4194304));
                        return new C2623x(m4186a2);
                    case 2:
                        C2622w m4186a3 = C1100ms.f6003t1.m4186a();
                        m4186a3.f14170e = new C1130nr(this.f5997f, 0);
                        return new C2623x(m4186a3);
                    default:
                        C2622w m4186a4 = C1100ms.f6004u1.m4186a();
                        m4186a4.f14170e = new C1130nr(this.f5997f, 1);
                        return new C2623x(m4186a4);
                }
            }
        });
        final int i9 = 2;
        this.f6096m1 = AbstractC2710c.m4327J(new InterfaceC3277a(this) { // from class: e5.mr

            /* renamed from: f */
            public final /* synthetic */ C1100ms f5997f;

            {
                this.f5997f = this;
            }

            @Override // p150t5.InterfaceC3277a
            /* renamed from: a */
            public final Object mo52a() {
                switch (i9) {
                    case 0:
                        C2622w m4186a = this.f5997f.f6036P.m4186a();
                        SocketFactory socketFactory = SocketFactory.getDefault();
                        AbstractC3367j.m5099d(socketFactory, "getDefault(...)");
                        m4186a.m4184e(new C1254rr(socketFactory, 4194304));
                        return new C2623x(m4186a);
                    case 1:
                        C2622w m4186a2 = this.f5997f.f6038Q.m4186a();
                        SocketFactory socketFactory2 = SocketFactory.getDefault();
                        AbstractC3367j.m5099d(socketFactory2, "getDefault(...)");
                        m4186a2.m4184e(new C1254rr(socketFactory2, 4194304));
                        return new C2623x(m4186a2);
                    case 2:
                        C2622w m4186a3 = C1100ms.f6003t1.m4186a();
                        m4186a3.f14170e = new C1130nr(this.f5997f, 0);
                        return new C2623x(m4186a3);
                    default:
                        C2622w m4186a4 = C1100ms.f6004u1.m4186a();
                        m4186a4.f14170e = new C1130nr(this.f5997f, 1);
                        return new C2623x(m4186a4);
                }
            }
        });
        final int i10 = 3;
        this.f6099n1 = AbstractC2710c.m4327J(new InterfaceC3277a(this) { // from class: e5.mr

            /* renamed from: f */
            public final /* synthetic */ C1100ms f5997f;

            {
                this.f5997f = this;
            }

            @Override // p150t5.InterfaceC3277a
            /* renamed from: a */
            public final Object mo52a() {
                switch (i10) {
                    case 0:
                        C2622w m4186a = this.f5997f.f6036P.m4186a();
                        SocketFactory socketFactory = SocketFactory.getDefault();
                        AbstractC3367j.m5099d(socketFactory, "getDefault(...)");
                        m4186a.m4184e(new C1254rr(socketFactory, 4194304));
                        return new C2623x(m4186a);
                    case 1:
                        C2622w m4186a2 = this.f5997f.f6038Q.m4186a();
                        SocketFactory socketFactory2 = SocketFactory.getDefault();
                        AbstractC3367j.m5099d(socketFactory2, "getDefault(...)");
                        m4186a2.m4184e(new C1254rr(socketFactory2, 4194304));
                        return new C2623x(m4186a2);
                    case 2:
                        C2622w m4186a3 = C1100ms.f6003t1.m4186a();
                        m4186a3.f14170e = new C1130nr(this.f5997f, 0);
                        return new C2623x(m4186a3);
                    default:
                        C2622w m4186a4 = C1100ms.f6004u1.m4186a();
                        m4186a4.f14170e = new C1130nr(this.f5997f, 1);
                        return new C2623x(m4186a4);
                }
            }
        });
    }

    /* renamed from: H0 */
    public static int m1891H0(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        if (1024 > i7 || i7 >= 65536) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 40000;
    }

    /* renamed from: L */
    public static int m1892L(C1248rl c1248rl, Map map, List list) {
        List list2 = (List) map.get(c1248rl.f7390a);
        if (list2 != null) {
            list = list2;
        }
        return list.size();
    }

    /* renamed from: L0 */
    public static long m1893L0(String str, int i7, int i8, boolean z7) {
        if (z7) {
            return 120L;
        }
        return (Long.MAX_VALUE & ((i8 * 7919) + ((i7 * 65537) + (str.hashCode() * 37)))) % 40;
    }

    /* renamed from: P */
    public static long m1894P(long j6, long j7, boolean z7) {
        if (!z7) {
            Long valueOf = Long.valueOf(j6);
            if (j6 <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.longValue();
            }
        }
        return j7;
    }

    /* renamed from: Q */
    public static long m1895Q(long j6, long j7, boolean z7) {
        if (!z7) {
            Long valueOf = Long.valueOf(j6);
            if (j6 <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.longValue();
            }
        }
        return j7;
    }

    /* renamed from: Q0 */
    public static void m1896Q0(C1100ms c1100ms, List list, List list2, List list3, List list4, boolean z7, boolean z8, boolean z9, Long l7, List list5, C1096mo c1096mo, boolean z10, boolean z11, boolean z12, long j6, EnumC1070lt enumC1070lt, C0750bn c0750bn, boolean z13, C0706ab c0706ab, EnumC1127no enumC1127no, C1405wn c1405wn, Map map, int i7, int i8) {
        List list6;
        List list7;
        C0789cu c0789cu = AbstractC0947ht.f4658a;
        int i9 = i8 & 4;
        C1814v c1814v = C1814v.f10861e;
        if (i9 != 0) {
            ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractC3367j.m5100e(str, "url");
                arrayList.add(new C1006jr(AbstractC0444k.m956t0(str).toString(), "", c1814v));
            }
            list6 = arrayList;
        } else {
            list6 = list3;
        }
        if ((i8 & 8) != 0) {
            ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list2));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                AbstractC3367j.m5100e(str2, "url");
                arrayList2.add(new C1006jr(AbstractC0444k.m956t0(str2).toString(), "", c1814v));
            }
            list7 = arrayList2;
        } else {
            list7 = list4;
        }
        int i10 = i8 & 256;
        C1813u c1813u = C1813u.f10860e;
        c1100ms.m1959P0(list, list2, list6, list7, z7, z8, z9, l7, i10 != 0 ? c1813u : list5, (i8 & 512) != 0 ? new C1096mo(0.0d, 0.0d, 0.0d, 7) : c1096mo, (i8 & 1024) != 0 ? new C0789cu(0L, 0L, 0L, 7) : c0789cu, z10, false, z11, z12, j6, enumC1070lt, (131072 & i8) != 0 ? new C0750bn() : c0750bn, (262144 & i8) != 0 ? true : z13, (524288 & i8) != 0 ? new C0706ab(0, 0, 0, 0, 0, 0, 0, 0, false, 0, 1023) : c0706ab, (1048576 & i8) != 0 ? EnumC1127no.f6360g : enumC1127no, (2097152 & i8) != 0 ? new C1405wn() : c1405wn, (4194304 & i8) != 0 ? c1814v : map, c1814v, c1814v, c1813u, (i8 & 67108864) != 0 ? 120 : i7);
    }

    /* renamed from: S */
    public static int m1897S(C1248rl c1248rl) {
        int ordinal = c1248rl.f7393d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    if (ordinal == 4) {
                        return 8;
                    }
                    throw new RuntimeException();
                }
                return 6;
            }
            return 12;
        }
        return 6;
    }

    /* renamed from: T */
    public static int m1898T(C1248rl c1248rl) {
        int ordinal = c1248rl.f7393d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    if (ordinal == 4) {
                        return 5;
                    }
                    throw new RuntimeException();
                }
            } else {
                return 6;
            }
        }
        return 4;
    }

    /* renamed from: U0 */
    public static String m1899U0(String str) {
        if (AbstractC0451r.m971M(str, "已停止", false)) {
            return str;
        }
        return "已停止：".concat(str);
    }

    /* renamed from: V */
    public static List m1900V(List list, EnumC1127no enumC1127no) {
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

    /* renamed from: X0 */
    public static String m1901X0(ArrayList arrayList) {
        List m3042f0 = AbstractC1805m.m3042f0(arrayList);
        if (m3042f0.isEmpty()) {
            return "无";
        }
        String m3051o0 = AbstractC1805m.m3051o0(AbstractC1805m.m3062z0(m3042f0, 6), "、", null, null, null, 62);
        int size = m3042f0.size() - 6;
        if (size > 0) {
            return m3051o0 + " 等 " + size + " 条";
        }
        return m3051o0;
    }

    /* renamed from: Z0 */
    public static void m1902Z0(long j6, long j7, double d7) {
        if (d7 > 0.0d && j7 > 0) {
            if (j6 > ((long) ((((1000000.0d * d7) / 8.0d) * Math.max(1L, SystemClock.elapsedRealtime() - j7)) / 1000.0d))) {
                try {
                    Thread.sleep(AbstractC2168e.m3531r((long) ((((j6 - r0) * 8.0d) / d7) / 1000.0d), 1L, 120L));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m1903a(C1100ms c1100ms, String str) {
        c1100ms.getClass();
        if (AbstractC0444k.m937a0(str)) {
            return;
        }
        List m3067O = AbstractC1806n.m3067O(c1100ms.f6025J0, str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m3067O) {
            if (!AbstractC0444k.m937a0((String) obj)) {
                arrayList.add(obj);
            }
        }
        c1100ms.f6025J0 = AbstractC1805m.m3051o0(AbstractC1805m.m3042f0(arrayList), "；", null, null, null, 62);
    }

    /* renamed from: a1 */
    public static double m1904a1(long j6, long j7) {
        return (((j6 * 8.0d) * 1000.0d) / j7) / 1000000.0d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:45|(1:46)|48|49|50|53|54|(4:226|227|228|(7:230|68|69|70|71|72|(13:74|75|76|(0)(0)|79|(0)|86|(0)|118|119|16|17|(1:271)(4:19|21|23|(0)(0)))))|56|(1:58)(1:225)|60|61|63|64|(1:66)(9:129|130|131|132|(3:133|134|(2:140|(9:144|(5:190|191|192|(1:194)(1:196)|195)(1:146)|147|148|149|(3:151|152|153)(1:186)|154|(2:156|157)(2:159|(2:161|162)(1:163))|158)(2:208|200))(3:211|210|209))|201|202|203|204)|67|68|69|70|71|72|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0556, code lost:
    
        if (p032d6.AbstractC0525d0.m1131i(r3, r13) == r6) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02f8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x034e, code lost:
    
        r4 = r0.getClass().getSimpleName();
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x035a, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x035c, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x035e, code lost:
    
        r1.m1996o1(r12, p024c6.AbstractC0444k.m955s0("失败：" + r4 + " " + r0, 80));
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0380, code lost:
    
        if (r9 != null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0382, code lost:
    
        r1.f6114v.remove(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0387, code lost:
    
        r36 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0336, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0337, code lost:
    
        r46 = r4;
        r26 = r5;
        r22 = r16;
        r27 = r22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0570 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0570 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x0556 -> B:14:0x005b). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1905b(C1100ms c1100ms, C1248rl c1248rl, List list, int i7, AbstractC2583c abstractC2583c) {
        C1502zr c1502zr;
        EnumC2465a enumC2465a;
        int i8;
        long j6;
        String str;
        C1502zr c1502zr2;
        int i9;
        List list2;
        int i10;
        C1248rl c1248rl2;
        C1100ms c1100ms2;
        C1694m c1694m;
        C1100ms c1100ms3;
        C1248rl c1248rl3;
        List list3;
        Object obj;
        String str2;
        int i11;
        int i12;
        C1192pr c1192pr;
        C1100ms c1100ms4;
        C1248rl c1248rl4;
        String str3;
        int i13;
        boolean z7;
        int i14;
        InterfaceC2318h interfaceC2318h;
        int i15;
        long j7;
        C1100ms c1100ms5;
        C1248rl c1248rl5;
        String str4;
        int i16;
        InterfaceC2318h interfaceC2318h2;
        C3006i c3006i;
        int i17;
        long j8;
        long j9;
        C1192pr m1930v;
        long nanoTime;
        C2598d0 m4681e;
        C2598d0 c2598d0;
        Throwable th;
        long j10;
        Throwable th2;
        double d7;
        int read;
        C1694m c1694m2;
        long j11;
        c1100ms.getClass();
        C1694m c1694m3 = C1694m.f10482a;
        if (abstractC2583c instanceof C1502zr) {
            c1502zr = (C1502zr) abstractC2583c;
            int i18 = c1502zr.f9969p;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                c1502zr.f9969p = i18 - Integer.MIN_VALUE;
                Object obj2 = c1502zr.f9967n;
                enumC2465a = EnumC2465a.f13750e;
                i8 = c1502zr.f9969p;
                int i19 = 2;
                int i20 = 1;
                if (i8 == 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 != 4) {
                                    if (i8 == 5) {
                                        i14 = c1502zr.f9966m;
                                        int i21 = c1502zr.f9965l;
                                        String str5 = c1502zr.f9964k;
                                        list3 = c1502zr.f9963j;
                                        C1248rl c1248rl6 = c1502zr.f9962i;
                                        j6 = 0;
                                        C1100ms c1100ms6 = c1502zr.f9961h;
                                        AbstractC1793a0.m2972L(obj2);
                                        C1502zr c1502zr3 = c1502zr;
                                        i10 = i21;
                                        c1100ms2 = c1100ms6;
                                        c1502zr2 = c1502zr3;
                                        str = str5;
                                        c1248rl2 = c1248rl6;
                                        c1694m = c1694m3;
                                        i15 = 1;
                                        list2 = list3;
                                        i9 = i14;
                                        c1694m3 = c1694m;
                                        i20 = i15;
                                        i19 = 2;
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    j6 = 0;
                                    i12 = c1502zr.f9966m;
                                    i11 = c1502zr.f9965l;
                                    str2 = c1502zr.f9964k;
                                    list3 = c1502zr.f9963j;
                                    c1248rl3 = c1502zr.f9962i;
                                    c1100ms3 = c1502zr.f9961h;
                                    AbstractC1793a0.m2972L(obj2);
                                    c1694m = c1694m3;
                                    obj = obj2;
                                    c1192pr = (C1192pr) obj;
                                    C1502zr c1502zr4 = c1502zr;
                                    i10 = i11;
                                    c1100ms2 = c1100ms3;
                                    c1502zr2 = c1502zr4;
                                    C1248rl c1248rl7 = c1248rl3;
                                    str = str2;
                                    c1248rl2 = c1248rl7;
                                    C0694a c0694a = c1100ms2.f6088k;
                                    double d8 = c1192pr.f6951d;
                                    double d9 = c1192pr.f6952e;
                                    int i22 = c1192pr.f6953f;
                                    double d10 = c1192pr.f6950c;
                                    double d11 = c1192pr.f6949b;
                                    if (c1248rl2.f7392c == null) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    c0694a.m1486b(d8, d9, i22, d10, d11, z7, !c1192pr.f6948a);
                                    if (c1100ms2.f6080h0 && c1100ms2.f6073f.get() && !c1100ms2.f6079h.get()) {
                                        c1100ms2.f6094m.m1500b(c1192pr.f6948a);
                                    }
                                    c1100ms2.m1996o1(str, c1100ms2.m2008y0(str, c1192pr.f6948a));
                                    i14 = i12 + 1;
                                    interfaceC2318h = c1502zr2.f13999f;
                                    AbstractC3367j.m5097b(interfaceC2318h);
                                    if (AbstractC0525d0.m1140r(interfaceC2318h) && c1100ms2.f6073f.get()) {
                                        if (!c1100ms2.f6120y.contains(c1248rl2.f7390a)) {
                                            long j12 = 120;
                                            if (c1100ms2.f6080h0) {
                                                String str6 = c1248rl2.f7390a;
                                                if (!c1192pr.f6948a) {
                                                    j12 = (((i14 * 7919) + ((i10 * 65537) + (str6.hashCode() * 37))) & Long.MAX_VALUE) % 40;
                                                }
                                            } else if (c1100ms2.f6077g0) {
                                                j7 = j6;
                                                i15 = 1;
                                                if (j7 > j6) {
                                                }
                                            } else if (c1100ms2.f6083i0) {
                                                j12 = m1893L0(c1248rl2.f7390a, i10, i14, c1192pr.f6948a);
                                            } else {
                                                String str7 = c1248rl2.f7390a;
                                                boolean z8 = c1192pr.f6948a;
                                                long hashCode = (((i14 * 7919) + ((i10 * 65537) + (str7.hashCode() * 37))) & Long.MAX_VALUE) % 60;
                                                int i23 = c1100ms2.f6115v0;
                                                i15 = 1;
                                                if (i23 < 1) {
                                                    i23 = 1;
                                                }
                                                long j13 = (i10 % i23) * 60;
                                                if (!z8) {
                                                    j12 = j6;
                                                }
                                                j7 = j12 + j13 + hashCode;
                                                if (j7 > j6) {
                                                    c1502zr2.f9961h = c1100ms2;
                                                    c1502zr2.f9962i = c1248rl2;
                                                    c1502zr2.f9963j = list3;
                                                    c1502zr2.f9964k = str;
                                                    c1502zr2.f9965l = i10;
                                                    c1502zr2.f9966m = i14;
                                                    c1502zr2.f9969p = 5;
                                                } else {
                                                    c1694m3 = c1694m;
                                                    list2 = list3;
                                                    i20 = i15;
                                                    i19 = 2;
                                                    i9 = i14;
                                                }
                                            }
                                            j7 = j12;
                                            i15 = 1;
                                            if (j7 > j6) {
                                            }
                                        }
                                    }
                                    c1694m3 = c1694m;
                                    list2 = list3;
                                    i20 = 1;
                                    i19 = 2;
                                    i9 = i14;
                                }
                            } else {
                                j6 = 0;
                                i12 = c1502zr.f9966m;
                                i13 = c1502zr.f9965l;
                                str3 = c1502zr.f9964k;
                                list3 = c1502zr.f9963j;
                                c1248rl4 = c1502zr.f9962i;
                                c1100ms4 = c1502zr.f9961h;
                                AbstractC1793a0.m2972L(obj2);
                                c1694m = c1694m3;
                                C1502zr c1502zr5 = c1502zr;
                                i10 = i13;
                                c1100ms2 = c1100ms4;
                                c1502zr2 = c1502zr5;
                                C1248rl c1248rl8 = c1248rl4;
                                str = str3;
                                c1248rl2 = c1248rl8;
                                c1192pr = (C1192pr) obj2;
                                C0694a c0694a2 = c1100ms2.f6088k;
                                double d82 = c1192pr.f6951d;
                                double d92 = c1192pr.f6952e;
                                int i222 = c1192pr.f6953f;
                                double d102 = c1192pr.f6950c;
                                double d112 = c1192pr.f6949b;
                                if (c1248rl2.f7392c == null) {
                                }
                                c0694a2.m1486b(d82, d92, i222, d102, d112, z7, !c1192pr.f6948a);
                                if (c1100ms2.f6080h0) {
                                    c1100ms2.f6094m.m1500b(c1192pr.f6948a);
                                }
                                c1100ms2.m1996o1(str, c1100ms2.m2008y0(str, c1192pr.f6948a));
                                i14 = i12 + 1;
                                interfaceC2318h = c1502zr2.f13999f;
                                AbstractC3367j.m5097b(interfaceC2318h);
                                if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                                    if (!c1100ms2.f6120y.contains(c1248rl2.f7390a)) {
                                    }
                                }
                                c1694m3 = c1694m;
                                list2 = list3;
                                i20 = 1;
                                i19 = 2;
                                i9 = i14;
                            }
                        } else {
                            j6 = 0;
                            i12 = c1502zr.f9966m;
                            i16 = c1502zr.f9965l;
                            str4 = c1502zr.f9964k;
                            list3 = c1502zr.f9963j;
                            c1248rl5 = c1502zr.f9962i;
                            c1100ms5 = c1502zr.f9961h;
                            AbstractC1793a0.m2972L(obj2);
                            c1694m = c1694m3;
                            C1502zr c1502zr6 = c1502zr;
                            i10 = i16;
                            c1100ms2 = c1100ms5;
                            c1502zr2 = c1502zr6;
                            C1248rl c1248rl9 = c1248rl5;
                            str = str4;
                            c1248rl2 = c1248rl9;
                            c1192pr = (C1192pr) obj2;
                            C0694a c0694a22 = c1100ms2.f6088k;
                            double d822 = c1192pr.f6951d;
                            double d922 = c1192pr.f6952e;
                            int i2222 = c1192pr.f6953f;
                            double d1022 = c1192pr.f6950c;
                            double d1122 = c1192pr.f6949b;
                            if (c1248rl2.f7392c == null) {
                            }
                            c0694a22.m1486b(d822, d922, i2222, d1022, d1122, z7, !c1192pr.f6948a);
                            if (c1100ms2.f6080h0) {
                            }
                            c1100ms2.m1996o1(str, c1100ms2.m2008y0(str, c1192pr.f6948a));
                            i14 = i12 + 1;
                            interfaceC2318h = c1502zr2.f13999f;
                            AbstractC3367j.m5097b(interfaceC2318h);
                            if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                            }
                            c1694m3 = c1694m;
                            list2 = list3;
                            i20 = 1;
                            i19 = 2;
                            i9 = i14;
                        }
                    } else {
                        j6 = 0;
                        int i24 = c1502zr.f9966m;
                        int i25 = c1502zr.f9965l;
                        String str8 = c1502zr.f9964k;
                        List list4 = c1502zr.f9963j;
                        C1248rl c1248rl10 = c1502zr.f9962i;
                        C1100ms c1100ms7 = c1502zr.f9961h;
                        AbstractC1793a0.m2972L(obj2);
                        C1502zr c1502zr7 = c1502zr;
                        i10 = i25;
                        c1100ms2 = c1100ms7;
                        c1502zr2 = c1502zr7;
                        str = str8;
                        c1248rl2 = c1248rl10;
                        list2 = list4;
                        i9 = i24;
                    }
                } else {
                    j6 = 0;
                    AbstractC1793a0.m2972L(obj2);
                    if (list.isEmpty()) {
                        return c1694m3;
                    }
                    String str9 = "d|" + c1248rl.f7390a + "|" + i7;
                    c1100ms.m1990l1(i7, str9, "下载", c1248rl.f7391b);
                    str = str9;
                    c1502zr2 = c1502zr;
                    i9 = 0;
                    list2 = list;
                    i10 = i7;
                    c1248rl2 = c1248rl;
                    c1100ms2 = c1100ms;
                }
                do {
                    interfaceC2318h2 = c1502zr2.f13999f;
                    AbstractC3367j.m5097b(interfaceC2318h2);
                    if (!AbstractC0525d0.m1140r(interfaceC2318h2) && c1100ms2.f6073f.get() && !c1100ms2.f6079h.get()) {
                        if (!c1100ms2.f6120y.contains(c1248rl2.f7390a)) {
                            if (c1100ms2.f6080h0) {
                                int size = list2.size();
                                int m1897S = m1897S(c1248rl2);
                                if (size < i20) {
                                    size = i20;
                                }
                                int i26 = m1897S * size;
                                if (i26 < i20) {
                                    i26 = i20;
                                }
                                if (i10 >= c1100ms2.f6094m.m1499a(i26)) {
                                    c1100ms2.m1996o1(str, "并发调度暂歇");
                                    c1502zr2.f9961h = c1100ms2;
                                    c1502zr2.f9962i = c1248rl2;
                                    c1502zr2.f9963j = list2;
                                    c1502zr2.f9964k = str;
                                    c1502zr2.f9965l = i10;
                                    c1502zr2.f9966m = i9;
                                    c1502zr2.f9969p = i20;
                                }
                            }
                            int i27 = i10 + i9;
                            String str10 = (String) list2.get(i27 % list2.size());
                            int size2 = i27 % list2.size();
                            m1919k1(c1100ms2, str, str10, i9);
                            if (c1100ms2.f6077g0) {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    c1502zr2.f9961h = c1100ms2;
                                                    c1502zr2.f9962i = c1248rl2;
                                                    c1502zr2.f9963j = list2;
                                                    c1502zr2.f9964k = str;
                                                    c1502zr2.f9965l = i10;
                                                    c1502zr2.f9966m = i9;
                                                    c1502zr2.f9969p = i19;
                                                    double d12 = 0.0d;
                                                    try {
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        c1694m = c1694m3;
                                                        i17 = i10;
                                                        j8 = j6;
                                                        j9 = j8;
                                                        c3006i = null;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        c3006i = null;
                                                    }
                                                    if (!m4681e.m4142c()) {
                                                        try {
                                                            if (m4681e.f14059h != 206) {
                                                                c1694m = c1694m3;
                                                                i17 = i10;
                                                                c2598d0 = m4681e;
                                                                j9 = j6;
                                                                c2598d0.close();
                                                                c1100ms2.f6114v.remove(c3006i);
                                                                boolean z9 = i20;
                                                                m1930v = m1930v(d12, j8, j9, z9);
                                                                if (m1930v != enumC2465a) {
                                                                    List list5 = list2;
                                                                    obj2 = m1930v;
                                                                    i12 = i9;
                                                                    list3 = list5;
                                                                    String str11 = str;
                                                                    c1248rl5 = c1248rl2;
                                                                    str4 = str11;
                                                                    c1502zr = c1502zr2;
                                                                    c1100ms5 = c1100ms2;
                                                                    i16 = i17;
                                                                    C1502zr c1502zr62 = c1502zr;
                                                                    i10 = i16;
                                                                    c1100ms2 = c1100ms5;
                                                                    c1502zr2 = c1502zr62;
                                                                    C1248rl c1248rl92 = c1248rl5;
                                                                    str = str4;
                                                                    c1248rl2 = c1248rl92;
                                                                    c1192pr = (C1192pr) obj2;
                                                                    C0694a c0694a222 = c1100ms2.f6088k;
                                                                    double d8222 = c1192pr.f6951d;
                                                                    double d9222 = c1192pr.f6952e;
                                                                    int i22222 = c1192pr.f6953f;
                                                                    double d10222 = c1192pr.f6950c;
                                                                    double d11222 = c1192pr.f6949b;
                                                                    if (c1248rl2.f7392c == null) {
                                                                    }
                                                                    c0694a222.m1486b(d8222, d9222, i22222, d10222, d11222, z7, !c1192pr.f6948a);
                                                                    if (c1100ms2.f6080h0) {
                                                                    }
                                                                    c1100ms2.m1996o1(str, c1100ms2.m2008y0(str, c1192pr.f6948a));
                                                                    i14 = i12 + 1;
                                                                    interfaceC2318h = c1502zr2.f13999f;
                                                                    AbstractC3367j.m5097b(interfaceC2318h);
                                                                    if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                                                                    }
                                                                    c1694m3 = c1694m;
                                                                    list2 = list3;
                                                                    i20 = 1;
                                                                    i19 = 2;
                                                                    i9 = i14;
                                                                    interfaceC2318h2 = c1502zr2.f13999f;
                                                                    AbstractC3367j.m5097b(interfaceC2318h2);
                                                                    if (!AbstractC0525d0.m1140r(interfaceC2318h2)) {
                                                                        if (!c1100ms2.f6120y.contains(c1248rl2.f7390a)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            c1694m = c1694m3;
                                                            i17 = i10;
                                                            c2598d0 = m4681e;
                                                            j9 = j6;
                                                            th = th;
                                                            try {
                                                                throw th;
                                                            } catch (Throwable th5) {
                                                                AbstractC2168e.m3526m(c2598d0, th);
                                                                throw th5;
                                                            }
                                                        }
                                                    }
                                                    c1100ms2.m1935B0(str10, m4681e);
                                                    AbstractC2602f0 abstractC2602f0 = m4681e.f14062k;
                                                    if (abstractC2602f0 != null) {
                                                        j10 = abstractC2602f0.mo4144c();
                                                    } else {
                                                        j10 = -1;
                                                    }
                                                    c1100ms2.m1994n1(c1100ms2.m1957O(j10, str10), str);
                                                    AbstractC2602f0 abstractC2602f02 = c2598d0.f14062k;
                                                    if (abstractC2602f02 == null) {
                                                        c1694m = c1694m3;
                                                        i17 = i10;
                                                        j9 = j6;
                                                    } else {
                                                        try {
                                                            InputStream m4147b = abstractC2602f02.m4147b();
                                                            try {
                                                                byte[] bArr = new byte[m1917i0(c1100ms2.f6017F0.f2355e)];
                                                                j9 = j6;
                                                                d7 = 0.0d;
                                                                while (true) {
                                                                    try {
                                                                        InterfaceC2318h interfaceC2318h3 = c1502zr2.f13999f;
                                                                        AbstractC3367j.m5097b(interfaceC2318h3);
                                                                        if (!AbstractC0525d0.m1140r(interfaceC2318h3) || !c1100ms2.f6073f.get() || c1100ms2.f6079h.get()) {
                                                                            break;
                                                                        }
                                                                        if (c1100ms2.f6120y.contains(c1248rl2.f7390a) || (read = m4147b.read(bArr)) <= 0) {
                                                                            break;
                                                                        }
                                                                        if (j9 == j6) {
                                                                            try {
                                                                                long nanoTime2 = System.nanoTime() - nanoTime;
                                                                                if (nanoTime2 < j6) {
                                                                                    c1694m2 = c1694m3;
                                                                                    i17 = i10;
                                                                                    j11 = j6;
                                                                                } else {
                                                                                    c1694m2 = c1694m3;
                                                                                    i17 = i10;
                                                                                    j11 = nanoTime2;
                                                                                }
                                                                                d7 = j11 / 1000000.0d;
                                                                            } catch (Throwable th6) {
                                                                                C1694m c1694m4 = c1694m3;
                                                                                i17 = i10;
                                                                                th2 = th6;
                                                                                c1694m = c1694m4;
                                                                                d12 = d7;
                                                                                try {
                                                                                    throw th2;
                                                                                } catch (Throwable th7) {
                                                                                    try {
                                                                                        AbstractC2168e.m3526m(m4147b, th2);
                                                                                        throw th7;
                                                                                    } catch (Throwable th8) {
                                                                                        th = th8;
                                                                                        th = th;
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            c1694m2 = c1694m3;
                                                                            i17 = i10;
                                                                        }
                                                                        long j14 = read;
                                                                        j9 += j14;
                                                                        try {
                                                                            c1100ms2.f6082i.addAndGet(j14);
                                                                            AtomicLong atomicLong = (AtomicLong) c1100ms2.f6100o.get(c1248rl2.f7390a);
                                                                            if (atomicLong != null) {
                                                                                c1694m = c1694m2;
                                                                                try {
                                                                                    new Long(atomicLong.addAndGet(j14));
                                                                                } catch (Throwable th9) {
                                                                                    th = th9;
                                                                                    th2 = th;
                                                                                    d12 = d7;
                                                                                    throw th2;
                                                                                }
                                                                            } else {
                                                                                c1694m = c1694m2;
                                                                            }
                                                                            c1100ms2.m1983i1(j14, str);
                                                                            C1096mo c1096mo = c1100ms2.f6089k0;
                                                                            if (c1096mo.f5974c > 0.0d) {
                                                                                m1902Z0(c1100ms2.f6082i.get() + c1100ms2.f6085j.get(), Math.min(c1100ms2.f6056Z, c1100ms2.f6059a0), c1100ms2.f6089k0.f5974c);
                                                                            } else if (c1096mo.f5972a > 0.0d) {
                                                                                m1902Z0(c1100ms2.f6082i.get(), c1100ms2.f6056Z, c1100ms2.f6089k0.f5972a);
                                                                            }
                                                                            c1694m3 = c1694m;
                                                                            i10 = i17;
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                            c1694m = c1694m2;
                                                                        }
                                                                    } catch (Throwable th11) {
                                                                        th = th11;
                                                                        c1694m = c1694m3;
                                                                        i17 = i10;
                                                                    }
                                                                }
                                                                m4147b.close();
                                                                d12 = d7;
                                                            } catch (Throwable th12) {
                                                                c1694m = c1694m3;
                                                                i17 = i10;
                                                                th2 = th12;
                                                                j9 = j6;
                                                            }
                                                        } catch (Throwable th13) {
                                                            th = th13;
                                                            d12 = d7;
                                                            throw th;
                                                        }
                                                        c1694m = c1694m3;
                                                        i17 = i10;
                                                    }
                                                    i20 = 0;
                                                    c2598d0.close();
                                                    c1100ms2.f6114v.remove(c3006i);
                                                    boolean z92 = i20;
                                                    m1930v = m1930v(d12, j8, j9, z92);
                                                    if (m1930v != enumC2465a) {
                                                    }
                                                } catch (Throwable th14) {
                                                    c1694m = c1694m3;
                                                    i17 = i10;
                                                    c2598d0 = m4681e;
                                                    th = th14;
                                                    j8 = j6;
                                                    j9 = j8;
                                                }
                                                c1100ms2.f6114v.add(c3006i);
                                                nanoTime = System.nanoTime();
                                                m4681e = c3006i.m4681e();
                                            } catch (Throwable th15) {
                                                th = th15;
                                                c1694m = c1694m3;
                                                i17 = i10;
                                                th = th;
                                                j9 = j6;
                                                throw th;
                                            }
                                            c2598d0 = m4681e;
                                        } catch (Throwable th16) {
                                            th = th16;
                                            if (c3006i != null) {
                                                c1100ms2.f6114v.remove(c3006i);
                                            }
                                            throw th;
                                        }
                                        c3006i = c1100ms2.m1975d0(c1248rl2, c1100ms2.m1946H("download", c1248rl2, size2, str10)).m4187b(c1100ms2.m2005x(str10, str));
                                    } catch (Throwable th17) {
                                        th = th17;
                                        c2598d0 = m4681e;
                                    }
                                } catch (Throwable th18) {
                                    th = th18;
                                    c1694m = c1694m3;
                                    i17 = i10;
                                    c2598d0 = m4681e;
                                }
                                j8 = System.nanoTime();
                            } else {
                                c1694m = c1694m3;
                                int i28 = i10;
                                int ordinal = c1100ms2.m1945G0(c1248rl2, str10).ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1502zr2.f9961h = c1100ms2;
                                        c1502zr2.f9962i = c1248rl2;
                                        c1502zr2.f9963j = list2;
                                        c1502zr2.f9964k = str;
                                        c1502zr2.f9965l = i28;
                                        c1502zr2.f9966m = i9;
                                        c1502zr2.f9969p = 3;
                                        C1100ms c1100ms8 = c1100ms2;
                                        C1248rl c1248rl11 = c1248rl2;
                                        List list6 = list2;
                                        String str12 = str;
                                        obj2 = c1100ms8.m1964U(c1248rl11, list6, str10, i28, i9, str12, c1502zr2);
                                        c1248rl4 = c1248rl11;
                                        str3 = str12;
                                        if (obj2 != enumC2465a) {
                                            i12 = i9;
                                            list3 = list6;
                                            i13 = i28;
                                            c1502zr = c1502zr2;
                                            c1100ms4 = c1100ms8;
                                            C1502zr c1502zr52 = c1502zr;
                                            i10 = i13;
                                            c1100ms2 = c1100ms4;
                                            c1502zr2 = c1502zr52;
                                            C1248rl c1248rl82 = c1248rl4;
                                            str = str3;
                                            c1248rl2 = c1248rl82;
                                            c1192pr = (C1192pr) obj2;
                                            C0694a c0694a2222 = c1100ms2.f6088k;
                                            double d82222 = c1192pr.f6951d;
                                            double d92222 = c1192pr.f6952e;
                                            int i222222 = c1192pr.f6953f;
                                            double d102222 = c1192pr.f6950c;
                                            double d112222 = c1192pr.f6949b;
                                            if (c1248rl2.f7392c == null) {
                                            }
                                            c0694a2222.m1486b(d82222, d92222, i222222, d102222, d112222, z7, !c1192pr.f6948a);
                                            if (c1100ms2.f6080h0) {
                                            }
                                            c1100ms2.m1996o1(str, c1100ms2.m2008y0(str, c1192pr.f6948a));
                                            i14 = i12 + 1;
                                            interfaceC2318h = c1502zr2.f13999f;
                                            AbstractC3367j.m5097b(interfaceC2318h);
                                            if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                                            }
                                            c1694m3 = c1694m;
                                            list2 = list3;
                                            i20 = 1;
                                            i19 = 2;
                                            i9 = i14;
                                            interfaceC2318h2 = c1502zr2.f13999f;
                                            AbstractC3367j.m5097b(interfaceC2318h2);
                                            if (!AbstractC0525d0.m1140r(interfaceC2318h2)) {
                                            }
                                        }
                                    } else {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    String str13 = str;
                                    C1248rl c1248rl12 = c1248rl2;
                                    str2 = str13;
                                    C1100ms c1100ms9 = c1100ms2;
                                    List list7 = list2;
                                    c1502zr2.f9961h = c1100ms9;
                                    c1502zr2.f9962i = c1248rl12;
                                    c1502zr2.f9963j = list7;
                                    c1502zr2.f9964k = str2;
                                    c1502zr2.f9965l = i28;
                                    c1502zr2.f9966m = i9;
                                    c1502zr2.f9969p = 4;
                                    int i29 = i9;
                                    Object m1999q0 = c1100ms9.m1999q0(c1248rl12, list7, str10, size2, i28, i29, str2, c1502zr2);
                                    if (m1999q0 != enumC2465a) {
                                        i11 = i28;
                                        c1502zr = c1502zr2;
                                        c1248rl3 = c1248rl12;
                                        list3 = list7;
                                        c1100ms3 = c1100ms9;
                                        obj = m1999q0;
                                        i12 = i29;
                                        c1192pr = (C1192pr) obj;
                                        C1502zr c1502zr42 = c1502zr;
                                        i10 = i11;
                                        c1100ms2 = c1100ms3;
                                        c1502zr2 = c1502zr42;
                                        C1248rl c1248rl72 = c1248rl3;
                                        str = str2;
                                        c1248rl2 = c1248rl72;
                                        C0694a c0694a22222 = c1100ms2.f6088k;
                                        double d822222 = c1192pr.f6951d;
                                        double d922222 = c1192pr.f6952e;
                                        int i2222222 = c1192pr.f6953f;
                                        double d1022222 = c1192pr.f6950c;
                                        double d1122222 = c1192pr.f6949b;
                                        if (c1248rl2.f7392c == null) {
                                        }
                                        c0694a22222.m1486b(d822222, d922222, i2222222, d1022222, d1122222, z7, !c1192pr.f6948a);
                                        if (c1100ms2.f6080h0) {
                                        }
                                        c1100ms2.m1996o1(str, c1100ms2.m2008y0(str, c1192pr.f6948a));
                                        i14 = i12 + 1;
                                        interfaceC2318h = c1502zr2.f13999f;
                                        AbstractC3367j.m5097b(interfaceC2318h);
                                        if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                                        }
                                        c1694m3 = c1694m;
                                        list2 = list3;
                                        i20 = 1;
                                        i19 = 2;
                                        i9 = i14;
                                        interfaceC2318h2 = c1502zr2.f13999f;
                                        AbstractC3367j.m5097b(interfaceC2318h2);
                                        if (!AbstractC0525d0.m1140r(interfaceC2318h2)) {
                                        }
                                    }
                                }
                            }
                            return enumC2465a;
                        }
                    }
                    C1694m c1694m5 = c1694m3;
                    c1100ms2.m1996o1(str, "已停止");
                    return c1694m5;
                } while (AbstractC0525d0.m1131i(300L, c1502zr2) != enumC2465a);
                return enumC2465a;
            }
        }
        c1502zr = new C1502zr(c1100ms, abstractC2583c);
        Object obj22 = c1502zr.f9967n;
        enumC2465a = EnumC2465a.f13750e;
        i8 = c1502zr.f9969p;
        int i192 = 2;
        int i202 = 1;
        if (i8 == 0) {
        }
        do {
            interfaceC2318h2 = c1502zr2.f13999f;
            AbstractC3367j.m5097b(interfaceC2318h2);
            if (!AbstractC0525d0.m1140r(interfaceC2318h2)) {
            }
            C1694m c1694m52 = c1694m3;
            c1100ms2.m1996o1(str, "已停止");
            return c1694m52;
        } while (AbstractC0525d0.m1131i(300L, c1502zr2) != enumC2465a);
        return enumC2465a;
    }

    /* renamed from: b1 */
    public static int m1906b1(C1248rl c1248rl, Map map, List list) {
        List list2 = (List) map.get(c1248rl.f7390a);
        if (list2 != null) {
            list = list2;
        }
        return list.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r7.m1949J(r8, r9, r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (r7.m1951K(r8, r9, r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1907c(C1100ms c1100ms, C1248rl c1248rl, String str, AbstractC2583c abstractC2583c) {
        C0787cs c0787cs;
        int i7;
        String str2;
        c1100ms.getClass();
        if (abstractC2583c instanceof C0787cs) {
            c0787cs = (C0787cs) abstractC2583c;
            int i8 = c0787cs.f3208l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0787cs.f3208l = i8 - Integer.MIN_VALUE;
                Object obj = c0787cs.f3206j;
                i7 = c0787cs.f3208l;
                C1694m c1694m = C1694m.f10482a;
                if (i7 == 0) {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = c0787cs.f3205i;
                    C1100ms c1100ms2 = c0787cs.f3204h;
                    AbstractC1793a0.m2972L(obj);
                    str2 = str3;
                    c1100ms = c1100ms2;
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (c1100ms.f6073f.get()) {
                        InterfaceC2318h interfaceC2318h = c0787cs.f13999f;
                        AbstractC3367j.m5097b(interfaceC2318h);
                        if (AbstractC0525d0.m1140r(interfaceC2318h) && !c1100ms.f6079h.get()) {
                            str2 = "d|" + c1248rl.f7390a + "|ov|" + c1100ms.f6041R0.incrementAndGet();
                            c1100ms.m1990l1(-1, str2, "下载", c1248rl.f7391b);
                            m1919k1(c1100ms, str2, str, 0);
                            c1100ms.m1996o1(str2, "重叠连接");
                            int ordinal = c1100ms.m1945G0(c1248rl, str).ordinal();
                            EnumC2465a enumC2465a = EnumC2465a.f13750e;
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    c0787cs.f3204h = c1100ms;
                                    c0787cs.f3205i = str2;
                                    c0787cs.f3208l = 1;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                c0787cs.f3204h = c1100ms;
                                c0787cs.f3205i = str2;
                                c0787cs.f3208l = 2;
                            }
                        }
                    }
                    return c1694m;
                }
                c1100ms.m1996o1(str2, "已结束");
                return c1694m;
            }
        }
        c0787cs = new C0787cs(c1100ms, abstractC2583c);
        Object obj2 = c0787cs.f3206j;
        i7 = c0787cs.f3208l;
        C1694m c1694m2 = C1694m.f10482a;
        if (i7 == 0) {
        }
        c1100ms.m1996o1(str2, "已结束");
        return c1694m2;
    }

    /* renamed from: c0 */
    public static boolean m1908c0(String str, String str2) {
        if (!AbstractC0451r.m971M(str, "d|" + str2 + "|", false)) {
            if (!AbstractC0451r.m971M(str, "u|" + str2 + "|", false)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: d */
    public static final long m1909d(C1100ms c1100ms, String str, int i7) {
        c1100ms.getClass();
        return ((Long.MAX_VALUE & ((i7 * 31337) + (str.hashCode() * 43))) % 900) + 350;
    }

    /* renamed from: d1 */
    public static String m1910d1(String str) {
        Object m2985m;
        String obj;
        try {
            m2985m = new URL(AbstractC0444k.m943g0(str, "fetch+")).getHost();
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (m2985m instanceof C1689h) {
            m2985m = null;
        }
        String str2 = (String) m2985m;
        if (str2 == null || (obj = AbstractC0444k.m956t0(str2).toString()) == null) {
            return null;
        }
        String m945i0 = AbstractC0444k.m945i0(obj, "[", "]");
        if (AbstractC0444k.m937a0(m945i0)) {
            return null;
        }
        return m945i0;
    }

    /* renamed from: e */
    public static final Object m1911e(C1100ms c1100ms, C0576u0 c0576u0, List list, List list2, Map map, int i7, C0920h2 c0920h2) {
        c1100ms.getClass();
        Object m1130h = AbstractC0525d0.m1130h(new C0846eo(list, map, list2, c1100ms, i7, c0576u0, null), c0920h2);
        if (m1130h == EnumC2465a.f13750e) {
            return m1130h;
        }
        return C1694m.f10482a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e5, code lost:
    
        if (r10 != null) goto L37;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1687f m1912f(C1100ms c1100ms, List list, List list2, Map map) {
        Map map2;
        int i7;
        C1248rl c1248rl;
        Map map3;
        Object obj;
        String str;
        c1100ms.getClass();
        C1248rl c1248rl2 = (C1248rl) AbstractC1805m.m3047k0(list);
        if (c1248rl2 == null) {
            c1248rl2 = new C1248rl("default|默认接口", "默认接口", (Network) null, (EnumC1070lt) null, (String) null, 60);
        }
        List<String> m3042f0 = AbstractC1805m.m3042f0(AbstractC1805m.m3058v0(list2, AbstractC1807o.m3074V(map.values())));
        if (m3042f0.isEmpty()) {
            return new C1687f(list2, map);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = m3042f0.iterator();
        int i8 = 0;
        while (true) {
            Object obj2 = null;
            if (it.hasNext()) {
                Object next = it.next();
                int i9 = i8 + 1;
                if (i8 >= 0) {
                    String str2 = (String) next;
                    C1701c0 c1701c0 = c1100ms.f6084i1;
                    c1701c0.m2752j(null, C0976ir.m1609a((C0976ir) c1701c0.getValue(), false, false, 0.0d, 0.0d, 0.0d, 0.0d, null, null, AbstractC0094y0.m183j(i9, m3042f0.size(), "正在解析跳转链接 (", "/", ")..."), null, null, null, 0, 2147352575));
                    if (!map.isEmpty()) {
                        Iterator it2 = map.entrySet().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (((List) ((Map.Entry) obj).getValue()).contains(str2)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        Map.Entry entry = (Map.Entry) obj;
                        if (entry != null && (str = (String) entry.getKey()) != null) {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (AbstractC3367j.m5096a(((C1248rl) next2).f7390a, str)) {
                                    obj2 = next2;
                                    break;
                                }
                            }
                            c1248rl = (C1248rl) obj2;
                        }
                    }
                    c1248rl = c1248rl2;
                    String m1523c = AbstractC0845en.m1523c(c1248rl, str2);
                    if (AbstractC3367j.m5096a(m1523c, str2)) {
                        m1523c = str2;
                    } else {
                        String m943g0 = AbstractC0444k.m943g0(str2, "fetch+");
                        String m943g02 = AbstractC0444k.m943g0(m1523c, "fetch+");
                        EnumC0736b9 enumC0736b9 = (EnumC0736b9) c1100ms.f6006A.get(m943g0);
                        if (enumC0736b9 != null) {
                            c1100ms.f6006A.put(m943g02, enumC0736b9);
                        }
                        EnumC0736b9 enumC0736b92 = (EnumC0736b9) c1100ms.f6008B.get(m943g0);
                        if (enumC0736b92 != null) {
                            c1100ms.f6008B.put(m943g02, enumC0736b92);
                        }
                        Long l7 = (Long) c1100ms.f6122z.get(m943g0);
                        if (l7 != null) {
                            c1100ms.f6122z.put(m943g02, Long.valueOf(l7.longValue()));
                        }
                        C1006jr c1006jr = (C1006jr) c1100ms.f6105q0.get(str2);
                        if (c1006jr != null) {
                            Map map4 = c1100ms.f6105q0;
                            C1006jr m1617a = C1006jr.m1617a(c1006jr, m1523c);
                            AbstractC3367j.m5100e(map4, "<this>");
                            if (map4.isEmpty()) {
                                map3 = Collections.singletonMap(m1523c, m1617a);
                                AbstractC3367j.m5099d(map3, "singletonMap(...)");
                            } else {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map4);
                                linkedHashMap2.put(m1523c, m1617a);
                                map3 = linkedHashMap2;
                            }
                            c1100ms.f6105q0 = map3;
                        }
                        Log.d("SpeedTestEngine", "302跳转增强: " + m943g0 + " -> " + m943g02);
                    }
                    linkedHashMap.put(str2, m1523c);
                    i8 = i9;
                } else {
                    AbstractC1806n.m3072T();
                    throw null;
                }
            } else {
                ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list2));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    String str3 = (String) it4.next();
                    String str4 = (String) linkedHashMap.get(str3);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    arrayList.add(str3);
                }
                if (!map.isEmpty()) {
                    map2 = new LinkedHashMap(AbstractC1817y.m3082N(map.size()));
                    for (Map.Entry entry2 : map.entrySet()) {
                        Object key = entry2.getKey();
                        List<String> list3 = (List) entry2.getValue();
                        ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list3));
                        for (String str5 : list3) {
                            String str6 = (String) linkedHashMap.get(str5);
                            if (str6 != null) {
                                str5 = str6;
                            }
                            arrayList2.add(str5);
                        }
                        map2.put(key, arrayList2);
                    }
                } else {
                    map2 = map;
                }
                if (m3042f0.isEmpty()) {
                    i7 = 0;
                } else {
                    i7 = 0;
                    for (String str7 : m3042f0) {
                        if (linkedHashMap.get(str7) != null && !AbstractC3367j.m5096a(linkedHashMap.get(str7), str7) && (i7 = i7 + 1) < 0) {
                            AbstractC1806n.m3071S();
                            throw null;
                        }
                    }
                }
                C1701c0 c1701c02 = c1100ms.f6084i1;
                c1701c02.m2752j(null, C0976ir.m1609a((C0976ir) c1701c02.getValue(), false, false, 0.0d, 0.0d, 0.0d, 0.0d, null, null, AbstractC0451r.m969K(c1100ms.m1932A(), "准备测速", "已解析 " + i7 + " 条跳转，测速中"), null, null, null, 0, 2147352575));
                return new C1687f(arrayList, map2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0063, code lost:
    
        if (r9 == null) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v7, types: [g5.h] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [g5.h] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List m1913g(C1100ms c1100ms, String str, Network network) {
        ?? m2985m;
        C1100ms c1100ms2;
        Object m2985m2;
        List list;
        Object m2985m3;
        InterfaceC2313c interfaceC2313c;
        List list2;
        C1813u c1813u = C1813u.f10860e;
        String m945i0 = AbstractC0444k.m945i0(str, "[", "]");
        String m1947I = c1100ms.m1947I(m945i0, network);
        List list3 = (List) c1100ms.f6039Q0.get(m1947I);
        if (list3 != null) {
            return list3;
        }
        int ordinal = AbstractC1155ol.m2013a(m945i0).ordinal();
        InterfaceC2313c interfaceC2313c2 = null;
        if (ordinal != 0 && ordinal != 1) {
            if (c1100ms.f6021H0.m2388b()) {
                C2325e c2325e = AbstractC0549l0.f1898a;
                c1100ms2 = c1100ms;
                list2 = (List) AbstractC0525d0.m1145w(ExecutorC2324d.f13302g, new C0070r0(m945i0, network, c1100ms2, interfaceC2313c2, 10));
            } else {
                c1100ms2 = c1100ms;
                if (network != null) {
                    try {
                        InetAddress[] allByName = network.getAllByName(m945i0);
                        AbstractC3367j.m5099d(allByName, "getAllByName(...)");
                        m2985m2 = AbstractC1804l.m3031X(allByName);
                    } catch (Throwable th) {
                        m2985m2 = AbstractC1793a0.m2985m(th);
                    }
                    if (m2985m2 instanceof C1689h) {
                        m2985m2 = null;
                    }
                    list = (List) m2985m2;
                }
                list = c1813u;
                try {
                    try {
                        InetAddress[] allByName2 = InetAddress.getAllByName(m945i0);
                        AbstractC3367j.m5099d(allByName2, "getAllByName(hostname)");
                        m2985m3 = AbstractC1804l.m3031X(allByName2);
                    } catch (NullPointerException e7) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(m945i0));
                        unknownHostException.initCause(e7);
                        throw unknownHostException;
                    }
                } catch (Throwable th2) {
                    m2985m3 = AbstractC1793a0.m2985m(th2);
                }
                if (C1690i.m2747a(m2985m3) != null) {
                    try {
                        InetAddress[] allByName3 = InetAddress.getAllByName(m945i0);
                        AbstractC3367j.m5099d(allByName3, "getAllByName(...)");
                        interfaceC2313c = AbstractC1804l.m3031X(allByName3);
                    } catch (Throwable th3) {
                        interfaceC2313c = AbstractC1793a0.m2985m(th3);
                    }
                    if (!(interfaceC2313c instanceof C1689h)) {
                        interfaceC2313c2 = interfaceC2313c;
                    }
                    ?? r7 = (List) interfaceC2313c2;
                    if (r7 != 0) {
                        c1813u = r7;
                    }
                    m2985m3 = c1813u;
                }
                ArrayList m3058v0 = AbstractC1805m.m3058v0(list, (List) m2985m3);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                int size = m3058v0.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = m3058v0.get(i7);
                    i7++;
                    String hostAddress = ((InetAddress) obj).getHostAddress();
                    if (hostAddress == null) {
                        hostAddress = "";
                    }
                    if (hashSet.add(hostAddress)) {
                        arrayList.add(obj);
                    }
                }
                list2 = arrayList;
            }
            c1100ms2.f6039Q0.put(m1947I, list2);
            return list2;
        }
        try {
            if (network != null) {
                InetAddress[] allByName4 = network.getAllByName(m945i0);
                AbstractC3367j.m5099d(allByName4, "getAllByName(...)");
                m2985m = AbstractC1804l.m3031X(allByName4);
            } else {
                m2985m = AbstractC3784a.m5817z(InetAddress.getByName(m945i0));
            }
        } catch (Throwable th4) {
            m2985m = AbstractC1793a0.m2985m(th4);
        }
        if (!(m2985m instanceof C1689h)) {
            interfaceC2313c2 = m2985m;
        }
        ?? r72 = (List) interfaceC2313c2;
        if (r72 != 0) {
            c1813u = r72;
        }
        return c1813u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x044e, code lost:
    
        if (r8 == null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0761, code lost:
    
        if (r11 == null) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x065a, code lost:
    
        if (r10 == null) goto L291;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x057c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0bf2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0be7  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, u5.v] */
    /* JADX WARN: Type inference failed for: r5v58, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r61v0 */
    /* JADX WARN: Type inference failed for: r61v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r61v2 */
    /* JADX WARN: Type inference failed for: r62v0 */
    /* JADX WARN: Type inference failed for: r62v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r62v2 */
    /* JADX WARN: Type inference failed for: r75v1, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x011f -> B:10:0x0127). Please report as a decompilation issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1914h(C1100ms c1100ms, long j6, AbstractC2583c abstractC2583c) {
        C0946hs c0946hs;
        int i7;
        int i8;
        EnumC2465a enumC2465a;
        C1803k c1803k;
        C1803k c1803k2;
        C1803k c1803k3;
        String str;
        double d7;
        int i9;
        C3379v c3379v;
        C0946hs c0946hs2;
        C1803k c1803k4;
        long j7;
        int i10;
        double d8;
        C1100ms c1100ms2;
        InterfaceC2318h interfaceC2318h;
        long j8;
        String str2;
        int i11;
        C0946hs c0946hs3;
        long j9;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C1100ms c1100ms3;
        double d9;
        double d10;
        C3379v c3379v2;
        double d11;
        long j10;
        double d12;
        double d13;
        C1803k c1803k5;
        String str8;
        int i12;
        int i13;
        int i14;
        C1414x1 c1414x1;
        C1383w1 c1383w1;
        int i15;
        C1803k c1803k6;
        C3379v c3379v3;
        C1803k c1803k7;
        long j11;
        int i16;
        int i17;
        String str9;
        int i18;
        int i19;
        String str10;
        int min;
        int i20;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        int i21;
        double d19;
        String str11;
        String str12;
        String str13;
        int i22;
        String str14;
        ?? r61;
        ?? r62;
        double d20;
        String str15;
        Object obj;
        double d21;
        double d22;
        long j12;
        Double d23;
        C0948hu c0948hu;
        Double d24;
        String str16;
        String sb;
        String m943g0;
        String str17;
        Double d25;
        double d26;
        double d27;
        Object obj2;
        Iterator it;
        String str18;
        Long l7;
        long j13;
        Long l8;
        long j14;
        C1100ms c1100ms4 = c1100ms;
        c1100ms4.getClass();
        if (abstractC2583c instanceof C0946hs) {
            c0946hs = (C0946hs) abstractC2583c;
            int i23 = c0946hs.f4657v;
            if ((i23 & Integer.MIN_VALUE) != 0) {
                c0946hs.f4657v = i23 - Integer.MIN_VALUE;
                Object obj3 = c0946hs.f4655t;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                i7 = c0946hs.f4657v;
                if (i7 == 0) {
                    if (i7 == 1) {
                        double d28 = c0946hs.f4654s;
                        double d29 = c0946hs.f4653r;
                        int i24 = c0946hs.f4652q;
                        int i25 = c0946hs.f4651p;
                        long j15 = c0946hs.f4650o;
                        String str19 = c0946hs.f4649n;
                        i8 = 0;
                        C1803k c1803k8 = c0946hs.f4648m;
                        C1803k c1803k9 = c0946hs.f4647l;
                        C1803k c1803k10 = c0946hs.f4646k;
                        C1803k c1803k11 = c0946hs.f4645j;
                        C3379v c3379v4 = c0946hs.f4644i;
                        c1100ms2 = c0946hs.f4643h;
                        AbstractC1793a0.m2972L(obj3);
                        EnumC2465a enumC2465a3 = enumC2465a2;
                        double d30 = d29;
                        c1803k2 = c1803k10;
                        c1803k4 = c1803k8;
                        i9 = i24;
                        c3379v = c3379v4;
                        c0946hs2 = c0946hs;
                        double d31 = d28;
                        c1803k = c1803k11;
                        c1803k3 = c1803k9;
                        i10 = i25;
                        if (c1100ms2.f6079h.get()) {
                            C0725au m2004w0 = c1100ms2.m2004w0();
                            c3379v.f16451e = m2004w0;
                            EnumC2465a enumC2465a4 = enumC2465a3;
                            double d32 = d31;
                            long j16 = m2004w0.f2521c;
                            C1039kt m1933A0 = c1100ms2.m1933A0(m2004w0);
                            long j17 = j16;
                            long j18 = m1933A0.f5341a;
                            long j19 = m1933A0.f5342b;
                            AtomicBoolean atomicBoolean = c1100ms2.f6076g;
                            AtomicBoolean atomicBoolean2 = c1100ms2.f6073f;
                            C0789cu c0789cu = c1100ms2.f6092l0;
                            long j20 = c0789cu.f3218c;
                            if (j20 > 0 && j18 + j19 >= j20) {
                                C1100ms c1100ms5 = c1100ms2;
                                c1100ms5.m1963T0(j17, j18, "总流量已达上限，测速停止");
                                j8 = j18;
                                c1100ms5.m1965V0(j17, j19, "总流量已达上限，测速停止");
                                str3 = "总流量已达上限，测速停止";
                                i11 = i9;
                                c0946hs3 = c0946hs2;
                                j9 = j19;
                            } else {
                                if (c0789cu.f3216a > 0 && atomicBoolean2.get() && j18 >= c1100ms2.f6092l0.f3216a) {
                                    if (atomicBoolean.get()) {
                                        str5 = "下载已达量停止，上传继续测速";
                                    } else {
                                        str5 = "下载已达量停止";
                                    }
                                    C1100ms c1100ms6 = c1100ms2;
                                    String str20 = str5;
                                    c1100ms6.m1963T0(j17, j18, str20);
                                    c1100ms2 = c1100ms6;
                                    j8 = j18;
                                    str2 = str20;
                                } else {
                                    j8 = j18;
                                    str2 = null;
                                }
                                i11 = i9;
                                c0946hs3 = c0946hs2;
                                if (c1100ms2.f6092l0.f3217b > 0 && atomicBoolean.get() && j19 >= c1100ms2.f6092l0.f3217b) {
                                    if (atomicBoolean2.get()) {
                                        str4 = "上传已达量停止，下载继续测速";
                                    } else if (str2 != null) {
                                        str4 = "上传/下载均已达量停止";
                                    } else {
                                        str4 = "上传已达量停止";
                                    }
                                    C1100ms c1100ms7 = c1100ms2;
                                    String str21 = str4;
                                    c1100ms7.m1965V0(j17, j19, str21);
                                    c1100ms2 = c1100ms7;
                                    j9 = j19;
                                    str3 = str21;
                                } else {
                                    j9 = j19;
                                    str3 = str2;
                                }
                            }
                            if (str3 != null && !c1100ms2.f6073f.get() && !c1100ms2.f6076g.get()) {
                                str6 = str3;
                            } else {
                                str6 = str19;
                            }
                            int i26 = i10;
                            C1803k c1803k12 = c1803k4;
                            long m1895Q = m1895Q(c1100ms2.f6068d0, j8, c1100ms2.f6073f.get());
                            String str22 = str3;
                            long m1895Q2 = m1895Q(c1100ms2.f6071e0, j9, c1100ms2.f6076g.get());
                            C1803k c1803k13 = c1803k3;
                            m1931z0(c1803k13, j17, j8, 7000L);
                            m1931z0(c1803k12, j17, j9, 7000L);
                            synchronized (c1100ms2.f6053X0) {
                                try {
                                    Iterator it2 = c1100ms2.f6109s0.iterator();
                                    while (it2.hasNext()) {
                                        C1248rl c1248rl = (C1248rl) it2.next();
                                        Long m1978f0 = c1100ms2.m1978f0((C0725au) c3379v.f16451e, c1248rl);
                                        if (m1978f0 != null) {
                                            j13 = m1978f0.longValue();
                                            it = it2;
                                            str18 = str22;
                                        } else {
                                            AtomicLong atomicLong = (AtomicLong) c1100ms2.f6100o.get(c1248rl.f7390a);
                                            if (atomicLong != null) {
                                                it = it2;
                                                str18 = str22;
                                                l7 = new Long(atomicLong.get());
                                            } else {
                                                it = it2;
                                                str18 = str22;
                                                l7 = null;
                                            }
                                            if (l7 != null) {
                                                j13 = l7.longValue();
                                            } else {
                                                j13 = 0;
                                            }
                                        }
                                        Long m1980g0 = c1100ms2.m1980g0((C0725au) c3379v.f16451e, c1248rl);
                                        if (m1980g0 != null) {
                                            j14 = m1980g0.longValue();
                                        } else {
                                            AtomicLong atomicLong2 = (AtomicLong) c1100ms2.f6102p.get(c1248rl.f7390a);
                                            if (atomicLong2 != null) {
                                                l8 = new Long(atomicLong2.get());
                                            } else {
                                                l8 = null;
                                            }
                                            if (l8 != null) {
                                                j14 = l8.longValue();
                                            } else {
                                                j14 = 0;
                                            }
                                        }
                                        C1803k c1803k14 = (C1803k) c1100ms2.f6104q.get(c1248rl.f7390a);
                                        if (c1803k14 != null) {
                                            m1931z0(c1803k14, j17, j13, 7000L);
                                        }
                                        C1803k c1803k15 = (C1803k) c1100ms2.f6106r.get(c1248rl.f7390a);
                                        if (c1803k15 != null) {
                                            m1931z0(c1803k15, j17, j14, 7000L);
                                        }
                                        str22 = str18;
                                        it2 = it;
                                    }
                                    str7 = str22;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (c1100ms2.f6073f.get()) {
                                C1100ms c1100ms8 = c1100ms2;
                                C1316tr m1998p0 = c1100ms8.m1998p0(c1803k13, j17, c1100ms2.f6072e1);
                                c1100ms3 = c1100ms8;
                                j17 = j17;
                                c1100ms3.f6072e1 = m1998p0.f7862b;
                                d10 = m1998p0.f7861a;
                                d9 = 0.0d;
                            } else {
                                c1100ms3 = c1100ms2;
                                d9 = 0.0d;
                                c1100ms3.f6072e1 = 0.0d;
                                d10 = 0.0d;
                            }
                            if (c1100ms3.f6076g.get()) {
                                long j21 = j17;
                                C1316tr m1998p02 = c1100ms3.m1998p0(c1803k12, j21, c1100ms3.f6075f1);
                                c3379v2 = c3379v;
                                d11 = d10;
                                j10 = j21;
                                c1100ms3.f6075f1 = m1998p02.f7862b;
                                d12 = m1998p02.f7861a;
                            } else {
                                c3379v2 = c3379v;
                                d11 = d10;
                                double d33 = d9;
                                j10 = j17;
                                c1100ms3.f6075f1 = d33;
                                d12 = 0.0d;
                            }
                            if (c1100ms3.f6073f.get() || c1803k.isEmpty()) {
                                c1803k.addLast(Double.valueOf(d11));
                                int i27 = c1100ms3.f6081h1;
                                while (c1803k.mo2999a() > i27) {
                                    c1803k.removeFirst();
                                }
                            }
                            if (c1100ms3.f6076g.get() || c1803k2.isEmpty()) {
                                c1803k2.addLast(Double.valueOf(d12));
                                int i28 = c1100ms3.f6081h1;
                                while (c1803k2.mo2999a() > i28) {
                                    c1803k2.removeFirst();
                                }
                            }
                            long j22 = 1;
                            if (c1100ms3.f6073f.get() && !c1100ms3.f6083i0 && c1100ms3.f6015E0) {
                                if (!c1100ms3.f6073f.get() || d11 <= 0.0d) {
                                    d13 = d12;
                                    c1803k5 = c1803k13;
                                } else {
                                    int size = c1100ms3.f6114v.size();
                                    int i29 = c1100ms3.f6117w0;
                                    if (i29 < 1) {
                                        i29 = 1;
                                    }
                                    c1803k5 = c1803k13;
                                    int i30 = 2;
                                    int i31 = (int) (i29 * 0.45d);
                                    int i32 = i29 - 1;
                                    if (i31 > i32) {
                                        i31 = i32;
                                    }
                                    if (size <= i31) {
                                        i12 = i26 + 1;
                                        d13 = d12;
                                        long j23 = c1100ms3.f6078g1;
                                        if (j23 < 1) {
                                            j23 = 1;
                                        }
                                        int i33 = (int) (1000 / j23);
                                        if (i33 < 1) {
                                            i33 = 1;
                                        }
                                        if (i12 >= i33 * 2) {
                                            List list = c1100ms3.f6101o0;
                                            List list2 = c1100ms3.f6095m0;
                                            if (!list.isEmpty() && !list2.isEmpty()) {
                                                long currentTimeMillis = System.currentTimeMillis();
                                                str8 = str7;
                                                long j24 = c1100ms3.f6020H.get();
                                                if (currentTimeMillis - j24 >= 3000 && c1100ms3.f6020H.compareAndSet(j24, currentTimeMillis)) {
                                                    int m3530q = AbstractC2168e.m3530q(1, 1, 1);
                                                    int i34 = i8;
                                                    while (i34 < m3530q) {
                                                        AtomicInteger atomicInteger = c1100ms3.f6016F;
                                                        while (true) {
                                                            int i35 = atomicInteger.get();
                                                            if (i35 < 24) {
                                                                if (atomicInteger.compareAndSet(i35, i35 + 1)) {
                                                                    int andIncrement = c1100ms3.f6018G.getAndIncrement();
                                                                    C1248rl c1248rl2 = (C1248rl) list2.get(andIncrement % list2.size());
                                                                    List list3 = (List) c1100ms3.f6111t0.get(c1248rl2.f7390a);
                                                                    if (list3 != null) {
                                                                        if (list3.isEmpty()) {
                                                                            list3 = null;
                                                                        }
                                                                    }
                                                                    list3 = list;
                                                                    String str23 = (String) list3.get(andIncrement % list3.size());
                                                                    c1100ms3.m1987k0(c1248rl2, "掉速紧急补偿");
                                                                    AbstractC0525d0.m1141s(c1100ms3.f6070e, c1100ms3.f6061b, new C0914gs(c1100ms3, c1248rl2, andIncrement, str23, null), i30);
                                                                } else {
                                                                    i30 = 2;
                                                                }
                                                            }
                                                        }
                                                        i34++;
                                                        i30 = 2;
                                                    }
                                                }
                                                i12 = i8;
                                                if (c1100ms3.f6076g.get()) {
                                                    if (c1100ms3.f6083i0 || !c1100ms3.f6015E0) {
                                                        i14 = i8;
                                                        i13 = i12;
                                                    } else if (c1100ms3.f6076g.get() && d13 > 0.0d) {
                                                        int size2 = c1100ms3.f6118x.size();
                                                        int i36 = c1100ms3.f6121y0;
                                                        if (i36 < 1) {
                                                            i36 = 1;
                                                        }
                                                        int i37 = (int) (i36 * 0.45d);
                                                        int i38 = i36 - 1;
                                                        if (i37 > i38) {
                                                            i37 = i38;
                                                        }
                                                        if (size2 <= i37) {
                                                            i14 = i11 + 1;
                                                            i13 = i12;
                                                            long j25 = c1100ms3.f6078g1;
                                                            if (j25 >= 1) {
                                                                j22 = j25;
                                                            }
                                                            int i39 = (int) (1000 / j22);
                                                            if (i39 < 1) {
                                                                i39 = 1;
                                                            }
                                                            if (i14 >= i39 * 2) {
                                                                List list4 = c1100ms3.f6103p0;
                                                                List list5 = c1100ms3.f6109s0;
                                                                if (!list4.isEmpty() && !list5.isEmpty()) {
                                                                    long currentTimeMillis2 = System.currentTimeMillis();
                                                                    long j26 = c1100ms3.f6024J.get();
                                                                    if (currentTimeMillis2 - j26 >= 3000 && c1100ms3.f6024J.compareAndSet(j26, currentTimeMillis2)) {
                                                                        int m3530q2 = AbstractC2168e.m3530q(1, 1, 1);
                                                                        for (int i40 = i8; i40 < m3530q2; i40++) {
                                                                            int andIncrement2 = c1100ms3.f6022I.getAndIncrement();
                                                                            C1248rl c1248rl3 = (C1248rl) list5.get(andIncrement2 % list5.size());
                                                                            List list6 = (List) c1100ms3.f6113u0.get(c1248rl3.f7390a);
                                                                            if (list6 != null) {
                                                                                if (list6.isEmpty()) {
                                                                                    list6 = null;
                                                                                }
                                                                                if (list6 != null) {
                                                                                    String str24 = (String) list6.get(andIncrement2 % list6.size());
                                                                                    c1100ms3.m1987k0(c1248rl3, "上传掉速紧急补偿");
                                                                                    AbstractC0525d0.m1141s(c1100ms3.f6070e, c1100ms3.f6067d, new C0914gs(c1100ms3, c1248rl3, andIncrement2, 2, str24, null), 2);
                                                                                }
                                                                            }
                                                                            list6 = list4;
                                                                            String str242 = (String) list6.get(andIncrement2 % list6.size());
                                                                            c1100ms3.m1987k0(c1248rl3, "上传掉速紧急补偿");
                                                                            AbstractC0525d0.m1141s(c1100ms3.f6070e, c1100ms3.f6067d, new C0914gs(c1100ms3, c1248rl3, andIncrement2, 2, str242, null), 2);
                                                                        }
                                                                    }
                                                                }
                                                                i14 = i8;
                                                            }
                                                        }
                                                    }
                                                    c1414x1 = c1100ms3.f6033N0;
                                                    synchronized (c1414x1.f8580c) {
                                                        c1383w1 = (C1383w1) c1414x1.f8581d;
                                                    }
                                                    C0750bn c0750bn = c1100ms3.f6011C0;
                                                    if (c1100ms3.f6083i0) {
                                                        c1100ms3.f6013D0 = "单端口复用模式下暂停速率推进";
                                                    } else if (!c0750bn.f2846a) {
                                                        c1100ms3.f6013D0 = "未启用";
                                                    } else if (c1100ms3.f6009B0 != EnumC0908gm.f4308f) {
                                                        c1100ms3.f6013D0 = "速率推进暂停：".concat(c1100ms3.f6009B0.f4316e);
                                                    } else {
                                                        double d34 = c1383w1.f8286a;
                                                        if (d34 >= 88.0d) {
                                                            c1100ms3.f6013D0 = AbstractC0094y0.m184k((int) d34, "速率推进暂停：APP CPU ", "%");
                                                        } else if (c1100ms3.f6031M0.incrementAndGet() % 2 != 0) {
                                                            c1100ms3.f6013D0 = "速率推进待命：链路未拥塞";
                                                        } else {
                                                            if (c1100ms3.f6073f.get()) {
                                                                List list7 = c0750bn.f2847b;
                                                                int i41 = c0750bn.f2850e;
                                                                if (i41 > 0) {
                                                                    List list8 = c1100ms3.f6095m0;
                                                                    if (list8.isEmpty()) {
                                                                        list8 = c1100ms3.f6109s0;
                                                                    }
                                                                    if (!list8.isEmpty()) {
                                                                        i16 = 100000;
                                                                        i15 = i14;
                                                                        int min2 = Math.min(c1100ms3.f6123z0 - c1100ms3.f6117w0, i41);
                                                                        if (min2 <= 0) {
                                                                            i17 = i8;
                                                                            c1803k6 = c1803k;
                                                                            c3379v3 = c3379v2;
                                                                            c1803k7 = c1803k2;
                                                                            j11 = j15;
                                                                        } else {
                                                                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                                            Iterator it3 = list8.iterator();
                                                                            i17 = i8;
                                                                            loop7: while (true) {
                                                                                if (it3.hasNext()) {
                                                                                    c1803k6 = c1803k;
                                                                                    C1248rl c1248rl4 = (C1248rl) it3.next();
                                                                                    c3379v3 = c3379v2;
                                                                                    c1803k7 = c1803k2;
                                                                                    List list9 = (List) c1100ms3.f6111t0.get(c1248rl4.f7390a);
                                                                                    if (list9 != null) {
                                                                                        if (list9.isEmpty()) {
                                                                                            list9 = null;
                                                                                        }
                                                                                    }
                                                                                    list9 = c1100ms3.f6101o0;
                                                                                    List m3042f0 = AbstractC1805m.m3042f0(AbstractC1805m.m3058v0(list9, list7));
                                                                                    ArrayList arrayList = new ArrayList();
                                                                                    Iterator it4 = m3042f0.iterator();
                                                                                    while (it4.hasNext()) {
                                                                                        List list10 = list7;
                                                                                        Object next = it4.next();
                                                                                        Iterator it5 = it4;
                                                                                        String str25 = (String) next;
                                                                                        Iterator it6 = it3;
                                                                                        long j27 = j15;
                                                                                        if (c1100ms3.f6019G0 == EnumC1127no.f6360g || c1100ms3.m1977e1(str25, c1248rl4, c1100ms3.f6019G0, linkedHashMap)) {
                                                                                            arrayList.add(next);
                                                                                        }
                                                                                        it4 = it5;
                                                                                        list7 = list10;
                                                                                        it3 = it6;
                                                                                        j15 = j27;
                                                                                    }
                                                                                    List list11 = list7;
                                                                                    Iterator it7 = it3;
                                                                                    j11 = j15;
                                                                                    int size3 = arrayList.size();
                                                                                    int i42 = i8;
                                                                                    while (i42 < size3) {
                                                                                        Object obj4 = arrayList.get(i42);
                                                                                        i42++;
                                                                                        String str26 = (String) obj4;
                                                                                        if (i17 >= min2) {
                                                                                            break loop7;
                                                                                        }
                                                                                        C1248rl c1248rl5 = c1248rl4;
                                                                                        AbstractC0525d0.m1141s(c1100ms3.f6070e, c1100ms3.f6061b, new C0914gs(c1100ms3, c1248rl5, c1100ms3.f6029L0.getAndIncrement() + 100000, 0, str26, null), 2);
                                                                                        i17++;
                                                                                        c1248rl4 = c1248rl5;
                                                                                    }
                                                                                    list7 = list11;
                                                                                    it3 = it7;
                                                                                    c1803k = c1803k6;
                                                                                    c3379v2 = c3379v3;
                                                                                    c1803k2 = c1803k7;
                                                                                    j15 = j11;
                                                                                } else {
                                                                                    c1803k6 = c1803k;
                                                                                    c3379v3 = c3379v2;
                                                                                    c1803k7 = c1803k2;
                                                                                    j11 = j15;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            c1100ms3.f6117w0 += i17;
                                                                        }
                                                                    }
                                                                }
                                                                i17 = i8;
                                                                i15 = i14;
                                                                c1803k6 = c1803k;
                                                                c3379v3 = c3379v2;
                                                                c1803k7 = c1803k2;
                                                                j11 = j15;
                                                                i16 = 100000;
                                                            } else {
                                                                i15 = i14;
                                                                c1803k6 = c1803k;
                                                                c3379v3 = c3379v2;
                                                                c1803k7 = c1803k2;
                                                                j11 = j15;
                                                                i16 = 100000;
                                                                i17 = i8;
                                                            }
                                                            if (c1100ms3.f6076g.get()) {
                                                                List list12 = c0750bn.f2848c;
                                                                int i43 = c0750bn.f2850e - i17;
                                                                if (i43 < 0) {
                                                                    i43 = i8;
                                                                }
                                                                if (i43 > 0) {
                                                                    List list13 = c1100ms3.f6098n0;
                                                                    if (!list13.isEmpty() && (min = Math.min(c1100ms3.f6007A0 - c1100ms3.f6121y0, i43)) > 0) {
                                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                        Iterator it8 = list13.iterator();
                                                                        i20 = i8;
                                                                        loop4: while (it8.hasNext()) {
                                                                            C1248rl c1248rl6 = (C1248rl) it8.next();
                                                                            List list14 = (List) c1100ms3.f6113u0.get(c1248rl6.f7390a);
                                                                            if (list14 != null) {
                                                                                if (list14.isEmpty()) {
                                                                                    list14 = null;
                                                                                }
                                                                            }
                                                                            list14 = c1100ms3.f6103p0;
                                                                            List m3042f02 = AbstractC1805m.m3042f0(AbstractC1805m.m3058v0(list14, list12));
                                                                            ArrayList arrayList2 = new ArrayList();
                                                                            for (Object obj5 : m3042f02) {
                                                                                String str27 = (String) obj5;
                                                                                List list15 = list12;
                                                                                Iterator it9 = it8;
                                                                                if (c1100ms3.f6019G0 == EnumC1127no.f6360g || c1100ms3.m1977e1(str27, c1248rl6, c1100ms3.f6019G0, linkedHashMap2)) {
                                                                                    arrayList2.add(obj5);
                                                                                }
                                                                                list12 = list15;
                                                                                it8 = it9;
                                                                            }
                                                                            List list16 = list12;
                                                                            Iterator it10 = it8;
                                                                            int size4 = arrayList2.size();
                                                                            int i44 = i8;
                                                                            while (i44 < size4) {
                                                                                Object obj6 = arrayList2.get(i44);
                                                                                i44++;
                                                                                String str28 = (String) obj6;
                                                                                if (i20 >= min) {
                                                                                    break loop4;
                                                                                }
                                                                                C1248rl c1248rl7 = c1248rl6;
                                                                                AbstractC0525d0.m1141s(c1100ms3.f6070e, c1100ms3.f6067d, new C1370vj(c1100ms3, c1248rl7, str28, arrayList2, c1100ms3.f6029L0.getAndIncrement() + i16, null), 2);
                                                                                i20++;
                                                                                c1248rl6 = c1248rl7;
                                                                            }
                                                                            list12 = list16;
                                                                            it8 = it10;
                                                                        }
                                                                        c1100ms3.f6121y0 += i20;
                                                                        i17 += i20;
                                                                    }
                                                                }
                                                                i20 = i8;
                                                                i17 += i20;
                                                            }
                                                            if (i17 > 0) {
                                                                c1100ms3.f6013D0 = AbstractC0094y0.m183j(i17, c1100ms3.f6027K0.addAndGet(i17), "速率推进 +", " 线程（累计 ", "）");
                                                            } else {
                                                                if (c1100ms3.f6073f.get() && c1100ms3.f6117w0 >= c1100ms3.f6123z0) {
                                                                    i18 = c1100ms3.f6117w0;
                                                                    i19 = c1100ms3.f6123z0;
                                                                    str10 = "速率推进暂停：下载线程池已满 ";
                                                                } else if (c1100ms3.f6076g.get() && c1100ms3.f6121y0 >= c1100ms3.f6007A0) {
                                                                    i18 = c1100ms3.f6121y0;
                                                                    i19 = c1100ms3.f6007A0;
                                                                    str10 = "速率推进暂停：上传线程池已满 ";
                                                                } else {
                                                                    str9 = "速率推进待命：暂无可加 URL";
                                                                    c1100ms3.f6013D0 = str9;
                                                                }
                                                                str9 = AbstractC0094y0.m182i(i18, i19, str10, "/");
                                                                c1100ms3.f6013D0 = str9;
                                                            }
                                                            List m2007y = c1100ms3.m2007y(j10);
                                                            if (c1100ms3.f6073f.get()) {
                                                                double d35 = d13;
                                                                d15 = m1928u(m1895Q, c1100ms3.f6056Z, m1894P(c1100ms3.f6062b0, j10, c1100ms3.f6073f.get()));
                                                                d14 = d35;
                                                            } else {
                                                                d14 = d13;
                                                                d15 = 0.0d;
                                                            }
                                                            if (c1100ms3.f6076g.get()) {
                                                                d16 = m1928u(m1895Q2, c1100ms3.f6059a0, m1894P(c1100ms3.f6065c0, j10, c1100ms3.f6076g.get()));
                                                            } else {
                                                                d16 = 0.0d;
                                                            }
                                                            double d36 = c1100ms3.f6088k.f2268j;
                                                            double d37 = c1100ms3.f6091l.f2268j;
                                                            d17 = c1100ms3.f6088k.f2269k;
                                                            d18 = c1100ms3.f6091l.f2269k;
                                                            if (d30 <= 0.0d && d11 < d30) {
                                                                i21 = 1;
                                                            } else {
                                                                i21 = i8;
                                                            }
                                                            int i45 = c1100ms3.f6088k.f2267i;
                                                            if (d17 >= 0.12d) {
                                                                str11 = "超时偏高";
                                                            } else if (d36 >= 450.0d) {
                                                                str11 = "RTT偏高";
                                                            } else {
                                                                d19 = d14;
                                                                if (i21 != 0 && i45 < 8) {
                                                                    str11 = "吞吐下行，允许补偿";
                                                                } else if (i21 != 0) {
                                                                    str11 = "吞吐下行";
                                                                } else {
                                                                    str11 = "正常";
                                                                }
                                                                String str29 = str11;
                                                                if (d18 >= 0.18d) {
                                                                    str14 = "超时偏高";
                                                                } else if (d37 >= 420.0d) {
                                                                    str14 = "RTT偏高";
                                                                } else {
                                                                    if (d32 > 0.0d && d19 < d32) {
                                                                        int size5 = c1100ms3.f6118x.size();
                                                                        int i46 = (int) (c1100ms3.f6121y0 * 0.45d);
                                                                        int i47 = c1100ms3.f6121y0;
                                                                        if (i47 < 1) {
                                                                            i22 = 1;
                                                                        } else {
                                                                            i22 = i47;
                                                                        }
                                                                        int i48 = i22 - 1;
                                                                        if (i46 > i48) {
                                                                            i46 = i48;
                                                                        }
                                                                        if (size5 <= i46) {
                                                                            str12 = "连接塌陷";
                                                                            str13 = str12;
                                                                            if (!c1100ms3.f6079h.get()) {
                                                                                C1701c0 c1701c0 = c1100ms3.f6084i1;
                                                                                boolean z7 = c1100ms3.f6073f.get();
                                                                                boolean z8 = c1100ms3.f6076g.get();
                                                                                double m1928u = m1928u(m1895Q, c1100ms3.f6056Z, m1894P(c1100ms3.f6062b0, j10, c1100ms3.f6073f.get()));
                                                                                double m1928u2 = m1928u(m1895Q2, c1100ms3.f6059a0, m1894P(c1100ms3.f6065c0, j10, c1100ms3.f6076g.get()));
                                                                                List m3035C0 = AbstractC1805m.m3035C0(c1803k6);
                                                                                List m3035C02 = AbstractC1805m.m3035C0(c1803k7);
                                                                                long m1942F = c1100ms3.m1942F(j10);
                                                                                List m1940E = c1100ms3.m1940E();
                                                                                if (c1100ms3.f6043S0.isEmpty() && !c1100ms3.f6073f.get()) {
                                                                                    r61 = i8;
                                                                                } else {
                                                                                    r61 = 1;
                                                                                }
                                                                                if (c1100ms3.f6045T0.isEmpty() && !c1100ms3.f6076g.get()) {
                                                                                    r62 = i8;
                                                                                } else {
                                                                                    r62 = 1;
                                                                                }
                                                                                if (str8 == null) {
                                                                                    if (c1100ms3.f6011C0.f2846a) {
                                                                                        d20 = m1928u2;
                                                                                        if (!AbstractC3367j.m5096a(c1100ms3.f6013D0, "未启用")) {
                                                                                            str15 = c1100ms3.f6013D0;
                                                                                        }
                                                                                    } else {
                                                                                        d20 = m1928u2;
                                                                                    }
                                                                                    if (c1100ms3.f6080h0) {
                                                                                        str15 = "极致吞吐模式，测速中";
                                                                                    } else if (c1100ms3.f6077g0) {
                                                                                        str15 = "测速中";
                                                                                    } else {
                                                                                        str15 = "测速中";
                                                                                    }
                                                                                } else {
                                                                                    d20 = m1928u2;
                                                                                    str15 = str8;
                                                                                }
                                                                                String m1997p = c1100ms3.m1997p(str15);
                                                                                if (c1100ms3.f6037P0.isEmpty()) {
                                                                                    C1813u c1813u = C1813u.f10860e;
                                                                                    c1100ms3.f6047U0 = c1813u;
                                                                                    c1100ms3.f6049V0 = j10;
                                                                                    d26 = d37;
                                                                                    d27 = d17;
                                                                                    obj2 = c1813u;
                                                                                } else {
                                                                                    if (!c1100ms3.f6047U0.isEmpty() && j10 - c1100ms3.f6049V0 < 1000) {
                                                                                        d26 = d37;
                                                                                        d27 = d17;
                                                                                    } else {
                                                                                        Set entrySet = c1100ms3.f6037P0.entrySet();
                                                                                        final C0310q c0310q = new C0310q(10, c1100ms3);
                                                                                        entrySet.removeIf(new Predicate() { // from class: e5.kr
                                                                                            @Override // java.util.function.Predicate
                                                                                            public final boolean test(Object obj7) {
                                                                                                return ((Boolean) C0310q.this.mo23f(obj7)).booleanValue();
                                                                                            }
                                                                                        });
                                                                                        if (c1100ms3.f6037P0.isEmpty()) {
                                                                                            obj = C1813u.f10860e;
                                                                                        } else {
                                                                                            long elapsedRealtime = SystemClock.elapsedRealtime();
                                                                                            Collection values = c1100ms3.f6037P0.values();
                                                                                            AbstractC3367j.m5099d(values, "<get-values>(...)");
                                                                                            C0866fc c0866fc = new C0866fc(26);
                                                                                            C0866fc c0866fc2 = new C0866fc(27);
                                                                                            C0866fc c0866fc3 = new C0866fc(28);
                                                                                            InterfaceC3279c[] interfaceC3279cArr = new InterfaceC3279c[3];
                                                                                            interfaceC3279cArr[i8] = c0866fc;
                                                                                            interfaceC3279cArr[1] = c0866fc2;
                                                                                            interfaceC3279cArr[2] = c0866fc3;
                                                                                            List m3061y0 = AbstractC1805m.m3061y0(values, AbstractC2067b.m3283h(interfaceC3279cArr));
                                                                                            ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(m3061y0));
                                                                                            Iterator it11 = m3061y0.iterator();
                                                                                            while (it11.hasNext()) {
                                                                                                C1471yr c1471yr = (C1471yr) it11.next();
                                                                                                Iterator it12 = it11;
                                                                                                synchronized (c1471yr.f9778n) {
                                                                                                    d21 = d37;
                                                                                                    try {
                                                                                                        if (!c1471yr.f9778n.isEmpty() && elapsedRealtime > ((C1382w0) c1471yr.f9778n.last()).f8284a) {
                                                                                                            c1471yr.f9778n.removeLast();
                                                                                                            m1931z0(c1471yr.f9778n, elapsedRealtime, c1471yr.f9777m.get(), 5000L);
                                                                                                        }
                                                                                                        d22 = d17;
                                                                                                        double max = Math.max(c1471yr.f9775k, m1921m1(c1471yr));
                                                                                                        long j28 = c1471yr.f9776l.get();
                                                                                                        if (c1471yr.f9772h > 0) {
                                                                                                            j12 = j28;
                                                                                                            d23 = Double.valueOf((j28 / c1471yr.f9772h) * 100.0d);
                                                                                                        } else {
                                                                                                            j12 = j28;
                                                                                                            d23 = null;
                                                                                                        }
                                                                                                        String str30 = c1471yr.f9765a;
                                                                                                        String str31 = c1471yr.f9766b;
                                                                                                        int i49 = c1471yr.f9767c;
                                                                                                        if (i49 < 0) {
                                                                                                            sb = "重叠";
                                                                                                            d24 = d23;
                                                                                                            str16 = str30;
                                                                                                        } else {
                                                                                                            d24 = d23;
                                                                                                            StringBuilder sb2 = new StringBuilder();
                                                                                                            str16 = str30;
                                                                                                            sb2.append("W");
                                                                                                            sb2.append(i49);
                                                                                                            sb = sb2.toString();
                                                                                                        }
                                                                                                        String str32 = sb;
                                                                                                        String str33 = c1471yr.f9768d;
                                                                                                        String str34 = c1471yr.f9769e;
                                                                                                        if (AbstractC0444k.m937a0(str34)) {
                                                                                                            m943g0 = "-";
                                                                                                            str17 = str33;
                                                                                                        } else {
                                                                                                            m943g0 = AbstractC0444k.m943g0(AbstractC0444k.m943g0(str34, "https://"), "http://");
                                                                                                            str17 = str33;
                                                                                                            if (m943g0.length() > 40) {
                                                                                                                m943g0 = AbstractC0444k.m955s0(m943g0, 39).concat("…");
                                                                                                            }
                                                                                                        }
                                                                                                        String str35 = m943g0;
                                                                                                        String str36 = c1471yr.f9770f;
                                                                                                        int i50 = c1471yr.f9771g;
                                                                                                        long j29 = c1471yr.f9777m.get();
                                                                                                        if (d24 != null) {
                                                                                                            d25 = Double.valueOf(AbstractC2168e.m3528o(d24.doubleValue(), 0.0d, 100.0d));
                                                                                                        } else {
                                                                                                            d25 = null;
                                                                                                        }
                                                                                                        c0948hu = new C0948hu(str16, str31, str32, str17, str35, str36, i50, j12, j29, max, d25, c1471yr.f9772h, c1471yr.f9773i, c1471yr.f9774j);
                                                                                                    } catch (Throwable th2) {
                                                                                                        throw th2;
                                                                                                    }
                                                                                                }
                                                                                                arrayList3.add(c0948hu);
                                                                                                it11 = it12;
                                                                                                d37 = d21;
                                                                                                d17 = d22;
                                                                                            }
                                                                                            obj = arrayList3;
                                                                                        }
                                                                                        d26 = d37;
                                                                                        d27 = d17;
                                                                                        c1100ms3.f6047U0 = obj;
                                                                                        c1100ms3.f6049V0 = j10;
                                                                                    }
                                                                                    obj2 = c1100ms3.f6047U0;
                                                                                }
                                                                                double d38 = d11;
                                                                                c1701c0.m2751i(new C0976ir(z7, z8, d38, d19, m1928u, d20, m1895Q, m1895Q2, m3035C0, m3035C02, d15, d16, m2007y, m1942F, m1940E, r61, r62, m1997p, str6, d36, d26, d27, d18, str29, str13, obj2, c1100ms3.f6078g1, 0.0d, c1383w1.f8286a, c1100ms3.f6013D0, c1100ms3.f6027K0.get()));
                                                                                double d39 = d19;
                                                                                enumC2465a = enumC2465a4;
                                                                                d8 = d39;
                                                                                i10 = i13;
                                                                                c1100ms4 = c1100ms3;
                                                                                c1803k4 = c1803k12;
                                                                                c1803k3 = c1803k5;
                                                                                c0946hs2 = c0946hs3;
                                                                                d7 = d38;
                                                                                str = str6;
                                                                                i9 = i15;
                                                                                c1803k = c1803k6;
                                                                                c3379v = c3379v3;
                                                                                c1803k2 = c1803k7;
                                                                                j7 = j11;
                                                                                interfaceC2318h = c0946hs2.f13999f;
                                                                                AbstractC3367j.m5097b(interfaceC2318h);
                                                                                if (!AbstractC0525d0.m1140r(interfaceC2318h) && ((c1100ms4.f6073f.get() || c1100ms4.f6076g.get()) && !c1100ms4.f6079h.get())) {
                                                                                    c0946hs2.f4643h = c1100ms4;
                                                                                    c0946hs2.f4644i = c3379v;
                                                                                    c0946hs2.f4645j = c1803k;
                                                                                    c0946hs2.f4646k = c1803k2;
                                                                                    c0946hs2.f4647l = c1803k3;
                                                                                    c0946hs2.f4648m = c1803k4;
                                                                                    c0946hs2.f4649n = str;
                                                                                    c0946hs2.f4650o = j7;
                                                                                    c0946hs2.f4651p = i10;
                                                                                    c0946hs2.f4652q = i9;
                                                                                    c0946hs2.f4653r = d7;
                                                                                    double d40 = d8;
                                                                                    c0946hs2.f4654s = d40;
                                                                                    C1100ms c1100ms9 = c1100ms4;
                                                                                    c0946hs2.f4657v = 1;
                                                                                    Object m1131i = AbstractC0525d0.m1131i(j7, c0946hs2);
                                                                                    long j30 = j7;
                                                                                    enumC2465a3 = enumC2465a;
                                                                                    if (m1131i == enumC2465a3) {
                                                                                        return enumC2465a3;
                                                                                    }
                                                                                    c1100ms2 = c1100ms9;
                                                                                    d30 = d7;
                                                                                    str19 = str;
                                                                                    d31 = d40;
                                                                                    j15 = j30;
                                                                                    if (c1100ms2.f6079h.get()) {
                                                                                        str = str19;
                                                                                    }
                                                                                } else {
                                                                                    c1100ms2 = c1100ms4;
                                                                                }
                                                                            } else {
                                                                                c1100ms2 = c1100ms3;
                                                                                str = str6;
                                                                            }
                                                                        }
                                                                    }
                                                                    str12 = "正常";
                                                                    str13 = str12;
                                                                    if (!c1100ms3.f6079h.get()) {
                                                                    }
                                                                }
                                                                str13 = str14;
                                                                if (!c1100ms3.f6079h.get()) {
                                                                }
                                                            }
                                                            d19 = d14;
                                                            String str292 = str11;
                                                            if (d18 >= 0.18d) {
                                                            }
                                                            str13 = str14;
                                                            if (!c1100ms3.f6079h.get()) {
                                                            }
                                                        }
                                                    }
                                                    i15 = i14;
                                                    c1803k6 = c1803k;
                                                    c3379v3 = c3379v2;
                                                    c1803k7 = c1803k2;
                                                    j11 = j15;
                                                    List m2007y2 = c1100ms3.m2007y(j10);
                                                    if (c1100ms3.f6073f.get()) {
                                                    }
                                                    if (c1100ms3.f6076g.get()) {
                                                    }
                                                    double d362 = c1100ms3.f6088k.f2268j;
                                                    double d372 = c1100ms3.f6091l.f2268j;
                                                    d17 = c1100ms3.f6088k.f2269k;
                                                    d18 = c1100ms3.f6091l.f2269k;
                                                    if (d30 <= 0.0d) {
                                                    }
                                                    i21 = i8;
                                                    int i452 = c1100ms3.f6088k.f2267i;
                                                    if (d17 >= 0.12d) {
                                                    }
                                                    d19 = d14;
                                                    String str2922 = str11;
                                                    if (d18 >= 0.18d) {
                                                    }
                                                    str13 = str14;
                                                    if (!c1100ms3.f6079h.get()) {
                                                    }
                                                }
                                                i13 = i12;
                                                i14 = i8;
                                                c1414x1 = c1100ms3.f6033N0;
                                                synchronized (c1414x1.f8580c) {
                                                }
                                            }
                                        } else {
                                            str8 = str7;
                                            if (c1100ms3.f6076g.get()) {
                                            }
                                            i13 = i12;
                                            i14 = i8;
                                            c1414x1 = c1100ms3.f6033N0;
                                            synchronized (c1414x1.f8580c) {
                                            }
                                        }
                                    } else {
                                        d13 = d12;
                                    }
                                }
                            } else {
                                d13 = d12;
                                c1803k5 = c1803k13;
                            }
                            str8 = str7;
                            i12 = i8;
                            if (c1100ms3.f6076g.get()) {
                            }
                            i13 = i12;
                            i14 = i8;
                            c1414x1 = c1100ms3.f6033N0;
                            synchronized (c1414x1.f8580c) {
                            }
                        }
                        if (AbstractC0444k.m937a0(str)) {
                            String str37 = ((C0976ir) c1100ms2.f6084i1.getValue()).f4986s;
                            if (AbstractC0444k.m937a0(str37)) {
                                str37 = "采样循环结束";
                            }
                            str = str37;
                        }
                        String str38 = str;
                        C1701c0 c1701c02 = c1100ms2.f6084i1;
                        c1701c02.m2751i(C0976ir.m1609a((C0976ir) c1701c02.getValue(), false, false, 0.0d, 0.0d, 0.0d, 0.0d, null, c1100ms2.m1940E(), m1899U0(str38), str38, C1813u.f10860e, c1100ms2.f6013D0, c1100ms2.f6027K0.get(), 502906864));
                        return C1694m.f10482a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i8 = 0;
                AbstractC1793a0.m2972L(obj3);
                ?? obj7 = new Object();
                obj7.f16451e = c1100ms4.m2004w0();
                C1803k c1803k16 = new C1803k();
                C1803k c1803k17 = new C1803k();
                C1803k c1803k18 = new C1803k();
                C1803k c1803k19 = new C1803k();
                long m1954M0 = c1100ms4.m1954M0((C0725au) obj7.f16451e);
                long m1958O0 = c1100ms4.m1958O0((C0725au) obj7.f16451e);
                c1803k18.addLast(new C1382w0(((C0725au) obj7.f16451e).f2521c, m1954M0));
                c1803k19.addLast(new C1382w0(((C0725au) obj7.f16451e).f2521c, m1958O0));
                enumC2465a = enumC2465a2;
                c1803k = c1803k16;
                c1803k2 = c1803k17;
                c1803k3 = c1803k18;
                str = "";
                d7 = 0.0d;
                i9 = 0;
                c3379v = obj7;
                c0946hs2 = c0946hs;
                c1803k4 = c1803k19;
                j7 = j6;
                i10 = 0;
                d8 = 0.0d;
                interfaceC2318h = c0946hs2.f13999f;
                AbstractC3367j.m5097b(interfaceC2318h);
                if (!AbstractC0525d0.m1140r(interfaceC2318h)) {
                }
                c1100ms2 = c1100ms4;
                if (AbstractC0444k.m937a0(str)) {
                }
                String str382 = str;
                C1701c0 c1701c022 = c1100ms2.f6084i1;
                c1701c022.m2751i(C0976ir.m1609a((C0976ir) c1701c022.getValue(), false, false, 0.0d, 0.0d, 0.0d, 0.0d, null, c1100ms2.m1940E(), m1899U0(str382), str382, C1813u.f10860e, c1100ms2.f6013D0, c1100ms2.f6027K0.get(), 502906864));
                return C1694m.f10482a;
            }
        }
        c0946hs = new C0946hs(c1100ms4, abstractC2583c);
        Object obj32 = c0946hs.f4655t;
        EnumC2465a enumC2465a22 = EnumC2465a.f13750e;
        i7 = c0946hs.f4657v;
        if (i7 == 0) {
        }
    }

    /* renamed from: h0 */
    public static boolean m1915h0(double d7, double d8) {
        if (d8 >= 80.0d) {
            if (d7 < 1.18d * d8 && d7 < d8 + 120.0d) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final Object m1916i(C1100ms c1100ms, String str, String str2, int i7, AbstractC2590j abstractC2590j) {
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        c1100ms.getClass();
        C1694m c1694m = C1694m.f10482a;
        long j6 = i7;
        long hashCode = (Long.MAX_VALUE & ((104729 * j6) + ((str2.hashCode() * 17) + (str.hashCode() * 31)))) % 50;
        if (c1100ms.f6083i0) {
            long j7 = j6 * 80;
            if (hashCode > 40) {
                hashCode = 40;
            }
            Object m1131i = AbstractC0525d0.m1131i(j7 + hashCode, abstractC2590j);
            if (m1131i == enumC2465a) {
                return m1131i;
            }
        } else {
            Object m1131i2 = AbstractC0525d0.m1131i((j6 * 150) + hashCode, abstractC2590j);
            if (m1131i2 == enumC2465a) {
                return m1131i2;
            }
        }
        return c1694m;
    }

    /* renamed from: i0 */
    public static int m1917i0(int i7) {
        int m3530q = AbstractC2168e.m3530q(i7, 0, 1024) * 1024;
        if (m3530q < 1) {
            return 1;
        }
        return m3530q;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:41|(1:42)|43|45|46|47|48|49|50|51|53|55|56|57|(1:59)|61|62|63|64|65|66|67|68|(2:70|71)(17:72|73|74|(0)(0)|77|78|(0)(0)|81|(0)|88|(0)(0)|91|(0)|118|14|15|(1:266)(4:17|19|21|(0)(0)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:41|(1:42)|43|45|46|47|48|49|50|51|52|53|55|56|57|(1:59)|61|62|63|64|65|66|67|68|(2:70|71)(17:72|73|74|(0)(0)|77|78|(0)(0)|81|(0)|88|(0)(0)|91|(0)|118|14|15|(1:266)(4:17|19|21|(0)(0)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:41|(1:42)|43|45|46|47|48|49|50|51|52|53|54|55|56|57|(1:59)|60|61|62|63|64|65|66|67|68|(2:70|71)(17:72|73|74|(0)(0)|77|78|(0)(0)|81|(0)|88|(0)(0)|91|(0)|118|14|15|(1:266)(4:17|19|21|(0)(0)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|(1:59)|60|61|62|63|64|65|66|67|68|(2:70|71)(17:72|73|74|(0)(0)|77|78|(0)(0)|81|(0)|88|(0)(0)|91|(0)|118|14|15|(1:266)(4:17|19|21|(0)(0)))) */
    /* JADX WARN: Can't wrap try/catch for region: R(30:(1:175)|176|177|178|179|180|181|182|184|185|(1:187)(1:242)|188|189|190|191|192|193|194|195|(1:197)|198|199|200|201|202|203|204|205|206|(1:210)(17:208|209|74|(0)(0)|77|78|(0)(0)|81|(0)|88|(0)(0)|91|(0)|118|14|15|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:175|176|177|178|179|180|181|182|183|184|185|(1:187)(1:242)|188|189|190|191|192|193|194|195|(1:197)|198|199|200|201|202|203|204|205|206|(1:210)(17:208|209|74|(0)(0)|77|78|(0)(0)|81|(0)|88|(0)(0)|91|(0)|118|14|15|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:174|175|176|177|178|179|180|181|182|183|184|185|(1:187)(1:242)|188|189|190|191|192|193|194|195|(1:197)|198|199|200|201|202|203|204|205|206|(1:210)(17:208|209|74|(0)(0)|77|78|(0)(0)|81|(0)|88|(0)(0)|91|(0)|118|14|15|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0276, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02fa, code lost:
    
        r13.f6118x.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02da, code lost:
    
        r15 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x028a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x028b, code lost:
    
        r7 = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0293, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0294, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x028e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x028f, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x029b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x029c, code lost:
    
        r34 = r4;
        r33 = r6;
        r36 = r9;
        r13 = r19;
        r4 = r20;
        r35 = r21;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02ab, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02ac, code lost:
    
        r34 = r4;
        r33 = r6;
        r36 = r9;
        r6 = r13;
        r13 = r19;
        r4 = r20;
        r35 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0468, code lost:
    
        r3.f6118x.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0435, code lost:
    
        r6 = 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x043c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x043f, code lost:
    
        r10 = r44;
        r2 = r32;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x044a, code lost:
    
        r2 = r3;
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x044d, code lost:
    
        r4 = r4;
        r35 = r35;
        r13 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0446, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0447, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0457, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0458, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x056d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x056d A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x050e  */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0554 -> B:13:0x0559). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0562 -> B:14:0x012b). Please report as a decompilation issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1918j(C1100ms c1100ms, C1248rl c1248rl, String str, int i7, int i8, AbstractC2583c abstractC2583c) {
        C1038ks c1038ks;
        Object obj;
        int i9;
        long j6;
        int i10;
        int m1917i0;
        String str2;
        byte[] bArr;
        int i11;
        String str3;
        C1038ks c1038ks2;
        int i12;
        C1248rl c1248rl2;
        C1100ms c1100ms2;
        boolean z7;
        C1100ms c1100ms3;
        C1248rl c1248rl3;
        String str4;
        String str5;
        byte[] bArr2;
        Object obj2;
        Object obj3;
        int i13;
        int i14;
        int i15;
        C1409wr c1409wr;
        int i16;
        InterfaceC2318h interfaceC2318h;
        long j7;
        char c7;
        int i17;
        C1100ms c1100ms4;
        C1248rl c1248rl4;
        String str6;
        byte[] bArr3;
        String str7;
        Object obj4;
        Object obj5;
        int i18;
        InterfaceC2318h interfaceC2318h2;
        C1100ms c1100ms5;
        String str8;
        C1038ks c1038ks3;
        C1248rl c1248rl5;
        byte[] bArr4;
        String str9;
        C3006i c3006i;
        double d7;
        boolean z8;
        Object m1934B;
        Object obj6;
        String str10;
        int i19;
        C2592a0 m4189a;
        C2623x c2623x;
        C2598d0 m4681e;
        double d8;
        long nanoTime;
        C1248rl c1248rl6;
        byte[] bArr5;
        C1100ms c1100ms6;
        int i20;
        int i21;
        C1038ks c1038ks4;
        String str11;
        C1248rl c1248rl7;
        byte[] bArr6;
        C3006i c3006i2;
        double d9;
        boolean z9;
        Object m1934B2;
        C1006jr c1006jr;
        C1100ms c1100ms7;
        C2625z c2625z;
        String str12;
        C2598d0 m4681e2;
        double d10;
        long nanoTime2;
        c1100ms.getClass();
        if (abstractC2583c instanceof C1038ks) {
            c1038ks = (C1038ks) abstractC2583c;
            int i22 = c1038ks.f5340r;
            if ((i22 & Integer.MIN_VALUE) != 0) {
                c1038ks.f5340r = i22 - Integer.MIN_VALUE;
                Object obj7 = c1038ks.f5338p;
                obj = EnumC2465a.f13750e;
                i9 = c1038ks.f5340r;
                ?? r15 = 1;
                r15 = 1;
                if (i9 != 0) {
                    j6 = 0;
                    AbstractC1793a0.m2972L(obj7);
                    String str13 = c1248rl.f7390a;
                    int hashCode = str.hashCode();
                    StringBuilder sb = new StringBuilder("u|");
                    sb.append(str13);
                    sb.append("|");
                    i10 = i7;
                    sb.append(i10);
                    sb.append("|");
                    sb.append(i8);
                    sb.append("|");
                    sb.append(hashCode);
                    String sb2 = sb.toString();
                    c1100ms.m1990l1(i8, sb2, "上传", c1248rl.f7391b);
                    if (c1100ms.f6080h0) {
                        m1917i0 = 262144;
                    } else if (c1100ms.f6083i0) {
                        m1917i0 = 131072;
                    } else if (c1100ms.f6077g0) {
                        m1917i0 = m1917i0(c1100ms.f6017F0.f2356f);
                    } else {
                        m1917i0 = m1917i0(c1100ms.f6017F0.f2356f);
                    }
                    byte[] bArr7 = new byte[m1917i0];
                    for (int i23 = 0; i23 < m1917i0; i23++) {
                        bArr7[i23] = (byte) (i23 % 251);
                    }
                    str2 = sb2;
                    bArr = bArr7;
                    i11 = 0;
                    str3 = str;
                    c1038ks2 = c1038ks;
                    i12 = i8;
                    c1248rl2 = c1248rl;
                    c1100ms2 = c1100ms;
                } else if (i9 == 1) {
                    j6 = 0;
                    int i24 = c1038ks.f5337o;
                    int i25 = c1038ks.f5336n;
                    int i26 = c1038ks.f5335m;
                    byte[] bArr8 = c1038ks.f5334l;
                    String str14 = c1038ks.f5333k;
                    String str15 = c1038ks.f5332j;
                    C1248rl c1248rl8 = c1038ks.f5331i;
                    C1100ms c1100ms8 = c1038ks.f5330h;
                    AbstractC1793a0.m2972L(obj7);
                    C1038ks c1038ks5 = c1038ks;
                    i12 = i25;
                    c1100ms2 = c1100ms8;
                    str2 = str14;
                    c1038ks2 = c1038ks5;
                    str3 = str15;
                    i10 = i26;
                    c1248rl2 = c1248rl8;
                    bArr = bArr8;
                    i11 = i24;
                } else if (i9 == 2) {
                    j6 = 0;
                    i15 = c1038ks.f5337o;
                    i18 = c1038ks.f5336n;
                    int i27 = c1038ks.f5335m;
                    bArr3 = c1038ks.f5334l;
                    str6 = c1038ks.f5333k;
                    String str16 = c1038ks.f5332j;
                    c1248rl4 = c1038ks.f5331i;
                    c1100ms4 = c1038ks.f5330h;
                    AbstractC1793a0.m2972L(obj7);
                    i10 = i27;
                    obj5 = obj;
                    str7 = str16;
                    z7 = true;
                    obj4 = obj7;
                    c1409wr = (C1409wr) obj4;
                    C1038ks c1038ks6 = c1038ks;
                    i12 = i18;
                    c1100ms2 = c1100ms4;
                    str2 = str6;
                    c1038ks2 = c1038ks6;
                    String str17 = str7;
                    obj = obj5;
                    c1248rl2 = c1248rl4;
                    bArr = bArr3;
                    i16 = i10;
                    str4 = str17;
                    C0694a c0694a = c1100ms2.f6091l;
                    double d11 = c1409wr.f8521d;
                    boolean z10 = c1409wr.f8518a;
                    if (!z10) {
                    }
                    if (c1248rl2.f7392c == null) {
                    }
                    c0694a.m1486b(d11, !z10 ? 1.0d : 0.0d, z10 ? 1 : 0, c1409wr.f8520c, c1409wr.f8519b, c1248rl2.f7392c == null ? z7 : false, !z10);
                    if (c1100ms2.f6080h0) {
                        c1100ms2.f6097n.m1500b(c1409wr.f8518a);
                    }
                    c1100ms2.m1996o1(str2, c1100ms2.m2008y0(str2, c1409wr.f8518a));
                    if (!c1409wr.f8518a) {
                    }
                    interfaceC2318h = c1038ks2.f13999f;
                    AbstractC3367j.m5097b(interfaceC2318h);
                    if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                        if (!c1100ms2.f6120y.contains(c1248rl2.f7390a)) {
                        }
                    }
                    str3 = str4;
                    r15 = z7;
                    i10 = i16;
                    i11 = r0;
                } else if (i9 == 3) {
                    j6 = 0;
                    i15 = c1038ks.f5337o;
                    i14 = c1038ks.f5336n;
                    i13 = c1038ks.f5335m;
                    bArr2 = c1038ks.f5334l;
                    str5 = c1038ks.f5333k;
                    str4 = c1038ks.f5332j;
                    c1248rl3 = c1038ks.f5331i;
                    c1100ms3 = c1038ks.f5330h;
                    AbstractC1793a0.m2972L(obj7);
                    z7 = true;
                    obj3 = obj7;
                    obj2 = obj;
                    c1409wr = (C1409wr) obj3;
                    C1038ks c1038ks7 = c1038ks;
                    i12 = i14;
                    c1100ms2 = c1100ms3;
                    str2 = str5;
                    c1038ks2 = c1038ks7;
                    byte[] bArr9 = bArr2;
                    i16 = i13;
                    c1248rl2 = c1248rl3;
                    bArr = bArr9;
                    obj = obj2;
                    C0694a c0694a2 = c1100ms2.f6091l;
                    double d112 = c1409wr.f8521d;
                    boolean z102 = c1409wr.f8518a;
                    c0694a2.m1486b(d112, !z102 ? 1.0d : 0.0d, z102 ? 1 : 0, c1409wr.f8520c, c1409wr.f8519b, c1248rl2.f7392c == null ? z7 : false, !z102);
                    if (c1100ms2.f6080h0 && c1100ms2.f6076g.get() && !c1100ms2.f6079h.get()) {
                        c1100ms2.f6097n.m1500b(c1409wr.f8518a);
                    }
                    c1100ms2.m1996o1(str2, c1100ms2.m2008y0(str2, c1409wr.f8518a));
                    int i28 = !c1409wr.f8518a ? i15 + 1 : 0;
                    interfaceC2318h = c1038ks2.f13999f;
                    AbstractC3367j.m5097b(interfaceC2318h);
                    if (AbstractC0525d0.m1140r(interfaceC2318h) && c1100ms2.f6076g.get()) {
                        if (!c1100ms2.f6120y.contains(c1248rl2.f7390a)) {
                            if (!c1100ms2.f6077g0) {
                                if (c1100ms2.f6083i0) {
                                    j7 = m1893L0(c1248rl2.f7390a, i12, i28, c1409wr.f8518a);
                                } else if (c1409wr.f8518a) {
                                    j7 = 20 << (i28 > 4 ? 4 : i28);
                                    if (j7 > 500) {
                                        j7 = 500;
                                    }
                                }
                                if (j7 > j6) {
                                    c1038ks2.f5330h = c1100ms2;
                                    c1038ks2.f5331i = c1248rl2;
                                    c1038ks2.f5332j = str4;
                                    c1038ks2.f5333k = str2;
                                    c1038ks2.f5334l = bArr;
                                    c1038ks2.f5335m = i16;
                                    c1038ks2.f5336n = i12;
                                    c1038ks2.f5337o = i28;
                                    c7 = 4;
                                    c1038ks2.f5340r = 4;
                                    if (AbstractC0525d0.m1131i(j7, c1038ks2) == obj) {
                                        return obj;
                                    }
                                    int i29 = i16;
                                    i11 = i28;
                                    i17 = i29;
                                    obj = obj;
                                    str3 = str4;
                                    r15 = z7;
                                    i10 = i17;
                                }
                            }
                            j7 = j6;
                            if (j7 > j6) {
                            }
                        }
                    }
                    str3 = str4;
                    r15 = z7;
                    i10 = i16;
                    i11 = i28;
                } else {
                    if (i9 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i30 = c1038ks.f5337o;
                    int i31 = c1038ks.f5336n;
                    int i32 = c1038ks.f5335m;
                    byte[] bArr10 = c1038ks.f5334l;
                    String str18 = c1038ks.f5333k;
                    str4 = c1038ks.f5332j;
                    C1248rl c1248rl9 = c1038ks.f5331i;
                    j6 = 0;
                    C1100ms c1100ms9 = c1038ks.f5330h;
                    AbstractC1793a0.m2972L(obj7);
                    i11 = i30;
                    i17 = i32;
                    c1248rl2 = c1248rl9;
                    bArr = bArr10;
                    C1038ks c1038ks8 = c1038ks;
                    i12 = i31;
                    c1100ms2 = c1100ms9;
                    str2 = str18;
                    c1038ks2 = c1038ks8;
                    c7 = 4;
                    z7 = true;
                    obj = obj;
                    str3 = str4;
                    r15 = z7;
                    i10 = i17;
                }
                do {
                    interfaceC2318h2 = c1038ks2.f13999f;
                    AbstractC3367j.m5097b(interfaceC2318h2);
                    if (AbstractC0525d0.m1140r(interfaceC2318h2) && c1100ms2.f6076g.get() && !c1100ms2.f6079h.get()) {
                        if (!c1100ms2.f6120y.contains(c1248rl2.f7390a)) {
                            if (c1100ms2.f6080h0 && i12 < c1100ms2.f6121y0) {
                                int m1898T = m1898T(c1248rl2);
                                if (m1898T < r15) {
                                    m1898T = r15;
                                }
                                if (i12 >= c1100ms2.f6097n.m1499a(m1898T)) {
                                    c1100ms2.m1996o1(str2, "并发调度暂歇");
                                    c1038ks2.f5330h = c1100ms2;
                                    c1038ks2.f5331i = c1248rl2;
                                    c1038ks2.f5332j = str3;
                                    c1038ks2.f5333k = str2;
                                    c1038ks2.f5334l = bArr;
                                    c1038ks2.f5335m = i10;
                                    c1038ks2.f5336n = i12;
                                    c1038ks2.f5337o = i11;
                                    c1038ks2.f5340r = r15;
                                }
                            }
                            m1919k1(c1100ms2, str2, str3, i11);
                            z7 = r15;
                            Object obj8 = obj;
                            String str19 = "";
                            if (c1100ms2.f6077g0) {
                                try {
                                    try {
                                        try {
                                            try {
                                                c1038ks2.f5330h = c1100ms2;
                                                c1038ks2.f5331i = c1248rl2;
                                                c1038ks2.f5332j = str3;
                                                c1038ks2.f5333k = str2;
                                                c1038ks2.f5334l = bArr;
                                                c1038ks2.f5335m = i10;
                                                c1038ks2.f5336n = i12;
                                                c1038ks2.f5337o = i11;
                                                c1248rl6 = c1248rl2;
                                                c1038ks2.f5340r = 2;
                                                bArr5 = bArr;
                                                long j8 = c1100ms2.f6085j.get();
                                                long nanoTime3 = System.nanoTime();
                                                try {
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    i20 = i12;
                                                    i21 = i11;
                                                    c1038ks4 = c1038ks2;
                                                    str11 = str2;
                                                    c1248rl7 = c1248rl6;
                                                    bArr6 = bArr5;
                                                    c1100ms6 = c1100ms2;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    c1100ms6 = c1100ms2;
                                                }
                                                c1006jr = (C1006jr) c1100ms2.f6107r0.get(str3);
                                                c2625z = new C2625z();
                                                c2625z.m4194f(str3);
                                                str12 = str2;
                                                i20 = i12;
                                                i21 = i11;
                                                c1038ks4 = c1038ks2;
                                                c1100ms6 = c1100ms7;
                                                c1248rl7 = c1248rl6;
                                                bArr6 = bArr5;
                                                str11 = str12;
                                                nanoTime2 = System.nanoTime() - nanoTime3;
                                                if (nanoTime2 < j6) {
                                                    nanoTime2 = j6;
                                                }
                                                boolean z11 = !m4681e2.m4142c();
                                                m4681e2.close();
                                                c1100ms6.f6118x.remove(c3006i2);
                                                z9 = z11;
                                                C1100ms c1100ms10 = c1100ms6;
                                                m1934B2 = c1100ms10.m1934B(d9, j8, nanoTime3, z9);
                                                c1100ms4 = c1100ms10;
                                                obj5 = obj8;
                                                if (m1934B2 == obj5) {
                                                    return obj5;
                                                }
                                                str7 = str3;
                                                c1248rl4 = c1248rl7;
                                                str6 = str11;
                                                i18 = i20;
                                                bArr3 = bArr6;
                                                c1038ks = c1038ks4;
                                                obj4 = m1934B2;
                                                i15 = i21;
                                                c1409wr = (C1409wr) obj4;
                                                C1038ks c1038ks62 = c1038ks;
                                                i12 = i18;
                                                c1100ms2 = c1100ms4;
                                                str2 = str6;
                                                c1038ks2 = c1038ks62;
                                                String str172 = str7;
                                                obj = obj5;
                                                c1248rl2 = c1248rl4;
                                                bArr = bArr3;
                                                i16 = i10;
                                                str4 = str172;
                                                C0694a c0694a22 = c1100ms2.f6091l;
                                                double d1122 = c1409wr.f8521d;
                                                boolean z1022 = c1409wr.f8518a;
                                                if (!z1022) {
                                                }
                                                if (c1248rl2.f7392c == null) {
                                                }
                                                c0694a22.m1486b(d1122, !z1022 ? 1.0d : 0.0d, z1022 ? 1 : 0, c1409wr.f8520c, c1409wr.f8519b, c1248rl2.f7392c == null ? z7 : false, !z1022);
                                                if (c1100ms2.f6080h0) {
                                                }
                                                c1100ms2.m1996o1(str2, c1100ms2.m2008y0(str2, c1409wr.f8518a));
                                                if (!c1409wr.f8518a) {
                                                }
                                                interfaceC2318h = c1038ks2.f13999f;
                                                AbstractC3367j.m5097b(interfaceC2318h);
                                                if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                                                }
                                                str3 = str4;
                                                r15 = z7;
                                                i10 = i16;
                                                i11 = i28;
                                                interfaceC2318h2 = c1038ks2.f13999f;
                                                AbstractC3367j.m5097b(interfaceC2318h2);
                                                if (AbstractC0525d0.m1140r(interfaceC2318h2)) {
                                                    if (!c1100ms2.f6120y.contains(c1248rl2.f7390a)) {
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                if (c3006i2 != null) {
                                                    c1100ms6.f6118x.remove(c3006i2);
                                                }
                                                throw th;
                                            }
                                            m1926t(c2625z, c1006jr, new C1378vr(c1100ms7, c1248rl6, bArr5, true, str12));
                                            c2625z.m4193e(new C0916gu(str11));
                                            c2625z.m4191c("Content-Type", "application/octet-stream");
                                            c2625z.m4191c("Accept-Encoding", "identity");
                                            c2625z.m4191c("Connection", "Keep-Alive");
                                            c2625z.m4191c("Transfer-Encoding", "chunked");
                                            c2625z.m4191c("Expect", "");
                                            m1924r(c2625z, c1006jr);
                                            c3006i2 = c1100ms6.m1976e0(c1248rl7, c1100ms6.m1946H("upload", c1248rl7, i10, str3)).m4187b(c2625z.m4189a());
                                        } catch (Throwable th3) {
                                            th = th3;
                                            d10 = d9;
                                            Throwable th4 = th;
                                            try {
                                                throw th4;
                                            } catch (Throwable th5) {
                                                try {
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    d9 = d10;
                                                    String simpleName = e.getClass().getSimpleName();
                                                    String message = e.getMessage();
                                                    if (message != null) {
                                                    }
                                                    c1100ms6.m1996o1(str11, AbstractC0444k.m955s0("失败：" + simpleName + " " + str19, 80));
                                                    if (c3006i2 != null) {
                                                    }
                                                    z9 = z7;
                                                    C1100ms c1100ms102 = c1100ms6;
                                                    m1934B2 = c1100ms102.m1934B(d9, j8, nanoTime3, z9);
                                                    c1100ms4 = c1100ms102;
                                                    obj5 = obj8;
                                                    if (m1934B2 == obj5) {
                                                    }
                                                }
                                                AbstractC2168e.m3526m(m4681e2, th4);
                                                throw th5;
                                            }
                                        }
                                        d9 = nanoTime2 / 1000000.0d;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        d10 = 0.0d;
                                    }
                                    c1100ms6.f6118x.add(c3006i2);
                                    m4681e2 = c3006i2.m4681e();
                                } catch (Throwable th7) {
                                    th = th7;
                                    c1100ms6 = c1100ms7;
                                }
                                c1100ms7 = c1100ms2;
                            } else {
                                int i33 = i12;
                                int i34 = i11;
                                byte[] bArr11 = bArr;
                                String str20 = str2;
                                C1100ms c1100ms11 = c1100ms2;
                                C1248rl c1248rl10 = c1248rl2;
                                C1038ks c1038ks9 = c1038ks2;
                                c1038ks9.f5330h = c1100ms11;
                                c1038ks9.f5331i = c1248rl10;
                                c1038ks9.f5332j = str3;
                                c1038ks9.f5333k = str20;
                                c1038ks9.f5334l = bArr11;
                                c1038ks9.f5335m = i10;
                                c1038ks9.f5336n = i33;
                                c1038ks9.f5337o = i34;
                                c1038ks9.f5340r = 3;
                                long j9 = c1100ms11.f6085j.get();
                                long nanoTime4 = System.nanoTime();
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                    } catch (Exception unused) {
                                                        str8 = str3;
                                                        c1038ks3 = c1038ks9;
                                                    }
                                                    C1006jr c1006jr2 = (C1006jr) c1100ms11.f6107r0.get(str3);
                                                    c1038ks3 = c1038ks9;
                                                    C2625z c2625z2 = new C2625z();
                                                    c2625z2.m4194f(str3);
                                                    C1378vr c1378vr = new C1378vr(c1100ms11, c1248rl10, bArr11, false, str20);
                                                    m1926t(c2625z2, c1006jr2, c1378vr);
                                                    c2625z2.m4193e(new C0916gu(str9));
                                                    c2625z2.m4191c("Content-Type", "application/octet-stream");
                                                    c2625z2.m4191c("Cache-Control", "no-cache");
                                                    c2625z2.m4191c("Accept-Encoding", "identity");
                                                    c2625z2.m4191c("Connection", "Keep-Alive");
                                                    c2625z2.m4191c("Transfer-Encoding", "chunked");
                                                    c2625z2.m4191c("Expect", "");
                                                    c2625z2.m4191c("X-Upload-Stream", "1");
                                                    c2625z2.m4191c("X-Heat-Up", "1");
                                                    m1924r(c2625z2, c1006jr2);
                                                    m4189a = c2625z2.m4189a();
                                                    if (c1100ms5.f6080h0) {
                                                        c2623x = (C2623x) c1100ms5.f6093l1.getValue();
                                                    } else {
                                                        c2623x = c1100ms5.f6038Q;
                                                    }
                                                    i10 = i19;
                                                    str8 = str10;
                                                    c1248rl5 = c1248rl10;
                                                    nanoTime = System.nanoTime() - nanoTime4;
                                                    if (nanoTime < j6) {
                                                        nanoTime = j6;
                                                    }
                                                    boolean z12 = !m4681e.m4142c();
                                                    m4681e.close();
                                                    c1100ms5.f6118x.remove(c3006i);
                                                    z8 = z12;
                                                    C1100ms c1100ms12 = c1100ms5;
                                                    m1934B = c1100ms12.m1934B(d7, j9, nanoTime4, z8);
                                                    obj6 = obj8;
                                                    if (m1934B == obj6) {
                                                        return obj6;
                                                    }
                                                    int i35 = i10;
                                                    str4 = str8;
                                                    i13 = i35;
                                                    c1248rl3 = c1248rl5;
                                                    str5 = str9;
                                                    i15 = i34;
                                                    bArr2 = bArr4;
                                                    c1038ks = c1038ks3;
                                                    c1100ms3 = c1100ms12;
                                                    i14 = i33;
                                                    obj3 = m1934B;
                                                    obj2 = obj6;
                                                    c1409wr = (C1409wr) obj3;
                                                    C1038ks c1038ks72 = c1038ks;
                                                    i12 = i14;
                                                    c1100ms2 = c1100ms3;
                                                    str2 = str5;
                                                    c1038ks2 = c1038ks72;
                                                    byte[] bArr92 = bArr2;
                                                    i16 = i13;
                                                    c1248rl2 = c1248rl3;
                                                    bArr = bArr92;
                                                    obj = obj2;
                                                    C0694a c0694a222 = c1100ms2.f6091l;
                                                    double d11222 = c1409wr.f8521d;
                                                    boolean z10222 = c1409wr.f8518a;
                                                    if (!z10222) {
                                                    }
                                                    if (c1248rl2.f7392c == null) {
                                                    }
                                                    c0694a222.m1486b(d11222, !z10222 ? 1.0d : 0.0d, z10222 ? 1 : 0, c1409wr.f8520c, c1409wr.f8519b, c1248rl2.f7392c == null ? z7 : false, !z10222);
                                                    if (c1100ms2.f6080h0) {
                                                    }
                                                    c1100ms2.m1996o1(str2, c1100ms2.m2008y0(str2, c1409wr.f8518a));
                                                    if (!c1409wr.f8518a) {
                                                    }
                                                    interfaceC2318h = c1038ks2.f13999f;
                                                    AbstractC3367j.m5097b(interfaceC2318h);
                                                    if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                                                    }
                                                    str3 = str4;
                                                    r15 = z7;
                                                    i10 = i16;
                                                    i11 = i28;
                                                    interfaceC2318h2 = c1038ks2.f13999f;
                                                    AbstractC3367j.m5097b(interfaceC2318h2);
                                                    if (AbstractC0525d0.m1140r(interfaceC2318h2)) {
                                                    }
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    if (c3006i != null) {
                                                        c1100ms5.f6118x.remove(c3006i);
                                                    }
                                                    throw th;
                                                }
                                                c3006i = c1100ms5.m1956N0(c2623x, c1248rl5, c1100ms5.m1946H("upload", c1248rl5, i10, str8)).m4187b(m4189a);
                                            } catch (Throwable th9) {
                                                th = th9;
                                                d8 = d7;
                                                Throwable th10 = th;
                                                try {
                                                    throw th10;
                                                } catch (Throwable th11) {
                                                    try {
                                                    } catch (Exception unused2) {
                                                        d7 = d8;
                                                        if (c3006i != null) {
                                                        }
                                                        z8 = z7;
                                                        C1100ms c1100ms122 = c1100ms5;
                                                        m1934B = c1100ms122.m1934B(d7, j9, nanoTime4, z8);
                                                        obj6 = obj8;
                                                        if (m1934B == obj6) {
                                                        }
                                                    }
                                                    AbstractC2168e.m3526m(m4681e, th10);
                                                    throw th11;
                                                }
                                            }
                                            d7 = nanoTime / 1000000.0d;
                                        } catch (Throwable th12) {
                                            th = th12;
                                            d8 = 0.0d;
                                        }
                                        c1100ms5.f6118x.add(c3006i);
                                        m4681e = c3006i.m4681e();
                                    } catch (Throwable th13) {
                                        th = th13;
                                        c3006i = null;
                                        if (c3006i != null) {
                                        }
                                        throw th;
                                    }
                                    str10 = str3;
                                    i19 = i10;
                                    c1100ms5 = c1100ms11;
                                    bArr4 = bArr11;
                                    str9 = str20;
                                } catch (Throwable th14) {
                                    th = th14;
                                    c1100ms5 = c1100ms11;
                                }
                            }
                        }
                    }
                    c1100ms2.m1996o1(str2, "已停止");
                    return C1694m.f10482a;
                } while (AbstractC0525d0.m1131i(300L, c1038ks2) != obj);
                return obj;
            }
        }
        c1038ks = new C1038ks(c1100ms, abstractC2583c);
        Object obj72 = c1038ks.f5338p;
        obj = EnumC2465a.f13750e;
        i9 = c1038ks.f5340r;
        ?? r152 = 1;
        r152 = 1;
        if (i9 != 0) {
        }
        do {
            interfaceC2318h2 = c1038ks2.f13999f;
            AbstractC3367j.m5097b(interfaceC2318h2);
            if (AbstractC0525d0.m1140r(interfaceC2318h2)) {
            }
            c1100ms2.m1996o1(str2, "已停止");
            return C1694m.f10482a;
        } while (AbstractC0525d0.m1131i(300L, c1038ks2) != obj);
        return obj;
    }

    /* renamed from: k1 */
    public static void m1919k1(C1100ms c1100ms, String str, String str2, int i7) {
        C1471yr c1471yr = (C1471yr) c1100ms.f6037P0.get(str);
        if (c1471yr == null) {
            return;
        }
        AbstractC3367j.m5100e(str2, "<set-?>");
        c1471yr.f9769e = str2;
        c1471yr.f9770f = "";
        c1471yr.f9771g = 0;
        c1471yr.f9774j = i7;
        c1471yr.f9776l.set(0L);
        c1471yr.f9779o.set(0L);
        c1471yr.f9773i = "传输中";
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (c1471yr.f9778n) {
            c1471yr.f9778n.clear();
            c1471yr.f9775k = 0.0d;
            m1931z0(c1471yr.f9778n, elapsedRealtime, c1471yr.f9777m.get(), 5000L);
        }
    }

    /* renamed from: m0 */
    public static String m1920m0(String str) {
        String lowerCase = AbstractC0444k.m945i0(AbstractC0444k.m956t0(str).toString(), "[", "]").toLowerCase(Locale.ROOT);
        AbstractC3367j.m5099d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* renamed from: m1 */
    public static double m1921m1(C1471yr c1471yr) {
        C1803k c1803k = c1471yr.f9778n;
        if (c1803k.f10858g < 2) {
            double d7 = c1471yr.f9775k;
            if (d7 >= 0.0d) {
                return d7;
            }
        } else {
            C1382w0 c1382w0 = (C1382w0) c1803k.last();
            C1382w0 c1382w02 = (C1382w0) c1471yr.f9778n.first();
            long m1929u0 = m1929u0(c1382w0.f8285b, c1382w02.f8285b);
            long m1929u02 = m1929u0(c1382w0.f8284a, c1382w02.f8284a);
            if (m1929u0 > 0 && m1929u02 >= 80) {
                if (m1929u02 < 1) {
                    m1929u02 = 1;
                }
                return m1904a1(m1929u0, m1929u02);
            }
            double d8 = c1471yr.f9775k;
            if (d8 >= 0.0d) {
                return d8;
            }
        }
        return 0.0d;
    }

    /* renamed from: o0 */
    public static ArrayList m1922o0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1811s.m3077Y(arrayList, AbstractC0444k.m940d0((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(arrayList));
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            AbstractC0094y0.m191r((String) obj, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            String str = (String) obj2;
            if (AbstractC0451r.m971M(str, "http://", false) || AbstractC0451r.m971M(str, "https://", false)) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    /* renamed from: q */
    public static void m1923q(C2625z c2625z, C1006jr c1006jr) {
        String str;
        String str2 = "GET";
        if (c1006jr == null) {
            str = "GET";
        } else {
            str = c1006jr.m1618b();
        }
        if (str.equals("GET")) {
            c2625z.m4190b();
        } else {
            if (str.equals("HEAD")) {
                c2625z.m4192d("HEAD", null);
                return;
            }
            if (c1006jr != null) {
                str2 = c1006jr.m1618b();
            }
            c2625z.m4192d(str2, C1223qr.f7179a);
        }
    }

    /* renamed from: r */
    public static void m1924r(C2625z c2625z, C1006jr c1006jr) {
        Map map;
        if (c1006jr != null) {
            map = c1006jr.f5165c;
        } else {
            map = null;
        }
        if (map == null) {
            map = C1814v.f10861e;
        }
        for (Map.Entry entry : map.entrySet()) {
            c2625z.m4191c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: r0 */
    public static double m1925r0(C1803k c1803k, long j6, long j7) {
        Object obj;
        Object obj2;
        if (c1803k.f10858g >= 2) {
            C1382w0 c1382w0 = (C1382w0) c1803k.last();
            long j8 = j6 - 2000;
            Iterator it = c1803k.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (((C1382w0) obj2).f8284a >= j8) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            C1382w0 c1382w02 = (C1382w0) obj2;
            if (c1382w02 == null) {
                c1382w02 = (C1382w0) c1803k.first();
            }
            if (c1382w0.f8285b <= c1382w02.f8285b || c1803k.f10858g < 2) {
                return 0.0d;
            }
            C1382w0 c1382w03 = (C1382w0) c1803k.last();
            Iterator it2 = c1803k.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (j6 - ((C1382w0) next).f8284a <= 3000) {
                    obj = next;
                    break;
                }
            }
            C1382w0 c1382w04 = (C1382w0) obj;
            if (c1382w04 == null) {
                c1382w04 = (C1382w0) c1803k.first();
            }
            return m1904a1(m1929u0(c1382w03.f8285b, c1382w04.f8285b), Math.max(j7, m1929u0(c1382w03.f8284a, c1382w04.f8284a)));
        }
        return 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r2 == null) goto L10;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1926t(C2625z c2625z, C1006jr c1006jr, C1378vr c1378vr) {
        String str;
        if (c1006jr != null) {
            str = c1006jr.m1618b();
            if (str.equals("GET") || str.equals("HEAD")) {
                str = null;
            }
        }
        str = "POST";
        c2625z.m4192d(str, c1378vr);
    }

    /* renamed from: t0 */
    public static Long m1927t0(String str) {
        int m939c0;
        if (str != null && !AbstractC0444k.m937a0(str) && (m939c0 = AbstractC0444k.m939c0(str, '/', 0, 6)) >= 0 && m939c0 < AbstractC0444k.m932V(str)) {
            String substring = str.substring(m939c0 + 1);
            AbstractC3367j.m5099d(substring, "substring(...)");
            return AbstractC0451r.m974P(substring);
        }
        return null;
    }

    /* renamed from: u */
    public static double m1928u(long j6, long j7, long j8) {
        return m1904a1(j6, Math.max(1L, j8 - j7));
    }

    /* renamed from: u0 */
    public static long m1929u0(long j6, long j7) {
        if (j6 < 0 || j7 < 0 || j6 < j7) {
            return 0L;
        }
        return j6 - j7;
    }

    /* renamed from: v */
    public static C1192pr m1930v(double d7, long j6, long j7, boolean z7) {
        double d8;
        double d9;
        double d10;
        double d11 = 0.0d;
        if (j6 > 0) {
            long nanoTime = System.nanoTime() - j6;
            if (nanoTime < 0) {
                nanoTime = 0;
            }
            d8 = nanoTime / 1000000.0d;
        } else {
            d8 = 0.0d;
        }
        if (j7 > 0 && d8 > 0.0d) {
            d9 = ((j7 * 8.0d) / d8) / 1000.0d;
        } else {
            d9 = 0.0d;
        }
        if (d7 > 0.0d) {
            d10 = d7;
        } else if (j6 > 0) {
            d10 = d8;
        } else {
            d10 = 0.0d;
        }
        if (z7) {
            d11 = 1.0d;
        }
        return new C1192pr(z7, d7, d10, d9, d11, z7 ? 1 : 0);
    }

    /* renamed from: z0 */
    public static void m1931z0(C1803k c1803k, long j6, long j7, long j8) {
        c1803k.addLast(new C1382w0(j6, j7));
        while (c1803k.f10858g > 2 && j6 - ((C1382w0) c1803k.first()).f8284a > j8) {
            c1803k.removeFirst();
        }
    }

    /* renamed from: A */
    public final String m1932A() {
        String str;
        String str2;
        String str3 = "";
        if (!this.f6086j0) {
            str = "";
        } else {
            str = "，302跳转增强";
        }
        if (this.f6080h0) {
            str2 = "，极致吞吐";
        } else if (!this.f6083i0) {
            str2 = "";
        } else {
            str2 = "，单端口 H2×8/URL";
        }
        if (this.f6019G0 != EnumC1127no.f6360g) {
            str3 = "，".concat(this.f6019G0.f6365e);
        }
        return m1997p("准备测速" + str2 + str + str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1039kt m1933A0(C0725au c0725au) {
        double d7;
        double d8;
        double d9;
        List m3035C0;
        List m3035C02;
        C1039kt c1039kt;
        boolean z7;
        boolean z8;
        double d10;
        synchronized (this.f6055Y0) {
            try {
                long j6 = c0725au.f2521c;
                long m1954M0 = m1954M0(c0725au);
                long m1958O0 = m1958O0(c0725au);
                long m1929u0 = m1929u0(m1954M0, this.f6066c1);
                long m1929u02 = m1929u0(m1958O0, this.f6069d1);
                long m1929u03 = m1929u0(j6, this.f6060a1);
                long j7 = 1;
                if (m1929u03 < 1) {
                    m1929u03 = 1;
                }
                long m1929u04 = m1929u0(j6, this.f6063b1);
                if (m1929u04 < 1) {
                    m1929u04 = 1;
                }
                double d11 = 0.0d;
                if (this.f6073f.get()) {
                    d7 = m1904a1(m1929u0, m1929u03);
                } else {
                    d7 = 0.0d;
                }
                if (this.f6076g.get()) {
                    d8 = m1904a1(m1929u02, m1929u04);
                } else {
                    d8 = 0.0d;
                }
                synchronized (this.f6051W0) {
                    try {
                        if (this.f6073f.get()) {
                            if (m1929u0 > 0 && d7 > 0.0d) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                ArrayList arrayList = this.f6043S0;
                                if (d7 < 0.0d) {
                                    d10 = 0.0d;
                                } else {
                                    d10 = d7;
                                }
                                arrayList.add(Double.valueOf(d10));
                                d9 = d8;
                                long j8 = this.f6078g1;
                                if (j8 < 1) {
                                    j8 = 1;
                                }
                                int i7 = (int) (1000 / j8);
                                if (i7 < 1) {
                                    i7 = 1;
                                }
                                int i8 = i7 * 301;
                                if (i8 > 512) {
                                    i8 = 512;
                                }
                                while (arrayList.size() > i8) {
                                    arrayList.remove(0);
                                }
                                if (this.f6076g.get()) {
                                    if (m1929u02 > 0 && d9 > 0.0d) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        ArrayList arrayList2 = this.f6045T0;
                                        if (d9 >= 0.0d) {
                                            d11 = d9;
                                        }
                                        arrayList2.add(Double.valueOf(d11));
                                        long j9 = this.f6078g1;
                                        if (j9 >= 1) {
                                            j7 = j9;
                                        }
                                        int i9 = (int) (1000 / j7);
                                        if (i9 < 1) {
                                            i9 = 1;
                                        }
                                        int i10 = i9 * 301;
                                        if (i10 > 512) {
                                            i10 = 512;
                                        }
                                        while (arrayList2.size() > i10) {
                                            arrayList2.remove(0);
                                        }
                                    }
                                }
                            }
                        }
                        d9 = d8;
                        if (this.f6076g.get()) {
                        }
                    } finally {
                    }
                }
                synchronized (this.f6051W0) {
                    m3035C0 = AbstractC1805m.m3035C0(this.f6043S0);
                }
                synchronized (this.f6051W0) {
                    m3035C02 = AbstractC1805m.m3035C0(this.f6045T0);
                }
                double m1968X = m1968X(m3035C0);
                double m1968X2 = m1968X(m3035C02);
                this.f6057Z0.incrementAndGet();
                this.f6082i.get();
                this.f6085j.get();
                this.f6043S0.size();
                this.f6045T0.size();
                this.f6060a1 = j6;
                this.f6066c1 = m1954M0;
                this.f6063b1 = j6;
                this.f6069d1 = m1958O0;
                c1039kt = new C1039kt(m1954M0, m1958O0, d7, d9, m1968X, m1968X2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1039kt;
    }

    /* renamed from: B */
    public final C1409wr m1934B(double d7, long j6, long j7, boolean z7) {
        long j8 = this.f6085j.get() - j6;
        if (j8 < 0) {
            j8 = 0;
        }
        long nanoTime = System.nanoTime() - j7;
        if (nanoTime < 0) {
            nanoTime = 0;
        }
        double d8 = nanoTime / 1000000.0d;
        double d9 = 0.0d;
        if (d8 > 0.0d && j8 > 0) {
            d9 = ((j8 * 8.0d) / d8) / 1000.0d;
        }
        return new C1409wr(z7, d7, d8, d9);
    }

    /* renamed from: B0 */
    public final void m1935B0(String str, C2598d0 c2598d0) {
        long j6;
        Long m1927t0 = m1927t0(C2598d0.m4141b("Content-Range", c2598d0));
        ConcurrentHashMap concurrentHashMap = this.f6122z;
        if (m1927t0 != null) {
            long longValue = m1927t0.longValue();
            if (longValue > 0) {
                concurrentHashMap.put(str, Long.valueOf(longValue));
                return;
            }
            return;
        }
        AbstractC2602f0 abstractC2602f0 = c2598d0.f14062k;
        if (abstractC2602f0 != null) {
            j6 = abstractC2602f0.mo4144c();
        } else {
            j6 = -1;
        }
        if (j6 > 0 && c2598d0.f14059h != 206) {
            concurrentHashMap.put(str, Long.valueOf(j6));
        }
    }

    /* renamed from: C */
    public final void m1936C(String str) {
        String str2;
        String str3;
        ConcurrentHashMap.KeySetView keySetView = this.f6114v;
        AbstractC3367j.m5099d(keySetView, "activeDownloadCalls");
        for (C3006i c3006i : AbstractC1805m.m3035C0(keySetView)) {
            AbstractC3367j.m5097b(c3006i);
            C0916gu c0916gu = (C0916gu) C0916gu.class.cast(c3006i.f15495f.f14022e.get(C0916gu.class));
            if (c0916gu != null && (str3 = c0916gu.f4386a) != null && m1908c0(str3, str)) {
                try {
                    c3006i.m4680d();
                } catch (Throwable th) {
                    AbstractC1793a0.m2985m(th);
                }
                keySetView.remove(c3006i);
            }
        }
        ConcurrentHashMap.KeySetView keySetView2 = this.f6118x;
        AbstractC3367j.m5099d(keySetView2, "activeUploadCalls");
        for (C3006i c3006i2 : AbstractC1805m.m3035C0(keySetView2)) {
            AbstractC3367j.m5097b(c3006i2);
            C0916gu c0916gu2 = (C0916gu) C0916gu.class.cast(c3006i2.f15495f.f14022e.get(C0916gu.class));
            if (c0916gu2 != null && (str2 = c0916gu2.f4386a) != null && m1908c0(str2, str)) {
                try {
                    c3006i2.m4680d();
                } catch (Throwable th2) {
                    AbstractC1793a0.m2985m(th2);
                }
                keySetView2.remove(c3006i2);
            }
        }
    }

    /* renamed from: C0 */
    public final void m1937C0(String str, HttpURLConnection httpURLConnection) {
        Long m1927t0 = m1927t0(httpURLConnection.getHeaderField("Content-Range"));
        ConcurrentHashMap concurrentHashMap = this.f6122z;
        if (m1927t0 != null) {
            long longValue = m1927t0.longValue();
            if (longValue > 0) {
                concurrentHashMap.put(str, Long.valueOf(longValue));
                return;
            }
            return;
        }
        long contentLengthLong = httpURLConnection.getContentLengthLong();
        if (contentLengthLong > 0 && httpURLConnection.getResponseCode() != 206) {
            concurrentHashMap.put(str, Long.valueOf(contentLengthLong));
        }
    }

    /* renamed from: D */
    public final void m1938D(int i7, boolean z7) {
        int max;
        int max2;
        int i8 = 32;
        int m3530q = AbstractC2168e.m3530q(this.f6017F0.f2358h, 32, 256);
        if (i7 <= 1) {
            i7 = 1;
        }
        int i9 = i7 * 32;
        int m3530q2 = AbstractC2168e.m3530q(i9, 32, m3530q);
        int m3530q3 = AbstractC2168e.m3530q(i9, 32, m3530q);
        int m3530q4 = AbstractC2168e.m3530q(this.f6011C0.f2849d, 32, m3530q);
        if (this.f6077g0) {
            i8 = AbstractC2168e.m3530q(this.f6017F0.f2357g, 1, this.f6017F0.f2358h);
        }
        if (!z7 ? (max = Math.max(m3530q2, i8)) > m3530q : (max = Math.max(m3530q2, Math.max(m3530q4, i8))) > m3530q) {
            max = m3530q;
        }
        if (!z7 ? (max2 = Math.max(m3530q3, i8)) <= m3530q : (max2 = Math.max(m3530q3, Math.max(m3530q4, i8))) <= m3530q) {
            m3530q = max2;
        }
        int m3530q5 = AbstractC2168e.m3530q(i7 * 64, 64, 256);
        ExecutorService executorService = this.f6058a;
        executorService.shutdownNow();
        try {
            executorService.awaitTermination(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AbstractC1793a0.m2985m(th);
        }
        ExecutorService executorService2 = this.f6064c;
        executorService2.shutdownNow();
        try {
            executorService2.awaitTermination(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            AbstractC1793a0.m2985m(th2);
        }
        C1247rk c1247rk = f5998o1;
        this.f6058a = Executors.newFixedThreadPool(max, C1247rk.m2187h(c1247rk, "SpeedDown"));
        this.f6123z0 = max;
        this.f6061b = new C0576u0(this.f6058a);
        this.f6064c = Executors.newFixedThreadPool(m3530q, C1247rk.m2187h(c1247rk, "SpeedUp"));
        this.f6007A0 = m3530q;
        this.f6067d = new C0576u0(this.f6064c);
        this.f6028L.m4161e(m3530q5);
        this.f6028L.m4162f(m3530q5);
        this.f6030M.m4161e(m3530q5);
        this.f6030M.m4162f(m3530q5);
        C2610k c2610k = f5999p1;
        c2610k.m4161e(m3530q5);
        c2610k.m4162f(m3530q5);
        C2610k c2610k2 = f6000q1;
        c2610k2.m4161e(m3530q5);
        c2610k2.m4162f(m3530q5);
    }

    /* renamed from: D0 */
    public final void m1939D0(String str) {
        Object obj;
        boolean z7;
        int i7;
        String concat;
        Object obj2;
        Object obj3;
        AbstractC3367j.m5100e(str, "targetId");
        if (AbstractC0444k.m937a0(str)) {
            return;
        }
        Iterator it = this.f6109s0.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3367j.m5096a(((C1248rl) obj).f7390a, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1248rl c1248rl = (C1248rl) obj;
        if (c1248rl == null) {
            Iterator it2 = this.f6095m0.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (AbstractC3367j.m5096a(((C1248rl) obj2).f7390a, str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            c1248rl = (C1248rl) obj2;
            if (c1248rl == null) {
                Iterator it3 = this.f6098n0.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        if (AbstractC3367j.m5096a(((C1248rl) obj3).f7390a, str)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                c1248rl = (C1248rl) obj3;
            }
        }
        this.f6120y.add(str);
        int i8 = 0;
        if (c1248rl != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        Set keySet = this.f6037P0.keySet();
        AbstractC3367j.m5099d(keySet, "<get-keys>(...)");
        Set<String> set = keySet;
        if ((set instanceof Collection) && set.isEmpty()) {
            i7 = 0;
        } else {
            i7 = 0;
            for (String str2 : set) {
                AbstractC3367j.m5097b(str2);
                if (m1908c0(str2, str) && (i7 = i7 + 1) < 0) {
                    AbstractC1806n.m3071S();
                    throw null;
                }
            }
        }
        List list = this.f6109s0;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list) {
            if (!AbstractC3367j.m5096a(((C1248rl) obj4).f7390a, str)) {
                arrayList.add(obj4);
            }
        }
        this.f6109s0 = arrayList;
        List list2 = this.f6095m0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : list2) {
            if (!AbstractC3367j.m5096a(((C1248rl) obj5).f7390a, str)) {
                arrayList2.add(obj5);
            }
        }
        this.f6095m0 = arrayList2;
        List list3 = this.f6098n0;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj6 : list3) {
            if (!AbstractC3367j.m5096a(((C1248rl) obj6).f7390a, str)) {
                arrayList3.add(obj6);
            }
        }
        this.f6098n0 = arrayList3;
        if (c1248rl != null) {
            int m1953M = this.f6117w0 - m1953M(c1248rl);
            if (m1953M < 0) {
                m1953M = 0;
            }
            this.f6117w0 = m1953M;
            int m1974c1 = this.f6121y0 - m1974c1(c1248rl);
            if (m1974c1 >= 0) {
                i8 = m1974c1;
            }
            this.f6121y0 = i8;
        }
        m1936C(str);
        Set keySet2 = this.f6037P0.keySet();
        AbstractC3367j.m5099d(keySet2, "<get-keys>(...)");
        Iterator it4 = keySet2.iterator();
        while (it4.hasNext()) {
            String str3 = (String) it4.next();
            AbstractC3367j.m5100e(str3, "key");
            if (m1908c0(str3, str)) {
                it4.remove();
            }
        }
        synchronized (this.f6053X0) {
            this.f6100o.remove(str);
            this.f6102p.remove(str);
            this.f6104q.remove(str);
            this.f6106r.remove(str);
            this.f6110t.remove(str);
        }
        this.f6108s.remove(str);
        m1960R();
        if (c1248rl == null || (concat = AbstractC1249rm.m2251b0(c1248rl)) == null) {
            concat = "id=".concat(str);
        }
        AbstractC1249rm.m2261g0("REMOVE " + concat + " hadTarget=" + z7 + " workers_cleared=" + i7);
    }

    /* renamed from: E */
    public final List m1940E() {
        List m3035C0;
        synchronized (this.f6035O0) {
            m3035C0 = AbstractC1805m.m3035C0(this.f6035O0);
        }
        return m3035C0;
    }

    /* renamed from: E0 */
    public final void m1941E0() {
        this.f6072e1 = 0.0d;
        this.f6075f1 = 0.0d;
    }

    /* renamed from: F */
    public final long m1942F(long j6) {
        long j7;
        long j8;
        Long valueOf = Long.valueOf(this.f6056Z);
        Long l7 = null;
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            j7 = valueOf.longValue();
        } else {
            j7 = Long.MAX_VALUE;
        }
        Long valueOf2 = Long.valueOf(this.f6059a0);
        if (valueOf2.longValue() <= 0) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            j8 = valueOf2.longValue();
        } else {
            j8 = Long.MAX_VALUE;
        }
        long min = Math.min(j7, j8);
        if (min == Long.MAX_VALUE) {
            return 0L;
        }
        if (!this.f6073f.get() && !this.f6076g.get()) {
            Long valueOf3 = Long.valueOf(Math.max(this.f6062b0, this.f6065c0));
            if (valueOf3.longValue() > 0) {
                l7 = valueOf3;
            }
            if (l7 != null) {
                j6 = l7.longValue();
            }
        }
        long j9 = j6 - min;
        if (j9 < 0) {
            return 0L;
        }
        return j9;
    }

    /* renamed from: F0 */
    public final void m1943F0(C0725au c0725au) {
        synchronized (this.f6055Y0) {
            long j6 = c0725au.f2521c;
            this.f6060a1 = j6;
            this.f6063b1 = j6;
            this.f6066c1 = m1954M0(c0725au);
            this.f6069d1 = m1958O0(c0725au);
        }
    }

    /* renamed from: G */
    public final double m1944G(double d7) {
        long j6 = this.f6078g1;
        if (j6 >= 1000) {
            return d7;
        }
        return 1.0d - Math.pow(1.0d - d7, j6 / 1000.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x004e, code lost:
    
        if (r8 == 206) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r1 != null) goto L53;
     */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EnumC0736b9 m1945G0(C1248rl c1248rl, String str) {
        int responseCode;
        EnumC0736b9 enumC0736b9 = EnumC0736b9.f2628e;
        if (this.f6083i0) {
            return enumC0736b9;
        }
        EnumC0736b9 enumC0736b92 = (EnumC0736b9) this.f6006A.get(str);
        if (enumC0736b92 != null) {
            return enumC0736b92;
        }
        EnumC0736b9 enumC0736b93 = (EnumC0736b9) this.f6008B.get(str);
        if (enumC0736b93 != null) {
            return enumC0736b93;
        }
        C1006jr c1006jr = (C1006jr) this.f6105q0.get(str);
        if (c1006jr != null && (!AbstractC0444k.m937a0(c1006jr.f5164b) || !c1006jr.f5165c.isEmpty())) {
            return enumC0736b9;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = m2001s0(c1248rl, str, "HEAD");
            responseCode = httpURLConnection.getResponseCode();
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable th2) {
                    AbstractC1793a0.m2985m(th2);
                }
            }
            throw th;
        }
        if (200 <= responseCode) {
            if (responseCode < 300) {
                long contentLengthLong = httpURLConnection.getContentLengthLong();
                String headerField = httpURLConnection.getHeaderField("Transfer-Encoding");
                boolean z7 = false;
                if (headerField != null && AbstractC0444k.m928R(headerField, "chunked", true)) {
                    z7 = true;
                }
                if (contentLengthLong < 0 || z7) {
                    enumC0736b9 = EnumC0736b9.f2629f;
                }
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable th3) {
                    AbstractC1793a0.m2985m(th3);
                }
                this.f6008B.put(str, enumC0736b9);
                return enumC0736b9;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map, java.lang.Object] */
    /* renamed from: H */
    public final C1203q7 m1946H(String str, C1248rl c1248rl, int i7, String str2) {
        String m1910d1;
        String m2226J0 = AbstractC1249rm.m2226J0(i7, str, c1248rl.f7390a, str2);
        String str3 = (String) this.f6023I0.get(m2226J0);
        if (str3 == null) {
            return null;
        }
        if (AbstractC0444k.m937a0(str3)) {
            str3 = null;
        }
        if (str3 == null || (m1910d1 = m1910d1(str2)) == null) {
            return null;
        }
        return new C1203q7(m2226J0, m1910d1, str3);
    }

    /* renamed from: I */
    public final String m1947I(String str, Network network) {
        int identityHashCode = System.identityHashCode(network);
        String name = this.f6019G0.name();
        String m2387a = this.f6021H0.m2387a();
        String m1920m0 = m1920m0(str);
        StringBuilder sb = new StringBuilder();
        sb.append(identityHashCode);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(m2387a);
        return AbstractC2487d.m4046j(sb, "|", m1920m0);
    }

    /* renamed from: I0 */
    public final boolean m1948I0(C1248rl c1248rl) {
        boolean z7;
        AbstractC3367j.m5100e(c1248rl, "target");
        if (AbstractC0444k.m937a0(c1248rl.f7390a)) {
            if (!Log.isLoggable("HBCS-NetIface", 3)) {
                return false;
            }
            Log.d("HBCS-NetIface", "RESTART skip blank_id");
            return false;
        }
        List list = this.f6109s0;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC3367j.m5096a(((C1248rl) it.next()).f7390a, c1248rl.f7390a)) {
                    break;
                }
            }
        }
        List list2 = this.f6095m0;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (AbstractC3367j.m5096a(((C1248rl) it2.next()).f7390a, c1248rl.f7390a)) {
                    break;
                }
            }
        }
        List list3 = this.f6098n0;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                if (AbstractC3367j.m5096a(((C1248rl) it3.next()).f7390a, c1248rl.f7390a)) {
                    z7 = true;
                }
            }
        }
        z7 = false;
        if (z7 && (this.f6073f.get() || this.f6076g.get())) {
            AbstractC1249rm.m2261g0("RESTART begin " + AbstractC1249rm.m2251b0(c1248rl));
            m1939D0(c1248rl.f7390a);
            AbstractC0525d0.m1141s(this.f6070e, null, new C0062p0(this, c1248rl, (InterfaceC2313c) null, 16), 3);
            return true;
        }
        AbstractC1249rm.m2241T("RESTART skip " + AbstractC1249rm.m2251b0(c1248rl) + " known=" + z7 + " runDown=" + this.f6073f.get() + " runUp=" + this.f6076g.get());
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|8|(1:(1:(5:12|13|14|(3:16|17|18)|20)(2:35|36))(4:37|38|39|40))(7:56|57|58|59|60|61|(4:71|72|73|74)(3:65|(1:67)|49))|(3:42|43|18)|20))|88|6|7|8|(0)(0)|(0)|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d5, code lost:
    
        p060h5.AbstractC1793a0.m2985m(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0065  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1949J(C1248rl c1248rl, String str, String str2, AbstractC2583c abstractC2583c) {
        C0723as c0723as;
        int i7;
        C1100ms c1100ms;
        C1100ms c1100ms2;
        String str3;
        HttpURLConnection httpURLConnection;
        Throwable th;
        int responseCode;
        C1100ms c1100ms3;
        HttpURLConnection httpURLConnection2;
        ConcurrentHashMap.KeySetView keySetView = this.f6116w;
        if (abstractC2583c instanceof C0723as) {
            c0723as = (C0723as) abstractC2583c;
            int i8 = c0723as.f2511m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0723as.f2511m = i8 - Integer.MIN_VALUE;
                C0723as c0723as2 = c0723as;
                Object obj = c0723as2.f2509k;
                i7 = c0723as2.f2511m;
                C1694m c1694m = C1694m.f10482a;
                HttpURLConnection httpURLConnection3 = null;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            httpURLConnection3 = (HttpURLConnection) c0723as2.f2507i;
                            c1100ms = c0723as2.f2506h;
                            try {
                                AbstractC1793a0.m2972L(obj);
                                if (httpURLConnection3 != null) {
                                    c1100ms.f6116w.remove(httpURLConnection3);
                                    httpURLConnection3.disconnect();
                                }
                                return c1694m;
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                if (httpURLConnection3 != null) {
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        httpURLConnection2 = c0723as2.f2508j;
                        str3 = (String) c0723as2.f2507i;
                        C1100ms c1100ms4 = c0723as2.f2506h;
                        try {
                            AbstractC1793a0.m2972L(obj);
                            c1100ms3 = c1100ms4;
                        } catch (Exception unused) {
                            httpURLConnection = httpURLConnection2;
                            c1100ms2 = c1100ms4;
                            try {
                                c1100ms2.m1996o1(str3, "失败");
                                c0723as2.f2506h = c1100ms2;
                                c0723as2.f2507i = httpURLConnection;
                                c0723as2.f2508j = null;
                                c0723as2.f2511m = 2;
                                if (AbstractC0525d0.m1131i(120L, c0723as2) != enumC2465a) {
                                }
                                return enumC2465a;
                            } catch (Throwable th3) {
                                th = th3;
                                c1100ms = c1100ms2;
                                httpURLConnection3 = httpURLConnection;
                                th = th;
                                if (httpURLConnection3 != null) {
                                    c1100ms.f6116w.remove(httpURLConnection3);
                                    try {
                                        httpURLConnection3.disconnect();
                                        throw th;
                                    } catch (Throwable th4) {
                                        AbstractC1793a0.m2985m(th4);
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            httpURLConnection3 = httpURLConnection2;
                            c1100ms = c1100ms4;
                            if (httpURLConnection3 != null) {
                            }
                        }
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    try {
                        httpURLConnection = m2001s0(c1248rl, str, "GET");
                        try {
                            keySetView.add(httpURLConnection);
                            responseCode = httpURLConnection.getResponseCode();
                        } catch (Exception unused2) {
                            c1100ms2 = this;
                            str3 = str2;
                            c1100ms2.m1996o1(str3, "失败");
                            c0723as2.f2506h = c1100ms2;
                            c0723as2.f2507i = httpURLConnection;
                            c0723as2.f2508j = null;
                            c0723as2.f2511m = 2;
                            if (AbstractC0525d0.m1131i(120L, c0723as2) != enumC2465a) {
                                c1100ms = c1100ms2;
                                httpURLConnection3 = httpURLConnection;
                                if (httpURLConnection3 != null) {
                                }
                                return c1694m;
                            }
                            return enumC2465a;
                        } catch (Throwable th6) {
                            c1100ms = this;
                            th = th6;
                            httpURLConnection3 = httpURLConnection;
                            if (httpURLConnection3 != null) {
                            }
                        }
                    } catch (Exception unused3) {
                        c1100ms2 = this;
                        str3 = str2;
                        httpURLConnection = null;
                    } catch (Throwable th7) {
                        th = th7;
                        c1100ms = this;
                        th = th;
                        if (httpURLConnection3 != null) {
                        }
                    }
                    if ((200 > responseCode || responseCode >= 300) && responseCode != 206) {
                        keySetView.remove(httpURLConnection);
                        try {
                            httpURLConnection.disconnect();
                            return c1694m;
                        } catch (Throwable th8) {
                            AbstractC1793a0.m2985m(th8);
                            return c1694m;
                        }
                    }
                    m1937C0(str, httpURLConnection);
                    long m1957O = m1957O(httpURLConnection.getContentLengthLong(), str);
                    m1994n1(m1957O, str2);
                    InputStream inputStream = httpURLConnection.getInputStream();
                    AbstractC3367j.m5099d(inputStream, "getInputStream(...)");
                    long nanoTime = System.nanoTime();
                    C1036kq c1036kq = new C1036kq(4);
                    c0723as2.f2506h = this;
                    c0723as2.f2507i = str2;
                    c0723as2.f2508j = httpURLConnection;
                    c0723as2.f2511m = 1;
                    if (m1955N(c1248rl, inputStream, m1957O, nanoTime, str2, c1036kq, c0723as2) != enumC2465a) {
                        c1100ms3 = this;
                        httpURLConnection2 = httpURLConnection;
                    }
                    return enumC2465a;
                }
                if (httpURLConnection2 != null) {
                    c1100ms3.f6116w.remove(httpURLConnection2);
                    httpURLConnection2.disconnect();
                }
                return c1694m;
            }
        }
        c0723as = new C0723as(this, abstractC2583c);
        C0723as c0723as22 = c0723as;
        Object obj2 = c0723as22.f2509k;
        i7 = c0723as22.f2511m;
        C1694m c1694m2 = C1694m.f10482a;
        HttpURLConnection httpURLConnection32 = null;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        if (i7 == 0) {
        }
        if (httpURLConnection2 != null) {
        }
        return c1694m2;
    }

    /* renamed from: J0 */
    public final C0706ab m1950J0(C0706ab c0706ab) {
        boolean z7;
        int m3530q = AbstractC2168e.m3530q(c0706ab.f2351a, 1, 128);
        int m3530q2 = AbstractC2168e.m3530q(c0706ab.f2352b, m3530q, 128);
        int m3530q3 = AbstractC2168e.m3530q(c0706ab.f2353c, 1, 128);
        int m3530q4 = AbstractC2168e.m3530q(c0706ab.f2354d, m3530q3, 128);
        int m3530q5 = AbstractC2168e.m3530q(c0706ab.f2355e, 0, 1024);
        int m3530q6 = AbstractC2168e.m3530q(c0706ab.f2356f, 0, 1024);
        int m3530q7 = AbstractC2168e.m3530q(c0706ab.f2357g, 1, 256);
        int m3530q8 = AbstractC2168e.m3530q(c0706ab.f2358h, 32, 256);
        if (!c0706ab.f2359i && !this.f6083i0) {
            z7 = false;
        } else {
            z7 = true;
        }
        return new C0706ab(m3530q, m3530q2, m3530q3, m3530q4, m3530q5, m3530q6, m3530q7, m3530q8, z7, m1891H0(c0706ab.f2360j));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: K */
    public final java.lang.Object m1951K(p039e5.C1248rl r19, java.lang.String r20, java.lang.String r21, p098m5.AbstractC2583c r22) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p039e5.C1100ms.m1951K(e5.rl, java.lang.String, java.lang.String, m5.c):java.lang.Object");
    }

    /* renamed from: K0 */
    public final void m1952K0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1389w7 c1389w7 = (C1389w7) it.next();
            if (!c1389w7.f8309c.isEmpty()) {
                String m1947I = m1947I(c1389w7.f8307a, c1389w7.f8308b);
                ArrayList arrayList = c1389w7.f8309c;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    String hostAddress = ((InetAddress) obj).getHostAddress();
                    if (hostAddress == null) {
                        hostAddress = "";
                    }
                    if (hashSet.add(hostAddress)) {
                        arrayList2.add(obj);
                    }
                }
                this.f6039Q0.put(m1947I, arrayList2);
            }
        }
    }

    /* renamed from: M */
    public final int m1953M(C1248rl c1248rl) {
        List list = (List) this.f6111t0.get(c1248rl.f7390a);
        if (list == null) {
            list = this.f6101o0;
        }
        if (list.isEmpty()) {
            list = null;
        }
        int i7 = 0;
        if (list == null) {
            return 0;
        }
        int size = list.size() * m1988l(c1248rl);
        if (!this.f6083i0) {
            i7 = AbstractC2168e.m3530q((int) (size * 0.0d), 0, 0);
        }
        return i7 + size;
    }

    /* renamed from: M0 */
    public final long m1954M0(C0725au c0725au) {
        long j6;
        long j7 = c0725au.f2519a;
        long j8 = this.f6052X;
        if (j8 >= 0 && j7 >= j8) {
            j6 = j7 - j8;
        } else {
            j6 = 0;
        }
        if (j7 >= 0 && j8 >= 0) {
            return j6;
        }
        return this.f6082i.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
    
        if (r12 >= 50331648) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec A[Catch: all -> 0x006f, TryCatch #1 {all -> 0x006f, blocks: (B:3:0x000a, B:6:0x0020, B:7:0x0028, B:9:0x0034, B:11:0x003c, B:13:0x0044, B:15:0x0050, B:19:0x005a, B:22:0x0066, B:23:0x0073, B:25:0x0086, B:26:0x008f, B:28:0x0093, B:29:0x009a, B:38:0x0128, B:39:0x012d, B:46:0x0135, B:42:0x0156, B:49:0x00b5, B:53:0x00be, B:55:0x00c8, B:57:0x00dc, B:60:0x00ec, B:63:0x00ff, B:69:0x0108, B:74:0x0116, B:80:0x0097, B:90:0x0011, B:93:0x0018), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff A[Catch: all -> 0x006f, TryCatch #1 {all -> 0x006f, blocks: (B:3:0x000a, B:6:0x0020, B:7:0x0028, B:9:0x0034, B:11:0x003c, B:13:0x0044, B:15:0x0050, B:19:0x005a, B:22:0x0066, B:23:0x0073, B:25:0x0086, B:26:0x008f, B:28:0x0093, B:29:0x009a, B:38:0x0128, B:39:0x012d, B:46:0x0135, B:42:0x0156, B:49:0x00b5, B:53:0x00be, B:55:0x00c8, B:57:0x00dc, B:60:0x00ec, B:63:0x00ff, B:69:0x0108, B:74:0x0116, B:80:0x0097, B:90:0x0011, B:93:0x0018), top: B:2:0x000a }] */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1421x8 m1955N(C1248rl c1248rl, InputStream inputStream, long j6, long j7, String str, InterfaceC3277a interfaceC3277a, AbstractC2583c abstractC2583c) {
        int m1917i0;
        int read;
        boolean z7;
        double d7;
        double d8;
        Double d9;
        try {
            if (this.f6080h0) {
                m1917i0 = 262144;
            } else if (this.f6083i0) {
                m1917i0 = 131072;
            } else {
                m1917i0 = m1917i0(this.f6017F0.f2355e);
            }
            byte[] bArr = new byte[m1917i0];
            long j8 = 0;
            double d10 = 0.0d;
            boolean z8 = false;
            while (AbstractC0525d0.m1140r(abstractC2583c.mo662j()) && this.f6073f.get() && !this.f6079h.get()) {
                if (this.f6120y.contains(c1248rl.f7390a) || (read = inputStream.read(bArr)) <= 0) {
                    break;
                }
                if (j8 == 0) {
                    long nanoTime = System.nanoTime() - j7;
                    if (nanoTime < 0) {
                        nanoTime = 0;
                    }
                    d10 = nanoTime / 1000000.0d;
                }
                long j9 = read;
                j8 += j9;
                this.f6082i.addAndGet(j9);
                AtomicLong atomicLong = (AtomicLong) this.f6100o.get(c1248rl.f7390a);
                if (atomicLong != null) {
                    new Long(atomicLong.addAndGet(j9));
                }
                if (this.f6080h0) {
                    m1985j1(j9, str);
                } else {
                    m1983i1(j9, str);
                }
                if (this.f6080h0) {
                    if (j6 >= 1048576) {
                        long j10 = j6 - j8;
                        if (j10 > 0) {
                            if (str != null) {
                                C1471yr c1471yr = (C1471yr) this.f6037P0.get(str);
                                if (c1471yr != null) {
                                    d7 = 0.88d;
                                    d9 = Double.valueOf(c1471yr.f9775k);
                                } else {
                                    d7 = 0.88d;
                                    d9 = null;
                                }
                                if (d9 != null) {
                                    d8 = d9.doubleValue();
                                    if (d8 <= 0.0d) {
                                        if (j10 / (d8 * 125.0d) <= 1500.0d) {
                                        }
                                        z7 = false;
                                    } else {
                                        if (j8 >= ((long) (j6 * d7))) {
                                        }
                                        z7 = false;
                                    }
                                }
                            } else {
                                d7 = 0.88d;
                            }
                            d8 = 0.0d;
                            if (d8 <= 0.0d) {
                            }
                        }
                        z7 = true;
                    }
                } else {
                    if (!this.f6083i0) {
                        if (j6 >= 1048576) {
                            if (j8 >= ((long) (j6 * 0.88d))) {
                                z7 = true;
                            }
                        } else if (j8 >= 50331648) {
                            z7 = true;
                        }
                    }
                    z7 = false;
                }
                if (!z8 && z7) {
                    interfaceC3277a.mo52a();
                    z8 = true;
                }
                if (this.f6089k0.f5974c > 0.0d) {
                    m1902Z0(this.f6082i.get() + this.f6085j.get(), Math.min(this.f6056Z, this.f6059a0), this.f6089k0.f5974c);
                } else {
                    m1902Z0(this.f6082i.get(), this.f6056Z, this.f6089k0.f5972a);
                }
            }
            AbstractC2168e.m3526m(inputStream, null);
            return new C1421x8(j8, d10);
        } finally {
        }
    }

    /* renamed from: N0 */
    public final C2623x m1956N0(C2623x c2623x, C1248rl c1248rl, C1203q7 c1203q7) {
        int m1891H0;
        String str;
        SocketFactory socketFactory;
        SocketFactory m1982h1;
        C1248rl m1984j0 = m1984j0(c1248rl);
        Network network = m1984j0.f7392c;
        if (!this.f6083i0) {
            m1891H0 = 0;
        } else {
            m1891H0 = m1891H0(this.f6017F0.f2360j);
        }
        if (m1979f1(m1984j0) && c1203q7 == null && m1891H0 == 0) {
            return c2623x;
        }
        int identityHashCode = System.identityHashCode(c2623x);
        String m1970Y0 = m1970Y0(m1984j0);
        String str2 = null;
        if (c1203q7 != null) {
            str = c1203q7.f7045a;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        if (c1203q7 != null) {
            str2 = c1203q7.f7047c;
        }
        if (str2 != null) {
            str3 = str2;
        }
        String str4 = identityHashCode + "|" + m1970Y0 + "|" + str + "|" + str3 + "|lp=" + m1891H0;
        ConcurrentHashMap concurrentHashMap = this.f6014E;
        Object obj = concurrentHashMap.get(str4);
        if (obj == null) {
            C2622w m4186a = c2623x.m4186a();
            SocketFactory socketFactory2 = c2623x.f14213r;
            if (network != null || m1891H0 > 0) {
                if (network != null) {
                    socketFactory = network.getSocketFactory();
                } else {
                    socketFactory = socketFactory2;
                }
                if (m1891H0 > 0) {
                    AbstractC3367j.m5097b(socketFactory);
                    m1982h1 = m1982h1(new C1254rr(socketFactory, 1048576), m1891H0);
                } else if (socketFactory2 instanceof C1254rr) {
                    AbstractC3367j.m5097b(socketFactory);
                    m1982h1 = m1982h1(new C1254rr(socketFactory, 4194304), m1891H0);
                } else {
                    AbstractC3367j.m5097b(socketFactory);
                    m1982h1 = m1982h1(socketFactory, m1891H0);
                }
                m4186a.m4184e(m1982h1);
            }
            if (m1891H0 > 0) {
                m4186a.m4182c(AbstractC1806n.m3067O(EnumC2624y.f14225i, EnumC2624y.f14223g));
            }
            TimeUnit timeUnit = TimeUnit.MINUTES;
            m4186a.f14167b = new C0019e1(64);
            m4186a.m4181b(new C0427s(c1203q7, this, network, m1891H0));
            C2623x c2623x2 = new C2623x(m4186a);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str4, c2623x2);
            if (putIfAbsent == null) {
                obj = c2623x2;
            } else {
                obj = putIfAbsent;
            }
        }
        return (C2623x) obj;
    }

    /* renamed from: O */
    public final long m1957O(long j6, String str) {
        Long l7 = (Long) this.f6122z.get(str);
        if (l7 != null) {
            return l7.longValue();
        }
        return j6;
    }

    /* renamed from: O0 */
    public final long m1958O0(C0725au c0725au) {
        long j6;
        long j7 = c0725au.f2520b;
        long j8 = this.f6054Y;
        if (j8 >= 0 && j7 >= j8) {
            j6 = j7 - j8;
        } else {
            j6 = 0;
        }
        if (j7 >= 0 && j8 >= 0) {
            return j6;
        }
        return this.f6085j.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r2v28, types: [h5.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v30, types: [h5.u] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.Map, java.lang.Object] */
    /* renamed from: P0 */
    public final void m1959P0(List list, List list2, List list3, List list4, boolean z7, boolean z8, boolean z9, Long l7, List list5, C1096mo c1096mo, C0789cu c0789cu, boolean z10, boolean z11, boolean z12, boolean z13, long j6, EnumC1070lt enumC1070lt, C0750bn c0750bn, boolean z14, C0706ab c0706ab, EnumC1127no enumC1127no, C1405wn c1405wn, Map map, Map map2, Map map3, List list6, int i7) {
        C0706ab m1495a;
        Map map4;
        Map map5;
        List list7;
        List list8;
        boolean z15;
        boolean z16;
        long m3531r;
        ?? r22;
        List<C1248rl> list9;
        long j7;
        int size;
        ?? r11;
        int m1992n;
        C1100ms c1100ms;
        int i8;
        int size2;
        int m1992n2;
        C1100ms c1100ms2;
        int i9;
        C1100ms c1100ms3;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        String obj;
        C0739bc c0739bc;
        Set set;
        Set set2;
        Double valueOf5 = Double.valueOf(0.0d);
        AbstractC3367j.m5100e(list, "downloadUrls");
        AbstractC3367j.m5100e(list2, "uploadUrls");
        AbstractC3367j.m5100e(list3, "downloadEndpoints");
        AbstractC3367j.m5100e(list4, "uploadEndpoints");
        AbstractC3367j.m5100e(list5, "networkTargets");
        AbstractC3367j.m5100e(c1096mo, "speedLimit");
        AbstractC3367j.m5100e(c0789cu, "trafficStop");
        AbstractC3367j.m5100e(enumC1070lt, "defaultTargetTransport");
        AbstractC3367j.m5100e(c0750bn, "ratePushConfig");
        AbstractC3367j.m5100e(c0706ab, "engineTuningConfig");
        AbstractC3367j.m5100e(enumC1127no, "networkMode");
        AbstractC3367j.m5100e(c1405wn, "customDnsConfig");
        AbstractC3367j.m5100e(map, "dnsAddressSelections");
        AbstractC3367j.m5100e(map2, "targetDownloadUrls");
        AbstractC3367j.m5100e(map3, "targetUploadUrls");
        m1962S0();
        this.f6081h1 = AbstractC2168e.m3530q(i7, 10, 2000);
        this.f6080h0 = z13;
        boolean z17 = z11 && !this.f6080h0;
        this.f6083i0 = z17;
        this.f6077g0 = (!z10 || this.f6080h0 || z17) ? false : true;
        this.f6086j0 = z12;
        this.f6019G0 = enumC1127no;
        this.f6021H0 = c1405wn;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!AbstractC0444k.m937a0((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!AbstractC0444k.m937a0((String) entry2.getValue())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.f6023I0 = linkedHashMap2;
        this.f6025J0 = "";
        ArrayList m1993n0 = m1993n0(c0750bn.f2847b);
        ArrayList m1922o0 = m1922o0(c0750bn.f2848c);
        int m3530q = AbstractC2168e.m3530q(c0750bn.f2849d, 32, 256);
        int m3530q2 = AbstractC2168e.m3530q(c0750bn.f2850e, 1, 64);
        boolean z18 = c0750bn.f2846a;
        c0750bn.getClass();
        this.f6011C0 = new C0750bn(m3530q, m3530q2, m1993n0, m1922o0, z18);
        this.f6015E0 = z14;
        if (z17) {
            m1495a = C0706ab.m1495a(c0706ab, true, m1891H0(c0706ab.f2360j), 255);
        } else {
            m1495a = C0706ab.m1495a(c0706ab, false, 0, 767);
        }
        this.f6017F0 = m1950J0(m1495a);
        this.f6013D0 = c0750bn.f2846a ? "等待无拥塞窗口" : "未启用";
        this.f6027K0.set(0);
        this.f6029L0.set(0);
        this.f6031M0.set(0);
        C0565q1 c0565q1 = this.f6048V;
        if (c0565q1 != null) {
            c0565q1.mo1114c(null);
        }
        this.f6006A.clear();
        this.f6008B.clear();
        this.f6039Q0.clear();
        m1952K0(list6);
        m1960R();
        C3379v c3379v = new C3379v();
        c3379v.f16451e = m1993n0(list);
        C3379v c3379v2 = new C3379v();
        c3379v2.f16451e = m1922o0(list2);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list3) {
            if (((List) c3379v.f16451e).contains(((C1006jr) obj2).f5163a)) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC2168e.m3527n(AbstractC1817y.m3082N(AbstractC1807o.m3073U(arrayList)), 16));
        int size3 = arrayList.size();
        int i10 = 0;
        while (i10 < size3) {
            Object obj3 = arrayList.get(i10);
            i10++;
            linkedHashMap3.put(((C1006jr) obj3).f5163a, obj3);
            arrayList = arrayList;
        }
        this.f6105q0 = linkedHashMap3;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : list4) {
            if (((List) c3379v2.f16451e).contains(((C1006jr) obj4).f5163a)) {
                arrayList2.add(obj4);
            }
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(AbstractC2168e.m3527n(AbstractC1817y.m3082N(AbstractC1807o.m3073U(arrayList2)), 16));
        int size4 = arrayList2.size();
        int i11 = 0;
        while (i11 < size4) {
            Object obj5 = arrayList2.get(i11);
            i11++;
            linkedHashMap4.put(((C1006jr) obj5).f5163a, obj5);
        }
        this.f6107r0 = linkedHashMap4;
        List<C1248rl> m5817z = list5.isEmpty() ? AbstractC3784a.m5817z(new C1248rl("default|默认接口", "默认接口", (Network) null, enumC1070lt, (String) null, 52)) : list5;
        C3379v c3379v3 = new C3379v();
        Map map6 = !map2.isEmpty() ? map2 : null;
        if (map6 != null) {
            map4 = new LinkedHashMap(AbstractC2168e.m3527n(AbstractC1817y.m3082N(AbstractC1807o.m3073U(m5817z)), 16));
            for (C1248rl c1248rl : m5817z) {
                String m2205b = c1248rl.m2205b();
                List list10 = (List) map6.get(c1248rl.m2205b());
                if (list10 == null) {
                    list10 = C1813u.f10860e;
                }
                map4.put(m2205b, m1993n0(list10));
            }
        } else {
            map4 = C1814v.f10861e;
        }
        c3379v3.f16451e = map4;
        C3379v c3379v4 = new C3379v();
        Map map7 = !map3.isEmpty() ? map3 : null;
        if (map7 != null) {
            map5 = new LinkedHashMap(AbstractC2168e.m3527n(AbstractC1817y.m3082N(AbstractC1807o.m3073U(m5817z)), 16));
            for (C1248rl c1248rl2 : m5817z) {
                String m2205b2 = c1248rl2.m2205b();
                List list11 = (List) map7.get(c1248rl2.m2205b());
                if (list11 == null) {
                    list11 = C1813u.f10860e;
                }
                map5.put(m2205b2, m1922o0(list11));
            }
        } else {
            map5 = C1814v.f10861e;
        }
        c3379v4.f16451e = map5;
        List<C1248rl> list12 = m5817z;
        boolean z19 = z17;
        C1285sr m2000s = m2000s(enumC1127no, list12, (List) c3379v.f16451e, (List) c3379v2.f16451e, (Map) c3379v3.f16451e, map5, z7, z8);
        c3379v.f16451e = m2000s.f7657a;
        c3379v2.f16451e = m2000s.f7658b;
        c3379v3.f16451e = m2000s.f7659c;
        c3379v4.f16451e = m2000s.f7660d;
        Map map8 = this.f6105q0;
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (Map.Entry entry3 : map8.entrySet()) {
            String str = (String) entry3.getKey();
            if (!((List) c3379v.f16451e).contains(str)) {
                Collection values = ((Map) c3379v3.f16451e).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((List) it.next()).contains(str)) {
                        }
                    }
                }
            }
            linkedHashMap5.put(entry3.getKey(), entry3.getValue());
        }
        this.f6105q0 = linkedHashMap5;
        ?? r42 = this.f6107r0;
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        for (Map.Entry entry4 : r42.entrySet()) {
            String str2 = (String) entry4.getKey();
            if (!((List) c3379v2.f16451e).contains(str2)) {
                Collection values2 = ((Map) c3379v4.f16451e).values();
                if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                    Iterator it2 = values2.iterator();
                    while (it2.hasNext()) {
                        if (((List) it2.next()).contains(str2)) {
                        }
                    }
                }
            }
            linkedHashMap6.put(entry4.getKey(), entry4.getValue());
        }
        this.f6107r0 = linkedHashMap6;
        this.f6025J0 = m2000s.f7661e;
        if (!((Map) c3379v3.f16451e).isEmpty()) {
            list7 = AbstractC1805m.m3042f0(AbstractC1807o.m3074V(((Map) c3379v3.f16451e).values()));
        } else {
            list7 = (List) c3379v.f16451e;
        }
        if (!((Map) c3379v4.f16451e).isEmpty()) {
            list8 = AbstractC1805m.m3042f0(AbstractC1807o.m3074V(((Map) c3379v4.f16451e).values()));
        } else {
            list8 = (List) c3379v2.f16451e;
        }
        if (!z7 || m2000s.f7662f == null) {
            z15 = z7;
        } else {
            if (!z8 || list8.isEmpty()) {
                C1701c0 c1701c0 = this.f6084i1;
                C0976ir c0976ir = (C0976ir) c1701c0.getValue();
                String str3 = m2000s.f7662f;
                c1701c0.m2751i(C0976ir.m1609a(c0976ir, false, false, 0.0d, 0.0d, 0.0d, 0.0d, null, null, str3, str3, null, null, 0, 2147090431));
                return;
            }
            z15 = false;
        }
        if (!z8 || m2000s.f7663g == null) {
            z16 = z8;
        } else {
            if (!z15 || list7.isEmpty()) {
                C1701c0 c1701c02 = this.f6084i1;
                C0976ir c0976ir2 = (C0976ir) c1701c02.getValue();
                String str4 = m2000s.f7663g;
                c1701c02.m2751i(C0976ir.m1609a(c0976ir2, false, false, 0.0d, 0.0d, 0.0d, 0.0d, null, null, str4, str4, null, null, 0, 2147090431));
                return;
            }
            z16 = false;
        }
        if (!z15 && !z16) {
            String str5 = m2000s.f7661e;
            if (AbstractC0444k.m937a0(str5)) {
                str5 = "当前网络模式下没有可测速地址";
            }
            C1701c0 c1701c03 = this.f6084i1;
            c1701c03.m2751i(C0976ir.m1609a((C0976ir) c1701c03.getValue(), false, false, 0.0d, 0.0d, 0.0d, 0.0d, null, null, str5, str5, null, null, 0, 2147090431));
            return;
        }
        if (z15) {
            Object obj6 = c3379v3.f16451e;
            if (((Map) obj6).isEmpty()) {
                obj6 = null;
            }
            Map map9 = (Map) obj6;
            if (map9 != null) {
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                Iterator it3 = map9.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry5 = (Map.Entry) it3.next();
                    if (!((List) entry5.getValue()).isEmpty()) {
                        linkedHashMap7.put(entry5.getKey(), entry5.getValue());
                        it3 = it3;
                    }
                }
                set2 = linkedHashMap7.keySet();
            } else {
                set2 = null;
            }
            if (set2 == null) {
                set2 = C1815w.f10862e;
            }
            if (!((Map) c3379v3.f16451e).isEmpty() && set2.isEmpty()) {
                C1701c0 c1701c04 = this.f6084i1;
                c1701c04.m2751i(C0976ir.m1609a((C0976ir) c1701c04.getValue(), false, false, 0.0d, 0.0d, 0.0d, 0.0d, null, null, "请至少为一个接口选择下载地址", "请至少为一个接口选择下载地址", null, null, 0, 2147090431));
                return;
            } else if (list7.isEmpty()) {
                C1701c0 c1701c05 = this.f6084i1;
                c1701c05.m2751i(C0976ir.m1609a((C0976ir) c1701c05.getValue(), false, false, 0.0d, 0.0d, 0.0d, 0.0d, null, null, "请至少填写一个下载地址", "请至少填写一个下载地址", null, null, 0, 2147090431));
                return;
            }
        }
        if (z16) {
            Object obj7 = c3379v4.f16451e;
            if (((Map) obj7).isEmpty()) {
                obj7 = null;
            }
            Map map10 = (Map) obj7;
            if (map10 != null) {
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                Iterator it4 = map10.entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry6 = (Map.Entry) it4.next();
                    if (!((List) entry6.getValue()).isEmpty()) {
                        linkedHashMap8.put(entry6.getKey(), entry6.getValue());
                        it4 = it4;
                    }
                }
                set = linkedHashMap8.keySet();
            } else {
                set = null;
            }
            if (set == null) {
                set = C1815w.f10862e;
            }
            if (!((Map) c3379v4.f16451e).isEmpty() && set.isEmpty()) {
                C1701c0 c1701c06 = this.f6084i1;
                c1701c06.m2751i(C0976ir.m1609a((C0976ir) c1701c06.getValue(), false, false, 0.0d, 0.0d, 0.0d, 0.0d, null, null, "请至少为一个接口选择上传地址", "请至少为一个接口选择上传地址", null, null, 0, 2147090431));
                return;
            } else if (list8.isEmpty()) {
                C1701c0 c1701c07 = this.f6084i1;
                c1701c07.m2751i(C0976ir.m1609a((C0976ir) c1701c07.getValue(), false, false, 0.0d, 0.0d, 0.0d, 0.0d, null, null, "请至少填写一个上传地址", "请至少填写一个上传地址", null, null, 0, 2147090431));
                return;
            }
        }
        this.f6079h.set(false);
        this.f6033N0.m2421b();
        List list13 = list7;
        List list14 = list8;
        this.f6048V = AbstractC0525d0.m1141s(this.f6070e, AbstractC0549l0.m1228a(), new C0075s1(this, null, 3), 2);
        this.f6082i.set(0L);
        this.f6085j.set(0L);
        m1971Z();
        m1972a0();
        this.f6016F.set(0);
        this.f6018G.set(0);
        this.f6020H.set(0L);
        this.f6022I.set(0);
        this.f6024J.set(0L);
        synchronized (this.f6035O0) {
            this.f6035O0.clear();
        }
        this.f6037P0.clear();
        ?? r23 = C1813u.f10860e;
        this.f6047U0 = r23;
        this.f6049V0 = 0L;
        this.f6120y.clear();
        this.f6041R0.set(0);
        synchronized (this.f6053X0) {
            this.f6100o.clear();
            this.f6102p.clear();
            this.f6104q.clear();
            this.f6106r.clear();
        }
        this.f6108s.clear();
        this.f6110t.clear();
        this.f6112u.clear();
        this.f6122z.clear();
        this.f6088k.m1487c();
        this.f6091l.m1487c();
        this.f6089k0 = c1096mo;
        this.f6092l0 = c0789cu;
        if (z9) {
            m3531r = Math.max(AbstractC2168e.m3531r(j6, 16L, 5000L), 1000L);
        } else {
            m3531r = AbstractC2168e.m3531r(j6, 16L, 5000L);
        }
        this.f6078g1 = m3531r;
        synchronized (this.f6051W0) {
            this.f6043S0.clear();
            this.f6045T0.clear();
        }
        this.f6057Z0.set(0);
        this.f6109s0 = list12;
        if (z15) {
            if (((Map) c3379v3.f16451e).isEmpty()) {
                r23 = list12;
            } else {
                r23 = new ArrayList();
                for (Object obj8 : list12) {
                    Collection collection = (List) ((Map) c3379v3.f16451e).get(((C1248rl) obj8).m2205b());
                    if (collection == null) {
                        collection = C1813u.f10860e;
                    }
                    if (!collection.isEmpty()) {
                        r23.add(obj8);
                    }
                }
            }
        }
        this.f6095m0 = r23;
        if (z16) {
            if (((Map) c3379v4.f16451e).isEmpty()) {
                r22 = list12;
            } else {
                r22 = new ArrayList();
                for (Object obj9 : list12) {
                    Collection collection2 = (List) ((Map) c3379v4.f16451e).get(((C1248rl) obj9).m2205b());
                    if (collection2 == null) {
                        collection2 = C1813u.f10860e;
                    }
                    if (!collection2.isEmpty()) {
                        r22.add(obj9);
                    }
                }
            }
        } else {
            r22 = C1813u.f10860e;
        }
        this.f6098n0 = r22;
        AbstractC1249rm.m2261g0("START bind targets=" + AbstractC1249rm.m2253c0(list12) + " runDown=" + z15 + " runUp=" + z16 + " downTargets=" + AbstractC1249rm.m2253c0(this.f6095m0) + " upTargets=" + AbstractC1249rm.m2253c0(this.f6098n0));
        this.f6101o0 = z15 ? list13 : C1813u.f10860e;
        this.f6103p0 = z16 ? list14 : C1813u.f10860e;
        this.f6111t0 = z15 ? (Map) c3379v3.f16451e : C1814v.f10861e;
        this.f6113u0 = z16 ? (Map) c3379v4.f16451e : C1814v.f10861e;
        synchronized (this.f6053X0) {
            for (C1248rl c1248rl3 : list12) {
                List list15 = list12;
                long j8 = m3531r;
                this.f6100o.put(c1248rl3.m2205b(), new AtomicLong(0L));
                this.f6102p.put(c1248rl3.m2205b(), new AtomicLong(0L));
                this.f6104q.put(c1248rl3.m2205b(), new C1803k());
                this.f6106r.put(c1248rl3.m2205b(), new C1803k());
                this.f6110t.put(c1248rl3.m2205b(), valueOf5);
                this.f6112u.put(c1248rl3.m2205b(), valueOf5);
                list12 = list15;
                m3531r = j8;
            }
            list9 = list12;
            j7 = m3531r;
        }
        this.f6074f0 = z9 ? EnumC0757bu.f2915f : EnumC0757bu.f2914e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C0725au m2004w0 = m2004w0();
        for (C1248rl c1248rl4 : list9) {
            String str6 = c1248rl4.f7394e;
            if (str6 != null && (obj = AbstractC0444k.m956t0(str6).toString()) != null) {
                if (AbstractC0444k.m937a0(obj)) {
                    obj = null;
                }
                if (obj != null && (c0739bc = (C0739bc) m2004w0.f2522d.get(obj)) != null) {
                    this.f6108s.put(c1248rl4.m2205b(), c0739bc);
                }
            }
        }
        this.f6052X = m2004w0.f2519a;
        this.f6054Y = m2004w0.f2520b;
        this.f6056Z = elapsedRealtime;
        this.f6059a0 = elapsedRealtime;
        this.f6062b0 = 0L;
        this.f6065c0 = 0L;
        this.f6068d0 = 0L;
        this.f6071e0 = 0L;
        m1943F0(m2004w0);
        m1954M0(m2004w0);
        m1958O0(m2004w0);
        m1941E0();
        m1938D(list9.size(), this.f6011C0.f2846a);
        if (!((Map) c3379v3.f16451e).isEmpty()) {
            Iterator it5 = ((Map) c3379v3.f16451e).values().iterator();
            if (it5.hasNext()) {
                valueOf4 = Integer.valueOf(((List) it5.next()).size());
                while (it5.hasNext()) {
                    Integer valueOf6 = Integer.valueOf(((List) it5.next()).size());
                    if (valueOf4.compareTo(valueOf6) < 0) {
                        valueOf4 = valueOf6;
                    }
                }
            } else {
                valueOf4 = null;
            }
            size = valueOf4 != null ? valueOf4.intValue() : 0;
        } else {
            size = ((List) c3379v.f16451e).size();
        }
        if (z19) {
            i8 = size;
            r11 = 1;
            c1100ms = this;
            m1992n = 8;
        } else {
            r11 = 1;
            int i12 = size;
            m1992n = m1992n(i12, list9.size(), this.f6017F0.f2351a, this.f6017F0.m1496b(), AbstractC2168e.m3530q(this.f6017F0.f2357g, 1, this.f6017F0.f2358h));
            c1100ms = this;
            i8 = i12;
        }
        if (c1100ms.f6080h0) {
            Iterator it6 = c1100ms.f6095m0.iterator();
            if (it6.hasNext()) {
                C1248rl c1248rl5 = (C1248rl) it6.next();
                valueOf3 = Integer.valueOf(m1892L(c1248rl5, (Map) c3379v3.f16451e, (List) c3379v.f16451e) * m1897S(c1248rl5));
                while (it6.hasNext()) {
                    C1248rl c1248rl6 = (C1248rl) it6.next();
                    Integer valueOf7 = Integer.valueOf(m1892L(c1248rl6, (Map) c3379v3.f16451e, (List) c3379v.f16451e) * m1897S(c1248rl6));
                    if (valueOf3.compareTo(valueOf7) < 0) {
                        valueOf3 = valueOf7;
                    }
                }
            } else {
                valueOf3 = null;
            }
            c1100ms.f6115v0 = valueOf3 != null ? valueOf3.intValue() : c1100ms.f6017F0.f2351a;
            int i13 = 0;
            for (C1248rl c1248rl7 : c1100ms.f6095m0) {
                i13 += m1892L(c1248rl7, (Map) c3379v3.f16451e, (List) c3379v.f16451e) * m1897S(c1248rl7);
            }
            c1100ms.f6117w0 = AbstractC2168e.m3527n(i13, r11);
        } else {
            c1100ms.f6115v0 = AbstractC2168e.m3527n(i8, r11) * m1992n;
            Iterator it7 = c1100ms.f6095m0.iterator();
            int i14 = 0;
            while (it7.hasNext()) {
                i14 += AbstractC2168e.m3527n(m1892L((C1248rl) it7.next(), (Map) c3379v3.f16451e, (List) c3379v.f16451e), r11) * m1992n;
            }
            c1100ms.f6117w0 = AbstractC2168e.m3527n(i14, r11);
        }
        if (!((Map) c3379v4.f16451e).isEmpty()) {
            Iterator it8 = ((Map) c3379v4.f16451e).values().iterator();
            if (it8.hasNext()) {
                valueOf2 = Integer.valueOf(((List) it8.next()).size());
                while (it8.hasNext()) {
                    Integer valueOf8 = Integer.valueOf(((List) it8.next()).size());
                    if (valueOf2.compareTo(valueOf8) < 0) {
                        valueOf2 = valueOf8;
                    }
                }
            } else {
                valueOf2 = null;
            }
            size2 = valueOf2 != null ? valueOf2.intValue() : 0;
        } else {
            size2 = ((List) c3379v2.f16451e).size();
        }
        if (z19) {
            i9 = size2;
            c1100ms2 = c1100ms;
            m1992n2 = 8;
        } else {
            C1100ms c1100ms4 = c1100ms;
            int i15 = size2;
            m1992n2 = c1100ms4.m1992n(i15, list9.size(), c1100ms.f6017F0.f2353c, c1100ms.f6017F0.m1497c(), AbstractC2168e.m3530q(c1100ms.f6017F0.f2357g, r11, c1100ms.f6017F0.f2358h));
            c1100ms2 = c1100ms4;
            i9 = i15;
        }
        if (c1100ms2.f6080h0) {
            Iterator it9 = c1100ms2.f6098n0.iterator();
            if (it9.hasNext()) {
                C1248rl c1248rl8 = (C1248rl) it9.next();
                valueOf = Integer.valueOf(m1906b1(c1248rl8, (Map) c3379v4.f16451e, (List) c3379v2.f16451e) * m1898T(c1248rl8));
                while (it9.hasNext()) {
                    C1248rl c1248rl9 = (C1248rl) it9.next();
                    Integer valueOf9 = Integer.valueOf(m1906b1(c1248rl9, (Map) c3379v4.f16451e, (List) c3379v2.f16451e) * m1898T(c1248rl9));
                    if (valueOf.compareTo(valueOf9) < 0) {
                        valueOf = valueOf9;
                    }
                }
            } else {
                valueOf = null;
            }
            c1100ms2.f6119x0 = valueOf != null ? valueOf.intValue() : c1100ms2.f6017F0.f2353c;
            int i16 = 0;
            for (C1248rl c1248rl10 : c1100ms2.f6098n0) {
                i16 += m1906b1(c1248rl10, (Map) c3379v4.f16451e, (List) c3379v2.f16451e) * m1898T(c1248rl10);
            }
            c1100ms2.f6121y0 = AbstractC2168e.m3527n(i16, r11);
        } else {
            c1100ms2.f6119x0 = AbstractC2168e.m3527n(i9, r11) * m1992n2;
            Iterator it10 = c1100ms2.f6098n0.iterator();
            int i17 = 0;
            while (it10.hasNext()) {
                i17 += AbstractC2168e.m3527n(m1906b1((C1248rl) it10.next(), (Map) c3379v4.f16451e, (List) c3379v2.f16451e), r11) * m1992n2;
            }
            c1100ms2.f6121y0 = AbstractC2168e.m3527n(i17, r11);
        }
        if (c1100ms2.f6080h0) {
            C0802db c0802db = c1100ms2.f6094m;
            synchronized (c0802db.f3381a) {
                c0802db.f3382b.clear();
                c0802db.f3383c = 4;
                c0802db.f3384d = 0L;
            }
            C0802db c0802db2 = c1100ms2.f6097n;
            synchronized (c0802db2.f3381a) {
                c0802db2.f3382b.clear();
                c0802db2.f3383c = 4;
                c0802db2.f3384d = 0L;
            }
            C0694a c0694a = c1100ms2.f6088k;
            synchronized (c0694a.f2259a) {
                c0694a.f2267i = AbstractC2168e.m3530q(8, 2, 8);
            }
            C0694a c0694a2 = c1100ms2.f6091l;
            synchronized (c0694a2.f2259a) {
                c0694a2.f2267i = AbstractC2168e.m3530q(8, 2, 8);
            }
        }
        if (z15) {
            c1100ms2.f6073f.set(r11);
            C2090c c2090c = c1100ms2.f6070e;
            C0576u0 c0576u0 = c1100ms2.f6061b;
            C1100ms c1100ms5 = c1100ms2;
            C0920h2 c0920h2 = new C0920h2(c1100ms5, c3379v, c3379v3, m1992n, list9, null);
            c1100ms3 = c1100ms5;
            c1100ms3.f6042S = AbstractC0525d0.m1141s(c2090c, c0576u0, c0920h2, 2);
        } else {
            c1100ms3 = c1100ms2;
        }
        if (z16) {
            c1100ms3.f6076g.set(r11);
            c1100ms3.f6044T = AbstractC0525d0.m1141s(c1100ms3.f6070e, c1100ms3.f6067d, new C0719ao(c1100ms3, c3379v4, c3379v2, m1992n2, null), 2);
        }
        InterfaceC2313c interfaceC2313c = null;
        c1100ms3.f6084i1.m2751i(new C0976ir(c1100ms3.f6073f.get(), c1100ms3.f6076g.get(), 0.0d, 0.0d, 0.0d, 0.0d, 0L, 0L, null, null, 0.0d, 0.0d, null, 0L, c1100ms3.m1940E(), z15, z16, c1100ms3.m1932A(), null, null, j7, 0.0d, 0.0d, null, 2080129020));
        c1100ms3.f6046U = AbstractC0525d0.m1141s(c1100ms3.f6070e, null, new C0598c0(c1100ms3, j7, interfaceC2313c, 1), 3);
        if (l7 == null || l7.longValue() <= 0) {
            return;
        }
        c1100ms3.f6050W = AbstractC0525d0.m1141s(c1100ms3.f6070e, null, new C0062p0(l7, c1100ms3, interfaceC2313c, 17), 3);
    }

    /* renamed from: R */
    public final void m1960R() {
        ConcurrentHashMap concurrentHashMap = this.f6014E;
        Collection values = concurrentHashMap.values();
        AbstractC3367j.m5099d(values, "<get-values>(...)");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            try {
                ((C2623x) it.next()).f14201f.m40k();
            } catch (Throwable th) {
                AbstractC1793a0.m2985m(th);
            }
        }
        concurrentHashMap.clear();
        ConcurrentHashMap concurrentHashMap2 = this.f6010C;
        Collection values2 = concurrentHashMap2.values();
        AbstractC3367j.m5099d(values2, "<get-values>(...)");
        Iterator it2 = values2.iterator();
        while (it2.hasNext()) {
            try {
                ((C2623x) it2.next()).f14201f.m40k();
            } catch (Throwable th2) {
                AbstractC1793a0.m2985m(th2);
            }
        }
        concurrentHashMap2.clear();
        ConcurrentHashMap concurrentHashMap3 = this.f6012D;
        Collection values3 = concurrentHashMap3.values();
        AbstractC3367j.m5099d(values3, "<get-values>(...)");
        Iterator it3 = values3.iterator();
        while (it3.hasNext()) {
            try {
                ((C2623x) it3.next()).f14201f.m40k();
            } catch (Throwable th3) {
                AbstractC1793a0.m2985m(th3);
            }
        }
        concurrentHashMap3.clear();
    }

    /* renamed from: R0 */
    public final void m1961R0(C1248rl c1248rl, List list, int i7, int i8) {
        int i9;
        if (this.f6083i0) {
            return;
        }
        AtomicInteger atomicInteger = this.f6016F;
        do {
            i9 = atomicInteger.get();
            if (i9 >= 24) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i9, i9 + 1));
        AbstractC0525d0.m1141s(this.f6070e, this.f6061b, new C1007js(this, c1248rl, i7, i8, (String) list.get(((i7 + i8) + 1) % list.size()), (InterfaceC2313c) null), 2);
    }

    /* renamed from: S0 */
    public final void m1962S0() {
        m1967W0("手动停止");
    }

    /* renamed from: T0 */
    public final void m1963T0(long j6, long j7, String str) {
        if (this.f6073f.getAndSet(false)) {
            if (this.f6062b0 == 0) {
                this.f6062b0 = j6;
            }
            if (this.f6068d0 == 0) {
                this.f6068d0 = j7;
            }
            m1971Z();
            this.f6072e1 = 0.0d;
            Set keySet = this.f6037P0.keySet();
            AbstractC3367j.m5099d(keySet, "<get-keys>(...)");
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                AbstractC3367j.m5100e(str2, "it");
                if (AbstractC0451r.m971M(str2, "d|", false)) {
                    it.remove();
                }
            }
            C0565q1 c0565q1 = this.f6042S;
            if (c0565q1 != null) {
                c0565q1.mo1114c(null);
            }
            if (!this.f6076g.get()) {
                this.f6079h.set(true);
                m1969Y();
                C0565q1 c0565q12 = this.f6044T;
                if (c0565q12 != null) {
                    c0565q12.mo1114c(null);
                }
                C0565q1 c0565q13 = this.f6046U;
                if (c0565q13 != null) {
                    c0565q13.mo1114c(null);
                }
                C0565q1 c0565q14 = this.f6048V;
                if (c0565q14 != null) {
                    c0565q14.mo1114c(null);
                }
            }
            m2002v0(true, !r7.get(), str);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(2:3|(12:5|6|7|(1:(4:10|11|12|13)(2:64|65))(7:66|67|68|69|70|71|(7:101|102|103|104|105|106|107)(10:75|76|77|78|79|80|81|82|83|(1:85)(1:86)))|14|15|17|18|(3:20|21|22)|26|27|28))|14|15|17|18|(0)|26|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0161, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0182, code lost:
    
        r1.f6116w.remove(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0187, code lost:
    
        r5.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x018c, code lost:
    
        p060h5.AbstractC1793a0.m2985m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0110, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1964U(C1248rl c1248rl, List list, String str, int i7, int i8, String str2, AbstractC2583c abstractC2583c) {
        C0818ds c0818ds;
        int i9;
        HttpURLConnection httpURLConnection;
        C1100ms c1100ms;
        boolean z7;
        double d7;
        String str3;
        long j6;
        HttpURLConnection httpURLConnection2;
        Throwable th;
        long j7;
        long m1957O;
        InputStream inputStream;
        C1068lr c1068lr;
        String message;
        boolean z8;
        C1100ms c1100ms2 = this;
        ConcurrentHashMap.KeySetView keySetView = c1100ms2.f6116w;
        try {
            if (abstractC2583c instanceof C0818ds) {
                c0818ds = (C0818ds) abstractC2583c;
                int i10 = c0818ds.f3569n;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0818ds.f3569n = i10 - Integer.MIN_VALUE;
                    C0818ds c0818ds2 = c0818ds;
                    Object obj = c0818ds2.f3567l;
                    i9 = c0818ds2.f3569n;
                    long j8 = 0;
                    if (i9 == 0) {
                        if (i9 == 1) {
                            j6 = c0818ds2.f3566k;
                            httpURLConnection = c0818ds2.f3565j;
                            str3 = c0818ds2.f3564i;
                            c1100ms = c0818ds2.f3563h;
                            try {
                                AbstractC1793a0.m2972L(obj);
                                z7 = true;
                                c1100ms2 = c1100ms;
                            } catch (Exception e7) {
                                e = e7;
                                z7 = true;
                                c1100ms2 = c1100ms;
                                d7 = 0.0d;
                                String simpleName = e.getClass().getSimpleName();
                                message = e.getMessage();
                                if (message == null) {
                                }
                                c1100ms2.m1996o1(str3, AbstractC0444k.m955s0("失败：" + simpleName + " " + message, 80));
                                if (httpURLConnection != null) {
                                }
                                z8 = z7;
                                c1100ms2.getClass();
                                return m1930v(d7, j6, j8, z8);
                            } catch (Throwable th2) {
                                th = th2;
                                th = th;
                                if (httpURLConnection == null) {
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        httpURLConnection = null;
                        try {
                            HttpURLConnection m2001s0 = c1100ms2.m2001s0(c1248rl, str, "GET");
                            try {
                                try {
                                    keySetView.add(m2001s0);
                                    long nanoTime = System.nanoTime();
                                    int responseCode = m2001s0.getResponseCode();
                                    long nanoTime2 = System.nanoTime();
                                    if ((200 > responseCode || responseCode >= 300) && responseCode != 206) {
                                        try {
                                            C1192pr m1930v = m1930v(0.0d, nanoTime2, 0L, true);
                                            keySetView.remove(m2001s0);
                                            try {
                                                m2001s0.disconnect();
                                                return m1930v;
                                            } catch (Throwable th3) {
                                                AbstractC1793a0.m2985m(th3);
                                                return m1930v;
                                            }
                                        } catch (Exception e8) {
                                            e = e8;
                                            z7 = true;
                                            str3 = str2;
                                            httpURLConnection = m2001s0;
                                            j6 = nanoTime2;
                                            d7 = 0.0d;
                                            String simpleName2 = e.getClass().getSimpleName();
                                            message = e.getMessage();
                                            if (message == null) {
                                            }
                                            c1100ms2.m1996o1(str3, AbstractC0444k.m955s0("失败：" + simpleName2 + " " + message, 80));
                                            if (httpURLConnection != null) {
                                            }
                                            z8 = z7;
                                            c1100ms2.getClass();
                                            return m1930v(d7, j6, j8, z8);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            c1100ms = c1100ms2;
                                            httpURLConnection = m2001s0;
                                            th = th;
                                            if (httpURLConnection == null) {
                                            }
                                        }
                                    } else {
                                        try {
                                            c1100ms2.m1937C0(str, m2001s0);
                                            m1957O = c1100ms2.m1957O(m2001s0.getContentLengthLong(), str);
                                            c1100ms2.m1994n1(m1957O, str2);
                                            inputStream = m2001s0.getInputStream();
                                            AbstractC3367j.m5099d(inputStream, "getInputStream(...)");
                                            j7 = nanoTime2;
                                            try {
                                                c1068lr = new C1068lr(c1100ms2, c1248rl, list, i7, i8, 1);
                                                c0818ds2.f3563h = c1100ms2;
                                                c0818ds2.f3564i = str2;
                                                c0818ds2.f3565j = m2001s0;
                                                c0818ds2.f3566k = j7;
                                                c0818ds2.f3569n = 1;
                                                z7 = true;
                                                httpURLConnection2 = m2001s0;
                                            } catch (Exception e9) {
                                                e = e9;
                                                z7 = true;
                                                httpURLConnection2 = m2001s0;
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                            z7 = true;
                                            httpURLConnection2 = m2001s0;
                                            j7 = nanoTime2;
                                        }
                                        try {
                                            obj = c1100ms2.m1955N(c1248rl, inputStream, m1957O, nanoTime, str2, c1068lr, c0818ds2);
                                            Object obj2 = EnumC2465a.f13750e;
                                            if (obj == obj2) {
                                                return obj2;
                                            }
                                            c1100ms2 = this;
                                            str3 = str2;
                                            j6 = j7;
                                            httpURLConnection = httpURLConnection2;
                                        } catch (Exception e11) {
                                            e = e11;
                                            c1100ms2 = this;
                                            str3 = str2;
                                            j6 = j7;
                                            httpURLConnection = httpURLConnection2;
                                            d7 = 0.0d;
                                            String simpleName22 = e.getClass().getSimpleName();
                                            message = e.getMessage();
                                            if (message == null) {
                                            }
                                            c1100ms2.m1996o1(str3, AbstractC0444k.m955s0("失败：" + simpleName22 + " " + message, 80));
                                            if (httpURLConnection != null) {
                                            }
                                            z8 = z7;
                                            c1100ms2.getClass();
                                            return m1930v(d7, j6, j8, z8);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            c1100ms = this;
                                            th = th;
                                            httpURLConnection = httpURLConnection2;
                                            if (httpURLConnection == null) {
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    httpURLConnection2 = m2001s0;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                z7 = true;
                                httpURLConnection2 = m2001s0;
                                c1100ms2 = this;
                                str3 = str2;
                                j6 = 0;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            z7 = true;
                            d7 = 0.0d;
                            c1100ms2 = this;
                            str3 = str2;
                            j6 = 0;
                            String simpleName222 = e.getClass().getSimpleName();
                            message = e.getMessage();
                            if (message == null) {
                            }
                            c1100ms2.m1996o1(str3, AbstractC0444k.m955s0("失败：" + simpleName222 + " " + message, 80));
                            if (httpURLConnection != null) {
                            }
                            z8 = z7;
                            c1100ms2.getClass();
                            return m1930v(d7, j6, j8, z8);
                        } catch (Throwable th7) {
                            th = th7;
                            c1100ms = this;
                        }
                    }
                    C1421x8 c1421x8 = (C1421x8) obj;
                    d7 = c1421x8.f8622b;
                    j8 = c1421x8.f8621a;
                    if (httpURLConnection != null) {
                        c1100ms2.f6116w.remove(httpURLConnection);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable th8) {
                            AbstractC1793a0.m2985m(th8);
                        }
                    }
                    z8 = false;
                    c1100ms2.getClass();
                    return m1930v(d7, j6, j8, z8);
                }
            }
            C1421x8 c1421x82 = (C1421x8) obj;
            d7 = c1421x82.f8622b;
            j8 = c1421x82.f8621a;
            if (httpURLConnection != null) {
            }
            z8 = false;
            c1100ms2.getClass();
            return m1930v(d7, j6, j8, z8);
        } catch (Throwable th9) {
            th = th9;
            c1100ms = c1100ms2;
            th = th;
            if (httpURLConnection == null) {
                c1100ms.f6116w.remove(httpURLConnection);
                try {
                    httpURLConnection.disconnect();
                    throw th;
                } catch (Throwable th10) {
                    AbstractC1793a0.m2985m(th10);
                    throw th;
                }
            }
            throw th;
        }
        c0818ds = new C0818ds(c1100ms2, abstractC2583c);
        C0818ds c0818ds22 = c0818ds;
        Object obj3 = c0818ds22.f3567l;
        i9 = c0818ds22.f3569n;
        long j82 = 0;
        if (i9 == 0) {
        }
    }

    /* renamed from: V0 */
    public final void m1965V0(long j6, long j7, String str) {
        if (this.f6076g.getAndSet(false)) {
            if (this.f6065c0 == 0) {
                this.f6065c0 = j6;
            }
            if (this.f6071e0 == 0) {
                this.f6071e0 = j7;
            }
            m1972a0();
            this.f6075f1 = 0.0d;
            Set keySet = this.f6037P0.keySet();
            AbstractC3367j.m5099d(keySet, "<get-keys>(...)");
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                AbstractC3367j.m5100e(str2, "it");
                if (AbstractC0451r.m971M(str2, "u|", false)) {
                    it.remove();
                }
            }
            C0565q1 c0565q1 = this.f6044T;
            if (c0565q1 != null) {
                c0565q1.mo1114c(null);
            }
            if (!this.f6073f.get()) {
                this.f6079h.set(true);
                m1969Y();
                C0565q1 c0565q12 = this.f6042S;
                if (c0565q12 != null) {
                    c0565q12.mo1114c(null);
                }
                C0565q1 c0565q13 = this.f6046U;
                if (c0565q13 != null) {
                    c0565q13.mo1114c(null);
                }
                C0565q1 c0565q14 = this.f6048V;
                if (c0565q14 != null) {
                    c0565q14.mo1114c(null);
                }
            }
            m2002v0(!r7.get(), true, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap m1966W(String str, EnumC1127no enumC1127no, List list, List list2, Map map, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        Map linkedHashMap2;
        Object obj;
        boolean z7;
        String str2;
        String str3;
        if (!map.isEmpty()) {
            linkedHashMap2 = map;
        } else {
            int m3082N = AbstractC1817y.m3082N(AbstractC1807o.m3073U(list));
            if (m3082N < 16) {
                m3082N = 16;
            }
            linkedHashMap2 = new LinkedHashMap(m3082N);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedHashMap2.put(((C1248rl) it.next()).f7390a, list2);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC1817y.m3082N(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            Object key = entry.getKey();
            String str4 = (String) entry.getKey();
            List list3 = (List) entry.getValue();
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (AbstractC3367j.m5096a(((C1248rl) obj).f7390a, str4)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C1248rl c1248rl = (C1248rl) obj;
            if (c1248rl == null) {
                c1248rl = (C1248rl) AbstractC1805m.m3047k0(list);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                String str5 = (String) obj2;
                if (c1248rl != null && m1977e1(str5, c1248rl, enumC1127no, linkedHashMap)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    if (c1248rl != null && (str3 = c1248rl.f7391b) != null) {
                        if (list.size() <= 1) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            str2 = "/".concat(str3);
                            if (str2 == null) {
                                str2 = "";
                            }
                            arrayList.add(str + str2 + " " + str5);
                        }
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                    arrayList.add(str + str2 + " " + str5);
                }
                if (z7) {
                    arrayList2.add(obj2);
                }
            }
            linkedHashMap3.put(key, arrayList2);
        }
        return linkedHashMap3;
    }

    /* renamed from: W0 */
    public final void m1967W0(String str) {
        this.f6079h.set(true);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicBoolean atomicBoolean = this.f6073f;
        if (atomicBoolean.get()) {
            this.f6062b0 = elapsedRealtime;
        }
        AtomicBoolean atomicBoolean2 = this.f6076g;
        if (atomicBoolean2.get()) {
            this.f6065c0 = elapsedRealtime;
        }
        atomicBoolean.set(false);
        atomicBoolean2.set(false);
        m1969Y();
        this.f6072e1 = 0.0d;
        this.f6075f1 = 0.0d;
        this.f6037P0.clear();
        C1813u c1813u = C1813u.f10860e;
        this.f6047U0 = c1813u;
        this.f6049V0 = 0L;
        C0565q1 c0565q1 = this.f6042S;
        if (c0565q1 != null) {
            c0565q1.mo1114c(null);
        }
        C0565q1 c0565q12 = this.f6044T;
        if (c0565q12 != null) {
            c0565q12.mo1114c(null);
        }
        C0565q1 c0565q13 = this.f6046U;
        if (c0565q13 != null) {
            c0565q13.mo1114c(null);
        }
        C0565q1 c0565q14 = this.f6048V;
        if (c0565q14 != null) {
            c0565q14.mo1114c(null);
        }
        C0565q1 c0565q15 = this.f6050W;
        if (c0565q15 != null) {
            c0565q15.mo1114c(null);
        }
        C1039kt m1933A0 = m1933A0(m2004w0());
        long j6 = m1933A0.f5341a;
        long j7 = m1933A0.f5342b;
        String m1899U0 = m1899U0(str);
        double m1928u = m1928u(m1895Q(this.f6068d0, j6, false), this.f6056Z, m1894P(this.f6062b0, elapsedRealtime, false));
        double m1928u2 = m1928u(m1895Q(this.f6071e0, j7, false), this.f6059a0, m1894P(this.f6065c0, elapsedRealtime, false));
        double m1928u3 = m1928u(m1895Q(this.f6068d0, j6, false), this.f6056Z, m1894P(this.f6062b0, elapsedRealtime, false));
        double m1928u4 = m1928u(m1895Q(this.f6071e0, j7, false), this.f6059a0, m1894P(this.f6065c0, elapsedRealtime, false));
        C1701c0 c1701c0 = this.f6084i1;
        C0976ir c0976ir = new C0976ir(false, false, 0.0d, 0.0d, m1928u, m1928u2, j6, j7, ((C0976ir) c1701c0.getValue()).f4976i, ((C0976ir) c1701c0.getValue()).f4977j, m1928u3, m1928u4, m2007y(elapsedRealtime), m1942F(elapsedRealtime), m1940E(), ((C0976ir) c1701c0.getValue()).f4983p, ((C0976ir) c1701c0.getValue()).f4984q, m1899U0, str, c1813u, ((C0976ir) c1701c0.getValue()).f4963A, 0.0d, 0.0d, null, 2046296064);
        c1701c0.getClass();
        c1701c0.m2752j(null, c0976ir);
    }

    /* renamed from: X */
    public final double m1968X(List list) {
        double d7;
        long j6 = this.f6078g1;
        if (j6 < 1) {
            j6 = 1;
        }
        int i7 = (int) (1000 / j6);
        if (i7 < 1) {
            i7 = 1;
        }
        int i8 = i7 * 301;
        if (i8 > 512) {
            i8 = 512;
        }
        List m3062z0 = AbstractC1805m.m3062z0(list, i8);
        ArrayList arrayList = new ArrayList();
        Iterator it = m3062z0.iterator();
        while (true) {
            d7 = 0.0d;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) next).doubleValue() > 0.0d) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return 0.0d;
        }
        double m3040d0 = AbstractC1805m.m3040d0(arrayList);
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            double doubleValue = ((Number) obj).doubleValue() - m3040d0;
            d7 += doubleValue * doubleValue;
        }
        double sqrt = Math.sqrt(d7 / arrayList.size());
        double d8 = m3040d0 - (0.5d * sqrt);
        double d9 = (sqrt * 1.5d) + m3040d0;
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            double doubleValue2 = ((Number) obj2).doubleValue();
            if (d8 <= doubleValue2 && doubleValue2 <= d9) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        }
        return AbstractC1805m.m3040d0(arrayList);
    }

    /* renamed from: Y */
    public final void m1969Y() {
        f5999p1.m4157a();
        f6000q1.m4157a();
        this.f6028L.m4157a();
        this.f6030M.m4157a();
        m1971Z();
        m1972a0();
        C2325e c2325e = AbstractC0549l0.f1898a;
        AbstractC0525d0.m1141s(this.f6070e, ExecutorC2324d.f13302g, new C0341k(this, null, 14), 2);
    }

    /* renamed from: Y0 */
    public final String m1970Y0(C1248rl c1248rl) {
        return c1248rl.f7390a + "|" + this.f6019G0.name() + "|" + this.f6021H0.m2387a() + "|" + this.f6023I0;
    }

    /* renamed from: Z */
    public final void m1971Z() {
        ConcurrentHashMap.KeySetView keySetView = this.f6114v;
        AbstractC3367j.m5099d(keySetView, "activeDownloadCalls");
        List m3035C0 = AbstractC1805m.m3035C0(keySetView);
        ConcurrentHashMap.KeySetView keySetView2 = this.f6116w;
        AbstractC3367j.m5099d(keySetView2, "activeDownloadConnections");
        List m3035C02 = AbstractC1805m.m3035C0(keySetView2);
        keySetView.clear();
        keySetView2.clear();
        Iterator it = m3035C0.iterator();
        while (it.hasNext()) {
            try {
                ((C3006i) it.next()).m4680d();
            } catch (Throwable th) {
                AbstractC1793a0.m2985m(th);
            }
        }
        if (!m3035C02.isEmpty()) {
            C2325e c2325e = AbstractC0549l0.f1898a;
            AbstractC0525d0.m1141s(this.f6070e, ExecutorC2324d.f13302g, new C0341k(m3035C02, null, 15), 2);
        }
    }

    /* renamed from: a0 */
    public final void m1972a0() {
        ConcurrentHashMap.KeySetView keySetView = this.f6118x;
        AbstractC3367j.m5099d(keySetView, "activeUploadCalls");
        Iterator it = AbstractC1805m.m3035C0(keySetView).iterator();
        while (it.hasNext()) {
            try {
                ((C3006i) it.next()).m4680d();
            } catch (Throwable th) {
                AbstractC1793a0.m2985m(th);
            }
        }
        keySetView.clear();
    }

    /* renamed from: b0 */
    public final C1715p m1973b0() {
        return this.f6087j1;
    }

    /* renamed from: c1 */
    public final int m1974c1(C1248rl c1248rl) {
        List list = (List) this.f6113u0.get(c1248rl.f7390a);
        if (list == null) {
            list = this.f6103p0;
        }
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return 0;
        }
        return list.size() * m1991m(c1248rl);
    }

    /* renamed from: d0 */
    public final C2623x m1975d0(C1248rl c1248rl, C1203q7 c1203q7) {
        String str;
        int m1891H0;
        C1248rl m1984j0 = m1984j0(c1248rl);
        if (m1979f1(m1984j0) && c1203q7 == null) {
            if (!this.f6083i0) {
                m1891H0 = 0;
            } else {
                m1891H0 = m1891H0(this.f6017F0.f2360j);
            }
            if (m1891H0 == 0) {
                return (C2623x) this.f6096m1.getValue();
            }
        }
        String m1970Y0 = m1970Y0(m1984j0);
        String str2 = null;
        if (c1203q7 != null) {
            str = c1203q7.f7045a;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        if (c1203q7 != null) {
            str2 = c1203q7.f7047c;
        }
        if (str2 != null) {
            str3 = str2;
        }
        String str4 = m1970Y0 + "|" + str + "|" + str3;
        ConcurrentHashMap concurrentHashMap = this.f6010C;
        Object obj = concurrentHashMap.get(str4);
        if (obj == null) {
            C2623x m1956N0 = m1956N0((C2623x) this.f6096m1.getValue(), m1984j0, c1203q7);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str4, m1956N0);
            if (putIfAbsent == null) {
                obj = m1956N0;
            } else {
                obj = putIfAbsent;
            }
        }
        AbstractC3367j.m5099d(obj, "getOrPut(...)");
        return (C2623x) obj;
    }

    /* renamed from: e0 */
    public final C2623x m1976e0(C1248rl c1248rl, C1203q7 c1203q7) {
        String str;
        int m1891H0;
        C1248rl m1984j0 = m1984j0(c1248rl);
        if (m1979f1(m1984j0) && c1203q7 == null) {
            if (!this.f6083i0) {
                m1891H0 = 0;
            } else {
                m1891H0 = m1891H0(this.f6017F0.f2360j);
            }
            if (m1891H0 == 0) {
                return (C2623x) this.f6099n1.getValue();
            }
        }
        String m1970Y0 = m1970Y0(m1984j0);
        String str2 = null;
        if (c1203q7 != null) {
            str = c1203q7.f7045a;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        if (c1203q7 != null) {
            str2 = c1203q7.f7047c;
        }
        if (str2 != null) {
            str3 = str2;
        }
        String str4 = m1970Y0 + "|" + str + "|" + str3;
        ConcurrentHashMap concurrentHashMap = this.f6012D;
        Object obj = concurrentHashMap.get(str4);
        if (obj == null) {
            C2623x m1956N0 = m1956N0((C2623x) this.f6099n1.getValue(), m1984j0, c1203q7);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str4, m1956N0);
            if (putIfAbsent == null) {
                obj = m1956N0;
            } else {
                obj = putIfAbsent;
            }
        }
        AbstractC3367j.m5099d(obj, "getOrPut(...)");
        return (C2623x) obj;
    }

    /* renamed from: e1 */
    public final boolean m1977e1(String str, C1248rl c1248rl, EnumC1127no enumC1127no, LinkedHashMap linkedHashMap) {
        String m1910d1 = m1910d1(str);
        if (m1910d1 == null) {
            return false;
        }
        String str2 = c1248rl.f7390a;
        String name = enumC1127no.name();
        String m2387a = this.f6021H0.m2387a();
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("|");
        sb.append(name);
        sb.append("|");
        sb.append(m2387a);
        String m4046j = AbstractC2487d.m4046j(sb, "|", m1910d1);
        Object obj = linkedHashMap.get(m4046j);
        if (obj == null) {
            Network network = c1248rl.f7392c;
            C2325e c2325e = AbstractC0549l0.f1898a;
            obj = Boolean.valueOf(!m1900V((List) AbstractC0525d0.m1145w(ExecutorC2324d.f13302g, new C0047l1(this, m1910d1, network, null, 5)), enumC1127no).isEmpty());
            linkedHashMap.put(m4046j, obj);
        }
        return ((Boolean) obj).booleanValue();
    }

    /* renamed from: f0 */
    public final Long m1978f0(C0725au c0725au, C1248rl c1248rl) {
        String obj;
        C0739bc c0739bc;
        C0739bc c0739bc2;
        String str = c1248rl.f7394e;
        if (str != null && (obj = AbstractC0444k.m956t0(str).toString()) != null) {
            if (AbstractC0444k.m937a0(obj)) {
                obj = null;
            }
            if (obj != null && (c0739bc = (C0739bc) c0725au.f2522d.get(obj)) != null && (c0739bc2 = (C0739bc) this.f6108s.get(c1248rl.f7390a)) != null) {
                return Long.valueOf(m1929u0(c0739bc.f2637a, c0739bc2.f2637a));
            }
        }
        return null;
    }

    /* renamed from: f1 */
    public final boolean m1979f1(C1248rl c1248rl) {
        if (c1248rl.f7392c == null && this.f6019G0 == EnumC1127no.f6360g && !this.f6021H0.m2388b()) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    public final Long m1980g0(C0725au c0725au, C1248rl c1248rl) {
        String obj;
        C0739bc c0739bc;
        C0739bc c0739bc2;
        String str = c1248rl.f7394e;
        if (str != null && (obj = AbstractC0444k.m956t0(str).toString()) != null) {
            if (AbstractC0444k.m937a0(obj)) {
                obj = null;
            }
            if (obj != null && (c0739bc = (C0739bc) c0725au.f2522d.get(obj)) != null && (c0739bc2 = (C0739bc) this.f6108s.get(c1248rl.f7390a)) != null) {
                return Long.valueOf(m1929u0(c0739bc.f2638b, c0739bc2.f2638b));
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:23|(1:24)|25|26|27|28) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:72|(1:74)|75|76|77|78|79|80|81) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00c1, code lost:
    
        r13 = p060h5.AbstractC1805m.m3062z0(r13, java.lang.Math.min(r7, r14.size())).iterator();
        r19 = r11;
        r14 = 0;
        r11 = r9;
        r9 = r8;
        r8 = r6;
        r6 = r5;
        r5 = r2;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0144, code lost:
    
        r17 = r6;
        r12 = r18;
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014a, code lost:
    
        r18 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0088  */
    /* JADX WARN: Type inference failed for: r12v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0217 -> B:10:0x0221). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x022f -> B:11:0x022d). Please report as a decompilation issue!!! */
    /* renamed from: g1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1981g1(List list, Map map, List list2, boolean z7, AbstractC2583c abstractC2583c) {
        C1069ls c1069ls;
        C1100ms c1100ms;
        int i7;
        C1248rl c1248rl;
        Iterator it;
        C1069ls c1069ls2;
        C1100ms c1100ms2;
        int i8;
        Map map2;
        List list3;
        Object obj;
        EnumC2465a enumC2465a;
        C1248rl c1248rl2;
        int i9;
        int i10;
        C1100ms c1100ms3;
        int i11;
        int i12;
        C2592a0 m4189a;
        C2623x m1986k;
        C2598d0 m4681e;
        InterfaceC0128k mo4146f;
        C1694m c1694m = C1694m.f10482a;
        if (abstractC2583c instanceof C1069ls) {
            c1069ls = (C1069ls) abstractC2583c;
            int i13 = c1069ls.f5743t;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1069ls.f5743t = i13 - Integer.MIN_VALUE;
                c1100ms = this;
                Object obj2 = c1069ls.f5741r;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                i7 = c1069ls.f5743t;
                int i14 = 2;
                if (i7 == 0) {
                    if (i7 == 1) {
                        int i15 = c1069ls.f5740q;
                        int i16 = c1069ls.f5739p;
                        int i17 = c1069ls.f5738o;
                        ?? r12 = c1069ls.f5737n;
                        Iterator it2 = c1069ls.f5736m;
                        C1248rl c1248rl3 = c1069ls.f5735l;
                        Iterator it3 = c1069ls.f5734k;
                        List list4 = c1069ls.f5733j;
                        Map map3 = c1069ls.f5732i;
                        C1100ms c1100ms4 = c1069ls.f5731h;
                        AbstractC1793a0.m2972L(obj2);
                        EnumC2465a enumC2465a3 = enumC2465a2;
                        int i18 = i16;
                        C1694m c1694m2 = c1694m;
                        C1248rl c1248rl4 = r12;
                        Iterator it4 = it2;
                        Map map4 = map3;
                        C1069ls c1069ls3 = c1069ls;
                        Map map5 = map4;
                        C1248rl c1248rl5 = c1248rl4;
                        C1100ms c1100ms5 = c1100ms4;
                        C1248rl c1248rl6 = c1248rl5;
                        int i19 = i17;
                        C1248rl c1248rl7 = c1248rl3;
                        int i20 = i15;
                        List list5 = list4;
                        Iterator it5 = it3;
                        ?? it6 = it4;
                        int i21 = i18;
                        enumC2465a2 = enumC2465a3;
                        c1100ms2 = c1100ms5;
                        c1694m = c1694m2;
                        i14 = 2;
                        int i22 = i19;
                        if (!it6.hasNext()) {
                            Object next = it6.next();
                            int i23 = i20 + 1;
                            if (i20 >= 0) {
                                try {
                                    String str = (String) next;
                                    if (c1248rl6 != null) {
                                        try {
                                        } catch (Throwable th) {
                                            th = th;
                                            c1694m2 = c1694m;
                                            enumC2465a = enumC2465a2;
                                            c1248rl2 = c1248rl6;
                                            i9 = i21;
                                            i10 = i22;
                                            c1100ms3 = it6;
                                            i11 = i20;
                                            i12 = i23;
                                            c1248rl6 = c1248rl7;
                                            c1100ms5 = c1100ms2;
                                            AbstractC1793a0.m2985m(th);
                                            if (i9 + i11 > 0) {
                                            }
                                        }
                                        obj = c1100ms2.f6105q0.get(str);
                                    } else {
                                        obj = c1100ms2.f6107r0.get(str);
                                    }
                                    C1006jr c1006jr = (C1006jr) obj;
                                    c1694m2 = c1694m;
                                    c1100ms3 = c1100ms2;
                                    i11 = i20;
                                    enumC2465a = enumC2465a2;
                                    i12 = i23;
                                    if (c1248rl6 != null) {
                                        i9 = i21;
                                        try {
                                        } catch (Throwable th2) {
                                            th = th2;
                                            i10 = i22;
                                        }
                                        C2625z c2625z = new C2625z();
                                        c2625z.m4194f(str);
                                        c1100ms3.getClass();
                                        m1923q(c2625z, c1006jr);
                                        i10 = i22;
                                        c2625z.m4191c("Accept", "*/*");
                                        c2625z.m4191c("Accept-Encoding", "identity");
                                        c2625z.m4191c("Connection", "Keep-Alive");
                                        c2625z.m4191c("X-Warmup", "1");
                                        m1924r(c2625z, c1006jr);
                                        m4189a = c2625z.m4189a();
                                        c1248rl2 = c1248rl6;
                                        c1100ms5 = c1100ms3;
                                        c1248rl6 = c1248rl7;
                                        c1100ms3 = it6;
                                    } else {
                                        i9 = i21;
                                        i10 = i22;
                                        C2625z c2625z2 = new C2625z();
                                        c2625z2.m4194f(str);
                                        byte[] bArr = new byte[1024];
                                        for (int i24 = 0; i24 < 1024; i24++) {
                                            bArr[i24] = 90;
                                        }
                                        C1378vr c1378vr = new C1378vr(c1100ms3, c1248rl7, bArr, false, null);
                                        c1100ms5 = c1100ms3;
                                        c1248rl2 = c1248rl6;
                                        c1248rl6 = c1248rl7;
                                        c1100ms5.getClass();
                                        m1926t(c2625z2, c1006jr, c1378vr);
                                        c1100ms3 = it6;
                                        c2625z2.m4191c("Content-Type", "application/octet-stream");
                                        c2625z2.m4191c("Accept-Encoding", "identity");
                                        c2625z2.m4191c("Connection", "Keep-Alive");
                                        c2625z2.m4191c("X-Warmup", "1");
                                        m1924r(c2625z2, c1006jr);
                                        m4189a = c2625z2.m4189a();
                                    }
                                    if (c1248rl2 != null) {
                                        try {
                                        } catch (Throwable th3) {
                                            th = th3;
                                            AbstractC1793a0.m2985m(th);
                                            if (i9 + i11 > 0) {
                                            }
                                        }
                                        m1986k = c1100ms5.m1986k();
                                    } else if (c1100ms5.f6080h0) {
                                        m1986k = (C2623x) c1100ms5.f6093l1.getValue();
                                    } else {
                                        m1986k = c1100ms5.f6038Q;
                                    }
                                    AbstractC2602f0 abstractC2602f0 = m4681e.f14062k;
                                    if (abstractC2602f0 != null && (mo4146f = abstractC2602f0.mo4146f()) != null) {
                                        mo4146f.mo259l(1L);
                                    }
                                    m4681e.close();
                                    if (i9 + i11 > 0) {
                                        c1069ls3.f5731h = c1100ms5;
                                        c1069ls3.f5732i = map5;
                                        c1069ls3.f5733j = list5;
                                        c1069ls3.f5734k = it5;
                                        c1069ls3.f5735l = c1248rl6;
                                        ?? r13 = c1100ms3;
                                        c1069ls3.f5736m = r13;
                                        ?? r14 = c1248rl2;
                                        c1069ls3.f5737n = r14;
                                        int i25 = i10;
                                        c1069ls3.f5738o = i25;
                                        i18 = i9;
                                        c1069ls3.f5739p = i18;
                                        int i26 = i12;
                                        c1069ls3.f5740q = i26;
                                        c1069ls3.f5743t = 1;
                                        enumC2465a3 = enumC2465a;
                                        if (AbstractC0525d0.m1131i(80L, c1069ls3) == enumC2465a3) {
                                            return enumC2465a3;
                                        }
                                        C1069ls c1069ls4 = c1069ls3;
                                        map3 = map5;
                                        c1069ls = c1069ls4;
                                        i17 = i25;
                                        it3 = it5;
                                        list4 = list5;
                                        i15 = i26;
                                        c1248rl3 = c1248rl6;
                                        c1100ms4 = c1100ms5;
                                        c1248rl4 = r14 == true ? 1 : 0;
                                        it4 = r13;
                                        Map map42 = map3;
                                        C1069ls c1069ls32 = c1069ls;
                                        Map map52 = map42;
                                        C1248rl c1248rl52 = c1248rl4;
                                        C1100ms c1100ms52 = c1100ms4;
                                        C1248rl c1248rl62 = c1248rl52;
                                        int i192 = i17;
                                        C1248rl c1248rl72 = c1248rl3;
                                        int i202 = i15;
                                        List list52 = list4;
                                        Iterator it52 = it3;
                                        ?? it62 = it4;
                                        int i212 = i18;
                                        enumC2465a2 = enumC2465a3;
                                        c1100ms2 = c1100ms52;
                                        c1694m = c1694m2;
                                        i14 = 2;
                                        int i222 = i192;
                                        if (!it62.hasNext()) {
                                            C1694m c1694m3 = c1694m;
                                            C1248rl c1248rl8 = c1248rl62;
                                            map2 = map52;
                                            list3 = list52;
                                            it = it52;
                                            c1069ls2 = c1069ls32;
                                            c1248rl = c1248rl8;
                                            i8 = i222;
                                            c1694m = c1694m3;
                                            if (it.hasNext()) {
                                                Object next2 = it.next();
                                                i222 = i8 + 1;
                                                if (i8 >= 0) {
                                                    C1248rl c1248rl9 = (C1248rl) next2;
                                                    List list6 = (List) map2.get(c1248rl9.f7390a);
                                                    if (list6 == null) {
                                                        list6 = list3;
                                                    }
                                                    List list7 = (List) map2.get(c1248rl9.f7390a);
                                                    if (list7 == null) {
                                                    }
                                                    it62 = AbstractC1805m.m3062z0(list6, Math.min(i14, list3.size())).iterator();
                                                    c1248rl72 = c1248rl9;
                                                    i202 = 0;
                                                    i212 = i8;
                                                    c1069ls32 = c1069ls2;
                                                    it52 = it;
                                                    c1248rl62 = c1248rl;
                                                    list52 = list3;
                                                    map52 = map2;
                                                    if (!it62.hasNext()) {
                                                    }
                                                } else {
                                                    AbstractC1806n.m3072T();
                                                    throw null;
                                                }
                                            }
                                            return c1694m;
                                        }
                                    } else {
                                        i202 = i12;
                                        i18 = i9;
                                        i192 = i10;
                                        it62 = c1100ms3;
                                        enumC2465a3 = enumC2465a;
                                        c1248rl72 = c1248rl62;
                                        c1248rl62 = c1248rl2;
                                        int i2122 = i18;
                                        enumC2465a2 = enumC2465a3;
                                        c1100ms2 = c1100ms52;
                                        c1694m = c1694m2;
                                        i14 = 2;
                                        int i2222 = i192;
                                        if (!it62.hasNext()) {
                                        }
                                    }
                                } finally {
                                }
                                m4681e = c1100ms52.m1956N0(m1986k, c1248rl62, null).m4187b(m4189a).m4681e();
                            } else {
                                AbstractC1806n.m3072T();
                                throw null;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj2);
                    if (!list.isEmpty() && !list2.isEmpty()) {
                        Iterator it7 = AbstractC1805m.m3062z0(list, Math.min(2, list.size())).iterator();
                        c1248rl = z7 ? 1 : 0;
                        it = it7;
                        c1069ls2 = c1069ls;
                        c1100ms2 = c1100ms;
                        i8 = 0;
                        map2 = map;
                        list3 = list2;
                        if (it.hasNext()) {
                        }
                    }
                    return c1694m;
                }
            }
        }
        c1100ms = this;
        c1069ls = new C1069ls(c1100ms, abstractC2583c);
        Object obj22 = c1069ls.f5741r;
        EnumC2465a enumC2465a22 = EnumC2465a.f13750e;
        i7 = c1069ls.f5743t;
        int i142 = 2;
        if (i7 == 0) {
        }
    }

    /* renamed from: h1 */
    public final SocketFactory m1982h1(SocketFactory socketFactory, int i7) {
        InetAddress byName;
        if (1024 <= i7 && i7 < 65536) {
            if (this.f6019G0 == EnumC1127no.f6362i) {
                byName = InetAddress.getByName("::");
            } else {
                byName = InetAddress.getByName("0.0.0.0");
            }
            AbstractC3367j.m5097b(byName);
            return new C1347ur(socketFactory, i7, byName);
        }
        return socketFactory;
    }

    /* renamed from: i1 */
    public final void m1983i1(long j6, String str) {
        C1471yr c1471yr;
        if (str != null && j6 > 0 && (c1471yr = (C1471yr) this.f6037P0.get(str)) != null) {
            c1471yr.f9776l.addAndGet(j6);
            long addAndGet = c1471yr.f9777m.addAndGet(j6);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            synchronized (c1471yr.f9778n) {
                try {
                    if (c1471yr.f9778n.isEmpty()) {
                        m1931z0(c1471yr.f9778n, elapsedRealtime, addAndGet, 5000L);
                    } else if (elapsedRealtime - ((C1382w0) c1471yr.f9778n.last()).f8284a >= 120) {
                        m1931z0(c1471yr.f9778n, elapsedRealtime, addAndGet, 5000L);
                    } else {
                        c1471yr.f9778n.removeLast();
                        m1931z0(c1471yr.f9778n, elapsedRealtime, addAndGet, 5000L);
                    }
                    c1471yr.f9775k = m1921m1(c1471yr);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: j0 */
    public final C1248rl m1984j0(C1248rl c1248rl) {
        Object obj;
        Iterator it = this.f6109s0.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3367j.m5096a(((C1248rl) obj).f7390a, c1248rl.f7390a)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1248rl c1248rl2 = (C1248rl) obj;
        if (c1248rl2 == null) {
            return c1248rl;
        }
        return c1248rl2;
    }

    /* renamed from: j1 */
    public final void m1985j1(long j6, String str) {
        C1471yr c1471yr;
        if (str != null && j6 > 0 && (c1471yr = (C1471yr) this.f6037P0.get(str)) != null) {
            long addAndGet = c1471yr.f9779o.addAndGet(j6);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (addAndGet >= 262144 || elapsedRealtime - c1471yr.f9780p >= 50) {
                long andSet = c1471yr.f9779o.getAndSet(0L);
                if (andSet > 0) {
                    c1471yr.f9780p = elapsedRealtime;
                    m1983i1(andSet, str);
                }
            }
        }
    }

    /* renamed from: k */
    public final C2623x m1986k() {
        if (this.f6080h0) {
            return (C2623x) this.f6090k1.getValue();
        }
        return this.f6036P;
    }

    /* renamed from: k0 */
    public final void m1987k0(C1248rl c1248rl, String str) {
        synchronized (this.f6035O0) {
            this.f6035O0.add(0, new C1475z0(System.currentTimeMillis(), str, c1248rl.f7391b, Math.max(1, this.f6016F.get())));
            while (this.f6035O0.size() > 24) {
                ArrayList arrayList = this.f6035O0;
                AbstractC3367j.m5100e(arrayList, "<this>");
                if (!arrayList.isEmpty()) {
                    arrayList.remove(AbstractC1806n.m3066N(arrayList));
                }
            }
        }
    }

    /* renamed from: l */
    public final int m1988l(C1248rl c1248rl) {
        int size;
        Integer num;
        if (this.f6080h0) {
            return m1897S(c1248rl);
        }
        if (!this.f6111t0.isEmpty()) {
            Iterator it = this.f6111t0.values().iterator();
            if (!it.hasNext()) {
                num = null;
            } else {
                Integer valueOf = Integer.valueOf(((List) it.next()).size());
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(((List) it.next()).size());
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                num = valueOf;
            }
            if (num != null) {
                size = num.intValue();
            } else {
                size = 0;
            }
        } else {
            size = this.f6101o0.size();
        }
        if (size < 1) {
            size = 1;
        }
        int i7 = this.f6115v0 / size;
        if (i7 < 1) {
            return 1;
        }
        return i7;
    }

    /* renamed from: l0 */
    public final void m1989l0(String str, C2598d0 c2598d0) {
        long j6;
        Object obj = this.f6006A.get(str);
        EnumC0736b9 enumC0736b9 = EnumC0736b9.f2629f;
        if (obj != enumC0736b9) {
            AbstractC2602f0 abstractC2602f0 = c2598d0.f14062k;
            if (abstractC2602f0 != null) {
                j6 = abstractC2602f0.mo4144c();
            } else {
                j6 = -1;
            }
            String m4141b = C2598d0.m4141b("Transfer-Encoding", c2598d0);
            boolean z7 = false;
            if (m4141b != null && AbstractC0444k.m928R(m4141b, "chunked", true)) {
                z7 = true;
            }
            if (j6 >= 0 && !z7) {
                return;
            }
            this.f6008B.put(str, enumC0736b9);
        }
    }

    /* renamed from: l1 */
    public final void m1990l1(int i7, String str, String str2, String str3) {
        Object putIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.f6037P0;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new C1471yr(i7, str, str2, str3)))) != null) {
            obj = putIfAbsent;
        }
    }

    /* renamed from: m */
    public final int m1991m(C1248rl c1248rl) {
        int size;
        Integer num;
        if (this.f6080h0) {
            return m1898T(c1248rl);
        }
        if (!this.f6113u0.isEmpty()) {
            Iterator it = this.f6113u0.values().iterator();
            if (!it.hasNext()) {
                num = null;
            } else {
                Integer valueOf = Integer.valueOf(((List) it.next()).size());
                while (it.hasNext()) {
                    Integer valueOf2 = Integer.valueOf(((List) it.next()).size());
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
                num = valueOf;
            }
            if (num != null) {
                size = num.intValue();
            } else {
                size = 0;
            }
        } else {
            size = this.f6103p0.size();
        }
        if (size < 1) {
            size = 1;
        }
        int i7 = this.f6119x0 / size;
        if (i7 < 1) {
            return 1;
        }
        return i7;
    }

    /* renamed from: n */
    public final int m1992n(int i7, int i8, int i9, int i10, int i11) {
        int max = Math.max(1, i7);
        int m3530q = AbstractC2168e.m3530q(i11, 1, this.f6017F0.f2358h);
        if (i8 > 1) {
            int i12 = m3530q / max;
            if (i9 < 1) {
                i9 = 1;
            }
            return AbstractC2168e.m3530q(i12, i9, i10);
        }
        return AbstractC2168e.m3530q(m3530q / Math.max(1, i7 * i8), 1, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (p024c6.AbstractC0451r.m971M(r4, "https://", false) == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044 A[SYNTHETIC] */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m1993n0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1811s.m3077Y(arrayList, AbstractC0444k.m940d0((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(arrayList));
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            AbstractC0094y0.m191r((String) obj, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            String str = (String) obj2;
            if (AbstractC0451r.m971M(str, "fetch+", false)) {
                str = AbstractC0444k.m943g0(str, "fetch+");
                if (AbstractC0451r.m971M(str, "http://", false) || AbstractC0451r.m971M(str, "https://", false)) {
                    this.f6006A.put(str, EnumC0736b9.f2629f);
                    if (str != null) {
                        arrayList3.add(str);
                    }
                }
                str = null;
                if (str != null) {
                }
            } else {
                if (!AbstractC0451r.m971M(str, "http://", false)) {
                }
                if (str != null) {
                }
            }
        }
        return arrayList3;
    }

    /* renamed from: n1 */
    public final void m1994n1(long j6, String str) {
        C1471yr c1471yr;
        if (j6 > 0 && (c1471yr = (C1471yr) this.f6037P0.get(str)) != null) {
            c1471yr.f9772h = j6;
        }
    }

    /* renamed from: o */
    public final boolean m1995o(C1248rl c1248rl) {
        String str;
        int i7;
        int i8;
        int m3530q;
        String obj;
        C0739bc c0739bc;
        C1100ms c1100ms = this;
        Double valueOf = Double.valueOf(0.0d);
        AbstractC3367j.m5100e(c1248rl, "target");
        int i9 = 0;
        if (!AbstractC0444k.m937a0(c1248rl.f7390a)) {
            List list = c1100ms.f6109s0;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (AbstractC3367j.m5096a(((C1248rl) it.next()).f7390a, c1248rl.f7390a)) {
                    }
                }
            }
            c1100ms.f6120y.remove(c1248rl.f7390a);
            c1100ms.f6109s0 = AbstractC1805m.m3059w0(c1100ms.f6109s0, c1248rl);
            boolean z7 = c1100ms.f6073f.get();
            boolean z8 = c1100ms.f6076g.get();
            if (z7) {
                c1100ms.f6095m0 = AbstractC1805m.m3059w0(c1100ms.f6095m0, c1248rl);
            }
            if (z8) {
                c1100ms.f6098n0 = AbstractC1805m.m3059w0(c1100ms.f6098n0, c1248rl);
            }
            synchronized (c1100ms.f6053X0) {
                c1100ms.f6100o.put(c1248rl.f7390a, new AtomicLong(0L));
                c1100ms.f6102p.put(c1248rl.f7390a, new AtomicLong(0L));
                c1100ms.f6104q.put(c1248rl.f7390a, new C1803k());
                c1100ms.f6106r.put(c1248rl.f7390a, new C1803k());
                c1100ms.f6110t.put(c1248rl.f7390a, valueOf);
                c1100ms.f6112u.put(c1248rl.f7390a, valueOf);
            }
            String str2 = c1248rl.f7394e;
            if (str2 != null && (obj = AbstractC0444k.m956t0(str2).toString()) != null) {
                if (AbstractC0444k.m937a0(obj)) {
                    obj = null;
                }
                if (obj != null && (c0739bc = (C0739bc) c1100ms.m2004w0().f2522d.get(obj)) != null) {
                    c1100ms.f6108s.put(c1248rl.f7390a, c0739bc);
                }
            }
            if (z7) {
                i7 = m1953M(c1248rl);
            } else {
                i7 = 0;
            }
            if (z8) {
                i8 = m1974c1(c1248rl);
            } else {
                i8 = 0;
            }
            AbstractC1249rm.m2261g0("ADD ok " + AbstractC1249rm.m2251b0(c1248rl) + " runDown=" + z7 + " runUp=" + z8 + " workers=d" + i7 + "/u" + i8);
            if (z7) {
                List list2 = (List) c1100ms.f6111t0.get(c1248rl.f7390a);
                if (list2 == null) {
                    list2 = c1100ms.f6101o0;
                }
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 == null) {
                    AbstractC1249rm.m2234N0("WORKERS download skip " + AbstractC1249rm.m2251b0(c1248rl) + " reason=no_urls");
                } else {
                    int m1988l = m1988l(c1248rl);
                    int size = list2.size() * m1988l;
                    if (c1100ms.f6083i0) {
                        m3530q = 0;
                    } else {
                        m3530q = AbstractC2168e.m3530q((int) (size * 0.0d), 0, 0);
                    }
                    int i10 = m3530q + size;
                    if (i10 <= 0) {
                        AbstractC1249rm.m2234N0("WORKERS download skip " + AbstractC1249rm.m2251b0(c1248rl) + " reason=zero_workers");
                    } else {
                        AbstractC1249rm.m2241T("WORKERS download start " + AbstractC1249rm.m2251b0(c1248rl) + " urls=" + list2.size() + " perUrl=" + m1988l + " total=" + i10);
                        c1100ms.f6117w0 = c1100ms.f6117w0 + i10;
                        ArrayList arrayList = new ArrayList(i10);
                        for (int i11 = 0; i11 < i10; i11++) {
                            arrayList.add(AbstractC0525d0.m1141s(c1100ms.f6070e, c1100ms.f6061b, new C0850es(c1100ms, c1248rl, i11, size, list2, (InterfaceC2313c) null), 2));
                        }
                    }
                }
            }
            if (z8) {
                List list3 = (List) c1100ms.f6113u0.get(c1248rl.f7390a);
                if (list3 == null) {
                    list3 = c1100ms.f6103p0;
                }
                if (list3.isEmpty()) {
                    list3 = null;
                }
                if (list3 == null) {
                    AbstractC1249rm.m2234N0("WORKERS upload skip " + AbstractC1249rm.m2251b0(c1248rl) + " reason=no_urls");
                    return true;
                }
                int m1991m = m1991m(c1248rl);
                int size2 = list3.size() * m1991m;
                if (size2 <= 0) {
                    AbstractC1249rm.m2234N0("WORKERS upload skip " + AbstractC1249rm.m2251b0(c1248rl) + " reason=zero_workers");
                    return true;
                }
                AbstractC1249rm.m2241T("WORKERS upload start " + AbstractC1249rm.m2251b0(c1248rl) + " urls=" + list3.size() + " perUrl=" + m1991m + " total=" + size2);
                c1100ms.f6121y0 = c1100ms.f6121y0 + size2;
                int i12 = 0;
                for (Object obj2 : list3) {
                    int i13 = i12 + 1;
                    if (i12 >= 0) {
                        String str3 = (String) obj2;
                        ArrayList arrayList2 = new ArrayList(m1991m);
                        int i14 = i9;
                        while (i14 < m1991m) {
                            arrayList2.add(AbstractC0525d0.m1141s(c1100ms.f6070e, c1100ms.f6067d, new C1007js(c1100ms, c1248rl, str3, i14, i12, (InterfaceC2313c) null), 2));
                            i14++;
                            c1100ms = this;
                            i9 = i9;
                        }
                        c1100ms = this;
                        i12 = i13;
                    } else {
                        AbstractC1806n.m3072T();
                        throw null;
                    }
                }
            }
            return true;
        }
        String m2251b0 = AbstractC1249rm.m2251b0(c1248rl);
        if (AbstractC0444k.m937a0(c1248rl.f7390a)) {
            str = "blank_id";
        } else {
            str = "already_present";
        }
        AbstractC1249rm.m2241T("ADD skip " + m2251b0 + " reason=" + str);
        return false;
    }

    /* renamed from: o1 */
    public final void m1996o1(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = this.f6037P0;
        C1471yr c1471yr = (C1471yr) concurrentHashMap.get(str);
        if (c1471yr != null) {
            c1471yr.f9773i = str2;
            if (!str2.equals("已结束") && !str2.equals("已停止")) {
                return;
            }
            concurrentHashMap.remove(str);
        }
    }

    /* renamed from: p */
    public final String m1997p(String str) {
        String m4044h;
        String str2 = this.f6025J0;
        if (AbstractC0444k.m937a0(str2)) {
            str2 = null;
        }
        if (str2 != null && (m4044h = AbstractC2487d.m4044h(str, "；", str2)) != null) {
            return m4044h;
        }
        return str;
    }

    /* renamed from: p0 */
    public final C1316tr m1998p0(C1803k c1803k, long j6, double d7) {
        Object obj;
        double d8;
        double d9;
        double m1944G;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        C1382w0 c1382w0 = (C1382w0) c1803k.m3005f();
        double d15 = 0.0d;
        if (c1382w0 == null) {
            return new C1316tr(0.0d, 0.0d);
        }
        long j7 = j6 - 2000;
        Iterator it = c1803k.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C1382w0) obj).f8284a >= j7) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1382w0 c1382w02 = (C1382w0) obj;
        if (c1382w02 == null) {
            c1382w02 = (C1382w0) c1803k.first();
        }
        long j8 = c1382w0.f8285b;
        long j9 = c1382w02.f8285b;
        if (j8 <= j9) {
            return new C1316tr(0.0d, 0.0d);
        }
        boolean z7 = false;
        if (j8 > j9 && !c1803k.isEmpty()) {
            Iterator it2 = c1803k.iterator();
            while (it2.hasNext()) {
                C1382w0 c1382w03 = (C1382w0) it2.next();
                d8 = d15;
                if (c1382w03.f8285b == c1382w02.f8285b && c1382w03.f8284a >= c1382w02.f8284a) {
                    z7 = true;
                    break;
                }
                d15 = d8;
            }
        }
        d8 = d15;
        double m1925r0 = m1925r0(c1803k, j6, 2000L);
        boolean m1915h0 = m1915h0(m1925r0, d7);
        if (z7 || m1915h0) {
            m1925r0 = m1925r0(c1803k, j6, 1000L);
        }
        if (m1925r0 <= d8) {
            double d16 = d8;
            return new C1316tr(d16, d16);
        }
        double d17 = 0.72d;
        if (d7 <= d8) {
            d9 = 1.45d;
            d13 = m1925r0;
        } else {
            if (z7 && m1925r0 > d7) {
                double m1944G2 = m1944G(0.72d);
                d10 = (m1944G2 * m1925r0) + ((1.0d - m1944G2) * d7);
                d9 = 1.45d;
            } else {
                if (m1925r0 > d7) {
                    if (d7 >= 80.0d && m1925r0 >= d7 * 1.45d) {
                        d12 = 0.88d;
                    } else if (m1915h0(m1925r0, d7)) {
                        d12 = 0.8d;
                    } else {
                        d9 = 1.45d;
                        d11 = 0.55d;
                        m1944G = m1944G(d11);
                    }
                    d9 = 1.45d;
                    d11 = d12;
                    m1944G = m1944G(d11);
                } else {
                    d9 = 1.45d;
                    m1944G = m1944G(0.22d);
                }
                d10 = (m1944G * m1925r0) + ((1.0d - m1944G) * d7);
            }
            d13 = d10;
        }
        if (z7) {
            d14 = Math.max(d13, (0.44999999999999996d * d13) + (m1925r0 * 0.55d));
        } else {
            if (m1915h0) {
                if (d7 < 80.0d || m1925r0 < d7 * d9) {
                    if (m1915h0(m1925r0, d7)) {
                        d17 = 0.58d;
                    }
                }
                d14 = Math.max(d13, ((1.0d - d17) * d13) + (m1925r0 * d17));
            }
            d14 = d13;
        }
        return new C1316tr(d14, d13);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: q0 */
    public final java.lang.Object m1999q0(p039e5.C1248rl r20, java.util.List r21, java.lang.String r22, int r23, int r24, int r25, java.lang.String r26, p098m5.AbstractC2583c r27) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p039e5.C1100ms.m1999q0(e5.rl, java.util.List, java.lang.String, int, int, int, java.lang.String, m5.c):java.lang.Object");
    }

    /* renamed from: s */
    public final C1285sr m2000s(EnumC1127no enumC1127no, List list, List list2, List list3, Map map, Map map2, boolean z7, boolean z8) {
        C1100ms c1100ms;
        Map map3;
        EnumC1127no enumC1127no2;
        Map map4;
        List list4;
        List list5;
        boolean z9;
        List list6;
        Map map5;
        String str;
        String str2;
        if (enumC1127no == EnumC1127no.f6360g) {
            c1100ms = this;
            if (!c1100ms.f6021H0.m2388b()) {
                return new C1285sr(list2, list3, map, map2, "", null, null);
            }
        } else {
            c1100ms = this;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        if (z7) {
            map3 = c1100ms.m1966W("下载", enumC1127no, list, list2, map, linkedHashMap, arrayList);
        } else {
            map3 = map;
        }
        if (z8) {
            enumC1127no2 = enumC1127no;
            map4 = m1966W("上传", enumC1127no2, list, list3, map2, linkedHashMap, arrayList);
        } else {
            enumC1127no2 = enumC1127no;
            map4 = map2;
        }
        if (!map3.isEmpty()) {
            list4 = AbstractC1805m.m3042f0(AbstractC1807o.m3074V(map3.values()));
        } else {
            list4 = list2;
        }
        if (!map4.isEmpty()) {
            list5 = AbstractC1805m.m3042f0(AbstractC1807o.m3074V(map4.values()));
        } else {
            list5 = list3;
        }
        ArrayList m3074V = AbstractC1807o.m3074V(map.values());
        boolean isEmpty = m3074V.isEmpty();
        List list7 = m3074V;
        if (isEmpty) {
            list7 = list2;
        }
        ArrayList m3074V2 = AbstractC1807o.m3074V(map2.values());
        boolean isEmpty2 = m3074V2.isEmpty();
        List list8 = m3074V2;
        if (isEmpty2) {
            list8 = list3;
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = true;
        if (z7 && !list7.isEmpty() && list4.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z8 || list8.isEmpty() || !list5.isEmpty()) {
            z10 = false;
        }
        if (z9) {
            arrayList2.add(enumC1127no2.f6365e + "：下载方向所有地址均无 " + enumC1127no2.f6366f + "，已停止下载测速");
        }
        if (z10) {
            arrayList2.add(enumC1127no2.f6365e + "：上传方向所有地址均无 " + enumC1127no2.f6366f + "，已停止上传测速");
        }
        if (!arrayList.isEmpty()) {
            arrayList2.add(enumC1127no2.f6365e + "：以下地址无 " + enumC1127no2.f6366f + " 解析，已跳过：" + m1901X0(arrayList));
        }
        String m3051o0 = AbstractC1805m.m3051o0(AbstractC1805m.m3042f0(arrayList2), "；", null, null, null, 62);
        if (z9) {
            String str3 = enumC1127no2.f6365e;
            String str4 = enumC1127no2.f6366f;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                List list9 = list4;
                Map map6 = map4;
                if (AbstractC0451r.m971M((String) obj, "下载", false)) {
                    arrayList3.add(obj);
                }
                list4 = list9;
                map4 = map6;
            }
            list6 = list4;
            map5 = map4;
            str = str3 + "：下载方向所有地址均解析不出 " + str4 + "，无法测速。问题地址：" + m1901X0(arrayList3);
        } else {
            list6 = list4;
            map5 = map4;
            str = null;
        }
        if (z10) {
            String str5 = enumC1127no2.f6365e;
            String str6 = enumC1127no2.f6366f;
            ArrayList arrayList4 = new ArrayList();
            int size2 = arrayList.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj2 = arrayList.get(i8);
                i8++;
                if (AbstractC0451r.m971M((String) obj2, "上传", false)) {
                    arrayList4.add(obj2);
                }
            }
            str2 = str5 + "：上传方向所有地址均解析不出 " + str6 + "，无法测速。问题地址：" + m1901X0(arrayList4);
        } else {
            str2 = null;
        }
        return new C1285sr(list6, list5, map3, map5, m3051o0, str, str2);
    }

    /* renamed from: s0 */
    public final HttpURLConnection m2001s0(C1248rl c1248rl, String str, String str2) {
        URLConnection openConnection;
        C1248rl m1984j0 = m1984j0(c1248rl);
        C1006jr c1006jr = (C1006jr) this.f6105q0.get(str);
        URL url = new URL(str);
        Network network = m1984j0.f7392c;
        if (network == null || (openConnection = network.openConnection(url)) == null) {
            openConnection = url.openConnection();
        }
        AbstractC3367j.m5098c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        Map map = null;
        if (c1006jr != null) {
            String m1618b = c1006jr.m1618b();
            if (!str2.equals("GET")) {
                m1618b = null;
            }
            if (m1618b != null) {
                str2 = m1618b;
            }
        }
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(12000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setRequestProperty("Accept", "*/*");
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Cache-Control", "no-cache");
        httpURLConnection.setRequestProperty("Priority", "u=0, i");
        if (c1006jr != null) {
            map = c1006jr.f5165c;
        }
        if (map == null) {
            map = C1814v.f10861e;
        }
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return httpURLConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
    /* renamed from: v0 */
    public final void m2002v0(boolean z7, boolean z8, String str) {
        boolean z9;
        double d7;
        C1813u c1813u;
        C1813u c1813u2;
        String str2;
        String str3;
        if (z7 && z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        C1701c0 c1701c0 = this.f6084i1;
        C0976ir c0976ir = (C0976ir) c1701c0.getValue();
        boolean z10 = this.f6073f.get();
        boolean z11 = this.f6076g.get();
        double d8 = 0.0d;
        if (z7) {
            d7 = 0.0d;
        } else {
            d7 = ((C0976ir) c1701c0.getValue()).f4970c;
        }
        if (!z8) {
            d8 = ((C0976ir) c1701c0.getValue()).f4971d;
        }
        C1813u c1813u3 = C1813u.f10860e;
        if (z9) {
            c1813u = c1813u3;
        } else {
            c1813u = ((C0976ir) c1701c0.getValue()).f4980m;
        }
        if (z9) {
            c1813u2 = c1813u3;
        } else {
            List list = ((C0976ir) c1701c0.getValue()).f4993z;
            ?? arrayList = new ArrayList();
            for (Object obj : list) {
                C0948hu c0948hu = (C0948hu) obj;
                if ((!c0948hu.f4660b.equals("下载") || !z7) && (!c0948hu.f4660b.equals("上传") || !z8)) {
                    arrayList.add(obj);
                }
            }
            c1813u2 = arrayList;
        }
        if (z9) {
            str2 = m1899U0(str);
        } else {
            str2 = ((C0976ir) c1701c0.getValue()).f4985r;
        }
        String str4 = str2;
        if (z9) {
            str3 = str;
        } else {
            str3 = ((C0976ir) c1701c0.getValue()).f4986s;
        }
        C0976ir m1609a = C0976ir.m1609a(c0976ir, z10, z11, d7, d8, 0.0d, 0.0d, c1813u, null, str4, str3, c1813u2, null, 0, 2113531888);
        c1701c0.getClass();
        c1701c0.m2752j(null, m1609a);
    }

    /* renamed from: w */
    public final C2592a0 m2003w(String str, String str2) {
        C1006jr c1006jr = (C1006jr) this.f6105q0.get(str);
        C2625z c2625z = new C2625z();
        c2625z.m4194f(str);
        m1923q(c2625z, c1006jr);
        c2625z.m4191c("Accept", "*/*");
        c2625z.m4191c("Accept-Encoding", "identity");
        c2625z.m4191c("Connection", "Keep-Alive");
        c2625z.m4191c("Priority", "u=0, i");
        c2625z.m4191c("Cache-Control", "no-cache");
        m1924r(c2625z, c1006jr);
        if (str2 != null) {
            c2625z.m4193e(new C0916gu(str2));
        }
        return c2625z.m4189a();
    }

    /* renamed from: w0 */
    public final C0725au m2004w0() {
        long rxBytes;
        long txBytes;
        Iterator it;
        long j6;
        C1687f c1687f;
        String obj;
        if (this.f6074f0 == EnumC0757bu.f2915f) {
            C0725au m2201t = C1247rk.f7379f.m2201t();
            if (m2201t != null) {
                return m2201t;
            }
            this.f6074f0 = EnumC0757bu.f2914e;
        }
        long uidRxBytes = TrafficStats.getUidRxBytes(this.f6026K);
        long j7 = -1;
        if (uidRxBytes == -1) {
            uidRxBytes = -1;
        }
        long uidTxBytes = TrafficStats.getUidTxBytes(this.f6026K);
        if (uidTxBytes == -1) {
            uidTxBytes = -1;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        List list = this.f6109s0;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            String str = null;
            if (!it2.hasNext()) {
                break;
            }
            String str2 = ((C1248rl) it2.next()).f7394e;
            if (str2 != null && (obj = AbstractC0444k.m956t0(str2).toString()) != null && !AbstractC0444k.m937a0(obj)) {
                str = obj;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        List m3042f0 = AbstractC1805m.m3042f0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = m3042f0.iterator();
        while (it3.hasNext()) {
            String str3 = (String) it3.next();
            rxBytes = TrafficStats.getRxBytes(str3);
            if (rxBytes == j7) {
                rxBytes = j7;
            }
            txBytes = TrafficStats.getTxBytes(str3);
            if (txBytes == j7) {
                txBytes = j7;
            }
            if (rxBytes < 0 && txBytes < 0) {
                it = it3;
                c1687f = null;
            } else {
                if (rxBytes < 0) {
                    rxBytes = 0;
                }
                if (txBytes < 0) {
                    it = it3;
                    j6 = 0;
                } else {
                    it = it3;
                    j6 = txBytes;
                }
                c1687f = new C1687f(str3, new C0739bc(rxBytes, j6));
            }
            if (c1687f != null) {
                arrayList2.add(c1687f);
            }
            it3 = it;
            j7 = -1;
        }
        return new C0725au(uidRxBytes, uidTxBytes, elapsedRealtime, AbstractC1817y.m3086R(arrayList2));
    }

    /* renamed from: x */
    public final C2592a0 m2005x(String str, String str2) {
        C1006jr c1006jr = (C1006jr) this.f6105q0.get(str);
        C2625z c2625z = new C2625z();
        c2625z.m4194f(str);
        m1923q(c2625z, c1006jr);
        c2625z.m4191c("Connection", "Keep-Alive");
        c2625z.m4191c("Accept-Encoding", "identity");
        m1924r(c2625z, c1006jr);
        if (str2 != null) {
            c2625z.m4193e(new C0916gu(str2));
        }
        return c2625z.m4189a();
    }

    /* renamed from: x0 */
    public final boolean m2006x0(C1248rl c1248rl, String str) {
        Object obj;
        String str2;
        C1248rl c1248rl2;
        AbstractC3367j.m5100e(str, "targetId");
        boolean z7 = false;
        if (AbstractC0444k.m937a0(str)) {
            return false;
        }
        this.f6120y.remove(str);
        Iterator it = this.f6109s0.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3367j.m5096a(((C1248rl) obj).f7390a, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1248rl c1248rl3 = (C1248rl) obj;
        List<C1248rl> list = this.f6109s0;
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
        for (C1248rl c1248rl4 : list) {
            if (!AbstractC3367j.m5096a(c1248rl4.f7390a, str)) {
                c1248rl2 = c1248rl;
            } else {
                C1248rl c1248rl5 = c1248rl;
                c1248rl4 = C1248rl.m2204a(c1248rl5, c1248rl4.f7390a, c1248rl4.f7391b, null, null, 60);
                c1248rl2 = c1248rl5;
                z7 = true;
            }
            arrayList.add(c1248rl4);
            c1248rl = c1248rl2;
        }
        C1248rl c1248rl6 = c1248rl;
        this.f6109s0 = arrayList;
        List<C1248rl> list2 = this.f6095m0;
        ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list2));
        for (C1248rl c1248rl7 : list2) {
            if (AbstractC3367j.m5096a(c1248rl7.f7390a, str)) {
                c1248rl7 = C1248rl.m2204a(c1248rl6, c1248rl7.f7390a, c1248rl7.f7391b, null, null, 60);
                z7 = true;
            }
            arrayList2.add(c1248rl7);
        }
        this.f6095m0 = arrayList2;
        List<C1248rl> list3 = this.f6098n0;
        ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(list3));
        for (C1248rl c1248rl8 : list3) {
            if (AbstractC3367j.m5096a(c1248rl8.f7390a, str)) {
                c1248rl8 = C1248rl.m2204a(c1248rl6, c1248rl8.f7390a, c1248rl8.f7391b, null, null, 60);
                z7 = true;
            }
            arrayList3.add(c1248rl8);
        }
        this.f6098n0 = arrayList3;
        if (z7) {
            m1936C(str);
            m1960R();
            String m2251b0 = AbstractC1249rm.m2251b0(c1248rl6);
            if (c1248rl3 == null || (str2 = AbstractC2487d.m4058v("change=", AbstractC1249rm.m2249a0(c1248rl3, c1248rl6))) == null) {
                str2 = "change=unknown";
            }
            AbstractC1249rm.m2261g0("REBIND ok " + m2251b0 + " " + str2);
        } else {
            String str3 = "REBIND skip targetId=" + str + " not_active";
            AbstractC3367j.m5100e(str3, "message");
            if (Log.isLoggable("HBCS-NetIface", 3)) {
                Log.d("HBCS-NetIface", str3);
            }
        }
        return z7;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5 A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:7:0x0023, B:9:0x002d, B:10:0x0038, B:12:0x003e, B:14:0x004d, B:16:0x0057, B:17:0x0062, B:19:0x0068, B:22:0x007a, B:24:0x0084, B:26:0x009d, B:28:0x00a5, B:57:0x00aa, B:59:0x00b4, B:60:0x008c, B:62:0x0096, B:64:0x0074, B:65:0x0048), top: B:6:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:7:0x0023, B:9:0x002d, B:10:0x0038, B:12:0x003e, B:14:0x004d, B:16:0x0057, B:17:0x0062, B:19:0x0068, B:22:0x007a, B:24:0x0084, B:26:0x009d, B:28:0x00a5, B:57:0x00aa, B:59:0x00b4, B:60:0x008c, B:62:0x0096, B:64:0x0074, B:65:0x0048), top: B:6:0x0023 }] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m2007y(long j6) {
        C1803k c1803k;
        C1803k c1803k2;
        C1803k c1803k3;
        long j7;
        long j8;
        C1382w0 c1382w0;
        long j9;
        double d7;
        double d8;
        C1316tr c1316tr;
        C1316tr c1316tr2;
        C1316tr c1316tr3;
        List<C1248rl> list = this.f6109s0;
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
        for (C1248rl c1248rl : list) {
            String str = c1248rl.f7390a;
            synchronized (this.f6053X0) {
                try {
                    C1803k c1803k4 = (C1803k) this.f6104q.get(str);
                    if (c1803k4 != null) {
                        c1803k = new C1803k(c1803k4.f10858g);
                        Iterator<E> it = c1803k4.iterator();
                        while (it.hasNext()) {
                            c1803k.addLast((C1382w0) it.next());
                        }
                    } else {
                        c1803k = new C1803k();
                    }
                    C1803k c1803k5 = (C1803k) this.f6106r.get(str);
                    if (c1803k5 != null) {
                        c1803k2 = new C1803k(c1803k5.f10858g);
                        Iterator<E> it2 = c1803k5.iterator();
                        while (it2.hasNext()) {
                            c1803k2.addLast((C1382w0) it2.next());
                        }
                    } else {
                        c1803k2 = new C1803k();
                    }
                    c1803k3 = c1803k2;
                    C1382w0 c1382w02 = (C1382w0) c1803k.m3005f();
                    long j10 = 0;
                    if (c1382w02 != null) {
                        j8 = c1382w02.f8285b;
                    } else {
                        AtomicLong atomicLong = (AtomicLong) this.f6100o.get(str);
                        if (atomicLong != null) {
                            j8 = atomicLong.get();
                        } else {
                            j7 = 0;
                            c1382w0 = (C1382w0) c1803k3.m3005f();
                            if (c1382w0 == null) {
                                j10 = c1382w0.f8285b;
                            } else {
                                AtomicLong atomicLong2 = (AtomicLong) this.f6102p.get(str);
                                if (atomicLong2 != null) {
                                    j10 = atomicLong2.get();
                                }
                            }
                            j9 = j10;
                        }
                    }
                    j7 = j8;
                    c1382w0 = (C1382w0) c1803k3.m3005f();
                    if (c1382w0 == null) {
                    }
                    j9 = j10;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Double d9 = (Double) this.f6110t.get(str);
            if (d9 != null) {
                d7 = d9.doubleValue();
            } else {
                d7 = 0.0d;
            }
            Double d10 = (Double) this.f6112u.get(str);
            if (d10 != null) {
                d8 = d10.doubleValue();
            } else {
                d8 = 0.0d;
            }
            if (this.f6073f.get() && c1803k.f10858g >= 2) {
                c1316tr = m1998p0(c1803k, j6, d7);
            } else {
                c1316tr = new C1316tr(0.0d, 0.0d);
            }
            if (this.f6076g.get() && c1803k3.f10858g >= 2) {
                c1316tr2 = c1316tr;
                c1316tr3 = m1998p0(c1803k3, j6, d8);
            } else {
                c1316tr2 = c1316tr;
                c1316tr3 = new C1316tr(0.0d, 0.0d);
            }
            this.f6110t.put(str, Double.valueOf(c1316tr2.f7862b));
            this.f6112u.put(str, Double.valueOf(c1316tr3.f7862b));
            String str2 = c1248rl.f7391b;
            String str3 = c1248rl.f7394e;
            if (str3 == null) {
                str3 = "";
            }
            arrayList.add(new C0707ac(str, str2, str3, c1316tr2.f7861a, c1316tr3.f7861a, j7, j9));
        }
        return AbstractC1805m.m3061y0(arrayList, new C0918h0(9));
    }

    /* renamed from: y0 */
    public final String m2008y0(String str, boolean z7) {
        String str2;
        if (!z7) {
            return "重连";
        }
        C1471yr c1471yr = (C1471yr) this.f6037P0.get(str);
        if (c1471yr != null) {
            str2 = c1471yr.f9773i;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (AbstractC0451r.m971M(str2, "失败：", false)) {
            return AbstractC0444k.m955s0(str2.concat(" · 重连"), 96);
        }
        return "失败·重连";
    }

    /* renamed from: z */
    public final C2623x m2009z(boolean z7) {
        C2610k c2610k;
        C0019e1 c0019e1;
        long j6;
        C2622w c2622w = new C2622w();
        if (z7) {
            c2610k = this.f6030M;
        } else {
            c2610k = this.f6028L;
        }
        AbstractC3367j.m5100e(c2610k, "dispatcher");
        c2622w.f14166a = c2610k;
        if (z7) {
            c0019e1 = this.f6034O;
        } else {
            c0019e1 = this.f6032N;
        }
        AbstractC3367j.m5100e(c0019e1, "connectionPool");
        c2622w.f14167b = c0019e1;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j7 = 5000;
        c2622w.m4180a(5000L, timeUnit);
        if (z7) {
            j6 = 0;
        } else {
            j6 = 12000;
        }
        c2622w.m4183d(j6, timeUnit);
        if (!z7) {
            j7 = 12000;
        }
        c2622w.m4185f(j7, timeUnit);
        AbstractC3367j.m5100e(timeUnit, "unit");
        c2622w.f14187v = AbstractC2721b.m4356b("timeout", 0L, timeUnit);
        c2622w.f14191z = AbstractC2721b.m4356b("interval", 2000L, timeUnit);
        c2622w.f14173h = true;
        c2622w.f14174i = true;
        c2622w.f14171f = true;
        c2622w.f14170e = new C1130nr(this, 2);
        c2622w.m4182c(AbstractC3784a.m5817z(EnumC2624y.f14223g));
        return new C2623x(c2622w);
    }
}
