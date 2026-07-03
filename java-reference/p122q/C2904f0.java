package p122q;

import java.util.concurrent.CancellationException;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p047f6.C1548c;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.C3379v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.f0 */
/* loaded from: classes.dex */
public final class C2904f0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f15138i = 1;

    /* renamed from: j */
    public C3379v f15139j;

    /* renamed from: k */
    public C3379v f15140k;

    /* renamed from: l */
    public int f15141l;

    /* renamed from: m */
    public /* synthetic */ Object f15142m;

    /* renamed from: n */
    public final /* synthetic */ AbstractC2907g0 f15143n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2904f0(AbstractC2907g0 abstractC2907g0, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f15143n = abstractC2907g0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f15138i) {
            case 0:
                return ((C2904f0) mo28k((InterfaceC3279c) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                return ((C2904f0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f15138i) {
            case 0:
                C2904f0 c2904f0 = new C2904f0(this.f15140k, this.f15143n, interfaceC2313c);
                c2904f0.f15142m = obj;
                return c2904f0;
            default:
                C2904f0 c2904f02 = new C2904f0(this.f15143n, interfaceC2313c);
                c2904f02.f15142m = obj;
                return c2904f02;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:22|23|(1:43)|25|26|27|(2:33|(2:35|(1:37)))(2:29|(2:31|32))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:27:0x00b0, B:29:0x00b6, B:33:0x00c8, B:35:0x00cc), top: B:26:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:27:0x00b0, B:29:0x00b6, B:33:0x00c8, B:35:0x00cc), top: B:26:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0114  */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, u5.v] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0087 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c3 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ca -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d7 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e5 -> B:9:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x013b -> B:61:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0140 -> B:62:0x0141). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC3279c interfaceC3279c;
        Object obj2;
        C2933p c2933p;
        InterfaceC0516a0 interfaceC0516a0;
        C3379v c3379v;
        C3379v c3379v2;
        InterfaceC0516a0 interfaceC0516a02;
        InterfaceC0516a0 interfaceC0516a03;
        Object obj3;
        C2904f0 c2904f0;
        AbstractC2942s abstractC2942s;
        C3379v c3379v3;
        Object obj4;
        C3379v c3379v4;
        switch (this.f15138i) {
            case 0:
                C3379v c3379v5 = this.f15140k;
                int i7 = this.f15141l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        C3379v c3379v6 = this.f15139j;
                        interfaceC3279c = (InterfaceC3279c) this.f15142m;
                        AbstractC1793a0.m2972L(obj);
                        AbstractC2942s abstractC2942s2 = (AbstractC2942s) obj;
                        c3379v6.f16451e = abstractC2942s2;
                        obj2 = c3379v5.f16451e;
                        if ((obj2 instanceof C2939r) && !(obj2 instanceof C2930o)) {
                            abstractC2942s2 = null;
                            if (obj2 instanceof C2933p) {
                                c2933p = (C2933p) obj2;
                            } else {
                                c2933p = null;
                            }
                            if (c2933p != null) {
                                interfaceC3279c.mo23f(c2933p);
                            }
                            C1548c c1548c = this.f15143n.f15154y;
                            if (c1548c != null) {
                                this.f15142m = interfaceC3279c;
                                this.f15139j = c3379v5;
                                this.f15141l = 1;
                                obj = c1548c.mo2507x(this);
                                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                                if (obj != enumC2465a) {
                                    c3379v6 = c3379v5;
                                    AbstractC2942s abstractC2942s22 = (AbstractC2942s) obj;
                                    c3379v6.f16451e = abstractC2942s22;
                                    obj2 = c3379v5.f16451e;
                                    if (obj2 instanceof C2939r) {
                                    }
                                    return C1694m.f10482a;
                                }
                                return enumC2465a;
                            }
                            c3379v6 = c3379v5;
                            c3379v6.f16451e = abstractC2942s22;
                            obj2 = c3379v5.f16451e;
                            if (obj2 instanceof C2939r) {
                            }
                            return C1694m.f10482a;
                        }
                        return C1694m.f10482a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                interfaceC3279c = (InterfaceC3279c) this.f15142m;
                obj2 = c3379v5.f16451e;
                if (obj2 instanceof C2939r) {
                }
                return C1694m.f10482a;
            default:
                int i8 = this.f15141l;
                AbstractC2907g0 abstractC2907g0 = this.f15143n;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                switch (i8) {
                    case 0:
                        AbstractC1793a0.m2972L(obj);
                        interfaceC0516a0 = (InterfaceC0516a0) this.f15142m;
                        if (!AbstractC0525d0.m1139q(interfaceC0516a0)) {
                            ?? obj5 = new Object();
                            C1548c c1548c2 = abstractC2907g0.f15154y;
                            if (c1548c2 != null) {
                                this.f15142m = interfaceC0516a0;
                                this.f15139j = obj5;
                                this.f15140k = obj5;
                                this.f15141l = 1;
                                obj = c1548c2.mo2507x(this);
                                if (obj != enumC2465a2) {
                                    c3379v = obj5;
                                    c3379v4 = obj5;
                                    abstractC2942s = (AbstractC2942s) obj;
                                    c3379v3 = c3379v4;
                                    c3379v3.f16451e = abstractC2942s;
                                    obj4 = c3379v.f16451e;
                                    if (obj4 instanceof C2936q) {
                                        this.f15142m = interfaceC0516a0;
                                        this.f15139j = c3379v;
                                        this.f15140k = null;
                                        this.f15141l = 2;
                                        if (AbstractC2907g0.m4573O0(abstractC2907g0, (C2936q) obj4, this) != enumC2465a2) {
                                            c3379v2 = c3379v;
                                            interfaceC0516a02 = interfaceC0516a0;
                                            c2904f0 = new C2904f0(c3379v2, abstractC2907g0, null);
                                            this.f15142m = interfaceC0516a02;
                                            this.f15139j = c3379v2;
                                            this.f15141l = 3;
                                            if (abstractC2907g0.mo4576R0(c2904f0, this) == enumC2465a2) {
                                                return enumC2465a2;
                                            }
                                            interfaceC0516a0 = interfaceC0516a02;
                                            obj3 = c3379v2.f16451e;
                                            if (obj3 instanceof C2939r) {
                                                this.f15142m = interfaceC0516a0;
                                                this.f15139j = null;
                                                this.f15141l = 4;
                                                if (AbstractC2907g0.m4574P0(abstractC2907g0, (C2939r) obj3, this) == enumC2465a2) {
                                                    return enumC2465a2;
                                                }
                                            } else if (obj3 instanceof C2930o) {
                                                this.f15142m = interfaceC0516a0;
                                                this.f15139j = null;
                                                this.f15141l = 5;
                                                if (AbstractC2907g0.m4572N0(abstractC2907g0, this) == enumC2465a2) {
                                                    return enumC2465a2;
                                                }
                                            }
                                        } else {
                                            return enumC2465a2;
                                        }
                                    }
                                    if (!AbstractC0525d0.m1139q(interfaceC0516a0)) {
                                        return C1694m.f10482a;
                                    }
                                } else {
                                    return enumC2465a2;
                                }
                            } else {
                                c3379v = obj5;
                                abstractC2942s = null;
                                c3379v3 = obj5;
                                c3379v3.f16451e = abstractC2942s;
                                obj4 = c3379v.f16451e;
                                if (obj4 instanceof C2936q) {
                                }
                                if (!AbstractC0525d0.m1139q(interfaceC0516a0)) {
                                }
                            }
                        }
                    case 1:
                        C3379v c3379v7 = this.f15140k;
                        c3379v = this.f15139j;
                        interfaceC0516a0 = (InterfaceC0516a0) this.f15142m;
                        AbstractC1793a0.m2972L(obj);
                        c3379v4 = c3379v7;
                        abstractC2942s = (AbstractC2942s) obj;
                        c3379v3 = c3379v4;
                        c3379v3.f16451e = abstractC2942s;
                        obj4 = c3379v.f16451e;
                        if (obj4 instanceof C2936q) {
                        }
                        if (!AbstractC0525d0.m1139q(interfaceC0516a0)) {
                        }
                        break;
                    case 2:
                        c3379v2 = this.f15139j;
                        interfaceC0516a02 = (InterfaceC0516a0) this.f15142m;
                        AbstractC1793a0.m2972L(obj);
                        c2904f0 = new C2904f0(c3379v2, abstractC2907g0, null);
                        this.f15142m = interfaceC0516a02;
                        this.f15139j = c3379v2;
                        this.f15141l = 3;
                        if (abstractC2907g0.mo4576R0(c2904f0, this) == enumC2465a2) {
                        }
                        interfaceC0516a0 = interfaceC0516a02;
                        obj3 = c3379v2.f16451e;
                        if (obj3 instanceof C2939r) {
                        }
                        if (!AbstractC0525d0.m1139q(interfaceC0516a0)) {
                        }
                        break;
                    case 3:
                        c3379v2 = this.f15139j;
                        interfaceC0516a02 = (InterfaceC0516a0) this.f15142m;
                        try {
                            AbstractC1793a0.m2972L(obj);
                        } catch (CancellationException unused) {
                            interfaceC0516a03 = interfaceC0516a02;
                            this.f15142m = interfaceC0516a03;
                            this.f15139j = null;
                            this.f15141l = 6;
                            if (AbstractC2907g0.m4572N0(abstractC2907g0, this) == enumC2465a2) {
                            }
                            interfaceC0516a0 = interfaceC0516a03;
                            if (!AbstractC0525d0.m1139q(interfaceC0516a0)) {
                            }
                        }
                        interfaceC0516a0 = interfaceC0516a02;
                        obj3 = c3379v2.f16451e;
                        if (obj3 instanceof C2939r) {
                        }
                        if (!AbstractC0525d0.m1139q(interfaceC0516a0)) {
                        }
                        break;
                    case 4:
                        interfaceC0516a03 = (InterfaceC0516a0) this.f15142m;
                        try {
                            AbstractC1793a0.m2972L(obj);
                        } catch (CancellationException unused2) {
                            this.f15142m = interfaceC0516a03;
                            this.f15139j = null;
                            this.f15141l = 6;
                            if (AbstractC2907g0.m4572N0(abstractC2907g0, this) == enumC2465a2) {
                                return enumC2465a2;
                            }
                            interfaceC0516a0 = interfaceC0516a03;
                            if (!AbstractC0525d0.m1139q(interfaceC0516a0)) {
                            }
                        }
                        interfaceC0516a0 = interfaceC0516a03;
                        if (!AbstractC0525d0.m1139q(interfaceC0516a0)) {
                        }
                        break;
                    case AbstractC3122c.f15761f /* 5 */:
                        interfaceC0516a03 = (InterfaceC0516a0) this.f15142m;
                        AbstractC1793a0.m2972L(obj);
                        interfaceC0516a0 = interfaceC0516a03;
                        if (!AbstractC0525d0.m1139q(interfaceC0516a0)) {
                        }
                        break;
                    case AbstractC3122c.f15759d /* 6 */:
                        interfaceC0516a03 = (InterfaceC0516a0) this.f15142m;
                        AbstractC1793a0.m2972L(obj);
                        interfaceC0516a0 = interfaceC0516a03;
                        if (!AbstractC0525d0.m1139q(interfaceC0516a0)) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2904f0(C3379v c3379v, AbstractC2907g0 abstractC2907g0, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f15140k = c3379v;
        this.f15143n = abstractC2907g0;
    }
}
