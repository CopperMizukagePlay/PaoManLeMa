package p034e0;

import androidx.compose.p007ui.draw.AbstractC0166a;
import p053g5.C1694m;
import p063i0.C1893f5;
import p063i0.C1936k5;
import p063i0.C2016u5;
import p085l0.C2375k;
import p085l0.C2395p;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.j */
/* loaded from: classes.dex */
public final class C0611j extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ int f2010f = 1;

    /* renamed from: g */
    public final /* synthetic */ boolean f2011g;

    /* renamed from: h */
    public final /* synthetic */ Object f2012h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0611j(C1893f5 c1893f5, boolean z7) {
        super(3);
        this.f2011g = z7;
        this.f2012h = c1893f5;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        switch (this.f2010f) {
            case 0:
                InterfaceC3810r interfaceC3810r = (InterfaceC3810r) obj;
                C2395p c2395p = (C2395p) obj2;
                ((Number) obj3).intValue();
                c2395p.m3857Z(-196777734);
                long j6 = ((C0636v0) c2395p.m3878k(AbstractC0638w0.f2110a)).f2103a;
                boolean m3868f = c2395p.m3868f(j6);
                InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f2012h;
                boolean m3870g = m3868f | c2395p.m3870g(interfaceC3277a);
                boolean z7 = this.f2011g;
                boolean m3872h = m3870g | c2395p.m3872h(z7);
                Object m3847O = c2395p.m3847O();
                if (m3872h || m3847O == C2375k.f13421a) {
                    m3847O = new C0609i(j6, interfaceC3277a, z7);
                    c2395p.m3877j0(m3847O);
                }
                InterfaceC3810r m379b = AbstractC0166a.m379b(interfaceC3810r, (InterfaceC3279c) m3847O);
                c2395p.m3888r(false);
                return m379b;
            default:
                int intValue = ((Number) obj3).intValue();
                boolean z8 = this.f2011g;
                C1936k5.f11432a.m3137b((C2016u5) obj, null, z8, (C1893f5) this.f2012h, null, null, 0.0f, 0.0f, (C2395p) obj2, (intValue & 14) | 100663296);
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0611j(InterfaceC3277a interfaceC3277a, boolean z7) {
        super(3);
        this.f2012h = interfaceC3277a;
        this.f2011g = z7;
    }
}
