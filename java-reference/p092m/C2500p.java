package p092m;

import p067i4.AbstractC2072e;
import p140s2.C3102l;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.p */
/* loaded from: classes.dex */
public final class C2500p extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f13823f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3279c f13824g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2500p(InterfaceC3279c interfaceC3279c, int i7) {
        super(1);
        this.f13823f = i7;
        this.f13824g = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f13823f) {
            case 0:
                long j6 = ((C3102l) obj).f15702a;
                return new C3102l(AbstractC2072e.m3326b(((Number) this.f13824g.mo23f(Integer.valueOf((int) (j6 >> 32)))).intValue(), (int) (j6 & 4294967295L)));
            default:
                long j7 = ((C3102l) obj).f15702a;
                return new C3102l(AbstractC2072e.m3326b(((Number) this.f13824g.mo23f(Integer.valueOf((int) (j7 >> 32)))).intValue(), (int) (j7 & 4294967295L)));
        }
    }
}
