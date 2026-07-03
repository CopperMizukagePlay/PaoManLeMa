package p063i0;

import p043f2.EnumC1533a;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p115p.AbstractC2831k;
import p115p.C2821a;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.p0 */
/* loaded from: classes.dex */
public final class C1971p0 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11641f;

    /* renamed from: g */
    public final /* synthetic */ boolean f11642g;

    /* renamed from: h */
    public final /* synthetic */ Object f11643h;

    /* renamed from: i */
    public final /* synthetic */ int f11644i;

    /* renamed from: j */
    public final /* synthetic */ Object f11645j;

    /* renamed from: k */
    public final /* synthetic */ Object f11646k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1971p0(String str, boolean z7, C2821a c2821a, InterfaceC3277a interfaceC3277a, int i7) {
        super(2);
        this.f11641f = 2;
        this.f11645j = str;
        this.f11642g = z7;
        this.f11643h = c2821a;
        this.f11646k = (AbstractC3368k) interfaceC3277a;
        this.f11644i = i7;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [t5.a, u5.k] */
    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f11641f) {
            case 0:
                ((Number) obj2).intValue();
                EnumC1533a enumC1533a = (EnumC1533a) this.f11645j;
                InterfaceC3810r interfaceC3810r = (InterfaceC3810r) this.f11643h;
                C1939l0 c1939l0 = (C1939l0) this.f11646k;
                AbstractC1987r0.m3157b(this.f11642g, enumC1533a, interfaceC3810r, c1939l0, (C2395p) obj, AbstractC2418w.m3957F(this.f11644i | 1));
                return C1694m.f10482a;
            case 1:
                ((Number) obj2).intValue();
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) this.f11645j;
                InterfaceC3810r interfaceC3810r2 = (InterfaceC3810r) this.f11643h;
                C3173d c3173d = (C3173d) this.f11646k;
                AbstractC2052z1.m3218a(this.f11642g, interfaceC3279c, interfaceC3810r2, c3173d, (C2395p) obj, AbstractC2418w.m3957F(this.f11644i | 1));
                return C1694m.f10482a;
            default:
                ((Number) obj2).intValue();
                String str = (String) this.f11645j;
                C2821a c2821a = (C2821a) this.f11643h;
                ?? r42 = (AbstractC3368k) this.f11646k;
                AbstractC2831k.m4452b(str, this.f11642g, c2821a, r42, (C2395p) obj, AbstractC2418w.m3957F(this.f11644i | 1));
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1971p0(boolean z7, Object obj, InterfaceC3810r interfaceC3810r, Object obj2, int i7, int i8) {
        super(2);
        this.f11641f = i8;
        this.f11642g = z7;
        this.f11645j = obj;
        this.f11643h = interfaceC3810r;
        this.f11646k = obj2;
        this.f11644i = i7;
    }
}
