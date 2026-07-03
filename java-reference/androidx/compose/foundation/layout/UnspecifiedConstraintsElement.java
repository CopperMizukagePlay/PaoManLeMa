package androidx.compose.foundation.layout;

import p140s2.C3096f;
import p144t.C3155s0;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class UnspecifiedConstraintsElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final float f652a;

    /* renamed from: b */
    public final float f653b;

    public UnspecifiedConstraintsElement(float f7, float f8) {
        this.f652a = f7;
        this.f653b = f8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UnspecifiedConstraintsElement) {
            UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
            if (C3096f.m4776a(this.f652a, unspecifiedConstraintsElement.f652a) && C3096f.m4776a(this.f653b, unspecifiedConstraintsElement.f653b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t.s0, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f15837s = this.f652a;
        abstractC3809q.f15838t = this.f653b;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Float.hashCode(this.f653b) + (Float.hashCode(this.f652a) * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3155s0 c3155s0 = (C3155s0) abstractC3809q;
        c3155s0.f15837s = this.f652a;
        c3155s0.f15838t = this.f653b;
    }
}
