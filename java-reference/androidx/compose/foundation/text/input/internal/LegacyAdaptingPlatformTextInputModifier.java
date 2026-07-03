package androidx.compose.foundation.text.input.internal;

import p001a0.C0043k1;
import p018c0.C0335e;
import p018c0.C0350t;
import p034e0.C0622o0;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class LegacyAdaptingPlatformTextInputModifier extends AbstractC3556y0 {

    /* renamed from: a */
    public final C0335e f722a;

    /* renamed from: b */
    public final C0043k1 f723b;

    /* renamed from: c */
    public final C0622o0 f724c;

    public LegacyAdaptingPlatformTextInputModifier(C0335e c0335e, C0043k1 c0043k1, C0622o0 c0622o0) {
        this.f722a = c0335e;
        this.f723b = c0043k1;
        this.f724c = c0622o0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        if (AbstractC3367j.m5096a(this.f722a, legacyAdaptingPlatformTextInputModifier.f722a) && AbstractC3367j.m5096a(this.f723b, legacyAdaptingPlatformTextInputModifier.f723b) && AbstractC3367j.m5096a(this.f724c, legacyAdaptingPlatformTextInputModifier.f724c)) {
            return true;
        }
        return false;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C0350t(this.f722a, this.f723b, this.f724c);
    }

    public final int hashCode() {
        return this.f724c.hashCode() + ((this.f723b.hashCode() + (this.f722a.hashCode() * 31)) * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C0350t c0350t = (C0350t) abstractC3809q;
        if (c0350t.f18005r) {
            c0350t.f1171s.mo688g();
            c0350t.f1171s.m692k(c0350t);
        }
        C0335e c0335e = this.f722a;
        c0350t.f1171s = c0335e;
        if (c0350t.f18005r) {
            if (c0335e.f1153a == null) {
                c0335e.f1153a = c0350t;
            } else {
                throw new IllegalStateException("Expected textInputModifierNode to be null");
            }
        }
        c0350t.f1172t = this.f723b;
        c0350t.f1173u = this.f724c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f722a + ", legacyTextFieldState=" + this.f723b + ", textFieldSelectionManager=" + this.f724c + ')';
    }
}
