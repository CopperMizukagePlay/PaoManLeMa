package androidx.compose.p007ui.layout;

import p146t1.C3231r0;
import p150t5.InterfaceC3279c;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3279c f778a;

    public OnGloballyPositionedElement(InterfaceC3279c interfaceC3279c) {
        this.f778a = interfaceC3279c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedElement)) {
            return false;
        }
        if (this.f778a == ((OnGloballyPositionedElement) obj).f778a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t1.r0, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f16039s = this.f778a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f778a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C3231r0) abstractC3809q).f16039s = this.f778a;
    }
}
