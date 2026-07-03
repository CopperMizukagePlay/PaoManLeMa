package p071j0;

import p020c2.C0383c;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.h */
/* loaded from: classes.dex */
public final class C2128h extends AbstractC2590j implements InterfaceC3282f {

    /* renamed from: i */
    public /* synthetic */ InterfaceC0516a0 f12428i;

    /* renamed from: j */
    public /* synthetic */ float f12429j;

    /* renamed from: k */
    public final /* synthetic */ C2150s f12430k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2128h(C2150s c2150s, InterfaceC2313c interfaceC2313c) {
        super(3, interfaceC2313c);
        this.f12430k = c2150s;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        C2128h c2128h = new C2128h(this.f12430k, (InterfaceC2313c) obj3);
        c2128h.f12428i = (InterfaceC0516a0) obj;
        c2128h.f12429j = floatValue;
        C1694m c1694m = C1694m.f10482a;
        c2128h.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        AbstractC1793a0.m2972L(obj);
        AbstractC0525d0.m1141s(this.f12428i, null, new C0383c(this.f12430k, this.f12429j, null), 3);
        return C1694m.f10482a;
    }
}
