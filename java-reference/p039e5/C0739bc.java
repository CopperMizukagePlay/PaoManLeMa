package p039e5;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.bc */
/* loaded from: classes.dex */
public final class C0739bc {

    /* renamed from: a */
    public final long f2637a;

    /* renamed from: b */
    public final long f2638b;

    public C0739bc(long j6, long j7) {
        this.f2637a = j6;
        this.f2638b = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0739bc)) {
            return false;
        }
        C0739bc c0739bc = (C0739bc) obj;
        if (this.f2637a == c0739bc.f2637a && this.f2638b == c0739bc.f2638b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2638b) + (Long.hashCode(this.f2637a) * 31);
    }

    public final String toString() {
        return "InterfaceTrafficBytes(rxBytes=" + this.f2637a + ", txBytes=" + this.f2638b + ")";
    }
}
