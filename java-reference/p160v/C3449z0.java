package p160v;

import p060h5.AbstractC1804l;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.z0 */
/* loaded from: classes.dex */
public final class C3449z0 {

    /* renamed from: a */
    public int f16662a;

    /* renamed from: b */
    public int f16663b;

    /* renamed from: c */
    public Object f16664c;

    /* renamed from: d */
    public Object f16665d;

    /* renamed from: e */
    public Object f16666e;

    /* renamed from: a */
    public int m5195a(long j6) {
        int i7 = this.f16662a + 1;
        long[] jArr = (long[]) this.f16664c;
        int length = jArr.length;
        if (i7 > length) {
            int i8 = length * 2;
            long[] jArr2 = new long[i8];
            int[] iArr = new int[i8];
            AbstractC1804l.m3016I(jArr, jArr2, 0, 0, jArr.length);
            AbstractC1804l.m3019L((int[]) this.f16665d, iArr, 0, 0, 14);
            this.f16664c = jArr2;
            this.f16665d = iArr;
        }
        int i9 = this.f16662a;
        this.f16662a = i9 + 1;
        int length2 = ((int[]) this.f16666e).length;
        if (this.f16663b >= length2) {
            int i10 = length2 * 2;
            int[] iArr2 = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr2[i11] = i12;
                i11 = i12;
            }
            AbstractC1804l.m3019L((int[]) this.f16666e, iArr2, 0, 0, 14);
            this.f16666e = iArr2;
        }
        int i13 = this.f16663b;
        int[] iArr3 = (int[]) this.f16666e;
        this.f16663b = iArr3[i13];
        long[] jArr3 = (long[]) this.f16664c;
        jArr3[i9] = j6;
        ((int[]) this.f16665d)[i9] = i13;
        iArr3[i13] = i9;
        while (i9 > 0) {
            int i14 = ((i9 + 1) >> 1) - 1;
            if (AbstractC3367j.m5102g(jArr3[i14], j6) <= 0) {
                break;
            }
            m5196b(i14, i9);
            i9 = i14;
        }
        return i13;
    }

    /* renamed from: b */
    public void m5196b(int i7, int i8) {
        long[] jArr = (long[]) this.f16664c;
        int[] iArr = (int[]) this.f16665d;
        int[] iArr2 = (int[]) this.f16666e;
        long j6 = jArr[i7];
        jArr[i7] = jArr[i8];
        jArr[i8] = j6;
        int i9 = iArr[i7];
        int i10 = iArr[i8];
        iArr[i7] = i10;
        iArr[i8] = i9;
        iArr2[i10] = i7;
        iArr2[i9] = i8;
    }
}
