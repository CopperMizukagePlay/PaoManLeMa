package p128q6;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import p006a7.C0131n;
import p006a7.C0137t;
import p006a7.C0138u;
import p006a7.InterfaceC0116a0;
import p006a7.InterfaceC0127j;
import p006a7.InterfaceC0128k;
import p006a7.InterfaceC0142y;
import p031d5.C0512l;
import p060h5.C1813u;
import p068i5.AbstractC2080d;
import p099m6.AbstractC2614o;
import p099m6.C2591a;
import p099m6.C2592a0;
import p099m6.C2596c0;
import p099m6.C2598d0;
import p099m6.C2617r;
import p099m6.C2619t;
import p099m6.C2623x;
import p099m6.EnumC2624y;
import p100n.C2673p1;
import p106n6.AbstractC2721b;
import p121p6.C2886e;
import p122q.C2962y1;
import p136r6.AbstractC3069f;
import p136r6.InterfaceC3068e;
import p143s6.AbstractC3112a;
import p143s6.C3113b;
import p143s6.C3114c;
import p143s6.C3115d;
import p151t6.AbstractC3294h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q6.n */
/* loaded from: classes.dex */
public final class C3011n implements InterfaceC3068e {

    /* renamed from: a */
    public int f15534a;

    /* renamed from: b */
    public final Object f15535b;

    /* renamed from: c */
    public Object f15536c;

    /* renamed from: d */
    public Object f15537d;

    /* renamed from: e */
    public Object f15538e;

    /* renamed from: f */
    public Object f15539f;

    /* renamed from: g */
    public Object f15540g;

