package p006a7;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.f */
/* loaded from: classes.dex */
public class C0123f extends C0120c0 {

    /* renamed from: h */
    public static final ReentrantLock f506h;

    /* renamed from: i */
    public static final Condition f507i;

    /* renamed from: j */
    public static final long f508j;

    /* renamed from: k */
    public static final long f509k;

    /* renamed from: l */
    public static C0123f f510l;

    /* renamed from: e */
    public boolean f511e;

    /* renamed from: f */
    public C0123f f512f;

    /* renamed from: g */
    public long f513g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f506h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        AbstractC3367j.m5099d(newCondition, "newCondition(...)");
        f507i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f508j = millis;
        f509k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [a7.f, java.lang.Object] */
    /* renamed from: i */
    public final void m233i() {
        C0123f c0123f;
        long j6 = this.f499c;
        boolean z7 = this.f497a;
        if (j6 == 0 && !z7) {
            return;
        }
        ReentrantLock reentrantLock = f506h;
        reentrantLock.lock();
        try {
            if (!this.f511e) {
                this.f511e = true;
                if (f510l == null) {
                    f510l = new Object();
                    Thread thread = new Thread("Okio Watchdog");
                    thread.setDaemon(true);
                    thread.start();
                }
                long nanoTime = System.nanoTime();
                if (j6 != 0 && z7) {
                    this.f513g = Math.min(j6, mo228c() - nanoTime) + nanoTime;
                } else if (j6 != 0) {
                    this.f513g = j6 + nanoTime;
                } else if (z7) {
                    this.f513g = mo228c();
                } else {
                    throw new AssertionError();
                }
                long j7 = this.f513g - nanoTime;
                C0123f c0123f2 = f510l;
                AbstractC3367j.m5097b(c0123f2);
                while (true) {
                    c0123f = c0123f2.f512f;
                    if (c0123f == null || j7 < c0123f.f513g - nanoTime) {
                        break;
                    } else {
                        c0123f2 = c0123f;
                    }
                }
                this.f512f = c0123f;
                c0123f2.f512f = this;
                if (c0123f2 == f510l) {
                    f507i.signal();
                }
                reentrantLock.unlock();
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: j */
    public final boolean m234j() {
        ReentrantLock reentrantLock = f506h;
        reentrantLock.lock();
        try {
            if (!this.f511e) {
                return false;
            }
            this.f511e = false;
            C0123f c0123f = f510l;
            while (c0123f != null) {
                C0123f c0123f2 = c0123f.f512f;
                if (c0123f2 == this) {
                    c0123f.f512f = this.f512f;
                    this.f512f = null;
                    return false;
                }
                c0123f = c0123f2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: k */
    public void mo235k() {
    }
}
