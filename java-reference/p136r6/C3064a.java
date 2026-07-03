package p136r6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import p000a.AbstractC0000a;
import p006a7.C0133p;
import p006a7.C0138u;
import p037e3.C0691e;
import p039e5.C0811dk;
import p039e5.C1378vr;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p067i4.AbstractC2072e;
import p067i4.C2071d;
import p079k1.C2258a;
import p099m6.AbstractC2595c;
import p099m6.AbstractC2602f0;
import p099m6.C2591a;
import p099m6.C2592a0;
import p099m6.C2593b;
import p099m6.C2596c0;
import p099m6.C2598d0;
import p099m6.C2599e;
import p099m6.C2604g0;
import p099m6.C2617r;
import p099m6.C2618s;
import p099m6.C2619t;
import p099m6.C2621v;
import p099m6.C2623x;
import p099m6.C2625z;
import p099m6.InterfaceC2620u;
import p106n6.AbstractC2721b;
import p128q6.C3002e;
import p128q6.C3006i;
import p128q6.C3009l;
import p128q6.C3010m;
import p128q6.C3011n;
import p151t6.C3285a;
import p158u5.AbstractC3367j;
import p189y6.C3855c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r6.a */
/* loaded from: classes.dex */
public final class C3064a implements InterfaceC2620u {

    /* renamed from: a */
    public final /* synthetic */ int f15658a = 0;

    /* renamed from: b */
    public final Object f15659b;

    public C3064a(C2593b c2593b) {
        AbstractC3367j.m5100e(c2593b, "cookieJar");
        this.f15659b = c2593b;
    }

