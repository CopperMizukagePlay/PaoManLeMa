package p122q;

import p027d1.C0464b;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p117p1.C2868s;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.t1 */
/* loaded from: classes.dex */
public final class C2947t1 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f15285i;

    /* renamed from: j */
    public int f15286j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3282f f15287k;

    /* renamed from: l */
    public final /* synthetic */ C2940r0 f15288l;

    /* renamed from: m */
    public final /* synthetic */ C2868s f15289m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2947t1(InterfaceC3282f interfaceC3282f, C2940r0 c2940r0, C2868s c2868s, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f15285i = i7;
        this.f15287k = interfaceC3282f;
        this.f15288l = c2940r0;
        this.f15289m = c2868s;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f15285i) {
            case 0:
                return ((C2947t1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C2947t1) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f15285i) {
            case 0:
                return new C2947t1(this.f15287k, this.f15288l, this.f15289m, interfaceC2313c, 0);
            default:
                return new C2947t1(this.f15287k, this.f15288l, this.f15289m, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f15285i) {
            case 0:
                int i7 = this.f15286j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C0464b c0464b = new C0464b(this.f15289m.f15008c);
                    this.f15286j = 1;
                    Object mo24c = this.f15287k.mo24c(this.f15288l, c0464b, this);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (mo24c == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return C1694m.f10482a;
            default:
                int i8 = this.f15286j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C0464b c0464b2 = new C0464b(this.f15289m.f15008c);
                    this.f15286j = 1;
                    Object mo24c2 = this.f15287k.mo24c(this.f15288l, c0464b2, this);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (mo24c2 == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                return C1694m.f10482a;
        }
    }
}
