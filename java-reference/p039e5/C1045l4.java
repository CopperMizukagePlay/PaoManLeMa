package p039e5;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.widget.Toast;
import java.io.File;
import java.util.List;
import p001a0.AbstractC0094y0;
import p053g5.C1690i;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p085l0.InterfaceC2425y0;
import p144t.AbstractC3122c;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p190z.C3860d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.l4 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1045l4 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f5381e;

    /* renamed from: f */
    public final /* synthetic */ Context f5382f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f5383g;

    public /* synthetic */ C1045l4(Context context, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f5381e = i7;
        this.f5382f = context;
        this.f5383g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        Object m2985m;
        EnumC1436xn enumC1436xn;
        String str;
        int i7 = this.f5381e;
        String str2 = null;
        Activity activity = null;
        String str3 = "";
        C1694m c1694m = C1694m.f10482a;
        Context context = this.f5382f;
        InterfaceC2425y0 interfaceC2425y0 = this.f5383g;
        switch (i7) {
            case 0:
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(Boolean.valueOf(!((Boolean) interfaceC2425y0.getValue()).booleanValue()));
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putBoolean("diag_trace_settings_expanded", ((Boolean) interfaceC2425y0.getValue()).booleanValue()).apply();
                return c1694m;
            case 1:
                C3137j0 c3137j02 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(Boolean.valueOf(!((Boolean) interfaceC2425y0.getValue()).booleanValue()));
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putBoolean("diag_ping_settings_expanded", ((Boolean) interfaceC2425y0.getValue()).booleanValue()).apply();
                return c1694m;
            case 2:
                C3137j0 c3137j03 = AbstractC1172p7.f6835a;
                EnumC1063lm enumC1063lm = (EnumC1063lm) interfaceC2425y0.getValue();
                EnumC1063lm enumC1063lm2 = EnumC1063lm.f5700f;
                if (enumC1063lm == enumC1063lm2) {
                    enumC1063lm2 = EnumC1063lm.f5701g;
                }
                interfaceC2425y0.setValue(enumC1063lm2);
                EnumC1063lm enumC1063lm3 = (EnumC1063lm) interfaceC2425y0.getValue();
                AbstractC3367j.m5100e(context, "context");
                AbstractC3367j.m5100e(enumC1063lm3, "order");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_ping_log_order", enumC1063lm3.name()).apply();
                return c1694m;
            case 3:
                C3137j0 c3137j04 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(Boolean.valueOf(!((Boolean) interfaceC2425y0.getValue()).booleanValue()));
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putBoolean("diag_ping_log_scroll_locked", ((Boolean) interfaceC2425y0.getValue()).booleanValue()).apply();
                return c1694m;
            case 4:
                C3860d c3860d = AbstractC1328u8.f7898a;
                interfaceC2425y0.setValue("");
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putString("diag_dns_query", "").apply();
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                interfaceC2425y0.setValue(Boolean.valueOf(!AbstractC1328u8.m2360e(interfaceC2425y0)));
                boolean m2360e = AbstractC1328u8.m2360e(interfaceC2425y0);
                AbstractC3367j.m5100e(context, "context");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putBoolean("diag_dns_settings_expanded", m2360e).apply();
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                AbstractC1249rm.m2219G(interfaceC2425y0, false);
                try {
                    C0927h9.f4481a.m1554a(context);
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((C0959i9) C0927h9.f4483c.f10535e.getValue()).f4779a)).addFlags(1));
                    m2985m = c1694m;
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (C1690i.m2747a(m2985m) != null) {
                    File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                    if (externalFilesDir != null) {
                        str2 = externalFilesDir.getAbsolutePath();
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    Object systemService = context.getSystemService("clipboard");
                    AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("下载目录", str3));
                    Toast.makeText(context, "文件管理器无法定位，目录路径已复制", 1).show();
                }
                return c1694m;
            case 7:
                C3137j0 c3137j05 = AbstractC1302td.f7786a;
                interfaceC2425y0.setValue(Boolean.valueOf(!((Boolean) interfaceC2425y0.getValue()).booleanValue()));
                AbstractC0094y0.m177d(context, "context", "speed_test_profiles", 0).putBoolean("diag_section_expanded_".concat("iperf3_params"), ((Boolean) interfaceC2425y0.getValue()).booleanValue()).apply();
                return c1694m;
            case 8:
                interfaceC2425y0.setValue(Boolean.FALSE);
                AbstractC3367j.m5100e(context, "context");
                context.getSharedPreferences("legal_consent", 0).edit().clear().apply();
                AbstractC0697a2.m1488a("legal_consent_revoked");
                if (context instanceof Activity) {
                    activity = (Activity) context;
                }
                if (activity != null) {
                    activity.finish();
                }
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                AbstractC0094y0.m177d(context, "context", "legal_consent", 0).putBoolean("accepted", true).putInt("accepted_version", 2).putLong("accepted_at_ms", System.currentTimeMillis()).apply();
                AbstractC0697a2.m1488a("legal_consent_v2");
                interfaceC2425y0.setValue(Boolean.TRUE);
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                float f7 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue(Boolean.TRUE);
                Toast.makeText(context, "悬浮按钮已隐藏，重启应用后恢复", 0).show();
                return c1694m;
            case 11:
                float f8 = AbstractC1092mk.f5952h;
                EnumC1436xn enumC1436xn2 = (EnumC1436xn) interfaceC2425y0.getValue();
                enumC1436xn2.getClass();
                EnumC1436xn enumC1436xn3 = EnumC1436xn.f8846f;
                if (enumC1436xn2 == enumC1436xn3) {
                    enumC1436xn = EnumC1436xn.f8847g;
                } else {
                    enumC1436xn = enumC1436xn3;
                }
                interfaceC2425y0.setValue(enumC1436xn);
                AbstractC1249rm.m2212C0(context, (EnumC1436xn) interfaceC2425y0.getValue());
                if (((EnumC1436xn) interfaceC2425y0.getValue()) == enumC1436xn3) {
                    str = "速率单位：Mbps";
                } else {
                    str = "速率单位：MB/s";
                }
                Toast.makeText(context, str, 0).show();
                return c1694m;
            case 12:
                float f9 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue(AbstractC1805m.m3059w0((List) interfaceC2425y0.getValue(), ""));
                AbstractC1092mk.m1687J2(context, interfaceC2425y0);
                return c1694m;
            default:
                float f10 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue(AbstractC1805m.m3059w0((List) interfaceC2425y0.getValue(), new C0878fo("", "")));
                AbstractC1092mk.m1682I2(context, interfaceC2425y0);
                return c1694m;
        }
    }

    public /* synthetic */ C1045l4(InterfaceC2425y0 interfaceC2425y0, Context context, int i7) {
        this.f5381e = i7;
        this.f5383g = interfaceC2425y0;
        this.f5382f = context;
    }
}
