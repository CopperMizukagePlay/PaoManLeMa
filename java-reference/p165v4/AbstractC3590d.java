package p165v4;

import java.math.BigInteger;
import p001a0.C0031h1;
import p022c4.C0396f;
import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v4.d */
/* loaded from: classes.dex */
public abstract class AbstractC3590d {

    /* renamed from: a */
    public static final char[] f17241a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    public static final char[] f17242b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    public static final BigInteger[] f17243c;

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f17243c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i7 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f17243c;
            if (i7 < bigIntegerArr2.length) {
                bigIntegerArr2[i7] = bigIntegerArr2[i7 - 1].multiply(valueOf);
                i7++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static String m5581a(int[] iArr, int i7) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i8 = 0; i8 < i7; i8++) {
            bigInteger = bigInteger.add(f17243c[(i7 - i8) - 1].multiply(BigInteger.valueOf(iArr[i8])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C0396f.m868a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x0084. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x00c8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m5582b(int[] iArr, int[] iArr2, int i7, C0031h1 c0031h1, int i8) {
        int i9;
        char c7;
        char c8;
        int i10;
        int i11 = i8;
        int i12 = i11;
        int i13 = i12;
        for (int i14 = 0; i14 < i7; i14++) {
            int i15 = iArr[i14];
            int m4257c = AbstractC2647h.m4257c(i12);
            if (m4257c != 0) {
                if (m4257c != 1) {
                    if (m4257c != 2) {
                        char[] cArr = f17241a;
                        if (m4257c != 3) {
                            if (m4257c != 4) {
                                if (m4257c == 5) {
                                    if (i15 < 29) {
                                        c7 = cArr[i15];
                                    } else if (i15 != 29 && i15 != 900) {
                                        if (i15 == 913) {
                                            c0031h1.m90c((char) iArr2[i14]);
                                        }
                                        i12 = i13;
                                    } else {
                                        c7 = 0;
                                        i12 = 1;
                                    }
                                }
                                c7 = 0;
                            } else if (i15 < 26) {
                                c7 = (char) (i15 + 65);
                            } else {
                                if (i15 != 26) {
                                    if (i15 != 900) {
                                        i10 = i13;
                                    } else {
                                        i10 = 1;
                                    }
                                    c8 = 0;
                                } else {
                                    i10 = i13;
                                    c8 = ' ';
                                }
                                i12 = i10;
                            }
                            i12 = i13;
                        } else if (i15 < 29) {
                            c7 = cArr[i15];
                        } else {
                            if (i15 != 29 && i15 != 900) {
                                if (i15 == 913) {
                                    c0031h1.m90c((char) iArr2[i14]);
                                }
                            } else {
                                i11 = 1;
                                i12 = 1;
                            }
                            c7 = 0;
                        }
                    } else if (i15 < 25) {
                        c7 = f17242b[i15];
                    } else {
                        if (i15 != 900) {
                            if (i15 != 913) {
                                switch (i15) {
                                    case 25:
                                        i11 = 4;
                                        i12 = i11;
                                    case 26:
                                        c8 = ' ';
                                        break;
                                    case 27:
                                        i11 = 2;
                                        i12 = i11;
                                    case 29:
                                        i13 = i12;
                                        i12 = 6;
                                }
                            } else {
                                c0031h1.m90c((char) iArr2[i14]);
                            }
                            c8 = 0;
                        }
                        i11 = 1;
                        i12 = 1;
                        c8 = 0;
                    }
                } else if (i15 < 26) {
                    i9 = i15 + 97;
                    c7 = (char) i9;
                } else {
                    if (i15 != 900) {
                        if (i15 != 913) {
                            switch (i15) {
                                case 27:
                                    i13 = i12;
                                    i12 = 5;
                                case 28:
                                    i11 = 3;
                                    i12 = 3;
                                case 29:
                                    i13 = i12;
                                    i12 = 6;
                            }
                        } else {
                            c0031h1.m90c((char) iArr2[i14]);
                        }
                    } else {
                        i11 = 1;
                        i12 = 1;
                    }
                    c8 = 0;
                }
                c7 = c8;
            } else if (i15 < 26) {
                i9 = i15 + 65;
                c7 = (char) i9;
            } else {
                if (i15 != 900) {
                    if (i15 != 913) {
                        switch (i15) {
                            case 26:
                                break;
                            case 27:
                                i11 = 2;
                                i12 = i11;
                            case 28:
                                i11 = 3;
                                i12 = i11;
                            case 29:
                                i13 = i12;
                                i12 = 6;
                            default:
                                c8 = 0;
                                break;
                        }
                        c7 = c8;
                    } else {
                        c0031h1.m90c((char) iArr2[i14]);
                    }
                } else {
                    i11 = 1;
                    i12 = 1;
                }
                c8 = 0;
                c7 = c8;
            }
            if (c7 != 0) {
                c0031h1.m90c(c7);
            }
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        ((java.lang.StringBuilder) r10.f152f).append(m5581a(r0, r3));
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m5583c(int[] iArr, int i7, C0031h1 c0031h1) {
        int[] iArr2 = new int[15];
        boolean z7 = false;
        int i8 = 0;
        while (true) {
            int i9 = iArr[0];
            if (i7 < i9 && !z7) {
                int i10 = i7 + 1;
                int i11 = iArr[i7];
                if (i10 == i9) {
                    z7 = true;
                }
                if (i11 < 900) {
                    iArr2[i8] = i11;
                    i8++;
                } else {
                    if (i11 != 900 && i11 != 901 && i11 != 927 && i11 != 928) {
                        switch (i11) {
                        }
                        if (i8 % 15 == 0 || i11 == 902 || z7) {
                        }
                    }
                    z7 = true;
                    if (i8 % 15 == 0) {
                    }
                }
                i7 = i10;
                if (i8 % 15 == 0) {
                }
            }
        }
        return i7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0036. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0039. Please report as an issue. */
    /* renamed from: d */
    public static int m5584d(int[] iArr, int i7, C0031h1 c0031h1) {
        int i8 = (iArr[0] - i7) * 2;
        int[] iArr2 = new int[i8];
        int[] iArr3 = new int[i8];
        boolean z7 = false;
        int i9 = 0;
        int i10 = 1;
        while (i7 < iArr[0] && !z7) {
            int i11 = i7 + 1;
            int i12 = iArr[i7];
            if (i12 < 900) {
                iArr2[i9] = i12 / 30;
                iArr2[i9 + 1] = i12 % 30;
                i9 += 2;
            } else if (i12 != 913) {
                if (i12 != 927) {
                    if (i12 != 928) {
                        switch (i12) {
                            case 900:
                                iArr2[i9] = 900;
                                i9++;
                                break;
                            case 901:
                            case 902:
                                break;
                            default:
                                switch (i12) {
                                }
                        }
                    }
                    z7 = true;
                } else {
                    i10 = m5582b(iArr2, iArr3, i9, c0031h1, i10);
                    i7 += 2;
                    c0031h1.m98k(iArr[i11]);
                    int i13 = iArr[0];
                    if (i7 <= i13) {
                        int i14 = (i13 - i7) * 2;
                        iArr2 = new int[i14];
                        iArr3 = new int[i14];
                        i9 = 0;
                    } else {
                        throw C0396f.m868a();
                    }
                }
            } else {
                iArr2[i9] = 913;
                i7 += 2;
                iArr3[i9] = iArr[i11];
                i9++;
            }
            i7 = i11;
        }
        m5582b(iArr2, iArr3, i9, c0031h1, i10);
        return i7;
    }
}
