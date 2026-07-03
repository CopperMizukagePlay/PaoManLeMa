package p039e5;

import android.content.Context;
import android.net.Network;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0450q;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0565q1;
import p032d6.C0568r1;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p054g6.C1715p;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p068i5.AbstractC2080d;
import p068i5.C2079c;
import p069i6.C2090c;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.yt */
/* loaded from: classes.dex */
public final class C1473yt {

    /* renamed from: a */
    public final C2090c f9792a;

    /* renamed from: b */
    public final AtomicBoolean f9793b;

    /* renamed from: c */
    public C0565q1 f9794c;

    /* renamed from: d */
    public final C1701c0 f9795d;

    /* renamed from: e */
    public final C1715p f9796e;

    public C1473yt() {
        C0568r1 m1124b = AbstractC0525d0.m1124b();
        C2325e c2325e = AbstractC0549l0.f1898a;
        this.f9792a = AbstractC0525d0.m1123a(AbstractC2080d.m3374B(m1124b, ExecutorC2324d.f13302g));
        this.f9793b = new AtomicBoolean(false);
        C1701c0 m2771b = AbstractC1719t.m2771b(new C1504zt((String) null, (String) null, (EnumC1163ot) null, 0, 0, (List) null, (String) null, (String) null, (EnumC1465yl) null, (String) null, 2047));
        this.f9795d = m2771b;
        this.f9796e = new C1715p(m2771b);
    }

