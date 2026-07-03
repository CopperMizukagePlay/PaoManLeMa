package p140s2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.q */
/* loaded from: classes.dex */
public final class C3107q {

    /* renamed from: a */
    public final long f15711a;

    /* renamed from: a */
    public static long m4800a(long j6, float f7, float f8, int i7) {
        if ((i7 & 1) != 0) {
            f7 = Float.intBitsToFloat((int) (j6 >> 32));
        }
        if ((i7 & 2) != 0) {
            f8 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L);
    }

    /* renamed from: b */
    public static final float m4801b(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    /* renamed from: c */
    public static final float m4802c(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    /* renamed from: d */
    public static final long m4803d(long j6, long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) - Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    /* renamed from: e */
    public static final long m4804e(long j6, long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    /* renamed from: f */
    public static final long m4805f(float f7, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) * f7;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) * f7;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    /* renamed from: g */
    public static String m4806g(long j6) {
        return "(" + m4801b(j6) + ", " + m4802c(j6) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3107q) {
            if (this.f15711a != ((C3107q) obj).f15711a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15711a);
    }

    public final String toString() {
        return m4806g(this.f15711a);
    }
}
