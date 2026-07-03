package p009b0;

import p053g5.C1694m;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b0.b */
/* loaded from: classes.dex */
public final class C0260b extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f988f;

    /* renamed from: g */
    public final /* synthetic */ int f989g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC3239v0 f990h;

    /* renamed from: i */
    public final /* synthetic */ int f991i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0260b(int i7, AbstractC3239v0 abstractC3239v0, int i8) {
        super(1);
        this.f988f = 1;
        this.f989g = i7;
        this.f990h = abstractC3239v0;
        this.f991i = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f988f) {
            case 0:
                AbstractC3237u0.m4949g((AbstractC3237u0) obj, this.f990h, -this.f989g, -this.f991i);
                return C1694m.f10482a;
            case 1:
                AbstractC3237u0.m4949g((AbstractC3237u0) obj, this.f990h, AbstractC3784a.m5794D((this.f989g - r0.f16053e) / 2.0f), AbstractC3784a.m5794D((this.f991i - r0.f16054f) / 2.0f));
                return C1694m.f10482a;
            default:
                AbstractC3237u0.m4949g((AbstractC3237u0) obj, this.f990h, this.f989g, this.f991i);
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0260b(AbstractC3239v0 abstractC3239v0, int i7, int i8, int i9) {
        super(1);
        this.f988f = i9;
        this.f990h = abstractC3239v0;
        this.f989g = i7;
        this.f991i = i8;
    }
}
