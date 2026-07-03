package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1951m4;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p066i3.AbstractC2067b;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p107o.C2769p1;
import p144t.AbstractC3136j;
import p144t.AbstractC3150q;
import p144t.C3130g;
import p144t.C3152r;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
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
/* renamed from: e5.mj */
/* loaded from: classes.dex */
public final class C1091mj implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ float f5939e;

    /* renamed from: f */
    public final /* synthetic */ C2769p1 f5940f;

    /* renamed from: g */
    public final /* synthetic */ C1227r0 f5941g;

    /* renamed from: h */
    public final /* synthetic */ boolean f5942h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f5943i;

    /* renamed from: j */
    public final /* synthetic */ C2349d1 f5944j;

    public C1091mj(float f7, C2769p1 c2769p1, C1227r0 c1227r0, boolean z7, InterfaceC2425y0 interfaceC2425y0, C2349d1 c2349d1) {
        this.f5939e = f7;
        this.f5940f = c2769p1;
        this.f5941g = c1227r0;
        this.f5942h = z7;
        this.f5943i = interfaceC2425y0;
        this.f5944j = c2349d1;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC2425y0 interfaceC2425y0;
        boolean z7;
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C3807o c3807o = C3807o.f17991a;
            InterfaceC3810r m3275C = AbstractC2067b.m3275C(AbstractC0155c.m349h(AbstractC0155c.m346e(c3807o, 1.0f), 0.0f, this.f5939e, 1), this.f5940f);
            C3130g m4843g = AbstractC3136j.m4843g(8);
            C1227r0 c1227r0 = this.f5941g;
            String str = c1227r0.f7198f;
            C3152r m4857a = AbstractC3150q.m4857a(m4843g, C3795c.f17976q, c2395p, 6);
            int m3975r = AbstractC2418w.m3975r(c2395p);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m3275C);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4857a, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(m3975r))) {
                AbstractC2487d.m4050n(m3975r, c2395p, m3975r, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            AbstractC1850a7.m3108b("当前版本：V5.0.1", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p, 0, 0, 131070);
            AbstractC1850a7.m3108b("发布版本：".concat(c1227r0.f7194b), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p, 0, 0, 131070);
            C2395p c2395p2 = c2395p;
            c2395p2.m3857Z(744982063);
            boolean z8 = this.f5942h;
            InterfaceC2425y0 interfaceC2425y02 = this.f5943i;
            if (z8 && !((Boolean) interfaceC2425y02.getValue()).booleanValue()) {
                interfaceC2425y0 = interfaceC2425y02;
                AbstractC1850a7.m3108b("已下载安装包，可直接安装或保存到本地；重新下载会先获取最新版本链接", null, ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11807a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p2, 6, 0, 65530);
                c2395p2 = c2395p2;
            } else {
                interfaceC2425y0 = interfaceC2425y02;
            }
            c2395p2.m3888r(false);
            c2395p2.m3857Z(744993482);
            if (!AbstractC0444k.m937a0(str)) {
                C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                C2395p c2395p3 = c2395p2;
                AbstractC1850a7.m3108b("更新内容", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(c2394o2)).f11257n, c2395p3, 6, 0, 65534);
                AbstractC1850a7.m3108b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p3.m3878k(c2394o2)).f11255l, c2395p3, 0, 0, 65534);
                c2395p2 = c2395p3;
                z7 = false;
            } else {
                z7 = false;
            }
            c2395p2.m3888r(z7);
            c2395p2.m3857Z(745007833);
            if (((Boolean) interfaceC2425y0.getValue()).booleanValue()) {
                c2395p2.m3857Z(745010947);
                Object m3847O = c2395p2.m3847O();
                C2413u0 c2413u0 = C2375k.f13421a;
                C2349d1 c2349d1 = this.f5944j;
                if (m3847O == c2413u0) {
                    m3847O = new C1267s9(c2349d1, 6);
                    c2395p2.m3877j0(m3847O);
                }
                c2395p2.m3888r(z7);
                AbstractC1951m4.m3142b((InterfaceC3277a) m3847O, AbstractC0155c.m346e(c3807o, 1.0f), 0L, 0L, 0, 0.0f, null, c2395p2, 54, 124);
                C2395p c2395p4 = c2395p2;
                AbstractC1850a7.m3108b(AbstractC0094y0.m184k(c2349d1.m3741g(), "正在下载：", "%"), null, ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p4, 0, 0, 65530);
                c2395p2 = c2395p4;
            }
            c2395p2.m3888r(z7);
            c2395p2.m3888r(true);
        }
        return C1694m.f10482a;
    }
}
