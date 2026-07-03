package p063i0;

import p035e1.C0677s;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.r2 */
/* loaded from: classes.dex */
public final class C1989r2 {

    /* renamed from: a */
    public final long f11715a;

    /* renamed from: b */
    public final long f11716b;

    /* renamed from: c */
    public final long f11717c;

    /* renamed from: d */
    public final long f11718d;

    /* renamed from: e */
    public final long f11719e;

    /* renamed from: f */
    public final long f11720f;

    public C1989r2(long j6, long j7, long j8, long j9, long j10, long j11) {
        this.f11715a = j6;
        this.f11716b = j7;
        this.f11717c = j8;
        this.f11718d = j9;
        this.f11719e = j10;
        this.f11720f = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1989r2)) {
            return false;
        }
        C1989r2 c1989r2 = (C1989r2) obj;
        if (C0677s.m1454c(this.f11715a, c1989r2.f11715a) && C0677s.m1454c(this.f11716b, c1989r2.f11716b) && C0677s.m1454c(this.f11717c, c1989r2.f11717c) && C0677s.m1454c(this.f11718d, c1989r2.f11718d) && C0677s.m1454c(this.f11719e, c1989r2.f11719e) && C0677s.m1454c(this.f11720f, c1989r2.f11720f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f11720f) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(Long.hashCode(this.f11715a) * 31, 31, this.f11716b), 31, this.f11717c), 31, this.f11718d), 31, this.f11719e);
    }
}
