package p039e5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p015b6.AbstractC0307n;
import p015b6.C0300g;
import p015b6.C0310q;
import p024c6.AbstractC0434a;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p024c6.C0442i;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p053g5.C1689h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p073j2.AbstractC2168e;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p098m5.AbstractC2583c;
import p099m6.C2622w;
import p099m6.C2623x;
import p135r5.AbstractC3063j;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rb */
/* loaded from: classes.dex */
public final class C1238rb {

    /* renamed from: a */
    public static final C1238rb f7307a = new Object();

    /* renamed from: b */
    public static final C2623x f7308b;

    /* renamed from: c */
    public static final C2623x f7309c;

    /* JADX WARN: Type inference failed for: r0v0, types: [e5.rb, java.lang.Object] */
    static {
        C2622w c2622w = new C2622w();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c2622w.m4180a(10L, timeUnit);
        c2622w.m4183d(30L, timeUnit);
        c2622w.m4185f(30L, timeUnit);
        c2622w.f14173h = true;
        f7308b = new C2623x(c2622w);
        C2622w c2622w2 = new C2622w();
        c2622w2.m4180a(15L, timeUnit);
        c2622w2.m4183d(120L, timeUnit);
        c2622w2.m4185f(120L, timeUnit);
        c2622w2.f14173h = true;
        f7309c = new C2623x(c2622w2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2161a(String str, File file, long j6, InterfaceC3279c interfaceC3279c, AbstractC2583c abstractC2583c) {
        C1083mb c1083mb;
        int i7;
        int i8;
        File file2;
        File file3;
        InterfaceC3279c interfaceC3279c2;
        C1238rb c1238rb = f7307a;
        if (abstractC2583c instanceof C1083mb) {
            C1083mb c1083mb2 = (C1083mb) abstractC2583c;
            int i9 = c1083mb2.f5885n;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1083mb2.f5885n = i9 - Integer.MIN_VALUE;
                c1083mb = c1083mb2;
                Object obj = c1083mb.f5884m;
                i7 = c1083mb.f5885n;
                if (i7 == 0) {
                    if (i7 == 1) {
                        int i10 = c1083mb.f5883l;
                        file2 = c1083mb.f5882k;
                        InterfaceC3279c interfaceC3279c3 = c1083mb.f5881j;
                        File file4 = c1083mb.f5880i;
                        C1238rb c1238rb2 = c1083mb.f5879h;
                        try {
                            AbstractC1793a0.m2972L(obj);
                            i8 = i10;
                            c1238rb = c1238rb2;
                            interfaceC3279c2 = interfaceC3279c3;
                            file3 = file4;
                        } catch (Throwable th) {
                            th = th;
                            AbstractC3063j.m4736M(file2);
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    File file5 = new File(file.getParentFile(), AbstractC2487d.m4043g(file.getName(), ".parts"));
                    if (file5.exists()) {
                        AbstractC3063j.m4736M(file5);
                    }
                    file5.mkdirs();
                    int i11 = (int) (j6 / 262144);
                    if (i11 < 1) {
                        i11 = 1;
                    }
                    if (8 > i11) {
                        i8 = i11;
                    } else {
                        i8 = 8;
                    }
                    try {
                        C1145ob c1145ob = new C1145ob(i8, j6 / i8, j6, file5, str, new AtomicLong(0L), interfaceC3279c, null);
                        c1083mb.f5879h = c1238rb;
                        file3 = file;
                        c1083mb.f5880i = file3;
                        interfaceC3279c2 = interfaceC3279c;
                        c1083mb.f5881j = interfaceC3279c2;
                        c1083mb.f5882k = file5;
                        c1083mb.f5883l = i8;
                        c1083mb.f5885n = 1;
                        Object m1130h = AbstractC0525d0.m1130h(c1145ob, c1083mb);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (m1130h == enumC2465a) {
                            return enumC2465a;
                        }
                        file2 = file5;
                    } catch (Throwable th2) {
                        th = th2;
                        file2 = file5;
                        AbstractC3063j.m4736M(file2);
                        throw th;
                    }
                }
                c1238rb.getClass();
                m2171l(file3, file2, i8);
                interfaceC3279c2.mo23f(new Integer(100));
                AbstractC3063j.m4736M(file2);
                return C1694m.f10482a;
            }
        }
        c1083mb = new AbstractC2583c(abstractC2583c);
        Object obj2 = c1083mb.f5884m;
        i7 = c1083mb.f5885n;
        if (i7 == 0) {
        }
        c1238rb.getClass();
        m2171l(file3, file2, i8);
        interfaceC3279c2.mo23f(new Integer(100));
        AbstractC3063j.m4736M(file2);
        return C1694m.f10482a;
    }

    /* renamed from: b */
    public static final JSONObject m2162b(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("assets");
        Object obj = null;
        if (optJSONArray == null) {
            return null;
        }
        C0300g c0300g = new C0300g(AbstractC0307n.m667F(AbstractC1805m.m3039c0(AbstractC2168e.m3513G(0, optJSONArray.length())), new C0310q(6, optJSONArray)));
        while (true) {
            if (!c0300g.hasNext()) {
                break;
            }
            Object next = c0300g.next();
            String optString = ((JSONObject) next).optString("name");
            AbstractC3367j.m5099d(optString, "optString(...)");
            if (AbstractC0451r.m965G(optString, ".apk", true)) {
                obj = next;
                break;
            }
        }
        return (JSONObject) obj;
    }

    /* renamed from: c */
    public static File m2163c(Context context, String str) {
        return new File(m2176r(context), m2175q(str));
    }

    /* renamed from: d */
    public static void m2164d(Context context) {
        C0961ib m2173n = m2173n(context);
        if (m2173n != null && !m2170k(m2173n.f4800a)) {
            m2165e(context);
        }
    }

    /* renamed from: e */
    public static void m2165e(Context context) {
        AbstractC3367j.m5100e(context, "context");
        File m2176r = m2176r(context);
        File[] listFiles = m2176r.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                AbstractC3367j.m5097b(file);
                AbstractC3063j.m4736M(file);
            }
        }
        m2176r.mkdirs();
    }

    /* renamed from: g */
    public static boolean m2166g(Context context, C1227r0 c1227r0) {
        Long l7;
        AbstractC3367j.m5100e(context, "context");
        AbstractC3367j.m5100e(c1227r0, "info");
        String m2175q = m2175q(c1227r0.f7197e);
        File m2163c = m2163c(context, m2175q);
        if (m2163c.isFile()) {
            C0961ib m2173n = m2173n(context);
            if (m2173n != null && (!m2173n.f4804e.equals(m2175q) || !m2172m(m2173n.f4800a).equals(m2172m(c1227r0.f7193a)) || !m2173n.f4803d.equals(c1227r0.f7196d))) {
                return false;
            }
            if (m2173n != null) {
                l7 = Long.valueOf(m2173n.f4806g);
            } else {
                l7 = null;
            }
            return m2177s(m2163c, l7);
        }
        return false;
    }

    /* renamed from: h */
    public static void m2167h(Context context, Uri uri) {
        AbstractC3367j.m5100e(context, "context");
        AbstractC3367j.m5100e(uri, "apkUri");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        intent.addFlags(268435456);
        intent.addFlags(1);
        context.startActivity(intent);
    }

    /* renamed from: i */
    public static void m2168i(Context context, C1227r0 c1227r0) {
        Long l7;
        File m2163c = m2163c(context, m2175q(c1227r0.f7197e));
        C0961ib m2173n = m2173n(context);
        if (m2173n != null) {
            l7 = Long.valueOf(m2173n.f4806g);
        } else {
            l7 = null;
        }
        if (m2177s(m2163c, l7)) {
            Uri m408d = FileProvider.m408d(context, context.getPackageName() + ".fileprovider", m2163c);
            AbstractC3367j.m5097b(m408d);
            m2167h(context, m408d);
            return;
        }
        throw new IllegalStateException("安装包不存在或已损坏，请重新下载");
    }

    /* renamed from: j */
    public static void m2169j(Context context, C1227r0 c1227r0) {
        AbstractC3367j.m5100e(context, "context");
        AbstractC3367j.m5100e(c1227r0, "info");
        String str = c1227r0.f7197e;
        C0961ib m2173n = m2173n(context);
        if (m2173n == null) {
            File m2176r = m2176r(context);
            String m2175q = m2175q(str);
            File[] listFiles = m2176r.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (!AbstractC3367j.m5096a(file.getName(), new File(m2176r(context), "pending_update.json").getName()) && !AbstractC3367j.m5096a(file.getName(), m2175q)) {
                        if (!AbstractC3367j.m5096a(file.getName(), m2175q + ".parts")) {
                            AbstractC3063j.m4736M(file);
                        }
                    }
                }
                return;
            }
            return;
        }
        boolean equals = m2172m(m2173n.f4800a).equals(m2172m(c1227r0.f7193a));
        boolean equals2 = m2173n.f4803d.equals(c1227r0.f7196d);
        boolean m5096a = AbstractC3367j.m5096a(m2175q(m2173n.f4804e), m2175q(str));
        if (equals && equals2 && m5096a) {
            return;
        }
        m2165e(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2170k(String str) {
        Object obj;
        Object obj2;
        String m2172m = m2172m(str);
        String m2172m2 = m2172m("V5.0.1");
        int i7 = 26;
        List m668G = AbstractC0307n.m668G(AbstractC0307n.m667F(C0442i.m926b(new C0442i("\\d+"), m2172m), new C1263s5(i7)));
        List m668G2 = AbstractC0307n.m668G(AbstractC0307n.m667F(C0442i.m926b(new C0442i("\\d+"), m2172m2), new C1263s5(i7)));
        int max = Math.max(m668G.size(), m668G2.size());
        for (int i8 = 0; i8 < max; i8++) {
            if (i8 >= 0 && i8 < m668G.size()) {
                obj = m668G.get(i8);
            } else {
                obj = 0;
            }
            int intValue = ((Number) obj).intValue();
            if (i8 >= 0 && i8 < m668G2.size()) {
                obj2 = m668G2.get(i8);
            } else {
                obj2 = 0;
            }
            int intValue2 = ((Number) obj2).intValue();
            if (intValue != intValue2) {
                if (intValue <= intValue2) {
                    return false;
                }
                return true;
            }
        }
        if (m2172m.equals(m2172m2) || AbstractC0444k.m928R(m2172m, "beta", true)) {
        }
    }

    /* renamed from: l */
    public static void m2171l(File file, File file2, int i7) {
        if (file.exists()) {
            file.delete();
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            randomAccessFile.setLength(0L);
            for (int i8 = 0; i8 < i7; i8++) {
                File file3 = new File(file2, "part-" + i8);
                if (file3.isFile()) {
                    FileInputStream fileInputStream = new FileInputStream(file3);
                    try {
                        byte[] bArr = new byte[65536];
                        for (int read = fileInputStream.read(bArr); read >= 0; read = fileInputStream.read(bArr)) {
                            if (read > 0) {
                                randomAccessFile.write(bArr, 0, read);
                            }
                        }
                        fileInputStream.close();
                    } finally {
                    }
                } else {
                    throw new IllegalStateException(("缺少下载分片：part-" + i8).toString());
                }
            }
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2168e.m3526m(randomAccessFile, th);
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public static String m2172m(String str) {
        return AbstractC0444k.m943g0(AbstractC0444k.m943g0(AbstractC0444k.m943g0(AbstractC0444k.m956t0(str).toString(), "refs/tags/"), "v"), "V");
    }

    /* renamed from: n */
    public static C0961ib m2173n(Context context) {
        Object m2985m;
        File file = new File(m2176r(context), "pending_update.json");
        Object obj = null;
        if (!file.isFile()) {
            return null;
        }
        try {
            m2985m = AbstractC1249rm.m2255d0(new JSONObject(AbstractC3063j.m4737N(file, AbstractC0434a.f1477a)));
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (!(m2985m instanceof C1689h)) {
            obj = m2985m;
        }
        return (C0961ib) obj;
    }

    /* renamed from: o */
    public static void m2174o(long j6, long j7, InterfaceC3279c interfaceC3279c) {
        if (j7 <= 0) {
            return;
        }
        interfaceC3279c.mo23f(Integer.valueOf(AbstractC2168e.m3530q((int) ((j6 * 100) / j7), 0, 99)));
    }

    /* renamed from: q */
    public static String m2175q(String str) {
        Pattern compile = Pattern.compile("[^A-Za-z0-9._-]");
        AbstractC3367j.m5099d(compile, "compile(...)");
        AbstractC3367j.m5100e(str, "input");
        String replaceAll = compile.matcher(str).replaceAll("_");
        AbstractC3367j.m5099d(replaceAll, "replaceAll(...)");
        if (AbstractC0451r.m965G(replaceAll, ".apk", true)) {
            return replaceAll;
        }
        return replaceAll.concat(".apk");
    }

    /* renamed from: r */
    public static File m2176r(Context context) {
        File file = new File(context.getCacheDir(), "updates");
        file.mkdirs();
        return file;
    }

    /* renamed from: s */
    public static boolean m2177s(File file, Long l7) {
        Object m2985m;
        boolean z7 = false;
        if (!file.isFile() || file.length() < 1024 || (l7 != null && l7.longValue() > 0 && file.length() != l7.longValue())) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4];
                if (fileInputStream.read(bArr) == 4 && bArr[0] == 80) {
                    if (bArr[1] == 75) {
                        z7 = true;
                    }
                }
                fileInputStream.close();
                m2985m = Boolean.valueOf(z7);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2168e.m3526m(fileInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            m2985m = AbstractC1793a0.m2985m(th3);
        }
        Object obj = Boolean.FALSE;
        if (m2985m instanceof C1689h) {
            m2985m = obj;
        }
        return ((Boolean) m2985m).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2178f(Context context, C1227r0 c1227r0, boolean z7, C1215qj c1215qj, AbstractC2583c abstractC2583c) {
        C1021kb c1021kb;
        int i7;
        if (abstractC2583c instanceof C1021kb) {
            c1021kb = (C1021kb) abstractC2583c;
            int i8 = c1021kb.f5258j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1021kb.f5258j = i8 - Integer.MIN_VALUE;
                Object obj = c1021kb.f5256h;
                i7 = c1021kb.f5258j;
                if (i7 == 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2325e c2325e = AbstractC0549l0.f1898a;
                    ExecutorC2324d executorC2324d = ExecutorC2324d.f13302g;
                    C1052lb c1052lb = new C1052lb(context, c1227r0, z7, c1215qj, null);
                    c1021kb.f5258j = 1;
                    obj = AbstractC0525d0.m1122A(executorC2324d, c1052lb, c1021kb);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (obj == enumC2465a) {
                        return enumC2465a;
                    }
                }
                AbstractC3367j.m5099d(obj, "withContext(...)");
                return obj;
            }
        }
        c1021kb = new C1021kb(this, abstractC2583c);
        Object obj2 = c1021kb.f5256h;
        i7 = c1021kb.f5258j;
        if (i7 == 0) {
        }
        AbstractC3367j.m5099d(obj2, "withContext(...)");
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2179p(AbstractC2583c abstractC2583c) {
        C1207qb c1207qb;
        int i7;
        InterfaceC1351v0 interfaceC1351v0;
        if (abstractC2583c instanceof C1207qb) {
            c1207qb = (C1207qb) abstractC2583c;
            int i8 = c1207qb.f7076j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1207qb.f7076j = i8 - Integer.MIN_VALUE;
                Object obj = c1207qb.f7074h;
                i7 = c1207qb.f7076j;
                if (i7 == 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c1207qb.f7076j = 1;
                    C2325e c2325e = AbstractC0549l0.f1898a;
                    obj = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0990jb(2, null, 0), c1207qb);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (obj == enumC2465a) {
                        return enumC2465a;
                    }
                }
                interfaceC1351v0 = (InterfaceC1351v0) obj;
                if (!(interfaceC1351v0 instanceof C1258s0)) {
                    return ((C1258s0) interfaceC1351v0).f7455a;
                }
                if (!(interfaceC1351v0 instanceof C1320u0)) {
                    if (interfaceC1351v0 instanceof C1289t0) {
                        throw new IllegalStateException(((C1289t0) interfaceC1351v0).f7711a.toString());
                    }
                    throw new RuntimeException();
                }
                throw new IllegalStateException("当前已是最新版本：V5.0.1");
            }
        }
        c1207qb = new C1207qb(this, abstractC2583c);
        Object obj2 = c1207qb.f7074h;
        i7 = c1207qb.f7076j;
        if (i7 == 0) {
        }
        interfaceC1351v0 = (InterfaceC1351v0) obj2;
        if (!(interfaceC1351v0 instanceof C1258s0)) {
        }
    }
}
