package p100n;

import java.util.Arrays;
import p006a7.C0129l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.s */
/* loaded from: classes.dex */
public final class C2680s {

    /* renamed from: s */
    public static float[] f14396s;

    /* renamed from: a */
    public final float f14397a;

    /* renamed from: b */
    public final float f14398b;

    /* renamed from: c */
    public final float f14399c;

    /* renamed from: d */
    public final float f14400d;

    /* renamed from: e */
    public final float f14401e;

    /* renamed from: f */
    public final float f14402f;

    /* renamed from: g */
    public final float f14403g;

    /* renamed from: h */
    public float f14404h;

    /* renamed from: i */
    public float f14405i;

    /* renamed from: j */
    public final float[] f14406j;

    /* renamed from: k */
    public final float f14407k;

    /* renamed from: l */
    public final float f14408l;

    /* renamed from: m */
    public final float f14409m;

    /* renamed from: n */
    public final float f14410n;

    /* renamed from: o */
    public final float f14411o;

    /* renamed from: p */
    public final float f14412p;

    /* renamed from: q */
    public final boolean f14413q;

    /* renamed from: r */
    public final boolean f14414r;

    public C2680s(int i7, float f7, float f8, float f9, float f10, float f11, float f12) {
        boolean z7;
        boolean z8;
        boolean z9;
        int i8;
        int i9;
        float f13;
        float f14;
        float f15;
        float f16 = f9;
        this.f14397a = f7;
        this.f14398b = f8;
        this.f14399c = f16;
        this.f14400d = f10;
        this.f14401e = f11;
        this.f14402f = f12;
        float f17 = f11 - f16;
        float f18 = f12 - f10;
        float f19 = 0.0f;
        boolean z10 = true;
        if (i7 != 1 && (i7 == 4 ? f18 <= 0.0f : i7 != 5 || f18 >= 0.0f)) {
            z7 = false;
        } else {
            z7 = true;
        }
        this.f14413q = z7;
        float f20 = f8 - f7;
        float f21 = 1 / f20;
        this.f14407k = f21;
        if (3 == i7) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8 && Math.abs(f17) >= 0.001f && Math.abs(f18) >= 0.001f) {
            float[] fArr = new float[101];
            this.f14406j = fArr;
            if (z7) {
                i8 = -1;
            } else {
                i8 = 1;
            }
            this.f14408l = i8 * f17;
            if (z7) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            this.f14409m = f18 * i9;
            this.f14410n = z7 ? f11 : f16;
            if (z7) {
                f13 = f10;
            } else {
                f13 = f12;
            }
            this.f14411o = f13;
            float f22 = f10 - f12;
            int length = C0129l.m274b().length;
            float f23 = 0.0f;
            float f24 = 0.0f;
            float f25 = 0.0f;
            int i10 = 0;
            while (i10 < length) {
                boolean z11 = z10;
                float f26 = f25;
                double radians = (float) Math.toRadians((i10 * 90.0d) / (C0129l.m274b().length - 1));
                float sin = ((float) Math.sin(radians)) * f17;
                float cos = ((float) Math.cos(radians)) * f22;
                if (i10 > 0) {
                    float f27 = f19;
                    double d7 = sin - f24;
                    float f28 = cos - f26;
                    f14 = f27;
                    f15 = sin;
                    f23 += (float) Math.hypot(d7, f28);
                    C0129l.m274b()[i10] = f23;
                } else {
                    f14 = f19;
                    f15 = sin;
                }
                i10++;
                f24 = f15;
                f19 = f14;
                f25 = cos;
                z10 = z11;
            }
            float f29 = f19;
            this.f14403g = f23;
            int length2 = C0129l.m274b().length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] m274b = C0129l.m274b();
                m274b[i11] = m274b[i11] / f23;
            }
            for (int i12 = 0; i12 < 101; i12++) {
                float f30 = i12 / 100;
                float[] m274b2 = C0129l.m274b();
                int binarySearch = Arrays.binarySearch(m274b2, 0, m274b2.length, f30);
                if (binarySearch >= 0) {
                    fArr[i12] = binarySearch / (C0129l.m274b().length - 1);
                } else if (binarySearch == -1) {
                    fArr[i12] = f29;
                } else {
                    int i13 = -binarySearch;
                    int i14 = i13 - 2;
                    fArr[i12] = (((f30 - C0129l.m274b()[i14]) / (C0129l.m274b()[i13 - 1] - C0129l.m274b()[i14])) + i14) / (C0129l.m274b().length - 1);
                }
            }
            this.f14412p = this.f14403g * this.f14407k;
            z9 = z8;
        } else {
            float hypot = (float) Math.hypot(f18, f17);
            this.f14403g = hypot;
            this.f14412p = hypot * f21;
            this.f14410n = f17 / f20;
            this.f14411o = f18 / f20;
            this.f14406j = new float[101];
            this.f14408l = Float.NaN;
            this.f14409m = Float.NaN;
            z9 = true;
        }
        this.f14414r = z9;
    }

    /* renamed from: a */
    public final float m4289a() {
        float f7 = this.f14408l * this.f14405i;
        float hypot = this.f14412p / ((float) Math.hypot(f7, (-this.f14409m) * this.f14404h));
        if (this.f14413q) {
            return (-f7) * hypot;
        }
        return f7 * hypot;
    }

    /* renamed from: b */
    public final float m4290b() {
        float f7 = this.f14408l * this.f14405i;
        float f8 = (-this.f14409m) * this.f14404h;
        float hypot = this.f14412p / ((float) Math.hypot(f7, f8));
        if (this.f14413q) {
            return (-f8) * hypot;
        }
        return f8 * hypot;
    }

    /* renamed from: c */
    public final void m4291c(float f7) {
        float f8;
        if (this.f14413q) {
            f8 = this.f14398b - f7;
        } else {
            f8 = f7 - this.f14397a;
        }
        float f9 = f8 * this.f14407k;
        float f10 = 0.0f;
        if (f9 > 0.0f) {
            f10 = 1.0f;
            if (f9 < 1.0f) {
                float[] fArr = this.f14406j;
                float length = f9 * (fArr.length - 1);
                int i7 = (int) length;
                float f11 = fArr[i7];
                f10 = ((fArr[i7 + 1] - f11) * (length - i7)) + f11;
            }
        }
        double d7 = f10 * 1.5707964f;
        this.f14404h = (float) Math.sin(d7);
        this.f14405i = (float) Math.cos(d7);
    }
}
