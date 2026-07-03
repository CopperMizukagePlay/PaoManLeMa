package p039e5;

import android.content.Context;
import android.net.Network;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import p001a0.C0016d2;
import p018c0.C0341k;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1807o;
import p060h5.C1813u;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.x7 */
/* loaded from: classes.dex */
public final class C1420x7 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public Object f8608i;

    /* renamed from: j */
    public Object f8609j;

    /* renamed from: k */
    public int f8610k;

    /* renamed from: l */
    public final /* synthetic */ String f8611l;

    /* renamed from: m */
    public final /* synthetic */ C1451y7 f8612m;

    /* renamed from: n */
    public final /* synthetic */ Context f8613n;

    /* renamed from: o */
    public final /* synthetic */ boolean f8614o;

    /* renamed from: p */
    public final /* synthetic */ boolean f8615p;

    /* renamed from: q */
    public final /* synthetic */ boolean f8616q;

    /* renamed from: r */
    public final /* synthetic */ List f8617r;

    /* renamed from: s */
    public final /* synthetic */ boolean f8618s;

    /* renamed from: t */
    public final /* synthetic */ List f8619t;

    /* renamed from: u */
    public final /* synthetic */ Network f8620u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420x7(String str, C1451y7 c1451y7, Context context, boolean z7, boolean z8, boolean z9, List list, boolean z10, List list2, Network network, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f8611l = str;
        this.f8612m = c1451y7;
        this.f8613n = context;
        this.f8614o = z7;
        this.f8615p = z8;
        this.f8616q = z9;
        this.f8617r = list;
        this.f8618s = z10;
        this.f8619t = list2;
        this.f8620u = network;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1420x7) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1420x7(this.f8611l, this.f8612m, this.f8613n, this.f8614o, this.f8615p, this.f8616q, this.f8617r, this.f8618s, this.f8619t, this.f8620u, interfaceC2313c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0118, code lost:
    
        if (r6 == null) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01dc A[Catch: Exception -> 0x011e, all -> 0x016f, TryCatch #6 {all -> 0x016f, blocks: (B:43:0x00e3, B:44:0x00f2, B:46:0x00f8, B:56:0x013f, B:57:0x014a, B:59:0x0150, B:61:0x015c, B:64:0x016b, B:66:0x0176, B:73:0x017c, B:48:0x0121, B:50:0x0125, B:89:0x01a1, B:92:0x01a9, B:94:0x01af, B:96:0x0219, B:98:0x0221, B:100:0x0226, B:117:0x0291, B:119:0x0299, B:120:0x02a1, B:106:0x01d6, B:108:0x01dc, B:109:0x01f5, B:111:0x01fb, B:39:0x00da, B:16:0x0079, B:155:0x0271, B:157:0x0284, B:159:0x0289), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f5 A[Catch: Exception -> 0x011e, all -> 0x016f, TryCatch #6 {all -> 0x016f, blocks: (B:43:0x00e3, B:44:0x00f2, B:46:0x00f8, B:56:0x013f, B:57:0x014a, B:59:0x0150, B:61:0x015c, B:64:0x016b, B:66:0x0176, B:73:0x017c, B:48:0x0121, B:50:0x0125, B:89:0x01a1, B:92:0x01a9, B:94:0x01af, B:96:0x0219, B:98:0x0221, B:100:0x0226, B:117:0x0291, B:119:0x0299, B:120:0x02a1, B:106:0x01d6, B:108:0x01dc, B:109:0x01f5, B:111:0x01fb, B:39:0x00da, B:16:0x0079, B:155:0x0271, B:157:0x0284, B:159:0x0289), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0299 A[Catch: all -> 0x016f, TryCatch #6 {all -> 0x016f, blocks: (B:43:0x00e3, B:44:0x00f2, B:46:0x00f8, B:56:0x013f, B:57:0x014a, B:59:0x0150, B:61:0x015c, B:64:0x016b, B:66:0x0176, B:73:0x017c, B:48:0x0121, B:50:0x0125, B:89:0x01a1, B:92:0x01a9, B:94:0x01af, B:96:0x0219, B:98:0x0221, B:100:0x0226, B:117:0x0291, B:119:0x0299, B:120:0x02a1, B:106:0x01d6, B:108:0x01dc, B:109:0x01f5, B:111:0x01fb, B:39:0x00da, B:16:0x0079, B:155:0x0271, B:157:0x0284, B:159:0x0289), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8 A[Catch: Exception -> 0x011e, all -> 0x016f, TRY_LEAVE, TryCatch #6 {all -> 0x016f, blocks: (B:43:0x00e3, B:44:0x00f2, B:46:0x00f8, B:56:0x013f, B:57:0x014a, B:59:0x0150, B:61:0x015c, B:64:0x016b, B:66:0x0176, B:73:0x017c, B:48:0x0121, B:50:0x0125, B:89:0x01a1, B:92:0x01a9, B:94:0x01af, B:96:0x0219, B:98:0x0221, B:100:0x0226, B:117:0x0291, B:119:0x0299, B:120:0x02a1, B:106:0x01d6, B:108:0x01dc, B:109:0x01f5, B:111:0x01fb, B:39:0x00da, B:16:0x0079, B:155:0x0271, B:157:0x0284, B:159:0x0289), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a9 A[Catch: Exception -> 0x011e, all -> 0x016f, TRY_ENTER, TryCatch #6 {all -> 0x016f, blocks: (B:43:0x00e3, B:44:0x00f2, B:46:0x00f8, B:56:0x013f, B:57:0x014a, B:59:0x0150, B:61:0x015c, B:64:0x016b, B:66:0x0176, B:73:0x017c, B:48:0x0121, B:50:0x0125, B:89:0x01a1, B:92:0x01a9, B:94:0x01af, B:96:0x0219, B:98:0x0221, B:100:0x0226, B:117:0x0291, B:119:0x0299, B:120:0x02a1, B:106:0x01d6, B:108:0x01dc, B:109:0x01f5, B:111:0x01fb, B:39:0x00da, B:16:0x0079, B:155:0x0271, B:157:0x0284, B:159:0x0289), top: B:2:0x001a }] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v12, types: [h5.u] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [l5.a] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        String str;
        boolean z7;
        String message;
        boolean z8;
        C1405wn c1405wn;
        EnumC1127no enumC1127no;
        Object obj2;
        Object obj3;
        C1405wn c1405wn2;
        boolean z9;
        List list;
        Object obj4;
        ?? r22;
        List list2;
        String str2;
        String obj5;
        Object obj6;
        String str3;
        boolean z10;
        Object obj7;
        C1405wn c1405wn3;
        String str4;
        C1405wn m2239R;
        Network network;
        Context context = this.f8613n;
        C1451y7 c1451y7 = this.f8612m;
        AtomicBoolean atomicBoolean = c1451y7.f9296b;
        C1701c0 c1701c0 = c1451y7.f9299e;
        int i7 = this.f8610k;
        String str5 = this.f8611l;
        C1694m c1694m = C1694m.f10482a;
        String str6 = "IPv4";
        String str7 = EnumC2465a.f13750e;
        try {
            try {
                try {
                    try {
                    } catch (Exception e7) {
                        e = e7;
                        str7 = str6;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Exception e9) {
            e = e9;
            str7 = str5;
            str = null;
        }
        if (i7 != 0) {
            try {
                if (i7 != 1) {
                    if (i7 == 2) {
                        List list3 = (List) this.f8609j;
                        c1405wn2 = (C1405wn) this.f8608i;
                        AbstractC1793a0.m2972L(obj);
                        str7 = str5;
                        z9 = true;
                        z7 = false;
                        str = null;
                        list = list3;
                        obj4 = obj;
                        List<C1296t7> list4 = (List) obj4;
                        r22 = new ArrayList(AbstractC1807o.m3073U(list4));
                        for (C1296t7 c1296t7 : list4) {
                            String str8 = c1296t7.f7761a;
                            C1485za c1485za = c1296t7.f7762b;
                            if (c1485za != null) {
                                try {
                                    obj5 = AbstractC0444k.m956t0(c1485za.f9839a).toString();
                                    if (obj5 != null) {
                                        if (AbstractC0444k.m937a0(obj5)) {
                                            obj5 = str;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    atomicBoolean.set(z7);
                                    C0703a8 m1494a = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 2038);
                                    c1701c0.getClass();
                                    c1701c0.m2752j(str, m1494a);
                                    throw th;
                                }
                            }
                            if (c1405wn2.f8506d && !((List) c1405wn2.f8508f.getValue()).isEmpty()) {
                                z10 = z9;
                            } else {
                                z10 = z7;
                            }
                            if (z10 && c1485za == null) {
                                obj5 = "默认";
                            } else {
                                obj5 = "";
                            }
                            List<InetAddress> list5 = c1296t7.f7763c;
                            ArrayList arrayList = new ArrayList();
                            for (InetAddress inetAddress : list5) {
                                String hostAddress = inetAddress.getHostAddress();
                                if (hostAddress != null) {
                                    if (inetAddress.getAddress().length != 4) {
                                        str3 = "IPv6";
                                    } else {
                                        str3 = "IPv4";
                                    }
                                    obj6 = new C0877fn(hostAddress, str3);
                                } else {
                                    obj6 = str;
                                }
                                if (obj6 != null) {
                                    arrayList.add(obj6);
                                }
                            }
                            r22.add(new C1482z7(str8, obj5, arrayList));
                            z9 = true;
                            z7 = false;
                        }
                        list2 = r22;
                        List list6 = list;
                        if (list2.isEmpty() && !list6.isEmpty()) {
                            str2 = "完成：系统 " + list6.size() + " 条，指定 DNS " + list2.size() + " 组";
                        } else if (!list2.isEmpty()) {
                            str2 = "完成：指定 DNS " + list2.size() + " 组";
                        } else if (!list6.isEmpty()) {
                            str2 = "完成：系统 DNS " + list6.size() + " 条";
                        } else {
                            str2 = "未解析到地址";
                        }
                        str6 = str7;
                        C0703a8 c0703a8 = new C0703a8(str6, str2, list6, list2, null, 1993);
                        c1701c0.getClass();
                        c1701c0.m2752j(str, c0703a8);
                        z8 = false;
                        atomicBoolean.set(z8);
                        C0703a8 m1494a2 = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 2038);
                        c1701c0.getClass();
                        c1701c0.m2752j(str, m1494a2);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1405wn = (C1405wn) this.f8609j;
                enumC1127no = (EnumC1127no) this.f8608i;
                AbstractC1793a0.m2972L(obj);
                obj2 = str7;
                str7 = str5;
                obj3 = obj;
            } catch (Throwable th3) {
                th = th3;
                z7 = false;
                str = null;
                atomicBoolean.set(z7);
                C0703a8 m1494a3 = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 2038);
                c1701c0.getClass();
                c1701c0.m2752j(str, m1494a3);
                throw th;
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            try {
                Pattern pattern = AbstractC1155ol.f6638a;
                EnumC1124nl m2013a = AbstractC1155ol.m2013a(str5);
                EnumC1124nl enumC1124nl = EnumC1124nl.f6339e;
                if (m2013a == enumC1124nl || m2013a == EnumC1124nl.f6340f) {
                    str = null;
                    if (m2013a != enumC1124nl) {
                        str4 = "IPv6";
                    } else {
                        str4 = "IPv4";
                    }
                    str6 = str5;
                    C0703a8 c0703a82 = new C0703a8(str6, "已是 IP 地址，无需解析", null, null, new C0877fn(str5, str4), 1977);
                    c1701c0.getClass();
                    c1701c0.m2752j(null, c0703a82);
                    z8 = false;
                    atomicBoolean.set(z8);
                    C0703a8 m1494a22 = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 2038);
                    c1701c0.getClass();
                    c1701c0.m2752j(str, m1494a22);
                    return c1694m;
                }
                EnumC1127no enumC1127no2 = AbstractC1249rm.m2265i0(context).f5325h;
                try {
                    str = null;
                    try {
                    } catch (Exception e10) {
                        e = e10;
                        str7 = str5;
                    }
                    try {
                        obj2 = str7;
                        try {
                            try {
                                m2239R = AbstractC1249rm.m2239R(context, this.f8614o, this.f8615p, this.f8616q, this.f8617r, this.f8618s, this.f8619t);
                                network = this.f8620u;
                                this.f8608i = enumC1127no2;
                                this.f8609j = m2239R;
                                this.f8610k = 1;
                                C2325e c2325e = AbstractC0549l0.f1898a;
                                str7 = str5;
                            } catch (Exception e11) {
                                e = e11;
                                str7 = str5;
                                str = null;
                                message = e.getMessage();
                                if (message == null) {
                                    message = e.getClass().getSimpleName();
                                }
                                C0703a8 c0703a83 = new C0703a8(str7, "查询失败：" + message, null, null, null, 2041);
                                c1701c0.getClass();
                                c1701c0.m2752j(str, c0703a83);
                                z8 = false;
                                atomicBoolean.set(z8);
                                C0703a8 m1494a222 = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 2038);
                                c1701c0.getClass();
                                c1701c0.m2752j(str, m1494a222);
                                return c1694m;
                            }
                            try {
                                obj3 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0016d2(str7, network, null, false, null), this);
                                if (obj3 == obj2) {
                                    return obj2;
                                }
                                enumC1127no = enumC1127no2;
                                c1405wn = m2239R;
                                str7 = str7;
                            } catch (Exception e12) {
                                e = e12;
                                str = null;
                                message = e.getMessage();
                                if (message == null) {
                                }
                                C0703a8 c0703a832 = new C0703a8(str7, "查询失败：" + message, null, null, null, 2041);
                                c1701c0.getClass();
                                c1701c0.m2752j(str, c0703a832);
                                z8 = false;
                                atomicBoolean.set(z8);
                                C0703a8 m1494a2222 = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 2038);
                                c1701c0.getClass();
                                c1701c0.m2752j(str, m1494a2222);
                                return c1694m;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str = null;
                            z7 = false;
                            atomicBoolean.set(z7);
                            C0703a8 m1494a32 = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 2038);
                            c1701c0.getClass();
                            c1701c0.m2752j(str, m1494a32);
                            throw th;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        str7 = str5;
                        str = null;
                        message = e.getMessage();
                        if (message == null) {
                        }
                        C0703a8 c0703a8322 = new C0703a8(str7, "查询失败：" + message, null, null, null, 2041);
                        c1701c0.getClass();
                        c1701c0.m2752j(str, c0703a8322);
                        z8 = false;
                        atomicBoolean.set(z8);
                        C0703a8 m1494a22222 = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 2038);
                        c1701c0.getClass();
                        c1701c0.m2752j(str, m1494a22222);
                        return c1694m;
                    } catch (Throwable th5) {
                        th = th5;
                        str = null;
                        z7 = false;
                        atomicBoolean.set(z7);
                        C0703a8 m1494a322 = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 2038);
                        c1701c0.getClass();
                        c1701c0.m2752j(str, m1494a322);
                        throw th;
                    }
                } catch (Exception e14) {
                    e = e14;
                    str7 = str5;
                    str = null;
                } catch (Throwable th6) {
                    th = th6;
                    str = null;
                }
            } catch (Throwable th7) {
                th = th7;
                str = null;
            }
        }
        list = (List) obj3;
        r22 = C1813u.f10860e;
        if (c1405wn.m2388b()) {
            C1074m2 c1074m2 = C1074m2.f5786a;
            Network network2 = this.f8620u;
            z7 = false;
            try {
                C0341k c0341k = new C0341k(c1451y7, null, 3);
                this.f8608i = c1405wn;
                this.f8609j = list;
                this.f8610k = 2;
                EnumC1127no enumC1127no3 = enumC1127no;
                z9 = true;
                str = null;
                obj7 = obj2;
                c1405wn3 = c1405wn;
                String str9 = str7;
                try {
                    obj4 = c1074m2.m1637b(str9, network2, c1405wn3, enumC1127no3, c0341k, this);
                    str7 = str9;
                } catch (Exception e15) {
                    e = e15;
                    str7 = str9;
                    message = e.getMessage();
                    if (message == null) {
                    }
                    C0703a8 c0703a83222 = new C0703a8(str7, "查询失败：" + message, null, null, null, 2041);
                    c1701c0.getClass();
                    c1701c0.m2752j(str, c0703a83222);
                    z8 = false;
                    atomicBoolean.set(z8);
                    C0703a8 m1494a222222 = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 2038);
                    c1701c0.getClass();
                    c1701c0.m2752j(str, m1494a222222);
                    return c1694m;
                }
            } catch (Exception e16) {
                e = e16;
                str = null;
            } catch (Throwable th8) {
                th = th8;
                str = null;
                z7 = false;
                atomicBoolean.set(z7);
                C0703a8 m1494a3222 = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 2038);
                c1701c0.getClass();
                c1701c0.m2752j(str, m1494a3222);
                throw th;
            }
            if (obj4 == obj7) {
                return obj7;
            }
            c1405wn2 = c1405wn3;
            List<C1296t7> list42 = (List) obj4;
            r22 = new ArrayList(AbstractC1807o.m3073U(list42));
            while (r0.hasNext()) {
            }
            list2 = r22;
            List list62 = list;
            if (list2.isEmpty()) {
            }
            if (!list2.isEmpty()) {
            }
            str6 = str7;
            C0703a8 c0703a84 = new C0703a8(str6, str2, list62, list2, null, 1993);
            c1701c0.getClass();
            c1701c0.m2752j(str, c0703a84);
            z8 = false;
            atomicBoolean.set(z8);
            C0703a8 m1494a2222222 = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 2038);
            c1701c0.getClass();
            c1701c0.m2752j(str, m1494a2222222);
            return c1694m;
        }
        str = null;
        list2 = r22;
        List list622 = list;
        if (list2.isEmpty()) {
        }
        if (!list2.isEmpty()) {
        }
        str6 = str7;
        C0703a8 c0703a842 = new C0703a8(str6, str2, list622, list2, null, 1993);
        c1701c0.getClass();
        c1701c0.m2752j(str, c0703a842);
        z8 = false;
        atomicBoolean.set(z8);
        C0703a8 m1494a22222222 = C0703a8.m1494a((C0703a8) c1701c0.getValue(), "", null, false, null, 2038);
        c1701c0.getClass();
        c1701c0.m2752j(str, m1494a22222222);
        return c1694m;
    }
}
