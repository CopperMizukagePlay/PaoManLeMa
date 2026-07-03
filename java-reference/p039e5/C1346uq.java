package p039e5;

import androidx.compose.foundation.AbstractC0145a;
import androidx.compose.foundation.layout.AbstractC0154b;
import androidx.compose.foundation.layout.AbstractC0155c;
import java.util.ArrayList;
import java.util.List;
import p001a0.AbstractC0094y0;
import p001a0.C0039j1;
import p017c.C0320e;
import p017c.C0321f;
import p050g2.C1604o0;
import p053g5.C1694m;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1987r0;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p085l0.AbstractC2418w;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3145n0;
import p144t.AbstractC3150q;
import p144t.C3147o0;
import p144t.C3149p0;
import p144t.C3152r;
import p144t.C3154s;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.uq */
/* loaded from: classes.dex */
public final class C1346uq implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f8000e;

    /* renamed from: f */
    public final /* synthetic */ int f8001f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList f8002g;

    /* renamed from: h */
    public final /* synthetic */ String f8003h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3279c f8004i;

    /* renamed from: j */
    public final /* synthetic */ boolean f8005j;

    /* renamed from: k */
    public final /* synthetic */ String f8006k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC3279c f8007l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC3279c f8008m;

    /* renamed from: n */
    public final /* synthetic */ List f8009n;

    public C1346uq(int i7, int i8, ArrayList arrayList, String str, InterfaceC3279c interfaceC3279c, boolean z7, String str2, InterfaceC3279c interfaceC3279c2, InterfaceC3279c interfaceC3279c3, List list) {
        this.f8000e = i7;
        this.f8001f = i8;
        this.f8002g = arrayList;
        this.f8003h = str;
        this.f8004i = interfaceC3279c;
        this.f8005j = z7;
        this.f8006k = str2;
        this.f8007l = interfaceC3279c2;
        this.f8008m = interfaceC3279c3;
        this.f8009n = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0269, code lost:
    
        if (p158u5.AbstractC3367j.m5096a(r7.m3847O(), java.lang.Integer.valueOf(r5)) == false) goto L36;
     */
    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        C3504h c3504h;
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3367j.m5100e((C3154s) obj, "$this$SpeedSettingSwitchCollapsibleSection");
        if ((intValue & 17) == 16 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            String m183j = AbstractC0094y0.m183j(this.f8000e, this.f8001f, "推进 URL 池：下载 ", " 条 / 上传 ", " 条");
            C2394o2 c2394o2 = AbstractC1913h7.f11292a;
            C1604o0 c1604o0 = ((C1904g7) c2395p.m3878k(c2394o2)).f11255l;
            C2394o2 c2394o22 = AbstractC2019v0.f11943a;
            AbstractC1850a7.m3108b(m183j, null, ((C2003t0) c2395p.m3878k(c2394o22)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, c1604o0, c2395p, 0, 0, 65530);
            C3807o c3807o = C3807o.f17991a;
            InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, 1.0f);
            float f7 = 8;
            C3147o0 m4854a = AbstractC3145n0.m4854a(AbstractC3136j.m4843g(f7), C3795c.f17973n, c2395p, 6);
            int m3975r = AbstractC2418w.m3975r(c2395p);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m346e);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4854a, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h2 = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
                AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h2);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            C3149p0 c3149p0 = C3149p0.f15825a;
            InterfaceC3810r m4856a = c3149p0.m4856a(c3807o, 1.0f, true);
            C0039j1 c0039j1 = new C0039j1(123);
            C3173d c3173d = AbstractC1352v1.f8074i;
            C3173d c3173d2 = AbstractC1352v1.f8076j;
            String str = this.f8003h;
            InterfaceC3279c interfaceC3279c = this.f8004i;
            boolean z7 = this.f8005j;
            C3807o c3807o2 = c3807o;
            AbstractC1847a4.m3102a(str, interfaceC3279c, m4856a, z7, false, null, c3173d, null, null, null, c3173d2, null, c0039j1, null, true, 0, 0, null, null, c2395p, 1572864, 12779904, 8220592);
            C1346uq c1346uq = this;
            int i7 = 1;
            C3149p0 c3149p02 = c3149p0;
            AbstractC1847a4.m3102a(this.f8006k, this.f8007l, c3149p0.m4856a(c3807o2, 1.0f, true), z7, false, null, AbstractC1352v1.f8077k, null, null, null, AbstractC1352v1.f8078l, null, new C0039j1(123), null, true, 0, 0, null, null, c2395p, 1572864, 12779904, 8220592);
            C2395p c2395p2 = c2395p;
            c2395p2.m3888r(true);
            ArrayList arrayList = c1346uq.f8002g;
            int i8 = 0;
            if (arrayList.isEmpty()) {
                c2395p2.m3857Z(1346859570);
                AbstractC1850a7.m3108b("暂无其它测速配置，可先在“配置”页导入或新建。", null, ((C2003t0) c2395p2.m3878k(c2394o22)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(c2394o2)).f11255l, c2395p2, 6, 0, 65530);
                c2395p2.m3888r(false);
            } else {
                boolean z8 = false;
                c2395p2.m3857Z(1347174623);
                int size = arrayList.size();
                while (i8 < size) {
                    int i9 = i8 + 1;
                    C0782cn c0782cn = (C0782cn) arrayList.get(i8);
                    C3807o c3807o3 = c3807o2;
                    InterfaceC3810r m346e2 = AbstractC0155c.m346e(c3807o3, 1.0f);
                    c2395p2.m3857Z(1388733450);
                    InterfaceC3279c interfaceC3279c2 = c1346uq.f8008m;
                    boolean m3870g = c2395p2.m3870g(interfaceC3279c2) | c2395p2.m3870g(c0782cn);
                    Object m3847O = c2395p2.m3847O();
                    Object obj4 = C2375k.f13421a;
                    if (m3870g || m3847O == obj4) {
                        m3847O = new C0320e(25, interfaceC3279c2, c0782cn);
                        c2395p2.m3877j0(m3847O);
                    }
                    c2395p2.m3888r(z8);
                    boolean z9 = c1346uq.f8005j;
                    InterfaceC3810r m339j = AbstractC0154b.m339j(AbstractC0145a.m322e(6, null, (InterfaceC3277a) m3847O, m346e2, z9), 0.0f, 4, i7);
                    C3147o0 m4854a2 = AbstractC3145n0.m4854a(AbstractC3136j.m4843g(f7), C3795c.f17974o, c2395p2, 54);
                    int m3975r2 = AbstractC2418w.m3975r(c2395p2);
                    InterfaceC2385m1 m3882m2 = c2395p2.m3882m();
                    InterfaceC3810r m5823c2 = AbstractC3793a.m5823c(c2395p2, m339j);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z2 = C3507i.f16928b;
                    c2395p2.m3863c0();
                    if (c2395p2.f13485S) {
                        c2395p2.m3880l(c3558z2);
                    } else {
                        c2395p2.m3883m0();
                    }
                    C3504h c3504h3 = C3507i.f16931e;
                    AbstractC2418w.m3954C(m4854a2, c2395p2, c3504h3);
                    C3504h c3504h4 = C3507i.f16930d;
                    AbstractC2418w.m3954C(m3882m2, c2395p2, c3504h4);
                    C3504h c3504h5 = C3507i.f16932f;
                    if (!c2395p2.f13485S) {
                        c3504h = c3504h4;
                    } else {
                        c3504h = c3504h4;
                    }
                    AbstractC2487d.m4050n(m3975r2, c2395p2, m3975r2, c3504h5);
                    C3504h c3504h6 = C3507i.f16929c;
                    AbstractC2418w.m3954C(m5823c2, c2395p2, c3504h6);
                    boolean contains = c1346uq.f8009n.contains(Integer.valueOf(c0782cn.f3168a));
                    c2395p2.m3857Z(1477849673);
                    boolean m3870g2 = c2395p2.m3870g(interfaceC3279c2) | c2395p2.m3870g(c0782cn);
                    Object m3847O2 = c2395p2.m3847O();
                    if (m3870g2 || m3847O2 == obj4) {
                        m3847O2 = new C0321f(14, interfaceC3279c2, c0782cn);
                        c2395p2.m3877j0(m3847O2);
                    }
                    c2395p2.m3888r(false);
                    C3504h c3504h7 = c3504h;
                    int i10 = size;
                    ArrayList arrayList2 = arrayList;
                    AbstractC1987r0.m3156a(contains, (InterfaceC3279c) m3847O2, null, z9, null, c2395p2, 0, 52);
                    C3149p0 c3149p03 = c3149p02;
                    InterfaceC3810r m4856a2 = c3149p03.m4856a(c3807o3, 1.0f, true);
                    C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.f15791c, C3795c.f17976q, c2395p2, 0);
                    int m3975r3 = AbstractC2418w.m3975r(c2395p2);
                    InterfaceC2385m1 m3882m3 = c2395p2.m3882m();
                    InterfaceC3810r m5823c3 = AbstractC3793a.m5823c(c2395p2, m4856a2);
                    c2395p2.m3863c0();
                    if (c2395p2.f13485S) {
                        c2395p2.m3880l(c3558z2);
                    } else {
                        c2395p2.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4857a, c2395p2, c3504h3);
                    AbstractC2418w.m3954C(m3882m3, c2395p2, c3504h7);
                    if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(m3975r3))) {
                        AbstractC2487d.m4050n(m3975r3, c2395p2, m3975r3, c3504h5);
                    }
                    AbstractC2418w.m3954C(m5823c3, c2395p2, c3504h6);
                    String str2 = c0782cn.f3169b;
                    C2394o2 c2394o23 = AbstractC1913h7.f11292a;
                    C2395p c2395p3 = c2395p2;
                    c3807o2 = c3807o3;
                    AbstractC1850a7.m3108b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((C1904g7) c2395p2.m3878k(c2394o23)).f11254k, c2395p3, 0, 3120, 55294);
                    AbstractC1850a7.m3108b(AbstractC0094y0.m182i(c0782cn.f3170c, c0782cn.f3171d, "下载 ", " / 上传 "), null, ((C2003t0) c2395p3.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p3.m3878k(c2394o23)).f11258o, c2395p3, 0, 0, 65530);
                    c2395p2 = c2395p3;
                    i7 = 1;
                    c2395p2.m3888r(true);
                    c2395p2.m3888r(true);
                    c1346uq = this;
                    size = i10;
                    i8 = i9;
                    arrayList = arrayList2;
                    c3149p02 = c3149p03;
                    z8 = false;
                }
                c2395p2.m3888r(z8);
            }
        }
        return C1694m.f10482a;
    }
}
