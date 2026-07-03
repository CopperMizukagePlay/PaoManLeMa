package p042f1;

import p073j2.AbstractC2168e;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f1.p */
/* loaded from: classes.dex */
public final class C1529p extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f10064f;

    /* renamed from: g */
    public final /* synthetic */ C1530q f10065g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1529p(C1530q c1530q, int i7) {
        super(1);
        this.f10064f = i7;
        this.f10065g = c1530q;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f10064f) {
            case 0:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f10065g.f10077n.mo1297c(AbstractC2168e.m3528o(doubleValue, r10.f10068e, r10.f10069f)));
            default:
                return Double.valueOf(AbstractC2168e.m3528o(this.f10065g.f10074k.mo1297c(((Number) obj).doubleValue()), r10.f10068e, r10.f10069f));
        }
    }
}
