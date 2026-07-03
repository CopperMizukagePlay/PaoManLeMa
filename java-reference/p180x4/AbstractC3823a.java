package p180x4;

import java.util.Arrays;
import p022c4.C0406p;
import p067i4.C2069b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x4.a */
/* loaded from: classes.dex */
public abstract class AbstractC3823a {

    /* renamed from: a */
    public static final int[] f18030a = {0, 4, 1, 5};

    /* renamed from: b */
    public static final int[] f18031b = {6, 2, 7, 3};

    /* renamed from: c */
    public static final int[] f18032c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    public static final int[] f18033d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: e */
    public static final int[] f18034e = {0, 180, 270, 90};

    /* renamed from: a */
    public static int[] m5836a(C2069b c2069b, int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i10 = 0;
        while (c2069b.m3313b(i7, i8) && i7 > 0) {
            int i11 = i10 + 1;
            if (i10 >= 3) {
                break;
            }
            i7--;
            i10 = i11;
        }
        int length = iArr.length;
        int i12 = i7;
        int i13 = 0;
        boolean z7 = false;
        while (i7 < i9) {
            if (c2069b.m3313b(i7, i8) != z7) {
                iArr2[i13] = iArr2[i13] + 1;
            } else {
                if (i13 == length - 1) {
                    if (m5838c(iArr2, iArr) < 0.42f) {
                        return new int[]{i12, i7};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i14 = i13 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i13] = 0;
                    i13--;
                } else {
                    i13++;
                }
                iArr2[i13] = 1;
                z7 = !z7;
            }
            i7++;
        }
        if (i13 == length - 1 && m5838c(iArr2, iArr) < 0.42f) {
            return new int[]{i12, i7 - 1};
        }
        return null;
    }

    /* renamed from: b */
    public static C0406p[] m5837b(C2069b c2069b, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        int i12;
        boolean z7;
        int[] m5836a;
        C0406p[] c0406pArr = new C0406p[4];
        int[] iArr2 = iArr;
        int[] iArr3 = new int[iArr2.length];
        int i13 = i9;
        while (true) {
            if (i13 < i7) {
                int[] m5836a2 = m5836a(c2069b, i10, i13, i8, iArr2, iArr3);
                if (m5836a2 != null) {
                    int[] iArr4 = m5836a2;
                    while (true) {
                        i12 = i13;
                        if (i12 <= 0 || (m5836a = m5836a(c2069b, i10, i12 - 1, i8, iArr, iArr3)) == null) {
                            break;
                        }
                        iArr4 = m5836a;
                    }
                    float f7 = i12;
                    c0406pArr[0] = new C0406p(iArr4[0], f7);
                    c0406pArr[1] = new C0406p(iArr4[1], f7);
                    z7 = true;
                } else {
                    i13 += 5;
                    iArr2 = iArr;
                }
            } else {
                i12 = i13;
                z7 = false;
                break;
            }
        }
        int i14 = i12 + 1;
        if (z7) {
            int[] iArr5 = {(int) c0406pArr[0].f1390a, (int) c0406pArr[1].f1390a};
            int i15 = i14;
            int i16 = 0;
            while (i15 < i7) {
                int[] m5836a3 = m5836a(c2069b, iArr5[0], i15, i8, iArr, iArr3);
                if (m5836a3 != null && Math.abs(iArr5[0] - m5836a3[0]) < 5 && Math.abs(iArr5[1] - m5836a3[1]) < 5) {
                    iArr5 = m5836a3;
                    i16 = 0;
                } else {
                    if (i16 > 25) {
                        break;
                    }
                    i16++;
                }
                i15++;
            }
            i14 = i15 - (i16 + 1);
            float f8 = i14;
            c0406pArr[2] = new C0406p(iArr5[0], f8);
            c0406pArr[3] = new C0406p(iArr5[1], f8);
        }
        if (i14 - i12 < i11) {
            Arrays.fill(c0406pArr, (Object) null);
        }
        return c0406pArr;
    }

    /* renamed from: c */
    public static float m5838c(int[] iArr, int[] iArr2) {
        float f7;
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            i7 += iArr[i9];
            i8 += iArr2[i9];
        }
        if (i7 >= i8) {
            float f8 = i7;
            float f9 = f8 / i8;
            float f10 = 0.8f * f9;
            float f11 = 0.0f;
            for (int i10 = 0; i10 < length; i10++) {
                float f12 = iArr2[i10] * f9;
                float f13 = iArr[i10];
                if (f13 > f12) {
                    f7 = f13 - f12;
                } else {
                    f7 = f12 - f13;
                }
                if (f7 > f10) {
                    return Float.POSITIVE_INFINITY;
                }
                f11 += f7;
            }
            return f11 / f8;
        }
        return Float.POSITIVE_INFINITY;
    }
}
