package p039e5;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wr */
/* loaded from: classes.dex */
public final class C1409wr {

    /* renamed from: a */
    public final boolean f8518a;

    /* renamed from: b */
    public final double f8519b;

    /* renamed from: c */
    public final double f8520c;

    /* renamed from: d */
    public final double f8521d;

    public C1409wr(boolean z7, double d7, double d8, double d9) {
        this.f8518a = z7;
        this.f8519b = d7;
        this.f8520c = d8;
        this.f8521d = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1409wr)) {
            return false;
        }
        C1409wr c1409wr = (C1409wr) obj;
        if (this.f8518a == c1409wr.f8518a && Double.compare(this.f8519b, c1409wr.f8519b) == 0 && Double.compare(this.f8520c, c1409wr.f8520c) == 0 && Double.compare(this.f8521d, c1409wr.f8521d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f8521d) + AbstractC0094y0.m174a(this.f8520c, AbstractC0094y0.m174a(this.f8519b, Boolean.hashCode(this.f8518a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadAttemptSample(failed=");
        sb.append(this.f8518a);
        sb.append(", firstByteMs=");
        sb.append(this.f8519b);
        AbstractC0094y0.m193t(sb, ", elapsedMs=", this.f8520c, ", throughputMbps=");
        sb.append(this.f8521d);
        sb.append(")");
        return sb.toString();
    }
}
