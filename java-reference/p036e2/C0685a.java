package p036e2;

import android.os.Handler;
import p001a0.C0053n;
import p027d1.C0463a;
import p031d5.C0512l;
import p035e1.AbstractC0659i0;
import p035e1.C0647c0;
import p065i2.AbstractC2064e;
import p077k.C2184c0;
import p077k.C2221w;
import p101n0.C2705e;
import p140s2.C3100j;
import p150t5.InterfaceC3277a;
import p159u6.AbstractC3393k;
import p162v1.AbstractC3497e1;
import p162v1.C3490c1;
import p162v1.C3502g0;
import p162v1.C3553x0;
import p162v1.InterfaceC3521m1;
import p163v2.RunnableC3561a;
import p170w1.C3710o1;
import p177x0.AbstractC3794b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e2.a */
/* loaded from: classes.dex */
public final class C0685a {

    /* renamed from: a */
    public final C0512l f2217a;

    /* renamed from: b */
    public final C0686b f2218b;

    /* renamed from: c */
    public final C2184c0 f2219c;

    /* renamed from: d */
    public boolean f2220d;

    /* renamed from: e */
    public boolean f2221e;

    /* renamed from: f */
    public boolean f2222f;

    /* renamed from: g */
    public RunnableC3561a f2223g;

    /* renamed from: h */
    public long f2224h;

    /* renamed from: i */
    public final C0053n f2225i;

    /* renamed from: j */
    public final C0463a f2226j;

    public C0685a() {
        C0512l c0512l = new C0512l(2);
        c0512l.f1836c = new long[192];
        c0512l.f1837d = new long[192];
        this.f2217a = c0512l;
        this.f2218b = new C0686b();
        this.f2219c = new C2184c0();
        this.f2224h = -1L;
        this.f2225i = new C0053n(7, this);
        this.f2226j = new C0463a();
    }

