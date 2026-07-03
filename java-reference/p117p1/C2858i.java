package p117p1;

import p034e0.C0614k0;
import p077k.C2184c0;
import p077k.C2209p;
import p101n0.C2705e;
import p146t1.InterfaceC3238v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.i */
/* loaded from: classes.dex */
public class C2858i {

    /* renamed from: a */
    public final C2705e f14989a = new C2705e(new C2856h[16]);

    /* renamed from: b */
    public final C2184c0 f14990b = new C2184c0(10);

    /* renamed from: a */
    public boolean mo4527a(C2209p c2209p, InterfaceC3238v interfaceC3238v, C0614k0 c0614k0, boolean z7) {
        C2705e c2705e = this.f14989a;
        Object[] objArr = c2705e.f14517e;
        int i7 = c2705e.f14519g;
        boolean z8 = false;
        for (int i8 = 0; i8 < i7; i8++) {
            if (!((C2856h) objArr[i8]).mo4527a(c2209p, interfaceC3238v, c0614k0, z7) && !z8) {
                z8 = false;
            } else {
                z8 = true;
            }
        }
        return z8;
    }

    /* renamed from: b */
    public void mo4528b(C0614k0 c0614k0) {
        C2705e c2705e = this.f14989a;
        int i7 = c2705e.f14519g;
        while (true) {
            i7--;
            if (-1 < i7) {
                if (((C2856h) c2705e.f14517e[i7]).f14971d.f2244a == 0) {
                    c2705e.m4309k(i7);
                }
            } else {
                return;
            }
        }
    }
}
