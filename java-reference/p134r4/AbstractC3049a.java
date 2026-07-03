package p134r4;

import p126q4.AbstractC2993h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r4.a */
/* loaded from: classes.dex */
public abstract class AbstractC3049a extends AbstractC2993h {

    /* renamed from: b */
    public final int[] f15624b;

    /* renamed from: e */
    public final int[] f15627e;

    /* renamed from: f */
    public final int[] f15628f;

    /* renamed from: a */
    public final int[] f15623a = new int[4];

    /* renamed from: c */
    public final float[] f15625c = new float[4];

    /* renamed from: d */
    public final float[] f15626d = new float[4];

    public AbstractC3049a() {
        int[] iArr = new int[8];
        this.f15624b = iArr;
        this.f15627e = new int[iArr.length / 2];
        this.f15628f = new int[iArr.length / 2];
    }

    /* renamed from: g */
    public static void m4725g(int[] iArr, float[] fArr) {
        int i7 = 0;
        float f7 = fArr[0];
        for (int i8 = 1; i8 < iArr.length; i8++) {
            float f8 = fArr[i8];
            if (f8 < f7) {
                i7 = i8;
                f7 = f8;
            }
        }
        iArr[i7] = iArr[i7] - 1;
    }

    /* renamed from: h */
    public static void m4726h(int[] iArr, float[] fArr) {
        int i7 = 0;
        float f7 = fArr[0];
        for (int i8 = 1; i8 < iArr.length; i8++) {
            float f8 = fArr[i8];
            if (f8 > f7) {
                i7 = i8;
                f7 = f8;
            }
        }
        iArr[i7] = iArr[i7] + 1;
    }

    /* renamed from: i */
    public static boolean m4727i(int[] iArr) {
        float f7 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f7 >= 0.7916667f && f7 <= 0.89285713f) {
            int i7 = Integer.MAX_VALUE;
            int i8 = Integer.MIN_VALUE;
            for (int i9 : iArr) {
                if (i9 > i8) {
                    i8 = i9;
                }
                if (i9 < i7) {
                    i7 = i9;
                }
            }
            if (i8 < i7 * 10) {
                return true;
            }
        }
        return false;
    }
}
