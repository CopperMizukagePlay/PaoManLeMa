package p128q6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p000a.AbstractC0000a;
import p001a0.AbstractC0094y0;
import p006a7.AbstractC0117b;
import p006a7.C0120c0;
import p006a7.C0129l;
import p006a7.C0130m;
import p006a7.C0137t;
import p006a7.C0138u;
import p024c6.AbstractC0445l;
import p039e5.C0811dk;
import p060h5.AbstractC1805m;
import p079k1.C2258a;
import p099m6.AbstractC2595c;
import p099m6.AbstractC2614o;
import p099m6.C2591a;
import p099m6.C2592a0;
import p099m6.C2596c0;
import p099m6.C2598d0;
import p099m6.C2599e;
import p099m6.C2604g0;
import p099m6.C2607i;
import p099m6.C2616q;
import p099m6.C2619t;
import p099m6.C2623x;
import p099m6.C2625z;
import p099m6.EnumC2624y;
import p100n.AbstractC2647h;
import p100n.C2673p1;
import p106n6.AbstractC2721b;
import p107o.C2746i;
import p121p6.C2883b;
import p121p6.C2886e;
import p136r6.C3070g;
import p136r6.InterfaceC3068e;
import p143s6.C3115d;
import p151t6.AbstractC3292f;
import p151t6.AbstractC3294h;
import p151t6.C3286a0;
import p151t6.C3301o;
import p151t6.C3302p;
import p151t6.C3309w;
import p151t6.C3310x;
import p158u5.AbstractC3367j;
import p159u6.C3395m;
import p189y6.C3855c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q6.l */
/* loaded from: classes.dex */
public final class C3009l extends AbstractC3294h {

    /* renamed from: b */
    public final C2604g0 f15516b;

    /* renamed from: c */
    public Socket f15517c;

    /* renamed from: d */
    public Socket f15518d;

    /* renamed from: e */
    public C2616q f15519e;

    /* renamed from: f */
    public EnumC2624y f15520f;

    /* renamed from: g */
    public C3301o f15521g;

    /* renamed from: h */
    public C0138u f15522h;

    /* renamed from: i */
    public C0137t f15523i;

    /* renamed from: j */
    public boolean f15524j;

    /* renamed from: k */
    public boolean f15525k;

    /* renamed from: l */
    public int f15526l;

    /* renamed from: m */
    public int f15527m;

    /* renamed from: n */
    public int f15528n;

    /* renamed from: o */
    public int f15529o;

    /* renamed from: p */
    public final ArrayList f15530p;

    /* renamed from: q */
    public long f15531q;

    public C3009l(C2258a c2258a, C2604g0 c2604g0) {
        AbstractC3367j.m5100e(c2258a, "connectionPool");
        AbstractC3367j.m5100e(c2604g0, "route");
        this.f15516b = c2604g0;
        this.f15529o = 1;
        this.f15530p = new ArrayList();
        this.f15531q = Long.MAX_VALUE;
    }

    /* renamed from: d */
    public static void m4687d(C2623x c2623x, C2604g0 c2604g0, IOException iOException) {
        AbstractC3367j.m5100e(c2604g0, "failedRoute");
        AbstractC3367j.m5100e(iOException, "failure");
        if (c2604g0.f14095b.type() != Proxy.Type.DIRECT) {
            C2591a c2591a = c2604g0.f14094a;
            c2591a.f14014g.connectFailed(c2591a.f14015h.m4177g(), c2604g0.f14095b.address(), iOException);
        }
        C2673p1 c2673p1 = c2623x.f14199F;
        synchronized (c2673p1) {
            ((LinkedHashSet) c2673p1.f14390f).add(c2604g0);
        }
    }

    @Override // p151t6.AbstractC3294h
    /* renamed from: a */
    public final synchronized void mo4688a(C3301o c3301o, C3286a0 c3286a0) {
        int i7;
        AbstractC3367j.m5100e(c3286a0, "settings");
        if ((c3286a0.f16130a & 16) != 0) {
            i7 = c3286a0.f16131b[4];
        } else {
            i7 = Integer.MAX_VALUE;
        }
        this.f15529o = i7;
    }

    @Override // p151t6.AbstractC3294h
    /* renamed from: b */
    public final void mo4689b(C3309w c3309w) {
        c3309w.m5024c(8, null);
    }

