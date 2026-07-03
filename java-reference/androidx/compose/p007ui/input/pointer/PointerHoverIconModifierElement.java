package androidx.compose.p007ui.input.pointer;

import p001a0.AbstractC0027g1;
import p117p1.C2842a;
import p117p1.C2862m;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends AbstractC3556y0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PointerHoverIconModifierElement) {
            C2842a c2842a = AbstractC0027g1.f129b;
            if (c2842a.equals(c2842a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p1.m, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        C2842a c2842a = AbstractC0027g1.f129b;
        ?? abstractC3809q = new AbstractC3809q();
        abstractC3809q.f14999s = c2842a;
        return abstractC3809q;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (1008 * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C2862m c2862m = (C2862m) abstractC3809q;
        C2842a c2842a = AbstractC0027g1.f129b;
        if (!AbstractC3367j.m5096a(c2862m.f14999s, c2842a)) {
            c2862m.f14999s = c2842a;
            if (c2862m.f15000t) {
                c2862m.m4539M0();
            }
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + AbstractC0027g1.f129b + ", overrideDescendants=false)";
    }
}
