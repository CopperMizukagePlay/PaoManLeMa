package p039e5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import p024c6.AbstractC0444k;
import p053g5.C1690i;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ij */
/* loaded from: classes.dex */
public final /* synthetic */ class C0968ij implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f4904e = 1;

    /* renamed from: f */
    public final /* synthetic */ Context f4905f;

    /* renamed from: g */
    public final /* synthetic */ C1227r0 f4906g;

    public /* synthetic */ C0968ij(Context context, C1227r0 c1227r0) {
        this.f4905f = context;
        this.f4906g = c1227r0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        Object m2985m;
        int i7 = this.f4904e;
        C1694m c1694m = C1694m.f10482a;
        C1227r0 c1227r0 = this.f4906g;
        Context context = this.f4905f;
        switch (i7) {
            case 0:
                float f7 = AbstractC1092mk.f5952h;
                try {
                    C1238rb c1238rb = C1238rb.f7307a;
                    C1238rb.m2168i(context, c1227r0);
                    m2985m = c1694m;
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                Throwable m2747a = C1690i.m2747a(m2985m);
                if (m2747a != null) {
                    String message = m2747a.getMessage();
                    if (message == null) {
                        message = "安装失败";
                    }
                    Toast.makeText(context, message, 0).show();
                }
                return c1694m;
            default:
                C1238rb c1238rb2 = C1238rb.f7307a;
                AbstractC3367j.m5100e(context, "context");
                AbstractC3367j.m5100e(c1227r0, "info");
                String str = c1227r0.f7195c;
                if (AbstractC0444k.m937a0(str)) {
                    str = "https://github.com/yuliwen2003-max/PaoManLeMa_Release/releases";
                }
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
                return c1694m;
        }
    }

    public /* synthetic */ C0968ij(C1227r0 c1227r0, Context context) {
        this.f4906g = c1227r0;
        this.f4905f = context;
    }
}
