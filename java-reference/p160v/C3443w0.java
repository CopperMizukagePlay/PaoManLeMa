package p160v;

import java.util.Map;
import p150t5.InterfaceC3279c;
import p153u0.InterfaceC3338e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.w0 */
/* loaded from: classes.dex */
public final class C3443w0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f16634f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3338e f16635g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3443w0(InterfaceC3338e interfaceC3338e, int i7) {
        super(1);
        this.f16634f = i7;
        this.f16635g = interfaceC3338e;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        boolean z7;
        switch (this.f16634f) {
            case 0:
                InterfaceC3338e interfaceC3338e = this.f16635g;
                if (interfaceC3338e != null) {
                    z7 = interfaceC3338e.mo5074c(obj);
                } else {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            default:
                return new C3447y0(this.f16635g, (Map) obj);
        }
    }
}
