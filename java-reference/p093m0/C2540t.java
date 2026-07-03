package p093m0;

import p001a0.C0068q2;
import p022c4.AbstractC0398h;
import p034e0.C0619n;
import p085l0.AbstractC2399q;
import p085l0.C2335a;
import p085l0.C2338a2;
import p085l0.C2350d2;
import p085l0.InterfaceC2343c;
import p145t0.C3179j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m0.t */
/* loaded from: classes.dex */
public final class C2540t extends AbstractC0398h {

    /* renamed from: d */
    public static final C2540t f13908d = new AbstractC0398h(0, 3, 1);

    @Override // p022c4.AbstractC0398h
    /* renamed from: a */
    public final void mo873a(C0619n c0619n, InterfaceC2343c interfaceC2343c, C2350d2 c2350d2, C3179j c3179j, InterfaceC2528i0 interfaceC2528i0) {
        C0068q2 c0068q2;
        C2338a2 c2338a2 = (C2338a2) c0619n.m1277d(1);
        C2335a c2335a = (C2335a) c0619n.m1277d(0);
        C2515c c2515c = (C2515c) c0619n.m1277d(2);
        C2350d2 m3721d = c2338a2.m3721d();
        if (interfaceC2528i0 != null) {
            try {
                c0068q2 = new C0068q2(16, interfaceC2528i0, c2350d2);
            } catch (Throwable th) {
                m3721d.m3769e(false);
                throw th;
            }
        } else {
            c0068q2 = null;
        }
        if (!c2515c.f13875b.m4075R()) {
            AbstractC2399q.m3900c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c2515c.f13874a.m4074Q(interfaceC2343c, m3721d, c3179j, c0068q2);
        m3721d.m3769e(true);
        c2350d2.m3768d();
        c2335a.getClass();
        c2350d2.m3788z(c2338a2, c2338a2.m3718a(c2335a));
        c2350d2.m3774k();
    }
}
