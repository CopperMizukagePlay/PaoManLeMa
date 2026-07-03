package p039e5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.paoman.lema.FloatingSpeedService;
import java.util.ArrayList;
import p053g5.C1694m;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ki */
/* loaded from: classes.dex */
public final /* synthetic */ class C1028ki implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f5282e = 0;

    /* renamed from: f */
    public final /* synthetic */ Context f5283f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f5284g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f5285h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f5286i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2425y0 f5287j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f5288k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2425y0 f5289l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC2425y0 f5290m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC2425y0 f5291n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2425y0 f5292o;

    /* renamed from: p */
    public final /* synthetic */ Object f5293p;

    public /* synthetic */ C1028ki(Context context, C1189po c1189po, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06, InterfaceC2425y0 interfaceC2425y07, InterfaceC2425y0 interfaceC2425y08, InterfaceC2425y0 interfaceC2425y09, InterfaceC2425y0 interfaceC2425y010) {
        this.f5283f = context;
        this.f5293p = c1189po;
        this.f5284g = interfaceC2425y0;
        this.f5285h = interfaceC2425y02;
        this.f5286i = interfaceC2425y03;
        this.f5287j = interfaceC2425y04;
        this.f5288k = interfaceC2425y05;
        this.f5289l = interfaceC2425y07;
        this.f5290m = interfaceC2425y08;
        this.f5291n = interfaceC2425y09;
        this.f5292o = interfaceC2425y010;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        boolean z7;
        Long m1880x3;
        int i7 = this.f5282e;
        C1694m c1694m = C1694m.f10482a;
        boolean z8 = false;
        Object obj = this.f5293p;
        InterfaceC2425y0 interfaceC2425y0 = this.f5292o;
        InterfaceC2425y0 interfaceC2425y02 = this.f5291n;
        InterfaceC2425y0 interfaceC2425y03 = this.f5290m;
        InterfaceC2425y0 interfaceC2425y04 = this.f5289l;
        InterfaceC2425y0 interfaceC2425y05 = this.f5288k;
        InterfaceC2425y0 interfaceC2425y06 = this.f5287j;
        InterfaceC2425y0 interfaceC2425y07 = this.f5286i;
        InterfaceC2425y0 interfaceC2425y08 = this.f5285h;
        InterfaceC2425y0 interfaceC2425y09 = this.f5284g;
        Context context = this.f5283f;
        switch (i7) {
            case 0:
                C1189po c1189po = (C1189po) obj;
                float f7 = AbstractC1092mk.f5952h;
                if (((Boolean) interfaceC2425y09.getValue()).booleanValue()) {
                    Intent intent = new Intent(context, (Class<?>) FloatingSpeedService.class);
                    intent.setAction("com.paoman.lema.FLOATING_STOP");
                    context.startService(intent);
                    interfaceC2425y09.setValue(Boolean.FALSE);
                } else if (c1189po == null) {
                    Toast.makeText(context, "请先导入或新增配置", 0).show();
                    interfaceC2425y08.setValue(EnumC1123nk.f6333k);
                } else {
                    boolean booleanValue = ((Boolean) interfaceC2425y07.getValue()).booleanValue();
                    if (((Boolean) interfaceC2425y06.getValue()).booleanValue() && !AbstractC1092mk.m1777d0(interfaceC2425y05)) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean booleanValue2 = ((Boolean) interfaceC2425y04.getValue()).booleanValue();
                    String str = (String) interfaceC2425y03.getValue();
                    long j6 = 0;
                    if (((Boolean) interfaceC2425y02.getValue()).booleanValue() && (m1880x3 = AbstractC1092mk.m1880x3((String) interfaceC2425y0.getValue())) != null) {
                        j6 = m1880x3.longValue();
                    }
                    long j7 = j6;
                    if (!AbstractC1092mk.m1815k3(context)) {
                        context.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName())).addFlags(268435456));
                    } else {
                        Intent intent2 = new Intent(context, (Class<?>) FloatingSpeedService.class);
                        intent2.putStringArrayListExtra("download_urls", new ArrayList<>(c1189po.m2081b()));
                        intent2.putStringArrayListExtra("upload_urls", new ArrayList<>(c1189po.m2083d()));
                        intent2.putExtra("use_root_stats", booleanValue);
                        intent2.putExtra("high_throughput_mode", z7);
                        intent2.putExtra("extreme_mode", false);
                        intent2.putExtra("sample_interval", str);
                        intent2.putExtra("redirect_enhancement_mode", booleanValue2);
                        intent2.putExtra("duration_millis", j7);
                        context.startService(intent2);
                        z8 = true;
                    }
                    interfaceC2425y09.setValue(Boolean.valueOf(z8));
                }
                return c1694m;
            default:
                InterfaceC2425y0 interfaceC2425y010 = (InterfaceC2425y0) obj;
                float f8 = AbstractC1092mk.f5952h;
                interfaceC2425y09.setValue("12");
                interfaceC2425y08.setValue("20");
                interfaceC2425y07.setValue("4");
                interfaceC2425y06.setValue("10");
                interfaceC2425y05.setValue("10");
                interfaceC2425y04.setValue("10");
                interfaceC2425y03.setValue("32");
                interfaceC2425y02.setValue("256");
                interfaceC2425y0.setValue(Boolean.FALSE);
                interfaceC2425y010.setValue("40000");
                context.getSharedPreferences("speed_test_profiles", 0).edit().putString("tuning_download_min_workers", (String) interfaceC2425y09.getValue()).putString("tuning_download_max_workers", (String) interfaceC2425y08.getValue()).putString("tuning_upload_min_workers", (String) interfaceC2425y07.getValue()).putString("tuning_upload_max_workers", (String) interfaceC2425y06.getValue()).putString("tuning_download_buffer_kb", (String) interfaceC2425y05.getValue()).putString("tuning_upload_buffer_kb", (String) interfaceC2425y04.getValue()).putString("tuning_high_throughput_worker_budget", (String) interfaceC2425y03.getValue()).putString("tuning_max_worker_threads", (String) interfaceC2425y02.getValue()).putBoolean("single_local_port_mode_enabled", ((Boolean) interfaceC2425y0.getValue()).booleanValue()).putString("single_local_port", (String) interfaceC2425y010.getValue()).apply();
                return c1694m;
        }
    }

    public /* synthetic */ C1028ki(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06, InterfaceC2425y0 interfaceC2425y07, InterfaceC2425y0 interfaceC2425y08, InterfaceC2425y0 interfaceC2425y09, InterfaceC2425y0 interfaceC2425y010) {
        this.f5283f = context;
        this.f5284g = interfaceC2425y0;
        this.f5285h = interfaceC2425y02;
        this.f5286i = interfaceC2425y03;
        this.f5287j = interfaceC2425y04;
        this.f5288k = interfaceC2425y05;
        this.f5289l = interfaceC2425y06;
        this.f5290m = interfaceC2425y07;
        this.f5291n = interfaceC2425y08;
        this.f5292o = interfaceC2425y09;
        this.f5293p = interfaceC2425y010;
    }
}
