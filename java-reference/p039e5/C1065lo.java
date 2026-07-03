package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.lo */
/* loaded from: classes.dex */
public final class C1065lo {

    /* renamed from: a */
    public final long f5706a;

    /* renamed from: b */
    public final long f5707b;

    /* renamed from: c */
    public final String f5708c;

    /* renamed from: d */
    public final String f5709d;

    /* renamed from: e */
    public final double f5710e;

    /* renamed from: f */
    public final double f5711f;

    /* renamed from: g */
    public final long f5712g;

    /* renamed from: h */
    public final long f5713h;

    public C1065lo(long j6, long j7, String str, String str2, double d7, double d8, long j8, long j9) {
        this.f5706a = j6;
        this.f5707b = j7;
        this.f5708c = str;
        this.f5709d = str2;
        this.f5710e = d7;
        this.f5711f = d8;
        this.f5712g = j8;
        this.f5713h = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1065lo)) {
            return false;
        }
        C1065lo c1065lo = (C1065lo) obj;
        if (this.f5706a == c1065lo.f5706a && this.f5707b == c1065lo.f5707b && AbstractC3367j.m5096a(this.f5708c, c1065lo.f5708c) && AbstractC3367j.m5096a(this.f5709d, c1065lo.f5709d) && Double.compare(this.f5710e, c1065lo.f5710e) == 0 && Double.compare(this.f5711f, c1065lo.f5711f) == 0 && this.f5712g == c1065lo.f5712g && this.f5713h == c1065lo.f5713h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5713h) + AbstractC2487d.m4039c(AbstractC0094y0.m174a(this.f5711f, AbstractC0094y0.m174a(this.f5710e, AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC2487d.m4039c(Long.hashCode(this.f5706a) * 31, 31, this.f5707b), 31, this.f5708c), 31, this.f5709d), 31), 31), 31, this.f5712g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeedHistoryRecord(id=");
        sb.append(this.f5706a);
        sb.append(", timeMillis=");
        sb.append(this.f5707b);
        sb.append(", networkType=");
        sb.append(this.f5708c);
        sb.append(", mode=");
        sb.append(this.f5709d);
        sb.append(", downloadMbps=");
        sb.append(this.f5710e);
        AbstractC0094y0.m193t(sb, ", uploadMbps=", this.f5711f, ", downloadBytes=");
        sb.append(this.f5712g);
        sb.append(", uploadBytes=");
        sb.append(this.f5713h);
        sb.append(")");
        return sb.toString();
    }
}
