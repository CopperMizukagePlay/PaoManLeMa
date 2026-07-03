package p063i0;

import p035e1.C0677s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.q4 */
/* loaded from: classes.dex */
public final class C1983q4 {

    /* renamed from: a */
    public final long f11696a = C0677s.f2209g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1983q4) {
                if (!C0677s.m1454c(this.f11696a, ((C1983q4) obj).f11696a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f11696a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C0677s.m1460i(this.f11696a)) + ", rippleAlpha=null)";
    }
}
