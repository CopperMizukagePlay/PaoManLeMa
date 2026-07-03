package androidx.compose.foundation.layout;

import p092m.AbstractC2487d;
import p140s2.C3096f;
import p144t.C3133h0;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class PaddingElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final float f642a;

    /* renamed from: b */
    public final float f643b;

    /* renamed from: c */
    public final float f644c;

    /* renamed from: d */
    public final float f645d;

    public PaddingElement(float f7, float f8, float f9, float f10) {
        this.f642a = f7;
        this.f643b = f8;
        this.f644c = f9;
        this.f645d = f10;
        if ((f7 < 0.0f && !C3096f.m4776a(f7, Float.NaN)) || ((f8 < 0.0f && !C3096f.m4776a(f8, Float.NaN)) || ((f9 < 0.0f && !C3096f.m4776a(f9, Float.NaN)) || (f10 < 0.0f && !C3096f.m4776a(f10, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement;
        if (obj instanceof PaddingElement) {
            paddingElement = (PaddingElement) obj;
        } else {
            paddingElement = null;
        }
        if (paddingElement != null && C3096f.m4776a(this.f642a, paddingElement.f642a) && C3096f.m4776a(this.f643b, paddingElement.f643b) && C3096f.m4776a(this.f644c, paddingElement.f644c) && C3096f.m4776a(this.f645d, paddingElement.f645d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t.h0, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f15782s = this.f642a;
        abstractC3809q.f15783t = this.f643b;
        abstractC3809q.f15784u = this.f644c;
        abstractC3809q.f15785v = this.f645d;
        abstractC3809q.f15786w = true;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC2487d.m4038b(this.f645d, AbstractC2487d.m4038b(this.f644c, AbstractC2487d.m4038b(this.f643b, Float.hashCode(this.f642a) * 31, 31), 31), 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3133h0 c3133h0 = (C3133h0) abstractC3809q;
        c3133h0.f15782s = this.f642a;
        c3133h0.f15783t = this.f643b;
        c3133h0.f15784u = this.f644c;
        c3133h0.f15785v = this.f645d;
        c3133h0.f15786w = true;
    }
}
