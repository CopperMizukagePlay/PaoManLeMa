package androidx.compose.p007ui.draw;

import p010b1.C0264b;
import p010b1.C0265c;
import p150t5.InterfaceC3279c;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class DrawWithCacheElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3279c f745a;

    public DrawWithCacheElement(InterfaceC3279c interfaceC3279c) {
        this.f745a = interfaceC3279c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawWithCacheElement)) {
            return false;
        }
        if (this.f745a == ((DrawWithCacheElement) obj).f745a) {
            return true;
        }
        return false;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C0264b(new C0265c(), this.f745a);
    }

    public final int hashCode() {
        return this.f745a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C0264b c0264b = (C0264b) abstractC3809q;
        c0264b.f998u = this.f745a;
        c0264b.m552K0();
    }
}
