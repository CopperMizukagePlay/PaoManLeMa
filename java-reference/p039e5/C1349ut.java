package p039e5;

import android.content.Context;
import android.net.Network;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p015b6.C0310q;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ut */
/* loaded from: classes.dex */
public final class C1349ut extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public String f8015i;

    /* renamed from: j */
    public int f8016j;

    /* renamed from: k */
    public final /* synthetic */ C1473yt f8017k;

    /* renamed from: l */
    public final /* synthetic */ String f8018l;

    /* renamed from: m */
    public final /* synthetic */ EnumC1163ot f8019m;

    /* renamed from: n */
    public final /* synthetic */ C1496zl f8020n;

    /* renamed from: o */
    public final /* synthetic */ EnumC1465yl f8021o;

    /* renamed from: p */
    public final /* synthetic */ String f8022p;

    /* renamed from: q */
    public final /* synthetic */ String f8023q;

    /* renamed from: r */
    public final /* synthetic */ String f8024r;

    /* renamed from: s */
    public final /* synthetic */ Network f8025s;

    /* renamed from: t */
    public final /* synthetic */ C1403wl f8026t;

    /* renamed from: u */
    public final /* synthetic */ C1194pt f8027u;

    /* renamed from: v */
    public final /* synthetic */ Context f8028v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1349ut(C1473yt c1473yt, String str, EnumC1163ot enumC1163ot, C1496zl c1496zl, EnumC1465yl enumC1465yl, String str2, String str3, String str4, Network network, C1403wl c1403wl, C1194pt c1194pt, Context context, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f8017k = c1473yt;
        this.f8018l = str;
        this.f8019m = enumC1163ot;
        this.f8020n = c1496zl;
        this.f8021o = enumC1465yl;
        this.f8022p = str2;
        this.f8023q = str3;
        this.f8024r = str4;
        this.f8025s = network;
        this.f8026t = c1403wl;
        this.f8027u = c1194pt;
        this.f8028v = context;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1349ut) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1349ut(this.f8017k, this.f8018l, this.f8019m, this.f8020n, this.f8021o, this.f8022p, this.f8023q, this.f8024r, this.f8025s, this.f8026t, this.f8027u, this.f8028v, interfaceC2313c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fa, code lost:
    
        if (r2 == r10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0152, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r15 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
    
        if (r8 == r10) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        String str;
        String str2;
        Object m1122A;
        String str3;
        boolean z7;
        int i7;
        Object m1122A2;
        boolean z8;
        String str4;
        Object m1130h;
        C1473yt c1473yt = this.f8017k;
        AtomicBoolean atomicBoolean = c1473yt.f9793b;
        C1701c0 c1701c0 = c1473yt.f9795d;
        int i8 = this.f8016j;
        C1403wl c1403wl = this.f8026t;
        EnumC1465yl enumC1465yl = EnumC1465yl.f9456f;
        EnumC1465yl enumC1465yl2 = this.f8021o;
        String str5 = this.f8018l;
        String str6 = this.f8022p;
        C1496zl c1496zl = this.f8020n;
        C1694m c1694m = C1694m.f10482a;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        AbstractC1793a0.m2972L(obj);
                        str4 = null;
                        z8 = false;
                        atomicBoolean.set(z8);
                        C1504zt m2438a = C1504zt.m2438a((C1504zt) c1701c0.getValue(), null, 0, null, null, null, 2046);
                        c1701c0.getClass();
                        c1701c0.m2752j(str4, m2438a);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str7 = this.f8015i;
                AbstractC1793a0.m2972L(obj);
                str3 = str7;
                str = null;
                m1122A2 = obj;
                i7 = 3;
                C1504zt c1504zt = (C1504zt) m1122A2;
                if (c1504zt != null) {
                    atomicBoolean.set(false);
                    C1504zt m2438a2 = C1504zt.m2438a(c1504zt, null, 0, null, null, null, 2046);
                    c1701c0.getClass();
                    c1701c0.m2752j(str, m2438a2);
                    return c1694m;
                }
                z7 = false;
                C1473yt.m2432c(c1473yt, "Deploy 服务不可用，回退本地 ICMP 追踪...");
                String str8 = str3;
                int i9 = c1496zl.f9917c;
                this.f8015i = str;
                this.f8016j = i7;
                z8 = z7;
                str4 = str;
                m1130h = AbstractC0525d0.m1130h(new C1442xt(str8, c1473yt, i9, this.f8027u, str5, this.f8025s, this.f8028v, c1403wl, null), this);
                if (m1130h != enumC2465a) {
                    m1130h = c1694m;
                }
                if (m1130h == enumC2465a) {
                    return enumC2465a;
                }
                atomicBoolean.set(z8);
                C1504zt m2438a3 = C1504zt.m2438a((C1504zt) c1701c0.getValue(), null, 0, null, null, null, 2046);
                c1701c0.getClass();
                c1701c0.m2752j(str4, m2438a3);
                return c1694m;
            }
            AbstractC1793a0.m2972L(obj);
            m1122A = obj;
            str = null;
        } else {
            AbstractC1793a0.m2972L(obj);
            int i10 = c1496zl.f9917c;
            String str9 = this.f8023q;
            if (enumC1465yl2 == enumC1465yl && !AbstractC0444k.m937a0(str6)) {
                str9 = str6;
            }
            str = null;
            C1504zt c1504zt2 = new C1504zt(str5, (String) null, this.f8019m, i10, 0, (List) null, (String) null, "正在解析目标...", enumC1465yl2, str9, 228);
            c1701c0.getClass();
            c1701c0.m2752j(null, c1504zt2);
            str2 = this.f8024r;
            if (str2 != null) {
                if (AbstractC0444k.m937a0(str2)) {
                    str2 = null;
                }
            }
            this.f8016j = 1;
            C2325e c2325e = AbstractC0549l0.f1898a;
            m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0940hm(str5, this.f8025s, null, 1), this);
        }
        str2 = (String) m1122A;
        String str10 = str2;
        C1504zt m2438a4 = C1504zt.m2438a((C1504zt) c1701c0.getValue(), str10, 0, null, null, null, 2043);
        str3 = str10;
        c1701c0.getClass();
        c1701c0.m2752j(str, m2438a4);
        if (enumC1465yl2 == enumC1465yl && !AbstractC0444k.m937a0(str6)) {
            C1473yt.m2432c(c1473yt, "正在连接 NTrace-core Deploy 服务...");
            C1009k c1009k = new C1009k(c1473yt, str3, str5, 10);
            C0310q c0310q = new C0310q(11, c1473yt);
            this.f8015i = str3;
            this.f8016j = 2;
            C2325e c2325e2 = AbstractC0549l0.f1898a;
            i7 = 3;
            m1122A2 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C1339uj(c1403wl, c0310q, c1496zl, c1009k, (InterfaceC2313c) null), this);
        } else {
            z7 = false;
            i7 = 3;
            String str82 = str3;
            int i92 = c1496zl.f9917c;
            this.f8015i = str;
            this.f8016j = i7;
            z8 = z7;
            str4 = str;
            m1130h = AbstractC0525d0.m1130h(new C1442xt(str82, c1473yt, i92, this.f8027u, str5, this.f8025s, this.f8028v, c1403wl, null), this);
            if (m1130h != enumC2465a) {
            }
            if (m1130h == enumC2465a) {
            }
            atomicBoolean.set(z8);
            C1504zt m2438a32 = C1504zt.m2438a((C1504zt) c1701c0.getValue(), null, 0, null, null, null, 2046);
            c1701c0.getClass();
            c1701c0.m2752j(str4, m2438a32);
            return c1694m;
        }
    }
}
