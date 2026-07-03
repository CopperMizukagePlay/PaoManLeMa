package p001a0;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import javax.net.SocketFactory;
import p015b6.AbstractC0307n;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p034e0.C0622o0;
import p039e5.AbstractC1092mk;
import p039e5.C0961ib;
import p039e5.C0976ir;
import p039e5.C1065lo;
import p039e5.C1227r0;
import p039e5.C1238rb;
import p039e5.C1373vm;
import p039e5.C1403wl;
import p039e5.C1496zl;
import p039e5.C1504zt;
import p039e5.EnumC1342um;
import p053g5.C1689h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p068i5.AbstractC2080d;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p098m5.AbstractC2590j;
import p099m6.AbstractC2595c;
import p099m6.AbstractC2602f0;
import p099m6.C2598d0;
import p099m6.C2622w;
import p099m6.C2623x;
import p099m6.C2625z;
import p117p1.InterfaceC2872w;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.q0 */
/* loaded from: classes.dex */
public final class C0066q0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f327i;

    /* renamed from: j */
    public /* synthetic */ Object f328j;

    /* renamed from: k */
    public final /* synthetic */ Object f329k;

    /* renamed from: l */
    public final /* synthetic */ Object f330l;

    /* renamed from: m */
    public final /* synthetic */ Object f331m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0066q0(C0976ir c0976ir, Context context, C3469p c3469p, InterfaceC2425y0 interfaceC2425y0, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f327i = 2;
        this.f328j = c0976ir;
        this.f329k = context;
        this.f330l = c3469p;
        this.f331m = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f327i) {
            case 0:
                C0066q0 c0066q0 = (C0066q0) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m = C1694m.f10482a;
                c0066q0.mo29m(c1694m);
                return c1694m;
            case 1:
                return ((C0066q0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 2:
                C0066q0 c0066q02 = (C0066q0) mo28k(interfaceC0516a0, interfaceC2313c);
                C1694m c1694m2 = C1694m.f10482a;
                c0066q02.mo29m(c1694m2);
                return c1694m2;
            case 3:
                return ((C0066q0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0066q0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f327i) {
            case 0:
                C0066q0 c0066q0 = new C0066q0((InterfaceC2872w) this.f329k, (InterfaceC0071r1) this.f330l, (C0622o0) this.f331m, interfaceC2313c, 0);
                c0066q0.f328j = obj;
                return c0066q0;
            case 1:
                C0066q0 c0066q02 = new C0066q0((Context) this.f329k, (C1227r0) this.f330l, (Uri) this.f331m, interfaceC2313c, 1);
                c0066q02.f328j = obj;
                return c0066q02;
            case 2:
                return new C0066q0((C0976ir) this.f328j, (Context) this.f329k, (C3469p) this.f330l, (InterfaceC2425y0) this.f331m, interfaceC2313c);
            case 3:
                C0066q0 c0066q03 = new C0066q0((C1403wl) this.f329k, (String) this.f330l, (C1496zl) this.f331m, interfaceC2313c, 3);
                c0066q03.f328j = obj;
                return c0066q03;
            default:
                C0066q0 c0066q04 = new C0066q0((Network) this.f329k, (EnumC1342um) this.f330l, (String) this.f331m, interfaceC2313c, 4);
                c0066q04.f328j = obj;
                return c0066q04;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        if (r3 == false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0, types: [k5.c] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v18 */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        Object m2985m;
        File m2163c;
        String str;
        double d7;
        double d8;
        long j6;
        Object obj2;
        String str2;
        C1689h c1689h;
        C2598d0 m4681e;
        C1689h c1689h2;
        String obj3;
        String str3;
        String obj4;
        int i7 = this.f327i;
        C1694m c1694m = C1694m.f10482a;
        boolean z7 = true;
        int i8 = 0;
        ?? r62 = 0;
        r6 = null;
        r6 = null;
        C1504zt m2379d = null;
        Object obj5 = this.f331m;
        Object obj6 = this.f330l;
        Object obj7 = this.f329k;
        switch (i7) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f328j;
                InterfaceC2872w interfaceC2872w = (InterfaceC2872w) obj7;
                AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0058o0(interfaceC2872w, (InterfaceC0071r1) obj6, r62, i8), 1);
                AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0062p0(interfaceC2872w, (C0622o0) obj5, (InterfaceC2313c) r62, i8), 1);
                return c1694m;
            case 1:
                AbstractC1793a0.m2972L(obj);
                Context context = (Context) obj7;
                C1227r0 c1227r0 = (C1227r0) obj6;
                Uri uri = (Uri) obj5;
                try {
                    C1238rb c1238rb = C1238rb.f7307a;
                    m2163c = C1238rb.m2163c(context, C1238rb.m2175q(c1227r0.f7197e));
                    C0961ib m2173n = C1238rb.m2173n(context);
                    if (m2173n != null) {
                        r62 = new Long(m2173n.f4806g);
                    }
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (!C1238rb.m2177s(m2163c, r62)) {
                    return Boolean.FALSE;
                }
                OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri);
                if (openOutputStream != null) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(m2163c);
                        try {
                            AbstractC2080d.m3398k(fileInputStream, openOutputStream);
                            fileInputStream.close();
                            openOutputStream.close();
                            m2985m = Boolean.TRUE;
                            Boolean bool = Boolean.FALSE;
                            if (m2985m instanceof C1689h) {
                                return bool;
                            }
                            return m2985m;
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    return Boolean.FALSE;
                }
            case 2:
                C3469p c3469p = (C3469p) obj6;
                Context context2 = (Context) obj7;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj5;
                AbstractC1793a0.m2972L(obj);
                C0976ir c0976ir = (C0976ir) this.f328j;
                double d9 = c0976ir.f4979l;
                double d10 = c0976ir.f4978k;
                boolean z8 = c0976ir.f4984q;
                if (!c0976ir.f4968a && !c0976ir.f4969b) {
                    z7 = false;
                }
                float f7 = AbstractC1092mk.f5952h;
                if (((Boolean) interfaceC2425y0.getValue()).booleanValue() && !z7 && (d10 > 0.0d || d9 > 0.0d)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    String m1765a3 = AbstractC1092mk.m1765a3(context2);
                    boolean z9 = c0976ir.f4983p;
                    if (z9 && z8) {
                        str = "双向";
                    } else if (z9) {
                        str = "下载";
                    } else if (z8) {
                        str = "上传";
                    } else {
                        str = "未知";
                    }
                    if (z9) {
                        d7 = d10;
                    } else {
                        d7 = 0.0d;
                    }
                    if (z8) {
                        d8 = d9;
                    } else {
                        d8 = 0.0d;
                    }
                    long j7 = 0;
                    if (z9) {
                        j6 = c0976ir.f4974g;
                    } else {
                        j6 = 0;
                    }
                    if (z8) {
                        j7 = c0976ir.f4975h;
                    }
                    c3469p.add(0, new C1065lo(currentTimeMillis, currentTimeMillis2, m1765a3, str, d7, d8, j6, j7));
                    AbstractC1092mk.m1732S2(context2, c3469p);
                }
                interfaceC2425y0.setValue(Boolean.valueOf(z7));
                return c1694m;
            case 3:
                AbstractC1793a0.m2972L(obj);
                C1403wl c1403wl = (C1403wl) obj7;
                C2625z m2376a = C1403wl.m2376a(c1403wl, AbstractC2487d.m4043g((String) obj6, "/api/trace"), c1403wl.f8493d);
                C1496zl c1496zl = (C1496zl) obj5;
                String jSONObject = C1403wl.m2377b(c1403wl, c1496zl).toString();
                AbstractC3367j.m5099d(jSONObject, "toString(...)");
                m2376a.m4192d("POST", AbstractC2595c.m4131e(jSONObject, C1403wl.f8489i));
                m2376a.m4191c("User-Agent", "NextTrace/NTrace-core Android HBCS-SpeedTest");
                m2376a.m4191c("Content-Type", "application/json");
                try {
                    obj2 = c1403wl.f8495f.m4187b(m2376a.m4189a()).m4681e();
                } catch (Throwable th2) {
                    obj2 = AbstractC1793a0.m2985m(th2);
                }
                boolean z10 = obj2 instanceof C1689h;
                Object obj8 = obj2;
                if (z10) {
                    obj8 = null;
                }
                C2598d0 c2598d0 = (C2598d0) obj8;
                if (c2598d0 != null) {
                    try {
                        if (!c2598d0.m4142c()) {
                            c2598d0.close();
                        } else {
                            AbstractC2602f0 abstractC2602f0 = c2598d0.f14062k;
                            if (abstractC2602f0 != null) {
                                str2 = abstractC2602f0.m4148h();
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "";
                            }
                            if (AbstractC0444k.m937a0(str2)) {
                                c2598d0.close();
                            } else {
                                m2379d = C1403wl.m2379d(c1403wl, str2, c1496zl);
                                c2598d0.close();
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC2168e.m3526m(c2598d0, th3);
                            throw th4;
                        }
                    }
                }
                return m2379d;
            default:
                AbstractC1793a0.m2972L(obj);
                Network network = (Network) obj7;
                EnumC1342um enumC1342um = (EnumC1342um) obj6;
                String str4 = (String) obj5;
                try {
                    C2622w m4186a = C1373vm.f8207a.m4186a();
                    m4186a.m4181b(new C0068q2(5, network, enumC1342um));
                    if (network != null) {
                        SocketFactory socketFactory = network.getSocketFactory();
                        AbstractC3367j.m5099d(socketFactory, "getSocketFactory(...)");
                        m4186a.m4184e(socketFactory);
                    }
                    C2623x c2623x = new C2623x(m4186a);
                    C2625z c2625z = new C2625z();
                    c2625z.m4194f(AbstractC0444k.m956t0(str4).toString());
                    c2625z.m4191c("User-Agent", "SpeedTest-V5.0.1");
                    c2625z.m4190b();
                    m4681e = c2623x.m4187b(c2625z.m4189a()).m4681e();
                    try {
                    } finally {
                    }
                } catch (Throwable th5) {
                    c1689h = AbstractC1793a0.m2985m(th5);
                }
                if (!m4681e.m4142c()) {
                    m4681e.close();
                    return null;
                }
                AbstractC2602f0 abstractC2602f02 = m4681e.f14062k;
                if (abstractC2602f02 != null && (obj3 = AbstractC0444k.m956t0(abstractC2602f02.m4148h()).toString()) != null && (str3 = (String) AbstractC0307n.m665D(AbstractC0444k.m940d0(obj3))) != null && (obj4 = AbstractC0444k.m956t0(str3).toString()) != null) {
                    ?? m953q0 = AbstractC0444k.m953q0(obj4, '%');
                    boolean m937a0 = AbstractC0444k.m937a0(m953q0);
                    c1689h2 = m953q0;
                    break;
                }
                c1689h2 = null;
                m4681e.close();
                c1689h = c1689h2;
                if (c1689h instanceof C1689h) {
                    return null;
                }
                return c1689h;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0066q0(Object obj, Object obj2, Object obj3, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f327i = i7;
        this.f329k = obj;
        this.f330l = obj2;
        this.f331m = obj3;
    }
}
