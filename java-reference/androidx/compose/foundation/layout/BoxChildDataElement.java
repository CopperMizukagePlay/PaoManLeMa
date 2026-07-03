package androidx.compose.foundation.layout;

import p144t.C3138k;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;
import p177x0.C3802j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class BoxChildDataElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C3802j f635a;

    public BoxChildDataElement(C3802j c3802j) {
        this.f635a = c3802j;
    }

    public final boolean equals(Object obj) {
        BoxChildDataElement boxChildDataElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BoxChildDataElement) {
            boxChildDataElement = (BoxChildDataElement) obj;
        } else {
            boxChildDataElement = null;
        }
        if (boxChildDataElement != null && this.f635a.equals(boxChildDataElement.f635a)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t.k, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f15799s = this.f635a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f635a.hashCode() * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C3138k) abstractC3809q).f15799s = this.f635a;
    }
}
