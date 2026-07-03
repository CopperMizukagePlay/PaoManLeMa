package p050g2;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import p001a0.AbstractC0094y0;
import p001a0.C0031h1;
import p001a0.C0068q2;
import p006a7.C0129l;
import p035e1.C0665l0;
import p039e5.C1162os;
import p049g1.AbstractC1571e;
import p049g1.C1573g;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.C1813u;
import p080k2.AbstractC2305p;
import p080k2.C2298i;
import p080k2.C2299j;
import p080k2.C2300k;
import p080k2.InterfaceC2293d;
import p095m2.AbstractC2550a;
import p103n2.AbstractC2715c;
import p103n2.C2713a;
import p103n2.C2714b;
import p110o2.C2807d;
import p132r2.C3027a;
import p132r2.C3031e;
import p132r2.C3035i;
import p132r2.C3038l;
import p132r2.C3040n;
import p132r2.C3042p;
import p132r2.C3043q;
import p132r2.C3045s;
import p132r2.InterfaceC3041o;
import p140s2.C3105o;
import p140s2.C3106p;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3279c;
import p155u2.AbstractC3353a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC1586f0 {

    /* renamed from: a */
    public static final C0068q2 f10235a;

    /* renamed from: b */
    public static final C0068q2 f10236b;

    /* renamed from: c */
    public static final C0068q2 f10237c;

    static {
        int i7 = 22;
        f10235a = new C0068q2(i7, new C1584e0(0), new C1162os(26));
        f10236b = new C0068q2(i7, new C1584e0(1), new C1162os(27));
        f10237c = new C0068q2(i7, new C1584e0(2), new C1162os(28));
    }

    /* renamed from: a */
    public static C1575a m2557a(String str, C1604o0 c1604o0, long j6, InterfaceC3093c interfaceC3093c, InterfaceC2293d interfaceC2293d, int i7, int i8) {
        C1813u c1813u = C1813u.f10860e;
        return new C1575a(new C2807d(str, c1604o0, c1813u, c1813u, interfaceC2293d, interfaceC3093c), i7, 1, j6);
    }

    /* renamed from: b */
    public static final long m2558b(int i7, int i8) {
        if (i7 < 0 || i8 < 0) {
            AbstractC2550a.m4078a("start and end cannot be negative. [start: " + i7 + ", end: " + i8 + ']');
        }
        long j6 = (i8 & 4294967295L) | (i7 << 32);
        int i9 = C1602n0.f10303c;
        return j6;
    }

    /* renamed from: c */
    public static final long m2559c(int i7, long j6) {
        int i8;
        int i9 = C1602n0.f10303c;
        int i10 = (int) (j6 >> 32);
        int i11 = 0;
        if (i10 < 0) {
            i8 = 0;
        } else {
            i8 = i10;
        }
        if (i8 > i7) {
            i8 = i7;
        }
        int i12 = (int) (4294967295L & j6);
        if (i12 >= 0) {
            i11 = i12;
        }
        if (i11 <= i7) {
            i7 = i11;
        }
        if (i8 == i10 && i7 == i12) {
            return j6;
        }
        return m2558b(i8, i7);
    }

    /* renamed from: d */
    public static final int m2560d(int i7, List list) {
        int i8;
        char c7;
        int i9 = ((C1610s) AbstractC1805m.m3052p0(list)).f10331c;
        if (i7 > ((C1610s) AbstractC1805m.m3052p0(list)).f10331c) {
            AbstractC2550a.m4078a("Index " + i7 + " should be less or equal than last line's end " + i9);
        }
        int size = list.size() - 1;
        int i10 = 0;
        while (true) {
            if (i10 <= size) {
                i8 = (i10 + size) >>> 1;
                C1610s c1610s = (C1610s) list.get(i8);
                if (c1610s.f10330b > i7) {
                    c7 = 1;
                } else if (c1610s.f10331c <= i7) {
                    c7 = 65535;
                } else {
                    c7 = 0;
                }
                if (c7 < 0) {
                    i10 = i8 + 1;
                } else {
                    if (c7 <= 0) {
                        break;
                    }
                    size = i8 - 1;
                }
            } else {
                i8 = -(i10 + 1);
                break;
            }
        }
        if (i8 >= 0 && i8 < list.size()) {
            return i8;
        }
        StringBuilder m188o = AbstractC0094y0.m188o(i8, "Found paragraph index ", " should be in range [0, ");
        m188o.append(list.size());
        m188o.append(").\nDebug info: index=");
        m188o.append(i7);
        m188o.append(", paragraphs=[");
        m188o.append(AbstractC3353a.m5086a(list, null, new C1162os(3), 31));
        m188o.append(']');
        AbstractC2550a.m4078a(m188o.toString());
        return i8;
    }

    /* renamed from: e */
    public static final int m2561e(int i7, ArrayList arrayList) {
        char c7;
        int size = arrayList.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            C1610s c1610s = (C1610s) arrayList.get(i9);
            if (c1610s.f10332d > i7) {
                c7 = 1;
            } else if (c1610s.f10333e <= i7) {
                c7 = 65535;
            } else {
                c7 = 0;
            }
            if (c7 < 0) {
                i8 = i9 + 1;
            } else if (c7 > 0) {
                size = i9 - 1;
            } else {
                return i9;
            }
        }
        return -(i8 + 1);
    }

    /* renamed from: f */
    public static final int m2562f(ArrayList arrayList, float f7) {
        char c7;
        if (f7 <= 0.0f) {
            return 0;
        }
        if (f7 >= ((C1610s) AbstractC1805m.m3052p0(arrayList)).f10335g) {
            return AbstractC1806n.m3066N(arrayList);
        }
        int size = arrayList.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i8 = (i7 + size) >>> 1;
            C1610s c1610s = (C1610s) arrayList.get(i8);
            if (c1610s.f10334f > f7) {
                c7 = 1;
            } else if (c1610s.f10335g <= f7) {
                c7 = 65535;
            } else {
                c7 = 0;
            }
            if (c7 < 0) {
                i7 = i8 + 1;
            } else if (c7 > 0) {
                size = i8 - 1;
            } else {
                return i8;
            }
        }
        return -(i7 + 1);
    }

    /* renamed from: g */
    public static final void m2563g(ArrayList arrayList, long j6, InterfaceC3279c interfaceC3279c) {
        int size = arrayList.size();
        for (int m2560d = m2560d(C1602n0.m2589e(j6), arrayList); m2560d < size; m2560d++) {
            C1610s c1610s = (C1610s) arrayList.get(m2560d);
            if (c1610s.f10330b < C1602n0.m2588d(j6)) {
                if (c1610s.f10330b != c1610s.f10331c) {
                    interfaceC3279c.mo23f(c1610s);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public static final C1604o0 m2564h(C1604o0 c1604o0, EnumC3103m enumC3103m) {
        int i7;
        int i8;
        float f7;
        InterfaceC3041o interfaceC3041o;
        long j6;
        C2300k c2300k;
        C2298i c2298i;
        C2714b c2714b;
        C1588g0 c1588g0 = c1604o0.f10309a;
        InterfaceC3041o interfaceC3041o2 = AbstractC1590h0.f10262d;
        InterfaceC3041o interfaceC3041o3 = c1588g0.f10242a;
        if (interfaceC3041o3.equals(C3040n.f15609a)) {
            interfaceC3041o3 = AbstractC1590h0.f10262d;
        }
        InterfaceC3041o interfaceC3041o4 = interfaceC3041o3;
        long j7 = c1588g0.f10243b;
        C3106p[] c3106pArr = C3105o.f15707b;
        if ((j7 & 1095216660480L) == 0) {
            j7 = AbstractC1590h0.f10259a;
        }
        long j8 = j7;
        C2300k c2300k2 = c1588g0.f10244c;
        if (c2300k2 == null) {
            c2300k2 = C2300k.f13233h;
        }
        C2300k c2300k3 = c2300k2;
        C2298i c2298i2 = c1588g0.f10245d;
        if (c2298i2 != null) {
            i7 = c2298i2.f13229a;
        } else {
            i7 = 0;
        }
        C2298i c2298i3 = new C2298i(i7);
        C2299j c2299j = c1588g0.f10246e;
        if (c2299j != null) {
            i8 = c2299j.f13230a;
        } else {
            i8 = 65535;
        }
        C2299j c2299j2 = new C2299j(i8);
        AbstractC2305p abstractC2305p = c1588g0.f10247f;
        if (abstractC2305p == null) {
            abstractC2305p = AbstractC2305p.f13242a;
        }
        AbstractC2305p abstractC2305p2 = abstractC2305p;
        String str = c1588g0.f10248g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j9 = c1588g0.f10249h;
        if ((j9 & 1095216660480L) == 0) {
            j9 = AbstractC1590h0.f10260b;
        }
        C3027a c3027a = c1588g0.f10250i;
        if (c3027a != null) {
            f7 = c3027a.f15585a;
        } else {
            f7 = 0.0f;
        }
        C3027a c3027a2 = new C3027a(f7);
        C3042p c3042p = c1588g0.f10251j;
        if (c3042p == null) {
            c3042p = C3042p.f15610c;
        }
        C3042p c3042p2 = c3042p;
        C2714b c2714b2 = c1588g0.f10252k;
        if (c2714b2 == null) {
            C2714b c2714b3 = C2714b.f14562g;
            C0031h1 c0031h1 = AbstractC2715c.f14565a;
            c0031h1.getClass();
            LocaleList localeList = LocaleList.getDefault();
            interfaceC3041o = interfaceC3041o4;
            synchronized (((C0129l) c0031h1.f154h)) {
                j6 = j8;
                try {
                    c2714b = (C2714b) c0031h1.f153g;
                    if (c2714b != null && localeList == ((LocaleList) c0031h1.f152f)) {
                        c2300k = c2300k3;
                        c2298i = c2298i3;
                    } else {
                        int size = localeList.size();
                        ArrayList arrayList = new ArrayList(size);
                        c2300k = c2300k3;
                        int i9 = 0;
                        while (i9 < size) {
                            arrayList.add(new C2713a(localeList.get(i9)));
                            i9++;
                            size = size;
                            c2298i3 = c2298i3;
                        }
                        c2298i = c2298i3;
                        c2714b = new C2714b(arrayList);
                        c0031h1.f152f = localeList;
                        c0031h1.f153g = c2714b;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c2714b2 = c2714b;
        } else {
            interfaceC3041o = interfaceC3041o4;
            j6 = j8;
            c2300k = c2300k3;
            c2298i = c2298i3;
        }
        C2714b c2714b4 = c2714b2;
        long j10 = c1588g0.f10253l;
        if (j10 == 16) {
            j10 = AbstractC1590h0.f10261c;
        }
        C3038l c3038l = c1588g0.f10254m;
        if (c3038l == null) {
            c3038l = C3038l.f15604b;
        }
        C0665l0 c0665l0 = c1588g0.f10255n;
        if (c0665l0 == null) {
            c0665l0 = C0665l0.f2176d;
        }
        C1616y c1616y = c1588g0.f10256o;
        AbstractC1571e abstractC1571e = c1588g0.f10257p;
        if (abstractC1571e == null) {
            abstractC1571e = C1573g.f10187a;
        }
        C0665l0 c0665l02 = c0665l0;
        C3038l c3038l2 = c3038l;
        InterfaceC3041o interfaceC3041o5 = interfaceC3041o;
        C1588g0 c1588g02 = new C1588g0(interfaceC3041o5, j6, c2300k, c2298i, c2299j2, abstractC2305p2, str2, j9, c3027a2, c3042p2, c2714b4, j10, c3038l2, c0665l02, c1616y, abstractC1571e);
        C1613v c1613v = c1604o0.f10310b;
        int i10 = AbstractC1614w.f10349b;
        int i11 = c1613v.f10339a;
        int i12 = 5;
        if (i11 == Integer.MIN_VALUE) {
            i11 = 5;
        }
        int i13 = c1613v.f10340b;
        if (i13 == 3) {
            int ordinal = enumC3103m.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw new RuntimeException();
                }
            } else {
                i12 = 4;
            }
        } else if (i13 == Integer.MIN_VALUE) {
            int ordinal2 = enumC3103m.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    i12 = 2;
                } else {
                    throw new RuntimeException();
                }
            } else {
                i12 = 1;
            }
        } else {
            i12 = i13;
        }
        long j11 = c1613v.f10341c;
        if ((j11 & 1095216660480L) == 0) {
            j11 = AbstractC1614w.f10348a;
        }
        C3043q c3043q = c1613v.f10342d;
        if (c3043q == null) {
            c3043q = C3043q.f15613c;
        }
        C1615x c1615x = c1613v.f10343e;
        C3043q c3043q2 = c3043q;
        C3035i c3035i = c1613v.f10344f;
        int i14 = c1613v.f10345g;
        if (i14 == 0) {
            i14 = C3031e.f15590b;
        }
        int i15 = c1613v.f10346h;
        if (i15 == Integer.MIN_VALUE) {
            i15 = 1;
        }
        C3045s c3045s = c1613v.f10347i;
        if (c3045s == null) {
            c3045s = C3045s.f15617c;
        }
        return new C1604o0(c1588g02, new C1613v(i11, i12, j11, c3043q2, c1615x, c3035i, i14, i15, c3045s), c1604o0.f10311c);
    }
}
