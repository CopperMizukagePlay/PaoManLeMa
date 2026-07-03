package p050g2;

import java.util.Map;
import p001a0.C0068q2;
import p032d6.InterfaceC0571s1;
import p060h5.AbstractC1806n;
import p069i6.C2108u;
import p077k.C2194h0;
import p082k5.C2312b;
import p082k5.C2314d;
import p082k5.C2319i;
import p082k5.InterfaceC2315e;
import p082k5.InterfaceC2316f;
import p082k5.InterfaceC2318h;
import p132r2.C3031e;
import p132r2.C3044r;
import p132r2.C3045s;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3281e;
import p153u0.C3336c;
import p153u0.InterfaceC3338e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1584e0 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f10233e;

    public /* synthetic */ C1584e0(int i7) {
        this.f10233e = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7;
        C2312b c2312b;
        Integer num = null;
        switch (this.f10233e) {
            case 0:
                Boolean valueOf = Boolean.valueOf(((C1615x) obj2).f10351a);
                C0068q2 c0068q2 = AbstractC1582d0.f10208a;
                return AbstractC1806n.m3063K(valueOf, new Object());
            case 1:
                return Integer.valueOf(((C3031e) obj2).f15591a);
            case 2:
                C3045s c3045s = (C3045s) obj2;
                C3044r c3044r = new C3044r(c3045s.f15619a);
                C0068q2 c0068q22 = AbstractC1582d0.f10208a;
                return AbstractC1806n.m3063K(c3044r, Boolean.valueOf(c3045s.f15620b));
            case 3:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 4:
                InterfaceC2316f interfaceC2316f = (InterfaceC2316f) obj2;
                if (!(interfaceC2316f instanceof InterfaceC0571s1)) {
                    return obj;
                }
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                }
                if (num != null) {
                    i7 = num.intValue();
                } else {
                    i7 = 1;
                }
                if (i7 == 0) {
                    return interfaceC2316f;
                }
                return Integer.valueOf(i7 + 1);
            case AbstractC3122c.f15761f /* 5 */:
                InterfaceC0571s1 interfaceC0571s1 = (InterfaceC0571s1) obj;
                InterfaceC2316f interfaceC2316f2 = (InterfaceC2316f) obj2;
                if (interfaceC0571s1 != null) {
                    return interfaceC0571s1;
                }
                if (!(interfaceC2316f2 instanceof InterfaceC0571s1)) {
                    return null;
                }
                return (InterfaceC0571s1) interfaceC2316f2;
            case AbstractC3122c.f15759d /* 6 */:
                return (C2108u) obj;
            case 7:
                String str = (String) obj;
                InterfaceC2316f interfaceC2316f3 = (InterfaceC2316f) obj2;
                AbstractC3367j.m5100e(str, "acc");
                AbstractC3367j.m5100e(interfaceC2316f3, "element");
                if (str.length() == 0) {
                    return interfaceC2316f3.toString();
                }
                return str + ", " + interfaceC2316f3;
            case 8:
                InterfaceC2318h interfaceC2318h = (InterfaceC2318h) obj;
                InterfaceC2316f interfaceC2316f4 = (InterfaceC2316f) obj2;
                AbstractC3367j.m5100e(interfaceC2318h, "acc");
                AbstractC3367j.m5100e(interfaceC2316f4, "element");
                InterfaceC2318h mo854t = interfaceC2318h.mo854t(interfaceC2316f4.getKey());
                C2319i c2319i = C2319i.f13273e;
                if (mo854t != c2319i) {
                    C2314d c2314d = C2314d.f13272e;
                    InterfaceC2315e interfaceC2315e = (InterfaceC2315e) mo854t.mo853h(c2314d);
                    if (interfaceC2315e == null) {
                        c2312b = new C2312b(interfaceC2316f4, mo854t);
                    } else {
                        InterfaceC2318h mo854t2 = mo854t.mo854t(c2314d);
                        if (mo854t2 == c2319i) {
                            return new C2312b(interfaceC2315e, interfaceC2316f4);
                        }
                        c2312b = new C2312b(interfaceC2315e, new C2312b(interfaceC2316f4, mo854t2));
                    }
                    return c2312b;
                }
                return interfaceC2316f4;
            case AbstractC3122c.f15758c /* 9 */:
                C3336c c3336c = (C3336c) obj2;
                Map map = c3336c.f16393e;
                C2194h0 c2194h0 = c3336c.f16394f;
                Object[] objArr = c2194h0.f12677b;
                Object[] objArr2 = c2194h0.f12678c;
                long[] jArr = c2194h0.f12676a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j6 = jArr[i8];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j6) < 128) {
                                    int i11 = (i8 << 3) + i10;
                                    Object obj3 = objArr[i11];
                                    Map mo5075d = ((InterfaceC3338e) objArr2[i11]).mo5075d();
                                    if (mo5075d.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mo5075d);
                                    }
                                }
                                j6 >>= 8;
                            }
                            if (i9 != 8) {
                            }
                        }
                        if (i8 != length) {
                            i8++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            default:
                return obj2;
        }
    }
}
