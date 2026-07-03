package p099m6;

import java.net.ProtocolException;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import p001a0.C0019e1;
import p034e0.C0625q;
import p060h5.AbstractC1811s;
import p065i2.AbstractC2064e;
import p100n.C2673p1;
import p106n6.AbstractC2721b;
import p121p6.C2886e;
import p128q6.C3006i;
import p128q6.RunnableC3003f;
import p158u5.AbstractC3367j;
import p159u6.C3395m;
import p172w3.C3781e;
import p175w6.C3785a;
import p189y6.C3855c;
import p196z6.C3887f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.x */
/* loaded from: classes.dex */
public final class C2623x implements Cloneable {

    /* renamed from: G */
    public static final List f14192G = AbstractC2721b.m4366l(EnumC2624y.f14225i, EnumC2624y.f14223g);

    /* renamed from: H */
    public static final List f14193H = AbstractC2721b.m4366l(C2607i.f14108e, C2607i.f14109f);

    /* renamed from: A */
    public final int f14194A;

    /* renamed from: B */
    public final int f14195B;

    /* renamed from: C */
    public final int f14196C;

    /* renamed from: D */
    public final int f14197D;

    /* renamed from: E */
    public final long f14198E;

    /* renamed from: F */
    public final C2673p1 f14199F;

    /* renamed from: e */
    public final C2610k f14200e;

    /* renamed from: f */
    public final C0019e1 f14201f;

    /* renamed from: g */
    public final List f14202g;

    /* renamed from: h */
    public final List f14203h;

    /* renamed from: i */
    public final InterfaceC2613n f14204i;

    /* renamed from: j */
    public final boolean f14205j;

    /* renamed from: k */
    public final C2593b f14206k;

    /* renamed from: l */
    public final boolean f14207l;

    /* renamed from: m */
    public final boolean f14208m;

    /* renamed from: n */
    public final C2593b f14209n;

    /* renamed from: o */
    public final InterfaceC2611l f14210o;

    /* renamed from: p */
    public final ProxySelector f14211p;

    /* renamed from: q */
    public final C2593b f14212q;

    /* renamed from: r */
    public final SocketFactory f14213r;

    /* renamed from: s */
    public final SSLSocketFactory f14214s;

    /* renamed from: t */
    public final X509TrustManager f14215t;

    /* renamed from: u */
    public final List f14216u;

    /* renamed from: v */
    public final List f14217v;

    /* renamed from: w */
    public final C3855c f14218w;

    /* renamed from: x */
    public final C2599e f14219x;

    /* renamed from: y */
    public final AbstractC2064e f14220y;

    /* renamed from: z */
    public final int f14221z;

