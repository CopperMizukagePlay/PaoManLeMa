package androidx.compose.foundation.layout;

import p100n.AbstractC2647h;
import p144t.C3162w;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class FillElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final int f636a;

    /* renamed from: b */
    public final float f637b;

    public FillElement(float f7, int i7) {
        this.f636a = i7;
        this.f637b = f7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FillElement) {
                FillElement fillElement = (FillElement) obj;
                if (this.f636a == fillElement.f636a && this.f637b == fillElement.f637b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x0.q, t.w] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f15867s = this.f636a;
        abstractC3809q.f15868t = this.f637b;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Float.hashCode(this.f637b) + (AbstractC2647h.m4257c(this.f636a) * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3162w c3162w = (C3162w) abstractC3809q;
        c3162w.f15867s = this.f636a;
        c3162w.f15868t = this.f637b;
    }
}
