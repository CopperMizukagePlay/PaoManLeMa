package p122q;

import java.util.concurrent.CancellationException;
import p001a0.C0005b;
import p001a0.C0070r0;
import p027d1.C0464b;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p039e5.C0996jh;
import p039e5.C1027kh;
import p039e5.C1058lh;
import p039e5.C1120nh;
import p053g5.C1694m;
import p053g5.InterfaceC1684c;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2589i;
import p098m5.AbstractC2590j;
import p117p1.AbstractC2866q;
import p117p1.C2855g0;
import p117p1.C2868s;
import p117p1.EnumC2860k;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.x */
/* loaded from: classes.dex */
public final class C2957x extends AbstractC2589i implements InterfaceC3281e {

    /* renamed from: g */
    public final /* synthetic */ int f15345g = 1;

    /* renamed from: h */
    public int f15346h;

    /* renamed from: i */
    public /* synthetic */ Object f15347i;

    /* renamed from: j */
    public final /* synthetic */ Object f15348j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC1684c f15349k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC1684c f15350l;

    /* renamed from: m */
    public final /* synthetic */ Object f15351m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2957x(InterfaceC0516a0 interfaceC0516a0, InterfaceC3282f interfaceC3282f, InterfaceC3279c interfaceC3279c, C2940r0 c2940r0, InterfaceC2313c interfaceC2313c) {
        super(interfaceC2313c);
        this.f15348j = interfaceC0516a0;
        this.f15349k = (AbstractC2590j) interfaceC3282f;
        this.f15350l = (AbstractC3368k) interfaceC3279c;
        this.f15351m = c2940r0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2855g0 c2855g0 = (C2855g0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f15345g) {
            case 0:
                return ((C2957x) mo28k(c2855g0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C2957x) mo28k(c2855g0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [m5.j, t5.f] */
    /* JADX WARN: Type inference failed for: r4v3, types: [t5.c, u5.k] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f15345g) {
            case 0:
                C2957x c2957x = new C2957x((C0996jh) this.f15348j, (C1027kh) this.f15349k, (C1058lh) this.f15350l, (C1120nh) this.f15351m, interfaceC2313c);
                c2957x.f15347i = obj;
                return c2957x;
            default:
                C2957x c2957x2 = new C2957x((InterfaceC0516a0) this.f15348j, (InterfaceC3282f) this.f15349k, (InterfaceC3279c) this.f15350l, (C2940r0) this.f15351m, interfaceC2313c);
                c2957x2.f15347i = obj;
                return c2957x2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122 A[Catch: CancellationException -> 0x00b3, TryCatch #0 {CancellationException -> 0x00b3, blocks: (B:34:0x00af, B:35:0x011a, B:37:0x0122, B:39:0x012f, B:41:0x013b, B:43:0x013e, B:46:0x0141, B:49:0x0149, B:53:0x00c2, B:54:0x00f0, B:56:0x00f4, B:61:0x00ca, B:62:0x00e1, B:67:0x00d6), top: B:28:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149 A[Catch: CancellationException -> 0x00b3, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00b3, blocks: (B:34:0x00af, B:35:0x011a, B:37:0x0122, B:39:0x012f, B:41:0x013b, B:43:0x013e, B:46:0x0141, B:49:0x0149, B:53:0x00c2, B:54:0x00f0, B:56:0x00f4, B:61:0x00ca, B:62:0x00e1, B:67:0x00d6), top: B:28:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4 A[Catch: CancellationException -> 0x00b3, TryCatch #0 {CancellationException -> 0x00b3, blocks: (B:34:0x00af, B:35:0x011a, B:37:0x0122, B:39:0x012f, B:41:0x013b, B:43:0x013e, B:46:0x0141, B:49:0x0149, B:53:0x00c2, B:54:0x00f0, B:56:0x00f4, B:61:0x00ca, B:62:0x00e1, B:67:0x00d6), top: B:28:0x00a3 }] */
    /* JADX WARN: Type inference failed for: r0v7, types: [t5.c, u5.k] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [m5.j, t5.f] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C2855g0 c2855g0;
        C2868s c2868s;
        C2855g0 c2855g02;
        C2868s c2868s2;
        switch (this.f15345g) {
            case 0:
                C1058lh c1058lh = (C1058lh) this.f15350l;
                int i7 = this.f15346h;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                try {
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 == 3) {
                                    c2855g0 = (C2855g0) this.f15347i;
                                    AbstractC1793a0.m2972L(obj);
                                    if (!((Boolean) obj).booleanValue()) {
                                        ?? r10 = c2855g0.f14969j.f14986x.f14991a;
                                        int size = r10.size();
                                        for (int i8 = 0; i8 < size; i8++) {
                                            C2868s c2868s3 = (C2868s) r10.get(i8);
                                            if (AbstractC2866q.m4543b(c2868s3)) {
                                                c2868s3.m4550a();
                                            }
                                        }
                                        ((C1027kh) this.f15349k).mo52a();
                                    } else {
                                        c1058lh.mo52a();
                                    }
                                    return C1694m.f10482a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c2855g0 = (C2855g0) this.f15347i;
                            AbstractC1793a0.m2972L(obj);
                            c2868s = (C2868s) obj;
                            if (c2868s != null) {
                                ((C0996jh) this.f15348j).mo23f(new C0464b(c2868s.f15008c));
                                long j6 = c2868s.f15006a;
                                C0005b c0005b = new C0005b(24, (C1120nh) this.f15351m);
                                this.f15347i = c2855g0;
                                this.f15346h = 3;
                                obj = AbstractC2963z.m4605c(c2855g0, j6, c0005b, this);
                                if (obj == enumC2465a) {
                                    return enumC2465a;
                                }
                                if (!((Boolean) obj).booleanValue()) {
                                }
                            }
                            return C1694m.f10482a;
                        }
                        c2855g0 = (C2855g0) this.f15347i;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        c2855g0 = (C2855g0) this.f15347i;
                        this.f15347i = c2855g0;
                        this.f15346h = 1;
                        obj = AbstractC2959x1.m4599c(c2855g0, this, 2);
                        if (obj == enumC2465a) {
                            return enumC2465a;
                        }
                    }
                    long j7 = ((C2868s) obj).f15006a;
                    this.f15347i = c2855g0;
                    this.f15346h = 2;
                    obj = AbstractC2963z.m4604b(c2855g0, j7, this);
                    if (obj == enumC2465a) {
                        return enumC2465a;
                    }
                    c2868s = (C2868s) obj;
                    if (c2868s != null) {
                    }
                    return C1694m.f10482a;
                } catch (CancellationException e7) {
                    c1058lh.mo52a();
                    throw e7;
                }
            default:
                InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f15348j;
                C2940r0 c2940r0 = (C2940r0) this.f15351m;
                int i9 = this.f15346h;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            c2868s2 = (C2868s) obj;
                            if (c2868s2 != null) {
                                AbstractC0525d0.m1141s(interfaceC0516a0, null, new C2944s1(c2940r0, null, 0), 3);
                            } else {
                                c2868s2.m4550a();
                                AbstractC0525d0.m1141s(interfaceC0516a0, null, new C2944s1(c2940r0, null, 1), 3);
                                ((AbstractC3368k) this.f15350l).mo23f(new C0464b(c2868s2.f15008c));
                            }
                            return C1694m.f10482a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2855g02 = (C2855g0) this.f15347i;
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c2855g02 = (C2855g0) this.f15347i;
                    AbstractC0525d0.m1141s(interfaceC0516a0, null, new C2941r1(c2940r0, null, 0), 3);
                    this.f15347i = c2855g02;
                    this.f15346h = 1;
                    obj = AbstractC2959x1.m4599c(c2855g02, this, 3);
                    if (obj == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                C2868s c2868s4 = (C2868s) obj;
                c2868s4.m4550a();
                ?? r52 = (AbstractC2590j) this.f15349k;
                if (r52 != AbstractC2959x1.f15352a) {
                    AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0070r0((InterfaceC3282f) r52, c2940r0, c2868s4, (InterfaceC2313c) null), 3);
                }
                this.f15347i = null;
                this.f15346h = 2;
                obj = AbstractC2959x1.m4601e(c2855g02, EnumC2860k.f14996f, this);
                if (obj == enumC2465a2) {
                    return enumC2465a2;
                }
                c2868s2 = (C2868s) obj;
                if (c2868s2 != null) {
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2957x(C0996jh c0996jh, C1027kh c1027kh, C1058lh c1058lh, C1120nh c1120nh, InterfaceC2313c interfaceC2313c) {
        super(interfaceC2313c);
        this.f15348j = c0996jh;
        this.f15349k = c1027kh;
        this.f15350l = c1058lh;
        this.f15351m = c1120nh;
    }
}
