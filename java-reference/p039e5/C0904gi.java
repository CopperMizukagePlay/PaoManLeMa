package p039e5;

import java.util.List;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0565q1;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p085l0.InterfaceC2425y0;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.gi */
/* loaded from: classes.dex */
public final class C0904gi extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ boolean f4296i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC0516a0 f4297j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f4298k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2425y0 f4299l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC2425y0 f4300m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0904gi(boolean z7, InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f4296i = z7;
        this.f4297j = interfaceC0516a0;
        this.f4298k = interfaceC2425y0;
        this.f4299l = interfaceC2425y02;
        this.f4300m = interfaceC2425y03;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C0904gi c0904gi = (C0904gi) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
        C1694m c1694m = C1694m.f10482a;
        c0904gi.mo29m(c1694m);
        return c1694m;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        return new C0904gi(this.f4296i, this.f4297j, this.f4298k, this.f4299l, this.f4300m, interfaceC2313c);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        AbstractC1793a0.m2972L(obj);
        if (this.f4296i) {
            InterfaceC2425y0 interfaceC2425y0 = this.f4298k;
            float f7 = AbstractC1092mk.f5952h;
            if (((Boolean) interfaceC2425y0.getValue()).booleanValue()) {
                List list = (List) this.f4299l.getValue();
                InterfaceC2425y0 interfaceC2425y02 = this.f4300m;
                if (list.isEmpty()) {
                    list = (List) interfaceC2425y02.getValue();
                }
                C1701c0 c1701c0 = AbstractC0909gn.f4317a;
                InterfaceC0516a0 interfaceC0516a0 = this.f4297j;
                AbstractC3367j.m5100e(interfaceC0516a0, "scope");
                AbstractC3367j.m5100e(list, "activeTargets");
                AbstractC0909gn.f4319c = false;
                C0565q1 c0565q1 = AbstractC0909gn.f4320d;
                if (c0565q1 != null) {
                    c0565q1.mo1114c(null);
                }
                AbstractC0909gn.f4319c = true;
                C2325e c2325e = AbstractC0549l0.f1898a;
                AbstractC0909gn.f4320d = AbstractC0525d0.m1141s(interfaceC0516a0, ExecutorC2324d.f13302g, new C0832ea(list, null), 2);
                return C1694m.f10482a;
            }
        }
        AbstractC0909gn.m1550b();
        return C1694m.f10482a;
    }
}
