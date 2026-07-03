package p107o;

import p001a0.C0033i;
import p160v.C3421l0;
import p162v1.AbstractC3498f;
import p162v1.InterfaceC3509i1;
import p162v1.InterfaceC3513k;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.f0 */
/* loaded from: classes.dex */
public final class C2738f0 extends AbstractC3809q implements InterfaceC3513k, InterfaceC3509i1 {

    /* renamed from: s */
    public C3421l0 f14654s;

    /* renamed from: t */
    public boolean f14655t;

    @Override // p177x0.AbstractC3809q
    /* renamed from: E0 */
    public final void mo551E0() {
        C3421l0 c3421l0 = this.f14654s;
        if (c3421l0 != null) {
            c3421l0.m5183b();
        }
        this.f14654s = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u5.v] */
    @Override // p162v1.InterfaceC3509i1
    /* renamed from: M */
    public final void mo553M() {
        ?? obj = new Object();
        AbstractC3498f.m5379s(this, new C0033i(10, obj, this));
        C3421l0 c3421l0 = (C3421l0) obj.f16451e;
        if (this.f14655t) {
            C3421l0 c3421l02 = this.f14654s;
            if (c3421l02 != null) {
                c3421l02.m5183b();
            }
            if (c3421l0 != null) {
                c3421l0.m5182a();
            } else {
                c3421l0 = null;
            }
            this.f14654s = c3421l0;
        }
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }
}
