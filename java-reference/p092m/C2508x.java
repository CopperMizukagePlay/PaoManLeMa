package p092m;

import p100n.InterfaceC2627a0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m.x */
/* loaded from: classes.dex */
public final class C2508x {

    /* renamed from: a */
    public final InterfaceC2627a0 f13853a;

    public C2508x(InterfaceC2627a0 interfaceC2627a0) {
        this.f13853a = interfaceC2627a0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2508x) {
                C2508x c2508x = (C2508x) obj;
                if (Float.compare(0.0f, 0.0f) != 0 || !AbstractC3367j.m5096a(this.f13853a, c2508x.f13853a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13853a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f13853a + ')';
    }
}
