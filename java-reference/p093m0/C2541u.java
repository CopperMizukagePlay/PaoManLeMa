package p093m0;

import java.util.ArrayList;
import p022c4.AbstractC0398h;
import p034e0.C0619n;
import p060h5.AbstractC1804l;
import p085l0.AbstractC2346c2;
import p085l0.AbstractC2399q;
import p085l0.C2335a;
import p085l0.C2350d2;
import p085l0.InterfaceC2343c;
import p145t0.C3179j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m0.u */
/* loaded from: classes.dex */
public final class C2541u extends AbstractC0398h {

    /* renamed from: d */
    public static final C2541u f13909d = new AbstractC0398h(1, 0, 2);

    @Override // p022c4.AbstractC0398h
    /* renamed from: a */
    public final void mo873a(C0619n c0619n, InterfaceC2343c interfaceC2343c, C2350d2 c2350d2, C3179j c3179j, InterfaceC2528i0 interfaceC2528i0) {
        C2335a c2335a;
        int m3767c;
        int i7;
        int m1276c = c0619n.m1276c(0);
        if (c2350d2.f13372n != 0) {
            AbstractC2399q.m3900c("Cannot move a group while inserting");
        }
        if (m1276c < 0) {
            AbstractC2399q.m3900c("Parameter offset is out of bounds");
        }
        if (m1276c != 0) {
            int i8 = c2350d2.f13378t;
            int i9 = c2350d2.f13380v;
            int i10 = c2350d2.f13379u;
            int i11 = i8;
            while (m1276c > 0) {
                i11 += c2350d2.f13360b[(c2350d2.m3781r(i11) * 5) + 3];
                if (i11 > i10) {
                    AbstractC2399q.m3900c("Parameter offset is out of bounds");
                }
                m1276c--;
            }
            int i12 = c2350d2.f13360b[(c2350d2.m3781r(i11) * 5) + 3];
            int m3771g = c2350d2.m3771g(c2350d2.f13360b, c2350d2.m3781r(c2350d2.f13378t));
            int m3771g2 = c2350d2.m3771g(c2350d2.f13360b, c2350d2.m3781r(i11));
            int i13 = i11 + i12;
            int m3771g3 = c2350d2.m3771g(c2350d2.f13360b, c2350d2.m3781r(i13));
            int i14 = m3771g3 - m3771g2;
            c2350d2.m3786w(i14, Math.max(c2350d2.f13378t - 1, 0));
            c2350d2.m3785v(i12);
            int[] iArr = c2350d2.f13360b;
            int m3781r = c2350d2.m3781r(i13) * 5;
            AbstractC1804l.m3015H(iArr, iArr, c2350d2.m3781r(i8) * 5, m3781r, (i12 * 5) + m3781r);
            if (i14 > 0) {
                Object[] objArr = c2350d2.f13361c;
                int m3772h = c2350d2.m3772h(m3771g2 + i14);
                System.arraycopy(objArr, m3772h, objArr, m3771g, c2350d2.m3772h(m3771g3 + i14) - m3772h);
            }
            int i15 = m3771g2 + i14;
            int i16 = i15 - m3771g;
            int i17 = c2350d2.f13369k;
            int i18 = c2350d2.f13370l;
            int length = c2350d2.f13361c.length;
            int i19 = c2350d2.f13371m;
            int i20 = i8 + i12;
            int i21 = i8;
            while (i21 < i20) {
                int m3781r2 = c2350d2.m3781r(i21);
                int i22 = i16;
                int m3771g4 = c2350d2.m3771g(iArr, m3781r2) - i22;
                if (i19 < m3781r2) {
                    i7 = 0;
                } else {
                    i7 = i17;
                }
                int[] iArr2 = iArr;
                iArr2[(m3781r2 * 5) + 4] = C2350d2.m3743i(C2350d2.m3743i(m3771g4, i7, i18, length), c2350d2.f13369k, c2350d2.f13370l, c2350d2.f13361c.length);
                i21++;
                i16 = i22;
                iArr = iArr2;
                i17 = i17;
            }
            int i23 = i13 + i12;
            int m3779p = c2350d2.m3779p();
            int m3732b = AbstractC2346c2.m3732b(c2350d2.f13362d, i13, m3779p);
            ArrayList arrayList = new ArrayList();
            if (m3732b >= 0) {
                while (m3732b < c2350d2.f13362d.size() && (m3767c = c2350d2.m3767c((c2335a = (C2335a) c2350d2.f13362d.get(m3732b)))) >= i13 && m3767c < i23) {
                    arrayList.add(c2335a);
                }
            }
            int i24 = i8 - i13;
            int size = arrayList.size();
            for (int i25 = 0; i25 < size; i25++) {
                C2335a c2335a2 = (C2335a) arrayList.get(i25);
                int m3767c2 = c2350d2.m3767c(c2335a2) + i24;
                if (m3767c2 >= c2350d2.f13365g) {
                    c2335a2.f13325a = -(m3779p - m3767c2);
                } else {
                    c2335a2.f13325a = m3767c2;
                }
                c2350d2.f13362d.add(AbstractC2346c2.m3732b(c2350d2.f13362d, m3767c2, m3779p), c2335a2);
            }
            if (c2350d2.m3752H(i13, i12)) {
                AbstractC2399q.m3900c("Unexpectedly removed anchors");
            }
            c2350d2.m3776m(i9, c2350d2.f13379u, i8);
            if (i14 > 0) {
                c2350d2.m3753I(i15, i14, i13 - 1);
            }
        }
    }
}
