package p091l6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p069i6.AbstractC2104q;
import p082k5.InterfaceC2318h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l6.k */
/* loaded from: classes.dex */
public final class C2480k extends AbstractC2104q {

    /* renamed from: e */
    public final /* synthetic */ AtomicReferenceArray f13779e;

    public C2480k(long j6, C2480k c2480k, int i7) {
        super(j6, c2480k, i7);
        this.f13779e = new AtomicReferenceArray(AbstractC2479j.f13778f);
    }

    @Override // p069i6.AbstractC2104q
    /* renamed from: g */
    public final int mo2511g() {
        return AbstractC2479j.f13778f;
    }

    @Override // p069i6.AbstractC2104q
    /* renamed from: h */
    public final void mo2512h(int i7, InterfaceC2318h interfaceC2318h) {
        this.f13779e.set(i7, AbstractC2479j.f13777e);
        m3463i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f12380c + ", hashCode=" + hashCode() + ']';
    }
}
