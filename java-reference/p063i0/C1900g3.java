package p063i0;

import p001a0.C0078t0;
import p053g5.C1694m;
import p073j2.AbstractC2168e;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p115p.C2830j;
import p137s.C3081j;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.g3 */
/* loaded from: classes.dex */
public final class C1900g3 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11225f = 2;

    /* renamed from: g */
    public final /* synthetic */ boolean f11226g;

    /* renamed from: h */
    public final /* synthetic */ C3173d f11227h;

    /* renamed from: i */
    public final /* synthetic */ Object f11228i;

    /* renamed from: j */
    public final /* synthetic */ int f11229j;

    /* renamed from: k */
    public final /* synthetic */ Object f11230k;

    /* renamed from: l */
    public final /* synthetic */ Object f11231l;

    /* renamed from: m */
    public final /* synthetic */ Object f11232m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1900g3(C2830j c2830j, InterfaceC3277a interfaceC3277a, C0078t0 c0078t0, InterfaceC3810r interfaceC3810r, boolean z7, C3173d c3173d, int i7) {
        super(2);
        this.f11228i = c2830j;
        this.f11232m = interfaceC3277a;
        this.f11230k = c0078t0;
        this.f11231l = interfaceC3810r;
        this.f11226g = z7;
        this.f11227h = c3173d;
        this.f11229j = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f11225f) {
            case 0:
                ((Number) obj2).intValue();
                C3173d c3173d = (C3173d) this.f11228i;
                C3173d c3173d2 = (C3173d) this.f11230k;
                InterfaceC3281e interfaceC3281e = (InterfaceC3281e) this.f11231l;
                InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f11232m;
                AbstractC1926j3.m3128c(this.f11227h, c3173d, c3173d2, interfaceC3281e, this.f11226g, interfaceC3277a, (C2395p) obj, AbstractC2418w.m3957F(this.f11229j | 1));
                return C1694m.f10482a;
            case 1:
                ((Number) obj2).intValue();
                InterfaceC3810r interfaceC3810r = (InterfaceC3810r) this.f11230k;
                C2016u5 c2016u5 = (C2016u5) this.f11231l;
                C3081j c3081j = (C3081j) this.f11232m;
                C3173d c3173d3 = (C3173d) this.f11228i;
                AbstractC2000s5.m3180d(interfaceC3810r, c2016u5, this.f11226g, c3081j, this.f11227h, c3173d3, (C2395p) obj, AbstractC2418w.m3957F(this.f11229j | 1));
                return C1694m.f10482a;
            default:
                ((Number) obj2).intValue();
                C2830j c2830j = (C2830j) this.f11228i;
                InterfaceC3277a interfaceC3277a2 = (InterfaceC3277a) this.f11232m;
                C0078t0 c0078t0 = (C0078t0) this.f11230k;
                InterfaceC3810r interfaceC3810r2 = (InterfaceC3810r) this.f11231l;
                AbstractC2168e.m3515b(c2830j, interfaceC3277a2, c0078t0, interfaceC3810r2, this.f11226g, this.f11227h, (C2395p) obj, AbstractC2418w.m3957F(this.f11229j | 1));
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1900g3(C3173d c3173d, C3173d c3173d2, C3173d c3173d3, InterfaceC3281e interfaceC3281e, boolean z7, InterfaceC3277a interfaceC3277a, int i7) {
        super(2);
        this.f11227h = c3173d;
        this.f11228i = c3173d2;
        this.f11230k = c3173d3;
        this.f11231l = interfaceC3281e;
        this.f11226g = z7;
        this.f11232m = interfaceC3277a;
        this.f11229j = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1900g3(InterfaceC3810r interfaceC3810r, C2016u5 c2016u5, boolean z7, C3081j c3081j, C3173d c3173d, C3173d c3173d2, int i7) {
        super(2);
        this.f11230k = interfaceC3810r;
        this.f11231l = c2016u5;
        this.f11226g = z7;
        this.f11232m = c3081j;
        this.f11227h = c3173d;
        this.f11228i = c3173d2;
        this.f11229j = i7;
    }
}
