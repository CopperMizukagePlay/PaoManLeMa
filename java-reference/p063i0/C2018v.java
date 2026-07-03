package p063i0;

import androidx.compose.p007ui.layout.AbstractC0172a;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p019c1.C0380x;
import p060h5.AbstractC1806n;
import p060h5.C1814v;
import p085l0.C2345c1;
import p085l0.InterfaceC2425y0;
import p140s2.C3091a;
import p144t.InterfaceC3128f;
import p144t.InterfaceC3132h;
import p146t1.AbstractC3189c;
import p146t1.AbstractC3239v0;
import p146t1.C3216l;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3217l0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.v */
/* loaded from: classes.dex */
public final class C2018v implements InterfaceC3217l0 {

    /* renamed from: a */
    public final /* synthetic */ int f11939a;

    /* renamed from: b */
    public final /* synthetic */ Object f11940b;

    /* renamed from: c */
    public final /* synthetic */ Object f11941c;

    /* renamed from: d */
    public final /* synthetic */ Object f11942d;

    public /* synthetic */ C2018v(Object obj, Object obj2, Object obj3, int i7) {
        this.f11939a = i7;
        this.f11940b = obj;
        this.f11941c = obj2;
        this.f11942d = obj3;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        int m4760h;
        int i7;
        int m4759g;
        Integer valueOf;
        int i8;
        switch (this.f11939a) {
            case 0:
                int size = list.size();
                int i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) list.get(i10);
                    if (AbstractC3367j.m5096a(AbstractC0172a.m391a(interfaceC3214k0), "navigationIcon")) {
                        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(C3091a.m4753a(j6, 0, 0, 0, 0, 14));
                        int size2 = list.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            InterfaceC3214k0 interfaceC3214k02 = (InterfaceC3214k0) list.get(i11);
                            if (AbstractC3367j.m5096a(AbstractC0172a.m391a(interfaceC3214k02), "actionIcons")) {
                                AbstractC3239v0 mo4918e2 = interfaceC3214k02.mo4918e(C3091a.m4753a(j6, 0, 0, 0, 0, 14));
                                if (C3091a.m4760h(j6) == Integer.MAX_VALUE) {
                                    m4760h = C3091a.m4760h(j6);
                                } else {
                                    m4760h = (C3091a.m4760h(j6) - mo4918e.f16053e) - mo4918e2.f16053e;
                                    if (m4760h < 0) {
                                        m4760h = 0;
                                    }
                                }
                                int i12 = m4760h;
                                int size3 = list.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    InterfaceC3214k0 interfaceC3214k03 = (InterfaceC3214k0) list.get(i13);
                                    if (AbstractC3367j.m5096a(AbstractC0172a.m391a(interfaceC3214k03), "title")) {
                                        AbstractC3239v0 mo4918e3 = interfaceC3214k03.mo4918e(C3091a.m4753a(j6, 0, i12, 0, 0, 12));
                                        C3216l c3216l = AbstractC3189c.f15929b;
                                        if (mo4918e3.mo4939h0(c3216l) != Integer.MIN_VALUE) {
                                            i7 = mo4918e3.mo4939h0(c3216l);
                                        } else {
                                            i7 = 0;
                                        }
                                        ((C1986r) this.f11940b).getClass();
                                        if (!Float.isNaN(0.0f)) {
                                            i9 = AbstractC3784a.m5794D(0.0f);
                                        }
                                        if (C3091a.m4759g(j6) == Integer.MAX_VALUE) {
                                            m4759g = C3091a.m4759g(j6);
                                        } else {
                                            m4759g = C3091a.m4759g(j6) + i9;
                                        }
                                        int i14 = m4759g;
                                        return interfaceC3223n0.mo4941K(C3091a.m4760h(j6), i14, C1814v.f10861e, new C2010u(mo4918e, i14, mo4918e3, (InterfaceC3128f) this.f11941c, j6, mo4918e2, interfaceC3223n0, (InterfaceC3132h) this.f11942d, i7));
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                long m4753a = C3091a.m4753a(j6, 0, 0, 0, 0, 10);
                ArrayList arrayList = new ArrayList(list.size());
                int size4 = list.size();
                int i15 = 0;
                for (int i16 = 0; i16 < size4; i16++) {
                    arrayList.add(((InterfaceC3214k0) list.get(i16)).mo4918e(m4753a));
                }
                Integer num = null;
                int i17 = 1;
                if (arrayList.isEmpty()) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(((AbstractC3239v0) arrayList.get(0)).f16053e);
                    int m3066N = AbstractC1806n.m3066N(arrayList);
                    if (1 <= m3066N) {
                        int i18 = 1;
                        while (true) {
                            Integer valueOf2 = Integer.valueOf(((AbstractC3239v0) arrayList.get(i18)).f16053e);
                            if (valueOf2.compareTo(valueOf) > 0) {
                                valueOf = valueOf2;
                            }
                            if (i18 != m3066N) {
                                i18++;
                            }
                        }
                    }
                }
                if (valueOf != null) {
                    i8 = valueOf.intValue();
                } else {
                    i8 = 0;
                }
                if (!arrayList.isEmpty()) {
                    Integer valueOf3 = Integer.valueOf(((AbstractC3239v0) arrayList.get(0)).f16054f);
                    int m3066N2 = AbstractC1806n.m3066N(arrayList);
                    if (1 <= m3066N2) {
                        while (true) {
                            Integer valueOf4 = Integer.valueOf(((AbstractC3239v0) arrayList.get(i17)).f16054f);
                            if (valueOf4.compareTo(valueOf3) > 0) {
                                valueOf3 = valueOf4;
                            }
                            if (i17 != m3066N2) {
                                i17++;
                            }
                        }
                    }
                    num = valueOf3;
                }
                if (num != null) {
                    i15 = num.intValue();
                }
                return interfaceC3223n0.mo4941K(i8, i15, C1814v.f10861e, new C0380x((C1956n1) this.f11940b, i8, arrayList, (InterfaceC2425y0) this.f11941c, (C2345c1) this.f11942d, 3));
        }
    }
}
