package p142s4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001a0.C0031h1;
import p022c4.C0400j;
import p022c4.C0404n;
import p022c4.C0406p;
import p022c4.EnumC0391a;
import p022c4.EnumC0405o;
import p065i2.AbstractC2064e;
import p067i4.AbstractC2072e;
import p067i4.C2068a;
import p126q4.AbstractC2993h;
import p134r4.AbstractC3049a;
import p134r4.C3050b;
import p134r4.C3051c;
import p149t4.AbstractC3269f;
import p149t4.C3264a;
import p149t4.C3265b;
import p149t4.C3266c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s4.c */
/* loaded from: classes.dex */
public final class C3111c extends AbstractC3049a {

    /* renamed from: k */
    public static final int[] f15721k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    public static final int[] f15722l = {4, 20, 52, 104, 204};

    /* renamed from: m */
    public static final int[] f15723m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    public static final int[][] f15724n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    public static final int[][] f15725o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    public static final int[][] f15726p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    public final ArrayList f15727g = new ArrayList(11);

    /* renamed from: h */
    public final ArrayList f15728h = new ArrayList();

    /* renamed from: i */
    public final int[] f15729i = new int[2];

    /* renamed from: j */
    public boolean f15730j;

    /* renamed from: m */
    public static C0404n m4808m(List list) {
        AbstractC3269f c3264a;
        int size = list.size() * 2;
        int i7 = size - 1;
        if (((C3109a) list.get(list.size() - 1)).f15717b == null) {
            i7 = size - 2;
        }
        C2068a c2068a = new C2068a(i7 * 12);
        int i8 = ((C3109a) list.get(0)).f15717b.f15629a;
        int i9 = 0;
        for (int i10 = 11; i10 >= 0; i10--) {
            if (((1 << i10) & i8) != 0) {
                c2068a.m3311j(i9);
            }
            i9++;
        }
        for (int i11 = 1; i11 < list.size(); i11++) {
            C3109a c3109a = (C3109a) list.get(i11);
            int i12 = c3109a.f15716a.f15629a;
            for (int i13 = 11; i13 >= 0; i13--) {
                if (((1 << i13) & i12) != 0) {
                    c2068a.m3311j(i9);
                }
                i9++;
            }
            C3050b c3050b = c3109a.f15717b;
            if (c3050b != null) {
                int i14 = c3050b.f15629a;
                for (int i15 = 11; i15 >= 0; i15--) {
                    if (((1 << i15) & i14) != 0) {
                        c2068a.m3311j(i9);
                    }
                    i9++;
                }
            }
        }
        if (c2068a.m3305d(1)) {
            c3264a = new C3265b(c2068a, 2);
        } else if (!c2068a.m3305d(2)) {
            c3264a = new AbstractC3269f(c2068a);
        } else {
            int m76s = C0031h1.m76s(1, 4, c2068a);
            if (m76s != 4) {
                if (m76s != 5) {
                    int m76s2 = C0031h1.m76s(1, 5, c2068a);
                    if (m76s2 != 12) {
                        if (m76s2 != 13) {
                            switch (C0031h1.m76s(1, 7, c2068a)) {
                                case 56:
                                    c3264a = new C3266c(c2068a, "310", "11");
                                    break;
                                case 57:
                                    c3264a = new C3266c(c2068a, "320", "11");
                                    break;
                                case 58:
                                    c3264a = new C3266c(c2068a, "310", "13");
                                    break;
                                case 59:
                                    c3264a = new C3266c(c2068a, "320", "13");
                                    break;
                                case 60:
                                    c3264a = new C3266c(c2068a, "310", "15");
                                    break;
                                case 61:
                                    c3264a = new C3266c(c2068a, "320", "15");
                                    break;
                                case 62:
                                    c3264a = new C3266c(c2068a, "310", "17");
                                    break;
                                case 63:
                                    c3264a = new C3266c(c2068a, "320", "17");
                                    break;
                                default:
                                    throw new IllegalStateException("unknown decoder: " + c2068a);
                            }
                        } else {
                            c3264a = new C3265b(c2068a, 1);
                        }
                    } else {
                        c3264a = new C3265b(c2068a, 0);
                    }
                } else {
                    c3264a = new C3264a(c2068a, 1);
                }
            } else {
                c3264a = new C3264a(c2068a, 0);
            }
        }
        String mo4976d = c3264a.mo4976d();
        C0406p[] c0406pArr = ((C3109a) list.get(0)).f15718c.f15633c;
        C0406p[] c0406pArr2 = ((C3109a) list.get(list.size() - 1)).f15718c.f15633c;
        C0404n c0404n = new C0404n(mo4976d, null, new C0406p[]{c0406pArr[0], c0406pArr[1], c0406pArr2[0], c0406pArr2[1]}, EnumC0391a.f1328r);
        c0404n.m880b(EnumC0405o.f1388q, "]e0");
        return c0404n;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4809p(ArrayList arrayList, boolean z7) {
        int i7;
        for (int i8 = 0; i8 < 10; i8++) {
            int[] iArr = f15726p[i8];
            int size = arrayList.size();
            int length = iArr.length;
            if (z7) {
                if (size != length) {
                    continue;
                }
                for (i7 = 0; i7 < arrayList.size(); i7++) {
                    if (((C3109a) arrayList.get(i7)).f15718c.f15631a != iArr[i7]) {
                        break;
                    }
                }
                return true;
            }
            if (size > length) {
                continue;
            }
            while (i7 < arrayList.size()) {
            }
            return true;
        }
        return false;
    }

    @Override // p126q4.AbstractC2993h
    /* renamed from: b */
    public final C0404n mo4642b(int i7, C2068a c2068a, Map map) {
        this.f15730j = false;
        try {
            return m4808m(m4814o(c2068a, i7));
        } catch (C0400j unused) {
            this.f15730j = true;
            return m4808m(m4814o(c2068a, i7));
        }
    }

    /* renamed from: j */
    public final boolean m4810j() {
        ArrayList arrayList = this.f15727g;
        C3109a c3109a = (C3109a) arrayList.get(0);
        C3050b c3050b = c3109a.f15716a;
        C3050b c3050b2 = c3109a.f15717b;
        if (c3050b2 != null) {
            int i7 = c3050b2.f15630b;
            int i8 = 2;
            for (int i9 = 1; i9 < arrayList.size(); i9++) {
                C3109a c3109a2 = (C3109a) arrayList.get(i9);
                i7 += c3109a2.f15716a.f15630b;
                int i10 = i8 + 1;
                C3050b c3050b3 = c3109a2.f15717b;
                if (c3050b3 != null) {
                    i7 += c3050b3.f15630b;
                    i8 += 2;
                } else {
                    i8 = i10;
                }
            }
            if (((i8 - 4) * 211) + (i7 % 211) == c3050b.f15629a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final List m4811k(int i7, ArrayList arrayList) {
        while (true) {
            ArrayList arrayList2 = this.f15728h;
            if (i7 < arrayList2.size()) {
                C3110b c3110b = (C3110b) arrayList2.get(i7);
                ArrayList arrayList3 = this.f15727g;
                arrayList3.clear();
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    arrayList3.addAll(((C3110b) obj).f15719a);
                }
                arrayList3.addAll(c3110b.f15719a);
                if (m4809p(arrayList3, false)) {
                    if (m4810j()) {
                        return arrayList3;
                    }
                    ArrayList arrayList4 = new ArrayList(arrayList);
                    arrayList4.add(c3110b);
                    try {
                        return m4811k(i7 + 1, arrayList4);
                    } catch (C0400j unused) {
                        continue;
                    }
                }
                i7++;
            } else {
                throw C0400j.m878a();
            }
        }
    }

    /* renamed from: l */
    public final List m4812l(boolean z7) {
        ArrayList arrayList = this.f15728h;
        List list = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.f15727g.clear();
        if (z7) {
            Collections.reverse(arrayList);
        }
        try {
            list = m4811k(0, new ArrayList());
        } catch (C0400j unused) {
        }
        if (z7) {
            Collections.reverse(arrayList);
        }
        return list;
    }

    /* renamed from: n */
    public final C3050b m4813n(C2068a c2068a, C3051c c3051c, boolean z7, boolean z8) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i7;
        int[][] iArr;
        int[] iArr2 = this.f15624b;
        Arrays.fill(iArr2, 0);
        if (z8) {
            AbstractC2993h.m4658f(c3051c.f15632b[0], c2068a, iArr2);
        } else {
            AbstractC2993h.m4657e(c3051c.f15632b[1], c2068a, iArr2);
            int i8 = 0;
            for (int length = iArr2.length - 1; i8 < length; length--) {
                int i9 = iArr2[i8];
                iArr2[i8] = iArr2[length];
                iArr2[length] = i9;
                i8++;
            }
        }
        float m3226G = AbstractC2064e.m3226G(iArr2) / 17;
        int[] iArr3 = c3051c.f15632b;
        int i10 = c3051c.f15631a;
        float f7 = (iArr3[1] - iArr3[0]) / 15.0f;
        if (Math.abs(m3226G - f7) / f7 <= 0.3f) {
            int i11 = 0;
            while (true) {
                int length2 = iArr2.length;
                float[] fArr = this.f15626d;
                float[] fArr2 = this.f15625c;
                int[] iArr4 = this.f15628f;
                int[] iArr5 = this.f15627e;
                if (i11 < length2) {
                    float f8 = (iArr2[i11] * 1.0f) / m3226G;
                    int i12 = (int) (0.5f + f8);
                    if (i12 < 1) {
                        if (f8 >= 0.3f) {
                            i12 = 1;
                        } else {
                            throw C0400j.m878a();
                        }
                    } else if (i12 > 8) {
                        if (f8 <= 8.7f) {
                            i12 = 8;
                        } else {
                            throw C0400j.m878a();
                        }
                    }
                    int i13 = i11 / 2;
                    if ((i11 & 1) == 0) {
                        iArr5[i13] = i12;
                        fArr2[i13] = f8 - i12;
                    } else {
                        iArr4[i13] = i12;
                        fArr[i13] = f8 - i12;
                    }
                    i11++;
                } else {
                    int m3226G2 = AbstractC2064e.m3226G(iArr5);
                    int m3226G3 = AbstractC2064e.m3226G(iArr4);
                    if (m3226G2 > 13) {
                        z9 = false;
                        z10 = true;
                    } else if (m3226G2 < 4) {
                        z10 = false;
                        z9 = true;
                    } else {
                        z9 = false;
                        z10 = false;
                    }
                    if (m3226G3 > 13) {
                        z11 = false;
                        z12 = true;
                    } else if (m3226G3 < 4) {
                        z12 = false;
                        z11 = true;
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                    int i14 = (m3226G2 + m3226G3) - 17;
                    if ((m3226G2 & 1) == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((m3226G3 & 1) == 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z15 = z9;
                    boolean z16 = z10;
                    boolean z17 = z11;
                    boolean z18 = z12;
                    if (i14 != -1) {
                        if (i14 != 0) {
                            if (i14 == 1) {
                                if (z13) {
                                    if (!z14) {
                                        z16 = true;
                                        z15 = z9;
                                        z17 = z11;
                                        z18 = z12;
                                    } else {
                                        throw C0400j.m878a();
                                    }
                                } else if (z14) {
                                    z18 = true;
                                    z15 = z9;
                                    z16 = z10;
                                    z17 = z11;
                                } else {
                                    throw C0400j.m878a();
                                }
                            } else {
                                throw C0400j.m878a();
                            }
                        } else if (z13) {
                            if (z14) {
                                if (m3226G2 < m3226G3) {
                                    z15 = true;
                                    z18 = true;
                                    z16 = z10;
                                    z17 = z11;
                                } else {
                                    z16 = true;
                                    z17 = true;
                                    z15 = z9;
                                    z18 = z12;
                                }
                            } else {
                                throw C0400j.m878a();
                            }
                        } else if (z14) {
                            throw C0400j.m878a();
                        }
                    } else if (z13) {
                        if (!z14) {
                            z15 = true;
                            z16 = z10;
                            z17 = z11;
                            z18 = z12;
                        } else {
                            throw C0400j.m878a();
                        }
                    } else if (z14) {
                        z17 = true;
                        z15 = z9;
                        z16 = z10;
                        z18 = z12;
                    } else {
                        throw C0400j.m878a();
                    }
                    if (z15) {
                        if (!z16) {
                            AbstractC3049a.m4726h(iArr5, fArr2);
                        } else {
                            throw C0400j.m878a();
                        }
                    }
                    if (z16) {
                        AbstractC3049a.m4725g(iArr5, fArr2);
                    }
                    if (z17) {
                        if (!z18) {
                            AbstractC3049a.m4726h(iArr4, fArr2);
                        } else {
                            throw C0400j.m878a();
                        }
                    }
                    if (z18) {
                        AbstractC3049a.m4725g(iArr4, fArr);
                    }
                    int i15 = i10 * 4;
                    if (z7) {
                        i7 = 0;
                    } else {
                        i7 = 2;
                    }
                    int i16 = ((i15 + i7) + (!z8 ? 1 : 0)) - 1;
                    int length3 = iArr5.length - 1;
                    int i17 = 0;
                    int i18 = 0;
                    while (true) {
                        iArr = f15725o;
                        if (length3 < 0) {
                            break;
                        }
                        if (i10 != 0 || !z7 || !z8) {
                            i17 += iArr5[length3] * iArr[i16][length3 * 2];
                        }
                        i18 += iArr5[length3];
                        length3--;
                    }
                    int i19 = 0;
                    for (int length4 = iArr4.length - 1; length4 >= 0; length4--) {
                        if (i10 != 0 || !z7 || !z8) {
                            i19 += iArr4[length4] * iArr[i16][(length4 * 2) + 1];
                        }
                    }
                    int i20 = i17 + i19;
                    if ((i18 & 1) == 0 && i18 <= 13 && i18 >= 4) {
                        int i21 = (13 - i18) / 2;
                        int i22 = f15721k[i21];
                        int i23 = 9 - i22;
                        return new C3050b((AbstractC2072e.m3336n(iArr5, i22, true) * f15722l[i21]) + AbstractC2072e.m3336n(iArr4, i23, false) + f15723m[i21], i20);
                    }
                    throw C0400j.m878a();
                }
            }
        } else {
            throw C0400j.m878a();
        }
    }

    /* renamed from: o */
    public final List m4814o(C2068a c2068a, int i7) {
        boolean z7;
        boolean z8;
        ArrayList arrayList = this.f15727g;
        arrayList.clear();
        boolean z9 = false;
        while (!z9) {
            try {
                arrayList.add(m4815q(c2068a, arrayList, i7));
            } catch (C0400j e7) {
                if (!arrayList.isEmpty()) {
                    z9 = true;
                } else {
                    throw e7;
                }
            }
        }
        if (m4810j() && m4809p(arrayList, true)) {
            return arrayList;
        }
        ArrayList arrayList2 = this.f15728h;
        boolean isEmpty = arrayList2.isEmpty();
        int i8 = 0;
        boolean z10 = false;
        while (true) {
            if (i8 < arrayList2.size()) {
                C3110b c3110b = (C3110b) arrayList2.get(i8);
                int i9 = c3110b.f15720b;
                ArrayList arrayList3 = c3110b.f15719a;
                if (i9 > i7) {
                    z7 = arrayList3.equals(arrayList);
                    break;
                }
                z10 = arrayList3.equals(arrayList);
                i8++;
            } else {
                z7 = false;
                break;
            }
        }
        if (!z7 && !z10) {
            int size = arrayList2.size();
            int i10 = 0;
            loop2: while (true) {
                if (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    C3110b c3110b2 = (C3110b) obj;
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        C3109a c3109a = (C3109a) obj2;
                        ArrayList arrayList4 = c3110b2.f15719a;
                        int size3 = arrayList4.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            Object obj3 = arrayList4.get(i12);
                            i12++;
                            if (c3109a.equals((C3109a) obj3)) {
                                break;
                            }
                        }
                    }
                    z8 = true;
                    break loop2;
                }
                z8 = false;
                break;
            }
            if (!z8) {
                arrayList2.add(i8, new C3110b(i7, arrayList));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C3110b c3110b3 = (C3110b) it.next();
                    if (c3110b3.f15719a.size() != arrayList.size()) {
                        ArrayList arrayList5 = c3110b3.f15719a;
                        int size4 = arrayList5.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 < size4) {
                                Object obj4 = arrayList5.get(i13);
                                i13++;
                                if (!arrayList.contains((C3109a) obj4)) {
                                    break;
                                }
                            } else {
                                it.remove();
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (!isEmpty) {
            List m4812l = m4812l(false);
            if (m4812l != null) {
                return m4812l;
            }
            List m4812l2 = m4812l(true);
            if (m4812l2 != null) {
                return m4812l2;
            }
        }
        throw C0400j.m878a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0251, code lost:
    
        return new p142s4.C3109a(r10, r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x024b, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f8, code lost:
    
        r5 = r28.m3307f(r28.m3306e(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0203, code lost:
    
        r10 = m4813n(r28, r4, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0207, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0209, code lost:
    
        r5 = r19[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0211, code lost:
    
        if (r28.m3305d(r5) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0213, code lost:
    
        r5 = r28.m3306e(r28.m3307f(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021c, code lost:
    
        r5 = r28.m3307f(r28.m3306e(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01dc, code lost:
    
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01e2, code lost:
    
        throw p022c4.C0400j.m878a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0192, code lost:
    
        if (r4 <= r5) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e5, code lost:
    
        r5 = r19[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ed, code lost:
    
        if (r28.m3305d(r5) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ef, code lost:
    
        r5 = r28.m3306e(r28.m3307f(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x022b, code lost:
    
        if (r29.isEmpty() != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0245, code lost:
    
        throw p022c4.C0400j.m878a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0246, code lost:
    
        r8 = m4813n(r28, r4, r3, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0252 A[LOOP:0: B:8:0x001c->B:87:0x0252, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0227 A[SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3109a m4815q(C2068a c2068a, ArrayList arrayList, int i7) {
        boolean z7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int m3307f;
        int i13;
        int[] iArr2;
        C3051c c3051c;
        int m3307f2;
        int[] iArr3;
        int i14 = 2;
        int i15 = 0;
        int i16 = 1;
        if (arrayList.size() % 2 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f15730j) {
            z7 = !z7;
        }
        int i17 = -1;
        boolean z8 = true;
        C3050b c3050b = null;
        while (true) {
            int[] iArr4 = this.f15623a;
            iArr4[i15] = i15;
            iArr4[i16] = i15;
            iArr4[i14] = i15;
            int i18 = 3;
            iArr4[3] = i15;
            int i19 = c2068a.f12257f;
            if (i17 >= 0) {
                i8 = i17;
            } else if (arrayList.isEmpty()) {
                i8 = i15;
            } else {
                i8 = ((C3109a) arrayList.get(arrayList.size() - i16)).f15718c.f15632b[i16];
            }
            if (arrayList.size() % i14 != 0) {
                i9 = i16;
            } else {
                i9 = i15;
            }
            int i20 = i14;
            if (this.f15730j) {
                i9 ^= 1;
            }
            boolean z9 = i15;
            while (true) {
                if (i8 >= i19) {
                    break;
                }
                boolean m3305d = c2068a.m3305d(i8);
                boolean z10 = !m3305d;
                if (m3305d) {
                    z9 = z10;
                    break;
                }
                i8++;
                z9 = z10;
            }
            int i21 = i15;
            int i22 = i8;
            while (i8 < i19) {
                int i23 = i15;
                if (c2068a.m3305d(i8) != z9) {
                    iArr4[i21] = iArr4[i21] + i16;
                    i10 = i16;
                    i11 = i18;
                } else {
                    if (i21 == i18) {
                        if (i9 != 0) {
                            int length = iArr4.length;
                            i11 = i18;
                            int i24 = i23;
                            while (true) {
                                i12 = i16;
                                if (i24 >= length / 2) {
                                    break;
                                }
                                int i25 = iArr4[i24];
                                int i26 = (length - i24) - 1;
                                iArr4[i24] = iArr4[i26];
                                iArr4[i26] = i25;
                                i24++;
                                i16 = i12;
                            }
                        } else {
                            i12 = i16;
                            i11 = i18;
                        }
                        if (AbstractC3049a.m4727i(iArr4)) {
                            iArr = this.f15729i;
                            iArr[i23] = i22;
                            iArr[i12] = i8;
                            if (z7) {
                                int i27 = i22 - 1;
                                while (i27 >= 0 && !c2068a.m3305d(i27)) {
                                    i27--;
                                }
                                i22 = i27 + 1;
                                i13 = iArr[i23] - i22;
                                m3307f = iArr[i12];
                            } else {
                                m3307f = c2068a.m3307f(i8 + 1);
                                i13 = m3307f - iArr[i12];
                            }
                            int i28 = i22;
                            System.arraycopy(iArr4, i23, iArr4, i12, iArr4.length - 1);
                            iArr4[i23] = i13;
                            try {
                                int[][] iArr5 = f15724n;
                                int i29 = 0;
                                while (true) {
                                    if (i29 >= 6) {
                                        break;
                                    }
                                    if (AbstractC2993h.m4656d(iArr4, iArr5[i29], 0.45f) < 0.2f) {
                                        if (!arrayList.isEmpty()) {
                                            int i30 = 0;
                                            while (i30 < 10) {
                                                int[] iArr6 = f15726p[i30];
                                                if (arrayList.size() + 1 <= iArr6.length) {
                                                    int size = arrayList.size();
                                                    while (size < iArr6.length) {
                                                        if (iArr6[size] == i29) {
                                                            int i31 = 0;
                                                            while (i31 < arrayList.size()) {
                                                                iArr3 = iArr;
                                                                if (iArr6[(size - i31) - 1] == ((C3109a) arrayList.get((arrayList.size() - i31) - 1)).f15718c.f15631a) {
                                                                    i31++;
                                                                    iArr = iArr3;
                                                                }
                                                            }
                                                        } else {
                                                            iArr3 = iArr;
                                                        }
                                                        size++;
                                                        iArr = iArr3;
                                                        i29 = i29;
                                                        i28 = i28;
                                                        m3307f = m3307f;
                                                    }
                                                }
                                                i30++;
                                                iArr = iArr;
                                                i29 = i29;
                                                i28 = i28;
                                                m3307f = m3307f;
                                            }
                                        }
                                        iArr2 = iArr;
                                        if (!arrayList.isEmpty()) {
                                            int[] iArr7 = ((C3109a) arrayList.get(arrayList.size() - 1)).f15718c.f15632b;
                                            int i32 = iArr7[0];
                                            float f7 = ((r4 - i32) / 15.0f) * 17.0f;
                                            float f8 = iArr7[1];
                                            float f9 = f7 * 2.0f;
                                            float f10 = (0.9f * f9) + f8;
                                            float f11 = (f9 * 1.1f) + f8;
                                            float f12 = i28;
                                            if (f12 >= f10) {
                                            }
                                        }
                                        c3051c = new C3051c(i29, new int[]{i28, m3307f}, i28, m3307f, i7);
                                    } else {
                                        i29++;
                                    }
                                }
                            } catch (C0400j unused) {
                            }
                        } else {
                            if (i9 != 0) {
                                int length2 = iArr4.length;
                                for (int i33 = 0; i33 < length2 / 2; i33++) {
                                    int i34 = iArr4[i33];
                                    int i35 = (length2 - i33) - 1;
                                    iArr4[i33] = iArr4[i35];
                                    iArr4[i35] = i34;
                                }
                            }
                            i10 = 1;
                            i23 = 0;
                            i22 = iArr4[0] + iArr4[1] + i22;
                            iArr4[0] = iArr4[i20];
                            iArr4[1] = iArr4[i11];
                            iArr4[i20] = 0;
                            iArr4[i11] = 0;
                            i21--;
                        }
                    } else {
                        i10 = i16;
                        i11 = i18;
                        i21++;
                    }
                    iArr4[i21] = i10;
                    z9 = !z9;
                }
                i8++;
                i15 = i23;
                i18 = i11;
                i16 = i10;
            }
            throw C0400j.m878a();
            i14 = i20;
            i15 = 0;
            i16 = 1;
        }
        iArr2 = iArr;
        c3051c = null;
        if (c3051c != null) {
        }
        i17 = m3307f2;
        if (z8) {
        }
    }

    @Override // p126q4.AbstractC2993h, p022c4.InterfaceC0402l
    public final void reset() {
        this.f15727g.clear();
        this.f15728h.clear();
    }
}
