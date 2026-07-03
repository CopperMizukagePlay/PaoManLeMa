package p093m0;

import p022c4.AbstractC0398h;
import p034e0.C0619n;
import p085l0.C2335a;
import p085l0.C2350d2;
import p085l0.C2405r1;
import p085l0.C2420w1;
import p085l0.InterfaceC2343c;
import p145t0.C3179j;
import p150t5.InterfaceC3277a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m0.r */
/* loaded from: classes.dex */
public final class C2538r extends AbstractC0398h {

    /* renamed from: e */
    public static final C2538r f13902e;

    /* renamed from: f */
    public static final C2538r f13903f;

    /* renamed from: g */
    public static final C2538r f13904g;

    /* renamed from: h */
    public static final C2538r f13905h;

    /* renamed from: d */
    public final /* synthetic */ int f13906d;

    static {
        int i7 = 1;
        f13902e = new C2538r(i7, 2, 0);
        int i8 = 1;
        f13903f = new C2538r(i8, i8, 1);
        f13904g = new C2538r(i7, 2, 2);
        int i9 = 1;
        f13905h = new C2538r(i9, i9, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2538r(int i7, int i8, int i9) {
        super(i7, i8, 1, (byte) 0);
        this.f13906d = i9;
    }

    @Override // p022c4.AbstractC0398h
    /* renamed from: a */
    public final void mo873a(C0619n c0619n, InterfaceC2343c interfaceC2343c, C2350d2 c2350d2, C3179j c3179j, InterfaceC2528i0 interfaceC2528i0) {
        switch (this.f13906d) {
            case 0:
                Object mo52a = ((InterfaceC3277a) c0619n.m1277d(0)).mo52a();
                C2335a c2335a = (C2335a) c0619n.m1277d(1);
                int m1276c = c0619n.m1276c(0);
                c2335a.getClass();
                c2350d2.m3764T(c2350d2.m3767c(c2335a), mo52a);
                interfaceC2343c.mo93f(m1276c, mo52a);
                interfaceC2343c.mo91d(mo52a);
                return;
            case 1:
                C2335a c2335a2 = (C2335a) c0619n.m1277d(0);
                int m1276c2 = c0619n.m1276c(0);
                interfaceC2343c.mo103q();
                c2335a2.getClass();
                interfaceC2343c.mo88a(m1276c2, c2350d2.m3747C(c2350d2.m3767c(c2335a2)));
                return;
            case 2:
                Object m1277d = c0619n.m1277d(0);
                C2335a c2335a3 = (C2335a) c0619n.m1277d(1);
                int m1276c3 = c0619n.m1276c(0);
                if (m1277d instanceof C2420w1) {
                    C2420w1 c2420w1 = (C2420w1) m1277d;
                    c3179j.f15896e.m4300b(c2420w1);
                    c3179j.f15895d.m3599a(c2420w1);
                }
                Object m3754J = c2350d2.m3754J(c2350d2.m3767c(c2335a3), m1276c3, m1277d);
                if (m3754J instanceof C2420w1) {
                    c3179j.m4878d((C2420w1) m3754J);
                    return;
                } else {
                    if (m3754J instanceof C2405r1) {
                        ((C2405r1) m3754J).m3908d();
                        return;
                    }
                    return;
                }
            default:
                Object m1277d2 = c0619n.m1277d(0);
                int m1276c4 = c0619n.m1276c(0);
                if (m1277d2 instanceof C2420w1) {
                    C2420w1 c2420w12 = (C2420w1) m1277d2;
                    c3179j.f15896e.m4300b(c2420w12);
                    c3179j.f15895d.m3599a(c2420w12);
                }
                Object m3754J2 = c2350d2.m3754J(c2350d2.f13378t, m1276c4, m1277d2);
                if (m3754J2 instanceof C2420w1) {
                    c3179j.m4878d((C2420w1) m3754J2);
                    return;
                } else {
                    if (m3754J2 instanceof C2405r1) {
                        ((C2405r1) m3754J2).m3908d();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // p022c4.AbstractC0398h
    /* renamed from: b */
    public C2335a mo874b(C0619n c0619n) {
        switch (this.f13906d) {
            case 0:
                return (C2335a) c0619n.m1277d(1);
            case 1:
                return (C2335a) c0619n.m1277d(0);
            default:
                return super.mo874b(c0619n);
        }
    }
}
