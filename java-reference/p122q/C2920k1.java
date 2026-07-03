package p122q;

import p107o.InterfaceC2739f1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.k1 */
/* loaded from: classes.dex */
public final class C2920k1 implements InterfaceC2958x0 {

    /* renamed from: a */
    public final /* synthetic */ C2929n1 f15210a;

    /* renamed from: b */
    public final /* synthetic */ C2923l1 f15211b;

    public C2920k1(C2929n1 c2929n1, C2923l1 c2923l1) {
        this.f15210a = c2929n1;
        this.f15211b = c2923l1;
    }

    @Override // p122q.InterfaceC2958x0
    /* renamed from: a */
    public final float mo4566a(float f7) {
        long m4588a;
        C2929n1 c2929n1 = this.f15210a;
        long m4591d = c2929n1.m4591d(c2929n1.m4594g(f7));
        C2929n1 c2929n12 = this.f15211b.f15214a;
        c2929n12.f15235g = 2;
        InterfaceC2739f1 interfaceC2739f1 = c2929n12.f15230b;
        if (interfaceC2739f1 != null && (c2929n12.f15229a.mo115d() || c2929n12.f15229a.mo113b())) {
            m4588a = interfaceC2739f1.mo4392c(m4591d, c2929n12.f15235g, c2929n12.f15238j);
        } else {
            m4588a = C2929n1.m4588a(c2929n12, c2929n12.f15236h, m4591d, 2);
        }
        return c2929n1.m4590c(c2929n1.m4593f(m4588a));
    }
}
