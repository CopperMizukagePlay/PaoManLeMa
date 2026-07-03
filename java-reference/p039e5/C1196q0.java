package p039e5;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.provider.DocumentsContract;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p001a0.AbstractC0094y0;
import p001a0.C0019e1;
import p001a0.C0068q2;
import p001a0.C0073s;
import p008b.C0226c0;
import p008b.C0242k0;
import p015b6.AbstractC0307n;
import p015b6.C0294a;
import p015b6.C0300g;
import p015b6.C0301h;
import p015b6.C0308o;
import p015b6.C0310q;
import p015b6.InterfaceC0305l;
import p017c.C0320e;
import p017c.C0321f;
import p018c0.C0334d;
import p024c6.AbstractC0434a;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p024c6.C0438e;
import p024c6.C0439f;
import p028d2.C0492y;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0550l1;
import p032d6.C0565q1;
import p032d6.C0568r1;
import p032d6.InterfaceC0520b1;
import p053g5.C1687f;
import p053g5.C1689h;
import p053g5.C1690i;
import p053g5.C1691j;
import p053g5.C1694m;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p054g6.C1715p;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1817y;
import p060h5.C1813u;
import p068i5.AbstractC2080d;
import p069i6.C2090c;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p098m5.AbstractC2583c;
import p099m6.AbstractC2602f0;
import p099m6.C2592a0;
import p099m6.C2598d0;
import p099m6.C2622w;
import p099m6.C2623x;
import p099m6.C2625z;
import p099m6.EnumC2624y;
import p102n1.AbstractC2710c;
import p128q6.C3006i;
import p135r5.AbstractC3063j;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.C3377t;
import p158u5.C3378u;
import p174w5.AbstractC3784a;
import p195z5.C3878c;
import p195z5.C3879d;
import p195z5.C3881f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.q0 */
/* loaded from: classes.dex */
public final class C1196q0 {

    /* renamed from: p */
    public static final C1247rk f6960p = new C1247rk(5);

    /* renamed from: q */
    public static volatile C1196q0 f6961q;

    /* renamed from: a */
    public final Context f6962a;

    /* renamed from: b */
    public final C1691j f6963b;

    /* renamed from: c */
    public String f6964c;

    /* renamed from: d */
    public final long f6965d;

    /* renamed from: e */
    public final C2090c f6966e;

    /* renamed from: f */
    public final C2090c f6967f;

    /* renamed from: g */
    public final ConcurrentHashMap f6968g;

    /* renamed from: h */
    public final ConcurrentHashMap f6969h;

    /* renamed from: i */
    public final AtomicBoolean f6970i;

    /* renamed from: j */
    public final C1701c0 f6971j;

    /* renamed from: k */
    public final C1715p f6972k;

    /* renamed from: l */
    public final C1701c0 f6973l;

    /* renamed from: m */
    public final C1715p f6974m;

    /* renamed from: n */
    public final C2623x f6975n;

    /* renamed from: o */
    public final C2623x f6976o;

