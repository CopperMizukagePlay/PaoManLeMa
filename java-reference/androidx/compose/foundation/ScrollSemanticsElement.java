package androidx.compose.foundation;

import p092m.AbstractC2487d;
import p107o.C2760m1;
import p107o.C2769p1;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class ScrollSemanticsElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C2769p1 f599a;

    /* renamed from: b */
    public final boolean f600b;

    public ScrollSemanticsElement(C2769p1 c2769p1, boolean z7) {
        this.f599a = c2769p1;
        this.f600b = z7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ScrollSemanticsElement) {
                ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
                if (!AbstractC3367j.m5096a(this.f599a, scrollSemanticsElement.f599a) || this.f600b != scrollSemanticsElement.f600b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.m1, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f14718s = this.f599a;
        abstractC3809q.f14719t = this.f600b;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f600b) + AbstractC2487d.m4040d(AbstractC2487d.m4040d(this.f599a.hashCode() * 31, 961, false), 31, true);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C2760m1 c2760m1 = (C2760m1) abstractC3809q;
        c2760m1.f14718s = this.f599a;
        c2760m1.f14719t = this.f600b;
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.f599a + ", reverseScrolling=false, flingBehavior=null, isScrollable=true, isVertical=" + this.f600b + ')';
    }
}
