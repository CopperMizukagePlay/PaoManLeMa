package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p001a0.C0012c2;
import p001a0.C0070r0;
import p031d5.C0512l;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p035e1.InterfaceC0682x;
import p057h1.C1752b;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1810r;
import p065i2.AbstractC2064e;
import p067i4.AbstractC2072e;
import p077k.AbstractC2210p0;
import p077k.AbstractC2212q0;
import p077k.C2194h0;
import p077k.C2196i0;
import p100n.InterfaceC2627a0;
import p140s2.C3091a;
import p140s2.C3100j;
import p146t1.AbstractC3239v0;
import p152u.C3322j;
import p152u.C3326n;
import p158u5.AbstractC3367j;
import p160v.C3397a0;
import p160v.C3400b0;
import p160v.C3403c0;
import p160v.C3410g;
import p160v.C3424n;
import p160v.C3444x;
import p160v.C3448z;
import p160v.InterfaceC3415i0;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3556y0;
import p177x0.AbstractC3809q;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.foundation.lazy.layout.a */
/* loaded from: classes.dex */
public final class C0156a {

    /* renamed from: a */
    public final C2194h0 f676a;

    /* renamed from: b */
    public InterfaceC3415i0 f677b;

    /* renamed from: c */
    public int f678c;

    /* renamed from: d */
    public final C2196i0 f679d;

    /* renamed from: e */
    public final ArrayList f680e;

    /* renamed from: f */
    public final ArrayList f681f;

    /* renamed from: g */
    public final ArrayList f682g;

    /* renamed from: h */
    public final ArrayList f683h;

    /* renamed from: i */
    public final ArrayList f684i;

    /* renamed from: j */
    public C3448z f685j;

    /* renamed from: k */
    public final InterfaceC3810r f686k;

    public C0156a() {
        long[] jArr = AbstractC2210p0.f12722a;
        this.f676a = new C2194h0();
        int i7 = AbstractC2212q0.f12726a;
        this.f679d = new C2196i0();
        this.f680e = new ArrayList();
        this.f681f = new ArrayList();
        this.f682g = new ArrayList();
        this.f683h = new ArrayList();
        this.f684i = new ArrayList();
        this.f686k = new AbstractC3556y0(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* renamed from: a */
            public final C0156a f670a;

            {
                this.f670a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && AbstractC3367j.m5096a(this.f670a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f670a)) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [v.z, x0.q] */
            @Override // p162v1.AbstractC3556y0
            /* renamed from: h */
            public final AbstractC3809q mo312h() {
                ?? abstractC3809q = new AbstractC3809q();
                abstractC3809q.f16661s = this.f670a;
                return abstractC3809q;
            }

            public final int hashCode() {
                return this.f670a.hashCode();
            }

            @Override // p162v1.AbstractC3556y0
            /* renamed from: i */
            public final void mo313i(AbstractC3809q abstractC3809q) {
                C3448z c3448z = (C3448z) abstractC3809q;
                C0156a c0156a = c3448z.f16661s;
                C0156a c0156a2 = this.f670a;
                if (!AbstractC3367j.m5096a(c0156a, c0156a2) && c3448z.f17992e.f18005r) {
                    c3448z.f16661s.m367e();
                    c0156a2.f685j = c3448z;
                    c3448z.f16661s = c0156a2;
                }
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f670a + ')';
            }
        };
    }

    /* renamed from: b */
    public static void m362b(C3326n c3326n, int i7, C3397a0 c3397a0) {
        int i8;
        int i9 = 0;
        long m5062a = c3326n.m5062a(0);
        if (true & true) {
            i8 = (int) (m5062a >> 32);
        } else {
            i8 = 0;
        }
        if ((1 & 2) != 0) {
            i7 = (int) (m5062a & 4294967295L);
        }
        long j6 = (i8 << 32) | (i7 & 4294967295L);
        C3444x[] c3444xArr = c3397a0.f16497a;
        int length = c3444xArr.length;
        int i10 = 0;
        while (i9 < length) {
            C3444x c3444x = c3444xArr[i9];
            int i11 = i10 + 1;
            if (c3444x != null) {
                c3444x.f16649l = C3100j.m4785c(j6, C3100j.m4784b(c3326n.m5062a(i10), m5062a));
            }
            i9++;
            i10 = i11;
        }
    }

