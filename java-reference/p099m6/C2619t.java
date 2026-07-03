package p099m6;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p024c6.AbstractC0444k;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.t */
/* loaded from: classes.dex */
public final class C2619t {

    /* renamed from: j */
    public static final char[] f14150j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f14151a;

    /* renamed from: b */
    public final String f14152b;

    /* renamed from: c */
    public final String f14153c;

    /* renamed from: d */
    public final String f14154d;

    /* renamed from: e */
    public final int f14155e;

    /* renamed from: f */
    public final List f14156f;

    /* renamed from: g */
    public final String f14157g;

    /* renamed from: h */
    public final String f14158h;

    /* renamed from: i */
    public final boolean f14159i;

    public C2619t(String str, String str2, String str3, String str4, int i7, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        AbstractC3367j.m5100e(str, "scheme");
        AbstractC3367j.m5100e(str4, "host");
        this.f14151a = str;
        this.f14152b = str2;
        this.f14153c = str3;
        this.f14154d = str4;
        this.f14155e = i7;
        this.f14156f = arrayList2;
        this.f14157g = str5;
        this.f14158h = str6;
        this.f14159i = str.equals("https");
    }

    /* renamed from: a */
    public final String m4171a() {
        if (this.f14153c.length() == 0) {
            return "";
        }
        int length = this.f14151a.length() + 3;
        String str = this.f14158h;
        String substring = str.substring(AbstractC0444k.m934X(str, ':', length, 4) + 1, AbstractC0444k.m934X(str, '@', 0, 6));
        AbstractC3367j.m5099d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public final String m4172b() {
        int length = this.f14151a.length() + 3;
        String str = this.f14158h;
        int m934X = AbstractC0444k.m934X(str, '/', length, 4);
        String substring = str.substring(m934X, AbstractC2721b.m4360f(m934X, str.length(), str, "?#"));
        AbstractC3367j.m5099d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public final ArrayList m4173c() {
        int length = this.f14151a.length() + 3;
        String str = this.f14158h;
        int m934X = AbstractC0444k.m934X(str, '/', length, 4);
        int m4360f = AbstractC2721b.m4360f(m934X, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (m934X < m4360f) {
            int i7 = m934X + 1;
            int m4361g = AbstractC2721b.m4361g(str, '/', i7, m4360f);
            String substring = str.substring(i7, m4361g);
            AbstractC3367j.m5099d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            m934X = m4361g;
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String m4174d() {
        if (this.f14156f == null) {
            return null;
        }
        String str = this.f14158h;
        int m934X = AbstractC0444k.m934X(str, '?', 0, 6) + 1;
        String substring = str.substring(m934X, AbstractC2721b.m4361g(str, '#', m934X, str.length()));
        AbstractC3367j.m5099d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e */
    public final String m4175e() {
        if (this.f14152b.length() == 0) {
            return "";
        }
        int length = this.f14151a.length() + 3;
        String str = this.f14158h;
        String substring = str.substring(length, AbstractC2721b.m4360f(length, str.length(), str, ":@"));
        AbstractC3367j.m5099d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C2619t) && AbstractC3367j.m5096a(((C2619t) obj).f14158h, this.f14158h)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String m4176f() {
        C2618s c2618s;
        try {
            c2618s = new C2618s();
            c2618s.m4170c(this, "/...");
        } catch (IllegalArgumentException unused) {
            c2618s = null;
        }
        AbstractC3367j.m5097b(c2618s);
        c2618s.f14143b = C2593b.m4124b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        c2618s.f14144c = C2593b.m4124b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 251);
        return c2618s.m4168a().f14158h;
    }

    /* renamed from: g */
    public final URI m4177g() {
        int i7;
        ArrayList arrayList;
        String substring;
        String str;
        String str2;
        C2618s c2618s = new C2618s();
        String str3 = this.f14151a;
        c2618s.f14142a = str3;
        c2618s.f14143b = m4175e();
        c2618s.f14144c = m4171a();
        c2618s.f14145d = this.f14154d;
        AbstractC3367j.m5100e(str3, "scheme");
        int i8 = -1;
        if (str3.equals("http")) {
            i7 = 80;
        } else if (str3.equals("https")) {
            i7 = 443;
        } else {
            i7 = -1;
        }
        int i9 = this.f14155e;
        if (i9 != i7) {
            i8 = i9;
        }
        c2618s.f14146e = i8;
        ArrayList arrayList2 = c2618s.f14147f;
        arrayList2.clear();
        arrayList2.addAll(m4173c());
        String m4174d = m4174d();
        String str4 = null;
        if (m4174d != null) {
            arrayList = C2593b.m4127g(C2593b.m4124b(m4174d, 0, 0, " \"'<>#", 211));
        } else {
            arrayList = null;
        }
        c2618s.f14148g = arrayList;
        if (this.f14157g == null) {
            substring = null;
        } else {
            String str5 = this.f14158h;
            substring = str5.substring(AbstractC0444k.m934X(str5, '#', 0, 6) + 1);
            AbstractC3367j.m5099d(substring, "this as java.lang.String).substring(startIndex)");
        }
        c2618s.f14149h = substring;
        String str6 = c2618s.f14145d;
        if (str6 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            AbstractC3367j.m5099d(compile, "compile(...)");
            str = compile.matcher(str6).replaceAll("");
            AbstractC3367j.m5099d(str, "replaceAll(...)");
        } else {
            str = null;
        }
        c2618s.f14145d = str;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.set(i10, C2593b.m4124b((String) arrayList2.get(i10), 0, 0, "[]", 227));
        }
        ArrayList arrayList3 = c2618s.f14148g;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str7 = (String) arrayList3.get(i11);
                if (str7 != null) {
                    str2 = C2593b.m4124b(str7, 0, 0, "\\^`{|}", 195);
                } else {
                    str2 = null;
                }
                arrayList3.set(i11, str2);
            }
        }
        String str8 = c2618s.f14149h;
        if (str8 != null) {
            str4 = C2593b.m4124b(str8, 0, 0, " \"#<>\\^`{|}", 163);
        }
        c2618s.f14149h = str4;
        String c2618s2 = c2618s.toString();
        try {
            return new URI(c2618s2);
        } catch (URISyntaxException e7) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC3367j.m5099d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(c2618s2).replaceAll("");
                AbstractC3367j.m5099d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                AbstractC3367j.m5099d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e7);
            }
        }
    }

    public final int hashCode() {
        return this.f14158h.hashCode();
    }

    public final String toString() {
        return this.f14158h;
    }
}
