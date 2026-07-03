package p071j0;

import p001a0.C0053n;
import p001a0.C0068q2;
import p032d6.AbstractC0525d0;
import p039e5.C1306th;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.C1814v;
import p063i0.AbstractC1982q3;
import p063i0.EnumC1964o1;
import p085l0.AbstractC2418w;
import p085l0.C2345c1;
import p085l0.C2352e0;
import p085l0.C2361g1;
import p085l0.C2413u0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p100n.InterfaceC2656k;
import p107o.EnumC2788y0;
import p150t5.InterfaceC3283g;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.s */
/* loaded from: classes.dex */
public final class C2150s {

    /* renamed from: a */
    public final C0053n f12508a;

    /* renamed from: b */
    public final InterfaceC2656k f12509b;

    /* renamed from: e */
    public final C2361g1 f12512e;

    /* renamed from: i */
    public final C2345c1 f12516i;

    /* renamed from: j */
    public final C2361g1 f12517j;

    /* renamed from: k */
    public final C2361g1 f12518k;

    /* renamed from: l */
    public final C2146q f12519l;

    /* renamed from: c */
    public final C2160y f12510c = new C2160y();

    /* renamed from: d */
    public final C0068q2 f12511d = new C0068q2(this);

    /* renamed from: f */
    public final C2352e0 f12513f = AbstractC2418w.m3974q(new C2138m(this, 4));

    /* renamed from: g */
    public final C2352e0 f12514g = AbstractC2418w.m3974q(new C2138m(this, 2));

    /* renamed from: h */
    public final C2345c1 f12515h = new C2345c1(Float.NaN);