    /* JADX WARN: Removed duplicated region for block: B:16:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2623x(C2622w c2622w) {
        List list;
        this.f14200e = c2622w.f14166a;
        this.f14201f = c2622w.f14167b;
        this.f14202g = AbstractC2721b.m4378x(c2622w.f14168c);
        this.f14203h = AbstractC2721b.m4378x(c2622w.f14169d);
        this.f14204i = c2622w.f14170e;
        this.f14205j = c2622w.f14171f;
        this.f14206k = c2622w.f14172g;
        this.f14207l = c2622w.f14173h;
        this.f14208m = c2622w.f14174i;
        this.f14209n = c2622w.f14175j;
        this.f14210o = c2622w.f14176k;
        ProxySelector proxySelector = c2622w.f14177l;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.f14211p = proxySelector == null ? C3785a.f17940a : proxySelector;
        this.f14212q = c2622w.f14178m;
        this.f14213r = c2622w.f14179n;
        List list2 = c2622w.f14182q;
        this.f14216u = list2;
        this.f14217v = c2622w.f14183r;
        this.f14218w = c2622w.f14184s;
        this.f14221z = c2622w.f14187v;
        this.f14194A = c2622w.f14188w;
        this.f14195B = c2622w.f14189x;
        this.f14196C = c2622w.f14190y;
        this.f14197D = c2622w.f14191z;
        this.f14198E = c2622w.f14164A;
        C2673p1 c2673p1 = c2622w.f14165B;
        this.f14199F = c2673p1 == null ? new C2673p1(6) : c2673p1;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((C2607i) it.next()).f14110a) {
                    SSLSocketFactory sSLSocketFactory = c2622w.f14180o;
                    if (sSLSocketFactory != null) {
                        this.f14214s = sSLSocketFactory;
                        AbstractC2064e abstractC2064e = c2622w.f14186u;
                        AbstractC3367j.m5097b(abstractC2064e);
                        this.f14220y = abstractC2064e;
                        X509TrustManager x509TrustManager = c2622w.f14181p;
                        AbstractC3367j.m5097b(x509TrustManager);
                        this.f14215t = x509TrustManager;
                        C2599e c2599e = c2622w.f14185t;
                        c2599e.getClass();
                        this.f14219x = AbstractC3367j.m5096a(c2599e.f14071b, abstractC2064e) ? c2599e : new C2599e(c2599e.f14070a, abstractC2064e);
                    } else {
                        C3395m c3395m = C3395m.f16494a;
                        X509TrustManager mo5124m = C3395m.f16494a.mo5124m();
                        this.f14215t = mo5124m;
                        this.f14214s = C3395m.f16494a.mo5126l(mo5124m);
                        AbstractC2064e mo5114b = C3395m.f16494a.mo5114b(mo5124m);
                        this.f14220y = mo5114b;
                        C2599e c2599e2 = c2622w.f14185t;
                        c2599e2.getClass();
                        this.f14219x = AbstractC3367j.m5096a(c2599e2.f14071b, mo5114b) ? c2599e2 : new C2599e(c2599e2.f14070a, mo5114b);
                    }
                    X509TrustManager x509TrustManager2 = this.f14215t;
                    AbstractC2064e abstractC2064e2 = this.f14220y;
                    SSLSocketFactory sSLSocketFactory2 = this.f14214s;
                    List list3 = this.f14203h;
                    list = this.f14202g;
                    AbstractC3367j.m5098c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list.contains(null)) {
                        AbstractC3367j.m5098c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                        if (!list3.contains(null)) {
                            List list4 = this.f14216u;
                            if (list4 == null || !list4.isEmpty()) {
                                Iterator it2 = list4.iterator();
                                while (it2.hasNext()) {
                                    if (((C2607i) it2.next()).f14110a) {
                                        if (sSLSocketFactory2 != null) {
                                            if (abstractC2064e2 != null) {
                                                if (x509TrustManager2 == null) {
                                                    throw new IllegalStateException("x509TrustManager == null");
                                                }
                                                return;
                                            }
                                            throw new IllegalStateException("certificateChainCleaner == null");
                                        }
                                        throw new IllegalStateException("sslSocketFactory == null");
                                    }
                                }
                            }
                            if (sSLSocketFactory2 == null) {
                                if (abstractC2064e2 == null) {
                                    if (x509TrustManager2 == null) {
                                        if (AbstractC3367j.m5096a(this.f14219x, C2599e.f14069c)) {
                                            return;
                                        } else {
                                            throw new IllegalStateException("Check failed.");
                                        }
                                    }
                                    throw new IllegalStateException("Check failed.");
                                }
                                throw new IllegalStateException("Check failed.");
                            }
                            throw new IllegalStateException("Check failed.");
                        }
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    throw new IllegalStateException(("Null interceptor: " + list).toString());
                }
            }
        }
        this.f14214s = null;
        this.f14220y = null;
        this.f14215t = null;
        this.f14219x = C2599e.f14069c;
        X509TrustManager x509TrustManager22 = this.f14215t;
        AbstractC2064e abstractC2064e22 = this.f14220y;
        SSLSocketFactory sSLSocketFactory22 = this.f14214s;
        List list32 = this.f14203h;
        list = this.f14202g;
        AbstractC3367j.m5098c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
        }
    }

    /* renamed from: a */
    public final C2622w m4186a() {
        C2622w c2622w = new C2622w();
        c2622w.f14166a = this.f14200e;
        c2622w.f14167b = this.f14201f;
        AbstractC1811s.m3076X(this.f14202g, c2622w.f14168c);
        AbstractC1811s.m3076X(this.f14203h, c2622w.f14169d);
        c2622w.f14170e = this.f14204i;
        c2622w.f14171f = this.f14205j;
        c2622w.f14172g = this.f14206k;
        c2622w.f14173h = this.f14207l;
        c2622w.f14174i = this.f14208m;
        c2622w.f14175j = this.f14209n;
        c2622w.f14176k = this.f14210o;
        c2622w.f14177l = this.f14211p;
        c2622w.f14178m = this.f14212q;
        c2622w.f14179n = this.f14213r;
        c2622w.f14180o = this.f14214s;
        c2622w.f14181p = this.f14215t;
        c2622w.f14182q = this.f14216u;
        c2622w.f14183r = this.f14217v;
        c2622w.f14184s = this.f14218w;
        c2622w.f14185t = this.f14219x;
        c2622w.f14186u = this.f14220y;
        c2622w.f14187v = this.f14221z;
        c2622w.f14188w = this.f14194A;
        c2622w.f14189x = this.f14195B;
        c2622w.f14190y = this.f14196C;
        c2622w.f14191z = this.f14197D;
        c2622w.f14164A = this.f14198E;
        c2622w.f14165B = this.f14199F;
        return c2622w;
    }

