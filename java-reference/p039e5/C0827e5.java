package p039e5;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import p017c.C0328m;
import p053g5.C1694m;
import p085l0.InterfaceC2425y0;
import p144t.C3137j0;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3365h;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3497e1;
import p176x.C3791f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.e5 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0827e5 extends AbstractC3365h implements InterfaceC3277a {

    /* renamed from: m */
    public final /* synthetic */ int f3631m = 1;

    /* renamed from: n */
    public final /* synthetic */ Object f3632n;

    /* renamed from: o */
    public final /* synthetic */ Object f3633o;

    /* renamed from: p */
    public final /* synthetic */ Object f3634p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0827e5(Context context, C0328m c0328m, InterfaceC2425y0 interfaceC2425y0) {
        super(0, AbstractC3366i.class, "onScanClick", "Iperf3Panel$onScanClick(Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f3632n = context;
        this.f3634p = c0328m;
        this.f3633o = interfaceC2425y0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Type inference failed for: r3v5, types: [t5.a, u5.k] */
    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo52a() {
        String str;
        ClipData.Item itemAt;
        CharSequence coerceToText;
        int i7 = this.f3631m;
        C1694m c1694m = C1694m.f10482a;
        Object obj = this.f3633o;
        Object obj2 = this.f3632n;
        Object obj3 = this.f3634p;
        switch (i7) {
            case 0:
                Context context = (Context) obj2;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj;
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                if (!((C1394wc) obj3).f8326b) {
                    EnumC1363vc enumC1363vc = (EnumC1363vc) interfaceC2425y0.getValue();
                    EnumC1363vc enumC1363vc2 = EnumC1363vc.f8155g;
                    if (enumC1363vc == enumC1363vc2) {
                        enumC1363vc2 = EnumC1363vc.f8154f;
                    }
                    interfaceC2425y0.setValue(enumC1363vc2);
                    context.getSharedPreferences("speed_test_profiles", 0).edit().putString("diag_iperf3_role", enumC1363vc2.name()).apply();
                }
                return c1694m;
            case 1:
                C0328m c0328m = (C0328m) obj3;
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) obj;
                C3137j0 c3137j02 = AbstractC1302td.f7786a;
                if (((Context) obj2).checkSelfPermission("android.permission.CAMERA") == 0) {
                    interfaceC2425y02.setValue(Boolean.TRUE);
                } else {
                    c0328m.m675K("android.permission.CAMERA");
                }
                return c1694m;
            case 2:
                Context context2 = (Context) obj2;
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) obj;
                InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) obj3;
                C3137j0 c3137j03 = AbstractC0945hr.f4635a;
                Object systemService = context2.getSystemService("clipboard");
                AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
                if (primaryClip != null) {
                    if (primaryClip.getItemCount() <= 0) {
                        primaryClip = null;
                    }
                    if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null && (coerceToText = itemAt.coerceToText(context2)) != null) {
                        str = coerceToText.toString();
                        if (str == null) {
                            str = "";
                        }
                        interfaceC2425y03.setValue(str);
                        interfaceC2425y04.setValue(null);
                        return c1694m;
                    }
                }
                str = null;
                if (str == null) {
                }
                interfaceC2425y03.setValue(str);
                interfaceC2425y04.setValue(null);
                return c1694m;
            default:
                return C3791f.m5820K0((C3791f) obj3, (AbstractC3497e1) obj2, (AbstractC3368k) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0827e5(Context context, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02) {
        super(0, AbstractC3366i.class, "fillFromClipboard", "DnsEcsSubnetPasteImportDialog$fillFromClipboard(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f3632n = context;
        this.f3633o = interfaceC2425y0;
        this.f3634p = interfaceC2425y02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0827e5(C1394wc c1394wc, Context context, InterfaceC2425y0 interfaceC2425y0) {
        super(0, AbstractC3366i.class, "toggleIperf3Role", "DiagnosticsTab$toggleIperf3Role(Lcom/paoman/lema/Iperf3Snapshot;Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f3634p = c1394wc;
        this.f3632n = context;
        this.f3633o = interfaceC2425y0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0827e5(C3791f c3791f, AbstractC3497e1 abstractC3497e1, InterfaceC3277a interfaceC3277a) {
        super(0, AbstractC3366i.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f3634p = c3791f;
        this.f3632n = abstractC3497e1;
        this.f3633o = (AbstractC3368k) interfaceC3277a;
    }
}
