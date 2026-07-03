package p093m0;

import p022c4.AbstractC0398h;
import p034e0.C0619n;
import p085l0.AbstractC2399q;
import p085l0.C2335a;
import p085l0.C2350d2;
import p085l0.C2420w1;
import p085l0.InterfaceC2343c;
import p145t0.C3179j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m0.e */
/* loaded from: classes.dex */
public final class C2519e extends AbstractC0398h {

    /* renamed from: d */
    public static final C2519e f13879d = new AbstractC0398h(0, 2, 1);

    @Override // p022c4.AbstractC0398h
    /* renamed from: a */
    public final void mo873a(C0619n c0619n, InterfaceC2343c interfaceC2343c, C2350d2 c2350d2, C3179j c3179j, InterfaceC2528i0 interfaceC2528i0) {
        C2335a c2335a = (C2335a) c0619n.m1277d(0);
        Object m1277d = c0619n.m1277d(1);
        if (m1277d instanceof C2420w1) {
            C2420w1 c2420w1 = (C2420w1) m1277d;
            c3179j.f15896e.m4300b(c2420w1);
            c3179j.f15895d.m3599a(c2420w1);
        }
        if (c2350d2.f13372n != 0) {
            AbstractC2399q.m3900c("Can only append a slot if not current inserting");
        }
        int i7 = c2350d2.f13367i;
        int i8 = c2350d2.f13368j;
        int m3767c = c2350d2.m3767c(c2335a);
        int m3771g = c2350d2.m3771g(c2350d2.f13360b, c2350d2.m3781r(m3767c + 1));
        c2350d2.f13367i = m3771g;
        c2350d2.f13368j = m3771g;
        c2350d2.m3786w(1, m3767c);
        if (i7 >= m3771g) {
            i7++;
            i8++;
        }
        c2350d2.f13361c[m3771g] = m1277d;
        c2350d2.f13367i = i7;
        c2350d2.f13368j = i8;
    }
}
