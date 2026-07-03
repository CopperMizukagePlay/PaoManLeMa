package p039e5;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import java.util.List;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3470q;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.i8 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0958i8 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f4776e;

    /* renamed from: f */
    public final /* synthetic */ Context f4777f;

    /* renamed from: g */
    public final /* synthetic */ C3469p f4778g;

    public /* synthetic */ C0958i8(Context context, C3469p c3469p) {
        this.f4776e = 1;
        this.f4777f = context;
        this.f4778g = c3469p;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        String str;
        ClipData.Item itemAt;
        CharSequence coerceToText;
        switch (this.f4776e) {
            case 0:
                C3469p c3469p = this.f4778g;
                c3469p.add("");
                AbstractC1328u8.m2362g(this.f4777f, c3469p);
                return C1694m.f10482a;
            case 1:
                Context context = this.f4777f;
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
                C1327u7 m2369b = AbstractC1358v7.m2369b(str);
                String str2 = m2369b.f7897c;
                List list = m2369b.f7895a;
                if (!list.isEmpty() && str2 == null) {
                    C3469p c3469p2 = this.f4778g;
                    c3469p2.addAll(list);
                    AbstractC1249rm.m2216E0(context, AbstractC3470q.m5264e(c3469p2).f16763c);
                    Toast.makeText(context, "已导入 " + list.size() + " 条 Subnet", 0).show();
                } else {
                    if (str2 == null) {
                        str2 = "导入失败";
                    }
                    Toast.makeText(context, str2, 0).show();
                }
                return C1694m.f10482a;
            default:
                C3469p c3469p3 = this.f4778g;
                c3469p3.clear();
                AbstractC1092mk.m1732S2(this.f4777f, c3469p3);
                return C1694m.f10482a;
        }
    }

    public /* synthetic */ C0958i8(C3469p c3469p, Context context, int i7) {
        this.f4776e = i7;
        this.f4778g = c3469p;
        this.f4777f = context;
    }
}
