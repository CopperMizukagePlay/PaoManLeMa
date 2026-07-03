package p083k6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p039e5.C1279sl;
import p158u5.AbstractC3367j;
import p158u5.C3379v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k6.a */
/* loaded from: classes.dex */
public final class C2321a extends Thread {

    /* renamed from: m */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13276m = AtomicIntegerFieldUpdater.newUpdater(C2321a.class, "workerCtl$volatile");

    /* renamed from: e */
    public final C2333m f13277e;

    /* renamed from: f */
    public final C3379v f13278f;

    /* renamed from: g */
    public EnumC2322b f13279g;

    /* renamed from: h */
    public long f13280h;

    /* renamed from: i */
    public long f13281i;
    private volatile int indexInArray;

    /* renamed from: j */
    public int f13282j;

    /* renamed from: k */
    public boolean f13283k;

    /* renamed from: l */
    public final /* synthetic */ ExecutorC2323c f13284l;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, u5.v] */
    public C2321a(ExecutorC2323c executorC2323c, int i7) {
        this.f13284l = executorC2323c;
        setDaemon(true);
        setContextClassLoader(ExecutorC2323c.class.getClassLoader());
        this.f13277e = new C2333m();
        this.f13278f = new Object();
        this.f13279g = EnumC2322b.f13288h;
        this.nextParkedWorker = ExecutorC2323c.f13294o;
        int nanoTime = (int) System.nanoTime();
        this.f13282j = nanoTime == 0 ? 42 : nanoTime;
        m3697f(i7);
    }

    /* renamed from: a */
    public final AbstractRunnableC2329i m3692a(boolean z7) {
        AbstractRunnableC2329i m3696e;
        AbstractRunnableC2329i m3696e2;
        long j6;
        EnumC2322b enumC2322b = this.f13279g;
        ExecutorC2323c executorC2323c = this.f13284l;
        AbstractRunnableC2329i abstractRunnableC2329i = null;
        boolean z8 = true;
        C2333m c2333m = this.f13277e;
        EnumC2322b enumC2322b2 = EnumC2322b.f13285e;
        if (enumC2322b != enumC2322b2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC2323c.f13292m;
            do {
                j6 = atomicLongFieldUpdater.get(executorC2323c);
                if (((int) ((9223367638808264704L & j6) >> 42)) == 0) {
                    c2333m.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2333m.f13317b;
                        AbstractRunnableC2329i abstractRunnableC2329i2 = (AbstractRunnableC2329i) atomicReferenceFieldUpdater.get(c2333m);
                        if (abstractRunnableC2329i2 == null || !abstractRunnableC2329i2.f13308f) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(c2333m, abstractRunnableC2329i2, null)) {
                            if (atomicReferenceFieldUpdater.get(c2333m) != abstractRunnableC2329i2) {
                                break;
                            }
                        }
                        abstractRunnableC2329i = abstractRunnableC2329i2;
                    }
                    int i7 = C2333m.f13319d.get(c2333m);
                    int i8 = C2333m.f13318c.get(c2333m);
                    while (true) {
                        if (i7 == i8 || C2333m.f13320e.get(c2333m) == 0) {
                            break;
                        }
                        i8--;
                        AbstractRunnableC2329i m3709c = c2333m.m3709c(i8, true);
                        if (m3709c != null) {
                            abstractRunnableC2329i = m3709c;
                            break;
                        }
                    }
                    if (abstractRunnableC2329i == null) {
                        AbstractRunnableC2329i abstractRunnableC2329i3 = (AbstractRunnableC2329i) executorC2323c.f13300j.m3454d();
                        if (abstractRunnableC2329i3 == null) {
                            return m3700i(1);
                        }
                        return abstractRunnableC2329i3;
                    }
                    return abstractRunnableC2329i;
                }
            } while (!ExecutorC2323c.f13292m.compareAndSet(executorC2323c, j6, j6 - 4398046511104L));
            this.f13279g = enumC2322b2;
        }
        if (z7) {
            if (m3695d(executorC2323c.f13295e * 2) != 0) {
                z8 = false;
            }
            if (z8 && (m3696e2 = m3696e()) != null) {
                return m3696e2;
            }
            c2333m.getClass();
            AbstractRunnableC2329i abstractRunnableC2329i4 = (AbstractRunnableC2329i) C2333m.f13317b.getAndSet(c2333m, null);
            if (abstractRunnableC2329i4 == null) {
                abstractRunnableC2329i4 = c2333m.m3708b();
            }
            if (abstractRunnableC2329i4 != null) {
                return abstractRunnableC2329i4;
            }
            if (!z8 && (m3696e = m3696e()) != null) {
                return m3696e;
            }
        } else {
            AbstractRunnableC2329i m3696e3 = m3696e();
            if (m3696e3 != null) {
                return m3696e3;
            }
        }
        return m3700i(3);
    }

    /* renamed from: b */
    public final int m3693b() {
        return this.indexInArray;
    }

    /* renamed from: c */
    public final Object m3694c() {
        return this.nextParkedWorker;
    }

    /* renamed from: d */
    public final int m3695d(int i7) {
        int i8 = this.f13282j;
        int i9 = i8 ^ (i8 << 13);
        int i10 = i9 ^ (i9 >> 17);
        int i11 = i10 ^ (i10 << 5);
        this.f13282j = i11;
        int i12 = i7 - 1;
        if ((i12 & i7) == 0) {
            return i11 & i12;
        }
        return (i11 & Integer.MAX_VALUE) % i7;
    }

    /* renamed from: e */
    public final AbstractRunnableC2329i m3696e() {
        int m3695d = m3695d(2);
        ExecutorC2323c executorC2323c = this.f13284l;
        if (m3695d == 0) {
            AbstractRunnableC2329i abstractRunnableC2329i = (AbstractRunnableC2329i) executorC2323c.f13299i.m3454d();
            if (abstractRunnableC2329i != null) {
                return abstractRunnableC2329i;
            }
            return (AbstractRunnableC2329i) executorC2323c.f13300j.m3454d();
        }
        AbstractRunnableC2329i abstractRunnableC2329i2 = (AbstractRunnableC2329i) executorC2323c.f13300j.m3454d();
        if (abstractRunnableC2329i2 != null) {
            return abstractRunnableC2329i2;
        }
        return (AbstractRunnableC2329i) executorC2323c.f13299i.m3454d();
    }

    /* renamed from: f */
    public final void m3697f(int i7) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13284l.f13298h);
        sb.append("-worker-");
        if (i7 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i7);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i7;
    }

    /* renamed from: g */
    public final void m3698g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* renamed from: h */
    public final boolean m3699h(EnumC2322b enumC2322b) {
        boolean z7;
        EnumC2322b enumC2322b2 = this.f13279g;
        if (enumC2322b2 == EnumC2322b.f13285e) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            ExecutorC2323c.f13292m.addAndGet(this.f13284l, 4398046511104L);
        }
        if (enumC2322b2 != enumC2322b) {
            this.f13279g = enumC2322b;
        }
        return z7;
    }

    /* renamed from: i */
    public final AbstractRunnableC2329i m3700i(int i7) {
        boolean z7;
        long j6;
        AbstractRunnableC2329i abstractRunnableC2329i;
        long j7;
        long j8;
        AbstractRunnableC2329i abstractRunnableC2329i2;
        int i8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC2323c.f13292m;
        ExecutorC2323c executorC2323c = this.f13284l;
        int i9 = (int) (atomicLongFieldUpdater.get(executorC2323c) & 2097151);
        AbstractRunnableC2329i abstractRunnableC2329i3 = null;
        if (i9 < 2) {
            return null;
        }
        int m3695d = m3695d(i9);
        int i10 = 0;
        long j9 = Long.MAX_VALUE;
        while (i10 < i9) {
            m3695d++;
            if (m3695d > i9) {
                m3695d = 1;
            }
            C2321a c2321a = (C2321a) executorC2323c.f13301k.m3460b(m3695d);
            if (c2321a != null && c2321a != this) {
                C2333m c2333m = c2321a.f13277e;
                if (i7 == 3) {
                    abstractRunnableC2329i = c2333m.m3708b();
                    j6 = 0;
                } else {
                    c2333m.getClass();
                    int i11 = C2333m.f13319d.get(c2333m);
                    int i12 = C2333m.f13318c.get(c2333m);
                    if (i7 == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    while (true) {
                        if (i11 != i12) {
                            j6 = 0;
                            if (!z7 || C2333m.f13320e.get(c2333m) != 0) {
                                int i13 = i11 + 1;
                                abstractRunnableC2329i = c2333m.m3709c(i11, z7);
                                if (abstractRunnableC2329i != null) {
                                    break;
                                }
                                i11 = i13;
                            } else {
                                break;
                            }
                        } else {
                            j6 = 0;
                            break;
                        }
                    }
                    abstractRunnableC2329i = abstractRunnableC2329i3;
                }
                C3379v c3379v = this.f13278f;
                if (abstractRunnableC2329i != null) {
                    c3379v.f16451e = abstractRunnableC2329i;
                    abstractRunnableC2329i2 = abstractRunnableC2329i3;
                    j8 = -1;
                    j7 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2333m.f13317b;
                        AbstractRunnableC2329i abstractRunnableC2329i4 = (AbstractRunnableC2329i) atomicReferenceFieldUpdater.get(c2333m);
                        if (abstractRunnableC2329i4 == null) {
                            j7 = -1;
                            break;
                        }
                        j7 = -1;
                        if (abstractRunnableC2329i4.f13308f) {
                            i8 = 1;
                        } else {
                            i8 = 2;
                        }
                        if ((i8 & i7) == 0) {
                            break;
                        }
                        AbstractC2331k.f13315f.getClass();
                        C2333m c2333m2 = c2333m;
                        long nanoTime = System.nanoTime() - abstractRunnableC2329i4.f13307e;
                        long j10 = AbstractC2331k.f13311b;
                        if (nanoTime < j10) {
                            j8 = j10 - nanoTime;
                            abstractRunnableC2329i2 = null;
                            break;
                        }
                        do {
                            abstractRunnableC2329i2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(c2333m2, abstractRunnableC2329i4, null)) {
                                c3379v.f16451e = abstractRunnableC2329i4;
                                j8 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(c2333m2) == abstractRunnableC2329i4);
                        c2333m = c2333m2;
                        abstractRunnableC2329i3 = null;
                    }
                    j8 = -2;
                    abstractRunnableC2329i2 = abstractRunnableC2329i3;
                }
                if (j8 == j7) {
                    AbstractRunnableC2329i abstractRunnableC2329i5 = (AbstractRunnableC2329i) c3379v.f16451e;
                    c3379v.f16451e = abstractRunnableC2329i2;
                    return abstractRunnableC2329i5;
                }
                if (j8 > j6) {
                    j9 = Math.min(j9, j8);
                }
            }
            i10++;
            abstractRunnableC2329i3 = null;
        }
        if (j9 == Long.MAX_VALUE) {
            j9 = 0;
        }
        this.f13281i = j9;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j6;
        boolean z7;
        loop0: while (true) {
            boolean z8 = false;
            while (ExecutorC2323c.f13293n.get(this.f13284l) == 0) {
                EnumC2322b enumC2322b = this.f13279g;
                EnumC2322b enumC2322b2 = EnumC2322b.f13289i;
                if (enumC2322b == enumC2322b2) {
                    break loop0;
                }
                AbstractRunnableC2329i m3692a = m3692a(this.f13283k);
                if (m3692a != null) {
                    this.f13281i = 0L;
                    ExecutorC2323c executorC2323c = this.f13284l;
                    this.f13280h = 0L;
                    if (this.f13279g == EnumC2322b.f13287g) {
                        this.f13279g = EnumC2322b.f13286f;
                    }
                    if (m3692a.f13308f) {
                        if (m3699h(EnumC2322b.f13286f) && !executorC2323c.m3706m() && !executorC2323c.m3705h(ExecutorC2323c.f13292m.get(executorC2323c))) {
                            executorC2323c.m3706m();
                        }
                        try {
                            m3692a.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        ExecutorC2323c.f13292m.addAndGet(executorC2323c, -2097152L);
                        if (this.f13279g != enumC2322b2) {
                            this.f13279g = EnumC2322b.f13288h;
                        }
                    } else {
                        try {
                            m3692a.run();
                        } catch (Throwable th2) {
                            Thread currentThread2 = Thread.currentThread();
                            currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                        }
                    }
                } else {
                    this.f13283k = false;
                    if (this.f13281i != 0) {
                        if (!z8) {
                            z8 = true;
                        } else {
                            m3699h(EnumC2322b.f13287g);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f13281i);
                            this.f13281i = 0L;
                        }
                    } else {
                        Object obj = this.nextParkedWorker;
                        C1279sl c1279sl = ExecutorC2323c.f13294o;
                        if (obj != c1279sl) {
                            f13276m.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC2323c.f13294o) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13276m;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    ExecutorC2323c executorC2323c2 = this.f13284l;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC2323c.f13293n;
                                    if (atomicIntegerFieldUpdater2.get(executorC2323c2) != 0) {
                                        break;
                                    }
                                    EnumC2322b enumC2322b3 = this.f13279g;
                                    EnumC2322b enumC2322b4 = EnumC2322b.f13289i;
                                    if (enumC2322b3 == enumC2322b4) {
                                        break;
                                    }
                                    m3699h(EnumC2322b.f13287g);
                                    Thread.interrupted();
                                    if (this.f13280h == 0) {
                                        j6 = 2097151;
                                        this.f13280h = System.nanoTime() + this.f13284l.f13297g;
                                    } else {
                                        j6 = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f13284l.f13297g);
                                    if (System.nanoTime() - this.f13280h >= 0) {
                                        this.f13280h = 0L;
                                        ExecutorC2323c executorC2323c3 = this.f13284l;
                                        synchronized (executorC2323c3.f13301k) {
                                            try {
                                                if (atomicIntegerFieldUpdater2.get(executorC2323c3) != 0) {
                                                    z7 = true;
                                                } else {
                                                    z7 = false;
                                                }
                                                if (!z7) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC2323c.f13292m;
                                                    if (((int) (atomicLongFieldUpdater.get(executorC2323c3) & j6)) > executorC2323c3.f13295e) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i7 = this.indexInArray;
                                                            m3697f(0);
                                                            executorC2323c3.m3704f(this, i7, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC2323c3) & j6);
                                                            if (andDecrement != i7) {
                                                                Object m3460b = executorC2323c3.f13301k.m3460b(andDecrement);
                                                                AbstractC3367j.m5097b(m3460b);
                                                                C2321a c2321a = (C2321a) m3460b;
                                                                executorC2323c3.f13301k.m3461c(i7, c2321a);
                                                                c2321a.m3697f(i7);
                                                                executorC2323c3.m3704f(c2321a, andDecrement, i7);
                                                            }
                                                            executorC2323c3.f13301k.m3461c(andDecrement, null);
                                                            this.f13279g = enumC2322b4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ExecutorC2323c executorC2323c4 = this.f13284l;
                            if (this.nextParkedWorker == c1279sl) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC2323c.f13291l;
                                while (true) {
                                    long j7 = atomicLongFieldUpdater2.get(executorC2323c4);
                                    int i8 = this.indexInArray;
                                    this.nextParkedWorker = executorC2323c4.f13301k.m3460b((int) (j7 & 2097151));
                                    ExecutorC2323c executorC2323c5 = executorC2323c4;
                                    if (ExecutorC2323c.f13291l.compareAndSet(executorC2323c5, j7, ((j7 + 2097152) & (-2097152)) | i8)) {
                                        break;
                                    } else {
                                        executorC2323c4 = executorC2323c5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            break loop0;
        }
        m3699h(EnumC2322b.f13289i);
    }
}
