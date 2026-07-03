package p039e5;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.lifecycle.EnumC0201n;
import androidx.lifecycle.InterfaceC0209r;
import androidx.lifecycle.InterfaceC0213t;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0008b2;
import p001a0.C0070r0;
import p001a0.C0078t0;
import p017c.C0323h;
import p018c0.C0334d;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.C0565q1;
import p032d6.InterfaceC0516a0;
import p034e0.C0608h0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p063i0.C1956n1;
import p068i5.AbstractC2080d;
import p077k.C2194h0;
import p082k5.InterfaceC2313c;
import p085l0.C2349d1;
import p085l0.C2364h0;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p118p3.C2878c;
import p144t.AbstractC3122c;
import p145t0.C3173d;
import p150t5.InterfaceC3279c;
import p152u.C3320h;
import p153u0.C3336c;
import p153u0.C3341h;
import p158u5.AbstractC3367j;
import p158u5.C3379v;
import p161v0.C3469p;
import p168w.AbstractC3642y;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C1009k implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f5175e;

    /* renamed from: f */
    public final /* synthetic */ Object f5176f;

    /* renamed from: g */
    public final /* synthetic */ Object f5177g;

    /* renamed from: h */
    public final /* synthetic */ Object f5178h;

    public /* synthetic */ C1009k(Object obj, Object obj2, Object obj3, int i7) {
        this.f5175e = i7;
        this.f5176f = obj;
        this.f5177g = obj2;
        this.f5178h = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, u5.v] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f5175e;
        int i8 = 2;
        InterfaceC2313c interfaceC2313c = null;
        int i9 = 0;
        boolean z7 = true;
        int i10 = 3;
        C1694m c1694m = C1694m.f10482a;
        Object obj2 = this.f5178h;
        Object obj3 = this.f5177g;
        Object obj4 = this.f5176f;
        switch (i7) {
            case 0:
                C1196q0 c1196q0 = (C1196q0) obj4;
                c1196q0.f6968g.remove((String) obj3, (C0565q1) obj2);
                if (c1196q0.f6970i.get()) {
                    AbstractC0525d0.m1141s(c1196q0.f6966e, null, new C1072m0(c1196q0, interfaceC2313c, i9), 3);
                }
                return c1694m;
            case 1:
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "value");
                ArrayList m3036D0 = AbstractC1805m.m3036D0((List) obj4);
                int intValue = ((Number) ((InterfaceC2425y0) obj2).getValue()).intValue();
                String obj5 = AbstractC0444k.m956t0(str).toString();
                AbstractC3367j.m5100e(obj5, "address");
                m3036D0.set(intValue, new C0716al(obj5));
                ((InterfaceC3279c) obj3).mo23f(m3036D0);
                return c1694m;
            case 2:
                C1196q0 c1196q02 = (C1196q0) obj4;
                List list = (List) obj;
                AbstractC3367j.m5100e(list, "addresses");
                String str2 = ((C0800d9) obj3).f3340a;
                AbstractC3367j.m5100e(str2, "id");
                AbstractC0525d0.m1141s(c1196q02.f6966e, null, new C0334d(list, c1196q02, str2, null, 3), 3);
                ((InterfaceC2425y0) obj2).setValue(Boolean.FALSE);
                return c1694m;
            case 3:
                ArrayList arrayList = (ArrayList) obj3;
                C3320h c3320h = (C3320h) obj;
                AbstractC3367j.m5100e(c3320h, "$this$LazyColumn");
                C3320h.m5052l(c3320h, null, AbstractC0951i1.f4711e, 3);
                c3320h.m5054m(arrayList.size(), new C0078t0(11, new C1263s5(13), arrayList), new C0608h0(1, arrayList), new C3173d(-632812321, new C1020ka(arrayList, (C1196q0) obj4, (InterfaceC2390n2) obj2, i9), true));
                C3320h.m5052l(c3320h, null, AbstractC0951i1.f4713f, 3);
                return c1694m;
            case 4:
                Context context = (Context) obj4;
                AbstractC3367j.m5100e((C2364h0) obj, "$this$DisposableEffect");
                C1243rg c1243rg = new C1243rg((C2349d1) obj3, (InterfaceC2425y0) obj2);
                AbstractC2080d.m3376D(context, c1243rg, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                return new C0008b2(i8, context, c1243rg);
            case AbstractC3122c.f15761f /* 5 */:
                InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj4;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj3;
                Context context2 = (Context) obj2;
                Uri uri = (Uri) obj;
                C1227r0 c1227r0 = (C1227r0) interfaceC2425y0.getValue();
                InterfaceC2313c interfaceC2313c2 = null;
                interfaceC2425y0.setValue(null);
                if (uri != null && c1227r0 != null) {
                    AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0070r0(context2, c1227r0, uri, interfaceC2313c2, 6), 3);
                }
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) obj4;
                InterfaceC3279c interfaceC3279c2 = (InterfaceC3279c) obj3;
                C1006jr c1006jr = (C1006jr) obj;
                AbstractC3367j.m5100e(c1006jr, "it");
                float f7 = AbstractC1092mk.f5952h;
                if (((EnumC1311tm) ((InterfaceC2425y0) obj2).getValue()) == EnumC1311tm.f7830e) {
                    interfaceC3279c.mo23f(c1006jr);
                } else {
                    interfaceC3279c2.mo23f(c1006jr);
                }
                return c1694m;
            case 7:
                String str3 = (String) obj;
                AbstractC3367j.m5100e(str3, "it");
                AbstractC1092mk.m1692K2((C3469p) obj4, (Context) obj3, (InterfaceC2425y0) obj2, str3);
                return c1694m;
            case 8:
                C0910go c0910go = (C0910go) obj4;
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) obj3;
                C0910go c0910go2 = (C0910go) obj2;
                C0910go c0910go3 = (C0910go) AbstractC1805m.m3047k0((List) obj);
                if (c0910go3 != null) {
                    c0910go = c0910go3;
                }
                float f8 = AbstractC1092mk.f5952h;
                C1218qm c1218qm = (C1218qm) interfaceC2425y02.getValue();
                if (c1218qm != null) {
                    List<C0910go> list2 = c1218qm.f7135g;
                    ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list2));
                    for (C0910go c0910go4 : list2) {
                        if (AbstractC3367j.m5096a(c0910go4.f4322a, c0910go2.f4322a)) {
                            c0910go4 = c0910go;
                        }
                        arrayList2.add(c0910go4);
                    }
                    interfaceC2425y02.setValue(C1218qm.m2146a(c1218qm, null, null, null, arrayList2, 63));
                }
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                AbstractC0525d0.m1141s((InterfaceC0516a0) obj4, null, new C0700a5((C1956n1) obj3, (AbstractC3642y) obj2, ((Integer) obj).intValue(), null, 1), 3);
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                String str4 = (String) obj2;
                C1132nt c1132nt = (C1132nt) obj;
                C1701c0 c1701c0 = ((C1473yt) obj4).f9795d;
                if (!AbstractC3367j.m5096a(c1132nt.f6405b, (String) obj3) && !AbstractC3367j.m5096a(c1132nt.f6405b, str4)) {
                    z7 = false;
                }
                C1132nt m2012a = C1132nt.m2012a(c1132nt, null, null, z7, 127);
                ArrayList m3036D02 = AbstractC1805m.m3036D0(((C1504zt) c1701c0.getValue()).f9984g);
                int size = m3036D02.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        Object obj6 = m3036D02.get(i11);
                        i11++;
                        if (((C1132nt) obj6).f6404a != m2012a.f6404a) {
                            i9++;
                        }
                    } else {
                        i9 = -1;
                    }
                }
                if (i9 >= 0) {
                    m3036D02.set(i9, m2012a);
                } else {
                    m3036D02.add(m2012a);
                }
                c1701c0.m2752j(null, C1504zt.m2438a((C1504zt) c1701c0.getValue(), null, m2012a.f6404a, C1473yt.m2433d(m3036D02), null, null, 1951));
                return c1694m;
            case 11:
                InterfaceC0213t interfaceC0213t = (InterfaceC0213t) obj4;
                final C2878c c2878c = (C2878c) obj3;
                final InterfaceC3279c interfaceC3279c3 = (InterfaceC3279c) obj2;
                final ?? obj7 = new Object();
                InterfaceC0209r interfaceC0209r = new InterfaceC0209r() { // from class: p3.a
                    @Override // androidx.lifecycle.InterfaceC0209r
                    /* renamed from: c */
                    public final void mo454c(InterfaceC0213t interfaceC0213t2, EnumC0201n enumC0201n) {
                        int i12 = AbstractC2877b.f15048a[enumC0201n.ordinal()];
                        C3379v c3379v = obj7;
                        if (i12 != 1) {
                            if (i12 != 2) {
                                return;
                            }
                            C0323h c0323h = (C0323h) c3379v.f16451e;
                            if (c0323h != null) {
                                c0323h.m673a();
                            }
                            c3379v.f16451e = null;
                            return;
                        }
                        c3379v.f16451e = interfaceC3279c3.mo23f(C2878c.this);
                    }
                };
                interfaceC0213t.mo415g().m468a(interfaceC0209r);
                return new C1460yg(interfaceC0213t, interfaceC0209r, obj7, i8);
            default:
                C3336c c3336c = (C3336c) obj4;
                C3341h c3341h = (C3341h) obj2;
                C2194h0 c2194h0 = c3336c.f16394f;
                if (!c2194h0.m3587b(obj3)) {
                    c3336c.f16393e.remove(obj3);
                    c2194h0.m3598m(obj3, c3341h);
                    return new C1460yg(c3336c, obj3, c3341h, i10);
                }
                throw new IllegalArgumentException(("Key " + obj3 + " was used multiple times ").toString());
        }
    }

    public /* synthetic */ C1009k(ArrayList arrayList, C1196q0 c1196q0, InterfaceC2390n2 interfaceC2390n2) {
        this.f5175e = 3;
        this.f5177g = arrayList;
        this.f5176f = c1196q0;
        this.f5178h = interfaceC2390n2;
    }

    public /* synthetic */ C1009k(List list, C0716al c0716al, InterfaceC3279c interfaceC3279c, InterfaceC2425y0 interfaceC2425y0) {
        this.f5175e = 1;
        this.f5176f = list;
        this.f5177g = interfaceC3279c;
        this.f5178h = interfaceC2425y0;
    }
}
