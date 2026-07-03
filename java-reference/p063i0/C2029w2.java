package p063i0;

import p009b0.C0260b;
import p060h5.C1814v;
import p140s2.C3096f;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3214k0;
import p146t1.InterfaceC3220m0;
import p146t1.InterfaceC3223n0;
import p162v1.AbstractC3498f;
import p162v1.InterfaceC3513k;
import p162v1.InterfaceC3549w;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.w2 */
/* loaded from: classes.dex */
public final class C2029w2 extends AbstractC3809q implements InterfaceC3513k, InterfaceC3549w {
    @Override // p162v1.InterfaceC3549w
    /* renamed from: d */
    public final InterfaceC3220m0 mo546d(InterfaceC3223n0 interfaceC3223n0, InterfaceC3214k0 interfaceC3214k0, long j6) {
        boolean z7;
        int i7;
        int i8;
        float f7 = ((C3096f) AbstractC3498f.m5369i(this, AbstractC1957n2.f11577a)).f15693e;
        int i9 = 0;
        float f8 = 0;
        if (f7 < f8) {
            f7 = f8;
        }
        AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(j6);
        if (this.f18005r && !Float.isNaN(f7) && Float.compare(f7, f8) > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!Float.isNaN(f7)) {
            i9 = interfaceC3223n0.mo4513Q(f7);
        }
        if (z7) {
            i7 = Math.max(mo4918e.f16053e, i9);
        } else {
            i7 = mo4918e.f16053e;
        }
        if (z7) {
            i8 = Math.max(mo4918e.f16054f, i9);
        } else {
            i8 = mo4918e.f16054f;
        }
        return interfaceC3223n0.mo4941K(i7, i8, C1814v.f10861e, new C0260b(i7, mo4918e, i8));
    }
}
