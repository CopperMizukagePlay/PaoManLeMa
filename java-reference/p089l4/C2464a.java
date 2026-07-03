package p089l4;

import java.util.List;
import java.util.Map;
import p001a0.C0068q2;
import p022c4.C0392b;
import p022c4.C0400j;
import p022c4.C0404n;
import p022c4.C0406p;
import p022c4.EnumC0391a;
import p022c4.EnumC0394d;
import p022c4.EnumC0405o;
import p022c4.InterfaceC0402l;
import p067i4.AbstractC2072e;
import p067i4.C2069b;
import p067i4.C2071d;
import p067i4.C2075h;
import p075j4.C2177a;
import p097m4.C2579c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l4.a */
/* loaded from: classes.dex */
public final class C2464a implements InterfaceC0402l {

    /* renamed from: b */
    public static final C0406p[] f13748b = new C0406p[0];

    /* renamed from: a */
    public final C2579c f13749a = new C2579c(0);

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0196, code lost:
    
        if ((r1.m138F(r12, r4) + r1.m138F(r13, r4)) > (r1.m138F(r12, r3) + r1.m138F(r13, r3))) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e2  */
    @Override // p022c4.InterfaceC0402l
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0404n mo875a(C0392b c0392b, Map map) {
        C2071d m4111c;
        C0406p[] c0406pArr;
        C2579c c2579c = this.f13749a;
        if (map != null && map.containsKey(EnumC0394d.PURE_BARCODE)) {
            C2069b m865a = c0392b.m865a();
            int[] m3316e = m865a.m3316e();
            int[] m3314c = m865a.m3314c();
            if (m3316e != null && m3314c != null) {
                int i7 = m865a.f12258e;
                int i8 = m3316e[0];
                int i9 = m3316e[1];
                while (i8 < i7 && m865a.m3313b(i8, i9)) {
                    i8++;
                }
                if (i8 != i7) {
                    int i10 = m3316e[0];
                    int i11 = i8 - i10;
                    if (i11 != 0) {
                        int i12 = m3316e[1];
                        int i13 = m3314c[1];
                        int i14 = ((m3314c[0] - i10) + 1) / i11;
                        int i15 = ((i13 - i12) + 1) / i11;
                        if (i14 > 0 && i15 > 0) {
                            int i16 = i11 / 2;
                            int i17 = i12 + i16;
                            int i18 = i10 + i16;
                            C2069b c2069b = new C2069b(i14, i15);
                            for (int i19 = 0; i19 < i15; i19++) {
                                int i20 = (i19 * i11) + i17;
                                for (int i21 = 0; i21 < i14; i21++) {
                                    if (m865a.m3313b((i21 * i11) + i18, i20)) {
                                        c2069b.m3319h(i21, i19);
                                    }
                                }
                            }
                            m4111c = c2579c.m4111c(c2069b);
                            c0406pArr = f13748b;
                        } else {
                            throw C0400j.m878a();
                        }
                    } else {
                        throw C0400j.m878a();
                    }
                } else {
                    throw C0400j.m878a();
                }
            } else {
                throw C0400j.m878a();
            }
        } else {
            C2069b m865a2 = c0392b.m865a();
            C0068q2 c0068q2 = new C0068q2(m865a2, 18);
            C0406p[] m3543b = ((C2177a) c0068q2.f345g).m3543b();
            C0406p c0406p = m3543b[0];
            C0406p c0406p2 = m3543b[1];
            C0406p c0406p3 = m3543b[3];
            C0406p c0406p4 = m3543b[2];
            int m138F = c0068q2.m138F(c0406p, c0406p2);
            int m138F2 = c0068q2.m138F(c0406p2, c0406p3);
            int m138F3 = c0068q2.m138F(c0406p3, c0406p4);
            int m138F4 = c0068q2.m138F(c0406p4, c0406p);
            C0406p[] c0406pArr2 = {c0406p4, c0406p, c0406p2, c0406p3};
            if (m138F > m138F2) {
                c0406pArr2[0] = c0406p;
                c0406pArr2[1] = c0406p2;
                c0406pArr2[2] = c0406p3;
                c0406pArr2[3] = c0406p4;
                m138F = m138F2;
            }
            if (m138F > m138F3) {
                c0406pArr2[0] = c0406p2;
                c0406pArr2[1] = c0406p3;
                c0406pArr2[2] = c0406p4;
                c0406pArr2[3] = c0406p;
            } else {
                m138F3 = m138F;
            }
            if (m138F3 > m138F4) {
                c0406pArr2[0] = c0406p3;
                c0406pArr2[1] = c0406p4;
                c0406pArr2[2] = c0406p;
                c0406pArr2[3] = c0406p2;
            }
            C0406p c0406p5 = c0406pArr2[0];
            C0406p c0406p6 = c0406pArr2[1];
            C0406p c0406p7 = c0406pArr2[2];
            C0406p c0406p8 = c0406pArr2[3];
            int m138F5 = (c0068q2.m138F(c0406p5, c0406p8) + 1) * 4;
            if (c0068q2.m138F(C0068q2.m133B(c0406p6, c0406p7, m138F5), c0406p5) < c0068q2.m138F(C0068q2.m133B(c0406p7, c0406p6, m138F5), c0406p8)) {
                c0406pArr2[0] = c0406p5;
                c0406pArr2[1] = c0406p6;
                c0406pArr2[2] = c0406p7;
                c0406pArr2[3] = c0406p8;
            } else {
                c0406pArr2[0] = c0406p6;
                c0406pArr2[1] = c0406p7;
                c0406pArr2[2] = c0406p8;
                c0406pArr2[3] = c0406p5;
            }
            C0406p c0406p9 = c0406pArr2[0];
            C0406p c0406p10 = c0406pArr2[1];
            C0406p c0406p11 = c0406pArr2[2];
            C0406p c0406p12 = c0406pArr2[3];
            int m138F6 = c0068q2.m138F(c0406p9, c0406p12);
            C0406p m133B = C0068q2.m133B(c0406p9, c0406p10, (c0068q2.m138F(c0406p10, c0406p12) + 1) * 4);
            C0406p m133B2 = C0068q2.m133B(c0406p11, c0406p10, (m138F6 + 1) * 4);
            int m138F7 = c0068q2.m138F(m133B, c0406p12);
            int m138F8 = c0068q2.m138F(m133B2, c0406p12);
            float f7 = c0406p12.f1390a;
            float f8 = c0406p11.f1390a;
            float f9 = c0406p10.f1390a;
            float f10 = m138F7 + 1;
            float f11 = c0406p12.f1391b;
            float f12 = c0406p11.f1391b;
            float f13 = c0406p10.f1391b;
            C0406p c0406p13 = new C0406p(((f8 - f9) / f10) + f7, ((f12 - f13) / f10) + f11);
            float f14 = c0406p9.f1390a - f9;
            float f15 = m138F8 + 1;
            C0406p c0406p14 = new C0406p((f14 / f15) + f7, ((c0406p9.f1391b - f13) / f15) + f11);
            if (!c0068q2.m159z(c0406p13)) {
                if (!c0068q2.m159z(c0406p14)) {
                    c0406p13 = null;
                    c0406pArr2[3] = c0406p13;
                    if (c0406p13 != null) {
                        C0406p c0406p15 = c0406pArr2[0];
                        C0406p c0406p16 = c0406pArr2[1];
                        C0406p c0406p17 = c0406pArr2[2];
                        int m138F9 = c0068q2.m138F(c0406p15, c0406p13) + 1;
                        C0406p m133B3 = C0068q2.m133B(c0406p15, c0406p16, (c0068q2.m138F(c0406p17, c0406p13) + 1) * 4);
                        C0406p m133B4 = C0068q2.m133B(c0406p17, c0406p16, m138F9 * 4);
                        int m138F10 = c0068q2.m138F(m133B3, c0406p13);
                        int i22 = m138F10 + 1;
                        int m138F11 = c0068q2.m138F(m133B4, c0406p13);
                        int i23 = m138F11 + 1;
                        if ((i22 & 1) == 1) {
                            i22 = m138F10 + 2;
                        }
                        if ((i23 & 1) == 1) {
                            i23 = m138F11 + 2;
                        }
                        float f16 = (((c0406p15.f1390a + c0406p16.f1390a) + c0406p17.f1390a) + c0406p13.f1390a) / 4.0f;
                        float f17 = (((c0406p15.f1391b + c0406p16.f1391b) + c0406p17.f1391b) + c0406p13.f1391b) / 4.0f;
                        C0406p m132A = C0068q2.m132A(c0406p15, f16, f17);
                        C0406p m132A2 = C0068q2.m132A(c0406p16, f16, f17);
                        C0406p m132A3 = C0068q2.m132A(c0406p17, f16, f17);
                        C0406p m132A4 = C0068q2.m132A(c0406p13, f16, f17);
                        int i24 = i23 * 4;
                        int i25 = i22 * 4;
                        C0406p[] c0406pArr3 = {C0068q2.m133B(C0068q2.m133B(m132A, m132A2, i24), m132A4, i25), C0068q2.m133B(C0068q2.m133B(m132A2, m132A, i24), m132A3, i25), C0068q2.m133B(C0068q2.m133B(m132A3, m132A4, i24), m132A2, i25), C0068q2.m133B(C0068q2.m133B(m132A4, m132A3, i24), m132A, i25)};
                        C0406p c0406p18 = c0406pArr3[0];
                        C0406p c0406p19 = c0406pArr3[1];
                        C0406p c0406p20 = c0406pArr3[2];
                        C0406p c0406p21 = c0406pArr3[3];
                        int m138F12 = c0068q2.m138F(c0406p18, c0406p21);
                        int i26 = m138F12 + 1;
                        int m138F13 = c0068q2.m138F(c0406p20, c0406p21);
                        int i27 = m138F13 + 1;
                        if ((i26 & 1) == 1) {
                            i26 = m138F12 + 2;
                        }
                        if ((i27 & 1) == 1) {
                            i27 = m138F13 + 2;
                        }
                        if (i26 * 4 < i27 * 6 && i27 * 4 < i26 * 6) {
                            i26 = Math.max(i26, i27);
                            i27 = i26;
                        }
                        float f18 = i26 - 0.5f;
                        float f19 = i27 - 0.5f;
                        m4111c = c2579c.m4111c(AbstractC2072e.m3341s(m865a2, i26, i27, C2075h.m3352a(0.5f, 0.5f, f18, 0.5f, f18, f19, 0.5f, f19, c0406p18.f1390a, c0406p18.f1391b, c0406p21.f1390a, c0406p21.f1391b, c0406p20.f1390a, c0406p20.f1391b, c0406p19.f1390a, c0406p19.f1391b)));
                        c0406pArr = new C0406p[]{c0406p18, c0406p19, c0406p20, c0406p21};
                    } else {
                        throw C0400j.m878a();
                    }
                }
                c0406p13 = c0406p14;
                c0406pArr2[3] = c0406p13;
                if (c0406p13 != null) {
                }
            } else {
                if (c0068q2.m159z(c0406p14)) {
                }
                c0406pArr2[3] = c0406p13;
                if (c0406p13 != null) {
                }
            }
        }
        C0404n c0404n = new C0404n((String) m4111c.f12271e, (byte[]) m4111c.f12270d, c0406pArr, EnumC0391a.f1320j);
        List list = (List) m4111c.f12273g;
        if (list != null) {
            c0404n.m880b(EnumC0405o.f1377f, list);
        }
        String str = (String) m4111c.f12272f;
        if (str != null) {
            c0404n.m880b(EnumC0405o.f1378g, str);
        }
        c0404n.m880b(EnumC0405o.f1379h, (Integer) m4111c.f12274h);
        c0404n.m880b(EnumC0405o.f1388q, "]d" + m4111c.f12269c);
        return c0404n;
    }

    @Override // p022c4.InterfaceC0402l
    public final void reset() {
    }
}
