package androidx.compose.p007ui.input.nestedscroll;

import p001a0.C0053n;
import p109o1.C2799d;
import p109o1.C2802g;
import p109o1.InterfaceC2796a;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class NestedScrollElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC2796a f771a;

    /* renamed from: b */
    public final C2799d f772b;

    public NestedScrollElement(InterfaceC2796a interfaceC2796a, C2799d c2799d) {
        this.f771a = interfaceC2796a;
        this.f772b = c2799d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        if (!AbstractC3367j.m5096a(nestedScrollElement.f771a, this.f771a) || !AbstractC3367j.m5096a(nestedScrollElement.f772b, this.f772b)) {
            return false;
        }
        return true;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C2802g(this.f771a, this.f772b);
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f771a.hashCode() * 31;
        C2799d c2799d = this.f772b;
        if (c2799d != null) {
            i7 = c2799d.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C2802g c2802g = (C2802g) abstractC3809q;
        c2802g.f14824s = this.f771a;
        C2799d c2799d = c2802g.f14825t;
        if (c2799d.f14811a == c2802g) {
            c2799d.f14811a = null;
        }
        C2799d c2799d2 = this.f772b;
        if (c2799d2 == null) {
            c2802g.f14825t = new C2799d();
        } else if (!c2799d2.equals(c2799d)) {
            c2802g.f14825t = c2799d2;
        }
        if (c2802g.f18005r) {
            C2799d c2799d3 = c2802g.f14825t;
            c2799d3.f14811a = c2802g;
            c2799d3.f14812b = null;
            c2802g.f14826u = null;
            c2799d3.f14813c = new C0053n(22, c2802g);
            c2799d3.f14814d = c2802g.m5830y0();
        }
    }
}
