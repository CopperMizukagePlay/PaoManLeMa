package p162v1;

import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.m0 */
/* loaded from: classes.dex */
public final class C3520m0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ AbstractC3526o0 f16963f;

    /* renamed from: g */
    public final /* synthetic */ long f16964g;

    /* renamed from: h */
    public final /* synthetic */ long f16965h;

    /* renamed from: i */
    public final /* synthetic */ C3536r1 f16966i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3520m0(AbstractC3526o0 abstractC3526o0, long j6, long j7, C3536r1 c3536r1) {
        super(0);
        this.f16963f = abstractC3526o0;
        this.f16964g = j6;
        this.f16965h = j7;
        this.f16966i = c3536r1;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        AbstractC3526o0 abstractC3526o0 = this.f16963f;
        abstractC3526o0.m5487G0().f16957e = false;
        abstractC3526o0.m5487G0().f16958f = this.f16964g;
        abstractC3526o0.m5487G0().f16959g = this.f16965h;
        InterfaceC3279c mo4885d = this.f16966i.f17008e.mo4885d();
        if (mo4885d != null) {
            mo4885d.mo23f(abstractC3526o0.m5487G0());
        }
        return C1694m.f10482a;
    }
}
