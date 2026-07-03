package p099m6;

import java.util.ArrayList;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p060h5.AbstractC1807o;
import p065i2.AbstractC2064e;
import p073j2.AbstractC2168e;
import p092m.AbstractC2487d;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;
import p195z5.C3877b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.s */
/* loaded from: classes.dex */
public final class C2618s {

    /* renamed from: a */
    public String f14142a;

    /* renamed from: d */
    public String f14145d;

    /* renamed from: f */
    public final ArrayList f14147f;

    /* renamed from: g */
    public ArrayList f14148g;

    /* renamed from: h */
    public String f14149h;

    /* renamed from: b */
    public String f14143b = "";

    /* renamed from: c */
    public String f14144c = "";

    /* renamed from: e */
    public int f14146e = -1;

    public C2618s() {
        ArrayList arrayList = new ArrayList();
        this.f14147f = arrayList;
        arrayList.add("");
    }

    /* renamed from: a */
    public final C2619t m4168a() {
        ArrayList arrayList;
        String str;
        String str2 = this.f14142a;
        if (str2 != null) {
            String m4126f = C2593b.m4126f(0, 0, 7, this.f14143b);
            String m4126f2 = C2593b.m4126f(0, 0, 7, this.f14144c);
            String str3 = this.f14145d;
            if (str3 != null) {
                int m4169b = m4169b();
                ArrayList arrayList2 = this.f14147f;
                ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(arrayList2));
                int size = arrayList2.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    arrayList3.add(C2593b.m4126f(0, 0, 7, (String) obj));
                }
                ArrayList arrayList4 = this.f14148g;
                String str4 = null;
                if (arrayList4 != null) {
                    arrayList = new ArrayList(AbstractC1807o.m3073U(arrayList4));
                    int size2 = arrayList4.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        Object obj2 = arrayList4.get(i8);
                        i8++;
                        String str5 = (String) obj2;
                        if (str5 != null) {
                            str = C2593b.m4126f(0, 0, 3, str5);
                        } else {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                } else {
                    arrayList = null;
                }
                String str6 = this.f14149h;
                if (str6 != null) {
                    str4 = C2593b.m4126f(0, 0, 7, str6);
                }
                return new C2619t(str2, m4126f, m4126f2, str3, m4169b, arrayList3, arrayList, str4, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    /* renamed from: b */
    public final int m4169b() {
        int i7 = this.f14146e;
        if (i7 != -1) {
            return i7;
        }
        String str = this.f14142a;
        AbstractC3367j.m5097b(str);
        if (str.equals("http")) {
            return 80;
        }
        if (!str.equals("https")) {
            return -1;
        }
        return 443;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0208, code lost:
    
        if (r9 < 65536) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r12 == ':') goto L40;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4170c(C2619t c2619t, String str) {
        int i7;
        String str2;
        int m4360f;
        char c7;
        int i8;
        int i9;
        boolean z7;
        ArrayList arrayList;
        char charAt;
        byte[] bArr = AbstractC2721b.f14569a;
        int m4368n = AbstractC2721b.m4368n(0, str.length(), str);
        int m4369o = AbstractC2721b.m4369o(m4368n, str.length(), str);
        if (m4369o - m4368n >= 2) {
            char charAt2 = str.charAt(m4368n);
            if ((AbstractC3367j.m5101f(charAt2, 97) >= 0 && AbstractC3367j.m5101f(charAt2, 122) <= 0) || (AbstractC3367j.m5101f(charAt2, 65) >= 0 && AbstractC3367j.m5101f(charAt2, 90) <= 0)) {
                i7 = m4368n + 1;
                while (true) {
                    if (i7 >= m4369o) {
                        break;
                    }
                    char charAt3 = str.charAt(i7);
                    if (('a' <= charAt3 && charAt3 < '{') || (('A' <= charAt3 && charAt3 < '[') || (('0' <= charAt3 && charAt3 < ':') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                        i7++;
                    }
                }
            }
        }
        i7 = -1;
        if (i7 != -1) {
            if (AbstractC0451r.m970L(str, "https:", m4368n, true)) {
                this.f14142a = "https";
                m4368n += 6;
            } else if (AbstractC0451r.m970L(str, "http:", m4368n, true)) {
                this.f14142a = "http";
                m4368n += 5;
            } else {
                StringBuilder sb = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String substring = str.substring(0, i7);
                AbstractC3367j.m5099d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append('\'');
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (c2619t != null) {
            this.f14142a = c2619t.f14151a;
        } else {
            if (str.length() > 6) {
                str2 = AbstractC0444k.m955s0(str, 6).concat("...");
            } else {
                str2 = str;
            }
            throw new IllegalArgumentException(AbstractC2487d.m4058v("Expected URL scheme 'http' or 'https' but no scheme was found for ", str2));
        }
        int i10 = 0;
        for (int i11 = m4368n; i11 < m4369o && ((charAt = str.charAt(i11)) == '\\' || charAt == '/'); i11++) {
            i10++;
        }
        ArrayList arrayList2 = this.f14147f;
        char c8 = '#';
        if (i10 < 2 && c2619t != null && AbstractC3367j.m5096a(c2619t.f14151a, this.f14142a)) {
            this.f14143b = c2619t.m4175e();
            this.f14144c = c2619t.m4171a();
            this.f14145d = c2619t.f14154d;
            this.f14146e = c2619t.f14155e;
            arrayList2.clear();
            arrayList2.addAll(c2619t.m4173c());
            if (m4368n == m4369o || str.charAt(m4368n) == '#') {
                String m4174d = c2619t.m4174d();
                if (m4174d != null) {
                    arrayList = C2593b.m4127g(C2593b.m4124b(m4174d, 0, 0, " \"'<>#", 211));
                } else {
                    arrayList = null;
                }
                this.f14148g = arrayList;
            }
        } else {
            int i12 = m4368n + i10;
            boolean z8 = false;
            boolean z9 = false;
            while (true) {
                m4360f = AbstractC2721b.m4360f(i12, m4369o, str, "@/\\?#");
                if (m4360f != m4369o) {
                    c7 = str.charAt(m4360f);
                } else {
                    c7 = 65535;
                }
                if (c7 == 65535 || c7 == c8 || c7 == '/' || c7 == '\\' || c7 == '?') {
                    break;
                }
                if (c7 == '@') {
                    if (!z8) {
                        boolean z10 = z8;
                        int m4361g = AbstractC2721b.m4361g(str, ':', i12, m4360f);
                        String m4124b = C2593b.m4124b(str, i12, m4361g, " \"':;<=>@[]^`{}|/\\?#", 240);
                        if (z9) {
                            m4124b = this.f14143b + "%40" + m4124b;
                        }
                        this.f14143b = m4124b;
                        if (m4361g != m4360f) {
                            this.f14144c = C2593b.m4124b(str, m4361g + 1, m4360f, " \"':;<=>@[]^`{}|/\\?#", 240);
                            z8 = true;
                        } else {
                            z8 = z10;
                        }
                        z9 = true;
                    } else {
                        this.f14144c += "%40" + C2593b.m4124b(str, i12, m4360f, " \"':;<=>@[]^`{}|/\\?#", 240);
                        z8 = z8;
                    }
                    i12 = m4360f + 1;
                    c8 = '#';
                }
            }
            int i13 = i12;
            while (true) {
                if (i13 < m4360f) {
                    char charAt4 = str.charAt(i13);
                    if (charAt4 != '[') {
                        if (charAt4 == ':') {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    do {
                        i13++;
                        if (i13 >= m4360f) {
                            break;
                        }
                    } while (str.charAt(i13) != ']');
                    i13++;
                } else {
                    i13 = m4360f;
                    break;
                }
            }
            int i14 = i13 + 1;
            if (i14 < m4360f) {
                this.f14145d = AbstractC2064e.m3227H(C2593b.m4126f(i12, i13, 4, str));
                try {
                    i9 = Integer.parseInt(C2593b.m4124b(str, i14, m4360f, "", 248));
                    if (1 <= i9) {
                    }
                } catch (NumberFormatException unused) {
                }
                i9 = -1;
                this.f14146e = i9;
                if (i9 == -1) {
                    StringBuilder sb2 = new StringBuilder("Invalid URL port: \"");
                    String substring2 = str.substring(i14, m4360f);
                    AbstractC3367j.m5099d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(substring2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            } else {
                this.f14145d = AbstractC2064e.m3227H(C2593b.m4126f(i12, i13, 4, str));
                String str3 = this.f14142a;
                AbstractC3367j.m5097b(str3);
                if (str3.equals("http")) {
                    i8 = 80;
                } else if (str3.equals("https")) {
                    i8 = 443;
                } else {
                    i8 = -1;
                }
                this.f14146e = i8;
            }
            if (this.f14145d != null) {
                m4368n = m4360f;
            } else {
                StringBuilder sb3 = new StringBuilder("Invalid URL host: \"");
                String substring3 = str.substring(i12, i13);
                AbstractC3367j.m5099d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                sb3.append(substring3);
                sb3.append('\"');
                throw new IllegalArgumentException(sb3.toString().toString());
            }
        }
        int m4360f2 = AbstractC2721b.m4360f(m4368n, m4369o, str, "?#");
        if (m4368n != m4360f2) {
            char charAt5 = str.charAt(m4368n);
            if (charAt5 != '/' && charAt5 != '\\') {
                arrayList2.set(arrayList2.size() - 1, "");
            } else {
                arrayList2.clear();
                arrayList2.add("");
                m4368n++;
            }
            while (m4368n < m4360f2) {
                int m4360f3 = AbstractC2721b.m4360f(m4368n, m4360f2, str, "/\\");
                if (m4360f3 < m4360f2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                String m4124b2 = C2593b.m4124b(str, m4368n, m4360f3, " \"<>^`{}|/\\?#", 240);
                if (!m4124b2.equals(".") && !m4124b2.equalsIgnoreCase("%2e")) {
                    if (!m4124b2.equals("..") && !m4124b2.equalsIgnoreCase("%2e.") && !m4124b2.equalsIgnoreCase(".%2e") && !m4124b2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList2.get(arrayList2.size() - 1)).length() == 0) {
                            arrayList2.set(arrayList2.size() - 1, m4124b2);
                        } else {
                            arrayList2.add(m4124b2);
                        }
                        if (z7) {
                            arrayList2.add("");
                        }
                    } else if (((String) arrayList2.remove(arrayList2.size() - 1)).length() == 0 && !arrayList2.isEmpty()) {
                        arrayList2.set(arrayList2.size() - 1, "");
                    } else {
                        arrayList2.add("");
                    }
                }
                if (z7) {
                    m4368n = m4360f3 + 1;
                } else {
                    m4368n = m4360f3;
                }
            }
        }
        if (m4360f2 < m4369o && str.charAt(m4360f2) == '?') {
            int m4361g2 = AbstractC2721b.m4361g(str, '#', m4360f2, m4369o);
            this.f14148g = C2593b.m4127g(C2593b.m4124b(str, m4360f2 + 1, m4361g2, " \"'<>#", 208));
            m4360f2 = m4361g2;
        }
        if (m4360f2 < m4369o && str.charAt(m4360f2) == '#') {
            this.f14149h = C2593b.m4124b(str, m4360f2 + 1, m4369o, "", 176);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f14142a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f14143b.length() > 0 || this.f14144c.length() > 0) {
            sb.append(this.f14143b);
            if (this.f14144c.length() > 0) {
                sb.append(':');
                sb.append(this.f14144c);
            }
            sb.append('@');
        }
        String str2 = this.f14145d;
        if (str2 != null) {
            if (AbstractC0444k.m929S(str2, ':')) {
                sb.append('[');
                sb.append(this.f14145d);
                sb.append(']');
            } else {
                sb.append(this.f14145d);
            }
        }
        int i7 = -1;
        if (this.f14146e != -1 || this.f14142a != null) {
            int m4169b = m4169b();
            String str3 = this.f14142a;
            if (str3 != null) {
                if (str3.equals("http")) {
                    i7 = 80;
                } else if (str3.equals("https")) {
                    i7 = 443;
                }
            }
            sb.append(':');
            sb.append(m4169b);
        }
        ArrayList arrayList = this.f14147f;
        AbstractC3367j.m5100e(arrayList, "<this>");
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            sb.append('/');
            sb.append((String) arrayList.get(i8));
        }
        if (this.f14148g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f14148g;
            AbstractC3367j.m5097b(arrayList2);
            C3877b m3512F = AbstractC2168e.m3512F(AbstractC2168e.m3513G(0, arrayList2.size()), 2);
            int i9 = m3512F.f18163e;
            int i10 = m3512F.f18164f;
            int i11 = m3512F.f18165g;
            if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i9);
                    String str5 = (String) arrayList2.get(i9 + 1);
                    if (i9 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9 += i11;
                }
            }
        }
        if (this.f14149h != null) {
            sb.append('#');
            sb.append(this.f14149h);
        }
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
