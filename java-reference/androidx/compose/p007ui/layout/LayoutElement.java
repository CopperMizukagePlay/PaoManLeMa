package androidx.compose.p007ui.layout;

import p146t1.C3244y;
import p150t5.InterfaceC3282f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class LayoutElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3282f f776a;

    public LayoutElement(InterfaceC3282f interfaceC3282f) {
        this.f776a = interfaceC3282f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LayoutElement)) {
            return false;
        }
        if (this.f776a == ((LayoutElement) obj).f776a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.q, t1.y] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f16064s = this.f776a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f776a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C3244y) abstractC3809q).f16064s = this.f776a;
    }
}
