package p122q;

import p015b6.C0310q;
import p032d6.AbstractC0525d0;
import p039e5.C1339uj;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.C1992r5;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2581a;
import p098m5.AbstractC2583c;
import p098m5.AbstractC2589i;
import p098m5.AbstractC2590j;
import p117p1.AbstractC2866q;
import p117p1.C2855g0;
import p117p1.C2859j;
import p117p1.C2868s;
import p117p1.EnumC2860k;
import p117p1.InterfaceC2872w;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.x1 */
/* loaded from: classes.dex */
public abstract class AbstractC2959x1 {

    /* renamed from: a */
    public static final C2910h0 f15352a = new C2910h0(3, null, 2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[LOOP:0: B:11:0x004b->B:12:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4597a(C2855g0 c2855g0, AbstractC2581a abstractC2581a) {
        C2938q1 c2938q1;
        int i7;
        Object obj;
        int size;
        int i8;
        int i9;
        int size2;
        if (abstractC2581a instanceof C2938q1) {
            C2938q1 c2938q12 = (C2938q1) abstractC2581a;
            int i10 = c2938q12.f15264j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2938q12.f15264j = i10 - Integer.MIN_VALUE;
                c2938q1 = c2938q12;
                Object obj2 = c2938q1.f15263i;
                i7 = c2938q1.f15264j;
                if (i7 == 0) {
                    if (i7 == 1) {
                        C2855g0 c2855g02 = c2938q1.f15262h;
                        AbstractC1793a0.m2972L(obj2);
                        c2855g0 = c2855g02;
                        C2859j c2859j = (C2859j) obj2;
                        ?? r12 = c2859j.f14991a;
                        size = r12.size();
                        i8 = 0;
                        for (i9 = 0; i9 < size; i9++) {
                            ((C2868s) r12.get(i9)).m4550a();
                        }
                        ?? r8 = c2859j.f14991a;
                        size2 = r8.size();
                        while (i8 < size2) {
                            if (((C2868s) r8.get(i8)).f15009d) {
                                c2938q1.f15262h = c2855g0;
                                c2938q1.f15264j = 1;
                                obj2 = c2855g0.m4514a(EnumC2860k.f14996f, c2938q1);
                                obj = EnumC2465a.f13750e;
                                c2855g0 = c2855g0;
                                if (obj2 == obj) {
                                    return obj;
                                }
                                C2859j c2859j2 = (C2859j) obj2;
                                ?? r122 = c2859j2.f14991a;
                                size = r122.size();
                                i8 = 0;
                                while (i9 < size) {
                                }
                                ?? r82 = c2859j2.f14991a;
                                size2 = r82.size();
                                while (i8 < size2) {
                                }
                            } else {
                                i8++;
                            }
                        }
                        return C1694m.f10482a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj2);
                c2938q1.f15262h = c2855g0;
                c2938q1.f15264j = 1;
                obj2 = c2855g0.m4514a(EnumC2860k.f14996f, c2938q1);
                obj = EnumC2465a.f13750e;
                c2855g0 = c2855g0;
                if (obj2 == obj) {
                }
                C2859j c2859j22 = (C2859j) obj2;
                ?? r1222 = c2859j22.f14991a;
                size = r1222.size();
                i8 = 0;
                while (i9 < size) {
                }
                ?? r822 = c2859j22.f14991a;
                size2 = r822.size();
                while (i8 < size2) {
                }
                return C1694m.f10482a;
            }
        }
        c2938q1 = new AbstractC2583c(abstractC2581a);
        Object obj22 = c2938q1.f15263i;
        i7 = c2938q1.f15264j;
        if (i7 == 0) {
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m4598b(p117p1.C2855g0 r9, boolean r10, p117p1.EnumC2860k r11, p098m5.AbstractC2581a r12) {
        /*
            boolean r0 = r12 instanceof p122q.C2932o1
            if (r0 == 0) goto L13
            r0 = r12
            q.o1 r0 = (p122q.C2932o1) r0
            int r1 = r0.f15247l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15247l = r1
            goto L18
        L13:
            q.o1 r0 = new q.o1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f15246k
            int r1 = r0.f15247l
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            boolean r9 = r0.f15245j
            p1.k r10 = r0.f15244i
            p1.g0 r11 = r0.f15243h
            p060h5.AbstractC1793a0.m2972L(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L4b
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            p060h5.AbstractC1793a0.m2972L(r12)
        L3a:
            r0.f15243h = r9
            r0.f15244i = r11
            r0.f15245j = r10
            r0.f15247l = r2
            java.lang.Object r12 = r9.m4514a(r11, r0)
            l5.a r1 = p090l5.EnumC2465a.f13750e
            if (r12 != r1) goto L4b
            return r1
        L4b:
            p1.j r12 = (p117p1.C2859j) r12
            java.lang.Object r1 = r12.f14991a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L55:
            if (r5 >= r3) goto L7c
            java.lang.Object r6 = r1.get(r5)
            p1.s r6 = (p117p1.C2868s) r6
            if (r10 == 0) goto L71
            boolean r7 = r6.m4551b()
            if (r7 != 0) goto L6f
            boolean r7 = r6.f15013h
            if (r7 != 0) goto L6f
            boolean r6 = r6.f15009d
            if (r6 == 0) goto L6f
            r6 = r2
            goto L75
        L6f:
            r6 = r4
            goto L75
        L71:
            boolean r6 = p117p1.AbstractC2866q.m4542a(r6)
        L75:
            if (r6 != 0) goto L79
            r1 = r4
            goto L7d
        L79:
            int r5 = r5 + 1
            goto L55
        L7c:
            r1 = r2
        L7d:
            if (r1 == 0) goto L3a
            java.lang.Object r9 = r12.f14991a
            java.lang.Object r9 = r9.get(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p122q.AbstractC2959x1.m4598b(p1.g0, boolean, p1.k, m5.a):java.lang.Object");
    }

    /* renamed from: c */
    public static /* synthetic */ Object m4599c(C2855g0 c2855g0, AbstractC2589i abstractC2589i, int i7) {
        boolean z7;
        EnumC2860k enumC2860k;
        if ((i7 & 1) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if ((i7 & 2) != 0) {
            enumC2860k = EnumC2860k.f14996f;
        } else {
            enumC2860k = EnumC2860k.f14995e;
        }
        return m4598b(c2855g0, z7, enumC2860k, abstractC2589i);
    }

    /* renamed from: d */
    public static Object m4600d(InterfaceC2872w interfaceC2872w, C0310q c0310q, C1992r5 c1992r5, InterfaceC3279c interfaceC3279c, InterfaceC2313c interfaceC2313c, int i7) {
        C0310q c0310q2;
        InterfaceC3279c interfaceC3279c2;
        if ((i7 & 1) != 0) {
            c0310q2 = null;
        } else {
            c0310q2 = c0310q;
        }
        AbstractC2590j abstractC2590j = c1992r5;
        if ((i7 & 4) != 0) {
            abstractC2590j = f15352a;
        }
        AbstractC2590j abstractC2590j2 = abstractC2590j;
        if ((i7 & 8) != 0) {
            interfaceC3279c2 = null;
        } else {
            interfaceC3279c2 = interfaceC3279c;
        }
        Object m1130h = AbstractC0525d0.m1130h(new C1339uj(interfaceC2872w, abstractC2590j2, (Object) null, c0310q2, interfaceC3279c2, (InterfaceC2313c) null, 6), interfaceC2313c);
        if (m1130h == EnumC2465a.f13750e) {
            return m1130h;
        }
        return C1694m.f10482a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        if (r15 == r5) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009e -> B:11:0x002e). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4601e(C2855g0 c2855g0, EnumC2860k enumC2860k, AbstractC2581a abstractC2581a) {
        C2956w1 c2956w1;
        int i7;
        C2855g0 c2855g02;
        EnumC2860k enumC2860k2;
        int size;
        int i8;
        if (abstractC2581a instanceof C2956w1) {
            C2956w1 c2956w12 = (C2956w1) abstractC2581a;
            int i9 = c2956w12.f15344k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2956w12.f15344k = i9 - Integer.MIN_VALUE;
                c2956w1 = c2956w12;
                Object obj = c2956w1.f15343j;
                i7 = c2956w1.f15344k;
                Object obj2 = EnumC2465a.f13750e;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            enumC2860k2 = c2956w1.f15342i;
                            C2855g0 c2855g03 = c2956w1.f15341h;
                            AbstractC1793a0.m2972L(obj);
                            C2855g0 c2855g04 = c2855g03;
                            C2855g0 c2855g05 = c2855g04;
                            enumC2860k = enumC2860k2;
                            c2855g0 = c2855g05;
                            ?? r15 = ((C2859j) obj).f14991a;
                            int size2 = r15.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                if (((C2868s) r15.get(i10)).m4551b()) {
                                    return null;
                                }
                            }
                            c2956w1.f15341h = c2855g0;
                            c2956w1.f15342i = enumC2860k;
                            c2956w1.f15344k = 1;
                            obj = c2855g0.m4514a(enumC2860k, c2956w1);
                            if (obj != obj2) {
                                EnumC2860k enumC2860k3 = enumC2860k;
                                c2855g02 = c2855g0;
                                enumC2860k2 = enumC2860k3;
                                ?? r152 = ((C2859j) obj).f14991a;
                                size = r152.size();
                                for (i8 = 0; i8 < size; i8++) {
                                    if (!AbstractC2866q.m4543b((C2868s) r152.get(i8))) {
                                        int size3 = r152.size();
                                        for (int i11 = 0; i11 < size3; i11++) {
                                            C2868s c2868s = (C2868s) r152.get(i11);
                                            if (c2868s.m4551b() || AbstractC2866q.m4545d(c2868s, c2855g02.f14969j.f14980C, c2855g02.m4516d())) {
                                                return null;
                                            }
                                        }
                                        c2956w1.f15341h = c2855g02;
                                        c2956w1.f15342i = enumC2860k2;
                                        c2956w1.f15344k = 2;
                                        obj = c2855g02.m4514a(EnumC2860k.f14997g, c2956w1);
                                        c2855g04 = c2855g02;
                                    }
                                }
                                return r152.get(0);
                            }
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    enumC2860k2 = c2956w1.f15342i;
                    C2855g0 c2855g06 = c2956w1.f15341h;
                    AbstractC1793a0.m2972L(obj);
                    c2855g02 = c2855g06;
                    ?? r1522 = ((C2859j) obj).f14991a;
                    size = r1522.size();
                    while (i8 < size) {
                    }
                    return r1522.get(0);
                }
                AbstractC1793a0.m2972L(obj);
                c2956w1.f15341h = c2855g0;
                c2956w1.f15342i = enumC2860k;
                c2956w1.f15344k = 1;
                obj = c2855g0.m4514a(enumC2860k, c2956w1);
                if (obj != obj2) {
                }
                return obj2;
            }
        }
        c2956w1 = new AbstractC2583c(abstractC2581a);
        Object obj3 = c2956w1.f15343j;
        i7 = c2956w1.f15344k;
        Object obj22 = EnumC2465a.f13750e;
        if (i7 == 0) {
        }
    }
}
