package p071j0;

import p001a0.C0068q2;
import p001a0.C0070r0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.C2008t5;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.r */
/* loaded from: classes.dex */
public final class C2148r extends AbstractC2590j implements InterfaceC3282f {

    /* renamed from: i */
    public int f12504i;

    /* renamed from: j */
    public final /* synthetic */ C0068q2 f12505j;

    /* renamed from: k */
    public final /* synthetic */ C0070r0 f12506k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2148r(C0068q2 c0068q2, C0070r0 c0070r0, InterfaceC2313c interfaceC2313c) {
        super(3, interfaceC2313c);
        this.f12505j = c0068q2;
        this.f12506k = c0070r0;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        return new C2148r(this.f12505j, this.f12506k, (InterfaceC2313c) obj3).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f12504i;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            C2008t5 c2008t5 = (C2008t5) this.f12505j.f344f;
            this.f12504i = 1;
            Object mo22d = this.f12506k.mo22d(c2008t5, this);
            EnumC2465a enumC2465a = EnumC2465a.f13750e;
            if (mo22d == enumC2465a) {
                return enumC2465a;
            }
        }
        return C1694m.f10482a;
    }
}
