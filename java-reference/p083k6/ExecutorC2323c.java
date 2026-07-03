package p083k6;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p001a0.AbstractC0094y0;
import p032d6.AbstractC0525d0;
import p039e5.C1279sl;
import p069i6.C2097j;
import p069i6.C2102o;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k6.c */
/* loaded from: classes.dex */
public final class ExecutorC2323c implements Executor, Closeable {

    /* renamed from: l */
    public static final /* synthetic */ AtomicLongFieldUpdater f13291l = AtomicLongFieldUpdater.newUpdater(ExecutorC2323c.class, "parkedWorkersStack$volatile");

    /* renamed from: m */
    public static final /* synthetic */ AtomicLongFieldUpdater f13292m = AtomicLongFieldUpdater.newUpdater(ExecutorC2323c.class, "controlState$volatile");

    /* renamed from: n */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13293n = AtomicIntegerFieldUpdater.newUpdater(ExecutorC2323c.class, "_isTerminated$volatile");

    /* renamed from: o */
    public static final C1279sl f13294o = new C1279sl("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: e */
    public final int f13295e;

    /* renamed from: f */
    public final int f13296f;

    /* renamed from: g */
    public final long f13297g;

    /* renamed from: h */
    public final String f13298h;

    /* renamed from: i */
    public final C2326f f13299i;

    /* renamed from: j */
    public final C2326f f13300j;

    /* renamed from: k */
    public final C2102o f13301k;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r4v10, types: [k6.f, i6.j] */
    /* JADX WARN: Type inference failed for: r4v9, types: [k6.f, i6.j] */
    public ExecutorC2323c(int i7, int i8, long j6, String str) {
        this.f13295e = i7;
        this.f13296f = i8;
        this.f13297g = j6;
        this.f13298h = str;
        if (i7 >= 1) {
            if (i8 >= i7) {
                if (i8 <= 2097150) {
                    if (j6 > 0) {
                        this.f13299i = new C2097j();
                        this.f13300j = new C2097j();
                        this.f13301k = new C2102o((i7 + 1) * 2);
                        this.controlState$volatile = i7 << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j6 + " must be positive").toString());
                }
                throw new IllegalArgumentException(AbstractC0094y0.m184k(i8, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(AbstractC0094y0.m182i(i8, i7, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(AbstractC0094y0.m184k(i7, "Core pool size ", " should be at least 1").toString());
    }

    /* renamed from: d */
    public static /* synthetic */ void m3701d(ExecutorC2323c executorC2323c, Runnable runnable, int i7) {
        boolean z7;
        if ((i7 & 4) != 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        executorC2323c.m3703c(runnable, false, z7);
    }

    /* renamed from: b */
    public final int m3702b() {
        boolean z7;
        synchronized (this.f13301k) {
            try {
                if (f13293n.get(this) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f13292m;
                long j6 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j6 & 2097151);
                int i8 = i7 - ((int) ((j6 & 4398044413952L) >> 21));
                if (i8 < 0) {
                    i8 = 0;
                }
                if (i8 >= this.f13295e) {
                    return 0;
                }
                if (i7 >= this.f13296f) {
                    return 0;
                }
                int i9 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i9 > 0 && this.f13301k.m3460b(i9) == null) {
                    C2321a c2321a = new C2321a(this, i9);
                    this.f13301k.m3461c(i9, c2321a);
                    if (i9 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i10 = i8 + 1;
                        c2321a.start();
                        return i10;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void m3703c(Runnable runnable, boolean z7, boolean z8) {
        AbstractRunnableC2329i c2330j;
        long j6;
        C2321a c2321a;
        boolean m3451a;
        EnumC2322b enumC2322b;
        AbstractC2331k.f13315f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC2329i) {
            c2330j = (AbstractRunnableC2329i) runnable;
            c2330j.f13307e = nanoTime;
            c2330j.f13308f = z7;
        } else {
            c2330j = new C2330j(runnable, nanoTime, z7);
        }
        boolean z9 = c2330j.f13308f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f13292m;
        if (z9) {
            j6 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j6 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C2321a) {
            c2321a = (C2321a) currentThread;
        } else {
            c2321a = null;
        }
        if (c2321a == null || !AbstractC3367j.m5096a(c2321a.f13284l, this)) {
            c2321a = null;
        }
        boolean z10 = true;
        if (c2321a != null && (enumC2322b = c2321a.f13279g) != EnumC2322b.f13289i && (c2330j.f13308f || enumC2322b != EnumC2322b.f13286f)) {
            c2321a.f13283k = true;
            C2333m c2333m = c2321a.f13277e;
            if (z8) {
                c2330j = c2333m.m3707a(c2330j);
            } else {
                c2333m.getClass();
                AbstractRunnableC2329i abstractRunnableC2329i = (AbstractRunnableC2329i) C2333m.f13317b.getAndSet(c2333m, c2330j);
                if (abstractRunnableC2329i == null) {
                    c2330j = null;
                } else {
                    c2330j = c2333m.m3707a(abstractRunnableC2329i);
                }
            }
        }
        if (c2330j != null) {
            if (c2330j.f13308f) {
                m3451a = this.f13300j.m3451a(c2330j);
            } else {
                m3451a = this.f13299i.m3451a(c2330j);
            }
            if (!m3451a) {
                throw new RejectedExecutionException(AbstractC2487d.m4046j(new StringBuilder(), this.f13298h, " was terminated"));
            }
        }
        if (!z8 || c2321a == null) {
            z10 = false;
        }
        if (z9) {
            if (!z10 && !m3706m() && !m3705h(j6)) {
                m3706m();
                return;
            }
            return;
        }
        if (z10 || m3706m() || m3705h(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m3706m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        C2321a c2321a;
        int i7;
        AbstractRunnableC2329i abstractRunnableC2329i;
        if (!f13293n.compareAndSet(this, 0, 1)) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C2321a) {
            c2321a = (C2321a) currentThread;
        } else {
            c2321a = null;
        }
        if (c2321a == null || !AbstractC3367j.m5096a(c2321a.f13284l, this)) {
            c2321a = null;
        }
        synchronized (this.f13301k) {
            i7 = (int) (f13292m.get(this) & 2097151);
        }
        if (1 <= i7) {
            int i8 = 1;
            while (true) {
                Object m3460b = this.f13301k.m3460b(i8);
                AbstractC3367j.m5097b(m3460b);
                C2321a c2321a2 = (C2321a) m3460b;
                if (c2321a2 != c2321a) {
                    while (c2321a2.getState() != Thread.State.TERMINATED) {
                        LockSupport.unpark(c2321a2);
                        c2321a2.join(10000L);
                    }
                    C2333m c2333m = c2321a2.f13277e;
                    C2326f c2326f = this.f13300j;
                    c2333m.getClass();
                    AbstractRunnableC2329i abstractRunnableC2329i2 = (AbstractRunnableC2329i) C2333m.f13317b.getAndSet(c2333m, null);
                    if (abstractRunnableC2329i2 != null) {
                        c2326f.m3451a(abstractRunnableC2329i2);
                    }
                    while (true) {
                        AbstractRunnableC2329i m3708b = c2333m.m3708b();
                        if (m3708b == null) {
                            break;
                        } else {
                            c2326f.m3451a(m3708b);
                        }
                    }
                }
                if (i8 == i7) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.f13300j.m3452b();
        this.f13299i.m3452b();
        while (true) {
            if (c2321a != null) {
                abstractRunnableC2329i = c2321a.m3692a(true);
            }
            abstractRunnableC2329i = (AbstractRunnableC2329i) this.f13299i.m3454d();
            if (abstractRunnableC2329i == null && (abstractRunnableC2329i = (AbstractRunnableC2329i) this.f13300j.m3454d()) == null) {
                break;
            }
            try {
                abstractRunnableC2329i.run();
            } catch (Throwable th) {
                Thread currentThread2 = Thread.currentThread();
                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
            }
        }
        if (c2321a != null) {
            c2321a.m3699h(EnumC2322b.f13289i);
        }
        f13291l.set(this, 0L);
        f13292m.set(this, 0L);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m3701d(this, runnable, 6);
    }

    /* renamed from: f */
    public final void m3704f(C2321a c2321a, int i7, int i8) {
        while (true) {
            long j6 = f13291l.get(this);
            int i9 = (int) (2097151 & j6);
            long j7 = (2097152 + j6) & (-2097152);
            if (i9 == i7) {
                if (i8 == 0) {
                    Object m3694c = c2321a.m3694c();
                    while (true) {
                        if (m3694c == f13294o) {
                            i9 = -1;
                            break;
                        }
                        if (m3694c == null) {
                            i9 = 0;
                            break;
                        }
                        C2321a c2321a2 = (C2321a) m3694c;
                        int m3693b = c2321a2.m3693b();
                        if (m3693b != 0) {
                            i9 = m3693b;
                            break;
                        }
                        m3694c = c2321a2.m3694c();
                    }
                } else {
                    i9 = i8;
                }
            }
            if (i9 >= 0) {
                if (f13291l.compareAndSet(this, j6, i9 | j7)) {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean m3705h(long j6) {
        int i7 = ((int) (2097151 & j6)) - ((int) ((j6 & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = this.f13295e;
        if (i7 < i8) {
            int m3702b = m3702b();
            if (m3702b == 1 && i8 > 1) {
                m3702b();
            }
            if (m3702b > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m3706m() {
        C1279sl c1279sl;
        int i7;
        while (true) {
            long j6 = f13291l.get(this);
            C2321a c2321a = (C2321a) this.f13301k.m3460b((int) (2097151 & j6));
            if (c2321a == null) {
                c2321a = null;
            } else {
                long j7 = (2097152 + j6) & (-2097152);
                Object m3694c = c2321a.m3694c();
                while (true) {
                    c1279sl = f13294o;
                    if (m3694c == c1279sl) {
                        i7 = -1;
                        break;
                    }
                    if (m3694c == null) {
                        i7 = 0;
                        break;
                    }
                    C2321a c2321a2 = (C2321a) m3694c;
                    i7 = c2321a2.m3693b();
                    if (i7 != 0) {
                        break;
                    }
                    m3694c = c2321a2.m3694c();
                }
                if (i7 >= 0) {
                    if (f13291l.compareAndSet(this, j6, i7 | j7)) {
                        c2321a.m3698g(c1279sl);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c2321a == null) {
                return false;
            }
            if (C2321a.f13276m.compareAndSet(c2321a, -1, 0)) {
                LockSupport.unpark(c2321a);
                return true;
            }
        }
    }

    public final String toString() {
        int i7;
        ArrayList arrayList = new ArrayList();
        C2102o c2102o = this.f13301k;
        int m3459a = c2102o.m3459a();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 1; i13 < m3459a; i13++) {
            C2321a c2321a = (C2321a) c2102o.m3460b(i13);
            if (c2321a != null) {
                C2333m c2333m = c2321a.f13277e;
                c2333m.getClass();
                if (C2333m.f13317b.get(c2333m) != null) {
                    i7 = (C2333m.f13318c.get(c2333m) - C2333m.f13319d.get(c2333m)) + 1;
                } else {
                    i7 = C2333m.f13318c.get(c2333m) - C2333m.f13319d.get(c2333m);
                }
                int ordinal = c2321a.f13279g.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i12++;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                i11++;
                                if (i7 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i7);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i10++;
                        }
                    } else {
                        i9++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i7);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i8++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i7);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j6 = f13292m.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f13298h);
        sb4.append('@');
        sb4.append(AbstractC0525d0.m1134l(this));
        sb4.append("[Pool Size {core = ");
        int i14 = this.f13295e;
        sb4.append(i14);
        sb4.append(", max = ");
        AbstractC0094y0.m192s(sb4, this.f13296f, "}, Worker States {CPU = ", i8, ", blocking = ");
        AbstractC0094y0.m192s(sb4, i9, ", parked = ", i10, ", dormant = ");
        AbstractC0094y0.m192s(sb4, i11, ", terminated = ", i12, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f13299i.m3453c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f13300j.m3453c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j6));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j6) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i14 - ((int) ((j6 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
