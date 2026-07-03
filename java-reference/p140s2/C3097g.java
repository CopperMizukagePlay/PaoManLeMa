package p140s2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.g */
/* loaded from: classes.dex */
public final class C3097g {

    /* renamed from: a */
    public final long f15694a;

    /* renamed from: a */
    public static String m4778a(long j6) {
        if (j6 != 9205357640488583168L) {
            return "(" + ((Object) C3096f.m4777b(Float.intBitsToFloat((int) (j6 >> 32)))) + ", " + ((Object) C3096f.m4777b(Float.intBitsToFloat((int) (j6 & 4294967295L)))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3097g) {
            if (this.f15694a != ((C3097g) obj).f15694a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15694a);
    }

    public final String toString() {
        return m4778a(this.f15694a);
    }
}
