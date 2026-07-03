package p134r4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import p022c4.C0400j;
import p022c4.C0404n;
import p022c4.C0406p;
import p022c4.EnumC0391a;
import p022c4.EnumC0394d;
import p022c4.EnumC0405o;
import p022c4.InterfaceC0407q;
import p065i2.AbstractC2064e;
import p067i4.AbstractC2072e;
import p067i4.C2068a;
import p126q4.AbstractC2993h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r4.e */
/* loaded from: classes.dex */
public final class C3053e extends AbstractC3049a {

    /* renamed from: i */
    public static final int[] f15636i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    public static final int[] f15637j = {4, 20, 48, 81};

    /* renamed from: k */
    public static final int[] f15638k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    public static final int[] f15639l = {0, 336, 1036, 1516};

    /* renamed from: m */
    public static final int[] f15640m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    public static final int[] f15641n = {2, 4, 6, 8};

    /* renamed from: o */
    public static final int[][] f15642o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    public final ArrayList f15643g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f15644h = new ArrayList();

    /* renamed from: j */
    public static void m4728j(ArrayList arrayList, C3052d c3052d) {
        if (c3052d == null) {
            return;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            C3052d c3052d2 = (C3052d) obj;
            if (c3052d2.f15629a == c3052d.f15629a) {
                c3052d2.f15635d++;
                return;
            }
        }
        arrayList.add(c3052d);
    }

