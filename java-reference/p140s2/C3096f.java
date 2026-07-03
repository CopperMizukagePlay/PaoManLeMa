package p140s2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s2.f */
/* loaded from: classes.dex */
public final class C3096f implements Comparable {

    /* renamed from: e */
    public final float f15693e;

    /* renamed from: a */
    public static final boolean m4776a(float f7, float f8) {
        if (Float.compare(f7, f8) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m4777b(float f7) {
        if (Float.isNaN(f7)) {
            return "Dp.Unspecified";
        }
        return f7 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f15693e, ((C3096f) obj).f15693e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3096f) {
            if (Float.compare(this.f15693e, ((C3096f) obj).f15693e) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15693e);
    }

    public final String toString() {
        return m4777b(this.f15693e);
    }
}
