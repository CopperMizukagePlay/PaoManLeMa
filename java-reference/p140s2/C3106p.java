package p140s2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.p */
/* loaded from: classes.dex */
public final class C3106p {

    /* renamed from: a */
    public final long f15710a;

    /* renamed from: a */
    public static final boolean m4798a(long j6, long j7) {
        if (j6 == j7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m4799b(long j6) {
        if (m4798a(j6, 0L)) {
            return "Unspecified";
        }
        if (m4798a(j6, 4294967296L)) {
            return "Sp";
        }
        if (m4798a(j6, 8589934592L)) {
            return "Em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3106p) {
            if (this.f15710a != ((C3106p) obj).f15710a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15710a);
    }

    public final String toString() {
        return m4799b(this.f15710a);
    }
}
