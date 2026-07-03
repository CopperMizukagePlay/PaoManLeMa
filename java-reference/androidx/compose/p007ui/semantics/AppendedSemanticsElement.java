package androidx.compose.p007ui.semantics;

import p028d2.C0470c;
import p028d2.C0477j;
import p028d2.InterfaceC0478k;
import p150t5.InterfaceC3279c;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends AbstractC3556y0 implements InterfaceC0478k {

    /* renamed from: a */
    public final boolean f791a;

    /* renamed from: b */
    public final InterfaceC3279c f792b;

    public AppendedSemanticsElement(InterfaceC3279c interfaceC3279c, boolean z7) {
        this.f791a = z7;
        this.f792b = interfaceC3279c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppendedSemanticsElement) {
                AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
                if (this.f791a != appendedSemanticsElement.f791a || this.f792b != appendedSemanticsElement.f792b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // p028d2.InterfaceC0478k
    /* renamed from: g */
    public final C0477j mo402g() {
        C0477j c0477j = new C0477j();
        c0477j.f1685g = this.f791a;
        this.f792b.mo23f(c0477j);
        return c0477j;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C0470c(this.f792b, this.f791a, false);
    }

    public final int hashCode() {
        return this.f792b.hashCode() + (Boolean.hashCode(this.f791a) * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C0470c c0470c = (C0470c) abstractC3809q;
        c0470c.f1642s = this.f791a;
        c0470c.f1644u = this.f792b;
    }
}
