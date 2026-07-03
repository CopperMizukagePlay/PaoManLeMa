package p034e0;

import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2395p;
import p145t0.AbstractC3178i;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p170w1.AbstractC3674f1;
import p170w1.InterfaceC3679g2;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.d */
/* loaded from: classes.dex */
public final class C0599d extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3679g2 f1968f;

    /* renamed from: g */
    public final /* synthetic */ long f1969g;

    /* renamed from: h */
    public final /* synthetic */ boolean f1970h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3810r f1971i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC0617m f1972j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0599d(InterfaceC3679g2 interfaceC3679g2, long j6, boolean z7, InterfaceC3810r interfaceC3810r, InterfaceC0617m interfaceC0617m) {
        super(2);
        this.f1968f = interfaceC3679g2;
        this.f1969g = j6;
        this.f1970h = z7;
        this.f1971i = interfaceC3810r;
        this.f1972j = interfaceC0617m;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            AbstractC2418w.m3959a(AbstractC3674f1.f17528s.mo3716a(this.f1968f), AbstractC3178i.m4873d(-1426434671, new C0597c(this.f1969g, this.f1970h, this.f1971i, this.f1972j), c2395p), c2395p, 56);
        }
        return C1694m.f10482a;
    }
}
