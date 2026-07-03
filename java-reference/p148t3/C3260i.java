package p148t3;

import p068i5.AbstractC2080d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t3.i */
/* loaded from: classes.dex */
public final class C3260i extends AbstractC2080d {

    /* renamed from: a */
    public final C3253b f16103a;

    public C3260i(C3253b c3253b) {
        AbstractC3367j.m5100e(c3253b, "latestEvent");
        this.f16103a = c3253b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C3260i.class == obj.getClass() && AbstractC3367j.m5096a(this.f16103a, ((C3260i) obj).f16103a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16103a.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f16103a + ", direction=-1)";
    }
}
