package p071j0;

import p001a0.C0070r0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.n */
/* loaded from: classes.dex */
public final class C2140n extends AbstractC2590j implements InterfaceC3279c {

    /* renamed from: i */
    public int f12466i;

    /* renamed from: j */
    public final /* synthetic */ C2150s f12467j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3282f f12468k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2140n(C2150s c2150s, InterfaceC3282f interfaceC3282f, InterfaceC2313c interfaceC2313c) {
        super(1, interfaceC2313c);
        this.f12467j = c2150s;
        this.f12468k = interfaceC3282f;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        return new C2140n(this.f12467j, this.f12468k, (InterfaceC2313c) obj).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f12466i;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            C2150s c2150s = this.f12467j;
            C2138m c2138m = new C2138m(c2150s, 0);
            C0070r0 c0070r0 = new C0070r0(this.f12468k, c2150s, (InterfaceC2313c) null, 17);
            this.f12466i = 1;
            Object m3497c = AbstractC2152t.m3497c(c2138m, c0070r0, this);
            EnumC2465a enumC2465a = EnumC2465a.f13750e;
            if (m3497c == enumC2465a) {
                return enumC2465a;
            }
        }
        return C1694m.f10482a;
    }
}
