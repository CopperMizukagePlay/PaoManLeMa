package p122q;

import p047f6.C1548c;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p107o.C2722a;
import p117p1.AbstractC2847c0;
import p117p1.C2849d0;
import p117p1.C2857h0;
import p117p1.C2859j;
import p117p1.EnumC2860k;
import p137s.C3072a;
import p137s.C3073b;
import p137s.C3074c;
import p137s.C3081j;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3519m;
import p162v1.InterfaceC3513k;
import p162v1.InterfaceC3539s1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC2907g0 extends AbstractC3519m implements InterfaceC3539s1, InterfaceC3513k {

    /* renamed from: A */
    public boolean f15148A;

    /* renamed from: B */
    public C2857h0 f15149B;

    /* renamed from: u */
    public EnumC2931o0 f15150u;

    /* renamed from: v */
    public AbstractC3368k f15151v;

    /* renamed from: w */
    public boolean f15152w;

    /* renamed from: x */
    public C3081j f15153x;

    /* renamed from: y */
    public C1548c f15154y;

    /* renamed from: z */
    public C3073b f15155z;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC2907g0(InterfaceC3279c interfaceC3279c, boolean z7, C3081j c3081j, EnumC2931o0 enumC2931o0) {
        this.f15150u = enumC2931o0;
        this.f15151v = (AbstractC3368k) interfaceC3279c;
        this.f15152w = z7;
        this.f15153x = c3081j;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4572N0(AbstractC2907g0 abstractC2907g0, AbstractC2583c abstractC2583c) {
        C2895c0 c2895c0;
        int i7;
        if (abstractC2583c instanceof C2895c0) {
            c2895c0 = (C2895c0) abstractC2583c;
            int i8 = c2895c0.f15105k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2895c0.f15105k = i8 - Integer.MIN_VALUE;
                Object obj = c2895c0.f15103i;
                i7 = c2895c0.f15105k;
                if (i7 == 0) {
                    if (i7 == 1) {
                        abstractC2907g0 = c2895c0.f15102h;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C3073b c3073b = abstractC2907g0.f15155z;
                    if (c3073b != null) {
                        C3081j c3081j = abstractC2907g0.f15153x;
                        if (c3081j != null) {
                            C3072a c3072a = new C3072a(c3073b);
                            c2895c0.f15102h = abstractC2907g0;
                            c2895c0.f15105k = 1;
                            Object m4747b = c3081j.m4747b(c3072a, c2895c0);
                            EnumC2465a enumC2465a = EnumC2465a.f13750e;
                            if (m4747b == enumC2465a) {
                                return enumC2465a;
                            }
                        }
                    }
                    abstractC2907g0.mo4578T0(0L);
                    return C1694m.f10482a;
                }
                abstractC2907g0.f15155z = null;
                abstractC2907g0.mo4578T0(0L);
                return C1694m.f10482a;
            }
        }
        c2895c0 = new C2895c0(abstractC2907g0, abstractC2583c);
        Object obj2 = c2895c0.f15103i;
        i7 = c2895c0.f15105k;
        if (i7 == 0) {
        }
        abstractC2907g0.f15155z = null;
        abstractC2907g0.mo4578T0(0L);
        return C1694m.f10482a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r1.m4747b(r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [s.b, java.lang.Object, s.h] */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4573O0(AbstractC2907g0 abstractC2907g0, C2936q c2936q, AbstractC2583c abstractC2583c) {
        C2898d0 c2898d0;
        int i7;
        C3081j c3081j;
        AbstractC2907g0 abstractC2907g02;
        C3073b c3073b;
        C3073b c3073b2;
        if (abstractC2583c instanceof C2898d0) {
            c2898d0 = (C2898d0) abstractC2583c;
            int i8 = c2898d0.f15118m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2898d0.f15118m = i8 - Integer.MIN_VALUE;
                Object obj = c2898d0.f15116k;
                i7 = c2898d0.f15118m;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            c3073b = c2898d0.f15115j;
                            c2936q = c2898d0.f15114i;
                            abstractC2907g02 = c2898d0.f15113h;
                            AbstractC1793a0.m2972L(obj);
                            c3073b2 = c3073b;
                            abstractC2907g0 = abstractC2907g02;
                            abstractC2907g0.f15155z = c3073b2;
                            abstractC2907g0.mo4577S0(c2936q.f15257a);
                            return C1694m.f10482a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2936q = c2898d0.f15114i;
                    abstractC2907g0 = c2898d0.f15113h;
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C3073b c3073b3 = abstractC2907g0.f15155z;
                    if (c3073b3 != null && (r1 = abstractC2907g0.f15153x) != null) {
                        C3072a c3072a = new C3072a(c3073b3);
                        c2898d0.f15113h = abstractC2907g0;
                        c2898d0.f15114i = c2936q;
                        c2898d0.f15118m = 1;
                    }
                }
                ?? obj2 = new Object();
                c3081j = abstractC2907g0.f15153x;
                c3073b2 = obj2;
                if (c3081j != 0) {
                    c2898d0.f15113h = abstractC2907g0;
                    c2898d0.f15114i = c2936q;
                    c2898d0.f15115j = obj2;
                    c2898d0.f15118m = 2;
                    if (c3081j.m4747b(obj2, c2898d0) != enumC2465a) {
                        abstractC2907g02 = abstractC2907g0;
                        c3073b = obj2;
                        c3073b2 = c3073b;
                        abstractC2907g0 = abstractC2907g02;
                    }
                    return enumC2465a;
                }
                abstractC2907g0.f15155z = c3073b2;
                abstractC2907g0.mo4577S0(c2936q.f15257a);
                return C1694m.f10482a;
            }
        }
        c2898d0 = new C2898d0(abstractC2907g0, abstractC2583c);
        Object obj3 = c2898d0.f15116k;
        i7 = c2898d0.f15118m;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        if (i7 == 0) {
        }
        ?? obj22 = new Object();
        c3081j = abstractC2907g0.f15153x;
        c3073b2 = obj22;
        if (c3081j != 0) {
        }
        abstractC2907g0.f15155z = c3073b2;
        abstractC2907g0.mo4577S0(c2936q.f15257a);
        return C1694m.f10482a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4574P0(AbstractC2907g0 abstractC2907g0, C2939r c2939r, AbstractC2583c abstractC2583c) {
        C2901e0 c2901e0;
        int i7;
        if (abstractC2583c instanceof C2901e0) {
            c2901e0 = (C2901e0) abstractC2583c;
            int i8 = c2901e0.f15128l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2901e0.f15128l = i8 - Integer.MIN_VALUE;
                Object obj = c2901e0.f15126j;
                i7 = c2901e0.f15128l;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c2939r = c2901e0.f15125i;
                        abstractC2907g0 = c2901e0.f15124h;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C3073b c3073b = abstractC2907g0.f15155z;
                    if (c3073b != null) {
                        C3081j c3081j = abstractC2907g0.f15153x;
                        if (c3081j != null) {
                            C3074c c3074c = new C3074c(c3073b);
                            c2901e0.f15124h = abstractC2907g0;
                            c2901e0.f15125i = c2939r;
                            c2901e0.f15128l = 1;
                            Object m4747b = c3081j.m4747b(c3074c, c2901e0);
                            EnumC2465a enumC2465a = EnumC2465a.f13750e;
                            if (m4747b == enumC2465a) {
                                return enumC2465a;
                            }
                        }
                    }
                    abstractC2907g0.mo4578T0(c2939r.f15265a);
                    return C1694m.f10482a;
                }
                abstractC2907g0.f15155z = null;
                abstractC2907g0.mo4578T0(c2939r.f15265a);
                return C1694m.f10482a;
            }
        }
        c2901e0 = new C2901e0(abstractC2907g0, abstractC2583c);
        Object obj2 = c2901e0.f15126j;
        i7 = c2901e0.f15128l;
        if (i7 == 0) {
        }
        abstractC2907g0.f15155z = null;
        abstractC2907g0.mo4578T0(c2939r.f15265a);
        return C1694m.f10482a;
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: A */
    public void mo545A(C2859j c2859j, EnumC2860k enumC2860k, long j6) {
        if (this.f15152w && this.f15149B == null) {
            C2722a c2722a = new C2722a(this, null, 5);
            C2859j c2859j2 = AbstractC2847c0.f14941a;
            C2857h0 c2857h0 = new C2857h0(null, null, C2849d0.f14950a);
            c2857h0.f14983u = c2722a;
            m5483K0(c2857h0);
            this.f15149B = c2857h0;
        }
        C2857h0 c2857h02 = this.f15149B;
        if (c2857h02 != null) {
            c2857h02.mo545A(c2859j, enumC2860k, j6);
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        this.f15148A = false;
        m4575Q0();
    }

    /* renamed from: Q0 */
    public final void m4575Q0() {
        C3073b c3073b = this.f15155z;
        if (c3073b != null) {
            C3081j c3081j = this.f15153x;
            if (c3081j != null) {
                c3081j.m4748c(new C3072a(c3073b));
            }
            this.f15155z = null;
        }
    }

    /* renamed from: R0 */
    public abstract Object mo4576R0(C2904f0 c2904f0, C2904f0 c2904f02);

    /* renamed from: S0 */
    public abstract void mo4577S0(long j6);

    /* renamed from: T0 */
    public abstract void mo4578T0(long j6);

    /* renamed from: U0 */
    public abstract boolean mo4579U0();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: V0 */
    public final void m4580V0(InterfaceC3279c interfaceC3279c, boolean z7, C3081j c3081j, EnumC2931o0 enumC2931o0, boolean z8) {
        C2857h0 c2857h0;
        this.f15151v = (AbstractC3368k) interfaceC3279c;
        boolean z9 = true;
        if (this.f15152w != z7) {
            this.f15152w = z7;
            if (!z7) {
                m4575Q0();
                C2857h0 c2857h02 = this.f15149B;
                if (c2857h02 != null) {
                    m5484L0(c2857h02);
                }
                this.f15149B = null;
            }
            z8 = true;
        }
        if (!AbstractC3367j.m5096a(this.f15153x, c3081j)) {
            m4575Q0();
            this.f15153x = c3081j;
        }
        if (this.f15150u != enumC2931o0) {
            this.f15150u = enumC2931o0;
        } else {
            z9 = z8;
        }
        if (z9 && (c2857h0 = this.f15149B) != null) {
            c2857h0.m4535M0();
        }
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: i0 */
    public final void mo548i0() {
        C2857h0 c2857h0 = this.f15149B;
        if (c2857h0 != null) {
            c2857h0.mo548i0();
        }
    }
}
