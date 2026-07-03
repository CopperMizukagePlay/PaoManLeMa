package p063i0;

import p035e1.InterfaceC0667m0;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p085l0.InterfaceC2425y0;
import p100n.C2657k0;
import p107o.C2769p1;
import p145t0.C3173d;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.m */
/* loaded from: classes.dex */
public final class C1946m extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11498f = 0;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3810r f11499g;

    /* renamed from: h */
    public final /* synthetic */ C2657k0 f11500h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f11501i;

    /* renamed from: j */
    public final /* synthetic */ C2769p1 f11502j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC0667m0 f11503k;

    /* renamed from: l */
    public final /* synthetic */ long f11504l;

    /* renamed from: m */
    public final /* synthetic */ float f11505m;

    /* renamed from: n */
    public final /* synthetic */ float f11506n;

    /* renamed from: o */
    public final /* synthetic */ C3173d f11507o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1946m(InterfaceC3810r interfaceC3810r, C2657k0 c2657k0, InterfaceC2425y0 interfaceC2425y0, C2769p1 c2769p1, InterfaceC0667m0 interfaceC0667m0, long j6, float f7, float f8, C3173d c3173d) {
        super(2);
        this.f11499g = interfaceC3810r;
        this.f11500h = c2657k0;
        this.f11501i = interfaceC2425y0;
        this.f11502j = c2769p1;
        this.f11503k = interfaceC0667m0;
        this.f11504l = j6;
        this.f11505m = f7;
        this.f11506n = f8;
        this.f11507o = c3173d;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f11498f) {
            case 0:
                C2395p c2395p = (C2395p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
                    c2395p.m3852U();
                } else {
                    AbstractC2021v2.m3198a(this.f11499g, this.f11500h, this.f11501i, this.f11502j, this.f11503k, this.f11504l, this.f11505m, this.f11506n, this.f11507o, c2395p, 384);
                }
                return C1694m.f10482a;
            default:
                ((Number) obj2).intValue();
                int m3957F = AbstractC2418w.m3957F(385);
                AbstractC2021v2.m3198a(this.f11499g, this.f11500h, this.f11501i, this.f11502j, this.f11503k, this.f11504l, this.f11505m, this.f11506n, this.f11507o, (C2395p) obj, m3957F);
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1946m(InterfaceC3810r interfaceC3810r, C2657k0 c2657k0, InterfaceC2425y0 interfaceC2425y0, C2769p1 c2769p1, InterfaceC0667m0 interfaceC0667m0, long j6, float f7, float f8, C3173d c3173d, int i7) {
        super(2);
        this.f11499g = interfaceC3810r;
        this.f11500h = c2657k0;
        this.f11501i = interfaceC2425y0;
        this.f11502j = c2769p1;
        this.f11503k = interfaceC0667m0;
        this.f11504l = j6;
        this.f11505m = f7;
        this.f11506n = f8;
        this.f11507o = c3173d;
    }
}
