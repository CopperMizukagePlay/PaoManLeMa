package p100n;

import p001a0.C0057o;
import p001a0.C0078t0;
import p032d6.InterfaceC0516a0;
import p085l0.AbstractC2418w;
import p085l0.C2353e1;
import p085l0.C2361g1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2413u0;
import p085l0.C2427z;
import p092m.C2490f;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.f1 */
/* loaded from: classes.dex */
public final class C2643f1 {

    /* renamed from: a */
    public final C2657k0 f14305a;

    /* renamed from: b */
    public final C2643f1 f14306b;

    /* renamed from: c */
    public final String f14307c;

    /* renamed from: d */
    public final C2361g1 f14308d = AbstractC2418w.m3980x(m4238c());

    /* renamed from: e */
    public final C2361g1 f14309e = AbstractC2418w.m3980x(new C2634c1(m4238c(), m4238c()));

    /* renamed from: f */
    public final C2353e1 f14310f = new C2353e1(0);

    /* renamed from: g */
    public final C2353e1 f14311g = new C2353e1(Long.MIN_VALUE);

    /* renamed from: h */
    public final C2361g1 f14312h;

    /* renamed from: i */
    public final C3469p f14313i;

    /* renamed from: j */
    public final C3469p f14314j;

    /* renamed from: k */
    public final C2361g1 f14315k;

    public C2643f1(C2657k0 c2657k0, C2643f1 c2643f1, String str) {
        this.f14305a = c2657k0;
        this.f14306b = c2643f1;
        this.f14307c = str;
        Boolean bool = Boolean.FALSE;
        this.f14312h = AbstractC2418w.m3980x(bool);
        this.f14313i = new C3469p();
        this.f14314j = new C3469p();
        this.f14315k = AbstractC2418w.m3980x(bool);
        AbstractC2418w.m3974q(new C2490f(this, 1));
    }

