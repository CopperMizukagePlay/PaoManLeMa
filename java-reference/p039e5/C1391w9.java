package p039e5;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import p053g5.C1694m;
import p060h5.C1813u;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.w9 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1391w9 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f8315e;

    /* renamed from: f */
    public final /* synthetic */ Context f8316f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f8317g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f8318h;

    public /* synthetic */ C1391w9(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, int i7) {
        this.f8315e = i7;
        this.f8316f = context;
        this.f8317g = interfaceC2425y0;
        this.f8318h = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        String str;
        ClipData.Item itemAt;
        CharSequence coerceToText;
        int i7 = this.f8315e;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f8318h;
        InterfaceC2425y0 interfaceC2425y02 = this.f8317g;
        Context context = this.f8316f;
        switch (i7) {
            case 0:
                Object systemService = context.getSystemService("clipboard");
                AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
                if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null && (coerceToText = itemAt.coerceToText(context)) != null) {
                    str = coerceToText.toString();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                interfaceC2425y02.setValue(str);
                interfaceC2425y0.setValue(C1813u.f10860e);
                return c1694m;
            default:
                AtomicBoolean atomicBoolean = AbstractC0697a2.f2310a;
                AbstractC3367j.m5100e(context, "context");
                File[] listFiles = new File(context.getFilesDir(), "crash_logs").listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isFile()) {
                            file.delete();
                        }
                    }
                }
                context.getSharedPreferences("crash_log_prefs", 0).edit().putBoolean("pending_crash", false).apply();
                C3137j0 c3137j0 = AbstractC0945hr.f4635a;
                interfaceC2425y02.setValue(AbstractC0697a2.m1490c(context));
                interfaceC2425y0.setValue(Boolean.FALSE);
                Toast.makeText(context, "崩溃日志已清空", 0).show();
                return c1694m;
        }
    }
}
