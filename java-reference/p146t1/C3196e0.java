package p146t1;

import java.util.List;
import p140s2.C3091a;
import p150t5.InterfaceC3281e;
import p162v1.AbstractC3493d0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.e0 */
/* loaded from: classes.dex */
public final class C3196e0 extends AbstractC3493d0 {

    /* renamed from: b */
    public final /* synthetic */ C3205h0 f15943b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC3281e f15944c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3196e0(C3205h0 c3205h0, InterfaceC3281e interfaceC3281e, String str) {
        super(str);
        this.f15943b = c3205h0;
        this.f15944c = interfaceC3281e;
    }

    @Override // p146t1.InterfaceC3217l0
    /* renamed from: a */
    public final InterfaceC3220m0 mo170a(InterfaceC3223n0 interfaceC3223n0, List list, long j6) {
        C3205h0 c3205h0 = this.f15943b;
        C3190c0 c3190c0 = c3205h0.f15965l;
        c3190c0.f15930e = interfaceC3223n0.getLayoutDirection();
        c3190c0.f15931f = interfaceC3223n0.mo559b();
        c3190c0.f15932g = interfaceC3223n0.mo560l();
        boolean mo4889s = interfaceC3223n0.mo4889s();
        InterfaceC3281e interfaceC3281e = this.f15944c;
        if (!mo4889s && c3205h0.f15958e.f16890k != null) {
            c3205h0.f15962i = 0;
            InterfaceC3220m0 interfaceC3220m0 = (InterfaceC3220m0) interfaceC3281e.mo22d(c3205h0.f15966m, new C3091a(j6));
            return new C3193d0(interfaceC3220m0, c3205h0, c3205h0.f15962i, interfaceC3220m0, 0);
        }
        c3205h0.f15961h = 0;
        InterfaceC3220m0 interfaceC3220m02 = (InterfaceC3220m0) interfaceC3281e.mo22d(c3190c0, new C3091a(j6));
        return new C3193d0(interfaceC3220m02, c3205h0, c3205h0.f15961h, interfaceC3220m02, 1);
    }
}
