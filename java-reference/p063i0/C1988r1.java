package p063i0;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.r1 */
/* loaded from: classes.dex */
public final class C1988r1 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ C1996s1 f11712f;

    /* renamed from: g */
    public final /* synthetic */ boolean f11713g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3810r f11714h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1988r1(C1996s1 c1996s1, boolean z7, InterfaceC3810r interfaceC3810r, int i7) {
        super(2);
        this.f11712f = c1996s1;
        this.f11713g = z7;
        this.f11714h = interfaceC3810r;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int m3957F = AbstractC2418w.m3957F(1);
        this.f11712f.m3175a(this.f11713g, this.f11714h, (C2395p) obj, m3957F);
        return C1694m.f10482a;
    }
}
