package p063i0;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p145t0.C3173d;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.r6 */
/* loaded from: classes.dex */
public final class C1993r6 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11725f = 0;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3810r f11726g;

    /* renamed from: h */
    public final /* synthetic */ long f11727h;

    /* renamed from: i */
    public final /* synthetic */ long f11728i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC3282f f11729j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3281e f11730k;

    /* renamed from: l */
    public final /* synthetic */ C3173d f11731l;

    /* renamed from: m */
    public final /* synthetic */ int f11732m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1993r6(int i7, InterfaceC3810r interfaceC3810r, long j6, long j7, InterfaceC3282f interfaceC3282f, InterfaceC3281e interfaceC3281e, C3173d c3173d, int i8) {
        super(2);
        this.f11732m = i7;
        this.f11726g = interfaceC3810r;
        this.f11727h = j6;
        this.f11728i = j7;
        this.f11729j = interfaceC3282f;
        this.f11730k = interfaceC3281e;
        this.f11731l = c3173d;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7 = this.f11725f;
        C2395p c2395p = (C2395p) obj;
        ((Number) obj2).intValue();
        switch (i7) {
            case 0:
                AbstractC2017u6.m3190c(this.f11732m, this.f11726g, this.f11727h, this.f11728i, this.f11729j, this.f11730k, this.f11731l, c2395p, AbstractC2418w.m3957F(1572865));
                return C1694m.f10482a;
            default:
                AbstractC2017u6.m3191d(this.f11726g, this.f11727h, this.f11728i, this.f11729j, this.f11730k, this.f11731l, c2395p, AbstractC2418w.m3957F(this.f11732m | 1));
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1993r6(InterfaceC3810r interfaceC3810r, long j6, long j7, InterfaceC3282f interfaceC3282f, InterfaceC3281e interfaceC3281e, C3173d c3173d, int i7) {
        super(2);
        this.f11726g = interfaceC3810r;
        this.f11727h = j6;
        this.f11728i = j7;
        this.f11729j = interfaceC3282f;
        this.f11730k = interfaceC3281e;
        this.f11731l = c3173d;
        this.f11732m = i7;
    }
}
