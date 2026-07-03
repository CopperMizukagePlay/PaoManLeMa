package p067i4;

import java.util.Arrays;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i4.b */
/* loaded from: classes.dex */
public final class C2069b implements Cloneable {

    /* renamed from: e */
    public int f12258e;

    /* renamed from: f */
    public int f12259f;

    /* renamed from: g */
    public int f12260g;

    /* renamed from: h */
    public int[] f12261h;

    public C2069b(int i7, int i8) {
        if (i7 >= 1 && i8 >= 1) {
            this.f12258e = i7;
            this.f12259f = i8;
            int i9 = (i7 + 31) / 32;
            this.f12260g = i9;
            this.f12261h = new int[i9 * i8];
            return;
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    /* renamed from: a */
    public final void m3312a(int i7, int i8) {
        int i9 = (i7 / 32) + (i8 * this.f12260g);
        int[] iArr = this.f12261h;
        iArr[i9] = (1 << (i7 & 31)) ^ iArr[i9];
    }

    /* renamed from: b */
    public final boolean m3313b(int i7, int i8) {
        if (((this.f12261h[(i7 / 32) + (i8 * this.f12260g)] >>> (i7 & 31)) & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int[] m3314c() {
        int length = this.f12261h.length - 1;
        while (length >= 0 && this.f12261h[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i7 = this.f12260g;
        int i8 = length / i7;
        int i9 = (length % i7) * 32;
        int i10 = 31;
        while ((this.f12261h[length] >>> i10) == 0) {
            i10--;
        }
        return new int[]{i9 + i10, i8};
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i4.b] */
    public final Object clone() {
        int i7 = this.f12258e;
        int i8 = this.f12259f;
        int i9 = this.f12260g;
        int[] iArr = (int[]) this.f12261h.clone();
        ?? obj = new Object();
        obj.f12258e = i7;
        obj.f12259f = i8;
        obj.f12260g = i9;
        obj.f12261h = iArr;
        return obj;
    }

    /* renamed from: d */
    public final C2068a m3315d(C2068a c2068a, int i7) {
        int i8 = c2068a.f12257f;
        int i9 = this.f12258e;
        if (i8 < i9) {
            c2068a = new C2068a(i9);
        } else {
            int length = c2068a.f12256e.length;
            for (int i10 = 0; i10 < length; i10++) {
                c2068a.f12256e[i10] = 0;
            }
        }
        int i11 = i7 * this.f12260g;
        for (int i12 = 0; i12 < this.f12260g; i12++) {
            c2068a.f12256e[(i12 * 32) / 32] = this.f12261h[i11 + i12];
        }
        return c2068a;
    }

    /* renamed from: e */
    public final int[] m3316e() {
        int[] iArr;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            iArr = this.f12261h;
            if (i8 >= iArr.length || iArr[i8] != 0) {
                break;
            }
            i8++;
        }
        if (i8 == iArr.length) {
            return null;
        }
        int i9 = this.f12260g;
        int i10 = i8 / i9;
        int i11 = (i8 % i9) * 32;
        while ((iArr[i8] << (31 - i7)) == 0) {
            i7++;
        }
        return new int[]{i11 + i7, i10};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2069b)) {
            return false;
        }
        C2069b c2069b = (C2069b) obj;
        if (this.f12258e != c2069b.f12258e || this.f12259f != c2069b.f12259f || this.f12260g != c2069b.f12260g || !Arrays.equals(this.f12261h, c2069b.f12261h)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void m3317f() {
        C2068a c2068a = new C2068a(this.f12258e);
        C2068a c2068a2 = new C2068a(this.f12258e);
        int i7 = (this.f12259f + 1) / 2;
        for (int i8 = 0; i8 < i7; i8++) {
            c2068a = m3315d(c2068a, i8);
            int i9 = (this.f12259f - 1) - i8;
            c2068a2 = m3315d(c2068a2, i9);
            c2068a.m3310i();
            c2068a2.m3310i();
            int[] iArr = c2068a2.f12256e;
            int[] iArr2 = this.f12261h;
            int i10 = this.f12260g;
            System.arraycopy(iArr, 0, iArr2, i8 * i10, i10);
            int[] iArr3 = c2068a.f12256e;
            int[] iArr4 = this.f12261h;
            int i11 = this.f12260g;
            System.arraycopy(iArr3, 0, iArr4, i9 * i11, i11);
        }
    }

    /* renamed from: g */
    public final void m3318g() {
        int i7 = this.f12259f;
        int i8 = this.f12258e;
        int i9 = (i7 + 31) / 32;
        int[] iArr = new int[i9 * i8];
        for (int i10 = 0; i10 < this.f12259f; i10++) {
            for (int i11 = 0; i11 < this.f12258e; i11++) {
                if (((this.f12261h[(i11 / 32) + (this.f12260g * i10)] >>> (i11 & 31)) & 1) != 0) {
                    int i12 = (i10 / 32) + (((i8 - 1) - i11) * i9);
                    iArr[i12] = iArr[i12] | (1 << (i10 & 31));
                }
            }
        }
        this.f12258e = i7;
        this.f12259f = i8;
        this.f12260g = i9;
        this.f12261h = iArr;
    }

    /* renamed from: h */
    public final void m3319h(int i7, int i8) {
        int i9 = (i7 / 32) + (i8 * this.f12260g);
        int[] iArr = this.f12261h;
        iArr[i9] = (1 << (i7 & 31)) | iArr[i9];
    }

    public final int hashCode() {
        int i7 = this.f12258e;
        return Arrays.hashCode(this.f12261h) + (((((((i7 * 31) + i7) * 31) + this.f12259f) * 31) + this.f12260g) * 31);
    }

    /* renamed from: i */
    public final void m3320i(int i7, int i8, int i9, int i10) {
        if (i8 >= 0 && i7 >= 0) {
            if (i10 >= 1 && i9 >= 1) {
                int i11 = i9 + i7;
                int i12 = i10 + i8;
                if (i12 <= this.f12259f && i11 <= this.f12258e) {
                    while (i8 < i12) {
                        int i13 = this.f12260g * i8;
                        for (int i14 = i7; i14 < i11; i14++) {
                            int[] iArr = this.f12261h;
                            int i15 = (i14 / 32) + i13;
                            iArr[i15] = iArr[i15] | (1 << (i14 & 31));
                        }
                        i8++;
                    }
                    return;
                }
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder((this.f12258e + 1) * this.f12259f);
        for (int i7 = 0; i7 < this.f12259f; i7++) {
            for (int i8 = 0; i8 < this.f12258e; i8++) {
                if (m3313b(i8, i7)) {
                    str = "X ";
                } else {
                    str = "  ";
                }
                sb.append(str);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
