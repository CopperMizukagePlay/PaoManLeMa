package p063i0;

import p035e1.C0677s;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.f5 */
/* loaded from: classes.dex */
public final class C1893f5 {

    /* renamed from: a */
    public final long f11188a;

    /* renamed from: b */
    public final long f11189b;

    /* renamed from: c */
    public final long f11190c;

    /* renamed from: d */
    public final long f11191d;

    /* renamed from: e */
    public final long f11192e;

    /* renamed from: f */
    public final long f11193f;

    /* renamed from: g */
    public final long f11194g;

    /* renamed from: h */
    public final long f11195h;

    /* renamed from: i */
    public final long f11196i;

    /* renamed from: j */
    public final long f11197j;

    public C1893f5(long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f11188a = j6;
        this.f11189b = j7;
        this.f11190c = j8;
        this.f11191d = j9;
        this.f11192e = j10;
        this.f11193f = j11;
        this.f11194g = j12;
        this.f11195h = j13;
        this.f11196i = j14;
        this.f11197j = j15;
    }

    /* renamed from: a */
    public final long m3119a(boolean z7, boolean z8) {
        if (z7) {
            if (z8) {
                return this.f11189b;
            }
            return this.f11191d;
        }
        if (z8) {
            return this.f11194g;
        }
        return this.f11196i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1893f5)) {
            return false;
        }
        C1893f5 c1893f5 = (C1893f5) obj;
        if (C0677s.m1454c(this.f11188a, c1893f5.f11188a) && C0677s.m1454c(this.f11189b, c1893f5.f11189b) && C0677s.m1454c(this.f11190c, c1893f5.f11190c) && C0677s.m1454c(this.f11191d, c1893f5.f11191d) && C0677s.m1454c(this.f11192e, c1893f5.f11192e) && C0677s.m1454c(this.f11193f, c1893f5.f11193f) && C0677s.m1454c(this.f11194g, c1893f5.f11194g) && C0677s.m1454c(this.f11195h, c1893f5.f11195h) && C0677s.m1454c(this.f11196i, c1893f5.f11196i) && C0677s.m1454c(this.f11197j, c1893f5.f11197j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0677s.f2210h;
        return Long.hashCode(this.f11197j) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(Long.hashCode(this.f11188a) * 31, 31, this.f11189b), 31, this.f11190c), 31, this.f11191d), 31, this.f11192e), 31, this.f11193f), 31, this.f11194g), 31, this.f11195h), 31, this.f11196i);
    }
}
