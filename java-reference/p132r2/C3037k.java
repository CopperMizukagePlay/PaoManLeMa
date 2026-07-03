package p132r2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.k */
/* loaded from: classes.dex */
public final class C3037k {

    /* renamed from: a */
    public final int f15603a;

    /* renamed from: a */
    public static String m4723a(int i7) {
        if (i7 == 1) {
            return "Left";
        }
        if (i7 == 2) {
            return "Right";
        }
        if (i7 == 3) {
            return "Center";
        }
        if (i7 == 4) {
            return "Justify";
        }
        if (i7 == 5) {
            return "Start";
        }
        if (i7 == 6) {
            return "End";
        }
        if (i7 == Integer.MIN_VALUE) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3037k) {
            if (this.f15603a != ((C3037k) obj).f15603a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15603a);
    }

    public final String toString() {
        return m4723a(this.f15603a);
    }
}
