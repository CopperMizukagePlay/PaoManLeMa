package p191z0;

import p092m.AbstractC2487d;
import p100n.C2673p1;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z0.d */
/* loaded from: classes.dex */
public final class C3865d {

    /* renamed from: a */
    public final int f18119a;

    /* renamed from: b */
    public final long f18120b;

    /* renamed from: c */
    public final EnumC3866e f18121c;

    /* renamed from: d */
    public final C2673p1 f18122d;

    public C3865d(int i7, long j6, EnumC3866e enumC3866e, C2673p1 c2673p1) {
        this.f18119a = i7;
        this.f18120b = j6;
        this.f18121c = enumC3866e;
        this.f18122d = c2673p1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3865d)) {
            return false;
        }
        C3865d c3865d = (C3865d) obj;
        if (this.f18119a == c3865d.f18119a && this.f18120b == c3865d.f18120b && this.f18121c == c3865d.f18121c && AbstractC3367j.m5096a(this.f18122d, c3865d.f18122d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f18121c.hashCode() + AbstractC2487d.m4039c(Integer.hashCode(this.f18119a) * 31, 31, this.f18120b)) * 31;
        C2673p1 c2673p1 = this.f18122d;
        if (c2673p1 == null) {
            hashCode = 0;
        } else {
            hashCode = c2673p1.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f18119a + ", timestamp=" + this.f18120b + ", type=" + this.f18121c + ", structureCompat=" + this.f18122d + ')';
    }
}