    /* renamed from: c */
    public final void m4690c(int i7, int i8, int i9, int i10, boolean z7, C3006i c3006i, AbstractC2614o abstractC2614o) {
        boolean z8;
        C3006i c3006i2;
        C2604g0 c2604g0;
        AbstractC3367j.m5100e(abstractC2614o, "eventListener");
        if (this.f15520f == null) {
            List list = this.f15516b.f14094a.f14017j;
            C2999b c2999b = new C2999b(list);
            C2591a c2591a = this.f15516b.f14094a;
            if (c2591a.f14010c == null) {
                if (list.contains(C2607i.f14109f)) {
                    String str = this.f15516b.f14094a.f14015h.f14154d;
                    C3395m c3395m = C3395m.f16494a;
                    if (!C3395m.f16494a.mo5117h(str)) {
                        throw new C3010m(new UnknownServiceException(AbstractC0094y0.m185l("CLEARTEXT communication to ", str, " not permitted by network security policy")));
                    }
                } else {
                    throw new C3010m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (c2591a.f14016i.contains(EnumC2624y.f14226j)) {
                throw new C3010m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            C3010m c3010m = null;
            do {
                try {
                    C2604g0 c2604g02 = this.f15516b;
                    if (c2604g02.f14094a.f14010c != null && c2604g02.f14095b.type() == Proxy.Type.HTTP) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    try {
                    } catch (IOException e7) {
                        e = e7;
                    }
                } catch (IOException e8) {
                    e = e8;
                }
                try {
                    if (z8) {
                        c3006i2 = c3006i;
                        m4692f(i7, i8, i9, c3006i2, abstractC2614o);
                        if (this.f15517c == null) {
                            c2604g0 = this.f15516b;
                            if (c2604g0.f14094a.f14010c == null && c2604g0.f14095b.type() == Proxy.Type.HTTP && this.f15517c == null) {
                                throw new C3010m(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            this.f15531q = System.nanoTime();
                            return;
                        }
                    } else {
                        c3006i2 = c3006i;
                        m4691e(i7, i8, c3006i2, abstractC2614o);
                    }
                    m4693g(c2999b, i10, c3006i2, abstractC2614o);
                    AbstractC3367j.m5100e(this.f15516b.f14096c, "inetSocketAddress");
                    c2604g0 = this.f15516b;
                    if (c2604g0.f14094a.f14010c == null) {
                    }
                    this.f15531q = System.nanoTime();
                    return;
                } catch (IOException e9) {
                    e = e9;
                    Socket socket = this.f15518d;
                    if (socket != null) {
                        AbstractC2721b.m4359e(socket);
                    }
                    Socket socket2 = this.f15517c;
                    if (socket2 != null) {
                        AbstractC2721b.m4359e(socket2);
                    }
                    this.f15518d = null;
                    this.f15517c = null;
                    this.f15522h = null;
                    this.f15523i = null;
                    this.f15519e = null;
                    this.f15520f = null;
                    this.f15521g = null;
                    this.f15529o = 1;
                    AbstractC3367j.m5100e(this.f15516b.f14096c, "inetSocketAddress");
                    if (c3010m == null) {
                        c3010m = new C3010m(e);
                    } else {
                        AbstractC0000a.m7h(c3010m.f15532e, e);
                        c3010m.f15533f = e;
                    }
                    if (z7) {
                        c2999b.f15469d = true;
                        if (c2999b.f15468c) {
                            if (!(e instanceof ProtocolException)) {
                                if (!(e instanceof InterruptedIOException)) {
                                    if (!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) {
                                        if (e instanceof SSLPeerUnverifiedException) {
                                            throw c3010m;
                                        }
                                    } else {
                                        throw c3010m;
                                    }
                                } else {
                                    throw c3010m;
                                }
                            } else {
                                throw c3010m;
                            }
                        } else {
                            throw c3010m;
                        }
                    } else {
                        throw c3010m;
                    }
                }
            } while (e instanceof SSLException);
            throw c3010m;
        }
        throw new IllegalStateException("already connected");
    }

    /* renamed from: e */
    public final void m4691e(int i7, int i8, C3006i c3006i, AbstractC2614o abstractC2614o) {
        int i9;
        Socket createSocket;
        C2604g0 c2604g0 = this.f15516b;
        Proxy proxy = c2604g0.f14095b;
        C2591a c2591a = c2604g0.f14094a;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i9 = -1;
        } else {
            i9 = AbstractC3007j.f15512a[type.ordinal()];
        }
        if (i9 != 1 && i9 != 2) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = c2591a.f14009b.createSocket();
            AbstractC3367j.m5097b(createSocket);
        }
        this.f15517c = createSocket;
        InetSocketAddress inetSocketAddress = this.f15516b.f14096c;
        abstractC2614o.getClass();
        AbstractC3367j.m5100e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i8);
        try {
            C3395m c3395m = C3395m.f16494a;
            C3395m.f16494a.mo5120e(createSocket, this.f15516b.f14096c, i7);
            try {
                this.f15522h = new C0138u(AbstractC0117b.m222g(createSocket));
                this.f15523i = new C0137t(AbstractC0117b.m221f(createSocket));
            } catch (NullPointerException e7) {
                if (!AbstractC3367j.m5096a(e7.getMessage(), "throw with null exception")) {
                } else {
                    throw new IOException(e7);
                }
            }
        } catch (ConnectException e8) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f15516b.f14096c);
            connectException.initCause(e8);
            throw connectException;
        }
    }

