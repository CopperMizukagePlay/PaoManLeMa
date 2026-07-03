package androidx.compose.material3;

import p063i0.C1868c7;
import p100n.AbstractC2638e;
import p137s.InterfaceC3080i;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class ThumbElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3080i f733a;

    /* renamed from: b */
    public final boolean f734b;

    public ThumbElement(InterfaceC3080i interfaceC3080i, boolean z7) {
        this.f733a = interfaceC3080i;
        this.f734b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        if (AbstractC3367j.m5096a(this.f733a, thumbElement.f733a) && this.f734b == thumbElement.f734b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i0.c7, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f11023s = this.f733a;
        abstractC3809q.f11024t = this.f734b;
        abstractC3809q.f11028x = Float.NaN;
        abstractC3809q.f11029y = Float.NaN;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f734b) + (this.f733a.hashCode() * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C1868c7 c1868c7 = (C1868c7) abstractC3809q;
        c1868c7.f11023s = this.f733a;
        boolean z7 = c1868c7.f11024t;
        boolean z8 = this.f734b;
        if (z7 != z8) {
            AbstractC3498f.m5374n(c1868c7);
        }
        c1868c7.f11024t = z8;
        if (c1868c7.f11027w == null && !Float.isNaN(c1868c7.f11029y)) {
            c1868c7.f11027w = AbstractC2638e.m4215a(c1868c7.f11029y);
        }
        if (c1868c7.f11026v == null && !Float.isNaN(c1868c7.f11028x)) {
            c1868c7.f11026v = AbstractC2638e.m4215a(c1868c7.f11028x);
        }
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f733a + ", checked=" + this.f734b + ')';
    }
}
