package androidx.compose.foundation.gestures;

import p092m.AbstractC2487d;
import p107o.InterfaceC2739f1;
import p109o1.C2799d;
import p122q.C2903f;
import p122q.C2911h1;
import p122q.C2915j;
import p122q.C2929n1;
import p122q.EnumC2931o0;
import p122q.InterfaceC2900e;
import p122q.InterfaceC2914i1;
import p122q.InterfaceC2925m0;
import p137s.C3081j;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class ScrollableElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC2914i1 f624a;

    /* renamed from: b */
    public final EnumC2931o0 f625b;

    /* renamed from: c */
    public final InterfaceC2739f1 f626c;

    /* renamed from: d */
    public final boolean f627d;

    /* renamed from: e */
    public final boolean f628e;

    /* renamed from: f */
    public final InterfaceC2925m0 f629f;

    /* renamed from: g */
    public final C3081j f630g;

    /* renamed from: h */
    public final InterfaceC2900e f631h;

    public ScrollableElement(InterfaceC2739f1 interfaceC2739f1, InterfaceC2900e interfaceC2900e, InterfaceC2925m0 interfaceC2925m0, EnumC2931o0 enumC2931o0, InterfaceC2914i1 interfaceC2914i1, C3081j c3081j, boolean z7, boolean z8) {
        this.f624a = interfaceC2914i1;
        this.f625b = enumC2931o0;
        this.f626c = interfaceC2739f1;
        this.f627d = z7;
        this.f628e = z8;
        this.f629f = interfaceC2925m0;
        this.f630g = c3081j;
        this.f631h = interfaceC2900e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        if (AbstractC3367j.m5096a(this.f624a, scrollableElement.f624a) && this.f625b == scrollableElement.f625b && AbstractC3367j.m5096a(this.f626c, scrollableElement.f626c) && this.f627d == scrollableElement.f627d && this.f628e == scrollableElement.f628e && AbstractC3367j.m5096a(this.f629f, scrollableElement.f629f) && AbstractC3367j.m5096a(this.f630g, scrollableElement.f630g) && AbstractC3367j.m5096a(this.f631h, scrollableElement.f631h)) {
            return true;
        }
        return false;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        C3081j c3081j = this.f630g;
        return new C2911h1(this.f626c, this.f631h, this.f629f, this.f625b, this.f624a, c3081j, this.f627d, this.f628e);
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9;
        int hashCode = (this.f625b.hashCode() + (this.f624a.hashCode() * 31)) * 31;
        int i10 = 0;
        InterfaceC2739f1 interfaceC2739f1 = this.f626c;
        if (interfaceC2739f1 != null) {
            i7 = interfaceC2739f1.hashCode();
        } else {
            i7 = 0;
        }
        int m4040d = AbstractC2487d.m4040d(AbstractC2487d.m4040d((hashCode + i7) * 31, 31, this.f627d), 31, this.f628e);
        InterfaceC2925m0 interfaceC2925m0 = this.f629f;
        if (interfaceC2925m0 != null) {
            i8 = interfaceC2925m0.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (m4040d + i8) * 31;
        C3081j c3081j = this.f630g;
        if (c3081j != null) {
            i9 = c3081j.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (i11 + i9) * 31;
        InterfaceC2900e interfaceC2900e = this.f631h;
        if (interfaceC2900e != null) {
            i10 = interfaceC2900e.hashCode();
        }
        return i12 + i10;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        boolean z7;
        InterfaceC2925m0 interfaceC2925m0;
        C2911h1 c2911h1 = (C2911h1) abstractC3809q;
        C2929n1 c2929n1 = c2911h1.f15168H;
        boolean z8 = c2911h1.f15152w;
        boolean z9 = this.f627d;
        boolean z10 = true;
        boolean z11 = false;
        if (z8 != z9) {
            c2911h1.f15169I.f10453e = z9;
            c2911h1.f15166F.f15358s = z9;
            z7 = true;
        } else {
            z7 = false;
        }
        InterfaceC2925m0 interfaceC2925m02 = this.f629f;
        if (interfaceC2925m02 == null) {
            interfaceC2925m0 = c2911h1.f15167G;
        } else {
            interfaceC2925m0 = interfaceC2925m02;
        }
        C2799d c2799d = c2911h1.f15165E;
        InterfaceC2914i1 interfaceC2914i1 = c2929n1.f15229a;
        InterfaceC2914i1 interfaceC2914i12 = this.f624a;
        if (!AbstractC3367j.m5096a(interfaceC2914i1, interfaceC2914i12)) {
            c2929n1.f15229a = interfaceC2914i12;
            z11 = true;
        }
        InterfaceC2739f1 interfaceC2739f1 = this.f626c;
        c2929n1.f15230b = interfaceC2739f1;
        EnumC2931o0 enumC2931o0 = c2929n1.f15232d;
        EnumC2931o0 enumC2931o02 = this.f625b;
        if (enumC2931o0 != enumC2931o02) {
            c2929n1.f15232d = enumC2931o02;
            z11 = true;
        }
        boolean z12 = c2929n1.f15233e;
        boolean z13 = this.f628e;
        if (z12 != z13) {
            c2929n1.f15233e = z13;
        } else {
            z10 = z11;
        }
        c2929n1.f15231c = interfaceC2925m0;
        c2929n1.f15234f = c2799d;
        C2915j c2915j = c2911h1.f15170J;
        c2915j.f15180s = enumC2931o02;
        c2915j.f15182u = z13;
        c2915j.f15183v = this.f631h;
        c2911h1.f15163C = interfaceC2739f1;
        c2911h1.f15164D = interfaceC2925m02;
        C2903f c2903f = C2903f.f15135i;
        EnumC2931o0 enumC2931o03 = c2929n1.f15232d;
        EnumC2931o0 enumC2931o04 = EnumC2931o0.f15240e;
        if (enumC2931o03 != enumC2931o04) {
            enumC2931o04 = EnumC2931o0.f15241f;
        }
        c2911h1.m4580V0(c2903f, z9, this.f630g, enumC2931o04, z10);
        if (z7) {
            c2911h1.f15172L = null;
            c2911h1.f15173M = null;
            AbstractC3498f.m5375o(c2911h1);
        }
    }
}