    /* renamed from: b */
    public final C3006i m4187b(C2592a0 c2592a0) {
        AbstractC3367j.m5100e(c2592a0, "request");
        return new C3006i(this, c2592a0, false);
    }

    /* renamed from: c */
    public final C3887f m4188c(C2592a0 c2592a0, AbstractC2595c abstractC2595c) {
        C3887f c3887f = new C3887f(C2886e.f15074i, c2592a0, abstractC2595c, new Random(), this.f14197D, this.f14198E);
        if (c2592a0.f14020c.m4164a("Sec-WebSocket-Extensions") != null) {
            c3887f.m5902c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return c3887f;
        }
        C2622w m4186a = m4186a();
        m4186a.f14170e = new C0625q(15);
        m4186a.m4182c(C3887f.f18189w);
        C2623x c2623x = new C2623x(m4186a);
        C2625z m4122a = c2592a0.m4122a();
        m4122a.m4191c("Upgrade", "websocket");
        m4122a.m4191c("Connection", "Upgrade");
        m4122a.m4191c("Sec-WebSocket-Key", c3887f.f18195f);
        m4122a.m4191c("Sec-WebSocket-Version", "13");
        m4122a.m4191c("Sec-WebSocket-Extensions", "permessage-deflate");
        C2592a0 m4189a = m4122a.m4189a();
        C3006i c3006i = new C3006i(c2623x, m4189a, true);
        c3887f.f18196g = c3006i;
        C3781e c3781e = new C3781e(c3887f, m4189a);
        if (c3006i.f15500k.compareAndSet(false, true)) {
            C3395m c3395m = C3395m.f16494a;
            c3006i.f15501l = C3395m.f16494a.mo5121g();
            c3006i.f15498i.getClass();
            C2610k c2610k = c2623x.f14200e;
            RunnableC3003f runnableC3003f = new RunnableC3003f(c3006i, c3781e);
            c2610k.getClass();
            synchronized (c2610k) {
                c2610k.f14130d.add(runnableC3003f);
            }
            c2610k.m4160d();
            return c3887f;
        }
        throw new IllegalStateException("Already Executed");
    }

    public final Object clone() {
        return super.clone();
    }
}
