package p039e5;

import java.util.List;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wh */
/* loaded from: classes.dex */
public final class C1399wh extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ List f8377i;

    /* renamed from: j */
    public final /* synthetic */ double f8378j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f8379k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2425y0 f8380l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1399wh(List list, double d7, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f8377i = list;
        this.f8378j = d7;
        this.f8379k = interfaceC2425y0;
        this.f8380l = interfaceC2425y02;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C1399wh c1399wh = (C1399wh) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
        C1694m c1694m = C1694m.f10482a;
        c1399wh.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C1399wh(this.f8377i, this.f8378j, this.f8379k, this.f8380l, interfaceC2313c);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        AbstractC1793a0.m2972L(obj);
        List list = this.f8377i;
        int size = list.size();
        float f7 = AbstractC1092mk.f5952h;
        InterfaceC2425y0 interfaceC2425y0 = this.f8379k;
        int intValue = ((Number) interfaceC2425y0.getValue()).intValue();
        InterfaceC2425y0 interfaceC2425y02 = this.f8380l;
        double d7 = this.f8378j;
        if (size >= intValue && list.size() > 2 && d7 < ((Number) interfaceC2425y02.getValue()).doubleValue()) {
            d7 = Math.max(d7, ((Number) interfaceC2425y02.getValue()).doubleValue() * 0.82d);
        }
        interfaceC2425y02.setValue(Double.valueOf(d7));
        interfaceC2425y0.setValue(Integer.valueOf(list.size()));
        return C1694m.f10482a;
    }
}