    public C2150s(EnumC1964o1 enumC1964o1, C0053n c0053n, InterfaceC2656k interfaceC2656k) {
        this.f12508a = c0053n;
        this.f12509b = interfaceC2656k;
        this.f12512e = AbstractC2418w.m3980x(enumC1964o1);
        AbstractC2418w.m3973p(C2413u0.f13575j, new C2138m(this, 3));
        this.f12516i = new C2345c1(0.0f);
        this.f12517j = AbstractC2418w.m3980x(null);
        this.f12518k = AbstractC2418w.m3980x(new C2121d0(C1814v.f10861e));
        this.f12519l = new C2146q(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3484a(Object obj, EnumC2788y0 enumC2788y0, InterfaceC3283g interfaceC3283g, AbstractC2583c abstractC2583c) {
        C2142o c2142o;
        int i7;
        C2150s c2150s;
        Object m3472a;
        Object m3472a2;
        if (abstractC2583c instanceof C2142o) {
            c2142o = (C2142o) abstractC2583c;
            int i8 = c2142o.f12475k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2142o.f12475k = i8 - Integer.MIN_VALUE;
                Object obj2 = c2142o.f12473i;
                i7 = c2142o.f12475k;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c2150s = c2142o.f12472h;
                        try {
                            AbstractC1793a0.m2972L(obj2);
                        } catch (Throwable th) {
                            th = th;
                            c2150s.m3490g(null);
                            C2345c1 c2345c1 = c2150s.f12515h;
                            m3472a = c2150s.m3487d().m3472a(c2345c1.m3729g());
                            if (m3472a != null) {
                                if (Boolean.TRUE.booleanValue()) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj2);
                    if (m3487d().f12415a.containsKey(obj)) {
                        try {
                            C2160y c2160y = this.f12510c;
                            C2144p c2144p = new C2144p(this, obj, interfaceC3283g, null);
                            c2142o.f12472h = this;
                            c2142o.f12475k = 1;
                            try {
                                c2160y.getClass();
                                Object m1130h = AbstractC0525d0.m1130h(new C1306th(enumC2788y0, c2160y, c2144p, null), c2142o);
                                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                                if (m1130h == enumC2465a) {
                                    return enumC2465a;
                                }
                                c2150s = this;
                            } catch (Throwable th2) {
                                th = th2;
                                c2150s = this;
                                c2150s.m3490g(null);
                                C2345c1 c2345c12 = c2150s.f12515h;
                                m3472a = c2150s.m3487d().m3472a(c2345c12.m3729g());
                                if (m3472a != null && Math.abs(c2345c12.m3729g() - c2150s.m3487d().m3474c(m3472a)) <= 0.5f) {
                                    if (Boolean.TRUE.booleanValue()) {
                                        c2150s.m3489f(m3472a);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        m3489f(obj);
                        return C1694m.f10482a;
                    }
                }
                c2150s.m3490g(null);
                C2345c1 c2345c13 = c2150s.f12515h;
                m3472a2 = c2150s.m3487d().m3472a(c2345c13.m3729g());
                if (m3472a2 != null && Math.abs(c2345c13.m3729g() - c2150s.m3487d().m3474c(m3472a2)) <= 0.5f) {
                    if (Boolean.TRUE.booleanValue()) {
                        c2150s.m3489f(m3472a2);
                    }
                }
                return C1694m.f10482a;
            }
        }
        c2142o = new C2142o(this, abstractC2583c);
        Object obj22 = c2142o.f12473i;
        i7 = c2142o.f12475k;
        if (i7 == 0) {
        }
        c2150s.m3490g(null);
        C2345c1 c2345c132 = c2150s.f12515h;
        m3472a2 = c2150s.m3487d().m3472a(c2345c132.m3729g());
        if (m3472a2 != null) {
            if (Boolean.TRUE.booleanValue()) {
            }
        }
        return C1694m.f10482a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3485b(EnumC2788y0 enumC2788y0, C2148r c2148r, AbstractC2583c abstractC2583c) {
        C2136l c2136l;
        int i7;
        C2150s c2150s;
        C2160y c2160y;
        C2140n c2140n;
        Object m3472a;
        Object m3472a2;
        if (abstractC2583c instanceof C2136l) {
            c2136l = (C2136l) abstractC2583c;
            int i8 = c2136l.f12456k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2136l.f12456k = i8 - Integer.MIN_VALUE;
                Object obj = c2136l.f12454i;
                i7 = c2136l.f12456k;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c2150s = c2136l.f12453h;
                        try {
                            AbstractC1793a0.m2972L(obj);
                        } catch (Throwable th) {
                            th = th;
                            C2121d0 m3487d = c2150s.m3487d();
                            C2345c1 c2345c1 = c2150s.f12515h;
                            m3472a = m3487d.m3472a(c2345c1.m3729g());
                            if (m3472a != null && Math.abs(c2345c1.m3729g() - c2150s.m3487d().m3474c(m3472a)) <= 0.5f) {
                                if (Boolean.TRUE.booleanValue()) {
                                    c2150s.m3489f(m3472a);
                                }
                            }
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    try {
                        c2160y = this.f12510c;
                        c2140n = new C2140n(this, c2148r, null);
                        c2136l.f12453h = this;
                        c2136l.f12456k = 1;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        c2160y.getClass();
                        Object m1130h = AbstractC0525d0.m1130h(new C1306th(enumC2788y0, c2160y, c2140n, null), c2136l);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (m1130h == enumC2465a) {
                            return enumC2465a;
                        }
                        c2150s = this;
                    } catch (Throwable th3) {
                        th = th3;
                        c2150s = this;
                        C2121d0 m3487d2 = c2150s.m3487d();
                        C2345c1 c2345c12 = c2150s.f12515h;
                        m3472a = m3487d2.m3472a(c2345c12.m3729g());
                        if (m3472a != null) {
                            if (Boolean.TRUE.booleanValue()) {
                            }
                        }
                        throw th;
                    }
                }
                C2121d0 m3487d3 = c2150s.m3487d();
                C2345c1 c2345c13 = c2150s.f12515h;
                m3472a2 = m3487d3.m3472a(c2345c13.m3729g());
                if (m3472a2 != null && Math.abs(c2345c13.m3729g() - c2150s.m3487d().m3474c(m3472a2)) <= 0.5f) {
                    if (Boolean.TRUE.booleanValue()) {
                        c2150s.m3489f(m3472a2);
                    }
                }
                return C1694m.f10482a;
            }
        }
        c2136l = new C2136l(this, abstractC2583c);
        Object obj2 = c2136l.f12454i;
        i7 = c2136l.f12456k;
        if (i7 == 0) {
        }
        C2121d0 m3487d32 = c2150s.m3487d();
        C2345c1 c2345c132 = c2150s.f12515h;
        m3472a2 = m3487d32.m3472a(c2345c132.m3729g());
        if (m3472a2 != null) {
            if (Boolean.TRUE.booleanValue()) {
            }
        }
        return C1694m.f10482a;
    }

    /* renamed from: c */
    public final Object m3486c(float f7, float f8, Object obj) {
        C2121d0 m3487d = m3487d();
        float m3474c = m3487d.m3474c(obj);
        float floatValue = ((Number) this.f12508a.mo52a()).floatValue();
        if (m3474c != f7 && !Float.isNaN(m3474c)) {
            if (m3474c < f7) {
                if (f8 >= floatValue) {
                    Object m3473b = m3487d.m3473b(f7, true);
                    AbstractC3367j.m5097b(m3473b);
                    return m3473b;
                }
                Object m3473b2 = m3487d.m3473b(f7, true);
                AbstractC3367j.m5097b(m3473b2);
                float abs = Math.abs(m3487d.m3474c(m3473b2) - m3474c);
                float f9 = AbstractC1982q3.f11694a;
                if (f7 >= Math.abs(Math.abs(abs * 0.5f) + m3474c)) {
                    return m3473b2;
                }
            } else {
                if (f8 <= (-floatValue)) {
                    Object m3473b3 = m3487d.m3473b(f7, false);
                    AbstractC3367j.m5097b(m3473b3);
                    return m3473b3;
                }
                Object m3473b4 = m3487d.m3473b(f7, false);
                AbstractC3367j.m5097b(m3473b4);
                float abs2 = Math.abs(m3474c - m3487d.m3474c(m3473b4));
                float f10 = AbstractC1982q3.f11694a;
                float abs3 = Math.abs(m3474c - Math.abs(abs2 * 0.5f));
                if (f7 >= 0.0f ? f7 <= abs3 : Math.abs(f7) >= abs3) {
                    return m3473b4;
                }
            }
        }
        return obj;
    }

    /* renamed from: d */
    public final C2121d0 m3487d() {
        return (C2121d0) this.f12518k.getValue();
    }

    /* renamed from: e */
    public final float m3488e() {
        C2345c1 c2345c1 = this.f12515h;
        if (!Float.isNaN(c2345c1.m3729g())) {
            return c2345c1.m3729g();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    /* renamed from: f */
    public final void m3489f(Object obj) {
        this.f12512e.setValue(obj);
    }

    /* renamed from: g */
    public final void m3490g(Object obj) {
        this.f12517j.setValue(obj);
    }
}
