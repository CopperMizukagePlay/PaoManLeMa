package p091l6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p032d6.AbstractC0525d0;
import p032d6.C0545k;
import p032d6.C0548l;
import p032d6.InterfaceC0542j;
import p032d6.InterfaceC0589y1;
import p039e5.C1279sl;
import p053g5.C1694m;
import p065i2.AbstractC2064e;
import p069i6.AbstractC2088a;
import p069i6.AbstractC2104q;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l6.h */
/* loaded from: classes.dex */
public class C2477h {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13766c = AtomicReferenceFieldUpdater.newUpdater(C2477h.class, Object.class, "head$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f13767d = AtomicLongFieldUpdater.newUpdater(C2477h.class, "deqIdx$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13768e = AtomicReferenceFieldUpdater.newUpdater(C2477h.class, Object.class, "tail$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f13769f = AtomicLongFieldUpdater.newUpdater(C2477h.class, "enqIdx$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13770g = AtomicIntegerFieldUpdater.newUpdater(C2477h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a */
    public final int f13771a;

    /* renamed from: b */
    public final C0545k f13772b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public C2477h(int i7) {
        this.f13771a = i7;
        if (i7 > 0) {
            if (i7 >= 0) {
                C2480k c2480k = new C2480k(0L, null, 2);
                this.head$volatile = c2480k;
                this.tail$volatile = c2480k;
                this._availablePermits$volatile = i7;
                this.f13772b = new C0545k(3, this);
                return;
            }
            throw new IllegalArgumentException(AbstractC2647h.m4256b("The number of acquired permits should be in 0..", i7).toString());
        }
        throw new IllegalArgumentException(AbstractC2647h.m4256b("Semaphore should have at least 1 permit, but had ", i7).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        r5.mo1200r(r3, r4.f13772b);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4031a(AbstractC2590j abstractC2590j) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i7;
        do {
            atomicIntegerFieldUpdater = f13770g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i7 = this.f13771a;
        } while (andDecrement > i7);
        C1694m c1694m = C1694m.f10482a;
        if (andDecrement <= 0) {
            C0548l m1136n = AbstractC0525d0.m1136n(AbstractC2064e.m3250x(abstractC2590j));
            try {
                if (!m4032b(m1136n)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i7) {
                            if (andDecrement2 > 0) {
                                break;
                            }
                            if (m4032b(m1136n)) {
                                break;
                            }
                        }
                    }
                }
                Object m1221t = m1136n.m1221t();
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (m1221t != enumC2465a) {
                    m1221t = c1694m;
                }
                if (m1221t == enumC2465a) {
                    return m1221t;
                }
            } catch (Throwable th) {
                m1136n.m1210D();
                throw th;
            }
        }
        return c1694m;
    }

    /* renamed from: b */
    public final boolean m4032b(InterfaceC0589y1 interfaceC0589y1) {
        Object m3431b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13768e;
        C2480k c2480k = (C2480k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f13769f.getAndIncrement(this);
        C2475f c2475f = C2475f.f13764m;
        long j6 = andIncrement / AbstractC2479j.f13778f;
        loop0: while (true) {
            m3431b = AbstractC2088a.m3431b(c2480k, j6, c2475f);
            if (!AbstractC2088a.m3434e(m3431b)) {
                AbstractC2104q m3432c = AbstractC2088a.m3432c(m3431b);
                while (true) {
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
        C2480k c2480k2 = (C2480k) AbstractC2088a.m3432c(m3431b);
        AtomicReferenceArray atomicReferenceArray = c2480k2.f13779e;
        int i7 = (int) (andIncrement % AbstractC2479j.f13778f);
        while (!atomicReferenceArray.compareAndSet(i7, null, interfaceC0589y1)) {
            if (atomicReferenceArray.get(i7) != null) {
                C1279sl c1279sl = AbstractC2479j.f13774b;
                C1279sl c1279sl2 = AbstractC2479j.f13775c;
                while (!atomicReferenceArray.compareAndSet(i7, c1279sl, c1279sl2)) {
                    if (atomicReferenceArray.get(i7) != c1279sl) {
                        return false;
                    }
                }
                ((InterfaceC0542j) interfaceC0589y1).mo1200r(C1694m.f10482a, this.f13772b);
                return true;
            }
        }
        interfaceC0589y1.mo1214a(c2480k2, i7);
        return true;
    }

    /* renamed from: c */
    public final void m4033c() {
        int i7;
        Object m3431b;
        boolean z7;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13770g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i8 = this.f13771a;
            if (andIncrement < i8) {
                if (andIncrement < 0) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13766c;
                    C2480k c2480k = (C2480k) atomicReferenceFieldUpdater.get(this);
                    long andIncrement2 = f13767d.getAndIncrement(this);
                    long j6 = andIncrement2 / AbstractC2479j.f13778f;
                    C2476g c2476g = C2476g.f13765m;
                    while (true) {
                        m3431b = AbstractC2088a.m3431b(c2480k, j6, c2476g);
                        if (AbstractC2088a.m3434e(m3431b)) {
                            break;
                        }
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
                    }
                    C2480k c2480k2 = (C2480k) AbstractC2088a.m3432c(m3431b);
                    AtomicReferenceArray atomicReferenceArray = c2480k2.f13779e;
                    c2480k2.m3442b();
                    z7 = false;
                    if (c2480k2.f12380c <= j6) {
                        int i9 = (int) (andIncrement2 % AbstractC2479j.f13778f);
                        Object andSet = atomicReferenceArray.getAndSet(i9, AbstractC2479j.f13774b);
                        if (andSet == null) {
                            int i10 = AbstractC2479j.f13773a;
                            for (int i11 = 0; i11 < i10; i11++) {
                                if (atomicReferenceArray.get(i9) == AbstractC2479j.f13775c) {
                                    z7 = true;
                                    break;
                                }
                            }
                            C1279sl c1279sl = AbstractC2479j.f13774b;
                            C1279sl c1279sl2 = AbstractC2479j.f13776d;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i9, c1279sl, c1279sl2)) {
                                    z7 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i9) != c1279sl) {
                                    break;
                                }
                            }
                            z7 = !z7;
                        } else if (andSet != AbstractC2479j.f13777e) {
                            if (andSet instanceof InterfaceC0542j) {
                                InterfaceC0542j interfaceC0542j = (InterfaceC0542j) andSet;
                                C1279sl mo1198e = interfaceC0542j.mo1198e(C1694m.f10482a, this.f13772b);
                                if (mo1198e != null) {
                                    interfaceC0542j.mo1197C(mo1198e);
                                    z7 = true;
                                    break;
                                    break;
                                }
                            } else {
                                throw new IllegalStateException(("unexpected: " + andSet).toString());
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= i8) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i8));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i8).toString());
            }
        } while (!z7);
    }
}
