package p063i0;

import p035e1.C0677s;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.d1 */
/* loaded from: classes.dex */
public final class C1871d1 {

    /* renamed from: a */
    public final long f11050a;

    /* renamed from: b */
    public final long f11051b;

    /* renamed from: c */
    public final long f11052c;

    /* renamed from: d */
    public final long f11053d;

    /* renamed from: e */
    public final long f11054e;

    /* renamed from: f */
    public final long f11055f;

    /* renamed from: g */
    public final long f11056g;

    /* renamed from: h */
    public final long f11057h;

    public C1871d1(long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f11050a = j6;
        this.f11051b = j7;
        this.f11052c = j8;
        this.f11053d = j9;
        this.f11054e = j10;
        this.f11055f = j11;
        this.f11056g = j12;
        this.f11057h = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1871d1)) {
            return false;
        }
        C1871d1 c1871d1 = (C1871d1) obj;
        if (!C0677s.m1454c(this.f11050a, c1871d1.f11050a) || !C0677s.m1454c(this.f11051b, c1871d1.f11051b) || !C0677s.m1454c(this.f11052c, c1871d1.f11052c) || !C0677s.m1454c(this.f11053d, c1871d1.f11053d) || !C0677s.m1454c(this.f11054e, c1871d1.f11054e) || !C0677s.m1454c(this.f11055f, c1871d1.f11055f) || !C0677s.m1454c(this.f11056g, c1871d1.f11056g)) {
            return false;
        }
        return C0677s.m1454c(this.f11057h, c1871d1.f11057h);
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f11057h) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(Long.hashCode(this.f11050a) * 31, 31, this.f11051b), 31, this.f11052c), 31, this.f11053d), 31, this.f11054e), 31, this.f11055f), 31, this.f11056g);
    }
}
