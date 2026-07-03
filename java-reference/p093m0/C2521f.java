package p093m0;

import p001a0.C0068q2;
import p014b5.C0288b;
import p022c4.AbstractC0398h;
import p034e0.C0619n;
import p085l0.C2350d2;
import p085l0.InterfaceC2343c;
import p145t0.C3174e;
import p145t0.C3179j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m0.f */
/* loaded from: classes.dex */
public final class C2521f extends AbstractC0398h {

    /* renamed from: d */
    public static final C2521f f13881d = new AbstractC0398h(0, 2, 1);

    @Override // p022c4.AbstractC0398h
    /* renamed from: a */
    public final void mo873a(C0619n c0619n, InterfaceC2343c interfaceC2343c, C2350d2 c2350d2, C3179j c3179j, InterfaceC2528i0 interfaceC2528i0) {
        int i7;
        C0068q2 c0068q2;
        C3174e c3174e = (C3174e) c0619n.m1277d(1);
        if (c3174e != null) {
            i7 = c3174e.f15887a;
        } else {
            i7 = 0;
        }
        C2511a c2511a = (C2511a) c0619n.m1277d(0);
        if (i7 > 0) {
            interfaceC2343c = new C0288b(interfaceC2343c, i7);
        }
        if (interfaceC2528i0 != null) {
            c0068q2 = new C0068q2(16, interfaceC2528i0, c2350d2);
        } else {
            c0068q2 = null;
        }
        c2511a.m4067P(interfaceC2343c, c2350d2, c3179j, c0068q2);
    }
}