    /* JADX WARN: Removed duplicated region for block: B:40:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1196q0(Context context) {
        Object m2985m;
        Object obj;
        C1687f c1687f;
        C1071m m2133u;
        long j6;
        this.f6962a = context;
        int i7 = 0;
        C1691j m4327J = AbstractC2710c.m4327J(new C0726b(this, i7));
        this.f6963b = m4327J;
        long maxMemory = Runtime.getRuntime().maxMemory() / 1048576;
        this.f6965d = maxMemory < 1 ? 1L : maxMemory;
        C0568r1 m1124b = AbstractC0525d0.m1124b();
        C2325e c2325e = AbstractC0549l0.f1898a;
        this.f6966e = AbstractC0525d0.m1123a(AbstractC2080d.m3374B(m1124b, ExecutorC2324d.f13302g));
        this.f6967f = AbstractC0525d0.m1123a(AbstractC2080d.m3374B(AbstractC0525d0.m1124b(), AbstractC0549l0.f1898a.mo1245L(2)));
        this.f6968g = new ConcurrentHashMap();
        this.f6969h = new ConcurrentHashMap();
        this.f6970i = new AtomicBoolean(true);
        try {
            m2985m = Boolean.valueOf(((SharedPreferences) m4327J.getValue()).contains("tasks"));
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        m2985m = m2985m instanceof C1689h ? null : m2985m;
        m2106w("load_begin prefsKey=" + m2985m + " manifest=" + m2104q(m2132t()) + " backup=" + m2104q(new File(m2131s(), ".download-tasks.backup.json")) + " dir=" + m2131s().getAbsolutePath());
        try {
            List m2118O = m2118O();
            ArrayList m2110C = m2110C(m2118O);
            m2106w("load_success stored=" + m2092R(m2118O) + " normalized=" + m2092R(m2110C));
            obj = m2110C;
        } catch (Throwable th2) {
            obj = AbstractC1793a0.m2985m(th2);
        }
        Throwable m2747a = C1690i.m2747a(obj);
        if (m2747a != null) {
            AtomicBoolean atomicBoolean = AbstractC0697a2.f2310a;
            AbstractC0697a2.m1488a("download_tasks_load_failed " + m2747a.getClass().getSimpleName() + ": " + m2747a.getMessage());
            m2105v("load_failed returning_empty", m2747a);
        }
        C1701c0 m2771b = AbstractC1719t.m2771b((List) (obj instanceof C1689h ? C1813u.f10860e : obj));
        this.f6971j = m2771b;
        this.f6972k = new C1715p(m2771b);
        List<C0800d9> list = (List) m2771b.getValue();
        ArrayList arrayList = new ArrayList();
        for (C0800d9 c0800d9 : list) {
            if (c0800d9.f3351l != EnumC0768c9.f3010j) {
                long j7 = 0;
                if (c0800d9.f3352m > 0 && (m2133u = m2133u(c0800d9)) != null) {
                    String str = c0800d9.f3340a;
                    ArrayList arrayList2 = m2133u.f5750a;
                    ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(arrayList2));
                    int size = arrayList2.size();
                    int i8 = i7;
                    while (i8 < size) {
                        Object obj2 = arrayList2.get(i8);
                        i8++;
                        C1102n c1102n = (C1102n) obj2;
                        int i9 = c1102n.f6127a;
                        AtomicLong atomicLong = c1102n.f6128b;
                        long j8 = atomicLong.get();
                        long j9 = j7;
                        long j10 = c1102n.f6129c.get();
                        long j11 = c1102n.f6130d.get() - atomicLong.get();
                        if (j11 < j9) {
                            j6 = j9;
                        } else {
                            j6 = j11;
                        }
                        arrayList3.add(new C0831e9(i9, j8, j10, j6, m2103j(c0800d9, c1102n.f6127a), "已暂停"));
                        j7 = j9;
                    }
                    c1687f = new C1687f(str, arrayList3);
                    if (c1687f == null) {
                        arrayList.add(c1687f);
                    }
                    i7 = 0;
                }
            }
            c1687f = null;
            if (c1687f == null) {
            }
            i7 = 0;
        }
        C1701c0 m2771b2 = AbstractC1719t.m2771b(AbstractC1817y.m3086R(arrayList));
        this.f6973l = m2771b2;
        this.f6974m = new C1715p(m2771b2);
        C2622w c2622w = new C2622w();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c2622w.m4180a(20L, timeUnit);
        c2622w.m4183d(30L, timeUnit);
        c2622w.f14173h = true;
        c2622w.f14174i = true;
        C2623x c2623x = new C2623x(c2622w);
        this.f6975n = c2623x;
        C2622w m4186a = c2623x.m4186a();
        m4186a.m4182c(AbstractC3784a.m5817z(EnumC2624y.f14223g));
        this.f6976o = new C2623x(m4186a);
        m2106w("manager_initialized " + m2092R((List) this.f6971j.getValue()));
        new ConcurrentHashMap();
    }

    /* renamed from: B */
    public static C1071m m2086B(int i7, long j6) {
        long j7;
        long j8;
        if (j6 < 1) {
            j7 = 1;
        } else {
            j7 = j6;
        }
        long j9 = i7;
        if (j7 > j9) {
            j7 = j9;
        }
        int i8 = (int) j7;
        long j10 = j6 / i8;
        int i9 = 0;
        C3879d m3513G = AbstractC2168e.m3513G(0, i8);
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(m3513G));
        Iterator it = m3513G.iterator();
        while (true) {
            C3878c c3878c = (C3878c) it;
            if (!c3878c.f18168g) {
                break;
            }
            int nextInt = c3878c.nextInt();
            long j11 = nextInt * j10;
            if (nextInt == i8 - 1) {
                j8 = j6 - 1;
            } else {
                j8 = ((nextInt + 1) * j10) - 1;
            }
            arrayList.add(new C3881f(j11, j8, false));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(arrayList));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int i11 = i9 + 1;
            if (i9 >= 0) {
                C3881f c3881f = (C3881f) obj;
                arrayList2.add(new C1102n(i9, new AtomicLong(c3881f.f18175e), new AtomicLong(c3881f.f18176f), new AtomicLong(c3881f.f18175e)));
                i9 = i11;
            } else {
                AbstractC1806n.m3072T();
                throw null;
            }
        }
        return new C1071m(arrayList2, new ArrayList());
    }

    /* renamed from: E */
    public static List m2087E(String str, String str2) {
        Object m2985m;
        if (AbstractC0444k.m937a0(str)) {
            return C1813u.f10860e;
        }
        JSONArray jSONArray = new JSONArray(str);
        C3879d m3513G = AbstractC2168e.m3513G(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = m3513G.iterator();
        while (true) {
            C3878c c3878c = (C3878c) it;
            if (c3878c.f18168g) {
                int nextInt = c3878c.nextInt();
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(nextInt);
                    AbstractC3367j.m5099d(jSONObject, "getJSONObject(...)");
                    m2985m = m2093S(jSONObject);
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                Throwable m2747a = C1690i.m2747a(m2985m);
                if (m2747a != null) {
                    m2105v("candidate_item_failed source=" + str2 + " index=" + nextInt + " total=" + jSONArray.length(), m2747a);
                }
                if (m2985m instanceof C1689h) {
                    m2985m = null;
                }
                C0800d9 c0800d9 = (C0800d9) m2985m;
                if (c0800d9 != null) {
                    arrayList.add(c0800d9);
                }
            } else {
                return arrayList;
            }
        }
    }

    /* renamed from: L */
    public static C2625z m2088L(C0800d9 c0800d9, String str) {
        C2625z c2625z = new C2625z();
        c2625z.m4194f(str);
        for (Map.Entry entry : c0800d9.f3343d.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (!AbstractC0451r.m966H(str2, "Range")) {
                c2625z.m4191c(str2, str3);
            }
        }
        c2625z.m4191c("Accept-Encoding", "identity");
        Set keySet = c0800d9.f3343d.keySet();
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                if (AbstractC0451r.m966H((String) it.next(), "User-Agent")) {
                    return c2625z;
                }
            }
        }
        c2625z.m4191c("User-Agent", "Mozilla/5.0 (Linux; Android) AppleWebKit/537.36 Chrome/124 Mobile Safari/537.36");
        return c2625z;
    }

    /* renamed from: M */
    public static String m2089M(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String decode;
        Pattern compile = Pattern.compile("filename\\*=UTF-8''([^;]+)", 66);
        AbstractC3367j.m5099d(compile, "compile(...)");
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        Matcher matcher = compile.matcher(str3);
        AbstractC3367j.m5099d(matcher, "matcher(...)");
        C0439f m2978f = AbstractC1793a0.m2978f(matcher, 0, str3);
        if (m2978f != null) {
            str4 = (String) ((C0438e) m2978f.m923a()).get(1);
        } else {
            str4 = null;
        }
        Pattern compile2 = Pattern.compile("filename=\\\"?([^;\\\"]+)", 66);
        AbstractC3367j.m5099d(compile2, "compile(...)");
        if (str == null) {
            str = "";
        }
        Matcher matcher2 = compile2.matcher(str);
        AbstractC3367j.m5099d(matcher2, "matcher(...)");
        C0439f m2978f2 = AbstractC1793a0.m2978f(matcher2, 0, str);
        if (m2978f2 != null) {
            str5 = (String) ((C0438e) m2978f2.m923a()).get(1);
        } else {
            str5 = null;
        }
        if (str4 != null && (decode = URLDecoder.decode(str4, "UTF-8")) != null) {
            str5 = decode;
        } else if (str5 == null) {
            str5 = AbstractC0444k.m952p0(str2, '/', str2);
            if (AbstractC0444k.m937a0(str5)) {
                str5 = null;
            }
        }
        if (str5 != null) {
            String m2090N = m2090N(str5);
            if (!AbstractC0444k.m937a0(m2090N)) {
                return m2090N;
            }
        }
        return null;
    }

    /* renamed from: N */
    public static String m2090N(String str) {
        Pattern compile = Pattern.compile("[\\\\/:*?\"<>|\\u0000-\\u001f]");
        AbstractC3367j.m5099d(compile, "compile(...)");
        AbstractC3367j.m5100e(str, "input");
        String replaceAll = compile.matcher(str).replaceAll("_");
        AbstractC3367j.m5099d(replaceAll, "replaceAll(...)");
        return AbstractC0444k.m955s0(AbstractC0444k.m956t0(replaceAll).toString(), 180);
    }

    /* renamed from: Q */
    public static long m2091Q(List list) {
        if (list.isEmpty()) {
            return 0L;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            C0800d9 c0800d9 = (C0800d9) it.next();
            long max = Math.max(c0800d9.f3358s, c0800d9.f3359t);
            while (it.hasNext()) {
                C0800d9 c0800d92 = (C0800d9) it.next();
                long max2 = Math.max(c0800d92.f3358s, c0800d92.f3359t);
                if (max < max2) {
                    max = max2;
                }
            }
            return (list.size() * 1000000000000L) + max;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: R */
    public static String m2092R(List list) {
        String m3051o0 = AbstractC1805m.m3051o0(AbstractC1805m.m3061y0(AbstractC0000a.m9j(new C0019e1(list)).entrySet(), new C0918h0(1)), ",", null, null, new C0242k0(6), 30);
        if (AbstractC0444k.m937a0(m3051o0)) {
            m3051o0 = "none";
        }
        return "tasks=" + list.size() + " statuses=[" + m3051o0 + "]";
    }

    /* renamed from: S */
    public static C0800d9 m2093S(JSONObject jSONObject) {
        Object m2985m;
        Object m2985m2;
        Object m2985m3;
        JSONObject optJSONObject = jSONObject.optJSONObject("headers");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        Iterator<String> keys = optJSONObject.keys();
        AbstractC3367j.m5099d(keys, "keys(...)");
        InterfaceC0305l m664C = AbstractC0307n.m664C(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((C0294a) m664C).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(next, optJSONObject.optString((String) next));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("addresses");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        String string = jSONObject.getString("id");
        AbstractC3367j.m5099d(string, "getString(...)");
        String string2 = jSONObject.getString("url");
        AbstractC3367j.m5099d(string2, "getString(...)");
        String string3 = jSONObject.getString("fileName");
        AbstractC3367j.m5099d(string3, "getString(...)");
        C3879d m3513G = AbstractC2168e.m3513G(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(m3513G));
        Iterator it2 = m3513G.iterator();
        while (true) {
            C3878c c3878c = (C3878c) it2;
            if (c3878c.f18168g) {
                arrayList.add(optJSONArray.getString(c3878c.nextInt()));
            } else {
                try {
                    break;
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
            }
        }
        String optString = jSONObject.optString("networkStack", "DUAL_STACK");
        AbstractC3367j.m5099d(optString, "optString(...)");
        m2985m = EnumC0704a9.valueOf(optString);
        if (m2985m instanceof C1689h) {
            m2985m = EnumC0704a9.f2345f;
        }
        EnumC0704a9 enumC0704a9 = (EnumC0704a9) m2985m;
        int optInt = jSONObject.optInt("workersPerServer", 4);
        int optInt2 = jSONObject.optInt("maxWorkers", 32);
        try {
            String optString2 = jSONObject.optString("httpProtocol", "HTTP_1_1");
            AbstractC3367j.m5099d(optString2, "optString(...)");
            m2985m2 = EnumC1452y8.valueOf(optString2);
        } catch (Throwable th2) {
            m2985m2 = AbstractC1793a0.m2985m(th2);
        }
        if (m2985m2 instanceof C1689h) {
            m2985m2 = EnumC1452y8.f9301f;
        }
        EnumC1452y8 enumC1452y8 = (EnumC1452y8) m2985m2;
        int m3530q = AbstractC2168e.m3530q(jSONObject.optInt("bufferSizeKb", 64), 8, 1024);
        int m3530q2 = AbstractC2168e.m3530q(jSONObject.optInt("maxTailHedges", 2), 0, 128);
        try {
            String optString3 = jSONObject.optString("status");
            AbstractC3367j.m5099d(optString3, "optString(...)");
            m2985m3 = EnumC0768c9.valueOf(optString3);
        } catch (Throwable th3) {
            m2985m3 = AbstractC1793a0.m2985m(th3);
        }
        if (m2985m3 instanceof C1689h) {
            m2985m3 = EnumC0768c9.f3009i;
        }
        EnumC0768c9 enumC0768c9 = (EnumC0768c9) m2985m3;
        long optLong = jSONObject.optLong("total", -1L);
        long optLong2 = jSONObject.optLong("downloaded", 0L);
        boolean optBoolean = jSONObject.optBoolean("resume");
        int optInt3 = jSONObject.optInt("threads", 4);
        String optString4 = jSONObject.optString("error");
        AbstractC3367j.m5099d(optString4, "optString(...)");
        long optLong3 = jSONObject.optLong("created");
        long optLong4 = jSONObject.optLong("completed");
        String optString5 = jSONObject.optString("outputUri");
        AbstractC3367j.m5099d(optString5, "optString(...)");
        String optString6 = jSONObject.optString("workingUri");
        AbstractC3367j.m5099d(optString6, "optString(...)");
        return new C0800d9(string, string2, string3, linkedHashMap, arrayList, enumC0704a9, optInt, optInt2, enumC1452y8, m3530q, m3530q2, enumC0768c9, optLong, optLong2, optBoolean, optInt3, optString4, optLong3, optLong4, optString5, optString6, 16384);
    }

    /* renamed from: a */
    public static final void m2094a(C1196q0 c1196q0, AtomicLong atomicLong, long j6, long j7) {
        long j8;
        long j9;
        if (j6 <= 0) {
            atomicLong.get();
            return;
        }
        do {
            j8 = atomicLong.get();
            if (j8 < j7) {
                j9 = j8 + j6;
                if (j9 > j7) {
                    j9 = j7;
                }
            } else {
                return;
            }
        } while (!atomicLong.compareAndSet(j8, j9));
    }

    /* renamed from: b */
    public static final void m2095b(C1196q0 c1196q0, String str) {
        int i7;
        ConcurrentHashMap concurrentHashMap = c1196q0.f6969h;
        Set entrySet = concurrentHashMap.entrySet();
        AbstractC3367j.m5099d(entrySet, "<get-entries>(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = entrySet.iterator();
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object key = ((Map.Entry) next).getKey();
            AbstractC3367j.m5099d(key, "<get-key>(...)");
            if (AbstractC0451r.m971M((String) key, str + ":", false)) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Map.Entry entry = (Map.Entry) obj;
            AbstractC3367j.m5097b(entry);
            Object key2 = entry.getKey();
            AbstractC3367j.m5099d(key2, "component1(...)");
            Object value = entry.getValue();
            AbstractC3367j.m5099d(value, "component2(...)");
            C3006i c3006i = (C3006i) value;
            if (concurrentHashMap.remove((String) key2, c3006i)) {
                c3006i.m4680d();
            }
        }
    }

    /* renamed from: c */
    public static final void m2096c(C1196q0 c1196q0, C0800d9 c0800d9) {
        Object m2985m;
        c1196q0.getClass();
        if (!AbstractC0444k.m937a0(c0800d9.f3361v)) {
            try {
                m2985m = Boolean.valueOf(DocumentsContract.deleteDocument(c1196q0.f6962a.getContentResolver(), Uri.parse(c0800d9.f3361v)));
            } catch (Throwable th) {
                m2985m = AbstractC1793a0.m2985m(th);
            }
            Throwable m2747a = C1690i.m2747a(m2985m);
            if (m2747a != null) {
                m2107x("working_document_delete_failed task=" + AbstractC0444k.m955s0(c0800d9.f3340a, 8) + " error=" + m2747a.getMessage());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:17:0x0096, B:19:0x009f, B:21:0x00a3, B:32:0x00d2, B:49:0x00f6, B:50:0x00f9, B:51:0x00fa, B:52:0x0101, B:53:0x0102, B:54:0x0119, B:45:0x00f3, B:23:0x00ab, B:25:0x00b0, B:28:0x00b5, B:30:0x00bc), top: B:16:0x0096, outer: #5, inners: #2, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102 A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:17:0x0096, B:19:0x009f, B:21:0x00a3, B:32:0x00d2, B:49:0x00f6, B:50:0x00f9, B:51:0x00fa, B:52:0x0101, B:53:0x0102, B:54:0x0119, B:45:0x00f3, B:23:0x00ab, B:25:0x00b0, B:28:0x00b5, B:30:0x00bc), top: B:16:0x0096, outer: #5, inners: #2, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v6, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [u5.t, java.lang.Object] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable m2097d(C1196q0 c1196q0, C0800d9 c0800d9, int i7, C1195q c1195q, C0853f c0853f, AbstractC2583c abstractC2583c) {
        C0695a0 c0695a0;
        int i8;
        C1196q0 c1196q02;
        Throwable th;
        Object obj;
        C1196q0 c1196q03;
        ?? r15;
        C3377t c3377t;
        C2598d0 c2598d0;
        try {
            try {
                if (abstractC2583c instanceof C0695a0) {
                    c0695a0 = (C0695a0) abstractC2583c;
                    int i9 = c0695a0.f2278p;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c0695a0.f2278p = i9 - Integer.MIN_VALUE;
                        C0695a0 c0695a02 = c0695a0;
                        Object obj2 = c0695a02.f2276n;
                        i8 = c0695a02.f2278p;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                i7 = c0695a02.f2275m;
                                C3377t c3377t2 = c0695a02.f2274l;
                                byte[] bArr = c0695a02.f2273k;
                                c0853f = c0695a02.f2272j;
                                C0800d9 c0800d92 = c0695a02.f2271i;
                                C1196q0 c1196q04 = c0695a02.f2270h;
                                try {
                                    AbstractC1793a0.m2972L(obj2);
                                    c3377t = c3377t2;
                                    c1196q03 = c1196q04;
                                    r15 = bArr;
                                    c0800d9 = c0800d92;
                                    obj = obj2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    c0800d9 = c0800d92;
                                    c1196q02 = c1196q04;
                                    c1196q02.m2116J(c0800d9.f3340a, i7, null);
                                    throw th;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC1793a0.m2972L(obj2);
                            long j6 = (c1195q.f6959c - c1195q.f6958b) + 1;
                            if (1 <= j6 && j6 < 524289) {
                                byte[] bArr2 = new byte[(int) j6];
                                ?? obj3 = new Object();
                                try {
                                    int i10 = i7 + c0800d9.f3356q;
                                    C0885g c0885g = new C0885g(c1196q0, c0800d9, i7, 0);
                                    C0320e c0320e = new C0320e(c1196q0, c0800d9, c1195q);
                                    c0695a02.f2270h = c1196q0;
                                    c0695a02.f2271i = c0800d9;
                                    c0695a02.f2272j = c0853f;
                                    c0695a02.f2273k = bArr2;
                                    c0695a02.f2274l = obj3;
                                    c0695a02.f2275m = i7;
                                    c0695a02.f2278p = 1;
                                    c1196q02 = c1196q0;
                                    try {
                                        Object m2128o = c1196q02.m2128o(c0800d9, i10, c0885g, c0320e, c0695a02);
                                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                                        if (m2128o == enumC2465a) {
                                            return enumC2465a;
                                        }
                                        obj = m2128o;
                                        c1196q03 = c1196q02;
                                        c0800d9 = c0800d9;
                                        c3377t = obj3;
                                        r15 = bArr2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c0800d9 = c0800d9;
                                        c1196q02.m2116J(c0800d9.f3340a, i7, null);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    c1196q02 = c1196q0;
                                    th = th4;
                                }
                            } else {
                                throw new IllegalArgumentException("尾段竞速范围无效");
                            }
                        }
                        Closeable closeable = (Closeable) obj;
                        c2598d0 = (C2598d0) closeable;
                        if (c2598d0.f14059h != 206) {
                            AbstractC2602f0 abstractC2602f0 = c2598d0.f14062k;
                            if (abstractC2602f0 != null) {
                                byte[] bArr3 = new byte[65536];
                                InputStream m4147b = abstractC2602f0.m4147b();
                                while (true) {
                                    try {
                                        int i11 = c3377t.f16449e;
                                        if (i11 < r15.length) {
                                            int length = r15.length - i11;
                                            if (length > 65536) {
                                                length = 65536;
                                            }
                                            int read = m4147b.read(bArr3, 0, length);
                                            if (read < 0) {
                                                break;
                                            }
                                            AbstractC1804l.m3013F(c3377t.f16449e, 0, read, bArr3, r15);
                                            c3377t.f16449e += read;
                                            c0853f.mo23f(new Integer(read));
                                        } else {
                                            break;
                                        }
                                    } finally {
                                    }
                                }
                                m4147b.close();
                                AbstractC2168e.m3526m(closeable, null);
                                c1196q03.m2116J(c0800d9.f3340a, i7, null);
                                if (c3377t.f16449e == r15.length) {
                                    return r15;
                                }
                                throw new IllegalStateException("尾段竞速数据不完整");
                            }
                            throw new IllegalStateException("服务器未返回尾段内容");
                        }
                        throw new IllegalStateException(("尾段竞速请求返回 HTTP " + c2598d0.f14059h).toString());
                    }
                }
                c2598d0 = (C2598d0) closeable;
                if (c2598d0.f14059h != 206) {
                }
            } finally {
            }
            Closeable closeable2 = (Closeable) obj;
        } catch (Throwable th5) {
            c1196q02 = c1196q03;
            th = th5;
            c1196q02.m2116J(c0800d9.f3340a, i7, null);
            throw th;
        }
        c0695a0 = new C0695a0(c1196q0, abstractC2583c);
        C0695a0 c0695a022 = c0695a0;
        Object obj22 = c0695a022.f2276n;
        i8 = c0695a022.f2278p;
        if (i8 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2098e(C1196q0 c1196q0, AbstractC2583c abstractC2583c) {
        C0822e0 c0822e0;
        int i7;
        C1196q0 c1196q02;
        Iterator it;
        ConcurrentHashMap concurrentHashMap = c1196q0.f6968g;
        if (abstractC2583c instanceof C0822e0) {
            c0822e0 = (C0822e0) abstractC2583c;
            int i8 = c0822e0.f3588l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0822e0.f3588l = i8 - Integer.MIN_VALUE;
                Object obj = c0822e0.f3586j;
                i7 = c0822e0.f3588l;
                if (i7 == 0) {
                    if (i7 == 1) {
                        it = c0822e0.f3585i;
                        C1196q0 c1196q03 = c0822e0.f3584h;
                        AbstractC1793a0.m2972L(obj);
                        c1196q02 = c1196q03;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c1196q0.f6970i.set(false);
                    Collection values = concurrentHashMap.values();
                    AbstractC3367j.m5099d(values, "<get-values>(...)");
                    List m3035C0 = AbstractC1805m.m3035C0(values);
                    concurrentHashMap.clear();
                    c1196q0.m2124k();
                    Iterator it2 = m3035C0.iterator();
                    c1196q02 = c1196q0;
                    it = it2;
                }
                while (it.hasNext()) {
                    InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) it.next();
                    AbstractC3367j.m5097b(interfaceC0520b1);
                    c0822e0.f3584h = c1196q02;
                    c0822e0.f3585i = it;
                    c0822e0.f3588l = 1;
                    Object m1129g = AbstractC0525d0.m1129g(interfaceC0520b1, c0822e0);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m1129g == enumC2465a) {
                        return enumC2465a;
                    }
                }
                c1196q02.f6970i.set(true);
                return C1694m.f10482a;
            }
        }
        c0822e0 = new C0822e0(c1196q0, abstractC2583c);
        Object obj2 = c0822e0.f3586j;
        i7 = c0822e0.f3588l;
        if (i7 == 0) {
        }
        while (it.hasNext()) {
        }
        c1196q02.f6970i.set(true);
        return C1694m.f10482a;
    }

    /* renamed from: f */
    public static final C1102n m2099f(C1196q0 c1196q0, String str, C1071m c1071m, C1102n c1102n) {
        ArrayList arrayList = c1071m.f5750a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            C1102n c1102n2 = (C1102n) obj;
            if (c1102n2 != c1102n && !c1102n2.f6131e.get() && (c1102n2.f6129c.get() - c1102n2.f6130d.get()) + 1 >= 1048576) {
                arrayList2.add(obj);
            }
        }
        C1102n c1102n3 = (C1102n) AbstractC1805m.m3056t0(arrayList2, new C0492y(new C0918h0(0), 2));
        if (c1102n3 == null) {
            return null;
        }
        AtomicLong atomicLong = c1102n3.f6129c;
        long j6 = atomicLong.get();
        long j7 = c1102n3.f6130d.get();
        final long j8 = (((j6 - j7) + 1) / 2) + j7;
        atomicLong.set(j8 - 1);
        c1102n.f6128b.set(j8);
        c1102n.f6130d.set(j8);
        c1102n.f6129c.set(j6);
        c1196q0.m2123W(c1102n3.f6127a, str, new InterfaceC3279c() { // from class: e5.i
            @Override // p150t5.InterfaceC3279c
            /* renamed from: f */
            public final Object mo23f(Object obj2) {
                C0831e9 c0831e9 = (C0831e9) obj2;
                AbstractC3367j.m5100e(c0831e9, "it");
                return C0831e9.m1519a(c0831e9, 0L, j8 - 1, 0L, 0L, null, "范围已动态缩短", 59);
            }
        });
        c1196q0.m2123W(c1102n.f6127a, str, new C0821e(1, j8, j6));
        return c1102n;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(5:5|6|7|8|9))|8|9) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|6|7|8|9))|167|6|7|8|9|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x023f, code lost:
    
        if (r0 != r13) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0063, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0064, code lost:
    
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0225, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0049, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x004a, code lost:
    
        r2 = r1;
        r1 = r2;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0165 A[Catch: all -> 0x01b8, CancellationException -> 0x02f7, TryCatch #5 {all -> 0x01b8, blocks: (B:85:0x01bb, B:97:0x0193, B:99:0x019b, B:102:0x019f, B:117:0x0153, B:118:0x015f, B:120:0x0165, B:123:0x0174, B:128:0x02c9, B:129:0x02ce, B:133:0x013b, B:139:0x012a, B:152:0x0114), top: B:151:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0255 A[Catch: all -> 0x0049, CancellationException -> 0x02f7, TryCatch #7 {CancellationException -> 0x02f7, blocks: (B:17:0x0044, B:20:0x0059, B:23:0x0296, B:26:0x02a7, B:41:0x006f, B:43:0x0280, B:47:0x007e, B:48:0x0243, B:49:0x024f, B:51:0x0255, B:54:0x0264, B:59:0x02c0, B:60:0x02c5, B:62:0x008b, B:64:0x01eb, B:65:0x01f7, B:67:0x01fd, B:70:0x020c, B:77:0x0228, B:78:0x022d, B:81:0x009b, B:85:0x01bb, B:92:0x00b4, B:95:0x018c, B:97:0x0193, B:99:0x019b, B:102:0x019f, B:107:0x022e, B:109:0x023b, B:115:0x00c6, B:117:0x0153, B:118:0x015f, B:120:0x0165, B:123:0x0174, B:128:0x02c9, B:129:0x02ce, B:131:0x00d1, B:133:0x013b, B:137:0x00e2, B:139:0x012a, B:152:0x0114), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fd A[Catch: all -> 0x0225, CancellationException -> 0x02f7, TryCatch #3 {all -> 0x0225, blocks: (B:64:0x01eb, B:65:0x01f7, B:67:0x01fd, B:70:0x020c, B:77:0x0228, B:78:0x022d, B:109:0x023b), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0193 A[Catch: all -> 0x01b8, CancellationException -> 0x02f7, TRY_ENTER, TryCatch #5 {all -> 0x01b8, blocks: (B:85:0x01bb, B:97:0x0193, B:99:0x019b, B:102:0x019f, B:117:0x0153, B:118:0x015f, B:120:0x0165, B:123:0x0174, B:128:0x02c9, B:129:0x02ce, B:133:0x013b, B:139:0x012a, B:152:0x0114), top: B:151:0x0114 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [e5.q0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v18, types: [e5.q0] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [e5.q0] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [e5.q0] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2100g(C1196q0 c1196q0, String str, AbstractC2583c abstractC2583c) {
        C1010k0 c1010k0;
        ?? r32;
        C1196q0 c1196q02;
        String str2;
        Object obj;
        C0800d9 c0800d9;
        C1196q0 c1196q03;
        C1196q0 c1196q04;
        C1164p c1164p;
        C1196q0 c1196q05;
        C1164p c1164p2;
        C0800d9 c0800d92;
        boolean z7;
        C1196q0 c1196q06;
        String str3;
        C1196q0 c1196q07;
        C1164p c1164p3;
        String str4;
        C1196q0 c1196q08;
        C1196q0 c1196q09;
        C1196q0 c1196q010;
        C0800d9 c0800d93;
        String str5;
        C1196q0 c1196q011;
        C0800d9 c0800d94;
        String str6;
        C0550l1 c0550l1;
        C0334d c0334d;
        ?? r12 = c1196q0;
        String str7 = str;
        try {
            if (abstractC2583c instanceof C1010k0) {
                c1010k0 = (C1010k0) abstractC2583c;
                int i7 = c1010k0.f5185n;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    c1010k0.f5185n = i7 - Integer.MIN_VALUE;
                    C1010k0 c1010k02 = c1010k0;
                    Object obj2 = c1010k02.f5183l;
                    r32 = c1010k02.f5185n;
                    ?? r42 = 1;
                    C1694m c1694m = C1694m.f10482a;
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    switch (r32) {
                        case 0:
                            AbstractC1793a0.m2972L(obj2);
                            Iterator it = ((Iterable) r12.f6971j.getValue()).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (AbstractC3367j.m5096a(((C0800d9) obj).f3340a, str7)) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            c0800d9 = (C0800d9) obj;
                            if (c0800d9 == null) {
                                return c1694m;
                            }
                            try {
                                C0242k0 c0242k0 = new C0242k0(8);
                                c1010k02.f5179h = r12;
                                c1010k02.f5180i = str7;
                                c1010k02.f5181j = c0800d9;
                                c1010k02.f5185n = 1;
                                r12.m2121U(str7, c0242k0);
                                c1196q03 = r12;
                            } catch (Throwable th) {
                                th = th;
                                C0310q c0310q = new C0310q(2, th);
                                c1010k02.f5179h = r12;
                                c1010k02.f5180i = str7;
                                c1010k02.f5181j = null;
                                c1010k02.f5182k = null;
                                c1010k02.f5185n = 12;
                                r12.m2121U(str7, c0310q);
                                if (c1694m != enumC2465a) {
                                }
                                return enumC2465a;
                            }
                            if (c1694m == enumC2465a) {
                                return enumC2465a;
                            }
                            c1010k02.f5179h = c1196q03;
                            c1010k02.f5180i = str7;
                            c1010k02.f5181j = null;
                            c1010k02.f5185n = 2;
                            obj2 = c1196q03.m2115I(c0800d9, c1010k02);
                            c1196q04 = c1196q03;
                            if (obj2 == enumC2465a) {
                                return enumC2465a;
                            }
                            c1164p = (C1164p) obj2;
                            C0321f c0321f = new C0321f(3, c1164p, c1196q04);
                            c1010k02.f5179h = c1196q04;
                            c1010k02.f5180i = str7;
                            c1010k02.f5181j = c1164p;
                            c1010k02.f5185n = 3;
                            c1196q04.m2121U(str7, c0321f);
                            c1196q05 = c1196q04;
                            if (c1694m == enumC2465a) {
                                return enumC2465a;
                            }
                            for (Object obj3 : (Iterable) c1196q05.f6971j.getValue()) {
                                if (AbstractC3367j.m5096a(((C0800d9) obj3).f3340a, str7)) {
                                    c1010k02.f5179h = c1196q05;
                                    c1010k02.f5180i = str7;
                                    c1010k02.f5181j = c1164p;
                                    c1010k02.f5185n = 4;
                                    Object m2114H = c1196q05.m2114H((C0800d9) obj3, c1010k02);
                                    if (m2114H != enumC2465a) {
                                        c1164p2 = c1164p;
                                        obj2 = m2114H;
                                        r12 = c1196q05;
                                        try {
                                            c0800d92 = (C0800d9) obj2;
                                            z7 = c1164p2.f6744b;
                                            if (z7) {
                                                long j6 = c1164p2.f6743a;
                                                if (j6 > 0 && c0800d92.f3356q > 1) {
                                                    try {
                                                        c1010k02.f5179h = r12;
                                                        c1010k02.f5180i = str7;
                                                        c1010k02.f5181j = c1164p2;
                                                        c1010k02.f5182k = c0800d92;
                                                        c1010k02.f5185n = 5;
                                                    } catch (C1133o unused) {
                                                        r12.m2112F(c0800d92).delete();
                                                        r12.m2134y(c0800d92).delete();
                                                        r12.m2127n(c0800d92).delete();
                                                        C0242k0 c0242k02 = new C0242k0(9);
                                                        c1010k02.f5179h = r12;
                                                        c1010k02.f5180i = str7;
                                                        c1010k02.f5181j = c1164p2;
                                                        c1010k02.f5182k = null;
                                                        c1010k02.f5185n = 6;
                                                        r12.m2121U(str7, c0242k02);
                                                        if (c1694m != enumC2465a) {
                                                            c1196q07 = r12;
                                                            c1164p3 = c1164p2;
                                                            while (r0.hasNext()) {
                                                            }
                                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                        }
                                                        return enumC2465a;
                                                    }
                                                    if (r12.m2125l(c0800d92, j6, c1010k02) != enumC2465a) {
                                                        c1196q06 = r12;
                                                        str3 = str7;
                                                        str4 = str3;
                                                        c1196q08 = c1196q06;
                                                        c1196q09 = c1196q08;
                                                        for (Object obj4 : (Iterable) c1196q09.f6971j.getValue()) {
                                                            if (AbstractC3367j.m5096a(((C0800d9) obj4).f3340a, str4)) {
                                                                c0800d93 = (C0800d9) obj4;
                                                                C0242k0 c0242k03 = new C0242k0(10);
                                                                c1010k02.f5179h = c1196q09;
                                                                c1010k02.f5180i = str4;
                                                                c1010k02.f5181j = c0800d93;
                                                                c1010k02.f5182k = null;
                                                                c1010k02.f5185n = 9;
                                                                c1196q09.m2121U(str4, c0242k03);
                                                                if (c1694m == enumC2465a) {
                                                                }
                                                                c1010k02.f5179h = c1196q09;
                                                                c1010k02.f5180i = str4;
                                                                c1010k02.f5181j = c0800d93;
                                                                c1010k02.f5185n = 10;
                                                                obj2 = c1196q09.m2130r(c0800d93, c1010k02);
                                                                if (obj2 != enumC2465a) {
                                                                    str5 = str4;
                                                                    c1196q011 = c1196q09;
                                                                    c0800d94 = c0800d93;
                                                                    try {
                                                                        Uri uri = (Uri) obj2;
                                                                        c0550l1 = C0550l1.f1899f;
                                                                        c0334d = new C0334d(c1196q011, c0800d94, str5, uri, (InterfaceC2313c) null, 2);
                                                                        str6 = str5;
                                                                        try {
                                                                            c1010k02.f5179h = c1196q011;
                                                                            c1010k02.f5180i = str6;
                                                                            c1010k02.f5181j = null;
                                                                            c1010k02.f5185n = 11;
                                                                            if (AbstractC0525d0.m1122A(c0550l1, c0334d, c1010k02) != enumC2465a) {
                                                                                return c1694m;
                                                                            }
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            str7 = str6;
                                                                            r12 = c1196q011;
                                                                            C0310q c0310q2 = new C0310q(2, th);
                                                                            c1010k02.f5179h = r12;
                                                                            c1010k02.f5180i = str7;
                                                                            c1010k02.f5181j = null;
                                                                            c1010k02.f5182k = null;
                                                                            c1010k02.f5185n = 12;
                                                                            r12.m2121U(str7, c0310q2);
                                                                            if (c1694m != enumC2465a) {
                                                                            }
                                                                            return enumC2465a;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        str6 = str5;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                                    }
                                                }
                                            }
                                            long j7 = c1164p2.f6743a;
                                            c1010k02.f5179h = r12;
                                            c1010k02.f5180i = str7;
                                            c1010k02.f5181j = null;
                                            c1010k02.f5185n = 8;
                                            C1196q0 c1196q012 = r12;
                                            Object m2126m = c1196q012.m2126m(c0800d92, j7, z7, c1010k02);
                                            c1196q010 = c1196q012;
                                            break;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            C0310q c0310q22 = new C0310q(2, th);
                                            c1010k02.f5179h = r12;
                                            c1010k02.f5180i = str7;
                                            c1010k02.f5181j = null;
                                            c1010k02.f5182k = null;
                                            c1010k02.f5185n = 12;
                                            r12.m2121U(str7, c0310q22);
                                            if (c1694m != enumC2465a) {
                                                String str8 = str7;
                                                c1196q02 = r12;
                                                str2 = str8;
                                                c1196q02.m2122V(str2, new C0242k0(3));
                                                return c1694m;
                                            }
                                            return enumC2465a;
                                        }
                                    }
                                    return enumC2465a;
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        case 1:
                            C0800d9 c0800d95 = (C0800d9) c1010k02.f5181j;
                            str7 = c1010k02.f5180i;
                            C1196q0 c1196q013 = c1010k02.f5179h;
                            AbstractC1793a0.m2972L(obj2);
                            c0800d9 = c0800d95;
                            c1196q03 = c1196q013;
                            c1010k02.f5179h = c1196q03;
                            c1010k02.f5180i = str7;
                            c1010k02.f5181j = null;
                            c1010k02.f5185n = 2;
                            obj2 = c1196q03.m2115I(c0800d9, c1010k02);
                            c1196q04 = c1196q03;
                            if (obj2 == enumC2465a) {
                            }
                            c1164p = (C1164p) obj2;
                            C0321f c0321f2 = new C0321f(3, c1164p, c1196q04);
                            c1010k02.f5179h = c1196q04;
                            c1010k02.f5180i = str7;
                            c1010k02.f5181j = c1164p;
                            c1010k02.f5185n = 3;
                            c1196q04.m2121U(str7, c0321f2);
                            c1196q05 = c1196q04;
                            if (c1694m == enumC2465a) {
                            }
                            while (r3.hasNext()) {
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        case 2:
                            String str9 = c1010k02.f5180i;
                            C1196q0 c1196q014 = c1010k02.f5179h;
                            AbstractC1793a0.m2972L(obj2);
                            str7 = str9;
                            c1196q04 = c1196q014;
                            c1164p = (C1164p) obj2;
                            C0321f c0321f22 = new C0321f(3, c1164p, c1196q04);
                            c1010k02.f5179h = c1196q04;
                            c1010k02.f5180i = str7;
                            c1010k02.f5181j = c1164p;
                            c1010k02.f5185n = 3;
                            c1196q04.m2121U(str7, c0321f22);
                            c1196q05 = c1196q04;
                            if (c1694m == enumC2465a) {
                            }
                            while (r3.hasNext()) {
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        case 3:
                            C1164p c1164p4 = (C1164p) c1010k02.f5181j;
                            str7 = c1010k02.f5180i;
                            C1196q0 c1196q015 = c1010k02.f5179h;
                            AbstractC1793a0.m2972L(obj2);
                            c1164p = c1164p4;
                            c1196q05 = c1196q015;
                            while (r3.hasNext()) {
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        case 4:
                            C1164p c1164p5 = (C1164p) c1010k02.f5181j;
                            str7 = c1010k02.f5180i;
                            C1196q0 c1196q016 = c1010k02.f5179h;
                            AbstractC1793a0.m2972L(obj2);
                            c1164p2 = c1164p5;
                            r12 = c1196q016;
                            c0800d92 = (C0800d9) obj2;
                            z7 = c1164p2.f6744b;
                            if (z7) {
                            }
                            long j72 = c1164p2.f6743a;
                            c1010k02.f5179h = r12;
                            c1010k02.f5180i = str7;
                            c1010k02.f5181j = null;
                            c1010k02.f5185n = 8;
                            C1196q0 c1196q0122 = r12;
                            Object m2126m2 = c1196q0122.m2126m(c0800d92, j72, z7, c1010k02);
                            c1196q010 = c1196q0122;
                            break;
                        case AbstractC3122c.f15761f /* 5 */:
                            C0800d9 c0800d96 = c1010k02.f5182k;
                            C1164p c1164p6 = (C1164p) c1010k02.f5181j;
                            str3 = c1010k02.f5180i;
                            C1196q0 c1196q017 = c1010k02.f5179h;
                            try {
                                AbstractC1793a0.m2972L(obj2);
                                c1196q06 = c1196q017;
                                str4 = str3;
                                c1196q08 = c1196q06;
                            } catch (C1133o unused2) {
                                c1164p2 = c1164p6;
                                str7 = str3;
                                c0800d92 = c0800d96;
                                r12 = c1196q017;
                                r12.m2112F(c0800d92).delete();
                                r12.m2134y(c0800d92).delete();
                                r12.m2127n(c0800d92).delete();
                                C0242k0 c0242k022 = new C0242k0(9);
                                c1010k02.f5179h = r12;
                                c1010k02.f5180i = str7;
                                c1010k02.f5181j = c1164p2;
                                c1010k02.f5182k = null;
                                c1010k02.f5185n = 6;
                                r12.m2121U(str7, c0242k022);
                                if (c1694m != enumC2465a) {
                                }
                                return enumC2465a;
                            } catch (Throwable th5) {
                                th = th5;
                                str7 = str3;
                                r42 = c1196q017;
                                r12 = r42;
                                C0310q c0310q222 = new C0310q(2, th);
                                c1010k02.f5179h = r12;
                                c1010k02.f5180i = str7;
                                c1010k02.f5181j = null;
                                c1010k02.f5182k = null;
                                c1010k02.f5185n = 12;
                                r12.m2121U(str7, c0310q222);
                                if (c1694m != enumC2465a) {
                                }
                                return enumC2465a;
                            }
                            c1196q09 = c1196q08;
                            while (r0.hasNext()) {
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        case AbstractC3122c.f15759d /* 6 */:
                            c1164p3 = (C1164p) c1010k02.f5181j;
                            str7 = c1010k02.f5180i;
                            C1196q0 c1196q018 = c1010k02.f5179h;
                            AbstractC1793a0.m2972L(obj2);
                            c1196q07 = c1196q018;
                            for (Object obj5 : (Iterable) c1196q07.f6971j.getValue()) {
                                if (AbstractC3367j.m5096a(((C0800d9) obj5).f3340a, str7)) {
                                    long j8 = c1164p3.f6743a;
                                    c1010k02.f5179h = c1196q07;
                                    c1010k02.f5180i = str7;
                                    c1010k02.f5181j = null;
                                    c1010k02.f5185n = 7;
                                    Object m2126m3 = c1196q07.m2126m((C0800d9) obj5, j8, false, c1010k02);
                                    c1196q010 = c1196q07;
                                    if (m2126m3 == enumC2465a) {
                                        return enumC2465a;
                                    }
                                    str4 = str7;
                                    c1196q08 = c1196q010;
                                    c1196q09 = c1196q08;
                                    while (r0.hasNext()) {
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        case 7:
                        case 8:
                            str4 = c1010k02.f5180i;
                            c1196q09 = c1010k02.f5179h;
                            AbstractC1793a0.m2972L(obj2);
                            while (r0.hasNext()) {
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        case AbstractC3122c.f15758c /* 9 */:
                            C0800d9 c0800d97 = (C0800d9) c1010k02.f5181j;
                            String str10 = c1010k02.f5180i;
                            C1196q0 c1196q019 = c1010k02.f5179h;
                            AbstractC1793a0.m2972L(obj2);
                            c0800d93 = c0800d97;
                            str4 = str10;
                            c1196q09 = c1196q019;
                            c1010k02.f5179h = c1196q09;
                            c1010k02.f5180i = str4;
                            c1010k02.f5181j = c0800d93;
                            c1010k02.f5185n = 10;
                            obj2 = c1196q09.m2130r(c0800d93, c1010k02);
                            if (obj2 != enumC2465a) {
                            }
                            return enumC2465a;
                        case AbstractC3122c.f15760e /* 10 */:
                            C0800d9 c0800d98 = (C0800d9) c1010k02.f5181j;
                            String str11 = c1010k02.f5180i;
                            C1196q0 c1196q020 = c1010k02.f5179h;
                            AbstractC1793a0.m2972L(obj2);
                            c0800d94 = c0800d98;
                            str5 = str11;
                            c1196q011 = c1196q020;
                            Uri uri2 = (Uri) obj2;
                            c0550l1 = C0550l1.f1899f;
                            c0334d = new C0334d(c1196q011, c0800d94, str5, uri2, (InterfaceC2313c) null, 2);
                            str6 = str5;
                            c1010k02.f5179h = c1196q011;
                            c1010k02.f5180i = str6;
                            c1010k02.f5181j = null;
                            c1010k02.f5185n = 11;
                            if (AbstractC0525d0.m1122A(c0550l1, c0334d, c1010k02) != enumC2465a) {
                            }
                            return enumC2465a;
                        case 11:
                            String str12 = c1010k02.f5180i;
                            C1196q0 c1196q021 = c1010k02.f5179h;
                            AbstractC1793a0.m2972L(obj2);
                            return c1694m;
                        case 12:
                            str2 = c1010k02.f5180i;
                            c1196q02 = c1010k02.f5179h;
                            AbstractC1793a0.m2972L(obj2);
                            c1196q02.m2122V(str2, new C0242k0(3));
                            return c1694m;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (r32) {
            }
        } catch (CancellationException unused3) {
            throw new CancellationException();
        }
        c1010k0 = new C1010k0(r12, abstractC2583c);
        C1010k0 c1010k022 = c1010k0;
        Object obj22 = c1010k022.f5183l;
        r32 = c1010k022.f5185n;
        ?? r422 = 1;
        C1694m c1694m2 = C1694m.f10482a;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
    }

    /* renamed from: h */
    public static final void m2101h(C1196q0 c1196q0) {
        Iterable iterable = (Iterable) c1196q0.f6971j.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((C0800d9) obj).f3351l == EnumC0768c9.f3005e) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            c1196q0.m2119P(((C0800d9) obj2).f3340a);
        }
    }

    /* renamed from: i */
    public static final C1195q m2102i(C1196q0 c1196q0, C1071m c1071m, C1102n c1102n, Map map, Set set, int i7, long j6) {
        Object obj = null;
        if (i7 <= 0 || j6 < 65536) {
            return null;
        }
        int size = map.size();
        if (i7 > 128) {
            i7 = 128;
        }
        if (size >= i7) {
            return null;
        }
        C0300g c0300g = new C0300g(AbstractC0307n.m667F(new C0301h(AbstractC1805m.m3039c0(c1071m.f5750a), true, new C0321f(2, c1102n, map)), new C0917h(j6, set)));
        if (c0300g.hasNext()) {
            obj = c0300g.next();
            if (c0300g.hasNext()) {
                C1195q c1195q = (C1195q) obj;
                long j7 = (c1195q.f6959c - c1195q.f6958b) + 1;
                do {
                    Object next = c0300g.next();
                    C1195q c1195q2 = (C1195q) next;
                    long j8 = (c1195q2.f6959c - c1195q2.f6958b) + 1;
                    if (j7 < j8) {
                        obj = next;
                        j7 = j8;
                    }
                } while (c0300g.hasNext());
            }
        }
        return (C1195q) obj;
    }

    /* renamed from: j */
    public static String m2103j(C0800d9 c0800d9, int i7) {
        List list = c0800d9.f3344e;
        int size = list.size();
        if (size < 1) {
            size = 1;
        }
        String str = (String) AbstractC1805m.m3048l0(i7 % size, list);
        if (str == null) {
            return "系统 DNS";
        }
        return str;
    }

    /* renamed from: q */
    public static String m2104q(File file) {
        if (file.exists()) {
            return file.getName() + ":exists,size=" + file.length() + ",read=" + file.canRead();
        }
        return AbstractC2487d.m4043g(file.getName(), ":missing");
    }

    /* renamed from: v */
    public static void m2105v(String str, Throwable th) {
        Log.e("HBCS-Download", "pid=" + Process.myPid() + " thread=" + Thread.currentThread().getName() + " " + str, th);
    }

    /* renamed from: w */
    public static void m2106w(String str) {
        Log.i("HBCS-Download", "pid=" + Process.myPid() + " thread=" + Thread.currentThread().getName() + " " + str);
    }

    /* renamed from: x */
    public static void m2107x(String str) {
        Log.w("HBCS-Download", "pid=" + Process.myPid() + " thread=" + Thread.currentThread().getName() + " " + str);
    }

    /* renamed from: z */
    public static String m2108z(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = AbstractC0444k.m952p0(str, '.', "").toLowerCase(Locale.ROOT);
        AbstractC3367j.m5099d(lowerCase, "toLowerCase(...)");
        String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
        if (mimeTypeFromExtension == null) {
            return "application/octet-stream";
        }
        return mimeTypeFromExtension;
    }

    /* renamed from: A */
    public final void m2109A(InterfaceC3279c interfaceC3279c) {
        C1701c0 c1701c0;
        Object value;
        List<C0800d9> list;
        Object m2985m;
        Object m2985m2;
        boolean z7;
        File file;
        do {
            c1701c0 = this.f6971j;
            value = c1701c0.getValue();
            list = (List) interfaceC3279c.mo23f((List) value);
        } while (!c1701c0.m2750g(value, list));
        JSONArray jSONArray = new JSONArray();
        for (C0800d9 c0800d9 : list) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", c0800d9.f3340a);
            jSONObject.put("url", c0800d9.f3341b);
            jSONObject.put("fileName", c0800d9.f3342c);
            jSONObject.put("status", c0800d9.f3351l.name());
            jSONObject.put("total", c0800d9.f3352m);
            jSONObject.put("downloaded", c0800d9.f3353n);
            jSONObject.put("resume", c0800d9.f3355p);
            jSONObject.put("threads", c0800d9.f3356q);
            jSONObject.put("error", c0800d9.f3357r);
            jSONObject.put("created", c0800d9.f3358s);
            jSONObject.put("completed", c0800d9.f3359t);
            jSONObject.put("outputUri", c0800d9.f3360u);
            jSONObject.put("workingUri", c0800d9.f3361v);
            jSONObject.put("headers", new JSONObject(c0800d9.f3343d));
            jSONObject.put("addresses", new JSONArray((Collection) c0800d9.f3344e));
            jSONObject.put("networkStack", c0800d9.f3345f.name());
            jSONObject.put("workersPerServer", c0800d9.f3346g);
            jSONObject.put("maxWorkers", c0800d9.f3347h);
            jSONObject.put("httpProtocol", c0800d9.f3348i.name());
            jSONObject.put("bufferSizeKb", c0800d9.f3349j);
            jSONObject.put("maxTailHedges", c0800d9.f3350k);
            jSONArray.put(jSONObject);
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC3367j.m5099d(jSONArray2, "toString(...)");
        try {
            m2985m = Boolean.valueOf(((SharedPreferences) this.f6963b.getValue()).edit().putString("tasks", jSONArray2).commit());
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        Throwable m2747a = C1690i.m2747a(m2985m);
        if (m2747a != null) {
            m2105v("save_prefs_failed " + m2092R(list) + " chars=" + jSONArray2.length(), m2747a);
        }
        Boolean bool = Boolean.FALSE;
        if (m2985m instanceof C1689h) {
            m2985m = bool;
        }
        boolean booleanValue = ((Boolean) m2985m).booleanValue();
        if (!booleanValue) {
            m2107x("save_prefs_commit_false " + m2092R(list) + " chars=" + jSONArray2.length());
        }
        try {
            if (m2132t().exists()) {
                AbstractC3063j.m4735L(m2132t(), new File(m2131s(), ".download-tasks.backup.json"));
            }
            file = new File(m2131s(), ".download-tasks.pending.json");
            AbstractC3063j.m4738O(file, jSONArray2, AbstractC0434a.f1477a);
            if (m2132t().exists()) {
                m2132t().delete();
            }
        } catch (Throwable th2) {
            m2985m2 = AbstractC1793a0.m2985m(th2);
        }
        if (file.renameTo(m2132t())) {
            m2985m2 = C1694m.f10482a;
            Throwable m2747a2 = C1690i.m2747a(m2985m2);
            if (m2747a2 != null) {
                String m2092R = m2092R(list);
                int length = jSONArray2.length();
                String absolutePath = m2131s().getAbsolutePath();
                if (m2131s().exists() && m2131s().canWrite()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                m2105v("save_manifest_failed " + m2092R + " chars=" + length + " dir=" + absolutePath + " usable=" + z7, m2747a2);
            }
            boolean z8 = !(m2985m2 instanceof C1689h);
            String m3051o0 = AbstractC1805m.m3051o0(list, ",", null, null, new C0242k0(5), 30);
            if (!AbstractC3367j.m5096a(m3051o0, this.f6964c)) {
                this.f6964c = m3051o0;
                m2106w("save_complete prefs=" + booleanValue + " manifest=" + z8 + " chars=" + jSONArray2.length() + " " + m2092R(list));
                return;
            }
            return;
        }
        throw new IllegalStateException("任务清单写入失败");
    }

    /* renamed from: C */
    public final ArrayList m2110C(List list) {
        C1071m c1071m;
        long j6;
        long j7;
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0800d9 c0800d9 = (C0800d9) it.next();
            if (AbstractC1806n.m3067O(EnumC0768c9.f3007g, EnumC0768c9.f3008h, EnumC0768c9.f3006f, EnumC0768c9.f3005e).contains(c0800d9.f3351l)) {
                c0800d9 = C0800d9.m1498a(c0800d9, null, null, EnumC0768c9.f3009i, 0L, 0L, 0L, false, null, 0L, null, null, 4175871);
            }
            C0800d9 c0800d92 = c0800d9;
            EnumC0768c9 enumC0768c9 = c0800d92.f3351l;
            long j8 = c0800d92.f3353n;
            if (enumC0768c9 != EnumC0768c9.f3010j) {
                long j9 = c0800d92.f3352m;
                Long valueOf = Long.valueOf(j9);
                long j10 = 0;
                File file = null;
                if (j9 <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    c1071m = m2133u(c0800d92);
                } else {
                    c1071m = null;
                }
                if (c1071m != null) {
                    ArrayList arrayList2 = c1071m.f5751b;
                    int size = arrayList2.size();
                    long j11 = 0;
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList2.get(i7);
                        i7++;
                        C3881f c3881f = (C3881f) obj;
                        j11 = (c3881f.f18176f - c3881f.f18175e) + 1 + j11;
                        j10 = j10;
                    }
                    long j12 = j10;
                    long j13 = j11;
                    ArrayList arrayList3 = c1071m.f5750a;
                    int size2 = arrayList3.size();
                    long j14 = j12;
                    int i8 = 0;
                    while (i8 < size2) {
                        Object obj2 = arrayList3.get(i8);
                        i8++;
                        C1102n c1102n = (C1102n) obj2;
                        long j15 = c1102n.f6130d.get() - c1102n.f6128b.get();
                        if (j15 < j12) {
                            j15 = j12;
                        }
                        j14 += j15;
                    }
                    j6 = j13 + j14;
                } else {
                    File m2112F = m2112F(c0800d92);
                    if (m2112F.exists()) {
                        file = m2112F;
                    }
                    if (file != null) {
                        j6 = file.length();
                    } else {
                        j6 = j8;
                    }
                }
                if (j6 < j8) {
                    j7 = j8;
                } else {
                    j7 = j6;
                }
                c0800d92 = C0800d9.m1498a(c0800d92, null, null, null, 0L, j7, 0L, false, null, 0L, null, null, 4169727);
            }
            arrayList.add(c0800d92);
        }
        return arrayList;
    }

    /* renamed from: D */
    public final C1040l m2111D(C0800d9 c0800d9) {
        if (!AbstractC0444k.m937a0(c0800d9.f3361v)) {
            ParcelFileDescriptor openFileDescriptor = this.f6962a.getContentResolver().openFileDescriptor(Uri.parse(c0800d9.f3361v), "rw");
            if (openFileDescriptor != null) {
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(openFileDescriptor);
                FileChannel channel = autoCloseOutputStream.getChannel();
                AbstractC3367j.m5099d(channel, "getChannel(...)");
                return new C1040l(autoCloseOutputStream, channel, false);
            }
            throw new IllegalArgumentException("无法打开目标临时文件");
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(m2112F(c0800d9), "rw");
        FileChannel channel2 = randomAccessFile.getChannel();
        AbstractC3367j.m5099d(channel2, "getChannel(...)");
        return new C1040l(randomAccessFile, channel2, true);
    }

    /* renamed from: F */
    public final File m2112F(C0800d9 c0800d9) {
        return new File(m2131s(), AbstractC0094y0.m185l(".", c0800d9.f3340a, ".part"));
    }

    /* renamed from: G */
    public final void m2113G(C0800d9 c0800d9, C1071m c1071m, Object obj) {
        ArrayList arrayList;
        List<C3881f> m3035C0;
        synchronized (obj) {
            try {
                ArrayList arrayList2 = c1071m.f5750a;
                arrayList = new ArrayList(AbstractC1807o.m3073U(arrayList2));
                int size = arrayList2.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj2 = arrayList2.get(i7);
                    i7++;
                    C1102n c1102n = (C1102n) obj2;
                    arrayList.add(new long[]{c1102n.f6127a, c1102n.f6128b.get(), c1102n.f6129c.get(), c1102n.f6130d.get()});
                }
                m3035C0 = AbstractC1805m.m3035C0(c1071m.f5751b);
            } catch (Throwable th) {
                throw th;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 3);
        JSONArray jSONArray = new JSONArray();
        int size2 = arrayList.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj3 = arrayList.get(i8);
            i8++;
            long[] jArr = (long[]) obj3;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("worker", (int) jArr[0]);
            jSONObject2.put("start", jArr[1]);
            jSONObject2.put("end", jArr[2]);
            jSONObject2.put("position", jArr[3]);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("segments", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        for (C3881f c3881f : m3035C0) {
            jSONArray2.put(new JSONArray((Collection) AbstractC1806n.m3067O(Long.valueOf(c3881f.f18175e), Long.valueOf(c3881f.f18176f))));
        }
        jSONObject.put("completed", jSONArray2);
        String intern = c0800d9.f3340a.intern();
        AbstractC3367j.m5099d(intern, "intern(...)");
        synchronized (intern) {
            File m2127n = m2127n(c0800d9);
            String jSONObject3 = jSONObject.toString();
            AbstractC3367j.m5099d(jSONObject3, "toString(...)");
            AbstractC3063j.m4738O(m2127n, jSONObject3, AbstractC0434a.f1477a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2114H(C0800d9 c0800d9, AbstractC2583c abstractC2583c) {
        C0854f0 c0854f0;
        int i7;
        Object m2985m;
        Uri uri;
        Object m2985m2;
        C1196q0 c1196q0;
        int i8;
        boolean z7;
        boolean z8;
        C0800d9 c0800d92 = c0800d9;
        if (abstractC2583c instanceof C0854f0) {
            c0854f0 = (C0854f0) abstractC2583c;
            int i9 = c0854f0.f3876m;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0854f0.f3876m = i9 - Integer.MIN_VALUE;
                Object obj = c0854f0.f3874k;
                i7 = c0854f0.f3876m;
                if (i7 == 0) {
                    if (i7 == 1) {
                        Uri uri2 = c0854f0.f3873j;
                        C0800d9 c0800d93 = c0854f0.f3872i;
                        c1196q0 = c0854f0.f3871h;
                        AbstractC1793a0.m2972L(obj);
                        uri = uri2;
                        c0800d92 = c0800d93;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    String str = c0800d92.f3361v;
                    String str2 = c0800d92.f3342c;
                    String str3 = c0800d92.f3340a;
                    if (AbstractC0444k.m937a0(str) && (!m2112F(c0800d9).exists() || c0800d92.f3353n <= 0)) {
                        C0927h9 c0927h9 = C0927h9.f4481a;
                        Context context = this.f6962a;
                        c0927h9.m1554a(context);
                        String str4 = ((C0959i9) C0927h9.f4483c.f10535e.getValue()).f4779a;
                        if (!AbstractC0444k.m937a0(str4)) {
                            Uri parse = Uri.parse(str4);
                            try {
                                m2985m = DocumentsContract.createDocument(context.getContentResolver(), DocumentsContract.buildDocumentUriUsingTree(parse, DocumentsContract.getTreeDocumentId(parse)), m2108z(str2), AbstractC0094y0.m185l(".", str2, ".part"));
                            } catch (Throwable th) {
                                m2985m = AbstractC1793a0.m2985m(th);
                            }
                            if (m2985m == null) {
                                throw new IllegalArgumentException("无法创建目标临时文件");
                            }
                            Throwable m2747a = C1690i.m2747a(m2985m);
                            if (m2747a != null) {
                                m2107x("direct_target_create_failed task=" + AbstractC0444k.m955s0(str3, 8) + " error=" + m2747a.getMessage());
                            }
                            if (m2985m instanceof C1689h) {
                                m2985m = null;
                            }
                            uri = (Uri) m2985m;
                            if (uri != null) {
                                try {
                                    Cursor query = context.getContentResolver().query(uri, new String[]{"flags"}, null, null, null);
                                    boolean z9 = false;
                                    if (query != null) {
                                        try {
                                            if (query.moveToFirst()) {
                                                i8 = query.getInt(0);
                                            } else {
                                                i8 = 0;
                                            }
                                            query.close();
                                        } finally {
                                        }
                                    } else {
                                        i8 = 0;
                                    }
                                    if ((i8 & 64) != 0) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                                    if (openFileDescriptor != null) {
                                        try {
                                            Os.lseek(openFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_CUR);
                                            openFileDescriptor.close();
                                            z8 = true;
                                        } finally {
                                        }
                                    } else {
                                        z8 = false;
                                    }
                                    if (z7 && z8) {
                                        z9 = true;
                                    }
                                    m2985m2 = Boolean.valueOf(z9);
                                } catch (Throwable th2) {
                                    m2985m2 = AbstractC1793a0.m2985m(th2);
                                }
                                Throwable m2747a2 = C1690i.m2747a(m2985m2);
                                if (m2747a2 != null) {
                                    m2107x("direct_target_capability_failed task=" + AbstractC0444k.m955s0(str3, 8) + " error=" + m2747a2.getMessage());
                                }
                                Boolean bool = Boolean.FALSE;
                                if (m2985m2 instanceof C1689h) {
                                    m2985m2 = bool;
                                }
                                if (!((Boolean) m2985m2).booleanValue()) {
                                    try {
                                        DocumentsContract.deleteDocument(context.getContentResolver(), uri);
                                    } catch (Throwable th3) {
                                        AbstractC1793a0.m2985m(th3);
                                    }
                                    m2106w("direct_target_fallback task=" + AbstractC0444k.m955s0(str3, 8) + " reason=seek_or_rename_unsupported");
                                    return c0800d92;
                                }
                                C0310q c0310q = new C0310q(1, uri);
                                c0854f0.f3871h = this;
                                c0854f0.f3872i = c0800d92;
                                c0854f0.f3873j = uri;
                                c0854f0.f3876m = 1;
                                m2121U(str3, c0310q);
                                C1694m c1694m = C1694m.f10482a;
                                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                                if (c1694m == enumC2465a) {
                                    return enumC2465a;
                                }
                                c1196q0 = this;
                            }
                        }
                    }
                    return c0800d92;
                }
                String str5 = "direct_target_ready task=" + AbstractC0444k.m955s0(c0800d92.f3340a, 8) + " authority=" + uri.getAuthority();
                c1196q0.getClass();
                m2106w(str5);
                for (Object obj2 : (Iterable) c1196q0.f6971j.getValue()) {
                    if (AbstractC3367j.m5096a(((C0800d9) obj2).f3340a, c0800d92.f3340a)) {
                        return obj2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        c0854f0 = new C0854f0(this, abstractC2583c);
        Object obj3 = c0854f0.f3874k;
        i7 = c0854f0.f3876m;
        if (i7 == 0) {
        }
        String str52 = "direct_target_ready task=" + AbstractC0444k.m955s0(c0800d92.f3340a, 8) + " authority=" + uri.getAuthority();
        c1196q0.getClass();
        m2106w(str52);
        while (r0.hasNext()) {
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: all -> 0x0076, TryCatch #1 {all -> 0x0076, blocks: (B:13:0x0050, B:18:0x0060, B:19:0x0075, B:21:0x0079, B:23:0x0082, B:26:0x009f, B:32:0x00b2, B:36:0x008f, B:38:0x0097), top: B:12:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2115I(C0800d9 c0800d9, AbstractC2583c abstractC2583c) {
        C0886g0 c0886g0;
        int i7;
        boolean z7;
        C1196q0 c1196q0;
        Closeable closeable;
        boolean m4142c;
        int i8;
        String m4141b;
        String m4141b2;
        Long l7;
        long j6;
        try {
            if (abstractC2583c instanceof C0886g0) {
                c0886g0 = (C0886g0) abstractC2583c;
                int i9 = c0886g0.f4107k;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    c0886g0.f4107k = i9 - Integer.MIN_VALUE;
                    C0886g0 c0886g02 = c0886g0;
                    Object obj = c0886g02.f4105i;
                    i7 = c0886g02.f4107k;
                    z7 = true;
                    if (i7 == 0) {
                        if (i7 == 1) {
                            c1196q0 = c0886g02.f4104h;
                            AbstractC1793a0.m2972L(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        C0758c c0758c = new C0758c(this, c0800d9, 0);
                        c0886g02.f4104h = this;
                        c0886g02.f4107k = 1;
                        obj = m2128o(c0800d9, 0, null, c0758c, c0886g02);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (obj == enumC2465a) {
                            return enumC2465a;
                        }
                        c1196q0 = this;
                    }
                    closeable = (Closeable) obj;
                    C2598d0 c2598d0 = (C2598d0) closeable;
                    m4142c = c2598d0.m4142c();
                    i8 = c2598d0.f14059h;
                    if (m4142c && i8 != 416) {
                        throw new IllegalStateException(("服务器返回 HTTP " + i8).toString());
                    }
                    m4141b = C2598d0.m4141b("Content-Range", c2598d0);
                    if (m4141b != null || (l7 = AbstractC0451r.m974P(AbstractC0444k.m952p0(m4141b, '/', m4141b))) == null) {
                        m4141b2 = C2598d0.m4141b("Content-Length", c2598d0);
                        if (m4141b2 == null) {
                            l7 = AbstractC0451r.m974P(m4141b2);
                        } else {
                            l7 = null;
                        }
                        if (l7 == null) {
                            j6 = -1;
                            if (i8 == 206 || j6 <= 0) {
                                z7 = false;
                            }
                            String m4141b3 = C2598d0.m4141b("Content-Disposition", c2598d0);
                            String m4172b = c2598d0.f14056e.f14018a.m4172b();
                            c1196q0.getClass();
                            C1164p c1164p = new C1164p(j6, z7, m2089M(m4141b3, m4172b));
                            AbstractC2168e.m3526m(closeable, null);
                            return c1164p;
                        }
                    }
                    j6 = l7.longValue();
                    if (i8 == 206) {
                    }
                    z7 = false;
                    String m4141b32 = C2598d0.m4141b("Content-Disposition", c2598d0);
                    String m4172b2 = c2598d0.f14056e.f14018a.m4172b();
                    c1196q0.getClass();
                    C1164p c1164p2 = new C1164p(j6, z7, m2089M(m4141b32, m4172b2));
                    AbstractC2168e.m3526m(closeable, null);
                    return c1164p2;
                }
            }
            C2598d0 c2598d02 = (C2598d0) closeable;
            m4142c = c2598d02.m4142c();
            i8 = c2598d02.f14059h;
            if (m4142c) {
            }
            m4141b = C2598d0.m4141b("Content-Range", c2598d02);
            if (m4141b != null) {
            }
            m4141b2 = C2598d0.m4141b("Content-Length", c2598d02);
            if (m4141b2 == null) {
            }
            if (l7 == null) {
            }
            j6 = l7.longValue();
            if (i8 == 206) {
            }
            z7 = false;
            String m4141b322 = C2598d0.m4141b("Content-Disposition", c2598d02);
            String m4172b22 = c2598d02.f14056e.f14018a.m4172b();
            c1196q0.getClass();
            C1164p c1164p22 = new C1164p(j6, z7, m2089M(m4141b322, m4172b22));
            AbstractC2168e.m3526m(closeable, null);
            return c1164p22;
        } finally {
        }
        c0886g0 = new C0886g0(this, abstractC2583c);
        C0886g0 c0886g022 = c0886g0;
        Object obj2 = c0886g022.f4105i;
        i7 = c0886g022.f4107k;
        z7 = true;
        if (i7 == 0) {
        }
        closeable = (Closeable) obj2;
    }

    /* renamed from: J */
    public final void m2116J(String str, int i7, C3006i c3006i) {
        String str2 = str + ":" + i7;
        ConcurrentHashMap concurrentHashMap = this.f6969h;
        if (c3006i == null) {
            concurrentHashMap.remove(str2);
            return;
        }
        C3006i c3006i2 = (C3006i) concurrentHashMap.put(str2, c3006i);
        if (c3006i2 != null) {
            c3006i2.m4680d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2117K(String str, String str2, AbstractC2583c abstractC2583c) {
        C0950i0 c0950i0;
        int i7;
        try {
            if (abstractC2583c instanceof C0950i0) {
                c0950i0 = (C0950i0) abstractC2583c;
                int i8 = c0950i0.f4676j;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0950i0.f4676j = i8 - Integer.MIN_VALUE;
                    Object obj = c0950i0.f4674h;
                    i7 = c0950i0.f4676j;
                    C1694m c1694m = C1694m.f10482a;
                    if (i7 == 0) {
                        if (i7 == 1) {
                            AbstractC1793a0.m2972L(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        String m2090N = m2090N(str2);
                        if (!AbstractC0444k.m937a0(m2090N)) {
                            for (Object obj2 : (Iterable) this.f6971j.getValue()) {
                                if (AbstractC3367j.m5096a(((C0800d9) obj2).f3340a, str)) {
                                    C0800d9 c0800d9 = (C0800d9) obj2;
                                    EnumC0768c9 enumC0768c9 = c0800d9.f3351l;
                                    String str3 = c0800d9.f3360u;
                                    if (enumC0768c9 == EnumC0768c9.f3010j) {
                                        if (!AbstractC0444k.m937a0(str3)) {
                                            if (DocumentsContract.renameDocument(this.f6962a.getContentResolver(), Uri.parse(str3), m2090N) == null) {
                                                throw new IllegalArgumentException("重命名失败");
                                            }
                                        } else {
                                            File m2129p = m2129p(c0800d9);
                                            File file = new File(m2131s(), m2090N);
                                            if (!file.exists()) {
                                                if (!m2129p.renameTo(file)) {
                                                    throw new IllegalArgumentException("重命名失败");
                                                }
                                            } else {
                                                throw new IllegalArgumentException("同名文件已存在");
                                            }
                                        }
                                        C0978j c0978j = new C0978j(m2090N, 0);
                                        c0950i0.f4676j = 1;
                                        m2121U(str, c0978j);
                                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                                        if (c1694m == enumC2465a) {
                                            return enumC2465a;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("只能重命名已完成文件");
                                    }
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        throw new IllegalArgumentException("文件名不能为空");
                    }
                    return c1694m;
                }
            }
            if (i7 == 0) {
            }
            return c1694m;
        } catch (Throwable th) {
            return AbstractC1793a0.m2985m(th);
        }
        c0950i0 = new C0950i0(this, abstractC2583c);
        Object obj3 = c0950i0.f4674h;
        i7 = c0950i0.f4676j;
        C1694m c1694m2 = C1694m.f10482a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bd  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m2118O() {
        List list;
        Iterator it;
        Object next;
        C1687f c1687f;
        List list2;
        C1687f c1687f2;
        C1687f c1687f3;
        Object m2985m;
        C1691j c1691j = this.f6963b;
        String str = null;
        if (((SharedPreferences) c1691j.getValue()).contains("tasks")) {
            String string = ((SharedPreferences) c1691j.getValue()).getString("tasks", null);
            if (string == null) {
                m2107x("candidate_invalid source=prefs reason=null_value");
            } else {
                try {
                    m2985m = m2087E(string, "prefs");
                } catch (Throwable th) {
                    m2985m = AbstractC1793a0.m2985m(th);
                }
                boolean z7 = m2985m instanceof C1689h;
                if (!z7) {
                    m2106w("candidate_loaded source=prefs chars=" + string.length() + " " + m2092R((List) m2985m));
                }
                Throwable m2747a = C1690i.m2747a(m2985m);
                if (m2747a != null) {
                    m2105v("candidate_failed source=prefs chars=" + string.length(), m2747a);
                }
                if (z7) {
                    m2985m = null;
                }
                list = (List) m2985m;
                it = AbstractC0307n.m668G(AbstractC0307n.m667F(new C0308o(3, new C1687f[]{new C1687f("manifest", m2132t()), new C1687f("backup", new File(m2131s(), ".download-tasks.backup.json"))}), new C0242k0(this))).iterator();
                if (it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        long m2091Q = m2091Q((List) ((C1687f) next).f10472f);
                        do {
                            Object next2 = it.next();
                            long m2091Q2 = m2091Q((List) ((C1687f) next2).f10472f);
                            if (m2091Q < m2091Q2) {
                                next = next2;
                                m2091Q = m2091Q2;
                            }
                        } while (it.hasNext());
                    }
                }
                c1687f = (C1687f) next;
                if (c1687f == null) {
                    list2 = (List) c1687f.f10472f;
                } else {
                    list2 = null;
                }
                if (list == null && list.isEmpty()) {
                    c1687f2 = new C1687f("prefs_empty", list);
                } else if (list == null && list2 != null) {
                    long m2091Q3 = m2091Q(list);
                    long m2091Q4 = m2091Q(list2);
                    if (m2091Q3 > m2091Q4) {
                        c1687f2 = new C1687f("prefs_score", list);
                    } else if (m2091Q4 > m2091Q3) {
                        c1687f3 = new C1687f(c1687f.f10471e + "_score", list2);
                        c1687f2 = c1687f3;
                    } else {
                        c1687f2 = new C1687f("prefs_tie", list);
                    }
                } else if (list == null) {
                    c1687f2 = new C1687f("prefs_only", list);
                } else if (list2 != null) {
                    if (c1687f != null) {
                        str = (String) c1687f.f10471e;
                    }
                    c1687f3 = new C1687f(AbstractC2487d.m4043g(str, "_only"), list2);
                    c1687f2 = c1687f3;
                } else {
                    c1687f2 = new C1687f("none", C1813u.f10860e);
                }
                String str2 = (String) c1687f2.f10471e;
                List list3 = (List) c1687f2.f10472f;
                m2106w("candidate_selected source=" + str2 + " " + m2092R(list3));
                return list3;
            }
        } else {
            m2106w("candidate_missing source=prefs");
        }
        list = null;
        it = AbstractC0307n.m668G(AbstractC0307n.m667F(new C0308o(3, new C1687f[]{new C1687f("manifest", m2132t()), new C1687f("backup", new File(m2131s(), ".download-tasks.backup.json"))}), new C0242k0(this))).iterator();
        if (it.hasNext()) {
        }
        c1687f = (C1687f) next;
        if (c1687f == null) {
        }
        if (list == null) {
        }
        if (list == null) {
        }
        if (list == null) {
        }
        String str22 = (String) c1687f2.f10471e;
        List list32 = (List) c1687f2.f10472f;
        m2106w("candidate_selected source=" + str22 + " " + m2092R(list32));
        return list32;
    }

    /* renamed from: P */
    public final void m2119P(String str) {
        InterfaceC2313c interfaceC2313c;
        Object obj;
        AbstractC3367j.m5100e(str, "id");
        synchronized (this.f6968g) {
            InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) this.f6968g.get(str);
            if (interfaceC0520b1 != null && interfaceC0520b1.mo1113b()) {
                return;
            }
            Iterator it = ((Iterable) this.f6971j.getValue()).iterator();
            while (true) {
                interfaceC2313c = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3367j.m5096a(((C0800d9) obj).f3340a, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C0800d9 c0800d9 = (C0800d9) obj;
            if (c0800d9 == null) {
                return;
            }
            if (c0800d9.f3351l == EnumC0768c9.f3010j) {
                return;
            }
            C0927h9.f4481a.m1554a(this.f6962a);
            int i7 = ((C0959i9) C0927h9.f4483c.f10535e.getValue()).f4790l;
            if (i7 > 0) {
                Collection values = this.f6968g.values();
                AbstractC3367j.m5099d(values, "<get-values>(...)");
                Collection collection = values;
                int i8 = 0;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        if (((InterfaceC0520b1) it2.next()).mo1113b() && (i8 = i8 + 1) < 0) {
                            AbstractC1806n.m3071S();
                            throw null;
                        }
                    }
                }
                if (i8 >= i7) {
                    AbstractC0525d0.m1141s(this.f6966e, null, new C0791d0(this, str, interfaceC2313c, 2), 3);
                    return;
                }
            }
            ConcurrentHashMap concurrentHashMap = this.f6968g;
            C0565q1 m1141s = AbstractC0525d0.m1141s(this.f6966e, null, new C0791d0(this, str, interfaceC2313c, 3), 3);
            m1141s.mo1119y(new C1009k(this, str, m1141s, 0));
            concurrentHashMap.put(str, m1141s);
        }
    }

    /* renamed from: T */
    public final String m2120T(String str) {
        String m2090N = m2090N(str);
        if (AbstractC0444k.m937a0(m2090N)) {
            m2090N = "download.bin";
        }
        Iterable iterable = (Iterable) this.f6971j.getValue();
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0800d9) it.next()).f3342c);
        }
        Set m3038F0 = AbstractC1805m.m3038F0(arrayList);
        int i7 = 1;
        String str2 = m2090N;
        while (true) {
            if (!new File(m2131s(), str2).exists() && !m3038F0.contains(str2)) {
                return str2;
            }
            int m939c0 = AbstractC0444k.m939c0(m2090N, '.', 0, 6);
            if (m939c0 > 0) {
                String substring = m2090N.substring(0, m939c0);
                AbstractC3367j.m5099d(substring, "substring(...)");
                String substring2 = m2090N.substring(m939c0);
                AbstractC3367j.m5099d(substring2, "substring(...)");
                str2 = substring + " (" + i7 + ")" + substring2;
            } else {
                str2 = m2090N + " (" + i7 + ")";
            }
            i7++;
        }
    }

    /* renamed from: U */
    public final C1694m m2121U(String str, InterfaceC3279c interfaceC3279c) {
        m2109A(new C0790d(str, interfaceC3279c));
        return C1694m.f10482a;
    }

    /* renamed from: V */
    public final void m2122V(String str, InterfaceC3279c interfaceC3279c) {
        C1701c0 c1701c0;
        Object value;
        Map map;
        do {
            c1701c0 = this.f6973l;
            value = c1701c0.getValue();
            Map map2 = (Map) value;
            Iterable iterable = (List) map2.get(str);
            if (iterable == null) {
                iterable = C1813u.f10860e;
            }
            ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(iterable));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(interfaceC3279c.mo23f(it.next()));
            }
            if (map2.isEmpty()) {
                map = Collections.singletonMap(str, arrayList);
                AbstractC3367j.m5099d(map, "singletonMap(...)");
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                linkedHashMap.put(str, arrayList);
                map = linkedHashMap;
            }
        } while (!c1701c0.m2750g(value, map));
    }

    /* renamed from: W */
    public final void m2123W(int i7, String str, InterfaceC3279c interfaceC3279c) {
        C1701c0 c1701c0;
        Object value;
        Map map;
        do {
            c1701c0 = this.f6973l;
            value = c1701c0.getValue();
            Map map2 = (Map) value;
            Iterable<C0831e9> iterable = (List) map2.get(str);
            if (iterable == null) {
                iterable = C1813u.f10860e;
            }
            ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(iterable));
            for (C0831e9 c0831e9 : iterable) {
                if (c0831e9.f3659a == i7) {
                    c0831e9 = (C0831e9) interfaceC3279c.mo23f(c0831e9);
                }
                arrayList.add(c0831e9);
            }
            if (map2.isEmpty()) {
                map = Collections.singletonMap(str, arrayList);
                AbstractC3367j.m5099d(map, "singletonMap(...)");
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                linkedHashMap.put(str, arrayList);
                map = linkedHashMap;
            }
        } while (!c1701c0.m2750g(value, map));
    }

    /* renamed from: k */
    public final void m2124k() {
        ConcurrentHashMap concurrentHashMap = this.f6969h;
        Collection values = concurrentHashMap.values();
        AbstractC3367j.m5099d(values, "<get-values>(...)");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((C3006i) it.next()).m4680d();
        }
        concurrentHashMap.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0514, code lost:
    
        if (p032d6.AbstractC0525d0.m1129g(r0, r5) != r6) goto L141;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0028. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023e A[Catch: all -> 0x0040, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:22:0x05cb, B:19:0x05b8, B:41:0x059a, B:48:0x008e, B:53:0x009d, B:55:0x0509, B:137:0x023e, B:146:0x0283, B:152:0x02aa, B:164:0x02ee, B:167:0x0312, B:173:0x0327, B:181:0x035a, B:184:0x0390), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0283 A[Catch: all -> 0x0040, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:22:0x05cb, B:19:0x05b8, B:41:0x059a, B:48:0x008e, B:53:0x009d, B:55:0x0509, B:137:0x023e, B:146:0x0283, B:152:0x02aa, B:164:0x02ee, B:167:0x0312, B:173:0x0327, B:181:0x035a, B:184:0x0390), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02aa A[Catch: all -> 0x0040, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:22:0x05cb, B:19:0x05b8, B:41:0x059a, B:48:0x008e, B:53:0x009d, B:55:0x0509, B:137:0x023e, B:146:0x0283, B:152:0x02aa, B:164:0x02ee, B:167:0x0312, B:173:0x0327, B:181:0x035a, B:184:0x0390), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ee A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:22:0x05cb, B:19:0x05b8, B:41:0x059a, B:48:0x008e, B:53:0x009d, B:55:0x0509, B:137:0x023e, B:146:0x0283, B:152:0x02aa, B:164:0x02ee, B:167:0x0312, B:173:0x0327, B:181:0x035a, B:184:0x0390), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0327 A[Catch: all -> 0x0040, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:22:0x05cb, B:19:0x05b8, B:41:0x059a, B:48:0x008e, B:53:0x009d, B:55:0x0509, B:137:0x023e, B:146:0x0283, B:152:0x02aa, B:164:0x02ee, B:167:0x0312, B:173:0x0327, B:181:0x035a, B:184:0x0390), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x035a A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:22:0x05cb, B:19:0x05b8, B:41:0x059a, B:48:0x008e, B:53:0x009d, B:55:0x0509, B:137:0x023e, B:146:0x0283, B:152:0x02aa, B:164:0x02ee, B:167:0x0312, B:173:0x0327, B:181:0x035a, B:184:0x0390), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03ba A[Catch: all -> 0x05e7, TryCatch #5 {all -> 0x05e7, blocks: (B:139:0x0242, B:188:0x03af, B:190:0x03ba, B:203:0x03c4), top: B:138:0x0242 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05d0 A[LOOP:4: B:178:0x0341->B:193:0x05d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03c4 A[Catch: all -> 0x05e7, TRY_LEAVE, TryCatch #5 {all -> 0x05e7, blocks: (B:139:0x0242, B:188:0x03af, B:190:0x03ba, B:203:0x03c4), top: B:138:0x0242 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04c2 A[Catch: all -> 0x051c, TRY_ENTER, TryCatch #15 {all -> 0x051c, blocks: (B:61:0x04eb, B:75:0x04c2, B:86:0x056d, B:99:0x0426, B:198:0x03fd), top: B:197:0x03fd }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v36, types: [d6.b1] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v0, types: [long] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v6, types: [e5.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v5, types: [u5.u] */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v3, types: [e5.l] */
    /* JADX WARN: Type inference failed for: r35v4 */
    /* JADX WARN: Type inference failed for: r6v11, types: [d6.b1] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2125l(C0800d9 c0800d9, long j6, AbstractC2583c abstractC2583c) {
        C1288t c1288t;
        int i7;
        Throwable th;
        Closeable closeable;
        Closeable closeable2;
        FileChannel fileChannel;
        long j7;
        long j8;
        C1071m m2133u;
        ArrayList arrayList;
        long j9;
        int size;
        int i8;
        int size2;
        int i9;
        int size3;
        int i10;
        int i11;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList2;
        C1701c0 c1701c0;
        Object value;
        Map map;
        int size4;
        LinkedHashMap linkedHashMap2;
        int i12;
        Map map2;
        Object obj;
        Object obj2;
        long j10;
        long j11;
        Object obj3;
        LinkedHashSet linkedHashSet;
        ?? r34;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ?? r35;
        LinkedHashMap linkedHashMap3;
        C1071m c1071m;
        C0800d9 c0800d92;
        C1196q0 c1196q0;
        AtomicLong atomicLong;
        C0565q1 m1141s;
        C0565q1 m1141s2;
        C0800d9 c0800d93;
        Object obj4;
        C1071m c1071m2;
        C0565q1 m1141s3;
        C0800d9 c0800d94;
        C1071m c1071m3;
        Object obj5;
        C0565q1 c0565q1;
        C0800d9 c0800d95;
        InterfaceC0520b1 interfaceC0520b1;
        Object obj6;
        C0565q1 c0565q12;
        Throwable th2;
        C1443y c1443y;
        C1196q0 c1196q02;
        AtomicLong atomicLong2;
        long j12;
        C0565q1 c0565q13;
        InterfaceC0520b1 interfaceC0520b12;
        C1196q0 c1196q03;
        C0800d9 c0800d96;
        long j13;
        Throwable th3;
        InterfaceC0520b1 interfaceC0520b13;
        Closeable closeable3;
        AtomicLong atomicLong3;
        InterfaceC0520b1 interfaceC0520b14;
        C1071m c1071m4;
        InterfaceC0520b1 interfaceC0520b15;
        C1196q0 c1196q04;
        Throwable th4;
        Closeable closeable4;
        C1196q0 c1196q05 = this;
        ?? r22 = j6;
        try {
            if (abstractC2583c instanceof C1288t) {
                c1288t = (C1288t) abstractC2583c;
                int i13 = c1288t.f7710x;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    c1288t.f7710x = i13 - Integer.MIN_VALUE;
                    Object obj7 = c1288t.f7708v;
                    i7 = c1288t.f7710x;
                    Object obj8 = C1694m.f10482a;
                    Object obj9 = EnumC2465a.f13750e;
                    switch (i7) {
                        case 0:
                            AbstractC1793a0.m2972L(obj7);
                            String str = c0800d9.f3340a;
                            int i14 = c0800d9.f3356q;
                            String m955s0 = AbstractC0444k.m955s0(str, 8);
                            String str2 = c0800d9.f3348i.f9304e;
                            int i15 = c0800d9.f3349j;
                            int i16 = c0800d9.f3350k;
                            boolean z7 = !AbstractC0444k.m937a0(c0800d9.f3361v);
                            ?? sb = new StringBuilder("ranged_start task=");
                            sb.append(m955s0);
                            sb.append(" workers=");
                            sb.append(i14);
                            sb.append(" total=");
                            sb.append(r22);
                            long j14 = c1196q05.f6965d;
                            AbstractC2487d.m4056t(sb, " heapLimitMb=", j14, " protocol=");
                            sb.append(str2);
                            sb.append(" bufferKb=");
                            sb.append(i15);
                            sb.append(" tailHedges=");
                            sb.append(i16);
                            sb.append(" direct=");
                            sb.append(z7);
                            m2106w(sb.toString());
                            AtomicBoolean atomicBoolean = AbstractC0697a2.f2310a;
                            AbstractC0697a2.m1488a("download_ranged task=" + AbstractC0444k.m955s0(str, 8) + " workers=" + i14 + " heap=" + j14 + "MB");
                            r22 = m2111D(c0800d9);
                            try {
                                fileChannel = r22.f5348f;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                            try {
                                try {
                                    if (r22.f5349g && fileChannel.size() != j6) {
                                        j7 = j6;
                                        fileChannel.truncate(j7);
                                        if (fileChannel.size() < j7 && j7 > 0) {
                                            j8 = 1;
                                            fileChannel.write(ByteBuffer.wrap(new byte[]{0}), j7 - 1);
                                            m2133u = m2133u(c0800d9);
                                            if (m2133u == null) {
                                                m2133u = m2086B(i14, j7);
                                            }
                                            arrayList = m2133u.f5750a;
                                            Object obj10 = new Object();
                                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                            long j15 = 0;
                                            Object obj11 = new Object();
                                            j9 = j7 / 100;
                                            if (j9 < 4194304) {
                                                j9 = 4194304;
                                            }
                                            long min = Math.min(67108864L, j9);
                                            ArrayList arrayList5 = m2133u.f5751b;
                                            size = arrayList5.size();
                                            long j16 = 0;
                                            i8 = 0;
                                            while (i8 < size) {
                                                Object obj12 = arrayList5.get(i8);
                                                int i17 = i8 + 1;
                                                C3881f c3881f = (C3881f) obj12;
                                                ArrayList arrayList6 = arrayList5;
                                                int i18 = size;
                                                j16 = (c3881f.f18176f - c3881f.f18175e) + j8 + j16;
                                                arrayList5 = arrayList6;
                                                size = i18;
                                                i8 = i17;
                                            }
                                            size2 = arrayList.size();
                                            long j17 = 0;
                                            i9 = 0;
                                            while (i9 < size2) {
                                                Object obj13 = arrayList.get(i9);
                                                i9++;
                                                int i19 = size2;
                                                C1102n c1102n = (C1102n) obj13;
                                                long j18 = j17;
                                                long j19 = c1102n.f6130d.get() - c1102n.f6128b.get();
                                                if (j19 < 0) {
                                                    j19 = 0;
                                                }
                                                j17 = j18 + j19;
                                                size2 = i19;
                                            }
                                            AtomicLong atomicLong4 = new AtomicLong(Math.min(j7, j16 + j17));
                                            ArrayList arrayList7 = new ArrayList(AbstractC1807o.m3073U(arrayList));
                                            size3 = arrayList.size();
                                            i10 = 0;
                                            while (i10 < size3) {
                                                Object obj14 = arrayList.get(i10);
                                                int i20 = i10 + 1;
                                                int i21 = size3;
                                                C1102n c1102n2 = (C1102n) obj14;
                                                long j20 = c1102n2.f6130d.get() - c1102n2.f6128b.get();
                                                if (j20 < 0) {
                                                    j20 = 0;
                                                }
                                                arrayList7.add(new AtomicLong(j20));
                                                i10 = i20;
                                                size3 = i21;
                                            }
                                            ArrayList arrayList8 = new ArrayList(i14);
                                            i11 = 0;
                                            while (i11 < i14) {
                                                LinkedHashMap linkedHashMap5 = linkedHashMap4;
                                                ArrayList arrayList9 = arrayList7;
                                                arrayList8.add(new AtomicLong(j15));
                                                i11++;
                                                linkedHashMap4 = linkedHashMap5;
                                                arrayList7 = arrayList9;
                                                j15 = 0;
                                            }
                                            linkedHashMap = linkedHashMap4;
                                            arrayList2 = arrayList7;
                                            c1701c0 = c1196q05.f6973l;
                                            while (true) {
                                                value = c1701c0.getValue();
                                                map = (Map) value;
                                                ArrayList arrayList10 = new ArrayList(AbstractC1807o.m3073U(arrayList));
                                                size4 = arrayList.size();
                                                linkedHashMap2 = linkedHashMap;
                                                i12 = 0;
                                                while (i12 < size4) {
                                                    Object obj15 = arrayList.get(i12);
                                                    i12++;
                                                    ArrayList arrayList11 = arrayList;
                                                    C1102n c1102n3 = (C1102n) obj15;
                                                    int i22 = size4;
                                                    int i23 = c1102n3.f6127a;
                                                    AtomicLong atomicLong5 = c1102n3.f6128b;
                                                    long j21 = atomicLong5.get();
                                                    long j22 = c1102n3.f6129c.get();
                                                    long j23 = c1102n3.f6130d.get() - atomicLong5.get();
                                                    if (j23 < 0) {
                                                        j23 = 0;
                                                    }
                                                    arrayList10.add(new C0831e9(i23, j21, j22, j23, m2103j(c0800d9, c1102n3.f6127a), "下载中"));
                                                    size4 = i22;
                                                    arrayList = arrayList11;
                                                }
                                                ArrayList arrayList12 = arrayList;
                                                AbstractC3367j.m5100e(map, "<this>");
                                                if (!map.isEmpty()) {
                                                    Map singletonMap = Collections.singletonMap(str, arrayList10);
                                                    AbstractC3367j.m5099d(singletonMap, "singletonMap(...)");
                                                    map2 = singletonMap;
                                                } else {
                                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(map);
                                                    linkedHashMap6.put(str, arrayList10);
                                                    map2 = linkedHashMap6;
                                                }
                                                if (!c1701c0.m2750g(value, map2)) {
                                                    C0853f c0853f = new C0853f(atomicLong4, 0);
                                                    c1288t.f7694h = c1196q05;
                                                    c1288t.f7695i = c0800d9;
                                                    c1288t.f7696j = r22;
                                                    c1288t.f7697k = r22;
                                                    c1288t.f7698l = obj10;
                                                    c1288t.f7699m = m2133u;
                                                    c1288t.f7700n = linkedHashMap2;
                                                    c1288t.f7701o = linkedHashSet2;
                                                    c1288t.f7702p = obj11;
                                                    ArrayList arrayList13 = arrayList2;
                                                    c1288t.f7703q = arrayList13;
                                                    c1288t.f7704r = atomicLong4;
                                                    c1288t.f7705s = arrayList8;
                                                    closeable2 = r22;
                                                    C1071m c1071m5 = m2133u;
                                                    try {
                                                        c1288t.f7706t = j6;
                                                        c1288t.f7707u = min;
                                                        c1288t.f7710x = 1;
                                                        c1196q05.m2121U(str, c0853f);
                                                        obj = obj8;
                                                        obj2 = obj9;
                                                        if (obj != obj2) {
                                                            j10 = j6;
                                                            j11 = min;
                                                            obj3 = obj10;
                                                            linkedHashSet = linkedHashSet2;
                                                            r34 = obj11;
                                                            arrayList3 = arrayList8;
                                                            arrayList4 = arrayList13;
                                                            r35 = closeable2;
                                                            linkedHashMap3 = linkedHashMap2;
                                                            c1071m = c1071m5;
                                                            c0800d92 = c0800d9;
                                                            c1196q0 = c1196q05;
                                                            atomicLong = atomicLong4;
                                                            m1141s = AbstractC0525d0.m1141s(c1196q0.f6967f, null, new C1041l0(atomicLong, c1196q0, c0800d92.f3340a, null), 3);
                                                            AtomicLong atomicLong6 = atomicLong;
                                                            m1141s2 = AbstractC0525d0.m1141s(c1196q0.f6967f, null, new C1165p0(arrayList3, arrayList4, c1196q0, c0800d92.f3340a, null), 3);
                                                            C2090c c2090c = c1196q0.f6966e;
                                                            c0800d93 = c0800d92;
                                                            C0073s c0073s = new C0073s(c1196q0, c0800d93, c1071m, obj3, (InterfaceC2313c) null, 4);
                                                            obj4 = obj3;
                                                            c1071m2 = c1071m;
                                                            m1141s3 = AbstractC0525d0.m1141s(c2090c, null, c0073s, 3);
                                                            try {
                                                                c1196q02 = c1196q0;
                                                                try {
                                                                    c1443y = new C1443y(c0800d93, arrayList4, arrayList3, c1071m2, obj4, c1196q02, linkedHashMap3, linkedHashSet, j11, r34, r35, atomicLong6, j10, null);
                                                                    c0800d94 = c0800d93;
                                                                    c1071m3 = c1071m2;
                                                                    obj5 = obj4;
                                                                    atomicLong2 = atomicLong6;
                                                                    j12 = j10;
                                                                    try {
                                                                        c1288t.f7694h = c1196q0;
                                                                        c1288t.f7695i = c0800d94;
                                                                        c1288t.f7696j = closeable2;
                                                                        c1288t.f7697k = obj5;
                                                                        c1288t.f7698l = c1071m3;
                                                                        c1288t.f7699m = m1141s2;
                                                                        c1288t.f7700n = m1141s3;
                                                                        c1288t.f7701o = atomicLong2;
                                                                        c1288t.f7702p = m1141s;
                                                                        c1288t.f7703q = null;
                                                                        c1288t.f7704r = null;
                                                                        c1288t.f7705s = null;
                                                                        c1288t.f7706t = j12;
                                                                        c1288t.f7710x = 2;
                                                                        if (AbstractC0525d0.m1130h(c1443y, c1288t) != obj2) {
                                                                            c0565q13 = m1141s;
                                                                            interfaceC0520b12 = m1141s2;
                                                                            c1196q03 = c1196q0;
                                                                            c0800d96 = c0800d94;
                                                                            c0565q1 = m1141s3;
                                                                            j13 = j12;
                                                                            try {
                                                                                atomicLong3 = atomicLong2;
                                                                                c1196q03.m2122V(c0800d96.f3340a, new C0242k0(4));
                                                                                if (atomicLong3.get() != j13) {
                                                                                    c1196q03.m2116J(c0800d96.f3340a, -1, null);
                                                                                    c1288t.f7694h = c1196q03;
                                                                                    c1288t.f7695i = c0800d96;
                                                                                    c1288t.f7696j = closeable2;
                                                                                    c1288t.f7697k = obj5;
                                                                                    c1288t.f7698l = c1071m3;
                                                                                    c1288t.f7699m = interfaceC0520b12;
                                                                                    c1288t.f7700n = c0565q13;
                                                                                    c1288t.f7701o = null;
                                                                                    c1288t.f7702p = null;
                                                                                    c1288t.f7710x = 3;
                                                                                    if (AbstractC0525d0.m1129g(c0565q1, c1288t) != obj2) {
                                                                                        interfaceC0520b14 = c0565q13;
                                                                                        c1071m4 = c1071m3;
                                                                                        interfaceC0520b15 = interfaceC0520b12;
                                                                                        c1196q04 = c1196q03;
                                                                                        c1196q04.m2113G(c0800d96, c1071m4, obj5);
                                                                                        c1288t.f7694h = closeable2;
                                                                                        c1288t.f7695i = interfaceC0520b14;
                                                                                        th4 = null;
                                                                                        c1288t.f7696j = null;
                                                                                        c1288t.f7697k = null;
                                                                                        c1288t.f7698l = null;
                                                                                        c1288t.f7699m = null;
                                                                                        c1288t.f7700n = null;
                                                                                        c1288t.f7710x = 4;
                                                                                        if (AbstractC0525d0.m1129g(interfaceC0520b15, c1288t) != obj2) {
                                                                                            closeable4 = closeable2;
                                                                                            c1288t.f7694h = closeable4;
                                                                                            c1288t.f7695i = th4;
                                                                                            c1288t.f7710x = 5;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    c0565q12 = c0565q13;
                                                                                    try {
                                                                                        throw new IllegalStateException(("分片覆盖不完整：" + atomicLong3.get() + "/" + j13).toString());
                                                                                    } catch (Throwable th6) {
                                                                                        th = th6;
                                                                                        th2 = th;
                                                                                        c0800d95 = c0800d96;
                                                                                        interfaceC0520b1 = interfaceC0520b12;
                                                                                        c1196q0 = c1196q03;
                                                                                        obj6 = obj5;
                                                                                        c1196q0.m2116J(c0800d95.f3340a, -1, null);
                                                                                        c1288t.f7694h = c1196q0;
                                                                                        c1288t.f7695i = c0800d95;
                                                                                        c1288t.f7696j = closeable2;
                                                                                        c1288t.f7697k = obj6;
                                                                                        c1288t.f7698l = c1071m3;
                                                                                        c1288t.f7699m = interfaceC0520b1;
                                                                                        c1288t.f7700n = th2;
                                                                                        c1288t.f7701o = c0565q12;
                                                                                        c1288t.f7702p = null;
                                                                                        c1288t.f7703q = null;
                                                                                        c1288t.f7704r = null;
                                                                                        c1288t.f7705s = null;
                                                                                        c1288t.f7710x = 6;
                                                                                        if (AbstractC0525d0.m1129g(c0565q1, c1288t) != obj2) {
                                                                                        }
                                                                                        return obj2;
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                                c0565q12 = c0565q13;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                        c0565q1 = m1141s3;
                                                                        c0800d95 = c0800d94;
                                                                        interfaceC0520b1 = m1141s2;
                                                                        obj6 = obj5;
                                                                        c0565q12 = m1141s;
                                                                        th2 = th;
                                                                        c1196q0.m2116J(c0800d95.f3340a, -1, null);
                                                                        c1288t.f7694h = c1196q0;
                                                                        c1288t.f7695i = c0800d95;
                                                                        c1288t.f7696j = closeable2;
                                                                        c1288t.f7697k = obj6;
                                                                        c1288t.f7698l = c1071m3;
                                                                        c1288t.f7699m = interfaceC0520b1;
                                                                        c1288t.f7700n = th2;
                                                                        c1288t.f7701o = c0565q12;
                                                                        c1288t.f7702p = null;
                                                                        c1288t.f7703q = null;
                                                                        c1288t.f7704r = null;
                                                                        c1288t.f7705s = null;
                                                                        c1288t.f7710x = 6;
                                                                        if (AbstractC0525d0.m1129g(c0565q1, c1288t) != obj2) {
                                                                        }
                                                                        return obj2;
                                                                    }
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                    c0800d94 = c0800d93;
                                                                    c1071m3 = c1071m2;
                                                                    obj5 = obj4;
                                                                    c1196q0 = c1196q02;
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                                c0800d94 = c0800d93;
                                                                c1071m3 = c1071m2;
                                                                obj5 = obj4;
                                                            }
                                                            return obj2;
                                                        }
                                                        return obj2;
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        th = th;
                                                        closeable = closeable2;
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th12) {
                                                            AbstractC2168e.m3526m(closeable, th);
                                                            throw th12;
                                                        }
                                                    }
                                                }
                                                c1196q05 = this;
                                                linkedHashMap = linkedHashMap2;
                                                arrayList = arrayList12;
                                                arrayList2 = arrayList2;
                                            }
                                        }
                                    } else {
                                        j7 = j6;
                                    }
                                    arrayList = m2133u.f5750a;
                                    Object obj102 = new Object();
                                    LinkedHashMap linkedHashMap42 = new LinkedHashMap();
                                    LinkedHashSet linkedHashSet22 = new LinkedHashSet();
                                    long j152 = 0;
                                    Object obj112 = new Object();
                                    j9 = j7 / 100;
                                    if (j9 < 4194304) {
                                    }
                                    long min2 = Math.min(67108864L, j9);
                                    ArrayList arrayList52 = m2133u.f5751b;
                                    size = arrayList52.size();
                                    long j162 = 0;
                                    i8 = 0;
                                    while (i8 < size) {
                                    }
                                    size2 = arrayList.size();
                                    long j172 = 0;
                                    i9 = 0;
                                    while (i9 < size2) {
                                    }
                                    AtomicLong atomicLong42 = new AtomicLong(Math.min(j7, j162 + j172));
                                    ArrayList arrayList72 = new ArrayList(AbstractC1807o.m3073U(arrayList));
                                    size3 = arrayList.size();
                                    i10 = 0;
                                    while (i10 < size3) {
                                    }
                                    ArrayList arrayList82 = new ArrayList(i14);
                                    i11 = 0;
                                    while (i11 < i14) {
                                    }
                                    linkedHashMap = linkedHashMap42;
                                    arrayList2 = arrayList72;
                                    c1701c0 = c1196q05.f6973l;
                                    while (true) {
                                        value = c1701c0.getValue();
                                        map = (Map) value;
                                        ArrayList arrayList102 = new ArrayList(AbstractC1807o.m3073U(arrayList));
                                        size4 = arrayList.size();
                                        linkedHashMap2 = linkedHashMap;
                                        i12 = 0;
                                        while (i12 < size4) {
                                        }
                                        ArrayList arrayList122 = arrayList;
                                        AbstractC3367j.m5100e(map, "<this>");
                                        if (!map.isEmpty()) {
                                        }
                                        if (!c1701c0.m2750g(value, map2)) {
                                        }
                                        c1196q05 = this;
                                        linkedHashMap = linkedHashMap2;
                                        arrayList = arrayList122;
                                        arrayList2 = arrayList2;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    closeable2 = r22;
                                    th = th;
                                    closeable = closeable2;
                                    throw th;
                                }
                                m2133u = m2133u(c0800d9);
                                if (m2133u == null) {
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                th = th;
                                closeable = r22;
                                throw th;
                            }
                            j8 = 1;
                            break;
                        case 1:
                            long j24 = c1288t.f7707u;
                            long j25 = c1288t.f7706t;
                            ArrayList arrayList14 = c1288t.f7705s;
                            AtomicLong atomicLong7 = c1288t.f7704r;
                            ArrayList arrayList15 = c1288t.f7703q;
                            C3378u c3378u = (C3378u) c1288t.f7702p;
                            ?? r12 = (Set) c1288t.f7701o;
                            ?? r14 = (Map) c1288t.f7700n;
                            C1071m c1071m6 = (C1071m) c1288t.f7699m;
                            Object obj16 = c1288t.f7698l;
                            C1040l c1040l = (C1040l) c1288t.f7697k;
                            Closeable closeable5 = (Closeable) c1288t.f7696j;
                            C0800d9 c0800d97 = (C0800d9) c1288t.f7695i;
                            C1196q0 c1196q06 = (C1196q0) c1288t.f7694h;
                            try {
                                AbstractC1793a0.m2972L(obj7);
                                c1196q0 = c1196q06;
                                atomicLong = atomicLong7;
                                arrayList4 = arrayList15;
                                obj3 = obj16;
                                r35 = c1040l;
                                j11 = j24;
                                j10 = j25;
                                obj = obj8;
                                r34 = c3378u;
                                linkedHashSet = r12;
                                obj2 = obj9;
                                linkedHashMap3 = r14;
                                c1071m = c1071m6;
                                closeable2 = closeable5;
                                c0800d92 = c0800d97;
                                arrayList3 = arrayList14;
                                m1141s = AbstractC0525d0.m1141s(c1196q0.f6967f, null, new C1041l0(atomicLong, c1196q0, c0800d92.f3340a, null), 3);
                                AtomicLong atomicLong62 = atomicLong;
                                m1141s2 = AbstractC0525d0.m1141s(c1196q0.f6967f, null, new C1165p0(arrayList3, arrayList4, c1196q0, c0800d92.f3340a, null), 3);
                                C2090c c2090c2 = c1196q0.f6966e;
                                c0800d93 = c0800d92;
                                C0073s c0073s2 = new C0073s(c1196q0, c0800d93, c1071m, obj3, (InterfaceC2313c) null, 4);
                                obj4 = obj3;
                                c1071m2 = c1071m;
                                m1141s3 = AbstractC0525d0.m1141s(c2090c2, null, c0073s2, 3);
                                c1196q02 = c1196q0;
                                c1443y = new C1443y(c0800d93, arrayList4, arrayList3, c1071m2, obj4, c1196q02, linkedHashMap3, linkedHashSet, j11, r34, r35, atomicLong62, j10, null);
                                c0800d94 = c0800d93;
                                c1071m3 = c1071m2;
                                obj5 = obj4;
                                atomicLong2 = atomicLong62;
                                j12 = j10;
                                c1288t.f7694h = c1196q0;
                                c1288t.f7695i = c0800d94;
                                c1288t.f7696j = closeable2;
                                c1288t.f7697k = obj5;
                                c1288t.f7698l = c1071m3;
                                c1288t.f7699m = m1141s2;
                                c1288t.f7700n = m1141s3;
                                c1288t.f7701o = atomicLong2;
                                c1288t.f7702p = m1141s;
                                c1288t.f7703q = null;
                                c1288t.f7704r = null;
                                c1288t.f7705s = null;
                                c1288t.f7706t = j12;
                                c1288t.f7710x = 2;
                                if (AbstractC0525d0.m1130h(c1443y, c1288t) != obj2) {
                                }
                                return obj2;
                            } catch (Throwable th15) {
                                th = th15;
                                closeable = closeable5;
                                throw th;
                            }
                        case 2:
                            j13 = c1288t.f7706t;
                            ?? r62 = (InterfaceC0520b1) c1288t.f7702p;
                            atomicLong2 = (AtomicLong) c1288t.f7701o;
                            ?? r142 = (InterfaceC0520b1) c1288t.f7700n;
                            interfaceC0520b12 = (InterfaceC0520b1) c1288t.f7699m;
                            C1071m c1071m7 = (C1071m) c1288t.f7698l;
                            obj6 = c1288t.f7697k;
                            Closeable closeable6 = (Closeable) c1288t.f7696j;
                            C0800d9 c0800d98 = (C0800d9) c1288t.f7695i;
                            C1196q0 c1196q07 = (C1196q0) c1288t.f7694h;
                            try {
                                AbstractC1793a0.m2972L(obj7);
                                obj5 = obj6;
                                c1196q03 = c1196q07;
                                c1071m3 = c1071m7;
                                c0800d96 = c0800d98;
                                c0565q13 = r62;
                                obj = obj8;
                                obj2 = obj9;
                                c0565q1 = r142;
                                closeable2 = closeable6;
                                atomicLong3 = atomicLong2;
                                c1196q03.m2122V(c0800d96.f3340a, new C0242k0(4));
                                if (atomicLong3.get() != j13) {
                                }
                            } catch (Throwable th16) {
                                c1071m3 = c1071m7;
                                c1196q0 = c1196q07;
                                th2 = th16;
                                c0565q12 = r62;
                                obj2 = obj9;
                                c0565q1 = r142;
                                interfaceC0520b1 = interfaceC0520b12;
                                closeable2 = closeable6;
                                c0800d95 = c0800d98;
                                c1196q0.m2116J(c0800d95.f3340a, -1, null);
                                c1288t.f7694h = c1196q0;
                                c1288t.f7695i = c0800d95;
                                c1288t.f7696j = closeable2;
                                c1288t.f7697k = obj6;
                                c1288t.f7698l = c1071m3;
                                c1288t.f7699m = interfaceC0520b1;
                                c1288t.f7700n = th2;
                                c1288t.f7701o = c0565q12;
                                c1288t.f7702p = null;
                                c1288t.f7703q = null;
                                c1288t.f7704r = null;
                                c1288t.f7705s = null;
                                c1288t.f7710x = 6;
                                if (AbstractC0525d0.m1129g(c0565q1, c1288t) != obj2) {
                                    th3 = th2;
                                    interfaceC0520b13 = c0565q12;
                                    closeable3 = closeable2;
                                    c1196q0.m2113G(c0800d95, c1071m3, obj6);
                                    c1288t.f7694h = closeable3;
                                    c1288t.f7695i = th3;
                                    c1288t.f7696j = interfaceC0520b13;
                                    c1288t.f7697k = null;
                                    c1288t.f7698l = null;
                                    c1288t.f7699m = null;
                                    c1288t.f7700n = null;
                                    c1288t.f7701o = null;
                                    c1288t.f7710x = 7;
                                    if (AbstractC0525d0.m1129g(interfaceC0520b1, c1288t) == obj2) {
                                    }
                                    c1288t.f7694h = closeable3;
                                    c1288t.f7695i = th3;
                                    c1288t.f7696j = null;
                                    c1288t.f7710x = 8;
                                    if (AbstractC0525d0.m1129g(interfaceC0520b13, c1288t) != obj2) {
                                    }
                                }
                                return obj2;
                            }
                            break;
                        case 3:
                            interfaceC0520b14 = (InterfaceC0520b1) c1288t.f7700n;
                            interfaceC0520b15 = (InterfaceC0520b1) c1288t.f7699m;
                            c1071m4 = (C1071m) c1288t.f7698l;
                            Object obj17 = c1288t.f7697k;
                            Closeable closeable7 = (Closeable) c1288t.f7696j;
                            c0800d96 = (C0800d9) c1288t.f7695i;
                            c1196q04 = (C1196q0) c1288t.f7694h;
                            try {
                                AbstractC1793a0.m2972L(obj7);
                                obj5 = obj17;
                                obj = obj8;
                                closeable2 = closeable7;
                                obj2 = obj9;
                                c1196q04.m2113G(c0800d96, c1071m4, obj5);
                                c1288t.f7694h = closeable2;
                                c1288t.f7695i = interfaceC0520b14;
                                th4 = null;
                                c1288t.f7696j = null;
                                c1288t.f7697k = null;
                                c1288t.f7698l = null;
                                c1288t.f7699m = null;
                                c1288t.f7700n = null;
                                c1288t.f7710x = 4;
                                if (AbstractC0525d0.m1129g(interfaceC0520b15, c1288t) != obj2) {
                                }
                                return obj2;
                            } catch (Throwable th17) {
                                th = th17;
                                closeable = closeable7;
                                throw th;
                            }
                        case 4:
                            interfaceC0520b14 = (InterfaceC0520b1) c1288t.f7695i;
                            closeable4 = (Closeable) c1288t.f7694h;
                            AbstractC1793a0.m2972L(obj7);
                            obj = obj8;
                            obj2 = obj9;
                            th4 = null;
                            c1288t.f7694h = closeable4;
                            c1288t.f7695i = th4;
                            c1288t.f7710x = 5;
                            break;
                        case AbstractC3122c.f15761f /* 5 */:
                            closeable4 = (Closeable) c1288t.f7694h;
                            AbstractC1793a0.m2972L(obj7);
                            obj = obj8;
                            th4 = null;
                            AbstractC2168e.m3526m(closeable4, th4);
                            return obj;
                        case AbstractC3122c.f15759d /* 6 */:
                            interfaceC0520b13 = (InterfaceC0520b1) c1288t.f7701o;
                            Throwable th18 = (Throwable) c1288t.f7700n;
                            interfaceC0520b1 = (InterfaceC0520b1) c1288t.f7699m;
                            C1071m c1071m8 = (C1071m) c1288t.f7698l;
                            obj6 = c1288t.f7697k;
                            Closeable closeable8 = (Closeable) c1288t.f7696j;
                            c0800d95 = (C0800d9) c1288t.f7695i;
                            c1196q0 = (C1196q0) c1288t.f7694h;
                            try {
                                AbstractC1793a0.m2972L(obj7);
                                th3 = th18;
                                c1071m3 = c1071m8;
                                closeable3 = closeable8;
                                obj2 = obj9;
                                c1196q0.m2113G(c0800d95, c1071m3, obj6);
                                c1288t.f7694h = closeable3;
                                c1288t.f7695i = th3;
                                c1288t.f7696j = interfaceC0520b13;
                                c1288t.f7697k = null;
                                c1288t.f7698l = null;
                                c1288t.f7699m = null;
                                c1288t.f7700n = null;
                                c1288t.f7701o = null;
                                c1288t.f7710x = 7;
                                if (AbstractC0525d0.m1129g(interfaceC0520b1, c1288t) == obj2) {
                                    return obj2;
                                }
                                c1288t.f7694h = closeable3;
                                c1288t.f7695i = th3;
                                c1288t.f7696j = null;
                                c1288t.f7710x = 8;
                                if (AbstractC0525d0.m1129g(interfaceC0520b13, c1288t) != obj2) {
                                    throw th3;
                                }
                                return obj2;
                            } catch (Throwable th19) {
                                th = th19;
                                closeable = closeable8;
                                throw th;
                            }
                        case 7:
                            interfaceC0520b13 = (InterfaceC0520b1) c1288t.f7696j;
                            Throwable th20 = (Throwable) c1288t.f7695i;
                            Closeable closeable9 = (Closeable) c1288t.f7694h;
                            try {
                                AbstractC1793a0.m2972L(obj7);
                                th3 = th20;
                                closeable3 = closeable9;
                                obj2 = obj9;
                                c1288t.f7694h = closeable3;
                                c1288t.f7695i = th3;
                                c1288t.f7696j = null;
                                c1288t.f7710x = 8;
                                if (AbstractC0525d0.m1129g(interfaceC0520b13, c1288t) != obj2) {
                                }
                                return obj2;
                            } catch (Throwable th21) {
                                th = th21;
                                closeable = closeable9;
                                throw th;
                            }
                        case 8:
                            Throwable th22 = (Throwable) c1288t.f7695i;
                            AbstractC1793a0.m2972L(obj7);
                            throw th22;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (i7) {
            }
        } catch (Throwable th23) {
            th = th23;
        }
        c1288t = new C1288t(c1196q05, abstractC2583c);
        Object obj72 = c1288t.f7708v;
        i7 = c1288t.f7710x;
        Object obj82 = C1694m.f10482a;
        Object obj92 = EnumC2465a.f13750e;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002c. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b3 A[Catch: all -> 0x021c, TryCatch #12 {all -> 0x021c, blocks: (B:52:0x01f5, B:60:0x020b, B:63:0x0211, B:64:0x0220, B:74:0x0263, B:93:0x02a7, B:94:0x02aa, B:95:0x02ab, B:96:0x02b2, B:98:0x02b3, B:99:0x02cd, B:67:0x0239, B:69:0x0244, B:71:0x024a, B:90:0x02a5), top: B:51:0x01f5, outer: #2, inners: #0, #6 }] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v47, types: [d6.b1] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9, types: [d6.b1] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2126m(C0800d9 c0800d9, long j6, boolean z7, AbstractC2583c abstractC2583c) {
        C1474z c1474z;
        Object obj;
        C0565q1 c0565q1;
        C1040l c1040l;
        Throwable th;
        Throwable th2;
        ?? r42;
        ?? r32;
        C1040l c1040l2;
        EnumC2465a enumC2465a;
        C1040l m2111D;
        long size;
        long j7;
        long j8;
        Map map;
        long j9;
        AtomicLong atomicLong;
        C1196q0 c1196q0;
        C0800d9 c0800d92;
        C2625z c2625z;
        C1040l c1040l3;
        C0565q1 m1141s;
        C0800d9 c0800d93;
        EnumC2465a enumC2465a2;
        Object m2128o;
        AtomicLong atomicLong2;
        InterfaceC0520b1 interfaceC0520b1;
        InterfaceC0520b1 interfaceC0520b12;
        C1196q0 c1196q02;
        long j10;
        C1040l c1040l4;
        Closeable closeable;
        boolean m4142c;
        boolean z8;
        Throwable th3;
        Closeable closeable2;
        int read;
        int i7;
        ?? r7;
        C1196q0 c1196q03 = this;
        if ((abstractC2583c instanceof C1474z) && (r7 = (i7 = (c1474z = (C1474z) abstractC2583c).f9807r) & Integer.MIN_VALUE) != 0) {
            c1474z.f9807r = i7 - Integer.MIN_VALUE;
        } else {
            c1474z = new C1474z(c1196q03, abstractC2583c);
        }
        C1474z c1474z2 = c1474z;
        Object obj2 = c1474z2.f9805p;
        ?? r33 = c1474z2.f9807r;
        C1694m c1694m = C1694m.f10482a;
        long j11 = 0;
        EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
        try {
            try {
            } catch (Throwable th4) {
                th = th4;
                c1040l2 = r33;
            }
        } catch (Throwable th5) {
            th = th5;
            obj = "bytes=";
            c0565q1 = -2147483648;
            c1040l = r7;
        }
        switch (r33) {
            case 0:
                AbstractC1793a0.m2972L(obj2);
                m2111D = m2111D(c0800d9);
                FileChannel fileChannel = m2111D.f5348f;
                String str = c0800d9.f3340a;
                if (z7) {
                    try {
                        size = fileChannel.size();
                    } catch (Throwable th6) {
                        th = th6;
                        c1040l2 = m2111D;
                        try {
                            throw th;
                        } catch (Throwable th7) {
                            AbstractC2168e.m3526m(c1040l2, th);
                            throw th7;
                        }
                    }
                } else {
                    size = 0;
                }
                if (!z7) {
                    fileChannel.truncate(0L);
                }
                C2625z m2088L = m2088L(c0800d9, c0800d9.f3341b);
                if (size > 0) {
                    m2088L.m4191c("Range", "bytes=" + size + "-");
                }
                AtomicLong atomicLong3 = new AtomicLong(size);
                C1701c0 c1701c0 = c1196q03.f6973l;
                while (true) {
                    Object value = c1701c0.getValue();
                    Map map2 = (Map) value;
                    if (j6 > j11) {
                        j7 = j6 - 1;
                    } else {
                        j7 = -1;
                    }
                    j8 = j11;
                    long j12 = size;
                    List m5817z = AbstractC3784a.m5817z(new C0831e9(0, 0L, j7, j12, m2103j(c0800d9, 0), "下载中"));
                    AbstractC3367j.m5100e(map2, "<this>");
                    if (map2.isEmpty()) {
                        map = Collections.singletonMap(str, m5817z);
                        AbstractC3367j.m5099d(map, "singletonMap(...)");
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.put(str, m5817z);
                        map = linkedHashMap;
                    }
                    if (c1701c0.m2750g(value, map)) {
                        C0565q1 m1141s2 = AbstractC0525d0.m1141s(c1196q03.f6967f, null, new C1134o0(atomicLong3, c1196q03, c0800d9.f3340a, atomicLong3, null), 3);
                        C0821e c0821e = new C0821e(0, j6, j12);
                        j9 = j12;
                        c1474z2.f9797h = c1196q03;
                        c1474z2.f9798i = c0800d9;
                        c1474z2.f9799j = m2111D;
                        c1474z2.f9800k = m2111D;
                        c1474z2.f9801l = m2088L;
                        c1474z2.f9802m = atomicLong3;
                        c1474z2.f9803n = m1141s2;
                        c1474z2.f9804o = j9;
                        c1474z2.f9807r = 1;
                        c1196q03.m2121U(str, c0821e);
                        if (c1694m == enumC2465a3) {
                            return enumC2465a3;
                        }
                        c0565q1 = m1141s2;
                        atomicLong = atomicLong3;
                        c1196q0 = c1196q03;
                        c0800d92 = c0800d9;
                        c1040l = m2111D;
                        c2625z = m2088L;
                        c1040l3 = c1040l;
                        m1141s = AbstractC0525d0.m1141s(c1196q0.f6967f, null, new C1041l0(atomicLong, c1196q0, c0800d92.f3340a, null), 3);
                        try {
                            c2625z.m4190b();
                            C2592a0 m4189a = c2625z.m4189a();
                            try {
                                C0321f c0321f = new C0321f(1, c1196q0, c0800d92);
                                enumC2465a2 = enumC2465a3;
                                try {
                                    C0226c0 c0226c0 = new C0226c0(2, m4189a);
                                    c1474z2.f9797h = c1196q0;
                                    c1474z2.f9798i = c0800d92;
                                    c1474z2.f9799j = c1040l;
                                    c1474z2.f9800k = c1040l3;
                                    c1474z2.f9801l = atomicLong;
                                    c1474z2.f9802m = c0565q1;
                                    c1474z2.f9803n = m1141s;
                                    c1474z2.f9804o = j9;
                                    c1474z2.f9807r = 2;
                                    m2128o = c1196q0.m2128o(c0800d92, 0, c0321f, c0226c0, c1474z2);
                                    if (m2128o == enumC2465a2) {
                                        atomicLong2 = atomicLong;
                                        obj2 = m2128o;
                                        C0800d9 c0800d94 = c0800d92;
                                        interfaceC0520b1 = c0565q1;
                                        interfaceC0520b12 = m1141s;
                                        c0800d93 = c0800d94;
                                        m2111D = c1040l;
                                        c1196q02 = c1196q0;
                                        j10 = j9;
                                        c1040l4 = c1040l3;
                                        try {
                                            closeable = (Closeable) obj2;
                                            try {
                                                C2598d0 c2598d0 = (C2598d0) closeable;
                                                m4142c = c2598d0.m4142c();
                                                int i8 = c2598d0.f14059h;
                                                if (!m4142c) {
                                                    if (j10 > j8 && i8 == 206) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    AbstractC2602f0 abstractC2602f0 = c2598d0.f14062k;
                                                    if (abstractC2602f0 != null) {
                                                        if (!z8) {
                                                            long j13 = j8;
                                                            c1040l4.f5348f.truncate(j13);
                                                            atomicLong2.set(j13);
                                                        }
                                                        long j14 = atomicLong2.get();
                                                        byte[] bArr = new byte[AbstractC2168e.m3530q(c0800d93.f3349j, 8, 1024) * 1024];
                                                        InputStream m4147b = abstractC2602f0.m4147b();
                                                        long j15 = j14;
                                                        C1040l c1040l5 = c1040l4;
                                                        while (true) {
                                                            try {
                                                                InterfaceC2318h interfaceC2318h = c1474z2.f13999f;
                                                                AbstractC3367j.m5097b(interfaceC2318h);
                                                                if (AbstractC0525d0.m1140r(interfaceC2318h) && (read = m4147b.read(bArr)) >= 0) {
                                                                    byte[] bArr2 = bArr;
                                                                    C1040l c1040l6 = c1040l5;
                                                                    c1040l6.m1634b(j15, bArr2, 0, read);
                                                                    long j16 = read;
                                                                    j15 += j16;
                                                                    atomicLong2.addAndGet(j16);
                                                                    c1040l5 = c1040l6;
                                                                    bArr = bArr2;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        m4147b.close();
                                                        th3 = null;
                                                        AbstractC2168e.m3526m(closeable, null);
                                                        c1196q02.m2116J(c0800d93.f3340a, 0, null);
                                                        c1474z2.f9797h = m2111D;
                                                        c1474z2.f9798i = interfaceC0520b12;
                                                        c1474z2.f9799j = null;
                                                        c1474z2.f9800k = null;
                                                        c1474z2.f9801l = null;
                                                        c1474z2.f9802m = null;
                                                        c1474z2.f9803n = null;
                                                        c1474z2.f9807r = 3;
                                                        if (AbstractC0525d0.m1129g(interfaceC0520b1, c1474z2) != enumC2465a2) {
                                                            closeable2 = m2111D;
                                                            c1474z2.f9797h = closeable2;
                                                            c1474z2.f9798i = th3;
                                                            c1474z2.f9807r = 4;
                                                            if (AbstractC0525d0.m1129g(interfaceC0520b12, c1474z2) == enumC2465a2) {
                                                                return enumC2465a2;
                                                            }
                                                            AbstractC2168e.m3526m(closeable2, th3);
                                                            return c1694m;
                                                        }
                                                        return enumC2465a2;
                                                    }
                                                    throw new IllegalStateException("服务器未返回内容");
                                                }
                                                throw new IllegalStateException(("服务器返回 HTTP " + i8).toString());
                                            } catch (Throwable th8) {
                                                try {
                                                    throw th8;
                                                } catch (Throwable th9) {
                                                    AbstractC2168e.m3526m(closeable, th8);
                                                    throw th9;
                                                }
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            c1196q0 = c1196q02;
                                            c1196q0.m2116J(c0800d93.f3340a, 0, null);
                                            throw th;
                                        }
                                    }
                                    return enumC2465a2;
                                } catch (Throwable th11) {
                                    th = th11;
                                    c0800d93 = c0800d92;
                                    c1196q0.m2116J(c0800d93.f3340a, 0, null);
                                    throw th;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            enumC2465a = enumC2465a3;
                            obj = m1141s;
                            c1474z2.f9797h = c1040l;
                            c1474z2.f9798i = obj;
                            c1474z2.f9799j = th;
                            c1474z2.f9800k = null;
                            c1474z2.f9801l = null;
                            c1474z2.f9802m = null;
                            c1474z2.f9803n = null;
                            c1474z2.f9807r = 5;
                            if (AbstractC0525d0.m1129g(c0565q1, c1474z2) != enumC2465a) {
                                th2 = th;
                                r42 = c1040l;
                                r32 = obj;
                                c1474z2.f9797h = r42;
                                c1474z2.f9798i = th2;
                                c1474z2.f9799j = null;
                                c1474z2.f9807r = 6;
                                if (AbstractC0525d0.m1129g(r32, c1474z2) != enumC2465a) {
                                }
                            } else {
                                return enumC2465a;
                            }
                        }
                    } else {
                        c1196q03 = this;
                        size = j12;
                        j11 = j8;
                    }
                }
                break;
            case 1:
                long j17 = c1474z2.f9804o;
                c0565q1 = c1474z2.f9803n;
                AtomicLong atomicLong4 = (AtomicLong) c1474z2.f9802m;
                c2625z = (C2625z) c1474z2.f9801l;
                C1040l c1040l7 = c1474z2.f9800k;
                ?? r11 = (Closeable) c1474z2.f9799j;
                C0800d9 c0800d95 = (C0800d9) c1474z2.f9798i;
                C1196q0 c1196q04 = (C1196q0) c1474z2.f9797h;
                try {
                    AbstractC1793a0.m2972L(obj2);
                    atomicLong = atomicLong4;
                    c0800d92 = c0800d95;
                    j8 = 0;
                    j9 = j17;
                    c1040l3 = c1040l7;
                    c1040l = r11;
                    c1196q0 = c1196q04;
                    m1141s = AbstractC0525d0.m1141s(c1196q0.f6967f, null, new C1041l0(atomicLong, c1196q0, c0800d92.f3340a, null), 3);
                    c2625z.m4190b();
                    C2592a0 m4189a2 = c2625z.m4189a();
                    C0321f c0321f2 = new C0321f(1, c1196q0, c0800d92);
                    enumC2465a2 = enumC2465a3;
                    C0226c0 c0226c02 = new C0226c0(2, m4189a2);
                    c1474z2.f9797h = c1196q0;
                    c1474z2.f9798i = c0800d92;
                    c1474z2.f9799j = c1040l;
                    c1474z2.f9800k = c1040l3;
                    c1474z2.f9801l = atomicLong;
                    c1474z2.f9802m = c0565q1;
                    c1474z2.f9803n = m1141s;
                    c1474z2.f9804o = j9;
                    c1474z2.f9807r = 2;
                    m2128o = c1196q0.m2128o(c0800d92, 0, c0321f2, c0226c02, c1474z2);
                    if (m2128o == enumC2465a2) {
                    }
                } catch (Throwable th14) {
                    th = th14;
                    c1040l2 = r11;
                    throw th;
                }
                break;
            case 2:
                j10 = c1474z2.f9804o;
                interfaceC0520b12 = c1474z2.f9803n;
                interfaceC0520b1 = (InterfaceC0520b1) c1474z2.f9802m;
                atomicLong2 = (AtomicLong) c1474z2.f9801l;
                C1040l c1040l8 = c1474z2.f9800k;
                ?? r72 = (Closeable) c1474z2.f9799j;
                c0800d93 = (C0800d9) c1474z2.f9798i;
                C1196q0 c1196q05 = (C1196q0) c1474z2.f9797h;
                try {
                    AbstractC1793a0.m2972L(obj2);
                    enumC2465a2 = enumC2465a3;
                    c1196q02 = c1196q05;
                    j8 = 0;
                    m2111D = r72;
                    c1040l4 = c1040l8;
                    closeable = (Closeable) obj2;
                    C2598d0 c2598d02 = (C2598d0) closeable;
                    m4142c = c2598d02.m4142c();
                    int i82 = c2598d02.f14059h;
                    if (!m4142c) {
                    }
                } catch (Throwable th15) {
                    th = th15;
                    c1196q0 = c1196q05;
                    c1196q0.m2116J(c0800d93.f3340a, 0, null);
                    throw th;
                }
                break;
            case 3:
                interfaceC0520b12 = (InterfaceC0520b1) c1474z2.f9798i;
                closeable2 = (Closeable) c1474z2.f9797h;
                AbstractC1793a0.m2972L(obj2);
                enumC2465a2 = enumC2465a3;
                th3 = null;
                c1474z2.f9797h = closeable2;
                c1474z2.f9798i = th3;
                c1474z2.f9807r = 4;
                if (AbstractC0525d0.m1129g(interfaceC0520b12, c1474z2) == enumC2465a2) {
                }
                AbstractC2168e.m3526m(closeable2, th3);
                return c1694m;
            case 4:
                closeable2 = (Closeable) c1474z2.f9797h;
                AbstractC1793a0.m2972L(obj2);
                th3 = null;
                AbstractC2168e.m3526m(closeable2, th3);
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                th2 = (Throwable) c1474z2.f9799j;
                r32 = (InterfaceC0520b1) c1474z2.f9798i;
                r42 = (Closeable) c1474z2.f9797h;
                try {
                    AbstractC1793a0.m2972L(obj2);
                    enumC2465a = enumC2465a3;
                    c1474z2.f9797h = r42;
                    c1474z2.f9798i = th2;
                    c1474z2.f9799j = null;
                    c1474z2.f9807r = 6;
                    if (AbstractC0525d0.m1129g(r32, c1474z2) != enumC2465a) {
                        return enumC2465a;
                    }
                    throw th2;
                } catch (Throwable th16) {
                    th = th16;
                    c1040l2 = r42;
                    throw th;
                }
            case AbstractC3122c.f15759d /* 6 */:
                Throwable th17 = (Throwable) c1474z2.f9798i;
                AbstractC1793a0.m2972L(obj2);
                throw th17;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: n */
    public final File m2127n(C0800d9 c0800d9) {
        return new File(m2131s(), AbstractC0094y0.m185l(".", c0800d9.f3340a, ".dynamic-ranges"));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:10|11|(1:13)(1:72)|14|15|16|17|(1:19)|20|(2:22|(1:24)(1:25))|26|29|30|31|(8:45|(1:63)(1:49)|50|(1:52)|(1:54)(2:60|(1:62))|55|56|(1:58)(27:59|10|11|(0)(0)|14|15|16|17|(0)|20|(0)|26|(0)|29|30|31|(1:33)|43|45|(1:47)|63|50|(0)|(0)(0)|55|56|(0)(0)))(1:41)) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0072, code lost:
    
        r0 = p060h5.AbstractC1793a0.m2985m(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x013b -> B:10:0x013f). Please report as a decompilation issue!!! */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2128o(C0800d9 c0800d9, int i7, InterfaceC3279c interfaceC3279c, InterfaceC3277a interfaceC3277a, AbstractC2583c abstractC2583c) {
        C0727b0 c0727b0;
        C1196q0 c1196q0;
        int i8;
        int i9;
        InterfaceC3279c interfaceC3279c2;
        InterfaceC3277a interfaceC3277a2;
        int i10;
        C0727b0 c0727b02;
        C1196q0 c1196q02;
        C0800d9 c0800d92;
        EnumC1452y8 enumC1452y8;
        C2623x c2623x;
        Object m2985m;
        String str;
        C3006i m4187b;
        C2598d0 m4681e;
        int i11;
        String m4141b;
        Long l7;
        long j6;
        Object m1131i;
        EnumC2465a enumC2465a;
        String obj;
        if (abstractC2583c instanceof C0727b0) {
            c0727b0 = (C0727b0) abstractC2583c;
            int i12 = c0727b0.f2533p;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0727b0.f2533p = i12 - Integer.MIN_VALUE;
                c1196q0 = this;
                Object obj2 = c0727b0.f2531n;
                i8 = c0727b0.f2533p;
                if (i8 == 0) {
                    if (i8 == 1) {
                        int i13 = c0727b0.f2530m;
                        int i14 = c0727b0.f2529l;
                        interfaceC3277a2 = c0727b0.f2528k;
                        InterfaceC3279c interfaceC3279c3 = c0727b0.f2527j;
                        C0800d9 c0800d93 = c0727b0.f2526i;
                        c1196q02 = c0727b0.f2525h;
                        AbstractC1793a0.m2972L(obj2);
                        C0727b0 c0727b03 = c0727b0;
                        c0800d92 = c0800d93;
                        try {
                            i10 = i13 + 1;
                            i9 = i14;
                            interfaceC3279c2 = interfaceC3279c3;
                            c0727b02 = c0727b03;
                            int i15 = i9 + i10;
                            c1196q02.getClass();
                            enumC1452y8 = c0800d92.f3348i;
                            List list = c0800d92.f3344e;
                            if (enumC1452y8 == EnumC1452y8.f9301f) {
                                c2623x = c1196q02.f6976o;
                            } else {
                                c2623x = c1196q02.f6975n;
                            }
                            C2623x c2623x2 = c2623x;
                            m2985m = new URI(c0800d92.f3341b).getHost();
                            if (m2985m instanceof C1689h) {
                                m2985m = null;
                            }
                            str = (String) m2985m;
                            if (str != null) {
                                if (list.isEmpty()) {
                                    C2622w m4186a = c2623x2.m4186a();
                                    m4186a.m4181b(new C0019e1(c0800d92));
                                    c2623x2 = new C2623x(m4186a);
                                } else {
                                    String str2 = (String) list.get(i15 % list.size());
                                    C2622w m4186a2 = c2623x2.m4186a();
                                    m4186a2.m4181b(new C0068q2(4, str, str2));
                                    c2623x2 = new C2623x(m4186a2);
                                }
                            }
                            m4187b = c2623x2.m4187b((C2592a0) interfaceC3277a2.mo52a());
                            m4681e = m4187b.m4681e();
                            i11 = m4681e.f14059h;
                            if ((i11 == 408 && i11 != 425 && i11 != 429 && (500 > i11 || i11 >= 505)) || i10 >= 5) {
                                return m4681e;
                            }
                            m4141b = C2598d0.m4141b("Retry-After", m4681e);
                            if (m4141b == null && (obj = AbstractC0444k.m956t0(m4141b).toString()) != null) {
                                l7 = AbstractC0451r.m974P(obj);
                            } else {
                                l7 = null;
                            }
                            m4681e.close();
                            if (l7 != null) {
                                j6 = l7.longValue() * 1000;
                            } else {
                                j6 = (1 << i10) * 750;
                                if (j6 > 12000) {
                                    j6 = 12000;
                                }
                            }
                            long m3531r = AbstractC2168e.m3531r(j6, 250L, 30000L);
                            c0727b02.f2525h = c1196q02;
                            c0727b02.f2526i = c0800d92;
                            c0727b02.f2527j = interfaceC3279c2;
                            c0727b02.f2528k = interfaceC3277a2;
                            c0727b02.f2529l = i9;
                            c0727b02.f2530m = i10;
                            c0727b02.f2533p = 1;
                            m1131i = AbstractC0525d0.m1131i(m3531r, c0727b02);
                            enumC2465a = EnumC2465a.f13750e;
                            if (m1131i == enumC2465a) {
                                return enumC2465a;
                            }
                            c0727b03 = c0727b02;
                            interfaceC3279c3 = interfaceC3279c2;
                            i14 = i9;
                            i13 = i10;
                            i10 = i13 + 1;
                            i9 = i14;
                            interfaceC3279c2 = interfaceC3279c3;
                            c0727b02 = c0727b03;
                            int i152 = i9 + i10;
                            c1196q02.getClass();
                            enumC1452y8 = c0800d92.f3348i;
                            List list2 = c0800d92.f3344e;
                            if (enumC1452y8 == EnumC1452y8.f9301f) {
                            }
                            C2623x c2623x22 = c2623x;
                            m2985m = new URI(c0800d92.f3341b).getHost();
                            if (m2985m instanceof C1689h) {
                            }
                            str = (String) m2985m;
                            if (str != null) {
                            }
                            m4187b = c2623x22.m4187b((C2592a0) interfaceC3277a2.mo52a());
                            if (interfaceC3279c2 != null) {
                            }
                            m4681e = m4187b.m4681e();
                            i11 = m4681e.f14059h;
                            if (i11 == 408) {
                            }
                            m4141b = C2598d0.m4141b("Retry-After", m4681e);
                            if (m4141b == null) {
                            }
                            l7 = null;
                            m4681e.close();
                            if (l7 != null) {
                            }
                            long m3531r2 = AbstractC2168e.m3531r(j6, 250L, 30000L);
                            c0727b02.f2525h = c1196q02;
                            c0727b02.f2526i = c0800d92;
                            c0727b02.f2527j = interfaceC3279c2;
                            c0727b02.f2528k = interfaceC3277a2;
                            c0727b02.f2529l = i9;
                            c0727b02.f2530m = i10;
                            c0727b02.f2533p = 1;
                            m1131i = AbstractC0525d0.m1131i(m3531r2, c0727b02);
                            enumC2465a = EnumC2465a.f13750e;
                            if (m1131i == enumC2465a) {
                            }
                        } finally {
                            if (interfaceC3279c2 != null) {
                                interfaceC3279c2.mo23f(null);
                            }
                        }
                        if (interfaceC3279c2 != null) {
                            interfaceC3279c2.mo23f(m4187b);
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj2);
                    i9 = i7;
                    interfaceC3279c2 = interfaceC3279c;
                    interfaceC3277a2 = interfaceC3277a;
                    i10 = 0;
                    c0727b02 = c0727b0;
                    c1196q02 = c1196q0;
                    c0800d92 = c0800d9;
                    int i1522 = i9 + i10;
                    c1196q02.getClass();
                    enumC1452y8 = c0800d92.f3348i;
                    List list22 = c0800d92.f3344e;
                    if (enumC1452y8 == EnumC1452y8.f9301f) {
                    }
                    C2623x c2623x222 = c2623x;
                    m2985m = new URI(c0800d92.f3341b).getHost();
                    if (m2985m instanceof C1689h) {
                    }
                    str = (String) m2985m;
                    if (str != null) {
                    }
                    m4187b = c2623x222.m4187b((C2592a0) interfaceC3277a2.mo52a());
                    if (interfaceC3279c2 != null) {
                    }
                    m4681e = m4187b.m4681e();
                    i11 = m4681e.f14059h;
                    if (i11 == 408) {
                    }
                    m4141b = C2598d0.m4141b("Retry-After", m4681e);
                    if (m4141b == null) {
                    }
                    l7 = null;
                    m4681e.close();
                    if (l7 != null) {
                    }
                    long m3531r22 = AbstractC2168e.m3531r(j6, 250L, 30000L);
                    c0727b02.f2525h = c1196q02;
                    c0727b02.f2526i = c0800d92;
                    c0727b02.f2527j = interfaceC3279c2;
                    c0727b02.f2528k = interfaceC3277a2;
                    c0727b02.f2529l = i9;
                    c0727b02.f2530m = i10;
                    c0727b02.f2533p = 1;
                    m1131i = AbstractC0525d0.m1131i(m3531r22, c0727b02);
                    enumC2465a = EnumC2465a.f13750e;
                    if (m1131i == enumC2465a) {
                    }
                }
            }
        }
        c1196q0 = this;
        c0727b0 = new C0727b0(c1196q0, abstractC2583c);
        Object obj22 = c0727b0.f2531n;
        i8 = c0727b0.f2533p;
        if (i8 == 0) {
        }
    }

    /* renamed from: p */
    public final File m2129p(C0800d9 c0800d9) {
        return new File(m2131s(), c0800d9.f3342c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [e5.c0, m5.c] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v11, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.net.Uri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r5v21, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.net.Uri] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Comparable m2130r(C0800d9 c0800d9, AbstractC2583c abstractC2583c) {
        ?? r32;
        InterfaceC2318h interfaceC2318h;
        int i7;
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        ?? r52;
        C1196q0 c1196q0;
        ?? r42;
        ?? r53;
        C1196q0 c1196q02;
        ?? r43;
        FileInputStream fileInputStream;
        Throwable th5;
        C1196q0 c1196q03;
        Object m2985m;
        String str;
        String str2;
        OutputStream openOutputStream;
        Throwable th6;
        C1196q0 c1196q04;
        Uri uri;
        Comparable comparable;
        Closeable closeable;
        Comparable comparable2;
        Closeable closeable2;
        C0800d9 c0800d92 = c0800d9;
        try {
            try {
                try {
                    try {
                        if (abstractC2583c instanceof C0759c0) {
                            C0759c0 c0759c0 = (C0759c0) abstractC2583c;
                            int i8 = c0759c0.f2928p;
                            if ((i8 & Integer.MIN_VALUE) != 0) {
                                c0759c0.f2928p = i8 - Integer.MIN_VALUE;
                                r32 = c0759c0;
                                interfaceC2318h = r32.f13999f;
                                Object obj = r32.f2926n;
                                i7 = r32.f2928p;
                                if (i7 == 0) {
                                    if (i7 != 1) {
                                        if (i7 == 2) {
                                            ?? r22 = r32.f2924l;
                                            ?? r44 = (Closeable) r32.f2923k;
                                            ?? r54 = r32.f2922j;
                                            C0800d9 c0800d93 = r32.f2921i;
                                            C1196q0 c1196q05 = r32.f2920h;
                                            try {
                                                AbstractC1793a0.m2972L(obj);
                                                fileInputStream = r22;
                                                c0800d92 = c0800d93;
                                                c1196q03 = c1196q05;
                                                closeable2 = r44;
                                                comparable2 = r54;
                                                AbstractC2168e.m3526m(fileInputStream, null);
                                                AbstractC2168e.m3526m(closeable2, null);
                                                String str3 = "download_finalized task=" + AbstractC0444k.m955s0(c0800d92.f3340a, 8) + " mode=local_copy";
                                                c1196q03.getClass();
                                                m2106w(str3);
                                                return comparable2;
                                            } catch (Throwable th7) {
                                                fileInputStream = r22;
                                                th5 = th7;
                                                r32 = c1196q05;
                                                interfaceC2318h = r44;
                                                i7 = r54;
                                                try {
                                                    throw th5;
                                                } finally {
                                                }
                                            }
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    OutputStream outputStream = r32.f2925m;
                                    ?? r45 = r32.f2924l;
                                    ?? r55 = (Uri) r32.f2923k;
                                    uri = r32.f2922j;
                                    C0800d9 c0800d94 = r32.f2921i;
                                    C1196q0 c1196q06 = r32.f2920h;
                                    try {
                                        AbstractC1793a0.m2972L(obj);
                                        openOutputStream = outputStream;
                                        c0800d92 = c0800d94;
                                        c1196q04 = c1196q06;
                                        closeable = r45;
                                        comparable = r55;
                                        AbstractC2168e.m3526m(openOutputStream, null);
                                        AbstractC2168e.m3526m(closeable, null);
                                        try {
                                            DocumentsContract.deleteDocument(c1196q04.f6962a.getContentResolver(), uri);
                                        } catch (Throwable th8) {
                                            AbstractC1793a0.m2985m(th8);
                                        }
                                        String str4 = "direct_target_finalized task=" + AbstractC0444k.m955s0(c0800d92.f3340a, 8) + " mode=copy_fallback";
                                        c1196q04.getClass();
                                        m2106w(str4);
                                        return comparable;
                                    } catch (Throwable th9) {
                                        openOutputStream = outputStream;
                                        th6 = th9;
                                        r32 = c1196q06;
                                        interfaceC2318h = r45;
                                        i7 = r55;
                                        try {
                                            throw th6;
                                        } finally {
                                        }
                                    }
                                }
                                AbstractC1793a0.m2972L(obj);
                                C0927h9 c0927h9 = C0927h9.f4481a;
                                Context context = this.f6962a;
                                c0927h9.m1554a(context);
                                String str5 = ((C0959i9) C0927h9.f4483c.f10535e.getValue()).f4779a;
                                if (!AbstractC0444k.m937a0(str5)) {
                                    Uri parse = Uri.parse(str5);
                                    Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(parse, DocumentsContract.getTreeDocumentId(parse));
                                    String str6 = c0800d92.f3361v;
                                    String str7 = c0800d92.f3340a;
                                    String str8 = c0800d92.f3342c;
                                    boolean m937a0 = AbstractC0444k.m937a0(str6);
                                    C1694m c1694m = C1694m.f10482a;
                                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                                    if (!m937a0) {
                                        Uri parse2 = Uri.parse(c0800d92.f3361v);
                                        try {
                                            m2985m = DocumentsContract.renameDocument(context.getContentResolver(), parse2, str8);
                                        } catch (Throwable th10) {
                                            m2985m = AbstractC1793a0.m2985m(th10);
                                        }
                                        Throwable m2747a = C1690i.m2747a(m2985m);
                                        if (m2747a == null) {
                                            str = "无法写入下载目录";
                                            str2 = "无法在下载目录创建文件";
                                        } else {
                                            String m955s0 = AbstractC0444k.m955s0(str7, 8);
                                            String message = m2747a.getMessage();
                                            str2 = "无法在下载目录创建文件";
                                            str = "无法写入下载目录";
                                            m2107x("direct_target_rename_failed task=" + m955s0 + " error=" + message);
                                        }
                                        if (m2985m instanceof C1689h) {
                                            m2985m = null;
                                        }
                                        Uri uri2 = (Uri) m2985m;
                                        if (uri2 != null) {
                                            m2106w("direct_target_finalized task=" + AbstractC0444k.m955s0(str7, 8) + " mode=rename");
                                            return uri2;
                                        }
                                        ?? createDocument = DocumentsContract.createDocument(context.getContentResolver(), buildDocumentUriUsingTree, m2108z(str8), str8);
                                        if (createDocument != 0) {
                                            try {
                                                ?? openInputStream = context.getContentResolver().openInputStream(parse2);
                                                try {
                                                    if (openInputStream != 0) {
                                                        openOutputStream = context.getContentResolver().openOutputStream(createDocument, "w");
                                                        try {
                                                            if (openOutputStream != null) {
                                                                r32.f2920h = this;
                                                                r32.f2921i = c0800d92;
                                                                r32.f2922j = parse2;
                                                                r32.f2923k = createDocument;
                                                                r32.f2924l = openInputStream;
                                                                r32.f2925m = openOutputStream;
                                                                r32.f2928p = 1;
                                                                byte[] bArr = new byte[1048576];
                                                                while (true) {
                                                                    AbstractC3367j.m5097b(interfaceC2318h);
                                                                    AbstractC0525d0.m1132j(interfaceC2318h);
                                                                    int read = openInputStream.read(bArr);
                                                                    if (read < 0) {
                                                                        break;
                                                                    }
                                                                    openOutputStream.write(bArr, 0, read);
                                                                }
                                                                if (c1694m != enumC2465a) {
                                                                    c1196q04 = this;
                                                                    uri = parse2;
                                                                    closeable = openInputStream;
                                                                    comparable = createDocument;
                                                                    AbstractC2168e.m3526m(openOutputStream, null);
                                                                    AbstractC2168e.m3526m(closeable, null);
                                                                    DocumentsContract.deleteDocument(c1196q04.f6962a.getContentResolver(), uri);
                                                                    String str42 = "direct_target_finalized task=" + AbstractC0444k.m955s0(c0800d92.f3340a, 8) + " mode=copy_fallback";
                                                                    c1196q04.getClass();
                                                                    m2106w(str42);
                                                                    return comparable;
                                                                }
                                                            } else {
                                                                throw new IllegalArgumentException(str);
                                                            }
                                                        } catch (Throwable th11) {
                                                            th6 = th11;
                                                            r32 = this;
                                                            interfaceC2318h = openInputStream;
                                                            i7 = createDocument;
                                                            throw th6;
                                                        }
                                                    } else {
                                                        throw new IllegalArgumentException("无法读取目标临时文件");
                                                    }
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    r32 = this;
                                                    r43 = openInputStream;
                                                    i7 = createDocument;
                                                    try {
                                                        throw th;
                                                    } finally {
                                                    }
                                                }
                                            } catch (Throwable th13) {
                                                th2 = th13;
                                                c1196q02 = this;
                                                r53 = createDocument;
                                                try {
                                                    DocumentsContract.deleteDocument(c1196q02.f6962a.getContentResolver(), r53);
                                                    throw th2;
                                                } catch (Throwable th14) {
                                                    AbstractC1793a0.m2985m(th14);
                                                    throw th2;
                                                }
                                            }
                                        } else {
                                            throw new IllegalArgumentException(str2);
                                        }
                                    } else {
                                        ?? createDocument2 = DocumentsContract.createDocument(context.getContentResolver(), buildDocumentUriUsingTree, m2108z(str8), str8);
                                        if (createDocument2 != 0) {
                                            try {
                                                ?? openOutputStream2 = context.getContentResolver().openOutputStream(createDocument2, "w");
                                                try {
                                                    if (openOutputStream2 != 0) {
                                                        fileInputStream = new FileInputStream(m2112F(c0800d9));
                                                        try {
                                                            r32.f2920h = this;
                                                            r32.f2921i = c0800d92;
                                                            r32.f2922j = createDocument2;
                                                            r32.f2923k = openOutputStream2;
                                                            r32.f2924l = fileInputStream;
                                                            r32.f2928p = 2;
                                                            byte[] bArr2 = new byte[1048576];
                                                            while (true) {
                                                                AbstractC3367j.m5097b(interfaceC2318h);
                                                                AbstractC0525d0.m1132j(interfaceC2318h);
                                                                int read2 = fileInputStream.read(bArr2);
                                                                if (read2 < 0) {
                                                                    break;
                                                                }
                                                                openOutputStream2.write(bArr2, 0, read2);
                                                            }
                                                            if (c1694m != enumC2465a) {
                                                                c1196q03 = this;
                                                                closeable2 = openOutputStream2;
                                                                comparable2 = createDocument2;
                                                                AbstractC2168e.m3526m(fileInputStream, null);
                                                                AbstractC2168e.m3526m(closeable2, null);
                                                                String str32 = "download_finalized task=" + AbstractC0444k.m955s0(c0800d92.f3340a, 8) + " mode=local_copy";
                                                                c1196q03.getClass();
                                                                m2106w(str32);
                                                                return comparable2;
                                                            }
                                                        } catch (Throwable th15) {
                                                            th5 = th15;
                                                            r32 = this;
                                                            interfaceC2318h = openOutputStream2;
                                                            i7 = createDocument2;
                                                            throw th5;
                                                        }
                                                    } else {
                                                        throw new IllegalArgumentException("无法写入下载目录");
                                                    }
                                                } catch (Throwable th16) {
                                                    th3 = th16;
                                                    r32 = this;
                                                    r42 = openOutputStream2;
                                                    i7 = createDocument2;
                                                    try {
                                                        throw th3;
                                                    } finally {
                                                    }
                                                }
                                            } catch (Throwable th17) {
                                                th4 = th17;
                                                c1196q0 = this;
                                                r52 = createDocument2;
                                                try {
                                                    DocumentsContract.deleteDocument(c1196q0.f6962a.getContentResolver(), r52);
                                                    throw th4;
                                                } catch (Throwable th18) {
                                                    AbstractC1793a0.m2985m(th18);
                                                    throw th4;
                                                }
                                            }
                                        } else {
                                            throw new IllegalArgumentException("无法在下载目录创建文件");
                                        }
                                    }
                                    return enumC2465a;
                                }
                                throw new IllegalStateException("请先设置下载目录");
                            }
                        }
                        if (i7 == 0) {
                        }
                    } catch (Throwable th19) {
                        th4 = th19;
                        c1196q0 = r32;
                        r52 = i7;
                    }
                } catch (Throwable th20) {
                    th3 = th20;
                    r32 = r32;
                    r42 = interfaceC2318h;
                    i7 = i7;
                    throw th3;
                }
            } catch (Throwable th21) {
                th2 = th21;
                c1196q02 = r32;
                r53 = i7;
            }
        } catch (Throwable th22) {
            th = th22;
            r32 = r32;
            r43 = interfaceC2318h;
            i7 = i7;
            throw th;
        }
        r32 = new C0759c0(this, abstractC2583c);
        interfaceC2318h = r32.f13999f;
        Object obj2 = r32.f2926n;
        i7 = r32.f2928p;
    }

    /* renamed from: s */
    public final File m2131s() {
        String str = Environment.DIRECTORY_DOWNLOADS;
        Context context = this.f6962a;
        File externalFilesDir = context.getExternalFilesDir(str);
        if (externalFilesDir == null) {
            externalFilesDir = new File(context.getFilesDir(), "downloads");
        }
        externalFilesDir.mkdirs();
        return externalFilesDir;
    }

    /* renamed from: t */
    public final File m2132t() {
        return new File(m2131s(), ".download-tasks.json");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x00e0  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1071m m2133u(C0800d9 c0800d9) {
        Object m2985m;
        JSONObject jSONObject;
        Object obj = null;
        try {
            jSONObject = new JSONObject(AbstractC3063j.m4737N(m2127n(c0800d9), AbstractC0434a.f1477a));
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (jSONObject.optInt("version") == 3) {
            JSONArray jSONArray = jSONObject.getJSONArray("segments");
            if (jSONArray.length() == c0800d9.f3356q) {
                C3879d m3513G = AbstractC2168e.m3513G(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(m3513G));
                Iterator it = m3513G.iterator();
                while (((C3878c) it).f18168g) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(((C3878c) it).nextInt());
                    arrayList.add(new C1102n(jSONObject2.getInt("worker"), new AtomicLong(jSONObject2.getLong("start")), new AtomicLong(jSONObject2.getLong("end")), new AtomicLong(jSONObject2.getLong("position"))));
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("completed");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                C3879d m3513G2 = AbstractC2168e.m3513G(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(m3513G2));
                Iterator it2 = m3513G2.iterator();
                while (((C3878c) it2).f18168g) {
                    JSONArray jSONArray2 = optJSONArray.getJSONArray(((C3878c) it2).nextInt());
                    arrayList2.add(new C3881f(jSONArray2.getLong(0), jSONArray2.getLong(1), false));
                }
                m2985m = new C1071m(arrayList, AbstractC1805m.m3036D0(arrayList2));
                if (!(m2985m instanceof C1689h)) {
                    obj = m2985m;
                }
                return (C1071m) obj;
            }
        }
        m2985m = null;
        if (!(m2985m instanceof C1689h)) {
        }
        return (C1071m) obj;
    }

    /* renamed from: y */
    public final File m2134y(C0800d9 c0800d9) {
        return new File(m2131s(), AbstractC0094y0.m185l(".", c0800d9.f3340a, ".ranges"));
    }
}
