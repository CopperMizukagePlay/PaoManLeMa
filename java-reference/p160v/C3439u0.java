package p160v;

import p001a0.AbstractC0094y0;
import p032d6.AbstractC0525d0;
import p063i0.C1848a5;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.u0 */
/* loaded from: classes.dex */
public final class C3439u0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f16619f;

    /* renamed from: g */
    public final /* synthetic */ C3441v0 f16620g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3439u0(C3441v0 c3441v0, int i7) {
        super(1);
        this.f16619f = i7;
        this.f16620g = c3441v0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f16619f) {
            case 0:
                InterfaceC3413h0 interfaceC3413h0 = (InterfaceC3413h0) this.f16620g.f16624s.mo52a();
                int mo5055a = interfaceC3413h0.mo5055a();
                int i7 = 0;
                while (true) {
                    if (i7 < mo5055a) {
                        if (!interfaceC3413h0.mo5057c(i7).equals(obj)) {
                            i7++;
                        }
                    } else {
                        i7 = -1;
                    }
                }
                return Integer.valueOf(i7);
            default:
                int intValue = ((Number) obj).intValue();
                C3441v0 c3441v0 = this.f16620g;
                InterfaceC3413h0 interfaceC3413h02 = (InterfaceC3413h0) c3441v0.f16624s.mo52a();
                if (intValue >= 0 && intValue < interfaceC3413h02.mo5055a()) {
                    AbstractC0525d0.m1141s(c3441v0.m5830y0(), null, new C1848a5(c3441v0, intValue, null, 1), 3);
                    return Boolean.TRUE;
                }
                StringBuilder m188o = AbstractC0094y0.m188o(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                m188o.append(interfaceC3413h02.mo5055a());
                m188o.append(')');
                throw new IllegalArgumentException(m188o.toString().toString());
        }
    }
}
