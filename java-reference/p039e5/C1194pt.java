package p039e5;

import p001a0.AbstractC0094y0;
import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.pt */
/* loaded from: classes.dex */
public final class C1194pt {

    /* renamed from: a */
    public final int f6956a;

    public C1194pt(int i7) {
        this.f6956a = i7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1194pt) || this.f6956a != ((C1194pt) obj).f6956a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6956a) + AbstractC2647h.m4255a(3, Integer.hashCode(5) * 31, 31);
    }

    public final String toString() {
        return AbstractC0094y0.m184k(this.f6956a, "LocalTraceProbeConfig(probesPerHop=5, timeoutSec=3, maxRetries=", ")");
    }
}
