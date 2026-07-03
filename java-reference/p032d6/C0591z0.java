package p032d6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p001a0.C0098z1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.z0 */
/* loaded from: classes.dex */
public final class C0591z0 extends AbstractC0529e1 {

    /* renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1943j = AtomicIntegerFieldUpdater.newUpdater(C0591z0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: i */
    public final C0098z1 f1944i;

    public C0591z0(C0098z1 c0098z1) {
        this.f1944i = c0098z1;
    }

    @Override // p032d6.AbstractC0529e1
    /* renamed from: k */
    public final boolean mo1111k() {
        return true;
    }

    @Override // p032d6.AbstractC0529e1
    /* renamed from: l */
    public final void mo1112l(Throwable th) {
        if (f1943j.compareAndSet(this, 0, 1)) {
            this.f1944i.mo23f(th);
        }
    }
}
