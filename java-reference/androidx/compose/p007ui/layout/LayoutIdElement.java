package androidx.compose.p007ui.layout;

import p146t1.C3240w;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class LayoutIdElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final Object f777a;

    public LayoutIdElement(Object obj) {
        this.f777a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LayoutIdElement) && AbstractC3367j.m5096a(this.f777a, ((LayoutIdElement) obj).f777a)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t1.w, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f16058s = this.f777a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f777a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C3240w) abstractC3809q).f16058s = this.f777a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f777a + ')';
    }
}
