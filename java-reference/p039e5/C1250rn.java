package p039e5;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rn */
/* loaded from: classes.dex */
public final class C1250rn {

    /* renamed from: a */
    public final long f7397a;

    /* renamed from: b */
    public final String f7398b;

    public C1250rn(long j6, String str) {
        AbstractC3367j.m5100e(str, "message");
        this.f7397a = j6;
        this.f7398b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1250rn)) {
            return false;
        }
        C1250rn c1250rn = (C1250rn) obj;
        if (this.f7397a == c1250rn.f7397a && AbstractC3367j.m5096a(this.f7398b, c1250rn.f7398b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7398b.hashCode() + (Long.hashCode(this.f7397a) * 31);
    }

    public final String toString() {
        return "SessionLimitEvent(timeMillis=" + this.f7397a + ", message=" + this.f7398b + ")";
    }
}
