package androidx.compose.foundation.layout;

import p144t.C3127e0;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class LayoutWeightElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final float f639a;

    /* renamed from: b */
    public final boolean f640b;

    public LayoutWeightElement(float f7, boolean z7) {
        this.f639a = f7;
        this.f640b = z7;
    }

    public final boolean equals(Object obj) {
        LayoutWeightElement layoutWeightElement;
        if (this != obj) {
            if (obj instanceof LayoutWeightElement) {
                layoutWeightElement = (LayoutWeightElement) obj;
            } else {
                layoutWeightElement = null;
            }
            if (layoutWeightElement != null && this.f639a == layoutWeightElement.f639a && this.f640b == layoutWeightElement.f640b) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t.e0, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f15772s = this.f639a;
        abstractC3809q.f15773t = this.f640b;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f640b) + (Float.hashCode(this.f639a) * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3127e0 c3127e0 = (C3127e0) abstractC3809q;
        c3127e0.f15772s = this.f639a;
        c3127e0.f15773t = this.f640b;
    }
}
