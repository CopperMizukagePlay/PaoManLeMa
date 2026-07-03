package p122q;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.AbstractC2638e;
import p100n.InterfaceC2656k;
import p150t5.InterfaceC3281e;
import p158u5.C3376s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.u0 */
/* loaded from: classes.dex */
public final class C2949u0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public int f15294i;

    /* renamed from: j */
    public /* synthetic */ Object f15295j;

    /* renamed from: k */
    public final /* synthetic */ float f15296k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2656k f15297l;

    /* renamed from: m */
    public final /* synthetic */ C3376s f15298m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2949u0(float f7, InterfaceC2656k interfaceC2656k, C3376s c3376s, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f15296k = f7;
        this.f15297l = interfaceC2656k;
        this.f15298m = c3376s;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C2949u0) mo28k((InterfaceC2958x0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C2949u0 c2949u0 = new C2949u0(this.f15296k, this.f15297l, this.f15298m, interfaceC2313c);
        c2949u0.f15295j = obj;
        return c2949u0;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f15294i;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            C2946t0 c2946t0 = new C2946t0(this.f15298m, (InterfaceC2958x0) this.f15295j, 0);
            this.f15294i = 1;
            Object m4219e = AbstractC2638e.m4219e(this.f15296k, this.f15297l, c2946t0, this, 4);
            EnumC2465a enumC2465a = EnumC2465a.f13750e;
            if (m4219e == enumC2465a) {
                return enumC2465a;
            }
        }
        return C1694m.f10482a;
    }
}
