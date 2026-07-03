package p039e5;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0155c;
import p001a0.C0039j1;
import p053g5.C1694m;
import p063i0.AbstractC1847a4;
import p063i0.AbstractC1991r4;
import p085l0.C2375k;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p144t.C3154s;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;
import p152u.C3315c;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.pa */
/* loaded from: classes.dex */
public final class C1175pa implements InterfaceC3282f {

    /* renamed from: e */
    public final /* synthetic */ int f6847e;

    /* renamed from: f */
    public final /* synthetic */ Context f6848f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f6849g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f6850h;

    public /* synthetic */ C1175pa(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, int i7) {
        this.f6847e = i7;
        this.f6848f = context;
        this.f6849g = interfaceC2425y0;
        this.f6850h = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        boolean z7;
        switch (this.f6847e) {
            case 0:
                C2395p c2395p = (C2395p) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3154s) obj, "$this$SpeedSettingsSectionCard");
                if ((intValue & 17) == 16 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    InterfaceC2425y0 interfaceC2425y0 = this.f6850h;
                    boolean z8 = ((C0959i9) interfaceC2425y0.getValue()).f4788j;
                    c2395p.m3857Z(1067357409);
                    Context context = this.f6848f;
                    boolean m3874i = c2395p.m3874i(context);
                    Object m3847O = c2395p.m3847O();
                    Object obj4 = C2375k.f13421a;
                    if (m3874i || m3847O == obj4) {
                        m3847O = new C0988j9(context, 2);
                        c2395p.m3877j0(m3847O);
                    }
                    c2395p.m3888r(false);
                    AbstractC1249rm.m2207A("启动直达下载器", "软件打开后直接进入下载器", z8, false, (InterfaceC3279c) m3847O, c2395p, 54, 8);
                    AbstractC1991r4.m3164e(null, 0.0f, 0L, c2395p, 0, 7);
                    boolean z9 = ((C0959i9) interfaceC2425y0.getValue()).f4780b;
                    c2395p.m3857Z(1067363035);
                    boolean m3874i2 = c2395p.m3874i(context);
                    Object m3847O2 = c2395p.m3847O();
                    if (m3874i2 || m3847O2 == obj4) {
                        m3847O2 = new C0988j9(context, 3);
                        c2395p.m3877j0(m3847O2);
                    }
                    c2395p.m3888r(false);
                    AbstractC1249rm.m2207A("纯净下载模式", "仅保留下载器和测速设置", z9, false, (InterfaceC3279c) m3847O2, c2395p, 54, 8);
                    AbstractC1991r4.m3164e(null, 0.0f, 0L, c2395p, 0, 7);
                    boolean z10 = ((C0959i9) interfaceC2425y0.getValue()).f4789k;
                    boolean z11 = ((C0959i9) interfaceC2425y0.getValue()).f4780b;
                    c2395p.m3857Z(1067369445);
                    boolean m3874i3 = c2395p.m3874i(context);
                    Object m3847O3 = c2395p.m3847O();
                    if (m3874i3 || m3847O3 == obj4) {
                        m3847O3 = new C0988j9(context, 4);
                        c2395p.m3877j0(m3847O3);
                    }
                    c2395p.m3888r(false);
                    AbstractC1249rm.m2207A("打开后自动开始下载", "仅纯净下载模式可用", z10, z11, (InterfaceC3279c) m3847O3, c2395p, 54, 0);
                    AbstractC1991r4.m3164e(null, 0.0f, 0L, c2395p, 0, 7);
                    if (((C0959i9) interfaceC2425y0.getValue()).f4790l == 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    c2395p.m3857Z(1067376005);
                    boolean m3874i4 = c2395p.m3874i(context);
                    InterfaceC2425y0 interfaceC2425y02 = this.f6849g;
                    boolean m3870g = m3874i4 | c2395p.m3870g(interfaceC2425y02);
                    Object m3847O4 = c2395p.m3847O();
                    if (m3870g || m3847O4 == obj4) {
                        m3847O4 = new C1385w3(context, interfaceC2425y02, 28);
                        c2395p.m3877j0(m3847O4);
                    }
                    c2395p.m3888r(false);
                    AbstractC1249rm.m2207A("不限制同时下载数", "关闭后使用下方数量限制", z7, false, (InterfaceC3279c) m3847O4, c2395p, 54, 8);
                    if (((C0959i9) interfaceC2425y0.getValue()).f4790l != 0) {
                        String str = (String) interfaceC2425y02.getValue();
                        C0039j1 c0039j1 = new C0039j1(123);
                        InterfaceC3810r m346e = AbstractC0155c.m346e(C3807o.f17991a, 1.0f);
                        c2395p.m3857Z(1067387415);
                        boolean m3870g2 = c2395p.m3870g(interfaceC2425y02) | c2395p.m3874i(context);
                        Object m3847O5 = c2395p.m3847O();
                        if (m3870g2 || m3847O5 == obj4) {
                            m3847O5 = new C1385w3(interfaceC2425y02, context, 29);
                            c2395p.m3877j0(m3847O5);
                        }
                        c2395p.m3888r(false);
                        AbstractC1847a4.m3102a(str, (InterfaceC3279c) m3847O5, m346e, false, false, null, AbstractC0951i1.f4741u, null, null, null, AbstractC0951i1.f4742v, null, c0039j1, null, true, 0, 0, null, null, c2395p, 1573248, 12779904, 8220600);
                    }
                }
                return C1694m.f10482a;
            default:
                C2395p c2395p2 = (C2395p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                AbstractC3367j.m5100e((C3315c) obj, "$this$item");
                if ((intValue2 & 17) == 16 && c2395p2.m3836D()) {
                    c2395p2.m3852U();
                } else {
                    AbstractC0945hr.m1563G("下载器行为", AbstractC3393k.m5149t(), AbstractC3178i.m4873d(-1969992410, new C1175pa(this.f6848f, this.f6849g, this.f6850h, 0), c2395p2), c2395p2, 24582);
                }
                return C1694m.f10482a;
        }
    }
}
