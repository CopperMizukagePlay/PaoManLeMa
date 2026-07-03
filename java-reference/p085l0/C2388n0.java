package p085l0;

import java.util.Arrays;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.n0 */
/* loaded from: classes.dex */
public final class C2388n0 {

    /* renamed from: a */
    public int[] f13458a;

    /* renamed from: b */
    public int f13459b;

    public C2388n0() {
        this.f13458a = new int[10];
    }

    /* renamed from: a */
    public int m3821a(int i7) {
        int i8 = this.f13459b - 1;
        if (i8 >= 0) {
            return this.f13458a[i8];
        }
        return i7;
    }

    /* renamed from: b */
    public int m3822b() {
        int[] iArr = this.f13458a;
        int i7 = this.f13459b - 1;
        this.f13459b = i7;
        return iArr[i7];
    }

    /* renamed from: c */
    public void m3823c(int i7) {
        int[] iArr = this.f13458a;
        if (this.f13459b >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC3367j.m5099d(iArr, "copyOf(...)");
            this.f13458a = iArr;
        }
        int i8 = this.f13459b;
        this.f13459b = i8 + 1;
        iArr[i8] = i7;
    }

    /* renamed from: d */
    public void m3824d(int i7, int i8, int i9) {
        int i10 = this.f13459b;
        int[] iArr = this.f13458a;
        int i11 = i10 + 3;
        if (i11 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC3367j.m5099d(iArr, "copyOf(...)");
            this.f13458a = iArr;
        }
        iArr[i10] = i7 + i9;
        iArr[i10 + 1] = i8 + i9;
        iArr[i10 + 2] = i9;
        this.f13459b = i11;
    }

    /* renamed from: e */
    public void m3825e(int i7, int i8, int i9, int i10) {
        int i11 = this.f13459b;
        int[] iArr = this.f13458a;
        int i12 = i11 + 4;
        if (i12 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            AbstractC3367j.m5099d(iArr, "copyOf(...)");
            this.f13458a = iArr;
        }
        iArr[i11] = i7;
        iArr[i11 + 1] = i8;
        iArr[i11 + 2] = i9;
        iArr[i11 + 3] = i10;
        this.f13459b = i12;
    }

    /* renamed from: f */
    public void m3826f(int i7, int i8) {
        if (i7 < i8) {
            int i9 = i7 - 3;
            for (int i10 = i7; i10 < i8; i10 += 3) {
                int[] iArr = this.f13458a;
                int i11 = iArr[i10];
                int i12 = iArr[i8];
                if (i11 < i12 || (i11 == i12 && iArr[i10 + 1] <= iArr[i8 + 1])) {
                    i9 += 3;
                    m3827g(i9, i10);
                }
            }
            m3827g(i9 + 3, i8);
            m3826f(i7, i9);
            m3826f(i9 + 6, i8);
        }
    }

    /* renamed from: g */
    public void m3827g(int i7, int i8) {
        int[] iArr = this.f13458a;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
        int i10 = i7 + 1;
        int i11 = i8 + 1;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i7 + 2;
        int i14 = i8 + 2;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
    }

    public C2388n0(int i7) {
        this.f13458a = new int[i7];
    }
}
