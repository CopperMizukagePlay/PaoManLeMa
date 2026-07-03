package androidx.compose.p007ui.input.rotary;

import p131r1.C3025a;
import p162v1.AbstractC3556y0;
import p170w1.C3704n;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class RotaryInputElement extends AbstractC3556y0 {
    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof RotaryInputElement)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [r1.a, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        C3704n c3704n = C3704n.f17613i;
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f15584s = c3704n;
        return abstractC3809q;
    }

    public final int hashCode() {
        return C3704n.f17613i.hashCode() * 31;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C3025a) abstractC3809q).f15584s = C3704n.f17613i;
    }
}
