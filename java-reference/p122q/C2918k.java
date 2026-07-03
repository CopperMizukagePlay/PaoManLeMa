package p122q;

import java.util.concurrent.CancellationException;
import p001a0.C0028g2;
import p001a0.C0037j;
import p001a0.C0068q2;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p065i2.AbstractC2064e;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p085l0.C2361g1;
import p090l5.EnumC2465a;
import p096m3.C2572v;
import p098m5.AbstractC2590j;
import p100n.AbstractC2638e;
import p100n.AbstractC2667n1;
import p100n.C2659l;
import p100n.C2662m;
import p100n.C2664m1;
import p100n.C2675q0;
import p100n.C2692w;
import p129r.AbstractC3021j;
import p129r.C3014c;
import p129r.C3017f;
import p129r.C3022k;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.C3376s;
import p168w.AbstractC3642y;
import p168w.C3625h;
import p168w.C3637t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.k */
/* loaded from: classes.dex */
public final class C2918k extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f15197i = 0;

    /* renamed from: j */
    public C3376s f15198j;

    /* renamed from: k */
    public int f15199k;

    /* renamed from: l */
    public final /* synthetic */ float f15200l;

    /* renamed from: m */
    public Object f15201m;

    /* renamed from: n */
    public final /* synthetic */ Object f15202n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2958x0 f15203o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2918k(float f7, C2921l c2921l, C2920k1 c2920k1, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f15200l = f7;
        this.f15202n = c2921l;
        this.f15203o = c2920k1;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f15197i) {
            case 0:
                return ((C2918k) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C2918k) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f15197i) {
            case 0:
                return new C2918k(this.f15200l, (C2921l) this.f15202n, (C2920k1) this.f15203o, interfaceC2313c);
            default:
                return new C2918k((C3017f) this.f15201m, this.f15200l, (InterfaceC3279c) this.f15202n, this.f15203o, interfaceC2313c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x010d, code lost:
    
        if (r1 == r7) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0237  */
    /* JADX WARN: Type inference failed for: r0v4, types: [u5.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [u5.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [u5.s] */
    /* JADX WARN: Type inference failed for: r6v7, types: [u5.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List, java.lang.Object] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C3376s obj2;
        C2659l c2659l;
        C3376s c3376s;
        int i7;
        float f7;
        EnumC2465a enumC2465a;
        long j6;
        float signum;
        Object m4710b;
        C3376s c3376s2;
        boolean z7;
        float f8;
        float f9;
        float floatValue;
        int i8 = this.f15197i;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        float f10 = this.f15200l;
        Object obj3 = this.f15202n;
        switch (i8) {
            case 0:
                int i9 = this.f15199k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        c2659l = (C2659l) this.f15201m;
                        obj2 = this.f15198j;
                        try {
                            AbstractC1793a0.m2972L(obj);
                            c3376s = obj2;
                        } catch (CancellationException unused) {
                            obj2.f16448e = ((Number) c2659l.m4265a()).floatValue();
                            c3376s = obj2;
                            f10 = c3376s.f16448e;
                            return new Float(f10);
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (Math.abs(f10) > 1.0f) {
                        obj2 = new Object();
                        obj2.f16448e = f10;
                        ?? obj4 = new Object();
                        C2659l m4216b = AbstractC2638e.m4216b(0.0f, f10, 28);
                        try {
                            C2921l c2921l = (C2921l) obj3;
                            C2692w c2692w = c2921l.f15212a;
                            C0037j c0037j = new C0037j((C3376s) obj4, (C2920k1) this.f15203o, (C3376s) obj2, c2921l);
                            this.f15198j = obj2;
                            this.f15201m = m4216b;
                            this.f15199k = 1;
                            c3376s = obj2;
                            if (AbstractC2638e.m4220f(m4216b, c2692w, false, c0037j, this) == enumC2465a2) {
                                return enumC2465a2;
                            }
                        } catch (CancellationException unused2) {
                            c2659l = m4216b;
                            obj2.f16448e = ((Number) c2659l.m4265a()).floatValue();
                            c3376s = obj2;
                            f10 = c3376s.f16448e;
                            return new Float(f10);
                        }
                    }
                    return new Float(f10);
                }
                f10 = c3376s.f16448e;
                return new Float(f10);
            default:
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) obj3;
                C3017f c3017f = (C3017f) this.f15201m;
                C0068q2 c0068q2 = c3017f.f15556a;
                int i10 = this.f15199k;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C3376s c3376s3 = this.f15198j;
                    AbstractC1793a0.m2972L(obj);
                    f7 = 0.0f;
                    c3376s2 = c3376s3;
                    m4710b = obj;
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2692w c2692w2 = c3017f.f15557b;
                    C2664m1 c2664m1 = AbstractC2667n1.f14365a;
                    float f11 = ((C2662m) new C2572v(c2692w2.f14462a).m4100h(new C2662m(0.0f), new C2662m(f10))).f14358a;
                    AbstractC3642y abstractC3642y = (AbstractC3642y) c0068q2.f344f;
                    int m5610l = abstractC3642y.m5610l();
                    C2361g1 c2361g1 = abstractC3642y.f17408o;
                    int i11 = ((C3637t) c2361g1.getValue()).f17359c + m5610l;
                    if (i11 == 0) {
                        signum = 0.0f;
                        f7 = 0.0f;
                        enumC2465a = enumC2465a2;
                    } else {
                        if (f10 < 0.0f) {
                            i7 = abstractC3642y.f17397d + 1;
                        } else {
                            i7 = abstractC3642y.f17397d;
                        }
                        int m3530q = AbstractC2168e.m3530q(((int) (f11 / i11)) + i7, 0, abstractC3642y.mo5600k());
                        abstractC3642y.m5610l();
                        int i12 = ((C3637t) c2361g1.getValue()).f17359c;
                        long j7 = i7;
                        f7 = 0.0f;
                        enumC2465a = enumC2465a2;
                        long j8 = 1;
                        long j9 = j7 - j8;
                        if (j9 < 0) {
                            j6 = 0;
                        } else {
                            j6 = j9;
                        }
                        int i13 = (int) j6;
                        long j10 = j7 + j8;
                        if (j10 > 2147483647L) {
                            j10 = 2147483647L;
                        }
                        int abs = Math.abs((AbstractC2168e.m3530q(AbstractC2168e.m3530q(m3530q, i13, (int) j10), 0, abstractC3642y.mo5600k()) - i7) * i11) - i11;
                        if (abs < 0) {
                            abs = 0;
                        }
                        if (abs == 0) {
                            signum = abs;
                        } else {
                            signum = Math.signum(f10) * abs;
                        }
                    }
                    if (!Float.isNaN(signum)) {
                        ?? obj5 = new Object();
                        float signum2 = Math.signum(f10) * Math.abs(signum);
                        obj5.f16448e = signum2;
                        interfaceC3279c.mo23f(new Float(signum2));
                        float f12 = obj5.f16448e;
                        C3014c c3014c = new C3014c(obj5, interfaceC3279c, 1);
                        this.f15198j = obj5;
                        this.f15199k = 1;
                        m4710b = C3017f.m4710b(c3017f, this.f15203o, f12, this.f15200l, c3014c, this);
                        enumC2465a2 = enumC2465a;
                        c3376s2 = obj5;
                        break;
                    } else {
                        throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                }
                C2659l c2659l2 = (C2659l) m4710b;
                float floatValue2 = ((Number) c2659l2.m4265a()).floatValue();
                AbstractC3642y abstractC3642y2 = (AbstractC3642y) c0068q2.f344f;
                C3022k c3022k = abstractC3642y2.m5609j().f17370n;
                ?? r8 = abstractC3642y2.m5609j().f17357a;
                int size = r8.size();
                int i14 = 0;
                float f13 = Float.NEGATIVE_INFINITY;
                float f14 = Float.POSITIVE_INFINITY;
                while (i14 < size) {
                    C3625h c3625h = (C3625h) r8.get(i14);
                    C3637t m5609j = abstractC3642y2.m5609j();
                    EnumC2931o0 enumC2931o0 = m5609j.f17361e;
                    float f15 = floatValue2;
                    EnumC2931o0 enumC2931o02 = EnumC2931o0.f15240e;
                    m5609j.m5603f();
                    int i15 = abstractC3642y2.m5609j().f17362f;
                    int i16 = abstractC3642y2.m5609j().f17360d;
                    int i17 = abstractC3642y2.m5609j().f17358b;
                    int i18 = c3625h.f17313l;
                    abstractC3642y2.mo5600k();
                    c3022k.getClass();
                    float f16 = i18 - 0;
                    if (f16 <= f7 && f16 > f13) {
                        f13 = f16;
                    }
                    if (f16 >= f7 && f16 < f14) {
                        f14 = f16;
                    }
                    i14++;
                    floatValue2 = f15;
                }
                float f17 = floatValue2;
                if (f13 == Float.NEGATIVE_INFINITY) {
                    f13 = f14;
                }
                if (f14 == Float.POSITIVE_INFINITY) {
                    f14 = f13;
                }
                if (AbstractC2064e.m3247u(abstractC3642y2) == f7) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!abstractC3642y2.mo115d()) {
                    if (!z7 && AbstractC2064e.m3252z(abstractC3642y2)) {
                        f13 = f7;
                        f14 = f13;
                    } else {
                        f14 = f7;
                    }
                }
                if (!abstractC3642y2.mo113b()) {
                    if (!z7 && !AbstractC2064e.m3252z(abstractC3642y2)) {
                        f8 = f7;
                        f9 = f8;
                        floatValue = ((Number) ((C0028g2) c0068q2.f345g).mo24c(Float.valueOf(f17), Float.valueOf(f8), Float.valueOf(f9))).floatValue();
                        if (floatValue == f8 || floatValue == f9 || floatValue == f7) {
                            if (floatValue != Float.POSITIVE_INFINITY || floatValue == Float.NEGATIVE_INFINITY) {
                                floatValue = f7;
                            }
                            if (Float.isNaN(floatValue)) {
                                c3376s2.f16448e = floatValue;
                                float f18 = f7;
                                C2659l m4226l = AbstractC2638e.m4226l(c2659l2, f18, f18, 30);
                                C2675q0 c2675q0 = c3017f.f15558c;
                                C3014c c3014c2 = new C3014c(c3376s2, interfaceC3279c, 0);
                                this.f15198j = null;
                                this.f15199k = 2;
                                float f19 = floatValue;
                                Object m4714b = AbstractC3021j.m4714b(this.f15203o, f19, f19, m4226l, c2675q0, c3014c2, this);
                                if (m4714b != enumC2465a2) {
                                    return m4714b;
                                }
                                return enumC2465a2;
                            }
                            throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
                        }
                        throw new IllegalStateException(("Final Snapping Offset Should Be one of " + f8 + ", " + f9 + " or 0.0").toString());
                    }
                    f8 = f7;
                } else {
                    f8 = f13;
                }
                f9 = f14;
                floatValue = ((Number) ((C0028g2) c0068q2.f345g).mo24c(Float.valueOf(f17), Float.valueOf(f8), Float.valueOf(f9))).floatValue();
                if (floatValue == f8) {
                    throw new IllegalStateException(("Final Snapping Offset Should Be one of " + f8 + ", " + f9 + " or 0.0").toString());
                }
                if (floatValue != Float.POSITIVE_INFINITY) {
                }
                floatValue = f7;
                if (Float.isNaN(floatValue)) {
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2918k(C3017f c3017f, float f7, InterfaceC3279c interfaceC3279c, InterfaceC2958x0 interfaceC2958x0, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f15201m = c3017f;
        this.f15200l = f7;
        this.f15202n = interfaceC3279c;
        this.f15203o = interfaceC2958x0;
    }
}
