package p042f1;

import p035e1.AbstractC0659i0;
import p068i5.AbstractC2080d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f1.l */
/* loaded from: classes.dex */
public final class C1525l extends AbstractC1516c {

    /* renamed from: d */
    public static final float[] f10054d;

    /* renamed from: e */
    public static final float[] f10055e;

    /* renamed from: f */
    public static final float[] f10056f;

    /* renamed from: g */
    public static final float[] f10057g;

    static {
        float[] m2460g = AbstractC1523j.m2460g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC1523j.m2456c(C1514a.f10005b.f10006a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f10054d = m2460g;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f10055e = fArr;
        f10056f = AbstractC1523j.m2459f(m2460g);
        f10057g = AbstractC1523j.m2459f(fArr);
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: a */
    public final float mo2443a(int i7) {
        if (i7 == 0) {
            return 1.0f;
        }
        return 0.5f;
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: b */
    public final float mo2444b(int i7) {
        if (i7 == 0) {
            return 0.0f;
        }
        return -0.5f;
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: d */
    public final long mo2446d(float f7, float f8, float f9) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        float f10 = 0.5f;
        if (f8 > 0.5f) {
            f8 = 0.5f;
        }
        if (f9 < -0.5f) {
            f9 = -0.5f;
        }
        if (f9 <= 0.5f) {
            f10 = f9;
        }
        float[] fArr = f10057g;
        float f11 = (fArr[6] * f10) + (fArr[3] * f8) + (fArr[0] * f7);
        float f12 = (fArr[7] * f10) + (fArr[4] * f8) + (fArr[1] * f7);
        float f13 = (fArr[8] * f10) + (fArr[5] * f8) + (fArr[2] * f7);
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float[] fArr2 = f10056f;
        float f17 = (fArr2[6] * f16) + (fArr2[3] * f15) + (fArr2[0] * f14);
        float f18 = (fArr2[7] * f16) + (fArr2[4] * f15) + (fArr2[1] * f14);
        return (Float.floatToRawIntBits(f18) & 4294967295L) | (Float.floatToRawIntBits(f17) << 32);
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: e */
    public final float mo2447e(float f7, float f8, float f9) {
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 < -0.5f) {
            f8 = -0.5f;
        }
        float f10 = 0.5f;
        if (f8 > 0.5f) {
            f8 = 0.5f;
        }
        if (f9 < -0.5f) {
            f9 = -0.5f;
        }
        if (f9 <= 0.5f) {
            f10 = f9;
        }
        float[] fArr = f10057g;
        float f11 = (fArr[6] * f10) + (fArr[3] * f8) + (fArr[0] * f7);
        float f12 = (fArr[7] * f10) + (fArr[4] * f8) + (fArr[1] * f7);
        float f13 = (fArr[8] * f10) + (fArr[5] * f8) + (fArr[2] * f7);
        float f14 = f11 * f11 * f11;
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float[] fArr2 = f10056f;
        return (fArr2[8] * f16) + (fArr2[5] * f15) + (fArr2[2] * f14);
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: f */
    public final long mo2448f(float f7, float f8, float f9, float f10, AbstractC1516c abstractC1516c) {
        float[] fArr = f10054d;
        float f11 = (fArr[6] * f9) + (fArr[3] * f8) + (fArr[0] * f7);
        float f12 = (fArr[7] * f9) + (fArr[4] * f8) + (fArr[1] * f7);
        float f13 = (fArr[8] * f9) + (fArr[5] * f8) + (fArr[2] * f7);
        float m3400m = AbstractC2080d.m3400m(f11);
        float m3400m2 = AbstractC2080d.m3400m(f12);
        float m3400m3 = AbstractC2080d.m3400m(f13);
        float[] fArr2 = f10055e;
        return AbstractC0659i0.m1402b((fArr2[6] * m3400m3) + (fArr2[3] * m3400m2) + (fArr2[0] * m3400m), (fArr2[7] * m3400m3) + (fArr2[4] * m3400m2) + (fArr2[1] * m3400m), (fArr2[8] * m3400m3) + (fArr2[5] * m3400m2) + (fArr2[2] * m3400m), f10, abstractC1516c);
    }
}
