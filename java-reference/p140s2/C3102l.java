package p140s2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.l */
/* loaded from: classes.dex */
public final class C3102l {

    /* renamed from: a */
    public final long f15702a;

    /* renamed from: a */
    public static final boolean m4790a(long j6, long j7) {
        if (j6 == j7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m4791b(long j6) {
        return ((int) (j6 >> 32)) + " x " + ((int) (j6 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3102l) {
            if (this.f15702a != ((C3102l) obj).f15702a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15702a);
    }

    public final String toString() {
        return m4791b(this.f15702a);
    }
}
