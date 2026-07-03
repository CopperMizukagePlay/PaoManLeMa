package p140s2;

import p068i5.AbstractC2080d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.o */
/* loaded from: classes.dex */
public final class C3105o {

    /* renamed from: b */
    public static final C3106p[] f15707b = {new C3106p(0), new C3106p(4294967296L), new C3106p(8589934592L)};

    /* renamed from: c */
    public static final long f15708c = AbstractC2080d.m3413z(Float.NaN, 0);

    /* renamed from: a */
    public final long f15709a;

    /* renamed from: a */
    public static final boolean m4794a(long j6, long j7) {
        if (j6 == j7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final long m4795b(long j6) {
        return f15707b[(int) ((j6 & 1095216660480L) >>> 32)].f15710a;
    }

    /* renamed from: c */
    public static final float m4796c(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    /* renamed from: d */
    public static String m4797d(long j6) {
        long m4795b = m4795b(j6);
        if (C3106p.m4798a(m4795b, 0L)) {
            return "Unspecified";
        }
        if (C3106p.m4798a(m4795b, 4294967296L)) {
            return m4796c(j6) + ".sp";
        }
        if (C3106p.m4798a(m4795b, 8589934592L)) {
            return m4796c(j6) + ".em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3105o) {
            if (this.f15709a != ((C3105o) obj).f15709a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15709a);
    }

    public final String toString() {
        return m4797d(this.f15709a);
    }
}
