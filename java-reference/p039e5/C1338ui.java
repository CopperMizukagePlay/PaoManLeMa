package p039e5;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.paoman.lema.KeepAliveService;
import p001a0.AbstractC0094y0;
import p017c.C0328m;
import p053g5.C1694m;
import p068i5.AbstractC2080d;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ui */
/* loaded from: classes.dex */
public final /* synthetic */ class C1338ui implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f7943e = 1;

    /* renamed from: f */
    public final /* synthetic */ Context f7944f;

    /* renamed from: g */
    public final /* synthetic */ C0328m f7945g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f7946h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f7947i;

    public /* synthetic */ C1338ui(Context context, C0328m c0328m, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02) {
        this.f7944f = context;
        this.f7945g = c0328m;
        this.f7946h = interfaceC2425y0;
        this.f7947i = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        String str;
        int i7 = this.f7943e;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f7947i;
        InterfaceC2425y0 interfaceC2425y02 = this.f7946h;
        C0328m c0328m = this.f7945g;
        Context context = this.f7944f;
        Boolean bool = (Boolean) obj;
        switch (i7) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                if (booleanValue && Build.VERSION.SDK_INT >= 33) {
                    c0328m.m675K("android.permission.POST_NOTIFICATIONS");
                } else {
                    float f7 = AbstractC1092mk.f5952h;
                    AbstractC0094y0.m178e(interfaceC2425y02, bool, context, "speed_test_profiles", 0).putBoolean("notification_keep_alive", booleanValue).apply();
                    Intent intent = new Intent(context, (Class<?>) KeepAliveService.class);
                    if (booleanValue) {
                        str = "com.paoman.lema.keepalive.START";
                    } else {
                        str = "com.paoman.lema.keepalive.STOP";
                    }
                    intent.setAction(str);
                    intent.putExtra("silent_audio_keep_alive", ((Boolean) interfaceC2425y0.getValue()).booleanValue());
                    context.startService(intent);
                }
                return c1694m;
            default:
                if (bool.booleanValue()) {
                    if (AbstractC2080d.m3395h(context.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        AbstractC1092mk.m1812k0(interfaceC2425y02, true);
                        context.getSharedPreferences("speed_test_profiles", 0).edit().putBoolean("wifi_ssid_display_enabled", true).apply();
                    } else {
                        float f8 = AbstractC1092mk.f5952h;
                        interfaceC2425y0.setValue(Boolean.TRUE);
                        c0328m.m675K("android.permission.ACCESS_FINE_LOCATION");
                    }
                } else {
                    float f9 = AbstractC1092mk.f5952h;
                    interfaceC2425y0.setValue(Boolean.FALSE);
                    AbstractC1092mk.m1812k0(interfaceC2425y02, false);
                    context.getSharedPreferences("speed_test_profiles", 0).edit().putBoolean("wifi_ssid_display_enabled", false).apply();
                }
                return c1694m;
        }
    }

    public /* synthetic */ C1338ui(C0328m c0328m, Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02) {
        this.f7945g = c0328m;
        this.f7944f = context;
        this.f7946h = interfaceC2425y0;
        this.f7947i = interfaceC2425y02;
    }
}
