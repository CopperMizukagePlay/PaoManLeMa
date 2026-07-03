package p162v1;

import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p154u1.InterfaceC3347c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3808p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.b */
/* loaded from: classes.dex */
public final class C3484b extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f16786f;

    /* renamed from: g */
    public final /* synthetic */ C3488c f16787g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3484b(C3488c c3488c, int i7) {
        super(0);
        this.f16786f = i7;
        this.f16787g = c3488c;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f16786f) {
            case 0:
                this.f16787g.m5299M0();
                return C1694m.f10482a;
            default:
                C3488c c3488c = this.f16787g;
                InterfaceC3808p interfaceC3808p = c3488c.f16788s;
                AbstractC3367j.m5098c(interfaceC3808p, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((InterfaceC3347c) interfaceC3808p).mo4819c(c3488c);
                return C1694m.f10482a;
        }
    }
}
