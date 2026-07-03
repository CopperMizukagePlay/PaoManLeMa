package p168w;

import p001a0.C0074s0;
import p027d1.C0464b;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p073j2.AbstractC2168e;
import p085l0.AbstractC2418w;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p085l0.C2361g1;
import p085l0.C2413u0;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p098m5.AbstractC2583c;
import p098m5.AbstractC2590j;
import p100n.C2673p1;
import p100n.C2675q0;
import p107o.EnumC2788y0;
import p122q.C2891b;
import p122q.C2927n;
import p122q.EnumC2931o0;
import p122q.InterfaceC2914i1;
import p128q6.C3002e;
import p137s.C3081j;
import p140s2.AbstractC3092b;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p152u.C3328p;
import p160v.AbstractC3405d0;
import p160v.C3404d;
import p160v.C3419k0;
import p160v.C3423m0;
import p160v.C3425n0;
import p160v.C3431q0;
import p160v.InterfaceC3429p0;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3470q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.y */
/* loaded from: classes.dex */
public abstract class AbstractC3642y implements InterfaceC2914i1 {

    /* renamed from: A */
    public final InterfaceC2425y0 f17388A;

    /* renamed from: B */
    public final InterfaceC2425y0 f17389B;

    /* renamed from: C */
    public final C2361g1 f17390C;

    /* renamed from: D */
    public final C2361g1 f17391D;

    /* renamed from: E */
    public final C2361g1 f17392E;

    /* renamed from: F */
    public final C2361g1 f17393F;

    /* renamed from: a */
    public final C2361g1 f17394a;

    /* renamed from: b */
    public final C2673p1 f17395b;

    /* renamed from: c */
    public final C3002e f17396c;

    /* renamed from: d */
    public int f17397d;

    /* renamed from: e */
    public int f17398e;

    /* renamed from: f */
    public long f17399f;

    /* renamed from: g */
    public long f17400g;

    /* renamed from: h */
    public float f17401h;

    /* renamed from: i */
    public float f17402i;

    /* renamed from: j */
    public final C2927n f17403j;

    /* renamed from: k */
    public final boolean f17404k;

    /* renamed from: l */
    public int f17405l;

    /* renamed from: m */
    public InterfaceC3429p0 f17406m;

    /* renamed from: n */
    public boolean f17407n;

    /* renamed from: o */
    public final C2361g1 f17408o;

    /* renamed from: p */
    public InterfaceC3093c f17409p;

    /* renamed from: q */
    public final C3081j f17410q;

    /* renamed from: r */
    public final C2349d1 f17411r;

    /* renamed from: s */
    public final C2349d1 f17412s;

    /* renamed from: t */
    public final C3431q0 f17413t;

    /* renamed from: u */
    public final C2891b f17414u;

    /* renamed from: v */
    public final C3404d f17415v;

    /* renamed from: w */
    public final C2361g1 f17416w;

    /* renamed from: x */
    public final C3328p f17417x;

    /* renamed from: y */
    public long f17418y;

