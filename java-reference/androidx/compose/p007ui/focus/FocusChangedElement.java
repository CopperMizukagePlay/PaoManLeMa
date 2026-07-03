package androidx.compose.p007ui.focus;

import p019c1.C0359c;
import p150t5.InterfaceC3279c;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class FocusChangedElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3279c f756a;

    public FocusChangedElement(InterfaceC3279c interfaceC3279c) {
        this.f756a = interfaceC3279c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusChangedElement)) {
            return false;
        }
        if (this.f756a == ((FocusChangedElement) obj).f756a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.q, c1.c] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f1225s = this.f756a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f756a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C0359c) abstractC3809q).f1225s = this.f756a;
    }
}
