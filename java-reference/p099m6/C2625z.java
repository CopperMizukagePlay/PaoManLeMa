package p099m6;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0451r;
import p039e5.C0811dk;
import p039e5.C0916gu;
import p060h5.C1814v;
import p067i4.AbstractC2072e;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.z */
/* loaded from: classes.dex */
public final class C2625z {

    /* renamed from: a */
    public C2619t f14230a;

    /* renamed from: d */
    public AbstractC2595c f14233d;

    /* renamed from: e */
    public LinkedHashMap f14234e = new LinkedHashMap();

    /* renamed from: b */
    public String f14231b = "GET";

    /* renamed from: c */
    public C0811dk f14232c = new C0811dk(3);

    /* renamed from: a */
    public final C2592a0 m4189a() {
        Map unmodifiableMap;
        C2619t c2619t = this.f14230a;
        if (c2619t != null) {
            String str = this.f14231b;
            C2617r m1504e = this.f14232c.m1504e();
            AbstractC2595c abstractC2595c = this.f14233d;
            LinkedHashMap linkedHashMap = this.f14234e;
            byte[] bArr = AbstractC2721b.f14569a;
            AbstractC3367j.m5100e(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                unmodifiableMap = C1814v.f10861e;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                AbstractC3367j.m5099d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new C2592a0(c2619t, str, m1504e, abstractC2595c, unmodifiableMap);
        }
        throw new IllegalStateException("url == null");
    }

    /* renamed from: b */
    public final void m4190b() {
        m4192d("GET", null);
    }

    /* renamed from: c */
    public final void m4191c(String str, String str2) {
        AbstractC3367j.m5100e(str, "name");
        AbstractC3367j.m5100e(str2, "value");
        C0811dk c0811dk = this.f14232c;
        c0811dk.getClass();
        AbstractC2595c.m4129a(str);
        AbstractC2595c.m4130b(str2, str);
        c0811dk.m1515p(str);
        c0811dk.m1502b(str, str2);
    }

    /* renamed from: d */
    public final void m4192d(String str, AbstractC2595c abstractC2595c) {
        AbstractC3367j.m5100e(str, "method");
        if (str.length() > 0) {
            if (abstractC2595c == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                    throw new IllegalArgumentException(AbstractC0094y0.m185l("method ", str, " must have a request body.").toString());
                }
            } else if (!AbstractC2072e.m3338p(str)) {
                throw new IllegalArgumentException(AbstractC0094y0.m185l("method ", str, " must not have a request body.").toString());
            }
            this.f14231b = str;
            this.f14233d = abstractC2595c;
            return;
        }
        throw new IllegalArgumentException("method.isEmpty() == true");
    }

    /* renamed from: e */
    public final void m4193e(C0916gu c0916gu) {
        if (this.f14234e.isEmpty()) {
            this.f14234e = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = this.f14234e;
        Object cast = C0916gu.class.cast(c0916gu);
        AbstractC3367j.m5097b(cast);
        linkedHashMap.put(C0916gu.class, cast);
    }

    /* renamed from: f */
    public final void m4194f(String str) {
        AbstractC3367j.m5100e(str, "url");
        if (AbstractC0451r.m971M(str, "ws:", true)) {
            String substring = str.substring(3);
            AbstractC3367j.m5099d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(substring);
        } else if (AbstractC0451r.m971M(str, "wss:", true)) {
            String substring2 = str.substring(4);
            AbstractC3367j.m5099d(substring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(substring2);
        }
        AbstractC3367j.m5100e(str, "<this>");
        C2618s c2618s = new C2618s();
        c2618s.m4170c(null, str);
        this.f14230a = c2618s.m4168a();
    }
}
