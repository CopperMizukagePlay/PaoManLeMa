package p018c0;

import android.content.Context;
import android.net.Network;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a0.C0062p0;
import p024c6.AbstractC0434a;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.C0565q1;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p039e5.AbstractC1092mk;
import p039e5.AbstractC1155ol;
import p039e5.AbstractC1172p7;
import p039e5.AbstractServiceC1371vk;
import p039e5.C0703a8;
import p039e5.C0707ac;
import p039e5.C0910go;
import p039e5.C0915gt;
import p039e5.C0942ho;
import p039e5.C0948hu;
import p039e5.C0959i9;
import p039e5.C0976ir;
import p039e5.C1100ms;
import p039e5.C1247rk;
import p039e5.C1270sc;
import p039e5.C1279sl;
import p039e5.C1310tl;
import p039e5.C1403wl;
import p039e5.C1434xl;
import p039e5.C1451y7;
import p039e5.C1467yn;
import p039e5.EnumC1123nk;
import p039e5.EnumC1124nl;
import p053g5.C1689h;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p099m6.AbstractC2602f0;
import p099m6.C2598d0;
import p099m6.C2622w;
import p099m6.C2623x;
import p099m6.C2625z;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3472s;
import p168w.C3619d;
import p196z6.C3887f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.k */
/* loaded from: classes.dex */
public final class C0341k extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f1159i;

    /* renamed from: j */
    public /* synthetic */ Object f1160j;

    /* renamed from: k */
    public final /* synthetic */ Object f1161k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0341k(Object obj, Object obj2, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f1159i = i7;
        this.f1160j = obj;
        this.f1161k = obj2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f1159i) {
            case 0:
                return ((C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 1:
                C0341k c0341k = (C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m = C1694m.f10482a;
                c0341k.mo29m(c1694m);
                return c1694m;
            case 2:
                C0341k c0341k2 = (C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m2 = C1694m.f10482a;
                c0341k2.mo29m(c1694m2);
                return c1694m2;
            case 3:
                C0341k c0341k3 = (C0341k) mo28k((C0942ho) obj, (InterfaceC2313c) obj2);
                C1694m c1694m3 = C1694m.f10482a;
                c0341k3.mo29m(c1694m3);
                return c1694m3;
            case 4:
                C0341k c0341k4 = (C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m4 = C1694m.f10482a;
                c0341k4.mo29m(c1694m4);
                return c1694m4;
            case AbstractC3122c.f15761f /* 5 */:
                return ((C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case AbstractC3122c.f15759d /* 6 */:
                C0341k c0341k5 = (C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m5 = C1694m.f10482a;
                c0341k5.mo29m(c1694m5);
                return c1694m5;
            case 7:
                C0341k c0341k6 = (C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m6 = C1694m.f10482a;
                c0341k6.mo29m(c1694m6);
                return c1694m6;
            case 8:
                C0341k c0341k7 = (C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m7 = C1694m.f10482a;
                c0341k7.mo29m(c1694m7);
                return c1694m7;
            case AbstractC3122c.f15758c /* 9 */:
                C0341k c0341k8 = (C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m8 = C1694m.f10482a;
                c0341k8.mo29m(c1694m8);
                return c1694m8;
            case AbstractC3122c.f15760e /* 10 */:
                C0341k c0341k9 = (C0341k) mo28k((C0976ir) obj, (InterfaceC2313c) obj2);
                C1694m c1694m9 = C1694m.f10482a;
                c0341k9.mo29m(c1694m9);
                return c1694m9;
            case 11:
                return ((C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 12:
                C0341k c0341k10 = (C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m10 = C1694m.f10482a;
                c0341k10.mo29m(c1694m10);
                return c1694m10;
            case 13:
                return ((C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 14:
                C0341k c0341k11 = (C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m11 = C1694m.f10482a;
                c0341k11.mo29m(c1694m11);
                return c1694m11;
            default:
                C0341k c0341k12 = (C0341k) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m12 = C1694m.f10482a;
                c0341k12.mo29m(c1694m12);
                return c1694m12;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f1159i) {
            case 0:
                C0341k c0341k = new C0341k((C0342l) this.f1161k, interfaceC2313c, 0);
                c0341k.f1160j = obj;
                return c0341k;
            case 1:
                return new C0341k((Context) this.f1160j, (C3619d) this.f1161k, interfaceC2313c, 1);
            case 2:
                return new C0341k((List) this.f1160j, (InterfaceC2425y0) this.f1161k, interfaceC2313c, 2);
            case 3:
                C0341k c0341k2 = new C0341k((C1451y7) this.f1161k, interfaceC2313c, 3);
                c0341k2.f1160j = obj;
                return c0341k2;
            case 4:
                return new C0341k((C1270sc) this.f1160j, (Context) this.f1161k, interfaceC2313c, 4);
            case AbstractC3122c.f15761f /* 5 */:
                return new C0341k((C0910go) this.f1160j, (C3472s) this.f1161k, interfaceC2313c, 5);
            case AbstractC3122c.f15759d /* 6 */:
                return new C0341k((C1100ms) this.f1160j, (InterfaceC2425y0) this.f1161k, interfaceC2313c, 6);
            case 7:
                return new C0341k((InterfaceC2425y0) this.f1160j, (InterfaceC2425y0) this.f1161k, interfaceC2313c, 7);
            case 8:
                return new C0341k((Set) this.f1160j, (InterfaceC2425y0) this.f1161k, interfaceC2313c, 8);
            case AbstractC3122c.f15758c /* 9 */:
                return new C0341k((C0942ho) this.f1160j, (InterfaceC2425y0) this.f1161k, interfaceC2313c, 9);
            case AbstractC3122c.f15760e /* 10 */:
                C0341k c0341k3 = new C0341k((AbstractServiceC1371vk) this.f1161k, interfaceC2313c, 10);
                c0341k3.f1160j = obj;
                return c0341k3;
            case 11:
                return new C0341k((String) this.f1160j, (C1403wl) this.f1161k, interfaceC2313c, 11);
            case 12:
                return new C0341k((List) this.f1160j, (C2349d1) this.f1161k, interfaceC2313c, 12);
            case 13:
                return new C0341k((String) this.f1160j, (Network) this.f1161k, interfaceC2313c, 13);
            case 14:
                C0341k c0341k4 = new C0341k((C1100ms) this.f1161k, interfaceC2313c, 14);
                c0341k4.f1160j = obj;
                return c0341k4;
            default:
                C0341k c0341k5 = new C0341k((List) this.f1161k, interfaceC2313c, 15);
                c0341k5.f1160j = obj;
                return c0341k5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c1, code lost:
    
        if (r0 == null) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0238  */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, u5.v] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        boolean z7;
        String str;
        String str2;
        Object m2985m;
        String str3;
        C1434xl m2382h;
        Object m2985m2;
        InetAddress[] allByName;
        InetAddress inetAddress;
        String str4 = "";
        switch (this.f1159i) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f1160j;
                C0342l c0342l = (C0342l) this.f1161k;
                InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) c0342l.f1162a.getAndSet(null);
                AtomicReference atomicReference = c0342l.f1162a;
                C0565q1 m1141s = AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0062p0(interfaceC0520b1, c0342l, (InterfaceC2313c) null, 3), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, m1141s)) {
                        z7 = true;
                    } else if (atomicReference.get() != null) {
                        z7 = false;
                    }
                }
                return Boolean.valueOf(z7);
            case 1:
                AbstractC1793a0.m2972L(obj);
                ((Context) this.f1160j).getSharedPreferences("speed_test_profiles", 0).edit().putInt("diag_pager_page", AbstractC2168e.m3530q(((C3619d) this.f1161k).m5608i(), 0, 5)).apply();
                return C1694m.f10482a;
            case 2:
                AbstractC1793a0.m2972L(obj);
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f1161k;
                int m2068o = AbstractC1172p7.m2068o(interfaceC2425y0);
                int size = ((List) this.f1160j).size() - 1;
                if (size < 0) {
                    size = 0;
                }
                interfaceC2425y0.setValue(Integer.valueOf(AbstractC2168e.m3530q(m2068o, 0, size)));
                return C1694m.f10482a;
            case 3:
                AbstractC1793a0.m2972L(obj);
                C0942ho c0942ho = (C0942ho) this.f1160j;
                C1701c0 c1701c0 = ((C1451y7) this.f1161k).f9299e;
                C0703a8 c0703a8 = (C0703a8) c1701c0.getValue();
                int i7 = c0942ho.f4625b;
                int i8 = c0942ho.f4626c;
                String str5 = c0942ho.f4624a;
                String str6 = c0942ho.f4628e;
                if (!AbstractC0444k.m937a0(str6)) {
                    str4 = " · ".concat(str6);
                }
                C0703a8 m1494a = C0703a8.m1494a(c0703a8, i7 + "/" + i8 + " " + str5 + str4, null, false, null, 2039);
                c1701c0.getClass();
                c1701c0.m2752j(null, m1494a);
                return C1694m.f10482a;
            case 4:
                AbstractC1793a0.m2972L(obj);
                C1270sc c1270sc = (C1270sc) this.f1160j;
                Context applicationContext = ((Context) this.f1161k).getApplicationContext();
                AbstractC3367j.m5099d(applicationContext, "getApplicationContext(...)");
                c1270sc.getClass();
                c1270sc.f7554d = applicationContext.getApplicationContext();
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                C1694m c1694m = C1694m.f10482a;
                C3472s c3472s = (C3472s) this.f1161k;
                AbstractC1793a0.m2972L(obj);
                C0910go c0910go = (C0910go) this.f1160j;
                if (c0910go != null) {
                    List list = c0910go.f4326e;
                    String str7 = c0910go.f4322a;
                    Set set = (Set) c3472s.get(str7);
                    C1467yn c1467yn = (C1467yn) AbstractC1805m.m3047k0(list);
                    if (c1467yn != null) {
                        str = c1467yn.f9464a;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        str4 = str;
                    }
                    if (AbstractC0444k.m937a0(str4)) {
                        c3472s.remove(str7);
                    } else {
                        Set set2 = set;
                        if (set2 != null && !set2.isEmpty()) {
                            Set<String> set3 = set;
                            if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                                for (String str8 : set3) {
                                    if (list == null || !list.isEmpty()) {
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            if (AbstractC3367j.m5096a(((C1467yn) it.next()).f9464a, str8)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        String str9 = c0910go.f4327f;
                        if (list == null || !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (AbstractC3367j.m5096a(((C1467yn) it2.next()).f9464a, str9)) {
                                    str2 = str9;
                                    if (str2 != null) {
                                        str4 = str2;
                                    }
                                    c3472s.put(str7, AbstractC1793a0.m2970J(str4));
                                }
                            }
                        }
                        str2 = null;
                        if (str2 != null) {
                        }
                        c3472s.put(str7, AbstractC1793a0.m2970J(str4));
                    }
                }
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                AbstractC1793a0.m2972L(obj);
                C1100ms c1100ms = (C1100ms) this.f1160j;
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) this.f1161k;
                float f7 = AbstractC1092mk.f5952h;
                C0915gt c0915gt = (C0915gt) interfaceC2425y02.getValue();
                AbstractC3367j.m5100e(c0915gt, "snapshot");
                c1100ms.f6009B0 = c0915gt.f4380d;
                return C1694m.f10482a;
            case 7:
                EnumC1123nk enumC1123nk = EnumC1123nk.f6331i;
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) this.f1161k;
                AbstractC1793a0.m2972L(obj);
                InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) this.f1160j;
                float f8 = AbstractC1092mk.f5952h;
                if (AbstractC0444k.m937a0(((C0959i9) interfaceC2425y04.getValue()).f4779a)) {
                    interfaceC2425y03.setValue(enumC1123nk);
                } else if ((((C0959i9) interfaceC2425y04.getValue()).f4780b || ((C0959i9) interfaceC2425y04.getValue()).f4788j) && ((EnumC1123nk) interfaceC2425y03.getValue()) != enumC1123nk && ((EnumC1123nk) interfaceC2425y03.getValue()) != EnumC1123nk.f6332j) {
                    interfaceC2425y03.setValue(enumC1123nk);
                }
                return C1694m.f10482a;
            case 8:
                AbstractC1793a0.m2972L(obj);
                Set set4 = (Set) this.f1160j;
                InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) this.f1161k;
                float f9 = AbstractC1092mk.f5952h;
                if (!set4.contains(((EnumC1123nk) interfaceC2425y05.getValue()).f6338f)) {
                    interfaceC2425y05.setValue(EnumC1123nk.f6332j);
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15758c /* 9 */:
                AbstractC1793a0.m2972L(obj);
                ((InterfaceC2425y0) this.f1161k).setValue(AbstractC1092mk.m1702M2((C0942ho) this.f1160j));
                return C1694m.f10482a;
            case AbstractC3122c.f15760e /* 10 */:
                AbstractC1793a0.m2972L(obj);
                C0976ir c0976ir = (C0976ir) this.f1160j;
                AbstractServiceC1371vk abstractServiceC1371vk = (AbstractServiceC1371vk) this.f1161k;
                Messenger messenger = abstractServiceC1371vk.f8194g;
                if (messenger != null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("running_download", c0976ir.f4968a);
                    bundle.putBoolean("running_upload", c0976ir.f4969b);
                    bundle.putDouble("download_mbps", c0976ir.f4970c);
                    bundle.putDouble("upload_mbps", c0976ir.f4971d);
                    bundle.putDouble("download_avg_mbps", c0976ir.f4972e);
                    bundle.putDouble("upload_avg_mbps", c0976ir.f4973f);
                    bundle.putLong("download_total_bytes", c0976ir.f4974g);
                    bundle.putLong("upload_total_bytes", c0976ir.f4975h);
                    bundle.putDouble("final_download_mbps", c0976ir.f4978k);
                    bundle.putDouble("final_upload_mbps", c0976ir.f4979l);
                    bundle.putBoolean("show_download", c0976ir.f4983p);
                    bundle.putBoolean("show_upload", c0976ir.f4984q);
                    bundle.putString("message", c0976ir.f4985r);
                    bundle.putString("stop_reason", c0976ir.f4986s);
                    bundle.putLong("elapsed_millis", c0976ir.f4981n);
                    bundle.putLong("sample_interval_ms", c0976ir.f4963A);
                    bundle.putDouble("cpu_process_percent", c0976ir.f4965C);
                    bundle.putDouble("cpu_total_percent", c0976ir.f4964B);
                    bundle.putString("rate_push_status", c0976ir.f4966D);
                    List<C0707ac> list2 = c0976ir.f4980m;
                    JSONArray jSONArray = new JSONArray();
                    for (C0707ac c0707ac : list2) {
                        jSONArray.put(new JSONObject().put("id", c0707ac.f2361a).put("name", c0707ac.f2362b).put("interfaceName", c0707ac.f2363c).put("downloadMbps", c0707ac.f2364d).put("uploadMbps", c0707ac.f2365e).put("downloadBytes", c0707ac.f2366f).put("uploadBytes", c0707ac.f2367g));
                    }
                    String jSONArray2 = jSONArray.toString();
                    AbstractC3367j.m5099d(jSONArray2, "toString(...)");
                    bundle.putString("interface_rates", jSONArray2);
                    List<C0948hu> list3 = c0976ir.f4993z;
                    JSONArray jSONArray3 = new JSONArray();
                    for (C0948hu c0948hu : list3) {
                        JSONObject put = new JSONObject().put("id", c0948hu.f4659a).put("direction", c0948hu.f4660b).put("workerLabel", c0948hu.f4661c).put("interfaceName", c0948hu.f4662d).put("urlShort", c0948hu.f4663e).put("connectedIp", c0948hu.f4664f).put("localPort", c0948hu.f4665g).put("sessionBytes", c0948hu.f4666h).put("totalBytes", c0948hu.f4667i).put("speedMbps", c0948hu.f4668j);
                        Object obj2 = c0948hu.f4669k;
                        if (obj2 == null) {
                            obj2 = JSONObject.NULL;
                        }
                        jSONArray3.put(put.put("progressPercent", obj2).put("contentLength", c0948hu.f4670l).put("status", c0948hu.f4671m).put("attempt", c0948hu.f4672n));
                    }
                    String jSONArray4 = jSONArray3.toString();
                    AbstractC3367j.m5099d(jSONArray4, "toString(...)");
                    bundle.putString("worker_stats", jSONArray4);
                    bundle.putString("target_id", abstractServiceC1371vk.f8196i);
                    bundle.putInt("run_token", abstractServiceC1371vk.f8197j);
                    Message obtain = Message.obtain((Handler) null, 10);
                    obtain.setData(bundle);
                    try {
                        messenger.send(obtain);
                    } catch (Throwable th) {
                        AbstractC1793a0.m2985m(th);
                    }
                }
                return C1694m.f10482a;
            case 11:
                C1403wl c1403wl = (C1403wl) this.f1161k;
                C2623x c2623x = c1403wl.f8495f;
                String str10 = c1403wl.f8491b;
                AbstractC1793a0.m2972L(obj);
                String str11 = (String) this.f1160j;
                if (!AbstractC0444k.m937a0(str11) && !str11.equals("*")) {
                    String obj3 = AbstractC0444k.m956t0(c1403wl.f8494e).toString();
                    if (!AbstractC0444k.m937a0(obj3)) {
                        C2625z c2625z = new C2625z();
                        c2625z.m4194f("https://" + str10 + "/v4/ipGeo?ip=" + URLEncoder.encode(str11, AbstractC0434a.f1477a.name()));
                        c2625z.m4191c("Host", str10);
                        c2625z.m4191c("User-Agent", "NextTrace/NTrace-core Android HBCS-SpeedTest");
                        c2625z.m4191c("X-NextTrace-Token", obj3);
                        try {
                            m2985m = c2623x.m4187b(c2625z.m4189a()).m4681e();
                        } catch (Throwable th2) {
                            m2985m = AbstractC1793a0.m2985m(th2);
                        }
                        if (m2985m instanceof C1689h) {
                            m2985m = null;
                        }
                        C2598d0 c2598d0 = (C2598d0) m2985m;
                        if (c2598d0 != null) {
                            try {
                                if (c2598d0.m4142c()) {
                                    AbstractC2602f0 abstractC2602f0 = c2598d0.f14062k;
                                    if (abstractC2602f0 != null) {
                                        str3 = abstractC2602f0.m4148h();
                                    } else {
                                        str3 = null;
                                    }
                                    if (str3 != null) {
                                        str4 = str3;
                                    }
                                    if (!AbstractC0444k.m937a0(str4)) {
                                        m2382h = C1403wl.m2382h(new JSONObject(str4));
                                        c2598d0.close();
                                        if (m2382h == null) {
                                            String str12 = c1403wl.f8496g;
                                            if (AbstractC0444k.m937a0(str12) || System.currentTimeMillis() - c1403wl.f8497h >= 1500000) {
                                                str12 = null;
                                            }
                                            if (str12 == null) {
                                                try {
                                                    m2985m2 = c1403wl.m2386e();
                                                } catch (Throwable th3) {
                                                    m2985m2 = AbstractC1793a0.m2985m(th3);
                                                }
                                                if (m2985m2 instanceof C1689h) {
                                                    m2985m2 = null;
                                                }
                                                str12 = (String) m2985m2;
                                                if (str12 != null && !AbstractC0444k.m937a0(str12)) {
                                                    c1403wl.f8496g = str12;
                                                    c1403wl.f8497h = System.currentTimeMillis();
                                                    break;
                                                }
                                            }
                                            String m2385k = C1403wl.m2385k(str10);
                                            if (m2385k != null) {
                                                C2622w m4186a = c2623x.m4186a();
                                                m4186a.m4181b(new C1279sl(m2385k, 0));
                                                C2623x c2623x2 = new C2623x(m4186a);
                                                CountDownLatch countDownLatch = new CountDownLatch(1);
                                                ?? obj4 = new Object();
                                                C2625z c2625z2 = new C2625z();
                                                c2625z2.m4194f("wss://" + str10 + "/v3/ipGeoWs");
                                                c2625z2.m4191c("Host", str10);
                                                c2625z2.m4191c("User-Agent", "NextTrace/NTrace-core Android HBCS-SpeedTest");
                                                c2625z2.m4191c("Authorization", "Bearer ".concat(str12));
                                                C3887f m4188c = c2623x2.m4188c(c2625z2.m4189a(), new C1310tl(obj4, c1403wl, countDownLatch));
                                                m4188c.m5906g(str11);
                                                countDownLatch.await(4L, TimeUnit.SECONDS);
                                                m4188c.m5901b("done", 1000);
                                                return (C1434xl) obj4.f16451e;
                                            }
                                        } else {
                                            return m2382h;
                                        }
                                    }
                                }
                                m2382h = null;
                                c2598d0.close();
                                if (m2382h == null) {
                                }
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    AbstractC2168e.m3526m(c2598d0, th4);
                                    throw th5;
                                }
                            }
                        }
                    }
                    m2382h = null;
                    if (m2382h == null) {
                    }
                }
                return null;
            case 12:
                AbstractC1793a0.m2972L(obj);
                C2349d1 c2349d1 = (C2349d1) this.f1161k;
                if (c2349d1.m3741g() >= ((List) this.f1160j).size()) {
                    c2349d1.m3742h(0);
                }
                return C1694m.f10482a;
            case 13:
                AbstractC1793a0.m2972L(obj);
                Pattern pattern = AbstractC1155ol.f6638a;
                String str13 = (String) this.f1160j;
                EnumC1124nl m2013a = AbstractC1155ol.m2013a(str13);
                if (m2013a != EnumC1124nl.f6339e && m2013a != EnumC1124nl.f6340f) {
                    Network network = (Network) this.f1161k;
                    if (network != null) {
                        allByName = network.getAllByName(str13);
                    } else {
                        allByName = InetAddress.getAllByName(str13);
                    }
                    AbstractC3367j.m5097b(allByName);
                    if (allByName.length == 0) {
                        inetAddress = null;
                    } else {
                        inetAddress = allByName[0];
                    }
                    if (inetAddress == null) {
                        throw new IllegalStateException("目标解析失败");
                    }
                    return inetAddress;
                }
                InetAddress byName = InetAddress.getByName(str13);
                AbstractC3367j.m5099d(byName, "getByName(...)");
                return byName;
            case 14:
                AbstractC1793a0.m2972L(obj);
                C1100ms c1100ms2 = (C1100ms) this.f1161k;
                try {
                    c1100ms2.f6032N.m40k();
                } catch (Throwable th6) {
                    AbstractC1793a0.m2985m(th6);
                }
                try {
                    c1100ms2.f6034O.m40k();
                } catch (Throwable th7) {
                    AbstractC1793a0.m2985m(th7);
                }
                try {
                    C1100ms.f6001r1.m40k();
                } catch (Throwable th8) {
                    AbstractC1793a0.m2985m(th8);
                }
                try {
                    C1100ms.f6002s1.m40k();
                } catch (Throwable th9) {
                    AbstractC1793a0.m2985m(th9);
                }
                C1247rk c1247rk = C1100ms.f5998o1;
                c1100ms2.m1960R();
                return C1694m.f10482a;
            default:
                AbstractC1793a0.m2972L(obj);
                Iterator it3 = ((List) this.f1161k).iterator();
                while (it3.hasNext()) {
                    try {
                        ((HttpURLConnection) it3.next()).disconnect();
                    } catch (Throwable th10) {
                        AbstractC1793a0.m2985m(th10);
                    }
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0341k(Object obj, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f1159i = i7;
        this.f1161k = obj;
    }
}
