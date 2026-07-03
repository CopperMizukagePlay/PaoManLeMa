package p027d1;

import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d1.b */
/* loaded from: classes.dex */
public final class C0464b {

    /* renamed from: a */
    public final long f1623a;

    /* renamed from: a */
    public static long m1005a(long j6, float f7, int i7) {
        float f8;
        if ((i7 & 1) != 0) {
            f8 = Float.intBitsToFloat((int) (j6 >> 32));
        } else {
            f8 = 0.0f;
        }
        if ((i7 & 2) != 0) {
            f7 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L);
    }

    /* renamed from: b */
    public static final boolean m1006b(long j6, long j7) {
        if (j6 == j7) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final float m1007c(long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    /* renamed from: d */
    public static final float m1008d(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    /* renamed from: e */
    public static final float m1009e(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    /* renamed from: f */
    public static final long m1010f(long j6, long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) - Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    /* renamed from: g */
    public static final long m1011g(long j6, long j7) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat((int) (j6 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    /* renamed from: h */
    public static final long m1012h(float f7, long j6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) * f7;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) * f7;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    /* renamed from: i */
    public static String m1013i(long j6) {
        if ((9223372034707292159L & j6) != 9205357640488583168L) {
            return "Offset(" + AbstractC3393k.m5128A(Float.intBitsToFloat((int) (j6 >> 32))) + ", " + AbstractC3393k.m5128A(Float.intBitsToFloat((int) (j6 & 4294967295L))) + ')';
        }
        return "Offset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0464b) {
            if (this.f1623a != ((C0464b) obj).f1623a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1623a);
    }

    public final String toString() {
        return m1013i(this.f1623a);
    }
}
