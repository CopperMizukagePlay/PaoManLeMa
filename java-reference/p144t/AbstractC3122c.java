package p144t;

import java.util.List;
import p012b3.C0274b;
import p073j2.AbstractC2168e;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.c */
/* loaded from: classes.dex */
public abstract class AbstractC3122c {

    /* renamed from: a */
    public static final C3120b f15756a = new C3120b(0);

    /* renamed from: b */
    public static final C3120b f15757b = new C3120b(1);

    /* renamed from: c */
    public static final int f15758c = 9;

    /* renamed from: d */
    public static final int f15759d = 6;

    /* renamed from: e */
    public static final int f15760e = 10;

    /* renamed from: f */
    public static final int f15761f = 5;

    /* renamed from: g */
    public static final int f15762g = 15;

    /* renamed from: a */
    public static final void m4828a(C2395p c2395p, InterfaceC3810r interfaceC3810r) {
        C3142m c3142m = C3142m.f15806c;
        int m3975r = AbstractC2418w.m3975r(c2395p);
        InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, interfaceC3810r);
        InterfaceC2385m1 m3882m = c2395p.m3882m();
        InterfaceC3510j.f16935d.getClass();
        C3558z c3558z = C3507i.f16928b;
        c2395p.m3863c0();
        if (c2395p.f13485S) {
            c2395p.m3880l(c3558z);
        } else {
            c2395p.m3883m0();
        }
        AbstractC2418w.m3954C(c3142m, c2395p, C3507i.f16931e);
        AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
        AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
        C3504h c3504h = C3507i.f16932f;
        if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
            AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h);
        }
        c2395p.m3888r(true);
    }

    /* renamed from: b */
    public static final C3143m0 m4829b(InterfaceC3214k0 interfaceC3214k0) {
        Object mo4921n = interfaceC3214k0.mo4921n();
        if (mo4921n instanceof C3143m0) {
            return (C3143m0) mo4921n;
        }
        return null;
    }

    /* renamed from: c */
    public static final float m4830c(C3143m0 c3143m0) {
        if (c3143m0 != null) {
            return c3143m0.f15808a;
        }
        return 0.0f;
    }

    /* renamed from: d */
    public static InterfaceC3220m0 m4831d(InterfaceC3141l0 interfaceC3141l0, int i7, int i8, int i9, int i10, int i11, InterfaceC3223n0 interfaceC3223n0, List list, AbstractC3239v0[] abstractC3239v0Arr, int i12) {
        int i13;
        int[] iArr;
        float f7;
        String str;
        long j6;
        int i14;
        int i15;
        int m3530q;
        int i16;
        String str2;
        int i17;
        int i18;
        int i19;
        float f8;
        boolean z7;
        int i20;
        float f9;
        int i21;
        int i22;
        int i23;
        List list2 = list;
        int i24 = i12;
        long j7 = i11;
        int[] iArr2 = new int[i24];
        float f10 = 0.0f;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (i25 < i24) {
            InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) list2.get(i25);
            float m4830c = m4830c(m4829b(interfaceC3214k0));
            if (m4830c > 0.0f) {
                f10 += m4830c;
                i26++;
                i21 = i25;
            } else {
                int i30 = i9 - i27;
                AbstractC3239v0 abstractC3239v0 = abstractC3239v0Arr[i25];
                if (abstractC3239v0 == null) {
                    i21 = i25;
                    if (i9 == Integer.MAX_VALUE) {
                        i23 = Integer.MAX_VALUE;
                    } else if (i30 < 0) {
                        i23 = 0;
                    } else {
                        i23 = i30;
                    }
                    f9 = f10;
                    i22 = i30;
                    abstractC3239v0 = interfaceC3214k0.mo4918e(interfaceC3141l0.mo4845e(0, i23, i10, false));
                } else {
                    f9 = f10;
                    i21 = i25;
                    i22 = i30;
                }
                AbstractC3239v0 abstractC3239v02 = abstractC3239v0;
                int mo4848j = interfaceC3141l0.mo4848j(abstractC3239v02);
                int mo4844c = interfaceC3141l0.mo4844c(abstractC3239v02);
                iArr2[i21] = mo4848j;
                int i31 = i22 - mo4848j;
                if (i31 < 0) {
                    i31 = 0;
                }
                i28 = Math.min(i11, i31);
                i27 += mo4848j + i28;
                i29 = Math.max(i29, mo4844c);
                abstractC3239v0Arr[i21] = abstractC3239v02;
                f10 = f9;
            }
            i25 = i21 + 1;
        }
        float f11 = f10;
        int i32 = i29;
        if (i26 == 0) {
            iArr = iArr2;
            i14 = i27 - i28;
            i15 = 0;
            m3530q = 0;
        } else {
            if (i9 != Integer.MAX_VALUE) {
                i13 = i9;
            } else {
                i13 = i7;
            }
            long j8 = (i26 - 1) * j7;
            iArr = iArr2;
            long j9 = (i13 - i27) - j8;
            if (j9 < 0) {
                j9 = 0;
            }
            float f12 = ((float) j9) / f11;
            long j10 = j9;
            int i33 = 0;
            while (true) {
                f7 = f12;
                str = "fixedSpace ";
                j6 = j9;
                if (i33 >= i24) {
                    break;
                }
                int i34 = i33;
                float m4830c2 = m4830c(m4829b((InterfaceC3214k0) list2.get(i33)));
                float f13 = f7 * m4830c2;
                try {
                    j10 -= Math.round(f13);
                    i33 = i34 + 1;
                    list2 = list;
                    f12 = f7;
                    j9 = j6;
                } catch (IllegalArgumentException e7) {
                    StringBuilder sb = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ");
                    sb.append(i9);
                    sb.append("mainAxisMin ");
                    sb.append(i7);
                    sb.append("targetSpace ");
                    sb.append(i13);
                    sb.append("arrangementSpacingPx ");
                    sb.append(j7);
                    sb.append("weightChildrenCount ");
                    sb.append(i26);
                    sb.append("fixedSpace ");
                    sb.append(i27);
                    AbstractC2487d.m4056t(sb, "arrangementSpacingTotal ", j8, "remainingToTarget ");
                    sb.append(j6);
                    sb.append("totalWeight ");
                    sb.append(f11);
                    sb.append("weightUnitSpace ");
                    sb.append(f7);
                    sb.append("itemWeight ");
                    sb.append(m4830c2);
                    sb.append("weightedSize ");
                    sb.append(f13);
                    throw new IllegalArgumentException(sb.toString()).initCause(e7);
                }
            }
            int i35 = i32;
            int i36 = 0;
            int i37 = 0;
            while (true) {
                long j11 = j6;
                if (i37 < i24) {
                    if (abstractC3239v0Arr[i37] == null) {
                        i16 = i37;
                        InterfaceC3214k0 interfaceC3214k02 = (InterfaceC3214k0) list.get(i37);
                        C3143m0 m4829b = m4829b(interfaceC3214k02);
                        i17 = i27;
                        float m4830c3 = m4830c(m4829b);
                        if (m4830c3 > 0.0f) {
                            int signum = Long.signum(j10);
                            str2 = str;
                            int i38 = i26;
                            j10 -= signum;
                            float f14 = f7 * m4830c3;
                            int max = Math.max(0, Math.round(f14) + signum);
                            if (m4829b != null) {
                                try {
                                    z7 = m4829b.f15809b;
                                } catch (IllegalArgumentException e8) {
                                    e = e8;
                                    f8 = f14;
                                    StringBuilder sb2 = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ");
                                    sb2.append(i9);
                                    sb2.append("mainAxisMin ");
                                    sb2.append(i7);
                                    sb2.append("targetSpace ");
                                    sb2.append(i13);
                                    sb2.append("arrangementSpacingPx ");
                                    sb2.append(j7);
                                    sb2.append("weightChildrenCount ");
                                    sb2.append(i38);
                                    sb2.append(str2);
                                    sb2.append(i17);
                                    AbstractC2487d.m4056t(sb2, "arrangementSpacingTotal ", j8, "remainingToTarget ");
                                    sb2.append(j11);
                                    sb2.append("totalWeight ");
                                    sb2.append(f11);
                                    sb2.append("weightUnitSpace ");
                                    sb2.append(f7);
                                    sb2.append("weight ");
                                    sb2.append(m4830c3);
                                    sb2.append("weightedSize ");
                                    sb2.append(f8);
                                    sb2.append("crossAxisDesiredSize nullremainderUnit ");
                                    sb2.append(signum);
                                    sb2.append("childMainAxisSize ");
                                    sb2.append(max);
                                    throw new IllegalArgumentException(sb2.toString()).initCause(e);
                                }
                            } else {
                                z7 = true;
                            }
                            try {
                                if (z7 && max != Integer.MAX_VALUE) {
                                    i20 = max;
                                    f8 = f14;
                                    AbstractC3239v0 mo4918e = interfaceC3214k02.mo4918e(interfaceC3141l0.mo4845e(i20, max, i10, true));
                                    int mo4848j2 = interfaceC3141l0.mo4848j(mo4918e);
                                    int mo4844c2 = interfaceC3141l0.mo4844c(mo4918e);
                                    iArr[i16] = mo4848j2;
                                    i19 = i36 + mo4848j2;
                                    int max2 = Math.max(i35, mo4844c2);
                                    abstractC3239v0Arr[i16] = mo4918e;
                                    i35 = max2;
                                    i18 = i38;
                                }
                                AbstractC3239v0 mo4918e2 = interfaceC3214k02.mo4918e(interfaceC3141l0.mo4845e(i20, max, i10, true));
                                int mo4848j22 = interfaceC3141l0.mo4848j(mo4918e2);
                                int mo4844c22 = interfaceC3141l0.mo4844c(mo4918e2);
                                iArr[i16] = mo4848j22;
                                i19 = i36 + mo4848j22;
                                int max22 = Math.max(i35, mo4844c22);
                                abstractC3239v0Arr[i16] = mo4918e2;
                                i35 = max22;
                                i18 = i38;
                            } catch (IllegalArgumentException e9) {
                                e = e9;
                                StringBuilder sb22 = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ");
                                sb22.append(i9);
                                sb22.append("mainAxisMin ");
                                sb22.append(i7);
                                sb22.append("targetSpace ");
                                sb22.append(i13);
                                sb22.append("arrangementSpacingPx ");
                                sb22.append(j7);
                                sb22.append("weightChildrenCount ");
                                sb22.append(i38);
                                sb22.append(str2);
                                sb22.append(i17);
                                AbstractC2487d.m4056t(sb22, "arrangementSpacingTotal ", j8, "remainingToTarget ");
                                sb22.append(j11);
                                sb22.append("totalWeight ");
                                sb22.append(f11);
                                sb22.append("weightUnitSpace ");
                                sb22.append(f7);
                                sb22.append("weight ");
                                sb22.append(m4830c3);
                                sb22.append("weightedSize ");
                                sb22.append(f8);
                                sb22.append("crossAxisDesiredSize nullremainderUnit ");
                                sb22.append(signum);
                                sb22.append("childMainAxisSize ");
                                sb22.append(max);
                                throw new IllegalArgumentException(sb22.toString()).initCause(e);
                            }
                            i20 = 0;
                            f8 = f14;
                        } else {
                            throw new IllegalStateException("All weights <= 0 should have placeables");
                        }
                    } else {
                        i16 = i37;
                        str2 = str;
                        i17 = i27;
                        i18 = i26;
                        i19 = i36;
                    }
                    j6 = j11;
                    i37 = i16 + 1;
                    i36 = i19;
                    i26 = i18;
                    i27 = i17;
                    str = str2;
                    i24 = i12;
                } else {
                    i14 = i27;
                    i15 = 0;
                    i32 = i35;
                    m3530q = AbstractC2168e.m3530q((int) (i36 + j8), 0, i9 - i14);
                    break;
                }
            }
        }
        int i39 = i14 + m3530q;
        if (i39 < 0) {
            i39 = i15;
        }
        int max3 = Math.max(i39, i7);
        int max4 = Math.max(i32, Math.max(i8, i15));
        int[] iArr3 = new int[i12];
        for (int i40 = i15; i40 < i12; i40++) {
            iArr3[i40] = i15;
        }
        interfaceC3141l0.mo4847i(max3, interfaceC3223n0, iArr, iArr3);
        return interfaceC3141l0.mo4846f(abstractC3239v0Arr, interfaceC3223n0, iArr3, max3, max4);
    }

    /* renamed from: e */
    public static final C3123c0 m4832e(C0274b c0274b) {
        return new C3123c0(c0274b.f1015a, c0274b.f1016b, c0274b.f1017c, c0274b.f1018d);
    }

    /* renamed from: f */
    public static final void m4833f(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
