package p140s2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.h */
/* loaded from: classes.dex */
public final class C3098h {

    /* renamed from: a */
    public final long f15695a;

    /* renamed from: a */
    public static final float m4779a(long j6) {
        return Float.intBitsToFloat((int) (j6 & 4294967295L));
    }

    /* renamed from: b */
    public static final float m4780b(long j6) {
        return Float.intBitsToFloat((int) (j6 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3098h) {
            if (this.f15695a != ((C3098h) obj).f15695a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15695a);
    }

    public final String toString() {
        long j6 = this.f15695a;
        if (j6 != 9205357640488583168L) {
            return ((Object) C3096f.m4777b(m4780b(j6))) + " x " + ((Object) C3096f.m4777b(m4779a(j6)));
        }
        return "DpSize.Unspecified";
    }
}
