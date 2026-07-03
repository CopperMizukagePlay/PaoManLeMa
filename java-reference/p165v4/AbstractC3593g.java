package p165v4;

import java.util.Arrays;
import p001a0.C0031h1;
import p022c4.C0393c;
import p022c4.C0396f;
import p022c4.C0406p;
import p065i2.AbstractC2064e;
import p067i4.C2069b;
import p067i4.C2071d;
import p100n.C2673p1;
import p144t.AbstractC3122c;
import p157u4.AbstractC3355a;
import p172w3.C3781e;
import p173w4.C3783a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v4.g */
/* loaded from: classes.dex */
public abstract class AbstractC3593g {

    /* renamed from: a */
    public static final C2673p1 f17246a = new C2673p1(13);

    /* renamed from: a */
    public static C3589c m5587a(C3591e c3591e) {
        C0406p c0406p;
        C0406p c0406p2;
        int[] iArr;
        int i7;
        C0406p c0406p3;
        C0406p c0406p4;
        C0406p c0406p5;
        C0406p c0406p6;
        C0406p c0406p7;
        C0406p c0406p8;
        if (c3591e == null) {
            return null;
        }
        boolean z7 = c3591e.f17244h;
        C3589c c3589c = (C3589c) c3591e.f344f;
        C3587a[] c3587aArr = (C3587a[]) c3591e.f345g;
        C3587a m5585H = c3591e.m5585H();
        int i8 = -1;
        int i9 = 0;
        if (m5585H == null) {
            iArr = null;
        } else {
            int i10 = m5585H.f17230f;
            if (z7) {
                c0406p = c3589c.f17233b;
            } else {
                c0406p = c3589c.f17235d;
            }
            if (z7) {
                c0406p2 = c3589c.f17234c;
            } else {
                c0406p2 = c3589c.f17236e;
            }
            int m158y = c3591e.m158y((int) c0406p2.f1391b);
            int i11 = -1;
            int i12 = 1;
            int i13 = 0;
            for (int m158y2 = c3591e.m158y((int) c0406p.f1391b); m158y2 < m158y; m158y2++) {
                C3587a c3587a = c3587aArr[m158y2];
                if (c3587a != null) {
                    c3587a.m5578b();
                    int i14 = c3587a.f17230f;
                    int i15 = i14 - i11;
                    if (i15 == 0) {
                        i13++;
                    } else if (i15 == 1) {
                        i12 = Math.max(i12, i13);
                        i11 = c3587a.f17230f;
                        i13 = 1;
                    } else if (i14 >= i10) {
                        c3587aArr[m158y2] = null;
                    } else {
                        i13 = 1;
                        i11 = i14;
                    }
                }
            }
            iArr = new int[i10];
            for (C3587a c3587a2 : c3587aArr) {
                if (c3587a2 != null && (i7 = c3587a2.f17230f) < i10) {
                    iArr[i7] = iArr[i7] + 1;
                }
            }
        }
        if (iArr == null) {
            return null;
        }
        for (int i16 : iArr) {
            i8 = Math.max(i8, i16);
        }
        int i17 = 0;
        for (int i18 : iArr) {
            i17 += i8 - i18;
            if (i18 > 0) {
                break;
            }
        }
        for (int i19 = 0; i17 > 0 && c3587aArr[i19] == null; i19++) {
            i17--;
        }
        int i20 = 0;
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i21 = iArr[length];
            i20 += i8 - i21;
            if (i21 > 0) {
                break;
            }
        }
        for (int length2 = c3587aArr.length - 1; i20 > 0 && c3587aArr[length2] == null; length2--) {
            i20--;
        }
        C0406p c0406p9 = c3589c.f17233b;
        C0406p c0406p10 = c3589c.f17234c;
        C0406p c0406p11 = c3589c.f17235d;
        C0406p c0406p12 = c3589c.f17236e;
        if (i17 > 0) {
            if (z7) {
                c0406p8 = c0406p9;
            } else {
                c0406p8 = c0406p11;
            }
            int i22 = ((int) c0406p8.f1391b) - i17;
            if (i22 >= 0) {
                i9 = i22;
            }
            C0406p c0406p13 = new C0406p(c0406p8.f1390a, i9);
            if (z7) {
                c0406p4 = c0406p11;
                c0406p3 = c0406p13;
            } else {
                c0406p3 = c0406p9;
                c0406p4 = c0406p13;
            }
        } else {
            c0406p3 = c0406p9;
            c0406p4 = c0406p11;
        }
        if (i20 > 0) {
            if (z7) {
                c0406p7 = c0406p10;
            } else {
                c0406p7 = c0406p12;
            }
            int i23 = ((int) c0406p7.f1391b) + i20;
            int i24 = c3589c.f17232a.f12259f;
            if (i23 >= i24) {
                i23 = i24 - 1;
            }
            C0406p c0406p14 = new C0406p(c0406p7.f1390a, i23);
            if (z7) {
                c0406p5 = c0406p14;
            } else {
                c0406p5 = c0406p10;
                c0406p6 = c0406p14;
                return new C3589c(c3589c.f17232a, c0406p3, c0406p5, c0406p4, c0406p6);
            }
        } else {
            c0406p5 = c0406p10;
        }
        c0406p6 = c0406p12;
        return new C3589c(c3589c.f17232a, c0406p3, c0406p5, c0406p4, c0406p6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04c9, code lost:
    
        if (r10 == 924) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04cf, code lost:
    
        if (r6 >= r22[0]) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04d3, code lost:
    
        if (r22[r6] >= 900) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x04d5, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04d7, code lost:
    
        if (r8 >= 6) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04d9, code lost:
    
        ((java.lang.StringBuilder) r4.f152f).append((char) (((byte) (r14 >> ((5 - r8) * 8))) & 255));
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04ee, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x02f6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x02f9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x0378. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0464  */
    /* JADX WARN: Type inference failed for: r7v13, types: [u4.c, java.lang.Object] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2071d m5588b(int[] iArr, int i7, int[] iArr2) {
        int[] iArr3;
        int[] iArr4;
        int i8;
        int i9;
        int i10;
        C3781e c3781e;
        C3781e c3781e2;
        StringBuilder sb;
        int i11;
        int i12;
        int i13;
        char c7;
        int i14;
        int i15;
        int i16;
        if (iArr.length != 0) {
            int i17 = 1;
            int i18 = 1 << (i7 + 1);
            if (iArr2.length <= (i18 / 2) + 3 && i18 >= 0 && i18 <= 512) {
                C3783a c3783a = (C3783a) f17246a.f14390f;
                if (iArr.length != 0) {
                    int length = iArr.length;
                    int i19 = 0;
                    if (length > 1 && iArr[0] == 0) {
                        int i20 = 1;
                        while (i20 < length && iArr[i20] == 0) {
                            i20++;
                        }
                        if (i20 == length) {
                            iArr3 = new int[]{0};
                        } else {
                            int i21 = length - i20;
                            int[] iArr5 = new int[i21];
                            System.arraycopy(iArr, i20, iArr5, 0, i21);
                            iArr3 = iArr5;
                        }
                    } else {
                        iArr3 = iArr;
                    }
                    int[] iArr6 = new int[i18];
                    boolean z7 = false;
                    for (int i22 = i18; i22 > 0; i22--) {
                        int i23 = c3783a.f17920a[i22];
                        if (i23 == 0) {
                            i16 = iArr3[iArr3.length - 1];
                        } else {
                            if (i23 == 1) {
                                i15 = 0;
                                for (int i24 : iArr3) {
                                    i15 = c3783a.m5790a(i15, i24);
                                }
                            } else {
                                i15 = iArr3[0];
                                int length2 = iArr3.length;
                                for (int i25 = 1; i25 < length2; i25++) {
                                    i15 = c3783a.m5790a(c3783a.m5792c(i23, i15), iArr3[i25]);
                                }
                            }
                            i16 = i15;
                        }
                        iArr6[i18 - i22] = i16;
                        if (i16 != 0) {
                            z7 = true;
                        }
                    }
                    if (!z7) {
                        i9 = 0;
                    } else {
                        C3781e c3781e3 = c3783a.f17923d;
                        C3781e c3781e4 = c3783a.f17922c;
                        for (int i26 : iArr2) {
                            c3781e3 = c3781e3.m5783h(new C3781e(c3783a, new int[]{(929 - c3783a.f17920a[(iArr.length - 1) - i26]) % 929, 1}));
                        }
                        C3781e c3781e5 = new C3781e(c3783a, iArr6);
                        if (i18 >= 0) {
                            int[] iArr7 = new int[i18 + 1];
                            iArr7[0] = 1;
                            C3781e c3781e6 = new C3781e(c3783a, iArr7);
                            if (c3781e6.m5780e() >= c3781e5.m5780e()) {
                                c3781e6 = c3781e5;
                                c3781e5 = c3781e6;
                            }
                            C3781e c3781e7 = c3781e5;
                            C3781e c3781e8 = c3781e6;
                            C3781e c3781e9 = c3783a.f17923d;
                            C3781e c3781e10 = c3781e4;
                            while (c3781e8.m5780e() >= i18 / 2) {
                                if (!c3781e8.m5781f()) {
                                    int m5791b = c3783a.m5791b(c3781e8.m5779d(c3781e8.m5780e()));
                                    C3781e c3781e11 = c3781e4;
                                    while (c3781e7.m5780e() >= c3781e8.m5780e() && !c3781e7.m5781f()) {
                                        int m5780e = c3781e7.m5780e() - c3781e8.m5780e();
                                        int m5792c = c3783a.m5792c(c3781e7.m5779d(c3781e7.m5780e()), m5791b);
                                        if (m5780e >= 0) {
                                            if (m5792c == 0) {
                                                i10 = i17;
                                                c3781e = c3781e4;
                                            } else {
                                                i10 = i17;
                                                int[] iArr8 = new int[m5780e + 1];
                                                iArr8[i19] = m5792c;
                                                c3781e = new C3781e(c3783a, iArr8);
                                            }
                                            c3781e11 = c3781e11.m5776a(c3781e);
                                            int[] iArr9 = (int[]) c3781e8.f17918c;
                                            C3783a c3783a2 = (C3783a) c3781e8.f17917b;
                                            if (m5780e >= 0) {
                                                if (m5792c == 0) {
                                                    c3781e2 = c3783a2.f17922c;
                                                } else {
                                                    int length3 = iArr9.length;
                                                    int[] iArr10 = new int[m5780e + length3];
                                                    int i27 = 0;
                                                    while (i27 < length3) {
                                                        int i28 = i27;
                                                        iArr10[i28] = c3783a2.m5792c(iArr9[i28], m5792c);
                                                        i27 = i28 + 1;
                                                    }
                                                    c3781e2 = new C3781e(c3783a2, iArr10);
                                                }
                                                c3781e7 = c3781e7.m5789n(c3781e2);
                                                i17 = i10;
                                                i19 = 0;
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                    int i29 = i17;
                                    C3781e m5789n = c3781e11.m5783h(c3781e9).m5789n(c3781e10);
                                    C3783a c3783a3 = (C3783a) m5789n.f17917b;
                                    int[] iArr11 = (int[]) m5789n.f17918c;
                                    int length4 = iArr11.length;
                                    int[] iArr12 = new int[length4];
                                    for (int i30 = 0; i30 < length4; i30++) {
                                        int i31 = iArr11[i30];
                                        c3783a3.getClass();
                                        iArr12[i30] = (929 - i31) % 929;
                                    }
                                    C3781e c3781e12 = new C3781e(c3783a3, iArr12);
                                    C3781e c3781e13 = c3781e7;
                                    c3781e7 = c3781e8;
                                    c3781e8 = c3781e13;
                                    c3781e10 = c3781e9;
                                    i19 = 0;
                                    c3781e9 = c3781e12;
                                    i17 = i29;
                                } else {
                                    throw C0393c.m867a();
                                }
                            }
                            int i32 = i17;
                            int i33 = i19;
                            int m5779d = c3781e9.m5779d(i33);
                            if (m5779d != 0) {
                                int m5791b2 = c3783a.m5791b(m5779d);
                                C3781e[] c3781eArr = {c3781e9.m5782g(m5791b2), c3781e8.m5782g(m5791b2)};
                                C3781e c3781e14 = c3781eArr[i33];
                                C3781e c3781e15 = c3781eArr[i32];
                                int m5780e2 = c3781e14.m5780e();
                                int[] iArr13 = new int[m5780e2];
                                int i34 = 0;
                                for (int i35 = i32; i35 < 929 && i34 < m5780e2; i35++) {
                                    if (c3781e14.m5778c(i35) == 0) {
                                        iArr13[i34] = c3783a.m5791b(i35);
                                        i34++;
                                    }
                                }
                                if (i34 == m5780e2) {
                                    int m5780e3 = c3781e14.m5780e();
                                    if (m5780e3 < i32) {
                                        iArr4 = new int[0];
                                    } else {
                                        int[] iArr14 = new int[m5780e3];
                                        for (int i36 = 1; i36 <= m5780e3; i36++) {
                                            iArr14[m5780e3 - i36] = c3783a.m5792c(i36, c3781e14.m5779d(i36));
                                        }
                                        if (m5780e3 != 0) {
                                            if (m5780e3 > 1 && iArr14[0] == 0) {
                                                int i37 = 1;
                                                while (i37 < m5780e3 && iArr14[i37] == 0) {
                                                    i37++;
                                                }
                                                if (i37 == m5780e3) {
                                                    iArr14 = new int[]{0};
                                                } else {
                                                    int i38 = m5780e3 - i37;
                                                    int[] iArr15 = new int[i38];
                                                    System.arraycopy(iArr14, i37, iArr15, 0, i38);
                                                    iArr14 = iArr15;
                                                }
                                            }
                                            int[] iArr16 = new int[m5780e2];
                                            for (int i39 = 0; i39 < m5780e2; i39++) {
                                                int m5791b3 = c3783a.m5791b(iArr13[i39]);
                                                int m5778c = (929 - c3781e15.m5778c(m5791b3)) % 929;
                                                if (m5791b3 == 0) {
                                                    i8 = iArr14[iArr14.length - 1];
                                                } else if (m5791b3 == 1) {
                                                    int i40 = 0;
                                                    for (int i41 : iArr14) {
                                                        i40 = c3783a.m5790a(i40, i41);
                                                    }
                                                    i8 = i40;
                                                } else {
                                                    int i42 = iArr14[0];
                                                    int length5 = iArr14.length;
                                                    for (int i43 = 1; i43 < length5; i43++) {
                                                        i42 = c3783a.m5790a(c3783a.m5792c(m5791b3, i42), iArr14[i43]);
                                                    }
                                                    i8 = i42;
                                                }
                                                iArr16[i39] = c3783a.m5792c(m5778c, c3783a.m5791b(i8));
                                            }
                                            iArr4 = iArr16;
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                    for (int i44 = 0; i44 < m5780e2; i44++) {
                                        int length6 = iArr.length - 1;
                                        int i45 = iArr13[i44];
                                        if (i45 != 0) {
                                            int i46 = length6 - c3783a.f17921b[i45];
                                            if (i46 >= 0) {
                                                iArr[i46] = ((929 + iArr[i46]) - iArr4[i44]) % 929;
                                            } else {
                                                throw C0393c.m867a();
                                            }
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                    i9 = m5780e2;
                                } else {
                                    throw C0393c.m867a();
                                }
                            } else {
                                throw C0393c.m867a();
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    if (iArr.length >= 4) {
                        int i47 = iArr[0];
                        if (i47 <= iArr.length) {
                            if (i47 == 0) {
                                if (i18 < iArr.length) {
                                    iArr[0] = iArr.length - i18;
                                } else {
                                    throw C0396f.m868a();
                                }
                            }
                            String valueOf = String.valueOf(i7);
                            char[] cArr = AbstractC3590d.f17241a;
                            int i48 = 2;
                            C0031h1 c0031h1 = new C0031h1(iArr.length * 2);
                            int m5584d = AbstractC3590d.m5584d(iArr, 1, c0031h1);
                            ?? obj = new Object();
                            char c8 = 0;
                            while (true) {
                                int i49 = iArr[c8];
                                if (m5584d < i49) {
                                    int i50 = m5584d + 1;
                                    int i51 = iArr[m5584d];
                                    if (i51 != 913) {
                                        switch (i51) {
                                            case 900:
                                                c8 = 0;
                                                m5584d = AbstractC3590d.m5584d(iArr, i50, c0031h1);
                                                break;
                                            case 901:
                                                boolean z8 = false;
                                                c8 = 0;
                                                while (i50 < iArr[c8] && !z8) {
                                                    while (true) {
                                                        i11 = iArr[c8];
                                                        if (i50 < i11 && iArr[i50] == 927) {
                                                            c0031h1.m98k(iArr[i50 + 1]);
                                                            i50 += 2;
                                                            c8 = 0;
                                                        }
                                                    }
                                                    if (i50 >= i11 || iArr[i50] >= 900) {
                                                        c8 = 0;
                                                        z8 = true;
                                                    } else {
                                                        long j6 = 0;
                                                        int i52 = 0;
                                                        while (true) {
                                                            i12 = i50 + 1;
                                                            j6 = (j6 * 900) + iArr[i50];
                                                            i52++;
                                                            if (i52 < 5 && i12 < iArr[0] && iArr[i12] < 900) {
                                                                i50 = i12;
                                                            }
                                                        }
                                                        i12 -= i52;
                                                        boolean z9 = z8;
                                                        c8 = 0;
                                                        while (i12 < iArr[0] && !z9) {
                                                            int i53 = i12 + 1;
                                                            int i54 = iArr[i12];
                                                            if (i54 < 900) {
                                                                ((StringBuilder) c0031h1.f152f).append((char) (((byte) i54) & 255));
                                                                i12 = i53;
                                                            } else if (i54 == 927) {
                                                                i12 += 2;
                                                                c0031h1.m98k(iArr[i53]);
                                                            } else {
                                                                z9 = true;
                                                            }
                                                        }
                                                        z8 = z9;
                                                        i50 = i12;
                                                    }
                                                }
                                                m5584d = i50;
                                                break;
                                            case 902:
                                                m5584d = AbstractC3590d.m5583c(iArr, i50, c0031h1);
                                                c8 = 0;
                                                break;
                                            default:
                                                switch (i51) {
                                                    case 922:
                                                    case 923:
                                                        throw C0396f.m868a();
                                                    case 924:
                                                        break;
                                                    case 925:
                                                        m5584d += 2;
                                                        c8 = 0;
                                                        break;
                                                    case 926:
                                                        m5584d += 3;
                                                        c8 = 0;
                                                        break;
                                                    case 927:
                                                        m5584d += 2;
                                                        c0031h1.m98k(iArr[i50]);
                                                        c8 = 0;
                                                        break;
                                                    case 928:
                                                        if (m5584d + 3 <= i49) {
                                                            int[] iArr17 = new int[i48];
                                                            int i55 = 0;
                                                            while (i55 < i48) {
                                                                iArr17[i55] = iArr[i50];
                                                                i55++;
                                                                i50++;
                                                            }
                                                            String m5581a = AbstractC3590d.m5581a(iArr17, i48);
                                                            if (!m5581a.isEmpty()) {
                                                                try {
                                                                    Integer.parseInt(m5581a);
                                                                } catch (NumberFormatException unused) {
                                                                    throw C0396f.m868a();
                                                                }
                                                            }
                                                            StringBuilder sb2 = new StringBuilder();
                                                            while (i50 < iArr[0] && i50 < iArr.length && (i14 = iArr[i50]) != 922 && i14 != 923) {
                                                                sb2.append(String.format("%03d", Integer.valueOf(i14)));
                                                                i50++;
                                                            }
                                                            if (sb2.length() != 0) {
                                                                obj.f16421a = sb2.toString();
                                                                if (iArr[i50] == 923) {
                                                                    i13 = i50 + 1;
                                                                } else {
                                                                    i13 = -1;
                                                                }
                                                                while (true) {
                                                                    char c9 = 0;
                                                                    while (i50 < iArr[c9]) {
                                                                        int i56 = iArr[i50];
                                                                        if (i56 != 922) {
                                                                            if (i56 == 923) {
                                                                                switch (iArr[i50 + 1]) {
                                                                                    case 0:
                                                                                        C0031h1 c0031h12 = new C0031h1(3, (byte) 0);
                                                                                        i50 = AbstractC3590d.m5584d(iArr, i50 + 2, c0031h12);
                                                                                        c0031h12.toString();
                                                                                        break;
                                                                                    case 1:
                                                                                        C0031h1 c0031h13 = new C0031h1(3, (byte) 0);
                                                                                        i50 = AbstractC3590d.m5583c(iArr, i50 + 2, c0031h13);
                                                                                        try {
                                                                                            Integer.parseInt(c0031h13.toString());
                                                                                            break;
                                                                                        } catch (NumberFormatException unused2) {
                                                                                            throw C0396f.m868a();
                                                                                        }
                                                                                    case 2:
                                                                                        C0031h1 c0031h14 = new C0031h1(3, (byte) 0);
                                                                                        i50 = AbstractC3590d.m5583c(iArr, i50 + 2, c0031h14);
                                                                                        try {
                                                                                            Long.parseLong(c0031h14.toString());
                                                                                            break;
                                                                                        } catch (NumberFormatException unused3) {
                                                                                            throw C0396f.m868a();
                                                                                        }
                                                                                    case 3:
                                                                                        c7 = 0;
                                                                                        C0031h1 c0031h15 = new C0031h1(3, (byte) 0);
                                                                                        i50 = AbstractC3590d.m5584d(iArr, i50 + 2, c0031h15);
                                                                                        c0031h15.toString();
                                                                                        c9 = c7;
                                                                                    case 4:
                                                                                        c7 = 0;
                                                                                        C0031h1 c0031h16 = new C0031h1(3, (byte) 0);
                                                                                        i50 = AbstractC3590d.m5584d(iArr, i50 + 2, c0031h16);
                                                                                        c0031h16.toString();
                                                                                        c9 = c7;
                                                                                    case AbstractC3122c.f15761f /* 5 */:
                                                                                        C0031h1 c0031h17 = new C0031h1(3, (byte) 0);
                                                                                        i50 = AbstractC3590d.m5583c(iArr, i50 + 2, c0031h17);
                                                                                        try {
                                                                                            Long.parseLong(c0031h17.toString());
                                                                                            break;
                                                                                        } catch (NumberFormatException unused4) {
                                                                                            throw C0396f.m868a();
                                                                                        }
                                                                                    case AbstractC3122c.f15759d /* 6 */:
                                                                                        C0031h1 c0031h18 = new C0031h1(3, (byte) 0);
                                                                                        i50 = AbstractC3590d.m5583c(iArr, i50 + 2, c0031h18);
                                                                                        try {
                                                                                            Integer.parseInt(c0031h18.toString());
                                                                                            break;
                                                                                        } catch (NumberFormatException unused5) {
                                                                                            throw C0396f.m868a();
                                                                                        }
                                                                                    default:
                                                                                        throw C0396f.m868a();
                                                                                }
                                                                            } else {
                                                                                throw C0396f.m868a();
                                                                            }
                                                                        } else {
                                                                            i50++;
                                                                            obj.f16422b = true;
                                                                        }
                                                                    }
                                                                    if (i13 != -1) {
                                                                        int i57 = i50 - i13;
                                                                        if (obj.f16422b) {
                                                                            i57--;
                                                                        }
                                                                        if (i57 > 0) {
                                                                            Arrays.copyOfRange(iArr, i13, i57 + i13);
                                                                        }
                                                                    }
                                                                    m5584d = i50;
                                                                    break;
                                                                }
                                                            } else {
                                                                throw C0396f.m868a();
                                                            }
                                                        } else {
                                                            throw C0396f.m868a();
                                                        }
                                                    default:
                                                        m5584d = AbstractC3590d.m5584d(iArr, m5584d, c0031h1);
                                                        c8 = 0;
                                                        break;
                                                }
                                        }
                                    } else {
                                        c8 = 0;
                                        m5584d += 2;
                                        c0031h1.m90c((char) iArr[i50]);
                                    }
                                    i48 = 2;
                                } else {
                                    if (((StringBuilder) c0031h1.f152f).length() == 0 && (((sb = (StringBuilder) c0031h1.f153g) == null || sb.length() == 0) && obj.f16421a == null)) {
                                        throw C0396f.m868a();
                                    }
                                    C2071d c2071d = new C2071d(c0031h1.toString(), valueOf, null);
                                    c2071d.f12276j = obj;
                                    c2071d.f12274h = Integer.valueOf(i9);
                                    c2071d.f12275i = Integer.valueOf(iArr2.length);
                                    return c2071d;
                                }
                            }
                        } else {
                            throw C0396f.m868a();
                        }
                    } else {
                        throw C0396f.m868a();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw C0393c.m867a();
            }
        } else {
            throw C0396f.m868a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0032, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060 A[EDGE_INSN: B:32:0x0060->B:33:0x0060 BREAK  A[LOOP:2: B:20:0x0045->B:28:0x0045], SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3587a m5589c(C2069b c2069b, int i7, int i8, boolean z7, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = i7;
        if (z7) {
            i13 = -1;
        } else {
            i13 = 1;
        }
        boolean z8 = z7;
        int i20 = i9;
        int i21 = 0;
        loop0: while (true) {
            if (i21 >= 2) {
                break;
            }
            while (true) {
                if (z8) {
                    if (i20 < i19) {
                        break;
                    }
                    if (z8 != c2069b.m3313b(i20, i10)) {
                        if (Math.abs(i9 - i20) > 2) {
                            i20 = i9;
                            break loop0;
                        }
                        i20 += i13;
                    }
                } else {
                    if (i20 >= i8) {
                        break;
                    }
                    if (z8 != c2069b.m3313b(i20, i10)) {
                        break;
                    }
                }
            }
            i13 = -i13;
            z8 = !z8;
            i21++;
        }
        int[] iArr = new int[8];
        if (z7) {
            i14 = 1;
        } else {
            i14 = -1;
        }
        boolean z9 = z7;
        int i22 = 0;
        int i23 = i20;
        while (true) {
            if (z7) {
                if (i23 >= i8) {
                    break;
                }
                if (i22 < 8) {
                    break;
                }
                if (c2069b.m3313b(i23, i10) == z9) {
                    iArr[i22] = iArr[i22] + 1;
                    i23 += i14;
                } else {
                    i22++;
                    z9 = !z9;
                }
            } else {
                if (i23 < i19) {
                    break;
                }
                if (i22 < 8) {
                }
            }
        }
        if (i22 != 8) {
            if (z7) {
                i19 = i8;
            }
            if (i23 != i19 || i22 != 7) {
                iArr = null;
            }
        }
        if (iArr != null) {
            int m3226G = AbstractC2064e.m3226G(iArr);
            if (z7) {
                i15 = i20 + m3226G;
            } else {
                for (int i24 = 0; i24 < iArr.length / 2; i24++) {
                    int i25 = iArr[i24];
                    iArr[i24] = iArr[(iArr.length - 1) - i24];
                    iArr[(iArr.length - 1) - i24] = i25;
                }
                int i26 = i20;
                i20 -= m3226G;
                i15 = i26;
            }
            if (i11 - 2 <= m3226G && m3226G <= i12 + 2) {
                float[][] fArr = AbstractC3592f.f17245a;
                float m3226G2 = AbstractC2064e.m3226G(iArr);
                int[] iArr2 = new int[8];
                int i27 = 0;
                int i28 = 0;
                for (int i29 = 0; i29 < 17; i29++) {
                    float f7 = ((i29 * m3226G2) / 17.0f) + (m3226G2 / 34.0f);
                    int i30 = iArr[i28] + i27;
                    if (i30 <= f7) {
                        i28++;
                        i27 = i30;
                    }
                    iArr2[i28] = iArr2[i28] + 1;
                }
                long j6 = 0;
                for (int i31 = 0; i31 < 8; i31++) {
                    for (int i32 = 0; i32 < iArr2[i31]; i32++) {
                        long j7 = j6 << 1;
                        if (i31 % 2 == 0) {
                            i18 = 1;
                        } else {
                            i18 = 0;
                        }
                        j6 = j7 | i18;
                    }
                }
                int i33 = (int) j6;
                int i34 = 262143;
                int[] iArr3 = AbstractC3355a.f16418b;
                int binarySearch = Arrays.binarySearch(iArr3, i33 & 262143);
                int[] iArr4 = AbstractC3355a.f16419c;
                if (binarySearch < 0) {
                    i16 = -1;
                } else {
                    i16 = (iArr4[binarySearch] - 1) % 929;
                }
                if (i16 == -1) {
                    i33 = -1;
                }
                if (i33 == -1) {
                    int m3226G3 = AbstractC2064e.m3226G(iArr);
                    float[] fArr2 = new float[8];
                    if (m3226G3 > 1) {
                        for (int i35 = 0; i35 < 8; i35++) {
                            fArr2[i35] = iArr[i35] / m3226G3;
                        }
                    }
                    float f8 = Float.MAX_VALUE;
                    i33 = -1;
                    int i36 = 0;
                    while (true) {
                        float[][] fArr3 = AbstractC3592f.f17245a;
                        if (i36 >= fArr3.length) {
                            break;
                        }
                        float[] fArr4 = fArr3[i36];
                        float f9 = 0.0f;
                        int i37 = i34;
                        for (int i38 = 0; i38 < 8; i38++) {
                            float f10 = fArr4[i38] - fArr2[i38];
                            f9 = (f10 * f10) + f9;
                            if (f9 >= f8) {
                                break;
                            }
                        }
                        if (f9 < f8) {
                            i33 = iArr3[i36];
                            f8 = f9;
                        }
                        i36++;
                        i34 = i37;
                    }
                }
                int binarySearch2 = Arrays.binarySearch(iArr3, i33 & i34);
                if (binarySearch2 < 0) {
                    i17 = -1;
                } else {
                    i17 = (iArr4[binarySearch2] - 1) % 929;
                }
                if (i17 == -1) {
                    return null;
                }
                int[] iArr5 = new int[8];
                int i39 = 0;
                int i40 = 7;
                while (true) {
                    int i41 = i33 & 1;
                    if (i41 != i39) {
                        i40--;
                        if (i40 < 0) {
                            return new C3587a(i20, i15, ((((iArr5[0] - iArr5[2]) + iArr5[4]) - iArr5[6]) + 9) % 9, i17, 1);
                        }
                        i39 = i41;
                    }
                    iArr5[i40] = iArr5[i40] + 1;
                    i33 >>= 1;
                    C3587a c3587a = c3587a;
                    i17 = i17;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static C3591e m5590d(C2069b c2069b, C3589c c3589c, C0406p c0406p, boolean z7, int i7, int i8) {
        int i9;
        int i10;
        boolean z8 = z7;
        C3591e c3591e = new C3591e(c3589c, z7);
        int i11 = 0;
        while (i11 < 2) {
            if (i11 == 0) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            int i12 = i9;
            int i13 = (int) c0406p.f1390a;
            int i14 = (int) c0406p.f1391b;
            while (i14 <= c3589c.f17240i && i14 >= c3589c.f17239h) {
                C3587a m5589c = m5589c(c2069b, 0, c2069b.f12258e, z8, i13, i14, i7, i8);
                if (m5589c != null) {
                    ((C3587a[]) c3591e.f345g)[c3591e.m158y(i14)] = m5589c;
                    if (z7) {
                        i10 = m5589c.f17226b;
                    } else {
                        i10 = m5589c.f17227c;
                    }
                    i13 = i10;
                }
                i14 += i12;
                z8 = z7;
            }
            i11++;
            z8 = z7;
        }
        return c3591e;
    }
}
