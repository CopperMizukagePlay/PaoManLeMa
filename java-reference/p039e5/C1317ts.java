package p039e5;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ts */
/* loaded from: classes.dex */
public final class C1317ts {

    /* renamed from: a */
    public final boolean f7863a;

    /* renamed from: b */
    public final double f7864b;

    public C1317ts(boolean z7, double d7) {
        this.f7863a = z7;
        this.f7864b = d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1317ts)) {
            return false;
        }
        C1317ts c1317ts = (C1317ts) obj;
        if (this.f7863a == c1317ts.f7863a && Double.compare(this.f7864b, c1317ts.f7864b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f7864b) + (Boolean.hashCode(this.f7863a) * 31);
    }

    public final String toString() {
        return "ProbeResult(success=" + this.f7863a + ", rttMs=" + this.f7864b + ")";
    }
}
