package p045f4;

import p001a0.C0019e1;
import p001a0.C0076s2;
import p022c4.C0400j;
import p022c4.C0406p;
import p030d4.C0499a;
import p065i2.AbstractC2064e;
import p067i4.AbstractC2072e;
import p067i4.C2069b;
import p067i4.C2075h;
import p075j4.C2177a;
import p081k4.C2308a;
import p081k4.C2310c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f4.a */
/* loaded from: classes.dex */
public final class C1535a {

    /* renamed from: g */
    public static final int[] f10093g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    public final C2069b f10094a;

    /* renamed from: b */
    public boolean f10095b;

    /* renamed from: c */
    public int f10096c;

    /* renamed from: d */
    public int f10097d;

    /* renamed from: e */
    public int f10098e;

    /* renamed from: f */
    public int f10099f;

    public C1535a(C2069b c2069b) {
        this.f10094a = c2069b;
    }

    /* renamed from: b */
    public static C0406p[] m2463b(C0406p[] c0406pArr, int i7, int i8) {
        float f7 = i8 / (i7 * 2.0f);
        C0406p c0406p = c0406pArr[0];
        float f8 = c0406p.f1390a;
        C0406p c0406p2 = c0406pArr[2];
        float f9 = c0406p2.f1390a;
        float f10 = f8 - f9;
        float f11 = c0406p.f1391b;
        float f12 = c0406p2.f1391b;
        float f13 = f11 - f12;
        float f14 = (f8 + f9) / 2.0f;
        float f15 = (f11 + f12) / 2.0f;
        float f16 = f10 * f7;
        float f17 = f13 * f7;
        C0406p c0406p3 = new C0406p(f14 + f16, f15 + f17);
        C0406p c0406p4 = new C0406p(f14 - f16, f15 - f17);
        C0406p c0406p5 = c0406pArr[1];
        float f18 = c0406p5.f1390a;
        C0406p c0406p6 = c0406pArr[3];
        float f19 = c0406p6.f1390a;
        float f20 = f18 - f19;
        float f21 = c0406p5.f1391b;
        float f22 = c0406p6.f1391b;
        float f23 = f21 - f22;
        float f24 = (f18 + f19) / 2.0f;
        float f25 = (f21 + f22) / 2.0f;
        float f26 = f20 * f7;
        float f27 = f7 * f23;
        return new C0406p[]{c0406p3, new C0406p(f24 + f26, f25 + f27), c0406p4, new C0406p(f24 - f26, f25 - f27)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final C0499a m2464a(boolean z7) {
        C0406p m169c;
        C0406p c0406p;
        C0406p c0406p2;
        C0406p c0406p3;
        char c7;
        C0406p m169c2;
        C0406p m169c3;
        C0406p c0406p4;
        C0406p c0406p5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z8;
        int i12;
        int i13;
        long j6;
        int i14;
        C0076s2 c0076s2;
        C2069b c2069b = this.f10094a;
        int i15 = -1;
        int i16 = 1;
        try {
            C0406p[] m3543b = new C2177a(c2069b).m3543b();
            c0406p2 = m3543b[0];
            c0406p3 = m3543b[1];
            c0406p = m3543b[2];
            m169c = m3543b[3];
        } catch (C0400j unused) {
            int i17 = c2069b.f12258e / 2;
            int i18 = c2069b.f12259f / 2;
            int i19 = i17 + 7;
            int i20 = i18 - 7;
            C0406p m169c4 = m2467e(new C0076s2(i19, i20, 1), false, 1, -1).m169c();
            int i21 = i18 + 7;
            C0406p m169c5 = m2467e(new C0076s2(i19, i21, 1), false, 1, 1).m169c();
            int i22 = i17 - 7;
            C0406p m169c6 = m2467e(new C0076s2(i22, i21, 1), false, -1, 1).m169c();
            m169c = m2467e(new C0076s2(i22, i20, 1), false, -1, -1).m169c();
            c0406p = m169c6;
            c0406p2 = m169c4;
            c0406p3 = m169c5;
        }
        int m3224E = AbstractC2064e.m3224E((((c0406p2.f1390a + m169c.f1390a) + c0406p3.f1390a) + c0406p.f1390a) / 4.0f);
        int m3224E2 = AbstractC2064e.m3224E((((c0406p2.f1391b + m169c.f1391b) + c0406p3.f1391b) + c0406p.f1391b) / 4.0f);
        char c8 = 15;
        try {
            C0406p[] m3543b2 = new C2177a(c2069b, 15, m3224E, m3224E2).m3543b();
            c0406p5 = m3543b2[0];
            c0406p4 = m3543b2[1];
            m169c2 = m3543b2[2];
            m169c3 = m3543b2[3];
            c7 = 3;
        } catch (C0400j unused2) {
            int i23 = m3224E + 7;
            int i24 = m3224E2 - 7;
            C0406p m169c7 = m2467e(new C0076s2(i23, i24, 1), false, 1, -1).m169c();
            int i25 = m3224E2 + 7;
            c7 = 3;
            C0406p m169c8 = m2467e(new C0076s2(i23, i25, 1), false, 1, 1).m169c();
            int i26 = m3224E - 7;
            m169c2 = m2467e(new C0076s2(i26, i25, 1), false, -1, 1).m169c();
            m169c3 = m2467e(new C0076s2(i26, i24, 1), false, -1, -1).m169c();
            c0406p4 = m169c8;
            c0406p5 = m169c7;
        }
        C0076s2 c0076s22 = new C0076s2(AbstractC2064e.m3224E((((c0406p5.f1390a + m169c3.f1390a) + c0406p4.f1390a) + m169c2.f1390a) / 4.0f), AbstractC2064e.m3224E((((c0406p5.f1391b + m169c3.f1391b) + c0406p4.f1391b) + m169c2.f1391b) / 4.0f), 1);
        this.f10098e = 1;
        boolean z9 = true;
        C0076s2 c0076s23 = c0076s22;
        C0076s2 c0076s24 = c0076s23;
        C0076s2 c0076s25 = c0076s24;
        while (true) {
            i7 = c0076s25.f375c;
            i8 = c0076s25.f374b;
            i9 = c0076s22.f375c;
            char c9 = c8;
            i10 = c0076s22.f374b;
            if (this.f10098e < 9) {
                C0076s2 m2467e = m2467e(c0076s22, z9, i16, i15);
                int i27 = m2467e.f375c;
                int i28 = m2467e.f374b;
                C0076s2 m2467e2 = m2467e(c0076s23, z9, i16, i16);
                C0076s2 m2467e3 = m2467e(c0076s24, z9, i15, i16);
                C0076s2 m2467e4 = m2467e(c0076s25, z9, i15, i15);
                int i29 = m2467e4.f375c;
                i11 = i16;
                int i30 = m2467e4.f374b;
                boolean z10 = z9;
                if (this.f10098e > 2) {
                    double m3246t = (AbstractC2064e.m3246t(i30, i29, i28, i27) * this.f10098e) / (AbstractC2064e.m3246t(i8, i7, i10, i9) * (this.f10098e + 2));
                    if (m3246t < 0.75d || m3246t > 1.25d) {
                        break;
                    }
                    C0076s2 c0076s26 = new C0076s2(Math.max(0, i28 - 3), Math.min(c2069b.f12259f - 1, i27 + 3), 1);
                    C0076s2 c0076s27 = new C0076s2(Math.max(0, m2467e2.f374b - 3), Math.max(0, m2467e2.f375c - 3), 1);
                    c0076s2 = m2467e2;
                    C0076s2 c0076s28 = new C0076s2(Math.min(c2069b.f12258e - 1, m2467e3.f374b + 3), Math.max(0, Math.min(c2069b.f12259f - 1, m2467e3.f375c - 3)), 1);
                    C0076s2 c0076s29 = new C0076s2(Math.min(c2069b.f12258e - 1, i30 + 3), Math.min(c2069b.f12259f - 1, i29 + 3), 1);
                    int m2465c = m2465c(c0076s29, c0076s26);
                    if (m2465c == 0 || m2465c(c0076s26, c0076s27) != m2465c || m2465c(c0076s27, c0076s28) != m2465c || m2465c(c0076s28, c0076s29) != m2465c) {
                        break;
                    }
                } else {
                    c0076s2 = m2467e2;
                }
                z9 = !z10;
                this.f10098e++;
                c0076s24 = m2467e3;
                c8 = c9;
                c0076s22 = m2467e;
                i16 = i11;
                c0076s25 = m2467e4;
                c0076s23 = c0076s2;
                i15 = -1;
            } else {
                i11 = i16;
                break;
            }
        }
        int i31 = this.f10098e;
        if (i31 != 5 && i31 != 7) {
            throw C0400j.m878a();
        }
        if (i31 == 5) {
            z8 = i11;
        } else {
            z8 = 0;
        }
        this.f10095b = z8;
        int i32 = i31 * 2;
        C0406p[] m2463b = m2463b(new C0406p[]{new C0406p(i10 + 0.5f, i9 - 0.5f), new C0406p(c0076s23.f374b + 0.5f, c0076s23.f375c + 0.5f), new C0406p(c0076s24.f374b - 0.5f, c0076s24.f375c + 0.5f), new C0406p(i8 - 0.5f, i7 - 0.5f)}, i32 - 3, i32);
        if (z7) {
            C0406p c0406p6 = m2463b[0];
            m2463b[0] = m2463b[2];
            m2463b[2] = c0406p6;
        }
        if (m2469g(m2463b[0]) && m2469g(m2463b[i11]) && m2469g(m2463b[2]) && m2469g(m2463b[c7])) {
            int i33 = this.f10098e * 2;
            int[] iArr = {m2470h(m2463b[0], m2463b[i11], i33), m2470h(m2463b[i11], m2463b[2], i33), m2470h(m2463b[2], m2463b[c7], i33), m2470h(m2463b[c7], m2463b[0], i33)};
            int i34 = 0;
            for (int i35 = 0; i35 < 4; i35++) {
                int i36 = iArr[i35];
                i34 = (i34 << 3) + ((i36 >> (i33 - 2)) << 1) + (i36 & 1);
            }
            int i37 = ((i34 & 1) << 11) + (i34 >> 1);
            for (int i38 = 0; i38 < 4; i38++) {
                if (Integer.bitCount(f10093g[i38] ^ i37) <= 2) {
                    this.f10099f = i38;
                    long j7 = 0;
                    int i39 = 0;
                    while (true) {
                        i12 = 10;
                        if (i39 >= 4) {
                            break;
                        }
                        int i40 = iArr[(this.f10099f + i39) % 4];
                        if (this.f10095b) {
                            j6 = j7 << 7;
                            i14 = (i40 >> 1) & 127;
                        } else {
                            j6 = j7 << 10;
                            i14 = ((i40 >> 2) & 992) + ((i40 >> 1) & 31);
                        }
                        j7 = j6 + i14;
                        i39++;
                    }
                    if (this.f10095b) {
                        i12 = 7;
                        i13 = 2;
                    } else {
                        i13 = 4;
                    }
                    int i41 = i12 - i13;
                    int[] iArr2 = new int[i12];
                    for (int i42 = i12 - 1; i42 >= 0; i42--) {
                        iArr2[i42] = ((int) j7) & 15;
                        j7 >>= 4;
                    }
                    try {
                        int m39j = new C0019e1(C2308a.f13255k).m39j(iArr2, i41);
                        int i43 = 0;
                        for (int i44 = 0; i44 < i13; i44++) {
                            i43 = (i43 << 4) + iArr2[i44];
                        }
                        if (this.f10095b) {
                            this.f10096c = (i43 >> 6) + 1;
                            this.f10097d = (i43 & 63) + 1;
                        } else {
                            this.f10096c = (i43 >> 11) + 1;
                            this.f10097d = (i43 & 2047) + 1;
                        }
                        int i45 = this.f10099f;
                        C0406p c0406p7 = m2463b[i45 % 4];
                        C0406p c0406p8 = m2463b[(i45 + 1) % 4];
                        C0406p c0406p9 = m2463b[(i45 + 2) % 4];
                        C0406p c0406p10 = m2463b[(i45 + 3) % 4];
                        int m2466d = m2466d();
                        float f7 = m2466d / 2.0f;
                        float f8 = this.f10098e;
                        float f9 = f7 - f8;
                        float f10 = f7 + f8;
                        return new C0499a(AbstractC2072e.m3341s(c2069b, m2466d, m2466d, C2075h.m3352a(f9, f9, f10, f9, f10, f10, f9, f10, c0406p7.f1390a, c0406p7.f1391b, c0406p8.f1390a, c0406p8.f1391b, c0406p9.f1390a, c0406p9.f1391b, c0406p10.f1390a, c0406p10.f1391b)), m2463b(m2463b, this.f10098e * 2, m2466d()), this.f10095b, this.f10097d, this.f10096c, m39j);
                    } catch (C2310c unused3) {
                        throw C0400j.m878a();
                    }
                }
            }
            throw C0400j.m878a();
        }
        throw C0400j.m878a();
    }

    /* renamed from: c */
    public final int m2465c(C0076s2 c0076s2, C0076s2 c0076s22) {
        int i7 = c0076s2.f374b;
        int i8 = c0076s2.f375c;
        float m3246t = AbstractC2064e.m3246t(i7, i8, c0076s22.f374b, c0076s22.f375c);
        boolean z7 = false;
        if (m3246t != 0.0f) {
            float f7 = (r1 - i7) / m3246t;
            float f8 = (r13 - i8) / m3246t;
            float f9 = i7;
            float f10 = i8;
            C2069b c2069b = this.f10094a;
            boolean m3313b = c2069b.m3313b(i7, i8);
            int floor = (int) Math.floor(m3246t);
            int i9 = 0;
            for (int i10 = 0; i10 < floor; i10++) {
                if (c2069b.m3313b(AbstractC2064e.m3224E(f9), AbstractC2064e.m3224E(f10)) != m3313b) {
                    i9++;
                }
                f9 += f7;
                f10 += f8;
            }
            float f11 = i9 / m3246t;
            if (f11 <= 0.1f || f11 >= 0.9f) {
                if (f11 <= 0.1f) {
                    z7 = true;
                }
                if (z7 == m3313b) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }

    /* renamed from: d */
    public final int m2466d() {
        if (this.f10095b) {
            return (this.f10096c * 4) + 11;
        }
        int i7 = this.f10096c;
        return ((((i7 * 2) + 6) / 15) * 2) + (i7 * 4) + 15;
    }

    /* renamed from: e */
    public final C0076s2 m2467e(C0076s2 c0076s2, boolean z7, int i7, int i8) {
        C2069b c2069b;
        int i9 = c0076s2.f374b + i7;
        int i10 = c0076s2.f375c;
        while (true) {
            i10 += i8;
            boolean m2468f = m2468f(i9, i10);
            c2069b = this.f10094a;
            if (!m2468f || c2069b.m3313b(i9, i10) != z7) {
                break;
            }
            i9 += i7;
        }
        int i11 = i9 - i7;
        int i12 = i10 - i8;
        while (m2468f(i11, i12) && c2069b.m3313b(i11, i12) == z7) {
            i11 += i7;
        }
        int i13 = i11 - i7;
        while (m2468f(i13, i12) && c2069b.m3313b(i13, i12) == z7) {
            i12 += i8;
        }
        return new C0076s2(i13, i12 - i8, 1);
    }

    /* renamed from: f */
    public final boolean m2468f(int i7, int i8) {
        if (i7 >= 0) {
            C2069b c2069b = this.f10094a;
            if (i7 < c2069b.f12258e && i8 >= 0 && i8 < c2069b.f12259f) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m2469g(C0406p c0406p) {
        return m2468f(AbstractC2064e.m3224E(c0406p.f1390a), AbstractC2064e.m3224E(c0406p.f1391b));
    }

    /* renamed from: h */
    public final int m2470h(C0406p c0406p, C0406p c0406p2, int i7) {
        float f7 = c0406p.f1390a;
        float f8 = c0406p.f1391b;
        float f9 = c0406p2.f1390a;
        float f10 = c0406p2.f1391b;
        float m3245s = AbstractC2064e.m3245s(f7, f8, f9, f10);
        float f11 = m3245s / i7;
        float f12 = c0406p.f1390a;
        float f13 = ((c0406p2.f1390a - f12) * f11) / m3245s;
        float f14 = ((f10 - f8) * f11) / m3245s;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            float f15 = i9;
            if (this.f10094a.m3313b(AbstractC2064e.m3224E((f15 * f13) + f12), AbstractC2064e.m3224E((f15 * f14) + f8))) {
                i8 |= 1 << ((i7 - i9) - 1);
            }
        }
        return i8;
    }
}
