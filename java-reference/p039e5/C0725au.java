package p039e5;

import java.util.Map;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.au */
/* loaded from: classes.dex */
public final class C0725au {

    /* renamed from: a */
    public final long f2519a;

    /* renamed from: b */
    public final long f2520b;

    /* renamed from: c */
    public final long f2521c;

    /* renamed from: d */
    public final Map f2522d;

    public C0725au(long j6, long j7, long j8, Map map) {
        this.f2519a = j6;
        this.f2520b = j7;
        this.f2521c = j8;
        this.f2522d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0725au)) {
            return false;
        }
        C0725au c0725au = (C0725au) obj;
        if (this.f2519a == c0725au.f2519a && this.f2520b == c0725au.f2520b && this.f2521c == c0725au.f2521c && AbstractC3367j.m5096a(this.f2522d, c0725au.f2522d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2522d.hashCode() + AbstractC2487d.m4039c(AbstractC2487d.m4039c(Long.hashCode(this.f2519a) * 31, 31, this.f2520b), 31, this.f2521c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrafficBytes(rxBytes=");
        sb.append(this.f2519a);
        sb.append(", txBytes=");
        sb.append(this.f2520b);
        AbstractC2487d.m4056t(sb, ", sampleTimeMs=", this.f2521c, ", interfaceBytes=");
        sb.append(this.f2522d);
        sb.append(")");
        return sb.toString();
    }
}
