package p129r;

import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p158u5.C3376s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r.c */
/* loaded from: classes.dex */
public final class C3014c extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f15547f;

    /* renamed from: g */
    public final /* synthetic */ C3376s f15548g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3279c f15549h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3014c(C3376s c3376s, InterfaceC3279c interfaceC3279c, int i7) {
        super(1);
        this.f15547f = i7;
        this.f15548g = c3376s;
        this.f15549h = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f15547f) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                C3376s c3376s = this.f15548g;
                float f7 = c3376s.f16448e - floatValue;
                c3376s.f16448e = f7;
                this.f15549h.mo23f(Float.valueOf(f7));
                return C1694m.f10482a;
            default:
                float floatValue2 = ((Number) obj).floatValue();
                C3376s c3376s2 = this.f15548g;
                float f8 = c3376s2.f16448e - floatValue2;
                c3376s2.f16448e = f8;
                this.f15549h.mo23f(Float.valueOf(f8));
                return C1694m.f10482a;
        }
    }
}
