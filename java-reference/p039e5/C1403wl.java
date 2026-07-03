package p039e5;

import java.math.BigInteger;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a0.C0070r0;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p053g5.C1689h;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.C1813u;
import p068i5.C2079c;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p098m5.AbstractC2583c;
import p099m6.AbstractC2595c;
import p099m6.AbstractC2602f0;
import p099m6.C2598d0;
import p099m6.C2621v;
import p099m6.C2622w;
import p099m6.C2623x;
import p099m6.C2625z;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wl */
/* loaded from: classes.dex */
public final class C1403wl {

    /* renamed from: i */
    public static final C2621v f8489i;

    /* renamed from: a */
    public final EnumC1465yl f8490a;

    /* renamed from: b */
    public final String f8491b;

    /* renamed from: c */
    public final String f8492c;

    /* renamed from: d */
    public final String f8493d;

    /* renamed from: e */
    public final String f8494e;

    /* renamed from: f */
    public final C2623x f8495f;

    /* renamed from: g */
    public String f8496g;

    /* renamed from: h */
    public long f8497h;

    static {
        Pattern pattern = C2621v.f14160c;
        f8489i = AbstractC2595c.m4135i("application/json");
    }

    public C1403wl(EnumC1465yl enumC1465yl, String str, String str2, String str3, String str4) {
        AbstractC3367j.m5100e(str4, "apiV4Token");
        this.f8490a = enumC1465yl;
        this.f8491b = str;
        this.f8492c = str2;
        this.f8493d = str3;
        this.f8494e = str4;
        C2622w c2622w = new C2622w();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c2622w.m4180a(12L, timeUnit);
        c2622w.m4183d(120L, timeUnit);
        c2622w.m4185f(12L, timeUnit);
        c2622w.f14191z = AbstractC2721b.m4356b("interval", 15L, timeUnit);
        this.f8495f = new C2623x(c2622w);
        this.f8496g = "";
    }

    /* renamed from: a */
    public static final C2625z m2376a(C1403wl c1403wl, String str, String str2) {
        C2625z c2625z = new C2625z();
        c2625z.m4194f(str);
        if (!AbstractC0444k.m937a0(str2)) {
            c2625z.m4191c("Authorization", "Bearer ".concat(str2));
            c2625z.m4191c("X-NextTrace-Token", str2);
        }
        return c2625z;
    }

    /* renamed from: b */
    public static final JSONObject m2377b(C1403wl c1403wl, C1496zl c1496zl) {
        JSONObject put = new JSONObject().put("target", c1496zl.f9915a);
        EnumC1163ot enumC1163ot = c1496zl.f9916b;
        JSONObject put2 = put.put("protocol", enumC1163ot.f6741e).put("queries", AbstractC2168e.m3530q(c1496zl.f9918d, 1, 10)).put("max_hops", AbstractC2168e.m3530q(c1496zl.f9917c, 1, 64)).put("timeout_ms", AbstractC2168e.m3530q(c1496zl.f9919e, 500, 30000)).put("data_provider", c1496zl.f9921g).put("language", c1496zl.f9922h).put("mode", "single").put("parallel_requests", AbstractC2168e.m3530q(c1496zl.f9923i, 1, 64));
        int i7 = c1496zl.f9924j;
        int i8 = 0;
        if (i7 < 0) {
            i7 = 0;
        }
        JSONObject put3 = put2.put("packet_interval", i7);
        int i9 = c1496zl.f9925k;
        if (i9 >= 0) {
            i8 = i9;
        }
        JSONObject put4 = put3.put("ttl_interval", i8);
        if (enumC1163ot == EnumC1163ot.f6737h || enumC1163ot == EnumC1163ot.f6738i) {
            put4.put("port", c1496zl.f9920f);
        }
        AbstractC3367j.m5097b(put4);
        return put4;
    }

    /* renamed from: c */
    public static final String m2378c(C1403wl c1403wl, String str) {
        String obj = AbstractC0444k.m956t0(str).toString();
        if (AbstractC0444k.m937a0(obj)) {
            return null;
        }
        if (!AbstractC0451r.m971M(obj, "http://", false) && !AbstractC0451r.m971M(obj, "https://", false)) {
            obj = "http://".concat(obj);
        }
        return AbstractC0444k.m959w0(obj, '/');
    }

