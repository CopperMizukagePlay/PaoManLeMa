package p039e5;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p015b6.AbstractC0307n;
import p015b6.C0295b;
import p015b6.C0301h;
import p015b6.C0302i;
import p024c6.AbstractC0434a;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p024c6.C0442i;
import p053g5.C1689h;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p066i3.AbstractC2067b;
import p135r5.AbstractC3063j;
import p153u0.C3343j;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.in */
/* loaded from: classes.dex */
public abstract class AbstractC0972in {

    /* renamed from: a */
    public static final C0442i f4930a = new C0442i("dev\\s+(\\S+)");

    /* renamed from: b */
    public static final C0442i f4931b = new C0442i("^\\d+:\\s+([^:]+):\\s+<([^>]+)>");

    /* renamed from: c */
    public static final C0442i f4932c = new C0442i("backlog\\s+(\\d+)b");

    /* renamed from: d */
    public static final C0442i f4933d = new C0442i("backlog\\s+\\d+b\\s+\\d+p\\s+requeues\\s+(\\d+)");

    /* renamed from: e */
    public static final C0442i f4934e = new C0442i("dropped\\s+(\\d+),\\s+overlimits\\s+\\d+\\s+requeues\\s+(\\d+)");

    /* renamed from: a */
    public static boolean m1603a() {
        if (m1606d() >= 0) {
            List m1604b = m1604b();
            if (!m1604b.isEmpty()) {
                Iterator it = m1604b.iterator();
                while (it.hasNext()) {
                    if (m1605c((String) it.next(), "tx_dropped") != null) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public static List m1604b() {
        List list;
        String m1608f = m1608f("ip -o link show 2>/dev/null");
        C1813u c1813u = C1813u.f10860e;
        if (m1608f != null) {
            C0301h m667F = AbstractC0307n.m667F(AbstractC0444k.m940d0(m1608f), new C0866fc(17));
            C0295b c0295b = new C0295b(m667F.iterator(), new C3343j(0));
            if (!c0295b.hasNext()) {
                list = c1813u;
            } else {
                Object next = c0295b.next();
                if (!c0295b.hasNext()) {
                    list = AbstractC3784a.m5817z(next);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (c0295b.hasNext()) {
                        arrayList.add(c0295b.next());
                    }
                    list = arrayList;
                }
            }
        } else {
            list = null;
        }
        if (list == null) {
            return c1813u;
        }
        return list;
    }

    /* renamed from: c */
    public static Long m1605c(String str, String str2) {
        String obj;
        String m1607e = m1607e("/sys/class/net/" + str + "/statistics/" + str2);
        if (m1607e != null && (obj = AbstractC0444k.m956t0(m1607e).toString()) != null) {
            return AbstractC0451r.m974P(obj);
        }
        return null;
    }

    /* renamed from: d */
    public static long m1606d() {
        Object obj;
        String str;
        Long m974P;
        String m1607e = m1607e("/proc/net/snmp");
        if (m1607e != null) {
            C0301h c0301h = new C0301h(new C0302i(AbstractC0444k.m940d0(m1607e), new C0866fc(18), 1), true, new C0866fc(19));
            C0866fc c0866fc = new C0866fc(20);
            Iterator it = c0301h.iterator();
            while (true) {
                obj = null;
                Character ch = null;
                if (!it.hasNext()) {
                    break;
                }
                Object mo23f = c0866fc.mo23f(it.next());
                List list = (List) mo23f;
                if (list.size() >= 14) {
                    CharSequence charSequence = (CharSequence) list.get(1);
                    AbstractC3367j.m5100e(charSequence, "<this>");
                    if (charSequence.length() != 0) {
                        ch = Character.valueOf(charSequence.charAt(0));
                    }
                    if (ch != null && Character.isDigit(ch.charValue())) {
                        obj = mo23f;
                        break;
                    }
                }
            }
            List list2 = (List) obj;
            if (list2 != null && (str = (String) AbstractC1805m.m3048l0(13, list2)) != null && (m974P = AbstractC0451r.m974P(str)) != null) {
                return m974P.longValue();
            }
            return -1L;
        }
        return -1L;
    }

    /* renamed from: e */
    public static String m1607e(String str) {
        Object m2985m;
        Object obj = null;
        try {
            File file = new File(str);
            if (!file.canRead()) {
                file = null;
            }
            if (file != null) {
                m2985m = AbstractC3063j.m4737N(file, AbstractC0434a.f1477a);
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m1608f(String str) {
        Object m2985m;
        Process exec;
        boolean waitFor;
        Object obj = null;
        try {
            exec = Runtime.getRuntime().exec(new String[]{"sh", "-c", str});
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            waitFor = exec.waitFor(2500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            m2985m = AbstractC1793a0.m2985m(th);
        }
        if (!waitFor) {
            exec.destroyForcibly();
        } else if (exec.exitValue() == 0) {
            InputStream inputStream = exec.getInputStream();
            AbstractC3367j.m5099d(inputStream, "getInputStream(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, AbstractC0434a.f1477a), 8192);
            try {
                String m3296u = AbstractC2067b.m3296u(bufferedReader);
                bufferedReader.close();
                m2985m = AbstractC0444k.m956t0(m3296u).toString();
                if (!(m2985m instanceof C1689h)) {
                    obj = m2985m;
                }
                return (String) obj;
            } finally {
            }
        }
        m2985m = null;
        if (!(m2985m instanceof C1689h)) {
        }
        return (String) obj;
    }
}
