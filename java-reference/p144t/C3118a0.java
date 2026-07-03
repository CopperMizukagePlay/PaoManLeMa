package p144t;

import p009b0.C0260b;
import p060h5.C1814v;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p140s2.AbstractC3092b;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p146t1.InterfaceC3242x;
import p154u1.C3352h;
import p154u1.InterfaceC3347c;
import p154u1.InterfaceC3350f;
import p154u1.InterfaceC3351g;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.a0 */
/* loaded from: classes.dex */
public final class C3118a0 implements InterfaceC3242x, InterfaceC3347c, InterfaceC3350f {

    /* renamed from: a */
    public final InterfaceC3159u0 f15748a;

    /* renamed from: b */
    public final C2361g1 f15749b;

    /* renamed from: c */
    public final C2361g1 f15750c;

    public C3118a0(InterfaceC3159u0 interfaceC3159u0) {
        this.f15748a = interfaceC3159u0;
        this.f15749b = AbstractC2418w.m3980x(interfaceC3159u0);
        this.f15750c = AbstractC2418w.m3980x(interfaceC3159u0);
    }

    @Override // p154u1.InterfaceC3347c
    /* renamed from: c */
    public final void mo4819c(InterfaceC3351g interfaceC3351g) {
        InterfaceC3159u0 interfaceC3159u0 = (InterfaceC3159u0) interfaceC3351g.mo5084e(AbstractC3165x0.f15870a);
        InterfaceC3159u0 interfaceC3159u02 = this.f15748a;
        this.f15749b.setValue(new C3160v(interfaceC3159u02, interfaceC3159u0));
        this.f15750c.setValue(new C3153r0(interfaceC3159u0, interfaceC3159u02));
    }

    @Override // p146t1.InterfaceC3242x
    /* renamed from: d */
    public final InterfaceC3220m0 mo25d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        C2361g1 c2361g1 = this.f15749b;
        int mo3481d = ((InterfaceC3159u0) c2361g1.getValue()).mo3481d(interfaceC3223n0, interfaceC3223n0.getLayoutDirection());
        int mo3479b = ((InterfaceC3159u0) c2361g1.getValue()).mo3479b(interfaceC3223n0);
        int mo3480c = ((InterfaceC3159u0) c2361g1.getValue()).mo3480c(interfaceC3223n0, interfaceC3223n0.getLayoutDirection()) + mo3481d;
        int mo3478a = ((InterfaceC3159u0) c2361g1.getValue()).mo3478a(interfaceC3223n0) + mo3479b;
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(AbstractC3092b.m4772i(-mo3480c, -mo3478a, j6));
        return interfaceC3223n0.mo4941K(AbstractC3092b.m4770g(mo4918e.f16053e + mo3480c, j6), AbstractC3092b.m4769f(mo4918e.f16054f + mo3478a, j6), C1814v.f10861e, new C0260b(mo4918e, mo3481d, mo3479b, 2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3118a0)) {
            return false;
        }
        return AbstractC3367j.m5096a(((C3118a0) obj).f15748a, this.f15748a);
    }

    @Override // p154u1.InterfaceC3350f
    public final C3352h getKey() {
        return AbstractC3165x0.f15870a;
    }

    @Override // p154u1.InterfaceC3350f
    public final Object getValue() {
        return (InterfaceC3159u0) this.f15750c.getValue();
    }

    public final int hashCode() {
        return this.f15748a.hashCode();
    }
}
