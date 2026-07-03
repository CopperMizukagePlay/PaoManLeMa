package p039e5;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p015b6.AbstractC0307n;
import p015b6.C0301h;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0450q;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0565q1;
import p032d6.C0568r1;
import p053g5.C1689h;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p054g6.C1715p;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.C1803k;
import p060h5.C1813u;
import p068i5.AbstractC2080d;
import p068i5.C2079c;
import p069i6.C2090c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.C3375r;
import p158u5.C3378u;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.sc */
/* loaded from: classes.dex */
public final class C1270sc {

    /* renamed from: m */
    public static final Pattern f7550m = Pattern.compile("\\[SUM\\]\\s+([0-9.]+)-([0-9.]+)\\s+sec\\s+[0-9.]++\\s+\\w++\\s+([0-9.]+)\\s+(\\w+bits/sec)", 2);

    /* renamed from: a */
    public final C2090c f7551a;

    /* renamed from: b */
    public final AtomicBoolean f7552b;

    /* renamed from: c */
    public final AtomicBoolean f7553c;

    /* renamed from: d */
    public Context f7554d;

    /* renamed from: e */
    public final ArrayList f7555e;

    /* renamed from: f */
    public C0565q1 f7556f;

    /* renamed from: g */
    public final AtomicReference f7557g;

    /* renamed from: h */
    public final AtomicReference f7558h;

    /* renamed from: i */
    public final C1701c0 f7559i;

    /* renamed from: j */
    public final C1715p f7560j;

    /* renamed from: k */
    public int f7561k;

    /* renamed from: l */
    public final ArrayList f7562l;

    public C1270sc() {
        C0568r1 m1124b = AbstractC0525d0.m1124b();
        C2325e c2325e = AbstractC0549l0.f1898a;
        this.f7551a = AbstractC0525d0.m1123a(AbstractC2080d.m3374B(m1124b, ExecutorC2324d.f13302g));
        this.f7552b = new AtomicBoolean(false);
        this.f7553c = new AtomicBoolean(false);
        this.f7555e = new ArrayList();
        this.f7557g = new AtomicReference(null);
        this.f7558h = new AtomicReference(null);
        C1701c0 m2771b = AbstractC1719t.m2771b(new C1394wc(null, null, null, null, 0, null, null, null, 0, 0, 0, 2097151));
        this.f7559i = m2771b;
        this.f7560j = new C1715p(m2771b);
        this.f7562l = new ArrayList();
    }

