package p039e5;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.tr */
/* loaded from: classes.dex */
public final class C1316tr {

    /* renamed from: a */
    public final double f7861a;

    /* renamed from: b */
    public final double f7862b;

    public C1316tr(double d7, double d8) {
        this.f7861a = d7;
        this.f7862b = d8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1316tr)) {
            return false;
        }
        C1316tr c1316tr = (C1316tr) obj;
        if (Double.compare(this.f7861a, c1316tr.f7861a) == 0 && Double.compare(this.f7862b, c1316tr.f7862b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f7862b) + (Double.hashCode(this.f7861a) * 31);
    }

    public final String toString() {
        return "OkHttpDisplayRate(speedMbps=" + this.f7861a + ", ema=" + this.f7862b + ")";
    }
}