    /* renamed from: z */
    public final C3425n0 f17419z;

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, v.d] */
    public AbstractC3642y(float f7, int i7) {
        double d7 = f7;
        if (-0.5d <= d7 && d7 <= 0.5d) {
            this.f17394a = AbstractC2418w.m3980x(new C0464b(0L));
            this.f17395b = new C2673p1(12, this);
            this.f17396c = new C3002e(i7, f7, this);
            this.f17397d = i7;
            this.f17399f = Long.MAX_VALUE;
            this.f17403j = new C2927n(new C3423m0(4, this));
            this.f17404k = true;
            this.f17405l = -1;
            this.f17408o = new C2361g1(AbstractC3618c0.f17275b, C2413u0.f13572g);
            this.f17409p = AbstractC3618c0.f17276c;
            this.f17410q = new C3081j();
            this.f17411r = new C2349d1(-1);
            this.f17412s = new C2349d1(i7);
            C2413u0 c2413u0 = C2413u0.f13575j;
            AbstractC2418w.m3973p(c2413u0, new C3623f(this, 2));
            AbstractC2418w.m3973p(c2413u0, new C3623f(this, 3));
            this.f17413t = new C3431q0(null);
            this.f17414u = new C2891b(1);
            this.f17415v = new Object();
            this.f17416w = AbstractC2418w.m3980x(null);
            this.f17417x = new C3328p(this, 1);
            this.f17418y = AbstractC3092b.m4765b(0, 0, 15);
            this.f17419z = new C3425n0();
            this.f17388A = AbstractC3405d0.m5172g();
            this.f17389B = AbstractC3405d0.m5172g();
            Boolean bool = Boolean.FALSE;
            this.f17390C = AbstractC2418w.m3980x(bool);
            this.f17391D = AbstractC2418w.m3980x(bool);
            this.f17392E = AbstractC2418w.m3980x(bool);
            this.f17393F = AbstractC2418w.m3980x(bool);
            return;
        }
        throw new IllegalArgumentException(AbstractC2487d.m4042f("currentPageOffsetFraction ", f7, " is not within the range -0.5 to 0.5").toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r9.mo112a(r7, r8, r0) != r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m5604q(AbstractC3642y abstractC3642y, EnumC2788y0 enumC2788y0, InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        C3641x c3641x;
        int i7;
        if (abstractC2583c instanceof C3641x) {
            c3641x = (C3641x) abstractC2583c;
            int i8 = c3641x.f17387m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3641x.f17387m = i8 - Integer.MIN_VALUE;
                Object obj = c3641x.f17385k;
                i7 = c3641x.f17387m;
                Object obj2 = C1694m.f10482a;
                Object obj3 = EnumC2465a.f13750e;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            abstractC3642y = c3641x.f17382h;
                            AbstractC1793a0.m2972L(obj);
                            abstractC3642y.f17411r.m3742h(-1);
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3281e = (InterfaceC3281e) c3641x.f17384j;
                    enumC2788y0 = c3641x.f17383i;
                    abstractC3642y = c3641x.f17382h;
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c3641x.f17382h = abstractC3642y;
                    c3641x.f17383i = enumC2788y0;
                    c3641x.f17384j = (AbstractC2590j) interfaceC3281e;
                    c3641x.f17387m = 1;
                    Object m5165h = abstractC3642y.f17415v.m5165h(c3641x);
                    if (m5165h != obj3) {
                        m5165h = obj2;
                    }
                }
                if (!abstractC3642y.f17403j.mo114c()) {
                    abstractC3642y.f17412s.m3742h(abstractC3642y.m5608i());
                }
                C2927n c2927n = abstractC3642y.f17403j;
                c3641x.f17382h = abstractC3642y;
                c3641x.f17383i = null;
                c3641x.f17384j = null;
                c3641x.f17387m = 2;
            }
        }
        c3641x = new C3641x(abstractC3642y, abstractC2583c);
        Object obj4 = c3641x.f17385k;
        i7 = c3641x.f17387m;
        Object obj22 = C1694m.f10482a;
        Object obj32 = EnumC2465a.f13750e;
        if (i7 == 0) {
        }
        if (!abstractC3642y.f17403j.mo114c()) {
        }
        C2927n c2927n2 = abstractC3642y.f17403j;
        c3641x.f17382h = abstractC3642y;
        c3641x.f17383i = null;
        c3641x.f17384j = null;
        c3641x.f17387m = 2;
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: a */
    public final Object mo112a(EnumC2788y0 enumC2788y0, InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        return m5604q(this, enumC2788y0, interfaceC3281e, abstractC2583c);
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: b */
    public final boolean mo113b() {
        return ((Boolean) this.f17391D.getValue()).booleanValue();
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: c */
    public final boolean mo114c() {
        return this.f17403j.mo114c();
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: d */
    public final boolean mo115d() {
        return ((Boolean) this.f17390C.getValue()).booleanValue();
    }

    @Override // p122q.InterfaceC2914i1
    /* renamed from: e */
    public final float mo116e(float f7) {
        return this.f17403j.mo116e(f7);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5605f(int i7, C2675q0 c2675q0, AbstractC2583c abstractC2583c) {
        C3640w c3640w;
        int i8;
        AbstractC3642y abstractC3642y;
        C2675q0 c2675q02;
        double d7;
        int i9 = i7;
        if (abstractC2583c instanceof C3640w) {
            c3640w = (C3640w) abstractC2583c;
            int i10 = c3640w.f17381m;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3640w.f17381m = i10 - Integer.MIN_VALUE;
                Object obj = c3640w.f17379k;
                i8 = c3640w.f17381m;
                C1694m c1694m = C1694m.f10482a;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i8 == 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            return c1694m;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i9 = c3640w.f17378j;
                    C2675q0 c2675q03 = c3640w.f17377i;
                    abstractC3642y = c3640w.f17376h;
                    AbstractC1793a0.m2972L(obj);
                    c2675q02 = c2675q03;
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if ((i9 != m5608i() || ((C2345c1) this.f17396c.f15486d).m3729g() != 0.0f) && mo5600k() != 0) {
                        c3640w.f17376h = this;
                        c3640w.f17377i = c2675q0;
                        c3640w.f17378j = i9;
                        c3640w.f17381m = 1;
                        Object m5165h = this.f17415v.m5165h(c3640w);
                        if (m5165h != enumC2465a) {
                            m5165h = c1694m;
                        }
                        if (m5165h != enumC2465a) {
                            abstractC3642y = this;
                            c2675q02 = c2675q0;
                        }
                        return enumC2465a;
                    }
                    return c1694m;
                }
                d7 = 0.0f;
                if (-0.5d > d7 && d7 <= 0.5d) {
                    C2673p1 c2673p1 = abstractC3642y.f17395b;
                    C0074s0 c0074s0 = new C0074s0(12, abstractC3642y);
                    c3640w.f17376h = null;
                    c3640w.f17377i = null;
                    c3640w.f17381m = 2;
                    float f7 = AbstractC3618c0.f17274a;
                    Object mo112a = ((AbstractC3642y) c2673p1.f14390f).mo112a(EnumC2788y0.f14796e, new C3616b0(c0074s0, abstractC3642y.m5607h(i9), c2673p1, 0.0f * abstractC3642y.m5611m(), c2675q02, null), c3640w);
                    if (mo112a != enumC2465a) {
                        mo112a = c1694m;
                    }
                    if (mo112a != enumC2465a) {
                        mo112a = c1694m;
                    }
                    if (mo112a == enumC2465a) {
                        return enumC2465a;
                    }
                    return c1694m;
                }
                throw new IllegalArgumentException(AbstractC2487d.m4042f("pageOffsetFraction ", 0.0f, " is not within the range -0.5 to 0.5").toString());
            }
        }
        c3640w = new C3640w(this, abstractC2583c);
        Object obj2 = c3640w.f17379k;
        i8 = c3640w.f17381m;
        C1694m c1694m2 = C1694m.f10482a;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        if (i8 == 0) {
        }
        d7 = 0.0f;
        if (-0.5d > d7) {
        }
        throw new IllegalArgumentException(AbstractC2487d.m4042f("pageOffsetFraction ", 0.0f, " is not within the range -0.5 to 0.5").toString());
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* renamed from: g */
    public final void m5606g(C3637t c3637t, boolean z7) {
        Object obj;
        int i7;
        int i8;
        int i9;
        long m5603f;
        C3625h c3625h = c3637t.f17366j;
        C3002e c3002e = this.f17396c;
        boolean z8 = true;
        InterfaceC3279c interfaceC3279c = null;
        if (z7) {
            ((C2345c1) c3002e.f15486d).m3730h(c3637t.f17367k);
        } else {
            c3002e.getClass();
            int i10 = c3637t.f17364h;
            ?? r52 = c3637t.f17357a;
            if (c3625h != null) {
                obj = c3625h.f17305d;
            } else {
                obj = null;
            }
            c3002e.f15487e = obj;
            if (c3002e.f15483a || !r52.isEmpty()) {
                c3002e.f15483a = true;
                if (c3625h != null) {
                    i7 = c3625h.f17302a;
                } else {
                    i7 = 0;
                }
                float f7 = c3637t.f17367k;
                ((C2349d1) c3002e.f15485c).m3742h(i7);
                ((C3419k0) c3002e.f15488f).m5180a(i7);
                ((C2345c1) c3002e.f15486d).m3730h(f7);
            }
            if (this.f17405l != -1 && !r52.isEmpty()) {
                if (this.f17407n) {
                    i8 = ((C3625h) AbstractC1805m.m3052p0(r52)).f17302a + i10 + 1;
                } else {
                    i8 = (((C3625h) AbstractC1805m.m3045i0(r52)).f17302a - i10) - 1;
                }
                if (this.f17405l != i8) {
                    this.f17405l = -1;
                    InterfaceC3429p0 interfaceC3429p0 = this.f17406m;
                    if (interfaceC3429p0 != null) {
                        interfaceC3429p0.cancel();
                    }
                    this.f17406m = null;
                }
            }
        }
        this.f17408o.setValue(c3637t);
        boolean z9 = c3637t.f17369m;
        C3625h c3625h2 = c3637t.f17365i;
        this.f17390C.setValue(Boolean.valueOf(z9));
        if (c3625h2 != null) {
            i9 = c3625h2.f17302a;
        } else {
            i9 = 0;
        }
        if (i9 == 0 && c3637t.f17368l == 0) {
            z8 = false;
        }
        this.f17391D.setValue(Boolean.valueOf(z8));
        if (c3625h2 != null) {
            this.f17397d = c3625h2.f17302a;
        }
        this.f17398e = c3637t.f17368l;
        AbstractC3459f m5263d = AbstractC3470q.m5263d();
        if (m5263d != null) {
            interfaceC3279c = m5263d.mo5207e();
        }
        AbstractC3459f m5266g = AbstractC3470q.m5266g(m5263d);
        try {
            if (Math.abs(this.f17402i) > 0.5f && this.f17404k && m5613o(this.f17402i)) {
                m5614p(this.f17402i, c3637t);
            }
            AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
            this.f17399f = AbstractC3618c0.m5598a(c3637t, mo5600k());
            mo5600k();
            if (c3637t.f17361e == EnumC2931o0.f15241f) {
                m5603f = c3637t.m5603f() >> 32;
            } else {
                m5603f = c3637t.m5603f() & 4294967295L;
            }
            int i11 = (int) m5603f;
            c3637t.f17370n.getClass();
            this.f17400g = AbstractC2168e.m3530q(0, 0, i11);
        } catch (Throwable th) {
            AbstractC3470q.m5269j(m5263d, m5266g, interfaceC3279c);
            throw th;
        }
    }

    /* renamed from: h */
    public final int m5607h(int i7) {
        if (mo5600k() <= 0) {
            return 0;
        }
        return AbstractC2168e.m3530q(i7, 0, mo5600k() - 1);
    }

    /* renamed from: i */
    public final int m5608i() {
        return ((C2349d1) this.f17396c.f15485c).m3741g();
    }

    /* renamed from: j */
    public final C3637t m5609j() {
        return (C3637t) this.f17408o.getValue();
    }

    /* renamed from: k */
    public abstract int mo5600k();

    /* renamed from: l */
    public final int m5610l() {
        return ((C3637t) this.f17408o.getValue()).f17358b;
    }

    /* renamed from: m */
    public final int m5611m() {
        return ((C3637t) this.f17408o.getValue()).f17359c + m5610l();
    }

    /* renamed from: n */
    public final long m5612n() {
        return ((C0464b) this.f17394a.getValue()).f1623a;
    }

    /* renamed from: o */
    public final boolean m5613o(float f7) {
        if (m5609j().f17361e == EnumC2931o0.f15240e) {
            if (Math.signum(f7) == Math.signum(-C0464b.m1009e(m5612n()))) {
                return true;
            }
        } else if (Math.signum(f7) == Math.signum(-C0464b.m1008d(m5612n()))) {
            return true;
        }
        if (((int) C0464b.m1008d(m5612n())) == 0 && ((int) C0464b.m1009e(m5612n())) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* renamed from: p */
    public final void m5614p(float f7, C3637t c3637t) {
        boolean z7;
        int i7;
        InterfaceC3429p0 interfaceC3429p0;
        InterfaceC3429p0 interfaceC3429p02;
        InterfaceC3429p0 interfaceC3429p03;
        int i8 = c3637t.f17364h;
        ?? r12 = c3637t.f17357a;
        if (this.f17404k && !r12.isEmpty()) {
            if (f7 > 0.0f) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                i7 = ((C3625h) AbstractC1805m.m3052p0(r12)).f17302a + i8 + 1;
            } else {
                i7 = (((C3625h) AbstractC1805m.m3045i0(r12)).f17302a - i8) - 1;
            }
            if (i7 >= 0 && i7 < mo5600k()) {
                if (i7 != this.f17405l) {
                    if (this.f17407n != z7 && (interfaceC3429p03 = this.f17406m) != null) {
                        interfaceC3429p03.cancel();
                    }
                    this.f17407n = z7;
                    this.f17405l = i7;
                    this.f17406m = this.f17413t.m5184a(i7, this.f17418y);
                }
                if (z7) {
                    if ((((C3625h) AbstractC1805m.m3052p0(r12)).f17313l + (c3637t.f17358b + c3637t.f17359c)) - c3637t.f17363g < f7 && (interfaceC3429p02 = this.f17406m) != null) {
                        interfaceC3429p02.mo5160a();
                        return;
                    }
                    return;
                }
                if (c3637t.f17362f - ((C3625h) AbstractC1805m.m3045i0(r12)).f17313l < (-f7) && (interfaceC3429p0 = this.f17406m) != null) {
                    interfaceC3429p0.mo5160a();
                }
            }
        }
    }
}
