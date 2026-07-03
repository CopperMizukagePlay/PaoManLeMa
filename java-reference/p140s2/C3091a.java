package p140s2;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.a */
/* loaded from: classes.dex */
public final class C3091a {

    /* renamed from: a */
    public final long f15687a;

    public /* synthetic */ C3091a(long j6) {
        this.f15687a = j6;
    }

    /* renamed from: a */
    public static long m4753a(long j6, int i7, int i8, int i9, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i7 = m4762j(j6);
        }
        if ((i11 & 2) != 0) {
            i8 = m4760h(j6);
        }
        if ((i11 & 4) != 0) {
            i9 = m4761i(j6);
        }
        if ((i11 & 8) != 0) {
            i10 = m4759g(j6);
        }
        if (i8 < i7 || i10 < i9 || i7 < 0 || i9 < 0) {
            AbstractC3099i.m4781a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return AbstractC3092b.m4771h(i7, i8, i9, i10);
    }

    /* renamed from: b */
    public static final boolean m4754b(long j6, long j7) {
        if (j6 == j7) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m4755c(long j6) {
        int i7 = (int) (3 & j6);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        if ((((int) (j6 >> (i8 + 46))) & ((1 << (18 - i8)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m4756d(long j6) {
        int i7 = (int) (3 & j6);
        if ((((int) (j6 >> 33)) & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m4757e(long j6) {
        int i7;
        int i8 = (int) (3 & j6);
        int i9 = (((i8 & 2) >> 1) * 3) + ((i8 & 1) << 1);
        int i10 = (1 << (18 - i9)) - 1;
        int i11 = ((int) (j6 >> (i9 + 15))) & i10;
        int i12 = ((int) (j6 >> (i9 + 46))) & i10;
        if (i12 == 0) {
            i7 = Integer.MAX_VALUE;
        } else {
            i7 = i12 - 1;
        }
        if (i11 == i7) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m4758f(long j6) {
        int i7;
        int i8 = (int) (3 & j6);
        int i9 = (1 << (((((i8 & 2) >> 1) * 3) + ((i8 & 1) << 1)) + 13)) - 1;
        int i10 = ((int) (j6 >> 2)) & i9;
        int i11 = ((int) (j6 >> 33)) & i9;
        if (i11 == 0) {
            i7 = Integer.MAX_VALUE;
        } else {
            i7 = i11 - 1;
        }
        if (i10 == i7) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final int m4759g(long j6) {
        int i7 = (int) (3 & j6);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        int i9 = ((int) (j6 >> (i8 + 46))) & ((1 << (18 - i8)) - 1);
        if (i9 == 0) {
            return Integer.MAX_VALUE;
        }
        return i9 - 1;
    }

    /* renamed from: h */
    public static final int m4760h(long j6) {
        int i7 = (int) (3 & j6);
        int i8 = (int) (j6 >> 33);
        int i9 = i8 & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1);
        if (i9 == 0) {
            return Integer.MAX_VALUE;
        }
        return i9 - 1;
    }

    /* renamed from: i */
    public static final int m4761i(long j6) {
        int i7 = (int) (3 & j6);
        int i8 = (((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1);
        return ((int) (j6 >> (i8 + 15))) & ((1 << (18 - i8)) - 1);
    }

    /* renamed from: j */
    public static final int m4762j(long j6) {
        int i7 = (int) (3 & j6);
        return ((int) (j6 >> 2)) & ((1 << (((((i7 & 2) >> 1) * 3) + ((i7 & 1) << 1)) + 13)) - 1);
    }

    /* renamed from: k */
    public static String m4763k(long j6) {
        String valueOf;
        int m4760h = m4760h(j6);
        String str = "Infinity";
        if (m4760h == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(m4760h);
        }
        int m4759g = m4759g(j6);
        if (m4759g != Integer.MAX_VALUE) {
            str = String.valueOf(m4759g);
        }
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m4762j(j6));
        sb.append(", maxWidth = ");
        sb.append(valueOf);
        sb.append(", minHeight = ");
        sb.append(m4761i(j6));
        sb.append(", maxHeight = ");
        return AbstractC0094y0.m187n(sb, str, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3091a) {
            if (this.f15687a != ((C3091a) obj).f15687a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15687a);
    }

    public final String toString() {
        return m4763k(this.f15687a);
    }
}
