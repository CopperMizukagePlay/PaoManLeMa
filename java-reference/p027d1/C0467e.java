package p027d1;

import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d1.e */
/* loaded from: classes.dex */
public final class C0467e {

    /* renamed from: a */
    public final long f1637a;

    public /* synthetic */ C0467e(long j6) {
        this.f1637a = j6;
    }

    /* renamed from: a */
    public static final boolean m1023a(long j6, long j7) {
        if (j6 == j7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final float m1024b(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    /* renamed from: c */
    public static final float m1025c(long j6) {
        return Math.min(Float.intBitsToFloat((int) ((j6 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j6 & 2147483647L)));
    }

    /* renamed from: d */
    public static final float m1026d(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    /* renamed from: e */
    public static final boolean m1027e(long j6) {
        boolean z7;
        boolean z8;
        boolean z9 = false;
        if (j6 == 9205357640488583168L) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (Float.intBitsToFloat((int) (j6 >> 32)) <= 0.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean z10 = z7 | z8;
        if (Float.intBitsToFloat((int) (j6 & 4294967295L)) <= 0.0f) {
            z9 = true;
        }
        return z10 | z9;
    }

    /* renamed from: f */
    public static String m1028f(long j6) {
        if (j6 != 9205357640488583168L) {
            return "Size(" + AbstractC3393k.m5128A(Float.intBitsToFloat((int) (j6 >> 32))) + ", " + AbstractC3393k.m5128A(Float.intBitsToFloat((int) (j6 & 4294967295L))) + ')';
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0467e) {
            if (this.f1637a != ((C0467e) obj).f1637a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1637a);
    }

    public final String toString() {
        return m1028f(this.f1637a);
    }
}
