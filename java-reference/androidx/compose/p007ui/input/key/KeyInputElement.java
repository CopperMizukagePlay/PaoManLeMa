package androidx.compose.p007ui.input.key;

import p102n1.C2712e;
import p150t5.InterfaceC3279c;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class KeyInputElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3279c f769a;

    /* renamed from: b */
    public final InterfaceC3279c f770b;

    public KeyInputElement(InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        this.f769a = interfaceC3279c;
        this.f770b = interfaceC3279c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        if (this.f769a == keyInputElement.f769a && this.f770b == keyInputElement.f770b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [n1.e, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f14559s = this.f769a;
        abstractC3809q.f14560t = this.f770b;
        return abstractC3809q;
    }

    public final int hashCode() {
        int i7;
        int i8 = 0;
        InterfaceC3279c interfaceC3279c = this.f769a;
        if (interfaceC3279c != null) {
            i7 = interfaceC3279c.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = i7 * 31;
        InterfaceC3279c interfaceC3279c2 = this.f770b;
        if (interfaceC3279c2 != null) {
            i8 = interfaceC3279c2.hashCode();
        }
        return i9 + i8;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C2712e c2712e = (C2712e) abstractC3809q;
        c2712e.f14559s = this.f769a;
        c2712e.f14560t = this.f770b;
    }
}
