package p126q4;

import java.util.Arrays;
import java.util.Map;
import p022c4.C0400j;
import p022c4.C0404n;
import p022c4.C0406p;
import p022c4.EnumC0391a;
import p022c4.EnumC0394d;
import p022c4.EnumC0405o;
import p067i4.C2068a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q4.a */
/* loaded from: classes.dex */
public final class C2986a extends AbstractC2993h {

    /* renamed from: d */
    public static final char[] f15421d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    public static final int[] f15422e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    public static final char[] f15423f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    public final StringBuilder f15424a = new StringBuilder(20);

    /* renamed from: b */
    public int[] f15425b = new int[80];

    /* renamed from: c */
    public int f15426c = 0;

    /* renamed from: g */
    public static boolean m4641g(char[] cArr, char c7) {
        if (cArr != null) {
            for (char c8 : cArr) {
                if (c8 == c7) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p126q4.AbstractC2993h
    /* renamed from: b */
    public final C0404n mo4642b(int i7, C2068a c2068a, Map map) {
        int i8;
        int[] iArr;
        int i9;
        Arrays.fill(this.f15425b, 0);
        this.f15426c = 0;
        int m3307f = c2068a.m3307f(0);
        int i10 = c2068a.f12257f;
        if (m3307f < i10) {
            int i11 = 1;
            int i12 = 0;
            boolean z7 = true;
            while (m3307f < i10) {
                if (c2068a.m3305d(m3307f) != z7) {
                    i12++;
                } else {
                    int[] iArr2 = this.f15425b;
                    int i13 = this.f15426c;
                    iArr2[i13] = i12;
                    int i14 = i13 + 1;
                    this.f15426c = i14;
                    if (i14 >= iArr2.length) {
                        int[] iArr3 = new int[i14 * 2];
                        System.arraycopy(iArr2, 0, iArr3, 0, i14);
                        this.f15425b = iArr3;
                    }
                    z7 = !z7;
                    i12 = 1;
                }
                m3307f++;
            }
            int[] iArr4 = this.f15425b;
            int i15 = this.f15426c;
            iArr4[i15] = i12;
            int i16 = i15 + 1;
            this.f15426c = i16;
            if (i16 >= iArr4.length) {
                int[] iArr5 = new int[i16 * 2];
                System.arraycopy(iArr4, 0, iArr5, 0, i16);
                this.f15425b = iArr5;
            }
            int i17 = 1;
            while (i17 < this.f15426c) {
                int m4643h = m4643h(i17);
                if (m4643h != -1) {
                    char[] cArr = f15421d;
                    char c7 = cArr[m4643h];
                    char[] cArr2 = f15423f;
                    if (m4641g(cArr2, c7)) {
                        int i18 = 0;
                        for (int i19 = i17; i19 < i17 + 7; i19++) {
                            i18 += this.f15425b[i19];
                        }
                        if (i17 == i11 || this.f15425b[i17 - 1] >= i18 / 2) {
                            StringBuilder sb = this.f15424a;
                            sb.setLength(0);
                            int i20 = i17;
                            while (true) {
                                int m4643h2 = m4643h(i20);
                                if (m4643h2 != -1) {
                                    sb.append((char) m4643h2);
                                    i8 = i20 + 8;
                                    if ((sb.length() <= i11 || !m4641g(cArr2, cArr[m4643h2])) && i8 < this.f15426c) {
                                        i20 = i8;
                                        i11 = i11;
                                    }
                                } else {
                                    throw C0400j.m878a();
                                }
                            }
                            int i21 = i20 + 7;
                            int i22 = this.f15425b[i21];
                            int i23 = 0;
                            for (int i24 = -8; i24 < -1; i24++) {
                                i23 += this.f15425b[i8 + i24];
                            }
                            int i25 = 2;
                            if (i8 < this.f15426c && i22 < i23 / 2) {
                                throw C0400j.m878a();
                            }
                            int[] iArr6 = new int[4];
                            iArr6[0] = 0;
                            iArr6[i11] = 0;
                            iArr6[2] = 0;
                            iArr6[3] = 0;
                            int[] iArr7 = new int[4];
                            iArr7[0] = 0;
                            iArr7[i11] = 0;
                            iArr7[2] = 0;
                            iArr7[3] = 0;
                            int length = sb.length() - i11;
                            int i26 = i17;
                            int i27 = 0;
                            while (true) {
                                int i28 = 6;
                                iArr = f15422e;
                                if (i27 > length) {
                                    break;
                                }
                                int i29 = iArr[sb.charAt(i27)];
                                while (i28 >= 0) {
                                    int i30 = ((i29 & 1) * 2) + (i28 & 1);
                                    iArr6[i30] = iArr6[i30] + this.f15425b[i26 + i28];
                                    iArr7[i30] = iArr7[i30] + 1;
                                    i29 >>= 1;
                                    i28--;
                                    i11 = i11;
                                }
                                i26 += 8;
                                i27++;
                            }
                            float[] fArr = new float[4];
                            float[] fArr2 = new float[4];
                            int i31 = 0;
                            while (i31 < i25) {
                                fArr2[i31] = 0.0f;
                                int i32 = i31 + 2;
                                int i33 = i25;
                                float f7 = iArr6[i32];
                                float f8 = iArr7[i32];
                                float f9 = ((f7 / f8) + (iArr6[i31] / iArr7[i31])) / 2.0f;
                                fArr2[i32] = f9;
                                fArr[i31] = f9;
                                fArr[i32] = ((f7 * 2.0f) + 1.5f) / f8;
                                i31++;
                                i25 = i33;
                            }
                            int i34 = i17;
                            for (int i35 = 0; i35 <= length; i35++) {
                                int i36 = iArr[sb.charAt(i35)];
                                for (int i37 = 6; i37 >= 0; i37--) {
                                    int i38 = ((i36 & 1) * 2) + (i37 & 1);
                                    float f10 = this.f15425b[i34 + i37];
                                    if (f10 >= fArr2[i38] && f10 <= fArr[i38]) {
                                        i36 >>= 1;
                                    } else {
                                        throw C0400j.m878a();
                                    }
                                }
                                i34 += 8;
                            }
                            for (int i39 = 0; i39 < sb.length(); i39++) {
                                sb.setCharAt(i39, cArr[sb.charAt(i39)]);
                            }
                            if (m4641g(cArr2, sb.charAt(0))) {
                                if (m4641g(cArr2, sb.charAt(sb.length() - 1))) {
                                    if (sb.length() > 3) {
                                        if (map != null && map.containsKey(EnumC0394d.RETURN_CODABAR_START_END)) {
                                            i9 = 0;
                                        } else {
                                            sb.deleteCharAt(sb.length() - 1);
                                            i9 = 0;
                                            sb.deleteCharAt(0);
                                        }
                                        int i40 = i9;
                                        while (i9 < i17) {
                                            i40 += this.f15425b[i9];
                                            i9++;
                                        }
                                        float f11 = i40;
                                        while (i17 < i21) {
                                            i40 += this.f15425b[i17];
                                            i17++;
                                        }
                                        float f12 = i7;
                                        C0404n c0404n = new C0404n(sb.toString(), null, new C0406p[]{new C0406p(f11, f12), new C0406p(i40, f12)}, EnumC0391a.f1316f);
                                        c0404n.m880b(EnumC0405o.f1388q, "]F0");
                                        return c0404n;
                                    }
                                    throw C0400j.m878a();
                                }
                                throw C0400j.m878a();
                            }
                            throw C0400j.m878a();
                        }
                    }
                }
                i17 += 2;
                i11 = i11;
            }
            throw C0400j.m878a();
        }
        throw C0400j.m878a();
    }

    /* renamed from: h */
    public final int m4643h(int i7) {
        int i8;
        int i9 = i7 + 7;
        if (i9 >= this.f15426c) {
            return -1;
        }
        int[] iArr = this.f15425b;
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        for (int i14 = i7; i14 < i9; i14 += 2) {
            int i15 = iArr[i14];
            if (i15 < i12) {
                i12 = i15;
            }
            if (i15 > i13) {
                i13 = i15;
            }
        }
        int i16 = (i12 + i13) / 2;
        int i17 = 0;
        for (int i18 = i7 + 1; i18 < i9; i18 += 2) {
            int i19 = iArr[i18];
            if (i19 < i10) {
                i10 = i19;
            }
            if (i19 > i17) {
                i17 = i19;
            }
        }
        int i20 = (i10 + i17) / 2;
        int i21 = 128;
        int i22 = 0;
        for (int i23 = 0; i23 < 7; i23++) {
            if ((i23 & 1) == 0) {
                i8 = i16;
            } else {
                i8 = i20;
            }
            i21 >>= 1;
            if (iArr[i7 + i23] > i8) {
                i22 |= i21;
            }
        }
        while (true) {
            int[] iArr2 = f15422e;
            if (i11 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i11] == i22) {
                return i11;
            }
            i11++;
        }
    }
}
