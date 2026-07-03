package androidx.compose.foundation.gestures;

import p092m.AbstractC2487d;
import p122q.AbstractC2907g0;
import p122q.C2903f;
import p122q.C2910h0;
import p122q.C2919k0;
import p122q.EnumC2931o0;
import p122q.InterfaceC2922l0;
import p137s.C3081j;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class DraggableElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC2922l0 f616a;

    /* renamed from: b */
    public final EnumC2931o0 f617b;

    /* renamed from: c */
    public final boolean f618c;

    /* renamed from: d */
    public final C3081j f619d;

    /* renamed from: e */
    public final boolean f620e;

    /* renamed from: f */
    public final InterfaceC3282f f621f;

    /* renamed from: g */
    public final InterfaceC3282f f622g;

    /* renamed from: h */
    public final boolean f623h;

    public DraggableElement(InterfaceC2922l0 interfaceC2922l0, EnumC2931o0 enumC2931o0, boolean z7, C3081j c3081j, boolean z8, C2910h0 c2910h0, InterfaceC3282f interfaceC3282f, boolean z9) {
        this.f616a = interfaceC2922l0;
        this.f617b = enumC2931o0;
        this.f618c = z7;
        this.f619d = c3081j;
        this.f620e = z8;
        this.f621f = c2910h0;
        this.f622g = interfaceC3282f;
        this.f623h = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        if (AbstractC3367j.m5096a(this.f616a, draggableElement.f616a) && this.f617b == draggableElement.f617b && this.f618c == draggableElement.f618c && AbstractC3367j.m5096a(this.f619d, draggableElement.f619d) && this.f620e == draggableElement.f620e && AbstractC3367j.m5096a(this.f621f, draggableElement.f621f) && AbstractC3367j.m5096a(this.f622g, draggableElement.f622g) && this.f623h == draggableElement.f623h) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q.g0, q.k0, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        C2903f c2903f = C2903f.f15134h;
        boolean z7 = this.f618c;
        C3081j c3081j = this.f619d;
        EnumC2931o0 enumC2931o0 = this.f617b;
        ?? abstractC2907g0 = new AbstractC2907g0(c2903f, z7, c3081j, enumC2931o0);
        abstractC2907g0.f15204C = this.f616a;
        abstractC2907g0.f15205D = enumC2931o0;
        abstractC2907g0.f15206E = this.f620e;
        abstractC2907g0.f15207F = this.f621f;
        abstractC2907g0.f15208G = this.f622g;
        abstractC2907g0.f15209H = this.f623h;
        return abstractC2907g0;
    }

    public final int hashCode() {
        int i7;
        int m4040d = AbstractC2487d.m4040d((this.f617b.hashCode() + (this.f616a.hashCode() * 31)) * 31, 31, this.f618c);
        C3081j c3081j = this.f619d;
        if (c3081j != null) {
            i7 = c3081j.hashCode();
        } else {
            i7 = 0;
        }
        return Boolean.hashCode(this.f623h) + ((this.f622g.hashCode() + ((this.f621f.hashCode() + AbstractC2487d.m4040d((m4040d + i7) * 31, 31, this.f620e)) * 31)) * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        boolean z7;
        boolean z8;
        C2919k0 c2919k0 = (C2919k0) abstractC3809q;
        C2903f c2903f = C2903f.f15134h;
        InterfaceC2922l0 interfaceC2922l0 = c2919k0.f15204C;
        InterfaceC2922l0 interfaceC2922l02 = this.f616a;
        if (!AbstractC3367j.m5096a(interfaceC2922l0, interfaceC2922l02)) {
            c2919k0.f15204C = interfaceC2922l02;
            z7 = true;
        } else {
            z7 = false;
        }
        EnumC2931o0 enumC2931o0 = c2919k0.f15205D;
        EnumC2931o0 enumC2931o02 = this.f617b;
        if (enumC2931o0 != enumC2931o02) {
            c2919k0.f15205D = enumC2931o02;
            z7 = true;
        }
        boolean z9 = c2919k0.f15209H;
        boolean z10 = this.f623h;
        if (z9 != z10) {
            c2919k0.f15209H = z10;
            z8 = true;
        } else {
            z8 = z7;
        }
        c2919k0.f15207F = this.f621f;
        c2919k0.f15208G = this.f622g;
        c2919k0.f15206E = this.f620e;
        c2919k0.m4580V0(c2903f, this.f618c, this.f619d, enumC2931o02, z8);
    }
}
