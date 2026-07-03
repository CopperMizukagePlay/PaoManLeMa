package p039e5;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.List;
import java.util.regex.Pattern;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p053g5.C1687f;
import p053g5.C1694m;
import p060h5.AbstractC1804l;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.bd */
/* loaded from: classes.dex */
public final /* synthetic */ class C0740bd implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f2639e;

    /* renamed from: f */
    public final /* synthetic */ Context f2640f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f2641g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f2642h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f2643i;

    public /* synthetic */ C0740bd(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, int i7) {
        this.f2639e = i7;
        this.f2640f = context;
        this.f2641g = interfaceC2425y0;
        this.f2642h = interfaceC2425y02;
        this.f2643i = interfaceC2425y03;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0263  */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo23f(Object obj) {
        C1687f c1687f;
        int i7;
        int i8;
        int i9 = this.f2639e;
        CharSequence charSequence = "";
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f2643i;
        InterfaceC2425y0 interfaceC2425y02 = this.f2642h;
        InterfaceC2425y0 interfaceC2425y03 = this.f2641g;
        Context context = this.f2640f;
        switch (i9) {
            case 0:
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "text");
                Pattern pattern = C1270sc.f7550m;
                String obj2 = AbstractC0444k.m956t0(str).toString();
                if (obj2.length() != 0) {
                    if (AbstractC0444k.m928R(obj2, "://", false)) {
                        obj2 = AbstractC0444k.m951o0(obj2, "://", obj2);
                    }
                    String m959w0 = AbstractC0444k.m959w0(AbstractC0444k.m956t0(obj2).toString(), '/');
                    if (AbstractC0451r.m971M(m959w0, "[", false)) {
                        int m934X = AbstractC0444k.m934X(m959w0, ']', 0, 6);
                        if (m934X > 0) {
                            String substring = m959w0.substring(1, m934X);
                            AbstractC3367j.m5099d(substring, "substring(...)");
                            String m950n0 = AbstractC0444k.m950n0(m959w0, ']', m959w0);
                            char[] cArr = {':'};
                            int length = m950n0.length();
                            int i10 = 0;
                            while (true) {
                                if (i10 < length) {
                                    if (!AbstractC1804l.m3011D(cArr, m950n0.charAt(i10))) {
                                        charSequence = m950n0.subSequence(i10, m950n0.length());
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                            Integer m973O = AbstractC0451r.m973O(charSequence.toString());
                            if (m973O != null) {
                                i8 = m973O.intValue();
                            } else {
                                i8 = 5201;
                            }
                            c1687f = new C1687f(substring, Integer.valueOf(i8));
                            if (c1687f == null) {
                                interfaceC2425y03.setValue((String) c1687f.f10471e);
                                interfaceC2425y02.setValue(String.valueOf(((Number) c1687f.f10472f).intValue()));
                                String str2 = (String) interfaceC2425y03.getValue();
                                AbstractC3367j.m5100e(context, "context");
                                AbstractC3367j.m5100e(str2, "value");
                                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_iperf3_client_host", AbstractC0444k.m956t0(str2).toString()).apply();
                                String str3 = (String) interfaceC2425y02.getValue();
                                AbstractC3367j.m5100e(str3, "value");
                                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_iperf3_client_port", str3).apply();
                                interfaceC2425y0.setValue(Boolean.FALSE);
                            } else {
                                Toast.makeText(context, "无法识别的二维码：".concat(str), 0).show();
                            }
                            return c1694m;
                        }
                    } else {
                        if (AbstractC0444k.m928R(m959w0, ":", false)) {
                            int i11 = 0;
                            for (int i12 = 0; i12 < m959w0.length(); i12++) {
                                if (m959w0.charAt(i12) == ':') {
                                    i11++;
                                }
                            }
                            if (i11 == 1) {
                                String m954r0 = AbstractC0444k.m954r0(m959w0, ":");
                                Integer m973O2 = AbstractC0451r.m973O(AbstractC0444k.m951o0(m959w0, ":", m959w0));
                                if (m973O2 != null) {
                                    i7 = m973O2.intValue();
                                } else {
                                    i7 = 5201;
                                }
                                if (!AbstractC0444k.m937a0(m954r0)) {
                                    c1687f = new C1687f(m954r0, Integer.valueOf(i7));
                                    if (c1687f == null) {
                                    }
                                    return c1694m;
                                }
                            }
                        }
                        c1687f = new C1687f(m959w0, 5201);
                        if (c1687f == null) {
                        }
                        return c1694m;
                    }
                }
                c1687f = null;
                if (c1687f == null) {
                }
                return c1694m;
            case 1:
                List list = (List) obj;
                AbstractC3367j.m5100e(list, "subnets");
                float f7 = AbstractC1092mk.f5952h;
                interfaceC2425y03.setValue(list);
                if (!((Boolean) interfaceC2425y02.getValue()).booleanValue()) {
                    AbstractC0094y0.m178e(interfaceC2425y0, Boolean.TRUE, context, "speed_test_profiles", 0).putBoolean("custom_dns_ecs_enabled", true).apply();
                }
                AbstractC1092mk.m1682I2(context, interfaceC2425y03);
                Toast.makeText(context, "已导入 " + list.size() + " 条 ECS Subnet", 0).show();
                return c1694m;
            case 2:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                float f8 = AbstractC1092mk.f5952h;
                SharedPreferences.Editor putBoolean = AbstractC0094y0.m178e(interfaceC2425y03, bool, context, "speed_test_profiles", 0).putBoolean("use_system_dns", booleanValue);
                if (booleanValue) {
                    Boolean bool2 = Boolean.FALSE;
                    interfaceC2425y02.setValue(bool2);
                    interfaceC2425y0.setValue(bool2);
                    putBoolean.putBoolean("custom_dns_enabled", false).putBoolean("custom_dns_ecs_enabled", false);
                } else {
                    interfaceC2425y02.setValue(Boolean.TRUE);
                    putBoolean.putBoolean("custom_dns_enabled", true);
                }
                putBoolean.apply();
                return c1694m;
            case 3:
                String str4 = (String) obj;
                AbstractC3367j.m5100e(str4, "it");
                float f9 = AbstractC1092mk.f5952h;
                interfaceC2425y03.setValue(str4);
                if (!AbstractC0444k.m937a0(str4)) {
                    interfaceC2425y02.setValue("");
                    interfaceC2425y0.setValue("");
                    AbstractC1092mk.m1693K3(context).edit().putString("download_limit", "").putString("upload_limit", "").apply();
                }
                AbstractC1092mk.m1693K3(context).edit().putString("total_limit", str4).apply();
                return c1694m;
            default:
                String str5 = (String) obj;
                AbstractC3367j.m5100e(str5, "it");
                float f10 = AbstractC1092mk.f5952h;
                interfaceC2425y03.setValue(str5);
                if (!AbstractC0444k.m937a0(str5)) {
                    interfaceC2425y02.setValue("");
                    interfaceC2425y0.setValue("");
                    AbstractC1092mk.m1693K3(context).edit().putString("download_stop", "").putString("upload_stop", "").apply();
                }
                AbstractC1092mk.m1693K3(context).edit().putString("total_stop", str5).apply();
                return c1694m;
        }
    }
}
