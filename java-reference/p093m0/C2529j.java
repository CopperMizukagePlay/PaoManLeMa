package p093m0;

import p022c4.AbstractC0398h;
import p034e0.C0619n;
import p066i3.AbstractC2067b;
import p085l0.AbstractC2399q;
import p085l0.C2335a;
import p085l0.C2350d2;
import p085l0.InterfaceC2343c;
import p145t0.C3174e;
import p145t0.C3179j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m0.j */
/* loaded from: classes.dex */
public final class C2529j extends AbstractC0398h {

    /* renamed from: d */
    public static final C2529j f13888d = new AbstractC0398h(0, 2, 1);

    @Override // p022c4.AbstractC0398h
    /* renamed from: a */
    public final void mo873a(C0619n c0619n, InterfaceC2343c interfaceC2343c, C2350d2 c2350d2, C3179j c3179j, InterfaceC2528i0 interfaceC2528i0) {
        int i7;
        int i8;
        C3174e c3174e = (C3174e) c0619n.m1277d(0);
        int m3767c = c2350d2.m3767c((C2335a) c0619n.m1277d(1));
        if (c2350d2.f13378t >= m3767c) {
            AbstractC2399q.m3900c("Check failed");
        }
        AbstractC2067b.m3295t(c2350d2, interfaceC2343c, m3767c);
        int i9 = c2350d2.f13378t;
        int i10 = c2350d2.f13380v;
        while (i10 >= 0 && !c2350d2.m3787x(i10)) {
            i10 = c2350d2.m3748D(c2350d2.f13360b, i10);
        }
        int i11 = i10 + 1;
        int i12 = 0;
        while (i11 < i9) {
            if (c2350d2.m3784u(i9, i11)) {
                if (c2350d2.m3787x(i11)) {
                    i12 = 0;
                }
                i11++;
            } else {
                if (c2350d2.m3787x(i11)) {
                    i8 = 1;
                } else {
                    i8 = c2350d2.f13360b[(c2350d2.m3781r(i11) * 5) + 1] & 67108863;
                }
                i12 += i8;
                i11 += c2350d2.m3783t(i11);
            }
        }
        while (true) {
            i7 = c2350d2.f13378t;
            if (i7 >= m3767c) {
                break;
            }
            if (c2350d2.m3784u(m3767c, i7)) {
                int i13 = c2350d2.f13378t;
                if (i13 < c2350d2.f13379u && (c2350d2.f13360b[(c2350d2.m3781r(i13) * 5) + 1] & 1073741824) != 0) {
                    interfaceC2343c.mo91d(c2350d2.m3747C(c2350d2.f13378t));
                    i12 = 0;
                }
                c2350d2.m3759O();
            } else {
                i12 += c2350d2.m3755K();
            }
        }
        if (i7 != m3767c) {
            AbstractC2399q.m3900c("Check failed");
        }
        c3174e.f15887a = i12;
    }
}
