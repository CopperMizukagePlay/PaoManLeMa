package androidx.compose.p007ui;

import p001a0.AbstractC0094y0;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;
import p177x0.C3813u;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class ZIndexElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final float f742a;

    public ZIndexElement(float f7) {
        this.f742a = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ZIndexElement) && Float.compare(this.f742a, ((ZIndexElement) obj).f742a) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.u, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f18008s = this.f742a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Float.hashCode(this.f742a);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C3813u) abstractC3809q).f18008s = this.f742a;
    }

    public final String toString() {
        return AbstractC0094y0.m186m(new StringBuilder("ZIndexElement(zIndex="), this.f742a, ')');
    }
}
