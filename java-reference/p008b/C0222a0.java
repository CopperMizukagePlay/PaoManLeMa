package p008b;

import p017c.C0325j;
import p148t3.AbstractC3255d;
import p148t3.C3253b;
import p158u5.AbstractC3367j;
import p171w2.C3751a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.a0 */
/* loaded from: classes.dex */
public final class C0222a0 extends AbstractC3255d {

    /* renamed from: d */
    public final C0238i0 f898d;

    /* renamed from: e */
    public boolean f899e;

    public C0222a0(C0238i0 c0238i0, C0224b0 c0224b0) {
        boolean z7 = c0238i0.f927b;
        this.f16081a = c0224b0;
        this.f16082b = z7;
        this.f898d = c0238i0;
        this.f899e = true;
    }

    @Override // p148t3.AbstractC3255d
    /* renamed from: a */
    public final void mo478a() {
        C0238i0 c0238i0 = this.f898d;
        switch (c0238i0.f929d) {
            case 1:
                ((C0325j) c0238i0.f930e).getClass();
                return;
            default:
                return;
        }
    }

    @Override // p148t3.AbstractC3255d
    /* renamed from: b */
    public final void mo479b() {
        C0238i0 c0238i0 = this.f898d;
        switch (c0238i0.f929d) {
            case 0:
                ((C3751a) c0238i0.f930e).mo23f(c0238i0);
                return;
            default:
                ((C0325j) c0238i0.f930e).f1136c.mo52a();
                return;
        }
    }

    @Override // p148t3.AbstractC3255d
    /* renamed from: c */
    public final void mo480c(C3253b c3253b) {
        new C0221a(c3253b);
        C0238i0 c0238i0 = this.f898d;
        switch (c0238i0.f929d) {
            case 1:
                ((C0325j) c0238i0.f930e).getClass();
                return;
            default:
                return;
        }
    }

    @Override // p148t3.AbstractC3255d
    /* renamed from: d */
    public final void mo481d(C3253b c3253b) {
        AbstractC3367j.m5100e(c3253b, "event");
        new C0221a(c3253b);
        C0238i0 c0238i0 = this.f898d;
        switch (c0238i0.f929d) {
            case 1:
                ((C0325j) c0238i0.f930e).getClass();
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    public final void m482g(boolean z7) {
        boolean z8;
        this.f899e = z7;
        if (z7 && this.f898d.f927b) {
            z8 = true;
        } else {
            z8 = false;
        }
        m4971f(z8);
    }
}
