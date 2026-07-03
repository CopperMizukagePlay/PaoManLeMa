package p039e5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0450q;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0525d0;
import p032d6.C0565q1;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p069i6.C2090c;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p116p0.AbstractC2834c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3470q;
import p161v0.C3469p;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fi */
/* loaded from: classes.dex */
public final class C0872fi extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ boolean f4016i;

    /* renamed from: j */
    public final /* synthetic */ Context f4017j;

    /* renamed from: k */
    public final /* synthetic */ C0883ft f4018k;

    /* renamed from: l */
    public final /* synthetic */ C3469p f4019l;

    /* renamed from: m */
    public final /* synthetic */ C3469p f4020m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC2425y0 f4021n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2425y0 f4022o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC2425y0 f4023p;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC2425y0 f4024q;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC2425y0 f4025r;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC2425y0 f4026s;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC2425y0 f4027t;

    /* renamed from: u */
    public final /* synthetic */ InterfaceC2425y0 f4028u;

    /* renamed from: v */
    public final /* synthetic */ InterfaceC2425y0 f4029v;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC2425y0 f4030w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0872fi(boolean z7, Context context, C0883ft c0883ft, C3469p c3469p, C3469p c3469p2, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06, InterfaceC2425y0 interfaceC2425y07, InterfaceC2425y0 interfaceC2425y08, InterfaceC2425y0 interfaceC2425y09, InterfaceC2425y0 interfaceC2425y010, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f4016i = z7;
        this.f4017j = context;
        this.f4018k = c0883ft;
        this.f4019l = c3469p;
        this.f4020m = c3469p2;
        this.f4021n = interfaceC2425y0;
        this.f4022o = interfaceC2425y02;
        this.f4023p = interfaceC2425y03;
        this.f4024q = interfaceC2425y04;
        this.f4025r = interfaceC2425y05;
        this.f4026s = interfaceC2425y06;
        this.f4027t = interfaceC2425y07;
        this.f4028u = interfaceC2425y08;
        this.f4029v = interfaceC2425y09;
        this.f4030w = interfaceC2425y010;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C0872fi c0872fi = (C0872fi) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
        C1694m c1694m = C1694m.f10482a;
        c0872fi.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C0872fi(this.f4016i, this.f4017j, this.f4018k, this.f4019l, this.f4020m, this.f4021n, this.f4022o, this.f4023p, this.f4024q, this.f4025r, this.f4026s, this.f4027t, this.f4028u, this.f4029v, this.f4030w, interfaceC2313c);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        ConnectivityManager connectivityManager;
        Network network;
        int i7;
        double d7;
        double d8;
        double d9;
        double d10;
        int i8;
        C0565q1 c0565q1;
        String str;
        String str2;
        C0883ft c0883ft = this.f4018k;
        AtomicBoolean atomicBoolean = c0883ft.f4084b;
        AbstractC1793a0.m2972L(obj);
        if (this.f4016i) {
            float f7 = AbstractC1092mk.f5952h;
            if (((Boolean) this.f4021n.getValue()).booleanValue()) {
                Context context = this.f4017j;
                Object systemService = context.getSystemService("connectivity");
                if (systemService instanceof ConnectivityManager) {
                    connectivityManager = (ConnectivityManager) systemService;
                } else {
                    connectivityManager = null;
                }
                if (connectivityManager != null) {
                    network = connectivityManager.getActiveNetwork();
                } else {
                    network = null;
                }
                List<C1248rl> m1663E3 = AbstractC1092mk.m1663E3(context, (List) this.f4022o.getValue(), (List) this.f4023p.getValue());
                if (m1663E3.isEmpty()) {
                    EnumC1070lt m1756Y2 = AbstractC1092mk.m1756Y2(context);
                    if (network != null) {
                        LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                        if (linkProperties != null) {
                            str2 = linkProperties.getInterfaceName();
                        } else {
                            str2 = null;
                        }
                        str = str2;
                    } else {
                        str = null;
                    }
                    m1663E3 = AbstractC3784a.m5817z(new C1248rl("default|默认接口", "默认接口", network, m1756Y2, str, 32));
                }
                AbstractC2834c abstractC2834c = AbstractC3470q.m5264e(this.f4019l).f16763c;
                AbstractC2834c abstractC2834c2 = AbstractC3470q.m5264e(this.f4020m).f16763c;
                boolean booleanValue = ((Boolean) this.f4024q.getValue()).booleanValue();
                List list = C0883ft.f4080j;
                String str3 = (String) this.f4025r.getValue();
                AbstractC3367j.m5100e(str3, "text");
                Integer m973O = AbstractC0451r.m973O(AbstractC0444k.m956t0(AbstractC0444k.m944h0(AbstractC0444k.m944h0(AbstractC0444k.m956t0(str3).toString(), "B"), "b")).toString());
                if (m973O != null) {
                    i7 = AbstractC2168e.m3530q(m973O.intValue(), 56, 65500);
                } else {
                    i7 = 1400;
                }
                String str4 = (String) this.f4026s.getValue();
                String str5 = (String) this.f4027t.getValue();
                String str6 = (String) this.f4028u.getValue();
                String str7 = (String) this.f4029v.getValue();
                String str8 = (String) this.f4030w.getValue();
                AbstractC3367j.m5100e(str4, "internalMild");
                AbstractC3367j.m5100e(str5, "internalSevere");
                AbstractC3367j.m5100e(str6, "externalMild");
                AbstractC3367j.m5100e(str7, "externalSevere");
                AbstractC3367j.m5100e(str8, "consecutiveThreshold");
                Double m964F = AbstractC0450q.m964F(str4);
                if (m964F != null) {
                    d7 = m964F.doubleValue();
                } else {
                    d7 = 50.0d;
                }
                Double m964F2 = AbstractC0450q.m964F(str5);
                if (m964F2 != null) {
                    d8 = m964F2.doubleValue();
                } else {
                    d8 = 100.0d;
                }
                double d11 = d8;
                Double m964F3 = AbstractC0450q.m964F(str6);
                if (m964F3 != null) {
                    d9 = m964F3.doubleValue();
                } else {
                    d9 = 150.0d;
                }
                double d12 = d9;
                Double m964F4 = AbstractC0450q.m964F(str7);
                if (m964F4 != null) {
                    d10 = m964F4.doubleValue();
                } else {
                    d10 = 460.0d;
                }
                double d13 = d10;
                Integer m973O2 = AbstractC0451r.m973O(str8);
                if (m973O2 != null) {
                    i8 = m973O2.intValue();
                } else {
                    i8 = 2;
                }
                C1131ns c1131ns = new C1131ns(d7, d11, d12, d13, i8);
                C2090c c2090c = c0883ft.f4083a;
                AbstractC3367j.m5100e(abstractC2834c, "gatewayInputs");
                AbstractC3367j.m5100e(abstractC2834c2, "externalInputs");
                if (m1663E3.isEmpty()) {
                    m1663E3 = AbstractC3784a.m5817z(new C1248rl("default|默认接口", "默认接口", (Network) null, (EnumC1070lt) null, (String) null, 60));
                }
                ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(m1663E3));
                for (C1248rl c1248rl : m1663E3) {
                    String str9 = c1248rl.f7390a;
                    String str10 = c1248rl.f7394e;
                    if (str10 == null) {
                        str10 = "";
                    }
                    arrayList.add(str9 + "|" + str10 + "|" + System.identityHashCode(c1248rl.f7392c));
                }
                String m3051o0 = AbstractC1805m.m3051o0(AbstractC1805m.m3060x0(arrayList), ",", null, null, null, 62);
                ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(abstractC2834c));
                Iterator<E> it = abstractC2834c.iterator();
                while (it.hasNext()) {
                    AbstractC0094y0.m191r((String) it.next(), arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj2 = arrayList2.get(i9);
                    i9++;
                    if (!AbstractC0444k.m937a0((String) obj2)) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(AbstractC1807o.m3073U(abstractC2834c2));
                Iterator<E> it2 = abstractC2834c2.iterator();
                while (it2.hasNext()) {
                    AbstractC0094y0.m191r((String) it2.next(), arrayList4);
                }
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList4.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj3 = arrayList4.get(i10);
                    i10++;
                    if (!AbstractC0444k.m937a0((String) obj3)) {
                        arrayList5.add(obj3);
                    }
                }
                List list2 = C0883ft.f4080j;
                C1224qs c1224qs = new C1224qs(m3051o0, arrayList3, arrayList5, booleanValue, AbstractC2168e.m3530q(i7, 56, 65500), c1131ns);
                C1224qs c1224qs2 = c0883ft.f4090h;
                if (atomicBoolean.get() && (c0565q1 = c0883ft.f4085c) != null && c0565q1.mo1113b() && c1224qs2 != null) {
                    if (!c1224qs2.equals(c1224qs)) {
                        if (AbstractC3367j.m5096a(C0883ft.m1539q(c1224qs2), C0883ft.m1539q(c1224qs))) {
                            AbstractC0525d0.m1141s(c2090c, null, new C1410ws(c0883ft, context, m1663E3, c1224qs, null, 1), 3);
                        }
                    }
                    return C1694m.f10482a;
                }
                List list3 = m1663E3;
                atomicBoolean.set(false);
                C0565q1 c0565q12 = c0883ft.f4085c;
                if (c0565q12 != null) {
                    c0565q12.mo1114c(null);
                }
                c0883ft.f4085c = null;
                atomicBoolean.set(true);
                c0883ft.f4090h = c1224qs;
                c0883ft.f4085c = AbstractC0525d0.m1141s(c2090c, null, new C1410ws(c0883ft, context, list3, c1224qs, null, 0), 3);
                return C1694m.f10482a;
            }
        }
        c0883ft.m1546r();
        return C1694m.f10482a;
    }
}
