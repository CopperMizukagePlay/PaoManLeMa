package p032d6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p065i2.AbstractC2064e;
import p069i6.AbstractC2088a;
import p069i6.C2103p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.j0 */
/* loaded from: classes.dex */
public final class C0543j0 extends C2103p {

    /* renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1888i = AtomicIntegerFieldUpdater.newUpdater(C0543j0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p069i6.C2103p, p032d6.C0541i1
    /* renamed from: D */
    public final void mo1159D(Object obj) {
        mo1171E(obj);
    }

    @Override // p069i6.C2103p, p032d6.C0541i1
    /* renamed from: E */
    public final void mo1171E(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f1888i;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 1) {
                    AbstractC2088a.m3437h(AbstractC0525d0.m1143u(obj), AbstractC2064e.m3250x(this.f12378h));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
