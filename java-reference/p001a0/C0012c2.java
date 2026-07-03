package p001a0;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.CancellationException;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.C1958n3;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.AbstractC2638e;
import p100n.C2635d;
import p100n.C2675q0;
import p100n.InterfaceC2627a0;
import p101n0.C2705e;
import p107o.AbstractC2734e;
import p107o.AbstractC2777t;
import p122q.C2923l1;
import p122q.C2929n1;
import p122q.C2961y0;
import p137s.C3081j;
import p137s.C3082k;
import p137s.C3083l;
import p139s1.AbstractC3088a;
import p140s2.C3100j;
import p150t5.InterfaceC3281e;
import p158u5.C3376s;
import p160v.AbstractC3446y;
import p160v.C3444x;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.C3490c1;
import p162v1.C3502g0;
import p162v1.InterfaceC3487b2;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.c2 */
/* loaded from: classes.dex */
public final class C0012c2 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f78i;

    /* renamed from: j */
    public int f79j;

    /* renamed from: k */
    public final /* synthetic */ long f80k;

    /* renamed from: l */
    public final /* synthetic */ Object f81l;

    /* renamed from: m */
    public Object f82m;

    /* renamed from: n */
    public final /* synthetic */ Object f83n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0012c2(Object obj, long j6, Object obj2, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f78i = i7;
        this.f83n = obj;
        this.f80k = j6;
        this.f81l = obj2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f78i) {
            case 0:
                return ((C0012c2) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 1:
                return ((C0012c2) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 2:
                return ((C0012c2) mo28k((C2923l1) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                return ((C0012c2) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f78i) {
            case 0:
                return new C0012c2((InterfaceC2425y0) this.f83n, this.f80k, (C3081j) this.f81l, interfaceC2313c, 0);
            case 1:
                return new C0012c2((AbstractC2734e) this.f83n, this.f80k, (C3081j) this.f81l, interfaceC2313c, 1);
            case 2:
                C0012c2 c0012c2 = new C0012c2((C2929n1) this.f83n, this.f80k, (C3376s) this.f81l, interfaceC2313c, 2);
                c0012c2.f82m = obj;
                return c0012c2;
            default:
                return new C0012c2((C3444x) this.f83n, (InterfaceC2627a0) this.f81l, this.f80k, interfaceC2313c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ef, code lost:
    
        if (p032d6.AbstractC0525d0.m1131i(r0, r17) == r8) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0260, code lost:
    
        if (r10.m4747b(r0, r17) == r8) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0246, code lost:
    
        if (r10.m4747b(r1, r17) == r8) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        if (p100n.C2635d.m4205c(r0, r3, r10, r3, r17, 4) != r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0202, code lost:
    
        if (((p137s.C3081j) r10).m4747b(r0, r17) == r8) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0257  */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [x0.q] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC2425y0 interfaceC2425y0;
        C3083l c3083l;
        boolean z7;
        boolean z8;
        C3490c1 c3490c1;
        int i7;
        AbstractC3809q abstractC3809q;
        C2705e c2705e;
        boolean z9;
        boolean z10;
        C3083l c3083l2;
        InterfaceC2627a0 interfaceC2627a0;
        int i8 = this.f78i;
        C1694m c1694m = C1694m.f10482a;
        C2705e c2705e2 = null;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        Object obj2 = this.f83n;
        Object obj3 = this.f81l;
        long j6 = this.f80k;
        switch (i8) {
            case 0:
                C3081j c3081j = (C3081j) obj3;
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) obj2;
                int i9 = this.f79j;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            c3083l = (C3083l) this.f82m;
                            AbstractC1793a0.m2972L(obj);
                            interfaceC2425y02.setValue(c3083l);
                            return c1694m;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2425y0 = (InterfaceC2425y0) this.f82m;
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C3083l c3083l3 = (C3083l) interfaceC2425y02.getValue();
                    if (c3083l3 != null) {
                        C3082k c3082k = new C3082k(c3083l3);
                        if (c3081j != null) {
                            this.f82m = interfaceC2425y02;
                            this.f79j = 1;
                            break;
                        }
                        interfaceC2425y0 = interfaceC2425y02;
                    }
                    c3083l = new C3083l(j6);
                    if (c3081j != null) {
                        this.f82m = c3083l;
                        this.f79j = 2;
                        break;
                    }
                    interfaceC2425y02.setValue(c3083l);
                    return c1694m;
                }
                interfaceC2425y0.setValue(null);
                c3083l = new C3083l(j6);
                if (c3081j != null) {
                }
                interfaceC2425y02.setValue(c3083l);
                return c1694m;
            case 1:
                AbstractC2734e abstractC2734e = (AbstractC2734e) obj2;
                int i10 = this.f79j;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            c3083l2 = (C3083l) this.f82m;
                            AbstractC1793a0.m2972L(obj);
                            abstractC2734e.f14631E = c3083l2;
                            return c1694m;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (!abstractC2734e.f17992e.f18005r) {
                        AbstractC3088a.m4750b("visitAncestors called on an unattached node");
                    }
                    AbstractC3809q abstractC3809q2 = abstractC2734e.f17992e.f17996i;
                    C3502g0 m5382v = AbstractC3498f.m5382v(abstractC2734e);
                    boolean z11 = false;
                    while (true) {
                        if (m5382v != null) {
                            int i11 = 262144;
                            if ((m5382v.f16872I.f16802f.f17995h & 262144) != 0) {
                                while (abstractC3809q2 != null) {
                                    if ((abstractC3809q2.f17994g & i11) != 0) {
                                        AbstractC3519m abstractC3519m = abstractC3809q2;
                                        C2705e c2705e3 = c2705e2;
                                        while (abstractC3519m != 0) {
                                            if (abstractC3519m instanceof InterfaceC3487b2) {
                                                InterfaceC3487b2 interfaceC3487b2 = (InterfaceC3487b2) abstractC3519m;
                                                i7 = i11;
                                                if (C2961y0.f15357t.equals(interfaceC3487b2.mo204o())) {
                                                    if (!z11 && !((C2961y0) interfaceC3487b2).f15358s) {
                                                        z9 = false;
                                                    } else {
                                                        z9 = true;
                                                    }
                                                    z10 = !z9;
                                                } else {
                                                    z9 = z11;
                                                    z10 = true;
                                                }
                                                if (!z10) {
                                                    z11 = z9;
                                                } else {
                                                    z11 = z9;
                                                }
                                            } else {
                                                i7 = i11;
                                                if ((abstractC3519m.f17994g & i7) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                                    AbstractC3809q abstractC3809q3 = abstractC3519m.f16962t;
                                                    int i12 = 0;
                                                    abstractC3809q = abstractC3519m;
                                                    while (abstractC3809q3 != null) {
                                                        if ((abstractC3809q3.f17994g & i7) != 0) {
                                                            i12++;
                                                            if (i12 == 1) {
                                                                abstractC3809q = abstractC3809q3;
                                                            } else {
                                                                if (c2705e3 == null) {
                                                                    c2705e = new C2705e(new AbstractC3809q[16]);
                                                                } else {
                                                                    c2705e = c2705e3;
                                                                }
                                                                if (abstractC3809q != null) {
                                                                    c2705e.m4300b(abstractC3809q);
                                                                    abstractC3809q = null;
                                                                }
                                                                c2705e.m4300b(abstractC3809q3);
                                                                c2705e3 = c2705e;
                                                            }
                                                        }
                                                        abstractC3809q3 = abstractC3809q3.f17997j;
                                                        abstractC3809q = abstractC3809q;
                                                    }
                                                    if (i12 == 1) {
                                                        i11 = i7;
                                                        abstractC3519m = abstractC3809q;
                                                    }
                                                }
                                            }
                                            abstractC3809q = AbstractC3498f.m5366f(c2705e3);
                                            i11 = i7;
                                            abstractC3519m = abstractC3809q;
                                        }
                                    }
                                    abstractC3809q2 = abstractC3809q2.f17996i;
                                    i11 = i11;
                                    c2705e2 = null;
                                }
                            }
                            m5382v = m5382v.m5447u();
                            if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                                abstractC3809q2 = c3490c1.f16801e;
                            } else {
                                abstractC3809q2 = null;
                            }
                            c2705e2 = null;
                        }
                    }
                    if (!z11) {
                        int i13 = AbstractC2777t.f14769b;
                        ViewParent parent = AbstractC3498f.m5384x(abstractC2734e).getParent();
                        while (parent != null && (parent instanceof ViewGroup)) {
                            ViewGroup viewGroup = (ViewGroup) parent;
                            if (viewGroup.shouldDelayChildPressedState()) {
                                z8 = true;
                                if (!z8) {
                                    z7 = false;
                                    if (z7) {
                                        long j7 = AbstractC2777t.f14768a;
                                        this.f79j = 1;
                                        break;
                                    }
                                }
                            } else {
                                parent = viewGroup.getParent();
                            }
                        }
                        z8 = false;
                        if (!z8) {
                        }
                    }
                    z7 = true;
                    if (z7) {
                    }
                }
                c3083l2 = new C3083l(j6);
                this.f82m = c3083l2;
                this.f79j = 2;
                break;
            case 2:
                C2929n1 c2929n1 = (C2929n1) obj2;
                int i14 = this.f79j;
                if (i14 != 0) {
                    if (i14 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C2923l1 c2923l1 = (C2923l1) this.f82m;
                float m4593f = c2929n1.m4593f(j6);
                C0046l0 c0046l0 = new C0046l0((C3376s) obj3, c2929n1, c2923l1, 4);
                this.f79j = 1;
                if (AbstractC2638e.m4219e(m4593f, null, c0046l0, this, 12) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            default:
                InterfaceC2627a0 interfaceC2627a02 = (InterfaceC2627a0) obj3;
                C3444x c3444x = (C3444x) obj2;
                C2635d c2635d = c3444x.f16652o;
                int i15 = this.f79j;
                try {
                    if (i15 != 0) {
                        if (i15 != 1) {
                            if (i15 == 2) {
                                AbstractC1793a0.m2972L(obj);
                                int i16 = C3444x.f16637t;
                                c3444x.m5193f(false);
                                c3444x.f16644g = false;
                                return c1694m;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC2627a0 = (InterfaceC2627a0) this.f82m;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        if (((Boolean) c2635d.f14260d.getValue()).booleanValue()) {
                            if (interfaceC2627a02 instanceof C2675q0) {
                                interfaceC2627a02 = (C2675q0) interfaceC2627a02;
                            } else {
                                interfaceC2627a02 = AbstractC3446y.f16657a;
                            }
                        }
                        if (!((Boolean) c2635d.f14260d.getValue()).booleanValue()) {
                            C3100j c3100j = new C3100j(j6);
                            this.f82m = interfaceC2627a02;
                            this.f79j = 1;
                            if (c2635d.m4207e(c3100j, this) != enumC2465a) {
                                interfaceC2627a0 = interfaceC2627a02;
                            } else {
                                return enumC2465a;
                            }
                        }
                        long m4784b = C3100j.m4784b(((C3100j) c2635d.m4206d()).f15696a, j6);
                        C2635d c2635d2 = c3444x.f16652o;
                        C3100j c3100j2 = new C3100j(m4784b);
                        C1958n3 c1958n3 = new C1958n3(c3444x, m4784b);
                        this.f82m = null;
                        this.f79j = 2;
                        break;
                    }
                    c3444x.f16640c.mo52a();
                    interfaceC2627a02 = interfaceC2627a0;
                    long m4784b2 = C3100j.m4784b(((C3100j) c2635d.m4206d()).f15696a, j6);
                    C2635d c2635d22 = c3444x.f16652o;
                    C3100j c3100j22 = new C3100j(m4784b2);
                    C1958n3 c1958n32 = new C1958n3(c3444x, m4784b2);
                    this.f82m = null;
                    this.f79j = 2;
                } catch (CancellationException unused) {
                    return c1694m;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0012c2(C3444x c3444x, InterfaceC2627a0 interfaceC2627a0, long j6, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f78i = 3;
        this.f83n = c3444x;
        this.f81l = interfaceC2627a0;
        this.f80k = j6;
    }
}
