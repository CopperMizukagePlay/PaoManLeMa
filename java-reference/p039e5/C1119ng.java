package p039e5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0434a;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p135r5.AbstractC3063j;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ng */
/* loaded from: classes.dex */
public final /* synthetic */ class C1119ng implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f6250e;

    /* renamed from: f */
    public final /* synthetic */ Context f6251f;

    public /* synthetic */ C1119ng(Context context, int i7) {
        this.f6250e = i7;
        this.f6251f = context;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f6250e;
        C1694m c1694m = C1694m.f10482a;
        Context context = this.f6251f;
        switch (i7) {
            case 0:
                return AbstractC0094y0.m190q(context, "speed_test_profiles", 0, "ping_continuous", false);
            case 1:
                float f7 = AbstractC1092mk.f5952h;
                Object systemService = context.getSystemService("power");
                AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                if (((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName())) {
                    Toast.makeText(context, "已处于后台无限制状态", 0).show();
                } else {
                    context.startActivity(new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", Uri.parse("package:" + context.getPackageName())).addFlags(268435456));
                }
                return c1694m;
            default:
                C3137j0 c3137j0 = AbstractC0945hr.f4635a;
                if (AbstractC0697a2.m1490c(context).isEmpty()) {
                    Toast.makeText(context, "暂无崩溃日志", 0).show();
                } else {
                    File file = new File(context.getCacheDir(), "crash_exports");
                    file.mkdirs();
                    File file2 = new File(file, "hbcs_crash_logs_" + System.currentTimeMillis() + ".txt");
                    AbstractC3063j.m4738O(file2, AbstractC0697a2.m1489b(context), AbstractC0434a.f1477a);
                    Uri m408d = FileProvider.m408d(context, context.getPackageName() + ".fileprovider", file2);
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.SUBJECT", file2.getName());
                    intent.putExtra("android.intent.extra.STREAM", m408d);
                    intent.putExtra("android.intent.extra.TEXT", AbstractC0444k.m955s0(AbstractC0697a2.m1489b(context), 4000));
                    intent.addFlags(1);
                    context.startActivity(Intent.createChooser(intent, "导出崩溃日志"));
                }
                return c1694m;
        }
    }
}