    /* renamed from: g */
    public static int m363g(int[] iArr, C3326n c3326n) {
        c3326n.getClass();
        int i7 = iArr[0] + c3326n.f16343o;
        iArr[0] = i7;
        return Math.max(0, i7);
    }

    /* renamed from: a */
    public final long m364a() {
        ArrayList arrayList = this.f684i;
        int size = arrayList.size();
        long j6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C3444x c3444x = (C3444x) arrayList.get(i7);
            C1752b c1752b = c3444x.f16651n;
            if (c1752b != null) {
                j6 = AbstractC2072e.m3326b(Math.max((int) (j6 >> 32), ((int) (c3444x.f16649l >> 32)) + ((int) (c1752b.f10683u >> 32))), Math.max((int) (j6 & 4294967295L), ((int) (c3444x.f16649l & 4294967295L)) + ((int) (c1752b.f10683u & 4294967295L))));
            }
        }
        return j6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03cd  */
    /* JADX WARN: Type inference failed for: r13v19, types: [k5.h, k5.c] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m365c(int i7, int i8, int i9, ArrayList arrayList, C0512l c0512l, C3322j c3322j, boolean z7, boolean z8, int i10, int i11, InterfaceC0516a0 interfaceC0516a0, InterfaceC0682x interfaceC0682x) {
        C2194h0 c2194h0;
        int i12;
        boolean z9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr;
        ArrayList arrayList5;
        ArrayList arrayList6;
        C2196i0 c2196i0;
        C2194h0 c2194h02;
        int i13;
        int i14;
        C0512l c0512l2;
        int[] iArr2;
        C2194h0 c2194h03;
        int i15;
        int i16;
        int i17;
        Object[] objArr;
        long[] jArr;
        int i18;
        Object[] objArr2;
        int[] iArr3;
        long[] jArr2;
        int i19;
        int i20;
        C2196i0 c2196i02;
        int i21;
        int i22;
        C2194h0 c2194h04;
        C2194h0 c2194h05;
        int i23;
        C3444x[] c3444xArr;
        int[] iArr4;
        int i24;
        int i25;
        int i26;
        C3397a0 c3397a0;
        int i27;
        C3444x c3444x;
        Object obj;
        C3444x c3444x2;
        int i28;
        int i29;
        boolean z10;
        int i30;
        boolean z11;
        C3424n c3424n;
        int i31;
        C3424n c3424n2;
        ArrayList arrayList7 = arrayList;
        InterfaceC3415i0 interfaceC3415i0 = this.f677b;
        this.f677b = c0512l;
        int size = arrayList7.size();
        int i32 = 0;
        int i33 = 0;
        loop0: while (true) {
            c2194h0 = this.f676a;
            if (i33 < size) {
                C3326n c3326n = (C3326n) arrayList7.get(i33);
                int size2 = c3326n.f16330b.size();
                for (int i34 = 0; i34 < size2; i34++) {
                    Object mo4921n = ((AbstractC3239v0) c3326n.f16330b.get(i34)).mo4921n();
                    if (mo4921n instanceof C3424n) {
                        c3424n2 = (C3424n) mo4921n;
                    } else {
                        c3424n2 = null;
                    }
                    if (c3424n2 != null) {
                        break loop0;
                    }
                }
                i33++;
            } else if (c2194h0.m3594i()) {
                m367e();
                return;
            }
        }
        int i35 = this.f678c;
        C3326n c3326n2 = (C3326n) AbstractC1805m.m3047k0(arrayList7);
        if (c3326n2 != null) {
            i12 = c3326n2.f16329a;
        } else {
            i12 = 0;
        }
        this.f678c = i12;
        long m3234d = AbstractC2064e.m3234d(0, i7);
        if (!z7 && z8) {
            z9 = false;
        } else {
            z9 = true;
        }
        Object[] objArr3 = c2194h0.f12677b;
        long[] jArr3 = c2194h0.f12676a;
        int length = jArr3.length - 2;
        C3444x c3444x3 = null;
        C2196i0 c2196i03 = this.f679d;
        if (length >= 0) {
            while (true) {
                long j6 = jArr3[i32];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i36 = 8 - ((~(i32 - length)) >>> 31);
                    int i37 = 0;
                    while (i37 < i36) {
                        if ((j6 & 255) < 128) {
                            i31 = i37;
                            c2196i03.m3599a(objArr3[(i32 << 3) + i37]);
                        } else {
                            i31 = i37;
                        }
                        j6 >>= 8;
                        i37 = i31 + 1;
                    }
                    if (i36 != 8) {
                        break;
                    }
                }
                if (i32 == length) {
                    break;
                } else {
                    i32++;
                }
            }
        }
        int size3 = arrayList7.size();
        int i38 = 0;
        while (true) {
            arrayList2 = this.f684i;
            arrayList3 = this.f681f;
            arrayList4 = this.f680e;
            if (i38 >= size3) {
                break;
            }
            C3326n c3326n3 = (C3326n) arrayList7.get(i38);
            c2196i03.m3609k(c3326n3.f16337i);
            int size4 = c3326n3.f16330b.size();
            int i39 = size3;
            int i40 = 0;
            while (true) {
                if (i40 < size4) {
                    i29 = i38;
                    Object mo4921n2 = ((AbstractC3239v0) c3326n3.f16330b.get(i40)).mo4921n();
                    int i41 = i40;
                    if (mo4921n2 instanceof C3424n) {
                        c3424n = (C3424n) mo4921n2;
                    } else {
                        c3424n = null;
                    }
                    if (c3424n != null) {
                        z10 = true;
                        break;
                    } else {
                        i40 = i41 + 1;
                        i38 = i29;
                    }
                } else {
                    i29 = i38;
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                Object obj2 = c3326n3.f16337i;
                C3397a0 c3397a02 = (C3397a0) c2194h0.m3592g(obj2);
                if (interfaceC3415i0 != null) {
                    i30 = interfaceC3415i0.mo1098b(obj2);
                } else {
                    i30 = -1;
                }
                if (i30 == -1 && interfaceC3415i0 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c3397a02 == null) {
                    C3397a0 c3397a03 = new C3397a0(this);
                    C3397a0.m5158b(c3397a03, c3326n3, interfaceC0516a0, interfaceC0682x, i10, i11);
                    c2194h0.m3598m(obj2, c3397a03);
                    if (c3326n3.f16329a != i30 && i30 != -1) {
                        if (i30 < i35) {
                            arrayList4.add(c3326n3);
                        } else {
                            arrayList3.add(c3326n3);
                        }
                    } else {
                        m362b(c3326n3, (int) (c3326n3.m5062a(0) & 4294967295L), c3397a03);
                        if (z11) {
                            C3444x[] c3444xArr2 = c3397a03.f16497a;
                            for (C3444x c3444x4 : c3444xArr2) {
                                if (c3444x4 != null) {
                                    c3444x4.m5188a();
                                }
                            }
                        }
                    }
                } else if (z9) {
                    C3397a0.m5158b(c3397a02, c3326n3, interfaceC0516a0, interfaceC0682x, i10, i11);
                    C3444x[] c3444xArr3 = c3397a02.f16497a;
                    int length2 = c3444xArr3.length;
                    int i42 = 0;
                    while (i42 < length2) {
                        C3444x[] c3444xArr4 = c3444xArr3;
                        C3444x c3444x5 = c3444xArr4[i42];
                        boolean z12 = z11;
                        int i43 = length2;
                        if (c3444x5 != null && !C3100j.m4783a(c3444x5.f16649l, C3444x.f16636s)) {
                            c3444x5.f16649l = C3100j.m4785c(c3444x5.f16649l, m3234d);
                        }
                        i42++;
                        z11 = z12;
                        c3444xArr3 = c3444xArr4;
                        length2 = i43;
                    }
                    if (z11) {
                        for (C3444x c3444x6 : c3397a02.f16497a) {
                            if (c3444x6 != null) {
                                if (c3444x6.m5189b()) {
                                    arrayList2.remove(c3444x6);
                                    C3448z c3448z = this.f685j;
                                    if (c3448z != null) {
                                        AbstractC3498f.m5373m(c3448z);
                                    }
                                }
                                c3444x6.m5188a();
                            }
                        }
                    }
                    m368f(c3326n3, false);
                }
            } else {
                m366d(c3326n3.f16337i);
            }
            i38 = i29 + 1;
            arrayList7 = arrayList;
            size3 = i39;
        }
        int[] iArr5 = {0};
        if (z9 && interfaceC3415i0 != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    AbstractC1810r.m3075W(arrayList4, new C3400b0(interfaceC3415i0, 1));
                }
                int size5 = arrayList4.size();
                for (int i44 = 0; i44 < size5; i44++) {
                    C3326n c3326n4 = (C3326n) arrayList4.get(i44);
                    int m363g = i10 - m363g(iArr5, c3326n4);
                    Object m3592g = c2194h0.m3592g(c3326n4.f16337i);
                    AbstractC3367j.m5097b(m3592g);
                    m362b(c3326n4, m363g, (C3397a0) m3592g);
                    m368f(c3326n4, false);
                }
                i28 = 1;
                Arrays.fill(iArr5, 0, 1, 0);
            } else {
                i28 = 1;
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > i28) {
                    AbstractC1810r.m3075W(arrayList3, new C3400b0(interfaceC3415i0, 0));
                }
                int size6 = arrayList3.size();
                for (int i45 = 0; i45 < size6; i45++) {
                    C3326n c3326n5 = (C3326n) arrayList3.get(i45);
                    int m363g2 = (m363g(iArr5, c3326n5) + i11) - c3326n5.f16343o;
                    Object m3592g2 = c2194h0.m3592g(c3326n5.f16337i);
                    AbstractC3367j.m5097b(m3592g2);
                    m362b(c3326n5, m363g2, (C3397a0) m3592g2);
                    m368f(c3326n5, false);
                }
                Arrays.fill(iArr5, 0, 1, 0);
            }
        }
        Object[] objArr4 = c2196i03.f12685b;
        long[] jArr4 = c2196i03.f12684a;
        int length3 = jArr4.length - 2;
        ArrayList arrayList8 = this.f683h;
        ArrayList arrayList9 = this.f682g;
        if (length3 >= 0) {
            int i46 = 0;
            while (true) {
                long j7 = jArr4[i46];
                arrayList5 = arrayList3;
                arrayList6 = arrayList4;
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i47 = 8;
                    int i48 = 8 - ((~(i46 - length3)) >>> 31);
                    long j8 = j7;
                    int i49 = 0;
                    while (i49 < i48) {
                        if ((j8 & 255) < 128) {
                            Object obj3 = objArr4[(i46 << 3) + i49];
                            Object m3592g3 = c2194h0.m3592g(obj3);
                            AbstractC3367j.m5097b(m3592g3);
                            C3397a0 c3397a04 = (C3397a0) m3592g3;
                            objArr2 = objArr4;
                            c2196i02 = c2196i03;
                            int mo1098b = c0512l.mo1098b(obj3);
                            jArr2 = jArr4;
                            i19 = i49;
                            int min = Math.min(1, c3397a04.f16501e);
                            c3397a04.f16501e = min;
                            c3397a04.f16500d = Math.min(1 - min, c3397a04.f16500d);
                            if (mo1098b == -1) {
                                C3444x[] c3444xArr5 = c3397a04.f16497a;
                                int length4 = c3444xArr5.length;
                                int i50 = 0;
                                boolean z13 = false;
                                int i51 = 0;
                                while (i50 < length4) {
                                    Object obj4 = obj3;
                                    C3444x c3444x7 = c3444xArr5[i50];
                                    int i52 = i51 + 1;
                                    if (c3444x7 != null) {
                                        if (c3444x7.m5189b()) {
                                            int i53 = i47;
                                            c2194h05 = c2194h0;
                                            i23 = i53;
                                            c3444xArr = c3444xArr5;
                                            iArr4 = iArr5;
                                            i24 = i50;
                                            i25 = length4;
                                            i26 = i48;
                                            c3397a0 = c3397a04;
                                            i27 = i46;
                                            c3444x = c3444x3;
                                            obj = obj4;
                                        } else {
                                            c3444xArr = c3444xArr5;
                                            if (((Boolean) c3444x7.f16648k.getValue()).booleanValue()) {
                                                c3444x7.m5190c();
                                                c3397a04.f16497a[i51] = c3444x3;
                                                arrayList2.remove(c3444x7);
                                                C3448z c3448z2 = this.f685j;
                                                if (c3448z2 != null) {
                                                    AbstractC3498f.m5373m(c3448z2);
                                                }
                                                int i54 = i47;
                                                c2194h05 = c2194h0;
                                                i23 = i54;
                                            } else {
                                                C3397a0 c3397a05 = c3397a04;
                                                C1752b c1752b = c3444x7.f16651n;
                                                if (c1752b != null) {
                                                    int i55 = i48;
                                                    InterfaceC2627a0 interfaceC2627a0 = c3444x7.f16643f;
                                                    if (c3444x7.m5189b() || interfaceC2627a0 == null) {
                                                        int i56 = i47;
                                                        c2194h05 = c2194h0;
                                                        i23 = i56;
                                                        iArr4 = iArr5;
                                                        i24 = i50;
                                                        i25 = length4;
                                                        i27 = i46;
                                                        c3444x2 = c3444x3;
                                                        obj = obj4;
                                                        i26 = i55;
                                                    } else {
                                                        c3444x7.m5192e(true);
                                                        i25 = length4;
                                                        int i57 = i47;
                                                        c2194h05 = c2194h0;
                                                        i23 = i57;
                                                        iArr4 = iArr5;
                                                        i24 = i50;
                                                        ?? r13 = c3444x3;
                                                        obj = obj4;
                                                        i26 = i55;
                                                        c3397a0 = c3397a05;
                                                        i27 = i46;
                                                        AbstractC0525d0.m1141s(c3444x7.f16638a, r13, new C0070r0(c3444x7, interfaceC2627a0, c1752b, r13, 29), 3);
                                                        c3444x = r13;
                                                        if (!c3444x7.m5189b()) {
                                                            arrayList2.add(c3444x7);
                                                            C3448z c3448z3 = this.f685j;
                                                            c3444x = c3444x;
                                                            if (c3448z3 != null) {
                                                                AbstractC3498f.m5373m(c3448z3);
                                                                c3444x = c3444x;
                                                            }
                                                        } else {
                                                            c3444x7.m5190c();
                                                            c3397a0.f16497a[i51] = c3444x;
                                                            C2194h0 c2194h06 = c2194h05;
                                                            i47 = i23;
                                                            c2194h0 = c2194h06;
                                                            c3397a04 = c3397a0;
                                                            obj3 = obj;
                                                            c3444x3 = c3444x;
                                                            i51 = i52;
                                                            length4 = i25;
                                                            i46 = i27;
                                                            i48 = i26;
                                                            iArr5 = iArr4;
                                                            i50 = i24 + 1;
                                                            c3444xArr5 = c3444xArr;
                                                        }
                                                    }
                                                } else {
                                                    int i58 = i47;
                                                    c2194h05 = c2194h0;
                                                    i23 = i58;
                                                    iArr4 = iArr5;
                                                    i24 = i50;
                                                    i25 = length4;
                                                    i26 = i48;
                                                    i27 = i46;
                                                    c3444x2 = c3444x3;
                                                    obj = obj4;
                                                }
                                                c3397a0 = c3397a05;
                                                c3444x = c3444x2;
                                                if (!c3444x7.m5189b()) {
                                                }
                                            }
                                        }
                                        z13 = true;
                                        C2194h0 c2194h062 = c2194h05;
                                        i47 = i23;
                                        c2194h0 = c2194h062;
                                        c3397a04 = c3397a0;
                                        obj3 = obj;
                                        c3444x3 = c3444x;
                                        i51 = i52;
                                        length4 = i25;
                                        i46 = i27;
                                        i48 = i26;
                                        iArr5 = iArr4;
                                        i50 = i24 + 1;
                                        c3444xArr5 = c3444xArr;
                                    } else {
                                        int i59 = i47;
                                        c2194h05 = c2194h0;
                                        i23 = i59;
                                        c3444xArr = c3444xArr5;
                                    }
                                    iArr4 = iArr5;
                                    i24 = i50;
                                    i25 = length4;
                                    i26 = i48;
                                    c3397a0 = c3397a04;
                                    i27 = i46;
                                    c3444x = c3444x3;
                                    obj = obj4;
                                    C2194h0 c2194h0622 = c2194h05;
                                    i47 = i23;
                                    c2194h0 = c2194h0622;
                                    c3397a04 = c3397a0;
                                    obj3 = obj;
                                    c3444x3 = c3444x;
                                    i51 = i52;
                                    length4 = i25;
                                    i46 = i27;
                                    i48 = i26;
                                    iArr5 = iArr4;
                                    i50 = i24 + 1;
                                    c3444xArr5 = c3444xArr;
                                }
                                int i60 = i47;
                                c2194h04 = c2194h0;
                                iArr3 = iArr5;
                                Object obj5 = obj3;
                                i20 = i48;
                                i21 = i46;
                                if (!z13) {
                                    m366d(obj5);
                                }
                                i22 = i60;
                            } else {
                                int i61 = i47;
                                c2194h04 = c2194h0;
                                int i62 = i61;
                                iArr3 = iArr5;
                                i20 = i48;
                                i21 = i46;
                                C3091a c3091a = c3397a04.f16498b;
                                AbstractC3367j.m5097b(c3091a);
                                C3326n m5060a = c3322j.m5060a(mo1098b, c3091a.f15687a);
                                boolean z14 = true;
                                m5060a.f16345q = true;
                                C3444x[] c3444xArr6 = c3397a04.f16497a;
                                int length5 = c3444xArr6.length;
                                int i63 = 0;
                                while (true) {
                                    if (i63 < length5) {
                                        i22 = i62;
                                        C3444x c3444x8 = c3444xArr6[i63];
                                        if (c3444x8 != null && ((Boolean) c3444x8.f16645h.getValue()).booleanValue() == z14) {
                                            break;
                                        }
                                        i63++;
                                        i62 = i22;
                                        z14 = true;
                                    } else {
                                        i22 = i62;
                                        if (interfaceC3415i0 != null && mo1098b == interfaceC3415i0.mo1098b(obj3)) {
                                            m366d(obj3);
                                        }
                                    }
                                }
                                c3397a04.m5159a(m5060a, interfaceC0516a0, interfaceC0682x, i10, i11, c3397a04.f16499c);
                                if (mo1098b < this.f678c) {
                                    arrayList9.add(m5060a);
                                } else {
                                    arrayList8.add(m5060a);
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                            iArr3 = iArr5;
                            jArr2 = jArr4;
                            i19 = i49;
                            i20 = i48;
                            c2196i02 = c2196i03;
                            i21 = i46;
                            i22 = i47;
                            c2194h04 = c2194h0;
                        }
                        j8 >>= i22;
                        i49 = i19 + 1;
                        iArr5 = iArr3;
                        c2194h0 = c2194h04;
                        c2196i03 = c2196i02;
                        objArr4 = objArr2;
                        jArr4 = jArr2;
                        i47 = i22;
                        i46 = i21;
                        i48 = i20;
                        c3444x3 = null;
                    }
                    int i64 = i47;
                    c2194h02 = c2194h0;
                    objArr = objArr4;
                    iArr = iArr5;
                    jArr = jArr4;
                    c2196i0 = c2196i03;
                    int i65 = i46;
                    if (i48 != i64) {
                        break;
                    } else {
                        i18 = i65;
                    }
                } else {
                    objArr = objArr4;
                    iArr = iArr5;
                    jArr = jArr4;
                    c2196i0 = c2196i03;
                    c2194h02 = c2194h0;
                    i18 = i46;
                }
                if (i18 == length3) {
                    break;
                }
                i46 = i18 + 1;
                iArr5 = iArr;
                c2194h0 = c2194h02;
                arrayList3 = arrayList5;
                arrayList4 = arrayList6;
                c2196i03 = c2196i0;
                objArr4 = objArr;
                jArr4 = jArr;
                c3444x3 = null;
            }
        } else {
            iArr = iArr5;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
            c2196i0 = c2196i03;
            c2194h02 = c2194h0;
        }
        if (!arrayList9.isEmpty()) {
            if (arrayList9.size() > 1) {
                c0512l2 = c0512l;
                AbstractC1810r.m3075W(arrayList9, new C3403c0(c0512l2, 1));
            } else {
                c0512l2 = c0512l;
            }
            int size7 = arrayList9.size();
            int i66 = 0;
            while (i66 < size7) {
                C3326n c3326n6 = (C3326n) arrayList9.get(i66);
                C2194h0 c2194h07 = c2194h02;
                Object m3592g4 = c2194h07.m3592g(c3326n6.f16337i);
                AbstractC3367j.m5097b(m3592g4);
                C3397a0 c3397a06 = (C3397a0) m3592g4;
                int[] iArr6 = iArr;
                int m363g3 = m363g(iArr6, c3326n6);
                if (z7) {
                    i17 = (int) (((C3326n) AbstractC1805m.m3045i0(arrayList)).m5062a(0) & 4294967295L);
                } else {
                    i17 = c3397a06.f16502f;
                }
                c3326n6.m5064c(i17 - m363g3, i8, i9);
                if (z9) {
                    m368f(c3326n6, true);
                }
                i66++;
                c2194h02 = c2194h07;
                iArr = iArr6;
            }
            i13 = i8;
            i14 = i9;
            iArr2 = iArr;
            c2194h03 = c2194h02;
            i15 = 1;
            Arrays.fill(iArr2, 0, 1, 0);
        } else {
            i13 = i8;
            i14 = i9;
            c0512l2 = c0512l;
            iArr2 = iArr;
            c2194h03 = c2194h02;
            i15 = 1;
        }
        if (!arrayList8.isEmpty()) {
            if (arrayList8.size() > i15) {
                AbstractC1810r.m3075W(arrayList8, new C3403c0(c0512l2, 0));
            }
            int size8 = arrayList8.size();
            for (int i67 = 0; i67 < size8; i67++) {
                C3326n c3326n7 = (C3326n) arrayList8.get(i67);
                Object m3592g5 = c2194h03.m3592g(c3326n7.f16337i);
                AbstractC3367j.m5097b(m3592g5);
                C3397a0 c3397a07 = (C3397a0) m3592g5;
                int m363g4 = m363g(iArr2, c3326n7);
                if (z7) {
                    i16 = (int) (((C3326n) AbstractC1805m.m3052p0(arrayList)).m5062a(0) & 4294967295L);
                } else {
                    i16 = c3397a07.f16503g - c3326n7.f16343o;
                }
                c3326n7.m5064c(i16 + m363g4, i13, i14);
                if (z9) {
                    m368f(c3326n7, true);
                }
            }
        }
        Collections.reverse(arrayList9);
        arrayList.addAll(0, arrayList9);
        arrayList.addAll(arrayList8);
        arrayList6.clear();
        arrayList5.clear();
        arrayList9.clear();
        arrayList8.clear();
        c2196i0.m3600b();
    }

    /* renamed from: d */
    public final void m366d(Object obj) {
        C3444x[] c3444xArr;
        C3397a0 c3397a0 = (C3397a0) this.f676a.m3596k(obj);
        if (c3397a0 != null && (c3444xArr = c3397a0.f16497a) != null) {
            for (C3444x c3444x : c3444xArr) {
                if (c3444x != null) {
                    c3444x.m5190c();
                }
            }
        }
    }

