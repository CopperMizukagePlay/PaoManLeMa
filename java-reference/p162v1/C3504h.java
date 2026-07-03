package p162v1;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2394o2;
import p085l0.InterfaceC2424y;
import p101n0.C2705e;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p145t0.C3177h;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p170w1.AbstractC3674f1;
import p170w1.InterfaceC3679g2;
import p177x0.AbstractC3809q;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.h */
/* loaded from: classes.dex */
public final class C3504h extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: g */
    public static final C3504h f16909g;

    /* renamed from: h */
    public static final C3504h f16910h;

    /* renamed from: i */
    public static final C3504h f16911i;

    /* renamed from: j */
    public static final C3504h f16912j;

    /* renamed from: f */
    public final /* synthetic */ int f16913f;

    static {
        int i7 = 2;
        f16909g = new C3504h(i7, 0);
        f16910h = new C3504h(i7, 1);
        f16911i = new C3504h(i7, 2);
        f16912j = new C3504h(i7, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3504h(int i7, int i8) {
        super(i7);
        this.f16913f = i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f16913f) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC3510j) obj).getClass();
                return C1694m.f10482a;
            case 1:
                ((C3502g0) ((InterfaceC3510j) obj)).m5430f0((InterfaceC3217l0) obj2);
                return C1694m.f10482a;
            case 2:
                ((C3502g0) ((InterfaceC3510j) obj)).m5432g0((InterfaceC3810r) obj2);
                return C1694m.f10482a;
            default:
                InterfaceC2424y interfaceC2424y = (InterfaceC2424y) obj2;
                C3502g0 c3502g0 = (C3502g0) ((InterfaceC3510j) obj);
                c3502g0.f16868E = interfaceC2424y;
                C3490c1 c3490c1 = c3502g0.f16872I;
                C2394o2 c2394o2 = AbstractC3674f1.f17517h;
                C3177h c3177h = (C3177h) interfaceC2424y;
                c3177h.getClass();
                c3502g0.m5424c0((InterfaceC3093c) AbstractC2418w.m3981y(c3177h, c2394o2));
                EnumC3103m enumC3103m = (EnumC3103m) AbstractC2418w.m3981y(c3177h, AbstractC3674f1.f17523n);
                if (c3502g0.f16866C != enumC3103m) {
                    c3502g0.f16866C = enumC3103m;
                    c3502g0.m5403E();
                    C3502g0 m5447u = c3502g0.m5447u();
                    if (m5447u != null) {
                        m5447u.m5401C();
                    }
                    c3502g0.m5402D();
                    for (AbstractC3809q abstractC3809q = c3490c1.f16802f; abstractC3809q != null; abstractC3809q = abstractC3809q.f17997j) {
                        abstractC3809q.mo557u0();
                    }
                }
                c3502g0.m5434h0((InterfaceC3679g2) AbstractC2418w.m3981y(c3177h, AbstractC3674f1.f17528s));
                AbstractC3809q abstractC3809q2 = c3490c1.f16802f;
                if ((abstractC3809q2.f17995h & 32768) != 0) {
                    while (abstractC3809q2 != null) {
                        if ((abstractC3809q2.f17994g & 32768) != 0) {
                            AbstractC3519m abstractC3519m = abstractC3809q2;
                            ?? r22 = 0;
                            while (abstractC3519m != 0) {
                                if (abstractC3519m instanceof InterfaceC3513k) {
                                    AbstractC3809q abstractC3809q3 = ((AbstractC3809q) ((InterfaceC3513k) abstractC3519m)).f17992e;
                                    if (abstractC3809q3.f18005r) {
                                        AbstractC3500f1.m5389c(abstractC3809q3);
                                    } else {
                                        abstractC3809q3.f18001n = true;
                                    }
                                } else if ((abstractC3519m.f17994g & 32768) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                    AbstractC3809q abstractC3809q4 = abstractC3519m.f16962t;
                                    int i7 = 0;
                                    abstractC3519m = abstractC3519m;
                                    r22 = r22;
                                    while (abstractC3809q4 != null) {
                                        if ((abstractC3809q4.f17994g & 32768) != 0) {
                                            i7++;
                                            r22 = r22;
                                            if (i7 == 1) {
                                                abstractC3519m = abstractC3809q4;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3519m != 0) {
                                                    r22.m4300b(abstractC3519m);
                                                    abstractC3519m = 0;
                                                }
                                                r22.m4300b(abstractC3809q4);
                                            }
                                        }
                                        abstractC3809q4 = abstractC3809q4.f17997j;
                                        abstractC3519m = abstractC3519m;
                                        r22 = r22;
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC3519m = AbstractC3498f.m5366f(r22);
                            }
                        }
                        if ((abstractC3809q2.f17995h & 32768) != 0) {
                            abstractC3809q2 = abstractC3809q2.f17997j;
                        }
                    }
                }
                return C1694m.f10482a;
        }
    }
}
