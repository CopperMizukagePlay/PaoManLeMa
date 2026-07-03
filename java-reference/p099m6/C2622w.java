package p099m6;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p001a0.C0019e1;
import p034e0.C0625q;
import p060h5.AbstractC1805m;
import p065i2.AbstractC2064e;
import p100n.C2673p1;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;
import p189y6.C3855c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.w */
/* loaded from: classes.dex */
public final class C2622w {

    /* renamed from: A */
    public long f14164A;

    /* renamed from: B */
    public C2673p1 f14165B;

    /* renamed from: a */
    public C2610k f14166a = new C2610k();

    /* renamed from: b */
    public C0019e1 f14167b;

    /* renamed from: c */
    public final ArrayList f14168c;

    /* renamed from: d */
    public final ArrayList f14169d;

    /* renamed from: e */
    public InterfaceC2613n f14170e;

    /* renamed from: f */
    public boolean f14171f;

    /* renamed from: g */
    public C2593b f14172g;

    /* renamed from: h */
    public boolean f14173h;

    /* renamed from: i */
    public boolean f14174i;

    /* renamed from: j */
    public C2593b f14175j;

    /* renamed from: k */
    public InterfaceC2611l f14176k;

    /* renamed from: l */
    public ProxySelector f14177l;

    /* renamed from: m */
    public C2593b f14178m;

    /* renamed from: n */
    public SocketFactory f14179n;

    /* renamed from: o */
    public SSLSocketFactory f14180o;

    /* renamed from: p */
    public X509TrustManager f14181p;

    /* renamed from: q */
    public List f14182q;

    /* renamed from: r */
    public List f14183r;

    /* renamed from: s */
    public C3855c f14184s;

    /* renamed from: t */
    public C2599e f14185t;

    /* renamed from: u */
    public AbstractC2064e f14186u;

    /* renamed from: v */
    public int f14187v;

    /* renamed from: w */
    public int f14188w;

    /* renamed from: x */
    public int f14189x;

    /* renamed from: y */
    public int f14190y;

    /* renamed from: z */
    public int f14191z;

    public C2622w() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f14167b = new C0019e1(5);
        this.f14168c = new ArrayList();
        this.f14169d = new ArrayList();
        this.f14170e = new C0625q(15);
        this.f14171f = true;
        C2593b c2593b = C2593b.f14024e;
        this.f14172g = c2593b;
        this.f14173h = true;
        this.f14174i = true;
        this.f14175j = C2593b.f14025f;
        this.f14176k = InterfaceC2611l.f14133c;
        this.f14178m = c2593b;
        SocketFactory socketFactory = SocketFactory.getDefault();
        AbstractC3367j.m5099d(socketFactory, "getDefault()");
        this.f14179n = socketFactory;
        this.f14182q = C2623x.f14193H;
        this.f14183r = C2623x.f14192G;
        this.f14184s = C3855c.f18089a;
        this.f14185t = C2599e.f14069c;
        this.f14188w = 10000;
        this.f14189x = 10000;
        this.f14190y = 10000;
        this.f14164A = 1024L;
    }

    /* renamed from: a */
    public final void m4180a(long j6, TimeUnit timeUnit) {
        AbstractC3367j.m5100e(timeUnit, "unit");
        this.f14188w = AbstractC2721b.m4356b("timeout", j6, timeUnit);
    }

    /* renamed from: b */
    public final void m4181b(InterfaceC2611l interfaceC2611l) {
        if (!interfaceC2611l.equals(this.f14176k)) {
            this.f14165B = null;
        }
        this.f14176k = interfaceC2611l;
    }

    /* renamed from: c */
    public final void m4182c(List list) {
        AbstractC3367j.m5100e(list, "protocols");
        ArrayList m3036D0 = AbstractC1805m.m3036D0(list);
        EnumC2624y enumC2624y = EnumC2624y.f14226j;
        if (!m3036D0.contains(enumC2624y) && !m3036D0.contains(EnumC2624y.f14223g)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + m3036D0).toString());
        }
        if (m3036D0.contains(enumC2624y) && m3036D0.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + m3036D0).toString());
        }
        if (!m3036D0.contains(EnumC2624y.f14222f)) {
            if (!m3036D0.contains(null)) {
                m3036D0.remove(EnumC2624y.f14224h);
                if (!m3036D0.equals(this.f14183r)) {
                    this.f14165B = null;
                }
                List unmodifiableList = Collections.unmodifiableList(m3036D0);
                AbstractC3367j.m5099d(unmodifiableList, "unmodifiableList(protocolsCopy)");
                this.f14183r = unmodifiableList;
                return;
            }
            throw new IllegalArgumentException("protocols must not contain null");
        }
        throw new IllegalArgumentException(("protocols must not contain http/1.0: " + m3036D0).toString());
    }

    /* renamed from: d */
    public final void m4183d(long j6, TimeUnit timeUnit) {
        AbstractC3367j.m5100e(timeUnit, "unit");
        this.f14189x = AbstractC2721b.m4356b("timeout", j6, timeUnit);
    }

    /* renamed from: e */
    public final void m4184e(SocketFactory socketFactory) {
        AbstractC3367j.m5100e(socketFactory, "socketFactory");
        if (!(socketFactory instanceof SSLSocketFactory)) {
            if (!socketFactory.equals(this.f14179n)) {
                this.f14165B = null;
            }
            this.f14179n = socketFactory;
            return;
        }
        throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
    }

    /* renamed from: f */
    public final void m4185f(long j6, TimeUnit timeUnit) {
        AbstractC3367j.m5100e(timeUnit, "unit");
        this.f14190y = AbstractC2721b.m4356b("timeout", j6, timeUnit);
    }
}
