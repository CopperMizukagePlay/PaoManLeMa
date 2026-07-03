package p047f6;

import java.util.concurrent.CancellationException;
import p032d6.AbstractC0515a;
import p032d6.AbstractC0525d0;
import p032d6.C0523c1;
import p032d6.C0538h1;
import p032d6.C0541i1;
import p032d6.C0569s;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p098m5.AbstractC2590j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f6.o */
/* loaded from: classes.dex */
public final class C1560o extends AbstractC0515a implements InterfaceC1561p, InterfaceC1552g {

    /* renamed from: h */
    public final C1548c f10173h;

    public C1560o(InterfaceC2318h interfaceC2318h, C1548c c1548c) {
        super(interfaceC2318h, true);
        this.f10173h = c1548c;
    }

    @Override // p032d6.C0541i1
    /* renamed from: H */
    public final void mo1174H(CancellationException cancellationException) {
        this.f10173h.m2491g(cancellationException, true);
        m1173G(cancellationException);
    }

    @Override // p047f6.InterfaceC1563r
    /* renamed from: a */
    public final boolean mo2488a(Throwable th) {
        return this.f10173h.m2491g(th, false);
    }

    @Override // p032d6.C0541i1, p032d6.InterfaceC0520b1
    /* renamed from: c */
    public final void mo1114c(CancellationException cancellationException) {
        Object obj = C0541i1.f1886e.get(this);
        if (!(obj instanceof C0569s)) {
            if (!(obj instanceof C0538h1) || !((C0538h1) obj).m1166e()) {
                if (cancellationException == null) {
                    cancellationException = new C0523c1(mo1104J(), null, this);
                }
                mo1174H(cancellationException);
            }
        }
    }

    @Override // p047f6.InterfaceC1562q
    public final C1547b iterator() {
        C1548c c1548c = this.f10173h;
        c1548c.getClass();
        return new C1547b(c1548c);
    }

    @Override // p032d6.AbstractC0515a
    /* renamed from: j0 */
    public final void mo1108j0(Throwable th, boolean z7) {
        if (!this.f10173h.m2491g(th, false) && !z7) {
            AbstractC0525d0.m1137o(th, this.f1840g);
        }
    }

    @Override // p047f6.InterfaceC1563r
    /* renamed from: k */
    public final Object mo2495k(Object obj, InterfaceC2313c interfaceC2313c) {
        return this.f10173h.mo2495k(obj, interfaceC2313c);
    }

    @Override // p032d6.AbstractC0515a
    /* renamed from: k0 */
    public final void mo1109k0(Object obj) {
        this.f10173h.mo2488a(null);
    }

    @Override // p047f6.InterfaceC1562q
    /* renamed from: l */
    public final Object mo2496l() {
        return this.f10173h.mo2496l();
    }

    @Override // p047f6.InterfaceC1563r
    /* renamed from: v */
    public final Object mo2505v(Object obj) {
        return this.f10173h.mo2505v(obj);
    }

    @Override // p047f6.InterfaceC1562q
    /* renamed from: x */
    public final Object mo2507x(AbstractC2590j abstractC2590j) {
        return this.f10173h.mo2507x(abstractC2590j);
    }
}
