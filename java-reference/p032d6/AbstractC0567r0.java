package p032d6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p039e5.C1279sl;
import p060h5.C1803k;
import p069i6.C2099l;
import p069i6.C2107t;
import p082k5.InterfaceC2318h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC0567r0 extends AbstractC0570s0 implements InterfaceC0540i0 {

    /* renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1919k = AtomicReferenceFieldUpdater.newUpdater(AbstractC0567r0.class, Object.class, "_queue$volatile");

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1920l = AtomicReferenceFieldUpdater.newUpdater(AbstractC0567r0.class, Object.class, "_delayed$volatile");

    /* renamed from: m */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1921m = AtomicIntegerFieldUpdater.newUpdater(AbstractC0567r0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // p032d6.AbstractC0581w
    /* renamed from: J */
    public final void mo1233J(InterfaceC2318h interfaceC2318h, Runnable runnable) {
        mo1153T(runnable);
    }

    @Override // p032d6.AbstractC0570s0
    /* renamed from: Q */
    public final long mo1234Q() {
        AbstractRunnableC0561p0 abstractRunnableC0561p0;
        Runnable runnable;
        long j6;
        C1279sl c1279sl = AbstractC0525d0.f1857c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1919k;
        if (!m1242R()) {
            m1235U();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                abstractRunnableC0561p0 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof C2099l) {
                    C2099l c2099l = (C2099l) obj;
                    Object m3458d = c2099l.m3458d();
                    if (m3458d != C2099l.f12371g) {
                        runnable = (Runnable) m3458d;
                        break;
                    }
                    C2099l m3457c = c2099l.m3457c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m3457c) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == c1279sl) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C1803k c1803k = this.f1927i;
            if (c1803k == null || c1803k.isEmpty()) {
                j6 = Long.MAX_VALUE;
            } else {
                j6 = 0;
            }
            if (j6 != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C2099l) {
                        long j7 = C2099l.f12370f.get((C2099l) obj2);
                        if (((int) (1073741823 & j7)) != ((int) ((j7 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c1279sl) {
                        return Long.MAX_VALUE;
                    }
                }
                C0564q0 c0564q0 = (C0564q0) f1920l.get(this);
                if (c0564q0 != null) {
                    synchronized (c0564q0) {
                        AbstractRunnableC0561p0[] abstractRunnableC0561p0Arr = c0564q0.f12384a;
                        if (abstractRunnableC0561p0Arr != null) {
                            abstractRunnableC0561p0 = abstractRunnableC0561p0Arr[0];
                        }
                    }
                    if (abstractRunnableC0561p0 != null) {
                        long nanoTime = abstractRunnableC0561p0.f1908e - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* renamed from: T */
    public void mo1153T(Runnable runnable) {
        m1235U();
        if (m1236V(runnable)) {
            Thread mo1151O = mo1151O();
            if (Thread.currentThread() != mo1151O) {
                LockSupport.unpark(mo1151O);
                return;
            }
            return;
        }
        RunnableC0528e0.f1868n.mo1153T(runnable);
    }

    /* renamed from: U */
    public final void m1235U() {
        AbstractRunnableC0561p0 abstractRunnableC0561p0;
        AbstractRunnableC0561p0 abstractRunnableC0561p02;
        boolean z7;
        C0564q0 c0564q0 = (C0564q0) f1920l.get(this);
        if (c0564q0 == null || C2107t.f12383b.get(c0564q0) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (c0564q0) {
                try {
                    AbstractRunnableC0561p0[] abstractRunnableC0561p0Arr = c0564q0.f12384a;
                    abstractRunnableC0561p0 = null;
                    if (abstractRunnableC0561p0Arr != null) {
                        abstractRunnableC0561p02 = abstractRunnableC0561p0Arr[0];
                    } else {
                        abstractRunnableC0561p02 = null;
                    }
                    if (abstractRunnableC0561p02 != null) {
                        if (nanoTime - abstractRunnableC0561p02.f1908e >= 0) {
                            z7 = m1236V(abstractRunnableC0561p02);
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            abstractRunnableC0561p0 = c0564q0.m3466b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC0561p0 != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1236V(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1919k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f1921m.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            }
            if (obj instanceof C2099l) {
                C2099l c2099l = (C2099l) obj;
                int m3455a = c2099l.m3455a(runnable);
                if (m3455a == 0) {
                    break;
                }
                if (m3455a != 1) {
                    if (m3455a == 2) {
                        break;
                    }
                } else {
                    C2099l m3457c = c2099l.m3457c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m3457c) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                }
            } else {
                if (obj != AbstractC0525d0.f1857c) {
                    C2099l c2099l2 = new C2099l(8, true);
                    c2099l2.m3455a((Runnable) obj);
                    c2099l2.m3455a(runnable);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2099l2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r0 == false) goto L29;
     */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1237W() {
        boolean z7;
        boolean z8;
        C1803k c1803k = this.f1927i;
        if (c1803k != null) {
            z7 = c1803k.isEmpty();
        } else {
            z7 = true;
        }
        if (z7) {
            C0564q0 c0564q0 = (C0564q0) f1920l.get(this);
            if (c0564q0 != null) {
                if (C2107t.f12383b.get(c0564q0) == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            Object obj = f1919k.get(this);
            if (obj != null) {
                if (obj instanceof C2099l) {
                    long j6 = C2099l.f12370f.get((C2099l) obj);
                    if (((int) (1073741823 & j6)) == ((int) ((j6 & 1152921503533105152L) >> 30))) {
                        return true;
                    }
                    return false;
                }
                if (obj == AbstractC0525d0.f1857c) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [d6.q0, java.lang.Object] */
    /* renamed from: X */
    public final void m1238X(long j6, AbstractRunnableC0561p0 abstractRunnableC0561p0) {
        int m1230b;
        Thread mo1151O;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1920l;
        AbstractRunnableC0561p0 abstractRunnableC0561p02 = null;
        if (f1921m.get(this) != 0) {
            m1230b = 1;
        } else {
            C0564q0 c0564q0 = (C0564q0) atomicReferenceFieldUpdater.get(this);
            if (c0564q0 == null) {
                ?? obj = new Object();
                obj.f1913c = j6;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                AbstractC3367j.m5097b(obj2);
                c0564q0 = (C0564q0) obj2;
            }
            m1230b = abstractRunnableC0561p0.m1230b(j6, c0564q0, this);
        }
        if (m1230b != 0) {
            if (m1230b != 1) {
                if (m1230b != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            } else {
                mo1152S(j6, abstractRunnableC0561p0);
                return;
            }
        }
        C0564q0 c0564q02 = (C0564q0) atomicReferenceFieldUpdater.get(this);
        if (c0564q02 != null) {
            synchronized (c0564q02) {
                AbstractRunnableC0561p0[] abstractRunnableC0561p0Arr = c0564q02.f12384a;
                if (abstractRunnableC0561p0Arr != null) {
                    abstractRunnableC0561p02 = abstractRunnableC0561p0Arr[0];
                }
            }
        }
        if (abstractRunnableC0561p02 == abstractRunnableC0561p0 && Thread.currentThread() != (mo1151O = mo1151O())) {
            LockSupport.unpark(mo1151O);
        }
    }

    @Override // p032d6.InterfaceC0540i0
    /* renamed from: n */
    public final void mo1168n(long j6, C0548l c0548l) {
        long j7 = 0;
        if (j6 > 0) {
            if (j6 >= 9223372036854L) {
                j7 = Long.MAX_VALUE;
            } else {
                j7 = 1000000 * j6;
            }
        }
        if (j7 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            C0558o0 c0558o0 = new C0558o0(this, j7 + nanoTime, c0548l);
            m1238X(nanoTime, c0558o0);
            c0548l.m1225x(new C0536h(2, c0558o0));
        }
    }

    @Override // p032d6.AbstractC0570s0
    public void shutdown() {
        AbstractRunnableC0561p0 abstractRunnableC0561p0;
        AbstractC0574t1.f1928a.set(null);
        f1921m.set(this, 1);
        C1279sl c1279sl = AbstractC0525d0.f1857c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1919k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1279sl)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else {
                if (obj instanceof C2099l) {
                    ((C2099l) obj).m3456b();
                    break;
                }
                if (obj != c1279sl) {
                    C2099l c2099l = new C2099l(8, true);
                    c2099l.m3455a((Runnable) obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2099l)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
        }
        do {
        } while (mo1234Q() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C0564q0 c0564q0 = (C0564q0) f1920l.get(this);
            if (c0564q0 != null) {
                synchronized (c0564q0) {
                    if (C2107t.f12383b.get(c0564q0) > 0) {
                        abstractRunnableC0561p0 = c0564q0.m3466b(0);
                    } else {
                        abstractRunnableC0561p0 = null;
                    }
                }
                if (abstractRunnableC0561p0 != null) {
                    mo1152S(nanoTime, abstractRunnableC0561p0);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
