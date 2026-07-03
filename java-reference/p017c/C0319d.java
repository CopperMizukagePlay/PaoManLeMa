package p017c;

import p067i4.AbstractC2072e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c.d */
/* loaded from: classes.dex */
public final class C0319d extends AbstractC2072e {

    /* renamed from: a */
    public final Object f1120a;

    /* renamed from: b */
    public final long f1121b;

    public C0319d(long j6, Object obj) {
        this.f1120a = obj;
        this.f1121b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0319d)) {
            return false;
        }
        C0319d c0319d = (C0319d) obj;
        if (AbstractC3367j.m5096a(this.f1120a, c0319d.f1120a) && this.f1121b == c0319d.f1121b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1121b) + (this.f1120a.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f1120a + ", compositeKey=" + this.f1121b + ')';
    }
}