    /* renamed from: a */
    public static final C1132nt m2430a(C1473yt c1473yt, int i7, String str, List list, int i8, int i9, String str2, String str3) {
        double d7;
        boolean z7;
        c1473yt.getClass();
        if (i8 > 0) {
            d7 = (i8 - i9) / i8;
        } else {
            d7 = 1.0d;
        }
        double d8 = d7;
        if (!AbstractC3367j.m5096a(str, str3) && !AbstractC3367j.m5096a(str, str2)) {
            z7 = false;
        } else {
            z7 = true;
        }
        return new C1132nt(i7, str, "", list, d8, "", "", z7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01a7, code lost:
    
        if (p024c6.AbstractC0444k.m937a0(r7) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01fd, code lost:
    
        if (p024c6.AbstractC0444k.m937a0(r7) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:
    
        if (p024c6.AbstractC0444k.m937a0(r7) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0143, code lost:
    
        if (p024c6.AbstractC0444k.m937a0(r7) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2431b(C1473yt c1473yt, String str, int i7, int i8, boolean z7, Network network, Context context, AbstractC2583c abstractC2583c) {
        C1318tt c1318tt;
        int i9;
        Object obj;
        boolean z8;
        Matcher matcher;
        C2079c m5798b;
        List list;
        String group;
        Double m964F;
        Double d7;
        double d8;
        Double m964F2;
        String obj2;
        String obj3;
        if (abstractC2583c instanceof C1318tt) {
            c1318tt = (C1318tt) abstractC2583c;
            int i10 = c1318tt.f7869l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1318tt.f7869l = i10 - Integer.MIN_VALUE;
                Object obj4 = c1318tt.f7867j;
                i9 = c1318tt.f7869l;
                if (i9 == 0) {
                    if (i9 == 1) {
                        boolean z9 = c1318tt.f7866i;
                        C1473yt c1473yt2 = c1318tt.f7865h;
                        AbstractC1793a0.m2972L(obj4);
                        z8 = z9;
                        c1473yt = c1473yt2;
                        obj = obj4;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj4);
                    c1318tt.f7865h = c1473yt;
                    c1318tt.f7866i = z7;
                    c1318tt.f7869l = 1;
                    C2325e c2325e = AbstractC0549l0.f1898a;
                    Object m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C1256rt(z7, i8, i7, str, context, network, c1473yt, (InterfaceC2313c) null), c1318tt);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m1122A == enumC2465a) {
                        return enumC2465a;
                    }
                    obj = m1122A;
                    z8 = z7;
                }
                String str2 = (String) obj;
                int i11 = 0;
                String str3 = null;
                String str4 = "";
                c1473yt.getClass();
                if (!z8) {
                    Pattern compile = Pattern.compile("(?i).*exceeded.*");
                    Pattern compile2 = Pattern.compile("(?i)from\\s+([^\\s]+)");
                    List m941e0 = AbstractC0444k.m941e0(str2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : m941e0) {
                        if (compile.matcher((String) obj5).find()) {
                            arrayList.add(obj5);
                        }
                    }
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj6 = arrayList.get(i12);
                        i12++;
                        Matcher matcher2 = compile2.matcher((String) obj6);
                        if (matcher2.find()) {
                            String group2 = matcher2.group(1);
                            if (group2 != null && (obj3 = AbstractC0444k.m956t0(group2).toString()) != null) {
                                str3 = AbstractC0444k.m959w0(obj3, ':');
                            }
                            if (str3 != null) {
                                str4 = str3;
                            }
                        }
                    }
                    List m941e02 = AbstractC0444k.m941e0(str2);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj7 : m941e02) {
                        if (!AbstractC0444k.m928R((String) obj7, "unreachable", true)) {
                            arrayList2.add(obj7);
                        }
                    }
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size2) {
                            break;
                        }
                        Object obj8 = arrayList2.get(i13);
                        i13++;
                        Matcher matcher3 = compile2.matcher((String) obj8);
                        if (matcher3.find()) {
                            String group3 = matcher3.group(1);
                            if (group3 != null && (obj2 = AbstractC0444k.m956t0(group3).toString()) != null) {
                                str3 = AbstractC0444k.m959w0(obj2, ':');
                            }
                            if (str3 != null) {
                                str4 = str3;
                            }
                        }
                    }
                    str4 = "*";
                    c1473yt.getClass();
                    matcher = Pattern.compile("(?i)time\\s*=\\s*([0-9.]+)\\s*ms").matcher(str2);
                    C2079c m5802f = AbstractC3784a.m5802f();
                    while (matcher.find()) {
                        String group4 = matcher.group(1);
                        if (group4 != null && (m964F2 = AbstractC0450q.m964F(group4)) != null) {
                            m5802f.add(Double.valueOf(m964F2.doubleValue()));
                        }
                    }
                    m5798b = AbstractC3784a.m5798b(m5802f);
                    if (m5798b.isEmpty()) {
                        list = AbstractC1805m.m3062z0(m5798b, 1);
                    } else {
                        Matcher matcher4 = Pattern.compile("(?i)rtt[^=]*=\\s*[0-9.]+/([0-9.]+)/").matcher(str2);
                        if (matcher4.find() && (group = matcher4.group(1)) != null && (m964F = AbstractC0450q.m964F(group)) != null) {
                            list = AbstractC3784a.m5817z(Double.valueOf(m964F.doubleValue()));
                        } else {
                            list = C1813u.f10860e;
                        }
                    }
                    d7 = (Double) AbstractC1805m.m3047k0(list);
                    if (d7 == null) {
                        d8 = d7.doubleValue();
                    } else {
                        d8 = 0.0d;
                    }
                    return new C1225qt(str4, d8, !str4.equals("*"));
                }
                Pattern compile3 = Pattern.compile("(?i).*exceeded.*");
                Pattern compile4 = Pattern.compile("(?i)from\\s+([\\d.]+)");
                List m941e03 = AbstractC0444k.m941e0(str2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj9 : m941e03) {
                    if (compile3.matcher((String) obj9).find()) {
                        arrayList3.add(obj9);
                    }
                }
                int size3 = arrayList3.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj10 = arrayList3.get(i14);
                    i14++;
                    Matcher matcher5 = compile4.matcher((String) obj10);
                    if (matcher5.find()) {
                        String group5 = matcher5.group(1);
                        if (group5 != null) {
                            str3 = AbstractC0444k.m956t0(group5).toString();
                        }
                        if (str3 != null) {
                            str4 = str3;
                        }
                    }
                }
                List m941e04 = AbstractC0444k.m941e0(str2);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj11 : m941e04) {
                    if (!AbstractC0444k.m928R((String) obj11, "unreachable", true)) {
                        arrayList4.add(obj11);
                    }
                }
                int size4 = arrayList4.size();
                while (true) {
                    if (i11 >= size4) {
                        break;
                    }
                    Object obj12 = arrayList4.get(i11);
                    i11++;
                    Matcher matcher6 = compile4.matcher((String) obj12);
                    if (matcher6.find()) {
                        String group6 = matcher6.group(1);
                        if (group6 != null) {
                            str3 = AbstractC0444k.m956t0(group6).toString();
                        }
                        if (str3 != null) {
                            str4 = str3;
                        }
                    }
                }
                c1473yt.getClass();
                matcher = Pattern.compile("(?i)time\\s*=\\s*([0-9.]+)\\s*ms").matcher(str2);
                C2079c m5802f2 = AbstractC3784a.m5802f();
                while (matcher.find()) {
                }
                m5798b = AbstractC3784a.m5798b(m5802f2);
                if (m5798b.isEmpty()) {
                }
                d7 = (Double) AbstractC1805m.m3047k0(list);
                if (d7 == null) {
                }
                return new C1225qt(str4, d8, !str4.equals("*"));
            }
        }
        c1318tt = new C1318tt(c1473yt, abstractC2583c);
        Object obj42 = c1318tt.f7867j;
        i9 = c1318tt.f7869l;
        if (i9 == 0) {
        }
        String str22 = (String) obj;
        int i112 = 0;
        String str32 = null;
        String str42 = "";
        c1473yt.getClass();
        if (!z8) {
        }
    }

    /* renamed from: c */
    public static final void m2432c(C1473yt c1473yt, String str) {
        C1701c0 c1701c0 = c1473yt.f9795d;
        c1701c0.m2752j(null, C1504zt.m2438a((C1504zt) c1701c0.getValue(), null, 0, null, null, str, 1791));
    }

    /* renamed from: d */
    public static ArrayList m2433d(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (C1132nt c1132nt : AbstractC1805m.m3061y0(list, new C0918h0(11))) {
            String str = c1132nt.f6405b;
            if (AbstractC3367j.m5096a(str, "*")) {
                arrayList.add(c1132nt);
            } else if (linkedHashSet.contains(str)) {
                if (c1132nt.f6411h) {
                    int size = arrayList.size();
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (i8 < size) {
                            Object obj = arrayList.get(i8);
                            i8++;
                            if (AbstractC3367j.m5096a(((C1132nt) obj).f6405b, str)) {
                                break;
                            }
                            i7++;
                        } else {
                            i7 = -1;
                            break;
                        }
                    }
                    if (i7 >= 0) {
                        arrayList.set(i7, C1132nt.m2012a((C1132nt) arrayList.get(i7), null, null, true, 127));
                    }
                }
            } else {
                linkedHashSet.add(str);
                arrayList.add(c1132nt);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final C1715p m2434e() {
        return this.f9796e;
    }

    /* renamed from: f */
    public final void m2435f() {
        this.f9793b.set(false);
        C0565q1 c0565q1 = this.f9794c;
        if (c0565q1 != null) {
            c0565q1.mo1114c(null);
        }
        this.f9794c = null;
        C1701c0 c1701c0 = this.f9795d;
        C1504zt m2438a = C1504zt.m2438a((C1504zt) c1701c0.getValue(), null, 0, null, null, "已停止", 1790);
        c1701c0.getClass();
        c1701c0.m2752j(null, m2438a);
    }
}
