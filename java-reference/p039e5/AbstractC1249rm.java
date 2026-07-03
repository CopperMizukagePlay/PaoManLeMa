package p039e5;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkSpecifier;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material3.AbstractC0165a;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.FileProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.IDN;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URLDecoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p001a0.AbstractC0094y0;
import p001a0.C0047l1;
import p008b.C0226c0;
import p008b.C0242k0;
import p015b6.AbstractC0307n;
import p015b6.C0295b;
import p015b6.C0296c;
import p015b6.C0300g;
import p015b6.C0302i;
import p015b6.C0303j;
import p015b6.C0308o;
import p015b6.C0310q;
import p015b6.C0312s;
import p017c.C0317b;
import p017c.C0318c;
import p017c.C0328m;
import p018c0.C0334d;
import p018c0.C0341k;
import p024c6.AbstractC0434a;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p024c6.C0437d;
import p024c6.C0439f;
import p024c6.C0442i;
import p024c6.C0453t;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0575u;
import p032d6.InterfaceC0516a0;
import p035e1.AbstractC0659i0;
import p035e1.C0677s;
import p048g.C1566b;
import p050g2.C1604o0;
import p053g5.C1687f;
import p053g5.C1689h;
import p053g5.C1690i;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1811s;
import p060h5.AbstractC1817y;
import p060h5.C1813u;
import p060h5.C1814v;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1951m4;
import p063i0.AbstractC1987r0;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.AbstractC2047y4;
import p063i0.AbstractC2050z;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p063i0.C2042y;
import p065i2.AbstractC2064e;
import p066i3.AbstractC2067b;
import p067i4.AbstractC2072e;
import p068i5.AbstractC2080d;
import p068i5.C2079c;
import p073j2.AbstractC2168e;
import p080k2.C2300k;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p098m5.AbstractC2583c;
import p100n.AbstractC2647h;
import p102n1.AbstractC2710c;
import p105n5.C2719b;
import p107o.C2769p1;
import p116p0.AbstractC2834c;
import p132r2.C3037k;
import p135r5.AbstractC3063j;
import p144t.AbstractC3122c;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3120b;
import p144t.C3130g;
import p144t.C3137j0;
import p144t.C3147o0;
import p144t.C3149p0;
import p144t.C3152r;
import p144t.C3167y0;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p152u.AbstractC3333u;
import p152u.C3320h;
import p152u.C3330r;
import p153u0.AbstractC3344k;
import p158u5.AbstractC3367j;
import p158u5.C3377t;
import p161v0.C3472s;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p171w2.C3767q;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3801i;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rm */
/* loaded from: classes.dex */
public abstract class AbstractC1249rm {

    /* renamed from: a */
    public static final Object f7396a = new Object();

