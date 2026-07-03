package p107o;

import p027d1.C0464b;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.w */
/* loaded from: classes.dex */
public final class C2783w extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f14777f;

    /* renamed from: g */
    public final /* synthetic */ C2785x f14778g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2783w(C2785x c2785x, int i7) {
        super(1);
        this.f14777f = i7;
        this.f14778g = c2785x;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f14777f) {
            case 0:
                long j6 = ((C0464b) obj).f1623a;
                InterfaceC3277a interfaceC3277a = this.f14778g.f14790M;
                if (interfaceC3277a != null) {
                    interfaceC3277a.mo52a();
                }
                return C1694m.f10482a;
            default:
                long j7 = ((C0464b) obj).f1623a;
                C2785x c2785x = this.f14778g;
                if (c2785x.f14642y) {
                    c2785x.f14643z.mo52a();
                }
                return C1694m.f10482a;
        }
    }
}
