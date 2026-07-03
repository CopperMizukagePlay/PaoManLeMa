package p039e5;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import p001a0.AbstractC0094y0;
import p046f5.AbstractC1541f;
import p053g5.C1689h;
import p060h5.AbstractC1793a0;
import p085l0.AbstractC2418w;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.dd */
/* loaded from: classes.dex */
public final /* synthetic */ class C0804dd implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f3391e;

    /* renamed from: f */
    public final /* synthetic */ Context f3392f;

    public /* synthetic */ C0804dd(Context context, int i7) {
        this.f3391e = i7;
        this.f3392f = context;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        Object m2985m;
        Object m2985m2;
        Object m2985m3;
        Object m2985m4;
        int i7 = this.f3391e;
        String str = "120";
        String str2 = "32";
        String str3 = "256";
        String str4 = "10";
        Context context = this.f3392f;
        switch (i7) {
            case 0:
                String str5 = "TCP";
                AbstractC3367j.m5100e(context, "context");
                try {
                    String string = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_iperf3_protocol", "TCP");
                    if (string != null) {
                        str5 = string;
                    }
                    m2985m = EnumC1332uc.valueOf(str5);
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (m2985m instanceof C1689h) {
                    m2985m = EnumC1332uc.f7919f;
                }
                return AbstractC2418w.m3980x((EnumC1332uc) m2985m);
            case 1:
                String str6 = "FORWARD";
                AbstractC3367j.m5100e(context, "context");
                try {
                    String string2 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_iperf3_direction", "FORWARD");
                    if (string2 != null) {
                        str6 = string2;
                    }
                    m2985m2 = EnumC0803dc.valueOf(str6);
                } catch (Throwable th2) {
                    m2985m2 = AbstractC1793a0.m2985m(th2);
                }
                if (m2985m2 instanceof C1689h) {
                    m2985m2 = EnumC0803dc.f3385f;
                }
                return AbstractC2418w.m3980x((EnumC0803dc) m2985m2);
            case 2:
                AbstractC3367j.m5100e(context, "context");
                String string3 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_iperf3_streams", "32");
                if (string3 != null) {
                    str2 = string3;
                }
                return AbstractC2418w.m3980x(str2);
            case 3:
                AbstractC3367j.m5100e(context, "context");
                String string4 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_iperf3_duration", "120");
                if (string4 != null) {
                    str = string4;
                }
                return AbstractC2418w.m3980x(str);
            case 4:
                AbstractC3367j.m5100e(context, "context");
                String str7 = "1";
                String string5 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_iperf3_interval", "1");
                if (string5 != null) {
                    str7 = string5;
                }
                return AbstractC2418w.m3980x(str7);
            case AbstractC3122c.f15761f /* 5 */:
                String str8 = "DUAL_PORT";
                AbstractC3367j.m5100e(context, "context");
                try {
                    String string6 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_iperf3_bidir_mode", "DUAL_PORT");
                    if (string6 != null) {
                        str8 = string6;
                    }
                    m2985m3 = EnumC0771cc.valueOf(str8);
                } catch (Throwable th3) {
                    m2985m3 = AbstractC1793a0.m2985m(th3);
                }
                if (m2985m3 instanceof C1689h) {
                    m2985m3 = EnumC0771cc.f3022f;
                }
                return AbstractC2418w.m3980x((EnumC0771cc) m2985m3);
            case AbstractC3122c.f15759d /* 6 */:
                String str9 = "default";
                String string7 = AbstractC1092mk.m1693K3(context).getString("accent_color", "default");
                if (string7 != null) {
                    str9 = string7;
                }
                return AbstractC2418w.m3980x(str9);
            case 7:
                return new C2349d1(AbstractC1092mk.m1693K3(context).getInt("accent_custom_light", -10006364));
            case 8:
                return new C2349d1(AbstractC1092mk.m1693K3(context).getInt("accent_custom_dark", -3097345));
            case AbstractC3122c.f15758c /* 9 */:
                List list = AbstractC1541f.f10116a;
                SharedPreferences m1693K3 = AbstractC1092mk.m1693K3(context);
                AbstractC3367j.m5099d(m1693K3, "access$speedPrefs(...)");
                float f7 = 1.0f;
                float f8 = m1693K3.getFloat("ui_scale", 1.0f);
                if (f8 > 0.0f) {
                    f7 = AbstractC1541f.m2473a(f8);
                }
                return new C2345c1(f7);
            case AbstractC3122c.f15760e /* 10 */:
                String string8 = context.getSharedPreferences("speed_test_profiles", 0).getString("sample_interval", AbstractC1220qo.m2157b(250L));
                if (string8 == null) {
                    string8 = AbstractC1220qo.m2157b(250L);
                }
                return AbstractC2418w.m3980x(string8);
            case 11:
                String string9 = context.getSharedPreferences("speed_test_profiles", 0).getString("chart_sample_capacity", "120");
                if (string9 != null) {
                    str = string9;
                }
                return AbstractC2418w.m3980x(str);
            case 12:
                return AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "redirect_enhancement_mode", false);
            case 13:
                SharedPreferences sharedPreferences = context.getSharedPreferences("speed_test_profiles", 0);
                AbstractC3367j.m5097b(sharedPreferences);
                if (!sharedPreferences.contains("use_system_dns")) {
                    sharedPreferences.edit().putBoolean("use_system_dns", !sharedPreferences.getBoolean("custom_dns_enabled", false)).apply();
                }
                return AbstractC2418w.m3980x(Boolean.valueOf(sharedPreferences.getBoolean("use_system_dns", true)));
            case 14:
                String str10 = "Off";
                try {
                    String string10 = context.getSharedPreferences("speed_test_profiles", 0).getString("dns_selection_mode", "Off");
                    if (string10 != null) {
                        str10 = string10;
                    }
                    m2985m4 = EnumC1003jo.valueOf(str10);
                } catch (Throwable th4) {
                    m2985m4 = AbstractC1793a0.m2985m(th4);
                }
                if (m2985m4 instanceof C1689h) {
                    m2985m4 = EnumC1003jo.f5116f;
                }
                return AbstractC2418w.m3980x(m2985m4);
            case AbstractC3122c.f15762g /* 15 */:
                return AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "rate_push_enabled", false);
            case 16:
                String string11 = context.getSharedPreferences("speed_test_profiles", 0).getString("rate_push_threads", "256");
                if (string11 != null) {
                    str3 = string11;
                }
                return AbstractC2418w.m3980x(str3);
            case 17:
                String str11 = "2";
                String string12 = context.getSharedPreferences("speed_test_profiles", 0).getString("rate_push_step_threads", "2");
                if (string12 != null) {
                    str11 = string12;
                }
                return AbstractC2418w.m3980x(str11);
            case 18:
                return AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "emergency_compensation_enabled", true);
            case 19:
                String str12 = "443";
                String string13 = context.getSharedPreferences("speed_test_profiles", 0).getString("diagnostics_tcp_port", "443");
                if (string13 != null) {
                    str12 = string13;
                }
                return AbstractC2418w.m3980x(str12);
            case 20:
                return AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "tuning_custom_enabled", false);
            case 21:
                String str13 = "12";
                String string14 = context.getSharedPreferences("speed_test_profiles", 0).getString("tuning_download_min_workers", "12");
                if (string14 != null) {
                    str13 = string14;
                }
                return AbstractC2418w.m3980x(str13);
            case 22:
                String str14 = "20";
                String string15 = context.getSharedPreferences("speed_test_profiles", 0).getString("tuning_download_max_workers", "20");
                if (string15 != null) {
                    str14 = string15;
                }
                return AbstractC2418w.m3980x(str14);
            case 23:
                String str15 = "4";
                String string16 = context.getSharedPreferences("speed_test_profiles", 0).getString("tuning_upload_min_workers", "4");
                if (string16 != null) {
                    str15 = string16;
                }
                return AbstractC2418w.m3980x(str15);
            case 24:
                String string17 = context.getSharedPreferences("speed_test_profiles", 0).getString("tuning_upload_max_workers", "10");
                if (string17 != null) {
                    str4 = string17;
                }
                return AbstractC2418w.m3980x(str4);
            case 25:
                String string18 = context.getSharedPreferences("speed_test_profiles", 0).getString("tuning_download_buffer_kb", "10");
                if (string18 != null) {
                    str4 = string18;
                }
                return AbstractC2418w.m3980x(str4);
            case 26:
                String string19 = context.getSharedPreferences("speed_test_profiles", 0).getString("tuning_upload_buffer_kb", "10");
                if (string19 != null) {
                    str4 = string19;
                }
                return AbstractC2418w.m3980x(str4);
            case 27:
                String string20 = context.getSharedPreferences("speed_test_profiles", 0).getString("tuning_high_throughput_worker_budget", "32");
                if (string20 != null) {
                    str2 = string20;
                }
                return AbstractC2418w.m3980x(str2);
            case 28:
                String string21 = context.getSharedPreferences("speed_test_profiles", 0).getString("tuning_max_worker_threads", "256");
                if (string21 != null) {
                    str3 = string21;
                }
                return AbstractC2418w.m3980x(str3);
            default:
                String str16 = "1.1.1.1";
                String string22 = context.getSharedPreferences("speed_test_profiles", 0).getString("trace_target", "1.1.1.1");
                if (string22 != null) {
                    str16 = string22;
                }
                return AbstractC2418w.m3980x(str16);
        }
    }
}
