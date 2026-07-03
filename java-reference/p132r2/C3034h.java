package p132r2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.h */
/* loaded from: classes.dex */
public final class C3034h {

    /* renamed from: a */
    public final int f15596a;

    public final boolean equals(Object obj) {
        if (obj instanceof C3034h) {
            if (this.f15596a != ((C3034h) obj).f15596a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15596a);
    }

    public final String toString() {
        int i7 = this.f15596a;
        if (i7 == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i7 == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i7 == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        if (i7 == 0) {
            return "LineHeightStyle.Trim.None";
        }
        return "Invalid";
    }
}
