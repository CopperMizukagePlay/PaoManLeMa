package p063i0;

import p035e1.C0677s;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.i2 */
/* loaded from: classes.dex */
public final class C1917i2 {

    /* renamed from: a */
    public final long f11315a;

    /* renamed from: b */
    public final long f11316b;

    /* renamed from: c */
    public final long f11317c;

    /* renamed from: d */
    public final long f11318d;

    public C1917i2(long j6, long j7, long j8, long j9) {
        this.f11315a = j6;
        this.f11316b = j7;
        this.f11317c = j8;
        this.f11318d = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1917i2)) {
            return false;
        }
        C1917i2 c1917i2 = (C1917i2) obj;
        if (C0677s.m1454c(this.f11315a, c1917i2.f11315a) && C0677s.m1454c(this.f11316b, c1917i2.f11316b) && C0677s.m1454c(this.f11317c, c1917i2.f11317c) && C0677s.m1454c(this.f11318d, c1917i2.f11318d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f11318d) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(Long.hashCode(this.f11315a) * 31, 31, this.f11316b), 31, this.f11317c);
    }
}
