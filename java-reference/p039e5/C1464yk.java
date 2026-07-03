package p039e5;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.yk */
/* loaded from: classes.dex */
public final class C1464yk {

    /* renamed from: a */
    public final long f9453a;

    /* renamed from: b */
    public final String f9454b;

    public C1464yk(long j6, String str) {
        AbstractC3367j.m5100e(str, "message");
        this.f9453a = j6;
        this.f9454b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1464yk)) {
            return false;
        }
        C1464yk c1464yk = (C1464yk) obj;
        if (this.f9453a == c1464yk.f9453a && AbstractC3367j.m5096a(this.f9454b, c1464yk.f9454b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9454b.hashCode() + (Long.hashCode(this.f9453a) * 31);
    }

    public final String toString() {
        return "NatProbeEvent(timeMillis=" + this.f9453a + ", message=" + this.f9454b + ")";
    }
}
