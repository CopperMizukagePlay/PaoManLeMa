package p115p;

import p001a0.C0040j2;
import p001a0.C0061p;
import p063i0.C1879e0;
import p085l0.C2395p;
import p085l0.C2405r1;
import p145t0.C3173d;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3282f;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p.e */
/* loaded from: classes.dex */
public final class C2825e {

    /* renamed from: a */
    public final C3469p f14886a = new C3469p();

    /* renamed from: b */
    public static void m4449b(C2825e c2825e, C0061p c0061p, boolean z7, InterfaceC3277a interfaceC3277a) {
        c2825e.f14886a.add(new C3173d(262103052, new C0040j2(c0061p, z7, interfaceC3277a), true));
    }

    /* renamed from: a */
    public final void m4450a(C2821a c2821a, C2395p c2395p, int i7) {
        int i8;
        int i9;
        c2395p.m3859a0(1320309496);
        if (c2395p.m3870g(c2821a)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i10 = i8 | i7;
        if (c2395p.m3870g(this)) {
            i9 = 32;
        } else {
            i9 = 16;
        }
        int i11 = i10 | i9;
        if ((i11 & 19) == 18 && c2395p.m3836D()) {
            c2395p.m3852U();
        } else {
            C3469p c3469p = this.f14886a;
            int size = c3469p.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((InterfaceC3282f) c3469p.get(i12)).mo24c(c2821a, c2395p, Integer.valueOf(i11 & 14));
            }
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C1879e0(i7, 5, this, c2821a);
        }
    }
}
