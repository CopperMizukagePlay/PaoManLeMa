package p099m6;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p001a0.AbstractC0094y0;
import p006a7.C0137t;
import p024c6.AbstractC0434a;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p060h5.C1813u;
import p068i5.AbstractC2080d;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;
import p196z6.C3887f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.c */
/* loaded from: classes.dex */
public abstract class AbstractC2595c {
    /* renamed from: a */
    public static void m4129a(String str) {
        if (str.length() > 0) {
            int length = str.length();
            for (int i7 = 0; i7 < length; i7++) {
                char charAt = str.charAt(i7);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(AbstractC2721b.m4363i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i7), str).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    /* renamed from: b */
    public static void m4130b(String str, String str2) {
        String concat;
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC2721b.m4363i("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i7), str2));
                if (AbstractC2721b.m4371q(str2)) {
                    concat = "";
                } else {
                    concat = ": ".concat(str);
                }
                sb.append(concat);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* renamed from: e */
    public static C2594b0 m4131e(String str, C2621v c2621v) {
        Charset charset = AbstractC0434a.f1477a;
        if (c2621v != null) {
            Pattern pattern = C2621v.f14160c;
            Charset m4179a = c2621v.m4179a(null);
            if (m4179a == null) {
                String str2 = c2621v + "; charset=utf-8";
                AbstractC3367j.m5100e(str2, "<this>");
                try {
                    c2621v = m4135i(str2);
                } catch (IllegalArgumentException unused) {
                    c2621v = null;
                }
            } else {
                charset = m4179a;
            }
        }
        byte[] bytes = str.getBytes(charset);
        AbstractC3367j.m5099d(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        AbstractC2721b.m4357c(bytes.length, 0, length);
        return new C2594b0(c2621v, length, bytes);
    }

    /* renamed from: f */
    public static int m4132f(String str, int i7, int i8, boolean z7) {
        boolean z8;
        while (i7 < i8) {
            char charAt = str.charAt(i7);
            if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (z8 == (!z7)) {
                return i7;
            }
            i7++;
        }
        return i8;
    }

    /* renamed from: g */
    public static EnumC2606h0 m4133g(String str) {
        AbstractC3367j.m5100e(str, "javaName");
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return EnumC2606h0.f14103h;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return EnumC2606h0.f14102g;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return EnumC2606h0.f14101f;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return EnumC2606h0.f14104i;
            }
        } else if (str.equals("SSLv3")) {
            return EnumC2606h0.f14105j;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2616q m4134h(SSLSession sSLSession) {
        boolean equals;
        List list;
        Certificate[] localCertificates;
        Certificate[] peerCertificates;
        List list2 = C1813u.f10860e;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL")) {
                equals = true;
            } else {
                equals = cipherSuite.equals("SSL_NULL_WITH_NULL_NULL");
            }
            if (!equals) {
                C2603g m4128c = C2603g.f14074b.m4128c(cipherSuite);
                String protocol = sSLSession.getProtocol();
                if (protocol != null) {
                    if (!"NONE".equals(protocol)) {
                        EnumC2606h0 m4133g = m4133g(protocol);
                        try {
                            peerCertificates = sSLSession.getPeerCertificates();
                        } catch (SSLPeerUnverifiedException unused) {
                        }
                        if (peerCertificates != null) {
                            list = AbstractC2721b.m4366l(Arrays.copyOf(peerCertificates, peerCertificates.length));
                            localCertificates = sSLSession.getLocalCertificates();
                            if (localCertificates != null) {
                                list2 = AbstractC2721b.m4366l(Arrays.copyOf(localCertificates, localCertificates.length));
                            }
                            return new C2616q(m4133g, m4128c, list2, new C2615p(0, list));
                        }
                        list = list2;
                        localCertificates = sSLSession.getLocalCertificates();
                        if (localCertificates != null) {
                        }
                        return new C2616q(m4133g, m4128c, list2, new C2615p(0, list));
                    }
                    throw new IOException("tlsVersion == NONE");
                }
                throw new IllegalStateException("tlsVersion == null");
            }
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    /* renamed from: i */
    public static C2621v m4135i(String str) {
        AbstractC3367j.m5100e(str, "<this>");
        Matcher matcher = C2621v.f14160c.matcher(str);
        if (matcher.lookingAt()) {
            String group = matcher.group(1);
            AbstractC3367j.m5099d(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            AbstractC3367j.m5099d(locale, "US");
            AbstractC3367j.m5099d(group.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            AbstractC3367j.m5099d(group2, "typeSubtype.group(2)");
            AbstractC3367j.m5099d(group2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = C2621v.f14161d.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (matcher2.lookingAt()) {
                    String group3 = matcher2.group(1);
                    if (group3 == null) {
                        end = matcher2.end();
                    } else {
                        String group4 = matcher2.group(2);
                        if (group4 == null) {
                            group4 = matcher2.group(3);
                        } else if (AbstractC0451r.m971M(group4, "'", false) && AbstractC0451r.m965G(group4, "'", false) && group4.length() > 2) {
                            group4 = group4.substring(1, group4.length() - 1);
                            AbstractC3367j.m5099d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        arrayList.add(group3);
                        arrayList.add(group4);
                        end = matcher2.end();
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    AbstractC3367j.m5099d(substring, "this as java.lang.String).substring(startIndex)");
                    sb.append(substring);
                    sb.append("\" for: \"");
                    throw new IllegalArgumentException(AbstractC0094y0.m187n(sb, str, '\"').toString());
                }
            }
            return new C2621v(str, (String[]) arrayList.toArray(new String[0]));
        }
        throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
    }

    /* renamed from: j */
    public static EnumC2624y m4136j(String str) {
        if (str.equals("http/1.0")) {
            return EnumC2624y.f14222f;
        }
        if (str.equals("http/1.1")) {
            return EnumC2624y.f14223g;
        }
        if (str.equals("h2_prior_knowledge")) {
            return EnumC2624y.f14226j;
        }
        if (str.equals("h2")) {
            return EnumC2624y.f14225i;
        }
        if (str.equals("spdy/3.1")) {
            return EnumC2624y.f14224h;
        }
        if (str.equals("quic")) {
            return EnumC2624y.f14227k;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    /* renamed from: k */
    public static C2617r m4137k(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                String str = strArr2[i8];
                if (str != null) {
                    strArr2[i8] = AbstractC0444k.m956t0(str).toString();
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            int m3402o = AbstractC2080d.m3402o(0, strArr2.length - 1, 2);
            if (m3402o >= 0) {
                while (true) {
                    String str2 = strArr2[i7];
                    String str3 = strArr2[i7 + 1];
                    m4129a(str2);
                    m4130b(str3, str2);
                    if (i7 == m3402o) {
                        break;
                    }
                    i7 += 2;
                }
            }
            return new C2617r(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    /* renamed from: o */
    public static long m4138o(String str, int i7) {
        int m4132f = m4132f(str, 0, i7, false);
        Matcher matcher = C2609j.f14117m.matcher(str);
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (m4132f < i7) {
            int m4132f2 = m4132f(str, m4132f + 1, i7, true);
            matcher.region(m4132f, m4132f2);
            if (i9 == -1 && matcher.usePattern(C2609j.f14117m).matches()) {
                String group = matcher.group(1);
                AbstractC3367j.m5099d(group, "matcher.group(1)");
                i9 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                AbstractC3367j.m5099d(group2, "matcher.group(2)");
                i12 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                AbstractC3367j.m5099d(group3, "matcher.group(3)");
                i13 = Integer.parseInt(group3);
            } else if (i10 == -1 && matcher.usePattern(C2609j.f14116l).matches()) {
                String group4 = matcher.group(1);
                AbstractC3367j.m5099d(group4, "matcher.group(1)");
                i10 = Integer.parseInt(group4);
            } else {
                if (i11 == -1) {
                    Pattern pattern = C2609j.f14115k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        AbstractC3367j.m5099d(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        AbstractC3367j.m5099d(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        AbstractC3367j.m5099d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        AbstractC3367j.m5099d(pattern2, "MONTH_PATTERN.pattern()");
                        i11 = AbstractC0444k.m935Y(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i8 == -1 && matcher.usePattern(C2609j.f14114j).matches()) {
                    String group6 = matcher.group(1);
                    AbstractC3367j.m5099d(group6, "matcher.group(1)");
                    i8 = Integer.parseInt(group6);
                }
            }
            m4132f = m4132f(str, m4132f2 + 1, i7, false);
        }
        if (70 <= i8 && i8 < 100) {
            i8 += 1900;
        }
        if (i8 >= 0 && i8 < 70) {
            i8 += 2000;
        }
        if (i8 >= 1601) {
            if (i11 != -1) {
                if (1 <= i10 && i10 < 32) {
                    if (i9 >= 0 && i9 < 24) {
                        if (i12 >= 0 && i12 < 60) {
                            if (i13 >= 0 && i13 < 60) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC2721b.f14573e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i8);
                                gregorianCalendar.set(2, i11 - 1);
                                gregorianCalendar.set(5, i10);
                                gregorianCalendar.set(11, i9);
                                gregorianCalendar.set(12, i12);
                                gregorianCalendar.set(13, i13);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* renamed from: c */
    public abstract long mo2158c();

    /* renamed from: d */
    public abstract C2621v mo2159d();

    /* renamed from: l */
    public abstract void mo2349l(C3887f c3887f, Exception exc);

    /* renamed from: m */
    public abstract void mo2350m(InterfaceC2608i0 interfaceC2608i0, String str);

    /* renamed from: p */
    public abstract void mo2160p(C0137t c0137t);

    /* renamed from: n */
    public void mo2371n(InterfaceC2608i0 interfaceC2608i0, C2598d0 c2598d0) {
    }
}
