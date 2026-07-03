package p063i0;

import androidx.compose.foundation.layout.AbstractC0154b;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0076s2;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p060h5.C1814v;
import p071j0.C2131i0;
import p085l0.C2395p;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p140s2.EnumC3103m;
import p144t.C3121b0;
import p144t.C3137j0;
import p144t.InterfaceC3159u0;
import p145t0.C3173d;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3203g1;
import p146t1.InterfaceC3214k0;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.u4 */
/* loaded from: classes.dex */
public final class C2015u4 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11913f = 0;

    /* renamed from: g */
    public final /* synthetic */ int f11914g;

    /* renamed from: h */
    public final /* synthetic */ C3173d f11915h;

    /* renamed from: i */
    public final /* synthetic */ Object f11916i;

    /* renamed from: j */
    public final /* synthetic */ Object f11917j;

    /* renamed from: k */
    public final /* synthetic */ Object f11918k;

    /* renamed from: l */
    public final /* synthetic */ Object f11919l;

    /* renamed from: m */
    public final /* synthetic */ Object f11920m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2015u4(int i7, InterfaceC3281e interfaceC3281e, C3173d c3173d, InterfaceC3281e interfaceC3281e2, InterfaceC3281e interfaceC3281e3, C2131i0 c2131i0, InterfaceC3281e interfaceC3281e4) {
        super(2);
        this.f11914g = i7;
        this.f11916i = interfaceC3281e;
        this.f11915h = c3173d;
        this.f11917j = interfaceC3281e2;
        this.f11918k = interfaceC3281e3;
        this.f11920m = c2131i0;
        this.f11919l = interfaceC3281e4;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        float mo4522t0;
        float mo4824a;
        Integer num;
        Object obj3;
        int i7;
        Object obj4;
        int i8;
        Object obj5;
        int i9;
        int i10;
        ArrayList arrayList;
        C0076s2 c0076s2;
        Object obj6;
        int i11;
        ArrayList arrayList2;
        Integer num2;
        Integer num3;
        int i12;
        int i13;
        int mo3478a;
        int mo4513Q;
        int mo3478a2;
        Object obj7;
        Object obj8;
        int i14;
        int mo4513Q2;
        int mo4513Q3;
        switch (this.f11913f) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC2047y4.m3209b(this.f11914g, (InterfaceC3281e) this.f11916i, this.f11915h, (InterfaceC3281e) this.f11917j, (InterfaceC3281e) this.f11918k, (C2131i0) this.f11920m, (InterfaceC3281e) this.f11919l, c2395p, 0);
                }
                return C1694m.f10482a;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                int intValue = ((Number) obj2).intValue();
                InterfaceC3203g1 interfaceC3203g1 = (InterfaceC3203g1) this.f11917j;
                if ((intValue & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    C3121b0 c3121b0 = new C3121b0((InterfaceC3159u0) this.f11916i, interfaceC3203g1);
                    if (((ArrayList) this.f11918k).isEmpty()) {
                        mo4522t0 = c3121b0.mo4825b();
                    } else {
                        mo4522t0 = interfaceC3203g1.mo4522t0(this.f11914g);
                    }
                    if (!((ArrayList) this.f11919l).isEmpty() && (num = (Integer) this.f11920m) != null) {
                        mo4824a = interfaceC3203g1.mo4522t0(num.intValue());
                    } else {
                        mo4824a = c3121b0.mo4824a();
                    }
                    this.f11915h.mo24c(new C3137j0(AbstractC0154b.m334e(c3121b0, interfaceC3203g1.getLayoutDirection()), mo4522t0, AbstractC0154b.m333d(c3121b0, interfaceC3203g1.getLayoutDirection()), mo4824a), c2395p2, 0);
                }
                return C1694m.f10482a;
            default:
                InterfaceC3203g1 interfaceC3203g12 = (InterfaceC3203g1) obj;
                long j6 = ((C3091a) obj2).f15687a;
                InterfaceC3159u0 interfaceC3159u0 = (InterfaceC3159u0) this.f11920m;
                int m4760h = C3091a.m4760h(j6);
                int m4759g = C3091a.m4759g(j6);
                long m4753a = C3091a.m4753a(j6, 0, 0, 0, 0, 10);
                List mo4888g0 = interfaceC3203g12.mo4888g0(EnumC2055z4.f12207e, (InterfaceC3281e) this.f11916i);
                ArrayList arrayList3 = new ArrayList(mo4888g0.size());
                int size = mo4888g0.size();
                for (int i15 = 0; i15 < size; i15++) {
                    arrayList3.add(((InterfaceC3214k0) mo4888g0.get(i15)).mo4918e(m4753a));
                }
                if (arrayList3.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList3.get(0);
                    int i16 = ((AbstractC3239v0) obj3).f16054f;
                    int m3066N = AbstractC1806n.m3066N(arrayList3);
                    if (1 <= m3066N) {
                        int i17 = 1;
                        while (true) {
                            Object obj9 = arrayList3.get(i17);
                            int i18 = ((AbstractC3239v0) obj9).f16054f;
                            if (i16 < i18) {
                                i16 = i18;
                                obj3 = obj9;
                            }
                            if (i17 != m3066N) {
                                i17++;
                            }
                        }
                    }
                }
                AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) obj3;
                if (abstractC3239v0 != null) {
                    i7 = abstractC3239v0.f16054f;
                } else {
                    i7 = 0;
                }
                List mo4888g02 = interfaceC3203g12.mo4888g0(EnumC2055z4.f12209g, (InterfaceC3281e) this.f11917j);
                ArrayList arrayList4 = new ArrayList(mo4888g02.size());
                int size2 = mo4888g02.size();
                int i19 = 0;
                while (i19 < size2) {
                    arrayList4.add(((InterfaceC3214k0) mo4888g02.get(i19)).mo4918e(AbstractC3092b.m4772i((-interfaceC3159u0.mo3481d(interfaceC3203g12, interfaceC3203g12.getLayoutDirection())) - interfaceC3159u0.mo3480c(interfaceC3203g12, interfaceC3203g12.getLayoutDirection()), -interfaceC3159u0.mo3478a(interfaceC3203g12), m4753a)));
                    i19++;
                    mo4888g02 = mo4888g02;
                }
                if (arrayList4.isEmpty()) {
                    obj4 = null;
                } else {
                    obj4 = arrayList4.get(0);
                    int i20 = ((AbstractC3239v0) obj4).f16054f;
                    int m3066N2 = AbstractC1806n.m3066N(arrayList4);
                    if (1 <= m3066N2) {
                        Object obj10 = obj4;
                        int i21 = i20;
                        int i22 = 1;
                        while (true) {
                            Object obj11 = arrayList4.get(i22);
                            int i23 = ((AbstractC3239v0) obj11).f16054f;
                            if (i21 < i23) {
                                obj10 = obj11;
                                i21 = i23;
                            }
                            if (i22 != m3066N2) {
                                i22++;
                            } else {
                                obj4 = obj10;
                            }
                        }
                    }
                }
                AbstractC3239v0 abstractC3239v02 = (AbstractC3239v0) obj4;
                if (abstractC3239v02 != null) {
                    i8 = abstractC3239v02.f16054f;
                } else {
                    i8 = 0;
                }
                if (arrayList4.isEmpty()) {
                    i9 = i8;
                    obj5 = null;
                } else {
                    obj5 = arrayList4.get(0);
                    int i24 = ((AbstractC3239v0) obj5).f16053e;
                    int m3066N3 = AbstractC1806n.m3066N(arrayList4);
                    if (1 <= m3066N3) {
                        Object obj12 = obj5;
                        int i25 = i24;
                        int i26 = 1;
                        while (true) {
                            Object obj13 = arrayList4.get(i26);
                            i9 = i8;
                            int i27 = ((AbstractC3239v0) obj13).f16053e;
                            if (i25 < i27) {
                                i25 = i27;
                                obj12 = obj13;
                            }
                            if (i26 != m3066N3) {
                                i26++;
                                i8 = i9;
                            } else {
                                obj5 = obj12;
                            }
                        }
                    } else {
                        i9 = i8;
                    }
                }
                AbstractC3239v0 abstractC3239v03 = (AbstractC3239v0) obj5;
                if (abstractC3239v03 != null) {
                    i10 = abstractC3239v03.f16053e;
                } else {
                    i10 = 0;
                }
                List mo4888g03 = interfaceC3203g12.mo4888g0(EnumC2055z4.f12210h, (InterfaceC3281e) this.f11918k);
                ArrayList arrayList5 = new ArrayList(mo4888g03.size());
                int size3 = mo4888g03.size();
                int i28 = 0;
                while (i28 < size3) {
                    List list = mo4888g03;
                    ArrayList arrayList6 = arrayList4;
                    AbstractC3239v0 mo4918e = ((InterfaceC3214k0) mo4888g03.get(i28)).mo4918e(AbstractC3092b.m4772i((-interfaceC3159u0.mo3481d(interfaceC3203g12, interfaceC3203g12.getLayoutDirection())) - interfaceC3159u0.mo3480c(interfaceC3203g12, interfaceC3203g12.getLayoutDirection()), -interfaceC3159u0.mo3478a(interfaceC3203g12), m4753a));
                    if (mo4918e.f16054f == 0 || mo4918e.f16053e == 0) {
                        mo4918e = null;
                    }
                    if (mo4918e != null) {
                        arrayList5.add(mo4918e);
                    }
                    i28++;
                    mo4888g03 = list;
                    arrayList4 = arrayList6;
                }
                ArrayList arrayList7 = arrayList4;
                boolean isEmpty = arrayList5.isEmpty();
                int i29 = this.f11914g;
                if (!isEmpty) {
                    if (arrayList5.isEmpty()) {
                        arrayList = arrayList3;
                        obj7 = null;
                    } else {
                        obj7 = arrayList5.get(0);
                        int i30 = ((AbstractC3239v0) obj7).f16053e;
                        int m3066N4 = AbstractC1806n.m3066N(arrayList5);
                        if (1 <= m3066N4) {
                            int i31 = i30;
                            int i32 = 1;
                            while (true) {
                                Object obj14 = arrayList5.get(i32);
                                arrayList = arrayList3;
                                int i33 = ((AbstractC3239v0) obj14).f16053e;
                                if (i31 < i33) {
                                    i31 = i33;
                                    obj7 = obj14;
                                }
                                if (i32 != m3066N4) {
                                    i32++;
                                    arrayList3 = arrayList;
                                }
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                    }
                    AbstractC3367j.m5097b(obj7);
                    int i34 = ((AbstractC3239v0) obj7).f16053e;
                    if (arrayList5.isEmpty()) {
                        i14 = i34;
                        obj8 = null;
                    } else {
                        obj8 = arrayList5.get(0);
                        int i35 = ((AbstractC3239v0) obj8).f16054f;
                        int m3066N5 = AbstractC1806n.m3066N(arrayList5);
                        if (1 <= m3066N5) {
                            Object obj15 = obj8;
                            int i36 = i35;
                            int i37 = 1;
                            while (true) {
                                Object obj16 = arrayList5.get(i37);
                                i14 = i34;
                                int i38 = ((AbstractC3239v0) obj16).f16054f;
                                if (i36 < i38) {
                                    i36 = i38;
                                    obj15 = obj16;
                                }
                                if (i37 != m3066N5) {
                                    i37++;
                                    i34 = i14;
                                } else {
                                    obj8 = obj15;
                                }
                            }
                        } else {
                            i14 = i34;
                        }
                    }
                    AbstractC3367j.m5097b(obj8);
                    int i39 = ((AbstractC3239v0) obj8).f16054f;
                    EnumC3103m enumC3103m = EnumC3103m.f15703e;
                    if (i29 == 0) {
                        if (interfaceC3203g12.getLayoutDirection() == enumC3103m) {
                            mo4513Q2 = interfaceC3203g12.mo4513Q(AbstractC2047y4.f12191a);
                            c0076s2 = new C0076s2(mo4513Q2, i39, 2);
                        } else {
                            mo4513Q3 = interfaceC3203g12.mo4513Q(AbstractC2047y4.f12191a);
                            mo4513Q2 = (m4760h - mo4513Q3) - i14;
                            c0076s2 = new C0076s2(mo4513Q2, i39, 2);
                        }
                    } else {
                        if (i29 == 2 || i29 == 3) {
                            if (interfaceC3203g12.getLayoutDirection() == enumC3103m) {
                                mo4513Q3 = interfaceC3203g12.mo4513Q(AbstractC2047y4.f12191a);
                                mo4513Q2 = (m4760h - mo4513Q3) - i14;
                            } else {
                                mo4513Q2 = interfaceC3203g12.mo4513Q(AbstractC2047y4.f12191a);
                            }
                        } else {
                            mo4513Q2 = (m4760h - i14) / 2;
                        }
                        c0076s2 = new C0076s2(mo4513Q2, i39, 2);
                    }
                } else {
                    arrayList = arrayList3;
                    c0076s2 = null;
                }
                List mo4888g04 = interfaceC3203g12.mo4888g0(EnumC2055z4.f12211i, new C3173d(-2146438447, new C1851b(3, (InterfaceC3281e) this.f11919l), true));
                ArrayList arrayList8 = new ArrayList(mo4888g04.size());
                int size4 = mo4888g04.size();
                int i40 = 0;
                while (i40 < size4) {
                    arrayList8.add(((InterfaceC3214k0) mo4888g04.get(i40)).mo4918e(m4753a));
                    i40++;
                    mo4888g04 = mo4888g04;
                }
                if (arrayList8.isEmpty()) {
                    arrayList2 = arrayList8;
                    i11 = i7;
                    obj6 = null;
                } else {
                    obj6 = arrayList8.get(0);
                    int i41 = ((AbstractC3239v0) obj6).f16054f;
                    int m3066N6 = AbstractC1806n.m3066N(arrayList8);
                    i11 = i7;
                    if (1 <= m3066N6) {
                        int i42 = i41;
                        int i43 = 1;
                        while (true) {
                            Object obj17 = arrayList8.get(i43);
                            arrayList2 = arrayList8;
                            int i44 = ((AbstractC3239v0) obj17).f16054f;
                            if (i42 < i44) {
                                i42 = i44;
                                obj6 = obj17;
                            }
                            if (i43 != m3066N6) {
                                i43++;
                                arrayList8 = arrayList2;
                            }
                        }
                    } else {
                        arrayList2 = arrayList8;
                    }
                }
                AbstractC3239v0 abstractC3239v04 = (AbstractC3239v0) obj6;
                if (abstractC3239v04 != null) {
                    num2 = Integer.valueOf(abstractC3239v04.f16054f);
                } else {
                    num2 = null;
                }
                if (c0076s2 != null) {
                    int i45 = c0076s2.f375c;
                    if (num2 != null && i29 != 3) {
                        mo4513Q = num2.intValue() + i45;
                        mo3478a2 = interfaceC3203g12.mo4513Q(AbstractC2047y4.f12191a);
                    } else {
                        mo4513Q = interfaceC3203g12.mo4513Q(AbstractC2047y4.f12191a) + i45;
                        mo3478a2 = interfaceC3159u0.mo3478a(interfaceC3203g12);
                    }
                    num3 = Integer.valueOf(mo3478a2 + mo4513Q);
                } else {
                    num3 = null;
                }
                if (i9 != 0) {
                    if (num3 != null) {
                        mo3478a = num3.intValue();
                    } else if (num2 != null) {
                        mo3478a = num2.intValue();
                    } else {
                        mo3478a = interfaceC3159u0.mo3478a(interfaceC3203g12);
                    }
                    i13 = i9 + mo3478a;
                    i12 = m4760h;
                } else {
                    i12 = m4760h;
                    i13 = 0;
                }
                C0076s2 c0076s22 = c0076s2;
                ArrayList arrayList9 = arrayList;
                ArrayList arrayList10 = arrayList2;
                List mo4888g05 = interfaceC3203g12.mo4888g0(EnumC2055z4.f12208f, new C3173d(-1213360416, new C2015u4((InterfaceC3159u0) this.f11920m, interfaceC3203g12, arrayList9, i11, arrayList10, num2, this.f11915h), true));
                ArrayList arrayList11 = new ArrayList(mo4888g05.size());
                int size5 = mo4888g05.size();
                int i46 = 0;
                while (i46 < size5) {
                    arrayList11.add(((InterfaceC3214k0) mo4888g05.get(i46)).mo4918e(m4753a));
                    i46++;
                    i12 = i12;
                }
                int i47 = i12;
                return interfaceC3203g12.mo4941K(i47, m4759g, C1814v.f10861e, new C2031w4(arrayList11, arrayList9, arrayList7, arrayList10, c0076s22, i47, i10, (InterfaceC3159u0) this.f11920m, interfaceC3203g12, m4759g, i13, num2, arrayList5, num3));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2015u4(InterfaceC3159u0 interfaceC3159u0, InterfaceC3203g1 interfaceC3203g1, ArrayList arrayList, int i7, ArrayList arrayList2, Integer num, C3173d c3173d) {
        super(2);
        this.f11916i = interfaceC3159u0;
        this.f11917j = interfaceC3203g1;
        this.f11918k = arrayList;
        this.f11914g = i7;
        this.f11919l = arrayList2;
        this.f11920m = num;
        this.f11915h = c3173d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2015u4(InterfaceC3281e interfaceC3281e, InterfaceC3281e interfaceC3281e2, InterfaceC3281e interfaceC3281e3, int i7, InterfaceC3159u0 interfaceC3159u0, InterfaceC3281e interfaceC3281e4, C3173d c3173d) {
        super(2);
        this.f11916i = interfaceC3281e;
        this.f11917j = interfaceC3281e2;
        this.f11918k = interfaceC3281e3;
        this.f11914g = i7;
        this.f11920m = interfaceC3159u0;
        this.f11919l = interfaceC3281e4;
        this.f11915h = c3173d;
    }
}
