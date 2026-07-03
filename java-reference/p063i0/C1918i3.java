package p063i0;

import p053g5.C1694m;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.i3 */
/* loaded from: classes.dex */
public final class C1918i3 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ AbstractC3239v0 f11319f;

    /* renamed from: g */
    public final /* synthetic */ boolean f11320g;

    /* renamed from: h */
    public final /* synthetic */ float f11321h;

    /* renamed from: i */
    public final /* synthetic */ AbstractC3239v0 f11322i;

    /* renamed from: j */
    public final /* synthetic */ int f11323j;

    /* renamed from: k */
    public final /* synthetic */ float f11324k;

    /* renamed from: l */
    public final /* synthetic */ float f11325l;

    /* renamed from: m */
    public final /* synthetic */ AbstractC3239v0 f11326m;

    /* renamed from: n */
    public final /* synthetic */ int f11327n;

    /* renamed from: o */
    public final /* synthetic */ float f11328o;

    /* renamed from: p */
    public final /* synthetic */ AbstractC3239v0 f11329p;

    /* renamed from: q */
    public final /* synthetic */ int f11330q;

    /* renamed from: r */
    public final /* synthetic */ float f11331r;

    /* renamed from: s */
    public final /* synthetic */ int f11332s;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC3223n0 f11333t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1918i3(AbstractC3239v0 abstractC3239v0, boolean z7, float f7, AbstractC3239v0 abstractC3239v02, int i7, float f8, float f9, AbstractC3239v0 abstractC3239v03, int i8, float f10, AbstractC3239v0 abstractC3239v04, int i9, float f11, int i10, InterfaceC3223n0 interfaceC3223n0) {
        super(1);
        this.f11319f = abstractC3239v0;
        this.f11320g = z7;
        this.f11321h = f7;
        this.f11322i = abstractC3239v02;
        this.f11323j = i7;
        this.f11324k = f8;
        this.f11325l = f9;
        this.f11326m = abstractC3239v03;
        this.f11327n = i8;
        this.f11328o = f10;
        this.f11329p = abstractC3239v04;
        this.f11330q = i9;
        this.f11331r = f11;
        this.f11332s = i10;
        this.f11333t = interfaceC3223n0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
        float f7 = this.f11328o;
        float f8 = this.f11325l;
        AbstractC3239v0 abstractC3239v0 = this.f11319f;
        if (abstractC3239v0 != null) {
            AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v0, (this.f11332s - abstractC3239v0.f16053e) / 2, AbstractC3784a.m5794D((f7 - this.f11333t.mo4513Q(AbstractC1926j3.f11381e)) + f8));
        }
        if (this.f11320g || this.f11321h != 0.0f) {
            AbstractC3237u0.m4951j(abstractC3237u0, this.f11322i, this.f11323j, AbstractC3784a.m5794D(this.f11324k + f8));
        }
        AbstractC3237u0.m4951j(abstractC3237u0, this.f11326m, this.f11327n, AbstractC3784a.m5794D(f7 + f8));
        AbstractC3237u0.m4951j(abstractC3237u0, this.f11329p, this.f11330q, AbstractC3784a.m5794D(this.f11331r + f8));
        return C1694m.f10482a;
    }
}
