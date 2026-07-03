package p069i6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p032d6.InterfaceC0556n1;
import p082k5.InterfaceC2318h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i6.q */
/* loaded from: classes.dex */
public abstract class AbstractC2104q extends AbstractC2089b implements InterfaceC0556n1 {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12379d = AtomicIntegerFieldUpdater.newUpdater(AbstractC2104q.class, "cleanedAndPointers$volatile");

    /* renamed from: c */
    public final long f12380c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC2104q(long j6, AbstractC2104q abstractC2104q, int i7) {
        super(abstractC2104q);
        this.f12380c = j6;
        this.cleanedAndPointers$volatile = i7 << 16;
    }

    @Override // p069i6.AbstractC2089b
    /* renamed from: d */
    public final boolean mo3444d() {
        if (f12379d.get(this) == mo2511g() && m3443c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m3462f() {
        if (f12379d.addAndGet(this, -65536) == mo2511g() && m3443c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public abstract int mo2511g();

    /* renamed from: h */
    public abstract void mo2512h(int i7, InterfaceC2318h interfaceC2318h);

    /* renamed from: i */
    public final void m3463i() {
        if (f12379d.incrementAndGet(this) == mo2511g()) {
            m3445e();
        }
    }

    /* renamed from: j */
    public final boolean m3464j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f12379d;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == mo2511g() && m3443c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
