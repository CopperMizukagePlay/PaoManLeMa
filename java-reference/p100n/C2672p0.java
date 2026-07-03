package p100n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.p0 */
/* loaded from: classes.dex */
public final class C2672p0 {

    /* renamed from: a */
    public float f14382a;

    /* renamed from: b */
    public double f14383b;

    /* renamed from: c */
    public boolean f14384c;

    /* renamed from: d */
    public double f14385d;

    /* renamed from: e */
    public double f14386e;

    /* renamed from: f */
    public double f14387f;

    /* renamed from: g */
    public float f14388g;

    /* renamed from: a */
    public final long m4275a(float f7, float f8, long j6) {
        double cos;
        double d7;
        if (!this.f14384c) {
            if (this.f14382a != Float.MAX_VALUE) {
                float f9 = this.f14388g;
                double d8 = f9;
                double d9 = d8 * d8;
                if (f9 > 1.0f) {
                    double d10 = this.f14383b;
                    double d11 = d9 - 1;
                    this.f14385d = (Math.sqrt(d11) * d10) + ((-f9) * d10);
                    double d12 = -this.f14388g;
                    double d13 = this.f14383b;
                    this.f14386e = (d12 * d13) - (Math.sqrt(d11) * d13);
                } else if (f9 >= 0.0f && f9 < 1.0f) {
                    this.f14387f = Math.sqrt(1 - d9) * this.f14383b;
                }
                this.f14384c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        float f10 = f7 - this.f14382a;
        double d14 = j6 / 1000.0d;
        float f11 = this.f14388g;
        if (f11 > 1.0f) {
            double d15 = f10;
            double d16 = this.f14386e;
            double d17 = ((d16 * d15) - f8) / (d16 - this.f14385d);
            double d18 = d15 - d17;
            d7 = (Math.exp(this.f14385d * d14) * d17) + (Math.exp(d16 * d14) * d18);
            double d19 = this.f14386e;
            double exp = Math.exp(d19 * d14) * d18 * d19;
            double d20 = this.f14385d;
            cos = (Math.exp(d20 * d14) * d17 * d20) + exp;
        } else if (f11 == 1.0f) {
            double d21 = this.f14383b;
            double d22 = f10;
            double d23 = (d21 * d22) + f8;
            double d24 = (d23 * d14) + d22;
            d7 = Math.exp((-d21) * d14) * d24;
            double exp2 = Math.exp((-this.f14383b) * d14) * d24;
            double d25 = -this.f14383b;
            cos = (exp2 * d25) + (Math.exp(d25 * d14) * d23);
        } else {
            double d26 = 1 / this.f14387f;
            double d27 = this.f14383b;
            double d28 = f10;
            double d29 = ((f11 * d27 * d28) + f8) * d26;
            double exp3 = Math.exp((-f11) * d27 * d14) * ((Math.sin(this.f14387f * d14) * d29) + (Math.cos(this.f14387f * d14) * d28));
            double d30 = this.f14383b;
            double d31 = (-d30) * exp3 * this.f14388g;
            double exp4 = Math.exp((-r7) * d30 * d14);
            double d32 = this.f14387f;
            double sin = Math.sin(d32 * d14) * (-d32) * d28;
            double d33 = this.f14387f;
            cos = (((Math.cos(d33 * d14) * d29 * d33) + sin) * exp4) + d31;
            d7 = exp3;
        }
        return (Float.floatToRawIntBits((float) (d7 + this.f14382a)) << 32) | (Float.floatToRawIntBits((float) cos) & 4294967295L);
    }
}
