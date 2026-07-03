package p069i6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p032d6.AbstractC0531f0;
import p032d6.AbstractC0581w;
import p032d6.C0548l;
import p032d6.InterfaceC0540i0;
import p032d6.RunnableC0562p1;
import p082k5.InterfaceC2318h;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.g */
/* loaded from: classes.dex */
public final class C2094g extends AbstractC0581w implements InterfaceC0540i0 {

    /* renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12357l = AtomicIntegerFieldUpdater.newUpdater(C2094g.class, "runningWorkers$volatile");

    /* renamed from: g */
    public final /* synthetic */ InterfaceC0540i0 f12358g;

    /* renamed from: h */
    public final AbstractC0581w f12359h;

    /* renamed from: i */
    public final int f12360i;

    /* renamed from: j */
    public final C2097j f12361j;

    /* renamed from: k */
    public final Object f12362k;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C2094g(AbstractC0581w abstractC0581w, int i7) {
        InterfaceC0540i0 interfaceC0540i0;
        if (abstractC0581w instanceof InterfaceC0540i0) {
            interfaceC0540i0 = (InterfaceC0540i0) abstractC0581w;
        } else {
            interfaceC0540i0 = null;
        }
        this.f12358g = interfaceC0540i0 == null ? AbstractC0531f0.f1873a : interfaceC0540i0;
        this.f12359h = abstractC0581w;
        this.f12360i = i7;
        this.f12361j = new C2097j();
        this.f12362k = new Object();
    }

    @Override // p032d6.AbstractC0581w
    /* renamed from: J */
    public final void mo1233J(InterfaceC2318h interfaceC2318h, Runnable runnable) {
        boolean z7;
        Runnable m3446M;
        this.f12361j.m3451a(runnable);
        if (f12357l.get(this) < this.f12360i) {
            synchronized (this.f12362k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12357l;
                if (atomicIntegerFieldUpdater.get(this) >= this.f12360i) {
                    z7 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z7 = true;
                }
            }
            if (z7 && (m3446M = m3446M()) != null) {
                this.f12359h.mo1233J(this, new RunnableC0562p1(2, this, m3446M));
            }
        }
    }

    /* renamed from: M */
    public final Runnable m3446M() {
        while (true) {
            Runnable runnable = (Runnable) this.f12361j.m3454d();
            if (runnable == null) {
                synchronized (this.f12362k) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12357l;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f12361j.m3453c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    @Override // p032d6.InterfaceC0540i0
    /* renamed from: n */
    public final void mo1168n(long j6, C0548l c0548l) {
        this.f12358g.mo1168n(j6, c0548l);
    }

    @Override // p032d6.AbstractC0581w
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12359h);
        sb.append(".limitedParallelism(");
        return AbstractC2487d.m4045i(sb, this.f12360i, ')');
    }
}
