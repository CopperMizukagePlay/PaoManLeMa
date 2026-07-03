package p024c6;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p008b.C0226c0;
import p027d1.C0465c;
import p032d6.C0541i1;
import p032d6.C0548l;
import p032d6.C0584x;
import p032d6.InterfaceC0520b1;
import p032d6.InterfaceC0557o;
import p034e0.C0625q;
import p035e1.AbstractC0659i0;
import p039e5.AbstractC1092mk;
import p039e5.AbstractC1172p7;
import p039e5.AbstractC1249rm;
import p039e5.C0718an;
import p039e5.C0780cl;
import p039e5.C1024ke;
import p039e5.C1065lo;
import p039e5.C1132nt;
import p039e5.C1156om;
import p039e5.C1281sn;
import p039e5.EnumC0964ie;
import p047f6.C1548c;
import p053g5.C1687f;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p061h6.C1834p;
import p069i6.C2103p;
import p077k.AbstractC2212q0;
import p077k.C2196i0;
import p082k5.InterfaceC2316f;
import p082k5.InterfaceC2317g;
import p085l0.AbstractC2399q;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.C2405r1;
import p085l0.C2414u1;
import p085l0.C2420w1;
import p085l0.EnumC2408s1;
import p085l0.InterfaceC2367i;
import p101n0.C2707g;
import p144t.AbstractC3122c;
import p145t0.C3179j;
import p150t5.InterfaceC3281e;
import p153u0.C3334a;
import p153u0.InterfaceC3338e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p161v0.AbstractC3479z;
import p161v0.C3474u;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c6.t */
/* loaded from: classes.dex */
public final /* synthetic */ class C0453t implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f1512e;

    /* renamed from: f */
    public final /* synthetic */ Object f1513f;

    public /* synthetic */ C0453t(int i7, int i8, Object obj) {
        this.f1512e = i8;
        this.f1513f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x0286, code lost:
    
        if (r2 == null) goto L154;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x028d  */
    /* JADX WARN: Type inference failed for: r0v75, types: [t5.c, u5.k] */
    /* JADX WARN: Type inference failed for: r2v45, types: [u5.k, t5.e] */
    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo22d(Object obj, Object obj2) {
        boolean m1018e;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        char c7;
        char c8;
        InterfaceC3338e interfaceC3338e;
        Collection m3058v0;
        char c9 = 7;
        Object obj3 = null;
        int i7 = 0;
        switch (this.f1512e) {
            case 0:
                char[] cArr = (char[]) this.f1513f;
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                AbstractC3367j.m5100e(charSequence, "$this$DelimitedRangesSequence");
                int m936Z = AbstractC0444k.m936Z(charSequence, cArr, intValue, false);
                if (m936Z < 0) {
                    return null;
                }
                return new C1687f(Integer.valueOf(m936Z), 1);
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1172p7.m2035L((C1281sn) this.f1513f, (C2395p) obj, AbstractC2418w.m3957F(9));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC1172p7.m2026C((C1156om) this.f1513f, (C2395p) obj, AbstractC2418w.m3957F(9));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC1172p7.m2038O((C1132nt) this.f1513f, (C2395p) obj, AbstractC2418w.m3957F(9));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC1172p7.m2074u((C0780cl) this.f1513f, (C2395p) obj, AbstractC2418w.m3957F(1));
                break;
            case AbstractC3122c.f15761f /* 5 */:
                ((Integer) obj2).getClass();
                AbstractC1249rm.m2278p((EnumC0964ie) this.f1513f, (C2395p) obj, AbstractC2418w.m3957F(1));
                break;
            case AbstractC3122c.f15759d /* 6 */:
                ((Integer) obj2).getClass();
                AbstractC1249rm.m2282r((C1024ke) this.f1513f, (C2395p) obj, AbstractC2418w.m3957F(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC1092mk.m1831o((C1065lo) this.f1513f, (C2395p) obj, AbstractC2418w.m3957F(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC1249rm.m2296y((C0718an) this.f1513f, (C2395p) obj, AbstractC2418w.m3957F(1));
                break;
            case AbstractC3122c.f15758c /* 9 */:
                ((Integer) obj2).getClass();
                AbstractC1249rm.m2290v((String) this.f1513f, (C2395p) obj, AbstractC2418w.m3957F(7));
                break;
            case AbstractC3122c.f15760e /* 10 */:
                C0625q c0625q = (C0625q) this.f1513f;
                C0465c m1396C = AbstractC0659i0.m1396C((RectF) obj);
                C0465c m1396C2 = AbstractC0659i0.m1396C((RectF) obj2);
                switch (c0625q.f2070a) {
                    case 11:
                        m1018e = m1396C.m1018e(m1396C2);
                        break;
                    default:
                        long m1014a = m1396C.m1014a();
                        float intBitsToFloat = Float.intBitsToFloat((int) (m1014a >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (m1014a & 4294967295L));
                        if (intBitsToFloat >= m1396C2.f1625a) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (intBitsToFloat < m1396C2.f1627c) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolean z11 = z7 & z8;
                        if (intBitsToFloat2 >= m1396C2.f1626b) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        boolean z12 = z11 & z9;
                        if (intBitsToFloat2 < m1396C2.f1628d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m1018e = z12 & z10;
                        break;
                }
                return Boolean.valueOf(m1018e);
            case 11:
                C1834p c1834p = (C1834p) this.f1513f;
                int intValue2 = ((Integer) obj).intValue();
                InterfaceC2316f interfaceC2316f = (InterfaceC2316f) obj2;
                InterfaceC2317g key = interfaceC2316f.getKey();
                Object mo853h = c1834p.f10898i.mo853h(key);
                if (key != C0584x.f1939f) {
                    if (interfaceC2316f != mo853h) {
                        intValue2 = Integer.MIN_VALUE;
                    }
                    intValue2++;
                } else {
                    Object obj4 = (InterfaceC0520b1) mo853h;
                    Object obj5 = (InterfaceC0520b1) interfaceC2316f;
                    while (obj5 != null) {
                        if (obj5 == obj4 || !(obj5 instanceof C2103p)) {
                            obj3 = obj5;
                            if (obj3 == obj4) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + obj3 + ", expected child of " + obj4 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        } else {
                            InterfaceC0557o interfaceC0557o = (InterfaceC0557o) C0541i1.f1887f.get((C2103p) obj5);
                            if (interfaceC0557o != null) {
                                obj5 = interfaceC0557o.getParent();
                            } else {
                                obj5 = null;
                            }
                        }
                    }
                    if (obj3 == obj4) {
                    }
                }
                return Integer.valueOf(intValue2);
            case 12:
                C3179j c3179j = (C3179j) this.f1513f;
                ((Integer) obj).getClass();
                if (obj2 instanceof InterfaceC2367i) {
                    InterfaceC2367i interfaceC2367i = (InterfaceC2367i) obj2;
                    C2196i0 c2196i0 = c3179j.f15899h;
                    if (c2196i0 == null) {
                        int i8 = AbstractC2212q0.f12726a;
                        c2196i0 = new C2196i0();
                        c3179j.f15899h = c2196i0;
                    }
                    c2196i0.m3607i(interfaceC2367i);
                    c3179j.f15897f.m4300b(interfaceC2367i);
                }
                if (obj2 instanceof C2420w1) {
                    c3179j.m4878d((C2420w1) obj2);
                }
                if (obj2 instanceof C2405r1) {
                    ((C2405r1) obj2).m3908d();
                }
                return C1694m.f10482a;
            case 13:
                C2414u1 c2414u1 = (C2414u1) this.f1513f;
                Set set = (Set) obj;
                synchronized (c2414u1.f13580b) {
                    try {
                        if (((EnumC2408s1) c2414u1.f13598t.getValue()).compareTo(EnumC2408s1.f13554i) >= 0) {
                            C2196i0 c2196i02 = c2414u1.f13585g;
                            if (set instanceof C2707g) {
                                C2196i0 c2196i03 = ((C2707g) set).f14520e;
                                Object[] objArr = c2196i03.f12685b;
                                long[] jArr = c2196i03.f12684a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i9 = 0;
                                    while (true) {
                                        long j6 = jArr[i9];
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                                            for (int i11 = i7; i11 < i10; i11++) {
                                                if ((j6 & 255) < 128) {
                                                    Object obj6 = objArr[(i9 << 3) + i11];
                                                    if (!(obj6 instanceof AbstractC3479z) || ((AbstractC3479z) obj6).m5283e(1)) {
                                                        c2196i02.m3599a(obj6);
                                                    }
                                                }
                                                j6 >>= 8;
                                            }
                                            if (i10 != 8) {
                                            }
                                        }
                                        if (i9 != length) {
                                            i9++;
                                            i7 = 0;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj7 : set) {
                                    if (!(obj7 instanceof AbstractC3479z) || ((AbstractC3479z) obj7).m5283e(1)) {
                                        c2196i02.m3599a(obj7);
                                    }
                                }
                            }
                            obj3 = c2414u1.m3920t();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (obj3 != null) {
                    ((C0548l) obj3).mo663n(C1694m.f10482a);
                }
                return C1694m.f10482a;
            case 14:
                C1548c c1548c = (C1548c) this.f1513f;
                Set set2 = (Set) obj;
                if (set2 instanceof C2707g) {
                    C2196i0 c2196i04 = ((C2707g) set2).f14520e;
                    Object[] objArr2 = c2196i04.f12685b;
                    long[] jArr2 = c2196i04.f12684a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j7 = jArr2[i12];
                            if ((((~j7) << c9) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                int i14 = 0;
                                while (i14 < i13) {
                                    if ((j7 & 255) < 128) {
                                        Object obj8 = objArr2[(i12 << 3) + i14];
                                        c8 = c9;
                                        if ((obj8 instanceof AbstractC3479z) && !((AbstractC3479z) obj8).m5283e(4)) {
                                        }
                                    } else {
                                        c8 = c9;
                                    }
                                    j7 >>= 8;
                                    i14++;
                                    c9 = c8;
                                }
                                c7 = c9;
                                if (i13 != 8) {
                                }
                            } else {
                                c7 = c9;
                            }
                            if (i12 != length2) {
                                i12++;
                                c9 = c7;
                            }
                        }
                        c1548c.mo2505v(set2);
                    }
                    return C1694m.f10482a;
                }
                Set set3 = set2;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    for (Object obj9 : set3) {
                        if ((obj9 instanceof AbstractC3479z) && !((AbstractC3479z) obj9).m5283e(4)) {
                        }
                        c1548c.mo2505v(set2);
                    }
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15762g /* 15 */:
                C3334a c3334a = (C3334a) obj;
                List list = (List) ((AbstractC3368k) this.f1513f).mo22d(c3334a, obj2);
                int size = list.size();
                while (i7 < size) {
                    Object obj10 = list.get(i7);
                    if (obj10 != null && (interfaceC3338e = c3334a.f16386f) != null && !interfaceC3338e.mo5074c(obj10)) {
                        throw new IllegalArgumentException(("item at index " + i7 + " can't be saved: " + obj10).toString());
                    }
                    i7++;
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            default:
                C3474u c3474u = (C3474u) this.f1513f;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = c3474u.f16754b;
                while (true) {
                    Object obj11 = atomicReference.get();
                    if (obj11 == null) {
                        m3058v0 = collection;
                    } else if (obj11 instanceof Set) {
                        m3058v0 = AbstractC1806n.m3067O(obj11, collection);
                    } else if (obj11 instanceof List) {
                        m3058v0 = AbstractC1805m.m3058v0((Collection) obj11, AbstractC3784a.m5817z(collection));
                    } else {
                        AbstractC2399q.m3901d("Unexpected notification");
                        throw new RuntimeException();
                    }
                    while (!atomicReference.compareAndSet(obj11, m3058v0)) {
                        if (atomicReference.get() != obj11) {
                            break;
                        }
                    }
                    if (c3474u.m5279b()) {
                        c3474u.f16753a.mo23f(new C0226c0(17, c3474u));
                    }
                    return C1694m.f10482a;
                    break;
                }
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C0453t(int i7, Object obj) {
        this.f1512e = i7;
        this.f1513f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0453t(InterfaceC3281e interfaceC3281e) {
        this.f1512e = 15;
        this.f1513f = (AbstractC3368k) interfaceC3281e;
    }
}
