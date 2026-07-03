package p098m5;

import p082k5.C2319i;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m5.h */
/* loaded from: classes.dex */
public abstract class AbstractC2588h extends AbstractC2581a {
    public AbstractC2588h(InterfaceC2313c interfaceC2313c) {
        super(interfaceC2313c);
        if (interfaceC2313c != null && interfaceC2313c.mo662j() != C2319i.f13273e) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: j */
    public final InterfaceC2318h mo662j() {
        return C2319i.f13273e;
    }
}
