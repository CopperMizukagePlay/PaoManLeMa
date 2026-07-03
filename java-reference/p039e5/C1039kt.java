package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.kt */
/* loaded from: classes.dex */
public final class C1039kt {

    /* renamed from: a */
    public final long f5341a;

    /* renamed from: b */
    public final long f5342b;

    /* renamed from: c */
    public final double f5343c;

    /* renamed from: d */
    public final double f5344d;

    /* renamed from: e */
    public final double f5345e;

    /* renamed from: f */
    public final double f5346f;

    public C1039kt(long j6, long j7, double d7, double d8, double d9, double d10) {
        this.f5341a = j6;
        this.f5342b = j7;
        this.f5343c = d7;
        this.f5344d = d8;
        this.f5345e = d9;
        this.f5346f = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1039kt)) {
            return false;
        }
        C1039kt c1039kt = (C1039kt) obj;
        if (this.f5341a == c1039kt.f5341a && this.f5342b == c1039kt.f5342b && Double.compare(this.f5343c, c1039kt.f5343c) == 0 && Double.compare(this.f5344d, c1039kt.f5344d) == 0 && Double.compare(this.f5345e, c1039kt.f5345e) == 0 && Double.compare(this.f5346f, c1039kt.f5346f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f5346f) + AbstractC0094y0.m174a(this.f5345e, AbstractC0094y0.m174a(this.f5344d, AbstractC0094y0.m174a(this.f5343c, AbstractC2487d.m4039c(Long.hashCode(this.f5341a) * 31, 31, this.f5342b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatsTick(totalDownloadBytes=");
        sb.append(this.f5341a);
        sb.append(", totalUploadBytes=");
        sb.append(this.f5342b);
        AbstractC0094y0.m193t(sb, ", downloadInstantMbps=", this.f5343c, ", uploadInstantMbps=");
        sb.append(this.f5344d);
        AbstractC0094y0.m193t(sb, ", downloadMbps=", this.f5345e, ", uploadMbps=");
        sb.append(this.f5346f);
        sb.append(")");
        return sb.toString();
    }
}
