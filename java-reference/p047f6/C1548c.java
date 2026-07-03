package p047f6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.C0548l;
import p032d6.InterfaceC0542j;
import p032d6.InterfaceC0589y1;
import p039e5.C1279sl;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1806n;
import p065i2.AbstractC2064e;
import p069i6.AbstractC2088a;
import p069i6.AbstractC2089b;
import p069i6.AbstractC2104q;
import p069i6.AbstractC2105r;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p099m6.InterfaceC2611l;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f6.c */
/* loaded from: classes.dex */
public class C1548c implements InterfaceC1552g {

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f10135f = AtomicLongFieldUpdater.newUpdater(C1548c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f10136g = AtomicLongFieldUpdater.newUpdater(C1548c.class, "receivers$volatile");

    /* renamed from: h */
    public static final /* synthetic */ AtomicLongFieldUpdater f10137h = AtomicLongFieldUpdater.newUpdater(C1548c.class, "bufferEnd$volatile");

    /* renamed from: i */
    public static final /* synthetic */ AtomicLongFieldUpdater f10138i = AtomicLongFieldUpdater.newUpdater(C1548c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10139j = AtomicReferenceFieldUpdater.newUpdater(C1548c.class, Object.class, "sendSegment$volatile");

    /* renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10140k = AtomicReferenceFieldUpdater.newUpdater(C1548c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10141l = AtomicReferenceFieldUpdater.newUpdater(C1548c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10142m = AtomicReferenceFieldUpdater.newUpdater(C1548c.class, Object.class, "_closeCause$volatile");

    /* renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10143n = AtomicReferenceFieldUpdater.newUpdater(C1548c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: e */
    public final int f10144e;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public C1548c(int i7) {
        long j6;
        this.f10144e = i7;
        if (i7 >= 0) {
            C1556k c1556k = AbstractC1550e.f10146a;
            if (i7 != 0) {
                if (i7 != Integer.MAX_VALUE) {
                    j6 = i7;
                } else {
                    j6 = Long.MAX_VALUE;
                }
            } else {
                j6 = 0;
            }
            this.bufferEnd$volatile = j6;
            this.completedExpandBuffersAndPauseFlag$volatile = f10137h.get(this);
            C1556k c1556k2 = new C1556k(0L, null, this, 3);
            this.sendSegment$volatile = c1556k2;
            this.receiveSegment$volatile = c1556k2;
            if (m2506w()) {
                c1556k2 = AbstractC1550e.f10146a;
                AbstractC3367j.m5098c(c1556k2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = c1556k2;
            this._closeCause$volatile = AbstractC1550e.f10164s;
            return;
        }
        throw new IllegalArgumentException(AbstractC0094y0.m184k(i7, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    /* renamed from: C */
    public static boolean m2478C(Object obj) {
        if (obj instanceof InterfaceC0542j) {
            InterfaceC0542j interfaceC0542j = (InterfaceC0542j) obj;
            C1556k c1556k = AbstractC1550e.f10146a;
            C1279sl mo1198e = interfaceC0542j.mo1198e(C1694m.f10482a, null);
            if (mo1198e != null) {
                interfaceC0542j.mo1197C(mo1198e);
                return true;
            }
            return false;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* renamed from: b */
    public static final C1556k m2479b(C1548c c1548c, long j6, C1556k c1556k) {
        Object m3431b;
        C1548c c1548c2;
        C1556k c1556k2 = AbstractC1550e.f10146a;
        C1549d c1549d = C1549d.f10145m;
        loop0: while (true) {
            m3431b = AbstractC2088a.m3431b(c1556k, j6, c1549d);
            if (!AbstractC2088a.m3434e(m3431b)) {
                AbstractC2104q m3432c = AbstractC2088a.m3432c(m3431b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10139j;
                    AbstractC2104q abstractC2104q = (AbstractC2104q) atomicReferenceFieldUpdater.get(c1548c);
                    if (abstractC2104q.f12380c >= m3432c.f12380c) {
                        break loop0;
                    }
                    if (!m3432c.m3464j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c1548c, abstractC2104q, m3432c)) {
                        if (atomicReferenceFieldUpdater.get(c1548c) != abstractC2104q) {
                            if (m3432c.m3462f()) {
                                m3432c.m3445e();
                            }
                        }
                    }
                    if (abstractC2104q.m3462f()) {
                        abstractC2104q.m3445e();
                    }
                }
            } else {
                break;
            }
        }
        boolean m3434e = AbstractC2088a.m3434e(m3431b);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10136g;
        if (m3434e) {
            c1548c.m2493i();
            if (c1556k.f12380c * AbstractC1550e.f10147b < atomicLongFieldUpdater.get(c1548c)) {
                c1556k.m3442b();
                return null;
            }
        } else {
            C1556k c1556k3 = (C1556k) AbstractC2088a.m3432c(m3431b);
            long j7 = c1556k3.f12380c;
            if (j7 > j6) {
                long j8 = AbstractC1550e.f10147b * j7;
                while (true) {
                    long j9 = f10135f.get(c1548c);
                    long j10 = 1152921504606846975L & j9;
                    if (j10 >= j8) {
                        c1548c2 = c1548c;
                        break;
                    }
                    c1548c2 = c1548c;
                    if (f10135f.compareAndSet(c1548c2, j9, (((int) (j9 >> 60)) << 60) + j10)) {
                        break;
                    }
                    c1548c = c1548c2;
                }
                if (j7 * AbstractC1550e.f10147b < atomicLongFieldUpdater.get(c1548c2)) {
                    c1556k3.m3442b();
                }
            } else {
                return c1556k3;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final void m2480d(C1548c c1548c, Object obj, C0548l c0548l) {
        c0548l.mo663n(AbstractC1793a0.m2985m(c1548c.m2501q()));
    }

    /* renamed from: e */
    public static final int m2481e(C1548c c1548c, C1556k c1556k, int i7, Object obj, long j6, Object obj2, boolean z7) {
        c1556k.m2516n(i7, obj);
        if (z7) {
            return c1548c.m2486E(c1556k, i7, obj, j6, obj2, z7);
        }
        Object m2514l = c1556k.m2514l(i7);
        if (m2514l == null) {
            if (c1548c.m2490f(j6)) {
                if (c1556k.m2513k(i7, null, AbstractC1550e.f10149d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c1556k.m2513k(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (m2514l instanceof InterfaceC0589y1) {
            c1556k.m2516n(i7, null);
            if (c1548c.m2484B(m2514l, obj)) {
                c1556k.m2517o(i7, AbstractC1550e.f10154i);
                return 0;
            }
            C1279sl c1279sl = AbstractC1550e.f10156k;
            if (c1556k.f10171f.getAndSet((i7 * 2) + 1, c1279sl) != c1279sl) {
                c1556k.m2515m(i7, true);
                return 5;
            }
            return 5;
        }
        return c1548c.m2486E(c1556k, i7, obj, j6, obj2, z7);
    }

    /* renamed from: s */
    public static void m2482s(C1548c c1548c) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10138i;
        if ((atomicLongFieldUpdater.addAndGet(c1548c, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(c1548c) & 4611686018427387904L) != 0);
    }

    /* renamed from: A */
    public final void m2483A(InterfaceC0589y1 interfaceC0589y1, boolean z7) {
        Throwable m2501q;
        if (interfaceC0589y1 instanceof InterfaceC0542j) {
            InterfaceC2313c interfaceC2313c = (InterfaceC2313c) interfaceC0589y1;
            if (z7) {
                m2501q = m2500p();
            } else {
                m2501q = m2501q();
            }
            interfaceC2313c.mo663n(AbstractC1793a0.m2985m(m2501q));
            return;
        }
        if (interfaceC0589y1 instanceof C1547b) {
            C1547b c1547b = (C1547b) interfaceC0589y1;
            C0548l c0548l = c1547b.f10133f;
            AbstractC3367j.m5097b(c0548l);
            c1547b.f10133f = null;
            c1547b.f10132e = AbstractC1550e.f10157l;
            Throwable m2499o = c1547b.f10134g.m2499o();
            if (m2499o == null) {
                c0548l.mo663n(Boolean.FALSE);
                return;
            } else {
                c0548l.mo663n(AbstractC1793a0.m2985m(m2499o));
                return;
            }
        }
        throw new IllegalStateException(("Unexpected waiter: " + interfaceC0589y1).toString());
    }

    /* renamed from: B */
    public final boolean m2484B(Object obj, Object obj2) {
        if (obj instanceof C1547b) {
            C1547b c1547b = (C1547b) obj;
            C0548l c0548l = c1547b.f10133f;
            AbstractC3367j.m5097b(c0548l);
            c1547b.f10133f = null;
            c1547b.f10132e = obj2;
            Boolean bool = Boolean.TRUE;
            c1547b.f10134g.getClass();
            C1556k c1556k = AbstractC1550e.f10146a;
            C1279sl mo1198e = c0548l.mo1198e(bool, null);
            if (mo1198e == null) {
                return false;
            }
            c0548l.mo1197C(mo1198e);
            return true;
        }
        if (obj instanceof InterfaceC0542j) {
            InterfaceC0542j interfaceC0542j = (InterfaceC0542j) obj;
            C1556k c1556k2 = AbstractC1550e.f10146a;
            C1279sl mo1198e2 = interfaceC0542j.mo1198e(obj2, null);
            if (mo1198e2 == null) {
                return false;
            }
            interfaceC0542j.mo1197C(mo1198e2);
            return true;
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    /* renamed from: D */
    public final Object m2485D(C1556k c1556k, int i7, long j6, Object obj) {
        AtomicReferenceArray atomicReferenceArray = c1556k.f10171f;
        Object m2514l = c1556k.m2514l(i7);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10135f;
        if (m2514l == null) {
            if (j6 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC1550e.f10159n;
                }
                if (c1556k.m2513k(i7, m2514l, obj)) {
                    m2497m();
                    return AbstractC1550e.f10158m;
                }
            }
        } else if (m2514l == AbstractC1550e.f10149d && c1556k.m2513k(i7, m2514l, AbstractC1550e.f10154i)) {
            m2497m();
            Object obj2 = atomicReferenceArray.get(i7 * 2);
            c1556k.m2516n(i7, null);
            return obj2;
        }
        while (true) {
            Object m2514l2 = c1556k.m2514l(i7);
            if (m2514l2 != null && m2514l2 != AbstractC1550e.f10150e) {
                if (m2514l2 == AbstractC1550e.f10149d) {
                    if (c1556k.m2513k(i7, m2514l2, AbstractC1550e.f10154i)) {
                        m2497m();
                        Object obj3 = atomicReferenceArray.get(i7 * 2);
                        c1556k.m2516n(i7, null);
                        return obj3;
                    }
                } else {
                    C1279sl c1279sl = AbstractC1550e.f10155j;
                    if (m2514l2 == c1279sl) {
                        return AbstractC1550e.f10160o;
                    }
                    if (m2514l2 == AbstractC1550e.f10153h) {
                        return AbstractC1550e.f10160o;
                    }
                    if (m2514l2 == AbstractC1550e.f10157l) {
                        m2497m();
                        return AbstractC1550e.f10160o;
                    }
                    if (m2514l2 != AbstractC1550e.f10152g && c1556k.m2513k(i7, m2514l2, AbstractC1550e.f10151f)) {
                        boolean z7 = m2514l2 instanceof C1564s;
                        if (z7) {
                            m2514l2 = ((C1564s) m2514l2).f10174a;
                        }
                        if (m2478C(m2514l2)) {
                            c1556k.m2517o(i7, AbstractC1550e.f10154i);
                            m2497m();
                            Object obj4 = atomicReferenceArray.get(i7 * 2);
                            c1556k.m2516n(i7, null);
                            return obj4;
                        }
                        c1556k.m2517o(i7, c1279sl);
                        c1556k.m3463i();
                        if (z7) {
                            m2497m();
                        }
                        return AbstractC1550e.f10160o;
                    }
                }
            } else if (j6 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (c1556k.m2513k(i7, m2514l2, AbstractC1550e.f10153h)) {
                    m2497m();
                    return AbstractC1550e.f10160o;
                }
            } else {
                if (obj == null) {
                    return AbstractC1550e.f10159n;
                }
                if (c1556k.m2513k(i7, m2514l2, obj)) {
                    m2497m();
                    return AbstractC1550e.f10158m;
                }
            }
        }
    }

    /* renamed from: E */
    public final int m2486E(C1556k c1556k, int i7, Object obj, long j6, Object obj2, boolean z7) {
        while (true) {
            Object m2514l = c1556k.m2514l(i7);
            if (m2514l == null) {
                if (m2490f(j6) && !z7) {
                    if (c1556k.m2513k(i7, null, AbstractC1550e.f10149d)) {
                        break;
                    }
                } else if (z7) {
                    if (c1556k.m2513k(i7, null, AbstractC1550e.f10155j)) {
                        c1556k.m3463i();
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (c1556k.m2513k(i7, null, obj2)) {
                        return 2;
                    }
                }
            } else if (m2514l == AbstractC1550e.f10150e) {
                if (c1556k.m2513k(i7, m2514l, AbstractC1550e.f10149d)) {
                    break;
                }
            } else {
                C1279sl c1279sl = AbstractC1550e.f10156k;
                if (m2514l == c1279sl) {
                    c1556k.m2516n(i7, null);
                    return 5;
                }
                if (m2514l == AbstractC1550e.f10153h) {
                    c1556k.m2516n(i7, null);
                    return 5;
                }
                if (m2514l == AbstractC1550e.f10157l) {
                    c1556k.m2516n(i7, null);
                    m2493i();
                    return 4;
                }
                c1556k.m2516n(i7, null);
                if (m2514l instanceof C1564s) {
                    m2514l = ((C1564s) m2514l).f10174a;
                }
                if (m2484B(m2514l, obj)) {
                    c1556k.m2517o(i7, AbstractC1550e.f10154i);
                    return 0;
                }
                if (c1556k.f10171f.getAndSet((i7 * 2) + 1, c1279sl) != c1279sl) {
                    c1556k.m2515m(i7, true);
                }
                return 5;
            }
        }
        return 1;
    }

    /* renamed from: F */
    public final void m2487F(long j6) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z7;
        C1548c c1548c = this;
        if (!c1548c.m2506w()) {
            while (true) {
                atomicLongFieldUpdater = f10137h;
                if (atomicLongFieldUpdater.get(c1548c) > j6) {
                    break;
                } else {
                    c1548c = this;
                }
            }
            int i7 = AbstractC1550e.f10148c;
            int i8 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10138i;
                if (i8 < i7) {
                    long j7 = atomicLongFieldUpdater.get(c1548c);
                    if (j7 != (4611686018427387903L & atomicLongFieldUpdater2.get(c1548c)) || j7 != atomicLongFieldUpdater.get(c1548c)) {
                        i8++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j8 = atomicLongFieldUpdater2.get(c1548c);
                        if (atomicLongFieldUpdater2.compareAndSet(c1548c, j8, (j8 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        } else {
                            c1548c = this;
                        }
                    }
                    while (true) {
                        long j9 = atomicLongFieldUpdater.get(c1548c);
                        long j10 = atomicLongFieldUpdater2.get(c1548c);
                        long j11 = j10 & 4611686018427387903L;
                        if ((j10 & 4611686018427387904L) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (j9 == j11 && j9 == atomicLongFieldUpdater.get(c1548c)) {
                            break;
                        }
                        if (!z7) {
                            c1548c = this;
                            atomicLongFieldUpdater2.compareAndSet(c1548c, j10, 4611686018427387904L + j11);
                        } else {
                            c1548c = this;
                        }
                    }
                    while (true) {
                        long j12 = atomicLongFieldUpdater2.get(c1548c);
                        if (atomicLongFieldUpdater2.compareAndSet(c1548c, j12, j12 & 4611686018427387903L)) {
                            return;
                        } else {
                            c1548c = this;
                        }
                    }
                }
            }
        }
    }

    @Override // p047f6.InterfaceC1563r
    /* renamed from: a */
    public final boolean mo2488a(Throwable th) {
        return m2491g(th, false);
    }

    @Override // p047f6.InterfaceC1562q
    /* renamed from: c */
    public final void mo2489c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m2491g(cancellationException, true);
    }

    /* renamed from: f */
    public final boolean m2490f(long j6) {
        if (j6 >= f10137h.get(this) && j6 >= f10136g.get(this) + this.f10144e) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r6.compareAndSet(r12, r5, r13) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r6.get(r12) == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r14 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r3.compareAndSet(r4, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        m2493i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r10 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r13 = p047f6.C1548c.f10143n;
        r14 = r13.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r0 = p047f6.AbstractC1550e.f10162q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r13.compareAndSet(r12, r14, r0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r13.get(r12) == r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r14 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        p158u5.AbstractC3382y.m5111b(1, r14);
        ((p150t5.InterfaceC3279c) r14).mo23f(m2499o());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r0 = p047f6.AbstractC1550e.f10163r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004c, code lost:
    
        r5 = r3.get(r12);
        r13 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        if (r13 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r13 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0058, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        if (r3.compareAndSet(r4, r5, (r7 << 60) + r13) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002f, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0024, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = p047f6.AbstractC1550e.f10146a;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r3.compareAndSet(r4, r5, (r5 & 1152921504606846975L) + (1 << 60)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r5 = p047f6.AbstractC1550e.f10164s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r6 = p047f6.C1548c.f10142m;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2491g(Throwable th, boolean z7) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10135f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (p047f6.C1556k) ((p069i6.AbstractC2089b) p069i6.AbstractC2089b.f12348b.get(r1));
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1556k m2492h(long j6) {
        Object obj;
        long j7;
        Object obj2 = f10141l.get(this);
        C1556k c1556k = (C1556k) f10139j.get(this);
        if (c1556k.f12380c > ((C1556k) obj2).f12380c) {
            obj2 = c1556k;
        }
        C1556k c1556k2 = (C1556k) f10140k.get(this);
        if (c1556k2.f12380c > ((C1556k) obj2).f12380c) {
            obj2 = c1556k2;
        }
        AbstractC2089b abstractC2089b = (AbstractC2089b) obj2;
        loop0: while (true) {
            abstractC2089b.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC2089b.f12347a;
            Object obj3 = atomicReferenceFieldUpdater.get(abstractC2089b);
            C1279sl c1279sl = AbstractC2088a.f12340a;
            obj = null;
            if (obj3 == c1279sl) {
                break;
            }
            AbstractC2089b abstractC2089b2 = (AbstractC2089b) obj3;
            if (abstractC2089b2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC2089b, null, c1279sl)) {
                    if (atomicReferenceFieldUpdater.get(abstractC2089b) != null) {
                        break;
                    }
                }
                break loop0;
            }
            abstractC2089b = abstractC2089b2;
        }
        C1556k c1556k3 = (C1556k) abstractC2089b;
        if (mo2504u()) {
            C1556k c1556k4 = c1556k3;
            loop2: do {
                int i7 = AbstractC1550e.f10147b - 1;
                while (true) {
                    if (-1 >= i7) {
                        break;
                    }
                    j7 = (c1556k4.f12380c * AbstractC1550e.f10147b) + i7;
                    if (j7 < f10136g.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object m2514l = c1556k4.m2514l(i7);
                        if (m2514l != null && m2514l != AbstractC1550e.f10150e) {
                            if (m2514l == AbstractC1550e.f10149d) {
                                break loop2;
                            }
                        } else if (c1556k4.m2513k(i7, m2514l, AbstractC1550e.f10157l)) {
                            c1556k4.m3463i();
                            break;
                        }
                    }
                    i7--;
                }
            } while (c1556k4 != null);
            j7 = -1;
            if (j7 != -1) {
                m2494j(j7);
            }
        }
        loop5: for (C1556k c1556k5 = c1556k3; c1556k5 != null; c1556k5 = (C1556k) ((AbstractC2089b) AbstractC2089b.f12348b.get(c1556k5))) {
            for (int i8 = AbstractC1550e.f10147b - 1; -1 < i8; i8--) {
                if ((c1556k5.f12380c * AbstractC1550e.f10147b) + i8 < j6) {
                    break loop5;
                }
                while (true) {
                    Object m2514l2 = c1556k5.m2514l(i8);
                    if (m2514l2 != null && m2514l2 != AbstractC1550e.f10150e) {
                        if (m2514l2 instanceof C1564s) {
                            if (c1556k5.m2513k(i8, m2514l2, AbstractC1550e.f10157l)) {
                                obj = AbstractC2088a.m3435f(obj, ((C1564s) m2514l2).f10174a);
                                c1556k5.m2515m(i8, true);
                                break;
                            }
                        } else {
                            if (!(m2514l2 instanceof InterfaceC0589y1)) {
                                break;
                            }
                            if (c1556k5.m2513k(i8, m2514l2, AbstractC1550e.f10157l)) {
                                obj = AbstractC2088a.m3435f(obj, m2514l2);
                                c1556k5.m2515m(i8, true);
                                break;
                            }
                        }
                    } else if (c1556k5.m2513k(i8, m2514l2, AbstractC1550e.f10157l)) {
                        c1556k5.m3463i();
                        break;
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                m2483A((InterfaceC0589y1) obj, true);
                return c1556k3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m2483A((InterfaceC0589y1) arrayList.get(size), true);
            }
        }
        return c1556k3;
    }

    /* renamed from: i */
    public final void m2493i() {
        m2503t(f10135f.get(this), false);
    }

    @Override // p047f6.InterfaceC1562q
    public final C1547b iterator() {
        return new C1547b(this);
    }

    /* renamed from: j */
    public final void m2494j(long j6) {
        C1556k c1556k = (C1556k) f10140k.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10136g;
            long j7 = atomicLongFieldUpdater.get(this);
            if (j6 < Math.max(this.f10144e + j7, f10137h.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j7, 1 + j7)) {
                long j8 = AbstractC1550e.f10147b;
                long j9 = j7 / j8;
                int i7 = (int) (j7 % j8);
                if (c1556k.f12380c != j9) {
                    C1556k m2498n = m2498n(j9, c1556k);
                    if (m2498n != null) {
                        c1556k = m2498n;
                    }
                }
                C1556k c1556k2 = c1556k;
                if (m2485D(c1556k2, i7, j7, null) == AbstractC1550e.f10160o) {
                    if (j7 < m2502r()) {
                        c1556k2.m3442b();
                    }
                } else {
                    c1556k2.m3442b();
                }
                c1556k = c1556k2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        m2480d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163 A[RETURN] */
    @Override // p047f6.InterfaceC1563r
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo2495k(Object obj, InterfaceC2313c interfaceC2313c) {
        Object m1221t;
        Object obj2;
        C1548c c1548c;
        C1556k c1556k;
        int i7;
        C1548c c1548c2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10139j;
        C1556k c1556k2 = (C1556k) atomicReferenceFieldUpdater.get(c1548c2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10135f;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c1548c2);
            long j6 = andIncrement & 1152921504606846975L;
            boolean m2503t = c1548c2.m2503t(andIncrement, false);
            int i8 = AbstractC1550e.f10147b;
            long j7 = i8;
            long j8 = j6 / j7;
            int i9 = (int) (j6 % j7);
            long j9 = c1556k2.f12380c;
            EnumC2465a enumC2465a = EnumC2465a.f13750e;
            C1694m c1694m = C1694m.f10482a;
            if (j9 != j8) {
                C1556k m2479b = m2479b(c1548c2, j8, c1556k2);
                if (m2479b == null) {
                    if (m2503t) {
                        Object m2509z = m2509z(obj, interfaceC2313c);
                        if (m2509z == enumC2465a) {
                            return m2509z;
                        }
                    }
                } else {
                    c1556k2 = m2479b;
                }
            }
            int m2481e = m2481e(c1548c2, c1556k2, i9, obj, j6, null, m2503t);
            if (m2481e != 0) {
                if (m2481e == 1) {
                    break;
                }
                if (m2481e != 2) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10136g;
                    if (m2481e != 3) {
                        if (m2481e != 4) {
                            if (m2481e == 5) {
                                c1556k2.m3442b();
                            }
                        } else {
                            if (j6 < atomicLongFieldUpdater2.get(c1548c2)) {
                                c1556k2.m3442b();
                            }
                            Object m2509z2 = m2509z(obj, interfaceC2313c);
                            if (m2509z2 == enumC2465a) {
                                return m2509z2;
                            }
                        }
                    } else {
                        C0548l m1136n = AbstractC0525d0.m1136n(AbstractC2064e.m3250x(interfaceC2313c));
                        Object obj3 = obj;
                        try {
                            int m2481e2 = m2481e(c1548c2, c1556k2, i9, obj3, j6, m1136n, false);
                            try {
                                if (m2481e2 != 0) {
                                    if (m2481e2 != 1) {
                                        if (m2481e2 != 2) {
                                            if (m2481e2 != 4) {
                                                String str = "unexpected";
                                                if (m2481e2 == 5) {
                                                    c1556k2.m3442b();
                                                    C1556k c1556k3 = (C1556k) atomicReferenceFieldUpdater.get(c1548c2);
                                                    while (true) {
                                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c1548c2);
                                                        long j10 = andIncrement2 & 1152921504606846975L;
                                                        boolean m2503t2 = c1548c2.m2503t(andIncrement2, false);
                                                        int i10 = AbstractC1550e.f10147b;
                                                        long j11 = i10;
                                                        String str2 = str;
                                                        long j12 = j10 / j11;
                                                        int i11 = (int) (j10 % j11);
                                                        if (c1556k3.f12380c != j12) {
                                                            C1556k m2479b2 = m2479b(c1548c2, j12, c1556k3);
                                                            if (m2479b2 == null) {
                                                                if (m2503t2) {
                                                                    break;
                                                                }
                                                                str = str2;
                                                            } else {
                                                                i7 = i10;
                                                                c1556k = m2479b2;
                                                            }
                                                        } else {
                                                            c1556k = c1556k3;
                                                            i7 = i10;
                                                        }
                                                        int m2481e3 = m2481e(c1548c2, c1556k, i11, obj3, j10, m1136n, m2503t2);
                                                        Object obj4 = obj3;
                                                        c1548c = c1548c2;
                                                        C1556k c1556k4 = c1556k;
                                                        obj2 = obj4;
                                                        if (m2481e3 != 0) {
                                                            if (m2481e3 == 1) {
                                                                break;
                                                            }
                                                            if (m2481e3 != 2) {
                                                                if (m2481e3 != 3) {
                                                                    if (m2481e3 != 4) {
                                                                        if (m2481e3 == 5) {
                                                                            c1556k4.m3442b();
                                                                        }
                                                                        c1556k3 = c1556k4;
                                                                        c1548c2 = c1548c;
                                                                        str = str2;
                                                                        obj3 = obj2;
                                                                    } else if (j10 < atomicLongFieldUpdater2.get(c1548c)) {
                                                                        c1556k4.m3442b();
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException(str2);
                                                                }
                                                            } else if (m2503t2) {
                                                                c1556k4.m3463i();
                                                            } else {
                                                                m1136n.mo1214a(c1556k4, i11 + i7);
                                                            }
                                                        } else {
                                                            c1556k4.m3442b();
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                            } else {
                                                obj2 = obj3;
                                                c1548c = c1548c2;
                                                if (j6 < atomicLongFieldUpdater2.get(c1548c)) {
                                                    c1556k2.m3442b();
                                                }
                                            }
                                            m2480d(c1548c, obj2, m1136n);
                                        } else {
                                            m1136n.mo1214a(c1556k2, i9 + i8);
                                        }
                                    } else {
                                        m1136n.mo663n(c1694m);
                                    }
                                    m1221t = m1136n.m1221t();
                                    if (m1221t != enumC2465a) {
                                        m1221t = c1694m;
                                    }
                                    if (m1221t != enumC2465a) {
                                        return m1221t;
                                    }
                                } else {
                                    c1556k2.m3442b();
                                }
                                m1136n.mo663n(c1694m);
                                m1221t = m1136n.m1221t();
                                if (m1221t != enumC2465a) {
                                }
                                if (m1221t != enumC2465a) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                m1136n.m1210D();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } else if (m2503t) {
                    c1556k2.m3463i();
                    Object m2509z3 = m2509z(obj, interfaceC2313c);
                    if (m2509z3 == enumC2465a) {
                        return m2509z3;
                    }
                }
            } else {
                c1556k2.m3442b();
                return c1694m;
            }
        }
    }

    @Override // p047f6.InterfaceC1562q
    /* renamed from: l */
    public final Object mo2496l() {
        C1556k c1556k;
        InterfaceC0589y1 interfaceC0589y1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10136g;
        long j6 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10135f;
        long j7 = atomicLongFieldUpdater2.get(this);
        if (m2503t(j7, true)) {
            return new C1553h(m2499o());
        }
        long j8 = j7 & 1152921504606846975L;
        C1554i c1554i = AbstractC1555j.f10169a;
        if (j6 >= j8) {
            return c1554i;
        }
        Object obj = AbstractC1550e.f10156k;
        C1556k c1556k2 = (C1556k) f10140k.get(this);
        while (!m2503t(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j9 = AbstractC1550e.f10147b;
            long j10 = andIncrement / j9;
            int i7 = (int) (andIncrement % j9);
            if (c1556k2.f12380c != j10) {
                C1556k m2498n = m2498n(j10, c1556k2);
                if (m2498n == null) {
                    continue;
                } else {
                    c1556k = m2498n;
                }
            } else {
                c1556k = c1556k2;
            }
            Object m2485D = m2485D(c1556k, i7, andIncrement, obj);
            C1556k c1556k3 = c1556k;
            if (m2485D == AbstractC1550e.f10158m) {
                if (obj instanceof InterfaceC0589y1) {
                    interfaceC0589y1 = (InterfaceC0589y1) obj;
                } else {
                    interfaceC0589y1 = null;
                }
                if (interfaceC0589y1 != null) {
                    interfaceC0589y1.mo1214a(c1556k3, i7);
                }
                m2487F(andIncrement);
                c1556k3.m3463i();
                return c1554i;
            }
            if (m2485D == AbstractC1550e.f10160o) {
                if (andIncrement < m2502r()) {
                    c1556k3.m3442b();
                }
                c1556k2 = c1556k3;
            } else {
                if (m2485D != AbstractC1550e.f10159n) {
                    c1556k3.m3442b();
                    return m2485D;
                }
                throw new IllegalStateException("unexpected");
            }
        }
        return new C1553h(m2499o());
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00bd, code lost:
    
        if ((r0.addAndGet(r15, r4 - r8) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00c6, code lost:
    
        if ((r0.get(r15) & 4611686018427387904L) == 0) goto L144;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2497m() {
        Object m3431b;
        if (m2506w()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10141l;
        C1556k c1556k = (C1556k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f10137h.getAndIncrement(this);
            long j6 = andIncrement / AbstractC1550e.f10147b;
            if (m2502r() <= andIncrement) {
                if (c1556k.f12380c < j6 && c1556k.m3443c() != null) {
                    m2508y(j6, c1556k);
                }
                m2482s(this);
                return;
            }
            if (c1556k.f12380c != j6) {
                C1549d c1549d = C1549d.f10145m;
                while (true) {
                    m3431b = AbstractC2088a.m3431b(c1556k, j6, c1549d);
                    if (!AbstractC2088a.m3434e(m3431b)) {
                        AbstractC2104q m3432c = AbstractC2088a.m3432c(m3431b);
                        while (true) {
                            AbstractC2104q abstractC2104q = (AbstractC2104q) atomicReferenceFieldUpdater.get(this);
                            if (abstractC2104q.f12380c >= m3432c.f12380c) {
                                break;
                            }
                            if (!m3432c.m3464j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC2104q, m3432c)) {
                                if (atomicReferenceFieldUpdater.get(this) != abstractC2104q) {
                                    if (m3432c.m3462f()) {
                                        m3432c.m3445e();
                                    }
                                }
                            }
                            if (abstractC2104q.m3462f()) {
                                abstractC2104q.m3445e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                C1556k c1556k2 = null;
                if (AbstractC2088a.m3434e(m3431b)) {
                    m2493i();
                    m2508y(j6, c1556k);
                    m2482s(this);
                } else {
                    C1556k c1556k3 = (C1556k) AbstractC2088a.m3432c(m3431b);
                    long j7 = c1556k3.f12380c;
                    if (j7 > j6) {
                        long j8 = j7 * AbstractC1550e.f10147b;
                        if (f10137h.compareAndSet(this, 1 + andIncrement, j8)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f10138i;
                        } else {
                            m2482s(this);
                        }
                    } else {
                        c1556k2 = c1556k3;
                    }
                }
                if (c1556k2 == null) {
                    continue;
                } else {
                    c1556k = c1556k2;
                }
            }
            int i7 = (int) (andIncrement % AbstractC1550e.f10147b);
            Object m2514l = c1556k.m2514l(i7);
            boolean z7 = m2514l instanceof InterfaceC0589y1;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10136g;
            if (!z7 || andIncrement < atomicLongFieldUpdater2.get(this) || !c1556k.m2513k(i7, m2514l, AbstractC1550e.f10152g)) {
                while (true) {
                    Object m2514l2 = c1556k.m2514l(i7);
                    if (m2514l2 instanceof InterfaceC0589y1) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (c1556k.m2513k(i7, m2514l2, new C1564s((InterfaceC0589y1) m2514l2))) {
                                break loop0;
                            }
                        } else if (c1556k.m2513k(i7, m2514l2, AbstractC1550e.f10152g)) {
                            if (m2478C(m2514l2)) {
                                c1556k.m2517o(i7, AbstractC1550e.f10149d);
                                break;
                            } else {
                                c1556k.m2517o(i7, AbstractC1550e.f10155j);
                                c1556k.m3463i();
                            }
                        }
                    } else if (m2514l2 != AbstractC1550e.f10155j) {
                        if (m2514l2 == null) {
                            if (c1556k.m2513k(i7, m2514l2, AbstractC1550e.f10150e)) {
                                break loop0;
                            }
                        } else {
                            if (m2514l2 == AbstractC1550e.f10149d || m2514l2 == AbstractC1550e.f10153h || m2514l2 == AbstractC1550e.f10154i || m2514l2 == AbstractC1550e.f10156k || m2514l2 == AbstractC1550e.f10157l) {
                                break loop0;
                            }
                            if (m2514l2 != AbstractC1550e.f10151f) {
                                throw new IllegalStateException(("Unexpected cell state: " + m2514l2).toString());
                            }
                        }
                    } else {
                        break;
                    }
                }
            } else if (m2478C(m2514l)) {
                c1556k.m2517o(i7, AbstractC1550e.f10149d);
                break;
            } else {
                c1556k.m2517o(i7, AbstractC1550e.f10155j);
                c1556k.m3463i();
                m2482s(this);
            }
        }
        m2482s(this);
    }

    /* renamed from: n */
    public final C1556k m2498n(long j6, C1556k c1556k) {
        Object m3431b;
        long j7;
        C1556k c1556k2 = AbstractC1550e.f10146a;
        C1549d c1549d = C1549d.f10145m;
        loop0: while (true) {
            m3431b = AbstractC2088a.m3431b(c1556k, j6, c1549d);
            if (!AbstractC2088a.m3434e(m3431b)) {
                AbstractC2104q m3432c = AbstractC2088a.m3432c(m3431b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10140k;
                    AbstractC2104q abstractC2104q = (AbstractC2104q) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2104q.f12380c >= m3432c.f12380c) {
                        break loop0;
                    }
                    if (!m3432c.m3464j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC2104q, m3432c)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC2104q) {
                            if (m3432c.m3462f()) {
                                m3432c.m3445e();
                            }
                        }
                    }
                    if (abstractC2104q.m3462f()) {
                        abstractC2104q.m3445e();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC2088a.m3434e(m3431b)) {
            m2493i();
            if (c1556k.f12380c * AbstractC1550e.f10147b < m2502r()) {
                c1556k.m3442b();
                return null;
            }
        } else {
            C1556k c1556k3 = (C1556k) AbstractC2088a.m3432c(m3431b);
            long j8 = c1556k3.f12380c;
            if (!m2506w() && j6 <= f10137h.get(this) / AbstractC1550e.f10147b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10141l;
                    AbstractC2104q abstractC2104q2 = (AbstractC2104q) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC2104q2.f12380c >= j8) {
                        break;
                    }
                    if (!c1556k3.m3464j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC2104q2, c1556k3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != abstractC2104q2) {
                            if (c1556k3.m3462f()) {
                                c1556k3.m3445e();
                            }
                        }
                    }
                    if (abstractC2104q2.m3462f()) {
                        abstractC2104q2.m3445e();
                    }
                }
            }
            if (j8 > j6) {
                long j9 = j8 * AbstractC1550e.f10147b;
                do {
                    j7 = f10136g.get(this);
                    if (j7 >= j9) {
                        break;
                    }
                } while (!f10136g.compareAndSet(this, j7, j9));
                if (j8 * AbstractC1550e.f10147b < m2502r()) {
                    c1556k3.m3442b();
                }
            } else {
                return c1556k3;
            }
        }
        return null;
    }

    /* renamed from: o */
    public final Throwable m2499o() {
        return (Throwable) f10142m.get(this);
    }

    /* renamed from: p */
    public final Throwable m2500p() {
        Throwable m2499o = m2499o();
        if (m2499o == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return m2499o;
    }

    /* renamed from: q */
    public final Throwable m2501q() {
        Throwable m2499o = m2499o();
        if (m2499o == null) {
            return new IllegalStateException("Channel was closed");
        }
        return m2499o;
    }

    /* renamed from: r */
    public final long m2502r() {
        return f10135f.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (p047f6.C1556k) ((p069i6.AbstractC2089b) p069i6.AbstractC2089b.f12348b.get(r0));
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2503t(long j6, boolean z7) {
        InterfaceC0589y1 interfaceC0589y1;
        int i7 = (int) (j6 >> 60);
        if (i7 != 0 && i7 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10136g;
            if (i7 != 2) {
                if (i7 == 3) {
                    C1556k m2492h = m2492h(1152921504606846975L & j6);
                    Object obj = null;
                    loop0: do {
                        int i8 = AbstractC1550e.f10147b - 1;
                        while (true) {
                            if (-1 >= i8) {
                                break;
                            }
                            long j7 = (m2492h.f12380c * AbstractC1550e.f10147b) + i8;
                            while (true) {
                                Object m2514l = m2492h.m2514l(i8);
                                if (m2514l == AbstractC1550e.f10154i) {
                                    break loop0;
                                }
                                if (m2514l == AbstractC1550e.f10149d) {
                                    if (j7 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    if (m2492h.m2513k(i8, m2514l, AbstractC1550e.f10157l)) {
                                        m2492h.m2516n(i8, null);
                                        m2492h.m3463i();
                                        break;
                                    }
                                } else if (m2514l != AbstractC1550e.f10150e && m2514l != null) {
                                    if (!(m2514l instanceof InterfaceC0589y1) && !(m2514l instanceof C1564s)) {
                                        C1279sl c1279sl = AbstractC1550e.f10152g;
                                        if (m2514l == c1279sl || m2514l == AbstractC1550e.f10151f) {
                                            break loop0;
                                        }
                                        if (m2514l != c1279sl) {
                                            break;
                                        }
                                    } else {
                                        if (j7 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        if (m2514l instanceof C1564s) {
                                            interfaceC0589y1 = ((C1564s) m2514l).f10174a;
                                        } else {
                                            interfaceC0589y1 = (InterfaceC0589y1) m2514l;
                                        }
                                        if (m2492h.m2513k(i8, m2514l, AbstractC1550e.f10157l)) {
                                            obj = AbstractC2088a.m3435f(obj, interfaceC0589y1);
                                            m2492h.m2516n(i8, null);
                                            m2492h.m3463i();
                                            break;
                                        }
                                    }
                                } else if (m2492h.m2513k(i8, m2514l, AbstractC1550e.f10157l)) {
                                    m2492h.m3463i();
                                    break;
                                }
                            }
                            i8--;
                        }
                    } while (m2492h != null);
                    if (obj != null) {
                        if (!(obj instanceof ArrayList)) {
                            m2483A((InterfaceC0589y1) obj, false);
                        } else {
                            ArrayList arrayList = (ArrayList) obj;
                            for (int size = arrayList.size() - 1; -1 < size; size--) {
                                m2483A((InterfaceC0589y1) arrayList.get(size), false);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException(AbstractC2647h.m4256b("unexpected close status: ", i7).toString());
                }
            } else {
                m2492h(1152921504606846975L & j6);
                if (z7) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10140k;
                        C1556k c1556k = (C1556k) atomicReferenceFieldUpdater.get(this);
                        long j8 = atomicLongFieldUpdater.get(this);
                        if (m2502r() <= j8) {
                            break;
                        }
                        long j9 = AbstractC1550e.f10147b;
                        long j10 = j8 / j9;
                        if (c1556k.f12380c != j10 && (c1556k = m2498n(j10, c1556k)) == null) {
                            if (((C1556k) atomicReferenceFieldUpdater.get(this)).f12380c < j10) {
                                break;
                            }
                        } else {
                            c1556k.m3442b();
                            int i9 = (int) (j8 % j9);
                            while (true) {
                                Object m2514l2 = c1556k.m2514l(i9);
                                if (m2514l2 != null && m2514l2 != AbstractC1550e.f10150e) {
                                    if (m2514l2 == AbstractC1550e.f10149d) {
                                        break;
                                    }
                                    if (m2514l2 != AbstractC1550e.f10155j) {
                                        if (m2514l2 != AbstractC1550e.f10157l) {
                                            if (m2514l2 != AbstractC1550e.f10154i) {
                                                if (m2514l2 != AbstractC1550e.f10153h) {
                                                    if (m2514l2 == AbstractC1550e.f10152g) {
                                                        break;
                                                    }
                                                    if (m2514l2 != AbstractC1550e.f10151f && j8 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (c1556k.m2513k(i9, m2514l2, AbstractC1550e.f10153h)) {
                                    m2497m();
                                    break;
                                }
                            }
                            f10136g.compareAndSet(this, j8, j8 + 1);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0194, code lost:
    
        r16 = r7;
        r3 = (p047f6.C1556k) r3.m3443c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019d, code lost:
    
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z7;
        String str;
        StringBuilder sb = new StringBuilder();
        int i7 = (int) (f10135f.get(this) >> 60);
        if (i7 != 2) {
            if (i7 == 3) {
                sb.append("cancelled,");
            }
        } else {
            sb.append("closed,");
        }
        sb.append("capacity=" + this.f10144e + ',');
        sb.append("data=[");
        int i8 = 0;
        boolean z8 = true;
        List m3067O = AbstractC1806n.m3067O(f10140k.get(this), f10139j.get(this), f10141l.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m3067O) {
            if (((C1556k) obj) != AbstractC1550e.f10146a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j6 = ((C1556k) next).f12380c;
                do {
                    Object next2 = it.next();
                    long j7 = ((C1556k) next2).f12380c;
                    if (j6 > j7) {
                        next = next2;
                        j6 = j7;
                    }
                } while (it.hasNext());
            }
            C1556k c1556k = (C1556k) next;
            long j8 = f10136g.get(this);
            long m2502r = m2502r();
            loop2: while (true) {
                int i9 = AbstractC1550e.f10147b;
                int i10 = i8;
                while (true) {
                    if (i10 >= i9) {
                        break;
                    }
                    long j9 = (c1556k.f12380c * AbstractC1550e.f10147b) + i10;
                    if (j9 >= m2502r && j9 >= j8) {
                        break loop2;
                    }
                    Object m2514l = c1556k.m2514l(i10);
                    boolean z9 = z8;
                    Object obj2 = c1556k.f10171f.get(i10 * 2);
                    if (m2514l instanceof InterfaceC0542j) {
                        if (j9 < j8 && j9 >= m2502r) {
                            str = "receive";
                        } else if (j9 < m2502r && j9 >= j8) {
                            str = "send";
                        } else {
                            str = "cont";
                        }
                    } else if (m2514l instanceof C1564s) {
                        str = "EB(" + m2514l + ')';
                    } else if (!AbstractC3367j.m5096a(m2514l, AbstractC1550e.f10151f) && !AbstractC3367j.m5096a(m2514l, AbstractC1550e.f10152g)) {
                        if (m2514l != null && !m2514l.equals(AbstractC1550e.f10150e) && !m2514l.equals(AbstractC1550e.f10154i) && !m2514l.equals(AbstractC1550e.f10153h) && !m2514l.equals(AbstractC1550e.f10156k) && !m2514l.equals(AbstractC1550e.f10155j) && !m2514l.equals(AbstractC1550e.f10157l)) {
                            str = m2514l.toString();
                        }
                        i10++;
                        z8 = z9;
                    } else {
                        str = "resuming_sender";
                    }
                    if (obj2 != null) {
                        sb.append("(" + str + ',' + obj2 + "),");
                    } else {
                        sb.append(str + ',');
                    }
                    i10++;
                    z8 = z9;
                }
                z8 = z7;
                i8 = 0;
            }
            if (AbstractC0444k.m938b0(sb) == ',') {
                AbstractC3367j.m5099d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
            }
            sb.append("]");
            return sb.toString();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: u */
    public boolean mo2504u() {
        return false;
    }

    @Override // p047f6.InterfaceC1563r
    /* renamed from: v */
    public Object mo2505v(Object obj) {
        boolean z7;
        InterfaceC0589y1 interfaceC0589y1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10135f;
        long j6 = atomicLongFieldUpdater.get(this);
        boolean z8 = false;
        long j7 = 1152921504606846975L;
        if (m2503t(j6, false)) {
            z7 = false;
        } else {
            z7 = !m2490f(j6 & 1152921504606846975L);
        }
        C1554i c1554i = AbstractC1555j.f10169a;
        if (z7) {
            return c1554i;
        }
        InterfaceC2611l interfaceC2611l = AbstractC1550e.f10155j;
        C1556k c1556k = (C1556k) f10139j.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j8 = andIncrement & j7;
            boolean m2503t = m2503t(andIncrement, z8);
            int i7 = AbstractC1550e.f10147b;
            long j9 = i7;
            long j10 = j8 / j9;
            int i8 = (int) (j8 % j9);
            if (c1556k.f12380c != j10) {
                C1556k m2479b = m2479b(this, j10, c1556k);
                if (m2479b == null) {
                    if (m2503t) {
                        return new C1553h(m2501q());
                    }
                    z8 = false;
                    j7 = 1152921504606846975L;
                } else {
                    c1556k = m2479b;
                }
            }
            int m2481e = m2481e(this, c1556k, i8, obj, j8, interfaceC2611l, m2503t);
            C1694m c1694m = C1694m.f10482a;
            if (m2481e != 0) {
                if (m2481e != 1) {
                    if (m2481e != 2) {
                        if (m2481e != 3) {
                            if (m2481e != 4) {
                                if (m2481e == 5) {
                                    c1556k.m3442b();
                                }
                                z8 = false;
                                j7 = 1152921504606846975L;
                            } else {
                                if (j8 < f10136g.get(this)) {
                                    c1556k.m3442b();
                                }
                                return new C1553h(m2501q());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else {
                        if (m2503t) {
                            c1556k.m3463i();
                            return new C1553h(m2501q());
                        }
                        if (interfaceC2611l instanceof InterfaceC0589y1) {
                            interfaceC0589y1 = (InterfaceC0589y1) interfaceC2611l;
                        } else {
                            interfaceC0589y1 = null;
                        }
                        if (interfaceC0589y1 != null) {
                            interfaceC0589y1.mo1214a(c1556k, i8 + i7);
                        }
                        c1556k.m3463i();
                        return c1554i;
                    }
                } else {
                    return c1694m;
                }
            } else {
                c1556k.m3442b();
                return c1694m;
            }
        }
    }

    /* renamed from: w */
    public final boolean m2506w() {
        long j6 = f10137h.get(this);
        if (j6 != 0 && j6 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    @Override // p047f6.InterfaceC1562q
    /* renamed from: x */
    public final Object mo2507x(AbstractC2590j abstractC2590j) {
        C1556k c1556k;
        C1548c c1548c = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10140k;
        C1556k c1556k2 = (C1556k) atomicReferenceFieldUpdater.get(c1548c);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10135f;
            if (!c1548c.m2503t(atomicLongFieldUpdater.get(c1548c), true)) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10136g;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(c1548c);
                long j6 = AbstractC1550e.f10147b;
                long j7 = andIncrement / j6;
                int i7 = (int) (andIncrement % j6);
                if (c1556k2.f12380c != j7) {
                    C1556k m2498n = c1548c.m2498n(j7, c1556k2);
                    if (m2498n == null) {
                        continue;
                    } else {
                        c1556k2 = m2498n;
                    }
                }
                Object m2485D = c1548c.m2485D(c1556k2, i7, andIncrement, null);
                C1279sl c1279sl = AbstractC1550e.f10158m;
                if (m2485D != c1279sl) {
                    C1279sl c1279sl2 = AbstractC1550e.f10160o;
                    if (m2485D == c1279sl2) {
                        if (andIncrement < m2502r()) {
                            c1556k2.m3442b();
                        }
                        c1548c = this;
                    } else {
                        if (m2485D == AbstractC1550e.f10159n) {
                            C0548l m1136n = AbstractC0525d0.m1136n(AbstractC2064e.m3250x(abstractC2590j));
                            C1548c c1548c2 = this;
                            try {
                                Object m2485D2 = c1548c2.m2485D(c1556k2, i7, andIncrement, m1136n);
                                if (m2485D2 == c1279sl) {
                                    m1136n.mo1214a(c1556k2, i7);
                                } else if (m2485D2 == c1279sl2) {
                                    if (andIncrement < c1548c2.m2502r()) {
                                        c1556k2.m3442b();
                                    }
                                    C1556k c1556k3 = (C1556k) atomicReferenceFieldUpdater.get(c1548c2);
                                    while (true) {
                                        if (c1548c2.m2503t(atomicLongFieldUpdater.get(c1548c2), true)) {
                                            m1136n.mo663n(AbstractC1793a0.m2985m(c1548c2.m2500p()));
                                            break;
                                        }
                                        long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(c1548c2);
                                        long j8 = AbstractC1550e.f10147b;
                                        long j9 = andIncrement2 / j8;
                                        int i8 = (int) (andIncrement2 % j8);
                                        if (c1556k3.f12380c != j9) {
                                            c1556k = c1548c2.m2498n(j9, c1556k3);
                                            if (c1556k == null) {
                                            }
                                        } else {
                                            c1556k = c1556k3;
                                        }
                                        Object m2485D3 = c1548c2.m2485D(c1556k, i8, andIncrement2, m1136n);
                                        if (m2485D3 == AbstractC1550e.f10158m) {
                                            m1136n.mo1214a(c1556k, i8);
                                            break;
                                        }
                                        if (m2485D3 == AbstractC1550e.f10160o) {
                                            if (andIncrement2 < m2502r()) {
                                                c1556k.m3442b();
                                            }
                                            c1548c2 = this;
                                            c1556k3 = c1556k;
                                        } else if (m2485D3 != AbstractC1550e.f10159n) {
                                            c1556k.m3442b();
                                            m1136n.mo1200r(m2485D3, null);
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    }
                                } else {
                                    c1556k2.m3442b();
                                    m1136n.mo1200r(m2485D2, null);
                                }
                                return m1136n.m1221t();
                            } catch (Throwable th) {
                                m1136n.m1210D();
                                throw th;
                            }
                        }
                        c1556k2.m3442b();
                        return m2485D;
                    }
                } else {
                    throw new IllegalStateException("unexpected");
                }
            } else {
                Throwable m2500p = m2500p();
                int i9 = AbstractC2105r.f12381a;
                throw m2500p;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2508y(long j6, C1556k c1556k) {
        C1556k c1556k2;
        C1556k c1556k3;
        while (c1556k.f12380c < j6 && (c1556k3 = (C1556k) c1556k.m3443c()) != null) {
            c1556k = c1556k3;
        }
        while (true) {
            if (!c1556k.mo3444d() || (c1556k2 = (C1556k) c1556k.m3443c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10141l;
                    AbstractC2104q abstractC2104q = (AbstractC2104q) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2104q.f12380c < c1556k.f12380c) {
                        if (!c1556k.m3464j()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC2104q, c1556k)) {
                            if (atomicReferenceFieldUpdater.get(this) != abstractC2104q) {
                                if (c1556k.m3462f()) {
                                    c1556k.m3445e();
                                }
                            }
                        }
                        if (abstractC2104q.m3462f()) {
                            abstractC2104q.m3445e();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            c1556k = c1556k2;
        }
    }

    /* renamed from: z */
    public final Object m2509z(Object obj, InterfaceC2313c interfaceC2313c) {
        C0548l c0548l = new C0548l(1, AbstractC2064e.m3250x(interfaceC2313c));
        c0548l.m1222u();
        c0548l.mo663n(AbstractC1793a0.m2985m(m2501q()));
        Object m1221t = c0548l.m1221t();
        if (m1221t == EnumC2465a.f13750e) {
            return m1221t;
        }
        return C1694m.f10482a;
    }
}
