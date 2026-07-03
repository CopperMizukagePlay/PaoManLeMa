package p132r2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.s */
/* loaded from: classes.dex */
public final class C3045s {

    /* renamed from: c */
    public static final C3045s f15617c = new C3045s(2, false);

    /* renamed from: d */
    public static final C3045s f15618d = new C3045s(1, true);

    /* renamed from: a */
    public final int f15619a;

    /* renamed from: b */
    public final boolean f15620b;

    public C3045s(int i7, boolean z7) {
        this.f15619a = i7;
        this.f15620b = z7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3045s) {
                C3045s c3045s = (C3045s) obj;
                if (this.f15619a == c3045s.f15619a && this.f15620b == c3045s.f15620b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15620b) + (Integer.hashCode(this.f15619a) * 31);
    }

    public final String toString() {
        if (equals(f15617c)) {
            return "TextMotion.Static";
        }
        if (equals(f15618d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
