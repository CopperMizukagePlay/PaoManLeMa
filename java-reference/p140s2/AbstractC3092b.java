package p140s2;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.b */
/* loaded from: classes.dex */
public abstract class AbstractC3092b {
    /* renamed from: a */
    public static final long m4764a(int i7, int i8, int i9, int i10) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10 = false;
        if (i8 >= i7) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (i10 >= i9) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z11 = z7 & z8;
        if (i7 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z12 = z11 & z9;
        if (i9 >= 0) {
            z10 = true;
        }
        if (!(z10 & z12)) {
            AbstractC3099i.m4781a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return m4771h(i7, i8, i9, i10);
    }

    /* renamed from: b */
    public static /* synthetic */ long m4765b(int i7, int i8, int i9) {
        if ((i9 & 2) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        if ((i9 & 8) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        return m4764a(0, i7, 0, i8);
    }

    /* renamed from: c */
    public static final int m4766c(int i7) {
        if (i7 < 8191) {
            return 13;
        }
        if (i7 < 32767) {
            return 15;
        }
        if (i7 < 65535) {
            return 16;
        }
        if (i7 < 262143) {
            return 18;
        }
        return 255;
    }

    /* renamed from: d */
    public static final long m4767d(long j6, long j7) {
        int i7 = (int) (j7 >> 32);
        int m4762j = C3091a.m4762j(j6);
        int m4760h = C3091a.m4760h(j6);
        if (i7 < m4762j) {
            i7 = m4762j;
        }
        if (i7 <= m4760h) {
            m4760h = i7;
        }
        int i8 = (int) (j7 & 4294967295L);
        int m4761i = C3091a.m4761i(j6);
        int m4759g = C3091a.m4759g(j6);
        if (i8 < m4761i) {
            i8 = m4761i;
        }
        if (i8 <= m4759g) {
            m4759g = i8;
        }
        return (m4760h << 32) | (m4759g & 4294967295L);
    }

    /* renamed from: e */
    public static final long m4768e(long j6, long j7) {
        int m4762j = C3091a.m4762j(j6);
        int m4760h = C3091a.m4760h(j6);
        int m4761i = C3091a.m4761i(j6);
        int m4759g = C3091a.m4759g(j6);
        int m4762j2 = C3091a.m4762j(j7);
        if (m4762j2 < m4762j) {
            m4762j2 = m4762j;
        }
        if (m4762j2 > m4760h) {
            m4762j2 = m4760h;
        }
        int m4760h2 = C3091a.m4760h(j7);
        if (m4760h2 >= m4762j) {
            m4762j = m4760h2;
        }
        if (m4762j <= m4760h) {
            m4760h = m4762j;
        }
        int m4761i2 = C3091a.m4761i(j7);
        if (m4761i2 < m4761i) {
            m4761i2 = m4761i;
        }
        if (m4761i2 > m4759g) {
            m4761i2 = m4759g;
        }
        int m4759g2 = C3091a.m4759g(j7);
        if (m4759g2 >= m4761i) {
            m4761i = m4759g2;
        }
        if (m4761i <= m4759g) {
            m4759g = m4761i;
        }
        return m4764a(m4762j2, m4760h, m4761i2, m4759g);
    }

    /* renamed from: f */
    public static final int m4769f(int i7, long j6) {
        int m4761i = C3091a.m4761i(j6);
        int m4759g = C3091a.m4759g(j6);
        if (i7 < m4761i) {
            i7 = m4761i;
        }
        if (i7 > m4759g) {
            return m4759g;
        }
        return i7;
    }

    /* renamed from: g */
    public static final int m4770g(int i7, long j6) {
        int m4762j = C3091a.m4762j(j6);
        int m4760h = C3091a.m4760h(j6);
        if (i7 < m4762j) {
            i7 = m4762j;
        }
        if (i7 > m4760h) {
            return m4760h;
        }
        return i7;
    }

    /* renamed from: h */
    public static final long m4771h(int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        if (i10 == Integer.MAX_VALUE) {
            i11 = i9;
        } else {
            i11 = i10;
        }
        int m4766c = m4766c(i11);
        if (i8 == Integer.MAX_VALUE) {
            i12 = i7;
        } else {
            i12 = i8;
        }
        int m4766c2 = m4766c(i12);
        if (m4766c + m4766c2 > 31) {
            m4774k(i12, i11);
        }
        int i13 = i8 + 1;
        int i14 = i10 + 1;
        int i15 = m4766c2 - 13;
        return ((i13 & (~(i13 >> 31))) << 33) | ((i15 >> 1) + (i15 & 1)) | (i7 << 2) | (i9 << (m4766c2 + 2)) | ((i14 & (~(i14 >> 31))) << (m4766c2 + 33));
    }

    /* renamed from: i */
    public static final long m4772i(int i7, int i8, long j6) {
        int m4762j = C3091a.m4762j(j6) + i7;
        int i9 = 0;
        if (m4762j < 0) {
            m4762j = 0;
        }
        int m4760h = C3091a.m4760h(j6);
        if (m4760h != Integer.MAX_VALUE && (m4760h = m4760h + i7) < 0) {
            m4760h = 0;
        }
        int m4761i = C3091a.m4761i(j6) + i8;
        if (m4761i < 0) {
            m4761i = 0;
        }
        int m4759g = C3091a.m4759g(j6);
        if (m4759g == Integer.MAX_VALUE || (m4759g = m4759g + i8) >= 0) {
            i9 = m4759g;
        }
        return m4764a(m4762j, m4760h, m4761i, i9);
    }

    /* renamed from: j */
    public static /* synthetic */ long m4773j(long j6, int i7, int i8, int i9) {
        if ((i9 & 1) != 0) {
            i7 = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return m4772i(i7, i8, j6);
    }

    /* renamed from: k */
    public static final void m4774k(int i7, int i8) {
        throw new IllegalArgumentException(AbstractC0094y0.m183j(i7, i8, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    /* renamed from: l */
    public static final Void m4775l(int i7) {
        throw new IllegalArgumentException(AbstractC0094y0.m184k(i7, "Can't represent a size of ", " in Constraints"));
    }
}
