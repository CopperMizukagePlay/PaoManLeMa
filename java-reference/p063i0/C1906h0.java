package p063i0;

import p035e1.C0677s;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.h0 */
/* loaded from: classes.dex */
public final class C1906h0 {

    /* renamed from: a */
    public final long f11269a;

    /* renamed from: b */
    public final long f11270b;

    /* renamed from: c */
    public final long f11271c;

    /* renamed from: d */
    public final long f11272d;

    public C1906h0(long j6, long j7, long j8, long j9) {
        this.f11269a = j6;
        this.f11270b = j7;
        this.f11271c = j8;
        this.f11272d = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1906h0)) {
            return false;
        }
        C1906h0 c1906h0 = (C1906h0) obj;
        if (C0677s.m1454c(this.f11269a, c1906h0.f11269a) && C0677s.m1454c(this.f11270b, c1906h0.f11270b) && C0677s.m1454c(this.f11271c, c1906h0.f11271c) && C0677s.m1454c(this.f11272d, c1906h0.f11272d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f11272d) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(Long.hashCode(this.f11269a) * 31, 31, this.f11270b), 31, this.f11271c);
    }
}