    public C3011n(C2591a c2591a, C2673p1 c2673p1, C3006i c3006i, AbstractC2614o abstractC2614o) {
        List m4366l;
        AbstractC3367j.m5100e(c2673p1, "routeDatabase");
        AbstractC3367j.m5100e(abstractC2614o, "eventListener");
        this.f15535b = c2591a;
        this.f15536c = c2673p1;
        this.f15537d = abstractC2614o;
        C1813u c1813u = C1813u.f10860e;
        this.f15538e = c1813u;
        this.f15539f = c1813u;
        this.f15540g = new ArrayList();
        C2619t c2619t = c2591a.f14015h;
        AbstractC3367j.m5100e(c2619t, "url");
        URI m4177g = c2619t.m4177g();
        if (m4177g.getHost() == null) {
            m4366l = AbstractC2721b.m4366l(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = c2591a.f14014g.select(m4177g);
            if (select != null && !select.isEmpty()) {
                m4366l = AbstractC2721b.m4378x(select);
            } else {
                m4366l = AbstractC2721b.m4366l(Proxy.NO_PROXY);
            }
        }
        this.f15538e = m4366l;
        this.f15534a = 0;
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: a */
    public long mo4699a(C2598d0 c2598d0) {
        if (!AbstractC3069f.m4743a(c2598d0)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(C2598d0.m4141b("Transfer-Encoding", c2598d0))) {
            return -1L;
        }
        return AbstractC2721b.m4365k(c2598d0);
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: b */
    public void mo4700b() {
        ((InterfaceC0127j) this.f15538e).flush();
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: c */
    public InterfaceC0116a0 mo4701c(C2598d0 c2598d0) {
        if (!AbstractC3069f.m4743a(c2598d0)) {
            return m4708j(0L);
        }
        if ("chunked".equalsIgnoreCase(C2598d0.m4141b("Transfer-Encoding", c2598d0))) {
            C2619t c2619t = c2598d0.f14056e.f14018a;
            if (this.f15534a == 4) {
                this.f15534a = 5;
                return new C3114c(this, c2619t);
            }
            throw new IllegalStateException(("state: " + this.f15534a).toString());
        }
        long m4365k = AbstractC2721b.m4365k(c2598d0);
        if (m4365k != -1) {
            return m4708j(m4365k);
        }
        if (this.f15534a == 4) {
            this.f15534a = 5;
            ((C3009l) this.f15536c).m4697k();
            return new AbstractC3112a(this);
        }
        throw new IllegalStateException(("state: " + this.f15534a).toString());
    }

    @Override // p136r6.InterfaceC3068e
    public void cancel() {
        Socket socket = ((C3009l) this.f15536c).f15517c;
        if (socket != null) {
            AbstractC2721b.m4359e(socket);
        }
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: d */
    public void mo4702d() {
        ((InterfaceC0127j) this.f15538e).flush();
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: e */
    public void mo4703e(C2592a0 c2592a0) {
        AbstractC3367j.m5100e(c2592a0, "request");
        Proxy.Type type = ((C3009l) this.f15536c).f15516b.f14095b.type();
        AbstractC3367j.m5099d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append(c2592a0.f14019b);
        sb.append(' ');
        C2619t c2619t = c2592a0.f14018a;
        if (!c2619t.f14159i && type == Proxy.Type.HTTP) {
            sb.append(c2619t);
        } else {
            String m4172b = c2619t.m4172b();
            String m4174d = c2619t.m4174d();
            if (m4174d != null) {
                m4172b = m4172b + '?' + m4174d;
            }
            sb.append(m4172b);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "StringBuilder().apply(builderAction).toString()");
        m4709k(c2592a0.f14020c, sb2);
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: f */
    public InterfaceC0142y mo4704f(C2592a0 c2592a0, long j6) {
        AbstractC3367j.m5100e(c2592a0, "request");
        if ("chunked".equalsIgnoreCase(c2592a0.f14020c.m4164a("Transfer-Encoding"))) {
            if (this.f15534a == 1) {
                this.f15534a = 2;
                return new C3113b(this);
            }
            throw new IllegalStateException(("state: " + this.f15534a).toString());
        }
        if (j6 != -1) {
            if (this.f15534a == 1) {
                this.f15534a = 2;
                return new C0131n(this);
            }
            throw new IllegalStateException(("state: " + this.f15534a).toString());
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: g */
    public C2596c0 mo4705g(boolean z7) {
        C2962y1 c2962y1 = (C2962y1) this.f15539f;
        int i7 = this.f15534a;
        if (i7 != 1 && i7 != 2 && i7 != 3) {
            throw new IllegalStateException(("state: " + this.f15534a).toString());
        }
        try {
            String mo271x = ((InterfaceC0128k) c2962y1.f15360b).mo271x(c2962y1.f15359a);
            c2962y1.f15359a -= mo271x.length();
            C0512l m3373A = AbstractC2080d.m3373A(mo271x);
            int i8 = m3373A.f1835b;
            C2596c0 c2596c0 = new C2596c0();
            c2596c0.f14030b = (EnumC2624y) m3373A.f1836c;
            c2596c0.f14031c = i8;
            c2596c0.f14032d = (String) m3373A.f1837d;
            c2596c0.f14034f = c2962y1.m4602a().m4166c();
            if (z7 && i8 == 100) {
                return null;
            }
            if (i8 == 100) {
                this.f15534a = 3;
                return c2596c0;
            }
            if (102 <= i8 && i8 < 200) {
                this.f15534a = 3;
                return c2596c0;
            }
            this.f15534a = 4;
            return c2596c0;
        } catch (EOFException e7) {
            throw new IOException("unexpected end of stream on ".concat(((C3009l) this.f15536c).f15516b.f14094a.f14015h.m4176f()), e7);
        }
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: h */
    public C3009l mo4706h() {
        return (C3009l) this.f15536c;
    }

    /* renamed from: i */
    public boolean m4707i() {
        if (this.f15534a < ((List) this.f15538e).size() || !((ArrayList) this.f15540g).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public C3115d m4708j(long j6) {
        if (this.f15534a == 4) {
            this.f15534a = 5;
            return new C3115d(this, j6);
        }
        throw new IllegalStateException(("state: " + this.f15534a).toString());
    }

    /* renamed from: k */
    public void m4709k(C2617r c2617r, String str) {
        InterfaceC0127j interfaceC0127j = (InterfaceC0127j) this.f15538e;
        AbstractC3367j.m5100e(str, "requestLine");
        if (this.f15534a == 0) {
            interfaceC0127j.mo242E(str).mo242E("\r\n");
            int size = c2617r.size();
            for (int i7 = 0; i7 < size; i7++) {
                interfaceC0127j.mo242E(c2617r.m4165b(i7)).mo242E(": ").mo242E(c2617r.m4167d(i7)).mo242E("\r\n");
            }
            interfaceC0127j.mo242E("\r\n");
            this.f15534a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f15534a).toString());
    }

    public C3011n(C2623x c2623x, C3009l c3009l, C0138u c0138u, C0137t c0137t) {
        AbstractC3367j.m5100e(c0138u, "source");
        AbstractC3367j.m5100e(c0137t, "sink");
        this.f15535b = c2623x;
        this.f15536c = c3009l;
        this.f15537d = c0138u;
        this.f15538e = c0137t;
        this.f15539f = new C2962y1(c0138u);
    }

    public C3011n(C2886e c2886e) {
        AbstractC3367j.m5100e(c2886e, "taskRunner");
        this.f15535b = c2886e;
        this.f15540g = AbstractC3294h.f16163a;
    }
}
