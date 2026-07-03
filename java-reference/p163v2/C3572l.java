package p163v2;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import p085l0.C2387n;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p153u0.InterfaceC3338e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.InterfaceC3524n1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v2.l */
/* loaded from: classes.dex */
public final class C3572l extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ Context f17168f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f17169g;

    /* renamed from: h */
    public final /* synthetic */ C2387n f17170h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3338e f17171i;

    /* renamed from: j */
    public final /* synthetic */ int f17172j;

    /* renamed from: k */
    public final /* synthetic */ View f17173k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3572l(Context context, InterfaceC3279c interfaceC3279c, C2387n c2387n, InterfaceC3338e interfaceC3338e, int i7, View view) {
        super(0);
        this.f17168f = context;
        this.f17169g = interfaceC3279c;
        this.f17170h = c2387n;
        this.f17171i = interfaceC3338e;
        this.f17172j = i7;
        this.f17173k = view;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        KeyEvent.Callback callback = this.f17173k;
        AbstractC3367j.m5098c(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new C3576p(this.f17168f, this.f17169g, this.f17170h, this.f17171i, this.f17172j, (InterfaceC3524n1) callback).getLayoutNode();
    }
}
