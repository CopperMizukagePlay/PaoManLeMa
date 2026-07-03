package androidx.compose.foundation.lazy.layout;

import p092m.AbstractC2487d;
import p122q.EnumC2931o0;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p160v.C3441v0;
import p160v.InterfaceC3435s0;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsModifier extends AbstractC3556y0 {

    /* renamed from: a */
    public final InterfaceC3277a f671a;

    /* renamed from: b */
    public final InterfaceC3435s0 f672b;

    /* renamed from: c */
    public final EnumC2931o0 f673c;

    /* renamed from: d */
    public final boolean f674d;

    public LazyLayoutSemanticsModifier(InterfaceC3277a interfaceC3277a, InterfaceC3435s0 interfaceC3435s0, EnumC2931o0 enumC2931o0, boolean z7) {
        this.f671a = interfaceC3277a;
        this.f672b = interfaceC3435s0;
        this.f673c = enumC2931o0;
        this.f674d = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazyLayoutSemanticsModifier) {
            LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
            if (this.f671a == lazyLayoutSemanticsModifier.f671a && AbstractC3367j.m5096a(this.f672b, lazyLayoutSemanticsModifier.f672b) && this.f673c == lazyLayoutSemanticsModifier.f673c && this.f674d == lazyLayoutSemanticsModifier.f674d) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C3441v0(this.f671a, this.f672b, this.f673c, this.f674d);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC2487d.m4040d((this.f673c.hashCode() + ((this.f672b.hashCode() + (this.f671a.hashCode() * 31)) * 31)) * 31, 31, this.f674d);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3441v0 c3441v0 = (C3441v0) abstractC3809q;
        c3441v0.f16624s = this.f671a;
        c3441v0.f16625t = this.f672b;
        EnumC2931o0 enumC2931o0 = c3441v0.f16626u;
        EnumC2931o0 enumC2931o02 = this.f673c;
        if (enumC2931o0 != enumC2931o02) {
            c3441v0.f16626u = enumC2931o02;
            AbstractC3498f.m5375o(c3441v0);
        }
        boolean z7 = c3441v0.f16627v;
        boolean z8 = this.f674d;
        if (z7 == z8) {
            return;
        }
        c3441v0.f16627v = z8;
        c3441v0.m5187K0();
        AbstractC3498f.m5375o(c3441v0);
    }
}
