package androidx.compose.p007ui.semantics;

import p028d2.C0470c;
import p028d2.C0477j;
import p028d2.InterfaceC0478k;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends AbstractC3556y0 implements InterfaceC0478k {

    /* renamed from: a */
    public final AbstractC3368k f793a;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(InterfaceC3279c interfaceC3279c) {
        this.f793a = (AbstractC3368k) interfaceC3279c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClearAndSetSemanticsElement) {
                if (this.f793a != ((ClearAndSetSemanticsElement) obj).f793a) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [t5.c, u5.k] */
    @Override // p028d2.InterfaceC0478k
    /* renamed from: g */
    public final C0477j mo402g() {
        C0477j c0477j = new C0477j();
        c0477j.f1685g = false;
        c0477j.f1686h = true;
        this.f793a.mo23f(c0477j);
        return c0477j;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [t5.c, u5.k] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C0470c(this.f793a, false, true);
    }

    public final int hashCode() {
        return this.f793a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t5.c, u5.k] */
    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        ((C0470c) abstractC3809q).f1644u = this.f793a;
    }
}
