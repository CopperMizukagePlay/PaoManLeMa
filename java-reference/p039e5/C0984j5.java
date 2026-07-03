package p039e5;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import p053g5.C1694m;
import p085l0.InterfaceC2425y0;
import p144t.AbstractC3122c;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3365h;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.j5 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0984j5 extends AbstractC3365h implements InterfaceC3277a {

    /* renamed from: m */
    public final /* synthetic */ int f5026m;

    /* renamed from: n */
    public final /* synthetic */ Context f5027n;

    /* renamed from: o */
    public final /* synthetic */ InterfaceC2425y0 f5028o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0984j5(Context context, InterfaceC2425y0 interfaceC2425y0, int i7) {
        super(0, AbstractC3366i.class, "refreshNetworkTargets", "DiagnosticsTab$refreshNetworkTargets(Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f5026m = i7;
        switch (i7) {
            case 1:
                this.f5027n = context;
                this.f5028o = interfaceC2425y0;
                super(0, AbstractC3366i.class, "refreshNetworkTargets", "DiagnosticsTab$refreshNetworkTargets(Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V", 0);
                return;
            case 2:
                this.f5027n = context;
                this.f5028o = interfaceC2425y0;
                super(0, AbstractC3366i.class, "refreshNetworkTargets", "DiagnosticsTab$refreshNetworkTargets(Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V", 0);
                return;
            case 3:
                this.f5027n = context;
                this.f5028o = interfaceC2425y0;
                super(0, AbstractC3366i.class, "refreshNetworkTargets", "DiagnosticsTab$refreshNetworkTargets(Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V", 0);
                return;
            case 4:
                this.f5027n = context;
                this.f5028o = interfaceC2425y0;
                super(0, AbstractC3366i.class, "refreshNetworkTargets", "DiagnosticsTab$refreshNetworkTargets(Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V", 0);
                return;
            case AbstractC3122c.f15761f /* 5 */:
                this.f5027n = context;
                this.f5028o = interfaceC2425y0;
                super(0, AbstractC3366i.class, "copyReport", "NetworkInterfaceDebugDialog$copyReport(Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V", 0);
                return;
            default:
                this.f5027n = context;
                this.f5028o = interfaceC2425y0;
                return;
        }
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f5026m;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f5028o;
        Context context = this.f5027n;
        switch (i7) {
            case 0:
                AbstractC1172p7.m2043T(context, interfaceC2425y0);
                return c1694m;
            case 1:
                AbstractC1172p7.m2043T(context, interfaceC2425y0);
                return c1694m;
            case 2:
                AbstractC1172p7.m2043T(context, interfaceC2425y0);
                return c1694m;
            case 3:
                AbstractC1172p7.m2043T(context, interfaceC2425y0);
                return c1694m;
            case 4:
                AbstractC1172p7.m2043T(context, interfaceC2425y0);
                return c1694m;
            default:
                C3137j0 c3137j0 = AbstractC0945hr.f4635a;
                Object systemService = context.getSystemService("clipboard");
                AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("HBCS 网络接口 Debug", (String) interfaceC2425y0.getValue()));
                Toast.makeText(context, "已复制到剪贴板", 0).show();
                return c1694m;
        }
    }
}
