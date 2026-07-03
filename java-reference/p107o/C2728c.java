package p107o;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p137s.C3081j;
import p137s.C3083l;
import p137s.C3084m;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.c */
/* loaded from: classes.dex */
public final class C2728c extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f14614i;

    /* renamed from: j */
    public int f14615j;

    /* renamed from: k */
    public final /* synthetic */ AbstractC2734e f14616k;

    /* renamed from: l */
    public final /* synthetic */ C3083l f14617l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2728c(AbstractC2734e abstractC2734e, C3083l c3083l, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f14614i = i7;
        this.f14616k = abstractC2734e;
        this.f14617l = c3083l;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f14614i) {
            case 0:
                return ((C2728c) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C2728c) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f14614i) {
            case 0:
                return new C2728c(this.f14616k, this.f14617l, interfaceC2313c, 0);
            default:
                return new C2728c(this.f14616k, this.f14617l, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f14614i) {
            case 0:
                int i7 = this.f14615j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C3081j c3081j = this.f14616k.f14638u;
                    if (c3081j != null) {
                        this.f14615j = 1;
                        Object m4747b = c3081j.m4747b(this.f14617l, this);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (m4747b == enumC2465a) {
                            return enumC2465a;
                        }
                    }
                }
                return C1694m.f10482a;
            default:
                int i8 = this.f14615j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C3081j c3081j2 = this.f14616k.f14638u;
                    if (c3081j2 != null) {
                        C3084m c3084m = new C3084m(this.f14617l);
                        this.f14615j = 1;
                        Object m4747b2 = c3081j2.m4747b(c3084m, this);
                        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                        if (m4747b2 == enumC2465a2) {
                            return enumC2465a2;
                        }
                    }
                }
                return C1694m.f10482a;
        }
    }
}
