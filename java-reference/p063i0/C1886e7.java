package p063i0;

import p035e1.C0677s;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.e7 */
/* loaded from: classes.dex */
public final class C1886e7 {

    /* renamed from: a */
    public final long f11157a;

    /* renamed from: b */
    public final long f11158b;

    /* renamed from: c */
    public final long f11159c;

    /* renamed from: d */
    public final long f11160d;

    /* renamed from: e */
    public final long f11161e;

    public C1886e7(long j6, long j7, long j8, long j9, long j10) {
        this.f11157a = j6;
        this.f11158b = j7;
        this.f11159c = j8;
        this.f11160d = j9;
        this.f11161e = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1886e7)) {
            return false;
        }
        C1886e7 c1886e7 = (C1886e7) obj;
        if (C0677s.m1454c(this.f11157a, c1886e7.f11157a) && C0677s.m1454c(this.f11158b, c1886e7.f11158b) && C0677s.m1454c(this.f11159c, c1886e7.f11159c) && C0677s.m1454c(this.f11160d, c1886e7.f11160d) && C0677s.m1454c(this.f11161e, c1886e7.f11161e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f11161e) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(Long.hashCode(this.f11157a) * 31, 31, this.f11158b), 31, this.f11159c), 31, this.f11160d);
    }
}
