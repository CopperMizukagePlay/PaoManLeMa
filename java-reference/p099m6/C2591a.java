package p099m6;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p001a0.AbstractC0094y0;
import p065i2.AbstractC2064e;
import p100n.AbstractC2647h;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.a */
/* loaded from: classes.dex */
public final class C2591a {

    /* renamed from: a */
    public final InterfaceC2611l f14008a;

    /* renamed from: b */
    public final SocketFactory f14009b;

    /* renamed from: c */
    public final SSLSocketFactory f14010c;

    /* renamed from: d */
    public final HostnameVerifier f14011d;

    /* renamed from: e */
    public final C2599e f14012e;

    /* renamed from: f */
    public final C2593b f14013f;

    /* renamed from: g */
    public final ProxySelector f14014g;

    /* renamed from: h */
    public final C2619t f14015h;

    /* renamed from: i */
    public final List f14016i;

    /* renamed from: j */
    public final List f14017j;

    public C2591a(String str, int i7, InterfaceC2611l interfaceC2611l, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C2599e c2599e, C2593b c2593b, List list, List list2, ProxySelector proxySelector) {
        String str2;
        AbstractC3367j.m5100e(str, "uriHost");
        AbstractC3367j.m5100e(interfaceC2611l, "dns");
        AbstractC3367j.m5100e(socketFactory, "socketFactory");
        AbstractC3367j.m5100e(c2593b, "proxyAuthenticator");
        AbstractC3367j.m5100e(list, "protocols");
        AbstractC3367j.m5100e(list2, "connectionSpecs");
        AbstractC3367j.m5100e(proxySelector, "proxySelector");
        this.f14008a = interfaceC2611l;
        this.f14009b = socketFactory;
        this.f14010c = sSLSocketFactory;
        this.f14011d = hostnameVerifier;
        this.f14012e = c2599e;
        this.f14013f = c2593b;
        this.f14014g = proxySelector;
        C2618s c2618s = new C2618s();
        if (sSLSocketFactory == null) {
            str2 = "http";
        } else {
            str2 = "https";
        }
        if (str2.equalsIgnoreCase("http")) {
            c2618s.f14142a = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            c2618s.f14142a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        String m3227H = AbstractC2064e.m3227H(C2593b.m4126f(0, 0, 7, str));
        if (m3227H != null) {
            c2618s.f14145d = m3227H;
            if (1 <= i7 && i7 < 65536) {
                c2618s.f14146e = i7;
                this.f14015h = c2618s.m4168a();
                this.f14016i = AbstractC2721b.m4378x(list);
                this.f14017j = AbstractC2721b.m4378x(list2);
                return;
            }
            throw new IllegalArgumentException(AbstractC2647h.m4256b("unexpected port: ", i7).toString());
        }
        throw new IllegalArgumentException("unexpected host: ".concat(str));
    }

    /* renamed from: a */
    public final boolean m4121a(C2591a c2591a) {
        AbstractC3367j.m5100e(c2591a, "that");
        if (AbstractC3367j.m5096a(this.f14008a, c2591a.f14008a) && AbstractC3367j.m5096a(this.f14013f, c2591a.f14013f) && AbstractC3367j.m5096a(this.f14016i, c2591a.f14016i) && AbstractC3367j.m5096a(this.f14017j, c2591a.f14017j) && AbstractC3367j.m5096a(this.f14014g, c2591a.f14014g) && AbstractC3367j.m5096a(this.f14010c, c2591a.f14010c) && AbstractC3367j.m5096a(this.f14011d, c2591a.f14011d) && AbstractC3367j.m5096a(this.f14012e, c2591a.f14012e) && this.f14015h.f14155e == c2591a.f14015h.f14155e) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2591a) {
            C2591a c2591a = (C2591a) obj;
            if (AbstractC3367j.m5096a(this.f14015h, c2591a.f14015h) && m4121a(c2591a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f14012e) + ((Objects.hashCode(this.f14011d) + ((Objects.hashCode(this.f14010c) + ((this.f14014g.hashCode() + AbstractC0094y0.m176c(this.f14017j, AbstractC0094y0.m176c(this.f14016i, (this.f14013f.hashCode() + ((this.f14008a.hashCode() + AbstractC0094y0.m175b(527, 31, this.f14015h.f14158h)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C2619t c2619t = this.f14015h;
        sb.append(c2619t.f14154d);
        sb.append(':');
        sb.append(c2619t.f14155e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f14014g);
        sb.append('}');
        return sb.toString();
    }
}
