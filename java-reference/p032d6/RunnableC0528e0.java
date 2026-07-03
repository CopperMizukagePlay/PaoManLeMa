package p032d6;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.e0 */
/* loaded from: classes.dex */
public final class RunnableC0528e0 extends AbstractC0567r0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: n */
    public static final RunnableC0528e0 f1868n;

    /* renamed from: o */
    public static final long f1869o;

    /* JADX WARN: Type inference failed for: r0v0, types: [d6.r0, d6.s0, d6.e0] */
    static {
        Long l7;
        ?? abstractC0567r0 = new AbstractC0567r0();
        f1868n = abstractC0567r0;
        abstractC0567r0.m1241P(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f1869o = timeUnit.toNanos(l7.longValue());
    }

    @Override // p032d6.AbstractC0570s0
    /* renamed from: O */
    public final Thread mo1151O() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f1868n.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override // p032d6.AbstractC0570s0
    /* renamed from: S */
    public final void mo1152S(long j6, AbstractRunnableC0561p0 abstractRunnableC0561p0) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p032d6.AbstractC0567r0
    /* renamed from: T */
    public final void mo1153T(Runnable runnable) {
        if (debugStatus != 4) {
            super.mo1153T(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* renamed from: Y */
    public final synchronized void m1154Y() {
        boolean z7;
        int i7 = debugStatus;
        if (i7 != 2 && i7 != 3) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (!z7) {
            return;
        }
        debugStatus = 3;
        AbstractC0567r0.f1919k.set(this, null);
        AbstractC0567r0.f1920l.set(this, null);
        notifyAll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        boolean z8;
        boolean m1237W;
        AbstractC0574t1.f1928a.set(this);
        try {
            synchronized (this) {
                int i7 = debugStatus;
                if (i7 != 2 && i7 != 3) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (z7) {
                    if (!m1237W) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j6 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long mo1234Q = mo1234Q();
                    if (mo1234Q == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j6 == Long.MAX_VALUE) {
                            j6 = f1869o + nanoTime;
                        }
                        long j7 = j6 - nanoTime;
                        if (j7 <= 0) {
                            _thread = null;
                            m1154Y();
                            if (!m1237W()) {
                                mo1151O();
                                return;
                            }
                            return;
                        }
                        if (mo1234Q > j7) {
                            mo1234Q = j7;
                        }
                    } else {
                        j6 = Long.MAX_VALUE;
                    }
                    if (mo1234Q > 0) {
                        int i8 = debugStatus;
                        if (i8 != 2 && i8 != 3) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (z8) {
                            _thread = null;
                            m1154Y();
                            if (!m1237W()) {
                                mo1151O();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, mo1234Q);
                    }
                }
            }
        } finally {
            _thread = null;
            m1154Y();
            if (!m1237W()) {
                mo1151O();
            }
        }
    }

    @Override // p032d6.AbstractC0567r0, p032d6.AbstractC0570s0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p032d6.AbstractC0581w
    public final String toString() {
        return "DefaultExecutor";
    }
}
