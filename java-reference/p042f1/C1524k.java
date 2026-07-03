package p042f1;

import p035e1.AbstractC0659i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f1.k */
/* loaded from: classes.dex */
public final class C1524k extends AbstractC1516c {

    /* renamed from: d */
    public final /* synthetic */ int f10053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1524k(int i7, int i8, long j6, String str) {
        super(str, j6, i7);
        this.f10053d = i8;
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: a */
    public final float mo2443a(int i7) {
        switch (this.f10053d) {
            case 0:
                if (i7 == 0) {
                    return 100.0f;
                }
                return 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: b */
    public final float mo2444b(int i7) {
        switch (this.f10053d) {
            case 0:
                if (i7 == 0) {
                    return 0.0f;
                }
                return -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: d */
    public final long mo2446d(float f7, float f8, float f9) {
        float f10;
        float f11;
        switch (this.f10053d) {
            case 0:
                if (f7 < 0.0f) {
                    f7 = 0.0f;
                }
                if (f7 > 100.0f) {
                    f7 = 100.0f;
                }
                if (f8 < -128.0f) {
                    f8 = -128.0f;
                }
                if (f8 > 128.0f) {
                    f8 = 128.0f;
                }
                float f12 = (f7 + 16.0f) / 116.0f;
                float f13 = (f8 * 0.002f) + f12;
                if (f13 > 0.20689656f) {
                    f10 = f13 * f13 * f13;
                } else {
                    f10 = (f13 - 0.13793103f) * 0.12841855f;
                }
                if (f12 > 0.20689656f) {
                    f11 = f12 * f12 * f12;
                } else {
                    f11 = (f12 - 0.13793103f) * 0.12841855f;
                }
                float[] fArr = AbstractC1523j.f10052e;
                float f14 = f10 * fArr[0];
                float f15 = f11 * fArr[1];
                return (Float.floatToRawIntBits(f15) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
            default:
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                float f16 = 2.0f;
                if (f7 > 2.0f) {
                    f7 = 2.0f;
                }
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                if (f8 <= 2.0f) {
                    f16 = f8;
                }
                return (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(f16) & 4294967295L);
        }
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: e */
    public final float mo2447e(float f7, float f8, float f9) {
        float f10;
        switch (this.f10053d) {
            case 0:
                if (f7 < 0.0f) {
                    f7 = 0.0f;
                }
                if (f7 > 100.0f) {
                    f7 = 100.0f;
                }
                if (f9 < -128.0f) {
                    f9 = -128.0f;
                }
                if (f9 > 128.0f) {
                    f9 = 128.0f;
                }
                float f11 = ((f7 + 16.0f) / 116.0f) - (f9 * 0.005f);
                if (f11 > 0.20689656f) {
                    f10 = f11 * f11 * f11;
                } else {
                    f10 = 0.12841855f * (f11 - 0.13793103f);
                }
                return f10 * AbstractC1523j.f10052e[2];
            default:
                if (f9 < -2.0f) {
                    f9 = -2.0f;
                }
                if (f9 > 2.0f) {
                    return 2.0f;
                }
                return f9;
        }
    }

    @Override // p042f1.AbstractC1516c
    /* renamed from: f */
    public final long mo2448f(float f7, float f8, float f9, float f10, AbstractC1516c abstractC1516c) {
        float f11;
        float f12;
        float f13;
        switch (this.f10053d) {
            case 0:
                float[] fArr = AbstractC1523j.f10052e;
                float f14 = f7 / fArr[0];
                float f15 = f8 / fArr[1];
                float f16 = f9 / fArr[2];
                if (f14 > 0.008856452f) {
                    f11 = (float) Math.cbrt(f14);
                } else {
                    f11 = (f14 * 7.787037f) + 0.13793103f;
                }
                if (f15 > 0.008856452f) {
                    f12 = (float) Math.cbrt(f15);
                } else {
                    f12 = (f15 * 7.787037f) + 0.13793103f;
                }
                if (f16 > 0.008856452f) {
                    f13 = (float) Math.cbrt(f16);
                } else {
                    f13 = (f16 * 7.787037f) + 0.13793103f;
                }
                float f17 = (116.0f * f12) - 16.0f;
                float f18 = (f11 - f12) * 500.0f;
                float f19 = (f12 - f13) * 200.0f;
                if (f17 < 0.0f) {
                    f17 = 0.0f;
                }
                if (f17 > 100.0f) {
                    f17 = 100.0f;
                }
                if (f18 < -128.0f) {
                    f18 = -128.0f;
                }
                float f20 = 128.0f;
                if (f18 > 128.0f) {
                    f18 = 128.0f;
                }
                if (f19 < -128.0f) {
                    f19 = -128.0f;
                }
                if (f19 <= 128.0f) {
                    f20 = f19;
                }
                return AbstractC0659i0.m1402b(f17, f18, f20, f10, abstractC1516c);
            default:
                if (f7 < -2.0f) {
                    f7 = -2.0f;
                }
                float f21 = 2.0f;
                if (f7 > 2.0f) {
                    f7 = 2.0f;
                }
                if (f8 < -2.0f) {
                    f8 = -2.0f;
                }
                if (f8 > 2.0f) {
                    f8 = 2.0f;
                }
                if (f9 < -2.0f) {
                    f9 = -2.0f;
                }
                if (f9 <= 2.0f) {
                    f21 = f9;
                }
                return AbstractC0659i0.m1402b(f7, f8, f21, f10, abstractC1516c);
        }
    }
}
