package p117p1;

import java.util.ArrayList;
import java.util.List;
import p027d1.C0464b;
import p034e0.C0614k0;
import p037e3.C0691e;
import p060h5.C1813u;
import p077k.AbstractC2211q;
import p077k.C2184c0;
import p077k.C2209p;
import p084l.AbstractC2334a;
import p101n0.C2705e;
import p146t1.InterfaceC3238v;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.InterfaceC3539s1;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.h */
/* loaded from: classes.dex */
public final class C2856h extends C2858i {

    /* renamed from: c */
    public final AbstractC3809q f14970c;

    /* renamed from: d */
    public final C0691e f14971d;

    /* renamed from: e */
    public final C2209p f14972e;

    /* renamed from: f */
    public AbstractC3497e1 f14973f;

    /* renamed from: g */
    public C2859j f14974g;

    /* renamed from: h */
    public boolean f14975h;

    /* renamed from: i */
    public boolean f14976i;

    /* renamed from: j */
    public boolean f14977j;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, e3.e] */
    public C2856h(AbstractC3809q abstractC3809q) {
        this.f14970c = abstractC3809q;
        ?? obj = new Object();
        obj.f2245b = new long[2];
        this.f14971d = obj;
        this.f14972e = new C2209p(2);
        this.f14976i = true;
        this.f14977j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r5v1, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // p117p1.C2858i
    /* renamed from: a */
    public final boolean mo4527a(C2209p c2209p, InterfaceC3238v interfaceC3238v, C0614k0 c0614k0, boolean z7) {
        C2209p c2209p2;
        C0691e c0691e;
        Object obj;
        boolean z8;
        boolean z9;
        C2859j c2859j;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        int i8;
        boolean z14;
        int i9;
        boolean z15;
        List list;
        int i10;
        List list2;
        C2868s c2868s;
        InterfaceC3238v interfaceC3238v2 = interfaceC3238v;
        boolean mo4527a = super.mo4527a(c2209p, interfaceC3238v, c0614k0, z7);
        AbstractC3519m abstractC3519m = this.f14970c;
        boolean z16 = true;
        if (abstractC3519m.f18005r) {
            ?? r8 = 0;
            while (abstractC3519m != 0) {
                if (abstractC3519m instanceof InterfaceC3539s1) {
                    this.f14973f = AbstractC3498f.m5380t((InterfaceC3539s1) abstractC3519m, 16);
                } else if ((abstractC3519m.f17994g & 16) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                    AbstractC3809q abstractC3809q = abstractC3519m.f16962t;
                    int i11 = 0;
                    abstractC3519m = abstractC3519m;
                    r8 = r8;
                    while (abstractC3809q != null) {
                        if ((abstractC3809q.f17994g & 16) != 0) {
                            i11++;
                            r8 = r8;
                            if (i11 == 1) {
                                abstractC3519m = abstractC3809q;
                            } else {
                                if (r8 == 0) {
                                    r8 = new C2705e(new AbstractC3809q[16]);
                                }
                                if (abstractC3519m != 0) {
                                    r8.m4300b(abstractC3519m);
                                    abstractC3519m = 0;
                                }
                                r8.m4300b(abstractC3809q);
                            }
                        }
                        abstractC3809q = abstractC3809q.f17997j;
                        abstractC3519m = abstractC3519m;
                        r8 = r8;
                    }
                    if (i11 == 1) {
                    }
                }
                abstractC3519m = AbstractC3498f.m5366f(r8);
            }
            if (this.f14973f != null) {
                int m3616c = c2209p.m3616c();
                int i12 = 0;
                while (true) {
                    c2209p2 = this.f14972e;
                    c0691e = this.f14971d;
                    if (i12 >= m3616c) {
                        break;
                    }
                    long m3614a = c2209p.m3614a(i12);
                    C2868s c2868s2 = (C2868s) c2209p.m3617d(i12);
                    if (c0691e.m1478c(m3614a)) {
                        boolean z17 = z16;
                        long j6 = c2868s2.f15012g;
                        List list3 = c2868s2.f15016k;
                        long j7 = c2868s2.f15008c;
                        if ((((j6 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j7 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z15 = z17;
                            List list4 = C1813u.f10860e;
                            if (list3 == null) {
                                list = list4;
                            } else {
                                list = list3;
                            }
                            z14 = mo4527a;
                            ArrayList arrayList = new ArrayList(list.size());
                            if (list3 == null) {
                                list3 = list4;
                            }
                            int size = list3.size();
                            i9 = m3616c;
                            int i13 = 0;
                            while (i13 < size) {
                                int i14 = size;
                                C2846c c2846c = (C2846c) list3.get(i13);
                                long j8 = m3614a;
                                List list5 = list3;
                                long j9 = c2846c.f14939b;
                                if ((((j9 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    list2 = list5;
                                    c2868s = c2868s2;
                                    long j10 = c2846c.f14938a;
                                    i10 = i13;
                                    AbstractC3497e1 abstractC3497e1 = this.f14973f;
                                    AbstractC3367j.m5097b(abstractC3497e1);
                                    arrayList.add(new C2846c(j10, abstractC3497e1.m5342e1(interfaceC3238v2, j9), c2846c.f14940c));
                                } else {
                                    i10 = i13;
                                    list2 = list5;
                                    c2868s = c2868s2;
                                }
                                i13 = i10 + 1;
                                list3 = list2;
                                size = i14;
                                m3614a = j8;
                                c2868s2 = c2868s;
                            }
                            long j11 = m3614a;
                            AbstractC3497e1 abstractC3497e12 = this.f14973f;
                            AbstractC3367j.m5097b(abstractC3497e12);
                            long m5342e1 = abstractC3497e12.m5342e1(interfaceC3238v2, j6);
                            AbstractC3497e1 abstractC3497e13 = this.f14973f;
                            AbstractC3367j.m5097b(abstractC3497e13);
                            C2868s c2868s3 = new C2868s(c2868s2.f15006a, c2868s2.f15007b, abstractC3497e13.m5342e1(interfaceC3238v2, j7), c2868s2.f15009d, c2868s2.f15010e, c2868s2.f15011f, m5342e1, c2868s2.f15013h, c2868s2.f15014i, arrayList, c2868s2.f15015j, c2868s2.f15017l);
                            C2868s c2868s4 = c2868s2.f15020o;
                            if (c2868s4 == null) {
                                c2868s4 = c2868s2;
                            }
                            c2868s3.f15020o = c2868s4;
                            C2868s c2868s5 = c2868s2.f15020o;
                            if (c2868s5 != null) {
                                c2868s2 = c2868s5;
                            }
                            c2868s3.f15020o = c2868s2;
                            c2209p2.m3615b(j11, c2868s3);
                        } else {
                            z14 = mo4527a;
                            i9 = m3616c;
                            z15 = z17;
                        }
                    } else {
                        z14 = mo4527a;
                        i9 = m3616c;
                        z15 = z16;
                    }
                    i12++;
                    interfaceC3238v2 = interfaceC3238v;
                    z16 = z15;
                    m3616c = i9;
                    mo4527a = z14;
                }
                boolean z18 = mo4527a;
                boolean z19 = z16;
                if (c2209p2.m3616c() == 0) {
                    c0691e.f2244a = 0;
                    this.f14989a.m4305g();
                    return z19;
                }
                int i15 = c0691e.f2244a;
                while (true) {
                    i15--;
                    if (-1 >= i15) {
                        break;
                    }
                    long j12 = ((long[]) c0691e.f2245b)[i15];
                    if (c2209p.f12718e) {
                        int i16 = c2209p.f12721h;
                        long[] jArr = c2209p.f12719f;
                        Object[] objArr = c2209p.f12720g;
                        int i17 = 0;
                        for (int i18 = 0; i18 < i16; i18++) {
                            Object obj2 = objArr[i18];
                            if (obj2 != AbstractC2211q.f12723a) {
                                if (i18 != i17) {
                                    jArr[i17] = jArr[i18];
                                    objArr[i17] = obj2;
                                    objArr[i18] = null;
                                }
                                i17++;
                            }
                        }
                        c2209p.f12718e = false;
                        c2209p.f12721h = i17;
                    }
                    if (AbstractC2334a.m3711b(c2209p.f12719f, c2209p.f12721h, j12) < 0 && i15 < (i8 = c0691e.f2244a)) {
                        int i19 = i8 - 1;
                        int i20 = i15;
                        while (i20 < i19) {
                            long[] jArr2 = (long[]) c0691e.f2245b;
                            int i21 = i20 + 1;
                            jArr2[i20] = jArr2[i21];
                            i20 = i21;
                        }
                        c0691e.f2244a--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(c2209p2.m3616c());
                int m3616c2 = c2209p2.m3616c();
                for (int i22 = 0; i22 < m3616c2; i22++) {
                    arrayList2.add(c2209p2.m3617d(i22));
                }
                C2859j c2859j2 = new C2859j(arrayList2, c0614k0);
                int size2 = arrayList2.size();
                int i23 = 0;
                while (true) {
                    if (i23 < size2) {
                        obj = arrayList2.get(i23);
                        if (c0614k0.m1250a(((C2868s) obj).f15006a)) {
                            break;
                        }
                        i23++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                C2868s c2868s6 = (C2868s) obj;
                if (c2868s6 != null) {
                    boolean z20 = c2868s6.f15009d;
                    if (!z7) {
                        z8 = false;
                        this.f14976i = false;
                    } else {
                        z8 = false;
                        if (!this.f14976i && (z20 || c2868s6.f15013h)) {
                            AbstractC3497e1 abstractC3497e14 = this.f14973f;
                            AbstractC3367j.m5097b(abstractC3497e14);
                            long j13 = abstractC3497e14.f16055g;
                            long j14 = c2868s6.f15008c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j14 & 4294967295L));
                            int i24 = (int) (j13 >> 32);
                            int i25 = (int) (j13 & 4294967295L);
                            if (intBitsToFloat < 0.0f) {
                                z10 = z19;
                            } else {
                                z10 = false;
                            }
                            if (intBitsToFloat > i24) {
                                z11 = z19;
                            } else {
                                z11 = false;
                            }
                            boolean z21 = z11 | z10;
                            if (intBitsToFloat2 < 0.0f) {
                                z12 = z19;
                            } else {
                                z12 = false;
                            }
                            boolean z22 = z12 | z21;
                            if (intBitsToFloat2 > i25) {
                                z13 = z19;
                            } else {
                                z13 = false;
                            }
                            this.f14976i = !(z13 | z22);
                        }
                    }
                    boolean z23 = this.f14976i;
                    boolean z24 = this.f14975h;
                    int i26 = 5;
                    if (z23 != z24 && ((i7 = c2859j2.f14994d) == 3 || i7 == 4 || i7 == 5)) {
                        if (z23) {
                            i26 = 4;
                        }
                        c2859j2.f14994d = i26;
                    } else {
                        int i27 = c2859j2.f14994d;
                        if (i27 == 4 && z24 && !this.f14977j) {
                            c2859j2.f14994d = 3;
                        } else if (i27 == 5 && z23 && z20) {
                            c2859j2.f14994d = 3;
                        }
                    }
                } else {
                    z8 = false;
                }
                if (!z18 && c2859j2.f14994d == 3 && (c2859j = this.f14974g) != null) {
                    ?? r12 = c2859j.f14991a;
                    int size3 = r12.size();
                    ?? r42 = c2859j2.f14991a;
                    if (size3 == r42.size()) {
                        int size4 = r42.size();
                        for (?? r52 = z8; r52 < size4; r52++) {
                            if (C0464b.m1006b(((C2868s) r12.get(r52)).f15008c, ((C2868s) r42.get(r52)).f15008c)) {
                            }
                        }
                        z9 = z8;
                        this.f14974g = c2859j2;
                        return z9;
                    }
                }
                z9 = z19;
                this.f14974g = c2859j2;
                return z9;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // p117p1.C2858i
    /* renamed from: b */
    public final void mo4528b(C0614k0 c0614k0) {
        super.mo4528b(c0614k0);
        C2859j c2859j = this.f14974g;
        if (c2859j == null) {
            return;
        }
        this.f14975h = this.f14976i;
        ?? r12 = c2859j.f14991a;
        int size = r12.size();
        boolean z7 = false;
        for (int i7 = 0; i7 < size; i7++) {
            C2868s c2868s = (C2868s) r12.get(i7);
            boolean z8 = c2868s.f15009d;
            long j6 = c2868s.f15006a;
            boolean m1250a = c0614k0.m1250a(j6);
            boolean z9 = this.f14976i;
            if ((!z8 && !m1250a) || (!z8 && !z9)) {
                this.f14971d.m1480e(j6);
            }
        }
        this.f14976i = false;
        if (c2859j.f14994d == 5) {
            z7 = true;
        }
        this.f14977j = z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [n0.e] */
    /* renamed from: c */
    public final void m4529c() {
        C2705e c2705e = this.f14989a;
        Object[] objArr = c2705e.f14517e;
        int i7 = c2705e.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            ((C2856h) objArr[i8]).m4529c();
        }
        AbstractC3519m abstractC3519m = this.f14970c;
        ?? r32 = 0;
        while (abstractC3519m != 0) {
            if (abstractC3519m instanceof InterfaceC3539s1) {
                ((InterfaceC3539s1) abstractC3519m).mo548i0();
            } else if ((abstractC3519m.f17994g & 16) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                AbstractC3809q abstractC3809q = abstractC3519m.f16962t;
                int i9 = 0;
                abstractC3519m = abstractC3519m;
                r32 = r32;
                while (abstractC3809q != null) {
                    if ((abstractC3809q.f17994g & 16) != 0) {
                        i9++;
                        r32 = r32;
                        if (i9 == 1) {
                            abstractC3519m = abstractC3809q;
                        } else {
                            if (r32 == 0) {
                                r32 = new C2705e(new AbstractC3809q[16]);
                            }
                            if (abstractC3519m != 0) {
                                r32.m4300b(abstractC3519m);
                                abstractC3519m = 0;
                            }
                            r32.m4300b(abstractC3809q);
                        }
                    }
                    abstractC3809q = abstractC3809q.f17997j;
                    abstractC3519m = abstractC3519m;
                    r32 = r32;
                }
                if (i9 == 1) {
                }
            }
            abstractC3519m = AbstractC3498f.m5366f(r32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008d A[LOOP:0: B:5:0x008b->B:6:0x008d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4530d(C0614k0 c0614k0) {
        boolean z7;
        int i7;
        int i8;
        C2209p c2209p = this.f14972e;
        if (c2209p.m3616c() != 0) {
            AbstractC3809q abstractC3809q = this.f14970c;
            if (abstractC3809q.f18005r) {
                C2859j c2859j = this.f14974g;
                AbstractC3367j.m5097b(c2859j);
                AbstractC3497e1 abstractC3497e1 = this.f14973f;
                AbstractC3367j.m5097b(abstractC3497e1);
                long j6 = abstractC3497e1.f16055g;
                AbstractC3519m abstractC3519m = abstractC3809q;
                ?? r8 = 0;
                while (true) {
                    z7 = true;
                    if (abstractC3519m == 0) {
                        break;
                    }
                    if (abstractC3519m instanceof InterfaceC3539s1) {
                        ((InterfaceC3539s1) abstractC3519m).mo545A(c2859j, EnumC2860k.f14997g, j6);
                    } else if ((abstractC3519m.f17994g & 16) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                        AbstractC3809q abstractC3809q2 = abstractC3519m.f16962t;
                        int i9 = 0;
                        abstractC3519m = abstractC3519m;
                        r8 = r8;
                        while (abstractC3809q2 != null) {
                            if ((abstractC3809q2.f17994g & 16) != 0) {
                                i9++;
                                r8 = r8;
                                if (i9 == 1) {
                                    abstractC3519m = abstractC3809q2;
                                } else {
                                    if (r8 == 0) {
                                        r8 = new C2705e(new AbstractC3809q[16]);
                                    }
                                    if (abstractC3519m != 0) {
                                        r8.m4300b(abstractC3519m);
                                        abstractC3519m = 0;
                                    }
                                    r8.m4300b(abstractC3809q2);
                                }
                            }
                            abstractC3809q2 = abstractC3809q2.f17997j;
                            abstractC3519m = abstractC3519m;
                            r8 = r8;
                        }
                        if (i9 == 1) {
                        }
                    }
                    abstractC3519m = AbstractC3498f.m5366f(r8);
                }
                if (abstractC3809q.f18005r) {
                    C2705e c2705e = this.f14989a;
                    Object[] objArr = c2705e.f14517e;
                    int i10 = c2705e.f14519g;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((C2856h) objArr[i11]).m4530d(c0614k0);
                    }
                }
                mo4528b(c0614k0);
                i7 = c2209p.f12721h;
                Object[] objArr2 = c2209p.f12720g;
                for (i8 = 0; i8 < i7; i8++) {
                    objArr2[i8] = null;
                }
                c2209p.f12721h = 0;
                c2209p.f12718e = false;
                this.f14973f = null;
                return z7;
            }
        }
        z7 = false;
        mo4528b(c0614k0);
        i7 = c2209p.f12721h;
        Object[] objArr22 = c2209p.f12720g;
        while (i8 < i7) {
        }
        c2209p.f12721h = 0;
        c2209p.f12718e = false;
        this.f14973f = null;
        return z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r0v3, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* renamed from: e */
    public final boolean m4531e(C0614k0 c0614k0, boolean z7) {
        if (this.f14972e.m3616c() == 0) {
            return false;
        }
        AbstractC3519m abstractC3519m = this.f14970c;
        if (!abstractC3519m.f18005r) {
            return false;
        }
        C2859j c2859j = this.f14974g;
        AbstractC3367j.m5097b(c2859j);
        AbstractC3497e1 abstractC3497e1 = this.f14973f;
        AbstractC3367j.m5097b(abstractC3497e1);
        long j6 = abstractC3497e1.f16055g;
        AbstractC3519m abstractC3519m2 = abstractC3519m;
        ?? r7 = 0;
        while (abstractC3519m2 != 0) {
            if (abstractC3519m2 instanceof InterfaceC3539s1) {
                ((InterfaceC3539s1) abstractC3519m2).mo545A(c2859j, EnumC2860k.f14995e, j6);
            } else if ((abstractC3519m2.f17994g & 16) != 0 && (abstractC3519m2 instanceof AbstractC3519m)) {
                AbstractC3809q abstractC3809q = abstractC3519m2.f16962t;
                int i7 = 0;
                abstractC3519m2 = abstractC3519m2;
                r7 = r7;
                while (abstractC3809q != null) {
                    if ((abstractC3809q.f17994g & 16) != 0) {
                        i7++;
                        r7 = r7;
                        if (i7 == 1) {
                            abstractC3519m2 = abstractC3809q;
                        } else {
                            if (r7 == 0) {
                                r7 = new C2705e(new AbstractC3809q[16]);
                            }
                            if (abstractC3519m2 != 0) {
                                r7.m4300b(abstractC3519m2);
                                abstractC3519m2 = 0;
                            }
                            r7.m4300b(abstractC3809q);
                        }
                    }
                    abstractC3809q = abstractC3809q.f17997j;
                    abstractC3519m2 = abstractC3519m2;
                    r7 = r7;
                }
                if (i7 == 1) {
                }
            }
            abstractC3519m2 = AbstractC3498f.m5366f(r7);
        }
        if (abstractC3519m.f18005r) {
            C2705e c2705e = this.f14989a;
            Object[] objArr = c2705e.f14517e;
            int i8 = c2705e.f14519g;
            for (int i9 = 0; i9 < i8; i9++) {
                C2856h c2856h = (C2856h) objArr[i9];
                AbstractC3367j.m5097b(this.f14973f);
                c2856h.m4531e(c0614k0, z7);
            }
        }
        if (abstractC3519m.f18005r) {
            ?? r14 = 0;
            while (abstractC3519m != 0) {
                if (abstractC3519m instanceof InterfaceC3539s1) {
                    ((InterfaceC3539s1) abstractC3519m).mo545A(c2859j, EnumC2860k.f14996f, j6);
                } else if ((abstractC3519m.f17994g & 16) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                    AbstractC3809q abstractC3809q2 = abstractC3519m.f16962t;
                    int i10 = 0;
                    abstractC3519m = abstractC3519m;
                    r14 = r14;
                    while (abstractC3809q2 != null) {
                        if ((abstractC3809q2.f17994g & 16) != 0) {
                            i10++;
                            r14 = r14;
                            if (i10 == 1) {
                                abstractC3519m = abstractC3809q2;
                            } else {
                                if (r14 == 0) {
                                    r14 = new C2705e(new AbstractC3809q[16]);
                                }
                                if (abstractC3519m != 0) {
                                    r14.m4300b(abstractC3519m);
                                    abstractC3519m = 0;
                                }
                                r14.m4300b(abstractC3809q2);
                            }
                        }
                        abstractC3809q2 = abstractC3809q2.f17997j;
                        abstractC3519m = abstractC3519m;
                        r14 = r14;
                    }
                    if (i10 == 1) {
                    }
                }
                abstractC3519m = AbstractC3498f.m5366f(r14);
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m4532f(long j6, C2184c0 c2184c0) {
        C0691e c0691e = this.f14971d;
        if (c0691e.m1478c(j6) && c2184c0.m3561f(this) < 0) {
            c0691e.m1480e(j6);
            C2209p c2209p = this.f14972e;
            int m3711b = AbstractC2334a.m3711b(c2209p.f12719f, c2209p.f12721h, j6);
            if (m3711b >= 0) {
                Object[] objArr = c2209p.f12720g;
                Object obj = objArr[m3711b];
                Object obj2 = AbstractC2211q.f12723a;
                if (obj != obj2) {
                    objArr[m3711b] = obj2;
                    c2209p.f12718e = true;
                }
            }
        }
        C2705e c2705e = this.f14989a;
        Object[] objArr2 = c2705e.f14517e;
        int i7 = c2705e.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            ((C2856h) objArr2[i8]).m4532f(j6, c2184c0);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f14970c + ", children=" + this.f14989a + ", pointerIds=" + this.f14971d + ')';
    }
}
