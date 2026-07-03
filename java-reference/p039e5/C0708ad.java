package p039e5;

import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p085l0.InterfaceC2425y0;
import p144t.AbstractC3122c;
import p144t.C3137j0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ad */
/* loaded from: classes.dex */
public final /* synthetic */ class C0708ad implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f2368e;

    /* renamed from: f */
    public final /* synthetic */ Context f2369f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f2370g;

    public /* synthetic */ C0708ad(Context context, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f2368e = i7;
        this.f2369f = context;
        this.f2370g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f2368e;
        int i8 = 0;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f2370g;
        Context context = this.f2369f;
        switch (i7) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    interfaceC2425y0.setValue(Boolean.TRUE);
                } else {
                    Toast.makeText(context, "需要相机权限才能扫码", 0).show();
                }
                return c1694m;
            case 1:
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "it");
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i9 = 0; i9 < length; i9++) {
                    char charAt = str.charAt(i9);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                String m955s0 = AbstractC0444k.m955s0(sb.toString(), 5);
                C3137j0 c3137j0 = AbstractC1302td.f7786a;
                interfaceC2425y0.setValue(m955s0);
                String str2 = (String) interfaceC2425y0.getValue();
                AbstractC3367j.m5100e(context, "context");
                AbstractC3367j.m5100e(str2, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_iperf3_server_port", str2).apply();
                return c1694m;
            case 2:
                String str3 = (String) obj;
                AbstractC3367j.m5100e(str3, "it");
                String obj2 = AbstractC0444k.m956t0(str3).toString();
                C3137j0 c3137j02 = AbstractC1302td.f7786a;
                interfaceC2425y0.setValue(obj2);
                String str4 = (String) interfaceC2425y0.getValue();
                AbstractC3367j.m5100e(context, "context");
                AbstractC3367j.m5100e(str4, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_iperf3_client_host", AbstractC0444k.m956t0(str4).toString()).apply();
                return c1694m;
            case 3:
                String str5 = (String) obj;
                AbstractC3367j.m5100e(str5, "it");
                StringBuilder sb2 = new StringBuilder();
                int length2 = str5.length();
                for (int i10 = 0; i10 < length2; i10++) {
                    char charAt2 = str5.charAt(i10);
                    if (Character.isDigit(charAt2)) {
                        sb2.append(charAt2);
                    }
                }
                String m955s02 = AbstractC0444k.m955s0(sb2.toString(), 5);
                C3137j0 c3137j03 = AbstractC1302td.f7786a;
                interfaceC2425y0.setValue(m955s02);
                String str6 = (String) interfaceC2425y0.getValue();
                AbstractC3367j.m5100e(context, "context");
                AbstractC3367j.m5100e(str6, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_iperf3_client_port", str6).apply();
                return c1694m;
            case 4:
                EnumC1332uc enumC1332uc = (EnumC1332uc) obj;
                AbstractC3367j.m5100e(enumC1332uc, "it");
                C3137j0 c3137j04 = AbstractC1302td.f7786a;
                interfaceC2425y0.setValue(enumC1332uc);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_iperf3_protocol", enumC1332uc.name()).apply();
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                EnumC0803dc enumC0803dc = (EnumC0803dc) obj;
                AbstractC3367j.m5100e(enumC0803dc, "it");
                C3137j0 c3137j05 = AbstractC1302td.f7786a;
                interfaceC2425y0.setValue(enumC0803dc);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_iperf3_direction", enumC0803dc.name()).apply();
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                String str7 = (String) obj;
                AbstractC3367j.m5100e(str7, "it");
                StringBuilder sb3 = new StringBuilder();
                int length3 = str7.length();
                for (int i11 = 0; i11 < length3; i11++) {
                    char charAt3 = str7.charAt(i11);
                    if (Character.isDigit(charAt3)) {
                        sb3.append(charAt3);
                    }
                }
                String m955s03 = AbstractC0444k.m955s0(sb3.toString(), 2);
                C3137j0 c3137j06 = AbstractC1302td.f7786a;
                interfaceC2425y0.setValue(m955s03);
                String str8 = (String) interfaceC2425y0.getValue();
                AbstractC3367j.m5100e(context, "context");
                AbstractC3367j.m5100e(str8, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_iperf3_streams", str8).apply();
                return c1694m;
            case 7:
                String str9 = (String) obj;
                AbstractC3367j.m5100e(str9, "it");
                StringBuilder sb4 = new StringBuilder();
                int length4 = str9.length();
                for (int i12 = 0; i12 < length4; i12++) {
                    char charAt4 = str9.charAt(i12);
                    if (Character.isDigit(charAt4)) {
                        sb4.append(charAt4);
                    }
                }
                String m955s04 = AbstractC0444k.m955s0(sb4.toString(), 5);
                C3137j0 c3137j07 = AbstractC1302td.f7786a;
                interfaceC2425y0.setValue(m955s04);
                String str10 = (String) interfaceC2425y0.getValue();
                AbstractC3367j.m5100e(context, "context");
                AbstractC3367j.m5100e(str10, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_iperf3_duration", str10).apply();
                return c1694m;
            case 8:
                String str11 = (String) obj;
                AbstractC3367j.m5100e(str11, "it");
                StringBuilder sb5 = new StringBuilder();
                int length5 = str11.length();
                for (int i13 = 0; i13 < length5; i13++) {
                    char charAt5 = str11.charAt(i13);
                    if (Character.isDigit(charAt5)) {
                        sb5.append(charAt5);
                    }
                }
                String m955s05 = AbstractC0444k.m955s0(sb5.toString(), 3);
                C3137j0 c3137j08 = AbstractC1302td.f7786a;
                interfaceC2425y0.setValue(m955s05);
                String str12 = (String) interfaceC2425y0.getValue();
                AbstractC3367j.m5100e(context, "context");
                AbstractC3367j.m5100e(str12, "value");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_iperf3_interval", str12).apply();
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                EnumC0771cc enumC0771cc = (EnumC0771cc) obj;
                AbstractC3367j.m5100e(enumC0771cc, "it");
                C3137j0 c3137j09 = AbstractC1302td.f7786a;
                interfaceC2425y0.setValue(enumC0771cc);
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_iperf3_bidir_mode", enumC0771cc.name()).apply();
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                String str13 = (String) obj;
                AbstractC3367j.m5100e(str13, "it");
                float f7 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m195v(interfaceC2425y0, str13, context, "trace_target", str13);
                return c1694m;
            case 11:
                EnumC1163ot enumC1163ot = (EnumC1163ot) obj;
                AbstractC3367j.m5100e(enumC1163ot, "it");
                float f8 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue(enumC1163ot);
                AbstractC1092mk.m1693K3(context).edit().putString("trace_protocol", enumC1163ot.name()).apply();
                return c1694m;
            case 12:
                String str14 = (String) obj;
                AbstractC3367j.m5100e(str14, "it");
                float f9 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m195v(interfaceC2425y0, str14, context, "trace_max_hops", str14);
                return c1694m;
            case 13:
                EnumC1465yl enumC1465yl = (EnumC1465yl) obj;
                AbstractC3367j.m5100e(enumC1465yl, "it");
                float f10 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue(enumC1465yl);
                AbstractC1092mk.m1693K3(context).edit().putString("nexttrace_server_mode", enumC1465yl.name()).apply();
                return c1694m;
            case 14:
                String str15 = (String) obj;
                AbstractC3367j.m5100e(str15, "it");
                float f11 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m195v(interfaceC2425y0, str15, context, "nexttrace_api_server", str15);
                return c1694m;
            case AbstractC3122c.f15762g /* 15 */:
                String str16 = (String) obj;
                AbstractC3367j.m5100e(str16, "it");
                float f12 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m195v(interfaceC2425y0, str16, context, "ping_target", str16);
                return c1694m;
            case 16:
                String str17 = (String) obj;
                AbstractC3367j.m5100e(str17, "it");
                float f13 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m195v(interfaceC2425y0, str17, context, "nexttrace_deploy_server", str17);
                return c1694m;
            case 17:
                String str18 = (String) obj;
                AbstractC3367j.m5100e(str18, "it");
                float f14 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m195v(interfaceC2425y0, str18, context, "nexttrace_deploy_token", str18);
                return c1694m;
            case 18:
                String str19 = (String) obj;
                AbstractC3367j.m5100e(str19, "it");
                float f15 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m195v(interfaceC2425y0, str19, context, "nexttrace_v4_token", str19);
                return c1694m;
            case 19:
                EnumC1125nm enumC1125nm = (EnumC1125nm) obj;
                AbstractC3367j.m5100e(enumC1125nm, "it");
                float f16 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue(enumC1125nm);
                AbstractC1092mk.m1693K3(context).edit().putString("ping_protocol", enumC1125nm.name()).apply();
                return c1694m;
            case 20:
                String str20 = (String) obj;
                AbstractC3367j.m5100e(str20, "it");
                float f17 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m195v(interfaceC2425y0, str20, context, "ping_count", str20);
                return c1694m;
            case 21:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                float f18 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m194u(interfaceC2425y0, bool, context, "ping_continuous", booleanValue);
                return c1694m;
            case 22:
                String str21 = (String) obj;
                AbstractC3367j.m5100e(str21, "it");
                float f19 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m195v(interfaceC2425y0, str21, context, "diagnostics_tcp_port", str21);
                return c1694m;
            case 23:
                int intValue = ((Integer) obj).intValue();
                if (intValue >= 0) {
                    float f20 = AbstractC1092mk.f5952h;
                    if (intValue < ((List) interfaceC2425y0.getValue()).size()) {
                        List list = (List) interfaceC2425y0.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list) {
                            int i14 = i8 + 1;
                            if (i8 >= 0) {
                                if (i8 != intValue) {
                                    arrayList.add(obj3);
                                }
                                i8 = i14;
                            } else {
                                AbstractC1806n.m3072T();
                                throw null;
                            }
                        }
                        interfaceC2425y0.setValue(arrayList);
                        AbstractC1092mk.m1682I2(context, interfaceC2425y0);
                    }
                }
                return c1694m;
            case 24:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                float f21 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m194u(interfaceC2425y0, bool2, context, "timed_stop_enabled", booleanValue2);
                return c1694m;
            case 25:
                EnumC1003jo enumC1003jo = (EnumC1003jo) obj;
                AbstractC3367j.m5100e(enumC1003jo, "it");
                float f22 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue(enumC1003jo);
                AbstractC1092mk.m1693K3(context).edit().putString("dns_selection_mode", enumC1003jo.name()).apply();
                return c1694m;
            case 26:
                Boolean bool3 = (Boolean) obj;
                boolean booleanValue3 = bool3.booleanValue();
                float f23 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m194u(interfaceC2425y0, bool3, context, "extreme_speed_mode", booleanValue3);
                return c1694m;
            case 27:
                String str22 = (String) obj;
                AbstractC3367j.m5100e(str22, "it");
                float f24 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m195v(interfaceC2425y0, str22, context, "sample_interval", str22);
                return c1694m;
            case 28:
                String str23 = (String) obj;
                AbstractC3367j.m5100e(str23, "it");
                float f25 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m195v(interfaceC2425y0, str23, context, "chart_sample_capacity", str23);
                return c1694m;
            default:
                Boolean bool4 = (Boolean) obj;
                boolean booleanValue4 = bool4.booleanValue();
                float f26 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m194u(interfaceC2425y0, bool4, context, "redirect_enhancement_mode", booleanValue4);
                return c1694m;
        }
    }

    public /* synthetic */ C0708ad(InterfaceC2425y0 interfaceC2425y0, Context context) {
        this.f2368e = 23;
        this.f2370g = interfaceC2425y0;
        this.f2369f = context;
    }
}
