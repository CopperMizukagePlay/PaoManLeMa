package p160v;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p145t0.C3173d;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.g0 */
/* loaded from: classes.dex */
public final class C3411g0 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f16545f = 1;

    /* renamed from: g */
    public final /* synthetic */ Object f16546g;

    /* renamed from: h */
    public final /* synthetic */ int f16547h;

    /* renamed from: i */
    public final /* synthetic */ int f16548i;

    /* renamed from: j */
    public final /* synthetic */ Object f16549j;

    /* renamed from: k */
    public final /* synthetic */ Object f16550k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3411g0(Object obj, int i7, C3425n0 c3425n0, C3173d c3173d, int i8) {
        super(2);
        this.f16546g = obj;
        this.f16547h = i7;
        this.f16549j = c3425n0;
        this.f16550k = c3173d;
        this.f16548i = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f16545f) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC3413h0 interfaceC3413h0 = (InterfaceC3413h0) this.f16549j;
                AbstractC3405d0.m5169d(interfaceC3413h0, this.f16546g, this.f16547h, this.f16550k, (C2395p) obj, AbstractC2418w.m3957F(this.f16548i | 1));
                return C1694m.f10482a;
            default:
                ((Number) obj2).intValue();
                C3425n0 c3425n0 = (C3425n0) this.f16549j;
                C3173d c3173d = (C3173d) this.f16550k;
                AbstractC3405d0.m5167b(this.f16546g, this.f16547h, c3425n0, c3173d, (C2395p) obj, AbstractC2418w.m3957F(this.f16548i | 1));
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3411g0(InterfaceC3413h0 interfaceC3413h0, Object obj, int i7, Object obj2, int i8) {
        super(2);
        this.f16549j = interfaceC3413h0;
        this.f16546g = obj;
        this.f16547h = i7;
        this.f16550k = obj2;
        this.f16548i = i8;
    }
}