    /* renamed from: A */
    public static final void m2207A(final String str, final String str2, final boolean z7, boolean z8, final InterfaceC3279c interfaceC3279c, C2395p c2395p, final int i7, final int i8) {
        int i9;
        boolean z9;
        int i10;
        int i11;
        int i12;
        boolean z10;
        C2395p c2395p2 = c2395p;
        c2395p2.m3859a0(-1177333893);
        if (c2395p2.m3872h(z7)) {
            i9 = 256;
        } else {
            i9 = 128;
        }
        int i13 = i7 | i9;
        int i14 = i8 & 8;
        if (i14 != 0) {
            i11 = i13 | 3072;
            z9 = z8;
        } else {
            z9 = z8;
            if (c2395p2.m3872h(z9)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i11 = i13 | i10;
        }
        if (c2395p2.m3874i(interfaceC3279c)) {
            i12 = 16384;
        } else {
            i12 = 8192;
        }
        int i15 = i11 | i12;
        if ((i15 & 9363) == 9362 && c2395p2.m3836D()) {
            c2395p2.m3852U();
        } else {
            if (i14 != 0) {
                z10 = true;
            } else {
                z10 = z9;
            }
            float f7 = 1.0f;
            InterfaceC3810r m346e = AbstractC0155c.m346e(C3807o.f17991a, 1.0f);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17974o, c2395p2, 48);
            int hashCode = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m = c2395p2.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, m346e);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p2.m3863c0();
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z);
            } else {
                c2395p2.m3883m0();
            }
            C3504h c3504h = C3507i.f16931e;
            AbstractC2418w.m3954C(m4854a, c2395p2, c3504h);
            C3504h c3504h2 = C3507i.f16930d;
            AbstractC2418w.m3954C(m3882m, c2395p2, c3504h2);
            C3504h c3504h3 = C3507i.f16932f;
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h3);
            }
            C3504h c3504h4 = C3507i.f16929c;
            AbstractC2418w.m3954C(m5823c, c2395p2, c3504h4);
            if (1.0f > 0.0d) {
                if (1.0f > Float.MAX_VALUE) {
                    f7 = Float.MAX_VALUE;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f7, true);
                C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p2, 0);
                int hashCode2 = Long.hashCode(c2395p2.f13486T);
                InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
                InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, layoutWeightElement);
                c2395p2.m3863c0();
                if (c2395p2.f13485S) {
                    c2395p2.m3880l(c3558z);
                } else {
                    c2395p2.m3883m0();
                }
                AbstractC2418w.m3954C(m4857a, c2395p2, c3504h);
                AbstractC2418w.m3954C(m3882m2, c2395p2, c3504h2);
                if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode2))) {
                    AbstractC2487d.m4050n(hashCode2, c2395p2, hashCode2, c3504h3);
                }
                AbstractC2418w.m3954C(m5823c2, c2395p2, c3504h4);
                C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                AbstractC1850a7.m3108b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(c2394o2)).f11253j, c2395p, 6, 0, 65534);
                AbstractC1850a7.m3108b(str2, null, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11255l, c2395p, 6, 0, 65530);
                c2395p2 = c2395p;
                c2395p2.m3888r(true);
                z9 = z10;
                AbstractC0165a.m376a(z7, interfaceC3279c, null, z9, null, c2395p2, ((i15 >> 6) & 14) | ((i15 >> 9) & 112) | (57344 & (i15 << 3)));
                c2395p2.m3888r(true);
            } else {
                throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            final boolean z11 = z9;
            m3891u.f13542d = new InterfaceC3281e(str, str2, z7, z11, interfaceC3279c, i7, i8) { // from class: e5.q9

                /* renamed from: e */
                public final /* synthetic */ String f7055e;

                /* renamed from: f */
                public final /* synthetic */ String f7056f;

                /* renamed from: g */
                public final /* synthetic */ boolean f7057g;

                /* renamed from: h */
                public final /* synthetic */ boolean f7058h;

                /* renamed from: i */
                public final /* synthetic */ InterfaceC3279c f7059i;

                /* renamed from: j */
                public final /* synthetic */ int f7060j;

                {
                    this.f7060j = i8;
                }

                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int m3957F = AbstractC2418w.m3957F(55);
                    AbstractC1249rm.m2207A(this.f7055e, this.f7056f, this.f7057g, this.f7058h, this.f7059i, (C2395p) obj, m3957F, this.f7060j);
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable m2208A0(Context context, String str, EnumC0704a9 enumC0704a9, AbstractC2583c abstractC2583c) {
        C1454ya c1454ya;
        int i7;
        int i8;
        C1405wn c1405wn;
        EnumC0704a9 enumC0704a92;
        int size;
        int i9;
        int size2;
        C0877fn c0877fn;
        String str2;
        if (abstractC2583c instanceof C1454ya) {
            C1454ya c1454ya2 = (C1454ya) abstractC2583c;
            int i10 = c1454ya2.f9310j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1454ya2.f9310j = i10 - Integer.MIN_VALUE;
                c1454ya = c1454ya2;
                Object obj = c1454ya.f9309i;
                i7 = c1454ya.f9310j;
                i8 = 0;
                InterfaceC2313c interfaceC2313c = null;
                if (i7 == 0) {
                    if (i7 == 1) {
                        enumC0704a92 = c1454ya.f9308h;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    Context applicationContext = context.getApplicationContext();
                    AbstractC3367j.m5099d(applicationContext, "getApplicationContext(...)");
                    C1405wn m2239R = m2239R(applicationContext, context.getSharedPreferences("speed_test_profiles", 0).getBoolean("diag_dns_use_speed_dns", true), context.getSharedPreferences("speed_test_profiles", 0).getBoolean("diag_dns_use_speed_ecs", true), context.getSharedPreferences("speed_test_profiles", 0).getBoolean("diag_dns_page_dns_enabled", false), m2259f0(context), context.getSharedPreferences("speed_test_profiles", 0).getBoolean("diag_dns_page_ecs_enabled", false), m2257e0(context));
                    if (m2239R.m2388b()) {
                        c1405wn = m2239R;
                    } else {
                        c1405wn = null;
                    }
                    enumC0704a92 = enumC0704a9;
                    c1454ya.f9308h = enumC0704a92;
                    c1454ya.f9310j = 1;
                    C2325e c2325e = AbstractC0549l0.f1898a;
                    obj = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0334d(str, interfaceC2313c, c1405wn, interfaceC2313c, 17), c1454ya);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (obj == enumC2465a) {
                        return enumC2465a;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    InetAddress inetAddress = (InetAddress) obj2;
                    int ordinal = enumC0704a92.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                throw new RuntimeException();
                            }
                        } else if (inetAddress.getAddress().length == 16) {
                        }
                        arrayList.add(obj2);
                    } else if (inetAddress.getAddress().length == 4) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                size = arrayList.size();
                i9 = 0;
                while (i9 < size) {
                    Object obj3 = arrayList.get(i9);
                    i9++;
                    InetAddress inetAddress2 = (InetAddress) obj3;
                    String hostAddress = inetAddress2.getHostAddress();
                    if (hostAddress != null) {
                        if (inetAddress2.getAddress().length == 4) {
                            str2 = "IPv4";
                        } else {
                            str2 = "IPv6";
                        }
                        c0877fn = new C0877fn(hostAddress, str2);
                    } else {
                        c0877fn = null;
                    }
                    if (c0877fn != null) {
                        arrayList2.add(c0877fn);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                size2 = arrayList2.size();
                while (i8 < size2) {
                    Object obj4 = arrayList2.get(i8);
                    i8++;
                    if (hashSet.add(((C0877fn) obj4).f4045a)) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
            }
        }
        c1454ya = new AbstractC2583c(abstractC2583c);
        Object obj5 = c1454ya.f9309i;
        i7 = c1454ya.f9310j;
        i8 = 0;
        InterfaceC2313c interfaceC2313c2 = null;
        if (i7 == 0) {
        }
        ArrayList arrayList4 = new ArrayList();
        while (r1.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList();
        size = arrayList4.size();
        i9 = 0;
        while (i9 < size) {
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList32 = new ArrayList();
        size2 = arrayList22.size();
        while (i8 < size2) {
        }
        return arrayList32;
    }

    /* renamed from: B */
    public static final void m2209B(int i7, C2395p c2395p) {
        c2395p.m3859a0(-100097498);
        if (i7 == 0 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            Context context = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
            c2395p.m3857Z(332577667);
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
                m3847O = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O;
            Object m181h = AbstractC0094y0.m181h(332579458, c2395p, false);
            if (m181h == c2413u0) {
                m181h = new C2349d1(0);
                c2395p.m3877j0(m181h);
            }
            C2349d1 c2349d1 = (C2349d1) m181h;
            Object m181h2 = AbstractC0094y0.m181h(332581443, c2395p, false);
            if (m181h2 == c2413u0) {
                m181h2 = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p.m3877j0(m181h2);
            }
            InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) m181h2;
            Object m181h3 = AbstractC0094y0.m181h(332583285, c2395p, false);
            if (m181h3 == c2413u0) {
                AbstractC3367j.m5100e(context, "context");
                SharedPreferences sharedPreferences = context.getSharedPreferences("legal_consent", 0);
                if (sharedPreferences.getBoolean("accepted", false)) {
                    long j6 = sharedPreferences.getLong("accepted_at_ms", 0L);
                    Long valueOf = Long.valueOf(j6);
                    if (j6 > 0) {
                        m181h3 = valueOf;
                        c2395p.m3877j0(m181h3);
                    }
                }
                m181h3 = null;
                c2395p.m3877j0(m181h3);
            }
            c2395p.m3888r(false);
            AbstractC1991r4.m3162c(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), null, AbstractC1991r4.m3168i(((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11789G, c2395p), null, AbstractC3178i.m4873d(-1918499560, new C1325u5((Long) m181h3, c2349d1, interfaceC2425y0, interfaceC2425y02), c2395p), c2395p, 196614, 26);
            c2395p.m3857Z(332715576);
            if (((Boolean) interfaceC2425y0.getValue()).booleanValue()) {
                int m3741g = c2349d1.m3741g();
                c2395p.m3857Z(332719063);
                Object m3847O2 = c2395p.m3847O();
                if (m3847O2 == c2413u0) {
                    m3847O2 = new C0705aa(interfaceC2425y0, 21);
                    c2395p.m3877j0(m3847O2);
                }
                c2395p.m3888r(false);
                m2280q(m3741g, (InterfaceC3277a) m3847O2, c2395p, 48);
            }
            c2395p.m3888r(false);
            if (((Boolean) interfaceC2425y02.getValue()).booleanValue()) {
                c2395p.m3857Z(332722909);
                Object m3847O3 = c2395p.m3847O();
                if (m3847O3 == c2413u0) {
                    m3847O3 = new C0705aa(interfaceC2425y02, 22);
                    c2395p.m3877j0(m3847O3);
                }
                c2395p.m3888r(false);
                AbstractC1991r4.m3160a((InterfaceC3277a) m3847O3, AbstractC3178i.m4873d(1467140400, new C0868fe(context, interfaceC2425y02, 0), c2395p), null, AbstractC3178i.m4873d(843858798, new C1200q4(interfaceC2425y02, 17), c2395p), AbstractC1104n1.f6148o, AbstractC1104n1.f6149p, null, 0L, 0L, 0L, 0L, 0.0f, null, c2395p, 1772598, 0, 16276);
            }
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0575u(i7, 5);
        }
    }

    /* renamed from: B0 */
    public static Object m2210B0(Context context, Network network, InterfaceC3277a interfaceC3277a) {
        ConnectivityManager connectivityManager;
        if (network != null && context != null) {
            Object systemService = context.getSystemService("connectivity");
            if (systemService instanceof ConnectivityManager) {
                connectivityManager = (ConnectivityManager) systemService;
            } else {
                connectivityManager = null;
            }
            if (connectivityManager == null) {
                return interfaceC3277a.mo52a();
            }
            synchronized (f7396a) {
                Network boundNetworkForProcess = connectivityManager.getBoundNetworkForProcess();
                if (!connectivityManager.bindProcessToNetwork(network)) {
                    return interfaceC3277a.mo52a();
                }
                try {
                    return interfaceC3277a.mo52a();
                } finally {
                    connectivityManager.bindProcessToNetwork(boundNetworkForProcess);
                }
            }
        }
        return interfaceC3277a.mo52a();
    }

    /* renamed from: C */
    public static final void m2211C(EnumC0964ie enumC0964ie, InterfaceC3279c interfaceC3279c, InterfaceC3277a interfaceC3277a, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        c2395p.m3859a0(1136671064);
        if (c2395p.m3870g(enumC0964ie)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i11 = i7 | i8;
        if (c2395p.m3874i(interfaceC3279c)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i12 = i11 | i9;
        if (c2395p.m3874i(interfaceC3277a)) {
            i10 = 256;
        } else {
            i10 = 128;
        }
        if (((i12 | i10) & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            int i13 = 3;
            AbstractC1991r4.m3162c(AbstractC3793a.m5821a(AbstractC3793a.m5821a(AbstractC0154b.m339j(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), 12, 0.0f, 2), new C3167y0(i13, 1)), new C3167y0(i13, 0)), null, AbstractC1991r4.m3168i(((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11822p, c2395p), null, AbstractC3178i.m4873d(-905470938, new C1023kd(enumC0964ie, interfaceC3277a, interfaceC3279c), c2395p), c2395p, 196608, 26);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1081m9(enumC0964ie, interfaceC3279c, interfaceC3277a, i7, 3);
        }
    }

    /* renamed from: C0 */
    public static final void m2212C0(Context context, EnumC1436xn enumC1436xn) {
        AbstractC3367j.m5100e(enumC1436xn, "unit");
        context.getSharedPreferences("speed_test_profiles", 0).edit().putString("speed_display_unit", enumC1436xn.name()).apply();
    }

    /* renamed from: D */
    public static final void m2213D(final C0831e9 c0831e9, final long j6, C2395p c2395p, final int i7) {
        int i8;
        int i9;
        Double d7;
        float f7;
        float f8;
        float f9;
        String m4058v;
        String str;
        C2395p c2395p2 = c2395p;
        c2395p2.m3859a0(1068498085);
        if (c2395p2.m3870g(c0831e9)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i10 = i7 | i8;
        if (c2395p2.m3868f(j6)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        if (((i10 | i9) & 19) == 18 && c2395p2.m3836D()) {
            c2395p2.m3852U();
        } else {
            Double d8 = null;
            if (j6 > 0) {
                d7 = Double.valueOf((c0831e9.f3660b * 100.0d) / j6);
            } else {
                d7 = null;
            }
            if (j6 > 0) {
                if (c0831e9.f3661c >= 0) {
                    d8 = Double.valueOf(((r8 + 1) * 100.0d) / j6);
                }
            }
            Double d9 = d8;
            long m1520b = c0831e9.m1520b();
            long j7 = c0831e9.f3661c;
            long j8 = c0831e9.f3660b;
            long j9 = c0831e9.f3662d;
            if (m1520b > 0) {
                f7 = 1.0f;
                f8 = AbstractC2168e.m3529p(((float) j9) / ((float) c0831e9.m1520b()), 0.0f, 1.0f);
            } else {
                f7 = 1.0f;
                f8 = 0.0f;
            }
            C3807o c3807o = C3807o.f17991a;
            float f10 = 8;
            InterfaceC3810r m339j = AbstractC0154b.m339j(AbstractC0155c.m346e(c3807o, f7), 0.0f, f10, 1);
            C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.m4843g(4), C3795c.f17976q, c2395p2, 6);
            int hashCode = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m = c2395p2.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, m339j);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p2.m3863c0();
            float f11 = f8;
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z);
            } else {
                c2395p2.m3883m0();
            }
            C3504h c3504h = C3507i.f16931e;
            AbstractC2418w.m3954C(m4857a, c2395p2, c3504h);
            C3504h c3504h2 = C3507i.f16930d;
            AbstractC2418w.m3954C(m3882m, c2395p2, c3504h2);
            C3504h c3504h3 = C3507i.f16932f;
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h3);
            }
            C3504h c3504h4 = C3507i.f16929c;
            AbstractC2418w.m3954C(m5823c, c2395p2, c3504h4);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17974o, c2395p2, 48);
            int hashCode2 = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
            InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, c3807o);
            c2395p2.m3863c0();
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z);
            } else {
                c2395p2.m3883m0();
            }
            AbstractC2418w.m3954C(m4854a, c2395p2, c3504h);
            AbstractC2418w.m3954C(m3882m2, c2395p2, c3504h2);
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode2))) {
                AbstractC2487d.m4050n(hashCode2, c2395p2, hashCode2, c3504h3);
            }
            AbstractC2418w.m3954C(m5823c2, c2395p2, c3504h4);
            String m4256b = AbstractC2647h.m4256b("Worker ", c0831e9.f3659a + 1);
            C1604o0 c1604o0 = AbstractC1991r4.m3172m(c2395p2).f11256m;
            if (1.0f > 0.0d) {
                float f12 = Float.MAX_VALUE;
                if (1.0f <= Float.MAX_VALUE) {
                    f12 = 1.0f;
                }
                AbstractC1850a7.m3108b(m4256b, new LayoutWeightElement(f12, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p, 0, 0, 65532);
                AbstractC1850a7.m3108b(c0831e9.f3665g, null, AbstractC1991r4.m3170k(c2395p).f11807a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC1991r4.m3172m(c2395p).f11257n, c2395p, 0, 0, 65530);
                AbstractC3122c.m4828a(c2395p, AbstractC0155c.m353l(c3807o, f10));
                AbstractC1850a7.m3108b(AbstractC2487d.m4043g(m2244W(c0831e9.f3663e), "/s"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC1991r4.m3172m(c2395p).f11256m, c2395p, 0, 0, 65534);
                c2395p.m3888r(true);
                c2395p.m3857Z(869268132);
                if (c0831e9.m1520b() > 0) {
                    c2395p.m3857Z(869269986);
                    f9 = f11;
                    boolean m3864d = c2395p.m3864d(f9);
                    Object m3847O = c2395p.m3847O();
                    if (m3864d || m3847O == C2375k.f13421a) {
                        m3847O = new C0957i7(f9);
                        c2395p.m3877j0(m3847O);
                    }
                    c2395p.m3888r(false);
                    AbstractC1951m4.m3142b((InterfaceC3277a) m3847O, AbstractC0155c.m346e(c3807o, 1.0f), 0L, 0L, 0, 0.0f, null, c2395p, 48, 124);
                } else {
                    f9 = f11;
                }
                c2395p.m3888r(false);
                if (d7 != null && d9 != null) {
                    String format = String.format(Locale.getDefault(), "%.1f%%", Arrays.copyOf(new Object[]{d7}, 1));
                    String format2 = String.format(Locale.getDefault(), "%.1f%%", Arrays.copyOf(new Object[]{d9}, 1));
                    String m2244W = m2244W(j8);
                    String m2244W2 = m2244W(j7 + 1);
                    StringBuilder m189p = AbstractC0094y0.m189p("文件区间 ", format, "–", format2, "  ·  ");
                    m189p.append(m2244W);
                    m189p.append("–");
                    m189p.append(m2244W2);
                    m4058v = m189p.toString();
                } else {
                    long j10 = j8 + j9;
                    if (j7 >= j8) {
                        long j11 = j7 + 1;
                        if (j10 > j11) {
                            j10 = j11;
                        }
                    }
                    m4058v = AbstractC2487d.m4058v("顺序下载 · 当前 ", m2244W(j10));
                }
                AbstractC1850a7.m3108b(m4058v, null, AbstractC1991r4.m3170k(c2395p).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC1991r4.m3172m(c2395p).f11255l, c2395p, 0, 0, 65530);
                int i11 = (int) (f9 * 100);
                String m2244W3 = m2244W(j9);
                if (c0831e9.m1520b() > 0) {
                    str = m2244W(c0831e9.m1520b());
                } else {
                    str = "未知";
                }
                AbstractC1850a7.m3108b("分片进度 " + i11 + "%  ·  " + m2244W3 + " / " + str, null, AbstractC1991r4.m3170k(c2395p).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC1991r4.m3172m(c2395p).f11255l, c2395p, 0, 0, 65530);
                AbstractC1850a7.m3108b(AbstractC2487d.m4058v("服务器 ", c0831e9.f3664f), null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, AbstractC1991r4.m3172m(c2395p).f11255l, c2395p, 0, 3120, 55294);
                c2395p2 = c2395p;
                c2395p2.m3888r(true);
            } else {
                throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new InterfaceC3281e(j6, i7) { // from class: e5.p9

                /* renamed from: f */
                public final /* synthetic */ long f6846f;

                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int m3957F = AbstractC2418w.m3957F(1);
                    AbstractC1249rm.m2213D(C0831e9.this, this.f6846f, (C2395p) obj, m3957F);
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(5:46|47|48|49|(13:51|17|18|19|20|21|22|23|(1:25)|26|27|28|29))|18|19|20|21|22|23|(0)|26|27|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        r16 = p060h5.AbstractC1793a0.m2985m(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1 A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #3 {all -> 0x00c9, blocks: (B:19:0x0089, B:23:0x009b, B:25:0x00a1, B:27:0x00cd, B:31:0x015d, B:37:0x0097, B:22:0x0092), top: B:18:0x0089, inners: #1, #2 }] */
    /* renamed from: D0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m2214D0(byte[] bArr, String str, Network network, int i7, String str2, String str3) {
        Object m2985m;
        Object m2985m2;
        byte[] bArr2;
        Throwable m2747a;
        try {
            if (network != null) {
                m2985m = network.getByName(str);
            } else {
                m2985m = InetAddress.getByName(str);
            }
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (m2985m instanceof C1689h) {
            m2985m = null;
        }
        InetAddress inetAddress = (InetAddress) m2985m;
        if (inetAddress == null) {
            ConcurrentHashMap.KeySetView keySetView = AbstractC1265s7.f7527a;
            StringBuilder m189p = AbstractC0094y0.m189p("SEND skip ecs=", str2, " type=", str3, " server=");
            m189p.append(str);
            m189p.append(" reason=resolveServerAddress failed");
            AbstractC1265s7.m2310g(m189p.toString());
            return null;
        }
        DatagramSocket datagramSocket = new DatagramSocket();
        Object obj = C1694m.f10482a;
        try {
            try {
                if (network != null) {
                    try {
                        network.bindSocket(datagramSocket);
                        m2985m2 = obj;
                    } catch (Throwable th2) {
                        m2985m2 = AbstractC1793a0.m2985m(th2);
                    }
                    Throwable m2747a2 = C1690i.m2747a(m2985m2);
                    if (m2747a2 != null) {
                        bArr2 = null;
                        Log.w("ManualDnsResolver", "bindSocket failed: " + m2747a2.getMessage());
                        datagramSocket.setSoTimeout(AbstractC2168e.m3530q(i7, 300, 10000));
                        datagramSocket.connect(inetAddress, 53);
                        m2747a = C1690i.m2747a(obj);
                        if (m2747a != null) {
                            ConcurrentHashMap.KeySetView keySetView2 = AbstractC1265s7.f7527a;
                            AbstractC1265s7.m2310g("SEND connect failed ecs=" + str2 + " server=" + inetAddress.getHostAddress() + ":53 err=" + m2747a.getMessage());
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        ConcurrentHashMap.KeySetView keySetView3 = AbstractC1265s7.f7527a;
                        AbstractC1265s7.m2308e("SEND ecs=" + str2 + " type=" + str3 + " server=" + inetAddress.getHostAddress() + ":53 timeout=" + datagramSocket.getSoTimeout() + "ms bytes=" + bArr.length);
                        datagramSocket.send(new DatagramPacket(bArr, bArr.length, inetAddress, 53));
                        byte[] bArr3 = new byte[4096];
                        DatagramPacket datagramPacket = new DatagramPacket(bArr3, 4096);
                        datagramSocket.receive(datagramPacket);
                        byte[] copyOf = Arrays.copyOf(bArr3, datagramPacket.getLength());
                        AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                        AbstractC1265s7.m2308e("RECV ecs=" + str2 + " type=" + str3 + " server=" + str + " elapsed=" + (System.currentTimeMillis() - currentTimeMillis) + "ms bytes=" + copyOf.length);
                        datagramSocket.close();
                        return copyOf;
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                ConcurrentHashMap.KeySetView keySetView32 = AbstractC1265s7.f7527a;
                AbstractC1265s7.m2308e("SEND ecs=" + str2 + " type=" + str3 + " server=" + inetAddress.getHostAddress() + ":53 timeout=" + datagramSocket.getSoTimeout() + "ms bytes=" + bArr.length);
                datagramSocket.send(new DatagramPacket(bArr, bArr.length, inetAddress, 53));
                byte[] bArr32 = new byte[4096];
                DatagramPacket datagramPacket2 = new DatagramPacket(bArr32, 4096);
                datagramSocket.receive(datagramPacket2);
                byte[] copyOf2 = Arrays.copyOf(bArr32, datagramPacket2.getLength());
                AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
                AbstractC1265s7.m2308e("RECV ecs=" + str2 + " type=" + str3 + " server=" + str + " elapsed=" + (System.currentTimeMillis() - currentTimeMillis2) + "ms bytes=" + copyOf2.length);
                datagramSocket.close();
                return copyOf2;
            } catch (SocketTimeoutException unused) {
                ConcurrentHashMap.KeySetView keySetView4 = AbstractC1265s7.f7527a;
                AbstractC1265s7.m2310g("SEND timeout ecs=" + str2 + " type=" + str3 + " server=" + str + " timeout=" + datagramSocket.getSoTimeout() + "ms");
                datagramSocket.close();
                return bArr2;
            }
            datagramSocket.setSoTimeout(AbstractC2168e.m3530q(i7, 300, 10000));
            datagramSocket.connect(inetAddress, 53);
            m2747a = C1690i.m2747a(obj);
            if (m2747a != null) {
            }
        } finally {
        }
        bArr2 = null;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map, java.lang.Object] */
    /* renamed from: E */
    public static final void m2215E(C0959i9 c0959i9, C1196q0 c1196q0, List list, C3472s c3472s, InterfaceC3277a interfaceC3277a, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03) {
        int i7;
        int i8;
        Object m2985m;
        int i9;
        Object obj;
        int i10;
        Integer m973O = AbstractC0451r.m973O((String) interfaceC2425y0.getValue());
        int i11 = 1;
        if (m973O != null) {
            i7 = AbstractC2168e.m3530q(m973O.intValue(), 1, 32);
        } else {
            i7 = c0959i9.f4782d;
        }
        Integer m973O2 = AbstractC0451r.m973O((String) interfaceC2425y02.getValue());
        if (m973O2 != null) {
            i8 = AbstractC2168e.m3530q(m973O2.intValue(), 1, 512);
        } else {
            i8 = c0959i9.f4783e;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1817y.m3082N(c3472s.size()));
        Iterator it = c3472s.f16738f.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), AbstractC1805m.m3035C0((Iterable) entry.getValue()));
        }
        EnumC0704a9 enumC0704a9 = (EnumC0704a9) interfaceC2425y03.getValue();
        EnumC1452y8 enumC1452y8 = c0959i9.f4784f;
        int i12 = c0959i9.f4785g;
        int i13 = c0959i9.f4786h;
        AbstractC3367j.m5100e(list, "inputs");
        AbstractC3367j.m5100e(enumC0704a9, "networkStack");
        AbstractC3367j.m5100e(enumC1452y8, "httpProtocol");
        if (!list.isEmpty()) {
            int m3530q = AbstractC2168e.m3530q(i8, 1, 512);
            ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C0781cm c0781cm = (C0781cm) it2.next();
                try {
                    m2985m = new URI(c0781cm.f3166a).getHost();
                    if (m2985m == null) {
                        m2985m = "";
                    }
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (m2985m instanceof C1689h) {
                    m2985m = "";
                }
                List list2 = (List) linkedHashMap.get((String) m2985m);
                if (list2 == null) {
                    list2 = C1813u.f10860e;
                }
                List list3 = list2;
                int size = list3.size();
                if (size < i11) {
                    i9 = i11;
                } else {
                    i9 = size;
                }
                String str = c0781cm.f3166a;
                Object obj2 = "download.bin";
                try {
                    String path = new URI(str).getPath();
                    AbstractC3367j.m5099d(path, "getPath(...)");
                    String decode = URLDecoder.decode(AbstractC0444k.m952p0(path, '/', path), "UTF-8");
                    boolean m937a0 = AbstractC0444k.m937a0(decode);
                    obj = decode;
                    if (m937a0) {
                        obj = "download.bin";
                    }
                } catch (Throwable th2) {
                    obj = AbstractC1793a0.m2985m(th2);
                }
                if (!(obj instanceof C1689h)) {
                    obj2 = obj;
                }
                String m2120T = c1196q0.m2120T((String) obj2);
                ?? r32 = c0781cm.f3167b;
                int m3530q2 = AbstractC2168e.m3530q(i7, i11, 32);
                int m3530q3 = AbstractC2168e.m3530q(i12, 8, 1024);
                int m3530q4 = AbstractC2168e.m3530q(i13, 0, 128);
                i11 = 1;
                int m3530q5 = i9 * AbstractC2168e.m3530q(i7, 1, 32);
                if (m3530q5 > m3530q) {
                    i10 = m3530q;
                } else {
                    i10 = m3530q5;
                }
                int i14 = m3530q;
                EnumC1452y8 enumC1452y82 = enumC1452y8;
                arrayList.add(new C0800d9((String) null, str, m2120T, (Map) r32, list3, enumC0704a9, m3530q2, i14, enumC1452y82, m3530q3, m3530q4, (EnumC0768c9) null, 0L, 0L, false, i10, (String) null, 0L, 0L, (String) null, (String) null, 4126721));
                i12 = i12;
                i13 = i13;
                m3530q = i14;
                enumC1452y8 = enumC1452y82;
            }
            C2325e c2325e = AbstractC0549l0.f1898a;
            AbstractC0525d0.m1145w(ExecutorC2324d.f13302g, new C1226r(c1196q0, arrayList, null));
            int size2 = arrayList.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj3 = arrayList.get(i15);
                i15++;
                c1196q0.m2119P(((C0800d9) obj3).f3340a);
            }
        }
        interfaceC3277a.mo52a();
    }

    /* renamed from: E0 */
    public static void m2216E0(Context context, AbstractC2834c abstractC2834c) {
        AbstractC3367j.m5100e(context, "context");
        AbstractC3367j.m5100e(abstractC2834c, "subnets");
        JSONArray jSONArray = new JSONArray();
        Iterator<E> it = abstractC2834c.iterator();
        while (it.hasNext()) {
            C0878fo c0878fo = (C0878fo) it.next();
            jSONArray.put(new JSONObject().put("label", AbstractC0444k.m956t0(c0878fo.f4047a).toString()).put("cidr", AbstractC0444k.m956t0(c0878fo.f4048b).toString()));
        }
        context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_dns_page_ecs_subnets", jSONArray.toString()).apply();
    }

    /* renamed from: F */
    public static final void m2217F(List list, InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, C2349d1 c2349d1, C3472s c3472s, C3472s c3472s2, C3472s c3472s3, Context context, InterfaceC2425y0 interfaceC2425y04, C3472s c3472s4, boolean z7) {
        if (!list.isEmpty() && ((EnumC1390w8) interfaceC2425y0.getValue()) != EnumC1390w8.f8310f) {
            interfaceC2425y02.setValue(Boolean.TRUE);
            interfaceC2425y03.setValue(list);
            c2349d1.m3742h(1);
            AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0864fa(list, c3472s, interfaceC0516a0, c3472s2, z7, c3472s3, context, interfaceC2425y04, interfaceC2425y0, interfaceC2425y02, c3472s4, null), 3);
        }
    }

    /* renamed from: F0 */
    public static void m2218F0(Context context, EnumC1495zk enumC1495zk) {
        AbstractC3367j.m5100e(context, "context");
        AbstractC3367j.m5100e(enumC1495zk, "mode");
        context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_nat_rfc_mode", enumC1495zk.name()).apply();
    }

    /* renamed from: G */
    public static final void m2219G(InterfaceC2425y0 interfaceC2425y0, boolean z7) {
        interfaceC2425y0.setValue(Boolean.valueOf(z7));
    }

    /* renamed from: G0 */
    public static void m2220G0(Context context, List list) {
        AbstractC3367j.m5100e(context, "context");
        ArrayList arrayList = new ArrayList();
        C2719b c2719b = EnumC0748bl.f2841i;
        c2719b.getClass();
        C0296c c0296c = new C0296c(c2719b);
        while (c0296c.hasNext()) {
            Object next = c0296c.next();
            if (list.contains((EnumC0748bl) next)) {
                arrayList.add(next);
            }
        }
        String m3051o0 = AbstractC1805m.m3051o0(arrayList, ",", null, null, new C0242k0(23), 30);
        if (AbstractC0444k.m937a0(m3051o0)) {
            m3051o0 = "UDP";
        }
        context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_nat_transport", m3051o0).apply();
    }

    /* renamed from: H */
    public static final List m2221H(String str) {
        Object m2985m;
        Map m3085Q;
        try {
            JSONArray jSONArray = new JSONArray(str);
            C2079c m5802f = AbstractC3784a.m5802f();
            int length = jSONArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i7);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("url");
                    AbstractC3367j.m5099d(optString, "optString(...)");
                    String obj = AbstractC0444k.m956t0(optString).toString();
                    if (m2263h0(obj)) {
                        String optString2 = optJSONObject.optString("method", "");
                        AbstractC3367j.m5099d(optString2, "optString(...)");
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("headers");
                        if (optJSONObject2 == null) {
                            m3085Q = C1814v.f10861e;
                        } else {
                            Iterator<String> keys = optJSONObject2.keys();
                            AbstractC3367j.m5099d(keys, "keys(...)");
                            m3085Q = AbstractC1817y.m3085Q(AbstractC0307n.m667F(AbstractC0307n.m664C(keys), new C1427xe(optJSONObject2, 1)));
                        }
                        m5802f.add(new C1006jr(obj, optString2, m3085Q));
                    }
                }
            }
            m2985m = AbstractC3784a.m5798b(m5802f);
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (m2985m instanceof C1689h) {
            m2985m = C1813u.f10860e;
        }
        return (List) m2985m;
    }

    /* renamed from: H0 */
    public static boolean m2222H0(Context context, String str, String str2, String str3) {
        Object m2985m;
        AbstractC3367j.m5100e(context, "context");
        AbstractC3367j.m5100e(str, "fileName");
        try {
            File file = new File(context.getCacheDir(), "shared_configs");
            file.mkdirs();
            File file2 = new File(file, str);
            AbstractC3063j.m4738O(file2, str2, AbstractC0434a.f1477a);
            Uri m408d = FileProvider.m408d(context, context.getPackageName() + ".fileprovider", file2);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("application/octet-stream");
            intent.putExtra("android.intent.extra.SUBJECT", str);
            intent.putExtra("android.intent.extra.STREAM", m408d);
            intent.setClipData(ClipData.newRawUri(str, m408d));
            intent.addFlags(1);
            context.startActivity(Intent.createChooser(intent, str3));
            m2985m = Boolean.TRUE;
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        Object obj = Boolean.FALSE;
        if (m2985m instanceof C1689h) {
            m2985m = obj;
        }
        return ((Boolean) m2985m).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable m2223I(Context context, List list, AbstractC2583c abstractC2583c) {
        C1423xa c1423xa;
        int i7;
        if (abstractC2583c instanceof C1423xa) {
            C1423xa c1423xa2 = (C1423xa) abstractC2583c;
            int i8 = c1423xa2.f8637i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1423xa2.f8637i = i8 - Integer.MIN_VALUE;
                c1423xa = c1423xa2;
                Object obj = c1423xa.f8636h;
                i7 = c1423xa.f8637i;
                if (i7 == 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("speed_test_profiles", 0);
                    String string = sharedPreferences.getString("nexttrace_api_server", "api.nxtrace.org");
                    String str = "";
                    if (string == null) {
                        string = "";
                    }
                    String string2 = sharedPreferences.getString("nexttrace_v4_token", "");
                    if (string2 != null) {
                        str = string2;
                    }
                    C1403wl c1403wl = new C1403wl(string, str);
                    c1423xa.f8637i = 1;
                    obj = C1403wl.m2381g(c1403wl, list, c1423xa);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (obj == enumC2465a) {
                        return enumC2465a;
                    }
                }
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1817y.m3082N(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    C1434xl c1434xl = (C1434xl) entry.getValue();
                    List m3067O = AbstractC1806n.m3067O(c1434xl.f8841c, c1434xl.f8839a, c1434xl.f8840b);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : m3067O) {
                        if (!AbstractC0444k.m937a0((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    linkedHashMap.put(key, AbstractC1805m.m3051o0(arrayList, " · ", null, null, null, 62));
                }
                return linkedHashMap;
            }
        }
        c1423xa = new AbstractC2583c(abstractC2583c);
        Object obj3 = c1423xa.f8636h;
        i7 = c1423xa.f8637i;
        if (i7 == 0) {
        }
        Map map2 = (Map) obj3;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC1817y.m3082N(map2.size()));
        while (r8.hasNext()) {
        }
        return linkedHashMap2;
    }

    /* renamed from: I0 */
    public static final boolean m2224I0(String str, String str2) {
        AbstractC3367j.m5100e(str, "target");
        AbstractC3367j.m5100e(str2, "resolved");
        if (!AbstractC0444k.m937a0(str2)) {
            String obj = AbstractC0444k.m956t0(str).toString();
            String obj2 = AbstractC0444k.m956t0(AbstractC0444k.m953q0(str2, '%')).toString();
            if (!AbstractC0451r.m966H(obj, obj2)) {
                if (AbstractC1155ol.m2013a(obj2) != EnumC1124nl.f6339e && AbstractC1155ol.m2013a(obj2) != EnumC1124nl.f6340f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: J */
    public static final EnumC0876fm m2225J(List list) {
        Iterator it = list.iterator();
        EnumC0876fm enumC0876fm = EnumC0876fm.f4041e;
        while (it.hasNext()) {
            enumC0876fm = m2267j0(enumC0876fm, ((C1187pm) it.next()).f6908f);
        }
        return enumC0876fm;
    }

    /* renamed from: J0 */
    public static final String m2226J0(int i7, String str, String str2, String str3) {
        AbstractC3367j.m5100e(str2, "targetId");
        AbstractC3367j.m5100e(str3, "url");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        sb.append("|");
        sb.append(i7);
        return AbstractC2487d.m4046j(sb, "|", str3);
    }

    /* renamed from: K */
    public static final LinkedHashMap m2227K(int i7, List list) {
        Object m2985m;
        int m3082N = AbstractC1817y.m3082N(AbstractC1807o.m3073U(list));
        if (m3082N < 16) {
            m3082N = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m3082N);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0877fn c0877fn = (C0877fn) it.next();
            String str = c0877fn.f4045a;
            try {
                long nanoTime = System.nanoTime();
                Socket socket = new Socket();
                try {
                    socket.connect(new InetSocketAddress(c0877fn.f4045a, i7), 1500);
                    socket.close();
                    m2985m = Long.valueOf((System.nanoTime() - nanoTime) / 1000000);
                } finally {
                    try {
                        break;
                    } catch (Throwable th) {
                    }
                }
            } catch (Throwable th2) {
                m2985m = AbstractC1793a0.m2985m(th2);
            }
            if (m2985m instanceof C1689h) {
                m2985m = Long.MAX_VALUE;
            }
            linkedHashMap.put(str, m2985m);
        }
        return linkedHashMap;
    }

    /* renamed from: K0 */
    public static Integer m2228K0(NetworkCapabilities networkCapabilities) {
        NetworkSpecifier networkSpecifier;
        NetworkSpecifier networkSpecifier2;
        int subscriptionId;
        if (Build.VERSION.SDK_INT >= 29 && networkCapabilities != null) {
            networkSpecifier = networkCapabilities.getNetworkSpecifier();
            if (AbstractC1413x0.m2415v(networkSpecifier)) {
                networkSpecifier2 = networkCapabilities.getNetworkSpecifier();
                subscriptionId = AbstractC1413x0.m2402i(networkSpecifier2).getSubscriptionId();
                if (subscriptionId != -1) {
                    return Integer.valueOf(subscriptionId);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* renamed from: L */
    public static final Uri m2229L(Context context, C1196q0 c1196q0, C0800d9 c0800d9) {
        Uri parse;
        String str = c0800d9.f3360u;
        if (AbstractC0444k.m937a0(str)) {
            str = null;
        }
        if (str != null && (parse = Uri.parse(str)) != null) {
            return parse;
        }
        Uri m408d = FileProvider.m408d(context, context.getPackageName() + ".fileprovider", c1196q0.m2129p(c0800d9));
        AbstractC3367j.m5099d(m408d, "getUriForFile(...)");
        return m408d;
    }

    /* renamed from: L0 */
    public static String m2230L0(C1248rl c1248rl) {
        String network;
        StringBuilder sb = new StringBuilder("name=");
        String str = c1248rl.f7391b;
        String str2 = c1248rl.f7395f;
        Network network2 = c1248rl.f7392c;
        sb.append(str);
        sb.append(" id=");
        sb.append(c1248rl.f7390a);
        sb.append(" transport=");
        sb.append(c1248rl.f7393d.name());
        sb.append(" interfaceName=");
        String str3 = c1248rl.f7394e;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = "null";
        if (AbstractC0444k.m937a0(str3)) {
            str3 = "null";
        }
        sb.append(str3);
        sb.append(" network=");
        if (network2 != null && (network = network2.toString()) != null) {
            str4 = network;
        }
        sb.append(str4);
        if (str2 != null) {
            sb.append(" linkSpeed=");
            sb.append(str2);
        }
        if (network2 != null) {
            sb.append(" networkHandle=");
            sb.append(network2.getNetworkHandle());
        }
        return sb.toString();
    }

    /* renamed from: M */
    public static C1234r7 m2231M(List list) {
        AbstractC3367j.m5100e(list, "results");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1296t7 c1296t7 = (C1296t7) it.next();
            C1485za c1485za = c1296t7.f7762b;
            List<InetAddress> list2 = c1296t7.f7763c;
            String str = c1296t7.f7761a;
            if (c1485za != null) {
                String obj = AbstractC0444k.m956t0(c1485za.f9839a).toString();
                for (InetAddress inetAddress : list2) {
                    String hostAddress = inetAddress.getHostAddress();
                    if (hostAddress == null) {
                        hostAddress = "";
                    }
                    if (!AbstractC0444k.m937a0(hostAddress)) {
                        linkedHashMap3.putIfAbsent(hostAddress, inetAddress);
                        if (!AbstractC0444k.m937a0(obj)) {
                            Object obj2 = linkedHashMap.get(hostAddress);
                            if (obj2 == null) {
                                obj2 = new LinkedHashSet();
                                linkedHashMap.put(hostAddress, obj2);
                            }
                            ((Collection) obj2).add(obj);
                        }
                        if (!AbstractC0444k.m937a0(str)) {
                            Object obj3 = linkedHashMap2.get(hostAddress);
                            if (obj3 == null) {
                                obj3 = new LinkedHashSet();
                                linkedHashMap2.put(hostAddress, obj3);
                            }
                            ((Collection) obj3).add(str);
                        }
                    }
                }
            } else if (!list2.isEmpty()) {
                for (InetAddress inetAddress2 : list2) {
                    String hostAddress2 = inetAddress2.getHostAddress();
                    if (hostAddress2 == null) {
                        hostAddress2 = "";
                    }
                    if (!AbstractC0444k.m937a0(hostAddress2)) {
                        linkedHashMap3.putIfAbsent(hostAddress2, inetAddress2);
                        Object obj4 = linkedHashMap.get(hostAddress2);
                        if (obj4 == null) {
                            obj4 = new LinkedHashSet();
                            linkedHashMap.put(hostAddress2, obj4);
                        }
                        ((Collection) obj4).add("默认");
                        if (!AbstractC0444k.m937a0(str)) {
                            Object obj5 = linkedHashMap2.get(hostAddress2);
                            if (obj5 == null) {
                                obj5 = new LinkedHashSet();
                                linkedHashMap2.put(hostAddress2, obj5);
                            }
                            ((Collection) obj5).add(str);
                        }
                    }
                }
            }
        }
        Collection values = linkedHashMap3.values();
        AbstractC3367j.m5099d(values, "<get-values>(...)");
        List m3035C0 = AbstractC1805m.m3035C0(values);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(AbstractC1817y.m3082N(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap4.put(entry.getKey(), AbstractC1805m.m3035C0((LinkedHashSet) entry.getValue()));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(AbstractC1817y.m3082N(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            linkedHashMap5.put(entry2.getKey(), AbstractC1805m.m3035C0((LinkedHashSet) entry2.getValue()));
        }
        C1234r7 c1234r7 = new C1234r7(m3035C0, linkedHashMap4, linkedHashMap5);
        String m2304a = AbstractC1265s7.m2304a(m3035C0);
        String m3051o0 = AbstractC1805m.m3051o0(linkedHashMap4.entrySet(), null, null, null, new C1263s5(16), 31);
        String m3051o02 = AbstractC1805m.m3051o0(linkedHashMap5.entrySet(), null, null, null, new C1263s5(17), 31);
        StringBuilder m189p = AbstractC0094y0.m189p("AGGREGATE addrs=", m2304a, " labels=", m3051o0, " servers=");
        m189p.append(m3051o02);
        AbstractC1265s7.m2308e(m189p.toString());
        return c1234r7;
    }

    /* renamed from: M0 */
    public static final String m2232M0(List list) {
        AbstractC3367j.m5100e(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1006jr c1006jr = (C1006jr) it.next();
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : c1006jr.f5165c.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            jSONArray.put(new JSONObject().put("url", c1006jr.f5163a).put("method", c1006jr.f5164b).put("headers", jSONObject));
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC3367j.m5099d(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    /* renamed from: N */
    public static void m2233N(StringBuilder sb, List list, List list2) {
        sb.append("--- 应用 UI 列表 availableNetworkTargets ---");
        sb.append('\n');
        int i7 = 0;
        if (list.isEmpty()) {
            sb.append("(empty)");
            sb.append('\n');
        } else {
            int i8 = 0;
            for (Object obj : list) {
                int i9 = i8 + 1;
                if (i8 >= 0) {
                    sb.append("[" + i8 + "] " + m2230L0((C1248rl) obj));
                    sb.append('\n');
                    i8 = i9;
                } else {
                    AbstractC1806n.m3072T();
                    throw null;
                }
            }
        }
        sb.append('\n');
        sb.append("--- 应用实时扫描 currentNetworkTargets ---");
        sb.append('\n');
        if (list2.isEmpty()) {
            sb.append("(empty)");
            sb.append('\n');
        } else {
            for (Object obj2 : list2) {
                int i10 = i7 + 1;
                if (i7 >= 0) {
                    sb.append("[" + i7 + "] " + m2230L0((C1248rl) obj2));
                    sb.append('\n');
                    i7 = i10;
                } else {
                    AbstractC1806n.m3072T();
                    throw null;
                }
            }
        }
        sb.append('\n');
    }

    /* renamed from: N0 */
    public static void m2234N0(String str) {
        AbstractC3367j.m5100e(str, "message");
        if (!Log.isLoggable("HBCS-NetIface", 5)) {
            return;
        }
        Log.w("HBCS-NetIface", str);
    }

    /* renamed from: O */
    public static void m2235O(StringBuilder sb, String str, String str2) {
        Iterator it = AbstractC0444k.m940d0(str).iterator();
        while (true) {
            C0437d c0437d = (C0437d) it;
            if (c0437d.hasNext()) {
                sb.append(str2 + ((String) c0437d.next()));
                sb.append('\n');
            } else {
                return;
            }
        }
    }

    /* renamed from: O0 */
    public static void m2236O0(byte[] bArr, int i7, int i8) {
        bArr[i7] = (byte) ((i8 >> 8) & 255);
        bArr[i7 + 1] = (byte) (i8 & 255);
    }

    /* renamed from: P */
    public static void m2237P(StringBuilder sb, ConnectivityManager connectivityManager, Network network) {
        String str;
        String linkProperties;
        String str2 = "null";
        if (network == null) {
            sb.append("null");
            sb.append('\n');
            return;
        }
        sb.append("Network.toString()=" + network);
        sb.append('\n');
        sb.append("Network.networkHandle=" + network.getNetworkHandle());
        sb.append('\n');
        sb.append("Network.identityHashCode=" + System.identityHashCode(network));
        sb.append('\n');
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
        LinkProperties linkProperties2 = connectivityManager.getLinkProperties(network);
        sb.append("getNetworkCapabilities()=");
        sb.append('\n');
        if (networkCapabilities == null || (str = networkCapabilities.toString()) == null) {
            str = "null";
        }
        m2235O(sb, str, "  ");
        sb.append("getLinkProperties()=");
        sb.append('\n');
        if (linkProperties2 != null && (linkProperties = linkProperties2.toString()) != null) {
            str2 = linkProperties;
        }
        m2235O(sb, str2, "  ");
    }

    /* renamed from: Q */
    public static byte[] m2238Q(C1485za c1485za) {
        AbstractC3367j.m5100e(c1485za, "subnet");
        byte[] bArr = c1485za.f9843e;
        int length = bArr.length;
        int i7 = length + 4;
        byte[] bArr2 = new byte[length + 8];
        m2236O0(bArr2, 0, 8);
        m2236O0(bArr2, 2, i7);
        m2236O0(bArr2, 4, c1485za.f9841c);
        bArr2[6] = (byte) c1485za.f9842d;
        bArr2[7] = 0;
        AbstractC1804l.m3018K(bArr, bArr2, 8, 0, 0, 12);
        return bArr2;
    }

    /* renamed from: R */
    public static C1405wn m2239R(Context context, boolean z7, boolean z8, boolean z9, List list, boolean z10, List list2) {
        boolean z11;
        AbstractC3367j.m5100e(context, "context");
        AbstractC3367j.m5100e(list, "pageServers");
        AbstractC3367j.m5100e(list2, "pageEcsSubnets");
        C1034ko m2265i0 = m2265i0(context);
        boolean z12 = m2265i0.f5323f;
        boolean z13 = m2265i0.f5318a;
        C2079c m5802f = AbstractC3784a.m5802f();
        if (z7 && m2265i0.f5319b && !z13) {
            m5802f.addAll(m2265i0.f5320c);
        }
        if (z9) {
            m5802f.addAll(list);
        }
        List m3042f0 = AbstractC1805m.m3042f0(AbstractC3784a.m5798b(m5802f));
        C2079c m5802f2 = AbstractC3784a.m5802f();
        if (z8 && z12 && !z13) {
            m5802f2.addAll(m2265i0.f5324g);
        }
        if (z10) {
            m5802f2.addAll(list2);
        }
        C2079c m5798b = AbstractC3784a.m5798b(m5802f2);
        if (!m5798b.isEmpty() && ((z8 && z12 && !z13) || (z10 && !list2.isEmpty()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new C1405wn(m2265i0.f5321d, m2265i0.f5322e, m3042f0, m5798b, z11);
    }

    /* renamed from: S */
    public static byte[] m2240S(String str, int i7, C1485za c1485za) {
        byte[] bArr;
        String str2;
        int i8 = 0;
        List m948l0 = AbstractC0444k.m948l0(str, new char[]{'.'});
        ArrayList arrayList = new ArrayList();
        for (Object obj : m948l0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj2 = arrayList.get(i9);
                i9++;
                String str3 = (String) obj2;
                int length = str3.length();
                if (1 <= length && length < 64) {
                    byteArrayOutputStream.write(str3.length());
                    byte[] bytes = str3.getBytes(AbstractC0434a.f1478b);
                    AbstractC3367j.m5099d(bytes, "getBytes(...)");
                    byteArrayOutputStream.write(bytes);
                } else {
                    throw new IllegalArgumentException("invalid label length");
                }
            }
            byteArrayOutputStream.write(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC3367j.m5099d(byteArray, "toByteArray(...)");
            if (c1485za != null) {
                byte[] m2238Q = m2238Q(c1485za);
                bArr = new byte[m2238Q.length + 11];
                bArr[0] = 0;
                m2236O0(bArr, 1, 41);
                m2236O0(bArr, 3, 4096);
                m2236O0(bArr, 9, m2238Q.length);
                AbstractC1804l.m3018K(m2238Q, bArr, 11, 0, 0, 12);
            } else {
                bArr = new byte[0];
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(byteArray.length + 16 + bArr.length);
            int nextInt = ThreadLocalRandom.current().nextInt(65536);
            byteArrayOutputStream2.write(nextInt >>> 8);
            byteArrayOutputStream2.write(nextInt & 255);
            byteArrayOutputStream2.write(1);
            byteArrayOutputStream2.write(0);
            byteArrayOutputStream2.write(0);
            byteArrayOutputStream2.write(1);
            byteArrayOutputStream2.write(0);
            byteArrayOutputStream2.write(0);
            byteArrayOutputStream2.write(0);
            byteArrayOutputStream2.write(0);
            if (bArr.length == 0) {
                byteArrayOutputStream2.write(0);
                byteArrayOutputStream2.write(0);
            } else {
                byteArrayOutputStream2.write(0);
                byteArrayOutputStream2.write(1);
            }
            byteArrayOutputStream2.write(byteArray);
            byteArrayOutputStream2.write(0);
            byteArrayOutputStream2.write(i7 & 255);
            byteArrayOutputStream2.write(0);
            byteArrayOutputStream2.write(1);
            if (bArr.length != 0) {
                byteArrayOutputStream2.write(bArr);
            }
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            String m2306c = AbstractC1265s7.m2306c(c1485za);
            int length2 = byteArray2.length;
            if (bArr.length == 0) {
                i8 = 1;
            }
            int i10 = 1 ^ i8;
            String str4 = "(none)";
            if (c1485za == null) {
                str2 = "(none)";
            } else {
                str2 = AbstractC1265s7.m2307d(128, m2238Q(c1485za));
            }
            if (bArr.length != 0) {
                str4 = AbstractC1265s7.m2307d(128, bArr);
            }
            AbstractC1265s7.m2308e("BUILD host=" + str + " type=" + i7 + " ecs=" + m2306c + " packetBytes=" + length2 + " arcount=" + i10 + " ecsOption=" + str2 + " optSection=" + str4 + " packetHex=" + AbstractC1265s7.m2307d(128, byteArray2));
            return byteArray2;
        }
        throw new IllegalArgumentException("invalid hostname");
    }

    /* renamed from: T */
    public static void m2241T(String str) {
        AbstractC3367j.m5100e(str, "message");
        if (!Log.isLoggable("HBCS-NetIface", 3)) {
            return;
        }
        Log.d("HBCS-NetIface", str);
    }

    /* renamed from: U */
    public static String m2242U(String str, String str2, String str3) {
        AbstractC3367j.m5100e(str2, "defaultFileName");
        if (str == null) {
            return str2;
        }
        String obj = AbstractC0444k.m956t0(str).toString();
        if (AbstractC0451r.m965G(obj, str3, true)) {
            int length = str3.length();
            if (length >= 0) {
                int length2 = obj.length() - length;
                if (length2 < 0) {
                    length2 = 0;
                }
                obj = AbstractC0444k.m955s0(obj, length2);
            } else {
                throw new IllegalArgumentException(AbstractC0094y0.m184k(length, "Requested character count ", " is less than zero.").toString());
            }
        }
        Pattern compile = Pattern.compile("[\\\\/:*?\"<>|\\p{Cntrl}]");
        AbstractC3367j.m5099d(compile, "compile(...)");
        String replaceAll = compile.matcher(obj).replaceAll("_");
        AbstractC3367j.m5099d(replaceAll, "replaceAll(...)");
        String m955s0 = AbstractC0444k.m955s0(AbstractC0444k.m957u0(replaceAll, ' ', '.', '_'), 80);
        if (AbstractC0444k.m937a0(m955s0)) {
            m955s0 = AbstractC0444k.m944h0(str2, str3);
        }
        return m955s0.concat(str3);
    }

    /* renamed from: V */
    public static String m2243V(double d7) {
        if (d7 <= 0.0d) {
            return "0 bps";
        }
        String[] strArr = {"bps", "Kbps", "Mbps", "Gbps"};
        int i7 = 0;
        while (d7 >= 1000.0d && i7 < 3) {
            d7 /= 1000.0d;
            i7++;
        }
        return String.format(Locale.US, "%.2f %s", Arrays.copyOf(new Object[]{Double.valueOf(d7), strArr[i7]}, 2));
    }

    /* renamed from: W */
    public static final String m2244W(long j6) {
        if (j6 < 1024) {
            return j6 + " B";
        }
        String[] strArr = {"KB", "MB", "GB", "TB"};
        double d7 = j6;
        int i7 = -1;
        while (d7 >= 1024.0d && i7 < 3) {
            d7 /= 1024;
            i7++;
        }
        return String.format(Locale.getDefault(), "%.1f %s", Arrays.copyOf(new Object[]{Double.valueOf(d7), strArr[i7]}, 2));
    }

    /* renamed from: X */
    public static String m2245X(long j6) {
        if (j6 <= 0) {
            return "0 B";
        }
        String[] strArr = {"B", "KB", "MB", "GB"};
        double d7 = j6;
        int i7 = 0;
        while (d7 >= 1024.0d && i7 < 3) {
            d7 /= 1024.0d;
            i7++;
        }
        return String.format(Locale.US, "%.2f %s", Arrays.copyOf(new Object[]{Double.valueOf(d7), strArr[i7]}, 2));
    }

    /* renamed from: Y */
    public static String m2246Y(Network network) {
        String m4256b;
        if (network != null && (m4256b = AbstractC2647h.m4256b("Network@", System.identityHashCode(network))) != null) {
            return m4256b;
        }
        return "default";
    }

    /* renamed from: Z */
    public static String m2247Z(C0707ac c0707ac) {
        AbstractC3367j.m5100e(c0707ac, "rate");
        return c0707ac.f2362b + '/' + c0707ac.f2361a + " down=" + String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(c0707ac.f2364d)}, 1)) + "Mbps up=" + String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(c0707ac.f2365e)}, 1)) + "Mbps bytes=" + c0707ac.f2366f + '+' + c0707ac.f2367g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r45v0, types: [l0.p] */
    /* JADX WARN: Type inference failed for: r4v34, types: [h5.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object] */
    /* renamed from: a */
    public static final void m2248a(C1196q0 c1196q0, InterfaceC3277a interfaceC3277a, C2395p c2395p, int i7) {
        int i8;
        int i9;
        InterfaceC2425y0 interfaceC2425y0;
        InterfaceC2425y0 interfaceC2425y02;
        Object obj;
        int i10;
        InterfaceC3277a interfaceC3277a2 = interfaceC3277a;
        c2395p.m3859a0(2088674610);
        final int i11 = 2;
        if (c2395p.m3874i(c1196q0)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i12 = i7 | i8;
        int i13 = 16;
        if (c2395p.m3874i(interfaceC3277a2)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i14 = i12 | i9;
        final int i15 = 0;
        if ((i14 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            Context context = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
            C0927h9.f4481a.m1554a(context);
            final C0959i9 c0959i9 = (C0959i9) C0927h9.f4483c.f10535e.getValue();
            Object[] objArr = new Object[0];
            c2395p.m3857Z(-779482101);
            Object m3847O = c2395p.m3847O();
            Object obj2 = C2375k.f13421a;
            if (m3847O == obj2) {
                m3847O = new C1236r9(i15);
                c2395p.m3877j0(m3847O);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O, c2395p, 48);
            Object[] objArr2 = new Object[0];
            c2395p.m3857Z(-779479731);
            boolean m3870g = c2395p.m3870g(c0959i9);
            Object m3847O2 = c2395p.m3847O();
            if (m3870g || m3847O2 == obj2) {
                m3847O2 = new InterfaceC3277a() { // from class: e5.l9
                    @Override // p150t5.InterfaceC3277a
                    /* renamed from: a */
                    public final Object mo52a() {
                        switch (i15) {
                            case 0:
                                return AbstractC2418w.m3980x(String.valueOf(c0959i9.f4782d));
                            case 1:
                                return AbstractC2418w.m3980x(String.valueOf(c0959i9.f4783e));
                            case 2:
                                return AbstractC2418w.m3980x(c0959i9.f4781c);
                            default:
                                return AbstractC2418w.m3980x(c0959i9.f4787i);
                        }
                    }
                };
                c2395p.m3877j0(m3847O2);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr2, (InterfaceC3277a) m3847O2, c2395p, 0);
            Object[] objArr3 = new Object[0];
            c2395p.m3857Z(-779476505);
            boolean m3870g2 = c2395p.m3870g(c0959i9);
            Object m3847O3 = c2395p.m3847O();
            final int i16 = 1;
            if (m3870g2 || m3847O3 == obj2) {
                m3847O3 = new InterfaceC3277a() { // from class: e5.l9
                    @Override // p150t5.InterfaceC3277a
                    /* renamed from: a */
                    public final Object mo52a() {
                        switch (i16) {
                            case 0:
                                return AbstractC2418w.m3980x(String.valueOf(c0959i9.f4782d));
                            case 1:
                                return AbstractC2418w.m3980x(String.valueOf(c0959i9.f4783e));
                            case 2:
                                return AbstractC2418w.m3980x(c0959i9.f4781c);
                            default:
                                return AbstractC2418w.m3980x(c0959i9.f4787i);
                        }
                    }
                };
                c2395p.m3877j0(m3847O3);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr3, (InterfaceC3277a) m3847O3, c2395p, 0);
            Object[] objArr4 = new Object[0];
            c2395p.m3857Z(-779473570);
            boolean m3870g3 = c2395p.m3870g(c0959i9);
            Object m3847O4 = c2395p.m3847O();
            if (m3870g3 || m3847O4 == obj2) {
                m3847O4 = new InterfaceC3277a() { // from class: e5.l9
                    @Override // p150t5.InterfaceC3277a
                    /* renamed from: a */
                    public final Object mo52a() {
                        switch (i11) {
                            case 0:
                                return AbstractC2418w.m3980x(String.valueOf(c0959i9.f4782d));
                            case 1:
                                return AbstractC2418w.m3980x(String.valueOf(c0959i9.f4783e));
                            case 2:
                                return AbstractC2418w.m3980x(c0959i9.f4781c);
                            default:
                                return AbstractC2418w.m3980x(c0959i9.f4787i);
                        }
                    }
                };
                c2395p.m3877j0(m3847O4);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y06 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr4, (InterfaceC3277a) m3847O4, c2395p, 0);
            Object[] objArr5 = new Object[0];
            c2395p.m3857Z(-779470674);
            Object m3847O5 = c2395p.m3847O();
            if (m3847O5 == obj2) {
                m3847O5 = new C0317b(13);
                c2395p.m3877j0(m3847O5);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y07 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr5, (InterfaceC3277a) m3847O5, c2395p, 48);
            Object[] objArr6 = new Object[0];
            c2395p.m3857Z(-779468679);
            boolean m3870g4 = c2395p.m3870g(c0959i9);
            Object m3847O6 = c2395p.m3847O();
            final int i17 = 3;
            if (m3870g4 || m3847O6 == obj2) {
                m3847O6 = new InterfaceC3277a() { // from class: e5.l9
                    @Override // p150t5.InterfaceC3277a
                    /* renamed from: a */
                    public final Object mo52a() {
                        switch (i17) {
                            case 0:
                                return AbstractC2418w.m3980x(String.valueOf(c0959i9.f4782d));
                            case 1:
                                return AbstractC2418w.m3980x(String.valueOf(c0959i9.f4783e));
                            case 2:
                                return AbstractC2418w.m3980x(c0959i9.f4781c);
                            default:
                                return AbstractC2418w.m3980x(c0959i9.f4787i);
                        }
                    }
                };
                c2395p.m3877j0(m3847O6);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y08 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr6, (InterfaceC3277a) m3847O6, c2395p, 0);
            Object[] objArr7 = new Object[0];
            c2395p.m3857Z(-779466098);
            Object m3847O7 = c2395p.m3847O();
            int i18 = 14;
            if (m3847O7 == obj2) {
                m3847O7 = new C0317b(i18);
                c2395p.m3877j0(m3847O7);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y09 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr7, (InterfaceC3277a) m3847O7, c2395p, 48);
            Object[] objArr8 = new Object[0];
            c2395p.m3857Z(-779463858);
            Object m3847O8 = c2395p.m3847O();
            if (m3847O8 == obj2) {
                m3847O8 = new C0317b(15);
                c2395p.m3877j0(m3847O8);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y010 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr8, (InterfaceC3277a) m3847O8, c2395p, 48);
            Object[] objArr9 = new Object[0];
            c2395p.m3857Z(-779461875);
            Object m3847O9 = c2395p.m3847O();
            if (m3847O9 == obj2) {
                m3847O9 = new C0317b(i13);
                c2395p.m3877j0(m3847O9);
            }
            c2395p.m3888r(false);
            C2349d1 c2349d1 = (C2349d1) AbstractC3344k.m5080c(objArr9, (InterfaceC3277a) m3847O9, c2395p, 48);
            Object[] objArr10 = new Object[0];
            c2395p.m3857Z(-779460019);
            Object m3847O10 = c2395p.m3847O();
            if (m3847O10 == obj2) {
                m3847O10 = new C0317b(17);
                c2395p.m3877j0(m3847O10);
            }
            c2395p.m3888r(false);
            C2349d1 c2349d12 = (C2349d1) AbstractC3344k.m5080c(objArr10, (InterfaceC3277a) m3847O10, c2395p, 48);
            c2395p.m3857Z(-779458537);
            Object m3847O11 = c2395p.m3847O();
            if (m3847O11 == obj2) {
                m3847O11 = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p.m3877j0(m3847O11);
            }
            InterfaceC2425y0 interfaceC2425y011 = (InterfaceC2425y0) m3847O11;
            Object m181h = AbstractC0094y0.m181h(-779456552, c2395p, false);
            ?? r42 = C1813u.f10860e;
            if (m181h == obj2) {
                m181h = AbstractC2418w.m3980x(r42);
                c2395p.m3877j0(m181h);
            }
            InterfaceC2425y0 interfaceC2425y012 = (InterfaceC2425y0) m181h;
            Object m181h2 = AbstractC0094y0.m181h(-779453703, c2395p, false);
            if (m181h2 == obj2) {
                m181h2 = new C3472s();
                c2395p.m3877j0(m181h2);
            }
            C3472s c3472s = (C3472s) m181h2;
            Object m181h3 = AbstractC0094y0.m181h(-779450902, c2395p, false);
            if (m181h3 == obj2) {
                m181h3 = new C3472s();
                c2395p.m3877j0(m181h3);
            }
            C3472s c3472s2 = (C3472s) m181h3;
            Object m181h4 = AbstractC0094y0.m181h(-779448443, c2395p, false);
            if (m181h4 == obj2) {
                m181h4 = new C3472s();
                c2395p.m3877j0(m181h4);
            }
            C3472s c3472s3 = (C3472s) m181h4;
            Object m181h5 = AbstractC0094y0.m181h(-779446013, c2395p, false);
            if (m181h5 == obj2) {
                m181h5 = new C3472s();
                c2395p.m3877j0(m181h5);
            }
            C3472s c3472s4 = (C3472s) m181h5;
            c2395p.m3888r(false);
            Object m3847O12 = c2395p.m3847O();
            if (m3847O12 == obj2) {
                m3847O12 = AbstractC2418w.m3971n(c2395p);
                c2395p.m3877j0(m3847O12);
            }
            InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) m3847O12;
            String str = (String) interfaceC2425y03.getValue();
            c2395p.m3857Z(-779442649);
            boolean m3870g5 = c2395p.m3870g(str);
            Object m3847O13 = c2395p.m3847O();
            if (!m3870g5 && m3847O13 != obj2) {
                interfaceC2425y0 = interfaceC2425y012;
                interfaceC2425y02 = interfaceC2425y08;
            } else {
                C0442i c0442i = AbstractC1483z8.f9834a;
                String str2 = (String) interfaceC2425y03.getValue();
                C0442i c0442i2 = AbstractC1483z8.f9834a;
                C0442i c0442i3 = AbstractC1483z8.f9835b;
                AbstractC3367j.m5100e(str2, "text");
                String obj3 = AbstractC0444k.m956t0(str2).toString();
                if (AbstractC0444k.m937a0(obj3)) {
                    interfaceC2425y0 = interfaceC2425y012;
                    interfaceC2425y02 = interfaceC2425y08;
                } else if (AbstractC0451r.m971M(obj3, "curl ", true)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C0303j c0303j = new C0303j(C0442i.m926b(c0442i3, obj3));
                    while (c0303j.hasNext()) {
                        C0303j c0303j2 = c0303j;
                        Iterator it = AbstractC1805m.m3043g0(((C0439f) c0303j.next()).m923a(), 1).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (!AbstractC0444k.m937a0((String) obj)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        String str3 = (String) obj;
                        if (str3 == null) {
                            str3 = "";
                        }
                        InterfaceC2425y0 interfaceC2425y013 = interfaceC2425y012;
                        InterfaceC2425y0 interfaceC2425y014 = interfaceC2425y08;
                        int m934X = AbstractC0444k.m934X(str3, ':', 0, 6);
                        if (m934X > 0) {
                            String substring = str3.substring(0, m934X);
                            AbstractC3367j.m5099d(substring, "substring(...)");
                            String obj4 = AbstractC0444k.m956t0(substring).toString();
                            String substring2 = str3.substring(m934X + 1);
                            AbstractC3367j.m5099d(substring2, "substring(...)");
                            linkedHashMap.put(obj4, AbstractC0444k.m956t0(substring2).toString());
                        }
                        c0303j = c0303j2;
                        interfaceC2425y08 = interfaceC2425y014;
                        interfaceC2425y012 = interfaceC2425y013;
                    }
                    interfaceC2425y0 = interfaceC2425y012;
                    interfaceC2425y02 = interfaceC2425y08;
                    String replaceAll = c0442i3.f1508e.matcher(obj3).replaceAll(" ");
                    AbstractC3367j.m5099d(replaceAll, "replaceAll(...)");
                    C0295b c0295b = new C0295b(new C0302i(C0442i.m926b(c0442i2, replaceAll), new C0310q(5, linkedHashMap), 1).iterator(), new C1263s5(9));
                    if (c0295b.hasNext()) {
                        Object next = c0295b.next();
                        if (!c0295b.hasNext()) {
                            r42 = AbstractC3784a.m5817z(next);
                        } else {
                            r42 = new ArrayList();
                            r42.add(next);
                            while (c0295b.hasNext()) {
                                r42.add(c0295b.next());
                            }
                        }
                    }
                } else {
                    interfaceC2425y0 = interfaceC2425y012;
                    interfaceC2425y02 = interfaceC2425y08;
                    C0295b c0295b2 = new C0295b(new C0302i(C0442i.m926b(c0442i2, obj3), new C1263s5(10), 1).iterator(), new C1263s5(11));
                    if (c0295b2.hasNext()) {
                        Object next2 = c0295b2.next();
                        if (!c0295b2.hasNext()) {
                            r42 = AbstractC3784a.m5817z(next2);
                        } else {
                            r42 = new ArrayList();
                            r42.add(next2);
                            while (c0295b2.hasNext()) {
                                r42.add(c0295b2.next());
                            }
                        }
                    }
                }
                c2395p.m3877j0(r42);
                m3847O13 = r42;
            }
            List list = (List) m3847O13;
            c2395p.m3888r(false);
            C2769p1 m3297v = AbstractC2067b.m3297v(c2395p);
            if (c2349d12.m3741g() == 0) {
                i10 = 720;
            } else if (((EnumC1390w8) interfaceC2425y02.getValue()) == EnumC1390w8.f8311g) {
                i10 = 480;
            } else {
                i10 = 220;
            }
            float f7 = i10;
            InterfaceC2425y0 interfaceC2425y015 = interfaceC2425y0;
            interfaceC3277a2 = interfaceC3277a;
            AbstractC1991r4.m3160a(interfaceC3277a2, AbstractC3178i.m4873d(-1354862214, new C1360v9(list, interfaceC2425y0, interfaceC2425y02, interfaceC2425y011, c3472s, c3472s2, c2349d12, interfaceC3277a, interfaceC2425y04, c0959i9, interfaceC2425y05, c1196q0, interfaceC2425y06, interfaceC0516a0, context, c3472s4, c3472s3), c2395p), AbstractC0155c.m358q(AbstractC0155c.m346e(C3807o.f17991a, 0.94f), 0.0f, 760, 1), AbstractC0951i1.f4718h0, AbstractC3178i.m4873d(-1791965058, new C1422x9(c2349d12, interfaceC2425y03, context, interfaceC2425y015, list, interfaceC2425y02, interfaceC0516a0, interfaceC2425y06, interfaceC2425y011, c3472s, c3472s4, c3472s2, c3472s3), c2395p), AbstractC3178i.m4873d(1319984703, new C0801da(f7, m3297v, c2349d12, interfaceC2425y03, list, c3472s, interfaceC2425y015, interfaceC2425y07, interfaceC2425y09, interfaceC2425y010, interfaceC2425y06, interfaceC2425y04, interfaceC2425y05, interfaceC2425y02, interfaceC2425y011, c2349d1, c3472s2, c3472s3, c3472s4), c2395p), null, 0L, 0L, 0L, 0L, 0.0f, new C3767q(3), c2395p, ((i14 >> 3) & 14) | 1772976, 3072, 8080);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1019k9(i7, 0, c1196q0, interfaceC3277a2);
        }
    }

    /* renamed from: a0 */
    public static String m2249a0(C1248rl c1248rl, C1248rl c1248rl2) {
        String str;
        Network network = c1248rl.f7392c;
        AbstractC3367j.m5100e(c1248rl2, "after");
        EnumC1070lt enumC1070lt = c1248rl2.f7393d;
        Network network2 = c1248rl2.f7392c;
        String str2 = c1248rl2.f7394e;
        StringBuilder sb = new StringBuilder();
        sb.append("id=" + c1248rl.f7390a + " name=" + c1248rl.f7391b);
        String str3 = c1248rl.f7394e;
        String str4 = "";
        if (str3 == null) {
            str = "";
        } else {
            str = str3;
        }
        if (str2 != null) {
            str4 = str2;
        }
        if (!str.equals(str4)) {
            sb.append(" iface:" + str3 + "->" + str2);
        }
        if (!AbstractC3367j.m5096a(network, network2)) {
            sb.append(" net:" + m2246Y(network) + "->" + m2246Y(network2));
        }
        EnumC1070lt enumC1070lt2 = c1248rl.f7393d;
        if (enumC1070lt2 != enumC1070lt) {
            sb.append(" transport:" + enumC1070lt2.name() + "->" + enumC1070lt.name());
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m2250b(String str, boolean z7, InterfaceC3810r interfaceC3810r, InterfaceC3277a interfaceC3277a, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        long j6;
        long j7;
        float f7;
        long j8;
        c2395p.m3859a0(213996224);
        if (c2395p.m3870g(str)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i12 = i7 | i8;
        if (c2395p.m3872h(z7)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i13 = i12 | i9;
        if (c2395p.m3870g(interfaceC3810r)) {
            i10 = 256;
        } else {
            i10 = 128;
        }
        int i14 = i13 | i10;
        if (c2395p.m3874i(interfaceC3277a)) {
            i11 = 2048;
        } else {
            i11 = 1024;
        }
        int i15 = i14 | i11;
        if ((i15 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C3137j0 c3137j0 = AbstractC2050z.f12193a;
            if (z7) {
                c2395p.m3857Z(-1486553913);
                j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11809c;
            } else {
                c2395p.m3857Z(-1486552386);
                j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11822p;
            }
            c2395p.m3888r(false);
            if (z7) {
                c2395p.m3857Z(-1486549943);
                j7 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11810d;
            } else {
                c2395p.m3857Z(-1486548352);
                j7 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11823q;
            }
            c2395p.m3888r(false);
            C2042y m3217d = AbstractC2050z.m3217d(j6, j7, 0L, 0L, c2395p, 12);
            int i16 = 1;
            if (z7) {
                f7 = (float) 1.5d;
            } else {
                f7 = 1;
            }
            if (z7) {
                c2395p.m3857Z(-1486544418);
                j8 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11807a;
            } else {
                c2395p.m3857Z(-1486543163);
                j8 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11784B;
            }
            c2395p.m3888r(false);
            AbstractC1991r4.m3166g(interfaceC3277a, interfaceC3810r, false, null, m3217d, AbstractC2072e.m3325a(f7, j8), null, AbstractC3178i.m4873d(1494067470, new C0859f5(str, i16), c2395p), c2395p, ((i15 >> 9) & 14) | 805306368 | ((i15 >> 3) & 112), 428);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1477z2(i7, str, interfaceC3277a, interfaceC3810r, z7);
        }
    }

    /* renamed from: b0 */
    public static String m2251b0(C1248rl c1248rl) {
        String obj;
        AbstractC3367j.m5100e(c1248rl, "target");
        StringBuilder sb = new StringBuilder();
        sb.append(c1248rl.f7391b);
        sb.append('/');
        sb.append(c1248rl.f7390a);
        String str = c1248rl.f7394e;
        if (str != null && (obj = AbstractC0444k.m956t0(str).toString()) != null) {
            if (AbstractC0444k.m937a0(obj)) {
                obj = null;
            }
            if (obj != null) {
                sb.append(" iface=".concat(obj));
            }
        }
        sb.append(' ');
        sb.append(m2246Y(c1248rl.f7392c));
        sb.append(" transport=" + c1248rl.f7393d.name());
        return sb.toString();
    }

    /* renamed from: c */
    public static final void m2252c(String str, String str2, boolean z7, InterfaceC3277a interfaceC3277a, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        c2395p.m3859a0(2065950613);
        if (c2395p.m3870g(str2)) {
            i8 = 32;
        } else {
            i8 = 16;
        }
        int i11 = i7 | i8;
        if (c2395p.m3872h(z7)) {
            i9 = 256;
        } else {
            i9 = 128;
        }
        int i12 = i11 | i9;
        if (c2395p.m3874i(interfaceC3277a)) {
            i10 = 2048;
        } else {
            i10 = 1024;
        }
        int i13 = i12 | i10;
        if ((i13 & 1171) == 1170 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            AbstractC1991r4.m3167h(interfaceC3277a, AbstractC0155c.m346e(C3807o.f17991a, 1.0f), false, null, null, null, AbstractC3178i.m4873d(-1570928392, new C0896ga(str, str2, z7), c2395p), c2395p, ((i13 >> 9) & 14) | 805306416, 508);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1477z2(str, str2, z7, interfaceC3277a, i7);
        }
    }

    /* renamed from: c0 */
    public static String m2253c0(Collection collection) {
        AbstractC3367j.m5100e(collection, "targets");
        if (collection.isEmpty()) {
            return "[]";
        }
        return AbstractC1805m.m3051o0(collection, null, "[", "]", new C0866fc(16), 25);
    }

    /* renamed from: d */
    public static final void m2254d(C0800d9 c0800d9, List list, C1196q0 c1196q0, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        C2395p c2395p2;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        InterfaceC3277a interfaceC3277a;
        String str;
        C0800d9 c0800d92 = c0800d9;
        C1196q0 c1196q02 = c1196q0;
        c2395p.m3859a0(1596376109);
        if (c2395p.m3874i(c0800d92)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i11 = i7 | i8;
        if (c2395p.m3874i(list)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i12 = i11 | i9;
        if (c2395p.m3874i(c1196q02)) {
            i10 = 256;
        } else {
            i10 = 128;
        }
        int i13 = i12 | i10;
        if ((i13 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
            c2395p2 = c2395p;
        } else {
            Context context = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
                m3847O = AbstractC2418w.m3971n(c2395p);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) m3847O;
            c2395p.m3857Z(-115182917);
            Object m3847O2 = c2395p.m3847O();
            if (m3847O2 == c2413u0) {
                m3847O2 = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p.m3877j0(m3847O2);
            }
            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O2;
            Object m181h = AbstractC0094y0.m181h(-115181221, c2395p, false);
            if (m181h == c2413u0) {
                m181h = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p.m3877j0(m181h);
            }
            InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) m181h;
            Object m181h2 = AbstractC0094y0.m181h(-115179333, c2395p, false);
            if (m181h2 == c2413u0) {
                m181h2 = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p.m3877j0(m181h2);
            }
            InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) m181h2;
            c2395p.m3888r(false);
            Object[] objArr = {c0800d92.f3340a};
            c2395p.m3857Z(-115176750);
            Object m3847O3 = c2395p.m3847O();
            if (m3847O3 == c2413u0) {
                m3847O3 = new C0317b(19);
                c2395p.m3877j0(m3847O3);
            }
            c2395p.m3888r(false);
            AbstractC1991r4.m3162c(AbstractC0155c.m346e(AbstractC0154b.m339j(C3807o.f17991a, 12, 0.0f, 2), 1.0f), null, null, null, AbstractC3178i.m4873d(943925279, new C0960ia(c0800d92, list, (InterfaceC2425y0) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O3, c2395p, 48), interfaceC2425y0, context, c1196q02, interfaceC2425y02, interfaceC2425y03), c2395p), c2395p, 196614, 30);
            c2395p2 = c2395p;
            c2395p2.m3857Z(-114990809);
            boolean z11 = true;
            if (((Boolean) interfaceC2425y02.getValue()).booleanValue()) {
                String str2 = c0800d92.f3342c;
                c2395p2.m3857Z(-114989461);
                Object m3847O4 = c2395p2.m3847O();
                if (m3847O4 == c2413u0) {
                    m3847O4 = new C1353v2(interfaceC2425y02, 18);
                    c2395p2.m3877j0(m3847O4);
                }
                InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) m3847O4;
                c2395p2.m3888r(false);
                c2395p2.m3857Z(-114988577);
                boolean m3874i = c2395p2.m3874i(interfaceC0516a0);
                if ((i13 & 896) != 256 && !c2395p2.m3874i(c1196q02)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                boolean z12 = m3874i | z9;
                if ((i13 & 14) != 4 && !c2395p2.m3874i(c0800d92)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean m3874i2 = z12 | z10 | c2395p2.m3874i(context);
                Object m3847O5 = c2395p2.m3847O();
                if (!m3874i2 && m3847O5 != c2413u0) {
                    interfaceC3277a = interfaceC3277a2;
                    c0800d92 = c0800d92;
                    c1196q02 = c1196q02;
                    str = str2;
                } else {
                    interfaceC3277a = interfaceC3277a2;
                    str = str2;
                    c1196q02 = c1196q02;
                    C0318c c0318c = new C0318c(interfaceC0516a0, c1196q02, c0800d92, context, interfaceC2425y02, 1);
                    c0800d92 = c0800d92;
                    c2395p2.m3877j0(c0318c);
                    m3847O5 = c0318c;
                }
                z7 = false;
                c2395p2.m3888r(false);
                m2294x(str, interfaceC3277a, (InterfaceC3279c) m3847O5, c2395p2, 48);
            } else {
                c0800d92 = c0800d92;
                c1196q02 = c1196q02;
                z7 = false;
            }
            c2395p2.m3888r(z7);
            if (((Boolean) interfaceC2425y03.getValue()).booleanValue()) {
                c2395p2.m3857Z(-114977743);
                Object m3847O6 = c2395p2.m3847O();
                if (m3847O6 == c2413u0) {
                    m3847O6 = new C1353v2(interfaceC2425y03, 19);
                    c2395p2.m3877j0(m3847O6);
                }
                InterfaceC3277a interfaceC3277a3 = (InterfaceC3277a) m3847O6;
                c2395p2.m3888r(false);
                c2395p2.m3857Z(-114976179);
                if ((i13 & 896) != 256 && !c2395p2.m3874i(c1196q02)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                int i14 = i13 & 14;
                if (i14 != 4 && !c2395p2.m3874i(c0800d92)) {
                    z11 = false;
                }
                boolean z13 = z8 | z11;
                Object m3847O7 = c2395p2.m3847O();
                if (z13 || m3847O7 == c2413u0) {
                    m3847O7 = new C1009k(c1196q02, c0800d92, interfaceC2425y03, 2);
                    c2395p2.m3877j0(m3847O7);
                }
                c2395p2.m3888r(false);
                m2292w(c0800d92, interfaceC3277a3, (InterfaceC3279c) m3847O7, c2395p2, 56 | i14);
            }
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1081m9(c0800d92, list, c1196q02, i7, 0);
        }
    }

    /* renamed from: d0 */
    public static C0961ib m2255d0(JSONObject jSONObject) {
        Object m2985m;
        try {
            String string = jSONObject.getString("versionName");
            AbstractC3367j.m5099d(string, "getString(...)");
            String optString = jSONObject.optString("releaseName");
            AbstractC3367j.m5099d(optString, "optString(...)");
            String optString2 = jSONObject.optString("releaseUrl");
            AbstractC3367j.m5099d(optString2, "optString(...)");
            String string2 = jSONObject.getString("apkDownloadUrl");
            AbstractC3367j.m5099d(string2, "getString(...)");
            String string3 = jSONObject.getString("apkFileName");
            AbstractC3367j.m5099d(string3, "getString(...)");
            String optString3 = jSONObject.optString("releaseNotes");
            AbstractC3367j.m5099d(optString3, "optString(...)");
            m2985m = new C0961ib(string, optString, optString2, string2, string3, optString3, jSONObject.optLong("fileSize"), jSONObject.optLong("downloadedAt"));
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (m2985m instanceof C1689h) {
            m2985m = null;
        }
        return (C0961ib) m2985m;
    }

    /* renamed from: e */
    public static final void m2256e(InterfaceC2425y0 interfaceC2425y0, boolean z7) {
        interfaceC2425y0.setValue(Boolean.valueOf(z7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [g5.h] */
    /* renamed from: e0 */
    public static List m2257e0(Context context) {
        List list;
        AbstractC3367j.m5100e(context, "context");
        String string = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_dns_page_ecs_subnets", null);
        List list2 = C1813u.f10860e;
        if (string == null) {
            return list2;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            C2079c m5802f = AbstractC3784a.m5802f();
            int length = jSONArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i7);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("label", "");
                    AbstractC3367j.m5099d(optString, "optString(...)");
                    String optString2 = optJSONObject.optString("cidr", "");
                    AbstractC3367j.m5099d(optString2, "optString(...)");
                    m5802f.add(new C0878fo(optString, optString2));
                }
            }
            list = AbstractC3784a.m5798b(m5802f);
        } catch (Throwable th) {
            list = AbstractC1793a0.m2985m(th);
        }
        if (!(list instanceof C1689h)) {
            list2 = list;
        }
        return list2;
    }

    /* JADX WARN: Type inference failed for: r2v33, types: [t.u0, java.lang.Object] */
    /* renamed from: f */
    public static final void m2258f(InterfaceC3810r interfaceC3810r, C2395p c2395p, int i7) {
        ArrayList arrayList;
        InterfaceC2425y0 interfaceC2425y0;
        C1196q0 c1196q0;
        boolean z7;
        C1196q0 c1196q02;
        Object obj;
        C2395p c2395p2 = c2395p;
        c2395p2.m3859a0(2067907821);
        if ((i7 & 3) == 2 && c2395p2.m3836D()) {
            c2395p2.m3852U();
        } else {
            Context context = (Context) c2395p2.m3878k(AndroidCompositionLocals_androidKt.f786b);
            C0927h9.f4481a.m1554a(context);
            InterfaceC2425y0 m3970m = AbstractC2418w.m3970m(C0927h9.f4483c, c2395p2);
            C1566b c1566b = new C1566b(1);
            c2395p2.m3857Z(-1214963694);
            boolean m3874i = c2395p2.m3874i(context);
            Object m3847O = c2395p2.m3847O();
            Object obj2 = C2375k.f13421a;
            if (m3874i || m3847O == obj2) {
                m3847O = new C0988j9(context, 0);
                c2395p2.m3877j0(m3847O);
            }
            c2395p2.m3888r(false);
            C0328m m5793C = AbstractC3784a.m5793C(c1566b, (InterfaceC3279c) m3847O, c2395p2);
            c2395p2.m3857Z(-1214960407);
            Object m3847O2 = c2395p2.m3847O();
            if (m3847O2 == obj2) {
                m3847O2 = C1196q0.f6960p.m2199p(context);
                c2395p2.m3877j0(m3847O2);
            }
            C1196q0 c1196q03 = (C1196q0) m3847O2;
            c2395p2.m3888r(false);
            InterfaceC2425y0 m3970m2 = AbstractC2418w.m3970m(c1196q03.f6972k, c2395p2);
            InterfaceC2425y0 m3970m3 = AbstractC2418w.m3970m(c1196q03.f6974m, c2395p2);
            Object[] objArr = new Object[0];
            c2395p2.m3857Z(-1214954571);
            Object m3847O3 = c2395p2.m3847O();
            if (m3847O3 == obj2) {
                m3847O3 = new C0317b(18);
                c2395p2.m3877j0(m3847O3);
            }
            c2395p2.m3888r(false);
            C2349d1 c2349d1 = (C2349d1) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O3, c2395p2, 48);
            Object[] objArr2 = new Object[0];
            c2395p2.m3857Z(-1214952618);
            Object m3847O4 = c2395p2.m3847O();
            if (m3847O4 == obj2) {
                m3847O4 = new C0317b(21);
                c2395p2.m3877j0(m3847O4);
            }
            c2395p2.m3888r(false);
            InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr2, (InterfaceC3277a) m3847O4, c2395p2, 48);
            Object[] objArr3 = new Object[0];
            c2395p2.m3857Z(-1214950186);
            Object m3847O5 = c2395p2.m3847O();
            if (m3847O5 == obj2) {
                m3847O5 = new C0317b(26);
                c2395p2.m3877j0(m3847O5);
            }
            c2395p2.m3888r(false);
            InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr3, (InterfaceC3277a) m3847O5, c2395p2, 48);
            Object[] objArr4 = new Object[0];
            c2395p2.m3857Z(-1214947786);
            Object m3847O6 = c2395p2.m3847O();
            if (m3847O6 == obj2) {
                m3847O6 = new C0317b(28);
                c2395p2.m3877j0(m3847O6);
            }
            c2395p2.m3888r(false);
            InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr4, (InterfaceC3277a) m3847O6, c2395p2, 48);
            int m3741g = c2349d1.m3741g();
            EnumC0768c9 enumC0768c9 = EnumC0768c9.f3010j;
            if (m3741g == 0) {
                List list = (List) m3970m2.getValue();
                arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((C0800d9) obj3).f3351l != enumC0768c9) {
                        arrayList.add(obj3);
                    }
                }
            } else {
                List list2 = (List) m3970m2.getValue();
                arrayList = new ArrayList();
                for (Object obj4 : list2) {
                    if (((C0800d9) obj4).f3351l == enumC0768c9) {
                        arrayList.add(obj4);
                    }
                }
            }
            ArrayList arrayList2 = arrayList;
            Object[] objArr5 = new Object[0];
            c2395p2.m3857Z(-1214940810);
            Object m3847O7 = c2395p2.m3847O();
            if (m3847O7 == obj2) {
                m3847O7 = new C0317b(29);
                c2395p2.m3877j0(m3847O7);
            }
            c2395p2.m3888r(false);
            InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr5, (InterfaceC3277a) m3847O7, c2395p2, 48);
            Boolean valueOf = Boolean.valueOf(((C0959i9) m3970m.getValue()).f4780b);
            Boolean valueOf2 = Boolean.valueOf(((C0959i9) m3970m.getValue()).f4789k);
            c2395p2.m3857Z(-1214937030);
            boolean m3870g = c2395p2.m3870g(interfaceC2425y05) | c2395p2.m3870g(m3970m) | c2395p2.m3874i(c1196q03);
            Object m3847O8 = c2395p2.m3847O();
            if (!m3870g && m3847O8 != obj2) {
                interfaceC2425y0 = m3970m;
            } else {
                C0047l1 c0047l1 = new C0047l1(c1196q03, interfaceC2425y05, m3970m, null, 1);
                interfaceC2425y0 = m3970m;
                c2395p2.m3877j0(c0047l1);
                m3847O8 = c0047l1;
            }
            c2395p2.m3888r(false);
            AbstractC2418w.m3964f(valueOf, valueOf2, (InterfaceC3281e) m3847O8, c2395p2);
            AbstractC2047y4.m3208a(interfaceC3810r, null, null, null, AbstractC3178i.m4873d(495693556, new C0862f8(interfaceC2425y03, c2349d1, m3970m2), c2395p2), 0, 0L, 0L, new Object(), AbstractC3178i.m4873d(-1704916548, new C0765c6(arrayList2, m3970m3, c1196q03, c2349d1, m3970m2, interfaceC2425y02, 3), c2395p2), c2395p2, 805330950, 238);
            c2395p2.m3857Z(-1214842353);
            if (((Boolean) interfaceC2425y02.getValue()).booleanValue()) {
                c2395p2.m3857Z(-1214840432);
                boolean m3870g2 = c2395p2.m3870g(interfaceC2425y02);
                Object m3847O9 = c2395p2.m3847O();
                if (m3870g2 || m3847O9 == obj2) {
                    m3847O9 = new C1353v2(interfaceC2425y02, 26);
                    c2395p2.m3877j0(m3847O9);
                }
                z7 = false;
                c2395p2.m3888r(false);
                c1196q0 = c1196q03;
                m2248a(c1196q0, (InterfaceC3277a) m3847O9, c2395p2, 8);
            } else {
                c1196q0 = c1196q03;
                z7 = false;
            }
            c2395p2.m3888r(z7);
            c2395p2.m3857Z(-1214839309);
            if (AbstractC0444k.m937a0(((C0959i9) interfaceC2425y0.getValue()).f4779a)) {
                c2395p2.m3857Z(-1214836417);
                Object m3847O10 = c2395p2.m3847O();
                if (m3847O10 == obj2) {
                    m3847O10 = new C0317b(1);
                    c2395p2.m3877j0(m3847O10);
                }
                c2395p2.m3888r(z7);
                obj = obj2;
                c1196q02 = c1196q0;
                AbstractC1991r4.m3160a((InterfaceC3277a) m3847O10, AbstractC3178i.m4873d(-659821577, new C1324u4(6, m5793C), c2395p2), null, null, AbstractC0951i1.f4717h, AbstractC0951i1.f4719i, null, 0L, 0L, 0L, 0L, 0.0f, null, c2395p, 1769526, 0, 16284);
                c2395p2 = c2395p;
                z7 = false;
            } else {
                c1196q02 = c1196q0;
                obj = obj2;
            }
            c2395p2.m3888r(z7);
            if (((Boolean) interfaceC2425y03.getValue()).booleanValue()) {
                c2395p2.m3857Z(-1214826370);
                boolean m3870g3 = c2395p2.m3870g(interfaceC2425y03);
                Object m3847O11 = c2395p2.m3847O();
                if (m3870g3 || m3847O11 == obj) {
                    m3847O11 = new C1353v2(interfaceC2425y03, 27);
                    c2395p2.m3877j0(m3847O11);
                }
                c2395p2.m3888r(z7);
                AbstractC1991r4.m3160a((InterfaceC3277a) m3847O11, AbstractC3178i.m4873d(-646288776, new C0862f8(c1196q02, interfaceC2425y04, interfaceC2425y03, 2), c2395p2), null, AbstractC3178i.m4873d(-1269570378, new C1200q4(interfaceC2425y03, 10), c2395p2), AbstractC0951i1.f4725l, AbstractC3178i.m4873d(-57009133, new C1200q4(interfaceC2425y04, 9), c2395p2), null, 0L, 0L, 0L, 0L, 0.0f, null, c2395p, 1772592, 0, 16276);
            }
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1143o9(interfaceC3810r, i7, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [g5.h] */
    /* renamed from: f0 */
    public static List m2259f0(Context context) {
        List list;
        AbstractC3367j.m5100e(context, "context");
        String string = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_dns_page_servers", null);
        List list2 = C1813u.f10860e;
        if (string == null) {
            return list2;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            C2079c m5802f = AbstractC3784a.m5802f();
            int length = jSONArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                String optString = jSONArray.optString(i7);
                AbstractC3367j.m5099d(optString, "optString(...)");
                String obj = AbstractC0444k.m956t0(optString).toString();
                if (!AbstractC0444k.m937a0(obj)) {
                    m5802f.add(obj);
                }
            }
            list = AbstractC3784a.m5798b(m5802f);
        } catch (Throwable th) {
            list = AbstractC1793a0.m2985m(th);
        }
        if (!(list instanceof C1689h)) {
            list2 = list;
        }
        return list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0305  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2260g(InterfaceC3810r interfaceC3810r, C2395p c2395p, int i7) {
        InterfaceC2425y0 interfaceC2425y0;
        Object obj;
        Object obj2;
        Object obj3;
        InterfaceC2425y0 interfaceC2425y02;
        Object obj4;
        boolean z7;
        c2395p.m3859a0(442800830);
        if ((i7 & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            final Context context = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
            C0927h9.f4481a.m1554a(context);
            final InterfaceC2425y0 m3970m = AbstractC2418w.m3970m(C0927h9.f4483c, c2395p);
            C1566b c1566b = new C1566b(1);
            c2395p.m3857Z(1678156005);
            boolean m3874i = c2395p.m3874i(context);
            Object m3847O = c2395p.m3847O();
            Object obj5 = C2375k.f13421a;
            if (m3874i || m3847O == obj5) {
                m3847O = new C0988j9(context, 1);
                c2395p.m3877j0(m3847O);
            }
            c2395p.m3888r(false);
            final C0328m m5793C = AbstractC3784a.m5793C(c1566b, (InterfaceC3279c) m3847O, c2395p);
            c2395p.m3857Z(1678159292);
            Object m3847O2 = c2395p.m3847O();
            if (m3847O2 == obj5) {
                m3847O2 = C1196q0.f6960p.m2199p(context);
                c2395p.m3877j0(m3847O2);
            }
            C1196q0 c1196q0 = (C1196q0) m3847O2;
            c2395p.m3888r(false);
            Object[] objArr = new Object[0];
            c2395p.m3857Z(1678162057);
            Object m3847O3 = c2395p.m3847O();
            if (m3847O3 == obj5) {
                m3847O3 = new C0317b(22);
                c2395p.m3877j0(m3847O3);
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O3, c2395p, 48);
            Object[] objArr2 = new Object[0];
            c2395p.m3857Z(1678164297);
            Object m3847O4 = c2395p.m3847O();
            if (m3847O4 == obj5) {
                m3847O4 = new C0317b(23);
                c2395p.m3877j0(m3847O4);
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr2, (InterfaceC3277a) m3847O4, c2395p, 48);
            Object[] objArr3 = new Object[0];
            c2395p.m3857Z(1678166569);
            Object m3847O5 = c2395p.m3847O();
            if (m3847O5 == obj5) {
                m3847O5 = new C0317b(24);
                c2395p.m3877j0(m3847O5);
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr3, (InterfaceC3277a) m3847O5, c2395p, 48);
            Object[] objArr4 = new Object[0];
            c2395p.m3857Z(1678168681);
            Object m3847O6 = c2395p.m3847O();
            if (m3847O6 == obj5) {
                m3847O6 = new C0317b(25);
                c2395p.m3877j0(m3847O6);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y06 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr4, (InterfaceC3277a) m3847O6, c2395p, 48);
            Object[] objArr5 = {Integer.valueOf(((C0959i9) m3970m.getValue()).f4782d)};
            c2395p.m3857Z(1678171688);
            boolean m3870g = c2395p.m3870g(m3970m);
            Object m3847O7 = c2395p.m3847O();
            if (m3870g || m3847O7 == obj5) {
                m3847O7 = new C1353v2(m3970m, 21);
                c2395p.m3877j0(m3847O7);
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y07 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr5, (InterfaceC3277a) m3847O7, c2395p, 0);
            Object[] objArr6 = {Integer.valueOf(((C0959i9) m3970m.getValue()).f4783e)};
            c2395p.m3857Z(1678175554);
            boolean m3870g2 = c2395p.m3870g(m3970m);
            Object m3847O8 = c2395p.m3847O();
            if (m3870g2 || m3847O8 == obj5) {
                m3847O8 = new C1353v2(m3970m, 22);
                c2395p.m3877j0(m3847O8);
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y08 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr6, (InterfaceC3277a) m3847O8, c2395p, 0);
            Object[] objArr7 = {Integer.valueOf(((C0959i9) m3970m.getValue()).f4785g)};
            c2395p.m3857Z(1678179332);
            boolean m3870g3 = c2395p.m3870g(m3970m);
            Object m3847O9 = c2395p.m3847O();
            if (m3870g3 || m3847O9 == obj5) {
                m3847O9 = new C1353v2(m3970m, 23);
                c2395p.m3877j0(m3847O9);
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y09 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr7, (InterfaceC3277a) m3847O9, c2395p, 0);
            Object[] objArr8 = {Integer.valueOf(((C0959i9) m3970m.getValue()).f4786h)};
            c2395p.m3857Z(1678183173);
            boolean m3870g4 = c2395p.m3870g(m3970m);
            Object m3847O10 = c2395p.m3847O();
            if (m3870g4 || m3847O10 == obj5) {
                m3847O10 = new C1353v2(m3970m, 24);
                c2395p.m3877j0(m3847O10);
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y010 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr8, (InterfaceC3277a) m3847O10, c2395p, 0);
            Object[] objArr9 = {Integer.valueOf(((C0959i9) m3970m.getValue()).f4790l)};
            c2395p.m3857Z(1678187391);
            boolean m3870g5 = c2395p.m3870g(m3970m);
            Object m3847O11 = c2395p.m3847O();
            if (!m3870g5 && m3847O11 != obj5) {
                interfaceC2425y0 = interfaceC2425y06;
            } else {
                interfaceC2425y0 = interfaceC2425y06;
                m3847O11 = new C1353v2(m3970m, 25);
                c2395p.m3877j0(m3847O11);
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y011 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr9, (InterfaceC3277a) m3847O11, c2395p, 0);
            Object[] objArr10 = new Object[0];
            c2395p.m3857Z(1678191497);
            Object m3847O12 = c2395p.m3847O();
            if (m3847O12 == obj5) {
                obj = obj5;
                m3847O12 = new C0317b(20);
                c2395p.m3877j0(m3847O12);
            } else {
                obj = obj5;
            }
            c2395p.m3888r(false);
            final InterfaceC2425y0 interfaceC2425y012 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr10, (InterfaceC3277a) m3847O12, c2395p, 48);
            float f7 = 2;
            InterfaceC3810r m338i = AbstractC0154b.m338i(interfaceC3810r.mo5829e(AbstractC0155c.f660c), f7, f7);
            C3130g m4843g = AbstractC3136j.m4843g(8);
            c2395p.m3857Z(1678204692);
            final InterfaceC2425y0 interfaceC2425y013 = interfaceC2425y0;
            boolean m3870g6 = c2395p.m3870g(m3970m) | c2395p.m3874i(m5793C) | c2395p.m3870g(interfaceC2425y03) | c2395p.m3874i(context) | c2395p.m3870g(interfaceC2425y04) | c2395p.m3870g(interfaceC2425y07) | c2395p.m3870g(interfaceC2425y08) | c2395p.m3870g(interfaceC2425y05) | c2395p.m3870g(interfaceC2425y09) | c2395p.m3870g(interfaceC2425y010) | c2395p.m3870g(interfaceC2425y013) | c2395p.m3870g(interfaceC2425y011) | c2395p.m3870g(interfaceC2425y012);
            Object m3847O13 = c2395p.m3847O();
            if (!m3870g6) {
                obj2 = obj;
                if (m3847O13 != obj2) {
                    interfaceC2425y02 = interfaceC2425y012;
                    obj3 = obj2;
                    obj4 = m3847O13;
                    z7 = false;
                    c2395p.m3888r(z7);
                    boolean z8 = z7;
                    Object obj6 = obj3;
                    AbstractC2064e.m3235e(24576, 238, c2395p, null, m4843g, null, (InterfaceC3279c) obj4, null, null, m338i, false);
                    if (((Boolean) interfaceC2425y02.getValue()).booleanValue()) {
                        c2395p.m3857Z(1678459121);
                        boolean m3870g7 = c2395p.m3870g(interfaceC2425y02);
                        Object m3847O14 = c2395p.m3847O();
                        if (m3870g7 || m3847O14 == obj6) {
                            m3847O14 = new C1353v2(interfaceC2425y02, 20);
                            c2395p.m3877j0(m3847O14);
                        }
                        c2395p.m3888r(z8);
                        AbstractC1991r4.m3160a((InterfaceC3277a) m3847O14, AbstractC3178i.m4873d(-725822325, new C1232r5(4, c1196q0, interfaceC2425y02), c2395p), null, AbstractC3178i.m4873d(1921782029, new C1200q4(interfaceC2425y02, 11), c2395p), AbstractC0951i1.f4746z, AbstractC0951i1.f4677A, null, 0L, 0L, 0L, 0L, 0.0f, null, c2395p, 1772592, 0, 16276);
                    }
                }
            } else {
                obj2 = obj;
            }
            obj3 = obj2;
            z7 = false;
            obj4 = new InterfaceC3279c() { // from class: e5.n9
                @Override // p150t5.InterfaceC3279c
                /* renamed from: f */
                public final Object mo23f(Object obj7) {
                    C3320h c3320h = (C3320h) obj7;
                    AbstractC3367j.m5100e(c3320h, "$this$LazyColumn");
                    C0328m c0328m = C0328m.this;
                    InterfaceC2425y0 interfaceC2425y014 = m3970m;
                    C3320h.m5052l(c3320h, null, new C3173d(77779114, new C1113na(c0328m, interfaceC2425y014, 1), true), 3);
                    InterfaceC2425y0 interfaceC2425y015 = interfaceC2425y03;
                    InterfaceC2425y0 interfaceC2425y016 = interfaceC2425y04;
                    InterfaceC2425y0 interfaceC2425y017 = interfaceC2425y05;
                    InterfaceC2425y0 interfaceC2425y018 = interfaceC2425y013;
                    Context context2 = context;
                    C3320h.m5052l(c3320h, null, new C3173d(-437201197, new C1144oa(interfaceC2425y015, interfaceC2425y016, interfaceC2425y017, interfaceC2425y018, interfaceC2425y014, context2, interfaceC2425y07, interfaceC2425y08, interfaceC2425y09, interfaceC2425y010, 1), true), 3);
                    C3320h.m5052l(c3320h, null, new C3173d(1440067698, new C1175pa(context2, interfaceC2425y011, interfaceC2425y014, 1), true), 3);
                    C3320h.m5052l(c3320h, null, new C3173d(-977630703, new C1076m4(interfaceC2425y012, 4), true), 3);
                    return C1694m.f10482a;
                }
            };
            interfaceC2425y02 = interfaceC2425y012;
            c2395p.m3877j0(obj4);
            c2395p.m3888r(z7);
            boolean z82 = z7;
            Object obj62 = obj3;
            AbstractC2064e.m3235e(24576, 238, c2395p, null, m4843g, null, (InterfaceC3279c) obj4, null, null, m338i, false);
            if (((Boolean) interfaceC2425y02.getValue()).booleanValue()) {
            }
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1143o9(interfaceC3810r, i7, 0);
        }
    }

    /* renamed from: g0 */
    public static void m2261g0(String str) {
        AbstractC3367j.m5100e(str, "message");
        if (!Log.isLoggable("HBCS-NetIface", 4)) {
            return;
        }
        Log.i("HBCS-NetIface", str);
    }

    /* renamed from: h */
    public static final void m2262h(String str, String str2, String str3, InterfaceC3277a interfaceC3277a, InterfaceC3279c interfaceC3279c, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        AbstractC3367j.m5100e(str2, "initialName");
        AbstractC3367j.m5100e(interfaceC3277a, "onDismiss");
        AbstractC3367j.m5100e(interfaceC3279c, "onConfirm");
        c2395p.m3859a0(451002151);
        if (c2395p.m3870g(str2)) {
            i8 = 32;
        } else {
            i8 = 16;
        }
        int i11 = i7 | i8;
        if (c2395p.m3874i(interfaceC3277a)) {
            i9 = 2048;
        } else {
            i9 = 1024;
        }
        int i12 = i11 | i9;
        if (c2395p.m3874i(interfaceC3279c)) {
            i10 = 16384;
        } else {
            i10 = 8192;
        }
        int i13 = i12 | i10;
        if ((i13 & 9363) == 9362 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            c2395p.m3857Z(1292031850);
            Object m3847O = c2395p.m3847O();
            if (m3847O == C2375k.f13421a) {
                m3847O = AbstractC2418w.m3980x(str2);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m3847O;
            c2395p.m3888r(false);
            AbstractC1991r4.m3160a(interfaceC3277a, AbstractC3178i.m4873d(1731922911, new C1392wa(interfaceC3279c, interfaceC2425y0, 1), c2395p), null, AbstractC3178i.m4873d(2020742301, new C1387w5(7, interfaceC3277a), c2395p), AbstractC3178i.m4873d(-1985405605, new C1294t5(str, 2), c2395p), AbstractC3178i.m4873d(-1840995910, new C1232r5(interfaceC2425y0, str3), c2395p), null, 0L, 0L, 0L, 0L, 0.0f, null, c2395p, ((i13 >> 9) & 14) | 1772592, 0, 16276);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1446y2(str, str2, str3, interfaceC3277a, interfaceC3279c, i7, 1);
        }
    }

    /* renamed from: h0 */
    public static final boolean m2263h0(String str) {
        AbstractC3367j.m5100e(str, "<this>");
        if (AbstractC0451r.m971M(str, "fetch+", false)) {
            str = AbstractC0444k.m943g0(str, "fetch+");
        }
        if (!AbstractC0451r.m971M(str, "http://", false) && !AbstractC0451r.m971M(str, "https://", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static final void m2264i(int i7, C2395p c2395p, InterfaceC3277a interfaceC3277a) {
        int i8;
        InterfaceC3277a interfaceC3277a2;
        AbstractC3367j.m5100e(interfaceC3277a, "onDismiss");
        c2395p.m3859a0(1767324665);
        if (c2395p.m3874i(interfaceC3277a)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i9 = i8 | i7;
        if ((i9 & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
            interfaceC3277a2 = interfaceC3277a;
        } else {
            interfaceC3277a2 = interfaceC3277a;
            AbstractC1991r4.m3160a(interfaceC3277a2, AbstractC3178i.m4873d(-1676212159, new C1387w5(8, interfaceC3277a), c2395p), null, null, AbstractC1011k1.f5187b, AbstractC1011k1.f5188c, null, 0L, 0L, 0L, 0L, 0.0f, null, c2395p, (i9 & 14) | 1769520, 0, 16284);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1292t3(interfaceC3277a2, i7, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a6  */
    /* JADX WARN: Type inference failed for: r0v32, types: [g5.h] */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean] */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1034ko m2265i0(Context context) {
        int i7;
        int i8;
        Object m2985m;
        boolean z7;
        Object m2985m2;
        List list;
        int i9;
        int i10;
        String string;
        List list2;
        C2079c c2079c;
        JSONArray jSONArray;
        int i11;
        Integer m973O;
        Integer m973O2;
        String str = "DUAL_STACK";
        AbstractC3367j.m5100e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("speed_test_profiles", 0);
        AbstractC3367j.m5097b(sharedPreferences);
        m2271l0(sharedPreferences);
        boolean z8 = sharedPreferences.getBoolean("use_system_dns", true);
        String string2 = sharedPreferences.getString("custom_dns_timeout_ms", "2000");
        if (string2 != null && (m973O2 = AbstractC0451r.m973O(string2)) != null) {
            i7 = m973O2.intValue();
        } else {
            i7 = 2000;
        }
        int i12 = i7;
        String string3 = sharedPreferences.getString("custom_dns_retry_count", "3");
        if (string3 != null && (m973O = AbstractC0451r.m973O(string3)) != null) {
            i8 = m973O.intValue();
        } else {
            i8 = 3;
        }
        int i13 = i8;
        try {
            String string4 = sharedPreferences.getString("network_mode", "DUAL_STACK");
            if (string4 != null) {
                str = string4;
            }
            m2985m = EnumC1127no.valueOf(str);
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (m2985m instanceof C1689h) {
            m2985m = EnumC1127no.f6360g;
        }
        EnumC1127no enumC1127no = (EnumC1127no) m2985m;
        if (!z8 && sharedPreferences.getBoolean("custom_dns_enabled", false)) {
            z7 = true;
        } else {
            z7 = false;
        }
        String string5 = sharedPreferences.getString("custom_dns_servers", null);
        if (string5 != null) {
            try {
                JSONArray jSONArray2 = new JSONArray(string5);
                C2079c m5802f = AbstractC3784a.m5802f();
                int length = jSONArray2.length();
                for (int i14 = 0; i14 < length; i14++) {
                    String optString = jSONArray2.optString(i14);
                    AbstractC3367j.m5099d(optString, "optString(...)");
                    String obj = AbstractC0444k.m956t0(optString).toString();
                    if (!AbstractC0444k.m937a0(obj)) {
                        m5802f.add(obj);
                    }
                }
                m2985m2 = AbstractC3784a.m5798b(m5802f);
            } catch (Throwable th2) {
                m2985m2 = AbstractC1793a0.m2985m(th2);
            }
            if (m2985m2 instanceof C1689h) {
                m2985m2 = null;
            }
            list = (List) m2985m2;
        } else {
            list = null;
        }
        List list3 = C1813u.f10860e;
        if (list == null) {
            list = list3;
        }
        String string6 = sharedPreferences.getString("custom_dns_ipv4", "");
        if (string6 == null) {
            string6 = "";
        }
        String string7 = sharedPreferences.getString("custom_dns_ipv6", "");
        if (string7 == null) {
            string7 = "";
        }
        List m3067O = AbstractC1806n.m3067O(string6, string7);
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(m3067O));
        Iterator it = m3067O.iterator();
        while (it.hasNext()) {
            AbstractC0094y0.m191r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj2 = arrayList.get(i15);
            i15++;
            if (!AbstractC0444k.m937a0((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        List m3042f0 = AbstractC1805m.m3042f0(AbstractC1805m.m3058v0(list, arrayList2));
        if (!z8) {
            i9 = 0;
            if (sharedPreferences.getBoolean("custom_dns_ecs_enabled", false)) {
                i10 = 1;
                string = sharedPreferences.getString("custom_dns_ecs_subnets", null);
                if (string != null || AbstractC0444k.m937a0(string)) {
                    list2 = m3042f0;
                } else {
                    try {
                        JSONArray jSONArray3 = new JSONArray(string);
                        C2079c m5802f2 = AbstractC3784a.m5802f();
                        int length2 = jSONArray3.length();
                        while (i9 < length2) {
                            JSONObject optJSONObject = jSONArray3.optJSONObject(i9);
                            if (optJSONObject == null) {
                                list2 = m3042f0;
                                jSONArray = jSONArray3;
                                i11 = i9;
                            } else {
                                list2 = m3042f0;
                                try {
                                    jSONArray = jSONArray3;
                                    String optString2 = optJSONObject.optString("label", "");
                                    AbstractC3367j.m5099d(optString2, "optString(...)");
                                    i11 = i9;
                                    String optString3 = optJSONObject.optString("cidr", "");
                                    AbstractC3367j.m5099d(optString3, "optString(...)");
                                    m5802f2.add(new C0878fo(optString2, optString3));
                                } catch (Throwable th3) {
                                    th = th3;
                                    c2079c = AbstractC1793a0.m2985m(th);
                                    if (!(c2079c instanceof C1689h)) {
                                    }
                                    list3 = list3;
                                    return new C1034ko(z8, z7, list2, i12, i13, i10, list3, enumC1127no);
                                }
                            }
                            i9 = i11 + 1;
                            m3042f0 = list2;
                            jSONArray3 = jSONArray;
                        }
                        list2 = m3042f0;
                        c2079c = AbstractC3784a.m5798b(m5802f2);
                    } catch (Throwable th4) {
                        th = th4;
                        list2 = m3042f0;
                    }
                    if (!(c2079c instanceof C1689h)) {
                        list3 = c2079c;
                    }
                    list3 = list3;
                }
                return new C1034ko(z8, z7, list2, i12, i13, i10, list3, enumC1127no);
            }
        } else {
            i9 = 0;
        }
        i10 = i9;
        string = sharedPreferences.getString("custom_dns_ecs_subnets", null);
        if (string != null) {
        }
        list2 = m3042f0;
        return new C1034ko(z8, z7, list2, i12, i13, i10, list3, enumC1127no);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006b  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2266j(String str, String str2, String str3, InterfaceC3810r interfaceC3810r, C1604o0 c1604o0, C2300k c2300k, C2395p c2395p, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        InterfaceC3810r interfaceC3810r2;
        int i12;
        int i13;
        C1604o0 c1604o02;
        int i14;
        int i15;
        int i16;
        C2300k c2300k2;
        int i17;
        int i18;
        int i19;
        InterfaceC3810r interfaceC3810r3;
        C2300k c2300k3;
        C1604o0 c1604o03;
        int hashCode;
        C3807o c3807o;
        boolean z7;
        C1604o0 c1604o04;
        InterfaceC3810r interfaceC3810r4;
        C2300k c2300k4;
        C2395p c2395p2 = c2395p;
        AbstractC3367j.m5100e(str, "name");
        c2395p2.m3859a0(-1574244109);
        if (c2395p2.m3870g(str)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        int i20 = i7 | i9;
        if (c2395p2.m3870g(str2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i21 = i20 | i10;
        if (c2395p2.m3870g(str3)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i22 = i21 | i11;
        int i23 = i8 & 8;
        if (i23 != 0) {
            i13 = i22 | 3072;
            interfaceC3810r2 = interfaceC3810r;
        } else {
            interfaceC3810r2 = interfaceC3810r;
            if (c2395p2.m3870g(interfaceC3810r2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i13 = i22 | i12;
        }
        if ((i8 & 16) == 0) {
            c1604o02 = c1604o0;
            if (c2395p2.m3870g(c1604o02)) {
                i14 = 16384;
                i15 = i13 | i14;
                i16 = i8 & 32;
                if (i16 == 0) {
                    i15 |= 196608;
                } else if ((i7 & 196608) == 0) {
                    c2300k2 = c2300k;
                    if (c2395p2.m3870g(c2300k2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i15 |= i17;
                    if ((74899 & i15) != 74898 && c2395p2.m3836D()) {
                        c2395p2.m3852U();
                        interfaceC3810r4 = interfaceC3810r2;
                        c1604o04 = c1604o02;
                        c2300k4 = c2300k2;
                    } else {
                        c2395p2.m3854W();
                        i18 = i7 & 1;
                        C3807o c3807o2 = C3807o.f17991a;
                        if (i18 == 0 && !c2395p2.m3834B()) {
                            c2395p2.m3852U();
                            if ((i8 & 16) != 0) {
                                i15 &= -57345;
                            }
                        } else {
                            if (i23 != 0) {
                                interfaceC3810r2 = c3807o2;
                            }
                            if ((i8 & 16) != 0) {
                                i15 &= -57345;
                                c1604o02 = ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11254k;
                            }
                            if (i16 != 0) {
                                i19 = i15;
                                interfaceC3810r3 = interfaceC3810r2;
                                c2300k3 = null;
                                c1604o03 = c1604o02;
                                c2395p2.m3889s();
                                C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17974o, c2395p2, 48);
                                hashCode = Long.hashCode(c2395p2.f13486T);
                                InterfaceC2385m1 m3882m = c2395p2.m3882m();
                                InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, interfaceC3810r3);
                                InterfaceC3510j.f16935d.getClass();
                                C3558z c3558z = C3507i.f16928b;
                                c2395p2.m3863c0();
                                if (!c2395p2.f13485S) {
                                    c2395p2.m3880l(c3558z);
                                } else {
                                    c2395p2.m3883m0();
                                }
                                AbstractC2418w.m3954C(m4854a, c2395p2, C3507i.f16931e);
                                AbstractC2418w.m3954C(m3882m, c2395p2, C3507i.f16930d);
                                C3504h c3504h = C3507i.f16932f;
                                if (!c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode))) {
                                    AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h);
                                }
                                AbstractC2418w.m3954C(m5823c, c2395p2, C3507i.f16929c);
                                if (1.0f <= 0.0d) {
                                    InterfaceC3810r interfaceC3810r5 = interfaceC3810r3;
                                    AbstractC1850a7.m3108b(str, new LayoutWeightElement(1.0f, false), 0L, 0L, c2300k3, null, 0L, null, 0L, 2, false, 1, 0, c1604o03, c2395p, i19 & 458766, ((i19 << 6) & 3670016) | 3120, 55260);
                                    C2300k c2300k5 = c2300k3;
                                    C1604o0 c1604o05 = c1604o03;
                                    c2395p2 = c2395p;
                                    c2395p2.m3857Z(1968873125);
                                    if (str3 == null) {
                                        c3807o = c3807o2;
                                    } else {
                                        AbstractC3122c.m4828a(c2395p2, AbstractC0155c.m357p(c3807o2, 8));
                                        c3807o = c3807o2;
                                        AbstractC1850a7.m3108b(str3, null, ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11258o, c2395p, 0, 3504, 51194);
                                        c2395p2 = c2395p;
                                    }
                                    c2395p2.m3888r(false);
                                    c2395p2.m3857Z(1968885939);
                                    if (str2 == null) {
                                        z7 = false;
                                    } else {
                                        AbstractC3122c.m4828a(c2395p2, AbstractC0155c.m357p(c3807o, 8));
                                        AbstractC1850a7.m3108b(str2, null, ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11258o, c2395p, 0, 3456, 53242);
                                        c2395p2 = c2395p;
                                        z7 = false;
                                    }
                                    c2395p2.m3888r(z7);
                                    c2395p2.m3888r(true);
                                    c1604o04 = c1604o05;
                                    interfaceC3810r4 = interfaceC3810r5;
                                    c2300k4 = c2300k5;
                                } else {
                                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                                }
                            }
                        }
                        i19 = i15;
                        interfaceC3810r3 = interfaceC3810r2;
                        c1604o03 = c1604o02;
                        c2300k3 = c2300k2;
                        c2395p2.m3889s();
                        C3147o0 m4854a2 = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17974o, c2395p2, 48);
                        hashCode = Long.hashCode(c2395p2.f13486T);
                        InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
                        InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, interfaceC3810r3);
                        InterfaceC3510j.f16935d.getClass();
                        C3558z c3558z2 = C3507i.f16928b;
                        c2395p2.m3863c0();
                        if (!c2395p2.f13485S) {
                        }
                        AbstractC2418w.m3954C(m4854a2, c2395p2, C3507i.f16931e);
                        AbstractC2418w.m3954C(m3882m2, c2395p2, C3507i.f16930d);
                        C3504h c3504h2 = C3507i.f16932f;
                        if (!c2395p2.f13485S) {
                        }
                        AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h2);
                        AbstractC2418w.m3954C(m5823c2, c2395p2, C3507i.f16929c);
                        if (1.0f <= 0.0d) {
                        }
                    }
                    C2405r1 m3891u = c2395p2.m3891u();
                    if (m3891u != null) {
                        m3891u.f13542d = new C1424xb(str, str2, str3, interfaceC3810r4, c1604o04, c2300k4, i7, i8);
                        return;
                    }
                    return;
                }
                c2300k2 = c2300k;
                if ((74899 & i15) != 74898) {
                }
                c2395p2.m3854W();
                i18 = i7 & 1;
                C3807o c3807o22 = C3807o.f17991a;
                if (i18 == 0) {
                }
                if (i23 != 0) {
                }
                if ((i8 & 16) != 0) {
                }
                if (i16 != 0) {
                }
                i19 = i15;
                interfaceC3810r3 = interfaceC3810r2;
                c1604o03 = c1604o02;
                c2300k3 = c2300k2;
                c2395p2.m3889s();
                C3147o0 m4854a22 = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17974o, c2395p2, 48);
                hashCode = Long.hashCode(c2395p2.f13486T);
                InterfaceC2385m1 m3882m22 = c2395p2.m3882m();
                InterfaceC3810r m5823c22 = AbstractC3793a.m5823c(c2395p2, interfaceC3810r3);
                InterfaceC3510j.f16935d.getClass();
                C3558z c3558z22 = C3507i.f16928b;
                c2395p2.m3863c0();
                if (!c2395p2.f13485S) {
                }
                AbstractC2418w.m3954C(m4854a22, c2395p2, C3507i.f16931e);
                AbstractC2418w.m3954C(m3882m22, c2395p2, C3507i.f16930d);
                C3504h c3504h22 = C3507i.f16932f;
                if (!c2395p2.f13485S) {
                }
                AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h22);
                AbstractC2418w.m3954C(m5823c22, c2395p2, C3507i.f16929c);
                if (1.0f <= 0.0d) {
                }
            }
        } else {
            c1604o02 = c1604o0;
        }
        i14 = 8192;
        i15 = i13 | i14;
        i16 = i8 & 32;
        if (i16 == 0) {
        }
        c2300k2 = c2300k;
        if ((74899 & i15) != 74898) {
        }
        c2395p2.m3854W();
        i18 = i7 & 1;
        C3807o c3807o222 = C3807o.f17991a;
        if (i18 == 0) {
        }
        if (i23 != 0) {
        }
        if ((i8 & 16) != 0) {
        }
        if (i16 != 0) {
        }
        i19 = i15;
        interfaceC3810r3 = interfaceC3810r2;
        c1604o03 = c1604o02;
        c2300k3 = c2300k2;
        c2395p2.m3889s();
        C3147o0 m4854a222 = AbstractC3145n0.m4854a(AbstractC3136j.f15789a, C3795c.f17974o, c2395p2, 48);
        hashCode = Long.hashCode(c2395p2.f13486T);
        InterfaceC2385m1 m3882m222 = c2395p2.m3882m();
        InterfaceC3810r m5823c222 = AbstractC3793a.m5823c(c2395p2, interfaceC3810r3);
        InterfaceC3510j.f16935d.getClass();
        C3558z c3558z222 = C3507i.f16928b;
        c2395p2.m3863c0();
        if (!c2395p2.f13485S) {
        }
        AbstractC2418w.m3954C(m4854a222, c2395p2, C3507i.f16931e);
        AbstractC2418w.m3954C(m3882m222, c2395p2, C3507i.f16930d);
        C3504h c3504h222 = C3507i.f16932f;
        if (!c2395p2.f13485S) {
        }
        AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h222);
        AbstractC2418w.m3954C(m5823c222, c2395p2, C3507i.f16929c);
        if (1.0f <= 0.0d) {
        }
    }

    /* renamed from: j0 */
    public static final EnumC0876fm m2267j0(EnumC0876fm enumC0876fm, EnumC0876fm enumC0876fm2) {
        EnumC0876fm enumC0876fm3 = EnumC0876fm.f4043g;
        if (enumC0876fm != enumC0876fm3 && enumC0876fm2 != enumC0876fm3 && enumC0876fm != (enumC0876fm3 = EnumC0876fm.f4042f) && enumC0876fm2 != enumC0876fm3) {
            return EnumC0876fm.f4041e;
        }
        return enumC0876fm3;
    }

    /* renamed from: k */
    public static final void m2268k(boolean z7, boolean z8, InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2, C2395p c2395p, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        C3807o c3807o;
        float f7;
        C3504h c3504h;
        float f8;
        C3504h c3504h2;
        C3504h c3504h3;
        C3558z c3558z;
        C3504h c3504h4;
        C2395p c2395p2 = c2395p;
        c2395p2.m3859a0(781740062);
        if (c2395p2.m3872h(z7)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i12 = i7 | i8;
        if (c2395p2.m3872h(z8)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i13 = i12 | i9;
        if (c2395p2.m3874i(interfaceC3277a)) {
            i10 = 256;
        } else {
            i10 = 128;
        }
        int i14 = i13 | i10;
        if ((i14 & 1171) == 1170 && c2395p2.m3836D()) {
            c2395p2.m3852U();
        } else {
            C3807o c3807o2 = C3807o.f17991a;
            float f9 = 12;
            InterfaceC3810r m338i = AbstractC0154b.m338i(AbstractC3793a.m5821a(AbstractC0155c.m346e(c3807o2, 1.0f), new C3167y0(3, 0)), 16, f9);
            C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.m4843g(8), C3795c.f17976q, c2395p2, 6);
            int hashCode = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m = c2395p2.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, m338i);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z2 = C3507i.f16928b;
            c2395p2.m3863c0();
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z2);
            } else {
                c2395p2.m3883m0();
            }
            C3504h c3504h5 = C3507i.f16931e;
            AbstractC2418w.m3954C(m4857a, c2395p2, c3504h5);
            C3504h c3504h6 = C3507i.f16930d;
            AbstractC2418w.m3954C(m3882m, c2395p2, c3504h6);
            C3504h c3504h7 = C3507i.f16932f;
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h7);
            }
            C3504h c3504h8 = C3507i.f16929c;
            AbstractC2418w.m3954C(m5823c, c2395p2, c3504h8);
            c2395p2.m3857Z(1513236765);
            if (!z7) {
                c3558z = c3558z2;
                c3504h4 = c3504h5;
                f8 = f9;
                c3504h2 = c3504h8;
                c3504h3 = c3504h7;
                c3504h = c3504h6;
                f7 = 1.0f;
                i11 = i14;
                c3807o = c3807o2;
                AbstractC1850a7.m3108b("请先滚动至文档底部，并勾选全部确认项", AbstractC0155c.m346e(c3807o2, 1.0f), ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, new C3037k(3), 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11258o, c2395p, 54, 0, 65016);
                c2395p2 = c2395p;
            } else {
                i11 = i14;
                c3807o = c3807o2;
                f7 = 1.0f;
                c3504h = c3504h6;
                f8 = f9;
                c3504h2 = c3504h8;
                c3504h3 = c3504h7;
                c3558z = c3558z2;
                c3504h4 = c3504h5;
            }
            c2395p2.m3888r(false);
            InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, f7);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.m4843g(f8), C3795c.f17973n, c2395p2, 6);
            int hashCode2 = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
            InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, m346e);
            c2395p2.m3863c0();
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z);
            } else {
                c2395p2.m3883m0();
            }
            AbstractC2418w.m3954C(m4854a, c2395p2, c3504h4);
            AbstractC2418w.m3954C(m3882m2, c2395p2, c3504h);
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode2))) {
                AbstractC2487d.m4050n(hashCode2, c2395p2, hashCode2, c3504h3);
            }
            AbstractC2418w.m3954C(m5823c2, c2395p2, c3504h2);
            C3149p0 c3149p0 = C3149p0.f15825a;
            AbstractC1991r4.m3166g(interfaceC3277a2, c3149p0.m4856a(c3807o, f7, true), false, null, null, null, null, AbstractC1104n1.f6140g, c2395p2, 805306374, 508);
            AbstractC1991r4.m3161b(interfaceC3277a, c3149p0.m4856a(c3807o, f7, true), z8, null, null, null, null, null, AbstractC1104n1.f6141h, c2395p, ((i11 >> 6) & 14) | 805306368 | ((i11 << 3) & 896), 504);
            c2395p2 = c2395p;
            c2395p2.m3888r(true);
            c2395p2.m3888r(true);
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1106n3(z7, z8, interfaceC3277a, interfaceC3277a2, i7);
        }
    }

    /* renamed from: k0 */
    public static String m2269k0(String str) {
        AbstractC3367j.m5100e(str, "address");
        String obj = AbstractC0444k.m956t0(str).toString();
        if (obj.length() <= 33) {
            return obj;
        }
        String m955s0 = AbstractC0444k.m955s0(obj, 18);
        int length = obj.length();
        int i7 = 14;
        if (14 > length) {
            i7 = length;
        }
        String substring = obj.substring(length - i7);
        AbstractC3367j.m5099d(substring, "substring(...)");
        return AbstractC2487d.m4044h(m955s0, "…", substring);
    }

    /* renamed from: l */
    public static final void m2270l(final boolean z7, final InterfaceC3279c interfaceC3279c, final boolean z8, final InterfaceC3279c interfaceC3279c2, final boolean z9, final InterfaceC3279c interfaceC3279c3, final boolean z10, final InterfaceC3279c interfaceC3279c4, final boolean z11, final InterfaceC3279c interfaceC3279c5, final InterfaceC3277a interfaceC3277a, final InterfaceC3277a interfaceC3277a2, C2395p c2395p, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        c2395p.m3859a0(-1089178027);
        if (c2395p.m3872h(z7)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i13 = i7 | i8;
        if (c2395p.m3872h(z8)) {
            i9 = 256;
        } else {
            i9 = 128;
        }
        int i14 = i13 | i9;
        if (c2395p.m3872h(z9)) {
            i10 = 16384;
        } else {
            i10 = 8192;
        }
        int i15 = i14 | i10;
        if (c2395p.m3872h(z10)) {
            i11 = 1048576;
        } else {
            i11 = 524288;
        }
        int i16 = i15 | i11;
        if (c2395p.m3872h(z11)) {
            i12 = 67108864;
        } else {
            i12 = 33554432;
        }
        if (((i16 | i12) & 306783379) == 306783378 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            AbstractC1991r4.m3162c(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), null, AbstractC1991r4.m3168i(((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11790H, c2395p), null, AbstractC3178i.m4873d(1577639239, new C1457yd(z7, interfaceC3279c, interfaceC3277a, z8, interfaceC3279c2, interfaceC3277a2, z9, interfaceC3279c3, z10, interfaceC3279c4, z11, interfaceC3279c5), c2395p), c2395p, 196614, 26);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new InterfaceC3281e(z7, interfaceC3279c, z8, interfaceC3279c2, z9, interfaceC3279c3, z10, interfaceC3279c4, z11, interfaceC3279c5, interfaceC3277a, interfaceC3277a2, i7) { // from class: e5.xd

                /* renamed from: e */
                public final /* synthetic */ boolean f8655e;

                /* renamed from: f */
                public final /* synthetic */ InterfaceC3279c f8656f;

                /* renamed from: g */
                public final /* synthetic */ boolean f8657g;

                /* renamed from: h */
                public final /* synthetic */ InterfaceC3279c f8658h;

                /* renamed from: i */
                public final /* synthetic */ boolean f8659i;

                /* renamed from: j */
                public final /* synthetic */ InterfaceC3279c f8660j;

                /* renamed from: k */
                public final /* synthetic */ boolean f8661k;

                /* renamed from: l */
                public final /* synthetic */ InterfaceC3279c f8662l;

                /* renamed from: m */
                public final /* synthetic */ boolean f8663m;

                /* renamed from: n */
                public final /* synthetic */ InterfaceC3279c f8664n;

                /* renamed from: o */
                public final /* synthetic */ InterfaceC3277a f8665o;

                /* renamed from: p */
                public final /* synthetic */ InterfaceC3277a f8666p;

                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1249rm.m2270l(this.f8655e, this.f8656f, this.f8657g, this.f8658h, this.f8659i, this.f8660j, this.f8661k, this.f8662l, this.f8663m, this.f8664n, this.f8665o, this.f8666p, (C2395p) obj, AbstractC2418w.m3957F(818089009));
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* renamed from: l0 */
    public static void m2271l0(SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains("use_system_dns")) {
            return;
        }
        sharedPreferences.edit().putBoolean("use_system_dns", !sharedPreferences.getBoolean("custom_dns_enabled", false)).apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004a  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2272m(final boolean z7, final InterfaceC3279c interfaceC3279c, final String str, String str2, InterfaceC3277a interfaceC3277a, C2395p c2395p, final int i7, final int i8) {
        int i9;
        int i10;
        String str3;
        int i11;
        int i12;
        InterfaceC3277a interfaceC3277a2;
        int i13;
        int i14;
        int i15;
        String str4;
        C3807o c3807o;
        int hashCode;
        C3504h c3504h;
        InterfaceC3277a interfaceC3277a3;
        C3149p0 c3149p0;
        InterfaceC3277a interfaceC3277a4;
        C2395p c2395p2;
        boolean z8;
        final String str5;
        final InterfaceC3277a interfaceC3277a5;
        boolean z9;
        InterfaceC3277a interfaceC3277a6;
        C2405r1 m3891u;
        c2395p.m3859a0(28650642);
        if (c2395p.m3872h(z7)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        int i16 = i9 | i7;
        if (c2395p.m3874i(interfaceC3279c)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i17 = i16 | i10;
        int i18 = i8 & 8;
        if (i18 != 0) {
            i17 |= 3072;
        } else if ((i7 & 3072) == 0) {
            str3 = str2;
            if (c2395p.m3870g(str3)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i17 |= i11;
            i12 = i8 & 16;
            if (i12 == 0) {
                i14 = i17 | 24576;
                interfaceC3277a2 = interfaceC3277a;
            } else {
                interfaceC3277a2 = interfaceC3277a;
                if (c2395p.m3874i(interfaceC3277a2)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i14 = i17 | i13;
            }
            i15 = i14;
            if ((i15 & 9363) != 9362 && c2395p.m3836D()) {
                c2395p.m3852U();
                str5 = str3;
                interfaceC3277a5 = interfaceC3277a2;
            } else {
                if (i18 == 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                if (i12 != 0) {
                    interfaceC3277a2 = null;
                }
                c3807o = C3807o.f17991a;
                float f7 = 2;
                InterfaceC3810r m339j = AbstractC0154b.m339j(AbstractC0155c.m346e(c3807o, 1.0f), 0.0f, f7, 1);
                C3801i c3801i = C3795c.f17974o;
                C3120b c3120b = AbstractC3136j.f15789a;
                C3147o0 m4854a = AbstractC3145n0.m4854a(c3120b, c3801i, c2395p, 48);
                hashCode = Long.hashCode(c2395p.f13486T);
                InterfaceC2385m1 m3882m = c2395p.m3882m();
                InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m339j);
                InterfaceC3510j.f16935d.getClass();
                C3558z c3558z = C3507i.f16928b;
                c2395p.m3863c0();
                if (!c2395p.f13485S) {
                    c2395p.m3880l(c3558z);
                } else {
                    c2395p.m3883m0();
                }
                C3504h c3504h2 = C3507i.f16931e;
                AbstractC2418w.m3954C(m4854a, c2395p, c3504h2);
                C3504h c3504h3 = C3507i.f16930d;
                AbstractC2418w.m3954C(m3882m, c2395p, c3504h3);
                c3504h = C3507i.f16932f;
                if (!c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                    AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
                }
                C3504h c3504h4 = C3507i.f16929c;
                AbstractC2418w.m3954C(m5823c, c2395p, c3504h4);
                interfaceC3277a3 = interfaceC3277a2;
                AbstractC1987r0.m3156a(z7, interfaceC3279c, null, false, null, c2395p, i15 & 126, 60);
                c3149p0 = C3149p0.f15825a;
                if (str4 == null && interfaceC3277a3 != null) {
                    c2395p.m3857Z(-2055300230);
                    InterfaceC3810r m4856a = c3149p0.m4856a(c3807o, 1.0f, true);
                    C3147o0 m4854a2 = AbstractC3145n0.m4854a(c3120b, c3801i, c2395p, 48);
                    int hashCode2 = Long.hashCode(c2395p.f13486T);
                    InterfaceC2385m1 m3882m2 = c2395p.m3882m();
                    InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p, m4856a);
                    c2395p.m3863c0();
                    if (c2395p.f13485S) {
                        c2395p.m3880l(c3558z);
                    } else {
                        c2395p.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4854a2, c2395p, c3504h2);
                    AbstractC2418w.m3954C(m3882m2, c2395p, c3504h3);
                    if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode2))) {
                        AbstractC2487d.m4050n(hashCode2, c2395p, hashCode2, c3504h);
                    }
                    AbstractC2418w.m3954C(m5823c2, c2395p, c3504h4);
                    C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                    AbstractC1850a7.m3108b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11255l, c2395p, 6, 0, 65534);
                    C1604o0 c1604o0 = ((C1904g7) c2395p.m3878k(c2394o2)).f11255l;
                    long j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11807a;
                    C2300k c2300k = C2300k.f13234i;
                    InterfaceC3810r m340k = AbstractC0154b.m340k(c3807o, f7, 0.0f, 0.0f, 0.0f, 14);
                    c2395p.m3857Z(-593554935);
                    if ((i15 & 57344) == 16384) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    Object m3847O = c2395p.m3847O();
                    if (!z9 && m3847O != C2375k.f13421a) {
                        interfaceC3277a6 = interfaceC3277a3;
                    } else {
                        interfaceC3277a6 = interfaceC3277a3;
                        m3847O = new C1271sd(1, interfaceC3277a6);
                        c2395p.m3877j0(m3847O);
                    }
                    c2395p.m3888r(false);
                    interfaceC3277a4 = interfaceC3277a6;
                    AbstractC1850a7.m3108b(str4, AbstractC0145a.m322e(7, null, (InterfaceC3277a) m3847O, m340k, false), j6, 0L, c2300k, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p, ((i15 >> 9) & 14) | 196608, 0, 65496);
                    c2395p2 = c2395p;
                    c2395p2.m3888r(true);
                    c2395p2.m3888r(false);
                    z8 = true;
                } else {
                    interfaceC3277a4 = interfaceC3277a3;
                    c2395p.m3857Z(-2054659274);
                    AbstractC1850a7.m3108b(str, c3149p0.m4856a(c3807o, 1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p, 6, 0, 65532);
                    c2395p2 = c2395p;
                    c2395p2.m3888r(false);
                    z8 = true;
                }
                c2395p2.m3888r(z8);
                str5 = str4;
                interfaceC3277a5 = interfaceC3277a4;
            }
            m3891u = c2395p.m3891u();
            if (m3891u == null) {
                m3891u.f13542d = new InterfaceC3281e() { // from class: e5.vd
                    @Override // p150t5.InterfaceC3281e
                    /* renamed from: d */
                    public final Object mo22d(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC1249rm.m2272m(z7, interfaceC3279c, str, str5, interfaceC3277a5, (C2395p) obj, AbstractC2418w.m3957F(i7 | 1), i8);
                        return C1694m.f10482a;
                    }
                };
                return;
            }
            return;
        }
        str3 = str2;
        i12 = i8 & 16;
        if (i12 == 0) {
        }
        i15 = i14;
        if ((i15 & 9363) != 9362) {
        }
        if (i18 == 0) {
        }
        if (i12 != 0) {
        }
        c3807o = C3807o.f17991a;
        float f72 = 2;
        InterfaceC3810r m339j2 = AbstractC0154b.m339j(AbstractC0155c.m346e(c3807o, 1.0f), 0.0f, f72, 1);
        C3801i c3801i2 = C3795c.f17974o;
        C3120b c3120b2 = AbstractC3136j.f15789a;
        C3147o0 m4854a3 = AbstractC3145n0.m4854a(c3120b2, c3801i2, c2395p, 48);
        hashCode = Long.hashCode(c2395p.f13486T);
        InterfaceC2385m1 m3882m3 = c2395p.m3882m();
        InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p, m339j2);
        InterfaceC3510j.f16935d.getClass();
        C3558z c3558z2 = C3507i.f16928b;
        c2395p.m3863c0();
        if (!c2395p.f13485S) {
        }
        C3504h c3504h22 = C3507i.f16931e;
        AbstractC2418w.m3954C(m4854a3, c2395p, c3504h22);
        C3504h c3504h32 = C3507i.f16930d;
        AbstractC2418w.m3954C(m3882m3, c2395p, c3504h32);
        c3504h = C3507i.f16932f;
        if (!c2395p.f13485S) {
        }
        AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
        C3504h c3504h42 = C3507i.f16929c;
        AbstractC2418w.m3954C(m5823c3, c2395p, c3504h42);
        interfaceC3277a3 = interfaceC3277a2;
        AbstractC1987r0.m3156a(z7, interfaceC3279c, null, false, null, c2395p, i15 & 126, 60);
        c3149p0 = C3149p0.f15825a;
        if (str4 == null) {
        }
        interfaceC3277a4 = interfaceC3277a3;
        c2395p.m3857Z(-2054659274);
        AbstractC1850a7.m3108b(str, c3149p0.m4856a(c3807o, 1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p, 6, 0, 65532);
        c2395p2 = c2395p;
        c2395p2.m3888r(false);
        z8 = true;
        c2395p2.m3888r(z8);
        str5 = str4;
        interfaceC3277a5 = interfaceC3277a4;
        m3891u = c2395p.m3891u();
        if (m3891u == null) {
        }
    }

    /* renamed from: m0 */
    public static void m2273m0(Context context) {
        AbstractC3367j.m5100e(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("speed_test_profiles", 0);
        AbstractC3367j.m5097b(sharedPreferences);
        m2271l0(sharedPreferences);
        if (sharedPreferences.getBoolean("use_system_dns", true)) {
            sharedPreferences.edit().putBoolean("custom_dns_enabled", false).putBoolean("custom_dns_ecs_enabled", false).apply();
        } else if (!sharedPreferences.getBoolean("custom_dns_enabled", false)) {
            sharedPreferences.edit().putBoolean("custom_dns_enabled", true).apply();
        }
    }

    /* renamed from: n */
    public static final void m2274n(InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2, C2395p c2395p, int i7) {
        int i8;
        int i9;
        boolean z7;
        InterfaceC2425y0 interfaceC2425y0;
        boolean z8;
        C3330r c3330r;
        boolean z9;
        InterfaceC2390n2 interfaceC2390n2;
        InterfaceC3277a interfaceC3277a3 = interfaceC3277a;
        C2395p c2395p2 = c2395p;
        AbstractC3367j.m5100e(interfaceC3277a3, "onAccepted");
        AbstractC3367j.m5100e(interfaceC3277a2, "onDeclined");
        c2395p2.m3859a0(-747342680);
        if (c2395p2.m3874i(interfaceC3277a3)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i10 = i7 | i8;
        if (c2395p2.m3874i(interfaceC3277a2)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        if (((i10 | i9) & 19) == 18 && c2395p2.m3836D()) {
            c2395p2.m3852U();
        } else {
            c2395p2.m3857Z(-1175360604);
            Object m3847O = c2395p2.m3847O();
            Object obj = C2375k.f13421a;
            if (m3847O == obj) {
                m3847O = AbstractC2418w.m3980x(EnumC0964ie.f4826f);
                c2395p2.m3877j0(m3847O);
            }
            InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) m3847O;
            Object m181h = AbstractC0094y0.m181h(-1175357877, c2395p2, false);
            if (m181h == obj) {
                m181h = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p2.m3877j0(m181h);
            }
            InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) m181h;
            Object m181h2 = AbstractC0094y0.m181h(-1175355989, c2395p2, false);
            if (m181h2 == obj) {
                m181h2 = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p2.m3877j0(m181h2);
            }
            InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) m181h2;
            Object m181h3 = AbstractC0094y0.m181h(-1175354165, c2395p2, false);
            if (m181h3 == obj) {
                m181h3 = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p2.m3877j0(m181h3);
            }
            InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) m181h3;
            Object m181h4 = AbstractC0094y0.m181h(-1175351893, c2395p2, false);
            if (m181h4 == obj) {
                m181h4 = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p2.m3877j0(m181h4);
            }
            InterfaceC2425y0 interfaceC2425y06 = (InterfaceC2425y0) m181h4;
            Object m181h5 = AbstractC0094y0.m181h(-1175349685, c2395p2, false);
            if (m181h5 == obj) {
                m181h5 = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p2.m3877j0(m181h5);
            }
            InterfaceC2425y0 interfaceC2425y07 = (InterfaceC2425y0) m181h5;
            Object m181h6 = AbstractC0094y0.m181h(-1175347637, c2395p2, false);
            if (m181h6 == obj) {
                m181h6 = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p2.m3877j0(m181h6);
            }
            InterfaceC2425y0 interfaceC2425y08 = (InterfaceC2425y0) m181h6;
            c2395p2.m3888r(false);
            C3330r m5070a = AbstractC3333u.m5070a(c2395p2);
            c2395p2.m3857Z(-1175343933);
            Object m3847O2 = c2395p2.m3847O();
            if (m3847O2 == obj) {
                m3847O2 = AbstractC2418w.m3974q(new C0226c0(6, m5070a));
                c2395p2.m3877j0(m3847O2);
            }
            InterfaceC2390n2 interfaceC2390n22 = (InterfaceC2390n2) m3847O2;
            c2395p2.m3888r(false);
            if (((Boolean) interfaceC2425y03.getValue()).booleanValue() && ((Boolean) interfaceC2425y04.getValue()).booleanValue() && ((Boolean) interfaceC2425y05.getValue()).booleanValue() && ((Boolean) interfaceC2425y06.getValue()).booleanValue() && ((Boolean) interfaceC2425y07.getValue()).booleanValue() && ((Boolean) interfaceC2390n22.getValue()).booleanValue()) {
                z7 = true;
            } else {
                z7 = false;
            }
            EnumC0964ie enumC0964ie = (EnumC0964ie) interfaceC2425y02.getValue();
            c2395p2.m3857Z(-1175330222);
            boolean m3870g = c2395p2.m3870g(m5070a);
            Object m3847O3 = c2395p2.m3847O();
            if (m3870g || m3847O3 == obj) {
                m3847O3 = new C1488zd(m5070a, (InterfaceC2313c) null, 0);
                c2395p2.m3877j0(m3847O3);
            }
            c2395p2.m3888r(false);
            AbstractC2418w.m3965g(enumC0964ie, c2395p2, (InterfaceC3281e) m3847O3);
            c2395p2.m3857Z(-1175328335);
            Object m3847O4 = c2395p2.m3847O();
            if (m3847O4 == obj) {
                m3847O4 = new C0705aa(interfaceC2425y08, 23);
                c2395p2.m3877j0(m3847O4);
            }
            c2395p2.m3888r(false);
            AbstractC0000a.m0a(false, (InterfaceC3277a) m3847O4, c2395p2, 48, 1);
            c2395p2.m3857Z(-1175326143);
            if (((Boolean) interfaceC2425y08.getValue()).booleanValue()) {
                c2395p2.m3857Z(-1175324410);
                Object m3847O5 = c2395p2.m3847O();
                if (m3847O5 == obj) {
                    m3847O5 = new C0705aa(interfaceC2425y08, 24);
                    c2395p2.m3877j0(m3847O5);
                }
                c2395p2.m3888r(false);
                c3330r = m5070a;
                interfaceC2425y0 = interfaceC2425y08;
                z9 = z7;
                interfaceC2390n2 = interfaceC2390n22;
                z8 = false;
                AbstractC1991r4.m3160a((InterfaceC3277a) m3847O5, AbstractC3178i.m4873d(-1387228811, new C0741be(interfaceC3277a2, interfaceC2425y08, 0), c2395p2), null, AbstractC3178i.m4873d(1625566199, new C1200q4(interfaceC2425y08, 15), c2395p2), AbstractC1104n1.f6136c, AbstractC1104n1.f6137d, null, 0L, 0L, 0L, 0L, 0.0f, null, c2395p, 1772598, 0, 16276);
                c2395p2 = c2395p;
            } else {
                interfaceC2425y0 = interfaceC2425y08;
                z8 = false;
                c3330r = m5070a;
                z9 = z7;
                interfaceC2390n2 = interfaceC2390n22;
            }
            c2395p2.m3888r(z8);
            InterfaceC2390n2 interfaceC2390n23 = interfaceC2390n2;
            interfaceC3277a3 = interfaceC3277a;
            AbstractC2047y4.m3208a(AbstractC0155c.f660c, AbstractC1104n1.f6139f, AbstractC3178i.m4873d(-620961405, new C0701a6(z9, interfaceC3277a, interfaceC2390n23, interfaceC2425y0), c2395p2), null, null, 0, 0L, 0L, null, AbstractC3178i.m4873d(-698935303, new C0960ia(c3330r, interfaceC2425y02, interfaceC2390n23, interfaceC2425y03, interfaceC2425y04, interfaceC2425y05, interfaceC2425y06, interfaceC2425y07), c2395p2), c2395p2, 805306806, 504);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1019k9(interfaceC3277a3, interfaceC3277a2, i7);
        }
    }

    /* renamed from: n0 */
    public static String m2275n0(String str) {
        if (str != null && !AbstractC0444k.m937a0(str)) {
            String obj = AbstractC0444k.m956t0(str).toString();
            AbstractC3367j.m5100e(obj, "<this>");
            String m945i0 = AbstractC0444k.m945i0(obj, "\"", "\"");
            if (!AbstractC0444k.m937a0(m945i0) && !m945i0.equalsIgnoreCase("<unknown ssid>") && !m945i0.equalsIgnoreCase("<unknown ssid>") && !AbstractC0451r.m971M(m945i0, "0x", true)) {
                return m945i0;
            }
            return null;
        }
        return null;
    }

    /* renamed from: o */
    public static final void m2276o(InterfaceC2425y0 interfaceC2425y0, boolean z7) {
        interfaceC2425y0.setValue(Boolean.valueOf(z7));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0843el m2277o0(byte[] bArr, C0875fl c0875fl) {
        int i7;
        int i8;
        InetSocketAddress m2183d;
        byte[] bArr2 = c0875fl.f4039b;
        boolean z7 = c0875fl.f4040c;
        int i9 = 20;
        if (bArr.length >= 20) {
            SecureRandom secureRandom = C1031kl.f5303g;
            int i10 = 0;
            if (C1247rk.m2195u(0, bArr) == 257) {
                int m2195u = C1247rk.m2195u(2, bArr);
                if (z7) {
                    i7 = 8;
                } else {
                    i7 = 4;
                }
                if (z7) {
                    i8 = 12;
                } else {
                    i8 = 16;
                }
                byte[] m3021N = AbstractC1804l.m3021N(bArr, i7, i8 + i7);
                if (z7) {
                    i10 = 4;
                }
                if (Arrays.equals(m3021N, AbstractC1804l.m3021N(bArr2, i10, 16))) {
                    int min = Math.min(bArr.length, m2195u + 20);
                    InetSocketAddress inetSocketAddress = null;
                    InetSocketAddress inetSocketAddress2 = null;
                    InetSocketAddress inetSocketAddress3 = null;
                    InetSocketAddress inetSocketAddress4 = null;
                    while (true) {
                        int i11 = i9 + 4;
                        if (i11 > min) {
                            break;
                        }
                        SecureRandom secureRandom2 = C1031kl.f5303g;
                        int m2195u2 = C1247rk.m2195u(i9, bArr);
                        int m2195u3 = C1247rk.m2195u(i9 + 2, bArr);
                        int i12 = i11 + m2195u3;
                        if (i12 > min) {
                            break;
                        }
                        if (m2195u2 != 1 && m2195u2 != 5) {
                            if (m2195u2 != 32) {
                                if (m2195u2 != 32812) {
                                    m2183d = null;
                                }
                            } else {
                                m2183d = C1247rk.m2183d(bArr, i11, m2195u3, bArr2);
                            }
                            if (m2195u2 == 1) {
                                if (m2195u2 != 5) {
                                    if (m2195u2 != 32) {
                                        if (m2195u2 == 32812) {
                                            inetSocketAddress4 = m2183d;
                                        }
                                    } else {
                                        inetSocketAddress2 = m2183d;
                                    }
                                } else {
                                    inetSocketAddress3 = m2183d;
                                }
                            } else {
                                inetSocketAddress = m2183d;
                            }
                            i9 = ((4 - (m2195u3 % 4)) % 4) + i12;
                        }
                        m2183d = C1247rk.m2183d(bArr, i11, m2195u3, null);
                        if (m2195u2 == 1) {
                        }
                        i9 = ((4 - (m2195u3 % 4)) % 4) + i12;
                    }
                    return new C0843el(inetSocketAddress, inetSocketAddress2, inetSocketAddress3, inetSocketAddress4);
                }
            }
        }
        return null;
    }

    /* renamed from: p */
    public static final void m2278p(EnumC0964ie enumC0964ie, C2395p c2395p, int i7) {
        int i8;
        C2395p c2395p2;
        c2395p.m3859a0(-1949404441);
        if (c2395p.m3870g(enumC0964ie)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        if (((i8 | i7) & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
            c2395p2 = c2395p;
        } else {
            c2395p2 = c2395p;
            AbstractC1991r4.m3162c(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), null, AbstractC1991r4.m3168i(C0677s.m1453b(0.45f, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11809c), c2395p), null, AbstractC3178i.m4873d(-366417611, new C1233r6(3, enumC0964ie), c2395p), c2395p2, 196614, 26);
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0453t(i7, 5, enumC0964ie);
        }
    }

    /* renamed from: p0 */
    public static ArrayList m2279p0(String str) {
        List<String> m941e0 = AbstractC0444k.m941e0(str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : m941e0) {
            AbstractC3367j.m5100e(str2, "value");
            String obj = AbstractC0444k.m956t0(str2).toString();
            C0716al c0716al = null;
            if (!AbstractC0444k.m937a0(obj)) {
                String obj2 = AbstractC0444k.m956t0(AbstractC0444k.m953q0(obj, '\t')).toString();
                C0716al c0716al2 = new C0716al(obj2);
                if (!AbstractC0444k.m937a0(obj2)) {
                    c0716al = c0716al2;
                }
            }
            if (c0716al != null) {
                arrayList.add(c0716al);
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public static final void m2280q(int i7, InterfaceC3277a interfaceC3277a, C2395p c2395p, int i8) {
        int i9;
        boolean z7;
        Object obj;
        AbstractC3367j.m5100e(interfaceC3277a, "onDismiss");
        c2395p.m3859a0(1576043524);
        if (c2395p.m3866e(i7)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        int i10 = i9 | i8;
        if ((i10 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            c2395p.m3857Z(-208054962);
            if ((i10 & 14) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            Object m3847O = c2395p.m3847O();
            if (z7 || m3847O == C2375k.f13421a) {
                if (i7 >= 0) {
                    C2719b c2719b = EnumC0964ie.f4829i;
                    if (i7 < c2719b.mo299a()) {
                        obj = c2719b.get(i7);
                        m3847O = AbstractC2418w.m3980x(obj);
                        c2395p.m3877j0(m3847O);
                    }
                }
                obj = EnumC0964ie.f4826f;
                m3847O = AbstractC2418w.m3980x(obj);
                c2395p.m3877j0(m3847O);
            }
            c2395p.m3888r(false);
            AbstractC2064e.m3231a(interfaceC3277a, new C3767q(3), AbstractC3178i.m4873d(-736759717, new C0741be((InterfaceC2425y0) m3847O, interfaceC3277a), c2395p), c2395p, 438);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1395wd(i7, interfaceC3277a, i8, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [u5.t, java.lang.Object] */
    /* renamed from: q0 */
    public static C1154ok m2281q0(byte[] bArr, int i7, String str) {
        int length = bArr.length;
        C1813u c1813u = C1813u.f10860e;
        if (length < 12) {
            ConcurrentHashMap.KeySetView keySetView = AbstractC1265s7.f7527a;
            AbstractC1265s7.m2310g("PARSE ecs=" + str + " packet too short size=" + bArr.length);
            return new C1154ok(c1813u, c1813u);
        }
        int m2295x0 = m2295x0(2, bArr) & 15;
        if (m2295x0 != 0) {
            AbstractC1265s7.m2310g("PARSE ecs=" + str + " RCODE=" + m2295x0 + " " + AbstractC1265s7.m2305b(i7, bArr));
            return new C1154ok(c1813u, c1813u);
        }
        int m2295x02 = m2295x0(4, bArr);
        int m2295x03 = m2295x0(6, bArr);
        int m2295x04 = m2295x0(8, bArr);
        int m2295x05 = m2295x0(10, bArr);
        ?? obj = new Object();
        obj.f16449e = 12;
        int i8 = 0;
        for (int i9 = 0; i9 < m2295x02; i9++) {
            obj.f16449e = ((Number) m2293w0(obj.f16449e, bArr).f10472f).intValue() + 4;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m2283r0(obj, bArr, i7, arrayList, arrayList2, m2295x03, true);
        m2283r0(obj, bArr, i7, arrayList, arrayList2, m2295x04, false);
        m2283r0(obj, bArr, i7, arrayList, arrayList2, m2295x05, true);
        String m2304a = AbstractC1265s7.m2304a(arrayList);
        StringBuilder sb = new StringBuilder("PARSE sections ecs=");
        sb.append(str);
        sb.append(" an=");
        sb.append(m2295x03);
        sb.append(" ns=");
        AbstractC0094y0.m192s(sb, m2295x04, " ar=", m2295x05, " addrs=");
        sb.append(m2304a);
        sb.append(" cnames=");
        sb.append(arrayList2);
        AbstractC1265s7.m2308e(sb.toString());
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        while (i8 < size) {
            Object obj2 = arrayList.get(i8);
            i8++;
            String hostAddress = ((InetAddress) obj2).getHostAddress();
            if (hostAddress == null) {
                hostAddress = "";
            }
            if (hashSet.add(hostAddress)) {
                arrayList3.add(obj2);
            }
        }
        return new C1154ok(arrayList3, AbstractC1805m.m3042f0(arrayList2));
    }

    /* renamed from: r */
    public static final void m2282r(C1024ke c1024ke, C2395p c2395p, int i7) {
        int i8;
        C2395p c2395p2;
        c2395p.m3859a0(366888987);
        if (c2395p.m3870g(c1024ke)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        if (((i8 | i7) & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
            c2395p2 = c2395p;
        } else {
            c2395p2 = c2395p;
            AbstractC1991r4.m3162c(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), null, AbstractC1991r4.m3168i(((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11789G, c2395p), null, AbstractC3178i.m4873d(-468832883, new C1233r6(4, c1024ke), c2395p), c2395p2, 196614, 26);
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0453t(i7, 6, c1024ke);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.lang.Iterable] */
    /* renamed from: r0 */
    public static final void m2283r0(C3377t c3377t, byte[] bArr, int i7, ArrayList arrayList, ArrayList arrayList2, int i8, boolean z7) {
        C1185pk c1185pk;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = c3377t.f16449e;
            if (i10 < bArr.length) {
                int intValue = ((Number) m2293w0(i10, bArr).f10472f).intValue();
                int i11 = intValue + 10;
                int length = bArr.length;
                C1813u c1813u = C1813u.f10860e;
                if (i11 > length) {
                    c1185pk = new C1185pk(c1813u, c1813u, bArr.length);
                } else {
                    int m2295x0 = m2295x0(intValue, bArr);
                    int m2295x02 = m2295x0(intValue + 8, bArr);
                    int i12 = i11 + m2295x02;
                    if (i12 > bArr.length) {
                        c1185pk = new C1185pk(c1813u, c1813u, bArr.length);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        if (m2295x0 != 1) {
                            if (m2295x0 != 5) {
                                if (m2295x0 == 28 && z7 && i7 == 28 && m2295x02 == 16) {
                                    try {
                                        arrayList3.add(InetAddress.getByAddress(AbstractC1804l.m3021N(bArr, i11, intValue + 26)));
                                    } catch (Throwable th) {
                                        AbstractC1793a0.m2985m(th);
                                    }
                                }
                            } else if (m2295x02 > 0) {
                                String str = (String) m2293w0(i11, bArr).f10471e;
                                if (!AbstractC0444k.m937a0(str)) {
                                    arrayList4.add(str);
                                }
                            }
                        } else if (z7 && i7 == 1 && m2295x02 == 4) {
                            try {
                                arrayList3.add(InetAddress.getByAddress(AbstractC1804l.m3021N(bArr, i11, intValue + 14)));
                            } catch (Throwable th2) {
                                AbstractC1793a0.m2985m(th2);
                            }
                        }
                        c1185pk = new C1185pk(arrayList3, arrayList4, i12);
                    }
                }
                c3377t.f16449e = c1185pk.f6900c;
                AbstractC1811s.m3076X(c1185pk.f6898a, arrayList);
                AbstractC1811s.m3076X(c1185pk.f6899b, arrayList2);
            }
        }
    }

    /* renamed from: s */
    public static final void m2284s(String str, String str2, C2395p c2395p, int i7) {
        int i8;
        String str3 = str2;
        C2395p c2395p2 = c2395p;
        c2395p2.m3859a0(671089371);
        if (c2395p2.m3870g(str3)) {
            i8 = 32;
        } else {
            i8 = 16;
        }
        int i9 = i7 | i8;
        if ((i9 & 19) == 18 && c2395p2.m3836D()) {
            c2395p2.m3852U();
        } else {
            C3807o c3807o = C3807o.f17991a;
            float f7 = 1.0f;
            InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, 1.0f);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15794f, C3795c.f17974o, c2395p2, 54);
            int hashCode = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m = c2395p2.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, m346e);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p2.m3863c0();
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z);
            } else {
                c2395p2.m3883m0();
            }
            AbstractC2418w.m3954C(m4854a, c2395p2, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p2, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p2, C3507i.f16929c);
            C2394o2 c2394o2 = AbstractC1913h7.f11292a;
            C1604o0 c1604o0 = ((C1904g7) c2395p2.m3878k(c2394o2)).f11255l;
            long j6 = ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11825s;
            if (1.0f > 0.0d) {
                if (1.0f > Float.MAX_VALUE) {
                    f7 = Float.MAX_VALUE;
                }
                AbstractC1850a7.m3108b(str, new LayoutWeightElement(f7, true), j6, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p2, 6, 0, 65528);
                str3 = str2;
                AbstractC1850a7.m3108b(str3, AbstractC0155c.m358q(c3807o, 96, 0.0f, 2), 0L, 0L, C2300k.f13234i, null, 0L, new C3037k(6), 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(c2394o2)).f11255l, c2395p, ((i9 >> 3) & 14) | 196656, 0, 64988);
                c2395p2 = c2395p;
                c2395p2.m3888r(true);
            } else {
                throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1075m3(i7, 2, str, str3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0282, code lost:
    
        if (p024c6.AbstractC0444k.m938b0(r5) == '\'') goto L128;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01b5  */
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1006jr m2285s0(String str) {
        C1006jr c1006jr;
        C1006jr c1006jr2;
        String str2;
        int m934X;
        String obj;
        String obj2;
        Object obj3;
        AbstractC3367j.m5100e(str, "input");
        String obj4 = AbstractC0444k.m956t0(str).toString();
        if (AbstractC0444k.m937a0(obj4)) {
            return null;
        }
        if (!AbstractC0451r.m971M(AbstractC0444k.m960x0(obj4).toString(), "curl", true)) {
            c1006jr = null;
            c1006jr2 = null;
        } else {
            String m969K = AbstractC0451r.m969K(AbstractC0451r.m969K(AbstractC0451r.m969K(AbstractC0451r.m969K(AbstractC0451r.m969K(obj4, "^\r\n", " "), "^\n", " "), "\\\r\n", " "), "\\\n", " "), "^\"", "\"");
            Pattern compile = Pattern.compile("\\^([&|<>()])");
            AbstractC3367j.m5099d(compile, "compile(...)");
            String replaceAll = compile.matcher(m969K).replaceAll("$1");
            AbstractC3367j.m5099d(replaceAll, "replaceAll(...)");
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            boolean z7 = false;
            c1006jr = null;
            Character ch = null;
            for (int i7 = 0; i7 < replaceAll.length(); i7++) {
                char charAt = replaceAll.charAt(i7);
                if (z7) {
                    sb.append(charAt);
                    z7 = false;
                } else if (charAt == '\\' && (ch == null || ch.charValue() != '\'')) {
                    z7 = true;
                } else if (ch != null) {
                    if (charAt == ch.charValue()) {
                        ch = null;
                    } else {
                        sb.append(charAt);
                    }
                } else if (charAt != '\'' && charAt != '\"') {
                    if (AbstractC2710c.m4323F(charAt)) {
                        if (sb.length() > 0) {
                            String sb2 = sb.toString();
                            AbstractC3367j.m5099d(sb2, "toString(...)");
                            arrayList.add(sb2);
                            sb.setLength(0);
                        }
                    } else {
                        sb.append(charAt);
                    }
                } else {
                    ch = Character.valueOf(charAt);
                }
            }
            if (sb.length() > 0) {
                String sb3 = sb.toString();
                AbstractC3367j.m5099d(sb3, "toString(...)");
                arrayList.add(sb3);
            }
            if (!arrayList.isEmpty() && AbstractC0451r.m966H((String) AbstractC1805m.m3045i0(arrayList), "curl")) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str3 = "";
                String str4 = str3;
                int i8 = 1;
                while (i8 < arrayList.size()) {
                    String str5 = (String) arrayList.get(i8);
                    int hashCode = str5.hashCode();
                    if (hashCode != -1813292817) {
                        if (hashCode != 1467) {
                            if (hashCode != 1483) {
                                if (hashCode == 1178742829 && str5.equals("--header")) {
                                    str2 = (String) AbstractC1805m.m3048l0(i8 + 1, arrayList);
                                    if (str2 != null && (m934X = AbstractC0444k.m934X(str2, ':', 0, 6)) > 0) {
                                        String substring = str2.substring(0, m934X);
                                        AbstractC3367j.m5099d(substring, "substring(...)");
                                        obj = AbstractC0444k.m956t0(substring).toString();
                                        String substring2 = str2.substring(m934X + 1);
                                        AbstractC3367j.m5099d(substring2, "substring(...)");
                                        obj2 = AbstractC0444k.m956t0(substring2).toString();
                                        if (!AbstractC0444k.m937a0(obj) && !AbstractC0444k.m937a0(obj2)) {
                                            linkedHashMap.put(obj, obj2);
                                        }
                                    }
                                    i8 += 2;
                                }
                            } else if (str5.equals("-X")) {
                                str4 = (String) AbstractC1805m.m3048l0(i8 + 1, arrayList);
                                if (str4 == null) {
                                    str4 = "";
                                }
                                i8 += 2;
                            }
                            if (!AbstractC0451r.m971M(str5, "-", false) && m2263h0(str5)) {
                                str3 = str5;
                            }
                            i8++;
                        } else if (str5.equals("-H")) {
                            str2 = (String) AbstractC1805m.m3048l0(i8 + 1, arrayList);
                            if (str2 != null) {
                                String substring3 = str2.substring(0, m934X);
                                AbstractC3367j.m5099d(substring3, "substring(...)");
                                obj = AbstractC0444k.m956t0(substring3).toString();
                                String substring22 = str2.substring(m934X + 1);
                                AbstractC3367j.m5099d(substring22, "substring(...)");
                                obj2 = AbstractC0444k.m956t0(substring22).toString();
                                if (!AbstractC0444k.m937a0(obj)) {
                                    linkedHashMap.put(obj, obj2);
                                }
                            }
                            i8 += 2;
                        } else {
                            if (!AbstractC0451r.m971M(str5, "-", false)) {
                                str3 = str5;
                            }
                            i8++;
                        }
                    } else if (!str5.equals("--request")) {
                        if (!AbstractC0451r.m971M(str5, "-", false)) {
                        }
                        i8++;
                    } else {
                        str4 = (String) AbstractC1805m.m3048l0(i8 + 1, arrayList);
                        if (str4 == null) {
                        }
                        i8 += 2;
                    }
                }
                if (m2263h0(str3)) {
                    c1006jr2 = new C1006jr(str3, str4, linkedHashMap);
                }
            }
            c1006jr2 = null;
        }
        if (c1006jr2 != null) {
            return c1006jr2;
        }
        List m941e0 = AbstractC0444k.m941e0(obj4);
        ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(m941e0));
        Iterator it = m941e0.iterator();
        while (it.hasNext()) {
            AbstractC0094y0.m191r((String) it.next(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj5 = arrayList2.get(i9);
            i9++;
            if (!AbstractC0444k.m937a0((String) obj5)) {
                arrayList3.add(obj5);
            }
        }
        int size2 = arrayList3.size();
        int i10 = 0;
        while (true) {
            if (i10 < size2) {
                obj3 = arrayList3.get(i10);
                i10++;
                if (m2263h0((String) obj3)) {
                    break;
                }
            } else {
                obj3 = c1006jr;
                break;
            }
        }
        String str6 = (String) obj3;
        if (str6 == null) {
            return c1006jr;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str7 = "";
        for (String str8 : AbstractC1805m.m3043g0(arrayList3, 1)) {
            String obj6 = AbstractC0444k.m956t0(AbstractC0444k.m956t0(AbstractC0444k.m943g0(str8, "-H ")).toString()).toString();
            if (obj6.length() >= 2) {
                if (obj6.length() != 0) {
                    if (obj6.charAt(0) != '\"' || AbstractC0444k.m938b0(obj6) != '\"') {
                        if (obj6.length() != 0) {
                            if (obj6.charAt(0) == '\'') {
                            }
                        } else {
                            throw new NoSuchElementException("Char sequence is empty.");
                        }
                    }
                    obj6 = obj6.substring(1, AbstractC0444k.m932V(obj6));
                    AbstractC3367j.m5099d(obj6, "substring(...)");
                } else {
                    throw new NoSuchElementException("Char sequence is empty.");
                }
            }
            int m934X2 = AbstractC0444k.m934X(obj6, ':', 0, 6);
            if (m934X2 > 0) {
                String substring4 = obj6.substring(0, m934X2);
                AbstractC3367j.m5099d(substring4, "substring(...)");
                String obj7 = AbstractC0444k.m956t0(substring4).toString();
                String substring5 = obj6.substring(m934X2 + 1);
                AbstractC3367j.m5099d(substring5, "substring(...)");
                String obj8 = AbstractC0444k.m956t0(substring5).toString();
                if (!AbstractC0444k.m937a0(obj7) && !AbstractC0444k.m937a0(obj8)) {
                    linkedHashMap2.put(obj7, obj8);
                }
            } else if (AbstractC0451r.m971M(str8, "method", true)) {
                str7 = AbstractC0444k.m956t0(AbstractC0444k.m950n0(str8, ':', "")).toString();
            }
        }
        return new C1006jr(str6, str7, linkedHashMap2);
    }

    /* renamed from: t */
    public static final void m2286t(List list, final int i7, final InterfaceC3279c interfaceC3279c, C2395p c2395p, int i8) {
        int i9;
        int i10;
        int i11;
        boolean z7;
        boolean z8;
        C3504h c3504h;
        boolean z9;
        boolean z10;
        boolean z11;
        final int i12;
        final InterfaceC3279c interfaceC3279c2;
        boolean z12;
        final List list2 = list;
        C2395p c2395p2 = c2395p;
        c2395p2.m3859a0(540207868);
        if (c2395p2.m3874i(list2)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        int i13 = i8 | i9;
        if (c2395p2.m3866e(i7)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c2395p2.m3874i(interfaceC3279c)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if ((i15 & 147) == 146 && c2395p2.m3836D()) {
            c2395p2.m3852U();
            i12 = i7;
            interfaceC3279c2 = interfaceC3279c;
        } else {
            C0718an c0718an = (C0718an) list.get(i7);
            InterfaceC3810r m346e = AbstractC0155c.m346e(C3807o.f17991a, 1.0f);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15794f, C3795c.f17974o, c2395p2, 54);
            int hashCode = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m = c2395p2.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, m346e);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p2.m3863c0();
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z);
            } else {
                c2395p2.m3883m0();
            }
            C3504h c3504h2 = C3507i.f16931e;
            AbstractC2418w.m3954C(m4854a, c2395p2, c3504h2);
            C3504h c3504h3 = C3507i.f16930d;
            AbstractC2418w.m3954C(m3882m, c2395p2, c3504h3);
            C3504h c3504h4 = C3507i.f16932f;
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h4);
            }
            C3504h c3504h5 = C3507i.f16929c;
            AbstractC2418w.m3954C(m5823c, c2395p2, c3504h5);
            c2395p2.m3857Z(1868867819);
            int i16 = i15 & 112;
            if (i16 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean m3874i = z7 | c2395p2.m3874i(list2);
            int i17 = i15 & 896;
            if (i17 == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z13 = m3874i | z8;
            Object m3847O = c2395p2.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (z13 || m3847O == c2413u0) {
                final int i18 = 0;
                m3847O = new InterfaceC3277a() { // from class: e5.kn
                    @Override // p150t5.InterfaceC3277a
                    /* renamed from: a */
                    public final Object mo52a() {
                        switch (i18) {
                            case 0:
                                int i19 = i7 - 1;
                                List list3 = list2;
                                interfaceC3279c.mo23f(Integer.valueOf((list3.size() + i19) % list3.size()));
                                break;
                            default:
                                interfaceC3279c.mo23f(Integer.valueOf((i7 + 1) % list2.size()));
                                break;
                        }
                        return C1694m.f10482a;
                    }
                };
                c2395p2.m3877j0(m3847O);
            }
            InterfaceC3277a interfaceC3277a = (InterfaceC3277a) m3847O;
            c2395p2.m3888r(false);
            if (list2.size() > 1) {
                c3504h = c3504h3;
                z9 = true;
            } else {
                c3504h = c3504h3;
                z9 = false;
            }
            C3504h c3504h6 = c3504h;
            AbstractC1991r4.m3165f(interfaceC3277a, null, z9, null, AbstractC1259s1.f7456a, c2395p2, 196608, 26);
            if (1.0f > 0.0d) {
                float f7 = Float.MAX_VALUE;
                if (1.0f <= Float.MAX_VALUE) {
                    f7 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f7, true);
                C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.m4843g(2), C3795c.f17977r, c2395p2, 54);
                int hashCode2 = Long.hashCode(c2395p2.f13486T);
                InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
                InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, layoutWeightElement);
                c2395p2.m3863c0();
                if (c2395p2.f13485S) {
                    c2395p2.m3880l(c3558z);
                } else {
                    c2395p2.m3883m0();
                }
                AbstractC2418w.m3954C(m4857a, c2395p2, c3504h2);
                AbstractC2418w.m3954C(m3882m2, c2395p2, c3504h6);
                if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode2))) {
                    AbstractC2487d.m4050n(hashCode2, c2395p2, hashCode2, c3504h4);
                }
                AbstractC2418w.m3954C(m5823c2, c2395p2, c3504h5);
                int i19 = i7 + 1;
                int size = list2.size();
                String str = c0718an.f2449b;
                if (AbstractC0444k.m937a0(str)) {
                    str = c0718an.f2450c;
                }
                String str2 = i19 + "/" + size + "  " + ((Object) str);
                C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                AbstractC1850a7.m3108b(str2, null, 0L, 0L, C2300k.f13235j, null, 0L, null, 0L, 2, false, 1, 0, ((C1904g7) c2395p2.m3878k(c2394o2)).f11256m, c2395p, 196608, 3120, 55262);
                AbstractC1850a7.m3108b(c0718an.f2450c, null, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11258o, c2395p, 0, 3120, 55290);
                c2395p2 = c2395p;
                c2395p2.m3888r(true);
                c2395p2.m3857Z(1868907482);
                if (i16 == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                list2 = list;
                boolean m3874i2 = c2395p2.m3874i(list2) | z10;
                if (i17 == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z14 = m3874i2 | z11;
                Object m3847O2 = c2395p2.m3847O();
                if (!z14 && m3847O2 != c2413u0) {
                    i12 = i7;
                    interfaceC3279c2 = interfaceC3279c;
                } else {
                    final int i20 = 1;
                    i12 = i7;
                    interfaceC3279c2 = interfaceC3279c;
                    m3847O2 = new InterfaceC3277a() { // from class: e5.kn
                        @Override // p150t5.InterfaceC3277a
                        /* renamed from: a */
                        public final Object mo52a() {
                            switch (i20) {
                                case 0:
                                    int i192 = i12 - 1;
                                    List list3 = list2;
                                    interfaceC3279c2.mo23f(Integer.valueOf((list3.size() + i192) % list3.size()));
                                    break;
                                default:
                                    interfaceC3279c2.mo23f(Integer.valueOf((i12 + 1) % list2.size()));
                                    break;
                            }
                            return C1694m.f10482a;
                        }
                    };
                    c2395p2.m3877j0(m3847O2);
                }
                InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) m3847O2;
                c2395p2.m3888r(false);
                if (list2.size() > 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                AbstractC1991r4.m3165f(interfaceC3277a2, null, z12, null, AbstractC1259s1.f7457b, c2395p2, 196608, 26);
                c2395p2.m3888r(true);
            } else {
                throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1137o3(i12, i8, list2, interfaceC3279c2);
        }
    }

    /* renamed from: t0 */
    public static C1485za m2287t0(C0878fo c0878fo) {
        Object obj;
        C1687f c1687f;
        Object m2985m;
        int i7;
        int i8;
        int i9;
        byte[] copyOf;
        Integer m973O;
        String str;
        AbstractC3367j.m5100e(c0878fo, "raw");
        C0308o m940d0 = AbstractC0444k.m940d0(c0878fo.f4048b);
        C1263s5 c1263s5 = new C1263s5(15);
        C0312s c0312s = C0312s.f1107m;
        C0300g c0300g = new C0300g(new C0302i(m940d0, c1263s5, 0));
        while (true) {
            if (c0300g.hasNext()) {
                obj = c0300g.next();
                if (!AbstractC0444k.m937a0((String) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            str2 = "";
        }
        if (!AbstractC0444k.m937a0(str2)) {
            if (AbstractC0444k.m928R(str2, "/", false)) {
                List m949m0 = AbstractC0444k.m949m0(str2, new String[]{"/"}, 2);
                String obj2 = AbstractC0444k.m956t0((String) m949m0.get(0)).toString();
                String str3 = (String) AbstractC1805m.m3048l0(1, m949m0);
                if (str3 != null) {
                    str = AbstractC0444k.m956t0(str3).toString();
                } else {
                    str = null;
                }
                c1687f = new C1687f(obj2, str);
            } else {
                c1687f = new C1687f(str2, null);
            }
            String str4 = (String) c1687f.f10471e;
            String str5 = (String) c1687f.f10472f;
            if (!AbstractC0444k.m937a0(str4)) {
                try {
                    m2985m = InetAddress.getByName(AbstractC0444k.m945i0(str4, "[", "]"));
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (m2985m instanceof C1689h) {
                    m2985m = null;
                }
                InetAddress inetAddress = (InetAddress) m2985m;
                if (inetAddress != null) {
                    if (inetAddress.getAddress().length == 4) {
                        i7 = 32;
                    } else {
                        i7 = 128;
                    }
                    if (str5 != null && (m973O = AbstractC0451r.m973O(str5)) != null) {
                        i8 = AbstractC2168e.m3530q(m973O.intValue(), 0, i7);
                    } else {
                        i8 = i7;
                    }
                    if (inetAddress.getAddress().length == 4) {
                        i9 = 1;
                    } else {
                        i9 = 2;
                    }
                    byte[] address = inetAddress.getAddress();
                    AbstractC3367j.m5099d(address, "getAddress(...)");
                    int m3530q = AbstractC2168e.m3530q((int) Math.ceil(i8 / 8.0d), 0, address.length);
                    if (m3530q == 0) {
                        copyOf = new byte[0];
                    } else {
                        copyOf = Arrays.copyOf(address, m3530q);
                        AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                        int i10 = i8 % 8;
                        if (i10 != 0 && m3530q <= copyOf.length) {
                            int i11 = m3530q - 1;
                            copyOf[i11] = (byte) ((255 << (8 - i10)) & 255 & copyOf[i11]);
                        }
                    }
                    byte[] bArr = copyOf;
                    String obj3 = AbstractC0444k.m956t0(c0878fo.f4047a).toString();
                    if (str5 == null) {
                        str2 = str4 + "/" + i7;
                    }
                    return new C1485za(obj3, str2, i9, i8, bArr);
                }
            }
        }
        return null;
    }

    /* renamed from: u */
    public static final void m2288u(String str, String str2, double d7, C2395p c2395p, int i7) {
        int i8;
        C2395p c2395p2;
        long m1404d;
        c2395p.m3859a0(-2054335625);
        if (c2395p.m3862c(d7)) {
            i8 = 256;
        } else {
            i8 = 128;
        }
        if (((i7 | i8) & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
            c2395p2 = c2395p;
        } else {
            float f7 = 1.0f;
            InterfaceC3810r m346e = AbstractC0155c.m346e(C3807o.f17991a, 1.0f);
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.f15794f, C3795c.f17974o, c2395p, 54);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m346e);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4854a, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (");
            String m4046j = AbstractC2487d.m4046j(sb, str2, ")");
            C2394o2 c2394o2 = AbstractC1913h7.f11292a;
            C1604o0 c1604o0 = ((C1904g7) c2395p.m3878k(c2394o2)).f11255l;
            long j6 = ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s;
            if (1.0f > 0.0d) {
                if (1.0f > Float.MAX_VALUE) {
                    f7 = Float.MAX_VALUE;
                }
                AbstractC1850a7.m3108b(m4046j, new LayoutWeightElement(f7, true), j6, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p, 0, 0, 65528);
                c2395p2 = c2395p;
                String format = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d7)}, 1));
                C1604o0 c1604o02 = ((C1904g7) c2395p2.m3878k(c2394o2)).f11255l;
                C2300k c2300k = C2300k.f13236k;
                if (d7 >= 75.0d) {
                    m1404d = AbstractC0659i0.m1404d(4293870660L);
                } else if (d7 >= 50.0d) {
                    m1404d = AbstractC0659i0.m1404d(4294286859L);
                } else if (d7 >= 25.0d) {
                    m1404d = AbstractC0659i0.m1404d(4282090230L);
                } else {
                    m1404d = AbstractC0659i0.m1404d(4281652121L);
                }
                AbstractC1850a7.m3108b(format, null, m1404d, 0L, c2300k, null, 0L, null, 0L, 0, false, 0, 0, c1604o02, c2395p2, 196608, 0, 65498);
                c2395p2.m3888r(true);
            } else {
                throw new IllegalArgumentException(AbstractC2487d.m4042f("invalid weight ", 1.0f, "; must be greater than zero").toString());
            }
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1180pf(str, str2, d7, i7);
        }
    }

    /* renamed from: u0 */
    public static String m2289u0() {
        List list;
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            list = AbstractC1804l.m3031X(strArr);
        } else {
            list = null;
        }
        if (list == null) {
            list = C1813u.f10860e;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC0451r.m966H((String) it.next(), "arm64-v8a")) {
                    break;
                }
            }
        }
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (AbstractC0451r.m966H((String) it2.next(), "armeabi-v7a")) {
                    return "armeabi-v7a";
                }
            }
        }
        return "arm64-v8a";
    }

    /* renamed from: v */
    public static final void m2290v(String str, C2395p c2395p, int i7) {
        c2395p.m3859a0(-2031282462);
        if ((i7 & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C1604o0 c1604o0 = ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11256m;
            AbstractC1850a7.m3108b(str, null, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11807a, 0L, C2300k.f13235j, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p, 196614, 0, 65498);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0453t(i7, 9, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* renamed from: v0 */
    public static List m2291v0(String str, int i7, String str2, Network network, int i8, int i9, C1485za c1485za, int i10) {
        String str3;
        int i11;
        int i12;
        int ordinal;
        String str4;
        String str5;
        String str6;
        int i13;
        int i14;
        boolean z7;
        int i15 = i7;
        String str7 = str2;
        int i16 = i9;
        int i17 = i10;
        String m2306c = AbstractC1265s7.m2306c(c1485za);
        if (i15 != 1) {
            if (i15 != 28) {
                str3 = String.valueOf(i15);
            } else {
                str3 = "AAAA";
            }
        } else {
            str3 = "A";
        }
        String str8 = str3;
        if (i17 == 0) {
            if (network != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            StringBuilder m189p = AbstractC0094y0.m189p("QUERY start host=", str, " server=", str7, " type=");
            AbstractC2487d.m4057u(m189p, str8, " ecs=", m2306c, " timeout=");
            i11 = i8;
            i12 = 0;
            AbstractC0094y0.m192s(m189p, i11, "ms retry=", i16, " network=");
            m189p.append(z7);
            AbstractC1265s7.m2308e(m189p.toString());
        } else {
            i11 = i8;
            i12 = 0;
        }
        C1813u c1813u = C1813u.f10860e;
        if (i17 <= 6) {
            String obj = AbstractC0444k.m956t0(AbstractC0444k.m945i0(str, "[", "]")).toString();
            if (!AbstractC0444k.m937a0(obj) && (ordinal = AbstractC1155ol.m2013a(obj).ordinal()) != 0 && ordinal != 1) {
                try {
                    String ascii = IDN.toASCII(obj, 1);
                    AbstractC3367j.m5099d(ascii, "toASCII(...)");
                    char[] cArr = new char[1];
                    cArr[i12] = '.';
                    String m957u0 = AbstractC0444k.m957u0(ascii, cArr);
                    if (!AbstractC0444k.m937a0(m957u0)) {
                        byte[] m2240S = m2240S(m957u0, i15, c1485za);
                        int m3530q = AbstractC2168e.m3530q(i16, 1, 10);
                        int i18 = i12;
                        C1813u c1813u2 = c1813u;
                        while (i18 < m3530q) {
                            int i19 = m3530q;
                            int i20 = i11;
                            String str9 = str7;
                            byte[] bArr = m2240S;
                            try {
                                byte[] m2214D0 = m2214D0(bArr, str9, network, i20, m2306c, str8);
                                String str10 = m2306c;
                                String str11 = str8;
                                if (m2214D0 != null) {
                                    try {
                                        AbstractC1265s7.m2308e("RESP summary ecs=" + str10 + " type=" + str11 + " " + AbstractC1265s7.m2305b(i15, m2214D0) + " hex=" + AbstractC1265s7.m2307d(128, m2214D0));
                                        C1154ok m2281q0 = m2281q0(m2214D0, i15, str10);
                                        List list = m2281q0.f6637b;
                                        ?? r02 = m2281q0.f6636a;
                                        AbstractC1265s7.m2308e("RESP parsed ecs=" + str10 + " type=" + str11 + " addrs=" + AbstractC1265s7.m2304a(r02) + " cnames=" + list);
                                        if (!r02.isEmpty()) {
                                            int i21 = i18;
                                            str6 = " attempt=";
                                            i13 = i21;
                                            c1813u2 = r02;
                                            str5 = str11;
                                            i14 = i16;
                                            str4 = str10;
                                            str7 = str2;
                                        } else if (!list.isEmpty()) {
                                            String str12 = (String) AbstractC1805m.m3045i0(list);
                                            int i22 = i17 + 1;
                                            int i23 = i18;
                                            str6 = " attempt=";
                                            i13 = i23;
                                            str5 = str11;
                                            i14 = i16;
                                            str4 = str10;
                                            str7 = str2;
                                            c1813u2 = m2291v0(str12, i15, str7, network, i8, i14, c1485za, i22);
                                        } else {
                                            int i24 = i18;
                                            str6 = " attempt=";
                                            i13 = i24;
                                            str5 = str11;
                                            i14 = i16;
                                            str4 = str10;
                                            str7 = str2;
                                            c1813u2 = c1813u;
                                        }
                                        if (!c1813u2.isEmpty()) {
                                            AbstractC1265s7.m2308e("QUERY done ecs=" + str4 + " type=" + str5 + " result=" + AbstractC1265s7.m2304a(c1813u2) + str6 + (i13 + 1));
                                            return c1813u2;
                                        }
                                    } catch (Exception e7) {
                                        e = e7;
                                        str4 = str10;
                                        str5 = str11;
                                        str7 = str2;
                                        ConcurrentHashMap.KeySetView keySetView = AbstractC1265s7.f7527a;
                                        String message = e.getMessage();
                                        StringBuilder m189p2 = AbstractC0094y0.m189p("QUERY failed ecs=", str4, " type=", str5, " host=");
                                        AbstractC2487d.m4057u(m189p2, obj, " server=", str7, " err=");
                                        m189p2.append(message);
                                        AbstractC1265s7.m2310g(m189p2.toString());
                                        return c1813u;
                                    }
                                } else {
                                    str5 = str11;
                                    i14 = i16;
                                    i13 = i18;
                                    str4 = str10;
                                    str6 = " attempt=";
                                    str7 = str2;
                                }
                                try {
                                    ConcurrentHashMap.KeySetView keySetView2 = AbstractC1265s7.f7527a;
                                    int i25 = i13 + 1;
                                    AbstractC1265s7.m2310g("QUERY no result ecs=" + str4 + " type=" + str5 + " host=" + obj + " server=" + str7 + str6 + i25 + "/" + i14);
                                    i15 = i7;
                                    i11 = i8;
                                    i18 = i25;
                                    m2306c = str4;
                                    str8 = str5;
                                    m2240S = bArr;
                                    i17 = i10;
                                    i16 = i14;
                                    m3530q = i19;
                                } catch (Exception e8) {
                                    e = e8;
                                    ConcurrentHashMap.KeySetView keySetView3 = AbstractC1265s7.f7527a;
                                    String message2 = e.getMessage();
                                    StringBuilder m189p22 = AbstractC0094y0.m189p("QUERY failed ecs=", str4, " type=", str5, " host=");
                                    AbstractC2487d.m4057u(m189p22, obj, " server=", str7, " err=");
                                    m189p22.append(message2);
                                    AbstractC1265s7.m2310g(m189p22.toString());
                                    return c1813u;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                str7 = str9;
                                str4 = m2306c;
                                str5 = str8;
                                ConcurrentHashMap.KeySetView keySetView32 = AbstractC1265s7.f7527a;
                                String message22 = e.getMessage();
                                StringBuilder m189p222 = AbstractC0094y0.m189p("QUERY failed ecs=", str4, " type=", str5, " host=");
                                AbstractC2487d.m4057u(m189p222, obj, " server=", str7, " err=");
                                m189p222.append(message22);
                                AbstractC1265s7.m2310g(m189p222.toString());
                                return c1813u;
                            }
                        }
                        return c1813u2;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            }
        }
        return c1813u;
    }

    /* renamed from: w */
    public static final void m2292w(C0800d9 c0800d9, InterfaceC3277a interfaceC3277a, InterfaceC3279c interfaceC3279c, C2395p c2395p, int i7) {
        int i8;
        int i9;
        Object m2985m;
        boolean z7;
        int i10;
        InterfaceC2425y0 interfaceC2425y0;
        String str;
        InterfaceC2425y0 interfaceC2425y02;
        Integer num;
        InterfaceC2425y0 interfaceC2425y03;
        C3472s c3472s;
        String str2;
        String str3 = c0800d9.f3341b;
        Object obj = "";
        c2395p.m3859a0(1295385509);
        if (c2395p.m3874i(c0800d9)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i11 = i7 | i8;
        if (c2395p.m3874i(interfaceC3279c)) {
            i9 = 256;
        } else {
            i9 = 128;
        }
        int i12 = i11 | i9;
        if ((i12 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            Context context = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
            List<String> list = c0800d9.f3344e;
            c2395p.m3857Z(-1899172088);
            boolean m3870g = c2395p.m3870g(str3);
            Object m3847O = c2395p.m3847O();
            Object obj2 = C2375k.f13421a;
            if (m3870g || m3847O == obj2) {
                try {
                    m2985m = new URI(str3).getHost();
                    if (m2985m == null) {
                        m2985m = "";
                    }
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (!(m2985m instanceof C1689h)) {
                    obj = m2985m;
                }
                m3847O = (String) obj;
                c2395p.m3877j0(m3847O);
            }
            String str4 = (String) m3847O;
            Object m181h = AbstractC0094y0.m181h(-1899168746, c2395p, false);
            if (m181h == obj2) {
                m181h = AbstractC2418w.m3980x(Boolean.FALSE);
                c2395p.m3877j0(m181h);
            }
            InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) m181h;
            Object m181h2 = AbstractC0094y0.m181h(-1899166818, c2395p, false);
            if (m181h2 == obj2) {
                ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
                for (String str5 : list) {
                    if (AbstractC0444k.m929S(str5, ':')) {
                        str2 = "IPv6";
                    } else {
                        str2 = "IPv4";
                    }
                    arrayList.add(new C0877fn(str5, str2));
                }
                m181h2 = AbstractC2418w.m3980x(arrayList);
                c2395p.m3877j0(m181h2);
            }
            InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) m181h2;
            Object m181h3 = AbstractC0094y0.m181h(-1899161809, c2395p, false);
            if (m181h3 == obj2) {
                m181h3 = AbstractC2418w.m3980x(AbstractC1805m.m3038F0(list));
                c2395p.m3877j0(m181h3);
            }
            InterfaceC2425y0 interfaceC2425y06 = (InterfaceC2425y0) m181h3;
            c2395p.m3888r(false);
            Object[] objArr = new Object[0];
            c2395p.m3857Z(-1899158612);
            Object m3847O2 = c2395p.m3847O();
            if (m3847O2 == obj2) {
                m3847O2 = new C0317b(27);
                c2395p.m3877j0(m3847O2);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y07 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O2, c2395p, 48);
            c2395p.m3857Z(-1899157340);
            Object m3847O3 = c2395p.m3847O();
            if (m3847O3 == obj2) {
                m3847O3 = new C3472s();
                c2395p.m3877j0(m3847O3);
            }
            C3472s c3472s2 = (C3472s) m3847O3;
            Object m181h4 = AbstractC0094y0.m181h(-1899155198, c2395p, false);
            if (m181h4 == obj2) {
                m181h4 = new C3472s();
                c2395p.m3877j0(m181h4);
            }
            C3472s c3472s3 = (C3472s) m181h4;
            Object m181h5 = AbstractC0094y0.m181h(-1899153003, c2395p, false);
            if (m181h5 == obj2) {
                m181h5 = new C2349d1(0);
                c2395p.m3877j0(m181h5);
            }
            C2349d1 c2349d1 = (C2349d1) m181h5;
            c2395p.m3888r(false);
            Integer valueOf = Integer.valueOf(c2349d1.m3741g());
            c2395p.m3857Z(-1899149867);
            boolean m3874i = c2395p.m3874i(context) | c2395p.m3870g(str4);
            if ((i12 & 14) != 4 && !c2395p.m3874i(c0800d9)) {
                z7 = false;
            } else {
                z7 = true;
            }
            boolean m3870g2 = m3874i | z7 | c2395p.m3870g(interfaceC2425y07);
            Object m3847O4 = c2395p.m3847O();
            if (!m3870g2 && m3847O4 != obj2) {
                i10 = 1;
                interfaceC2425y0 = interfaceC2425y07;
                str = str4;
                interfaceC2425y03 = interfaceC2425y04;
                interfaceC2425y02 = interfaceC2425y06;
                c3472s = c3472s3;
                num = valueOf;
            } else {
                i10 = 1;
                interfaceC2425y0 = interfaceC2425y07;
                str = str4;
                interfaceC2425y02 = interfaceC2425y06;
                num = valueOf;
                interfaceC2425y03 = interfaceC2425y04;
                c3472s = c3472s3;
                Object c1206qa = new C1206qa(c3472s, interfaceC2425y03, context, str, c0800d9, interfaceC2425y0, interfaceC2425y05, interfaceC2425y02, c3472s2, null);
                c2395p.m3877j0(c1206qa);
                m3847O4 = c1206qa;
            }
            c2395p.m3888r(false);
            AbstractC2418w.m3964f(str, num, (InterfaceC3281e) m3847O4, c2395p);
            AbstractC1991r4.m3160a(interfaceC3277a, AbstractC3178i.m4873d(-1856854947, new C1237ra(interfaceC3279c, interfaceC2425y02, interfaceC2425y03), c2395p), AbstractC0155c.m358q(AbstractC0155c.m346e(C3807o.f17991a, 0.94f), 0.0f, 720, i10), AbstractC3178i.m4873d(1345477147, new C1387w5(5, interfaceC3277a), c2395p), AbstractC0951i1.f4700X, AbstractC3178i.m4873d(1854007992, new C1361va(str, interfaceC2425y0, interfaceC2425y03, interfaceC2425y05, interfaceC2425y02, c3472s2, c3472s, c2349d1), c2395p), null, 0L, 0L, 0L, 0L, 0.0f, new C3767q(3), c2395p, 1772982, 3072, 8080);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1081m9(c0800d9, interfaceC3277a, interfaceC3279c, i7, 2);
        }
    }

    /* renamed from: w0 */
    public static C1687f m2293w0(int i7, byte[] bArr) {
        int i8;
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        int i9 = 0;
        loop0: while (true) {
            i8 = i7;
            while (true) {
                if (i7 < 0 || i7 >= bArr.length) {
                    break loop0;
                }
                byte b8 = bArr[i7];
                int i10 = b8 & 255;
                if (i10 == 0) {
                    if (!z7) {
                        i8 = i7 + 1;
                    }
                } else if ((b8 & 192) == 192) {
                    int i11 = i7 + 1;
                    if (i11 < bArr.length) {
                        if (!z7) {
                            i8 = i7 + 2;
                        }
                        i7 = ((b8 & 63) << 8) | (bArr[i11] & 255);
                        i9++;
                        if (i9 > 16) {
                            break loop0;
                        }
                        z7 = true;
                    } else {
                        break loop0;
                    }
                } else {
                    int i12 = i7 + 1;
                    if (i12 + i10 > bArr.length) {
                        break loop0;
                    }
                    arrayList.add(new String(bArr, i12, i10, AbstractC0434a.f1478b));
                    i7 += i10 + 1;
                    if (!z7) {
                        break;
                    }
                }
            }
        }
        return new C1687f(AbstractC1805m.m3051o0(arrayList, ".", null, null, null, 62), Integer.valueOf(i8));
    }

    /* renamed from: x */
    public static final void m2294x(String str, InterfaceC3277a interfaceC3277a, InterfaceC3279c interfaceC3279c, C2395p c2395p, int i7) {
        int i8;
        int i9;
        boolean z7;
        c2395p.m3859a0(-970297157);
        if (c2395p.m3870g(str)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i10 = i7 | i8;
        if (c2395p.m3874i(interfaceC3279c)) {
            i9 = 256;
        } else {
            i9 = 128;
        }
        int i11 = i10 | i9;
        if ((i11 & 147) == 146 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            Object[] objArr = new Object[0];
            c2395p.m3857Z(-1341106307);
            if ((i11 & 14) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            Object m3847O = c2395p.m3847O();
            if (z7 || m3847O == C2375k.f13421a) {
                m3847O = new C0226c0(4, str);
                c2395p.m3877j0(m3847O);
            }
            c2395p.m3888r(false);
            InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O, c2395p, 0);
            AbstractC1991r4.m3160a(interfaceC3277a, AbstractC3178i.m4873d(-1385667213, new C1392wa(interfaceC3279c, interfaceC2425y0, 0), c2395p), null, AbstractC3178i.m4873d(936134705, new C1387w5(6, interfaceC3277a), c2395p), AbstractC0951i1.f4706b0, AbstractC3178i.m4873d(-2023613362, new C1200q4(interfaceC2425y0, 12), c2395p), null, 0L, 0L, 0L, 0L, 0.0f, null, c2395p, 1772598, 0, 16276);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1081m9(str, interfaceC3277a, interfaceC3279c, i7, 1);
        }
    }

    /* renamed from: x0 */
    public static int m2295x0(int i7, byte[] bArr) {
        return (bArr[i7 + 1] & 255) | ((bArr[i7] & 255) << 8);
    }

    /* renamed from: y */
    public static final void m2296y(C0718an c0718an, C2395p c2395p, int i7) {
        int i8;
        long m1404d;
        String format;
        C2394o2 c2394o2;
        C3807o c3807o;
        C0718an c0718an2;
        C2395p c2395p2 = c2395p;
        double d7 = c0718an.f2463p;
        double d8 = c0718an.f2462o;
        double d9 = c0718an.f2461n;
        double d10 = c0718an.f2460m;
        c2395p2.m3859a0(1348711168);
        if (c2395p2.m3870g(c0718an)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        if (((i7 | i8) & 3) == 2 && c2395p2.m3836D()) {
            c2395p2.m3852U();
            c0718an2 = c0718an;
        } else {
            int ordinal = c0718an.f2452e.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            m1404d = AbstractC0659i0.m1404d(4293870660L);
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        m1404d = AbstractC0659i0.m1404d(4294286859L);
                    }
                } else {
                    m1404d = AbstractC0659i0.m1404d(4282090230L);
                }
            } else {
                m1404d = AbstractC0659i0.m1404d(4281652121L);
            }
            C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.m4843g(10), C3795c.f17976q, c2395p2, 6);
            int hashCode = Long.hashCode(c2395p2.f13486T);
            InterfaceC2385m1 m3882m = c2395p2.m3882m();
            C3807o c3807o2 = C3807o.f17991a;
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, c3807o2);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p2.m3863c0();
            long j6 = m1404d;
            if (c2395p2.f13485S) {
                c2395p2.m3880l(c3558z);
            } else {
                c2395p2.m3883m0();
            }
            AbstractC2418w.m3954C(m4857a, c2395p2, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p2, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p2, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p2, C3507i.f16929c);
            m2290v("监测上下文", c2395p2, 6);
            String str = c0718an.f2449b;
            String str2 = "—";
            if (AbstractC0444k.m937a0(str)) {
                str = "—";
            }
            m2284s("接口名称", str, c2395p2, 6);
            String str3 = c0718an.f2450c;
            if (!AbstractC0444k.m937a0(str3)) {
                str2 = str3;
            }
            m2284s("监测网卡", str2, c2395p2, 6);
            String format2 = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Long.valueOf(c0718an.f2448a));
            AbstractC3367j.m5099d(format2, "format(...)");
            m2284s("采样时间", format2, c2395p2, 6);
            C2394o2 c2394o22 = AbstractC2019v0.f11943a;
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.45f, ((C2003t0) c2395p2.m3878k(c2394o22)).f11784B), c2395p2, 0, 3);
            m2290v("原始采样值", c2395p2, 6);
            long j7 = c0718an.f2453f;
            if (j7 <= 0) {
                format = "0 B";
            } else if (j7 < 1024) {
                format = j7 + " B";
            } else if (j7 < 1048576) {
                format = String.format(Locale.US, "%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(j7 / 1024.0d)}, 1));
            } else {
                format = String.format(Locale.US, "%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(j7 / 1048576.0d)}, 1));
            }
            m2284s("内核 backlog", format, c2395p2, 6);
            m2284s("qdisc dropped 累计", String.valueOf(c0718an.f2454g), c2395p2, 6);
            m2284s("qdisc requeues 累计", String.valueOf(c0718an.f2455h), c2395p2, 6);
            m2284s("TX dropped 累计", String.valueOf(c0718an.f2456i), c2395p2, 6);
            m2284s("RX dropped 累计", String.valueOf(c0718an.f2457j), c2395p2, 6);
            m2284s("TCP 重传 累计（全机）", String.valueOf(c0718an.f2458k), c2395p2, 6);
            m2284s("软中断挤压 累计（全机）", String.valueOf(c0718an.f2459l), c2395p2, 6);
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.45f, ((C2003t0) c2395p2.m3878k(c2394o22)).f11784B), c2395p2, 0, 3);
            m2290v("每秒变化率（需 ≥2 次采样）", c2395p2, 6);
            Locale locale = Locale.US;
            m2284s("网卡丢包", String.format(locale, "%.2f /s", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1)), c2395p2, 6);
            m2284s("TCP 重传", String.format(locale, "%.2f /s", Arrays.copyOf(new Object[]{Double.valueOf(d9)}, 1)), c2395p2, 6);
            m2284s("qdisc 重入队", String.format(locale, "%.2f /s", Arrays.copyOf(new Object[]{Double.valueOf(d8)}, 1)), c2395p2, 6);
            m2284s("软中断挤压", String.format(locale, "%.2f /s", Arrays.copyOf(new Object[]{Double.valueOf(d7)}, 1)), c2395p2, 6);
            c2395p2.m3857Z(252372960);
            if (d10 == 0.0d && d9 == 0.0d && d8 == 0.0d && d7 == 0.0d) {
                c2394o2 = c2394o22;
                c3807o = c3807o2;
                AbstractC1850a7.m3108b("速率为相邻两次采样的增量÷时间。首秒恒为 0；若上方「累计」有值而速率长期为 0，说明该时段内计数未增长。", null, ((C2003t0) c2395p2.m3878k(c2394o22)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11258o, c2395p, 6, 0, 65530);
                c2395p2 = c2395p;
            } else {
                c2394o2 = c2394o22;
                c3807o = c3807o2;
            }
            c2395p2.m3888r(false);
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.45f, ((C2003t0) c2395p2.m3878k(c2394o2)).f11784B), c2395p2, 0, 3);
            m2290v("分项得分（单项满分 100）", c2395p2, 6);
            c0718an2 = c0718an;
            m2288u("内核 backlog", "35%", c0718an2.f2464q, c2395p2, 54);
            m2288u("网卡丢包率", "40%", c0718an2.f2465r, c2395p, 54);
            m2288u("TCP 重传率", "15%", c0718an2.f2466s, c2395p, 54);
            m2288u("qdisc 重入队", "7%", c0718an2.f2467t, c2395p, 54);
            m2288u("软中断挤压", "3%", c0718an2.f2468u, c2395p, 54);
            AbstractC1991r4.m3164e(null, 0.0f, C0677s.m1453b(0.65f, ((C2003t0) c2395p.m3878k(c2394o2)).f11784B), c2395p, 0, 3);
            m2290v("综合评分", c2395p, 6);
            AbstractC1991r4.m3162c(AbstractC0155c.m346e(c3807o, 1.0f), null, AbstractC1991r4.m3168i(C0677s.m1453b(0.72f, ((C2003t0) c2395p.m3878k(c2394o2)).f11824r), c2395p), null, AbstractC3178i.m4873d(1312312040, new C1064ln(c0718an2, j6), c2395p), c2395p, 196614, 26);
            c2395p2 = c2395p;
            c2395p2.m3888r(true);
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0453t(i7, 8, c0718an2);
        }
    }

    /* renamed from: y0 */
    public static final Map m2297y0(List list, List list2, boolean z7, C2395p c2395p, int i7) {
        boolean z8;
        List list3;
        List list4;
        AbstractC3367j.m5100e(list2, "networkTargets");
        c2395p.m3857Z(-614720457);
        Context context = (Context) c2395p.m3878k(AndroidCompositionLocals_androidKt.f786b);
        c2395p.m3857Z(-1664162544);
        boolean m3870g = c2395p.m3870g(list2);
        Object m3847O = c2395p.m3847O();
        Object obj = C2375k.f13421a;
        Object obj2 = m3847O;
        if (m3870g || m3847O == obj) {
            int m3082N = AbstractC1817y.m3082N(AbstractC1807o.m3073U(list2));
            if (m3082N < 16) {
                m3082N = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(m3082N);
            for (Object obj3 : list2) {
                linkedHashMap.put(((C1248rl) obj3).f7390a, obj3);
            }
            c2395p.m3877j0(linkedHashMap);
            obj2 = linkedHashMap;
        }
        Map map = (Map) obj2;
        c2395p.m3888r(false);
        c2395p.m3857Z(-1664159749);
        boolean m3870g2 = c2395p.m3870g(list);
        Object m3847O2 = c2395p.m3847O();
        if (m3870g2 || m3847O2 == obj) {
            m3847O2 = AbstractC1805m.m3042f0(list);
            c2395p.m3877j0(m3847O2);
        }
        List list5 = (List) m3847O2;
        Object m181h = AbstractC0094y0.m181h(-1664157474, c2395p, false);
        if (m181h == obj) {
            m181h = AbstractC2418w.m3980x(C1814v.f10861e);
            c2395p.m3877j0(m181h);
        }
        InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) m181h;
        c2395p.m3888r(false);
        Boolean valueOf = Boolean.valueOf(z7);
        c2395p.m3857Z(-1664151847);
        boolean m3874i = c2395p.m3874i(list5) | c2395p.m3874i(list2) | c2395p.m3874i(context) | c2395p.m3874i(map);
        if ((((i7 & 896) ^ 384) > 256 && c2395p.m3872h(z7)) || (i7 & 384) == 256) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z9 = z8 | m3874i;
        Object m3847O3 = c2395p.m3847O();
        if (!z9 && m3847O3 != obj) {
            list3 = list5;
            list4 = list2;
        } else {
            list3 = list5;
            list4 = list2;
            m3847O3 = new C1455yb(list3, list4, context, interfaceC2425y0, map, z7, null);
            c2395p.m3877j0(m3847O3);
        }
        c2395p.m3888r(false);
        AbstractC2418w.m3963e(list3, list4, valueOf, (InterfaceC3281e) m3847O3, c2395p);
        Map map2 = (Map) interfaceC2425y0.getValue();
        c2395p.m3888r(false);
        return map2;
    }

    /* renamed from: z */
    public static final void m2298z(final C1497zm c1497zm, final boolean z7, C2395p c2395p, final int i7) {
        int i8;
        C2395p c2395p2;
        int i9;
        int i10;
        AbstractC3367j.m5100e(c1497zm, "state");
        c2395p.m3859a0(1260692848);
        if ((i7 & 6) == 0) {
            if (c2395p.m3874i(c1497zm)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i8 = i10 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3872h(z7)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i8 |= i9;
        }
        if ((i8 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
            c2395p2 = c2395p;
        } else {
            List list = c1497zm.f9926a;
            Object[] objArr = new Object[0];
            c2395p.m3857Z(1708542617);
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
                m3847O = new C1148oe(13);
                c2395p.m3877j0(m3847O);
            }
            c2395p.m3888r(false);
            C2349d1 c2349d1 = (C2349d1) AbstractC3344k.m5080c(objArr, (InterfaceC3277a) m3847O, c2395p, 48);
            ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0718an) it.next()).f2450c);
            }
            c2395p.m3857Z(1708545223);
            boolean m3870g = c2395p.m3870g(c2349d1) | c2395p.m3874i(list);
            Object m3847O2 = c2395p.m3847O();
            if (m3870g || m3847O2 == c2413u0) {
                m3847O2 = new C0341k(list, c2349d1, null, 12);
                c2395p.m3877j0(m3847O2);
            }
            c2395p.m3888r(false);
            AbstractC2418w.m3965g(arrayList, c2395p, (InterfaceC3281e) m3847O2);
            c2395p2 = c2395p;
            AbstractC1991r4.m3162c(AbstractC0155c.m346e(C3807o.f17991a, 1.0f), null, null, null, AbstractC3178i.m4873d(1747565246, new C1450y6(c1497zm, list, z7, c2349d1), c2395p), c2395p2, 196614, 30);
        }
        C2405r1 m3891u = c2395p2.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new InterfaceC3281e() { // from class: e5.jn
                @Override // p150t5.InterfaceC3281e
                /* renamed from: d */
                public final Object mo22d(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int m3957F = AbstractC2418w.m3957F(i7 | 1);
                    AbstractC1249rm.m2298z(C1497zm.this, z7, (C2395p) obj, m3957F);
                    return C1694m.f10482a;
                }
            };
        }
    }

    /* renamed from: z0 */
    public static Serializable m2299z0(Context context) {
        AbstractC3367j.m5100e(context, "context");
        try {
            String str = context.getApplicationInfo().nativeLibraryDir;
            File file = null;
            if (str != null) {
                if (AbstractC0444k.m937a0(str)) {
                    str = null;
                }
                if (str != null) {
                    File file2 = new File(str, "libiperf3.so");
                    if (file2.exists() && file2.length() > 0 && file2.canExecute()) {
                        file = file2;
                    }
                }
            }
            if (file != null) {
                return file;
            }
            String m2289u0 = m2289u0();
            File file3 = new File(context.getFilesDir(), "iperf3/" + m2289u0 + "/iperf3");
            if (!file3.exists() || file3.length() <= 0 || !file3.canExecute()) {
                File parentFile = file3.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                InputStream open = context.getAssets().open("iperf3/" + m2289u0 + "/iperf3");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        AbstractC3367j.m5097b(open);
                        AbstractC2080d.m3398k(open, fileOutputStream);
                        fileOutputStream.close();
                        open.close();
                        file3.setReadable(true, false);
                        file3.setExecutable(true, false);
                        file3.setWritable(false, false);
                        if (!file3.canExecute()) {
                            throw new IllegalStateException("无法为 iperf3 设置可执行权限");
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC2168e.m3526m(open, th);
                        throw th2;
                    }
                }
            }
            return file3;
        } catch (Throwable th3) {
            return AbstractC1793a0.m2985m(th3);
        }
    }
}
