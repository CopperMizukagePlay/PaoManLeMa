package p063i0;

import p035e1.InterfaceC0667m0;
import p053g5.C1694m;
import p078k0.AbstractC2231d;
import p085l0.C2395p;
import p145t0.AbstractC3178i;
import p145t0.C3173d;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.h */
/* loaded from: classes.dex */
public final class C1905h extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3281e f11259f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3281e f11260g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC0667m0 f11261h;

    /* renamed from: i */
    public final /* synthetic */ long f11262i;

    /* renamed from: j */
    public final /* synthetic */ float f11263j;

    /* renamed from: k */
    public final /* synthetic */ long f11264k;

    /* renamed from: l */
    public final /* synthetic */ long f11265l;

    /* renamed from: m */
    public final /* synthetic */ long f11266m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC3281e f11267n;

    /* renamed from: o */
    public final /* synthetic */ C3173d f11268o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1905h(InterfaceC3281e interfaceC3281e, InterfaceC3281e interfaceC3281e2, InterfaceC0667m0 interfaceC0667m0, long j6, float f7, long j7, long j8, long j9, InterfaceC3281e interfaceC3281e3, C3173d c3173d) {
        super(2);
        this.f11259f = interfaceC3281e;
        this.f11260g = interfaceC3281e2;
        this.f11261h = interfaceC0667m0;
        this.f11262i = j6;
        this.f11263j = f7;
        this.f11264k = j7;
        this.f11265l = j8;
        this.f11266m = j9;
        this.f11267n = interfaceC3281e3;
        this.f11268o = c3173d;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C3173d m4873d = AbstractC3178i.m4873d(1163543932, new C1896g(this.f11267n, this.f11268o, 1), c2395p);
            int i7 = AbstractC2231d.f12851a;
            AbstractC1930k.m3129a(m4873d, null, this.f11259f, this.f11260g, this.f11261h, this.f11262i, this.f11263j, AbstractC2019v0.m3196e(26, c2395p), this.f11264k, this.f11265l, this.f11266m, c2395p, 6);
        }
        return C1694m.f10482a;
    }
}
