package p039e5;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.AbstractC0155c;
import p000a.AbstractC0000a;
import p001a0.AbstractC0094y0;
import p053g5.C1694m;
import p063i0.AbstractC1991r4;
import p079k1.C2266e;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p144t.C3149p0;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3282f;
import p152u.C3315c;
import p158u5.AbstractC3367j;
import p177x0.C3807o;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.w6 */
/* loaded from: classes.dex */
public final class C1388w6 implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f8302e = 0;

    /* renamed from: f */
    public final /* synthetic */ C1156om f8303f;

    /* renamed from: g */
    public final /* synthetic */ Context f8304g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f8305h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f8306i;

    public C1388w6(Context context, C1156om c1156om, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02) {
        this.f8304g = context;
        this.f8303f = c1156om;
        this.f8305h = interfaceC2425y0;
        this.f8306i = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        switch (this.f8302e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3149p0) obj, "$this$DiagnosticsCollapsibleSection");
                if ((intValue & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    c2395p.m3857Z(-1243564095);
                    final Context context = this.f8304g;
                    boolean m3874i = c2395p.m3874i(context);
                    Object m3847O = c2395p.m3847O();
                    InterfaceC2425y0 interfaceC2425y0 = this.f8305h;
                    C2413u0 c2413u0 = C2375k.f13421a;
                    if (m3874i || m3847O == c2413u0) {
                        m3847O = new C1045l4(context, interfaceC2425y0, 2);
                        c2395p.m3877j0(m3847O);
                    }
                    c2395p.m3888r(false);
                    float f7 = 28;
                    C3807o c3807o = C3807o.f17991a;
                    AbstractC1991r4.m3165f((InterfaceC3277a) m3847O, AbstractC0155c.m353l(c3807o, f7), false, null, AbstractC3178i.m4873d(1728829424, new C1200q4(interfaceC2425y0, 4), c2395p), c2395p, 196656, 28);
                    c2395p.m3857Z(-1243526976);
                    boolean m3874i2 = c2395p.m3874i(context);
                    final C1156om c1156om = this.f8303f;
                    boolean m3874i3 = m3874i2 | c2395p.m3874i(c1156om);
                    Object m3847O2 = c2395p.m3847O();
                    if (m3874i3 || m3847O2 == c2413u0) {
                        final int i7 = 0;
                        m3847O2 = new InterfaceC3277a() { // from class: e5.v6
                            @Override // p150t5.InterfaceC3277a
                            /* renamed from: a */
                            public final Object mo52a() {
                                int i8 = i7;
                                C1694m c1694m = C1694m.f10482a;
                                C1156om c1156om2 = c1156om;
                                Context context2 = context;
                                switch (i8) {
                                    case 0:
                                        C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                                        Object systemService = context2.getSystemService("clipboard");
                                        AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Ping 结果", AbstractC1172p7.m2053b0(c1156om2)));
                                        return c1694m;
                                    default:
                                        String m2053b0 = AbstractC1172p7.m2053b0(c1156om2);
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", m2053b0);
                                        context2.startActivity(Intent.createChooser(intent, "导出 Ping 结果"));
                                        return c1694m;
                                }
                            }
                        };
                        c2395p.m3877j0(m3847O2);
                    }
                    c2395p.m3888r(false);
                    AbstractC1991r4.m3165f((InterfaceC3277a) m3847O2, AbstractC0155c.m353l(c3807o, f7), false, null, AbstractC0792d1.f3228C, c2395p, 196656, 28);
                    c2395p.m3857Z(-1243508371);
                    boolean m3874i4 = c2395p.m3874i(context) | c2395p.m3874i(c1156om);
                    Object m3847O3 = c2395p.m3847O();
                    if (m3874i4 || m3847O3 == c2413u0) {
                        final int i8 = 1;
                        m3847O3 = new InterfaceC3277a() { // from class: e5.v6
                            @Override // p150t5.InterfaceC3277a
                            /* renamed from: a */
                            public final Object mo52a() {
                                int i82 = i8;
                                C1694m c1694m = C1694m.f10482a;
                                C1156om c1156om2 = c1156om;
                                Context context2 = context;
                                switch (i82) {
                                    case 0:
                                        C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                                        Object systemService = context2.getSystemService("clipboard");
                                        AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                                        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Ping 结果", AbstractC1172p7.m2053b0(c1156om2)));
                                        return c1694m;
                                    default:
                                        String m2053b0 = AbstractC1172p7.m2053b0(c1156om2);
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", m2053b0);
                                        context2.startActivity(Intent.createChooser(intent, "导出 Ping 结果"));
                                        return c1694m;
                                }
                            }
                        };
                        c2395p.m3877j0(m3847O3);
                    }
                    c2395p.m3888r(false);
                    AbstractC1991r4.m3165f((InterfaceC3277a) m3847O3, AbstractC0155c.m353l(c3807o, f7), false, null, AbstractC0792d1.f3229D, c2395p, 196656, 28);
                    c2395p.m3857Z(-1243489418);
                    boolean m3874i5 = c2395p.m3874i(context);
                    Object m3847O4 = c2395p.m3847O();
                    InterfaceC2425y0 interfaceC2425y02 = this.f8306i;
                    if (m3874i5 || m3847O4 == c2413u0) {
                        m3847O4 = new C1045l4(context, interfaceC2425y02, 3);
                        c2395p.m3877j0(m3847O4);
                    }
                    c2395p.m3888r(false);
                    AbstractC1991r4.m3165f((InterfaceC3277a) m3847O4, AbstractC0155c.m353l(c3807o, f7), false, null, AbstractC3178i.m4873d(2085898519, new C1200q4(interfaceC2425y02, 5), c2395p), c2395p, 196656, 28);
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3315c) obj, "$this$item");
                if ((intValue2 & 17) == 16 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    C1156om c1156om2 = this.f8303f;
                    String m184k = AbstractC0094y0.m184k(c1156om2.f6656o.size(), "探测记录（", "）");
                    C2266e m12m = AbstractC0000a.m12m();
                    Context context2 = this.f8304g;
                    InterfaceC2425y0 interfaceC2425y03 = this.f8305h;
                    InterfaceC2425y0 interfaceC2425y04 = this.f8306i;
                    AbstractC1172p7.m2052b(m184k, "ping_log", m12m, false, AbstractC3178i.m4873d(-1664393043, new C1388w6(context2, c1156om2, interfaceC2425y03, interfaceC2425y04), c2395p2), AbstractC3178i.m4873d(-175458490, new C1326u6(c1156om2, interfaceC2425y04, interfaceC2425y03, 1), c2395p2), c2395p2, 221232, 8);
                }
                return C1694m.f10482a;
        }
    }

    public C1388w6(C1156om c1156om, Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02) {
        this.f8303f = c1156om;
        this.f8304g = context;
        this.f8305h = interfaceC2425y0;
        this.f8306i = interfaceC2425y02;
    }
}
