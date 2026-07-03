package androidx.compose.foundation;

import p107o.C2759m0;
import p137s.C3081j;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class HoverableElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C3081j f593a;

    public HoverableElement(C3081j c3081j) {
        this.f593a = c3081j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof HoverableElement) && AbstractC3367j.m5096a(((HoverableElement) obj).f593a, this.f593a)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.m0, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f14716s = this.f593a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f593a.hashCode() * 31;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C2759m0 c2759m0 = (C2759m0) abstractC3809q;
        C3081j c3081j = c2759m0.f14716s;
        C3081j c3081j2 = this.f593a;
        if (!AbstractC3367j.m5096a(c3081j, c3081j2)) {
            c2759m0.m4423M0();
            c2759m0.f14716s = c3081j2;
        }
    }
}
