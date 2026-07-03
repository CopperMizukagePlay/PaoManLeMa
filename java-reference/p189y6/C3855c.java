package p189y6;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p024c6.C0442i;
import p060h5.C1813u;
import p065i2.AbstractC2064e;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: y6.c */
/* loaded from: classes.dex */
public final class C3855c implements HostnameVerifier {

    /* renamed from: a */
    public static final C3855c f18089a = new Object();

    /* renamed from: a */
    public static List m5868a(X509Certificate x509Certificate, int i7) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames != null) {
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC3367j.m5096a(list.get(0), Integer.valueOf(i7)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        }
        return C1813u.f10860e;
    }

    /* renamed from: b */
    public static boolean m5869b(String str) {
        int i7;
        char c7;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            if (length2 <= str.length()) {
                long j6 = 0;
                int i8 = 0;
                while (i8 < length2) {
                    char charAt = str.charAt(i8);
                    if (charAt < 128) {
                        j6++;
                    } else {
                        if (charAt < 2048) {
                            i7 = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i9 = i8 + 1;
                            if (i9 < length2) {
                                c7 = str.charAt(i9);
                            } else {
                                c7 = 0;
                            }
                            if (charAt <= 56319 && c7 >= 56320 && c7 <= 57343) {
                                j6 += 4;
                                i8 += 2;
                            } else {
                                j6++;
                                i8 = i9;
                            }
                        } else {
                            i7 = 3;
                        }
                        j6 += i7;
                    }
                    i8++;
                }
                if (length != ((int) j6)) {
                    return false;
                }
                return true;
            }
            StringBuilder m188o = AbstractC0094y0.m188o(length2, "endIndex > string.length: ", " > ");
            m188o.append(str.length());
            throw new IllegalArgumentException(m188o.toString().toString());
        }
        throw new IllegalArgumentException(AbstractC0094y0.m184k(length2, "endIndex < beginIndex: ", " < 0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x006e->B:52:?, LOOP_END, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m5870c(String str, X509Certificate x509Certificate) {
        boolean z7;
        String str2;
        int length;
        AbstractC3367j.m5100e(str, "host");
        byte[] bArr = AbstractC2721b.f14569a;
        C0442i c0442i = AbstractC2721b.f14574f;
        c0442i.getClass();
        if (c0442i.f1508e.matcher(str).matches()) {
            String m3227H = AbstractC2064e.m3227H(str);
            List m5868a = m5868a(x509Certificate, 7);
            if (!m5868a.isEmpty()) {
                Iterator it = m5868a.iterator();
                while (it.hasNext()) {
                    if (AbstractC3367j.m5096a(m3227H, AbstractC2064e.m3227H((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (m5869b(str)) {
            Locale locale = Locale.US;
            AbstractC3367j.m5099d(locale, "US");
            str = str.toLowerCase(locale);
            AbstractC3367j.m5099d(str, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> m5868a2 = m5868a(x509Certificate, 2);
        if (!m5868a2.isEmpty()) {
            for (String str3 : m5868a2) {
                if (str.length() != 0 && !AbstractC0451r.m971M(str, ".", false) && !AbstractC0451r.m965G(str, "..", false) && str3 != null && str3.length() != 0 && !AbstractC0451r.m971M(str3, ".", false) && !AbstractC0451r.m965G(str3, "..", false)) {
                    if (!AbstractC0451r.m965G(str, ".", false)) {
                        str2 = str.concat(".");
                    } else {
                        str2 = str;
                    }
                    if (!AbstractC0451r.m965G(str3, ".", false)) {
                        str3 = str3.concat(".");
                    }
                    if (m5869b(str3)) {
                        Locale locale2 = Locale.US;
                        AbstractC3367j.m5099d(locale2, "US");
                        str3 = str3.toLowerCase(locale2);
                        AbstractC3367j.m5099d(str3, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!AbstractC0444k.m928R(str3, "*", false)) {
                        z7 = AbstractC3367j.m5096a(str2, str3);
                    } else if (AbstractC0451r.m971M(str3, "*.", false) && AbstractC0444k.m934X(str3, '*', 1, 4) == -1 && str2.length() >= str3.length() && !"*.".equals(str3)) {
                        String substring = str3.substring(1);
                        AbstractC3367j.m5099d(substring, "this as java.lang.String).substring(startIndex)");
                        if (AbstractC0451r.m965G(str2, substring, false) && ((length = str2.length() - substring.length()) <= 0 || AbstractC0444k.m939c0(str2, '.', length - 1, 4) == -1)) {
                            z7 = true;
                        }
                    }
                    if (!z7) {
                        return true;
                    }
                }
                z7 = false;
                if (!z7) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        AbstractC3367j.m5100e(str, "host");
        AbstractC3367j.m5100e(sSLSession, "session");
        if (m5869b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                AbstractC3367j.m5098c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return m5870c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
                return false;
            }
        }
        return false;
    }
}
