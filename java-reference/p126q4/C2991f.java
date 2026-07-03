package p126q4;

import java.util.Map;
import p022c4.C0396f;
import p022c4.C0400j;
import p022c4.C0404n;
import p022c4.C0406p;
import p022c4.EnumC0391a;
import p022c4.EnumC0394d;
import p022c4.EnumC0405o;
import p067i4.C2068a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q4.f */
/* loaded from: classes.dex */
public final class C2991f extends AbstractC2993h {

    /* renamed from: b */
    public static final int[] f15442b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    public static final int[] f15443c = {1, 1, 1, 1};

    /* renamed from: d */
    public static final int[][] f15444d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e */
    public static final int[][] f15445e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    public int f15446a = -1;

    /* renamed from: g */
    public static int m4653g(int[] iArr) {
        float f7 = 0.38f;
        int i7 = -1;
        for (int i8 = 0; i8 < 20; i8++) {
            float m4656d = AbstractC2993h.m4656d(iArr, f15445e[i8], 0.5f);
            if (m4656d < f7) {
                i7 = i8;
                f7 = m4656d;
            } else if (m4656d == f7) {
                i7 = -1;
            }
        }
        if (i7 >= 0) {
            return i7 % 10;
        }
        throw C0400j.m878a();
    }

    /* renamed from: h */
    public static int[] m4654h(int i7, C2068a c2068a, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i8 = c2068a.f12257f;
        int i9 = i7;
        boolean z7 = false;
        int i10 = 0;
        while (i7 < i8) {
            if (c2068a.m3305d(i7) != z7) {
                iArr2[i10] = iArr2[i10] + 1;
            } else {
                if (i10 == length - 1) {
                    if (AbstractC2993h.m4656d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i9, i7};
                    }
                    i9 += iArr2[0] + iArr2[1];
                    int i11 = i10 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i11);
                    iArr2[i11] = 0;
                    iArr2[i10] = 0;
                    i10--;
                } else {
                    i10++;
                }
                iArr2[i10] = 1;
                z7 = !z7;
            }
            i7++;
        }
        throw C0400j.m878a();
    }

    @Override // p126q4.AbstractC2993h
    /* renamed from: b */
    public final C0404n mo4642b(int i7, C2068a c2068a, Map map) {
        int[] m4654h;
        int[] iArr;
        boolean z7;
        int i8 = c2068a.f12257f;
        int m3306e = c2068a.m3306e(0);
        if (m3306e != i8) {
            int[] m4654h2 = m4654h(m3306e, c2068a, f15443c);
            int i9 = m4654h2[1];
            int i10 = m4654h2[0];
            this.f15446a = (i9 - i10) / 4;
            m4655i(c2068a, i10);
            int[][] iArr2 = f15444d;
            c2068a.m3310i();
            try {
                int i11 = c2068a.f12257f;
                int m3306e2 = c2068a.m3306e(0);
                if (m3306e2 != i11) {
                    try {
                        m4654h = m4654h(m3306e2, c2068a, iArr2[0]);
                    } catch (C0400j unused) {
                        m4654h = m4654h(m3306e2, c2068a, iArr2[1]);
                    }
                    m4655i(c2068a, m4654h[0]);
                    int i12 = m4654h[0];
                    int i13 = c2068a.f12257f;
                    m4654h[0] = i13 - m4654h[1];
                    m4654h[1] = i13 - i12;
                    c2068a.m3310i();
                    StringBuilder sb = new StringBuilder(20);
                    int i14 = m4654h2[1];
                    int i15 = m4654h[0];
                    int[] iArr3 = new int[10];
                    int[] iArr4 = new int[5];
                    int[] iArr5 = new int[5];
                    while (i14 < i15) {
                        AbstractC2993h.m4657e(i14, c2068a, iArr3);
                        for (int i16 = 0; i16 < 5; i16++) {
                            int i17 = i16 * 2;
                            iArr4[i16] = iArr3[i17];
                            iArr5[i16] = iArr3[i17 + 1];
                        }
                        sb.append((char) (m4653g(iArr4) + 48));
                        sb.append((char) (m4653g(iArr5) + 48));
                        for (int i18 = 0; i18 < 10; i18++) {
                            i14 += iArr3[i18];
                        }
                    }
                    String sb2 = sb.toString();
                    if (map != null) {
                        iArr = (int[]) map.get(EnumC0394d.ALLOWED_LENGTHS);
                    } else {
                        iArr = null;
                    }
                    if (iArr == null) {
                        iArr = f15442b;
                    }
                    int length = sb2.length();
                    int length2 = iArr.length;
                    int i19 = 0;
                    int i20 = 0;
                    while (true) {
                        if (i19 < length2) {
                            int i21 = iArr[i19];
                            if (length == i21) {
                                z7 = true;
                                break;
                            }
                            if (i21 > i20) {
                                i20 = i21;
                            }
                            i19++;
                        } else {
                            z7 = false;
                            break;
                        }
                    }
                    if (!z7 && length > i20) {
                        z7 = true;
                    }
                    if (z7) {
                        float f7 = i7;
                        C0404n c0404n = new C0404n(sb2, null, new C0406p[]{new C0406p(m4654h2[1], f7), new C0406p(m4654h[0], f7)}, EnumC0391a.f1323m);
                        c0404n.m880b(EnumC0405o.f1388q, "]I0");
                        return c0404n;
                    }
                    throw C0396f.m868a();
                }
                throw C0400j.m878a();
            } catch (Throwable th) {
                c2068a.m3310i();
                throw th;
            }
        }
        throw C0400j.m878a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4655i(C2068a c2068a, int i7) {
        int min = Math.min(this.f15446a * 10, i7);
        for (int i8 = i7 - 1; min > 0 && i8 >= 0 && !c2068a.m3305d(i8); i8--) {
            min--;
        }
        throw C0400j.m878a();
    }
}
