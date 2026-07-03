package p063i0;

import p053g5.C1694m;
import p078k0.AbstractC2252u;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.e6 */
/* loaded from: classes.dex */
public final class C1885e6 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ AbstractC3239v0 f11150f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC3239v0 f11151g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3223n0 f11152h;

    /* renamed from: i */
    public final /* synthetic */ int f11153i;

    /* renamed from: j */
    public final /* synthetic */ int f11154j;

    /* renamed from: k */
    public final /* synthetic */ Integer f11155k;

    /* renamed from: l */
    public final /* synthetic */ Integer f11156l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885e6(AbstractC3239v0 abstractC3239v0, AbstractC3239v0 abstractC3239v02, InterfaceC3223n0 interfaceC3223n0, int i7, int i8, Integer num, Integer num2) {
        super(1);
        this.f11150f = abstractC3239v0;
        this.f11151g = abstractC3239v02;
        this.f11152h = interfaceC3223n0;
        this.f11153i = i7;
        this.f11154j = i8;
        this.f11155k = num;
        this.f11156l = num2;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        float f7;
        AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
        AbstractC3239v0 abstractC3239v0 = this.f11151g;
        int i7 = this.f11154j;
        AbstractC3239v0 abstractC3239v02 = this.f11150f;
        if (abstractC3239v02 != null && abstractC3239v0 != null) {
            Integer num = this.f11155k;
            AbstractC3367j.m5097b(num);
            int intValue = num.intValue();
            Integer num2 = this.f11156l;
            AbstractC3367j.m5097b(num2);
            int intValue2 = num2.intValue();
            if (intValue == intValue2) {
                f7 = AbstractC1912h6.f11289c;
            } else {
                f7 = AbstractC1912h6.f11290d;
            }
            InterfaceC3223n0 interfaceC3223n0 = this.f11152h;
            int mo4513Q = interfaceC3223n0.mo4513Q(AbstractC2252u.f13065a) + interfaceC3223n0.mo4513Q(f7);
            int mo4511H = (interfaceC3223n0.mo4511H(AbstractC1912h6.f11291e) + abstractC3239v0.f16054f) - intValue;
            int i8 = abstractC3239v02.f16053e;
            int i9 = this.f11153i;
            int i10 = (i7 - intValue2) - mo4513Q;
            AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v02, (i9 - i8) / 2, i10);
            AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v0, (i9 - abstractC3239v0.f16053e) / 2, i10 - mo4511H);
        } else if (abstractC3239v02 != null) {
            float f8 = AbstractC1912h6.f11287a;
            AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v02, 0, (i7 - abstractC3239v02.f16054f) / 2);
        } else if (abstractC3239v0 != null) {
            float f9 = AbstractC1912h6.f11287a;
            AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v0, 0, (i7 - abstractC3239v0.f16054f) / 2);
        }
        return C1694m.f10482a;
    }
}
