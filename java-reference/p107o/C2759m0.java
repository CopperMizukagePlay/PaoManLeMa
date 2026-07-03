package p107o;

import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p117p1.C2859j;
import p117p1.EnumC2860k;
import p137s.C3077f;
import p137s.C3078g;
import p137s.C3081j;
import p162v1.InterfaceC3539s1;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.m0 */
/* loaded from: classes.dex */
public final class C2759m0 extends AbstractC3809q implements InterfaceC3539s1 {

    /* renamed from: s */
    public C3081j f14716s;

    /* renamed from: t */
    public C3077f f14717t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, s.f, s.h] */
    /* renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4421K0(C2759m0 c2759m0, AbstractC2583c abstractC2583c) {
        C2750j0 c2750j0;
        int i7;
        C3077f c3077f;
        if (abstractC2583c instanceof C2750j0) {
            c2750j0 = (C2750j0) abstractC2583c;
            int i8 = c2750j0.f14689l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2750j0.f14689l = i8 - Integer.MIN_VALUE;
                Object obj = c2750j0.f14687j;
                i7 = c2750j0.f14689l;
                if (i7 == 0) {
                    if (i7 == 1) {
                        C3077f c3077f2 = c2750j0.f14686i;
                        C2759m0 c2759m02 = c2750j0.f14685h;
                        AbstractC1793a0.m2972L(obj);
                        c3077f = c3077f2;
                        c2759m0 = c2759m02;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (c2759m0.f14717t == null) {
                        ?? obj2 = new Object();
                        C3081j c3081j = c2759m0.f14716s;
                        c2750j0.f14685h = c2759m0;
                        c2750j0.f14686i = obj2;
                        c2750j0.f14689l = 1;
                        Object m4747b = c3081j.m4747b(obj2, c2750j0);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        c3077f = obj2;
                        if (m4747b == enumC2465a) {
                            return enumC2465a;
                        }
                    }
                    return C1694m.f10482a;
                }
                c2759m0.f14717t = c3077f;
                return C1694m.f10482a;
            }
        }
        c2750j0 = new C2750j0(c2759m0, abstractC2583c);
        Object obj3 = c2750j0.f14687j;
        i7 = c2750j0.f14689l;
        if (i7 == 0) {
        }
        c2759m0.f14717t = c3077f;
        return C1694m.f10482a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: L0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4422L0(C2759m0 c2759m0, AbstractC2583c abstractC2583c) {
        C2753k0 c2753k0;
        int i7;
        if (abstractC2583c instanceof C2753k0) {
            c2753k0 = (C2753k0) abstractC2583c;
            int i8 = c2753k0.f14700k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2753k0.f14700k = i8 - Integer.MIN_VALUE;
                Object obj = c2753k0.f14698i;
                i7 = c2753k0.f14700k;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c2759m0 = c2753k0.f14697h;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C3077f c3077f = c2759m0.f14717t;
                    if (c3077f != null) {
                        C3078g c3078g = new C3078g(c3077f);
                        C3081j c3081j = c2759m0.f14716s;
                        c2753k0.f14697h = c2759m0;
                        c2753k0.f14700k = 1;
                        Object m4747b = c3081j.m4747b(c3078g, c2753k0);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (m4747b == enumC2465a) {
                            return enumC2465a;
                        }
                    }
                    return C1694m.f10482a;
                }
                c2759m0.f14717t = null;
                return C1694m.f10482a;
            }
        }
        c2753k0 = new C2753k0(c2759m0, abstractC2583c);
        Object obj2 = c2753k0.f14698i;
        i7 = c2753k0.f14700k;
        if (i7 == 0) {
        }
        c2759m0.f14717t = null;
        return C1694m.f10482a;
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: A */
    public final void mo545A(C2859j c2859j, EnumC2860k enumC2860k, long j6) {
        if (enumC2860k == EnumC2860k.f14996f) {
            int i7 = c2859j.f14994d;
            InterfaceC2313c interfaceC2313c = null;
            if (i7 == 4) {
                AbstractC0525d0.m1141s(m5830y0(), null, new C2756l0(this, interfaceC2313c, 0), 3);
            } else if (i7 == 5) {
                AbstractC0525d0.m1141s(m5830y0(), null, new C2756l0(this, interfaceC2313c, 1), 3);
            }
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        m4423M0();
    }

    /* renamed from: M0 */
    public final void m4423M0() {
        C3077f c3077f = this.f14717t;
        if (c3077f != null) {
            this.f14716s.m4748c(new C3078g(c3077f));
            this.f14717t = null;
        }
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: i0 */
    public final void mo548i0() {
        m4423M0();
    }
}
