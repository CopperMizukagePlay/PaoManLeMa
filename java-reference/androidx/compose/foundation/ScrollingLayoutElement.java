package androidx.compose.foundation;

import p092m.AbstractC2487d;
import p107o.C2769p1;
import p107o.C2772q1;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C2769p1 f601a;

    /* renamed from: b */
    public final boolean f602b;

    public ScrollingLayoutElement(C2769p1 c2769p1, boolean z7) {
        this.f601a = c2769p1;
        this.f602b = z7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
            if (AbstractC3367j.m5096a(this.f601a, scrollingLayoutElement.f601a) && this.f602b == scrollingLayoutElement.f602b) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.q, o.q1] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f14757s = this.f601a;
        abstractC3809q.f14758t = this.f602b;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f602b) + AbstractC2487d.m4040d(this.f601a.hashCode() * 31, 31, false);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C2772q1 c2772q1 = (C2772q1) abstractC3809q;
        c2772q1.f14757s = this.f601a;
        c2772q1.f14758t = this.f602b;
    }
}
