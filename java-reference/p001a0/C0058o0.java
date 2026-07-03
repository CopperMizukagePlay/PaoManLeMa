package p001a0;

import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p066i3.AbstractC2067b;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p117p1.InterfaceC2872w;
import p122q.AbstractC2963z;
import p122q.C2951v;
import p122q.C2954w;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.o0 */
/* loaded from: classes.dex */
public final class C0058o0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f282i;

    /* renamed from: j */
    public int f283j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2872w f284k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC0071r1 f285l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0058o0(InterfaceC2872w interfaceC2872w, InterfaceC0071r1 interfaceC0071r1, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f282i = i7;
        this.f284k = interfaceC2872w;
        this.f285l = interfaceC0071r1;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f282i) {
            case 0:
                return ((C0058o0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                return ((C0058o0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0058o0) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f282i) {
            case 0:
                return new C0058o0(this.f284k, this.f285l, interfaceC2313c, 0);
            case 1:
                return new C0058o0(this.f284k, this.f285l, interfaceC2313c, 1);
            default:
                return new C0058o0(this.f284k, this.f285l, interfaceC2313c, 2);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f282i;
        InterfaceC2313c interfaceC2313c = null;
        int i8 = 0;
        InterfaceC0071r1 interfaceC0071r1 = this.f285l;
        InterfaceC2872w interfaceC2872w = this.f284k;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        C1694m c1694m = C1694m.f10482a;
        switch (i7) {
            case 0:
                int i9 = this.f283j;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f283j = 1;
                    Object m1130h = AbstractC0525d0.m1130h(new C0047l1(interfaceC2872w, interfaceC0071r1, interfaceC2313c, i8), this);
                    if (m1130h != enumC2465a) {
                        m1130h = c1694m;
                    }
                    if (m1130h == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return c1694m;
            case 1:
                int i10 = this.f283j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f283j = 1;
                    Object m3282g = AbstractC2067b.m3282g(interfaceC2872w, new C0059o1(interfaceC0071r1, null), this);
                    if (m3282g != enumC2465a) {
                        m3282g = c1694m;
                    }
                    if (m3282g == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return c1694m;
            default:
                int i11 = this.f283j;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f283j = 1;
                    C0051m1 c0051m1 = new C0051m1(interfaceC0071r1, 0);
                    C0055n1 c0055n1 = new C0055n1(interfaceC0071r1, 0);
                    C0055n1 c0055n12 = new C0055n1(interfaceC0071r1, 1);
                    C0074s0 c0074s0 = new C0074s0(1, interfaceC0071r1);
                    float f7 = AbstractC2963z.f15361a;
                    Object m3282g2 = AbstractC2067b.m3282g(interfaceC2872w, new C2954w(C2951v.f15306f, null, new C0074s0(5, c0051m1), c0074s0, c0055n12, new C0005b(23, c0055n1), null), this);
                    if (m3282g2 != enumC2465a) {
                        m3282g2 = c1694m;
                    }
                    if (m3282g2 != enumC2465a) {
                        m3282g2 = c1694m;
                    }
                    if (m3282g2 != enumC2465a) {
                        m3282g2 = c1694m;
                    }
                    if (m3282g2 == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return c1694m;
        }
    }
}
