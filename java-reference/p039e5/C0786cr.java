package p039e5;

import java.util.List;
import p032d6.InterfaceC0516a0;
import p046f5.AbstractC1541f;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.C2345c1;
import p098m5.AbstractC2590j;
import p144t.C3137j0;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.cr */
/* loaded from: classes.dex */
public final class C0786cr extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ float f3202i;

    /* renamed from: j */
    public final /* synthetic */ C2345c1 f3203j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0786cr(float f7, C2345c1 c2345c1, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f3202i = f7;
        this.f3203j = c2345c1;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C0786cr c0786cr = (C0786cr) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
        C1694m c1694m = C1694m.f10482a;
        c0786cr.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C0786cr(this.f3202i, this.f3203j, interfaceC2313c);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        AbstractC1793a0.m2972L(obj);
        List list = AbstractC1541f.f10116a;
        float m2473a = AbstractC1541f.m2473a(this.f3202i);
        C3137j0 c3137j0 = AbstractC0945hr.f4635a;
        this.f3203j.m3730h(m2473a);
        return C1694m.f10482a;
    }
}
