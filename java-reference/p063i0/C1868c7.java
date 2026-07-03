package p063i0;

import androidx.compose.material3.AbstractC0165a;
import p001a0.C0013d;
import p001a0.C0075s1;
import p032d6.AbstractC0525d0;
import p060h5.C1814v;
import p078k0.AbstractC2257z;
import p082k5.InterfaceC2313c;
import p100n.C2635d;
import p137s.InterfaceC3080i;
import p140s2.AbstractC3092b;
import p140s2.AbstractC3099i;
import p140s2.C3091a;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p162v1.InterfaceC3549w;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.c7 */
/* loaded from: classes.dex */
public final class C1868c7 extends AbstractC3809q implements InterfaceC3549w {

    /* renamed from: s */
    public InterfaceC3080i f11023s;

    /* renamed from: t */
    public boolean f11024t;

    /* renamed from: u */
    public boolean f11025u;

    /* renamed from: v */
    public C2635d f11026v;

    /* renamed from: w */
    public C2635d f11027w;

    /* renamed from: x */
    public float f11028x;

    /* renamed from: y */
    public float f11029y;

    @Override // p177x0.AbstractC3809q
    /* renamed from: C0 */
    public final void mo789C0() {
        AbstractC0525d0.m1141s(m5830y0(), null, new C0075s1(this, null, 4), 3);
    }

    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        boolean z7;
        float f7;
        float f8;
        boolean z8;
        Float f9;
        Float f10;
        boolean z9 = false;
        if (interfaceC3214k0.mo4920f(C3091a.m4760h(j6)) != 0 && interfaceC3214k0.mo4917c0(C3091a.m4759g(j6)) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f11025u) {
            f7 = AbstractC2257z.f13086a;
        } else if (!z7 && !this.f11024t) {
            f7 = AbstractC0165a.f736b;
        } else {
            f7 = AbstractC0165a.f735a;
        }
        float mo4526y = interfaceC3223n0.mo4526y(f7);
        C2635d c2635d = this.f11027w;
        if (c2635d != null) {
            f8 = ((Number) c2635d.m4206d()).floatValue();
        } else {
            f8 = mo4526y;
        }
        int i7 = (int) f8;
        if (i7 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (i7 >= 0) {
            z9 = true;
        }
        if (!(z8 & z9)) {
            AbstractC3099i.m4781a("width and height must be >= 0");
        }
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(AbstractC3092b.m4771h(i7, i7, i7, i7));
        float mo4526y2 = interfaceC3223n0.mo4526y((AbstractC0165a.f738d - interfaceC3223n0.mo4524v0(mo4526y)) / 2.0f);
        float mo4526y3 = interfaceC3223n0.mo4526y((AbstractC0165a.f737c - AbstractC0165a.f735a) - AbstractC0165a.f739e);
        boolean z10 = this.f11025u;
        if (z10 && this.f11024t) {
            mo4526y2 = mo4526y3 - interfaceC3223n0.mo4526y(AbstractC2257z.f13090e);
        } else if (z10 && !this.f11024t) {
            mo4526y2 = interfaceC3223n0.mo4526y(AbstractC2257z.f13090e);
        } else if (this.f11024t) {
            mo4526y2 = mo4526y3;
        }
        C2635d c2635d2 = this.f11027w;
        InterfaceC2313c interfaceC2313c = null;
        if (c2635d2 != null) {
            f9 = (Float) c2635d2.f14261e.getValue();
        } else {
            f9 = null;
        }
        if (f9 == null || f9.floatValue() != mo4526y) {
            AbstractC0525d0.m1141s(m5830y0(), null, new C1859b7(this, mo4526y, interfaceC2313c, 0), 3);
        }
        C2635d c2635d3 = this.f11026v;
        if (c2635d3 != null) {
            f10 = (Float) c2635d3.f14261e.getValue();
        } else {
            f10 = null;
        }
        if (f10 == null || f10.floatValue() != mo4526y2) {
            AbstractC0525d0.m1141s(m5830y0(), null, new C1859b7(this, mo4526y2, interfaceC2313c, 1), 3);
        }
        if (Float.isNaN(this.f11029y) && Float.isNaN(this.f11028x)) {
            this.f11029y = mo4526y;
            this.f11028x = mo4526y2;
        }
        return interfaceC3223n0.mo4941K(i7, i7, C1814v.f10861e, new C0013d(mo4918e, this, mo4526y2));
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: z0 */
    public final boolean mo570z0() {
        return false;
    }
}
