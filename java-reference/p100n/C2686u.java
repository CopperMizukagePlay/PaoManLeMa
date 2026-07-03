package p100n;

import p001a0.AbstractC0094y0;
import p035e1.AbstractC0659i0;
import p068i5.AbstractC2080d;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.u */
/* loaded from: classes.dex */
public final class C2686u implements InterfaceC2697y {

    /* renamed from: a */
    public final float f14426a;

    /* renamed from: b */
    public final float f14427b;

    /* renamed from: c */
    public final float f14428c;

    /* renamed from: d */
    public final float f14429d;

    /* renamed from: e */
    public final float f14430e;

    /* renamed from: f */
    public final float f14431f;

    public C2686u(float f7, float f8, float f9, float f10) {
        boolean z7;
        int i7;
        this.f14426a = f7;
        this.f14427b = f8;
        this.f14428c = f9;
        this.f14429d = f10;
        if (!Float.isNaN(f7) && !Float.isNaN(f8) && !Float.isNaN(f9) && !Float.isNaN(f10)) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2666n0.m4272a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f7 + ", " + f8 + ", " + f9 + ", " + f10 + '.');
        }
        float[] fArr = new float[5];
        float f11 = (f8 - 0.0f) * 3.0f;
        float f12 = (f10 - f8) * 3.0f;
        float f13 = (1.0f - f10) * 3.0f;
        double d7 = f11;
        double d8 = f12;
        double d9 = f13;
        double d10 = d8 * 2.0d;
        double d11 = (d7 - d10) + d9;
        if (d11 == 0.0d) {
            if (d8 == d9) {
                i7 = 0;
            } else {
                i7 = AbstractC0659i0.m1400G((float) ((d10 - d9) / (d10 - (d9 * 2.0d))), fArr, 0);
            }
        } else {
            double d12 = -Math.sqrt((d8 * d8) - (d9 * d7));
            double d13 = (-d7) + d8;
            int m1400G = AbstractC0659i0.m1400G((float) ((-(d12 + d13)) / d11), fArr, 0);
            int m1400G2 = AbstractC0659i0.m1400G((float) ((d12 - d13) / d11), fArr, m1400G) + m1400G;
            if (m1400G2 > 1) {
                float f14 = fArr[0];
                float f15 = fArr[1];
                if (f14 > f15) {
                    fArr[0] = f15;
                    fArr[1] = f14;
                } else if (f14 == f15) {
                    i7 = m1400G2 - 1;
                }
            }
            i7 = m1400G2;
        }
        float f16 = (f12 - f11) * 2.0f;
        int m1400G3 = AbstractC0659i0.m1400G((-f16) / (((f13 - f12) * 2.0f) - f16), fArr, i7) + i7;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i8 = 0; i8 < m1400G3; i8++) {
            float f17 = fArr[i8];
            float f18 = (((((((((f8 - f10) * 3.0f) + 1.0f) - 0.0f) * f17) + (((f10 - (f8 * 2.0f)) + 0.0f) * 3.0f)) * f17) + f11) * f17) + 0.0f;
            min = Math.min(min, f18);
            max = Math.max(max, f18);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f14430e = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f14431f = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0200, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0230, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b5, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x025b  */
    @Override // p100n.InterfaceC2697y
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float mo1295a(float f7) {
        float f8;
        float f9;
        float f10;
        boolean isNaN;
        float f11;
        if (f7 <= 0.0f || f7 >= 1.0f) {
            return f7;
        }
        float f12 = this.f14426a;
        float f13 = this.f14428c;
        float f14 = f13 - f7;
        double d7 = 0.0f - f7;
        float f15 = 0.0f;
        double d8 = ((d7 - ((f12 - f7) * 2.0d)) + f14) * 3.0d;
        double d9 = (r6 - r4) * 3.0d;
        double d10 = ((r6 - f14) * 3.0d) + (-r4) + (1.0f - f7);
        float f16 = Float.NaN;
        if (Math.abs(d10 - 0.0d) < 1.0E-7d) {
            if (Math.abs(d8 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d9 - 0.0d) >= 1.0E-7d) {
                    float f17 = (float) ((-d7) / d9);
                    if (f17 >= 0.0f) {
                        f15 = f17;
                    }
                    if (f15 > 1.0f) {
                        f8 = 1.0f;
                    } else {
                        f8 = f15;
                    }
                }
                isNaN = Float.isNaN(f16);
                float f18 = this.f14429d;
                float f19 = this.f14427b;
                if (isNaN) {
                    float f20 = ((((((f19 - f18) + 0.33333334f) * f16) + (f18 - (2.0f * f19))) * f16) + f19) * 3.0f * f16;
                    float f21 = this.f14430e;
                    if (f20 < f21) {
                        f20 = f21;
                    }
                    float f22 = this.f14431f;
                    if (f20 > f22) {
                        return f22;
                    }
                    return f20;
                }
                throw new IllegalArgumentException("The cubic curve with parameters (" + f12 + ", " + f19 + ", " + f13 + ", " + f18 + ") has no solution at " + f7);
            }
            double sqrt = Math.sqrt((d9 * d9) - ((4.0d * d8) * d7));
            double d11 = d8 * 2.0d;
            float f23 = (float) ((sqrt - d9) / d11);
            if (f23 < 0.0f) {
                f11 = 0.0f;
            } else {
                f11 = f23;
            }
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            if (Math.abs(f11 - f23) > 1.05E-6f) {
                f11 = Float.NaN;
            }
            if (!Float.isNaN(f11)) {
                f16 = f11;
            } else {
                float f24 = (float) (((-d9) - sqrt) / d11);
                if (f24 >= 0.0f) {
                    f15 = f24;
                }
                if (f15 > 1.0f) {
                    f8 = 1.0f;
                } else {
                    f8 = f15;
                }
            }
            isNaN = Float.isNaN(f16);
            float f182 = this.f14429d;
            float f192 = this.f14427b;
            if (isNaN) {
            }
        } else {
            double d12 = d8 / d10;
            double d13 = d9 / d10;
            double d14 = d7 / d10;
            double d15 = ((d13 * 3.0d) - (d12 * d12)) / 9.0d;
            double d16 = ((d14 * 27.0d) + ((((2.0d * d12) * d12) * d12) - ((9.0d * d12) * d13))) / 54.0d;
            double d17 = d15 * d15 * d15;
            double d18 = (d16 * d16) + d17;
            double d19 = d12 / 3.0d;
            if (d18 < 0.0d) {
                double sqrt2 = Math.sqrt(-d17);
                double d20 = (-d16) / sqrt2;
                if (d20 < -1.0d) {
                    d20 = -1.0d;
                }
                if (d20 > 1.0d) {
                    d20 = 1.0d;
                }
                double acos = Math.acos(d20);
                double m3400m = AbstractC2080d.m3400m((float) sqrt2) * 2.0f;
                float cos = (float) ((Math.cos(acos / 3.0d) * m3400m) - d19);
                if (cos < 0.0f) {
                    f10 = 0.0f;
                } else {
                    f10 = cos;
                }
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                if (Math.abs(f10 - cos) > 1.05E-6f) {
                    f10 = Float.NaN;
                }
                if (Float.isNaN(f10)) {
                    float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * m3400m) - d19);
                    if (cos2 < 0.0f) {
                        f10 = 0.0f;
                    } else {
                        f10 = cos2;
                    }
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    if (Math.abs(f10 - cos2) > 1.05E-6f) {
                        f10 = Float.NaN;
                    }
                    if (Float.isNaN(f10)) {
                        float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * m3400m) - d19);
                        if (cos3 >= 0.0f) {
                            f15 = cos3;
                        }
                        if (f15 > 1.0f) {
                            f8 = 1.0f;
                        } else {
                            f8 = f15;
                        }
                    }
                }
                f16 = f10;
                isNaN = Float.isNaN(f16);
                float f1822 = this.f14429d;
                float f1922 = this.f14427b;
                if (isNaN) {
                }
            } else if (d18 == 0.0d) {
                float f25 = -AbstractC2080d.m3400m((float) d16);
                float f26 = (float) d19;
                float f27 = (f25 * 2.0f) - f26;
                if (f27 < 0.0f) {
                    f9 = 0.0f;
                } else {
                    f9 = f27;
                }
                if (f9 > 1.0f) {
                    f9 = 1.0f;
                }
                if (Math.abs(f9 - f27) > 1.05E-6f) {
                    f9 = Float.NaN;
                }
                if (!Float.isNaN(f9)) {
                    f16 = f9;
                } else {
                    float f28 = (-f25) - f26;
                    if (f28 >= 0.0f) {
                        f15 = f28;
                    }
                    if (f15 > 1.0f) {
                        f8 = 1.0f;
                    } else {
                        f8 = f15;
                    }
                }
                isNaN = Float.isNaN(f16);
                float f18222 = this.f14429d;
                float f19222 = this.f14427b;
                if (isNaN) {
                }
            } else {
                double sqrt3 = Math.sqrt(d18);
                float m3400m2 = (float) ((AbstractC2080d.m3400m((float) ((-d16) + sqrt3)) - AbstractC2080d.m3400m((float) (d16 + sqrt3))) - d19);
                if (m3400m2 >= 0.0f) {
                    f15 = m3400m2;
                }
                if (f15 > 1.0f) {
                    f8 = 1.0f;
                } else {
                    f8 = f15;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2686u) {
            C2686u c2686u = (C2686u) obj;
            if (this.f14426a == c2686u.f14426a && this.f14427b == c2686u.f14427b && this.f14428c == c2686u.f14428c && this.f14429d == c2686u.f14429d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14429d) + AbstractC2487d.m4038b(this.f14428c, AbstractC2487d.m4038b(this.f14427b, Float.hashCode(this.f14426a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f14426a);
        sb.append(", b=");
        sb.append(this.f14427b);
        sb.append(", c=");
        sb.append(this.f14428c);
        sb.append(", d=");
        return AbstractC0094y0.m186m(sb, this.f14429d, ')');
    }
}
