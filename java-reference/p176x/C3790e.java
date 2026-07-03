package p176x;

import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p098m5.AbstractC2590j;
import p107o.C2722a;
import p107o.C2746i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3497e1;
import p170w1.C3702m1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x.e */
/* loaded from: classes.dex */
public final class C3790e extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public /* synthetic */ Object f17950i;

    /* renamed from: j */
    public final /* synthetic */ C3791f f17951j;

    /* renamed from: k */
    public final /* synthetic */ AbstractC3497e1 f17952k;

    /* renamed from: l */
    public final /* synthetic */ AbstractC3368k f17953l;

    /* renamed from: m */
    public final /* synthetic */ C2746i f17954m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3790e(C3791f c3791f, AbstractC3497e1 abstractC3497e1, InterfaceC3277a interfaceC3277a, C2746i c2746i, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f17951j = c3791f;
        this.f17952k = abstractC3497e1;
        this.f17953l = (AbstractC3368k) interfaceC3277a;
        this.f17954m = c2746i;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C3790e) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [t5.a, u5.k] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C3790e c3790e = new C3790e(this.f17951j, this.f17952k, this.f17953l, this.f17954m, interfaceC2313c);
        c3790e.f17950i = obj;
        return c3790e;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [t5.a, u5.k] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        AbstractC1793a0.m2972L(obj);
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f17950i;
        AbstractC3497e1 abstractC3497e1 = this.f17952k;
        ?? r22 = this.f17953l;
        C3791f c3791f = this.f17951j;
        AbstractC0525d0.m1141s(interfaceC0516a0, null, new C3702m1(c3791f, abstractC3497e1, r22, null), 3);
        return AbstractC0525d0.m1141s(interfaceC0516a0, null, new C2722a(c3791f, this.f17954m, null, 13), 3);
    }
}