    /* renamed from: a */
    public final void m4236a(Object obj, C2395p c2395p, int i7) {
        int i8;
        boolean z7;
        int i9;
        boolean m3874i;
        int i10;
        c2395p.m3859a0(-1493585151);
        if ((i7 & 6) == 0) {
            if ((i7 & 8) == 0) {
                m3874i = c2395p.m3870g(obj);
            } else {
                m3874i = c2395p.m3874i(obj);
            }
            if (m3874i) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i8 = i10 | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            if (c2395p.m3870g(this)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i8 |= i9;
        }
        if ((i8 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else if (!m4242g()) {
            c2395p.m3857Z(1822376658);
            m4247l(obj);
            boolean z8 = true;
            if (AbstractC3367j.m5096a(obj, m4238c())) {
                if (this.f14311g.m3793g() != Long.MIN_VALUE) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7 && !((Boolean) this.f14312h.getValue()).booleanValue()) {
                    c2395p.m3857Z(1823851483);
                    c2395p.m3888r(false);
                    c2395p.m3888r(false);
                }
            }
            c2395p.m3857Z(1822607949);
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
                C2427z c2427z = new C2427z(AbstractC2418w.m3971n(c2395p));
                c2395p.m3877j0(c2427z);
                m3847O = c2427z;
            }
            InterfaceC0516a0 interfaceC0516a0 = ((C2427z) m3847O).f13636e;
            boolean m3874i2 = c2395p.m3874i(interfaceC0516a0);
            if ((i8 & 112) != 32) {
                z8 = false;
            }
            boolean z9 = m3874i2 | z8;
            Object m3847O2 = c2395p.m3847O();
            if (z9 || m3847O2 == c2413u0) {
                m3847O2 = new C0078t0(29, interfaceC0516a0, this);
                c2395p.m3877j0(m3847O2);
            }
            AbstractC2418w.m3961c(interfaceC0516a0, this, (InterfaceC3279c) m3847O2, c2395p);
            c2395p.m3888r(false);
            c2395p.m3888r(false);
        } else {
            c2395p.m3857Z(1823861403);
            c2395p.m3888r(false);
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0057o(i7, 2, this, obj);
        }
    }

    /* renamed from: b */
    public final long m4237b() {
        C3469p c3469p = this.f14313i;
        int size = c3469p.size();
        long j6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            j6 = Math.max(j6, ((C2637d1) c3469p.get(i7)).f14281n.m3793g());
        }
        C3469p c3469p2 = this.f14314j;
        int size2 = c3469p2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            j6 = Math.max(j6, ((C2643f1) c3469p2.get(i8)).m4237b());
        }
        return j6;
    }

    /* renamed from: c */
    public final Object m4238c() {
        return this.f14305a.f14345b.getValue();
    }

    /* renamed from: d */
    public final boolean m4239d() {
        C3469p c3469p = this.f14313i;
        int size = c3469p.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C2637d1) c3469p.get(i7)).getClass();
        }
        C3469p c3469p2 = this.f14314j;
        int size2 = c3469p2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            if (((C2643f1) c3469p2.get(i8)).m4239d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final long m4240e() {
        C2643f1 c2643f1 = this.f14306b;
        if (c2643f1 != null) {
            return c2643f1.m4240e();
        }
        return this.f14310f.m3793g();
    }

    /* renamed from: f */
    public final C2634c1 m4241f() {
        return (C2634c1) this.f14309e.getValue();
    }

    /* renamed from: g */
    public final boolean m4242g() {
        return ((Boolean) this.f14315k.getValue()).booleanValue();
    }

    /* renamed from: h */
    public final void m4243h(long j6, boolean z7) {
        long j7;
        C2657k0 c2657k0 = this.f14305a;
        C2361g1 c2361g1 = c2657k0.f14344a;
        C2353e1 c2353e1 = this.f14311g;
        if (c2353e1.m3793g() == Long.MIN_VALUE) {
            c2353e1.m3794h(j6);
            c2657k0.f14344a.setValue(Boolean.TRUE);
        } else if (!((Boolean) c2361g1.getValue()).booleanValue()) {
            c2361g1.setValue(Boolean.TRUE);
        }
        this.f14312h.setValue(Boolean.FALSE);
        C3469p c3469p = this.f14313i;
        int size = c3469p.size();
        boolean z8 = true;
        for (int i7 = 0; i7 < size; i7++) {
            C2637d1 c2637d1 = (C2637d1) c3469p.get(i7);
            C2361g1 c2361g12 = c2637d1.f14276i;
            C2361g1 c2361g13 = c2637d1.f14276i;
            if (!((Boolean) c2361g12.getValue()).booleanValue()) {
                if (z7) {
                    j7 = c2637d1.m4209a().mo4250d();
                } else {
                    j7 = j6;
                }
                c2637d1.f14279l.setValue(c2637d1.m4209a().mo4249c(j7));
                c2637d1.f14280m = c2637d1.m4209a().mo4253g(j7);
                if (c2637d1.m4209a().m4254h(j7)) {
                    c2361g13.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c2361g13.getValue()).booleanValue()) {
                z8 = false;
            }
        }
        C3469p c3469p2 = this.f14314j;
        int size2 = c3469p2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            C2643f1 c2643f1 = (C2643f1) c3469p2.get(i8);
            if (!AbstractC3367j.m5096a(c2643f1.f14308d.getValue(), c2643f1.m4238c())) {
                c2643f1.m4243h(j6, z7);
            }
            if (!AbstractC3367j.m5096a(c2643f1.f14308d.getValue(), c2643f1.m4238c())) {
                z8 = false;
            }
        }
        if (z8) {
            m4244i();
        }
    }

    /* renamed from: i */
    public final void m4244i() {
        this.f14311g.m3794h(Long.MIN_VALUE);
        Object value = this.f14308d.getValue();
        C2657k0 c2657k0 = this.f14305a;
        c2657k0.f14345b.setValue(value);
        if (this.f14306b == null) {
            this.f14310f.m3794h(0L);
        }
        c2657k0.f14344a.setValue(Boolean.FALSE);
        C3469p c3469p = this.f14314j;
        int size = c3469p.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C2643f1) c3469p.get(i7)).m4244i();
        }
    }

    /* renamed from: j */
    public final void m4245j() {
        C3469p c3469p = this.f14313i;
        int size = c3469p.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C2637d1) c3469p.get(i7)).f14277j.m3730h(-2.0f);
        }
        C3469p c3469p2 = this.f14314j;
        int size2 = c3469p2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((C2643f1) c3469p2.get(i8)).m4245j();
        }
    }

    /* renamed from: k */
    public final void m4246k(Object obj, Object obj2) {
        this.f14311g.m3794h(Long.MIN_VALUE);
        C2657k0 c2657k0 = this.f14305a;
        c2657k0.f14344a.setValue(Boolean.FALSE);
        boolean m4242g = m4242g();
        C2361g1 c2361g1 = this.f14308d;
        if (!m4242g || !AbstractC3367j.m5096a(m4238c(), obj) || !AbstractC3367j.m5096a(c2361g1.getValue(), obj2)) {
            if (!AbstractC3367j.m5096a(m4238c(), obj)) {
                c2657k0.f14345b.setValue(obj);
            }
            c2361g1.setValue(obj2);
            this.f14315k.setValue(Boolean.TRUE);
            this.f14309e.setValue(new C2634c1(obj, obj2));
        }
        C3469p c3469p = this.f14314j;
        int size = c3469p.size();
        for (int i7 = 0; i7 < size; i7++) {
            C2643f1 c2643f1 = (C2643f1) c3469p.get(i7);
            AbstractC3367j.m5098c(c2643f1, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (c2643f1.m4242g()) {
                c2643f1.m4246k(c2643f1.m4238c(), c2643f1.f14308d.getValue());
            }
        }
        C3469p c3469p2 = this.f14313i;
        int size2 = c3469p2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            ((C2637d1) c3469p2.get(i8)).m4211c();
        }
    }

    /* renamed from: l */
    public final void m4247l(Object obj) {
        C2361g1 c2361g1 = this.f14308d;
        if (!AbstractC3367j.m5096a(c2361g1.getValue(), obj)) {
            this.f14309e.setValue(new C2634c1(c2361g1.getValue(), obj));
            if (!AbstractC3367j.m5096a(m4238c(), c2361g1.getValue())) {
                this.f14305a.f14345b.setValue(c2361g1.getValue());
            }
            c2361g1.setValue(obj);
            if (this.f14311g.m3793g() == Long.MIN_VALUE) {
                this.f14312h.setValue(Boolean.TRUE);
            }
            m4245j();
        }
    }

    public final String toString() {
        C3469p c3469p = this.f14313i;
        int size = c3469p.size();
        String str = "Transition animation values: ";
        for (int i7 = 0; i7 < size; i7++) {
            str = str + ((C2637d1) c3469p.get(i7)) + ", ";
        }
        return str;
    }
}
