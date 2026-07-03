package p063i0;

import androidx.compose.p007ui.layout.AbstractC0172a;
import java.util.List;
import java.util.NoSuchElementException;
import p027d1.C0467e;
import p060h5.AbstractC1793a0;
import p060h5.C1814v;
import p068i5.AbstractC2080d;
import p071j0.AbstractC2151s0;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p144t.InterfaceC3135i0;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p146t1.InterfaceC3228q;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.c4 */
/* loaded from: classes.dex */
public final class C1865c4 implements InterfaceC3217l0 {

    /* renamed from: a */
    public final InterfaceC3279c f11008a;

    /* renamed from: b */
    public final boolean f11009b;

    /* renamed from: c */
    public final float f11010c;

    /* renamed from: d */
    public final InterfaceC3135i0 f11011d;

    public C1865c4(InterfaceC3279c interfaceC3279c, boolean z7, float f7, InterfaceC3135i0 interfaceC3135i0) {
        this.f11008a = interfaceC3279c;
        this.f11009b = z7;
        this.f11010c = f7;
        this.f11011d = interfaceC3135i0;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        Object obj;
        AbstractC3239v0 abstractC3239v0;
        int i7;
        int i8;
        Object obj2;
        AbstractC3239v0 abstractC3239v02;
        int i9;
        int i10;
        Object obj3;
        AbstractC3239v0 abstractC3239v03;
        AbstractC3239v0 abstractC3239v04;
        int i11;
        int i12;
        Object obj4;
        int i13;
        AbstractC3239v0 abstractC3239v05;
        int i14;
        int i15;
        int i16;
        Object obj5;
        AbstractC3239v0 abstractC3239v06;
        long j7;
        Object obj6;
        int i17;
        int i18;
        Object obj7;
        AbstractC3239v0 abstractC3239v07;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        AbstractC3239v0 abstractC3239v08;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        C1865c4 c1865c4 = this;
        List list2 = list;
        InterfaceC3135i0 interfaceC3135i0 = c1865c4.f11011d;
        int mo4513Q = interfaceC3223n0.mo4513Q(interfaceC3135i0.mo4824a());
        long m4753a = C3091a.m4753a(j6, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i39 = 0;
        while (true) {
            if (i39 < size) {
                obj = list2.get(i39);
                if (AbstractC3367j.m5096a(AbstractC0172a.m391a((InterfaceC3214k0) obj), "Leading")) {
                    break;
                }
                i39++;
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) obj;
        if (interfaceC3214k0 != null) {
            abstractC3239v0 = interfaceC3214k0.mo4918e(m4753a);
        } else {
            abstractC3239v0 = null;
        }
        float f7 = AbstractC2151s0.f12521b;
        if (abstractC3239v0 != null) {
            i7 = abstractC3239v0.f16053e;
        } else {
            i7 = 0;
        }
        if (abstractC3239v0 != null) {
            i8 = abstractC3239v0.f16054f;
        } else {
            i8 = 0;
        }
        int max = Math.max(0, i8);
        int size2 = list2.size();
        int i40 = 0;
        while (true) {
            if (i40 < size2) {
                obj2 = list2.get(i40);
                if (AbstractC3367j.m5096a(AbstractC0172a.m391a((InterfaceC3214k0) obj2), "Trailing")) {
                    break;
                }
                i40++;
            } else {
                obj2 = null;
                break;
            }
        }
        InterfaceC3214k0 interfaceC3214k02 = (InterfaceC3214k0) obj2;
        if (interfaceC3214k02 != null) {
            abstractC3239v02 = interfaceC3214k02.mo4918e(AbstractC3092b.m4773j(m4753a, -i7, 0, 2));
        } else {
            abstractC3239v02 = null;
        }
        if (abstractC3239v02 != null) {
            i9 = abstractC3239v02.f16053e;
        } else {
            i9 = 0;
        }
        int i41 = i7 + i9;
        if (abstractC3239v02 != null) {
            i10 = abstractC3239v02.f16054f;
        } else {
            i10 = 0;
        }
        int max2 = Math.max(max, i10);
        int size3 = list2.size();
        int i42 = 0;
        while (true) {
            if (i42 < size3) {
                obj3 = list2.get(i42);
                if (AbstractC3367j.m5096a(AbstractC0172a.m391a((InterfaceC3214k0) obj3), "Prefix")) {
                    break;
                }
                i42++;
            } else {
                obj3 = null;
                break;
            }
        }
        InterfaceC3214k0 interfaceC3214k03 = (InterfaceC3214k0) obj3;
        if (interfaceC3214k03 != null) {
            abstractC3239v03 = abstractC3239v0;
            abstractC3239v04 = interfaceC3214k03.mo4918e(AbstractC3092b.m4773j(m4753a, -i41, 0, 2));
        } else {
            abstractC3239v03 = abstractC3239v0;
            abstractC3239v04 = null;
        }
        if (abstractC3239v04 != null) {
            i11 = abstractC3239v04.f16053e;
        } else {
            i11 = 0;
        }
        int i43 = i41 + i11;
        if (abstractC3239v04 != null) {
            i12 = abstractC3239v04.f16054f;
        } else {
            i12 = 0;
        }
        int max3 = Math.max(max2, i12);
        int size4 = list2.size();
        int i44 = 0;
        while (true) {
            if (i44 < size4) {
                obj4 = list2.get(i44);
                if (AbstractC3367j.m5096a(AbstractC0172a.m391a((InterfaceC3214k0) obj4), "Suffix")) {
                    break;
                }
                i44++;
            } else {
                obj4 = null;
                break;
            }
        }
        InterfaceC3214k0 interfaceC3214k04 = (InterfaceC3214k0) obj4;
        if (interfaceC3214k04 != null) {
            i13 = i43;
            abstractC3239v05 = interfaceC3214k04.mo4918e(AbstractC3092b.m4773j(m4753a, -i43, 0, 2));
        } else {
            i13 = i43;
            abstractC3239v05 = null;
        }
        if (abstractC3239v05 != null) {
            i14 = abstractC3239v05.f16053e;
        } else {
            i14 = 0;
        }
        int i45 = i13 + i14;
        if (abstractC3239v05 != null) {
            i15 = abstractC3239v05.f16054f;
        } else {
            i15 = 0;
        }
        int max4 = Math.max(max3, i15);
        int mo4513Q2 = interfaceC3223n0.mo4513Q(interfaceC3135i0.mo4826c(interfaceC3223n0.getLayoutDirection())) + interfaceC3223n0.mo4513Q(interfaceC3135i0.mo4827d(interfaceC3223n0.getLayoutDirection()));
        int i46 = -i45;
        int m3410w = AbstractC2080d.m3410w(c1865c4.f11010c, i46 - mo4513Q2, -mo4513Q2);
        int i47 = -mo4513Q;
        long m4772i = AbstractC3092b.m4772i(m3410w, i47, m4753a);
        int size5 = list2.size();
        int i48 = 0;
        while (true) {
            if (i48 < size5) {
                obj5 = list2.get(i48);
                int i49 = i48;
                i16 = mo4513Q;
                if (AbstractC3367j.m5096a(AbstractC0172a.m391a((InterfaceC3214k0) obj5), "Label")) {
                    break;
                }
                i48 = i49 + 1;
                mo4513Q = i16;
            } else {
                i16 = mo4513Q;
                obj5 = null;
                break;
            }
        }
        InterfaceC3214k0 interfaceC3214k05 = (InterfaceC3214k0) obj5;
        if (interfaceC3214k05 != null) {
            abstractC3239v06 = interfaceC3214k05.mo4918e(m4772i);
        } else {
            abstractC3239v06 = null;
        }
        if (abstractC3239v06 != null) {
            j7 = AbstractC1793a0.m2975c(abstractC3239v06.f16053e, abstractC3239v06.f16054f);
        } else {
            j7 = 0;
        }
        c1865c4.f11008a.mo23f(new C0467e(j7));
        int size6 = list2.size();
        int i50 = 0;
        while (true) {
            if (i50 < size6) {
                obj6 = list2.get(i50);
                int i51 = size6;
                if (AbstractC3367j.m5096a(AbstractC0172a.m391a((InterfaceC3214k0) obj6), "Supporting")) {
                    break;
                }
                i50++;
                size6 = i51;
            } else {
                obj6 = null;
                break;
            }
        }
        InterfaceC3214k0 interfaceC3214k06 = (InterfaceC3214k0) obj6;
        if (interfaceC3214k06 != null) {
            i17 = interfaceC3214k06.mo4919e0(C3091a.m4762j(j6));
        } else {
            i17 = 0;
        }
        if (abstractC3239v06 != null) {
            i18 = abstractC3239v06.f16054f;
        } else {
            i18 = 0;
        }
        int max5 = Math.max(i18 / 2, interfaceC3223n0.mo4513Q(interfaceC3135i0.mo4825b()));
        long m4753a2 = C3091a.m4753a(AbstractC3092b.m4772i(i46, (i47 - max5) - i17, j6), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i52 = 0;
        while (i52 < size7) {
            InterfaceC3214k0 interfaceC3214k07 = (InterfaceC3214k0) list2.get(i52);
            int i53 = i52;
            int i54 = size7;
            if (AbstractC3367j.m5096a(AbstractC0172a.m391a(interfaceC3214k07), "TextField")) {
                AbstractC3239v0 mo4918e = interfaceC3214k07.mo4918e(m4753a2);
                long m4753a3 = C3091a.m4753a(m4753a2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i55 = 0;
                while (true) {
                    if (i55 < size8) {
                        obj7 = list2.get(i55);
                        int i56 = size8;
                        int i57 = i55;
                        if (AbstractC3367j.m5096a(AbstractC0172a.m391a((InterfaceC3214k0) obj7), "Hint")) {
                            break;
                        }
                        i55 = i57 + 1;
                        size8 = i56;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                InterfaceC3214k0 interfaceC3214k08 = (InterfaceC3214k0) obj7;
                if (interfaceC3214k08 != null) {
                    abstractC3239v07 = interfaceC3214k08.mo4918e(m4753a3);
                } else {
                    abstractC3239v07 = null;
                }
                int i58 = mo4918e.f16054f;
                if (abstractC3239v07 != null) {
                    i19 = abstractC3239v07.f16054f;
                } else {
                    i19 = 0;
                }
                int max6 = Math.max(max4, Math.max(i58, i19) + max5 + i16);
                AbstractC3239v0 abstractC3239v09 = abstractC3239v03;
                if (abstractC3239v03 != null) {
                    i20 = abstractC3239v09.f16053e;
                } else {
                    i20 = 0;
                }
                if (abstractC3239v02 != null) {
                    i21 = abstractC3239v02.f16053e;
                } else {
                    i21 = 0;
                }
                if (abstractC3239v04 != null) {
                    i22 = abstractC3239v04.f16053e;
                    i20 = i20;
                } else {
                    i22 = 0;
                }
                if (abstractC3239v05 != null) {
                    i23 = i20;
                    i24 = abstractC3239v05.f16053e;
                } else {
                    i23 = i20;
                    i24 = 0;
                }
                int i59 = mo4918e.f16053e;
                if (abstractC3239v06 != null) {
                    i27 = abstractC3239v06.f16053e;
                    i26 = i23;
                    i25 = i59;
                } else {
                    int i60 = i23;
                    i25 = i59;
                    i26 = i60;
                    i27 = 0;
                }
                if (abstractC3239v07 != null) {
                    i28 = abstractC3239v07.f16053e;
                    i26 = i26;
                } else {
                    i28 = 0;
                }
                int m3105d = AbstractC1847a4.m3105d(i26, i21, i22, i24, i25, i27, i28, c1865c4.f11010c, j6, interfaceC3223n0.mo559b(), c1865c4.f11011d);
                int i61 = 0;
                long m4753a4 = C3091a.m4753a(AbstractC3092b.m4773j(m4753a, 0, -max6, 1), 0, m3105d, 0, 0, 9);
                int i62 = m3105d;
                if (interfaceC3214k06 != null) {
                    abstractC3239v08 = interfaceC3214k06.mo4918e(m4753a4);
                } else {
                    abstractC3239v08 = null;
                }
                if (abstractC3239v08 != null) {
                    i29 = abstractC3239v08.f16054f;
                } else {
                    i29 = 0;
                }
                if (abstractC3239v09 != null) {
                    i30 = abstractC3239v09.f16054f;
                } else {
                    i30 = 0;
                }
                if (abstractC3239v02 != null) {
                    i31 = 0;
                    i61 = abstractC3239v02.f16054f;
                } else {
                    i31 = 0;
                }
                if (abstractC3239v04 != null) {
                    i32 = abstractC3239v04.f16054f;
                } else {
                    i32 = i31;
                }
                if (abstractC3239v05 != null) {
                    i33 = abstractC3239v05.f16054f;
                } else {
                    i33 = i31;
                }
                int i63 = mo4918e.f16054f;
                AbstractC3239v0 abstractC3239v010 = abstractC3239v04;
                if (abstractC3239v06 != null) {
                    i34 = abstractC3239v06.f16054f;
                } else {
                    i34 = i31;
                }
                if (abstractC3239v07 != null) {
                    i35 = abstractC3239v07.f16054f;
                } else {
                    i35 = i31;
                }
                if (abstractC3239v08 != null) {
                    i36 = abstractC3239v08.f16054f;
                } else {
                    i36 = i31;
                }
                AbstractC3239v0 abstractC3239v011 = abstractC3239v06;
                int m3104c = AbstractC1847a4.m3104c(i30, i61, i32, i33, i63, i34, i35, i36, c1865c4.f11010c, j6, interfaceC3223n0.mo559b(), c1865c4.f11011d);
                int i64 = m3104c - i29;
                int size9 = list2.size();
                int i65 = i31;
                while (i65 < size9) {
                    InterfaceC3214k0 interfaceC3214k09 = (InterfaceC3214k0) list2.get(i65);
                    if (AbstractC3367j.m5096a(AbstractC0172a.m391a(interfaceC3214k09), "Container")) {
                        if (i62 != Integer.MAX_VALUE) {
                            i37 = i62;
                        } else {
                            i37 = i31;
                        }
                        if (i64 != Integer.MAX_VALUE) {
                            i38 = i64;
                        } else {
                            i38 = i31;
                        }
                        AbstractC3239v0 mo4918e2 = interfaceC3214k09.mo4918e(AbstractC3092b.m4764a(i37, i62, i38, i64));
                        AbstractC3239v0 abstractC3239v012 = mo4918e;
                        AbstractC3239v0 abstractC3239v013 = abstractC3239v08;
                        int i66 = i62;
                        return interfaceC3223n0.mo4941K(i66, m3104c, C1814v.f10861e, new C1856b4(m3104c, i66, abstractC3239v09, abstractC3239v02, abstractC3239v010, abstractC3239v05, abstractC3239v012, abstractC3239v011, abstractC3239v07, mo4918e2, abstractC3239v013, c1865c4, interfaceC3223n0));
                    }
                    i65++;
                    i62 = i62;
                    abstractC3239v08 = abstractC3239v08;
                    mo4918e = mo4918e;
                    abstractC3239v010 = abstractC3239v010;
                    abstractC3239v05 = abstractC3239v05;
                    abstractC3239v09 = abstractC3239v09;
                    c1865c4 = this;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i52 = i53 + 1;
            c1865c4 = this;
            list2 = list;
            abstractC3239v05 = abstractC3239v05;
            size7 = i54;
            m4753a2 = m4753a2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: b */
    public final int mo3109b(InterfaceC3228q interfaceC3228q, List list, int i7) {
        return m3110c(interfaceC3228q, list, i7, C2035x0.f12105r);
    }

    /* renamed from: c */
    public final int m3110c(InterfaceC3228q interfaceC3228q, List list, int i7, InterfaceC3281e interfaceC3281e) {
        Object obj;
        int i8;
        int i9;
        Object obj2;
        int i10;
        Object obj3;
        int i11;
        Object obj4;
        int i12;
        Object obj5;
        int i13;
        Object obj6;
        int i14;
        Object obj7;
        int i15;
        int size = list.size();
        int i16 = 0;
        while (true) {
            if (i16 < size) {
                obj = list.get(i16);
                if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj), "Leading")) {
                    break;
                }
                i16++;
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) obj;
        if (interfaceC3214k0 != null) {
            int mo4917c0 = interfaceC3214k0.mo4917c0(Integer.MAX_VALUE);
            if (i7 == Integer.MAX_VALUE) {
                i8 = i7;
            } else {
                i8 = i7 - mo4917c0;
            }
            i9 = ((Number) interfaceC3281e.mo22d(interfaceC3214k0, Integer.valueOf(i7))).intValue();
        } else {
            i8 = i7;
            i9 = 0;
        }
        int size2 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 < size2) {
                obj2 = list.get(i17);
                if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj2), "Trailing")) {
                    break;
                }
                i17++;
            } else {
                obj2 = null;
                break;
            }
        }
        InterfaceC3214k0 interfaceC3214k02 = (InterfaceC3214k0) obj2;
        if (interfaceC3214k02 != null) {
            int mo4917c02 = interfaceC3214k02.mo4917c0(Integer.MAX_VALUE);
            if (i8 != Integer.MAX_VALUE) {
                i8 -= mo4917c02;
            }
            i10 = ((Number) interfaceC3281e.mo22d(interfaceC3214k02, Integer.valueOf(i7))).intValue();
        } else {
            i10 = 0;
        }
        int size3 = list.size();
        int i18 = 0;
        while (true) {
            if (i18 < size3) {
                obj3 = list.get(i18);
                if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj3), "Label")) {
                    break;
                }
                i18++;
            } else {
                obj3 = null;
                break;
            }
        }
        Object obj8 = (InterfaceC3214k0) obj3;
        if (obj8 != null) {
            i11 = ((Number) interfaceC3281e.mo22d(obj8, Integer.valueOf(AbstractC2080d.m3410w(this.f11010c, i8, i7)))).intValue();
        } else {
            i11 = 0;
        }
        int size4 = list.size();
        int i19 = 0;
        while (true) {
            if (i19 < size4) {
                obj4 = list.get(i19);
                if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj4), "Prefix")) {
                    break;
                }
                i19++;
            } else {
                obj4 = null;
                break;
            }
        }
        InterfaceC3214k0 interfaceC3214k03 = (InterfaceC3214k0) obj4;
        if (interfaceC3214k03 != null) {
            i12 = ((Number) interfaceC3281e.mo22d(interfaceC3214k03, Integer.valueOf(i8))).intValue();
            int mo4917c03 = interfaceC3214k03.mo4917c0(Integer.MAX_VALUE);
            if (i8 != Integer.MAX_VALUE) {
                i8 -= mo4917c03;
            }
        } else {
            i12 = 0;
        }
        int size5 = list.size();
        int i20 = 0;
        while (true) {
            if (i20 < size5) {
                obj5 = list.get(i20);
                if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj5), "Suffix")) {
                    break;
                }
                i20++;
            } else {
                obj5 = null;
                break;
            }
        }
        InterfaceC3214k0 interfaceC3214k04 = (InterfaceC3214k0) obj5;
        if (interfaceC3214k04 != null) {
            int intValue = ((Number) interfaceC3281e.mo22d(interfaceC3214k04, Integer.valueOf(i8))).intValue();
            int mo4917c04 = interfaceC3214k04.mo4917c0(Integer.MAX_VALUE);
            if (i8 != Integer.MAX_VALUE) {
                i8 -= mo4917c04;
            }
            i13 = intValue;
        } else {
            i13 = 0;
        }
        int size6 = list.size();
        for (int i21 = 0; i21 < size6; i21++) {
            Object obj9 = list.get(i21);
            if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj9), "TextField")) {
                int intValue2 = ((Number) interfaceC3281e.mo22d(obj9, Integer.valueOf(i8))).intValue();
                int size7 = list.size();
                int i22 = 0;
                while (true) {
                    if (i22 < size7) {
                        obj6 = list.get(i22);
                        if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj6), "Hint")) {
                            break;
                        }
                        i22++;
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                Object obj10 = (InterfaceC3214k0) obj6;
                if (obj10 != null) {
                    i14 = ((Number) interfaceC3281e.mo22d(obj10, Integer.valueOf(i8))).intValue();
                } else {
                    i14 = 0;
                }
                int size8 = list.size();
                int i23 = 0;
                while (true) {
                    if (i23 < size8) {
                        Object obj11 = list.get(i23);
                        if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj11), "Supporting")) {
                            obj7 = obj11;
                            break;
                        }
                        i23++;
                    } else {
                        obj7 = null;
                        break;
                    }
                }
                Object obj12 = (InterfaceC3214k0) obj7;
                if (obj12 != null) {
                    i15 = ((Number) interfaceC3281e.mo22d(obj12, Integer.valueOf(i7))).intValue();
                } else {
                    i15 = 0;
                }
                return AbstractC1847a4.m3104c(i9, i10, i12, i13, intValue2, i11, i14, i15, this.f11010c, AbstractC2151s0.f12520a, interfaceC3228q.mo559b(), this.f11011d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: d */
    public final int mo173d(InterfaceC3228q interfaceC3228q, List list, int i7) {
        return m3111e(interfaceC3228q, list, i7, C2035x0.f12104q);
    }

    /* renamed from: e */
    public final int m3111e(InterfaceC3228q interfaceC3228q, List list, int i7, InterfaceC3281e interfaceC3281e) {
        Object obj;
        Object obj2;
        int i8;
        Object obj3;
        int i9;
        Object obj4;
        int i10;
        Object obj5;
        int i11;
        Object obj6;
        int i12;
        int size = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Object obj7 = list.get(i14);
            if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj7), "TextField")) {
                int intValue = ((Number) interfaceC3281e.mo22d(obj7, Integer.valueOf(i7))).intValue();
                int size2 = list.size();
                int i15 = 0;
                while (true) {
                    obj = null;
                    if (i15 < size2) {
                        obj2 = list.get(i15);
                        if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj2), "Label")) {
                            break;
                        }
                        i15++;
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) obj2;
                if (interfaceC3214k0 != null) {
                    i8 = ((Number) interfaceC3281e.mo22d(interfaceC3214k0, Integer.valueOf(i7))).intValue();
                } else {
                    i8 = 0;
                }
                int size3 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 < size3) {
                        obj3 = list.get(i16);
                        if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj3), "Trailing")) {
                            break;
                        }
                        i16++;
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                InterfaceC3214k0 interfaceC3214k02 = (InterfaceC3214k0) obj3;
                if (interfaceC3214k02 != null) {
                    i9 = ((Number) interfaceC3281e.mo22d(interfaceC3214k02, Integer.valueOf(i7))).intValue();
                } else {
                    i9 = 0;
                }
                int size4 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 < size4) {
                        obj4 = list.get(i17);
                        if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj4), "Leading")) {
                            break;
                        }
                        i17++;
                    } else {
                        obj4 = null;
                        break;
                    }
                }
                InterfaceC3214k0 interfaceC3214k03 = (InterfaceC3214k0) obj4;
                if (interfaceC3214k03 != null) {
                    i10 = ((Number) interfaceC3281e.mo22d(interfaceC3214k03, Integer.valueOf(i7))).intValue();
                } else {
                    i10 = 0;
                }
                int size5 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 < size5) {
                        obj5 = list.get(i18);
                        if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj5), "Prefix")) {
                            break;
                        }
                        i18++;
                    } else {
                        obj5 = null;
                        break;
                    }
                }
                InterfaceC3214k0 interfaceC3214k04 = (InterfaceC3214k0) obj5;
                if (interfaceC3214k04 != null) {
                    i11 = ((Number) interfaceC3281e.mo22d(interfaceC3214k04, Integer.valueOf(i7))).intValue();
                } else {
                    i11 = 0;
                }
                int size6 = list.size();
                int i19 = 0;
                while (true) {
                    if (i19 < size6) {
                        obj6 = list.get(i19);
                        if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj6), "Suffix")) {
                            break;
                        }
                        i19++;
                    } else {
                        obj6 = null;
                        break;
                    }
                }
                InterfaceC3214k0 interfaceC3214k05 = (InterfaceC3214k0) obj6;
                if (interfaceC3214k05 != null) {
                    i12 = ((Number) interfaceC3281e.mo22d(interfaceC3214k05, Integer.valueOf(i7))).intValue();
                } else {
                    i12 = 0;
                }
                int size7 = list.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i20);
                    if (AbstractC3367j.m5096a(AbstractC2151s0.m3494d((InterfaceC3214k0) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i20++;
                }
                InterfaceC3214k0 interfaceC3214k06 = (InterfaceC3214k0) obj;
                if (interfaceC3214k06 != null) {
                    i13 = ((Number) interfaceC3281e.mo22d(interfaceC3214k06, Integer.valueOf(i7))).intValue();
                }
                return AbstractC1847a4.m3105d(i10, i9, i11, i12, intValue, i8, i13, this.f11010c, AbstractC2151s0.f12520a, interfaceC3228q.mo559b(), this.f11011d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: g */
    public final int mo3112g(InterfaceC3228q interfaceC3228q, List list, int i7) {
        return m3111e(interfaceC3228q, list, i7, C2035x0.f12106s);
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: h */
    public final int mo3113h(InterfaceC3228q interfaceC3228q, List list, int i7) {
        return m3110c(interfaceC3228q, list, i7, C2035x0.f12103p);
    }
}
