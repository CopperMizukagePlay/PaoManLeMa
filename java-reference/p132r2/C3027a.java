package p132r2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.a */
/* loaded from: classes.dex */
public final class C3027a {

    /* renamed from: a */
    public final float f15585a;

    public final boolean equals(Object obj) {
        if (obj instanceof C3027a) {
            if (Float.compare(this.f15585a, ((C3027a) obj).f15585a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15585a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f15585a + ')';
    }
}
