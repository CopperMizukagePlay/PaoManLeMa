package androidx.compose.foundation;

import p107o.C2735e0;
import p137s.C3081j;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class FocusableElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C3081j f592a;

    public FocusableElement(C3081j c3081j) {
        this.f592a = c3081j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusableElement)) {
            return false;
        }
        if (AbstractC3367j.m5096a(this.f592a, ((FocusableElement) obj).f592a)) {
            return true;
        }
        return false;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C2735e0(this.f592a);
    }

    public final int hashCode() {
        C3081j c3081j = this.f592a;
        if (c3081j != null) {
            return c3081j.hashCode();
        }
        return 0;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C2735e0) abstractC3809q).m4401N0(this.f592a);
    }
}
