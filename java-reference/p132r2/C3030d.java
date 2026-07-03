package p132r2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.d */
/* loaded from: classes.dex */
public final class C3030d {

    /* renamed from: a */
    public final int f15589a;

    /* renamed from: a */
    public static String m4719a(int i7) {
        if (i7 == 1) {
            return "Hyphens.None";
        }
        if (i7 == 2) {
            return "Hyphens.Auto";
        }
        if (i7 == Integer.MIN_VALUE) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3030d) {
            if (this.f15589a != ((C3030d) obj).f15589a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15589a);
    }

    public final String toString() {
        return m4719a(this.f15589a);
    }
}
