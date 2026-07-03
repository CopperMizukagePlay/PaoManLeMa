package p071j0;

import p050g2.C1604o0;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.j0 */
/* loaded from: classes.dex */
public final class C2133j0 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f12440f;

    /* renamed from: g */
    public final /* synthetic */ long f12441g;

    /* renamed from: h */
    public final /* synthetic */ C1604o0 f12442h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3281e f12443i;

    /* renamed from: j */
    public final /* synthetic */ int f12444j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2133j0(long j6, C1604o0 c1604o0, InterfaceC3281e interfaceC3281e, int i7, int i8) {
        super(2);
        this.f12440f = i8;
        this.f12441g = j6;
        this.f12442h = c1604o0;
        this.f12443i = interfaceC3281e;
        this.f12444j = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f12440f) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC2152t.m3496b(this.f12441g, this.f12442h, this.f12443i, (C2395p) obj, AbstractC2418w.m3957F(this.f12444j | 1));
                return C1694m.f10482a;
            default:
                ((Number) obj2).intValue();
                AbstractC2151s0.m3492b(this.f12441g, this.f12442h, this.f12443i, (C2395p) obj, AbstractC2418w.m3957F(this.f12444j | 1));
                return C1694m.f10482a;
        }
    }
}
