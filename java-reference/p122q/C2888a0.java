package p122q;

import java.util.concurrent.CancellationException;
import p001a0.C0074s0;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p047f6.C1548c;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p063i0.C1879e0;
import p066i3.AbstractC2067b;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.C2649h1;
import p117p1.InterfaceC2872w;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.a0 */
/* loaded from: classes.dex */
public final class C2888a0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f15084i;

    /* renamed from: j */
    public /* synthetic */ Object f15085j;

    /* renamed from: k */
    public final /* synthetic */ AbstractC2907g0 f15086k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2872w f15087l;

    /* renamed from: m */
    public final /* synthetic */ C0074s0 f15088m;

    /* renamed from: n */
    public final /* synthetic */ C2649h1 f15089n;

    /* renamed from: o */
    public final /* synthetic */ C2892b0 f15090o;

    /* renamed from: p */
    public final /* synthetic */ C2892b0 f15091p;

    /* renamed from: q */
    public final /* synthetic */ C1879e0 f15092q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2888a0(AbstractC2907g0 abstractC2907g0, InterfaceC2872w interfaceC2872w, C0074s0 c0074s0, C2649h1 c2649h1, C2892b0 c2892b0, C2892b0 c2892b02, C1879e0 c1879e0, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f15086k = abstractC2907g0;
        this.f15087l = interfaceC2872w;
        this.f15088m = c0074s0;
        this.f15089n = c2649h1;
        this.f15090o = c2892b0;
        this.f15091p = c2892b02;
        this.f15092q = c1879e0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C2888a0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C2888a0 c2888a0 = new C2888a0(this.f15086k, this.f15087l, this.f15088m, this.f15089n, this.f15090o, this.f15091p, this.f15092q, interfaceC2313c);
        c2888a0.f15085j = obj;
        return c2888a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC0516a0 interfaceC0516a0;
        C1548c c1548c;
        int i7 = this.f15084i;
        C1694m c1694m = C1694m.f10482a;
        AbstractC2907g0 abstractC2907g0 = this.f15086k;
        if (i7 != 0) {
            if (i7 == 1) {
                interfaceC0516a0 = (InterfaceC0516a0) this.f15085j;
                try {
                    AbstractC1793a0.m2972L(obj);
                } catch (CancellationException e7) {
                    e = e7;
                    CancellationException cancellationException = e;
                    c1548c = abstractC2907g0.f15154y;
                    if (c1548c != null) {
                    }
                    if (!AbstractC0525d0.m1139q(interfaceC0516a0)) {
                    }
                    return c1694m;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            InterfaceC0516a0 interfaceC0516a02 = (InterfaceC0516a0) this.f15085j;
            try {
                EnumC2931o0 enumC2931o0 = abstractC2907g0.f15150u;
                InterfaceC2872w interfaceC2872w = this.f15087l;
                C0074s0 c0074s0 = this.f15088m;
                C2649h1 c2649h1 = this.f15089n;
                C2892b0 c2892b0 = this.f15090o;
                C2892b0 c2892b02 = this.f15091p;
                C1879e0 c1879e0 = this.f15092q;
                this.f15085j = interfaceC0516a02;
                this.f15084i = 1;
                float f7 = AbstractC2963z.f15361a;
                Object m3282g = AbstractC2067b.m3282g(interfaceC2872w, new C2954w(c2892b02, enumC2931o0, c0074s0, c1879e0, c2892b0, c2649h1, null), this);
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (m3282g != enumC2465a) {
                    m3282g = c1694m;
                }
                if (m3282g == enumC2465a) {
                    return enumC2465a;
                }
            } catch (CancellationException e8) {
                e = e8;
                interfaceC0516a0 = interfaceC0516a02;
                CancellationException cancellationException2 = e;
                c1548c = abstractC2907g0.f15154y;
                if (c1548c != null) {
                    c1548c.mo2505v(C2930o.f15239a);
                }
                if (!AbstractC0525d0.m1139q(interfaceC0516a0)) {
                    throw cancellationException2;
                }
                return c1694m;
            }
        }
        return c1694m;
    }
}
