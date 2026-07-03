package androidx.compose.p007ui.graphics;

import p035e1.C0668n;
import p150t5.InterfaceC3279c;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class BlockGraphicsLayerElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3279c f760a;

    public BlockGraphicsLayerElement(InterfaceC3279c interfaceC3279c) {
        this.f760a = interfaceC3279c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockGraphicsLayerElement)) {
            return false;
        }
        if (this.f760a == ((BlockGraphicsLayerElement) obj).f760a) {
            return true;
        }
        return false;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C0668n(this.f760a);
    }

    public final int hashCode() {
        return this.f760a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C0668n c0668n = (C0668n) abstractC3809q;
        c0668n.f2183s = this.f760a;
        AbstractC3497e1 abstractC3497e1 = AbstractC3498f.m5380t(c0668n, 2).f16848t;
        if (abstractC3497e1 != null) {
            abstractC3497e1.m5357u1(c0668n.f2183s, true);
        }
    }
}
