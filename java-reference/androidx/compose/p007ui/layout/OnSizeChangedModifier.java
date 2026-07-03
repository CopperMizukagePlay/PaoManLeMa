package androidx.compose.p007ui.layout;

import p146t1.C3233s0;
import p150t5.InterfaceC3279c;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class OnSizeChangedModifier extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3279c f779a;

    public OnSizeChangedModifier(InterfaceC3279c interfaceC3279c) {
        this.f779a = interfaceC3279c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnSizeChangedModifier)) {
            return false;
        }
        if (this.f779a == ((OnSizeChangedModifier) obj).f779a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t1.s0, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f16043s = this.f779a;
        long j6 = Integer.MIN_VALUE;
        abstractC3809q.f16044t = (j6 & 4294967295L) | (j6 << 32);
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f779a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3233s0 c3233s0 = (C3233s0) abstractC3809q;
        c3233s0.f16043s = this.f779a;
        long j6 = Integer.MIN_VALUE;
        c3233s0.f16044t = (j6 & 4294967295L) | (j6 << 32);
    }
}
