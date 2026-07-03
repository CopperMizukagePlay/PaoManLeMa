package androidx.compose.foundation;

import p107o.C2778t0;
import p107o.InterfaceC2780u0;
import p137s.InterfaceC3080i;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3519m;
import p162v1.AbstractC3556y0;
import p162v1.InterfaceC3516l;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class IndicationModifierElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3080i f594a;

    /* renamed from: b */
    public final InterfaceC2780u0 f595b;

    public IndicationModifierElement(InterfaceC3080i interfaceC3080i, InterfaceC2780u0 interfaceC2780u0) {
        this.f594a = interfaceC3080i;
        this.f595b = interfaceC2780u0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        if (AbstractC3367j.m5096a(this.f594a, indicationModifierElement.f594a) && AbstractC3367j.m5096a(this.f595b, indicationModifierElement.f595b)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.t0, v1.m, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        InterfaceC3516l mo3182a = this.f595b.mo3182a(this.f594a);
        ?? abstractC3519m = new AbstractC3519m();
        abstractC3519m.f14770u = mo3182a;
        abstractC3519m.m5483K0(mo3182a);
        return abstractC3519m;
    }

    public final int hashCode() {
        return this.f595b.hashCode() + (this.f594a.hashCode() * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C2778t0 c2778t0 = (C2778t0) abstractC3809q;
        InterfaceC3516l mo3182a = this.f595b.mo3182a(this.f594a);
        c2778t0.m5484L0(c2778t0.f14770u);
        c2778t0.f14770u = mo3182a;
        c2778t0.m5483K0(mo3182a);
    }
}
