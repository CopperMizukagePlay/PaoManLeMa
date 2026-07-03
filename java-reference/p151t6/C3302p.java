package p151t6;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p006a7.C0130m;
import p006a7.InterfaceC0116a0;
import p006a7.InterfaceC0142y;
import p024c6.AbstractC0444k;
import p031d5.C0512l;
import p039e5.C0811dk;
import p060h5.AbstractC1804l;
import p068i5.AbstractC2080d;
import p092m.AbstractC2487d;
import p099m6.C2592a0;
import p099m6.C2596c0;
import p099m6.C2598d0;
import p099m6.C2617r;
import p099m6.C2619t;
import p099m6.C2623x;
import p099m6.EnumC2624y;
import p106n6.AbstractC2721b;
import p128q6.C3009l;
import p136r6.AbstractC3069f;
import p136r6.C3070g;
import p136r6.InterfaceC3068e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.p */
/* loaded from: classes.dex */
public final class C3302p implements InterfaceC3068e {

    /* renamed from: g */
    public static final List f16211g = AbstractC2721b.m4366l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h */
    public static final List f16212h = AbstractC2721b.m4366l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    public final C3009l f16213a;

    /* renamed from: b */
    public final C3070g f16214b;

    /* renamed from: c */
    public final C3301o f16215c;

    /* renamed from: d */
    public volatile C3309w f16216d;

    /* renamed from: e */
    public final EnumC2624y f16217e;

    /* renamed from: f */
    public volatile boolean f16218f;

