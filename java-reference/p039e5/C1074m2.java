package p039e5;

import android.net.Network;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p001a0.AbstractC0094y0;
import p008b.C0242k0;
import p032d6.AbstractC0525d0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p068i5.C2079c;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p091l6.C2477h;
import p091l6.C2478i;
import p098m5.AbstractC2583c;
import p150t5.InterfaceC3281e;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.m2 */
/* loaded from: classes.dex */
public final class C1074m2 {

    /* renamed from: a */
    public static final C1074m2 f5786a = new Object();

    /* renamed from: b */
    public static final C2478i f5787b = new C2477h(12);

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1636a(String str, Network network, C1405wn c1405wn, EnumC1127no enumC1127no, InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        C0761c2 c0761c2;
        int i7;
        if (abstractC2583c instanceof C0761c2) {
            c0761c2 = (C0761c2) abstractC2583c;
            int i8 = c0761c2.f2962j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0761c2.f2962j = i8 - Integer.MIN_VALUE;
                C0761c2 c0761c22 = c0761c2;
                Object obj = c0761c22.f2960h;
                i7 = c0761c22.f2962j;
                if (i7 == 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c0761c22.f2962j = 1;
                    obj = m1637b(str, network, c1405wn, enumC1127no, interfaceC3281e, c0761c22);
                    Object obj2 = EnumC2465a.f13750e;
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                return AbstractC1249rm.m2231M((List) obj);
            }
        }
        c0761c2 = new C0761c2(this, abstractC2583c);
        C0761c2 c0761c222 = c0761c2;
        Object obj3 = c0761c222.f2960h;
        i7 = c0761c222.f2962j;
        if (i7 == 0) {
        }
        return AbstractC1249rm.m2231M((List) obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1637b(String str, Network network, C1405wn c1405wn, EnumC1127no enumC1127no, InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        C0793d2 c0793d2;
        int i7;
        List<C1485za> list;
        int size;
        Network network2;
        int i8;
        List list2;
        int i9;
        InterfaceC3281e interfaceC3281e2;
        EnumC1127no enumC1127no2;
        List list3;
        C1074m2 c1074m2;
        int i10;
        List list4;
        String str2 = str;
        if (abstractC2583c instanceof C0793d2) {
            c0793d2 = (C0793d2) abstractC2583c;
            int i11 = c0793d2.f3301s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0793d2.f3301s = i11 - Integer.MIN_VALUE;
                C0793d2 c0793d22 = c0793d2;
                Object obj = c0793d22.f3299q;
                i7 = c0793d22.f3301s;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i12 = c0793d22.f3298p;
                    int i13 = c0793d22.f3297o;
                    List list5 = c0793d22.f3296n;
                    List list6 = c0793d22.f3295m;
                    InterfaceC3281e interfaceC3281e3 = c0793d22.f3294l;
                    enumC1127no2 = c0793d22.f3293k;
                    Network network3 = c0793d22.f3292j;
                    String str3 = c0793d22.f3291i;
                    C1074m2 c1074m22 = c0793d22.f3290h;
                    AbstractC1793a0.m2972L(obj);
                    i8 = i12;
                    list2 = list5;
                    str2 = str3;
                    interfaceC3281e2 = interfaceC3281e3;
                    list3 = list6;
                    network2 = network3;
                    i9 = i13;
                    c1074m2 = c1074m22;
                } else {
                    AbstractC1793a0.m2972L(obj);
                    List<String> m2389c = c1405wn.m2389c();
                    boolean z7 = c1405wn.f8506d;
                    boolean isEmpty = m2389c.isEmpty();
                    C1813u c1813u = C1813u.f10860e;
                    if (isEmpty) {
                        return c1813u;
                    }
                    int m3530q = AbstractC2168e.m3530q(c1405wn.f8504b, 300, 10000);
                    int m3530q2 = AbstractC2168e.m3530q(c1405wn.f8505c, 1, 10);
                    if (z7) {
                        list = (List) c1405wn.f8508f.getValue();
                    } else {
                        list = c1813u;
                    }
                    ConcurrentHashMap.KeySetView keySetView = AbstractC1265s7.f7527a;
                    int size2 = c1405wn.f8507e.size();
                    int size3 = list.size();
                    StringBuilder sb = new StringBuilder("RESOLVE start host=");
                    sb.append(str2);
                    sb.append(" servers=");
                    sb.append(m2389c);
                    sb.append(" ecsEnabled=");
                    sb.append(z7);
                    sb.append(" rawSubnets=");
                    sb.append(size2);
                    sb.append(" normalizedSubnets=");
                    AbstractC0094y0.m192s(sb, size3, " timeout=", m3530q, "ms networkMode=");
                    sb.append(enumC1127no);
                    AbstractC1265s7.m2308e(sb.toString());
                    if (z7 && list.isEmpty()) {
                        AbstractC1265s7.m2310g("RESOLVE ecsEnabled but no valid subnets; raw=" + AbstractC1805m.m3051o0(c1405wn.f8507e, null, null, null, new C0242k0(21), 31));
                    }
                    boolean isEmpty2 = list.isEmpty();
                    int size4 = m2389c.size();
                    int size5 = list.size();
                    if (!isEmpty2 || (size = list.size()) < 1) {
                        size = 1;
                    }
                    int i14 = (size5 + size) * size4;
                    C2079c m5802f = AbstractC3784a.m5802f();
                    int i15 = 0;
                    for (String str4 : m2389c) {
                        if (list.isEmpty()) {
                            i10 = i15 + 1;
                            m5802f.add(new C0729b2(str4, null, "", i10, i14));
                        } else {
                            for (C1485za c1485za : list) {
                                int i16 = i15 + 1;
                                m5802f.add(new C0729b2(str4, c1485za, c1485za.m2437a(), i16, i14));
                                i15 = i16;
                            }
                            i10 = i15 + 1;
                            m5802f.add(new C0729b2(str4, null, "默认", i10, i14));
                        }
                        i15 = i10;
                    }
                    C2079c m5798b = AbstractC3784a.m5798b(m5802f);
                    ConcurrentHashMap.KeySetView keySetView2 = AbstractC1265s7.f7527a;
                    AbstractC1265s7.m2308e("RESOLVE jobs=" + m5798b.mo2999a() + " " + AbstractC1805m.m3051o0(m5798b, null, null, null, new C0242k0(22), 31));
                    List list7 = list;
                    C0920h2 c0920h2 = new C0920h2(m5798b, interfaceC3281e, str2, c1405wn, enumC1127no, network, m3530q2, (InterfaceC2313c) null);
                    c0793d22.f3290h = this;
                    c0793d22.f3291i = str2;
                    c0793d22.f3292j = network;
                    c0793d22.f3293k = enumC1127no;
                    c0793d22.f3294l = interfaceC3281e;
                    c0793d22.f3295m = m2389c;
                    c0793d22.f3296n = list7;
                    c0793d22.f3297o = m3530q;
                    c0793d22.f3298p = m3530q2;
                    c0793d22.f3301s = 1;
                    obj = AbstractC0525d0.m1130h(c0920h2, c0793d22);
                    if (obj != enumC2465a) {
                        network2 = network;
                        i8 = m3530q2;
                        list2 = list7;
                        i9 = m3530q;
                        interfaceC3281e2 = interfaceC3281e;
                        enumC1127no2 = enumC1127no;
                        list3 = m2389c;
                        c1074m2 = this;
                    }
                    return enumC2465a;
                }
                list4 = (List) obj;
                if (!AbstractC1249rm.m2231M(list4).f7296a.isEmpty() && !list2.isEmpty()) {
                    ConcurrentHashMap.KeySetView keySetView3 = AbstractC1265s7.f7527a;
                    AbstractC1265s7.m2310g("RESOLVE fallback without ECS host=" + str2);
                    c0793d22.f3290h = null;
                    c0793d22.f3291i = null;
                    c0793d22.f3292j = null;
                    c0793d22.f3293k = null;
                    c0793d22.f3294l = null;
                    c0793d22.f3295m = null;
                    c0793d22.f3296n = null;
                    c0793d22.f3301s = 2;
                    Object m1638c = c1074m2.m1638c(str2, network2, list3, enumC1127no2, i9, i8, interfaceC3281e2, c0793d22);
                    if (m1638c == enumC2465a) {
                        return enumC2465a;
                    }
                    return m1638c;
                }
                ConcurrentHashMap.KeySetView keySetView4 = AbstractC1265s7.f7527a;
                AbstractC1265s7.m2308e("RESOLVE done host=" + str2 + " via primary path");
                return list4;
            }
        }
        c0793d2 = new C0793d2(this, abstractC2583c);
        C0793d2 c0793d222 = c0793d2;
        Object obj2 = c0793d222.f3299q;
        i7 = c0793d222.f3301s;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        if (i7 == 0) {
        }
        list4 = (List) obj2;
        if (!AbstractC1249rm.m2231M(list4).f7296a.isEmpty()) {
        }
        ConcurrentHashMap.KeySetView keySetView42 = AbstractC1265s7.f7527a;
        AbstractC1265s7.m2308e("RESOLVE done host=" + str2 + " via primary path");
        return list4;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1638c(String str, Network network, List list, EnumC1127no enumC1127no, int i7, int i8, InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        C0952i2 c0952i2;
        int i9;
        if (abstractC2583c instanceof C0952i2) {
            c0952i2 = (C0952i2) abstractC2583c;
            int i10 = c0952i2.f4749j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0952i2.f4749j = i10 - Integer.MIN_VALUE;
                Object obj = c0952i2.f4747h;
                i9 = c0952i2.f4749j;
                if (i9 == 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C1043l2 c1043l2 = new C1043l2(list, interfaceC3281e, str, enumC1127no, network, i7, i8, null);
                    c0952i2.f4749j = 1;
                    obj = AbstractC0525d0.m1130h(c1043l2, c0952i2);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (obj == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return (List) obj;
            }
        }
        c0952i2 = new C0952i2(this, abstractC2583c);
        Object obj2 = c0952i2.f4747h;
        i9 = c0952i2.f4749j;
        if (i9 == 0) {
        }
        return (List) obj2;
    }
}
