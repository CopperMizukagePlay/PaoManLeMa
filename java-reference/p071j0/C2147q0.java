package p071j0;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.q0 */
/* loaded from: classes.dex */
public final class C2147q0 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ long f12501f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3281e f12502g;

    /* renamed from: h */
    public final /* synthetic */ int f12503h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2147q0(long j6, InterfaceC3281e interfaceC3281e, int i7) {
        super(2);
        this.f12501f = j6;
        this.f12502g = interfaceC3281e;
        this.f12503h = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int m3957F = AbstractC2418w.m3957F(this.f12503h | 1);
        AbstractC2151s0.m3493c(this.f12501f, this.f12502g, (C2395p) obj, m3957F);
        return C1694m.f10482a;
    }
}
