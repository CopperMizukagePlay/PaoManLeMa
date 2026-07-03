package p039e5;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.pr */
/* loaded from: classes.dex */
public final class C1192pr {

    /* renamed from: a */
    public final boolean f6948a;

    /* renamed from: b */
    public final double f6949b;

    /* renamed from: c */
    public final double f6950c;

    /* renamed from: d */
    public final double f6951d;

    /* renamed from: e */
    public final double f6952e;

    /* renamed from: f */
    public final int f6953f;

    public C1192pr(boolean z7, double d7, double d8, double d9, double d10, int i7) {
        this.f6948a = z7;
        this.f6949b = d7;
        this.f6950c = d8;
        this.f6951d = d9;
        this.f6952e = d10;
        this.f6953f = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1192pr)) {
            return false;
        }
        C1192pr c1192pr = (C1192pr) obj;
        if (this.f6948a == c1192pr.f6948a && Double.compare(this.f6949b, c1192pr.f6949b) == 0 && Double.compare(this.f6950c, c1192pr.f6950c) == 0 && Double.compare(this.f6951d, c1192pr.f6951d) == 0 && Double.compare(this.f6952e, c1192pr.f6952e) == 0 && this.f6953f == c1192pr.f6953f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6953f) + AbstractC0094y0.m174a(this.f6952e, AbstractC0094y0.m174a(this.f6951d, AbstractC0094y0.m174a(this.f6950c, AbstractC0094y0.m174a(this.f6949b, Boolean.hashCode(this.f6948a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadAttemptSample(failed=");
        sb.append(this.f6948a);
        sb.append(", firstByteMs=");
        sb.append(this.f6949b);
        AbstractC0094y0.m193t(sb, ", latencyMs=", this.f6950c, ", throughputMbps=");
        sb.append(this.f6951d);
        AbstractC0094y0.m193t(sb, ", timeoutRate=", this.f6952e, ", dipCount=");
        sb.append(this.f6953f);
        sb.append(")");
        return sb.toString();
    }
}
