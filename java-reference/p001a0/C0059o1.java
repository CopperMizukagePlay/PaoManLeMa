package p001a0;

import java.util.concurrent.CancellationException;
import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p066i3.AbstractC2067b;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p090l5.EnumC2465a;
import p098m5.AbstractC2589i;
import p117p1.C2855g0;
import p117p1.C2859j;
import p117p1.C2867r;
import p117p1.C2868s;
import p117p1.EnumC2860k;
import p122q.AbstractC2959x1;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.o1 */
/* loaded from: classes.dex */
public final class C0059o1 extends AbstractC2589i implements InterfaceC3281e {

    /* renamed from: g */
    public final /* synthetic */ int f286g = 0;

    /* renamed from: h */
    public int f287h;

    /* renamed from: i */
    public /* synthetic */ Object f288i;

    /* renamed from: j */
    public Object f289j;

    /* renamed from: k */
    public final /* synthetic */ Object f290k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0059o1(InterfaceC0071r1 interfaceC0071r1, InterfaceC2313c interfaceC2313c) {
        super(interfaceC2313c);
        this.f290k = interfaceC0071r1;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2855g0 c2855g0 = (C2855g0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f286g) {
            case 0:
                return ((C0059o1) mo28k(c2855g0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0059o1) mo28k(c2855g0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [m5.i, t5.e] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f286g) {
            case 0:
                C0059o1 c0059o1 = new C0059o1((InterfaceC0071r1) this.f290k, interfaceC2313c);
                c0059o1.f288i = obj;
                return c0059o1;
            default:
                C0059o1 c0059o12 = new C0059o1((InterfaceC2318h) this.f289j, (AbstractC2589i) this.f290k, interfaceC2313c);
                c0059o12.f288i = obj;
                return c0059o12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [p1.g0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [m5.i, t5.e] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0060 -> B:10:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0075 -> B:10:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00d0 -> B:44:0x00d3). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C2855g0 c2855g0;
        C2855g0 c2855g02;
        C2868s c2868s;
        int size;
        int i7;
        Object m3281f;
        C2855g0 c2855g03;
        C2855g0 c2855g04;
        switch (this.f286g) {
            case 0:
                InterfaceC0071r1 interfaceC0071r1 = (InterfaceC0071r1) this.f290k;
                int i8 = this.f287h;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            c2868s = (C2868s) this.f289j;
                            c2855g02 = (C2855g0) this.f288i;
                            AbstractC1793a0.m2972L(obj);
                            ?? r14 = ((C2859j) obj).f14991a;
                            size = r14.size();
                            i7 = 0;
                            while (i7 < size) {
                                C2868s c2868s2 = (C2868s) r14.get(i7);
                                if (C2867r.m4548a(c2868s2.f15006a, c2868s.f15006a) && c2868s2.f15009d) {
                                    this.f288i = c2855g02;
                                    this.f289j = c2868s;
                                    this.f287h = 2;
                                    obj = c2855g02.m4514a(EnumC2860k.f14996f, this);
                                    if (obj == enumC2465a) {
                                        return enumC2465a;
                                    }
                                    ?? r142 = ((C2859j) obj).f14991a;
                                    size = r142.size();
                                    i7 = 0;
                                    while (i7 < size) {
                                    }
                                } else {
                                    i7++;
                                }
                            }
                            interfaceC0071r1.mo162b();
                            return C1694m.f10482a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2855g0 = (C2855g0) this.f288i;
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c2855g0 = (C2855g0) this.f288i;
                    this.f288i = c2855g0;
                    this.f287h = 1;
                    obj = AbstractC2959x1.m4599c(c2855g0, this, 2);
                    if (obj == enumC2465a) {
                        return enumC2465a;
                    }
                }
                C2868s c2868s3 = (C2868s) obj;
                long j6 = c2868s3.f15008c;
                interfaceC0071r1.mo164d();
                c2855g02 = c2855g0;
                c2868s = c2868s3;
                this.f288i = c2855g02;
                this.f289j = c2868s;
                this.f287h = 2;
                obj = c2855g02.m4514a(EnumC2860k.f14996f, this);
                if (obj == enumC2465a) {
                }
                ?? r1422 = ((C2859j) obj).f14991a;
                size = r1422.size();
                i7 = 0;
                while (i7 < size) {
                }
                interfaceC0071r1.mo162b();
                return C1694m.f10482a;
            default:
                InterfaceC2318h interfaceC2318h = (InterfaceC2318h) this.f289j;
                C2855g0 c2855g05 = this.f287h;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                try {
                } catch (CancellationException e7) {
                    e = e7;
                    if (!AbstractC0525d0.m1140r(interfaceC2318h)) {
                        this.f288i = c2855g05;
                        this.f287h = 3;
                        Object m3281f2 = AbstractC2067b.m3281f(c2855g05, this);
                        c2855g04 = c2855g05;
                        if (m3281f2 == enumC2465a2) {
                            return enumC2465a2;
                        }
                        c2855g03 = c2855g04;
                        if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                        }
                    } else {
                        throw e;
                    }
                }
                if (c2855g05 != 0) {
                    if (c2855g05 != 1) {
                        if (c2855g05 != 2) {
                            if (c2855g05 == 3) {
                                C2855g0 c2855g06 = (C2855g0) this.f288i;
                                AbstractC1793a0.m2972L(obj);
                                c2855g04 = c2855g06;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            C2855g0 c2855g07 = (C2855g0) this.f288i;
                            AbstractC1793a0.m2972L(obj);
                            c2855g04 = c2855g07;
                        }
                        c2855g03 = c2855g04;
                        if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                            try {
                            } catch (CancellationException e8) {
                                c2855g05 = c2855g03;
                                e = e8;
                                if (!AbstractC0525d0.m1140r(interfaceC2318h)) {
                                }
                            }
                            ?? r12 = (AbstractC2589i) this.f290k;
                            this.f288i = c2855g03;
                            this.f287h = 1;
                            if (r12.mo22d(c2855g03, this) != enumC2465a2) {
                                c2855g05 = c2855g03;
                                this.f288i = c2855g05;
                                this.f287h = 2;
                                m3281f = AbstractC2067b.m3281f(c2855g05, this);
                                c2855g04 = c2855g05;
                                if (m3281f == enumC2465a2) {
                                    return enumC2465a2;
                                }
                                c2855g03 = c2855g04;
                                if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                                    return C1694m.f10482a;
                                }
                            } else {
                                return enumC2465a2;
                            }
                        }
                    } else {
                        C2855g0 c2855g08 = (C2855g0) this.f288i;
                        AbstractC1793a0.m2972L(obj);
                        c2855g05 = c2855g08;
                        this.f288i = c2855g05;
                        this.f287h = 2;
                        m3281f = AbstractC2067b.m3281f(c2855g05, this);
                        c2855g04 = c2855g05;
                        if (m3281f == enumC2465a2) {
                        }
                        c2855g03 = c2855g04;
                        if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                        }
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c2855g03 = (C2855g0) this.f288i;
                    if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0059o1(InterfaceC2318h interfaceC2318h, InterfaceC3281e interfaceC3281e, InterfaceC2313c interfaceC2313c) {
        super(interfaceC2313c);
        this.f289j = interfaceC2318h;
        this.f290k = (AbstractC2589i) interfaceC3281e;
    }
}
