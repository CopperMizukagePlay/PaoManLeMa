package p039e5;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.w1 */
/* loaded from: classes.dex */
public final class C1383w1 {

    /* renamed from: a */
    public final double f8286a;

    public /* synthetic */ C1383w1() {
        this(0.0d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1383w1) {
                C1383w1 c1383w1 = (C1383w1) obj;
                if (Double.compare(0.0d, 0.0d) != 0 || Double.compare(this.f8286a, c1383w1.f8286a) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Double.hashCode(this.f8286a) + (Double.hashCode(0.0d) * 31);
    }

    public final String toString() {
        return "CpuUsage(totalPercent=0.0, processPercent=" + this.f8286a + ")";
    }

    public C1383w1(double d7) {
        this.f8286a = d7;
    }
}