    /* renamed from: a */
    public static long m1463a(AbstractC3497e1 abstractC3497e1, long j6) {
        float[] m5709b;
        int m5130a;
        InterfaceC3521m1 interfaceC3521m1 = abstractC3497e1.f16845M;
        if (interfaceC3521m1 != null && (m5130a = AbstractC3393k.m5130a((m5709b = ((C3710o1) interfaceC3521m1).m5709b()))) != 3) {
            if ((m5130a & 2) == 0) {
                return 9223372034707292159L;
            }
            return AbstractC2064e.m3225F(C0647c0.m1351b((Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j6 >> 32)) << 32), m5709b));
        }
        return j6;
    }

    /* renamed from: h */
    public static long m1464h(C3502g0 c3502g0) {
        C3490c1 c3490c1 = c3502g0.f16872I;
        AbstractC3497e1 abstractC3497e1 = c3490c1.f16800d;
        long j6 = 0;
        for (AbstractC3497e1 abstractC3497e12 = c3490c1.f16799c; abstractC3497e12 != null && abstractC3497e12 != abstractC3497e1; abstractC3497e12 = abstractC3497e12.f16849u) {
            long m1463a = m1463a(abstractC3497e12, j6);
            if (C3100j.m4783a(m1463a, 9223372034707292159L)) {
                return 9223372034707292159L;
            }
            j6 = C3100j.m4785c(m1463a, abstractC3497e12.f16836D);
        }
        return j6;
    }

    /* renamed from: i */
    public static void m1465i(C3502g0 c3502g0) {
        long j6;
        AbstractC3497e1 abstractC3497e1 = c3502g0.f16872I.f16800d;
        long m1463a = m1463a(abstractC3497e1, 0L);
        long j7 = 9223372034707292159L;
        if (!AbstractC3393k.m5132c(m1463a)) {
            c3502g0.f16886g = 9223372034707292159L;
            return;
        }
        long m4785c = C3100j.m4785c(m1463a, abstractC3497e1.f16836D);
        C3502g0 m5447u = c3502g0.m5447u();
        if (m5447u != null) {
            if (!AbstractC3393k.m5132c(m5447u.f16886g)) {
                m1465i(m5447u);
            }
            long j8 = m5447u.f16886g;
            if (AbstractC3393k.m5132c(j8)) {
                if (m5447u.f16889j) {
                    j6 = m1464h(m5447u);
                    m5447u.f16888i = j6;
                    m5447u.f16889j = false;
                } else {
                    j6 = m5447u.f16888i;
                }
                if (AbstractC3393k.m5132c(j6)) {
                    j7 = C3100j.m4785c(C3100j.m4785c(j8, j6), m4785c);
                }
            }
        } else {
            j7 = m4785c;
        }
        c3502g0.f16886g = j7;
    }

    /* renamed from: b */
    public final void m1466b() {
        boolean z7;
        boolean z8;
        long j6;
        long j7;
        long j8;
        Handler handler = AbstractC3794b.f17963a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z9 = this.f2220d;
        if (!z9 && !this.f2221e) {
            z7 = false;
        } else {
            z7 = true;
        }
        C0512l c0512l = this.f2217a;
        C0686b c0686b = this.f2218b;
        if (z9) {
            this.f2220d = false;
            C2184c0 c2184c0 = this.f2219c;
            j6 = 128;
            Object[] objArr = c2184c0.f12628a;
            int i7 = c2184c0.f12629b;
            for (int i8 = 0; i8 < i7; i8++) {
                ((InterfaceC3277a) objArr[i8]).mo52a();
            }
            long[] jArr = (long[]) c0512l.f1836c;
            int i9 = c0512l.f1835b;
            j7 = 255;
            for (int i10 = 0; i10 < jArr.length - 2 && i10 < i9; i10 += 3) {
                long j9 = jArr[i10 + 2];
                if ((((int) (j9 >> 61)) & 1) != 0) {
                    long j10 = jArr[i10];
                    long j11 = jArr[i10 + 1];
                    if (c0686b.f2227a.m3612b(((int) j9) & 67108863) != null) {
                        throw new ClassCastException();
                    }
                }
            }
            j8 = -9187201950435737472L;
            C2221w c2221w = c0686b.f2227a;
            Object[] objArr2 = c2221w.f12707c;
            long[] jArr2 = c2221w.f12705a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j12 = jArr2[i11];
                    z8 = z7;
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((j12 & 255) < 128 && objArr2[(i11 << 3) + i13] != null) {
                                throw new ClassCastException();
                            }
                            j12 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        }
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    z7 = z8;
                }
            } else {
                z8 = z7;
            }
            long[] jArr3 = (long[]) c0512l.f1836c;
            int i14 = c0512l.f1835b;
            for (int i15 = 0; i15 < jArr3.length - 2 && i15 < i14; i15 += 3) {
                int i16 = i15 + 2;
                jArr3[i16] = jArr3[i16] & (-2305843009213693953L);
            }
        } else {
            z8 = z7;
            j6 = 128;
            j7 = 255;
            j8 = -9187201950435737472L;
        }
        if (this.f2221e) {
            this.f2221e = false;
            C2221w c2221w2 = c0686b.f2227a;
            Object[] objArr3 = c2221w2.f12707c;
            long[] jArr4 = c2221w2.f12705a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                while (true) {
                    long j13 = jArr4[i17];
                    if ((((~j13) << 7) & j13 & j8) != j8) {
                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                        for (int i19 = 0; i19 < i18; i19++) {
                            if ((j13 & j7) < j6 && objArr3[(i17 << 3) + i19] != null) {
                                throw new ClassCastException();
                            }
                            j13 >>= 8;
                        }
                        if (i18 != 8) {
                            break;
                        }
                    }
                    if (i17 == length2) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        if (z8) {
            c0686b.getClass();
        }
        if (this.f2222f) {
            this.f2222f = false;
            long[] jArr5 = (long[]) c0512l.f1836c;
            int i20 = c0512l.f1835b;
            long[] jArr6 = (long[]) c0512l.f1837d;
            int i21 = 0;
            for (int i22 = 0; i22 < jArr5.length - 2 && i21 < jArr6.length - 2 && i22 < i20; i22 += 3) {
                int i23 = i22 + 2;
                if (jArr5[i23] != 2305843009213693951L) {
                    jArr6[i21] = jArr5[i22];
                    jArr6[i21 + 1] = jArr5[i22 + 1];
                    jArr6[i21 + 2] = jArr5[i23];
                    i21 += 3;
                }
            }
            c0512l.f1835b = i21;
            c0512l.f1836c = jArr6;
            c0512l.f1837d = jArr5;
        }
        if (c0686b.f2228b > currentTimeMillis) {
            return;
        }
        C2221w c2221w3 = c0686b.f2227a;
        Object[] objArr4 = c2221w3.f12707c;
        long[] jArr7 = c2221w3.f12705a;
        int length3 = jArr7.length - 2;
        if (length3 >= 0) {
            int i24 = 0;
            while (true) {
                long j14 = jArr7[i24];
                if ((((~j14) << 7) & j14 & j8) != j8) {
                    int i25 = 8 - ((~(i24 - length3)) >>> 31);
                    for (int i26 = 0; i26 < i25; i26++) {
                        if ((j14 & j7) < j6 && objArr4[(i24 << 3) + i26] != null) {
                            throw new ClassCastException();
                        }
                        j14 >>= 8;
                    }
                    if (i25 != 8) {
                        break;
                    }
                }
                if (i24 == length3) {
                    break;
                } else {
                    i24++;
                }
            }
        }
        c0686b.f2228b = -1L;
    }

    /* renamed from: c */
    public final void m1467c(C3502g0 c3502g0, boolean z7) {
        char c7;
        boolean z8;
        int i7;
        C3490c1 c3490c1 = c3502g0.f16872I;
        AbstractC3497e1 abstractC3497e1 = c3490c1.f16800d;
        C3553x0 c3553x0 = c3502g0.f16873J.f16953p;
        int mo4956k0 = c3553x0.mo4956k0();
        float mo4955i0 = c3553x0.mo4955i0();
        C0463a c0463a = this.f2226j;
        c0463a.f1619a = 0.0f;
        c0463a.f1620b = 0.0f;
        c0463a.f1621c = mo4956k0;
        c0463a.f1622d = mo4955i0;
        while (true) {
            c7 = ' ';
            if (abstractC3497e1 == null) {
                break;
            }
            InterfaceC3521m1 interfaceC3521m1 = abstractC3497e1.f16845M;
            if (interfaceC3521m1 != null) {
                float[] m5709b = ((C3710o1) interfaceC3521m1).m5709b();
                if (!AbstractC0659i0.m1414n(m5709b)) {
                    C0647c0.m1352c(m5709b, c0463a);
                }
            }
            long j6 = abstractC3497e1.f16836D;
            long floatToRawIntBits = (Float.floatToRawIntBits((int) (j6 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
            c0463a.f1619a += intBitsToFloat;
            c0463a.f1620b += intBitsToFloat2;
            c0463a.f1621c += intBitsToFloat;
            c0463a.f1622d += intBitsToFloat2;
            abstractC3497e1 = abstractC3497e1.f16849u;
        }
        int i8 = (int) c0463a.f1619a;
        int i9 = (int) c0463a.f1620b;
        int i10 = (int) c0463a.f1621c;
        int i11 = (int) c0463a.f1622d;
        int i12 = c3502g0.f16885f;
        C0512l c0512l = this.f2217a;
        if (!z7) {
            int i13 = i12 & 67108863;
            long[] jArr = (long[]) c0512l.f1836c;
            int i14 = c0512l.f1835b;
            int i15 = 0;
            while (i15 < jArr.length - 2 && i15 < i14) {
                int i16 = i15 + 2;
                char c8 = c7;
                C0512l c0512l2 = c0512l;
                long j7 = jArr[i16];
                z8 = true;
                if ((((int) j7) & 67108863) == i13) {
                    jArr[i15] = (i8 << c8) | (i9 & 4294967295L);
                    jArr[i15 + 1] = (i10 << c8) | (i11 & 4294967295L);
                    jArr[i16] = 2305843009213693952L | j7;
                    break;
                } else {
                    i15 += 3;
                    c7 = c8;
                    c0512l = c0512l2;
                }
            }
        }
        C0512l c0512l3 = c0512l;
        z8 = true;
        C3502g0 m5447u = c3502g0.m5447u();
        if (m5447u != null) {
            i7 = m5447u.f16885f;
        } else {
            i7 = -1;
        }
        c0512l3.m1102f(i12, i8, i9, i10, i11, i7, c3490c1.m5308d(1024), c3490c1.m5308d(16));
        this.f2220d = z8;
    }

    /* renamed from: d */
    public final void m1468d(C3502g0 c3502g0) {
        C2705e m5451y = c3502g0.m5451y();
        Object[] objArr = m5451y.f14517e;
        int i7 = m5451y.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            C3502g0 c3502g02 = (C3502g0) objArr[i8];
            m1467c(c3502g02, false);
            m1468d(c3502g02);
        }
    }

    /* renamed from: e */
    public final void m1469e(C3502g0 c3502g0) {
        boolean z7 = true;
        this.f2220d = true;
        int i7 = c3502g0.f16885f & 67108863;
        C0512l c0512l = this.f2217a;
        long[] jArr = (long[]) c0512l.f1836c;
        int i8 = c0512l.f1835b;
        int i9 = 0;
        while (true) {
            if (i9 >= jArr.length - 2 || i9 >= i8) {
                break;
            }
            int i10 = i9 + 2;
            long j6 = jArr[i10];
            if ((((int) j6) & 67108863) == i7) {
                jArr[i10] = 2305843009213693952L | j6;
                break;
            }
            i9 += 3;
        }
        RunnableC3561a runnableC3561a = this.f2223g;
        if (runnableC3561a == null) {
            z7 = false;
        }
        long j7 = this.f2218b.f2228b;
        if (j7 >= 0 || !z7) {
            if (this.f2224h == j7 && z7) {
                return;
            }
            if (runnableC3561a != null) {
                Handler handler = AbstractC3794b.f17963a;
                AbstractC3794b.f17963a.removeCallbacks(runnableC3561a);
            }
            Handler handler2 = AbstractC3794b.f17963a;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j7, 16 + currentTimeMillis);
            this.f2224h = max;
            RunnableC3561a runnableC3561a2 = new RunnableC3561a(4, this.f2225i);
            AbstractC3794b.f17963a.postDelayed(runnableC3561a2, max - currentTimeMillis);
            this.f2223g = runnableC3561a2;
        }
    }

    /* renamed from: f */
    public final void m1470f(C3502g0 c3502g0) {
        long m1464h = m1464h(c3502g0);
        if (AbstractC3393k.m5132c(m1464h)) {
            c3502g0.f16888i = m1464h;
            c3502g0.f16889j = false;
            C2705e m5451y = c3502g0.m5451y();
            Object[] objArr = m5451y.f14517e;
            int i7 = m5451y.f14519g;
            for (int i8 = 0; i8 < i7; i8++) {
                m1471g((C3502g0) objArr[i8], false);
            }
            m1469e(c3502g0);
            return;
        }
        m1468d(c3502g0);
    }

    /* renamed from: g */
    public final void m1471g(C3502g0 c3502g0, boolean z7) {
        int i7;
        boolean z8;
        boolean z9;
        int i8;
        long j6;
        char c7;
        C3553x0 c3553x0 = c3502g0.f16873J.f16953p;
        int mo4956k0 = c3553x0.mo4956k0();
        int mo4955i0 = c3553x0.mo4955i0();
        long j7 = c3502g0.f16886g;
        long j8 = c3502g0.f16887h;
        int i9 = (int) (j8 >> 32);
        int i10 = (int) (j8 & 4294967295L);
        m1465i(c3502g0);
        long j9 = c3502g0.f16886g;
        if (!AbstractC3393k.m5132c(j9)) {
            m1467c(c3502g0, z7);
            return;
        }
        c3502g0.f16887h = (mo4955i0 & 4294967295L) | (mo4956k0 << 32);
        int i11 = (int) (j9 >> 32);
        int i12 = (int) (j9 & 4294967295L);
        int i13 = i11 + mo4956k0;
        int i14 = i12 + mo4955i0;
        if (!z7 && C3100j.m4783a(j9, j7) && i9 == mo4956k0 && i10 == mo4955i0) {
            return;
        }
        int i15 = c3502g0.f16885f;
        C3490c1 c3490c1 = c3502g0.f16872I;
        C0512l c0512l = this.f2217a;
        if (!z7) {
            int i16 = i15 & 67108863;
            long[] jArr = (long[]) c0512l.f1836c;
            int i17 = c0512l.f1835b;
            int i18 = 0;
            while (i18 < jArr.length - 2 && i18 < i17) {
                int i19 = i18 + 2;
                int i20 = i18;
                long j10 = jArr[i19];
                if ((((int) j10) & 67108863) == i16) {
                    long j11 = jArr[i20];
                    jArr[i20] = (i11 << 32) | (i12 & 4294967295L);
                    jArr[i20 + 1] = (i13 << 32) | (i14 & 4294967295L);
                    long j12 = 2305843009213693952L;
                    jArr[i19] = j10 | 2305843009213693952L;
                    int i21 = i11 - ((int) (j11 >> 32));
                    int i22 = i12 - ((int) j11);
                    if (i21 != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (i22 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z8 | z9) {
                        long j13 = -4503599560261633L;
                        char c8 = 26;
                        long[] jArr2 = (long[]) c0512l.f1836c;
                        long[] jArr3 = (long[]) c0512l.f1837d;
                        int i23 = c0512l.f1835b / 3;
                        jArr3[0] = (j10 & (-4503599560261633L)) | (((i20 + 3) & 67108863) << 26);
                        int i24 = 1;
                        while (i24 > 0) {
                            i24--;
                            long j14 = jArr3[i24];
                            int i25 = ((int) j14) & 67108863;
                            char c9 = c8;
                            long j15 = j13;
                            int i26 = ((int) (j14 >> c9)) & 67108863;
                            char c10 = '4';
                            int i27 = (int) (j14 >> 52);
                            char c11 = 511;
                            int i28 = i27 & 511;
                            if (i28 == 511) {
                                i8 = i23;
                            } else {
                                i8 = i28 + i26;
                            }
                            if (i26 < 0) {
                                break;
                            }
                            while (i26 < jArr2.length - 2 && i26 < i8) {
                                int i29 = i26 + 2;
                                long j16 = jArr2[i29];
                                char c12 = c10;
                                int i30 = i8;
                                if ((((int) (j16 >> c9)) & 67108863) == i25) {
                                    long j17 = jArr2[i26];
                                    int i31 = i26 + 1;
                                    j6 = j12;
                                    long j18 = jArr2[i31];
                                    jArr2[i26] = ((((int) j17) + i22) & 4294967295L) | ((((int) (j17 >> 32)) + i21) << 32);
                                    jArr2[i31] = ((((int) j18) + i22) & 4294967295L) | ((((int) (j18 >> 32)) + i21) << 32);
                                    jArr2[i29] = j16 | j6;
                                    c7 = 511;
                                    if ((((int) (j16 >> c12)) & 511) > 0) {
                                        jArr3[i24] = (((i26 + 3) & 67108863) << c9) | (j16 & j15);
                                        i24++;
                                    }
                                } else {
                                    j6 = j12;
                                    c7 = c11;
                                }
                                i26 += 3;
                                c11 = c7;
                                c10 = c12;
                                i8 = i30;
                                j12 = j6;
                            }
                            c8 = c9;
                            j13 = j15;
                            j12 = j12;
                        }
                    }
                    this.f2220d = true;
                }
                i18 = i20 + 3;
            }
        }
        C3502g0 m5447u = c3502g0.m5447u();
        if (m5447u != null) {
            i7 = m5447u.f16885f;
        } else {
            i7 = -1;
        }
        c0512l.m1102f(i15, i11, i12, i13, i14, i7, c3490c1.m5308d(1024), c3490c1.m5308d(16));
        this.f2220d = true;
    }

    /* renamed from: j */
    public final void m1472j(C3502g0 c3502g0) {
        int i7 = c3502g0.f16885f & 67108863;
        C0512l c0512l = this.f2217a;
        long[] jArr = (long[]) c0512l.f1836c;
        int i8 = c0512l.f1835b;
        int i9 = 0;
        while (true) {
            if (i9 >= jArr.length - 2 || i9 >= i8) {
                break;
            }
            int i10 = i9 + 2;
            if ((((int) jArr[i10]) & 67108863) == i7) {
                jArr[i9] = -1;
                jArr[i9 + 1] = -1;
                jArr[i10] = 2305843009213693951L;
                break;
            }
            i9 += 3;
        }
        this.f2220d = true;
        this.f2222f = true;
    }
}
