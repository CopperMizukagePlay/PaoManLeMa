package p115p;

import p027d1.C0464b;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p.h */
/* loaded from: classes.dex */
public final class C2828h extends AbstractC2829i {

    /* renamed from: a */
    public final long f14901a;

    public C2828h(long j6) {
        this.f14901a = j6;
        if (AbstractC3784a.m5815x(j6)) {
        } else {
            throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2828h)) {
            return false;
        }
        return C0464b.m1006b(this.f14901a, ((C2828h) obj).f14901a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f14901a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) C0464b.m1013i(this.f14901a)) + ')';
    }
}
