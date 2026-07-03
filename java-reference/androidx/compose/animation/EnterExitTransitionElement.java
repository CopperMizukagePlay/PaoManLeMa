package androidx.compose.animation;

import p092m.C2497m;
import p092m.C2505u;
import p092m.C2506v;
import p092m.C2507w;
import p100n.C2631b1;
import p100n.C2643f1;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
final class EnterExitTransitionElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C2643f1 f568a;

    /* renamed from: b */
    public final C2631b1 f569b;

    /* renamed from: c */
    public final C2631b1 f570c;

    /* renamed from: d */
    public final C2506v f571d;

    /* renamed from: e */
    public final C2507w f572e;

    /* renamed from: f */
    public final InterfaceC3277a f573f;

    /* renamed from: g */
    public final C2497m f574g;

    public EnterExitTransitionElement(C2643f1 c2643f1, C2631b1 c2631b1, C2631b1 c2631b12, C2506v c2506v, C2507w c2507w, InterfaceC3277a interfaceC3277a, C2497m c2497m) {
        this.f568a = c2643f1;
        this.f569b = c2631b1;
        this.f570c = c2631b12;
        this.f571d = c2506v;
        this.f572e = c2507w;
        this.f573f = interfaceC3277a;
        this.f574g = c2497m;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EnterExitTransitionElement) {
                EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
                if (!this.f568a.equals(enterExitTransitionElement.f568a) || !AbstractC3367j.m5096a(this.f569b, enterExitTransitionElement.f569b) || !AbstractC3367j.m5096a(this.f570c, enterExitTransitionElement.f570c) || !this.f571d.equals(enterExitTransitionElement.f571d) || !this.f572e.equals(enterExitTransitionElement.f572e) || !AbstractC3367j.m5096a(this.f573f, enterExitTransitionElement.f573f) || !AbstractC3367j.m5096a(this.f574g, enterExitTransitionElement.f574g)) {
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
        return new C2505u(this.f568a, this.f569b, this.f570c, this.f571d, this.f572e, this.f573f, this.f574g);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f568a.hashCode() * 31;
        int i7 = 0;
        C2631b1 c2631b1 = this.f569b;
        if (c2631b1 == null) {
            hashCode = 0;
        } else {
            hashCode = c2631b1.hashCode();
        }
        int i8 = (hashCode2 + hashCode) * 31;
        C2631b1 c2631b12 = this.f570c;
        if (c2631b12 != null) {
            i7 = c2631b12.hashCode();
        }
        return this.f574g.hashCode() + ((this.f573f.hashCode() + ((this.f572e.f13852a.hashCode() + ((this.f571d.f13849a.hashCode() + ((i8 + i7) * 961)) * 31)) * 31)) * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C2505u c2505u = (C2505u) abstractC3809q;
        c2505u.f13840s = this.f568a;
        c2505u.f13841t = this.f569b;
        c2505u.f13842u = this.f570c;
        c2505u.f13843v = this.f571d;
        c2505u.f13844w = this.f572e;
        c2505u.f13845x = this.f573f;
        c2505u.f13846y = this.f574g;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f568a + ", sizeAnimation=" + this.f569b + ", offsetAnimation=" + this.f570c + ", slideAnimation=null, enter=" + this.f571d + ", exit=" + this.f572e + ", isEnabled=" + this.f573f + ", graphicsLayerBlock=" + this.f574g + ')';
    }
}
