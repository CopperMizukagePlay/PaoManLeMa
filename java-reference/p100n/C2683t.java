package p100n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.t */
/* loaded from: classes.dex */
public final class C2683t {

    /* renamed from: a */
    public double f14420a;

    /* renamed from: b */
    public double f14421b;

    public C2683t(double d7, double d8) {
        this.f14420a = d7;
        this.f14421b = d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2683t)) {
            return false;
        }
        C2683t c2683t = (C2683t) obj;
        if (Double.compare(this.f14420a, c2683t.f14420a) == 0 && Double.compare(this.f14421b, c2683t.f14421b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f14421b) + (Double.hashCode(this.f14420a) * 31);
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f14420a + ", _imaginary=" + this.f14421b + ')';
    }
}
