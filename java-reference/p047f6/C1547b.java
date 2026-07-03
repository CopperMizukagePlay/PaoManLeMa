package p047f6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p032d6.AbstractC0525d0;
import p032d6.C0548l;
import p032d6.InterfaceC0589y1;
import p039e5.C1279sl;
import p060h5.AbstractC1793a0;
import p065i2.AbstractC2064e;
import p069i6.AbstractC2104q;
import p069i6.AbstractC2105r;
import p098m5.AbstractC2583c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f6.b */
/* loaded from: classes.dex */
public final class C1547b implements InterfaceC0589y1 {

    /* renamed from: e */
    public Object f10132e = AbstractC1550e.f10161p;

    /* renamed from: f */
    public C0548l f10133f;

    /* renamed from: g */
    public final /* synthetic */ C1548c f10134g;

    public C1547b(C1548c c1548c) {
        this.f10134g = c1548c;
    }

    @Override // p032d6.InterfaceC0589y1
    /* renamed from: a */
    public final void mo1214a(AbstractC2104q abstractC2104q, int i7) {
        C0548l c0548l = this.f10133f;
        if (c0548l != null) {
            c0548l.mo1214a(abstractC2104q, i7);
        }
    }

    /* renamed from: b */
    public final Object m2476b(AbstractC2583c abstractC2583c) {
        C1556k c1556k;
        Object obj = this.f10132e;
        boolean z7 = true;
        if (obj == AbstractC1550e.f10161p || obj == AbstractC1550e.f10157l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1548c.f10140k;
            C1548c c1548c = this.f10134g;
            C1556k c1556k2 = (C1556k) atomicReferenceFieldUpdater.get(c1548c);
            while (true) {
                c1548c.getClass();
                if (c1548c.m2503t(C1548c.f10135f.get(c1548c), true)) {
                    this.f10132e = AbstractC1550e.f10157l;
                    Throwable m2499o = c1548c.m2499o();
                    if (m2499o == null) {
                        z7 = false;
                    } else {
                        int i7 = AbstractC2105r.f12381a;
                        throw m2499o;
                    }
                } else {
                    long andIncrement = C1548c.f10136g.getAndIncrement(c1548c);
                    long j6 = AbstractC1550e.f10147b;
                    long j7 = andIncrement / j6;
                    int i8 = (int) (andIncrement % j6);
                    if (c1556k2.f12380c != j7) {
                        c1556k = c1548c.m2498n(j7, c1556k2);
                        if (c1556k == null) {
                            continue;
                        }
                    } else {
                        c1556k = c1556k2;
                    }
                    Object m2485D = c1548c.m2485D(c1556k, i8, andIncrement, null);
                    C1279sl c1279sl = AbstractC1550e.f10158m;
                    if (m2485D != c1279sl) {
                        C1279sl c1279sl2 = AbstractC1550e.f10160o;
                        if (m2485D == c1279sl2) {
                            if (andIncrement < c1548c.m2502r()) {
                                c1556k.m3442b();
                            }
                            c1556k2 = c1556k;
                        } else {
                            if (m2485D == AbstractC1550e.f10159n) {
                                C1548c c1548c2 = this.f10134g;
                                C0548l m1136n = AbstractC0525d0.m1136n(AbstractC2064e.m3250x(abstractC2583c));
                                try {
                                    this.f10133f = m1136n;
                                    Object m2485D2 = c1548c2.m2485D(c1556k, i8, andIncrement, this);
                                    if (m2485D2 == c1279sl) {
                                        mo1214a(c1556k, i8);
                                    } else {
                                        if (m2485D2 == c1279sl2) {
                                            if (andIncrement < c1548c2.m2502r()) {
                                                c1556k.m3442b();
                                            }
                                            C1556k c1556k3 = (C1556k) C1548c.f10140k.get(c1548c2);
                                            while (true) {
                                                if (c1548c2.m2503t(C1548c.f10135f.get(c1548c2), true)) {
                                                    C0548l c0548l = this.f10133f;
                                                    AbstractC3367j.m5097b(c0548l);
                                                    this.f10133f = null;
                                                    this.f10132e = AbstractC1550e.f10157l;
                                                    Throwable m2499o2 = c1548c.m2499o();
                                                    if (m2499o2 == null) {
                                                        c0548l.mo663n(Boolean.FALSE);
                                                    } else {
                                                        c0548l.mo663n(AbstractC1793a0.m2985m(m2499o2));
                                                    }
                                                } else {
                                                    long andIncrement2 = C1548c.f10136g.getAndIncrement(c1548c2);
                                                    long j8 = AbstractC1550e.f10147b;
                                                    long j9 = andIncrement2 / j8;
                                                    int i9 = (int) (andIncrement2 % j8);
                                                    if (c1556k3.f12380c != j9) {
                                                        C1556k m2498n = c1548c2.m2498n(j9, c1556k3);
                                                        if (m2498n != null) {
                                                            c1556k3 = m2498n;
                                                        }
                                                    }
                                                    Object m2485D3 = c1548c2.m2485D(c1556k3, i9, andIncrement2, this);
                                                    if (m2485D3 == AbstractC1550e.f10158m) {
                                                        mo1214a(c1556k3, i9);
                                                        break;
                                                    }
                                                    if (m2485D3 == AbstractC1550e.f10160o) {
                                                        if (andIncrement2 < c1548c2.m2502r()) {
                                                            c1556k3.m3442b();
                                                        }
                                                    } else if (m2485D3 != AbstractC1550e.f10159n) {
                                                        c1556k3.m3442b();
                                                        this.f10132e = m2485D3;
                                                        this.f10133f = null;
                                                    } else {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                }
                                            }
                                        } else {
                                            c1556k.m3442b();
                                            this.f10132e = m2485D2;
                                            this.f10133f = null;
                                        }
                                        m1136n.mo1200r(Boolean.TRUE, null);
                                    }
                                    return m1136n.m1221t();
                                } catch (Throwable th) {
                                    m1136n.m1210D();
                                    throw th;
                                }
                            }
                            c1556k.m3442b();
                            this.f10132e = m2485D;
                        }
                    } else {
                        throw new IllegalStateException("unreachable");
                    }
                }
            }
        }
        return Boolean.valueOf(z7);
    }

    /* renamed from: c */
    public final Object m2477c() {
        Object obj = this.f10132e;
        C1279sl c1279sl = AbstractC1550e.f10161p;
        if (obj != c1279sl) {
            this.f10132e = c1279sl;
            if (obj != AbstractC1550e.f10157l) {
                return obj;
            }
            Throwable m2500p = this.f10134g.m2500p();
            int i7 = AbstractC2105r.f12381a;
            throw m2500p;
        }
        throw new IllegalStateException("`hasNext()` has not been invoked");
    }
}