    /* renamed from: d */
    public static final C1504zt m2379d(C1403wl c1403wl, String str, C1496zl c1496zl) {
        JSONObject jSONObject = new JSONObject(str);
        List m2384j = m2384j(jSONObject.optJSONArray("hops"));
        String str2 = c1496zl.f9915a;
        String optString = jSONObject.optString("resolved_ip", "");
        AbstractC3367j.m5099d(optString, "optString(...)");
        EnumC1163ot enumC1163ot = c1496zl.f9916b;
        int i7 = c1496zl.f9917c;
        int size = m2384j.size();
        String optString2 = jSONObject.optString("trace_map_url", "");
        AbstractC3367j.m5099d(optString2, "optString(...)");
        EnumC1465yl enumC1465yl = c1403wl.f8490a;
        String str3 = c1403wl.f8492c;
        if (AbstractC0444k.m937a0(str3)) {
            str3 = c1403wl.f8491b;
        }
        return new C1504zt(str2, optString, enumC1163ot, i7, size, m2384j, optString2, "NTrace-core REST 追踪完成", enumC1465yl, str3, 1);
    }

    /* renamed from: f */
    public static List m2380f(BigInteger bigInteger) {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        List m3058v0;
        BigInteger bigInteger4 = BigInteger.ONE;
        if (bigInteger.compareTo(bigInteger4) > 0) {
            bigInteger2 = BigInteger.TWO;
            if (AbstractC3367j.m5096a(bigInteger.mod(bigInteger2), BigInteger.ZERO)) {
                bigInteger3 = BigInteger.TWO;
                AbstractC3367j.m5099d(bigInteger3, "TWO");
            } else {
                BigInteger bigInteger5 = bigInteger;
                BigInteger bigInteger6 = bigInteger5;
                BigInteger bigInteger7 = bigInteger4;
                while (AbstractC3367j.m5096a(bigInteger7, BigInteger.ONE)) {
                    bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4).mod(bigInteger);
                    BigInteger mod = bigInteger6.multiply(bigInteger6).add(bigInteger4).mod(bigInteger);
                    bigInteger6 = mod.multiply(mod).add(bigInteger4).mod(bigInteger);
                    bigInteger7 = bigInteger5.subtract(bigInteger6).abs().gcd(bigInteger);
                }
                AbstractC3367j.m5097b(bigInteger7);
                bigInteger3 = bigInteger7;
            }
            if (bigInteger3.equals(bigInteger)) {
                m3058v0 = AbstractC3784a.m5817z(bigInteger);
            } else {
                List m2380f = m2380f(bigInteger3);
                BigInteger divide = bigInteger.divide(bigInteger3);
                AbstractC3367j.m5099d(divide, "divide(...)");
                m3058v0 = AbstractC1805m.m3058v0(m2380f, m2380f(divide));
            }
            return AbstractC1805m.m3060x0(m3058v0);
        }
        return C1813u.f10860e;
    }

    /* renamed from: g */
    public static Object m2381g(C1403wl c1403wl, List list, AbstractC2583c abstractC2583c) {
        C2325e c2325e = AbstractC0549l0.f1898a;
        return AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0070r0(list, c1403wl, (InterfaceC2313c) null, 7), abstractC2583c);
    }

    /* renamed from: h */
    public static C1434xl m2382h(JSONObject jSONObject) {
        List m3067O;
        String concat;
        String language = Locale.getDefault().getLanguage();
        AbstractC3367j.m5099d(language, "getLanguage(...)");
        if (AbstractC0451r.m971M(language, "zh", false)) {
            m3067O = AbstractC1806n.m3067O(jSONObject.optString("country"), jSONObject.optString("prov"), jSONObject.optString("city"));
        } else {
            m3067O = AbstractC1806n.m3067O(jSONObject.optString("country_en"), jSONObject.optString("prov_en"), jSONObject.optString("city_en"));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : m3067O) {
            String str = (String) obj;
            AbstractC3367j.m5097b(str);
            if (!AbstractC0444k.m937a0(str)) {
                arrayList.add(obj);
            }
        }
        String m3051o0 = AbstractC1805m.m3051o0(arrayList, " ", null, null, null, 62);
        String optString = jSONObject.optString("asnumber");
        AbstractC3367j.m5097b(optString);
        if (AbstractC0444k.m937a0(optString)) {
            concat = "";
        } else {
            concat = "AS".concat(optString);
        }
        String optString2 = jSONObject.optString("whois");
        if (AbstractC0444k.m937a0(optString2)) {
            optString2 = jSONObject.optString("owner");
        }
        AbstractC3367j.m5099d(optString2, "ifBlank(...)");
        if (AbstractC0444k.m937a0(m3051o0)) {
            m3051o0 = "*";
        }
        return new C1434xl(concat, optString2, m3051o0);
    }

    /* renamed from: i */
    public static C1132nt m2383i(JSONObject jSONObject, String str, String str2) {
        double d7;
        String str3;
        boolean z7;
        String str4;
        String optString;
        boolean z8 = false;
        int optInt = jSONObject.optInt("ttl", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("attempts");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        String str5 = "*";
        int i7 = 0;
        int i8 = 0;
        String str6 = "*";
        String str7 = "";
        String str8 = str7;
        String str9 = str8;
        while (i7 < length) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
            if (optJSONObject == null || !optJSONObject.optBoolean("success", z8)) {
                str4 = str5;
            } else {
                i8++;
                if (AbstractC3367j.m5096a(str6, str5)) {
                    str6 = optJSONObject.optString("ip", str5);
                }
                if (AbstractC0444k.m937a0(str7)) {
                    str7 = optJSONObject.optString("hostname", "");
                }
                str4 = str5;
                double optDouble = optJSONObject.optDouble("rtt_ms", 0.0d);
                if (optDouble > 0.0d) {
                    arrayList.add(Double.valueOf(optDouble));
                }
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("geo");
                if (optJSONObject2 != null && AbstractC0444k.m937a0(str8)) {
                    List m3067O = AbstractC1806n.m3067O(optJSONObject2.optString("country"), optJSONObject2.optString("prov"), optJSONObject2.optString("city"));
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : m3067O) {
                        String str10 = (String) obj;
                        AbstractC3367j.m5097b(str10);
                        if (!AbstractC0444k.m937a0(str10)) {
                            arrayList2.add(obj);
                        }
                    }
                    str8 = AbstractC1805m.m3051o0(arrayList2, " ", null, null, null, 62);
                    String optString2 = optJSONObject2.optString("asnumber");
                    AbstractC3367j.m5097b(optString2);
                    if (!AbstractC0444k.m937a0(optString2)) {
                        optString = AbstractC0444k.m956t0("AS" + optString2 + " " + optJSONObject2.optString("owner")).toString();
                    } else {
                        String optString3 = optJSONObject2.optString("owner");
                        AbstractC3367j.m5099d(optString3, "optString(...)");
                        if (AbstractC0444k.m937a0(optString3)) {
                            str9 = "";
                        } else {
                            optString = optJSONObject2.optString("owner");
                            AbstractC3367j.m5099d(optString, "optString(...)");
                        }
                    }
                    str9 = optString;
                }
            }
            i7++;
            str5 = str4;
            z8 = false;
        }
        String str11 = str5;
        if (optJSONArray.length() > 0) {
            d7 = (optJSONArray.length() - i8) / optJSONArray.length();
        } else {
            d7 = 1.0d;
        }
        if (AbstractC0444k.m937a0(str6)) {
            str3 = str11;
        } else {
            str3 = str6;
        }
        if (!str6.equals(str) && !str6.equals(str2)) {
            z7 = false;
        } else {
            z7 = true;
        }
        return new C1132nt(optInt, str3, str7, arrayList, d7, str8, str9, z7);
    }

    /* renamed from: j */
    public static List m2384j(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C1813u.f10860e;
        }
        C2079c m5802f = AbstractC3784a.m5802f();
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i7);
            if (optJSONObject != null) {
                m5802f.add(m2383i(optJSONObject, "", ""));
            }
        }
        return AbstractC3784a.m5798b(m5802f);
    }

    /* renamed from: k */
    public static String m2385k(String str) {
        Object m2985m;
        InetAddress inetAddress;
        Object obj = null;
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            AbstractC3367j.m5099d(allByName, "getAllByName(...)");
            if (allByName.length == 0) {
                inetAddress = null;
            } else {
                inetAddress = allByName[0];
            }
            if (inetAddress != null) {
                m2985m = inetAddress.getHostAddress();
            } else {
                m2985m = null;
            }
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (!(m2985m instanceof C1689h)) {
            obj = m2985m;
        }
        return (String) obj;
    }

    /* renamed from: e */
    public final String m2386e() {
        String str;
        String str2;
        String str3 = this.f8491b;
        String m2385k = m2385k(str3);
        if (m2385k != null) {
            C2622w m4186a = this.f8495f.m4186a();
            m4186a.m4181b(new C1279sl(m2385k, 0));
            C2623x c2623x = new C2623x(m4186a);
            C2625z c2625z = new C2625z();
            c2625z.m4194f("https://" + str3 + "/v3/challenge/request_challenge");
            c2625z.m4191c("Host", str3);
            c2625z.m4191c("User-Agent", "NextTrace/NTrace-core Android HBCS-SpeedTest");
            C2598d0 m4681e = c2623x.m4187b(c2625z.m4189a()).m4681e();
            AbstractC2602f0 abstractC2602f0 = m4681e.f14062k;
            if (abstractC2602f0 != null) {
                str = abstractC2602f0.m4148h();
            } else {
                str = null;
            }
            String str4 = "";
            if (str == null) {
                str = "";
            }
            if (m4681e.m4142c()) {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObject2 = jSONObject.getJSONObject("challenge");
                BigInteger bigInteger = new BigInteger(jSONObject2.getString("challenge"));
                String string = jSONObject2.getString("request_id");
                String string2 = jSONObject.getString("request_time");
                List m2380f = m2380f(bigInteger);
                if (m2380f.size() == 2) {
                    JSONObject put = new JSONObject().put("challenge", new JSONObject().put("request_id", string).put("challenge", bigInteger.toString())).put("answer", new JSONArray((Collection) AbstractC1806n.m3067O(((BigInteger) m2380f.get(0)).toString(), ((BigInteger) m2380f.get(1)).toString()))).put("request_time", string2);
                    C2625z c2625z2 = new C2625z();
                    c2625z2.m4194f("https://" + str3 + "/v3/challenge/submit_answer");
                    c2625z2.m4191c("Host", str3);
                    c2625z2.m4191c("User-Agent", "NextTrace/NTrace-core Android HBCS-SpeedTest");
                    String jSONObject3 = put.toString();
                    AbstractC3367j.m5099d(jSONObject3, "toString(...)");
                    c2625z2.m4192d("POST", AbstractC2595c.m4131e(jSONObject3, f8489i));
                    C2598d0 m4681e2 = c2623x.m4187b(c2625z2.m4189a()).m4681e();
                    AbstractC2602f0 abstractC2602f02 = m4681e2.f14062k;
                    if (abstractC2602f02 != null) {
                        str2 = abstractC2602f02.m4148h();
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        str4 = str2;
                    }
                    if (m4681e2.m4142c()) {
                        String string3 = new JSONObject(str4).getString("token");
                        AbstractC3367j.m5099d(string3, "getString(...)");
                        return string3;
                    }
                    throw new IllegalStateException("NextTrace PoW 提交失败");
                }
                throw new IllegalStateException("NextTrace PoW 求解失败");
            }
            throw new IllegalStateException("NextTrace PoW 请求失败");
        }
        throw new IllegalStateException("无法解析 NextTrace API");
    }

    public /* synthetic */ C1403wl(String str, String str2) {
        this(EnumC1465yl.f9455e, str, "", "", str2);
    }
}
