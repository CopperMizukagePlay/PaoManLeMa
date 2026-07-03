package p161v0;

import java.util.concurrent.atomic.AtomicInteger;
import p145t0.C3170a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.z */
/* loaded from: classes.dex */
public abstract class AbstractC3479z implements InterfaceC3478y {

    /* renamed from: e */
    public final C3170a f16775e = new AtomicInteger(0);

    /* renamed from: e */
    public final boolean m5283e(int i7) {
        if ((i7 & this.f16775e.get()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m5284f(int i7) {
        C3170a c3170a;
        int i8;
        do {
            c3170a = this.f16775e;
            i8 = c3170a.get();
            if ((i8 & i7) != 0) {
                return;
            }
        } while (!c3170a.compareAndSet(i8, i8 | i7));
    }
}
