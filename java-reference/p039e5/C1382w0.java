package p039e5;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.w0 */
/* loaded from: classes.dex */
public final class C1382w0 {

    /* renamed from: a */
    public final long f8284a;

    /* renamed from: b */
    public final long f8285b;

    public C1382w0(long j6, long j7) {
        this.f8284a = j6;
        this.f8285b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1382w0)) {
            return false;
        }
        C1382w0 c1382w0 = (C1382w0) obj;
        if (this.f8284a == c1382w0.f8284a && this.f8285b == c1382w0.f8285b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8285b) + (Long.hashCode(this.f8284a) * 31);
    }

    public final String toString() {
        return "ByteSample(timeMs=" + this.f8284a + ", totalBytes=" + this.f8285b + ")";
    }
}
