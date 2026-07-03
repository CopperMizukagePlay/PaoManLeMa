package p054g6;

import java.util.concurrent.atomic.AtomicReference;
import p061h6.AbstractC1820b;
import p061h6.AbstractC1821c;
import p061h6.AbstractC1822d;
import p082k5.InterfaceC2313c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g6.d0 */
/* loaded from: classes.dex */
public final class C1703d0 extends AbstractC1822d {

    /* renamed from: a */
    public final AtomicReference f10503a = new AtomicReference(null);

    @Override // p061h6.AbstractC1822d
    /* renamed from: a */
    public final boolean mo2754a(AbstractC1820b abstractC1820b) {
        AtomicReference atomicReference = this.f10503a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC1719t.f10556b);
        return true;
    }

    @Override // p061h6.AbstractC1822d
    /* renamed from: b */
    public final InterfaceC2313c[] mo2755b(AbstractC1820b abstractC1820b) {
        this.f10503a.set(null);
        return AbstractC1821c.f10871a;
    }
}