    /* renamed from: a */
    public static final C2079c m2311a(C1270sc c1270sc, File file, String str, int i7, EnumC1332uc enumC1332uc, EnumC0803dc enumC0803dc, int i8, int i9, int i10) {
        C2079c m5802f = AbstractC3784a.m5802f();
        String absolutePath = file.getAbsolutePath();
        AbstractC3367j.m5099d(absolutePath, "getAbsolutePath(...)");
        m5802f.add(absolutePath);
        m5802f.add("-c");
        m5802f.add(str);
        m5802f.add("-p");
        m5802f.add(String.valueOf(i7));
        m5802f.add("-t");
        m5802f.add(String.valueOf(i9));
        m5802f.add("-P");
        m5802f.add(String.valueOf(i8));
        m5802f.add("-i");
        m5802f.add(String.valueOf(i10));
        m5802f.add("-N");
        m5802f.add("--json-stream");
        m5802f.add("--forceflush");
        if (enumC1332uc == EnumC1332uc.f7920g) {
            m5802f.add("-u");
        }
        int ordinal = enumC0803dc.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m5802f.add("--bidir");
                } else {
                    throw new RuntimeException();
                }
            } else {
                m5802f.add("-R");
            }
        }
        return AbstractC3784a.m5798b(m5802f);
    }

    /* renamed from: b */
    public static final String m2312b(C1270sc c1270sc, int i7, String str, C1803k c1803k) {
        StringBuilder sb = new StringBuilder();
        sb.append("iperf3 退出码 " + i7);
        sb.append("\n命令: " + str);
        String m666E = AbstractC0307n.m666E(new C0301h(AbstractC1805m.m3039c0(c1803k), true, new C1263s5(29)), "\n");
        if (!AbstractC0444k.m937a0(m666E)) {
            sb.append("\n输出: ");
            sb.append(m666E);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static final List m2313c(C1270sc c1270sc, File file, int i7, int i8) {
        return AbstractC1806n.m3067O(file.getAbsolutePath(), "-s", "-p", String.valueOf(i7), "-i", String.valueOf(i8), "-N", "--json-stream", "--forceflush");
    }

    /* renamed from: d */
    public static final String m2314d(C1270sc c1270sc, List list) {
        return AbstractC1805m.m3051o0(list, " ", null, null, new C1263s5(28), 30);
    }

    /* renamed from: g */
    public static final Double m2317g(C1270sc c1270sc, String str) {
        String group;
        Double m964F;
        Matcher matcher = f7550m.matcher(str);
        String str2 = null;
        if (!matcher.find() || (group = matcher.group(3)) == null || (m964F = AbstractC0450q.m964F(group)) == null) {
            return null;
        }
        double doubleValue = m964F.doubleValue();
        String group2 = matcher.group(4);
        if (group2 != null) {
            Locale locale = Locale.US;
            AbstractC3367j.m5099d(locale, "US");
            str2 = group2.toLowerCase(locale);
            AbstractC3367j.m5099d(str2, "toLowerCase(...)");
        }
        if (str2 == null) {
            str2 = "";
        }
        if (AbstractC1806n.m3067O("gbits/sec", "gbit/sec").contains(str2)) {
            return Double.valueOf(doubleValue * 1.0E9d);
        }
        if (AbstractC1806n.m3067O("mbits/sec", "mbit/sec").contains(str2)) {
            return Double.valueOf(doubleValue * 1000000.0d);
        }
        if (AbstractC1806n.m3067O("kbits/sec", "kbit/sec").contains(str2)) {
            return Double.valueOf(doubleValue * 1000.0d);
        }
        return m964F;
    }

    /* renamed from: h */
    public static final String m2318h(C1270sc c1270sc, String str) {
        Object m2985m;
        try {
            m2985m = new JSONObject(str);
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (m2985m instanceof C1689h) {
            m2985m = null;
        }
        JSONObject jSONObject = (JSONObject) m2985m;
        if (jSONObject == null || !AbstractC3367j.m5096a(jSONObject.optString("event"), "error")) {
            return null;
        }
        Object opt = jSONObject.opt("data");
        CharSequence charSequence = "iperf3 报错";
        if (opt == null) {
            return "iperf3 报错";
        }
        if (opt instanceof String) {
            CharSequence charSequence2 = (CharSequence) opt;
            if (!AbstractC0444k.m937a0(charSequence2)) {
                charSequence = charSequence2;
            }
            return (String) charSequence;
        }
        String obj = opt.toString();
        if (AbstractC0444k.m937a0(obj)) {
            return "iperf3 报错";
        }
        return obj;
    }

    /* renamed from: i */
    public static final C0898gc m2319i(C1270sc c1270sc, String str, EnumC1363vc enumC1363vc) {
        Object m2985m;
        JSONObject optJSONObject;
        EnumC1332uc enumC1332uc;
        EnumC0803dc enumC0803dc;
        JSONObject optJSONObject2;
        try {
            m2985m = new JSONObject(str);
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        String str2 = null;
        if (m2985m instanceof C1689h) {
            m2985m = null;
        }
        JSONObject jSONObject = (JSONObject) m2985m;
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("event");
        AbstractC3367j.m5099d(optString, "optString(...)");
        if (!AbstractC0444k.m937a0(optString) && !AbstractC3367j.m5096a(jSONObject.optString("event"), "start")) {
            return null;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("data");
        if (optJSONObject3 != null) {
            jSONObject = optJSONObject3;
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("start");
        if (optJSONObject4 == null || (optJSONObject = optJSONObject4.optJSONObject("test_start")) == null) {
            return null;
        }
        if (AbstractC0451r.m966H(optJSONObject.optString("protocol"), "UDP")) {
            enumC1332uc = EnumC1332uc.f7920g;
        } else {
            enumC1332uc = EnumC1332uc.f7919f;
        }
        EnumC1332uc enumC1332uc2 = enumC1332uc;
        if (optJSONObject.optInt("bidir", 0) != 1 && optJSONObject.optInt("bidirectional", 0) != 1) {
            if (optJSONObject.optInt("reverse", 0) == 1) {
                enumC0803dc = EnumC0803dc.f3386g;
            } else {
                enumC0803dc = EnumC0803dc.f3385f;
            }
        } else {
            enumC0803dc = EnumC0803dc.f3387h;
        }
        if (enumC1363vc == EnumC1363vc.f8155g) {
            enumC0803dc = ((C1394wc) c1270sc.f7559i.getValue()).f8329e;
        }
        EnumC0803dc enumC0803dc2 = enumC0803dc;
        JSONArray optJSONArray = optJSONObject4.optJSONArray("connected");
        if (optJSONArray != null && (optJSONObject2 = optJSONArray.optJSONObject(0)) != null) {
            str2 = optJSONObject2.optString("remote_host");
        }
        if (str2 == null) {
            str2 = "";
        }
        return new C0898gc(enumC1332uc2, enumC0803dc2, optJSONObject.optInt("duration", 0), optJSONObject.optInt("num_streams", 0), str2);
    }

    /* renamed from: j */
    public static final C0930hc m2320j(C1270sc c1270sc, String str, EnumC1363vc enumC1363vc, EnumC0803dc enumC0803dc) {
        Object m2985m;
        try {
            m2985m = new JSONObject(str);
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (m2985m instanceof C1689h) {
            m2985m = null;
        }
        JSONObject jSONObject = (JSONObject) m2985m;
        if (jSONObject == null) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            jSONObject = optJSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("intervals");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(optJSONArray.length() - 1);
            AbstractC3367j.m5099d(jSONObject2, "getJSONObject(...)");
            return m2322l(jSONObject2, enumC1363vc, enumC0803dc, false);
        }
        if (!jSONObject.has("sum") && !jSONObject.has("sum_sent") && !jSONObject.has("sum_received")) {
            return null;
        }
        return m2322l(jSONObject, enumC1363vc, enumC0803dc, false);
    }

    /* renamed from: k */
    public static final void m2321k(C1270sc c1270sc, boolean z7, C0930hc c0930hc, String str) {
        ArrayList arrayList = c1270sc.f7562l;
        AtomicReference atomicReference = c1270sc.f7558h;
        AtomicReference atomicReference2 = c1270sc.f7557g;
        if (z7) {
            atomicReference2.set(c0930hc);
        } else {
            atomicReference.set(c0930hc);
        }
        C0930hc m2325r = m2325r((C0930hc) atomicReference2.get(), (C0930hc) atomicReference.get(), ((C1394wc) c1270sc.f7559i.getValue()).f8325a);
        int i7 = c1270sc.f7561k + 1;
        c1270sc.f7561k = i7;
        arrayList.add(new C1301tc(m2325r.f4493c, m2325r.f4491a, m2325r.f4492b, i7));
        c1270sc.m2327o(str, m2325r, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b3, code lost:
    
        if (r29 == r5) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d9, code lost:
    
        if (r7 != null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01db, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01de, code lost:
    
        if (r1 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e0, code lost:
    
        r12.f16447e = r1.optDouble("bits_per_second", 0.0d) + r12.f16447e;
        r4.f16450e = r1.optLong("bytes", 0) + r4.f16450e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01dd, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b8, code lost:
    
        if (r29 == r13) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x021c  */
    /* JADX WARN: Type inference failed for: r12v2, types: [u5.r] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [u5.r] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [u5.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [u5.r] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6, types: [u5.r] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [u5.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v6, types: [u5.u] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v9, types: [u5.r] */
    /* JADX WARN: Type inference failed for: r4v1, types: [u5.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [u5.u] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0930hc m2322l(JSONObject jSONObject, EnumC1363vc enumC1363vc, EnumC0803dc enumC0803dc, boolean z7) {
        List m5798b;
        ?? r12;
        JSONObject jSONObject2;
        C3378u c3378u;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        boolean z8;
        boolean z9;
        double optDouble;
        double d7;
        JSONObject optJSONObject = jSONObject.optJSONObject("sum_sent");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("sum_received");
        JSONObject optJSONObject3 = jSONObject.optJSONObject("sum_bidir_reverse_sent");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("sum_bidir_reverse_received");
        JSONObject optJSONObject5 = jSONObject.optJSONObject("sum");
        JSONObject optJSONObject6 = jSONObject.optJSONObject("sum_bidir_reverse");
        JSONArray optJSONArray = jSONObject.optJSONArray("streams");
        if (optJSONArray == null) {
            m5798b = C1813u.f10860e;
        } else {
            C2079c m5802f = AbstractC3784a.m5802f();
            int length = optJSONArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                JSONObject optJSONObject7 = optJSONArray.optJSONObject(i7);
                if (optJSONObject7 != null) {
                    JSONObject optJSONObject8 = optJSONObject7.optJSONObject("sender");
                    if (optJSONObject8 != null) {
                        m5802f.add(optJSONObject8);
                    }
                    JSONObject optJSONObject9 = optJSONObject7.optJSONObject("receiver");
                    if (optJSONObject9 != null) {
                        m5802f.add(optJSONObject9);
                    }
                    if (!optJSONObject7.has("sender") && !optJSONObject7.has("receiver")) {
                        JSONObject optJSONObject10 = optJSONObject7.optJSONObject("udp");
                        if (optJSONObject10 != null) {
                            m5802f.add(optJSONObject10);
                        }
                        JSONObject optJSONObject11 = optJSONObject7.optJSONObject("tcp");
                        if (optJSONObject11 != null) {
                            m5802f.add(optJSONObject11);
                        }
                    }
                }
            }
            m5798b = AbstractC3784a.m5798b(m5802f);
        }
        List list = m5798b;
        ?? obj = new Object();
        Object obj2 = new Object();
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        EnumC0803dc enumC0803dc2 = EnumC0803dc.f3387h;
        if (enumC0803dc != enumC0803dc2 || (optJSONObject3 == null && optJSONObject4 == null)) {
            r12 = obj2;
            EnumC1363vc enumC1363vc2 = enumC1363vc;
            EnumC1363vc enumC1363vc3 = EnumC1363vc.f8154f;
            EnumC1363vc enumC1363vc4 = EnumC1363vc.f8155g;
            if (enumC0803dc == enumC0803dc2 && (optJSONObject5 != null || optJSONObject6 != null)) {
                obj4 = obj4;
                obj = obj;
                obj3 = obj3;
                if (optJSONObject5 != null) {
                    if (enumC1363vc2 == enumC1363vc4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    m2323m(obj, obj3, r12, obj4, optJSONObject5, z9);
                    obj = obj;
                    obj3 = obj3;
                    obj4 = obj4;
                }
                if (optJSONObject6 != null) {
                    if (enumC1363vc2 == enumC1363vc3) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    C3378u c3378u2 = obj4;
                    m2323m(obj, obj3, r12, c3378u2, optJSONObject6, z8);
                    jSONObject2 = optJSONObject4;
                    c3378u = obj3;
                    r12 = r12;
                    obj4 = c3378u2;
                    obj = obj;
                    jSONObject3 = optJSONObject3;
                    if (optJSONObject == null) {
                    }
                    if (optJSONObject == null) {
                    }
                    return new C0930hc(obj.f16447e, r12.f16447e, d7, c3378u.f16450e, obj4.f16450e);
                }
            } else {
                if (optJSONObject == null && optJSONObject2 == null) {
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            m2324n(enumC1363vc2, obj, obj3, r12, obj4, (JSONObject) it.next());
                            enumC1363vc2 = enumC1363vc;
                        }
                    } else if (optJSONObject5 != null) {
                        m2324n(enumC1363vc, obj, obj3, r12, obj4, optJSONObject5);
                        c3378u = obj3;
                        jSONObject3 = optJSONObject3;
                        jSONObject2 = optJSONObject4;
                    }
                } else if (enumC0803dc == enumC0803dc2) {
                    if (optJSONObject != null) {
                        obj.f16447e = optJSONObject.optDouble("bits_per_second", 0.0d) + obj.f16447e;
                        c3378u = obj3;
                        jSONObject3 = optJSONObject3;
                        jSONObject2 = optJSONObject4;
                        c3378u.f16450e = optJSONObject.optLong("bytes", 0L) + c3378u.f16450e;
                    } else {
                        jSONObject2 = optJSONObject4;
                        c3378u = obj3;
                        jSONObject3 = optJSONObject3;
                    }
                    if (optJSONObject2 != null) {
                        r12.f16447e = optJSONObject2.optDouble("bits_per_second", 0.0d) + r12.f16447e;
                        obj4.f16450e = optJSONObject2.optLong("bytes", 0L) + obj4.f16450e;
                    }
                } else {
                    jSONObject2 = optJSONObject4;
                    c3378u = obj3;
                    jSONObject3 = optJSONObject3;
                    int ordinal = enumC0803dc.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                throw new RuntimeException();
                            }
                        }
                        if (optJSONObject == null) {
                            jSONObject4 = optJSONObject5;
                        } else {
                            jSONObject4 = optJSONObject;
                        }
                        if (jSONObject4 != null) {
                            obj.f16447e = jSONObject4.optDouble("bits_per_second", 0.0d) + obj.f16447e;
                            c3378u.f16450e = jSONObject4.optLong("bytes", 0L) + c3378u.f16450e;
                        }
                    }
                }
                if (optJSONObject == null) {
                    if (optJSONObject2 == null) {
                        if (jSONObject3 == null) {
                            if (jSONObject2 == null) {
                                if (optJSONObject5 == null) {
                                    if (optJSONObject6 == null) {
                                        optJSONObject = (JSONObject) AbstractC1805m.m3047k0(list);
                                    } else {
                                        optJSONObject = optJSONObject6;
                                    }
                                } else {
                                    optJSONObject = optJSONObject5;
                                }
                            } else {
                                optJSONObject = jSONObject2;
                            }
                        } else {
                            optJSONObject = jSONObject3;
                        }
                    } else {
                        optJSONObject = optJSONObject2;
                    }
                }
                if (optJSONObject == null) {
                    d7 = 0.0d;
                } else {
                    if (z7) {
                        optDouble = optJSONObject.optDouble("seconds", optJSONObject.optDouble("end", 0.0d));
                    } else {
                        optDouble = optJSONObject.optDouble("end", optJSONObject.optDouble("seconds", 0.0d));
                    }
                    d7 = optDouble;
                }
                return new C0930hc(obj.f16447e, r12.f16447e, d7, c3378u.f16450e, obj4.f16450e);
            }
        } else {
            ArrayList m3068P = AbstractC1806n.m3068P(optJSONObject, optJSONObject2, optJSONObject3, optJSONObject4);
            int size = m3068P.size();
            int i8 = 0;
            Object obj5 = obj2;
            while (i8 < size) {
                m2324n(enumC1363vc, obj, obj3, obj5, obj4, (JSONObject) m3068P.get(i8));
                obj5 = obj5;
                i8++;
                m3068P = m3068P;
            }
            r12 = obj5;
        }
        jSONObject2 = optJSONObject4;
        c3378u = obj3;
        obj4 = obj4;
        obj = obj;
        jSONObject3 = optJSONObject3;
        if (optJSONObject == null) {
        }
        if (optJSONObject == null) {
        }
        return new C0930hc(obj.f16447e, r12.f16447e, d7, c3378u.f16450e, obj4.f16450e);
    }

    /* renamed from: m */
    public static final void m2323m(C3375r c3375r, C3378u c3378u, C3375r c3375r2, C3378u c3378u2, JSONObject jSONObject, boolean z7) {
        if (jSONObject.has("sender")) {
            z7 = jSONObject.optBoolean("sender");
        }
        double optDouble = jSONObject.optDouble("bits_per_second", 0.0d);
        long optLong = jSONObject.optLong("bytes", 0L);
        if (z7) {
            c3375r.f16447e += optDouble;
            c3378u.f16450e += optLong;
        } else {
            c3375r2.f16447e += optDouble;
            c3378u2.f16450e += optLong;
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m2324n(EnumC1363vc enumC1363vc, C3375r c3375r, C3378u c3378u, C3375r c3375r2, C3378u c3378u2, JSONObject jSONObject) {
        boolean z7;
        if (enumC1363vc == EnumC1363vc.f8155g) {
            z7 = true;
        } else {
            z7 = false;
        }
        m2323m(c3375r, c3378u, c3375r2, c3378u2, jSONObject, z7);
    }

    /* renamed from: r */
    public static C0930hc m2325r(C0930hc c0930hc, C0930hc c0930hc2, EnumC1363vc enumC1363vc) {
        double d7;
        double d8;
        double d9;
        long j6;
        double d10;
        double d11;
        double d12;
        long j7;
        int ordinal = enumC1363vc.ordinal();
        long j8 = 0;
        double d13 = 0.0d;
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (c0930hc != null) {
                    d10 = c0930hc.f4491a;
                } else {
                    d10 = 0.0d;
                }
                if (c0930hc2 != null) {
                    d11 = c0930hc2.f4492b;
                } else {
                    d11 = 0.0d;
                }
                if (c0930hc != null) {
                    d12 = c0930hc.f4493c;
                } else {
                    d12 = 0.0d;
                }
                if (c0930hc2 != null) {
                    d13 = c0930hc2.f4493c;
                }
                double max = Math.max(d12, d13);
                if (c0930hc != null) {
                    j7 = c0930hc.f4494d;
                } else {
                    j7 = 0;
                }
                if (c0930hc2 != null) {
                    j8 = c0930hc2.f4495e;
                }
                return new C0930hc(d10, d11, max, j7, j8);
            }
            throw new RuntimeException();
        }
        if (c0930hc2 != null) {
            d7 = c0930hc2.f4491a;
        } else {
            d7 = 0.0d;
        }
        if (c0930hc != null) {
            d8 = c0930hc.f4492b;
        } else {
            d8 = 0.0d;
        }
        if (c0930hc != null) {
            d9 = c0930hc.f4493c;
        } else {
            d9 = 0.0d;
        }
        if (c0930hc2 != null) {
            d13 = c0930hc2.f4493c;
        }
        double max2 = Math.max(d9, d13);
        if (c0930hc2 != null) {
            j6 = c0930hc2.f4494d;
        } else {
            j6 = 0;
        }
        if (c0930hc != null) {
            j8 = c0930hc.f4495e;
        }
        return new C0930hc(d7, d8, max2, j6, j8);
    }

    /* renamed from: t */
    public static /* synthetic */ Object m2326t(C1270sc c1270sc, C2079c c2079c, String str, String str2, EnumC0803dc enumC0803dc, InterfaceC3279c interfaceC3279c, AbstractC2590j abstractC2590j, int i7) {
        InterfaceC3279c interfaceC3279c2;
        if ((i7 & 64) != 0) {
            interfaceC3279c2 = null;
        } else {
            interfaceC3279c2 = interfaceC3279c;
        }
        return c1270sc.m2330s(EnumC1363vc.f8155g, c2079c, str, str2, "测试完成", enumC0803dc, interfaceC3279c2, false, abstractC2590j);
    }

    /* renamed from: o */
    public final void m2327o(String str, C0930hc c0930hc, ArrayList arrayList) {
        C1701c0 c1701c0 = this.f7559i;
        C1394wc c1394wc = (C1394wc) c1701c0.getValue();
        double d7 = c0930hc.f4491a;
        double d8 = c0930hc.f4492b;
        C1394wc m2374a = C1394wc.m2374a(c1394wc, str, null, null, null, 0, 0, d7, d8, d7 + d8, c0930hc.f4493c, c0930hc.f4494d, c0930hc.f4495e, AbstractC1805m.m3035C0(AbstractC1805m.m3033A0(600, arrayList)), null, null, 1576955);
        c1701c0.getClass();
        c1701c0.m2752j(null, m2374a);
    }

    /* renamed from: p */
    public final void m2328p(String str) {
        int i7 = 0;
        this.f7552b.set(false);
        synchronized (this.f7555e) {
            try {
                ArrayList arrayList = this.f7555e;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    try {
                        ((Process) obj).destroyForcibly();
                    } catch (Throwable th) {
                        AbstractC1793a0.m2985m(th);
                    }
                }
                this.f7555e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C1701c0 c1701c0 = this.f7559i;
        C1394wc m2374a = C1394wc.m2374a((C1394wc) c1701c0.getValue(), "失败", null, null, null, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0L, 0L, null, null, str, 1048569);
        c1701c0.getClass();
        c1701c0.m2752j(null, m2374a);
    }

    /* renamed from: q */
    public final C1715p m2329q() {
        return this.f7560j;
    }

    /* renamed from: s */
    public final Object m2330s(EnumC1363vc enumC1363vc, List list, String str, String str2, String str3, EnumC0803dc enumC0803dc, InterfaceC3279c interfaceC3279c, boolean z7, AbstractC2590j abstractC2590j) {
        C2325e c2325e = AbstractC0549l0.f1898a;
        return AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C1146oc(list, this, enumC1363vc, str, enumC0803dc, interfaceC3279c, z7, str3, str2, null), abstractC2590j);
    }

    /* renamed from: u */
    public final void m2331u() {
        this.f7553c.set(true);
        int i7 = 0;
        this.f7552b.set(false);
        C0565q1 c0565q1 = this.f7556f;
        if (c0565q1 != null) {
            c0565q1.mo1114c(null);
        }
        this.f7556f = null;
        synchronized (this.f7555e) {
            try {
                ArrayList arrayList = this.f7555e;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    try {
                        ((Process) obj).destroyForcibly();
                    } catch (Throwable th) {
                        AbstractC1793a0.m2985m(th);
                    }
                }
                this.f7555e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f7557g.set(null);
        this.f7558h.set(null);
        C1394wc c1394wc = (C1394wc) this.f7559i.getValue();
        if (c1394wc.f8326b) {
            C1701c0 c1701c0 = this.f7559i;
            C1394wc m2374a = C1394wc.m2374a(c1394wc, "已停止", null, null, null, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, 0L, 0L, null, null, null, 2068473);
            c1701c0.getClass();
            c1701c0.m2752j(null, m2374a);
        }
    }
}
