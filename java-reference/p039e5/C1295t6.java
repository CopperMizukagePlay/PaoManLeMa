package p039e5;

import android.content.Context;
import p019c1.C0363g;
import p053g5.C1694m;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p144t.C3149p0;
import p144t.C3154s;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3365h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.t6 */
/* loaded from: classes.dex */
public final class C1295t6 implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f7755e = 0;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f7756f;

    /* renamed from: g */
    public final /* synthetic */ Context f7757g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f7758h;

    /* renamed from: i */
    public final /* synthetic */ Object f7759i;

    /* renamed from: j */
    public final /* synthetic */ Object f7760j;

    public C1295t6(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04) {
        this.f7757g = context;
        this.f7756f = interfaceC2425y0;
        this.f7758h = interfaceC2425y02;
        this.f7759i = interfaceC2425y03;
        this.f7760j = interfaceC2425y04;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        int i7 = this.f7755e;
        C1694m c1694m = C1694m.f10482a;
        Object obj4 = this.f7759i;
        int i8 = 2;
        InterfaceC2425y0 interfaceC2425y0 = this.f7756f;
        C2413u0 c2413u0 = C2375k.f13421a;
        Context context = this.f7757g;
        Object obj5 = this.f7760j;
        InterfaceC2425y0 interfaceC2425y02 = this.f7758h;
        switch (i7) {
            case 0:
                C3149p0 c3149p0 = (C3149p0) obj;
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) obj4;
                AbstractC3367j.m5100e(c3149p0, "$this$DiagnosticsCollapsibleSection");
                if ((intValue & 6) == 0) {
                    if (c2395p.m3870g(c3149p0)) {
                        i8 = 4;
                    }
                    intValue |= i8;
                }
                if ((intValue & 19) == 18 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                    EnumC0844em enumC0844em = (EnumC0844em) interfaceC2425y02.getValue();
                    String str = (String) interfaceC2425y03.getValue();
                    c2395p.m3857Z(-1243603247);
                    boolean m3874i = c2395p.m3874i(context);
                    Object m3847O = c2395p.m3847O();
                    if (m3874i || m3847O == c2413u0) {
                        m3847O = new C1385w3(context, interfaceC2425y02, 10);
                        c2395p.m3877j0(m3847O);
                    }
                    InterfaceC3279c interfaceC3279c = (InterfaceC3279c) m3847O;
                    c2395p.m3888r(false);
                    c2395p.m3857Z(-1243596820);
                    boolean m3870g = c2395p.m3870g(interfaceC2425y0);
                    InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) obj5;
                    Object m3847O2 = c2395p.m3847O();
                    if (m3870g || m3847O2 == c2413u0) {
                        m3847O2 = new C1264s6(interfaceC2425y03, interfaceC2425y0, interfaceC2425y04, 0);
                        c2395p.m3877j0(m3847O2);
                    }
                    c2395p.m3888r(false);
                    AbstractC1172p7.m2024A(c3149p0, enumC0844em, str, interfaceC3279c, (InterfaceC3277a) m3847O2, c2395p, intValue & 14);
                }
                return c1694m;
            default:
                C3154s c3154s = (C3154s) obj;
                C2395p c2395p2 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                C1270sc c1270sc = (C1270sc) obj5;
                AbstractC3367j.m5100e(c3154s, "$this$Iperf3Section");
                if ((intValue2 & 6) == 0) {
                    if (c2395p2.m3870g(c3154s)) {
                        i8 = 4;
                    }
                    intValue2 |= i8;
                }
                if ((intValue2 & 19) == 18 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    C1394wc c1394wc = (C1394wc) obj4;
                    C3137j0 c3137j02 = AbstractC1302td.f7786a;
                    String str2 = (String) interfaceC2425y0.getValue();
                    c2395p2.m3857Z(-1114038658);
                    boolean m3870g2 = c2395p2.m3870g(interfaceC2425y0) | c2395p2.m3874i(context);
                    Object m3847O3 = c2395p2.m3847O();
                    if (m3870g2 || m3847O3 == c2413u0) {
                        m3847O3 = new C0708ad(context, interfaceC2425y0, 1);
                        c2395p2.m3877j0(m3847O3);
                    }
                    InterfaceC3279c interfaceC3279c2 = (InterfaceC3279c) m3847O3;
                    c2395p2.m3888r(false);
                    c2395p2.m3857Z(-1114031398);
                    boolean m3874i2 = c2395p2.m3874i(c1270sc) | c2395p2.m3870g(interfaceC2425y0) | c2395p2.m3870g(interfaceC2425y02);
                    Object m3847O4 = c2395p2.m3847O();
                    if (m3874i2 || m3847O4 == c2413u0) {
                        m3847O4 = new C1384w2((Object) c1270sc, interfaceC2425y0, interfaceC2425y02, 12);
                        c2395p2.m3877j0(m3847O4);
                    }
                    InterfaceC3277a interfaceC3277a = (InterfaceC3277a) m3847O4;
                    c2395p2.m3888r(false);
                    c2395p2.m3857Z(-1114020625);
                    boolean m3874i3 = c2395p2.m3874i(c1270sc);
                    Object m3847O5 = c2395p2.m3847O();
                    if (m3874i3 || m3847O5 == c2413u0) {
                        C0363g c0363g = new C0363g(0, c1270sc, C1270sc.class, "stop", "stop()V", 0, 0, 6);
                        c2395p2.m3877j0(c0363g);
                        m3847O5 = c0363g;
                    }
                    c2395p2.m3888r(false);
                    AbstractC1302td.m2345l(c3154s, c1394wc, str2, interfaceC3279c2, interfaceC3277a, (InterfaceC3277a) ((AbstractC3365h) m3847O5), c2395p2, intValue2 & 14);
                }
                return c1694m;
        }
    }

    public C1295t6(C1394wc c1394wc, InterfaceC2425y0 interfaceC2425y0, Context context, C1270sc c1270sc, InterfaceC2425y0 interfaceC2425y02) {
        this.f7759i = c1394wc;
        this.f7756f = interfaceC2425y0;
        this.f7757g = context;
        this.f7760j = c1270sc;
        this.f7758h = interfaceC2425y02;
    }
}
