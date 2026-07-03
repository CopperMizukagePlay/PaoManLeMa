package p024c6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p001a0.AbstractC0094y0;
import p015b6.AbstractC0307n;
import p015b6.C0308o;
import p015b6.C0311r;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1807o;
import p100n.AbstractC2647h;
import p102n1.AbstractC2710c;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;
import p195z5.C3877b;
import p195z5.C3879d;

/* renamed from: c6.k */
/* loaded from: classes.dex */
public abstract class AbstractC0444k extends AbstractC0451r {
    /* renamed from: R */
    public static boolean m928R(CharSequence charSequence, String str, boolean z7) {
        AbstractC3367j.m5100e(charSequence, "<this>");
        if (m935Y(charSequence, str, 0, z7, 2) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: S */
    public static boolean m929S(CharSequence charSequence, char c7) {
        AbstractC3367j.m5100e(charSequence, "<this>");
        if (m934X(charSequence, c7, 0, 2) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public static String m930T(String str, int i7) {
        AbstractC3367j.m5100e(str, "<this>");
        if (i7 >= 0) {
            int length = str.length();
            if (i7 > length) {
                i7 = length;
            }
            String substring = str.substring(i7);
            AbstractC3367j.m5099d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(AbstractC0094y0.m184k(i7, "Requested character count ", " is less than zero.").toString());
    }

    /* renamed from: U */
    public static boolean m931U(String str, CharSequence charSequence) {
        AbstractC3367j.m5100e(str, "<this>");
        AbstractC3367j.m5100e(charSequence, "suffix");
        if (charSequence instanceof String) {
            return AbstractC0451r.m965G(str, (String) charSequence, false);
        }
        return m942f0(str, str.length() - charSequence.length(), charSequence, 0, charSequence.length(), false);
    }

    /* renamed from: V */
    public static int m932V(CharSequence charSequence) {
        AbstractC3367j.m5100e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: W */
    public static final int m933W(CharSequence charSequence, String str, int i7, boolean z7) {
        int i8;
        AbstractC3367j.m5100e(charSequence, "<this>");
        AbstractC3367j.m5100e(str, "string");
        if (!z7 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i7);
        }
        int length = charSequence.length();
        if (i7 < 0) {
            i8 = 0;
        } else {
            i8 = i7;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        C3877b c3877b = new C3877b(i8, length, 1);
        boolean z8 = charSequence instanceof String;
        int i9 = c3877b.f18165g;
        int i10 = c3877b.f18164f;
        int i11 = c3877b.f18163e;
        if (z8 && (str instanceof String)) {
            if ((i9 <= 0 || i11 > i10) && (i9 >= 0 || i10 > i11)) {
                return -1;
            }
            int i12 = i11;
            while (!AbstractC0451r.m967I(str, 0, (String) charSequence, i12, str.length(), z7)) {
                if (i12 == i10) {
                    return -1;
                }
                i12 += i9;
            }
            return i12;
        }
        if ((i9 <= 0 || i11 > i10) && (i9 >= 0 || i10 > i11)) {
            return -1;
        }
        while (!m942f0(str, 0, charSequence, i11, str.length(), z7)) {
            if (i11 == i10) {
                return -1;
            }
            i11 += i9;
        }
        return i11;
    }

    /* renamed from: X */
    public static int m934X(CharSequence charSequence, char c7, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        AbstractC3367j.m5100e(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            return m936Z(charSequence, new char[]{c7}, i7, false);
        }
        return ((String) charSequence).indexOf(c7, i7);
    }

    /* renamed from: Y */
    public static /* synthetic */ int m935Y(CharSequence charSequence, String str, int i7, boolean z7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return m933W(charSequence, str, i7, z7);
    }

    /* renamed from: Z */
    public static final int m936Z(CharSequence charSequence, char[] cArr, int i7, boolean z7) {
        AbstractC3367j.m5100e(charSequence, "<this>");
        if (!z7 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length != 0) {
                if (length == 1) {
                    return ((String) charSequence).indexOf(cArr[0], i7);
                }
                throw new IllegalArgumentException("Array has more than one element.");
            }
            throw new NoSuchElementException("Array is empty.");
        }
        if (i7 < 0) {
            i7 = 0;
        }
        int m932V = m932V(charSequence);
        if (i7 > m932V) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i7);
            for (char c7 : cArr) {
                if (AbstractC2710c.m4335i(c7, charAt, z7)) {
                    return i7;
                }
            }
            if (i7 != m932V) {
                i7++;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: a0 */
    public static boolean m937a0(CharSequence charSequence) {
        AbstractC3367j.m5100e(charSequence, "<this>");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (!AbstractC2710c.m4323F(charSequence.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b0 */
    public static char m938b0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(m932V(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: c0 */
    public static int m939c0(String str, char c7, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i7 = m932V(str);
        }
        AbstractC3367j.m5100e(str, "<this>");
        return str.lastIndexOf(c7, i7);
    }

    /* renamed from: d0 */
    public static C0308o m940d0(CharSequence charSequence) {
        AbstractC3367j.m5100e(charSequence, "<this>");
        return new C0308o(2, charSequence);
    }

    /* renamed from: e0 */
    public static List m941e0(String str) {
        AbstractC3367j.m5100e(str, "<this>");
        return AbstractC0307n.m668G(m940d0(str));
    }

    /* renamed from: f0 */
    public static final boolean m942f0(CharSequence charSequence, int i7, CharSequence charSequence2, int i8, int i9, boolean z7) {
        AbstractC3367j.m5100e(charSequence, "<this>");
        AbstractC3367j.m5100e(charSequence2, "other");
        if (i8 < 0 || i7 < 0 || i7 > charSequence.length() - i9 || i8 > charSequence2.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!AbstractC2710c.m4335i(charSequence.charAt(i7 + i10), charSequence2.charAt(i8 + i10), z7)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g0 */
    public static String m943g0(String str, String str2) {
        AbstractC3367j.m5100e(str, "<this>");
        if (AbstractC0451r.m971M(str, str2, false)) {
            String substring = str.substring(str2.length());
            AbstractC3367j.m5099d(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    /* renamed from: h0 */
    public static String m944h0(String str, String str2) {
        AbstractC3367j.m5100e(str, "<this>");
        AbstractC3367j.m5100e(str2, "suffix");
        if (m931U(str, str2)) {
            String substring = str.substring(0, str.length() - str2.length());
            AbstractC3367j.m5099d(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    /* renamed from: i0 */
    public static String m945i0(String str, String str2, String str3) {
        AbstractC3367j.m5100e(str, "<this>");
        if (str.length() >= str3.length() + str2.length() && AbstractC0451r.m971M(str, str2, false) && m931U(str, str3)) {
            String substring = str.substring(str2.length(), str.length() - str3.length());
            AbstractC3367j.m5099d(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    /* renamed from: j0 */
    public static final void m946j0(int i7) {
        if (i7 >= 0) {
        } else {
            throw new IllegalArgumentException(AbstractC2647h.m4256b("Limit must be non-negative, but was ", i7).toString());
        }
    }

    /* renamed from: k0 */
    public static final List m947k0(CharSequence charSequence, String str, int i7) {
        boolean z7;
        m946j0(i7);
        int m933W = m933W(charSequence, str, 0, false);
        if (m933W != -1 && i7 != 1) {
            if (i7 > 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int i8 = 10;
            if (z7 && i7 <= 10) {
                i8 = i7;
            }
            ArrayList arrayList = new ArrayList(i8);
            int i9 = 0;
            do {
                arrayList.add(charSequence.subSequence(i9, m933W).toString());
                i9 = str.length() + m933W;
                if (z7 && arrayList.size() == i7 - 1) {
                    break;
                }
                m933W = m933W(charSequence, str, i9, false);
            } while (m933W != -1);
            arrayList.add(charSequence.subSequence(i9, charSequence.length()).toString());
            return arrayList;
        }
        return AbstractC3784a.m5817z(charSequence.toString());
    }

    /* renamed from: l0 */
    public static List m948l0(String str, char[] cArr) {
        AbstractC3367j.m5100e(str, "<this>");
        if (cArr.length == 1) {
            return m947k0(str, String.valueOf(cArr[0]), 0);
        }
        m946j0(0);
        C0311r c0311r = new C0311r(new C0436c(str, 0, new C0453t(0, cArr)));
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(c0311r));
        Iterator it = c0311r.iterator();
        while (true) {
            C0435b c0435b = (C0435b) it;
            if (c0435b.hasNext()) {
                C3879d c3879d = (C3879d) c0435b.next();
                AbstractC3367j.m5100e(c3879d, "range");
                arrayList.add(str.subSequence(c3879d.f18163e, c3879d.f18164f + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    /* renamed from: m0 */
    public static List m949m0(String str, String[] strArr, int i7) {
        int i8;
        if ((i7 & 4) != 0) {
            i8 = 0;
        } else {
            i8 = 2;
        }
        AbstractC3367j.m5100e(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return m947k0(str, str2, i8);
            }
        }
        m946j0(i8);
        C0311r c0311r = new C0311r(new C0436c(str, i8, new C0452s(AbstractC1804l.m3010C(strArr))));
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(c0311r));
        Iterator it = c0311r.iterator();
        while (true) {
            C0435b c0435b = (C0435b) it;
            if (c0435b.hasNext()) {
                C3879d c3879d = (C3879d) c0435b.next();
                AbstractC3367j.m5100e(c3879d, "range");
                arrayList.add(str.subSequence(c3879d.f18163e, c3879d.f18164f + 1).toString());
            } else {
                return arrayList;
            }
        }
    }

    /* renamed from: n0 */
    public static String m950n0(String str, char c7, String str2) {
        int m934X = m934X(str, c7, 0, 6);
        if (m934X == -1) {
            return str2;
        }
        String substring = str.substring(m934X + 1, str.length());
        AbstractC3367j.m5099d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: o0 */
    public static String m951o0(String str, String str2, String str3) {
        AbstractC3367j.m5100e(str, "<this>");
        AbstractC3367j.m5100e(str2, "delimiter");
        AbstractC3367j.m5100e(str3, "missingDelimiterValue");
        int m935Y = m935Y(str, str2, 0, false, 6);
        if (m935Y == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + m935Y, str.length());
        AbstractC3367j.m5099d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: p0 */
    public static String m952p0(String str, char c7, String str2) {
        AbstractC3367j.m5100e(str, "<this>");
        int m939c0 = m939c0(str, c7, 0, 6);
        if (m939c0 == -1) {
            return str2;
        }
        String substring = str.substring(m939c0 + 1, str.length());
        AbstractC3367j.m5099d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: q0 */
    public static String m953q0(String str, char c7) {
        AbstractC3367j.m5100e(str, "<this>");
        AbstractC3367j.m5100e(str, "missingDelimiterValue");
        int m934X = m934X(str, c7, 0, 6);
        if (m934X == -1) {
            return str;
        }
        String substring = str.substring(0, m934X);
        AbstractC3367j.m5099d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: r0 */
    public static String m954r0(String str, String str2) {
        AbstractC3367j.m5100e(str, "<this>");
        AbstractC3367j.m5100e(str, "missingDelimiterValue");
        int m935Y = m935Y(str, str2, 0, false, 6);
        if (m935Y == -1) {
            return str;
        }
        String substring = str.substring(0, m935Y);
        AbstractC3367j.m5099d(substring, "substring(...)");
        return substring;
    }

    /* renamed from: s0 */
    public static String m955s0(String str, int i7) {
        AbstractC3367j.m5100e(str, "<this>");
        if (i7 >= 0) {
            int length = str.length();
            if (i7 > length) {
                i7 = length;
            }
            String substring = str.substring(0, i7);
            AbstractC3367j.m5099d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(AbstractC0094y0.m184k(i7, "Requested character count ", " is less than zero.").toString());
    }

    /* renamed from: t0 */
    public static CharSequence m956t0(CharSequence charSequence) {
        int i7;
        AbstractC3367j.m5100e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i8 = 0;
        boolean z7 = false;
        while (i8 <= length) {
            if (!z7) {
                i7 = i8;
            } else {
                i7 = length;
            }
            boolean m4323F = AbstractC2710c.m4323F(charSequence.charAt(i7));
            if (!z7) {
                if (!m4323F) {
                    z7 = true;
                } else {
                    i8++;
                }
            } else {
                if (!m4323F) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i8, length + 1);
    }

    /* renamed from: u0 */
    public static String m957u0(String str, char... cArr) {
        int i7;
        int length = str.length() - 1;
        int i8 = 0;
        boolean z7 = false;
        while (i8 <= length) {
            if (!z7) {
                i7 = i8;
            } else {
                i7 = length;
            }
            boolean m3011D = AbstractC1804l.m3011D(cArr, str.charAt(i7));
            if (!z7) {
                if (!m3011D) {
                    z7 = true;
                } else {
                    i8++;
                }
            } else {
                if (!m3011D) {
                    break;
                }
                length--;
            }
        }
        return str.subSequence(i8, length + 1).toString();
    }

    /* renamed from: v0 */
    public static CharSequence m958v0(String str) {
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i7 = length - 1;
            if (!AbstractC2710c.m4323F(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i7 >= 0) {
                length = i7;
            } else {
                return "";
            }
        }
    }

    /* renamed from: w0 */
    public static String m959w0(String str, char... cArr) {
        CharSequence charSequence;
        AbstractC3367j.m5100e(str, "<this>");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (!AbstractC1804l.m3011D(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    /* renamed from: x0 */
    public static CharSequence m960x0(String str) {
        AbstractC3367j.m5100e(str, "<this>");
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!AbstractC2710c.m4323F(str.charAt(i7))) {
                return str.subSequence(i7, str.length());
            }
        }
        return "";
    }
}
