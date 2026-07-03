package p039e5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import com.paoman.lema.KeepAliveService;
import com.paoman.lema.OverlayKeepAliveService;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p085l0.InterfaceC2425y0;
import p144t.AbstractC3122c;
import p144t.C3137j0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.e6 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0828e6 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f3635e;

    /* renamed from: f */
    public final /* synthetic */ Context f3636f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f3637g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f3638h;

    public /* synthetic */ C0828e6(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, int i7) {
        this.f3635e = i7;
        this.f3636f = context;
        this.f3637g = interfaceC2425y0;
        this.f3638h = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        String str;
        int i7 = this.f3635e;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f3638h;
        InterfaceC2425y0 interfaceC2425y02 = this.f3637g;
        Context context = this.f3636f;
        switch (i7) {
            case 0:
                EnumC1495zk enumC1495zk = (EnumC1495zk) obj;
                AbstractC3367j.m5100e(enumC1495zk, "it");
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                interfaceC2425y02.setValue(enumC1495zk);
                AbstractC1249rm.m2218F0(context, enumC1495zk);
                if (enumC1495zk == EnumC1495zk.f9910f) {
                    interfaceC2425y0.setValue(AbstractC3784a.m5817z("UDP"));
                    AbstractC1249rm.m2220G0(context, AbstractC3784a.m5817z(EnumC0748bl.f2838f));
                }
                return c1694m;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    AbstractC0094y0.m178e(interfaceC2425y02, Boolean.TRUE, context, "speed_test_profiles", 0).putBoolean("notification_keep_alive", true).apply();
                    Intent intent = new Intent(context, (Class<?>) KeepAliveService.class);
                    intent.setAction("com.paoman.lema.keepalive.START");
                    intent.putExtra("silent_audio_keep_alive", ((Boolean) interfaceC2425y0.getValue()).booleanValue());
                    context.startService(intent);
                } else {
                    AbstractC0094y0.m178e(interfaceC2425y02, Boolean.FALSE, context, "speed_test_profiles", 0).putBoolean("notification_keep_alive", false).apply();
                    Toast.makeText(context, "通知权限未授予，无法启用通知保活", 0).show();
                }
                return c1694m;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                interfaceC2425y02.setValue(Boolean.FALSE);
                if (booleanValue) {
                    AbstractC1092mk.m1812k0(interfaceC2425y0, true);
                    context.getSharedPreferences("speed_test_profiles", 0).edit().putBoolean("wifi_ssid_display_enabled", true).apply();
                } else {
                    AbstractC1092mk.m1812k0(interfaceC2425y0, false);
                    context.getSharedPreferences("speed_test_profiles", 0).edit().putBoolean("wifi_ssid_display_enabled", false).apply();
                    if (Build.VERSION.SDK_INT >= 33) {
                        str = "读取 WiFi 名称需要位置权限";
                    } else {
                        str = "Android 8 及以上读取 WiFi 名称需要位置权限";
                    }
                    Toast.makeText(context, str, 1).show();
                }
                return c1694m;
            case 3:
                Boolean bool = (Boolean) obj;
                boolean booleanValue2 = bool.booleanValue();
                float f7 = AbstractC1092mk.f5952h;
                interfaceC2425y02.setValue(bool);
                if (booleanValue2) {
                    AbstractC0094y0.m178e(interfaceC2425y0, Boolean.FALSE, context, "speed_test_profiles", 0).putBoolean("single_local_port_mode_enabled", true).putBoolean("high_throughput_mode", false).apply();
                } else {
                    AbstractC0094y0.m178e(interfaceC2425y0, Boolean.TRUE, context, "speed_test_profiles", 0).putBoolean("single_local_port_mode_enabled", false).putBoolean("high_throughput_mode", true).apply();
                }
                return c1694m;
            case 4:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue3 = bool2.booleanValue();
                float f8 = AbstractC1092mk.f5952h;
                interfaceC2425y02.setValue(bool2);
                if (booleanValue3) {
                    interfaceC2425y0.setValue(Boolean.FALSE);
                }
                context.getSharedPreferences("speed_test_profiles", 0).edit().putBoolean("high_throughput_mode", booleanValue3).apply();
                if (booleanValue3) {
                    context.getSharedPreferences("speed_test_profiles", 0).edit().putBoolean("single_local_port_mode_enabled", false).apply();
                }
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                Boolean bool3 = (Boolean) obj;
                boolean booleanValue4 = bool3.booleanValue();
                float f9 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m178e(interfaceC2425y02, bool3, context, "speed_test_profiles", 0).putBoolean("interface_profile_assign", booleanValue4).apply();
                if (booleanValue4 && ((Boolean) interfaceC2425y0.getValue()).booleanValue()) {
                    AbstractC0094y0.m178e(interfaceC2425y0, Boolean.FALSE, context, "speed_test_profiles", 0).putBoolean("default_all_interfaces_auto_reconnect", false).apply();
                }
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                String str2 = (String) obj;
                AbstractC3367j.m5100e(str2, "it");
                float f10 = AbstractC1092mk.f5952h;
                interfaceC2425y02.setValue(str2);
                if (!AbstractC0444k.m937a0(str2)) {
                    AbstractC0094y0.m195v(interfaceC2425y0, "", context, "total_limit", "");
                }
                AbstractC1092mk.m1693K3(context).edit().putString("download_limit", str2).apply();
                return c1694m;
            case 7:
                String str3 = (String) obj;
                AbstractC3367j.m5100e(str3, "it");
                float f11 = AbstractC1092mk.f5952h;
                interfaceC2425y02.setValue(str3);
                if (!AbstractC0444k.m937a0(str3)) {
                    AbstractC0094y0.m195v(interfaceC2425y0, "", context, "total_limit", "");
                }
                AbstractC1092mk.m1693K3(context).edit().putString("upload_limit", str3).apply();
                return c1694m;
            case 8:
                String str4 = (String) obj;
                AbstractC3367j.m5100e(str4, "it");
                float f12 = AbstractC1092mk.f5952h;
                interfaceC2425y02.setValue(str4);
                if (!AbstractC0444k.m937a0(str4)) {
                    AbstractC0094y0.m195v(interfaceC2425y0, "", context, "total_stop", "");
                }
                AbstractC1092mk.m1693K3(context).edit().putString("download_stop", str4).apply();
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                String str5 = (String) obj;
                AbstractC3367j.m5100e(str5, "it");
                float f13 = AbstractC1092mk.f5952h;
                interfaceC2425y02.setValue(str5);
                if (!AbstractC0444k.m937a0(str5)) {
                    AbstractC0094y0.m195v(interfaceC2425y0, "", context, "total_stop", "");
                }
                AbstractC1092mk.m1693K3(context).edit().putString("upload_stop", str5).apply();
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                Boolean bool4 = (Boolean) obj;
                boolean booleanValue5 = bool4.booleanValue();
                float f14 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m178e(interfaceC2425y02, bool4, context, "speed_test_profiles", 0).putBoolean("silent_audio_keep_alive", booleanValue5).apply();
                if (((Boolean) interfaceC2425y0.getValue()).booleanValue()) {
                    Intent intent2 = new Intent(context, (Class<?>) KeepAliveService.class);
                    intent2.setAction("com.paoman.lema.keepalive.START");
                    intent2.putExtra("silent_audio_keep_alive", booleanValue5);
                    context.startService(intent2);
                }
                return c1694m;
            case 11:
                if (((Boolean) obj).booleanValue()) {
                    if (!AbstractC1092mk.m1815k3(context)) {
                        interfaceC2425y02.setValue(Boolean.TRUE);
                        context.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName())).addFlags(268435456));
                        Toast.makeText(context, "请授予悬浮窗权限后返回", 0).show();
                    } else {
                        AbstractC0094y0.m178e(interfaceC2425y0, Boolean.TRUE, context, "speed_test_profiles", 0).putBoolean("overlay_keep_alive", true).apply();
                    }
                } else {
                    float f15 = AbstractC1092mk.f5952h;
                    Boolean bool5 = Boolean.FALSE;
                    interfaceC2425y02.setValue(bool5);
                    AbstractC0094y0.m178e(interfaceC2425y0, bool5, context, "speed_test_profiles", 0).putBoolean("overlay_keep_alive", false).apply();
                    Intent intent3 = new Intent(context, (Class<?>) OverlayKeepAliveService.class);
                    intent3.setAction("com.paoman.lema.overlay_keepalive.STOP");
                    context.startService(intent3);
                }
                return c1694m;
            default:
                Boolean bool6 = (Boolean) obj;
                boolean booleanValue6 = bool6.booleanValue();
                float f16 = AbstractC1092mk.f5952h;
                interfaceC2425y02.setValue(bool6);
                if (booleanValue6) {
                    interfaceC2425y0.setValue(Boolean.FALSE);
                }
                context.getSharedPreferences("speed_test_profiles", 0).edit().putBoolean("speed_floating_button_enabled", booleanValue6).apply();
                return c1694m;
        }
    }
}
