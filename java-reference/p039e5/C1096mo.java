package p039e5;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.mo */
/* loaded from: classes.dex */
public final class C1096mo {

    /* renamed from: a */
    public final double f5972a;

    /* renamed from: b */
    public final double f5973b;

    /* renamed from: c */
    public final double f5974c;

    public C1096mo(double d7, double d8, double d9) {
        this.f5972a = d7;
        this.f5973b = d8;
        this.f5974c = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1096mo)) {
            return false;
        }
        C1096mo c1096mo = (C1096mo) obj;
        if (Double.compare(this.f5972a, c1096mo.f5972a) == 0 && Double.compare(this.f5973b, c1096mo.f5973b) == 0 && Double.compare(this.f5974c, c1096mo.f5974c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f5974c) + AbstractC0094y0.m174a(this.f5973b, Double.hashCode(this.f5972a) * 31, 31);
    }

    public final String toString() {
        return "SpeedLimitConfig(downloadMbps=" + this.f5972a + ", uploadMbps=" + this.f5973b + ", totalMbps=" + this.f5974c + ")";
    }

    public /* synthetic */ C1096mo(double d7, double d8, double d9, int i7) {
        this((i7 & 1) != 0 ? 0.0d : d7, (i7 & 2) != 0 ? 0.0d : d8, (i7 & 4) != 0 ? 0.0d : d9);
    }
}
