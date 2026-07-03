package androidx.compose.foundation.layout;

import p144t.C3166y;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;
import p177x0.C3800h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C3800h f638a;

    public HorizontalAlignElement(C3800h c3800h) {
        this.f638a = c3800h;
    }

    public final boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalAlignElement) {
            horizontalAlignElement = (HorizontalAlignElement) obj;
        } else {
            horizontalAlignElement = null;
        }
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.f638a.equals(horizontalAlignElement.f638a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.q, t.y] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f15871s = this.f638a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Float.hashCode(this.f638a.f17982a);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C3166y) abstractC3809q).f15871s = this.f638a;
    }
}
