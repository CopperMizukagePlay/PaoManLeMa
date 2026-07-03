package p015b6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b6.a */
/* loaded from: classes.dex */
public final class C0294a implements InterfaceC0305l {

    /* renamed from: a */
    public final AtomicReference f1071a;

    public C0294a(InterfaceC0305l interfaceC0305l) {
        this.f1071a = new AtomicReference(interfaceC0305l);
    }

    @Override // p015b6.InterfaceC0305l
    public final Iterator iterator() {
        InterfaceC0305l interfaceC0305l = (InterfaceC0305l) this.f1071a.getAndSet(null);
        if (interfaceC0305l != null) {
            return interfaceC0305l.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
