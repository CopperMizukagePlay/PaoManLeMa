package androidx.compose.foundation;

import android.view.View;
import p028d2.C0490w;
import p034e0.C0630s0;
import p034e0.C0632t0;
import p092m.AbstractC2487d;
import p107o.AbstractC2786x0;
import p107o.C2784w0;
import p107o.InterfaceC2745h1;
import p140s2.C3096f;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class MagnifierElement extends AbstractC3556y0 {

    /* renamed from: a */
    public final C0630s0 f596a;

    /* renamed from: b */
    public final C0632t0 f597b;

    /* renamed from: c */
    public final InterfaceC2745h1 f598c;

    public MagnifierElement(C0630s0 c0630s0, C0632t0 c0632t0, InterfaceC2745h1 interfaceC2745h1) {
        this.f596a = c0630s0;
        this.f597b = c0632t0;
        this.f598c = interfaceC2745h1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: h */
    public final AbstractC3809q mo312h() {
        return new C2784w0(this.f596a, this.f597b, this.f598c);
    }

    public final int hashCode() {
        return this.f598c.hashCode() + ((this.f597b.hashCode() + AbstractC2487d.m4040d(AbstractC2487d.m4038b(Float.NaN, AbstractC2487d.m4038b(Float.NaN, AbstractC2487d.m4039c(AbstractC2487d.m4040d(AbstractC2487d.m4038b(Float.NaN, this.f596a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }

    @Override // p162v1.AbstractC3556y0
    /* renamed from: i */
    public final void mo313i(AbstractC3809q abstractC3809q) {
        C2784w0 c2784w0 = (C2784w0) abstractC3809q;
        c2784w0.getClass();
        InterfaceC2745h1 interfaceC2745h1 = c2784w0.f14784u;
        View view = c2784w0.f14785v;
        InterfaceC3093c interfaceC3093c = c2784w0.f14786w;
        c2784w0.f14782s = this.f596a;
        c2784w0.f14783t = this.f597b;
        InterfaceC2745h1 interfaceC2745h12 = this.f598c;
        c2784w0.f14784u = interfaceC2745h12;
        View m5384x = AbstractC3498f.m5384x(c2784w0);
        InterfaceC3093c interfaceC3093c2 = AbstractC3498f.m5382v(c2784w0).f16865B;
        if (c2784w0.f14787x != null) {
            C0490w c0490w = AbstractC2786x0.f14791a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !interfaceC2745h12.mo4416a()) || !C3096f.m4776a(Float.NaN, Float.NaN) || !C3096f.m4776a(Float.NaN, Float.NaN) || !interfaceC2745h12.equals(interfaceC2745h1) || !m5384x.equals(view) || !AbstractC3367j.m5096a(interfaceC3093c2, interfaceC3093c)) {
                c2784w0.m4425L0();
            }
        }
        c2784w0.m4426M0();
    }
}
