package p122q;

import p027d1.C0464b;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2589i;
import p117p1.C2855g0;
import p117p1.C2868s;
import p117p1.EnumC2860k;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.C3379v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.u1 */
/* loaded from: classes.dex */
public final class C2950u1 extends AbstractC2589i implements InterfaceC3281e {

    /* renamed from: g */
    public int f15299g;

    /* renamed from: h */
    public /* synthetic */ Object f15300h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC0516a0 f15301i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3279c f15302j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3279c f15303k;

    /* renamed from: l */
    public final /* synthetic */ C3379v f15304l;

    /* renamed from: m */
    public final /* synthetic */ C2940r0 f15305m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2950u1(InterfaceC0516a0 interfaceC0516a0, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2, C3379v c3379v, C2940r0 c2940r0, InterfaceC2313c interfaceC2313c) {
        super(interfaceC2313c);
        this.f15301i = interfaceC0516a0;
        this.f15302j = interfaceC3279c;
        this.f15303k = interfaceC3279c2;
        this.f15304l = c3379v;
        this.f15305m = c2940r0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C2950u1) mo28k((C2855g0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C2950u1 c2950u1 = new C2950u1(this.f15301i, this.f15302j, this.f15303k, this.f15304l, this.f15305m, interfaceC2313c);
        c2950u1.f15300h = obj;
        return c2950u1;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        int i7 = this.f15299g;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC1793a0.m2972L(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            C2855g0 c2855g0 = (C2855g0) this.f15300h;
            this.f15299g = 1;
            obj = AbstractC2959x1.m4601e(c2855g0, EnumC2860k.f14996f, this);
            EnumC2465a enumC2465a = EnumC2465a.f13750e;
            if (obj == enumC2465a) {
                return enumC2465a;
            }
        }
        C2868s c2868s = (C2868s) obj;
        InterfaceC0516a0 interfaceC0516a0 = this.f15301i;
        C1694m c1694m = C1694m.f10482a;
        C2940r0 c2940r0 = this.f15305m;
        if (c2868s != null) {
            c2868s.m4550a();
            AbstractC0525d0.m1141s(interfaceC0516a0, null, new C2944s1(c2940r0, null, 6), 3);
            this.f15302j.mo23f(new C0464b(c2868s.f15008c));
            return c1694m;
        }
        AbstractC0525d0.m1141s(interfaceC0516a0, null, new C2944s1(c2940r0, null, 7), 3);
        InterfaceC3279c interfaceC3279c = this.f15303k;
        if (interfaceC3279c == null) {
            return null;
        }
        interfaceC3279c.mo23f(new C0464b(((C2868s) this.f15304l.f16451e).f15008c));
        return c1694m;
    }
}
