package p039e5;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.tc */
/* loaded from: classes.dex */
public final class C1301tc {

    /* renamed from: a */
    public final int f7782a;

    /* renamed from: b */
    public final double f7783b;

    /* renamed from: c */
    public final double f7784c;

    /* renamed from: d */
    public final double f7785d;

    public C1301tc(double d7, double d8, double d9, int i7) {
        this.f7782a = i7;
        this.f7783b = d7;
        this.f7784c = d8;
        this.f7785d = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1301tc)) {
            return false;
        }
        C1301tc c1301tc = (C1301tc) obj;
        if (this.f7782a == c1301tc.f7782a && Double.compare(this.f7783b, c1301tc.f7783b) == 0 && Double.compare(this.f7784c, c1301tc.f7784c) == 0 && Double.compare(this.f7785d, c1301tc.f7785d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f7785d) + AbstractC0094y0.m174a(this.f7784c, AbstractC0094y0.m174a(this.f7783b, Integer.hashCode(this.f7782a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Iperf3IntervalReport(index=");
        sb.append(this.f7782a);
        sb.append(", elapsedSec=");
        sb.append(this.f7783b);
        AbstractC0094y0.m193t(sb, ", uploadBps=", this.f7784c, ", downloadBps=");
        sb.append(this.f7785d);
        sb.append(")");
        return sb.toString();
    }
}
