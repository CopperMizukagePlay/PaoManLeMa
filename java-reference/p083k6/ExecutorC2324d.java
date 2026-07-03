package p083k6;

import java.util.concurrent.Executor;
import p032d6.AbstractC0573t0;
import p032d6.AbstractC0581w;
import p069i6.AbstractC2088a;
import p069i6.AbstractC2106s;
import p082k5.C2319i;
import p082k5.InterfaceC2318h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k6.d */
/* loaded from: classes.dex */
public final class ExecutorC2324d extends AbstractC0573t0 implements Executor {

    /* renamed from: g */
    public static final ExecutorC2324d f13302g = new AbstractC0581w();

    /* renamed from: h */
    public static final AbstractC0581w f13303h;

    /* JADX WARN: Type inference failed for: r0v0, types: [k6.d, d6.w] */
    static {
        C2332l c2332l = C2332l.f13316g;
        int i7 = AbstractC2106s.f12382a;
        if (64 >= i7) {
            i7 = 64;
        }
        f13303h = c2332l.mo1245L(AbstractC2088a.m3439j(i7, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // p032d6.AbstractC0581w
    /* renamed from: J */
    public final void mo1233J(InterfaceC2318h interfaceC2318h, Runnable runnable) {
        f13303h.mo1233J(interfaceC2318h, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo1233J(C2319i.f13273e, runnable);
    }

    @Override // p032d6.AbstractC0581w
    public final String toString() {
        return "Dispatchers.IO";
    }
}
