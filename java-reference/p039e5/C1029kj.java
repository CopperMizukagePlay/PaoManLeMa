package p039e5;

import android.content.Context;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p063i0.AbstractC1991r4;
import p085l0.C2349d1;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.kj */
/* loaded from: classes.dex */
public final class C1029kj implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ boolean f5294e;

    /* renamed from: f */
    public final /* synthetic */ Context f5295f;

    /* renamed from: g */
    public final /* synthetic */ C1227r0 f5296g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC0516a0 f5297h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f5298i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2425y0 f5299j;

    /* renamed from: k */
    public final /* synthetic */ C2349d1 f5300k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2425y0 f5301l;

    public C1029kj(boolean z7, Context context, C1227r0 c1227r0, InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y03) {
        this.f5294e = z7;
        this.f5295f = context;
        this.f5296g = c1227r0;
        this.f5297h = interfaceC0516a0;
        this.f5298i = interfaceC2425y0;
        this.f5299j = interfaceC2425y02;
        this.f5300k = c2349d1;
        this.f5301l = interfaceC2425y03;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            boolean z7 = this.f5294e;
            Object obj3 = C2375k.f13421a;
            Context context = this.f5295f;
            InterfaceC2425y0 interfaceC2425y0 = this.f5298i;
            if (z7 && !((Boolean) interfaceC2425y0.getValue()).booleanValue()) {
                c2395p.m3857Z(-1849327131);
                c2395p.m3857Z(-1168033242);
                boolean m3874i = c2395p.m3874i(context);
                C1227r0 c1227r0 = this.f5296g;
                boolean m3870g = m3874i | c2395p.m3870g(c1227r0);
                Object m3847O = c2395p.m3847O();
                if (m3870g || m3847O == obj3) {
                    m3847O = new C0968ij(c1227r0, context);
                    c2395p.m3877j0(m3847O);
                }
                c2395p.m3888r(false);
                AbstractC1991r4.m3161b((InterfaceC3277a) m3847O, null, false, null, null, null, null, null, AbstractC1228r1.f7265r, c2395p, 805306368, 510);
                c2395p.m3888r(false);
            } else {
                c2395p.m3857Z(-1849163668);
                c2395p.m3857Z(-1168027304);
                boolean m3874i2 = c2395p.m3874i(this.f5297h) | c2395p.m3874i(context);
                Object m3847O2 = c2395p.m3847O();
                if (m3874i2 || m3847O2 == obj3) {
                    m3847O2 = new C0998jj(this.f5297h, interfaceC2425y0, this.f5299j, this.f5300k, context, this.f5301l, 0);
                    c2395p.m3877j0(m3847O2);
                }
                c2395p.m3888r(false);
                AbstractC1991r4.m3161b((InterfaceC3277a) m3847O2, null, !((Boolean) interfaceC2425y0.getValue()).booleanValue(), null, null, null, null, null, AbstractC3178i.m4873d(1554237294, new C1076m4(interfaceC2425y0, 6), c2395p), c2395p, 805306368, 506);
                c2395p.m3888r(false);
            }
        }
        return C1694m.f10482a;
    }
}
