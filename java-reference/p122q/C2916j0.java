package p122q;

import p027d1.C0464b;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p140s2.C3107q;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.j0 */
/* loaded from: classes.dex */
public final class C2916j0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f15188i;

    /* renamed from: j */
    public int f15189j;

    /* renamed from: k */
    public /* synthetic */ Object f15190k;

    /* renamed from: l */
    public final /* synthetic */ C2919k0 f15191l;

    /* renamed from: m */
    public final /* synthetic */ long f15192m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2916j0(C2919k0 c2919k0, long j6, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f15188i = i7;
        this.f15191l = c2919k0;
        this.f15192m = j6;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f15188i) {
            case 0:
                return ((C2916j0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C2916j0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f15188i) {
            case 0:
                C2916j0 c2916j0 = new C2916j0(this.f15191l, this.f15192m, interfaceC2313c, 0);
                c2916j0.f15190k = obj;
                return c2916j0;
            default:
                C2916j0 c2916j02 = new C2916j0(this.f15191l, this.f15192m, interfaceC2313c, 1);
                c2916j02.f15190k = obj;
                return c2916j02;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        float f7;
        float m4801b;
        int i7 = this.f15188i;
        C1694m c1694m = C1694m.f10482a;
        long j6 = this.f15192m;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        C2919k0 c2919k0 = this.f15191l;
        switch (i7) {
            case 0:
                int i8 = this.f15189j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f15190k;
                InterfaceC3282f interfaceC3282f = c2919k0.f15207F;
                C0464b c0464b = new C0464b(j6);
                this.f15189j = 1;
                if (interfaceC3282f.mo24c(interfaceC0516a0, c0464b, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
            default:
                int i9 = this.f15189j;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                InterfaceC0516a0 interfaceC0516a02 = (InterfaceC0516a0) this.f15190k;
                InterfaceC3282f interfaceC3282f2 = c2919k0.f15208G;
                if (c2919k0.f15209H) {
                    f7 = -1.0f;
                } else {
                    f7 = 1.0f;
                }
                long m4805f = C3107q.m4805f(f7, j6);
                EnumC2931o0 enumC2931o0 = c2919k0.f15205D;
                C2910h0 c2910h0 = AbstractC2913i0.f15176a;
                if (enumC2931o0 == EnumC2931o0.f15240e) {
                    m4801b = C3107q.m4802c(m4805f);
                } else {
                    m4801b = C3107q.m4801b(m4805f);
                }
                Float f8 = new Float(m4801b);
                this.f15189j = 1;
                if (interfaceC3282f2.mo24c(interfaceC0516a02, f8, this) == enumC2465a) {
                    return enumC2465a;
                }
                return c1694m;
        }
    }
}
