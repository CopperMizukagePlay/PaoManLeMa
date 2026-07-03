package p039e5;

import android.content.Context;
import p001a0.AbstractC0094y0;
import p053g5.C1694m;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3365h;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.h6 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0924h6 extends AbstractC3365h implements InterfaceC3277a {

    /* renamed from: m */
    public final /* synthetic */ int f4455m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC3279c f4456n;

    /* renamed from: o */
    public final /* synthetic */ Context f4457o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC2425y0 f4458p;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC2425y0 f4459q;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC2425y0 f4460r;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC2425y0 f4461s;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC2425y0 f4462t;

    /* renamed from: u */
    public final /* synthetic */ InterfaceC2425y0 f4463u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0924h6(InterfaceC3279c interfaceC3279c, Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06, int i7) {
        super(0, AbstractC3366i.class, "resetNatSettings", "NatTypePanel$resetNatSettings(Lkotlin/jvm/functions/Function1;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f4455m = i7;
        switch (i7) {
            case 1:
                this.f4456n = interfaceC3279c;
                this.f4457o = context;
                this.f4458p = interfaceC2425y0;
                this.f4459q = interfaceC2425y02;
                this.f4460r = interfaceC2425y03;
                this.f4461s = interfaceC2425y04;
                this.f4462t = interfaceC2425y05;
                this.f4463u = interfaceC2425y06;
                super(0, AbstractC3366i.class, "resetSessionLimitSettings", "SessionLimitPanel$resetSessionLimitSettings(Lkotlin/jvm/functions/Function1;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
                return;
            default:
                this.f4456n = interfaceC3279c;
                this.f4457o = context;
                this.f4458p = interfaceC2425y0;
                this.f4459q = interfaceC2425y02;
                this.f4460r = interfaceC2425y03;
                this.f4461s = interfaceC2425y04;
                this.f4462t = interfaceC2425y05;
                this.f4463u = interfaceC2425y06;
                return;
        }
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f4455m;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f4463u;
        InterfaceC2425y0 interfaceC2425y02 = this.f4462t;
        InterfaceC2425y0 interfaceC2425y03 = this.f4461s;
        InterfaceC2425y0 interfaceC2425y04 = this.f4460r;
        InterfaceC2425y0 interfaceC2425y05 = this.f4459q;
        InterfaceC2425y0 interfaceC2425y06 = this.f4458p;
        Context context = this.f4457o;
        InterfaceC3279c interfaceC3279c = this.f4456n;
        switch (i7) {
            case 0:
                interfaceC2425y06.setValue(AbstractC1249rm.m2279p0("stun.hot-chilli.net:3478"));
                interfaceC2425y05.setValue(EnumC1495zk.f9911g);
                interfaceC2425y04.setValue(EnumC1402wk.f8483f);
                interfaceC2425y03.setValue(AbstractC3784a.m5817z("UDP"));
                interfaceC2425y02.setValue(Boolean.FALSE);
                interfaceC2425y0.setValue("2500");
                interfaceC3279c.mo23f("");
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_nat_servers", "stun.hot-chilli.net:3478").apply();
                AbstractC1249rm.m2218F0(context, (EnumC1495zk) interfaceC2425y05.getValue());
                EnumC1402wk enumC1402wk = (EnumC1402wk) interfaceC2425y04.getValue();
                AbstractC3367j.m5100e(enumC1402wk, "family");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_nat_address_family", enumC1402wk.name()).apply();
                AbstractC1249rm.m2220G0(context, AbstractC3784a.m5817z(EnumC0748bl.f2838f));
                context.getSharedPreferences("speed_test_profiles", 0).edit().putBoolean("diag_nat_use_speed_dns", false).apply();
                String str = (String) interfaceC2425y0.getValue();
                AbstractC3367j.m5100e(str, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_nat_timeout_ms", str).apply();
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_nat_network_id", "").apply();
                return c1694m;
            default:
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                interfaceC2425y06.setValue("65535");
                interfaceC2425y05.setValue("100");
                interfaceC2425y04.setValue("5000");
                interfaceC2425y03.setValue("200");
                interfaceC2425y02.setValue("100");
                interfaceC2425y0.setValue(Boolean.FALSE);
                interfaceC3279c.mo23f("");
                String str2 = (String) interfaceC2425y06.getValue();
                AbstractC3367j.m5100e(context, "context");
                AbstractC3367j.m5100e(str2, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_session_limit_max", str2).apply();
                String str3 = (String) interfaceC2425y05.getValue();
                AbstractC3367j.m5100e(str3, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_session_limit_batch", str3).apply();
                String str4 = (String) interfaceC2425y04.getValue();
                AbstractC3367j.m5100e(str4, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_session_limit_timeout_ms", str4).apply();
                String str5 = (String) interfaceC2425y03.getValue();
                AbstractC3367j.m5100e(str5, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_session_limit_failure_threshold", str5).apply();
                String str6 = (String) interfaceC2425y02.getValue();
                AbstractC3367j.m5100e(str6, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_session_limit_launch_delay_ms", str6).apply();
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_session_limit_network_id", "").apply();
                context.getSharedPreferences("speed_test_profiles", 0).edit().putBoolean("diag_session_limit_use_speed_dns", false).apply();
                return c1694m;
        }
    }
}
