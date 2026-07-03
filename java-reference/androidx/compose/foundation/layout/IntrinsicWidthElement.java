package androidx.compose.foundation.layout;

import p100n.AbstractC2647h;
import p144t.C3125d0;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class IntrinsicWidthElement extends AbstractC3556y0 {
    public final boolean equals(Object obj) {
        IntrinsicWidthElement intrinsicWidthElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicWidthElement) {
            intrinsicWidthElement = (IntrinsicWidthElement) obj;
        } else {
            intrinsicWidthElement = null;
        }
        if (intrinsicWidthElement != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t.d0, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f15768s = 2;
        abstractC3809q.f15769t = true;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (AbstractC2647h.m4257c(2) * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3125d0 c3125d0 = (C3125d0) abstractC3809q;
        c3125d0.f15768s = 2;
        c3125d0.f15769t = true;
    }
}
