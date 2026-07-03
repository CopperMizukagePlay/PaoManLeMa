package p085l0;

import java.util.concurrent.CancellationException;
import p017c.C0320e;
import p032d6.AbstractC0525d0;
import p032d6.C0565q1;
import p032d6.C0584x;
import p032d6.InterfaceC0587y;
import p068i5.AbstractC2080d;
import p069i6.C2090c;
import p082k5.C2319i;
import p082k5.InterfaceC2316f;
import p082k5.InterfaceC2317g;
import p082k5.InterfaceC2318h;
import p150t5.InterfaceC3281e;
import p169w0.C3645b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.s0 */
/* loaded from: classes.dex */
public final class C2407s0 implements InterfaceC2417v1, InterfaceC0587y {

    /* renamed from: e */
    public final InterfaceC2318h f13546e;

    /* renamed from: f */
    public final InterfaceC3281e f13547f;

    /* renamed from: g */
    public final C2090c f13548g;

    /* renamed from: h */
    public C0565q1 f13549h;

    public C2407s0(InterfaceC2318h interfaceC2318h, InterfaceC3281e interfaceC3281e) {
        InterfaceC2318h interfaceC2318h2;
        this.f13546e = interfaceC2318h;
        this.f13547f = interfaceC3281e;
        if (interfaceC2318h.mo853h(C3645b.f17421f) != null) {
            interfaceC2318h2 = this;
        } else {
            interfaceC2318h2 = C2319i.f13273e;
        }
        this.f13548g = AbstractC0525d0.m1123a(interfaceC2318h.mo855z(interfaceC2318h2));
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: B */
    public final Object mo852B(Object obj, InterfaceC3281e interfaceC3281e) {
        return interfaceC3281e.mo22d(obj, this);
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: e */
    public final void mo2779e() {
        C0565q1 c0565q1 = this.f13549h;
        if (c0565q1 != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            c0565q1.mo1114c(cancellationException);
        }
        this.f13549h = AbstractC0525d0.m1141s(this.f13548g, null, this.f13547f, 3);
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: g */
    public final void mo2780g() {
        C0565q1 c0565q1 = this.f13549h;
        if (c0565q1 != null) {
            c0565q1.mo1174H(new C2372j0(1));
        }
        this.f13549h = null;
    }

    @Override // p082k5.InterfaceC2316f
    public final InterfaceC2317g getKey() {
        return C0584x.f1938e;
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: h */
    public final InterfaceC2316f mo853h(InterfaceC2317g interfaceC2317g) {
        return AbstractC2080d.m3401n(this, interfaceC2317g);
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: j */
    public final void mo2781j() {
        C0565q1 c0565q1 = this.f13549h;
        if (c0565q1 != null) {
            c0565q1.mo1174H(new C2372j0(1));
        }
        this.f13549h = null;
    }

    @Override // p032d6.InterfaceC0587y
    /* renamed from: q */
    public final void mo1248q(Throwable th, InterfaceC2318h interfaceC2318h) {
        C3645b c3645b = (C3645b) interfaceC2318h.mo853h(C3645b.f17421f);
        if (c3645b != null) {
            AbstractC2080d.m3387O(th, new C0320e(29, c3645b, this));
        }
        InterfaceC0587y interfaceC0587y = (InterfaceC0587y) this.f13546e.mo853h(C0584x.f1938e);
        if (interfaceC0587y != null) {
            interfaceC0587y.mo1248q(th, interfaceC2318h);
            return;
        }
        throw th;
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: t */
    public final InterfaceC2318h mo854t(InterfaceC2317g interfaceC2317g) {
        return AbstractC2080d.m3411x(this, interfaceC2317g);
    }

    @Override // p082k5.InterfaceC2318h
    /* renamed from: z */
    public final InterfaceC2318h mo855z(InterfaceC2318h interfaceC2318h) {
        return AbstractC2080d.m3374B(this, interfaceC2318h);
    }
}
