package p136r6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p006a7.C0129l;
import p006a7.C0130m;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p024c6.C0442i;
import p060h5.C1813u;
import p065i2.AbstractC2064e;
import p099m6.AbstractC2595c;
import p099m6.C2593b;
import p099m6.C2598d0;
import p099m6.C2609j;
import p099m6.C2617r;
import p099m6.C2619t;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r6.f */
/* loaded from: classes.dex */
public abstract class AbstractC3069f {
    static {
        C0130m c0130m = C0130m.f528h;
        C0129l.m278g("\"\\");
        C0129l.m278g("\t ,=");
    }

    /* renamed from: a */
    public static final boolean m4743a(C2598d0 c2598d0) {
        if (!AbstractC3367j.m5096a(c2598d0.f14056e.f14019b, "HEAD")) {
            int i7 = c2598d0.f14059h;
            if (((i7 >= 100 && i7 < 200) || i7 == 204 || i7 == 304) && AbstractC2721b.m4365k(c2598d0) == -1 && !"chunked".equalsIgnoreCase(C2598d0.m4141b("Transfer-Encoding", c2598d0))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01e2, code lost:
    
        if (r3.f1508e.matcher(r0).matches() == false) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4744b(C2593b c2593b, C2619t c2619t, C2617r c2617r) {
        int i7;
        List list;
        int i8;
        C2609j c2609j;
        long j6;
        C2609j c2609j2;
        String str;
        AbstractC3367j.m5100e(c2593b, "<this>");
        AbstractC3367j.m5100e(c2619t, "url");
        AbstractC3367j.m5100e(c2617r, "headers");
        if (c2593b == C2593b.f14025f) {
            return;
        }
        Pattern pattern = C2609j.f14114j;
        int size = c2617r.size();
        int i9 = 0;
        int i10 = 0;
        ArrayList arrayList = null;
        while (true) {
            i7 = 2;
            if (i10 >= size) {
                break;
            }
            if ("Set-Cookie".equalsIgnoreCase(c2617r.m4165b(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(c2617r.m4167d(i10));
            }
            i10++;
        }
        List list2 = C1813u.f10860e;
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC3367j.m5099d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            list = unmodifiableList;
        } else {
            list = list2;
        }
        int size2 = list.size();
        int i11 = 0;
        ArrayList arrayList2 = null;
        while (i11 < size2) {
            String str2 = (String) list.get(i11);
            AbstractC3367j.m5100e(str2, "setCookie");
            long currentTimeMillis = System.currentTimeMillis();
            char c7 = ';';
            int m4362h = AbstractC2721b.m4362h(str2, ';', i9, i9, 6);
            char c8 = '=';
            int m4362h2 = AbstractC2721b.m4362h(str2, '=', i9, m4362h, i7);
            if (m4362h2 != m4362h) {
                String m4380z = AbstractC2721b.m4380z(i9, m4362h2, str2);
                if (m4380z.length() != 0 && AbstractC2721b.m4367m(m4380z) == -1) {
                    String m4380z2 = AbstractC2721b.m4380z(m4362h2 + 1, m4362h, str2);
                    if (AbstractC2721b.m4367m(m4380z2) == -1) {
                        int i12 = m4362h + 1;
                        int length = str2.length();
                        int i13 = i9;
                        int i14 = i13;
                        int i15 = i14;
                        long j7 = -1;
                        long j8 = 253402300799999L;
                        String str3 = null;
                        String str4 = null;
                        boolean z7 = true;
                        while (true) {
                            long j9 = Long.MAX_VALUE;
                            if (i12 < length) {
                                int m4361g = AbstractC2721b.m4361g(str2, c7, i12, length);
                                int m4361g2 = AbstractC2721b.m4361g(str2, c8, i12, m4361g);
                                String m4380z3 = AbstractC2721b.m4380z(i12, m4361g2, str2);
                                if (m4361g2 < m4361g) {
                                    str = AbstractC2721b.m4380z(m4361g2 + 1, m4361g, str2);
                                } else {
                                    str = "";
                                }
                                if (m4380z3.equalsIgnoreCase("expires")) {
                                    try {
                                        j8 = AbstractC2595c.m4138o(str, str.length());
                                        i14 = 1;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                    i12 = m4361g + 1;
                                    c7 = ';';
                                    c8 = '=';
                                } else if (m4380z3.equalsIgnoreCase("max-age")) {
                                    try {
                                        j7 = Long.parseLong(str);
                                        if (j7 <= 0) {
                                            j7 = Long.MIN_VALUE;
                                        }
                                    } catch (NumberFormatException e7) {
                                        Pattern compile = Pattern.compile("-?\\d+");
                                        AbstractC3367j.m5099d(compile, "compile(...)");
                                        if (compile.matcher(str).matches()) {
                                            if (AbstractC0451r.m971M(str, "-", false)) {
                                                j9 = Long.MIN_VALUE;
                                            }
                                            j7 = j9;
                                        } else {
                                            throw e7;
                                        }
                                    }
                                    i14 = 1;
                                    i12 = m4361g + 1;
                                    c7 = ';';
                                    c8 = '=';
                                } else {
                                    if (m4380z3.equalsIgnoreCase("domain")) {
                                        if (!AbstractC0451r.m965G(str, ".", false)) {
                                            String m3227H = AbstractC2064e.m3227H(AbstractC0444k.m943g0(str, "."));
                                            if (m3227H != null) {
                                                str4 = m3227H;
                                                z7 = false;
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                    } else if (m4380z3.equalsIgnoreCase("path")) {
                                        str3 = str;
                                    } else if (m4380z3.equalsIgnoreCase("secure")) {
                                        i15 = 1;
                                    } else if (m4380z3.equalsIgnoreCase("httponly")) {
                                        i13 = 1;
                                    }
                                    i12 = m4361g + 1;
                                    c7 = ';';
                                    c8 = '=';
                                }
                            } else {
                                if (j7 == Long.MIN_VALUE) {
                                    j6 = Long.MIN_VALUE;
                                } else if (j7 != -1) {
                                    if (j7 <= 9223372036854775L) {
                                        j9 = j7 * 1000;
                                    }
                                    long j10 = currentTimeMillis + j9;
                                    if (j10 >= currentTimeMillis && j10 <= 253402300799999L) {
                                        j6 = j10;
                                    } else {
                                        j6 = 253402300799999L;
                                    }
                                } else {
                                    j6 = j8;
                                }
                                String str5 = c2619t.f14154d;
                                if (str4 == null) {
                                    str4 = str5;
                                } else if (!AbstractC3367j.m5096a(str5, str4)) {
                                    if (AbstractC0451r.m965G(str5, str4, false) && str5.charAt((str5.length() - str4.length()) - 1) == '.') {
                                        C0442i c0442i = AbstractC2721b.f14574f;
                                        c0442i.getClass();
                                    }
                                    i8 = 0;
                                    c2609j2 = null;
                                    c2609j = c2609j2;
                                }
                                if (str5.length() == str4.length() || PublicSuffixDatabase.f14871g.m4447a(str4) != null) {
                                    String str6 = "/";
                                    i8 = 0;
                                    if (str3 == null || !AbstractC0451r.m971M(str3, "/", false)) {
                                        String m4172b = c2619t.m4172b();
                                        int m939c0 = AbstractC0444k.m939c0(m4172b, '/', 0, 6);
                                        if (m939c0 != 0) {
                                            str6 = m4172b.substring(0, m939c0);
                                            AbstractC3367j.m5099d(str6, "this as java.lang.String…ing(startIndex, endIndex)");
                                        }
                                        str3 = str6;
                                    }
                                    c2609j2 = new C2609j(m4380z, m4380z2, j6, str4, str3, i15, i13, i14, z7);
                                    c2609j = c2609j2;
                                }
                                i8 = 0;
                                c2609j2 = null;
                                c2609j = c2609j2;
                            }
                        }
                    }
                }
            }
            i8 = i9;
            c2609j = null;
            if (c2609j != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(c2609j);
            }
            i11++;
            i9 = i8;
            i7 = 2;
        }
        if (arrayList2 != null) {
            list2 = Collections.unmodifiableList(arrayList2);
            AbstractC3367j.m5099d(list2, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        list2.isEmpty();
    }
}
