package p008b;

import android.os.Bundle;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p015b6.AbstractC0307n;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0450q;
import p027d1.C0467e;
import p032d6.C0548l;
import p032d6.InterfaceC0542j;
import p039e5.AbstractC1249rm;
import p039e5.AbstractC1265s7;
import p039e5.C0718an;
import p039e5.C0800d9;
import p039e5.C0878fo;
import p039e5.C0883ft;
import p039e5.C1189po;
import p039e5.C1317ts;
import p039e5.C1405wn;
import p039e5.C1485za;
import p039e5.C1504zt;
import p039e5.EnumC1123nk;
import p053g5.C1687f;
import p053g5.C1694m;
import p073j2.AbstractC2168e;
import p077k.C2196i0;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2361g1;
import p085l0.C2414u1;
import p085l0.EnumC2408s1;
import p099m6.C2592a0;
import p101n0.C2705e;
import p125q2.C2985b;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p152u.C3330r;
import p153u0.C3334a;
import p153u0.C3341h;
import p153u0.InterfaceC3342i;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p161v0.C3473t;
import p161v0.C3474u;
import p172w3.C3778b;
import p172w3.InterfaceC3782f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.c0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0226c0 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f905e;

    /* renamed from: f */
    public final /* synthetic */ Object f906f;

    public /* synthetic */ C0226c0(int i7, Object obj) {
        this.f905e = i7;
        this.f906f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7;
        String group;
        Double m964F;
        double doubleValue;
        boolean z7;
        Double m964F2;
        InterfaceC0542j m3920t;
        boolean z8;
        int i8;
        int i9;
        Object obj = null;
        Integer num = null;
        boolean z9 = true;
        int i10 = 0;
        switch (this.f905e) {
            case 0:
                return new C0232f0((C0236h0) this.f906f);
            case 1:
                return (ViewParent) this.f906f;
            case 2:
                return (C2592a0) this.f906f;
            case 3:
                C1504zt c1504zt = (C1504zt) this.f906f;
                return Float.valueOf(c1504zt.f9983f / c1504zt.f9982e);
            case 4:
                return AbstractC2418w.m3980x((String) this.f906f);
            case AbstractC3122c.f15761f /* 5 */:
                C0800d9 c0800d9 = (C0800d9) this.f906f;
                return Float.valueOf(AbstractC2168e.m3529p(((float) c0800d9.f3353n) / ((float) c0800d9.f3352m), 0.0f, 1.0f));
            case AbstractC3122c.f15759d /* 6 */:
                C3330r c3330r = (C3330r) this.f906f;
                return Boolean.valueOf(c3330r.m5067g().f16324m == 0 ? false : !c3330r.mo115d());
            case 7:
                Set set = (Set) this.f906f;
                Iterator it = EnumC1123nk.f6336n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (set.contains(((EnumC1123nk) next).f6338f)) {
                            obj = next;
                        }
                    }
                }
                EnumC1123nk enumC1123nk = (EnumC1123nk) obj;
                if (enumC1123nk == null) {
                    enumC1123nk = EnumC1123nk.f6332j;
                }
                return AbstractC2418w.m3980x(enumC1123nk);
            case 8:
                Iterator it2 = ((List) this.f906f).iterator();
                if (it2.hasNext()) {
                    Integer valueOf = Integer.valueOf(((C1189po) it2.next()).f6926a);
                    while (true) {
                        num = valueOf;
                        while (it2.hasNext()) {
                            valueOf = Integer.valueOf(((C1189po) it2.next()).f6926a);
                            if (num.compareTo(valueOf) < 0) {
                                break;
                            }
                        }
                    }
                }
                if (num != null) {
                    i7 = num.intValue();
                } else {
                    i7 = 0;
                }
                return new C2349d1(i7 + 1);
            case AbstractC3122c.f15758c /* 9 */:
                Float f7 = (Float) this.f906f;
                f7.floatValue();
                return f7;
            case AbstractC3122c.f15760e /* 10 */:
                return Float.valueOf(AbstractC2168e.m3529p((float) (((C0718an) this.f906f).f2451d / 100.0d), 0.0f, 1.0f));
            case 11:
                int i11 = 0;
                List list = ((C1405wn) this.f906f).f8507e;
                AbstractC3367j.m5100e(list, "subnets");
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    C0878fo c0878fo = (C0878fo) obj2;
                    if (hashSet.add(AbstractC0444k.m956t0(c0878fo.f4047a).toString() + "|" + AbstractC0444k.m956t0(c0878fo.f4048b).toString())) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    C0878fo c0878fo2 = (C0878fo) obj3;
                    C1485za m2287t0 = AbstractC1249rm.m2287t0(c0878fo2);
                    String str = c0878fo2.f4048b;
                    if (m2287t0 == null && !AbstractC0444k.m937a0(str)) {
                        ConcurrentHashMap.KeySetView keySetView = AbstractC1265s7.f7527a;
                        String str2 = c0878fo2.f4047a;
                        String str3 = (String) AbstractC0307n.m665D(AbstractC0444k.m940d0(str));
                        if (str3 == null) {
                            str3 = "";
                        }
                        AbstractC1265s7.m2310g("SUBNET parse failed label=" + str2 + " cidr=" + str3);
                    } else if (m2287t0 != null) {
                        AbstractC1265s7.m2308e("SUBNET parsed " + AbstractC1265s7.m2306c(m2287t0));
                    }
                    if (m2287t0 != null) {
                        arrayList2.add(m2287t0);
                    }
                }
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList2.size();
                while (i11 < size2) {
                    Object obj4 = arrayList2.get(i11);
                    i11++;
                    C1485za c1485za = (C1485za) obj4;
                    String str4 = c1485za.f9839a;
                    int i13 = c1485za.f9841c;
                    int i14 = c1485za.f9842d;
                    String arrays = Arrays.toString(c1485za.f9843e);
                    AbstractC3367j.m5099d(arrays, "toString(...)");
                    if (hashSet2.add(str4 + "|" + i13 + "|" + i14 + "|" + arrays)) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
            case 12:
                Process exec = Runtime.getRuntime().exec((String[]) this.f906f);
                AbstractC3367j.m5097b(exec);
                String m1534l = C0883ft.m1534l(exec);
                exec.waitFor();
                Matcher matcher = Pattern.compile("(?i)time\\s*=\\s*([0-9.]+)\\s*ms").matcher(m1534l);
                double d7 = 0.0d;
                if (matcher.find()) {
                    String group2 = matcher.group(1);
                    if (group2 != null && (m964F2 = AbstractC0450q.m964F(group2)) != null) {
                        doubleValue = m964F2.doubleValue();
                    }
                    doubleValue = 0.0d;
                } else {
                    Matcher matcher2 = Pattern.compile("(?i)rtt[^=]*=\\s*[0-9.]+/([0-9.]+)/").matcher(m1534l);
                    if (matcher2.find() && (group = matcher2.group(1)) != null && (m964F = AbstractC0450q.m964F(group)) != null) {
                        doubleValue = m964F.doubleValue();
                    }
                    doubleValue = 0.0d;
                }
                if (exec.exitValue() == 0 && doubleValue > 0.0d) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    d7 = doubleValue;
                }
                return new C1317ts(z7, d7);
            case 13:
                C2414u1 c2414u1 = (C2414u1) this.f906f;
                synchronized (c2414u1.f13580b) {
                    m3920t = c2414u1.m3920t();
                    if (((EnumC2408s1) c2414u1.f13598t.getValue()).compareTo(EnumC2408s1.f13551f) <= 0) {
                        Throwable th = c2414u1.f13582d;
                        CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                        cancellationException.initCause(th);
                        throw cancellationException;
                    }
                }
                if (m3920t != null) {
                    ((C0548l) m3920t).mo663n(C1694m.f10482a);
                }
                return C1694m.f10482a;
            case 14:
                C2985b c2985b = (C2985b) this.f906f;
                C2361g1 c2361g1 = c2985b.f15419g;
                if (((C0467e) c2361g1.getValue()).f1637a == 9205357640488583168L || C0467e.m1027e(((C0467e) c2361g1.getValue()).f1637a)) {
                    return null;
                }
                return c2985b.f15417e.mo1348b(((C0467e) c2361g1.getValue()).f1637a);
            case AbstractC3122c.f15762g /* 15 */:
                C3334a c3334a = (C3334a) this.f906f;
                InterfaceC3342i interfaceC3342i = c3334a.f16385e;
                Object obj5 = c3334a.f16388h;
                if (obj5 != null) {
                    return interfaceC3342i.mo142d(c3334a, obj5);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 16:
                C3341h c3341h = (C3341h) this.f906f;
                Bundle m5138i = AbstractC3393k.m5138i((C1687f[]) Arrays.copyOf(new C1687f[0], 0));
                c3341h.f16402f.m5786k(m5138i);
                if (m5138i.isEmpty()) {
                    return null;
                }
                return m5138i;
            case 17:
                C3474u c3474u = (C3474u) this.f906f;
                while (true) {
                    synchronized (c3474u.f16759g) {
                        try {
                            if (!c3474u.f16755c) {
                                c3474u.f16755c = z9;
                                try {
                                    C2705e c2705e = c3474u.f16758f;
                                    Object[] objArr = c2705e.f14517e;
                                    int i15 = c2705e.f14519g;
                                    int i16 = i10;
                                    while (i16 < i15) {
                                        try {
                                            C3473t c3473t = (C3473t) objArr[i16];
                                            C2196i0 c2196i0 = c3473t.f16747g;
                                            InterfaceC3279c interfaceC3279c = c3473t.f16741a;
                                            Object[] objArr2 = c2196i0.f12685b;
                                            long[] jArr = c2196i0.f12684a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i17 = i10;
                                                while (true) {
                                                    long j6 = jArr[i17];
                                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                                                        int i19 = 0;
                                                        while (i19 < i18) {
                                                            if ((j6 & 255) < 128) {
                                                                i9 = i15;
                                                                interfaceC3279c.mo23f(objArr2[(i17 << 3) + i19]);
                                                            } else {
                                                                i9 = i15;
                                                            }
                                                            j6 >>= 8;
                                                            i19++;
                                                            i15 = i9;
                                                        }
                                                        i8 = i15;
                                                        if (i18 == 8) {
                                                        }
                                                    } else {
                                                        i8 = i15;
                                                    }
                                                    if (i17 != length) {
                                                        i17++;
                                                        i15 = i8;
                                                    }
                                                }
                                            } else {
                                                i8 = i15;
                                            }
                                            c2196i0.m3600b();
                                            i16++;
                                            i15 = i8;
                                            i10 = 0;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            z8 = 0;
                                            c3474u.f16755c = z8;
                                            throw th;
                                        }
                                    }
                                    c3474u.f16755c = i10;
                                } catch (Throwable th3) {
                                    th = th3;
                                    z8 = i10;
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    if (!c3474u.m5279b()) {
                        return C1694m.f10482a;
                    }
                    z9 = true;
                    i10 = 0;
                }
            default:
                InterfaceC3782f interfaceC3782f = (InterfaceC3782f) this.f906f;
                interfaceC3782f.mo415g().m468a(new C3778b(i10, interfaceC3782f));
                return C1694m.f10482a;
        }
    }

    public /* synthetic */ C0226c0(String[] strArr, C0883ft c0883ft) {
        this.f905e = 12;
        this.f906f = strArr;
    }
}
