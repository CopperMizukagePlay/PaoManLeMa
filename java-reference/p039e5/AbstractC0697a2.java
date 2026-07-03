package p039e5;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0434a;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p053g5.C1690i;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p060h5.C1803k;
import p060h5.C1813u;
import p092m.AbstractC2487d;
import p135r5.AbstractC3063j;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.a2 */
/* loaded from: classes.dex */
public abstract class AbstractC0697a2 {

    /* renamed from: a */
    public static final AtomicBoolean f2310a = new AtomicBoolean(false);

    /* renamed from: b */
    public static final Object f2311b = new Object();

    /* renamed from: c */
    public static final C1803k f2312c = new C1803k(80);

    /* renamed from: a */
    public static void m1488a(String str) {
        AbstractC3367j.m5100e(str, "message");
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(new Date(System.currentTimeMillis()));
        AbstractC3367j.m5099d(format, "format(...)");
        String m4044h = AbstractC2487d.m4044h(format, " ", str);
        synchronized (f2311b) {
            try {
                C1803k c1803k = f2312c;
                if (c1803k.f10858g >= 80) {
                    c1803k.removeFirst();
                }
                c1803k.addLast(m4044h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static String m1489b(Context context) {
        AbstractC3367j.m5100e(context, "context");
        List m1490c = m1490c(context);
        if (m1490c.isEmpty()) {
            return "暂无崩溃日志";
        }
        StringBuilder sb = new StringBuilder();
        int i7 = 0;
        for (Object obj : m1490c) {
            int i8 = i7 + 1;
            if (i7 >= 0) {
                C1476z1 c1476z1 = (C1476z1) obj;
                if (i7 > 0) {
                    sb.append('\n');
                    sb.append(AbstractC0451r.m968J("=", 72));
                    sb.append("\n\n");
                }
                sb.append(m1491d(c1476z1.f9812a));
                i7 = i8;
            } else {
                AbstractC1806n.m3072T();
                throw null;
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static List m1490c(Context context) {
        ArrayList arrayList;
        AbstractC3367j.m5100e(context, "context");
        File file = new File(context.getFilesDir(), "crash_logs");
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                ArrayList arrayList2 = new ArrayList();
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        String name = file2.getName();
                        AbstractC3367j.m5099d(name, "getName(...)");
                        if (AbstractC0451r.m971M(name, "crash_", false)) {
                            String name2 = file2.getName();
                            AbstractC3367j.m5099d(name2, "getName(...)");
                            if (AbstractC0451r.m965G(name2, ".log", false)) {
                                arrayList2.add(file2);
                            }
                        }
                    }
                }
                List<File> m3061y0 = AbstractC1805m.m3061y0(arrayList2, new C0918h0(2));
                arrayList = new ArrayList(AbstractC1807o.m3073U(m3061y0));
                for (File file3 : m3061y0) {
                    AbstractC3367j.m5097b(file3);
                    long lastModified = file3.lastModified();
                    String name3 = file3.getName();
                    AbstractC3367j.m5099d(name3, "getName(...)");
                    arrayList.add(new C1476z1(file3, lastModified, AbstractC0444k.m944h0(AbstractC0444k.m943g0(name3, "crash_"), ".log")));
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return C1813u.f10860e;
    }

    /* renamed from: d */
    public static String m1491d(File file) {
        Object m2985m;
        try {
            m2985m = AbstractC3063j.m4737N(file, AbstractC0434a.f1477a);
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        Throwable m2747a = C1690i.m2747a(m2985m);
        if (m2747a != null) {
            m2985m = AbstractC2487d.m4058v("读取失败: ", m2747a.getMessage());
        }
        return (String) m2985m;
    }

    /* renamed from: e */
    public static void m1492e(Context context, Thread thread, Throwable th) {
        List list;
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", locale).format(new Date(currentTimeMillis));
        AbstractC3367j.m5099d(format, "format(...)");
        File file = new File(new File(context.getFilesDir(), "crash_logs"), AbstractC0094y0.m185l("crash_", format, ".log"));
        StringBuilder sb = new StringBuilder("=== HBCS Crash Report ===\n");
        String format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", locale).format(new Date(currentTimeMillis));
        AbstractC3367j.m5099d(format2, "format(...)");
        sb.append("time=".concat(format2));
        sb.append("\napp=V5.0.1 (501)\n");
        sb.append("package=" + context.getPackageName());
        sb.append("\ndebug=false\n\n--- Device ---\n");
        sb.append("manufacturer=" + Build.MANUFACTURER);
        sb.append('\n');
        sb.append("brand=" + Build.BRAND);
        sb.append('\n');
        sb.append("model=" + Build.MODEL);
        sb.append('\n');
        sb.append("device=" + Build.DEVICE);
        sb.append('\n');
        sb.append("android=" + Build.VERSION.RELEASE + " (sdk=" + Build.VERSION.SDK_INT + ")");
        sb.append('\n');
        String[] strArr = Build.SUPPORTED_ABIS;
        AbstractC3367j.m5099d(strArr, "SUPPORTED_ABIS");
        sb.append("abi=" + AbstractC1804l.m3029V(63, strArr));
        sb.append("\n\n--- Thread ---\n");
        sb.append("name=" + thread.getName());
        sb.append('\n');
        sb.append("id=" + thread.getId());
        sb.append('\n');
        sb.append("priority=" + thread.getPriority());
        sb.append("\n\n--- Exception ---\n");
        sb.append(th.getClass().getName() + ": " + th.getMessage());
        sb.append("\n\n--- Stack Trace ---\n");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            stringWriter.append((CharSequence) "\nCaused by: ");
            cause.printStackTrace(new PrintWriter(stringWriter));
        }
        String stringWriter2 = stringWriter.toString();
        AbstractC3367j.m5099d(stringWriter2, "toString(...)");
        sb.append(AbstractC0444k.m958v0(stringWriter2).toString());
        sb.append("\n\n--- Breadcrumbs ---\n");
        synchronized (f2311b) {
            try {
                C1803k c1803k = f2312c;
                if (c1803k.isEmpty()) {
                    sb.append("(empty)");
                    sb.append('\n');
                } else {
                    Iterator it = c1803k.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append('\n');
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        String sb2 = sb.toString();
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        AbstractC3063j.m4738O(file, sb2, AbstractC0434a.f1477a);
        File[] listFiles = new File(context.getFilesDir(), "crash_logs").listFiles();
        if (listFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    String name = file2.getName();
                    AbstractC3367j.m5099d(name, "getName(...)");
                    if (AbstractC0451r.m971M(name, "crash_", false)) {
                        arrayList.add(file2);
                    }
                }
            }
            list = AbstractC1805m.m3061y0(arrayList, new C0918h0(3));
        } else {
            list = null;
        }
        if (list == null) {
            list = C1813u.f10860e;
        }
        Iterator it2 = AbstractC1805m.m3043g0(list, 20).iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
        context.getSharedPreferences("crash_log_prefs", 0).edit().putBoolean("pending_crash", true).apply();
        Log.e("HBCS-Crash", "crash saved: " + file.getAbsolutePath() + "\n" + sb2);
    }
}
