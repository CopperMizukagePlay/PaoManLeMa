package p042f1;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f1.r */
/* loaded from: classes.dex */
public final class C1531r {

    /* renamed from: a */
    public final double f10081a;

    /* renamed from: b */
    public final double f10082b;

    /* renamed from: c */
    public final double f10083c;

    /* renamed from: d */
    public final double f10084d;

    /* renamed from: e */
    public final double f10085e;

    /* renamed from: f */
    public final double f10086f;

    /* renamed from: g */
    public final double f10087g;

    public /* synthetic */ C1531r(double d7, double d8, double d9, double d10, double d11) {
        this(d7, d8, d9, d10, d11, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1531r)) {
            return false;
        }
        C1531r c1531r = (C1531r) obj;
        if (Double.compare(this.f10081a, c1531r.f10081a) == 0 && Double.compare(this.f10082b, c1531r.f10082b) == 0 && Double.compare(this.f10083c, c1531r.f10083c) == 0 && Double.compare(this.f10084d, c1531r.f10084d) == 0 && Double.compare(this.f10085e, c1531r.f10085e) == 0 && Double.compare(this.f10086f, c1531r.f10086f) == 0 && Double.compare(this.f10087g, c1531r.f10087g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f10087g) + AbstractC0094y0.m174a(this.f10086f, AbstractC0094y0.m174a(this.f10085e, AbstractC0094y0.m174a(this.f10084d, AbstractC0094y0.m174a(this.f10083c, AbstractC0094y0.m174a(this.f10082b, Double.hashCode(this.f10081a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f10081a + ", a=" + this.f10082b + ", b=" + this.f10083c + ", c=" + this.f10084d + ", d=" + this.f10085e + ", e=" + this.f10086f + ", f=" + this.f10087g + ')';
    }

    public C1531r(double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        this.f10081a = d7;
        this.f10082b = d8;
        this.f10083c = d9;
        this.f10084d = d10;
        this.f10085e = d11;
        this.f10086f = d12;
        this.f10087g = d13;
        if (Double.isNaN(d8) || Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d7)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d7 == -2.0d || d7 == -3.0d) {
            return;
        }
        if (d11 < 0.0d || d11 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d11);
        }
        if (d11 == 0.0d && (d8 == 0.0d || d7 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d11 >= 1.0d && d10 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d8 == 0.0d || d7 == 0.0d) && d10 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d8 < 0.0d || d7 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
