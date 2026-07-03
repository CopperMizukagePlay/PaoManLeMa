package p124q1;

import p073j2.AbstractC2168e;
import p139s1.AbstractC3088a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q1.c */
/* loaded from: classes.dex */
public final class C2982c {

    /* renamed from: a */
    public final EnumC2981b f15406a;

    /* renamed from: b */
    public final int f15407b;

    /* renamed from: c */
    public final C2980a[] f15408c;

    /* renamed from: d */
    public int f15409d;

    /* renamed from: e */
    public final float[] f15410e;

    /* renamed from: f */
    public final float[] f15411f;

    /* renamed from: g */
    public final float[] f15412g;

    public C2982c() {
        int i7;
        EnumC2981b enumC2981b = EnumC2981b.f15404e;
        this.f15406a = enumC2981b;
        int ordinal = enumC2981b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i7 = 2;
            } else {
                throw new RuntimeException();
            }
        } else {
            i7 = 3;
        }
        this.f15407b = i7;
        this.f15408c = new C2980a[20];
        this.f15410e = new float[20];
        this.f15411f = new float[20];
        this.f15412g = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [q1.a, java.lang.Object] */
    /* renamed from: a */
    public final void m4639a(float f7, long j6) {
        int i7 = (this.f15409d + 1) % 20;
        this.f15409d = i7;
        C2980a[] c2980aArr = this.f15408c;
        C2980a c2980a = c2980aArr[i7];
        if (c2980a == 0) {
            ?? obj = new Object();
            obj.f15402a = j6;
            obj.f15403b = f7;
            c2980aArr[i7] = obj;
            return;
        }
        c2980a.f15402a = j6;
        c2980a.f15403b = f7;
    }

    /* renamed from: b */
    public final float m4640b(float f7) {
        float[] fArr;
        float[] fArr2;
        float f8;
        EnumC2981b enumC2981b;
        int i7;
        float f9;
        C2980a c2980a;
        float f10 = f7;
        float f11 = 0.0f;
        if (f10 <= 0.0f) {
            AbstractC3088a.m4750b("maximumVelocity should be a positive value. You specified=" + f10);
        }
        int i8 = this.f15409d;
        C2980a[] c2980aArr = this.f15408c;
        C2980a c2980a2 = c2980aArr[i8];
        if (c2980a2 == null) {
            f8 = 0.0f;
        } else {
            int i9 = 0;
            C2980a c2980a3 = c2980a2;
            while (true) {
                C2980a c2980a4 = c2980aArr[i8];
                EnumC2981b enumC2981b2 = this.f15406a;
                fArr = this.f15410e;
                fArr2 = this.f15411f;
                if (c2980a4 == null) {
                    f8 = f11;
                    enumC2981b = enumC2981b2;
                    i7 = 1;
                    break;
                }
                long j6 = c2980a2.f15402a;
                f8 = f11;
                int i10 = i8;
                long j7 = c2980a4.f15402a;
                float f12 = (float) (j6 - j7);
                i7 = 1;
                float abs = (float) Math.abs(j7 - c2980a3.f15402a);
                enumC2981b = enumC2981b2;
                if (enumC2981b != EnumC2981b.f15404e) {
                    c2980a = c2980a2;
                } else {
                    c2980a = c2980a4;
                }
                if (f12 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i9] = c2980a4.f15403b;
                fArr2[i9] = -f12;
                if (i10 == 0) {
                    i10 = 20;
                }
                int i11 = i10 - 1;
                i9++;
                if (i9 >= 20) {
                    break;
                }
                c2980a3 = c2980a;
                i8 = i11;
                f11 = f8;
            }
            if (i9 >= this.f15407b) {
                int ordinal = enumC2981b.ordinal();
                if (ordinal != 0) {
                    if (ordinal == i7) {
                        int i12 = i9 - i7;
                        float f13 = fArr2[i12];
                        int i13 = i12;
                        float f14 = f8;
                        while (i13 > 0) {
                            int i14 = i13 - 1;
                            float f15 = fArr2[i14];
                            if (f13 != f15) {
                                float f16 = (fArr[i13] - fArr[i14]) / (f13 - f15);
                                f14 += Math.abs(f16) * (f16 - (Math.signum(f14) * ((float) Math.sqrt(Math.abs(f14) * 2))));
                                if (i13 == i12) {
                                    f14 *= 0.5f;
                                }
                            }
                            i13--;
                            f13 = f15;
                        }
                        f9 = Math.signum(f14) * ((float) Math.sqrt(Math.abs(f14) * 2));
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    try {
                        float[] fArr3 = this.f15412g;
                        AbstractC2168e.m3509C(fArr2, fArr, i9, fArr3);
                        f9 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f9 = f8;
                    }
                }
                f11 = f9 * 1000;
            } else {
                f11 = f8;
            }
        }
        if (f11 == f8 || Float.isNaN(f11)) {
            return f8;
        }
        if (f11 > f8) {
            if (f11 <= f10) {
                f10 = f11;
            }
        } else {
            f10 = -f10;
            if (f11 >= f10) {
                return f11;
            }
        }
        return f10;
    }
}