    public C3302p(C2623x c2623x, C3009l c3009l, C3070g c3070g, C3301o c3301o) {
        AbstractC3367j.m5100e(c3301o, "http2Connection");
        this.f16213a = c3009l;
        this.f16214b = c3070g;
        this.f16215c = c3301o;
        List list = c2623x.f14217v;
        EnumC2624y enumC2624y = EnumC2624y.f14226j;
        this.f16217e = list.contains(enumC2624y) ? enumC2624y : EnumC2624y.f14225i;
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: a */
    public final long mo4699a(C2598d0 c2598d0) {
        if (!AbstractC3069f.m4743a(c2598d0)) {
            return 0L;
        }
        return AbstractC2721b.m4365k(c2598d0);
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: b */
    public final void mo4700b() {
        C3309w c3309w = this.f16216d;
        AbstractC3367j.m5097b(c3309w);
        c3309w.m5027f().close();
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: c */
    public final InterfaceC0116a0 mo4701c(C2598d0 c2598d0) {
        C3309w c3309w = this.f16216d;
        AbstractC3367j.m5097b(c3309w);
        return c3309w.f16248i;
    }

    @Override // p136r6.InterfaceC3068e
    public final void cancel() {
        this.f16218f = true;
        C3309w c3309w = this.f16216d;
        if (c3309w != null) {
            c3309w.m5026e(9);
        }
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: d */
    public final void mo4702d() {
        this.f16215c.flush();
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: e */
    public final void mo4703e(C2592a0 c2592a0) {
        boolean z7;
        int i7;
        C3309w c3309w;
        AbstractC3367j.m5100e(c2592a0, "request");
        if (this.f16216d != null) {
            return;
        }
        boolean z8 = false;
        if (c2592a0.f14021d != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        C2617r c2617r = c2592a0.f14020c;
        ArrayList arrayList = new ArrayList(c2617r.size() + 4);
        arrayList.add(new C3287b(C3287b.f16134f, c2592a0.f14019b));
        C0130m c0130m = C3287b.f16135g;
        C2619t c2619t = c2592a0.f14018a;
        AbstractC3367j.m5100e(c2619t, "url");
        String m4172b = c2619t.m4172b();
        String m4174d = c2619t.m4174d();
        if (m4174d != null) {
            m4172b = m4172b + '?' + m4174d;
        }
        arrayList.add(new C3287b(c0130m, m4172b));
        String m4164a = c2592a0.f14020c.m4164a("Host");
        if (m4164a != null) {
            arrayList.add(new C3287b(C3287b.f16137i, m4164a));
        }
        arrayList.add(new C3287b(C3287b.f16136h, c2619t.f14151a));
        int size = c2617r.size();
        for (int i8 = 0; i8 < size; i8++) {
            String m4165b = c2617r.m4165b(i8);
            Locale locale = Locale.US;
            AbstractC3367j.m5099d(locale, "US");
            String lowerCase = m4165b.toLowerCase(locale);
            AbstractC3367j.m5099d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f16211g.contains(lowerCase) || (lowerCase.equals("te") && AbstractC3367j.m5096a(c2617r.m4167d(i8), "trailers"))) {
                arrayList.add(new C3287b(lowerCase, c2617r.m4167d(i8)));
            }
        }
        C3301o c3301o = this.f16215c;
        c3301o.getClass();
        boolean z9 = !z7;
        synchronized (c3301o.f16186B) {
            synchronized (c3301o) {
                try {
                    if (c3301o.f16193i > 1073741823) {
                        c3301o.m5009f(8);
                    }
                    if (!c3301o.f16194j) {
                        i7 = c3301o.f16193i;
                        c3301o.f16193i = i7 + 2;
                        c3309w = new C3309w(i7, c3301o, z9, false, null);
                        if (!z7 || c3301o.f16209y >= c3301o.f16210z || c3309w.f16244e >= c3309w.f16245f) {
                            z8 = true;
                        }
                        if (c3309w.m5029h()) {
                            c3301o.f16190f.put(Integer.valueOf(i7), c3309w);
                        }
                    } else {
                        throw new IOException();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c3301o.f16186B.m5036h(z9, i7, arrayList);
        }
        if (z8) {
            c3301o.f16186B.flush();
        }
        this.f16216d = c3309w;
        if (!this.f16218f) {
            C3309w c3309w2 = this.f16216d;
            AbstractC3367j.m5097b(c3309w2);
            C3308v c3308v = c3309w2.f16250k;
            long j6 = this.f16214b.f15669g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c3308v.mo225g(j6, timeUnit);
            C3309w c3309w3 = this.f16216d;
            AbstractC3367j.m5097b(c3309w3);
            c3309w3.f16251l.mo225g(this.f16214b.f15670h, timeUnit);
            return;
        }
        C3309w c3309w4 = this.f16216d;
        AbstractC3367j.m5097b(c3309w4);
        c3309w4.m5026e(9);
        throw new IOException("Canceled");
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: f */
    public final InterfaceC0142y mo4704f(C2592a0 c2592a0, long j6) {
        AbstractC3367j.m5100e(c2592a0, "request");
        C3309w c3309w = this.f16216d;
        AbstractC3367j.m5097b(c3309w);
        return c3309w.m5027f();
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: g */
    public final C2596c0 mo4705g(boolean z7) {
        C2617r c2617r;
        C3309w c3309w = this.f16216d;
        if (c3309w != null) {
            synchronized (c3309w) {
                c3309w.f16250k.m233i();
                while (c3309w.f16246g.isEmpty() && c3309w.f16252m == 0) {
                    try {
                        try {
                            c3309w.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        c3309w.f16250k.m5021l();
                        throw th;
                    }
                }
                c3309w.f16250k.m5021l();
                if (!c3309w.f16246g.isEmpty()) {
                    Object removeFirst = c3309w.f16246g.removeFirst();
                    AbstractC3367j.m5099d(removeFirst, "headersQueue.removeFirst()");
                    c2617r = (C2617r) removeFirst;
                } else {
                    IOException iOException = c3309w.f16253n;
                    if (iOException == null) {
                        int i7 = c3309w.f16252m;
                        AbstractC2487d.m4047k(i7);
                        throw new C3288b0(i7);
                    }
                    throw iOException;
                }
            }
            EnumC2624y enumC2624y = this.f16217e;
            AbstractC3367j.m5100e(enumC2624y, "protocol");
            ArrayList arrayList = new ArrayList(20);
            int size = c2617r.size();
            C0512l c0512l = null;
            for (int i8 = 0; i8 < size; i8++) {
                String m4165b = c2617r.m4165b(i8);
                String m4167d = c2617r.m4167d(i8);
                if (AbstractC3367j.m5096a(m4165b, ":status")) {
                    c0512l = AbstractC2080d.m3373A("HTTP/1.1 " + m4167d);
                } else if (!f16212h.contains(m4165b)) {
                    AbstractC3367j.m5100e(m4165b, "name");
                    AbstractC3367j.m5100e(m4167d, "value");
                    arrayList.add(m4165b);
                    arrayList.add(AbstractC0444k.m956t0(m4167d).toString());
                }
            }
            if (c0512l != null) {
                C2596c0 c2596c0 = new C2596c0();
                c2596c0.f14030b = enumC2624y;
                c2596c0.f14031c = c0512l.f1835b;
                c2596c0.f14032d = (String) c0512l.f1837d;
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                C0811dk c0811dk = new C0811dk(3);
                ArrayList arrayList2 = c0811dk.f3514f;
                AbstractC3367j.m5100e(arrayList2, "<this>");
                AbstractC3367j.m5100e(strArr, "elements");
                arrayList2.addAll(AbstractC1804l.m3010C(strArr));
                c2596c0.f14034f = c0811dk;
                if (z7 && c2596c0.f14031c == 100) {
                    return null;
                }
                return c2596c0;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        throw new IOException("stream wasn't created");
    }

    @Override // p136r6.InterfaceC3068e
    /* renamed from: h */
    public final C3009l mo4706h() {
        return this.f16213a;
    }
}
