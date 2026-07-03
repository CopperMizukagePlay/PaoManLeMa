package p039e5;

import android.content.Context;
import android.net.Network;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.C1813u;
import p073j2.AbstractC2168e;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3469p;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.f6 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0860f6 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f3930e = 0;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f3931f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f3932g;

    /* renamed from: h */
    public final /* synthetic */ Object f3933h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f3934i;

    /* renamed from: j */
    public final /* synthetic */ Object f3935j;

    /* renamed from: k */
    public final /* synthetic */ Object f3936k;

    /* renamed from: l */
    public final /* synthetic */ Object f3937l;

    /* renamed from: m */
    public final /* synthetic */ Object f3938m;

    /* renamed from: n */
    public final /* synthetic */ Object f3939n;

    public /* synthetic */ C0860f6(C1270sc c1270sc, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06, InterfaceC2425y0 interfaceC2425y07, InterfaceC2425y0 interfaceC2425y08) {
        this.f3936k = c1270sc;
        this.f3931f = interfaceC2425y0;
        this.f3932g = interfaceC2425y02;
        this.f3933h = interfaceC2425y03;
        this.f3934i = interfaceC2425y04;
        this.f3935j = interfaceC2425y05;
        this.f3937l = interfaceC2425y06;
        this.f3938m = interfaceC2425y07;
        this.f3939n = interfaceC2425y08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0265  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo52a() {
        int i7;
        C1405wn c1405wn;
        EnumC1495zk enumC1495zk;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = this.f3930e;
        C1694m c1694m = C1694m.f10482a;
        Object obj = this.f3939n;
        Object obj2 = this.f3935j;
        InterfaceC2425y0 interfaceC2425y0 = this.f3934i;
        Object obj3 = this.f3933h;
        InterfaceC2425y0 interfaceC2425y02 = this.f3932g;
        InterfaceC2425y0 interfaceC2425y03 = this.f3931f;
        Object obj4 = this.f3938m;
        Object obj5 = this.f3937l;
        Object obj6 = this.f3936k;
        switch (i12) {
            case 0:
                C1031kl c1031kl = (C1031kl) obj6;
                List list = (List) obj5;
                InterfaceC3277a interfaceC3277a = (InterfaceC3277a) obj4;
                Context context = (Context) obj;
                InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) obj2;
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                List list2 = (List) interfaceC2425y03.getValue();
                EnumC1495zk enumC1495zk2 = (EnumC1495zk) interfaceC2425y02.getValue();
                EnumC1402wk enumC1402wk = (EnumC1402wk) ((InterfaceC2425y0) obj3).getValue();
                Integer m973O = AbstractC0451r.m973O((String) interfaceC2425y0.getValue());
                if (m973O != null) {
                    i7 = m973O.intValue();
                } else {
                    i7 = 2500;
                }
                Network network = (Network) interfaceC3277a.mo52a();
                Context applicationContext = context.getApplicationContext();
                if (((Boolean) interfaceC2425y04.getValue()).booleanValue() && applicationContext != null) {
                    C1813u c1813u = C1813u.f10860e;
                    C1405wn m2239R = AbstractC1249rm.m2239R(applicationContext, true, true, false, c1813u, false, c1813u);
                    if (m2239R.m2388b()) {
                        c1405wn = m2239R;
                        AbstractC3367j.m5100e(list2, "servers");
                        AbstractC3367j.m5100e(enumC1495zk2, "rfcMode");
                        AbstractC3367j.m5100e(enumC1402wk, "addressFamily");
                        c1031kl.m1633o(false);
                        enumC1495zk = EnumC1495zk.f9910f;
                        EnumC0748bl enumC0748bl = EnumC0748bl.f2838f;
                        if (enumC1495zk2 != enumC1495zk) {
                            arrayList = AbstractC3784a.m5817z(enumC0748bl);
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = EnumC0748bl.f2841i.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (list.contains((EnumC0748bl) next)) {
                                    arrayList3.add(next);
                                }
                            }
                            boolean isEmpty = arrayList3.isEmpty();
                            arrayList = arrayList3;
                            if (isEmpty) {
                                arrayList = AbstractC3784a.m5817z(enumC0748bl);
                            }
                        }
                        ArrayList arrayList4 = arrayList;
                        arrayList2 = new ArrayList();
                        for (Object obj7 : list2) {
                            if (!AbstractC0444k.m937a0(((C0716al) obj7).f2442a)) {
                                arrayList2.add(obj7);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            C1701c0 c1701c0 = c1031kl.f5307d;
                            c1701c0.m2752j(null, C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, null, null, null, null, null, null, null, null, "请至少填写一个 STUN 服务器", null, null, 57343));
                        } else {
                            int m3530q = AbstractC2168e.m3530q(i7, 800, 10000);
                            c1031kl.f5305b.set(true);
                            c1031kl.f5306c = AbstractC0525d0.m1141s(c1031kl.f5304a, null, new C1000jl(c1031kl, enumC1495zk2, enumC1402wk, arrayList4, arrayList2, network, c1405wn, m3530q, null), 3);
                        }
                        return c1694m;
                    }
                }
                c1405wn = null;
                AbstractC3367j.m5100e(list2, "servers");
                AbstractC3367j.m5100e(enumC1495zk2, "rfcMode");
                AbstractC3367j.m5100e(enumC1402wk, "addressFamily");
                c1031kl.m1633o(false);
                enumC1495zk = EnumC1495zk.f9910f;
                EnumC0748bl enumC0748bl2 = EnumC0748bl.f2838f;
                if (enumC1495zk2 != enumC1495zk) {
                }
                ArrayList arrayList42 = arrayList;
                arrayList2 = new ArrayList();
                while (r1.hasNext()) {
                }
                if (!arrayList2.isEmpty()) {
                }
                return c1694m;
            case 1:
                C1270sc c1270sc = (C1270sc) obj6;
                InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) obj3;
                InterfaceC2425y0 interfaceC2425y06 = (InterfaceC2425y0) obj2;
                InterfaceC2425y0 interfaceC2425y07 = (InterfaceC2425y0) obj5;
                InterfaceC2425y0 interfaceC2425y08 = (InterfaceC2425y0) obj4;
                InterfaceC2425y0 interfaceC2425y09 = (InterfaceC2425y0) obj;
                C3137j0 c3137j02 = AbstractC1302td.f7786a;
                String str = (String) interfaceC2425y03.getValue();
                Integer m973O2 = AbstractC0451r.m973O((String) interfaceC2425y02.getValue());
                if (m973O2 != null) {
                    i8 = AbstractC2168e.m3530q(m973O2.intValue(), 1, 65535);
                } else {
                    i8 = 5201;
                }
                EnumC1332uc enumC1332uc = (EnumC1332uc) interfaceC2425y05.getValue();
                EnumC0803dc enumC0803dc = (EnumC0803dc) interfaceC2425y0.getValue();
                Integer m973O3 = AbstractC0451r.m973O((String) interfaceC2425y06.getValue());
                if (m973O3 != null) {
                    i9 = AbstractC2168e.m3530q(m973O3.intValue(), 1, 64);
                } else {
                    i9 = 1;
                }
                Integer m973O4 = AbstractC0451r.m973O((String) interfaceC2425y07.getValue());
                if (m973O4 != null) {
                    i10 = AbstractC2168e.m3530q(m973O4.intValue(), 1, 86400);
                } else {
                    i10 = 10;
                }
                Integer m973O5 = AbstractC0451r.m973O((String) interfaceC2425y08.getValue());
                if (m973O5 != null) {
                    i11 = AbstractC2168e.m3530q(m973O5.intValue(), 1, 600);
                } else {
                    i11 = 1;
                }
                EnumC0771cc enumC0771cc = (EnumC0771cc) interfaceC2425y09.getValue();
                AbstractC3367j.m5100e(str, "host");
                AbstractC3367j.m5100e(enumC1332uc, "protocol");
                AbstractC3367j.m5100e(enumC0803dc, "direction");
                AbstractC3367j.m5100e(enumC0771cc, "bidirMode");
                c1270sc.m2331u();
                Context context2 = c1270sc.f7554d;
                if (context2 == null) {
                    c1270sc.m2328p("应用上下文未就绪");
                } else {
                    c1270sc.f7552b.set(true);
                    c1270sc.f7553c.set(false);
                    int m3530q2 = AbstractC2168e.m3530q(i9, 1, 64);
                    int m3530q3 = AbstractC2168e.m3530q(i10, 1, 86400);
                    int m3530q4 = AbstractC2168e.m3530q(i11, 1, 600);
                    C1701c0 c1701c02 = c1270sc.f7559i;
                    int i13 = i8;
                    C1394wc c1394wc = new C1394wc(EnumC1363vc.f8155g, "正在连接 " + str + ":" + i8 + " …", enumC1332uc, enumC0803dc, i13, null, null, str + ":" + i8, m3530q2, m3530q3, m3530q4, 2093248);
                    c1701c02.getClass();
                    c1701c02.m2752j(null, c1394wc);
                    c1270sc.f7556f = AbstractC0525d0.m1141s(c1270sc.f7551a, null, new C1208qc(context2, enumC0803dc, enumC0771cc, c1270sc, str, i13, enumC1332uc, m3530q2, m3530q3, m3530q4, null), 3);
                }
                return c1694m;
            case 2:
                String str2 = (String) obj6;
                InterfaceC3281e interfaceC3281e = (InterfaceC3281e) obj5;
                InterfaceC3281e interfaceC3281e2 = (InterfaceC3281e) obj;
                InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) obj4;
                InterfaceC3277a interfaceC3277a3 = (InterfaceC3277a) obj3;
                C2349d1 c2349d1 = (C2349d1) interfaceC2425y0;
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) obj2;
                if (AbstractC1249rm.m2285s0(str2) != null) {
                    int m3741g = c2349d1.m3741g();
                    EnumC1311tm enumC1311tm = EnumC1311tm.f7830e;
                    if (m3741g >= 0) {
                        if (((EnumC1311tm) interfaceC2425y03.getValue()) == enumC1311tm) {
                            interfaceC3281e.mo22d(Integer.valueOf(c2349d1.m3741g()), str2);
                        } else {
                            interfaceC3281e2.mo22d(Integer.valueOf(c2349d1.m3741g()), str2);
                        }
                        AbstractC1092mk.m1649C(interfaceC3279c, c2349d1, interfaceC2425y02);
                    } else {
                        if (((EnumC1311tm) interfaceC2425y03.getValue()) == enumC1311tm) {
                            interfaceC3277a2.mo52a();
                        } else {
                            interfaceC3277a3.mo52a();
                        }
                        AbstractC1092mk.m1649C(interfaceC3279c, c2349d1, interfaceC2425y02);
                    }
                }
                return c1694m;
            default:
                float f7 = AbstractC1092mk.f5952h;
                ((C2349d1) obj4).m3742h(0);
                AbstractC1092mk.m1660E0(interfaceC2425y03, false);
                AbstractC1092mk.m1670G0(interfaceC2425y02, false);
                ((InterfaceC2425y0) obj3).setValue("");
                interfaceC2425y0.setValue("");
                ((InterfaceC2425y0) obj2).setValue("");
                ((C3469p) obj6).clear();
                ((C3469p) obj5).clear();
                AbstractC1092mk.m1725R0((InterfaceC2425y0) obj, true);
                return c1694m;
        }
    }

    public /* synthetic */ C0860f6(C1031kl c1031kl, List list, InterfaceC3277a interfaceC3277a, Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05) {
        this.f3936k = c1031kl;
        this.f3937l = list;
        this.f3938m = interfaceC3277a;
        this.f3939n = context;
        this.f3931f = interfaceC2425y0;
        this.f3932g = interfaceC2425y02;
        this.f3933h = interfaceC2425y03;
        this.f3934i = interfaceC2425y04;
        this.f3935j = interfaceC2425y05;
    }

    public /* synthetic */ C0860f6(String str, InterfaceC3281e interfaceC3281e, InterfaceC3281e interfaceC3281e2, InterfaceC3277a interfaceC3277a, InterfaceC3277a interfaceC3277a2, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0, InterfaceC3279c interfaceC3279c, InterfaceC2425y0 interfaceC2425y02) {
        this.f3936k = str;
        this.f3937l = interfaceC3281e;
        this.f3939n = interfaceC3281e2;
        this.f3938m = interfaceC3277a;
        this.f3933h = interfaceC3277a2;
        this.f3934i = c2349d1;
        this.f3931f = interfaceC2425y0;
        this.f3935j = interfaceC3279c;
        this.f3932g = interfaceC2425y02;
    }

    public /* synthetic */ C0860f6(C3469p c3469p, C3469p c3469p2, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06) {
        this.f3936k = c3469p;
        this.f3937l = c3469p2;
        this.f3938m = c2349d1;
        this.f3931f = interfaceC2425y0;
        this.f3932g = interfaceC2425y02;
        this.f3933h = interfaceC2425y03;
        this.f3934i = interfaceC2425y04;
        this.f3935j = interfaceC2425y05;
        this.f3939n = interfaceC2425y06;
    }
}
