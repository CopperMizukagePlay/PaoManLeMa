package p039e5;

import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ei */
/* loaded from: classes.dex */
public final class C0840ei extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ boolean f3706i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2425y0 f3707j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0840ei(boolean z7, InterfaceC2425y0 interfaceC2425y0, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f3706i = z7;
        this.f3707j = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C0840ei c0840ei = (C0840ei) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
        C1694m c1694m = C1694m.f10482a;
        c0840ei.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C0840ei(this.f3706i, this.f3707j, interfaceC2313c);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        AbstractC1793a0.m2972L(obj);
        if (this.f3706i) {
            AbstractC1092mk.m1695L0(this.f3707j);
        }
        return C1694m.f10482a;
    }
}
