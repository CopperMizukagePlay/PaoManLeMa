package p100n;

import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p158u5.C3379v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.x0 */
/* loaded from: classes.dex */
public final class C2696x0 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ C3379v f14471f;

    /* renamed from: g */
    public final /* synthetic */ float f14472g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2644g f14473h;

    /* renamed from: i */
    public final /* synthetic */ C2659l f14474i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3279c f14475j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2696x0(C3379v c3379v, float f7, InterfaceC2644g interfaceC2644g, C2659l c2659l, InterfaceC3279c interfaceC3279c) {
        super(1);
        this.f14471f = c3379v;
        this.f14472g = f7;
        this.f14473h = interfaceC2644g;
        this.f14474i = c2659l;
        this.f14475j = interfaceC3279c;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f14471f.f16451e;
        AbstractC3367j.m5097b(obj2);
        AbstractC2638e.m4227m((C2653j) obj2, longValue, this.f14472g, this.f14473h, this.f14474i, this.f14475j);
        return C1694m.f10482a;
    }
}
