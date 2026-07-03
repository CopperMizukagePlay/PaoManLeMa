package p063i0;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p137s.C3081j;
import p145t0.C3173d;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.l3 */
/* loaded from: classes.dex */
public final class C1942l3 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ int f11474f = 1;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3810r f11475g;

    /* renamed from: h */
    public final /* synthetic */ boolean f11476h;

    /* renamed from: i */
    public final /* synthetic */ long f11477i;

    /* renamed from: j */
    public final /* synthetic */ Object f11478j;

    /* renamed from: k */
    public final /* synthetic */ Object f11479k;

    /* renamed from: l */
    public final /* synthetic */ Object f11480l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1942l3(C1936k5 c1936k5, C3081j c3081j, InterfaceC3810r interfaceC3810r, C1893f5 c1893f5, boolean z7, long j6, int i7) {
        super(2);
        this.f11478j = c1936k5;
        this.f11479k = c3081j;
        this.f11475g = interfaceC3810r;
        this.f11480l = c1893f5;
        this.f11476h = z7;
        this.f11477i = j6;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f11474f) {
            case 0:
                ((Number) obj2).intValue();
                C3173d c3173d = (C3173d) this.f11478j;
                C1956n1 c1956n1 = (C1956n1) this.f11480l;
                C3173d c3173d2 = (C3173d) this.f11479k;
                AbstractC1982q3.m3152a(c3173d, this.f11475g, c1956n1, this.f11476h, this.f11477i, c3173d2, (C2395p) obj, AbstractC2418w.m3957F(196615));
                return C1694m.f10482a;
            default:
                ((Number) obj2).intValue();
                C1936k5 c1936k5 = (C1936k5) this.f11478j;
                C3081j c3081j = (C3081j) this.f11479k;
                C1893f5 c1893f5 = (C1893f5) this.f11480l;
                c1936k5.m3136a(c3081j, this.f11475g, c1893f5, this.f11476h, this.f11477i, (C2395p) obj, AbstractC2418w.m3957F(196609));
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1942l3(C3173d c3173d, InterfaceC3810r interfaceC3810r, C1956n1 c1956n1, boolean z7, long j6, C3173d c3173d2, int i7) {
        super(2);
        this.f11478j = c3173d;
        this.f11475g = interfaceC3810r;
        this.f11480l = c1956n1;
        this.f11476h = z7;
        this.f11477i = j6;
        this.f11479k = c3173d2;
    }
}
