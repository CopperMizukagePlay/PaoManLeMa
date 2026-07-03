package p122q;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.C3376s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.w0 */
/* loaded from: classes.dex */
public final class C2955w0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public /* synthetic */ Object f15338i;

    /* renamed from: j */
    public final /* synthetic */ C3376s f15339j;

    /* renamed from: k */
    public final /* synthetic */ float f15340k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2955w0(C3376s c3376s, float f7, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f15339j = c3376s;
        this.f15340k = f7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2955w0 c2955w0 = (C2955w0) mo28k((InterfaceC2958x0) obj, (InterfaceC2313c) obj2);
        C1694m c1694m = C1694m.f10482a;
        c2955w0.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C2955w0 c2955w0 = new C2955w0(this.f15339j, this.f15340k, interfaceC2313c);
        c2955w0.f15338i = obj;
        return c2955w0;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        AbstractC1793a0.m2972L(obj);
        this.f15339j.f16448e = ((InterfaceC2958x0) this.f15338i).mo4566a(this.f15340k);
        return C1694m.f10482a;
    }
}
