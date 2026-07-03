package p132r2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.r */
/* loaded from: classes.dex */
public final class C3044r {

    /* renamed from: a */
    public final int f15616a;

    public final boolean equals(Object obj) {
        if (obj instanceof C3044r) {
            if (this.f15616a != ((C3044r) obj).f15616a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15616a);
    }

    public final String toString() {
        int i7 = this.f15616a;
        if (i7 == 1) {
            return "Linearity.Linear";
        }
        if (i7 == 2) {
            return "Linearity.FontHinting";
        }
        if (i7 == 3) {
            return "Linearity.None";
        }
        return "Invalid";
    }
}