    /* renamed from: f */
    public final void m4692f(int i7, int i8, int i9, C3006i c3006i, AbstractC2614o abstractC2614o) {
        C2625z c2625z = new C2625z();
        C2604g0 c2604g0 = this.f15516b;
        C2619t c2619t = c2604g0.f14094a.f14015h;
        AbstractC3367j.m5100e(c2619t, "url");
        c2625z.f14230a = c2619t;
        c2625z.m4192d("CONNECT", null);
        C2591a c2591a = c2604g0.f14094a;
        c2625z.m4191c("Host", AbstractC2721b.m4377w(c2591a.f14015h, true));
        c2625z.m4191c("Proxy-Connection", "Keep-Alive");
        c2625z.m4191c("User-Agent", "okhttp/4.12.0");
        C2592a0 m4189a = c2625z.m4189a();
        C0811dk c0811dk = new C0811dk(3);
        AbstractC2595c.m4129a("Proxy-Authenticate");
        AbstractC2595c.m4130b("OkHttp-Preemptive", "Proxy-Authenticate");
        c0811dk.m1515p("Proxy-Authenticate");
        c0811dk.m1502b("Proxy-Authenticate", "OkHttp-Preemptive");
        c0811dk.m1504e();
        c2591a.f14013f.getClass();
        C2619t c2619t2 = m4189a.f14018a;
        m4691e(i7, i8, c3006i, abstractC2614o);
        String str = "CONNECT " + AbstractC2721b.m4377w(c2619t2, true) + " HTTP/1.1";
        C0138u c0138u = this.f15522h;
        AbstractC3367j.m5097b(c0138u);
        C0137t c0137t = this.f15523i;
        AbstractC3367j.m5097b(c0137t);
        C3011n c3011n = new C3011n((C2623x) null, this, c0138u, c0137t);
        C0120c0 mo215a = c0138u.f552e.mo215a();
        long j6 = i8;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mo215a.mo225g(j6, timeUnit);
        c0137t.f549e.mo231a().mo225g(i9, timeUnit);
        c3011n.m4709k(m4189a.f14020c, str);
        c3011n.mo4700b();
        C2596c0 mo4705g = c3011n.mo4705g(false);
        AbstractC3367j.m5097b(mo4705g);
        mo4705g.f14029a = m4189a;
        C2598d0 m4140a = mo4705g.m4140a();
        int i10 = m4140a.f14059h;
        long m4365k = AbstractC2721b.m4365k(m4140a);
        if (m4365k != -1) {
            C3115d m4708j = c3011n.m4708j(m4365k);
            AbstractC2721b.m4375u(m4708j, Integer.MAX_VALUE);
            m4708j.close();
        }
        if (i10 != 200) {
            if (i10 == 407) {
                c2591a.f14013f.getClass();
                throw new IOException("Failed to authenticate with proxy");
            }
            throw new IOException(AbstractC2647h.m4256b("Unexpected response code for CONNECT: ", i10));
        }
        if (c0138u.f553f.m251c() && c0137t.f550f.m251c()) {
        } else {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* renamed from: g */
    public final void m4693g(C2999b c2999b, int i7, C3006i c3006i, AbstractC2614o abstractC2614o) {
        EnumC2624y enumC2624y = EnumC2624y.f14223g;
        C2591a c2591a = this.f15516b.f14094a;
        if (c2591a.f14010c == null) {
            List list = c2591a.f14016i;
            EnumC2624y enumC2624y2 = EnumC2624y.f14226j;
            if (list.contains(enumC2624y2)) {
                this.f15518d = this.f15517c;
                this.f15520f = enumC2624y2;
                m4698l(i7);
                return;
            } else {
                this.f15518d = this.f15517c;
                this.f15520f = enumC2624y;
                return;
            }
        }
        abstractC2614o.getClass();
        C2591a c2591a2 = this.f15516b.f14094a;
        SSLSocketFactory sSLSocketFactory = c2591a2.f14010c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            AbstractC3367j.m5097b(sSLSocketFactory);
            Socket socket = this.f15517c;
            C2619t c2619t = c2591a2.f14015h;
            Socket createSocket = sSLSocketFactory.createSocket(socket, c2619t.f14154d, c2619t.f14155e, true);
            AbstractC3367j.m5098c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                C2607i m4666a = c2999b.m4666a(sSLSocket2);
                if (m4666a.f14111b) {
                    C3395m c3395m = C3395m.f16494a;
                    C3395m.f16494a.mo5115d(sSLSocket2, c2591a2.f14015h.f14154d, c2591a2.f14016i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                AbstractC3367j.m5099d(session, "sslSocketSession");
                C2616q m4134h = AbstractC2595c.m4134h(session);
                HostnameVerifier hostnameVerifier = c2591a2.f14011d;
                AbstractC3367j.m5097b(hostnameVerifier);
                boolean verify = hostnameVerifier.verify(c2591a2.f14015h.f14154d, session);
                int i8 = 2;
                if (!verify) {
                    List m4163a = m4134h.m4163a();
                    if (!m4163a.isEmpty()) {
                        Object obj = m4163a.get(0);
                        AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        X509Certificate x509Certificate = (X509Certificate) obj;
                        StringBuilder sb = new StringBuilder("\n              |Hostname ");
                        sb.append(c2591a2.f14015h.f14154d);
                        sb.append(" not verified:\n              |    certificate: ");
                        C2599e c2599e = C2599e.f14069c;
                        StringBuilder sb2 = new StringBuilder("sha256/");
                        C0130m c0130m = C0130m.f528h;
                        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                        AbstractC3367j.m5099d(encoded, "publicKey.encoded");
                        sb2.append(C0129l.m279j(encoded).mo285b("SHA-256").mo284a());
                        sb.append(sb2.toString());
                        sb.append("\n              |    DN: ");
                        sb.append(x509Certificate.getSubjectDN().getName());
                        sb.append("\n              |    subjectAltNames: ");
                        sb.append(AbstractC1805m.m3058v0(C3855c.m5868a(x509Certificate, 7), C3855c.m5868a(x509Certificate, 2)));
                        sb.append("\n              ");
                        throw new SSLPeerUnverifiedException(AbstractC0445l.m962D(sb.toString()));
                    }
                    throw new SSLPeerUnverifiedException("Hostname " + c2591a2.f14015h.f14154d + " not verified (no certificates)");
                }
                C2599e c2599e2 = c2591a2.f14012e;
                AbstractC3367j.m5097b(c2599e2);
                this.f15519e = new C2616q(m4134h.f14137a, m4134h.f14138b, m4134h.f14139c, new C2746i(c2599e2, m4134h, c2591a2, i8));
                AbstractC3367j.m5100e(c2591a2.f14015h.f14154d, "hostname");
                Iterator it = c2599e2.f14070a.iterator();
                if (!it.hasNext()) {
                    if (m4666a.f14111b) {
                        C3395m c3395m2 = C3395m.f16494a;
                        str = C3395m.f16494a.mo5116f(sSLSocket2);
                    }
                    this.f15518d = sSLSocket2;
                    this.f15522h = new C0138u(AbstractC0117b.m222g(sSLSocket2));
                    this.f15523i = new C0137t(AbstractC0117b.m221f(sSLSocket2));
                    if (str != null) {
                        enumC2624y = AbstractC2595c.m4136j(str);
                    }
                    this.f15520f = enumC2624y;
                    C3395m c3395m3 = C3395m.f16494a;
                    C3395m.f16494a.mo5127a(sSLSocket2);
                    if (this.f15520f == EnumC2624y.f14225i) {
                        m4698l(i7);
                        return;
                    }
                    return;
                }
                it.next().getClass();
                throw new ClassCastException();
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    C3395m c3395m4 = C3395m.f16494a;
                    C3395m.f16494a.mo5127a(sSLSocket);
                }
                if (sSLSocket != null) {
                    AbstractC2721b.m4359e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        if (p189y6.C3855c.m5870c(r6, (java.security.cert.X509Certificate) r12) != false) goto L53;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4694h(C2591a c2591a, List list) {
        C2616q c2616q;
        C2619t c2619t = c2591a.f14015h;
        byte[] bArr = AbstractC2721b.f14569a;
        if (this.f15530p.size() < this.f15529o && !this.f15524j) {
            C2604g0 c2604g0 = this.f15516b;
            C2591a c2591a2 = c2604g0.f14094a;
            C2591a c2591a3 = c2604g0.f14094a;
            if (c2591a2.m4121a(c2591a)) {
                String str = c2619t.f14154d;
                String str2 = c2619t.f14154d;
                if (AbstractC3367j.m5096a(str, c2591a3.f14015h.f14154d)) {
                    return true;
                }
                if (this.f15521g != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C2604g0 c2604g02 = (C2604g0) it.next();
                        Proxy.Type type = c2604g02.f14095b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && c2604g0.f14095b.type() == type2 && AbstractC3367j.m5096a(c2604g0.f14096c, c2604g02.f14096c)) {
                            if (c2591a.f14011d == C3855c.f18089a) {
                                byte[] bArr2 = AbstractC2721b.f14569a;
                                C2619t c2619t2 = c2591a3.f14015h;
                                if (c2619t.f14155e == c2619t2.f14155e) {
                                    if (!AbstractC3367j.m5096a(str2, c2619t2.f14154d)) {
                                        if (!this.f15525k && (c2616q = this.f15519e) != null) {
                                            List m4163a = c2616q.m4163a();
                                            if (!m4163a.isEmpty()) {
                                                Object obj = m4163a.get(0);
                                                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            }
                                        }
                                    }
                                    try {
                                        C2599e c2599e = c2591a.f14012e;
                                        AbstractC3367j.m5097b(c2599e);
                                        C2616q c2616q2 = this.f15519e;
                                        AbstractC3367j.m5097b(c2616q2);
                                        List m4163a2 = c2616q2.m4163a();
                                        AbstractC3367j.m5100e(str2, "hostname");
                                        AbstractC3367j.m5100e(m4163a2, "peerCertificates");
                                        Iterator it2 = c2599e.f14070a.iterator();
                                        if (!it2.hasNext()) {
                                            return true;
                                        }
                                        it2.next().getClass();
                                        throw new ClassCastException();
                                    } catch (SSLPeerUnverifiedException unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m4695i(boolean z7) {
        long j6;
        byte[] bArr = AbstractC2721b.f14569a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f15517c;
        AbstractC3367j.m5097b(socket);
        Socket socket2 = this.f15518d;
        AbstractC3367j.m5097b(socket2);
        AbstractC3367j.m5097b(this.f15522h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C3301o c3301o = this.f15521g;
        if (c3301o != null) {
            synchronized (c3301o) {
                if (c3301o.f16194j) {
                    return false;
                }
                if (c3301o.f16203s < c3301o.f16202r) {
                    if (nanoTime >= c3301o.f16204t) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j6 = nanoTime - this.f15531q;
        }
        if (j6 < 10000000000L || !z7) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.m301b();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* renamed from: j */
    public final InterfaceC3068e m4696j(C2623x c2623x, C3070g c3070g) {
        int i7 = c3070g.f15669g;
        Socket socket = this.f15518d;
        AbstractC3367j.m5097b(socket);
        C0138u c0138u = this.f15522h;
        AbstractC3367j.m5097b(c0138u);
        C0137t c0137t = this.f15523i;
        AbstractC3367j.m5097b(c0137t);
        C3301o c3301o = this.f15521g;
        if (c3301o != null) {
            return new C3302p(c2623x, this, c3070g, c3301o);
        }
        socket.setSoTimeout(i7);
        C0120c0 mo215a = c0138u.f552e.mo215a();
        long j6 = i7;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mo215a.mo225g(j6, timeUnit);
        c0137t.f549e.mo231a().mo225g(c3070g.f15670h, timeUnit);
        return new C3011n(c2623x, this, c0138u, c0137t);
    }

    /* renamed from: k */
    public final synchronized void m4697k() {
        this.f15524j = true;
    }

    /* renamed from: l */
    public final void m4698l(int i7) {
        int i8;
        int i9;
        Socket socket = this.f15518d;
        AbstractC3367j.m5097b(socket);
        C0138u c0138u = this.f15522h;
        AbstractC3367j.m5097b(c0138u);
        C0137t c0137t = this.f15523i;
        AbstractC3367j.m5097b(c0137t);
        socket.setSoTimeout(0);
        C2886e c2886e = C2886e.f15074i;
        C3011n c3011n = new C3011n(c2886e);
        String str = this.f15516b.f14094a.f14015h.f14154d;
        AbstractC3367j.m5100e(str, "peerName");
        c3011n.f15536c = socket;
        String str2 = AbstractC2721b.f14575g + ' ' + str;
        AbstractC3367j.m5100e(str2, "<set-?>");
        c3011n.f15537d = str2;
        c3011n.f15538e = c0138u;
        c3011n.f15539f = c0137t;
        c3011n.f15540g = this;
        c3011n.f15534a = i7;
        C3301o c3301o = new C3301o(c3011n);
        this.f15521g = c3301o;
        C3286a0 c3286a0 = C3301o.f16184E;
        if ((c3286a0.f16130a & 16) != 0) {
            i8 = c3286a0.f16131b[4];
        } else {
            i8 = Integer.MAX_VALUE;
        }
        this.f15529o = i8;
        C3310x c3310x = c3301o.f16186B;
        synchronized (c3310x) {
            try {
                if (!c3310x.f16258h) {
                    Logger logger = C3310x.f16254j;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC2721b.m4363i(">> CONNECTION " + AbstractC3292f.f16159a.mo287d(), new Object[0]));
                    }
                    c3310x.f16255e.mo253e(AbstractC3292f.f16159a);
                    c3310x.f16255e.flush();
                } else {
                    throw new IOException("closed");
                }
            } finally {
            }
        }
        C3310x c3310x2 = c3301o.f16186B;
        C3286a0 c3286a02 = c3301o.f16205u;
        synchronized (c3310x2) {
            try {
                AbstractC3367j.m5100e(c3286a02, "settings");
                if (!c3310x2.f16258h) {
                    c3310x2.m5034d(0, Integer.bitCount(c3286a02.f16130a) * 6, 4, 0);
                    for (int i10 = 0; i10 < 10; i10++) {
                        boolean z7 = true;
                        if (((1 << i10) & c3286a02.f16130a) == 0) {
                            z7 = false;
                        }
                        if (z7) {
                            if (i10 != 4) {
                                if (i10 != 7) {
                                    i9 = i10;
                                } else {
                                    i9 = 4;
                                }
                            } else {
                                i9 = 3;
                            }
                            c3310x2.f16255e.writeShort(i9);
                            c3310x2.f16255e.writeInt(c3286a02.f16131b[i10]);
                        }
                    }
                    c3310x2.f16255e.flush();
                } else {
                    throw new IOException("closed");
                }
            } finally {
            }
        }
        if (c3301o.f16205u.m4991a() != 65535) {
            c3301o.f16186B.m5039o(0, r0 - 65535);
        }
        c2886e.m4565e().m4558c(new C2883b(c3301o.f16191g, c3301o.f16187C, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C2604g0 c2604g0 = this.f15516b;
        sb.append(c2604g0.f14094a.f14015h.f14154d);
        sb.append(':');
        sb.append(c2604g0.f14094a.f14015h.f14155e);
        sb.append(", proxy=");
        sb.append(c2604g0.f14095b);
        sb.append(" hostAddress=");
        sb.append(c2604g0.f14096c);
        sb.append(" cipherSuite=");
        C2616q c2616q = this.f15519e;
        if (c2616q == null || (obj = c2616q.f14138b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f15520f);
        sb.append('}');
        return sb.toString();
    }
}
