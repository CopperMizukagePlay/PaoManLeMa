package p039e5;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.s0 */
/* loaded from: classes.dex */
public final class C1258s0 implements InterfaceC1351v0 {

    /* renamed from: a */
    public final C1227r0 f7455a;

    public C1258s0(C1227r0 c1227r0) {
        this.f7455a = c1227r0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1258s0) && AbstractC3367j.m5096a(this.f7455a, ((C1258s0) obj).f7455a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7455a.hashCode();
    }

    public final String toString() {
        return "Available(info=" + this.f7455a + ")";
    }
}
