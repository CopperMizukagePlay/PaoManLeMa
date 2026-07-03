package androidx.compose.p007ui.layout;

import p146t1.C3247z0;
import p146t1.RunnableC3226p;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p162v1.C3502g0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class RulerProviderModifierElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final RunnableC3226p f780a;

    public RulerProviderModifierElement(RunnableC3226p runnableC3226p) {
        this.f780a = runnableC3226p;
    }

    public final boolean equals(Object obj) {
        RulerProviderModifierElement rulerProviderModifierElement;
        if (obj == this) {
            return true;
        }
        RunnableC3226p runnableC3226p = null;
        if (obj instanceof RulerProviderModifierElement) {
            rulerProviderModifierElement = (RulerProviderModifierElement) obj;
        } else {
            rulerProviderModifierElement = null;
        }
        if (rulerProviderModifierElement != null) {
            runnableC3226p = rulerProviderModifierElement.f780a;
        }
        if (runnableC3226p == this.f780a) {
            return true;
        }
        return false;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C3247z0(this.f780a);
    }

    public final int hashCode() {
        return this.f780a.hashCode();
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3247z0 c3247z0 = (C3247z0) abstractC3809q;
        RunnableC3226p runnableC3226p = c3247z0.f16068s;
        RunnableC3226p runnableC3226p2 = this.f780a;
        if (runnableC3226p != runnableC3226p2) {
            c3247z0.f16068s = runnableC3226p2;
            C3502g0.m5396Y(AbstractC3498f.m5382v(c3247z0), false, 7);
        }
    }
}
