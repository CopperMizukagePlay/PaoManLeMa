package p085l0;

import p032d6.C0526d1;
import p032d6.C0584x;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p082k5.C2319i;
import p082k5.InterfaceC2318h;
import p158u5.AbstractC3367j;
import p169w0.C3645b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.y1 */
/* loaded from: classes.dex */
public final class C2426y1 implements InterfaceC0516a0, InterfaceC2417v1 {

    /* renamed from: h */
    public static final C2355f f13632h = new Object();

    /* renamed from: e */
    public final InterfaceC2318h f13633e;

    /* renamed from: f */
    public final C2426y1 f13634f = this;

    /* renamed from: g */
    public volatile InterfaceC2318h f13635g;

    public C2426y1(InterfaceC2318h interfaceC2318h) {
        this.f13633e = interfaceC2318h;
    }

    /* renamed from: a */
    public final void m3987a() {
        synchronized (this.f13634f) {
            try {
                InterfaceC2318h interfaceC2318h = this.f13635g;
                if (interfaceC2318h == null) {
                    this.f13635g = f13632h;
                } else {
                    C2372j0 c2372j0 = new C2372j0(0);
                    InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) interfaceC2318h.mo853h(C0584x.f1939f);
                    if (interfaceC0520b1 != null) {
                        interfaceC0520b1.mo1114c(c2372j0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: g */
    public final void mo2780g() {
        m3987a();
    }

    @Override // p032d6.InterfaceC0516a0
    /* renamed from: i */
    public final InterfaceC2318h mo1107i() {
        InterfaceC2318h interfaceC2318h;
        InterfaceC2318h interfaceC2318h2;
        InterfaceC2318h interfaceC2318h3 = this.f13635g;
        if (interfaceC2318h3 == null || interfaceC2318h3 == f13632h) {
            C3645b c3645b = (C3645b) this.f13633e.mo853h(C3645b.f17421f);
            if (c3645b != null) {
                interfaceC2318h = new C2423x1(c3645b, this);
            } else {
                interfaceC2318h = C2319i.f13273e;
            }
            synchronized (this.f13634f) {
                try {
                    InterfaceC2318h interfaceC2318h4 = this.f13635g;
                    if (interfaceC2318h4 == null) {
                        InterfaceC2318h interfaceC2318h5 = this.f13633e;
                        interfaceC2318h2 = interfaceC2318h5.mo855z(new C0526d1((InterfaceC0520b1) interfaceC2318h5.mo853h(C0584x.f1939f))).mo855z(C2319i.f13273e).mo855z(interfaceC2318h);
                    } else if (interfaceC2318h4 == f13632h) {
                        InterfaceC2318h interfaceC2318h6 = this.f13633e;
                        C0526d1 c0526d1 = new C0526d1((InterfaceC0520b1) interfaceC2318h6.mo853h(C0584x.f1939f));
                        c0526d1.m1173G(new C2372j0(0));
                        interfaceC2318h2 = interfaceC2318h6.mo855z(c0526d1).mo855z(C2319i.f13273e).mo855z(interfaceC2318h);
                    } else {
                        interfaceC2318h2 = interfaceC2318h4;
                    }
                    this.f13635g = interfaceC2318h2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            interfaceC2318h3 = interfaceC2318h2;
        }
        AbstractC3367j.m5097b(interfaceC2318h3);
        return interfaceC2318h3;
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: j */
    public final void mo2781j() {
        m3987a();
    }

    @Override // p085l0.InterfaceC2417v1
    /* renamed from: e */
    public final void mo2779e() {
    }
}
