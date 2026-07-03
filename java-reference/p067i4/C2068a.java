package p067i4;

import java.util.Arrays;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i4.a */
/* loaded from: classes.dex */
public final class C2068a implements Cloneable {

    /* renamed from: g */
    public static final int[] f12255g = new int[0];

    /* renamed from: e */
    public int[] f12256e;

    /* renamed from: f */
    public int f12257f;

    public C2068a() {
        this.f12257f = 0;
        this.f12256e = f12255g;
    }

    /* renamed from: a */
    public final void m3302a(boolean z7) {
        m3304c(this.f12257f + 1);
        if (z7) {
            int[] iArr = this.f12256e;
            int i7 = this.f12257f;
            int i8 = i7 / 32;
            iArr[i8] = (1 << (i7 & 31)) | iArr[i8];
        }
        this.f12257f++;
    }

    /* renamed from: b */
    public final void m3303b(int i7, int i8) {
        if (i8 >= 0 && i8 <= 32) {
            int i9 = this.f12257f;
            m3304c(i9 + i8);
            for (int i10 = i8 - 1; i10 >= 0; i10--) {
                if (((1 << i10) & i7) != 0) {
                    int[] iArr = this.f12256e;
                    int i11 = i9 / 32;
                    iArr[i11] = iArr[i11] | (1 << (i9 & 31));
                }
                i9++;
            }
            this.f12257f = i9;
            return;
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    /* renamed from: c */
    public final void m3304c(int i7) {
        if (i7 > this.f12256e.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i7 / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f12256e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f12256e = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i4.a] */
    public final Object clone() {
        int[] iArr = (int[]) this.f12256e.clone();
        int i7 = this.f12257f;
        ?? obj = new Object();
        obj.f12256e = iArr;
        obj.f12257f = i7;
        return obj;
    }

    /* renamed from: d */
    public final boolean m3305d(int i7) {
        if (((1 << (i7 & 31)) & this.f12256e[i7 / 32]) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int m3306e(int i7) {
        int i8 = this.f12257f;
        if (i7 >= i8) {
            return i8;
        }
        int i9 = i7 / 32;
        int i10 = (-(1 << (i7 & 31))) & this.f12256e[i9];
        while (i10 == 0) {
            i9++;
            int[] iArr = this.f12256e;
            if (i9 == iArr.length) {
                return this.f12257f;
            }
            i10 = iArr[i9];
        }
        return Math.min(Integer.numberOfTrailingZeros(i10) + (i9 * 32), this.f12257f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2068a)) {
            return false;
        }
        C2068a c2068a = (C2068a) obj;
        if (this.f12257f != c2068a.f12257f || !Arrays.equals(this.f12256e, c2068a.f12256e)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int m3307f(int i7) {
        int i8 = this.f12257f;
        if (i7 >= i8) {
            return i8;
        }
        int i9 = i7 / 32;
        int i10 = (-(1 << (i7 & 31))) & (~this.f12256e[i9]);
        while (i10 == 0) {
            i9++;
            int[] iArr = this.f12256e;
            if (i9 == iArr.length) {
                return this.f12257f;
            }
            i10 = ~iArr[i9];
        }
        return Math.min(Integer.numberOfTrailingZeros(i10) + (i9 * 32), this.f12257f);
    }

    /* renamed from: g */
    public final int m3308g() {
        return (this.f12257f + 7) / 8;
    }

    /* renamed from: h */
    public final boolean m3309h(int i7, int i8) {
        int i9;
        if (i8 >= i7 && i7 >= 0 && i8 <= this.f12257f) {
            if (i8 != i7) {
                int i10 = i8 - 1;
                int i11 = i7 / 32;
                int i12 = i10 / 32;
                for (int i13 = i11; i13 <= i12; i13++) {
                    int i14 = 31;
                    if (i13 > i11) {
                        i9 = 0;
                    } else {
                        i9 = i7 & 31;
                    }
                    if (i13 >= i12) {
                        i14 = 31 & i10;
                    }
                    if ((((2 << i14) - (1 << i9)) & this.f12256e[i13]) != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12256e) + (this.f12257f * 31);
    }

    /* renamed from: i */
    public final void m3310i() {
        int[] iArr = new int[this.f12256e.length];
        int i7 = (this.f12257f - 1) / 32;
        int i8 = i7 + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i7 - i9] = Integer.reverse(this.f12256e[i9]);
        }
        int i10 = this.f12257f;
        int i11 = i8 * 32;
        if (i10 != i11) {
            int i12 = i11 - i10;
            int i13 = iArr[0] >>> i12;
            for (int i14 = 1; i14 < i8; i14++) {
                int i15 = iArr[i14];
                iArr[i14 - 1] = i13 | (i15 << (32 - i12));
                i13 = i15 >>> i12;
            }
            iArr[i7] = i13;
        }
        this.f12256e = iArr;
    }

    /* renamed from: j */
    public final void m3311j(int i7) {
        int[] iArr = this.f12256e;
        int i8 = i7 / 32;
        iArr[i8] = (1 << (i7 & 31)) | iArr[i8];
    }

    public final String toString() {
        char c7;
        int i7 = this.f12257f;
        StringBuilder sb = new StringBuilder((i7 / 8) + i7 + 1);
        for (int i8 = 0; i8 < this.f12257f; i8++) {
            if ((i8 & 7) == 0) {
                sb.append(' ');
            }
            if (m3305d(i8)) {
                c7 = 'X';
            } else {
                c7 = '.';
            }
            sb.append(c7);
        }
        return sb.toString();
    }

    public C2068a(int i7) {
        this.f12257f = i7;
        this.f12256e = new int[(i7 + 31) / 32];
    }
}
