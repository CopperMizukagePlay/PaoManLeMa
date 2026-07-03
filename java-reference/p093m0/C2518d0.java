package p093m0;

import p022c4.AbstractC0398h;
import p034e0.C0619n;
import p085l0.AbstractC2399q;
import p085l0.C2350d2;
import p085l0.C2405r1;
import p085l0.C2420w1;
import p085l0.InterfaceC2343c;
import p145t0.C3179j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m0.d0 */
/* loaded from: classes.dex */
public final class C2518d0 extends AbstractC0398h {

    /* renamed from: d */
    public static final C2518d0 f13878d = new AbstractC0398h(1, 0, 2);

    @Override // p022c4.AbstractC0398h
    /* renamed from: a */
    public final void mo873a(C0619n c0619n, InterfaceC2343c interfaceC2343c, C2350d2 c2350d2, C3179j c3179j, InterfaceC2528i0 interfaceC2528i0) {
        int m1276c = c0619n.m1276c(0);
        int i7 = c2350d2.f13380v;
        int m3757M = c2350d2.m3757M(c2350d2.f13360b, c2350d2.m3781r(i7));
        int m3771g = c2350d2.m3771g(c2350d2.f13360b, c2350d2.m3781r(i7 + 1));
        for (int max = Math.max(m3757M, m3771g - m1276c); max < m3771g; max++) {
            Object obj = c2350d2.f13361c[c2350d2.m3772h(max)];
            if (obj instanceof C2420w1) {
                c3179j.m4878d((C2420w1) obj);
            } else if (obj instanceof C2405r1) {
                ((C2405r1) obj).m3908d();
            }
        }
        if (m1276c <= 0) {
            AbstractC2399q.m3900c("Check failed");
        }
        int i8 = c2350d2.f13380v;
        int m3757M2 = c2350d2.m3757M(c2350d2.f13360b, c2350d2.m3781r(i8));
        int m3771g2 = c2350d2.m3771g(c2350d2.f13360b, c2350d2.m3781r(i8 + 1)) - m1276c;
        if (m3771g2 < m3757M2) {
            AbstractC2399q.m3900c("Check failed");
        }
        c2350d2.m3753I(m3771g2, m1276c, i8);
        int i9 = c2350d2.f13367i;
        if (i9 >= m3757M2) {
            c2350d2.f13367i = i9 - m1276c;
        }
    }
}
