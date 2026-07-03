package p151t6;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p006a7.C0130m;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.e */
/* loaded from: classes.dex */
public abstract class AbstractC3291e {

    /* renamed from: a */
    public static final C3287b[] f16157a;

    /* renamed from: b */
    public static final Map f16158b;

    static {
        C3287b c3287b = new C3287b(C3287b.f16137i, "");
        C0130m c0130m = C3287b.f16134f;
        C3287b c3287b2 = new C3287b(c0130m, "GET");
        C3287b c3287b3 = new C3287b(c0130m, "POST");
        C0130m c0130m2 = C3287b.f16135g;
        C3287b c3287b4 = new C3287b(c0130m2, "/");
        C3287b c3287b5 = new C3287b(c0130m2, "/index.html");
        C0130m c0130m3 = C3287b.f16136h;
        C3287b c3287b6 = new C3287b(c0130m3, "http");
        C3287b c3287b7 = new C3287b(c0130m3, "https");
        C0130m c0130m4 = C3287b.f16133e;
        C3287b[] c3287bArr = {c3287b, c3287b2, c3287b3, c3287b4, c3287b5, c3287b6, c3287b7, new C3287b(c0130m4, "200"), new C3287b(c0130m4, "204"), new C3287b(c0130m4, "206"), new C3287b(c0130m4, "304"), new C3287b(c0130m4, "400"), new C3287b(c0130m4, "404"), new C3287b(c0130m4, "500"), new C3287b("accept-charset", ""), new C3287b("accept-encoding", "gzip, deflate"), new C3287b("accept-language", ""), new C3287b("accept-ranges", ""), new C3287b("accept", ""), new C3287b("access-control-allow-origin", ""), new C3287b("age", ""), new C3287b("allow", ""), new C3287b("authorization", ""), new C3287b("cache-control", ""), new C3287b("content-disposition", ""), new C3287b("content-encoding", ""), new C3287b("content-language", ""), new C3287b("content-length", ""), new C3287b("content-location", ""), new C3287b("content-range", ""), new C3287b("content-type", ""), new C3287b("cookie", ""), new C3287b("date", ""), new C3287b("etag", ""), new C3287b("expect", ""), new C3287b("expires", ""), new C3287b("from", ""), new C3287b("host", ""), new C3287b("if-match", ""), new C3287b("if-modified-since", ""), new C3287b("if-none-match", ""), new C3287b("if-range", ""), new C3287b("if-unmodified-since", ""), new C3287b("last-modified", ""), new C3287b("link", ""), new C3287b("location", ""), new C3287b("max-forwards", ""), new C3287b("proxy-authenticate", ""), new C3287b("proxy-authorization", ""), new C3287b("range", ""), new C3287b("referer", ""), new C3287b("refresh", ""), new C3287b("retry-after", ""), new C3287b("server", ""), new C3287b("set-cookie", ""), new C3287b("strict-transport-security", ""), new C3287b("transfer-encoding", ""), new C3287b("user-agent", ""), new C3287b("vary", ""), new C3287b("via", ""), new C3287b("www-authenticate", "")};
        f16157a = c3287bArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i7 = 0; i7 < 61; i7++) {
            if (!linkedHashMap.containsKey(c3287bArr[i7].f16138a)) {
                linkedHashMap.put(c3287bArr[i7].f16138a, Integer.valueOf(i7));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC3367j.m5099d(unmodifiableMap, "unmodifiableMap(result)");
        f16158b = unmodifiableMap;
    }

    /* renamed from: a */
    public static void m5004a(C0130m c0130m) {
        AbstractC3367j.m5100e(c0130m, "name");
        int mo286c = c0130m.mo286c();
        for (int i7 = 0; i7 < mo286c; i7++) {
            byte mo289f = c0130m.mo289f(i7);
            if (65 <= mo289f && mo289f < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(c0130m.m293j()));
            }
        }
    }
}
