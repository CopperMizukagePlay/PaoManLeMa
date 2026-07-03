package p039e5;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0444k;
import p053g5.C1689h;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p085l0.AbstractC2418w;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.r2 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1229r2 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f7283e;

    /* renamed from: f */
    public final /* synthetic */ Context f7284f;

    public /* synthetic */ C1229r2(Context context, int i7) {
        this.f7283e = i7;
        this.f7284f = context;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        Object m2985m;
        Object m2985m2;
        Object m2985m3;
        int i7 = this.f7283e;
        String str = "100";
        String str2 = "5201";
        String str3 = "";
        int i8 = 0;
        Context context = this.f7284f;
        switch (i7) {
            case 0:
                AbstractC3367j.m5100e(context, "context");
                return AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "diag_ping_use_speed_dns", false);
            case 1:
                AbstractC3367j.m5100e(context, "context");
                return AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "diag_trace_use_speed_dns", false);
            case 2:
                AbstractC3367j.m5100e(context, "context");
                String string = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_ping_network_id", "");
                if (string != null) {
                    str3 = string;
                }
                return AbstractC2418w.m3980x(str3);
            case 3:
                AbstractC3367j.m5100e(context, "context");
                String string2 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_trace_network_id", "");
                if (string2 != null) {
                    str3 = string2;
                }
                return AbstractC2418w.m3980x(str3);
            case 4:
                AbstractC3367j.m5100e(context, "context");
                String string3 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_dns_network_id", "");
                if (string3 != null) {
                    str3 = string3;
                }
                return AbstractC2418w.m3980x(str3);
            case AbstractC3122c.f15761f /* 5 */:
                AbstractC3367j.m5100e(context, "context");
                String string4 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_nat_network_id", "");
                if (string4 != null) {
                    str3 = string4;
                }
                return AbstractC2418w.m3980x(str3);
            case AbstractC3122c.f15759d /* 6 */:
                AbstractC3367j.m5100e(context, "context");
                String string5 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_session_limit_network_id", "");
                if (string5 != null) {
                    str3 = string5;
                }
                return AbstractC2418w.m3980x(str3);
            case 7:
                String str4 = "CLIENT";
                AbstractC3367j.m5100e(context, "context");
                try {
                    String string6 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_iperf3_role", "CLIENT");
                    if (string6 != null) {
                        str4 = string6;
                    }
                    m2985m = EnumC1363vc.valueOf(str4);
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                if (m2985m instanceof C1689h) {
                    m2985m = EnumC1363vc.f8155g;
                }
                return AbstractC2418w.m3980x((EnumC1363vc) m2985m);
            case 8:
                String str5 = "RFC5780";
                AbstractC3367j.m5100e(context, "context");
                try {
                    String string7 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_nat_rfc_mode", "RFC5780");
                    if (string7 != null) {
                        str5 = string7;
                    }
                    m2985m2 = EnumC1495zk.valueOf(str5);
                } catch (Throwable th2) {
                    m2985m2 = AbstractC1793a0.m2985m(th2);
                }
                if (m2985m2 instanceof C1689h) {
                    m2985m2 = EnumC1495zk.f9911g;
                }
                return AbstractC2418w.m3980x((EnumC1495zk) m2985m2);
            case AbstractC3122c.f15758c /* 9 */:
                String str6 = "DUAL_STACK";
                AbstractC3367j.m5100e(context, "context");
                try {
                    String string8 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_nat_address_family", "DUAL_STACK");
                    if (string8 != null) {
                        str6 = string8;
                    }
                    m2985m3 = EnumC1402wk.valueOf(str6);
                } catch (Throwable th3) {
                    m2985m3 = AbstractC1793a0.m2985m(th3);
                }
                if (m2985m3 instanceof C1689h) {
                    m2985m3 = EnumC1402wk.f8483f;
                }
                return AbstractC2418w.m3980x((EnumC1402wk) m2985m3);
            case AbstractC3122c.f15760e /* 10 */:
                AbstractC3367j.m5100e(context, "context");
                String string9 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_nat_transport", "UDP");
                if (string9 != null) {
                    str3 = string9;
                }
                List m948l0 = AbstractC0444k.m948l0(str3, new char[]{',', ';', '|', '\n'});
                ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(m948l0));
                Iterator it = m948l0.iterator();
                while (it.hasNext()) {
                    AbstractC0094y0.m191r((String) it.next(), arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    if (!AbstractC0444k.m937a0((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                Set m3038F0 = AbstractC1805m.m3038F0(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = EnumC0748bl.f2841i.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (m3038F0.contains(((EnumC0748bl) next).name())) {
                        arrayList3.add(next);
                    }
                }
                boolean isEmpty = arrayList3.isEmpty();
                Collection collection = arrayList3;
                if (isEmpty) {
                    collection = AbstractC3784a.m5817z(EnumC0748bl.f2838f);
                }
                ArrayList arrayList4 = new ArrayList(AbstractC1807o.m3073U(collection));
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((EnumC0748bl) it3.next()).name());
                }
                return AbstractC2418w.m3980x(arrayList4);
            case 11:
                AbstractC3367j.m5100e(context, "context");
                return AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "diag_nat_use_speed_dns", false);
            case 12:
                AbstractC3367j.m5100e(context, "context");
                String str7 = "2500";
                String string10 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_nat_timeout_ms", "2500");
                if (string10 != null) {
                    str7 = string10;
                }
                return AbstractC2418w.m3980x(str7);
            case 13:
                AbstractC3367j.m5100e(context, "context");
                String string11 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_session_limit_target", "");
                if (string11 != null) {
                    str3 = string11;
                }
                return AbstractC2418w.m3980x(str3);
            case 14:
                AbstractC3367j.m5100e(context, "context");
                String str8 = "443";
                String string12 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_session_limit_port", "443");
                if (string12 != null) {
                    str8 = string12;
                }
                return AbstractC2418w.m3980x(str8);
            case AbstractC3122c.f15762g /* 15 */:
                AbstractC3367j.m5100e(context, "context");
                String str9 = "65535";
                String string13 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_session_limit_max", "65535");
                if (string13 != null) {
                    str9 = string13;
                }
                return AbstractC2418w.m3980x(str9);
            case 16:
                AbstractC3367j.m5100e(context, "context");
                String string14 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_session_limit_batch", "100");
                if (string14 != null) {
                    str = string14;
                }
                return AbstractC2418w.m3980x(str);
            case 17:
                AbstractC3367j.m5100e(context, "context");
                String str10 = "5000";
                String string15 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_session_limit_timeout_ms", "5000");
                if (string15 != null) {
                    str10 = string15;
                }
                return AbstractC2418w.m3980x(str10);
            case 18:
                AbstractC3367j.m5100e(context, "context");
                String str11 = "200";
                String string16 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_session_limit_failure_threshold", "200");
                if (string16 != null) {
                    str11 = string16;
                }
                return AbstractC2418w.m3980x(str11);
            case 19:
                AbstractC3367j.m5100e(context, "context");
                String string17 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_session_limit_launch_delay_ms", "100");
                if (string17 != null) {
                    str = string17;
                }
                return AbstractC2418w.m3980x(str);
            case 20:
                AbstractC3367j.m5100e(context, "context");
                return AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "diag_session_limit_use_speed_dns", false);
            case 21:
                AbstractC3367j.m5100e(context, "context");
                String str12 = "www.baidu.com";
                String string18 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_dns_query", "www.baidu.com");
                if (string18 != null) {
                    str12 = string18;
                }
                return AbstractC2418w.m3980x(str12);
            case 22:
                AbstractC3367j.m5100e(context, "context");
                return AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "diag_dns_use_speed_dns", true);
            case 23:
                AbstractC3367j.m5100e(context, "context");
                return AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "diag_dns_use_speed_ecs", true);
            case 24:
                AbstractC3367j.m5100e(context, "context");
                return AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "diag_dns_page_dns_enabled", false);
            case 25:
                AbstractC3367j.m5100e(context, "context");
                return AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "diag_dns_page_ecs_enabled", false);
            case 26:
                AbstractC3367j.m5100e(context, "context");
                String string19 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_iperf3_server_port", "5201");
                if (string19 != null) {
                    str2 = string19;
                }
                return AbstractC2418w.m3980x(str2);
            case 27:
                AbstractC3367j.m5100e(context, "context");
                return AbstractC2418w.m3980x(Boolean.valueOf(context.getSharedPreferences("speed_test_profiles", 0).getBoolean("diag_section_expanded_".concat("iperf3_params"), false)));
            case 28:
                AbstractC3367j.m5100e(context, "context");
                String string20 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_iperf3_client_host", "");
                if (string20 != null) {
                    str3 = string20;
                }
                return AbstractC2418w.m3980x(str3);
            default:
                AbstractC3367j.m5100e(context, "context");
                String string21 = context.getSharedPreferences("speed_test_profiles", 0).getString("diag_iperf3_client_port", "5201");
                if (string21 != null) {
                    str2 = string21;
                }
                return AbstractC2418w.m3980x(str2);
        }
    }
}
