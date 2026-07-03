package androidx.compose.foundation.layout;

import p144t.C3131g0;
import p150t5.InterfaceC3279c;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class OffsetPxElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3279c f641a;

    public OffsetPxElement(InterfaceC3279c interfaceC3279c) {
        this.f641a = interfaceC3279c;
    }

    public final boolean equals(Object obj) {
        OffsetPxElement offsetPxElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxElement) {
            offsetPxElement = (OffsetPxElement) obj;
        } else {
            offsetPxElement = null;
        }
        if (offsetPxElement != null && this.f641a == offsetPxElement.f641a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t.g0, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f15780s = this.f641a;
        abstractC3809q.f15781t = true;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f641a.hashCode() * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3131g0 c3131g0 = (C3131g0) abstractC3809q;
        c3131g0.f15780s = this.f641a;
        c3131g0.f15781t = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f641a + ", rtlAware=true)";
    }
}
