package androidx.compose.foundation.layout;

import p144t.C3139k0;
import p144t.InterfaceC3135i0;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class PaddingValuesElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3135i0 f646a;

    public PaddingValuesElement(InterfaceC3135i0 interfaceC3135i0) {
        this.f646a = interfaceC3135i0;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if (obj instanceof PaddingValuesElement) {
            paddingValuesElement = (PaddingValuesElement) obj;
        } else {
            paddingValuesElement = null;
        }
        if (paddingValuesElement == null) {
            return false;
        }
        return AbstractC3367j.m5096a(this.f646a, paddingValuesElement.f646a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t.k0, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f15800s = this.f646a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return this.f646a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C3139k0) abstractC3809q).f15800s = this.f646a;
    }
}