    @Override // p126q4.AbstractC2993h
    /* renamed from: b */
    public final C0404n mo4642b(int i7, C2068a c2068a, Map map) {
        C3052d m4730l = m4730l(c2068a, false, i7, map);
        ArrayList arrayList = this.f15643g;
        m4728j(arrayList, m4730l);
        c2068a.m3310i();
        C3052d m4730l2 = m4730l(c2068a, true, i7, map);
        ArrayList arrayList2 = this.f15644h;
        m4728j(arrayList2, m4730l2);
        c2068a.m3310i();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            C3052d c3052d = (C3052d) obj;
            int i9 = c3052d.f15635d;
            C3051c c3051c = c3052d.f15634c;
            if (i9 > 1) {
                int size2 = arrayList2.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    C3052d c3052d2 = (C3052d) obj2;
                    int i11 = c3052d2.f15635d;
                    C3051c c3051c2 = c3052d2.f15634c;
                    if (i11 > 1) {
                        int i12 = ((c3052d2.f15630b * 16) + c3052d.f15630b) % 79;
                        int i13 = (c3051c.f15631a * 9) + c3051c2.f15631a;
                        if (i13 > 72) {
                            i13--;
                        }
                        if (i13 > 8) {
                            i13--;
                        }
                        if (i12 == i13) {
                            String valueOf = String.valueOf((c3052d.f15629a * 4537077) + c3052d2.f15629a);
                            StringBuilder sb = new StringBuilder(14);
                            for (int length = 13 - valueOf.length(); length > 0; length--) {
                                sb.append('0');
                            }
                            sb.append(valueOf);
                            int i14 = 0;
                            for (int i15 = 0; i15 < 13; i15++) {
                                int charAt = sb.charAt(i15) - '0';
                                if ((i15 & 1) == 0) {
                                    charAt *= 3;
                                }
                                i14 += charAt;
                            }
                            int i16 = 10 - (i14 % 10);
                            if (i16 == 10) {
                                i16 = 0;
                            }
                            sb.append(i16);
                            C0406p[] c0406pArr = c3051c.f15633c;
                            C0406p[] c0406pArr2 = c3051c2.f15633c;
                            C0404n c0404n = new C0404n(sb.toString(), null, new C0406p[]{c0406pArr[0], c0406pArr[1], c0406pArr2[0], c0406pArr2[1]}, EnumC0391a.f1327q);
                            c0404n.m880b(EnumC0405o.f1388q, "]e0");
                            return c0404n;
                        }
                    }
                }
            }
        }
        throw C0400j.m878a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0093, code lost:
    
        if (r4 < 4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0095, code lost:
    
        r17 = false;
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x009a, code lost:
    
        r16 = false;
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00b1, code lost:
    
        if (r4 < 4) goto L35;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3050b m4729k(C2068a c2068a, C3051c c3051c, boolean z7) {
        int i7;
        float[] fArr;
        float[] fArr2;
        int[] iArr;
        int[] iArr2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int[] iArr3 = c3051c.f15632b;
        int[] iArr4 = this.f15624b;
        Arrays.fill(iArr4, 0);
        if (z7) {
            AbstractC2993h.m4658f(iArr3[0], c2068a, iArr4);
        } else {
            AbstractC2993h.m4657e(iArr3[1], c2068a, iArr4);
            int i8 = 0;
            for (int length = iArr4.length - 1; i8 < length; length--) {
                int i9 = iArr4[i8];
                iArr4[i8] = iArr4[length];
                iArr4[length] = i9;
                i8++;
            }
        }
        if (z7) {
            i7 = 16;
        } else {
            i7 = 15;
        }
        float m3226G = AbstractC2064e.m3226G(iArr4) / i7;
        int i10 = 0;
        while (true) {
            int length2 = iArr4.length;
            fArr = this.f15626d;
            fArr2 = this.f15625c;
            iArr = this.f15628f;
            iArr2 = this.f15627e;
            if (i10 >= length2) {
                break;
            }
            float f7 = iArr4[i10] / m3226G;
            int i11 = (int) (0.5f + f7);
            if (i11 < 1) {
                i11 = 1;
            } else if (i11 > 8) {
                i11 = 8;
            }
            int i12 = i10 / 2;
            if ((i10 & 1) == 0) {
                iArr2[i12] = i11;
                fArr2[i12] = f7 - i11;
            } else {
                iArr[i12] = i11;
                fArr[i12] = f7 - i11;
            }
            i10++;
        }
        int m3226G2 = AbstractC2064e.m3226G(iArr2);
        int m3226G3 = AbstractC2064e.m3226G(iArr);
        if (z7) {
            if (m3226G2 > 12) {
                z8 = false;
                z9 = true;
            } else if (m3226G2 < 4) {
                z9 = false;
                z8 = true;
            } else {
                z8 = false;
                z9 = false;
            }
            if (m3226G3 <= 12) {
            }
            z10 = false;
            z11 = true;
        } else {
            if (m3226G2 > 11) {
                z8 = false;
                z9 = true;
            } else if (m3226G2 < 5) {
                z9 = false;
                z8 = true;
            } else {
                z8 = false;
                z9 = false;
            }
            if (m3226G3 <= 10) {
            }
            z10 = false;
            z11 = true;
        }
        int i13 = (m3226G2 + m3226G3) - i7;
        if ((m3226G2 & 1) == z7) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((m3226G3 & 1) == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (i13 != -1) {
            if (i13 != 0) {
                if (i13 == 1) {
                    if (z12) {
                        if (!z13) {
                            z9 = true;
                        } else {
                            throw C0400j.m878a();
                        }
                    } else if (z13) {
                        z11 = true;
                    } else {
                        throw C0400j.m878a();
                    }
                } else {
                    throw C0400j.m878a();
                }
            } else if (z12) {
                if (z13) {
                    if (m3226G2 < m3226G3) {
                        z8 = true;
                        z11 = true;
                    } else {
                        z9 = true;
                        z10 = true;
                    }
                } else {
                    throw C0400j.m878a();
                }
            } else if (z13) {
                throw C0400j.m878a();
            }
        } else if (z12) {
            if (!z13) {
                z8 = true;
            } else {
                throw C0400j.m878a();
            }
        } else if (z13) {
            z10 = true;
        } else {
            throw C0400j.m878a();
        }
        if (z8) {
            if (!z9) {
                AbstractC3049a.m4726h(iArr2, fArr2);
            } else {
                throw C0400j.m878a();
            }
        }
        if (z9) {
            AbstractC3049a.m4725g(iArr2, fArr2);
        }
        if (z10) {
            if (!z11) {
                AbstractC3049a.m4726h(iArr, fArr2);
            } else {
                throw C0400j.m878a();
            }
        }
        if (z11) {
            AbstractC3049a.m4725g(iArr, fArr);
        }
        int i14 = 0;
        int i15 = 0;
        for (int length3 = iArr2.length - 1; length3 >= 0; length3--) {
            int i16 = iArr2[length3];
            i14 = (i14 * 9) + i16;
            i15 += i16;
        }
        int i17 = 0;
        int i18 = 0;
        for (int length4 = iArr.length - 1; length4 >= 0; length4--) {
            int i19 = iArr[length4];
            i17 = (i17 * 9) + i19;
            i18 += i19;
        }
        int i20 = (i17 * 3) + i14;
        if (z7) {
            if ((i15 & 1) == 0 && i15 <= 12 && i15 >= 4) {
                int i21 = (12 - i15) / 2;
                int i22 = f15640m[i21];
                int i23 = 9 - i22;
                return new C3050b((AbstractC2072e.m3336n(iArr2, i22, false) * f15636i[i21]) + AbstractC2072e.m3336n(iArr, i23, true) + f15638k[i21], i20);
            }
            throw C0400j.m878a();
        }
        if ((i18 & 1) == 0 && i18 <= 10 && i18 >= 4) {
            int i24 = (10 - i18) / 2;
            int i25 = f15641n[i24];
            return new C3050b((AbstractC2072e.m3336n(iArr, 9 - i25, false) * f15637j[i24]) + AbstractC2072e.m3336n(iArr2, i25, true) + f15639l[i24], i20);
        }
        throw C0400j.m878a();
    }

    /* renamed from: l */
    public final C3052d m4730l(C2068a c2068a, boolean z7, int i7, Map map) {
        InterfaceC0407q interfaceC0407q;
        try {
            C3051c m4732n = m4732n(c2068a, i7, z7, m4731m(c2068a, z7));
            if (map == null) {
                interfaceC0407q = null;
            } else {
                interfaceC0407q = (InterfaceC0407q) map.get(EnumC0394d.NEED_RESULT_POINT_CALLBACK);
            }
            if (interfaceC0407q != null) {
                int[] iArr = m4732n.f15632b;
                float f7 = ((iArr[0] + iArr[1]) - 1) / 2.0f;
                if (z7) {
                    f7 = (c2068a.f12257f - 1) - f7;
                }
                interfaceC0407q.mo882a(new C0406p(f7, i7));
            }
            C3050b m4729k = m4729k(c2068a, m4732n, true);
            C3050b m4729k2 = m4729k(c2068a, m4732n, false);
            return new C3052d((m4729k.f15629a * 1597) + m4729k2.f15629a, (m4729k2.f15630b * 4) + m4729k.f15630b, m4732n);
        } catch (C0400j unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final int[] m4731m(C2068a c2068a, boolean z7) {
        int[] iArr = this.f15623a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i7 = c2068a.f12257f;
        int i8 = 0;
        boolean z8 = false;
        while (i8 < i7) {
            z8 = !c2068a.m3305d(i8);
            if (z7 == z8) {
                break;
            }
            i8++;
        }
        int i9 = 0;
        int i10 = i8;
        while (i8 < i7) {
            if (c2068a.m3305d(i8) != z8) {
                iArr[i9] = iArr[i9] + 1;
            } else {
                if (i9 == 3) {
                    if (AbstractC3049a.m4727i(iArr)) {
                        return new int[]{i10, i8};
                    }
                    i10 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i9--;
                } else {
                    i9++;
                }
                iArr[i9] = 1;
                z8 = !z8;
            }
            i8++;
        }
        throw C0400j.m878a();
    }

    /* renamed from: n */
    public final C3051c m4732n(C2068a c2068a, int i7, boolean z7, int[] iArr) {
        int i8;
        int i9;
        boolean m3305d = c2068a.m3305d(iArr[0]);
        int i10 = iArr[0] - 1;
        while (i10 >= 0 && m3305d != c2068a.m3305d(i10)) {
            i10--;
        }
        int i11 = i10 + 1;
        int i12 = iArr[0] - i11;
        int[] iArr2 = this.f15623a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = i12;
        for (int i13 = 0; i13 < 9; i13++) {
            if (AbstractC2993h.m4656d(iArr2, f15642o[i13], 0.45f) < 0.2f) {
                int i14 = iArr[1];
                if (z7) {
                    int i15 = c2068a.f12257f - 1;
                    i8 = i15 - i14;
                    i9 = i15 - i11;
                } else {
                    i8 = i14;
                    i9 = i11;
                }
                return new C3051c(i13, new int[]{i11, i14}, i9, i8, i7);
            }
        }
        throw C0400j.m878a();
    }

    @Override // p126q4.AbstractC2993h, p022c4.InterfaceC0402l
    public final void reset() {
        this.f15643g.clear();
        this.f15644h.clear();
    }
}
