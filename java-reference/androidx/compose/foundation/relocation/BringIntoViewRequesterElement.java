package androidx.compose.foundation.relocation;

import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p176x.C3788c;
import p176x.C3789d;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C3788c f691a;

    public BringIntoViewRequesterElement(C3788c c3788c) {
        this.f691a = c3788c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewRequesterElement) {
                if (!AbstractC3367j.m5096a(this.f691a, ((BringIntoViewRequesterElement) obj).f691a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.q, x.d] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f17949s = this.f691a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f691a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3789d c3789d = (C3789d) abstractC3809q;
        C3788c c3788c = c3789d.f17949s;
        if (c3788c != null) {
            c3788c.f17948a.m4308j(c3789d);
        }
        C3788c c3788c2 = this.f691a;
        if (c3788c2 != null) {
            c3788c2.f17948a.m4300b(c3789d);
        }
        c3789d.f17949s = c3788c2;
    }
}
