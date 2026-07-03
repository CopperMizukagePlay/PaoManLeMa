package androidx.compose.foundation.lazy.layout;

import p158u5.AbstractC3367j;
import p160v.C3401b1;
import p160v.C3431q0;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C3431q0 f675a;

    public TraversablePrefetchStateModifierElement(C3431q0 c3431q0) {
        this.f675a = c3431q0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TraversablePrefetchStateModifierElement) && AbstractC3367j.m5096a(this.f675a, ((TraversablePrefetchStateModifierElement) obj).f675a)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.b1, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f16524s = this.f675a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f675a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C3401b1) abstractC3809q).f16524s = this.f675a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f675a + ')';
    }
}
