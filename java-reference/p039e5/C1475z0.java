package p039e5;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.z0 */
/* loaded from: classes.dex */
public final class C1475z0 {

    /* renamed from: a */
    public final long f9808a;

    /* renamed from: b */
    public final String f9809b;

    /* renamed from: c */
    public final String f9810c;

    /* renamed from: d */
    public final int f9811d;

    public C1475z0(long j6, String str, String str2, int i7) {
        AbstractC3367j.m5100e(str2, "interfaceName");
        this.f9808a = j6;
        this.f9809b = str;
        this.f9810c = str2;
        this.f9811d = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1475z0)) {
            return false;
        }
        C1475z0 c1475z0 = (C1475z0) obj;
        if (this.f9808a == c1475z0.f9808a && AbstractC3367j.m5096a(this.f9809b, c1475z0.f9809b) && AbstractC3367j.m5096a(this.f9810c, c1475z0.f9810c) && this.f9811d == c1475z0.f9811d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9811d) + AbstractC0094y0.m175b(AbstractC0094y0.m175b(Long.hashCode(this.f9808a) * 31, 31, this.f9809b), 31, this.f9810c);
    }

    public final String toString() {
        return "CompensationLogEntry(timeMillis=" + this.f9808a + ", reason=" + this.f9809b + ", interfaceName=" + this.f9810c + ", activeCount=" + this.f9811d + ")";
    }
}
