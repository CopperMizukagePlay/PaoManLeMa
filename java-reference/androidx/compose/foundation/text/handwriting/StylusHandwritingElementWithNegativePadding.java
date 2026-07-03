package androidx.compose.foundation.text.handwriting;

import p009b0.C0261c;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class StylusHandwritingElementWithNegativePadding extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3277a f719a;

    public StylusHandwritingElementWithNegativePadding(InterfaceC3277a interfaceC3277a) {
        this.f719a = interfaceC3277a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StylusHandwritingElementWithNegativePadding) && AbstractC3367j.m5096a(this.f719a, ((StylusHandwritingElementWithNegativePadding) obj).f719a)) {
            return true;
        }
        return false;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C0261c(this.f719a);
    }

    public final int hashCode() {
        return this.f719a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C0261c) abstractC3809q).f992u = this.f719a;
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.f719a + ')';
    }
}
