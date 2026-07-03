package p039e5;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0155c;
import java.util.List;
import p053g5.C1694m;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1850a7;
import p063i0.AbstractC1913h7;
import p063i0.AbstractC1991r4;
import p063i0.AbstractC2019v0;
import p063i0.AbstractC2050z;
import p063i0.C1904g7;
import p063i0.C2003t0;
import p085l0.C2375k;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.l7 */
/* loaded from: classes.dex */
public final class C1048l7 implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f5444e = 1;

    /* renamed from: f */
    public final /* synthetic */ boolean f5445f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f5446g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3279c f5447h;

    /* renamed from: i */
    public final /* synthetic */ Object f5448i;

    /* renamed from: j */
    public final /* synthetic */ Object f5449j;

    public C1048l7(C0703a8 c0703a8, Context context, boolean z7, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2) {
        this.f5448i = c0703a8;
        this.f5449j = context;
        this.f5445f = z7;
        this.f5446g = interfaceC3279c;
        this.f5447h = interfaceC3279c2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7 = this.f5444e;
        Object obj3 = C2375k.f13421a;
        InterfaceC3279c interfaceC3279c = this.f5447h;
        InterfaceC3279c interfaceC3279c2 = this.f5446g;
        C1694m c1694m = C1694m.f10482a;
        Object obj4 = this.f5449j;
        Object obj5 = this.f5448i;
        switch (i7) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C3807o c3807o = C3807o.f17991a;
                    InterfaceC3810r m346e = AbstractC0155c.m346e(c3807o, 1.0f);
                    C2394o2 c2394o2 = AbstractC1913h7.f11292a;
                    AbstractC1847a4.m3102a((String) obj5, this.f5446g, m346e, this.f5445f, false, ((C1904g7) c2395p.m3878k(c2394o2)).f11255l, AbstractC0792d1.f3269i0, AbstractC0792d1.f3271j0, null, null, null, null, null, null, true, 0, 0, null, null, c2395p, 14156160, 12582912, 8257296);
                    AbstractC1847a4.m3102a((String) obj4, this.f5447h, AbstractC0155c.m346e(c3807o, 1.0f), this.f5445f, false, ((C1904g7) c2395p.m3878k(c2394o2)).f11255l, AbstractC0792d1.f3273k0, AbstractC0792d1.f3275l0, null, null, null, null, null, null, true, 0, 0, null, null, c2395p, 14156160, 12582912, 8257296);
                    AbstractC1850a7.m3108b("公共 LeoMoeAPI：本地追踪，API 仅用于 Geo 与路由地图", null, ((C2003t0) c2395p.m3878k(AbstractC2019v0.f11943a)).f11825s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((C1904g7) c2395p.m3878k(c2394o2)).f11258o, c2395p, 6, 0, 65530);
                }
                return c1694m;
            case 1:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    C0703a8 c0703a8 = (C0703a8) obj5;
                    Context context = (Context) obj4;
                    for (C0877fn c0877fn : c0703a8.f2338e) {
                        String str = (String) c0703a8.f2341h.get(c0877fn.f4045a);
                        boolean z7 = c0703a8.f2342i;
                        c2395p2.m3857Z(-2032829124);
                        boolean m3870g = c2395p2.m3870g(interfaceC3279c2) | c2395p2.m3870g(c0877fn);
                        Object m3847O = c2395p2.m3847O();
                        if (m3870g || m3847O == obj3) {
                            m3847O = new C1142o8(interfaceC3279c2, c0877fn, 2);
                            c2395p2.m3877j0(m3847O);
                        }
                        InterfaceC3277a interfaceC3277a = (InterfaceC3277a) m3847O;
                        c2395p2.m3888r(false);
                        c2395p2.m3857Z(-2032826691);
                        boolean m3870g2 = c2395p2.m3870g(interfaceC3279c) | c2395p2.m3870g(c0877fn);
                        Object m3847O2 = c2395p2.m3847O();
                        if (m3870g2 || m3847O2 == obj3) {
                            m3847O2 = new C1142o8(interfaceC3279c, c0877fn, 3);
                            c2395p2.m3877j0(m3847O2);
                        }
                        c2395p2.m3888r(false);
                        AbstractC1328u8.m2356a(context, c0877fn, str, z7, this.f5445f, interfaceC3277a, (InterfaceC3277a) m3847O2, c2395p2, 0);
                    }
                }
                return c1694m;
            default:
                final List list = (List) obj5;
                C2395p c2395p3 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p3.m3836D()) {
                    c2395p3.m3852U();
                } else {
                    c2395p3.m3857Z(-173130043);
                    boolean m3870g3 = c2395p3.m3870g(interfaceC3279c) | c2395p3.m3870g(interfaceC3279c2) | c2395p3.m3874i(list) | c2395p3.m3872h(this.f5445f);
                    final InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj4;
                    Object m3847O3 = c2395p3.m3847O();
                    if (m3870g3 || m3847O3 == obj3) {
                        final InterfaceC3279c interfaceC3279c3 = this.f5446g;
                        final boolean z8 = this.f5445f;
                        final InterfaceC3279c interfaceC3279c4 = this.f5447h;
                        Object obj6 = new InterfaceC3277a() { // from class: e5.gh
                            @Override // p150t5.InterfaceC3277a
                            /* renamed from: a */
                            public final Object mo52a() {
                                InterfaceC3279c.this.mo23f(list);
                                float f7 = AbstractC1092mk.f5952h;
                                interfaceC2425y0.setValue(null);
                                if (z8) {
                                    interfaceC3279c4.mo23f(Boolean.FALSE);
                                }
                                return C1694m.f10482a;
                            }
                        };
                        c2395p3.m3877j0(obj6);
                        m3847O3 = obj6;
                    }
                    c2395p3.m3888r(false);
                    C3137j0 c3137j0 = AbstractC2050z.f12193a;
                    AbstractC1991r4.m3161b((InterfaceC3277a) m3847O3, null, false, null, AbstractC2050z.m3214a(((C2003t0) c2395p3.m3878k(AbstractC2019v0.f11943a)).f11829w, 0L, c2395p3, 14), null, null, null, AbstractC1228r1.f7215K, c2395p3, 805306368, 494);
                }
                return c1694m;
        }
    }

    public C1048l7(String str, InterfaceC3279c interfaceC3279c, boolean z7, String str2, InterfaceC3279c interfaceC3279c2) {
        this.f5448i = str;
        this.f5446g = interfaceC3279c;
        this.f5445f = z7;
        this.f5449j = str2;
        this.f5447h = interfaceC3279c2;
    }

    public C1048l7(InterfaceC3279c interfaceC3279c, List list, boolean z7, InterfaceC3279c interfaceC3279c2, InterfaceC2425y0 interfaceC2425y0) {
        this.f5446g = interfaceC3279c;
        this.f5448i = list;
        this.f5445f = z7;
        this.f5447h = interfaceC3279c2;
        this.f5449j = interfaceC2425y0;
    }
}
