package p126q4;

import java.util.Arrays;
import java.util.Map;
import p022c4.C0393c;
import p022c4.C0400j;
import p022c4.C0404n;
import p022c4.C0406p;
import p022c4.EnumC0391a;
import p022c4.EnumC0405o;
import p067i4.C2068a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q4.c */
/* loaded from: classes.dex */
public final class C2988c extends AbstractC2993h {

    /* renamed from: d */
    public static final int[] f15428d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a */
    public final boolean f15429a;

    /* renamed from: b */
    public final StringBuilder f15430b = new StringBuilder(20);

    /* renamed from: c */
    public final int[] f15431c = new int[9];

    public C2988c(boolean z7) {
        this.f15429a = z7;
    }

    /* renamed from: g */
    public static int m4644g(int[] iArr) {
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            int i8 = Integer.MAX_VALUE;
            for (int i9 : iArr) {
                if (i9 < i8 && i9 > i7) {
                    i8 = i9;
                }
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                int i14 = iArr[i13];
                if (i14 > i8) {
                    i11 |= 1 << ((length - 1) - i13);
                    i10++;
                    i12 += i14;
                }
            }
            if (i10 == 3) {
                for (int i15 = 0; i15 < length && i10 > 0; i15++) {
                    int i16 = iArr[i15];
                    if (i16 > i8) {
                        i10--;
                        if (i16 * 2 >= i12) {
                            return -1;
                        }
                    }
                }
                return i11;
            }
            if (i10 <= 3) {
                return -1;
            }
            i7 = i8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v8 */
    @Override // p126q4.AbstractC2993h
    /* renamed from: b */
    public final C0404n mo4642b(int i7, C2068a c2068a, Map map) {
        int i8;
        ?? r21;
        char c7;
        int[] iArr = this.f15431c;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f15430b;
        sb.setLength(0);
        int i9 = c2068a.f12257f;
        int m3306e = c2068a.m3306e(0);
        int length = iArr.length;
        boolean z7 = false;
        int i10 = 0;
        int i11 = m3306e;
        while (m3306e < i9) {
            boolean z8 = true;
            if (c2068a.m3305d(m3306e) != z7) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 == length - 1) {
                    int i12 = 148;
                    if (m4644g(iArr) == 148 && c2068a.m3309h(Math.max(0, i11 - ((m3306e - i11) / 2)), i11)) {
                        int m3306e2 = c2068a.m3306e(new int[]{i11, m3306e}[1]);
                        int i13 = c2068a.f12257f;
                        while (true) {
                            AbstractC2993h.m4657e(m3306e2, c2068a, iArr);
                            int m4644g = m4644g(iArr);
                            if (m4644g >= 0) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 < 43) {
                                        boolean z9 = z8;
                                        if (f15428d[i14] == m4644g) {
                                            c7 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i14);
                                            r21 = z9;
                                            break;
                                        }
                                        i14++;
                                        z8 = z9 ? 1 : 0;
                                    } else {
                                        r21 = z8;
                                        if (m4644g == i12) {
                                            c7 = '*';
                                        } else {
                                            throw C0400j.m878a();
                                        }
                                    }
                                }
                                sb.append(c7);
                                int i15 = m3306e2;
                                for (int i16 : iArr) {
                                    i15 += i16;
                                }
                                int m3306e3 = c2068a.m3306e(i15);
                                if (c7 == '*') {
                                    sb.setLength(sb.length() - 1);
                                    int i17 = 0;
                                    for (int i18 : iArr) {
                                        i17 += i18;
                                    }
                                    int i19 = (m3306e3 - m3306e2) - i17;
                                    if (m3306e3 != i13 && i19 * 2 < i17) {
                                        throw C0400j.m878a();
                                    }
                                    if (this.f15429a) {
                                        int length2 = sb.length() - 1;
                                        int i20 = 0;
                                        for (int i21 = 0; i21 < length2; i21++) {
                                            i20 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb.charAt(i21));
                                        }
                                        if (sb.charAt(length2) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i20 % 43)) {
                                            sb.setLength(length2);
                                        } else {
                                            throw C0393c.m867a();
                                        }
                                    }
                                    if (sb.length() != 0) {
                                        float f7 = (r5[r21] + r5[0]) / 2.0f;
                                        float f8 = (i17 / 2.0f) + m3306e2;
                                        float f9 = i7;
                                        C0404n c0404n = new C0404n(sb.toString(), null, new C0406p[]{new C0406p(f7, f9), new C0406p(f8, f9)}, EnumC0391a.f1317g);
                                        c0404n.m880b(EnumC0405o.f1388q, "]A0");
                                        return c0404n;
                                    }
                                    throw C0400j.m878a();
                                }
                                z8 = r21;
                                m3306e2 = m3306e3;
                                i12 = 148;
                            } else {
                                throw C0400j.m878a();
                            }
                        }
                    } else {
                        i8 = 1;
                        i11 += iArr[0] + iArr[1];
                        int i22 = i10 - 1;
                        System.arraycopy(iArr, 2, iArr, 0, i22);
                        iArr[i22] = 0;
                        iArr[i10] = 0;
                        i10--;
                    }
                } else {
                    i8 = 1;
                    i10++;
                }
                iArr[i10] = i8;
                z7 = !z7;
            }
            m3306e++;
        }
        throw C0400j.m878a();
    }
}
