package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import java.util.List;
import p050g2.C1604o0;
import p053g5.C1694m;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1913h7;
import p063i0.C1904g7;
import p063i0.C2036x1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2425y0;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.v5 */
/* loaded from: classes.dex */
public final class C1356v5 implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ InterfaceC3279c f8111e;

    /* renamed from: f */
    public final /* synthetic */ Object f8112f;

    /* renamed from: g */
    public final /* synthetic */ boolean f8113g;

    /* renamed from: h */
    public final /* synthetic */ String f8114h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f8115i;

    /* renamed from: j */
    public final /* synthetic */ List f8116j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3279c f8117k;

    public C1356v5(InterfaceC3279c interfaceC3279c, Object obj, boolean z7, String str, InterfaceC2425y0 interfaceC2425y0, List list, InterfaceC3279c interfaceC3279c2) {
        this.f8111e = interfaceC3279c;
        this.f8112f = obj;
        this.f8113g = z7;
        this.f8114h = str;
        this.f8115i = interfaceC2425y0;
        this.f8116j = list;
        this.f8117k = interfaceC3279c2;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        InterfaceC2425y0 interfaceC2425y0;
        boolean m3874i;
        int i7;
        C2036x1 c2036x1 = (C2036x1) obj;
        C2395p c2395p = (C2395p) obj2;
        int intValue = ((Number) obj3).intValue();
        AbstractC3367j.m5100e(c2036x1, "$this$ExposedDropdownMenuBox");
        if ((intValue & 6) == 0) {
            if ((intValue & 8) == 0) {
                m3874i = c2395p.m3870g(c2036x1);
            } else {
                m3874i = c2395p.m3874i(c2036x1);
            }
            if (m3874i) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            intValue |= i7;
        }
        int i8 = intValue;
        if ((i8 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            Object obj4 = this.f8112f;
            InterfaceC3279c interfaceC3279c = this.f8111e;
            String str = (String) interfaceC3279c.mo23f(obj4);
            C1604o0 c1604o0 = ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11255l;
            InterfaceC3810r m346e = AbstractC0155c.m346e(c2036x1.m3205b(), 1.0f);
            c2395p.m3857Z(-742351226);
            Object m3847O = c2395p.m3847O();
            C2413u0 c2413u0 = C2375k.f13421a;
            if (m3847O == c2413u0) {
                m3847O = new C1263s5(0);
                c2395p.m3877j0(m3847O);
            }
            c2395p.m3888r(false);
            C3173d m4873d = AbstractC3178i.m4873d(-1784462457, new C1294t5(this.f8114h, 0), c2395p);
            InterfaceC2425y0 interfaceC2425y02 = this.f8115i;
            AbstractC1847a4.m3102a(str, (InterfaceC3279c) m3847O, m346e, this.f8113g, true, c1604o0, m4873d, null, null, AbstractC3178i.m4873d(-447850524, new C1200q4(interfaceC2425y02, 2), c2395p), null, null, null, null, true, 0, 0, null, null, c2395p, 806903856, 12582912, 8256896);
            boolean booleanValue = ((Boolean) interfaceC2425y02.getValue()).booleanValue();
            c2395p.m3857Z(-742334312);
            Object m3847O2 = c2395p.m3847O();
            if (m3847O2 == c2413u0) {
                interfaceC2425y0 = interfaceC2425y02;
                m3847O2 = new C1353v2(interfaceC2425y0, 14);
                c2395p.m3877j0(m3847O2);
            } else {
                interfaceC2425y0 = interfaceC2425y02;
            }
            c2395p.m3888r(false);
            c2036x1.m3204a(booleanValue, m3847O2, null, null, false, null, 0L, 0.0f, 0.0f, AbstractC3178i.m4873d(-109934549, new C1325u5(this.f8116j, this.f8117k, interfaceC3279c, interfaceC2425y0, 0), c2395p), c2395p, 48, 6 | ((i8 << 3) & 112));
        }
        return C1694m.f10482a;
    }
}
