package p117p1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.r */
/* loaded from: classes.dex */
public final class C2867r {

    /* renamed from: a */
    public final long f15005a;

    /* renamed from: a */
    public static final boolean m4548a(long j6, long j7) {
        if (j6 == j7) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m4549b(long j6) {
        return "PointerId(value=" + j6 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2867r) {
            if (this.f15005a != ((C2867r) obj).f15005a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15005a);
    }

    public final String toString() {
        return m4549b(this.f15005a);
    }
}
