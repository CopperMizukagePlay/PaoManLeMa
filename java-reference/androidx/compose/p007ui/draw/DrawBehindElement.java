package androidx.compose.p007ui.draw;

import p010b1.C0266d;
import p150t5.InterfaceC3279c;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class DrawBehindElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3279c f744a;

    public DrawBehindElement(InterfaceC3279c interfaceC3279c) {
        this.f744a = interfaceC3279c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawBehindElement)) {
            return false;
        }
        if (this.f744a == ((DrawBehindElement) obj).f744a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b1.d, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f1001s = this.f744a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f744a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C0266d) abstractC3809q).f1001s = this.f744a;
    }
}
