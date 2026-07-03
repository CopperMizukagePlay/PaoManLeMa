package p060h5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p174w5.AbstractC3784a;
import p195z5.C3877b;
import p195z5.C3879d;

/* renamed from: h5.l */
/* loaded from: classes.dex */
public abstract class AbstractC1804l extends AbstractC3393k {
    /* renamed from: C */
    public static List m3010C(Object[] objArr) {
        AbstractC3367j.m5100e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        AbstractC3367j.m5099d(asList, "asList(...)");
        return asList;
    }

    /* renamed from: D */
    public static boolean m3011D(char[] cArr, char c7) {
        int length = cArr.length;
        int i7 = 0;
        while (true) {
            if (i7 < length) {
                if (c7 == cArr[i7]) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public static boolean m3012E(Object[] objArr, Object obj) {
        AbstractC3367j.m5100e(objArr, "<this>");
        if (m3028U(objArr, obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public static void m3013F(int i7, int i8, int i9, byte[] bArr, byte[] bArr2) {
        AbstractC3367j.m5100e(bArr, "<this>");
        AbstractC3367j.m5100e(bArr2, "destination");
        System.arraycopy(bArr, i8, bArr2, i7, i9 - i8);
    }

    /* renamed from: G */
    public static void m3014G(char[] cArr, char[] cArr2, int i7, int i8, int i9) {
        AbstractC3367j.m5100e(cArr, "<this>");
        AbstractC3367j.m5100e(cArr2, "destination");
        System.arraycopy(cArr, i8, cArr2, i7, i9 - i8);
    }

    /* renamed from: H */
    public static void m3015H(int[] iArr, int[] iArr2, int i7, int i8, int i9) {
        AbstractC3367j.m5100e(iArr, "<this>");
        AbstractC3367j.m5100e(iArr2, "destination");
        System.arraycopy(iArr, i8, iArr2, i7, i9 - i8);
    }

    /* renamed from: I */
    public static void m3016I(long[] jArr, long[] jArr2, int i7, int i8, int i9) {
        AbstractC3367j.m5100e(jArr, "<this>");
        AbstractC3367j.m5100e(jArr2, "destination");
        System.arraycopy(jArr, i8, jArr2, i7, i9 - i8);
    }

    /* renamed from: J */
    public static void m3017J(Object[] objArr, Object[] objArr2, int i7, int i8, int i9) {
        AbstractC3367j.m5100e(objArr, "<this>");
        AbstractC3367j.m5100e(objArr2, "destination");
        System.arraycopy(objArr, i8, objArr2, i7, i9 - i8);
    }

    /* renamed from: K */
    public static /* synthetic */ void m3018K(byte[] bArr, byte[] bArr2, int i7, int i8, int i9, int i10) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = bArr.length;
        }
        m3013F(i7, i8, i9, bArr, bArr2);
    }

    /* renamed from: L */
    public static /* synthetic */ void m3019L(int[] iArr, int[] iArr2, int i7, int i8, int i9) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = iArr.length;
        }
        m3015H(iArr, iArr2, i7, 0, i8);
    }

    /* renamed from: M */
    public static /* synthetic */ void m3020M(Object[] objArr, Object[] objArr2, int i7, int i8, int i9) {
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        m3017J(objArr, objArr2, 0, i7, i8);
    }

    /* renamed from: N */
    public static byte[] m3021N(byte[] bArr, int i7, int i8) {
        AbstractC3367j.m5100e(bArr, "<this>");
        AbstractC3393k.m5140k(i8, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i7, i8);
        AbstractC3367j.m5099d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    /* renamed from: O */
    public static Object[] m3022O(Object[] objArr, int i7, int i8) {
        AbstractC3367j.m5100e(objArr, "<this>");
        AbstractC3393k.m5140k(i8, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i7, i8);
        AbstractC3367j.m5099d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    /* renamed from: P */
    public static void m3023P(Object[] objArr, int i7, int i8) {
        AbstractC3367j.m5100e(objArr, "<this>");
        Arrays.fill(objArr, i7, i8, (Object) null);
    }

    /* renamed from: Q */
    public static void m3024Q(long[] jArr, long j6) {
        int length = jArr.length;
        AbstractC3367j.m5100e(jArr, "<this>");
        Arrays.fill(jArr, 0, length, j6);
    }

    /* renamed from: R */
    public static /* synthetic */ void m3025R(Object[] objArr) {
        m3023P(objArr, 0, objArr.length);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z5.b, z5.d] */
    /* renamed from: S */
    public static C3879d m3026S(int[] iArr) {
        return new C3877b(0, iArr.length - 1, 1);
    }

    /* renamed from: T */
    public static int m3027T(long[] jArr) {
        AbstractC3367j.m5100e(jArr, "<this>");
        return jArr.length - 1;
    }

    /* renamed from: U */
    public static int m3028U(Object[] objArr, Object obj) {
        AbstractC3367j.m5100e(objArr, "<this>");
        int i7 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i7 < length2) {
            if (obj.equals(objArr[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* renamed from: V */
    public static String m3029V(int i7, Object[] objArr) {
        String str;
        String str2 = "";
        if ((i7 & 2) != 0) {
            str = "";
        } else {
            str = "innermostOf(";
        }
        if ((i7 & 4) == 0) {
            str2 = ")";
        }
        AbstractC3367j.m5100e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str);
        int i8 = 0;
        for (Object obj : objArr) {
            i8++;
            if (i8 > 1) {
                sb.append((CharSequence) ", ");
            }
            AbstractC3393k.m5136g(sb, obj, null);
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    /* renamed from: W */
    public static void m3030W(Object[] objArr, Comparator comparator, int i7, int i8) {
        AbstractC3367j.m5100e(objArr, "<this>");
        AbstractC3367j.m5100e(comparator, "comparator");
        Arrays.sort(objArr, i7, i8, comparator);
    }

    /* renamed from: X */
    public static List m3031X(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return m3032Y(objArr);
            }
            return AbstractC3784a.m5817z(objArr[0]);
        }
        return C1813u.f10860e;
    }

    /* renamed from: Y */
    public static ArrayList m3032Y(Object[] objArr) {
        return new ArrayList(new C1802j(objArr, false));
    }
}
