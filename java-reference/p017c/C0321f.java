package p017c;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import p000a.AbstractC0000a;
import p001a0.AbstractC0094y0;
import p001a0.C0008b2;
import p001a0.C0078t0;
import p008b.C0222a0;
import p008b.C0224b0;
import p008b.C0236h0;
import p008b.C0238i0;
import p025d.C0455b;
import p032d6.RunnableC0562p1;
import p039e5.AbstractC1092mk;
import p039e5.AbstractC1228r1;
import p039e5.C0702a7;
import p039e5.C0712ah;
import p039e5.C0782cn;
import p039e5.C0800d9;
import p039e5.C0866fc;
import p039e5.C0910go;
import p039e5.C1020ka;
import p039e5.C1101mt;
import p039e5.C1102n;
import p039e5.C1164p;
import p039e5.C1189po;
import p039e5.C1196q0;
import p039e5.C1218qm;
import p039e5.C1248rl;
import p039e5.C1481z6;
import p039e5.EnumC0768c9;
import p039e5.EnumC1269sb;
import p040e6.C1507c;
import p046f5.AbstractC1541f;
import p053g5.C1694m;
import p054g6.C1701c0;
import p077k.C2196i0;
import p085l0.C2345c1;
import p085l0.C2414u1;
import p085l0.C2415v;
import p085l0.EnumC2408s1;
import p085l0.InterfaceC2425y0;
import p096m3.C2572v;
import p128q6.C3006i;
import p144t.AbstractC3122c;
import p145t0.C3173d;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p152u.C3320h;
import p158u5.AbstractC3367j;
import p161v0.C3469p;
import p161v0.C3472s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0321f implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f1125e;

    /* renamed from: f */
    public final /* synthetic */ Object f1126f;

    /* renamed from: g */
    public final /* synthetic */ Object f1127g;

    public /* synthetic */ C0321f(int i7, Object obj, Object obj2) {
        this.f1125e = i7;
        this.f1126f = obj;
        this.f1127g = obj2;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        String str;
        String str2 = null;
        boolean z7 = false;
        z7 = false;
        z7 = false;
        int i7 = 1;
        switch (this.f1125e) {
            case 0:
                C0455b c0455b = (C0455b) this.f1126f;
                C0325j c0325j = (C0325j) this.f1127g;
                C2572v c2572v = c0455b.f1570a;
                if (c2572v != null) {
                    C2572v.m4094a(c2572v, c0325j.f1135b);
                } else {
                    C0236h0 c0236h0 = c0455b.f1571b;
                    if (c0236h0 != null) {
                        C0238i0 c0238i0 = c0325j.f1134a;
                        AbstractC3367j.m5100e(c0238i0, "onBackPressedCallback");
                        C0222a0 c0222a0 = new C0222a0(c0238i0, new C0224b0(c0238i0, null));
                        c0238i0.f926a.add(c0222a0);
                        C2572v.m4094a(c0236h0.m510a(), c0222a0);
                    } else {
                        throw new IllegalStateException("Unreachable");
                    }
                }
                return new C0008b2(i7, c0455b, c0325j);
            case 1:
                ((C1196q0) this.f1126f).m2116J(((C0800d9) this.f1127g).f3340a, 0, (C3006i) obj);
                return C1694m.f10482a;
            case 2:
                C1102n c1102n = (C1102n) this.f1126f;
                Map map = (Map) this.f1127g;
                C1102n c1102n2 = (C1102n) obj;
                AbstractC3367j.m5100e(c1102n2, "it");
                if (c1102n2 != c1102n && !c1102n2.f6131e.get() && !map.containsKey(Integer.valueOf(c1102n2.f6127a))) {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            case 3:
                C1164p c1164p = (C1164p) this.f1126f;
                C1196q0 c1196q0 = (C1196q0) this.f1127g;
                C0800d9 c0800d9 = (C0800d9) obj;
                AbstractC3367j.m5100e(c0800d9, "it");
                String str3 = c0800d9.f3342c;
                String str4 = c1164p.f6745c;
                if (str4 != null) {
                    if (str4.equals(str3)) {
                        str2 = str4;
                    } else {
                        str2 = c1196q0.m2120T(str4);
                    }
                }
                long j6 = c1164p.f6743a;
                boolean z8 = c1164p.f6744b;
                if (str2 == null) {
                    str = str3;
                } else {
                    str = str2;
                }
                return C0800d9.m1498a(c0800d9, str, null, null, j6, 0L, 0L, z8, null, 0L, null, null, 4157435);
            case 4:
                C0800d9 c0800d92 = (C0800d9) this.f1126f;
                Uri uri = (Uri) this.f1127g;
                EnumC0768c9 enumC0768c9 = EnumC0768c9.f3010j;
                long j7 = c0800d92.f3352m;
                long currentTimeMillis = System.currentTimeMillis();
                String uri2 = uri.toString();
                AbstractC3367j.m5099d(uri2, "toString(...)");
                return C0800d9.m1498a((C0800d9) obj, null, null, enumC0768c9, j7, j7, 0L, false, null, currentTimeMillis, uri2, "", 493567);
            case AbstractC3122c.f15761f /* 5 */:
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) this.f1126f;
                Context context = (Context) this.f1127g;
                String str5 = (String) obj;
                AbstractC3367j.m5100e(str5, "it");
                interfaceC3279c.mo23f(str5);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_dns_network_id", str5).apply();
                return C1694m.f10482a;
            case AbstractC3122c.f15759d /* 6 */:
                Context context2 = (Context) this.f1126f;
                C2345c1 c2345c1 = (C2345c1) this.f1127g;
                float floatValue = ((Float) obj).floatValue();
                c2345c1.m3730h(floatValue);
                List list = AbstractC1541f.f10116a;
                SharedPreferences.Editor edit = AbstractC1092mk.m1693K3(context2).edit();
                AbstractC3367j.m5099d(edit, "edit(...)");
                SharedPreferences.Editor putFloat = edit.putFloat("ui_scale", AbstractC1541f.m2473a(floatValue));
                AbstractC3367j.m5099d(putFloat, "putFloat(...)");
                putFloat.apply();
                return C1694m.f10482a;
            case 7:
                List list2 = (List) this.f1126f;
                C1101mt c1101mt = (C1101mt) this.f1127g;
                C3320h c3320h = (C3320h) obj;
                AbstractC3367j.m5100e(c3320h, "$this$LazyColumn");
                C3320h.m5052l(c3320h, "today_stats", new C3173d(-650243142, new C0712ah(c1101mt, z7 ? 1 : 0), true), 2);
                if (list2.isEmpty()) {
                    C3320h.m5052l(c3320h, "empty", AbstractC1228r1.f7212H, 2);
                } else {
                    c3320h.m5054m(list2.size(), new C0078t0(16, new C0866fc(8), list2), new C1481z6(7, list2), new C3173d(-632812321, new C0702a7(4, list2), true));
                }
                return C1694m.f10482a;
            case 8:
                InterfaceC3279c interfaceC3279c2 = (InterfaceC3279c) this.f1126f;
                C1189po c1189po = (C1189po) this.f1127g;
                ((Boolean) obj).booleanValue();
                interfaceC3279c2.mo23f(Integer.valueOf(c1189po.f6926a));
                return C1694m.f10482a;
            case AbstractC3122c.f15758c /* 9 */:
                C0910go c0910go = (C0910go) this.f1126f;
                C3472s c3472s = (C3472s) this.f1127g;
                C3320h c3320h2 = (C3320h) obj;
                AbstractC3367j.m5100e(c3320h2, "$this$LazyColumn");
                List list3 = c0910go.f4326e;
                c3320h2.m5054m(list3.size(), new C0078t0(18, new C0866fc(10), list3), new C1481z6(9, list3), new C3173d(-632812321, new C1020ka(list3, c3472s, c0910go, i7), true));
                return C1694m.f10482a;
            case AbstractC3122c.f15760e /* 10 */:
                C3469p c3469p = (C3469p) this.f1126f;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f1127g;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                float f7 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue(bool);
                if (!booleanValue) {
                    c3469p.clear();
                }
                return C1694m.f10482a;
            case 11:
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) this.f1126f;
                C1218qm c1218qm = (C1218qm) this.f1127g;
                List list4 = (List) obj;
                float f8 = AbstractC1092mk.f5952h;
                C1218qm c1218qm2 = (C1218qm) interfaceC2425y02.getValue();
                if (c1218qm2 != null && AbstractC3367j.m5096a(c1218qm2.f7129a, c1218qm.f7129a)) {
                    interfaceC2425y02.setValue(C1218qm.m2146a(c1218qm2, null, null, null, list4, 63));
                }
                return C1694m.f10482a;
            case 12:
                InterfaceC3281e interfaceC3281e = (InterfaceC3281e) this.f1126f;
                Object obj2 = (EnumC1269sb) this.f1127g;
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                interfaceC3281e.mo22d(obj2, bool2);
                return C1694m.f10482a;
            case 13:
                InterfaceC3279c interfaceC3279c3 = (InterfaceC3279c) this.f1126f;
                C1248rl c1248rl = (C1248rl) this.f1127g;
                ((Boolean) obj).booleanValue();
                interfaceC3279c3.mo23f(c1248rl.f7390a);
                return C1694m.f10482a;
            case 14:
                InterfaceC3279c interfaceC3279c4 = (InterfaceC3279c) this.f1126f;
                C0782cn c0782cn = (C0782cn) this.f1127g;
                ((Boolean) obj).booleanValue();
                interfaceC3279c4.mo23f(Integer.valueOf(c0782cn.f3168a));
                return C1694m.f10482a;
            case AbstractC3122c.f15762g /* 15 */:
                ((C1507c) this.f1126f).f9989g.removeCallbacks((RunnableC0562p1) this.f1127g);
                return C1694m.f10482a;
            case 16:
                C2415v c2415v = (C2415v) this.f1126f;
                C2196i0 c2196i0 = (C2196i0) this.f1127g;
                c2415v.m3952z(obj);
                if (c2196i0 != null) {
                    c2196i0.m3599a(obj);
                }
                return C1694m.f10482a;
            default:
                C2414u1 c2414u1 = (C2414u1) this.f1126f;
                Throwable th = (Throwable) this.f1127g;
                Throwable th2 = (Throwable) obj;
                synchronized (c2414u1.f13580b) {
                    if (th != null) {
                        if (th2 != null) {
                            try {
                                if (th2 instanceof CancellationException) {
                                    th2 = null;
                                }
                                if (th2 != null) {
                                    AbstractC0000a.m7h(th, th2);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        th = null;
                    }
                    c2414u1.f13582d = th;
                    C1701c0 c1701c0 = c2414u1.f13598t;
                    EnumC2408s1 enumC2408s1 = EnumC2408s1.f13550e;
                    c1701c0.getClass();
                    c1701c0.m2752j(null, enumC2408s1);
                }
                return C1694m.f10482a;
        }
    }
}
