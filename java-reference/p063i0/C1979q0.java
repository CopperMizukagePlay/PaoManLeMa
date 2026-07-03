package p063i0;

import p043f2.EnumC1533a;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.q0 */
/* loaded from: classes.dex */
public final class C1979q0 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ EnumC1533a f11673f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3277a f11674g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3810r f11675h;

    /* renamed from: i */
    public final /* synthetic */ boolean f11676i;

    /* renamed from: j */
    public final /* synthetic */ C1939l0 f11677j;

    /* renamed from: k */
    public final /* synthetic */ int f11678k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1979q0(EnumC1533a enumC1533a, InterfaceC3277a interfaceC3277a, InterfaceC3810r interfaceC3810r, boolean z7, C1939l0 c1939l0, int i7) {
        super(2);
        this.f11673f = enumC1533a;
        this.f11674g = interfaceC3277a;
        this.f11675h = interfaceC3810r;
        this.f11676i = z7;
        this.f11677j = c1939l0;
        this.f11678k = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC1987r0.m3158c(this.f11673f, this.f11674g, this.f11675h, this.f11676i, this.f11677j, (C2395p) obj, AbstractC2418w.m3957F(this.f11678k | 1));
        return C1694m.f10482a;
    }
}
