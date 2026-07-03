package p035e1;

import p001a0.AbstractC0094y0;
import p042f1.AbstractC1516c;
import p042f1.AbstractC1521h;
import p042f1.AbstractC1523j;
import p042f1.C1517d;
import p042f1.C1520g;
import p077k.C2221w;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.s */
/* loaded from: classes.dex */
public final class C0677s {

    /* renamed from: b */
    public static final long f2204b = AbstractC0659i0.m1404d(4278190080L);

    /* renamed from: c */
    public static final long f2205c;

    /* renamed from: d */
    public static final long f2206d;

    /* renamed from: e */
    public static final long f2207e;

    /* renamed from: f */
    public static final long f2208f;

    /* renamed from: g */
    public static final long f2209g;

    /* renamed from: h */
    public static final /* synthetic */ int f2210h = 0;

    /* renamed from: a */
    public final long f2211a;

    static {
        AbstractC0659i0.m1404d(4282664004L);
        AbstractC0659i0.m1404d(4287137928L);
        AbstractC0659i0.m1404d(4291611852L);
        f2205c = AbstractC0659i0.m1404d(4294967295L);
        f2206d = AbstractC0659i0.m1404d(4294901760L);
        AbstractC0659i0.m1404d(4278255360L);
        f2207e = AbstractC0659i0.m1404d(4278190335L);
        AbstractC0659i0.m1404d(4294967040L);
        AbstractC0659i0.m1404d(4278255615L);
        AbstractC0659i0.m1404d(4294902015L);
        f2208f = AbstractC0659i0.m1403c(0);
        f2209g = AbstractC0659i0.m1402b(0.0f, 0.0f, 0.0f, 0.0f, C1517d.f10035u);
    }

    public /* synthetic */ C0677s(long j6) {
        this.f2211a = j6;
    }

    /* renamed from: a */
    public static final long m1452a(long j6, AbstractC1516c abstractC1516c) {
        C1520g c1520g;
        AbstractC1516c m1457f = m1457f(j6);
        int i7 = m1457f.f10014c;
        int i8 = abstractC1516c.f10014c;
        if ((i7 | i8) < 0) {
            c1520g = AbstractC1523j.m2458e(m1457f, abstractC1516c);
        } else {
            C2221w c2221w = AbstractC1521h.f10047a;
            int i9 = i7 | (i8 << 6);
            Object m3612b = c2221w.m3612b(i9);
            if (m3612b == null) {
                m3612b = AbstractC1523j.m2458e(m1457f, abstractC1516c);
                c2221w.m3652g(i9, m3612b);
            }
            c1520g = (C1520g) m3612b;
        }
        return c1520g.mo2453a(j6);
    }

    /* renamed from: b */
    public static long m1453b(float f7, long j6) {
        return AbstractC0659i0.m1402b(m1459h(j6), m1458g(j6), m1456e(j6), f7, m1457f(j6));
    }

    /* renamed from: c */
    public static final boolean m1454c(long j6, long j7) {
        if (j6 == j7) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final float m1455d(long j6) {
        float m5129B;
        float f7;
        if ((63 & j6) == 0) {
            m5129B = (float) AbstractC3393k.m5129B((j6 >>> 56) & 255);
            f7 = 255.0f;
        } else {
            m5129B = (float) AbstractC3393k.m5129B((j6 >>> 6) & 1023);
            f7 = 1023.0f;
        }
        return m5129B / f7;
    }

    /* renamed from: e */
    public static final float m1456e(long j6) {
        int i7;
        int i8;
        int i9;
        if ((63 & j6) == 0) {
            return ((float) AbstractC3393k.m5129B((j6 >>> 32) & 255)) / 255.0f;
        }
        short s5 = (short) ((j6 >>> 16) & 65535);
        int i10 = 32768 & s5;
        int i11 = ((65535 & s5) >>> 10) & 31;
        int i12 = s5 & 1023;
        if (i11 == 0) {
            if (i12 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - AbstractC0681w.f2214a;
                if (i10 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        } else {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i7 = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i7 = i11 + 112;
            }
            int i14 = i7;
            i8 = i13;
            i9 = i14;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    /* renamed from: f */
    public static final AbstractC1516c m1457f(long j6) {
        float[] fArr = C1517d.f10015a;
        return C1517d.f10039y[(int) (j6 & 63)];
    }

    /* renamed from: g */
    public static final float m1458g(long j6) {
        int i7;
        int i8;
        int i9;
        if ((63 & j6) == 0) {
            return ((float) AbstractC3393k.m5129B((j6 >>> 40) & 255)) / 255.0f;
        }
        short s5 = (short) ((j6 >>> 32) & 65535);
        int i10 = 32768 & s5;
        int i11 = ((65535 & s5) >>> 10) & 31;
        int i12 = s5 & 1023;
        if (i11 == 0) {
            if (i12 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - AbstractC0681w.f2214a;
                if (i10 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        } else {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i7 = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i7 = i11 + 112;
            }
            int i14 = i7;
            i8 = i13;
            i9 = i14;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    /* renamed from: h */
    public static final float m1459h(long j6) {
        int i7;
        int i8;
        int i9;
        if ((63 & j6) == 0) {
            return ((float) AbstractC3393k.m5129B((j6 >>> 48) & 255)) / 255.0f;
        }
        short s5 = (short) ((j6 >>> 48) & 65535);
        int i10 = 32768 & s5;
        int i11 = ((65535 & s5) >>> 10) & 31;
        int i12 = s5 & 1023;
        if (i11 == 0) {
            if (i12 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i12 + 1056964608) - AbstractC0681w.f2214a;
                if (i10 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i9 = 0;
            i8 = 0;
        } else {
            int i13 = i12 << 13;
            if (i11 == 31) {
                i7 = 255;
                if (i13 != 0) {
                    i13 |= 4194304;
                }
            } else {
                i7 = i11 + 112;
            }
            int i14 = i7;
            i8 = i13;
            i9 = i14;
        }
        return Float.intBitsToFloat((i9 << 23) | (i10 << 16) | i8);
    }

    /* renamed from: i */
    public static String m1460i(long j6) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(m1459h(j6));
        sb.append(", ");
        sb.append(m1458g(j6));
        sb.append(", ");
        sb.append(m1456e(j6));
        sb.append(", ");
        sb.append(m1455d(j6));
        sb.append(", ");
        return AbstractC0094y0.m187n(sb, m1457f(j6).f10012a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0677s) {
            if (this.f2211a != ((C0677s) obj).f2211a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2211a);
    }

    public final String toString() {
        return m1460i(this.f2211a);
    }
}
