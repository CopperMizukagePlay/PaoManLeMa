package p063i0;

import p035e1.C0677s;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.n4 */
/* loaded from: classes.dex */
public final class C1959n4 {

    /* renamed from: a */
    public final long f11581a;

    /* renamed from: b */
    public final long f11582b;

    /* renamed from: c */
    public final long f11583c;

    /* renamed from: d */
    public final long f11584d;

    public C1959n4(long j6, long j7, long j8, long j9) {
        this.f11581a = j6;
        this.f11582b = j7;
        this.f11583c = j8;
        this.f11584d = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1959n4)) {
            return false;
        }
        C1959n4 c1959n4 = (C1959n4) obj;
        if (C0677s.m1454c(this.f11581a, c1959n4.f11581a) && C0677s.m1454c(this.f11582b, c1959n4.f11582b) && C0677s.m1454c(this.f11583c, c1959n4.f11583c) && C0677s.m1454c(this.f11584d, c1959n4.f11584d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f11584d) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(Long.hashCode(this.f11581a) * 31, 31, this.f11582b), 31, this.f11583c);
    }
}
