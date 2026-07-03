package p099m6;

import java.util.List;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.p */
/* loaded from: classes.dex */
public final class C2615p extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f14135f;

    /* renamed from: g */
    public final /* synthetic */ List f14136g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2615p(int i7, List list) {
        super(0);
        this.f14135f = i7;
        this.f14136g = list;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f14135f) {
            case 0:
                return this.f14136g;
            default:
                Object obj = this.f14136g.get(2);
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
        }
    }
}
