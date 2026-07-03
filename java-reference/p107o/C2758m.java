package p107o;

import p001a0.C0019e1;
import p027d1.C0465c;
import p035e1.C0654g;
import p035e1.C0666m;
import p049g1.C1568b;
import p049g1.InterfaceC1570d;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p158u5.C3379v;
import p162v1.C3508i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.m */
/* loaded from: classes.dex */
public final class C2758m extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ C0465c f14712f;

    /* renamed from: g */
    public final /* synthetic */ C3379v f14713g;

    /* renamed from: h */
    public final /* synthetic */ long f14714h;

    /* renamed from: i */
    public final /* synthetic */ C0666m f14715i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2758m(C0465c c0465c, C3379v c3379v, long j6, C0666m c0666m) {
        super(1);
        this.f14712f = c0465c;
        this.f14713g = c3379v;
        this.f14714h = j6;
        this.f14715i = c0666m;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C3508i0 c3508i0 = (C3508i0) obj;
        c3508i0.m5460a();
        C0465c c0465c = this.f14712f;
        float f7 = c0465c.f1625a;
        float f8 = c0465c.f1626b;
        C3379v c3379v = this.f14713g;
        long j6 = this.f14714h;
        C0666m c0666m = this.f14715i;
        C1568b c1568b = c3508i0.f16933e;
        ((C0019e1) c1568b.f10182f.f152f).m50v(f7, f8);
        try {
            InterfaceC1570d.m2542d0(c3508i0, (C0654g) c3379v.f16451e, j6, 0L, 0.0f, c0666m, 0, 890);
            ((C0019e1) c1568b.f10182f.f152f).m50v(-f7, -f8);
            return C1694m.f10482a;
        } catch (Throwable th) {
            ((C0019e1) c1568b.f10182f.f152f).m50v(-f7, -f8);
            throw th;
        }
    }
}
