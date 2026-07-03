package androidx.compose.p007ui.focus;

import p019c1.C0373q;
import p019c1.C0375s;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class FocusRequesterElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C0373q f758a;

    public FocusRequesterElement(C0373q c0373q) {
        this.f758a = c0373q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusRequesterElement) && AbstractC3367j.m5096a(this.f758a, ((FocusRequesterElement) obj).f758a)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.q, c1.s] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f1265s = this.f758a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f758a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C0375s c0375s = (C0375s) abstractC3809q;
        c0375s.f1265s.f1264a.m4308j(c0375s);
        C0373q c0373q = this.f758a;
        c0375s.f1265s = c0373q;
        c0373q.f1264a.m4300b(c0375s);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f758a + ')';
    }
}
