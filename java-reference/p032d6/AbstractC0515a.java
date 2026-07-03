package p032d6;

import p053g5.C1690i;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p065i2.AbstractC2064e;
import p069i6.AbstractC2088a;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p090l5.EnumC2465a;
import p098m5.AbstractC2581a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3382y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d6.a */
/* loaded from: classes.dex */
public abstract class AbstractC0515a extends C0541i1 implements InterfaceC2313c, InterfaceC0516a0 {

    /* renamed from: g */
    public final InterfaceC2318h f1840g;

    public AbstractC0515a(InterfaceC2318h interfaceC2318h, boolean z7) {
        super(z7);
        m1183U((InterfaceC0520b1) interfaceC2318h.mo853h(C0584x.f1939f));
        this.f1840g = interfaceC2318h.mo855z(this);
    }

    @Override // p032d6.C0541i1
    /* renamed from: J */
    public final String mo1104J() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p032d6.C0541i1
    /* renamed from: T */
    public final void mo1105T(C0572t c0572t) {
        AbstractC0525d0.m1137o(c0572t, this.f1840g);
    }

    @Override // p032d6.C0541i1
    /* renamed from: b0 */
    public final void mo1106b0(Object obj) {
        boolean z7;
        if (obj instanceof C0569s) {
            C0569s c0569s = (C0569s) obj;
            Throwable th = c0569s.f1923a;
            if (C0569s.f1922b.get(c0569s) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            mo1108j0(th, z7);
            return;
        }
        mo1109k0(obj);
    }

    @Override // p032d6.InterfaceC0516a0
    /* renamed from: i */
    public final InterfaceC2318h mo1107i() {
        return this.f1840g;
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: j */
    public final InterfaceC2318h mo662j() {
        return this.f1840g;
    }

    /* renamed from: l0 */
    public final void m1110l0(EnumC0519b0 enumC0519b0, AbstractC0515a abstractC0515a, InterfaceC3281e interfaceC3281e) {
        Object mo22d;
        int ordinal = enumC0519b0.ordinal();
        C1694m c1694m = C1694m.f10482a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            InterfaceC2318h interfaceC2318h = this.f1840g;
                            Object m3441l = AbstractC2088a.m3441l(interfaceC2318h, null);
                            try {
                                if (!(interfaceC3281e instanceof AbstractC2581a)) {
                                    mo22d = AbstractC2064e.m3230K(interfaceC3281e, abstractC0515a, this);
                                } else {
                                    AbstractC3382y.m5111b(2, interfaceC3281e);
                                    mo22d = interfaceC3281e.mo22d(abstractC0515a, this);
                                }
                                AbstractC2088a.m3436g(interfaceC2318h, m3441l);
                                if (mo22d != EnumC2465a.f13750e) {
                                    mo663n(mo22d);
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                AbstractC2088a.m3436g(interfaceC2318h, m3441l);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                AbstractC3367j.m5100e(interfaceC3281e, "<this>");
                AbstractC2064e.m3250x(AbstractC2064e.m3242p(abstractC0515a, this, interfaceC3281e)).mo663n(c1694m);
                return;
            }
            return;
        }
        try {
            AbstractC2088a.m3437h(c1694m, AbstractC2064e.m3250x(AbstractC2064e.m3242p(abstractC0515a, this, interfaceC3281e)));
        } finally {
            mo663n(AbstractC1793a0.m2985m(th2));
        }
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: n */
    public final void mo663n(Object obj) {
        Throwable m2747a = C1690i.m2747a(obj);
        if (m2747a != null) {
            obj = new C0569s(m2747a, false);
        }
        Object m1187Y = m1187Y(obj);
        if (m1187Y == AbstractC0525d0.f1859e) {
            return;
        }
        mo1171E(m1187Y);
    }

    /* renamed from: k0 */
    public void mo1109k0(Object obj) {
    }

    /* renamed from: j0 */
    public void mo1108j0(Throwable th, boolean z7) {
    }
}
