package androidx.compose.p007ui.draw;

import p010b1.C0268f;
import p150t5.InterfaceC3279c;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class DrawWithContentElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3279c f746a;

    public DrawWithContentElement(InterfaceC3279c interfaceC3279c) {
        this.f746a = interfaceC3279c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawWithContentElement)) {
            return false;
        }
        if (this.f746a == ((DrawWithContentElement) obj).f746a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b1.f, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f1002s = this.f746a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f746a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C0268f) abstractC3809q).f1002s = this.f746a;
    }
}
