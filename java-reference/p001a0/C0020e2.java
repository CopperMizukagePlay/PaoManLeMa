package p001a0;

import p027d1.C0464b;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p122q.C2940r0;
import p137s.C3081j;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.e2 */
/* loaded from: classes.dex */
public final class C0020e2 extends AbstractC2590j implements InterfaceC3282f {

    /* renamed from: i */
    public int f110i;

    /* renamed from: j */
    public /* synthetic */ C2940r0 f111j;

    /* renamed from: k */
    public /* synthetic */ long f112k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC0516a0 f113l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC2425y0 f114m;

    /* renamed from: n */
    public final /* synthetic */ C3081j f115n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0020e2(InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y0, C3081j c3081j, InterfaceC2313c interfaceC2313c) {
        super(3, interfaceC2313c);
        this.f113l = interfaceC0516a0;
        this.f114m = interfaceC2425y0;
        this.f115n = c3081j;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        long j6 = ((C0464b) obj2).f1623a;
        InterfaceC2425y0 interfaceC2425y0 = this.f114m;
        C3081j c3081j = this.f115n;
        C0020e2 c0020e2 = new C0020e2(this.f113l, interfaceC2425y0, c3081j, (InterfaceC2313c) obj3);
        c0020e2.f111j = (C2940r0) obj;
        c0020e2.f112k = j6;
        return c0020e2.mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f110i;
        InterfaceC0516a0 interfaceC0516a0 = this.f113l;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            C2940r0 c2940r0 = this.f111j;
            AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0012c2(this.f114m, this.f112k, this.f115n, null, 0), 3);
            this.f110i = 1;
            obj = c2940r0.m4596d(this);
            EnumC2465a enumC2465a = EnumC2465a.f13750e;
            if (obj == enumC2465a) {
                return enumC2465a;
            }
        }
        AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0016d2(this.f114m, ((Boolean) obj).booleanValue(), this.f115n, null), 3);
        return C1694m.f10482a;
    }
}
