package p117p1;

import p032d6.AbstractC0525d0;
import p032d6.C0548l;
import p032d6.C0565q1;
import p034e0.C0598c0;
import p060h5.AbstractC1793a0;
import p065i2.AbstractC2064e;
import p082k5.C2319i;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p090l5.EnumC2465a;
import p098m5.AbstractC2581a;
import p122q.C2935p1;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3281e;
import p162v1.AbstractC3498f;
import p170w1.InterfaceC3679g2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.g0 */
/* loaded from: classes.dex */
public final class C2855g0 implements InterfaceC3093c, InterfaceC2313c {

    /* renamed from: e */
    public final /* synthetic */ C2857h0 f14964e;

    /* renamed from: f */
    public final C0548l f14965f;

    /* renamed from: g */
    public C0548l f14966g;

    /* renamed from: h */
    public EnumC2860k f14967h = EnumC2860k.f14996f;

    /* renamed from: i */
    public final C2319i f14968i = C2319i.f13273e;

    /* renamed from: j */
    public final /* synthetic */ C2857h0 f14969j;

    public C2855g0(C2857h0 c2857h0, C0548l c0548l) {
        this.f14969j = c2857h0;
        this.f14964e = c2857h0;
        this.f14965f = c0548l;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: H */
    public final int mo4511H(long j6) {
        return this.f14964e.mo4511H(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: L */
    public final float mo4512L(long j6) {
        return this.f14964e.mo4512L(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: Q */
    public final int mo4513Q(float f7) {
        return this.f14964e.mo4513Q(f7);
    }

    /* renamed from: a */
    public final Object m4514a(EnumC2860k enumC2860k, AbstractC2581a abstractC2581a) {
        C0548l c0548l = new C0548l(1, AbstractC2064e.m3250x(abstractC2581a));
        c0548l.m1222u();
        this.f14967h = enumC2860k;
        this.f14966g = c0548l;
        return c0548l.m1221t();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: a0 */
    public final long mo4515a0(long j6) {
        return this.f14964e.mo4515a0(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f14964e.mo559b();
    }

    /* renamed from: d */
    public final long m4516d() {
        C2857h0 c2857h0 = this.f14969j;
        c2857h0.getClass();
        long mo4515a0 = c2857h0.mo4515a0(AbstractC3498f.m5382v(c2857h0).f16867D.mo5295g());
        long j6 = c2857h0.f14980C;
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (mo4515a0 >> 32)) - ((int) (j6 >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (mo4515a0 & 4294967295L)) - ((int) (j6 & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    /* renamed from: f */
    public final InterfaceC3679g2 m4517f() {
        C2857h0 c2857h0 = this.f14969j;
        c2857h0.getClass();
        return AbstractC3498f.m5382v(c2857h0).f16867D;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: f0 */
    public final float mo4518f0(long j6) {
        return this.f14964e.mo4518f0(j6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [d6.b1] */
    /* JADX WARN: Type inference failed for: r6v4, types: [d6.b1] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [t5.e] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4519g(long j6, InterfaceC3281e interfaceC3281e, AbstractC2581a abstractC2581a) {
        C2851e0 c2851e0;
        int i7;
        C0548l c0548l;
        try {
            if (abstractC2581a instanceof C2851e0) {
                c2851e0 = (C2851e0) abstractC2581a;
                int i8 = c2851e0.f14954k;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c2851e0.f14954k = i8 - Integer.MIN_VALUE;
                    Object obj = c2851e0.f14952i;
                    i7 = c2851e0.f14954k;
                    if (i7 == 0) {
                        if (i7 == 1) {
                            C0565q1 c0565q1 = c2851e0.f14951h;
                            AbstractC1793a0.m2972L(obj);
                            j6 = c0565q1;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        if (j6 <= 0 && (c0548l = this.f14966g) != null) {
                            c0548l.mo663n(AbstractC1793a0.m2985m(new C2861l(j6)));
                        }
                        C0565q1 m1141s = AbstractC0525d0.m1141s(this.f14969j.m5830y0(), null, new C0598c0(j6, this, null), 3);
                        c2851e0.f14951h = m1141s;
                        c2851e0.f14954k = 1;
                        obj = interfaceC3281e.mo22d(this, c2851e0);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        j6 = m1141s;
                        if (obj == enumC2465a) {
                            return enumC2465a;
                        }
                    }
                    return obj;
                }
            }
            if (i7 == 0) {
            }
            return obj;
        } finally {
            j6.mo1114c(C2844b.f14936f);
        }
        c2851e0 = new C2851e0(this, abstractC2581a);
        Object obj2 = c2851e0.f14952i;
        i7 = c2851e0.f14954k;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4520h(long j6, C2935p1 c2935p1, AbstractC2581a abstractC2581a) {
        C2853f0 c2853f0;
        int i7;
        try {
            if (abstractC2581a instanceof C2853f0) {
                c2853f0 = (C2853f0) abstractC2581a;
                int i8 = c2853f0.f14957j;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c2853f0.f14957j = i8 - Integer.MIN_VALUE;
                    Object obj = c2853f0.f14955h;
                    i7 = c2853f0.f14957j;
                    if (i7 == 0) {
                        if (i7 == 1) {
                            AbstractC1793a0.m2972L(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                    c2853f0.f14957j = 1;
                    Object m4519g = m4519g(j6, c2935p1, c2853f0);
                    Object obj2 = EnumC2465a.f13750e;
                    if (m4519g == obj2) {
                        return obj2;
                    }
                    return m4519g;
                }
            }
            if (i7 == 0) {
            }
        } catch (C2861l unused) {
            return null;
        }
        c2853f0 = new C2853f0(this, abstractC2581a);
        Object obj3 = c2853f0.f14955h;
        i7 = c2853f0.f14957j;
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: j */
    public final InterfaceC2318h mo662j() {
        return this.f14968i;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f14964e.mo560l();
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: n */
    public final void mo663n(Object obj) {
        C2857h0 c2857h0 = this.f14969j;
        synchronized (c2857h0.f14988z) {
            c2857h0.f14987y.m4308j(this);
        }
        this.f14965f.mo663n(obj);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: n0 */
    public final long mo4521n0(float f7) {
        return this.f14964e.mo4521n0(f7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: t0 */
    public final float mo4522t0(int i7) {
        return this.f14964e.mo4522t0(i7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: v */
    public final long mo4523v(float f7) {
        return this.f14964e.mo4523v(f7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: v0 */
    public final float mo4524v0(float f7) {
        return f7 / this.f14964e.mo559b();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: w */
    public final long mo4525w(long j6) {
        return this.f14964e.mo4525w(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: y */
    public final float mo4526y(float f7) {
        return this.f14964e.mo559b() * f7;
    }
}