    /* renamed from: d */
    public static int m4740d(C2598d0 c2598d0, int i7) {
        String m4141b = C2598d0.m4141b("Retry-After", c2598d0);
        if (m4141b == null) {
            return i7;
        }
        Pattern compile = Pattern.compile("\\d+");
        AbstractC3367j.m5099d(compile, "compile(...)");
        if (compile.matcher(m4141b).matches()) {
            Integer valueOf = Integer.valueOf(m4141b);
            AbstractC3367j.m5099d(valueOf, "valueOf(header)");
            return valueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        r3.m4682f(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
    
        return r9;
     */
    @Override // p099m6.InterfaceC2620u
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2598d0 mo4178a(C3070g c3070g) {
        AbstractC2602f0 abstractC2602f0;
        boolean z7;
        SSLSocketFactory sSLSocketFactory;
        C3855c c3855c;
        C2599e c2599e;
        switch (this.f15658a) {
            case 0:
                C2593b c2593b = (C2593b) this.f15659b;
                C2592a0 c2592a0 = c3070g.f15667e;
                C2625z m4122a = c2592a0.m4122a();
                C2617r c2617r = c2592a0.f14020c;
                C2619t c2619t = c2592a0.f14018a;
                AbstractC2595c abstractC2595c = c2592a0.f14021d;
                if (abstractC2595c != null) {
                    C2621v mo2159d = abstractC2595c.mo2159d();
                    if (mo2159d != null) {
                        m4122a.m4191c("Content-Type", mo2159d.f14162a);
                    }
                    long mo2158c = abstractC2595c.mo2158c();
                    if (mo2158c != -1) {
                        m4122a.m4191c("Content-Length", String.valueOf(mo2158c));
                        m4122a.f14232c.m1515p("Transfer-Encoding");
                    } else {
                        m4122a.m4191c("Transfer-Encoding", "chunked");
                        m4122a.f14232c.m1515p("Content-Length");
                    }
                }
                boolean z8 = false;
                if (c2617r.m4164a("Host") == null) {
                    m4122a.m4191c("Host", AbstractC2721b.m4377w(c2619t, false));
                }
                if (c2617r.m4164a("Connection") == null) {
                    m4122a.m4191c("Connection", "Keep-Alive");
                }
                if (c2617r.m4164a("Accept-Encoding") == null && c2617r.m4164a("Range") == null) {
                    m4122a.m4191c("Accept-Encoding", "gzip");
                    z8 = true;
                }
                c2593b.getClass();
                AbstractC3367j.m5100e(c2619t, "url");
                if (c2617r.m4164a("User-Agent") == null) {
                    m4122a.m4191c("User-Agent", "okhttp/4.12.0");
                }
                C2598d0 m4746b = c3070g.m4746b(m4122a.m4189a());
                C2617r c2617r2 = m4746b.f14061j;
                AbstractC3069f.m4744b(c2593b, c2619t, c2617r2);
                C2596c0 m4143d = m4746b.m4143d();
                m4143d.f14029a = c2592a0;
                if (z8 && "gzip".equalsIgnoreCase(C2598d0.m4141b("Content-Encoding", m4746b)) && AbstractC3069f.m4743a(m4746b) && (abstractC2602f0 = m4746b.f14062k) != null) {
                    C0133p c0133p = new C0133p(abstractC2602f0.mo4146f());
                    C0811dk m4166c = c2617r2.m4166c();
                    m4166c.m1515p("Content-Encoding");
                    m4166c.m1515p("Content-Length");
                    m4143d.f14034f = m4166c.m1504e().m4166c();
                    m4143d.f14035g = new C3071h(C2598d0.m4141b("Content-Type", m4746b), -1L, new C0138u(c0133p));
                }
                return m4143d.m4140a();
            default:
                C2592a0 c2592a02 = c3070g.f15667e;
                C3006i c3006i = c3070g.f15663a;
                List list = C1813u.f10860e;
                C2598d0 c2598d0 = null;
                int i7 = 0;
                C2592a0 c2592a03 = c2592a02;
                while (true) {
                    boolean z9 = true;
                    while (true) {
                        AbstractC3367j.m5100e(c2592a03, "request");
                        if (c3006i.f15505p == null) {
                            synchronized (c3006i) {
                                try {
                                    if (!c3006i.f15507r) {
                                        if (c3006i.f15506q) {
                                            throw new IllegalStateException("Check failed.");
                                        }
                                    } else {
                                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (z9) {
                                C2258a c2258a = c3006i.f15497h;
                                C2619t c2619t2 = c2592a03.f14018a;
                                C2623x c2623x = c3006i.f15494e;
                                if (c2619t2.f14159i) {
                                    SSLSocketFactory sSLSocketFactory2 = c2623x.f14214s;
                                    if (sSLSocketFactory2 != null) {
                                        C3855c c3855c2 = c2623x.f14218w;
                                        c2599e = c2623x.f14219x;
                                        sSLSocketFactory = sSLSocketFactory2;
                                        c3855c = c3855c2;
                                    } else {
                                        throw new IllegalStateException("CLEARTEXT-only client");
                                    }
                                } else {
                                    sSLSocketFactory = null;
                                    c3855c = null;
                                    c2599e = null;
                                }
                                c3006i.f15502m = new C2071d(c2258a, new C2591a(c2619t2.f14154d, c2619t2.f14155e, c2623x.f14210o, c2623x.f14213r, sSLSocketFactory, c3855c, c2599e, c2623x.f14212q, c2623x.f14217v, c2623x.f14216u, c2623x.f14211p), c3006i, c3006i.f15498i);
                            }
                            try {
                                if (!c3006i.f15509t) {
                                    try {
                                        C2598d0 m4746b2 = c3070g.m4746b(c2592a03);
                                        if (c2598d0 != null) {
                                            C2596c0 m4143d2 = m4746b2.m4143d();
                                            C2596c0 m4143d3 = c2598d0.m4143d();
                                            m4143d3.f14035g = null;
                                            C2598d0 m4140a = m4143d3.m4140a();
                                            if (m4140a.f14062k == null) {
                                                m4143d2.f14038j = m4140a;
                                                m4746b2 = m4143d2.m4140a();
                                            } else {
                                                throw new IllegalArgumentException("priorResponse.body != null");
                                            }
                                        }
                                        c2598d0 = m4746b2;
                                        c2592a03 = m4741b(c2598d0, c3006i.f15505p);
                                        if (c2592a03 == null) {
                                            z7 = false;
                                            break;
                                        } else {
                                            z7 = false;
                                            AbstractC2595c abstractC2595c2 = c2592a03.f14021d;
                                            if (abstractC2595c2 != null && (abstractC2595c2 instanceof C1378vr)) {
                                                break;
                                            } else {
                                                AbstractC2602f0 abstractC2602f02 = c2598d0.f14062k;
                                                if (abstractC2602f02 != null) {
                                                    AbstractC2721b.m4358d(abstractC2602f02);
                                                }
                                                i7++;
                                                if (i7 <= 20) {
                                                    c3006i.m4682f(true);
                                                } else {
                                                    throw new ProtocolException("Too many follow-up requests: " + i7);
                                                }
                                            }
                                        }
                                    } catch (IOException e7) {
                                        if (m4742c(e7, c3006i, c2592a03, !(e7 instanceof C3285a))) {
                                            list = AbstractC1805m.m3059w0(list, e7);
                                            c3006i.m4682f(true);
                                            z9 = false;
                                        } else {
                                            Iterator it = list.iterator();
                                            while (it.hasNext()) {
                                                AbstractC0000a.m7h(e7, (Exception) it.next());
                                            }
                                            throw e7;
                                        }
                                    } catch (C3010m e8) {
                                        if (m4742c(e8.f15533f, c3006i, c2592a03, false)) {
                                            list = AbstractC1805m.m3059w0(list, e8.f15532e);
                                            c3006i.m4682f(true);
                                            z9 = false;
                                        } else {
                                            IOException iOException = e8.f15532e;
                                            AbstractC3367j.m5100e(iOException, "<this>");
                                            Iterator it2 = list.iterator();
                                            while (it2.hasNext()) {
                                                AbstractC0000a.m7h(iOException, (Exception) it2.next());
                                            }
                                            throw iOException;
                                        }
                                    }
                                } else {
                                    throw new IOException("Canceled");
                                }
                            } catch (Throwable th2) {
                                c3006i.m4682f(true);
                                throw th2;
                            }
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
                break;
        }
    }

    /* renamed from: b */
    public C2592a0 m4741b(C2598d0 c2598d0, C3002e c3002e) {
        C2604g0 c2604g0;
        C2618s c2618s;
        C2619t c2619t;
        AbstractC2595c abstractC2595c;
        C2598d0 c2598d02;
        C3009l c3009l;
        AbstractC2595c abstractC2595c2 = null;
        if (c3002e != null && (c3009l = (C3009l) c3002e.f15488f) != null) {
            c2604g0 = c3009l.f15516b;
        } else {
            c2604g0 = null;
        }
        int i7 = c2598d0.f14059h;
        C2592a0 c2592a0 = c2598d0.f14056e;
        String str = c2592a0.f14019b;
        boolean z7 = false;
        if (i7 != 307 && i7 != 308) {
            if (i7 != 401) {
                if (i7 != 421) {
                    if (i7 != 503) {
                        if (i7 != 407) {
                            if (i7 != 408) {
                                switch (i7) {
                                }
                            } else if (((C2623x) this.f15659b).f14205j && (((abstractC2595c = c2592a0.f14021d) == null || !(abstractC2595c instanceof C1378vr)) && (((c2598d02 = c2598d0.f14065n) == null || c2598d02.f14059h != 408) && m4740d(c2598d0, 0) <= 0))) {
                                return c2598d0.f14056e;
                            }
                        } else {
                            AbstractC3367j.m5097b(c2604g0);
                            if (c2604g0.f14095b.type() == Proxy.Type.HTTP) {
                                ((C2623x) this.f15659b).f14212q.getClass();
                                return null;
                            }
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                    } else {
                        C2598d0 c2598d03 = c2598d0.f14065n;
                        if ((c2598d03 == null || c2598d03.f14059h != 503) && m4740d(c2598d0, Integer.MAX_VALUE) == 0) {
                            return c2598d0.f14056e;
                        }
                    }
                } else {
                    AbstractC2595c abstractC2595c3 = c2592a0.f14021d;
                    if ((abstractC2595c3 == null || !(abstractC2595c3 instanceof C1378vr)) && c3002e != null && !AbstractC3367j.m5096a(((C2591a) ((C2071d) c3002e.f15486d).f12271e).f14015h.f14154d, ((C3009l) c3002e.f15488f).f15516b.f14094a.f14015h.f14154d)) {
                        C3009l c3009l2 = (C3009l) c3002e.f15488f;
                        synchronized (c3009l2) {
                            c3009l2.f15525k = true;
                        }
                        return c2598d0.f14056e;
                    }
                }
                return null;
            }
            ((C2623x) this.f15659b).f14206k.getClass();
            return null;
        }
        C2623x c2623x = (C2623x) this.f15659b;
        if (c2623x.f14207l) {
            String m4141b = C2598d0.m4141b("Location", c2598d0);
            C2592a0 c2592a02 = c2598d0.f14056e;
            if (m4141b != null) {
                C2619t c2619t2 = c2592a02.f14018a;
                c2619t2.getClass();
                try {
                    c2618s = new C2618s();
                    c2618s.m4170c(c2619t2, m4141b);
                } catch (IllegalArgumentException unused) {
                    c2618s = null;
                }
                if (c2618s != null) {
                    c2619t = c2618s.m4168a();
                } else {
                    c2619t = null;
                }
                if (c2619t != null && (AbstractC3367j.m5096a(c2619t.f14151a, c2592a02.f14018a.f14151a) || c2623x.f14208m)) {
                    C2625z m4122a = c2592a02.m4122a();
                    if (AbstractC2072e.m3338p(str)) {
                        int i8 = c2598d0.f14059h;
                        if (str.equals("PROPFIND") || i8 == 308 || i8 == 307) {
                            z7 = true;
                        }
                        if (!str.equals("PROPFIND") && i8 != 308 && i8 != 307) {
                            m4122a.m4192d("GET", null);
                        } else {
                            if (z7) {
                                abstractC2595c2 = c2592a02.f14021d;
                            }
                            m4122a.m4192d(str, abstractC2595c2);
                        }
                        if (!z7) {
                            m4122a.f14232c.m1515p("Transfer-Encoding");
                            m4122a.f14232c.m1515p("Content-Length");
                            m4122a.f14232c.m1515p("Content-Type");
                        }
                    }
                    if (!AbstractC2721b.m4355a(c2592a02.f14018a, c2619t)) {
                        m4122a.f14232c.m1515p("Authorization");
                    }
                    m4122a.f14230a = c2619t;
                    return m4122a.m4189a();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        if (r7 == false) goto L30;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m4742c(IOException iOException, C3006i c3006i, C2592a0 c2592a0, boolean z7) {
        boolean z8;
        C3011n c3011n;
        C3009l c3009l;
        AbstractC2595c abstractC2595c;
        if (!((C2623x) this.f15659b).f14205j || ((z7 && (((abstractC2595c = c2592a0.f14021d) != null && (abstractC2595c instanceof C1378vr)) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C2071d c2071d = c3006i.f15502m;
        AbstractC3367j.m5097b(c2071d);
        int i7 = c2071d.f12267a;
        if (i7 == 0 && c2071d.f12268b == 0 && c2071d.f12269c == 0) {
            z8 = false;
        } else {
            if (((C2604g0) c2071d.f12276j) == null) {
                C2604g0 c2604g0 = null;
                if (i7 <= 1 && c2071d.f12268b <= 1 && c2071d.f12269c <= 0 && (c3009l = ((C3006i) c2071d.f12272f).f15503n) != null) {
                    synchronized (c3009l) {
                        if (c3009l.f15526l == 0) {
                            if (AbstractC2721b.m4355a(c3009l.f15516b.f14094a.f14015h, ((C2591a) c2071d.f12271e).f14015h)) {
                                c2604g0 = c3009l.f15516b;
                            }
                        }
                    }
                }
                if (c2604g0 != null) {
                    c2071d.f12276j = c2604g0;
                } else {
                    C0691e c0691e = (C0691e) c2071d.f12274h;
                    if ((c0691e == null || !c0691e.m1479d()) && (c3011n = (C3011n) c2071d.f12275i) != null) {
                        z8 = c3011n.m4707i();
                    }
                }
            }
            z8 = true;
        }
        if (!z8) {
            return false;
        }
        return true;
    }

    public C3064a(C2623x c2623x) {
        this.f15659b = c2623x;
    }
}
