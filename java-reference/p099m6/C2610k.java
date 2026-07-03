package p099m6;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p100n.AbstractC2647h;
import p106n6.AbstractC2721b;
import p106n6.ThreadFactoryC2720a;
import p128q6.C3006i;
import p128q6.RunnableC3003f;
import p158u5.AbstractC3367j;
import p196z6.C3887f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.k */
/* loaded from: classes.dex */
public final class C2610k {

    /* renamed from: c */
    public ExecutorService f14129c;

    /* renamed from: a */
    public int f14127a = 64;

    /* renamed from: b */
    public int f14128b = 5;

    /* renamed from: d */
    public final ArrayDeque f14130d = new ArrayDeque();

    /* renamed from: e */
    public final ArrayDeque f14131e = new ArrayDeque();

    /* renamed from: f */
    public final ArrayDeque f14132f = new ArrayDeque();

    /* renamed from: a */
    public final synchronized void m4157a() {
        try {
            Iterator it = this.f14130d.iterator();
            while (it.hasNext()) {
                ((RunnableC3003f) it.next()).f15491g.m4680d();
            }
            Iterator it2 = this.f14131e.iterator();
            while (it2.hasNext()) {
                ((RunnableC3003f) it2.next()).f15491g.m4680d();
            }
            Iterator it3 = this.f14132f.iterator();
            while (it3.hasNext()) {
                ((C3006i) it3.next()).m4680d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final void m4158b(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m4160d();
    }

    /* renamed from: c */
    public final void m4159c(RunnableC3003f runnableC3003f) {
        runnableC3003f.f15490f.decrementAndGet();
        m4158b(this.f14131e, runnableC3003f);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4160d() {
        int size;
        int i7;
        ExecutorService executorService;
        byte[] bArr = AbstractC2721b.f14569a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f14130d.iterator();
                AbstractC3367j.m5099d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    RunnableC3003f runnableC3003f = (RunnableC3003f) it.next();
                    if (this.f14131e.size() >= this.f14127a) {
                        break;
                    }
                    if (runnableC3003f.f15490f.get() < this.f14128b) {
                        it.remove();
                        runnableC3003f.f15490f.incrementAndGet();
                        arrayList.add(runnableC3003f);
                        this.f14131e.add(runnableC3003f);
                    }
                }
                synchronized (this) {
                    this.f14131e.size();
                    this.f14132f.size();
                }
                size = arrayList.size();
                for (i7 = 0; i7 < size; i7++) {
                    RunnableC3003f runnableC3003f2 = (RunnableC3003f) arrayList.get(i7);
                    synchronized (this) {
                        try {
                            if (this.f14129c == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = AbstractC2721b.f14575g + " Dispatcher";
                                AbstractC3367j.m5100e(str, "name");
                                this.f14129c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC2720a(str, false));
                            }
                            executorService = this.f14129c;
                            AbstractC3367j.m5097b(executorService);
                        } finally {
                        }
                    }
                    runnableC3003f2.getClass();
                    C3006i c3006i = runnableC3003f2.f15491g;
                    byte[] bArr2 = AbstractC2721b.f14569a;
                    try {
                        try {
                            executorService.execute(runnableC3003f2);
                        } catch (RejectedExecutionException e7) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e7);
                            c3006i.m4685i(interruptedIOException);
                            ((C3887f) runnableC3003f2.f15489e.f17917b).m5902c(interruptedIOException, null);
                            c3006i.f15494e.f14200e.m4159c(runnableC3003f2);
                        }
                    } catch (Throwable th) {
                        c3006i.f15494e.f14200e.m4159c(runnableC3003f2);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        size = arrayList.size();
        while (i7 < size) {
        }
    }

    /* renamed from: e */
    public final void m4161e(int i7) {
        if (i7 >= 1) {
            synchronized (this) {
                this.f14127a = i7;
            }
            m4160d();
            return;
        }
        throw new IllegalArgumentException(AbstractC2647h.m4256b("max < 1: ", i7).toString());
    }

    /* renamed from: f */
    public final void m4162f(int i7) {
        if (i7 >= 1) {
            synchronized (this) {
                this.f14128b = i7;
            }
            m4160d();
            return;
        }
        throw new IllegalArgumentException(AbstractC2647h.m4256b("max < 1: ", i7).toString());
    }
}
