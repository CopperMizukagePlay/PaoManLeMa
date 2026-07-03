package androidx.compose.foundation.lazy.layout;

import p100n.C2661l1;
import p160v.C3424n;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class LazyLayoutAnimateItemElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C2661l1 f667a;

    /* renamed from: b */
    public final C2661l1 f668b;

    /* renamed from: c */
    public final C2661l1 f669c;

    public LazyLayoutAnimateItemElement(C2661l1 c2661l1, C2661l1 c2661l12, C2661l1 c2661l13) {
        this.f667a = c2661l1;
        this.f668b = c2661l12;
        this.f669c = c2661l13;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LazyLayoutAnimateItemElement) {
                LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
                if (!this.f667a.equals(lazyLayoutAnimateItemElement.f667a) || !this.f668b.equals(lazyLayoutAnimateItemElement.f668b) || !this.f669c.equals(lazyLayoutAnimateItemElement.f669c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.n, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f16595s = this.f667a;
        abstractC3809q.f16596t = this.f668b;
        abstractC3809q.f16597u = this.f669c;
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f669c.hashCode() + ((this.f668b.hashCode() + (this.f667a.hashCode() * 31)) * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3424n c3424n = (C3424n) abstractC3809q;
        c3424n.f16595s = this.f667a;
        c3424n.f16596t = this.f668b;
        c3424n.f16597u = this.f669c;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f667a + ", placementSpec=" + this.f668b + ", fadeOutSpec=" + this.f669c + ')';
    }
}
