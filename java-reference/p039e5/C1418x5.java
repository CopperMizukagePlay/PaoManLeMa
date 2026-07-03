package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p053g5.C1694m;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC2019v0;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p066i3.AbstractC2067b;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p144t.AbstractC3136j;
import p144t.AbstractC3150q;
import p144t.C3152r;
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
/* renamed from: e5.x5 */
/* loaded from: classes.dex */
public final class C1418x5 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f8603e;

    /* renamed from: f */
    public final /* synthetic */ List f8604f;

    public /* synthetic */ C1418x5(int i7, List list) {
        this.f8603e = i7;
        this.f8604f = list;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2395p c2395p;
        String str;
        switch (this.f8603e) {
            case 0:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    InterfaceC3810r m3275C = AbstractC2067b.m3275C(AbstractC0155c.m349h(C3807o.f17991a, 0.0f, 460, 1), AbstractC2067b.m3297v(c2395p2));
                    C3152r m4857a = AbstractC3150q.m4857a(AbstractC3136j.m4843g(6), C3795c.f17976q, c2395p2, 6);
                    int m3975r = AbstractC2418w.m3975r(c2395p2);
                    InterfaceC2385m1 m3882m = c2395p2.m3882m();
                    InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p2, m3275C);
                    InterfaceC3510j.f16935d.getClass();
                    C3558z c3558z = C3507i.f16928b;
                    c2395p2.m3863c0();
                    if (c2395p2.f13485S) {
                        c2395p2.m3880l(c3558z);
                    } else {
                        c2395p2.m3883m0();
                    }
                    AbstractC2418w.m3954C(m4857a, c2395p2, C3507i.f16931e);
                    AbstractC2418w.m3954C(m3882m, c2395p2, C3507i.f16930d);
                    C3504h c3504h = C3507i.f16932f;
                    if (c2395p2.f13485S || !AbstractC3367j.m5096a(c2395p2.m3847O(), Integer.valueOf(m3975r))) {
                        AbstractC2487d.m4050n(m3975r, c2395p2, m3975r, c3504h);
                    }
                    AbstractC2418w.m3954C(m5823c, c2395p2, C3507i.f16929c);
                    List<C1464yk> list = this.f8604f;
                    if (list.isEmpty()) {
                        c2395p2.m3857Z(-580798392);
                        AbstractC1850a7.m3108b("暂无探测日志", null, ((C2003t0) c2395p2.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p2.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p2, 6, 0, 65530);
                        c2395p = c2395p2;
                        c2395p.m3888r(false);
                    } else {
                        c2395p = c2395p2;
                        c2395p.m3857Z(-580538984);
                        for (C1464yk c1464yk : list) {
                            String format = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(c1464yk.f9453a));
                            AbstractC3367j.m5099d(format, "format(...)");
                            C2395p c2395p3 = c2395p;
                            AbstractC1850a7.m3108b(AbstractC2487d.m4044h(format, "  ", c1464yk.f9454b), null, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11255l, c2395p3, 0, 0, 65530);
                            c2395p = c2395p3;
                        }
                        c2395p.m3888r(false);
                    }
                    c2395p.m3888r(true);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p4 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p4.m3836D()) {
                    c2395p4.m3852U();
                } else {
                    if (this.f8604f.size() == 1) {
                        str = "删除配置";
                    } else {
                        str = "删除所选配置";
                    }
                    AbstractC1850a7.m3108b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, c2395p4, 0, 0, 131070);
                }
                return C1694m.f10482a;
        }
    }
}
