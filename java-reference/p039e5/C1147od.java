package p039e5;

import androidx.compose.foundation.layout.AbstractC0155c;
import java.util.List;
import p001a0.C0039j1;
import p050g2.C1604o0;
import p053g5.C1694m;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1913h7;
import p063i0.C1904g7;
import p063i0.C2036x1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.od */
/* loaded from: classes.dex */
public final class C1147od implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ String f6537e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f6538f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f6539g;

    /* renamed from: h */
    public final /* synthetic */ int f6540h;

    /* renamed from: i */
    public final /* synthetic */ boolean f6541i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2425y0 f6542j;

    /* renamed from: k */
    public final /* synthetic */ List f6543k;

    public C1147od(String str, InterfaceC2425y0 interfaceC2425y0, InterfaceC3279c interfaceC3279c, int i7, boolean z7, InterfaceC2425y0 interfaceC2425y02, List list) {
        this.f6537e = str;
        this.f6538f = interfaceC2425y0;
        this.f6539g = interfaceC3279c;
        this.f6540h = i7;
        this.f6541i = z7;
        this.f6542j = interfaceC2425y02;
        this.f6543k = list;
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
            InterfaceC2425y0 interfaceC2425y02 = this.f6538f;
            boolean z7 = !((Boolean) interfaceC2425y02.getValue()).booleanValue();
            C1604o0 c1604o0 = ((C1904g7) c2395p.m3878k(AbstractC1913h7.f11292a)).f11255l;
            C0039j1 c0039j1 = new C0039j1(123);
            InterfaceC3810r m346e = AbstractC0155c.m346e(c2036x1.m3205b(), 1.0f);
            c2395p.m3857Z(-1076082140);
            boolean m3870g = c2395p.m3870g(interfaceC2425y02);
            InterfaceC3279c interfaceC3279c = this.f6539g;
            boolean m3870g2 = m3870g | c2395p.m3870g(interfaceC3279c);
            int i9 = this.f6540h;
            boolean m3866e = m3870g2 | c2395p.m3866e(i9);
            Object m3847O = c2395p.m3847O();
            Object obj4 = C2375k.f13421a;
            if (m3866e || m3847O == obj4) {
                m3847O = new C1381w(i9, 2, interfaceC3279c, interfaceC2425y02);
                c2395p.m3877j0(m3847O);
            }
            InterfaceC3279c interfaceC3279c2 = (InterfaceC3279c) m3847O;
            c2395p.m3888r(false);
            C3173d c3173d = AbstractC1042l1.f5364h;
            InterfaceC2425y0 interfaceC2425y03 = this.f6542j;
            AbstractC1847a4.m3102a(this.f6537e, interfaceC3279c2, m346e, this.f6541i, z7, c1604o0, null, c3173d, null, AbstractC3178i.m4873d(-281541893, new C1200q4(interfaceC2425y03, 14), c2395p), null, null, c0039j1, null, true, 0, 0, null, null, c2395p, 817889280, 12779520, 8224064);
            boolean booleanValue = ((Boolean) interfaceC2425y03.getValue()).booleanValue();
            c2395p.m3857Z(-1076053876);
            Object m3847O2 = c2395p.m3847O();
            if (m3847O2 == obj4) {
                interfaceC2425y0 = interfaceC2425y03;
                m3847O2 = new C0705aa(interfaceC2425y0, 18);
                c2395p.m3877j0(m3847O2);
            } else {
                interfaceC2425y0 = interfaceC2425y03;
            }
            c2395p.m3888r(false);
            c2036x1.m3204a(booleanValue, (InterfaceC3277a) m3847O2, null, null, false, null, 0L, 0.0f, 0.0f, AbstractC3178i.m4873d(-599223404, new C1325u5(this.f6543k, interfaceC2425y02, interfaceC3279c, interfaceC2425y0), c2395p), c2395p, 48, 6 | ((i8 << 3) & 112));
        }
        return C1694m.f10482a;
    }
}
