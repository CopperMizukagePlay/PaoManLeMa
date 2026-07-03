package p100n;

import java.util.concurrent.CancellationException;
import p001a0.C0042k0;
import p001a0.C0078t0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2318h;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.C3379v;
import p170w1.C3714p1;
import p177x0.C3795c;
import p177x0.InterfaceC3811s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.e */
/* loaded from: classes.dex */
public abstract class AbstractC2638e {

    /* renamed from: a */
    public static final C2662m f14285a = new C2662m(Float.POSITIVE_INFINITY);

    /* renamed from: b */
    public static final C2665n f14286b = new C2665n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c */
    public static final C2668o f14287c = new C2668o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d */
    public static final C2671p f14288d = new C2671p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e */
    public static final C2662m f14289e = new C2662m(Float.NEGATIVE_INFINITY);

    /* renamed from: f */
    public static final C2665n f14290f = new C2665n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g */
    public static final C2668o f14291g = new C2668o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h */
    public static final C2671p f14292h = new C2671p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: a */
    public static C2635d m4215a(float f7) {
        return new C2635d(Float.valueOf(f7), AbstractC2667n1.f14365a, Float.valueOf(0.01f), 8);
    }

    /* renamed from: b */
    public static C2659l m4216b(float f7, float f8, int i7) {
        if ((i7 & 2) != 0) {
            f8 = 0.0f;
        }
        return new C2659l(AbstractC2667n1.f14365a, Float.valueOf(f7), new C2662m(f8), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* renamed from: c */
    public static final Object m4217c(float f7, float f8, float f9, InterfaceC2656k interfaceC2656k, InterfaceC3281e interfaceC3281e, AbstractC2590j abstractC2590j) {
        C2664m1 c2664m1 = AbstractC2667n1.f14365a;
        Float f10 = new Float(f7);
        Float f11 = new Float(f8);
        C2662m c2662m = new C2662m(new Float(f9).floatValue());
        Object m4218d = m4218d(new C2659l(c2664m1, f10, c2662m, 56), new C2700z0(interfaceC2656k, c2664m1, f10, f11, c2662m), Long.MIN_VALUE, new C2684t0(interfaceC3281e), abstractC2590j);
        C1694m c1694m = C1694m.f10482a;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (m4218d != enumC2465a) {
            m4218d = c1694m;
        }
        if (m4218d == enumC2465a) {
            return m4218d;
        }
        return c1694m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0117 A[Catch: CancellationException -> 0x003d, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003d, blocks: (B:16:0x0038, B:18:0x0100, B:20:0x0117, B:25:0x0139, B:27:0x0149, B:29:0x0153, B:36:0x0160, B:37:0x0165, B:39:0x0166), top: B:15:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r0v24, types: [l0.v0] */
    /* JADX WARN: Type inference failed for: r0v31, types: [l0.v0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [l0.v0] */
    /* JADX WARN: Type inference failed for: r1v10, types: [l0.v0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [u5.v] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [u5.v] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [u5.v] */
    /* JADX WARN: Type inference failed for: r1v26, types: [u5.v] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, u5.v] */
    /* JADX WARN: Type inference failed for: r9v0, types: [n.u0, m5.c] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4218d(C2659l c2659l, InterfaceC2644g interfaceC2644g, long j6, InterfaceC3279c interfaceC3279c, AbstractC2583c abstractC2583c) {
        AbstractC2583c abstractC2583c2;
        ?? r9;
        int i7;
        EnumC2465a enumC2465a;
        ?? obj;
        C2659l c2659l2;
        C2659l c2659l3;
        C2693w0 c2693w0;
        C3379v c3379v;
        Object mo3790m;
        InterfaceC3279c interfaceC3279c2;
        C2653j c2653j;
        C2653j c2653j2;
        Object obj2;
        Object mo3790m2;
        InterfaceC2644g interfaceC2644g2 = interfaceC2644g;
        C3714p1 c3714p1 = C3714p1.f17659e;
        if (abstractC2583c instanceof C2687u0) {
            C2687u0 c2687u0 = (C2687u0) abstractC2583c;
            int i8 = c2687u0.f14437m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2687u0.f14437m = i8 - Integer.MIN_VALUE;
                abstractC2583c2 = c2687u0;
                r9 = abstractC2583c2;
                InterfaceC2318h interfaceC2318h = r9.f13999f;
                Object obj3 = r9.f14436l;
                i7 = r9.f14437m;
                enumC2465a = EnumC2465a.f13750e;
                if (i7 == 0) {
                    if (i7 == 1 || i7 == 2) {
                        obj = r9.f14435k;
                        interfaceC3279c2 = r9.f14434j;
                        interfaceC2644g2 = r9.f14433i;
                        c2659l3 = r9.f14432h;
                        try {
                            AbstractC1793a0.m2972L(obj3);
                            obj = obj;
                        } catch (CancellationException e7) {
                            e = e7;
                            c2653j = (C2653j) obj.f16451e;
                            if (c2653j != null) {
                            }
                            c2653j2 = (C2653j) obj.f16451e;
                            if (c2653j2 != null) {
                            }
                            throw e;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj3);
                    Object mo4249c = interfaceC2644g2.mo4249c(0L);
                    AbstractC2674q mo4253g = interfaceC2644g2.mo4253g(0L);
                    obj = new Object();
                    if (j6 == Long.MIN_VALUE) {
                        try {
                            AbstractC3367j.m5097b(interfaceC2318h);
                            c2659l2 = c2659l;
                            try {
                                c2693w0 = new C2693w0(obj, mo4249c, interfaceC2644g2, mo4253g, c2659l2, m4228n(interfaceC2318h), interfaceC3279c);
                                c3379v = obj;
                            } catch (CancellationException e8) {
                                e = e8;
                                c2659l3 = c2659l2;
                                c2653j = (C2653j) obj.f16451e;
                                if (c2653j != null) {
                                    c2653j.f14340i.setValue(Boolean.FALSE);
                                }
                                c2653j2 = (C2653j) obj.f16451e;
                                if (c2653j2 != null && c2653j2.f14338g == c2659l3.f14351h) {
                                    c2659l3.f14353j = false;
                                }
                                throw e;
                            }
                            try {
                                r9.f14432h = c2659l2;
                                r9.f14433i = interfaceC2644g2;
                                r9.f14434j = interfaceC3279c;
                                r9.f14435k = c3379v;
                                r9.f14437m = 1;
                                if (interfaceC2644g2.mo4248b()) {
                                    if (r9.mo662j().mo853h(c3714p1) == null) {
                                        mo3790m = AbstractC2418w.m3976s(r9.mo662j()).mo3790m(c2693w0, r9);
                                    } else {
                                        throw new ClassCastException();
                                    }
                                } else {
                                    C2684t0 c2684t0 = new C2684t0(c2693w0);
                                    AbstractC3367j.m5097b(interfaceC2318h);
                                    mo3790m = AbstractC2418w.m3976s(interfaceC2318h).mo3790m(c2684t0, r9);
                                }
                                if (mo3790m != enumC2465a) {
                                    c2659l3 = c2659l2;
                                    interfaceC3279c2 = interfaceC3279c;
                                }
                                return enumC2465a;
                            } catch (CancellationException e9) {
                                e = e9;
                                c2659l3 = c2659l2;
                                obj = c3379v;
                                c2653j = (C2653j) obj.f16451e;
                                if (c2653j != null) {
                                }
                                c2653j2 = (C2653j) obj.f16451e;
                                if (c2653j2 != null) {
                                }
                                throw e;
                            }
                        } catch (CancellationException e10) {
                            e = e10;
                            c2659l2 = c2659l;
                        }
                    } else {
                        c3379v = obj;
                        try {
                            C2653j c2653j3 = new C2653j(mo4249c, interfaceC2644g2.mo4251e(), mo4253g, j6, interfaceC2644g2.mo4252f(), j6, new C2690v0(1, c2659l));
                            AbstractC3367j.m5097b(interfaceC2318h);
                            m4227m(c2653j3, j6, m4228n(interfaceC2318h), interfaceC2644g2, c2659l, interfaceC3279c);
                            c3379v.f16451e = c2653j3;
                            c2659l3 = c2659l;
                            interfaceC2644g2 = interfaceC2644g;
                            interfaceC3279c2 = interfaceC3279c;
                        } catch (CancellationException e11) {
                            e = e11;
                            c2659l3 = c2659l;
                            obj = c3379v;
                            c2653j = (C2653j) obj.f16451e;
                            if (c2653j != null) {
                            }
                            c2653j2 = (C2653j) obj.f16451e;
                            if (c2653j2 != null) {
                                c2659l3.f14353j = false;
                            }
                            throw e;
                        }
                    }
                    obj = c3379v;
                }
                do {
                    InterfaceC2318h interfaceC2318h2 = r9.f13999f;
                    obj2 = obj.f16451e;
                    AbstractC3367j.m5097b(obj2);
                    if (!((Boolean) ((C2653j) obj2).f14340i.getValue()).booleanValue()) {
                        AbstractC3367j.m5097b(interfaceC2318h2);
                        C3379v c3379v2 = obj;
                        InterfaceC3279c interfaceC3279c3 = interfaceC3279c2;
                        InterfaceC2644g interfaceC2644g3 = interfaceC2644g2;
                        C2659l c2659l4 = c2659l3;
                        try {
                            C2696x0 c2696x0 = new C2696x0(c3379v2, m4228n(interfaceC2318h2), interfaceC2644g3, c2659l4, interfaceC3279c3);
                            obj = c3379v2;
                            interfaceC2644g2 = interfaceC2644g3;
                            c2659l3 = c2659l4;
                            interfaceC3279c2 = interfaceC3279c3;
                            r9.f14432h = c2659l3;
                            r9.f14433i = interfaceC2644g2;
                            r9.f14434j = interfaceC3279c2;
                            r9.f14435k = obj;
                            r9.f14437m = 2;
                            if (interfaceC2644g2.mo4248b()) {
                                if (r9.mo662j().mo853h(c3714p1) == null) {
                                    mo3790m2 = AbstractC2418w.m3976s(r9.mo662j()).mo3790m(c2696x0, r9);
                                } else {
                                    throw new ClassCastException();
                                }
                            } else {
                                C2684t0 c2684t02 = new C2684t0(c2696x0);
                                AbstractC3367j.m5097b(interfaceC2318h2);
                                mo3790m2 = AbstractC2418w.m3976s(interfaceC2318h2).mo3790m(c2684t02, r9);
                            }
                        } catch (CancellationException e12) {
                            e = e12;
                            obj = c3379v2;
                            c2659l3 = c2659l4;
                            c2653j = (C2653j) obj.f16451e;
                            if (c2653j != null) {
                            }
                            c2653j2 = (C2653j) obj.f16451e;
                            if (c2653j2 != null) {
                            }
                            throw e;
                        }
                    } else {
                        return C1694m.f10482a;
                    }
                } while (mo3790m2 != enumC2465a);
                return enumC2465a;
            }
        }
        abstractC2583c2 = new AbstractC2583c(abstractC2583c);
        r9 = abstractC2583c2;
        InterfaceC2318h interfaceC2318h3 = r9.f13999f;
        Object obj32 = r9.f14436l;
        i7 = r9.f14437m;
        enumC2465a = EnumC2465a.f13750e;
        if (i7 == 0) {
        }
        do {
            InterfaceC2318h interfaceC2318h22 = r9.f13999f;
            obj2 = obj.f16451e;
            AbstractC3367j.m5097b(obj2);
            if (!((Boolean) ((C2653j) obj2).f14340i.getValue()).booleanValue()) {
            }
        } while (mo3790m2 != enumC2465a);
        return enumC2465a;
    }

    /* renamed from: e */
    public static /* synthetic */ Object m4219e(float f7, InterfaceC2656k interfaceC2656k, InterfaceC3281e interfaceC3281e, AbstractC2590j abstractC2590j, int i7) {
        if ((i7 & 8) != 0) {
            interfaceC2656k = m4231q(7, null);
        }
        return m4217c(0.0f, f7, 0.0f, interfaceC2656k, interfaceC3281e, abstractC2590j);
    }

    /* renamed from: f */
    public static final Object m4220f(C2659l c2659l, C2692w c2692w, boolean z7, InterfaceC3279c interfaceC3279c, AbstractC2583c abstractC2583c) {
        long j6;
        C2689v c2689v = new C2689v(c2692w, c2659l.f14348e, c2659l.f14349f.getValue(), c2659l.f14350g);
        if (z7) {
            j6 = c2659l.f14351h;
        } else {
            j6 = Long.MIN_VALUE;
        }
        Object m4218d = m4218d(c2659l, c2689v, j6, interfaceC3279c, abstractC2583c);
        if (m4218d == EnumC2465a.f13750e) {
            return m4218d;
        }
        return C1694m.f10482a;
    }

    /* renamed from: g */
    public static final C2642f0 m4221g(C2648h0 c2648h0, float f7, C2639e0 c2639e0, C2395p c2395p) {
        return m4224j(c2648h0, Float.valueOf(0.0f), Float.valueOf(f7), AbstractC2667n1.f14365a, c2639e0, c2395p, 33208, 0);
    }

    /* renamed from: h */
    public static final Object m4222h(C2659l c2659l, Float f7, InterfaceC2656k interfaceC2656k, boolean z7, InterfaceC3279c interfaceC3279c, AbstractC2583c abstractC2583c) {
        long j6;
        C2700z0 c2700z0 = new C2700z0(interfaceC2656k, c2659l.f14348e, c2659l.f14349f.getValue(), f7, c2659l.f14350g);
        if (z7) {
            j6 = c2659l.f14351h;
        } else {
            j6 = Long.MIN_VALUE;
        }
        Object m4218d = m4218d(c2659l, c2700z0, j6, interfaceC3279c, abstractC2583c);
        if (m4218d == EnumC2465a.f13750e) {
            return m4218d;
        }
        return C1694m.f10482a;
    }

    /* renamed from: i */
    public static /* synthetic */ Object m4223i(C2659l c2659l, Float f7, C2675q0 c2675q0, boolean z7, InterfaceC3279c interfaceC3279c, AbstractC2590j abstractC2590j, int i7) {
        if ((i7 & 2) != 0) {
            c2675q0 = m4231q(7, null);
        }
        C2675q0 c2675q02 = c2675q0;
        if ((i7 & 8) != 0) {
            interfaceC3279c = C2698y0.f14476g;
        }
        return m4222h(c2659l, f7, c2675q02, z7, interfaceC3279c, abstractC2590j);
    }

    /* renamed from: j */
    public static final C2642f0 m4224j(C2648h0 c2648h0, Number number, Number number2, C2664m1 c2664m1, C2639e0 c2639e0, C2395p c2395p, int i7, int i8) {
        boolean z7;
        Object m3847O = c2395p.m3847O();
        C2413u0 c2413u0 = C2375k.f13421a;
        if (m3847O == c2413u0) {
            C2642f0 c2642f0 = new C2642f0(c2648h0, number, number2, c2664m1, c2639e0);
            c2395p.m3877j0(c2642f0);
            m3847O = c2642f0;
        }
        C2642f0 c2642f02 = (C2642f0) m3847O;
        if ((((57344 & i7) ^ 24576) > 16384 && c2395p.m3874i(c2639e0)) || (i7 & 24576) == 16384) {
            z7 = true;
        } else {
            z7 = false;
        }
        Object m3847O2 = c2395p.m3847O();
        if (z7 || m3847O2 == c2413u0) {
            C0042k0 c0042k0 = new C0042k0(number, c2642f02, number2, c2639e0, 1);
            c2395p.m3877j0(c0042k0);
            m3847O2 = c0042k0;
        }
        AbstractC2418w.m3967i((InterfaceC3277a) m3847O2, c2395p);
        boolean m3874i = c2395p.m3874i(c2648h0);
        Object m3847O3 = c2395p.m3847O();
        if (m3874i || m3847O3 == c2413u0) {
            m3847O3 = new C0078t0(28, c2648h0, c2642f02);
            c2395p.m3877j0(m3847O3);
        }
        AbstractC2418w.m3962d(c2642f02, (InterfaceC3279c) m3847O3, c2395p);
        return c2642f02;
    }

    /* renamed from: k */
    public static final AbstractC2674q m4225k(AbstractC2674q abstractC2674q) {
        AbstractC2674q mo4268c = abstractC2674q.mo4268c();
        int mo4267b = mo4268c.mo4267b();
        for (int i7 = 0; i7 < mo4267b; i7++) {
            mo4268c.mo4270e(abstractC2674q.mo4266a(i7), i7);
        }
        return mo4268c;
    }

    /* renamed from: l */
    public static C2659l m4226l(C2659l c2659l, float f7, float f8, int i7) {
        if ((i7 & 1) != 0) {
            f7 = ((Number) c2659l.f14349f.getValue()).floatValue();
        }
        if ((i7 & 2) != 0) {
            f8 = ((C2662m) c2659l.f14350g).f14358a;
        }
        return new C2659l(c2659l.f14348e, Float.valueOf(f7), new C2662m(f8), c2659l.f14351h, c2659l.f14352i, c2659l.f14353j);
    }

    /* renamed from: m */
    public static final void m4227m(C2653j c2653j, long j6, float f7, InterfaceC2644g interfaceC2644g, C2659l c2659l, InterfaceC3279c interfaceC3279c) {
        long j7;
        if (f7 == 0.0f) {
            j7 = interfaceC2644g.mo4250d();
        } else {
            j7 = ((float) (j6 - c2653j.f14334c)) / f7;
        }
        c2653j.f14338g = j6;
        c2653j.f14336e.setValue(interfaceC2644g.mo4249c(j7));
        c2653j.f14337f = interfaceC2644g.mo4253g(j7);
        if (interfaceC2644g.m4254h(j7)) {
            c2653j.f14339h = c2653j.f14338g;
            c2653j.f14340i.setValue(Boolean.FALSE);
        }
        m4233s(c2653j, c2659l);
        interfaceC3279c.mo23f(c2653j);
    }

    /* renamed from: n */
    public static final float m4228n(InterfaceC2318h interfaceC2318h) {
        float f7;
        InterfaceC3811s interfaceC3811s = (InterfaceC3811s) interfaceC2318h.mo853h(C3795c.f17979t);
        if (interfaceC3811s != null) {
            f7 = interfaceC3811s.mo851A();
        } else {
            f7 = 1.0f;
        }
        if (f7 >= 0.0f) {
            return f7;
        }
        AbstractC2666n0.m4273b("negative scale factor");
        return f7;
    }

    /* renamed from: o */
    public static C2639e0 m4229o(InterfaceC2695x interfaceC2695x) {
        return new C2639e0(interfaceC2695x, 0);
    }

    /* renamed from: p */
    public static final C2648h0 m4230p(C2395p c2395p) {
        Object m3847O = c2395p.m3847O();
        if (m3847O == C2375k.f13421a) {
            m3847O = new C2648h0();
            c2395p.m3877j0(m3847O);
        }
        C2648h0 c2648h0 = (C2648h0) m3847O;
        c2648h0.m4259a(0, c2395p);
        return c2648h0;
    }

    /* renamed from: q */
    public static C2675q0 m4231q(int i7, Object obj) {
        float f7;
        if ((i7 & 2) != 0) {
            f7 = 1500.0f;
        } else {
            f7 = 400.0f;
        }
        if ((i7 & 4) != 0) {
            obj = null;
        }
        return new C2675q0(1.0f, f7, obj);
    }

    /* renamed from: r */
    public static C2661l1 m4232r(int i7, int i8, InterfaceC2697y interfaceC2697y) {
        int i9;
        if ((i8 & 2) != 0) {
            i9 = 0;
        } else {
            i9 = 74;
        }
        if ((i8 & 4) != 0) {
            interfaceC2697y = AbstractC2699z.f14497a;
        }
        return new C2661l1(i7, i9, interfaceC2697y);
    }

    /* renamed from: s */
    public static final void m4233s(C2653j c2653j, C2659l c2659l) {
        c2659l.f14349f.setValue(c2653j.f14336e.getValue());
        AbstractC2674q abstractC2674q = c2659l.f14350g;
        AbstractC2674q abstractC2674q2 = c2653j.f14337f;
        int mo4267b = abstractC2674q.mo4267b();
        for (int i7 = 0; i7 < mo4267b; i7++) {
            abstractC2674q.mo4270e(abstractC2674q2.mo4266a(i7), i7);
        }
        c2659l.f14352i = c2653j.f14339h;
        c2659l.f14351h = c2653j.f14338g;
        c2659l.f14353j = ((Boolean) c2653j.f14340i.getValue()).booleanValue();
    }
}
