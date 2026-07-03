package p063i0;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.j6 */
/* loaded from: classes.dex */
public final class C1929j6 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ C1937k6 f11402f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3810r f11403g;

    /* renamed from: h */
    public final /* synthetic */ float f11404h;

    /* renamed from: i */
    public final /* synthetic */ long f11405i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1929j6(C1937k6 c1937k6, InterfaceC3810r interfaceC3810r, float f7, long j6, int i7) {
        super(2);
        this.f11402f = c1937k6;
        this.f11403g = interfaceC3810r;
        this.f11404h = f7;
        this.f11405i = j6;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int m3957F = AbstractC2418w.m3957F(3073);
        this.f11402f.m3138a(this.f11403g, this.f11404h, this.f11405i, (C2395p) obj, m3957F);
        return C1694m.f10482a;
    }
}
