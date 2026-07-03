package p032d6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p082k5.InterfaceC2318h;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.u0 */
/* loaded from: classes.dex */
public final class C0576u0 extends AbstractC0573t0 implements InterfaceC0540i0 {

    /* renamed from: g */
    public final Executor f1930g;

    public C0576u0(Executor executor) {
        this.f1930g = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // p032d6.AbstractC0581w
    /* renamed from: J */
    public final void mo1233J(InterfaceC2318h interfaceC2318h, Runnable runnable) {
        try {
            this.f1930g.execute(runnable);
        } catch (RejectedExecutionException e7) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e7);
            InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) interfaceC2318h.mo853h(C0584x.f1939f);
            if (interfaceC0520b1 != null) {
                interfaceC0520b1.mo1114c(cancellationException);
            }
            C2325e c2325e = AbstractC0549l0.f1898a;
            ExecutorC2324d.f13302g.mo1233J(interfaceC2318h, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f1930g;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0576u0) && ((C0576u0) obj).f1930g == this.f1930g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1930g);
    }

    @Override // p032d6.InterfaceC0540i0
    /* renamed from: n */
    public final void mo1168n(long j6, C0548l c0548l) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f1930g;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            RunnableC0562p1 runnableC0562p1 = new RunnableC0562p1(this, c0548l);
            InterfaceC2318h interfaceC2318h = c0548l.f1897i;
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnableC0562p1, j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) interfaceC2318h.mo853h(C0584x.f1939f);
                if (interfaceC0520b1 != null) {
                    interfaceC0520b1.mo1114c(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0548l.m1225x(new C0536h(0, scheduledFuture));
        } else {
            RunnableC0528e0.f1868n.mo1168n(j6, c0548l);
        }
    }

    @Override // p032d6.AbstractC0581w
    public final String toString() {
        return this.f1930g.toString();
    }
}
