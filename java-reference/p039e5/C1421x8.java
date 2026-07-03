package p039e5;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.x8 */
/* loaded from: classes.dex */
public final class C1421x8 {

    /* renamed from: a */
    public final long f8621a;

    /* renamed from: b */
    public final double f8622b;

    public C1421x8(long j6, double d7) {
        this.f8621a = j6;
        this.f8622b = d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1421x8)) {
            return false;
        }
        C1421x8 c1421x8 = (C1421x8) obj;
        if (this.f8621a == c1421x8.f8621a && Double.compare(this.f8622b, c1421x8.f8622b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f8622b) + (Long.hashCode(this.f8621a) * 31);
    }

    public final String toString() {
        return "DownloadDrainResult(responseBytes=" + this.f8621a + ", firstByteMs=" + this.f8622b + ")";
    }
}
