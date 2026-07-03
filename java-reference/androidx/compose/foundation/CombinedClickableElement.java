package androidx.compose.foundation;

import p092m.AbstractC2487d;
import p107o.AbstractC2734e;
import p107o.C2785x;
import p107o.InterfaceC2780u0;
import p117p1.C2857h0;
import p137s.C3081j;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class CombinedClickableElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C3081j f588a;

    /* renamed from: b */
    public final InterfaceC2780u0 f589b;

    /* renamed from: c */
    public final InterfaceC3277a f590c;

    /* renamed from: d */
    public final InterfaceC3277a f591d;

    public CombinedClickableElement(C3081j c3081j, InterfaceC2780u0 interfaceC2780u0, InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2) {
        this.f588a = c3081j;
        this.f589b = interfaceC2780u0;
        this.f590c = interfaceC3277a;
        this.f591d = interfaceC3277a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CombinedClickableElement.class == obj.getClass()) {
            CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
            if (AbstractC3367j.m5096a(this.f588a, combinedClickableElement.f588a) && AbstractC3367j.m5096a(this.f589b, combinedClickableElement.f589b) && this.f590c == combinedClickableElement.f590c && this.f591d == combinedClickableElement.f591d) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.e, o.x, x0.q] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        ?? abstractC2734e = new AbstractC2734e(this.f588a, this.f589b, true, null, null, this.f590c);
        abstractC2734e.f14790M = this.f591d;
        return abstractC2734e;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9 = 0;
        C3081j c3081j = this.f588a;
        if (c3081j != null) {
            i7 = c3081j.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = i7 * 31;
        InterfaceC2780u0 interfaceC2780u0 = this.f589b;
        if (interfaceC2780u0 != null) {
            i8 = interfaceC2780u0.hashCode();
        } else {
            i8 = 0;
        }
        int hashCode = (this.f590c.hashCode() + AbstractC2487d.m4040d((i10 + i8) * 31, 29791, true)) * 961;
        InterfaceC3277a interfaceC3277a = this.f591d;
        if (interfaceC3277a != null) {
            i9 = interfaceC3277a.hashCode();
        }
        return (hashCode + i9) * 31;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        boolean z7;
        boolean z8;
        boolean z9;
        C2857h0 c2857h0;
        C2785x c2785x = (C2785x) abstractC3809q;
        c2785x.getClass();
        boolean z10 = false;
        if (c2785x.f14790M == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        InterfaceC3277a interfaceC3277a = this.f591d;
        if (interfaceC3277a == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 != z8) {
            c2785x.m4398P0();
            AbstractC3498f.m5375o(c2785x);
            z10 = true;
        }
        c2785x.f14790M = interfaceC3277a;
        if (!c2785x.f14642y) {
            z9 = true;
        } else {
            z9 = z10;
        }
        c2785x.m4400R0(this.f588a, this.f589b, true, null, null, this.f590c);
        if (z9 && (c2857h0 = c2785x.f14629C) != null) {
            c2857h0.m4535M0();
        }
    }
}
