package p063i0;

import androidx.compose.foundation.selection.AbstractC0161b;
import androidx.compose.material3.MinimumInteractiveModifier;
import p035e1.InterfaceC0667m0;
import p053g5.C1694m;
import p085l0.AbstractC2418w;
import p085l0.C2394o2;
import p085l0.C2395p;
import p085l0.InterfaceC2385m1;
import p092m.AbstractC2487d;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3144n;
import p145t0.C3173d;
import p146t1.InterfaceC3217l0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p162v1.C3504h;
import p162v1.C3507i;
import p162v1.C3558z;
import p162v1.InterfaceC3510j;
import p170w1.AbstractC3674f1;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.x5 */
/* loaded from: classes.dex */
public final class C2040x5 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3810r f12149f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC0667m0 f12150g;

    /* renamed from: h */
    public final /* synthetic */ long f12151h;

    /* renamed from: i */
    public final /* synthetic */ float f12152i;

    /* renamed from: j */
    public final /* synthetic */ boolean f12153j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC3277a f12154k;

    /* renamed from: l */
    public final /* synthetic */ float f12155l;

    /* renamed from: m */
    public final /* synthetic */ C3173d f12156m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2040x5(InterfaceC3810r interfaceC3810r, InterfaceC0667m0 interfaceC0667m0, long j6, float f7, boolean z7, InterfaceC3277a interfaceC3277a, float f8, C3173d c3173d) {
        super(2);
        this.f12149f = interfaceC3810r;
        this.f12150g = interfaceC0667m0;
        this.f12151h = j6;
        this.f12152i = f7;
        this.f12153j = z7;
        this.f12154k = interfaceC3277a;
        this.f12155l = f8;
        this.f12156m = c3173d;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        C2395p c2395p = (C2395p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C2394o2 c2394o2 = AbstractC1957n2.f11577a;
            InterfaceC3810r m371a = AbstractC0161b.m371a(AbstractC2048y5.m3212c(this.f12149f.mo5829e(MinimumInteractiveModifier.f732a), this.f12150g, AbstractC2048y5.m3213d(this.f12151h, this.f12152i, c2395p), null, ((InterfaceC3093c) c2395p.m3878k(AbstractC3674f1.f17517h)).mo4526y(this.f12155l)), this.f12153j, null, AbstractC1999s4.m3176a(false, 0.0f, 0L, c2395p, 0, 7), true, null, this.f12154k);
            InterfaceC3217l0 m4853e = AbstractC3144n.m4853e(C3795c.f17964e, true);
            int hashCode = Long.hashCode(c2395p.f13486T);
            InterfaceC2385m1 m3882m = c2395p.m3882m();
            InterfaceC3810r m5823c = AbstractC3793a.m5823c(c2395p, m371a);
            InterfaceC3510j.f16935d.getClass();
            C3558z c3558z = C3507i.f16928b;
            c2395p.m3863c0();
            if (c2395p.f13485S) {
                c2395p.m3880l(c3558z);
            } else {
                c2395p.m3883m0();
            }
            AbstractC2418w.m3954C(m4853e, c2395p, C3507i.f16931e);
            AbstractC2418w.m3954C(m3882m, c2395p, C3507i.f16930d);
            C3504h c3504h = C3507i.f16932f;
            if (c2395p.f13485S || !AbstractC3367j.m5096a(c2395p.m3847O(), Integer.valueOf(hashCode))) {
                AbstractC2487d.m4050n(hashCode, c2395p, hashCode, c3504h);
            }
            AbstractC2418w.m3954C(m5823c, c2395p, C3507i.f16929c);
            this.f12156m.mo22d(c2395p, 0);
            c2395p.m3888r(true);
        }
        return C1694m.f10482a;
    }
}