    /* renamed from: e */
    public final void m367e() {
        C2194h0 c2194h0 = this.f676a;
        if (c2194h0.m3595j()) {
            Object[] objArr = c2194h0.f12678c;
            long[] jArr = c2194h0.f12676a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j6 = jArr[i7];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((255 & j6) < 128) {
                                for (C3444x c3444x : ((C3397a0) objArr[(i7 << 3) + i9]).f16497a) {
                                    if (c3444x != null) {
                                        c3444x.m5190c();
                                    }
                                }
                            }
                            j6 >>= 8;
                        }
                        if (i8 != 8) {
                            break;
                        }
                    }
                    if (i7 == length) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            c2194h0.m3586a();
        }
        this.f677b = C3410g.f16544b;
        this.f678c = -1;
    }

    /* renamed from: f */
    public final void m368f(C3326n c3326n, boolean z7) {
        Object m3592g = this.f676a.m3592g(c3326n.f16337i);
        AbstractC3367j.m5097b(m3592g);
        C3444x[] c3444xArr = ((C3397a0) m3592g).f16497a;
        int length = c3444xArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            C3444x c3444x = c3444xArr[i7];
            int i9 = i8 + 1;
            if (c3444x != null) {
                long m5062a = c3326n.m5062a(i8);
                long j6 = c3444x.f16649l;
                if (!C3100j.m4783a(j6, C3444x.f16636s) && !C3100j.m4783a(j6, m5062a)) {
                    long m4784b = C3100j.m4784b(m5062a, j6);
                    InterfaceC2627a0 interfaceC2627a0 = c3444x.f16642e;
                    if (interfaceC2627a0 != null) {
                        long m4784b2 = C3100j.m4784b(((C3100j) c3444x.f16654q.getValue()).f15696a, m4784b);
                        c3444x.m5194g(m4784b2);
                        c3444x.m5193f(true);
                        c3444x.f16644g = z7;
                        AbstractC0525d0.m1141s(c3444x.f16638a, null, new C0012c2(c3444x, interfaceC2627a0, m4784b2, null), 3);
                    }
                }
                c3444x.f16649l = m5062a;
            }
            i7++;
            i8 = i9;
        }
    }
}
