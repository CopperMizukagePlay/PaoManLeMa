package p039e5;

import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import p001a0.AbstractC0094y0;
import p053g5.C1689h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1806n;
import p085l0.InterfaceC2425y0;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ti */
/* loaded from: classes.dex */
public final /* synthetic */ class C1307ti implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f7821e;

    /* renamed from: f */
    public final /* synthetic */ Context f7822f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f7823g;

    public /* synthetic */ C1307ti(Context context, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f7821e = i7;
        this.f7822f = context;
        this.f7823g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        Object m2985m;
        int i7 = this.f7821e;
        int i8 = 0;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f7823g;
        Context context = this.f7822f;
        switch (i7) {
            case 0:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                float f7 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m194u(interfaceC2425y0, bool, context, "ethernet_wifi_coexistence", booleanValue);
                return c1694m;
            case 1:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                float f8 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m194u(interfaceC2425y0, bool2, context, "force_mobile_network_keep_enabled", booleanValue2);
                return c1694m;
            case 2:
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "it");
                float f9 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m195v(interfaceC2425y0, str, context, "force_mobile_network_interval_seconds", str);
                return c1694m;
            case 3:
                Boolean bool3 = (Boolean) obj;
                boolean booleanValue3 = bool3.booleanValue();
                float f10 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m178e(interfaceC2425y0, bool3, context, "speed_test_profiles", 0).putBoolean("default_all_interfaces_auto_reconnect", booleanValue3).apply();
                return c1694m;
            case 4:
                Boolean bool4 = (Boolean) obj;
                boolean booleanValue4 = bool4.booleanValue();
                float f11 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m194u(interfaceC2425y0, bool4, context, "multi_process_mode_two_enabled", booleanValue4);
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                int intValue = ((Integer) obj).intValue();
                if (intValue >= 0) {
                    float f12 = AbstractC1092mk.f5952h;
                    if (intValue < ((List) interfaceC2425y0.getValue()).size()) {
                        List list = (List) interfaceC2425y0.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            int i9 = i8 + 1;
                            if (i8 >= 0) {
                                if (i8 != intValue) {
                                    arrayList.add(obj2);
                                }
                                i8 = i9;
                            } else {
                                AbstractC1806n.m3072T();
                                throw null;
                            }
                        }
                        interfaceC2425y0.setValue(arrayList);
                        AbstractC1092mk.m1687J2(context, interfaceC2425y0);
                    }
                }
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                Boolean bool5 = (Boolean) obj;
                boolean booleanValue5 = bool5.booleanValue();
                float f13 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m194u(interfaceC2425y0, bool5, context, "speed_limit_enabled", booleanValue5);
                return c1694m;
            case 7:
                Boolean bool6 = (Boolean) obj;
                boolean booleanValue6 = bool6.booleanValue();
                float f14 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m194u(interfaceC2425y0, bool6, context, "traffic_stop_enabled", booleanValue6);
                return c1694m;
            case 8:
                Boolean bool7 = (Boolean) obj;
                boolean booleanValue7 = bool7.booleanValue();
                float f15 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m194u(interfaceC2425y0, bool7, context, "keep_screen_on", booleanValue7);
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                EnumC1127no enumC1127no = (EnumC1127no) obj;
                AbstractC3367j.m5100e(enumC1127no, "it");
                float f16 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue(enumC1127no);
                AbstractC1092mk.m1693K3(context).edit().putString("network_mode", enumC1127no.name()).apply();
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                Boolean bool8 = (Boolean) obj;
                boolean booleanValue8 = bool8.booleanValue();
                float f17 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m178e(interfaceC2425y0, bool8, context, "speed_test_profiles", 0).putBoolean("custom_dns_ecs_enabled", booleanValue8).apply();
                return c1694m;
            case 11:
                Boolean bool9 = (Boolean) obj;
                boolean booleanValue9 = bool9.booleanValue();
                float f18 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m194u(interfaceC2425y0, bool9, context, "auto_check_updates_on_startup", booleanValue9);
                return c1694m;
            case 12:
                EnumC1436xn enumC1436xn = (EnumC1436xn) obj;
                AbstractC3367j.m5100e(enumC1436xn, "unit");
                float f19 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue(enumC1436xn);
                AbstractC1249rm.m2212C0(context, enumC1436xn);
                return c1694m;
            case 13:
                Boolean bool10 = (Boolean) obj;
                boolean booleanValue10 = bool10.booleanValue();
                float f20 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m178e(interfaceC2425y0, bool10, context, "speed_test_profiles", 0).putBoolean("custom_dns_enabled", booleanValue10).apply();
                return c1694m;
            case 14:
                String str2 = (String) obj;
                AbstractC3367j.m5100e(str2, "it");
                float f21 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m195v(interfaceC2425y0, str2, context, "custom_dns_timeout_ms", str2);
                return c1694m;
            default:
                String str3 = (String) obj;
                AbstractC3367j.m5100e(str3, "name");
                interfaceC2425y0.setValue(Boolean.FALSE);
                Object obj3 = AbstractC1312tn.f7833a;
                AbstractC3367j.m5100e(context, "context");
                try {
                    m2985m = Boolean.valueOf(AbstractC1249rm.m2222H0(context, AbstractC1249rm.m2242U(str3, AbstractC1312tn.m2353c(), ".settings"), AbstractC1312tn.m2351a(context), "分享设置文件"));
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                Object obj4 = Boolean.FALSE;
                if (m2985m instanceof C1689h) {
                    m2985m = obj4;
                }
                if (!((Boolean) m2985m).booleanValue()) {
                    Toast.makeText(context, "设置分享失败", 0).show();
                }
                return c1694m;
        }
    }

    public /* synthetic */ C1307ti(InterfaceC2425y0 interfaceC2425y0, Context context) {
        this.f7821e = 5;
        this.f7823g = interfaceC2425y0;
        this.f7822f = context;
    }
}
