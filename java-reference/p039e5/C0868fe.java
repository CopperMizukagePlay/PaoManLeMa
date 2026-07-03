package p039e5;

import android.content.Context;
import p053g5.C1694m;
import p063i0.AbstractC1991r4;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3365h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fe */
/* loaded from: classes.dex */
public final class C0868fe implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ int f3993e;

    /* renamed from: f */
    public final /* synthetic */ Context f3994f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f3995g;

    public /* synthetic */ C0868fe(Context context, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f3993e = i7;
        this.f3994f = context;
        this.f3995g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f3993e) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    c2395p.m3857Z(538170677);
                    Context context = this.f3994f;
                    boolean m3874i = c2395p.m3874i(context);
                    Object m3847O = c2395p.m3847O();
                    if (m3874i || m3847O == C2375k.f13421a) {
                        m3847O = new C1045l4(context, this.f3995g, 8);
                        c2395p.m3877j0(m3847O);
                    }
                    c2395p.m3888r(false);
                    AbstractC1991r4.m3167h((InterfaceC3277a) m3847O, null, false, null, null, null, AbstractC1104n1.f6146m, c2395p, 805306368, 510);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    c2395p2.m3857Z(1338228447);
                    Context context2 = this.f3994f;
                    boolean m3874i2 = c2395p2.m3874i(context2);
                    Object m3847O2 = c2395p2.m3847O();
                    if (m3874i2 || m3847O2 == C2375k.f13421a) {
                        m3847O2 = new C0984j5(context2, this.f3995g, 5);
                        c2395p2.m3877j0(m3847O2);
                    }
                    c2395p2.m3888r(false);
                    AbstractC1991r4.m3167h((InterfaceC3277a) ((AbstractC3365h) m3847O2), null, false, null, null, null, AbstractC1352v1.f8071g0, c2395p2, 805306368, 510);
                }
                return C1694m.f10482a;
        }
    }
}
