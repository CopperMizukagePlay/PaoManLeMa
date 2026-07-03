package androidx.compose.foundation.selection;

import p028d2.C0474g;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p137s.C3081j;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;
import p182y.C3830c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class ToggleableElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final boolean f698a;

    /* renamed from: b */
    public final C3081j f699b;

    /* renamed from: c */
    public final boolean f700c;

    /* renamed from: d */
    public final C0474g f701d;

    /* renamed from: e */
    public final InterfaceC3279c f702e;

    public ToggleableElement(boolean z7, C3081j c3081j, boolean z8, C0474g c0474g, InterfaceC3279c interfaceC3279c) {
        this.f698a = z7;
        this.f699b = c3081j;
        this.f700c = z8;
        this.f701d = c0474g;
        this.f702e = interfaceC3279c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ToggleableElement.class == obj.getClass()) {
                ToggleableElement toggleableElement = (ToggleableElement) obj;
                if (this.f698a != toggleableElement.f698a || !AbstractC3367j.m5096a(this.f699b, toggleableElement.f699b) || this.f700c != toggleableElement.f700c || !this.f701d.equals(toggleableElement.f701d) || this.f702e != toggleableElement.f702e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C3830c(this.f698a, this.f699b, this.f700c, this.f701d, this.f702e);
    }

    public final int hashCode() {
        int i7;
        int hashCode = Boolean.hashCode(this.f698a) * 31;
        C3081j c3081j = this.f699b;
        if (c3081j != null) {
            i7 = c3081j.hashCode();
        } else {
            i7 = 0;
        }
        return this.f702e.hashCode() + AbstractC2647h.m4255a(this.f701d.f1652a, AbstractC2487d.m4040d((hashCode + i7) * 961, 31, this.f700c), 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C3830c c3830c = (C3830c) abstractC3809q;
        boolean z7 = c3830c.f18039M;
        boolean z8 = this.f698a;
        if (z7 != z8) {
            c3830c.f18039M = z8;
            AbstractC3498f.m5375o(c3830c);
        }
        c3830c.f18040N = this.f702e;
        c3830c.m4400R0(this.f699b, null, this.f700c, null, this.f701d, c3830c.f18041O);
    }
}
