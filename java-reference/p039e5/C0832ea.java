package p039e5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p024c6.C0437d;
import p024c6.C0438e;
import p024c6.C0439f;
import p024c6.C0442i;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1687f;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1817y;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ea */
/* loaded from: classes.dex */
public final class C0832ea extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f3666i;

    /* renamed from: j */
    public final /* synthetic */ List f3667j;

    /* renamed from: k */
    public int f3668k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0832ea(List list, int i7, InterfaceC2313c interfaceC2313c, int i8) {
        super(2, interfaceC2313c);
        this.f3666i = i8;
        this.f3667j = list;
        this.f3668k = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f3666i) {
            case 0:
                return ((C0832ea) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                return ((C0832ea) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C0832ea) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f3666i) {
            case 0:
                return new C0832ea(this.f3667j, this.f3668k, interfaceC2313c, 0);
            case 1:
                return new C0832ea(this.f3667j, this.f3668k, interfaceC2313c, 1);
            default:
                return new C0832ea(this.f3667j, interfaceC2313c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x0459, code lost:
    
        if (r3.isEmpty() == false) goto L204;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x044c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x06d1 -> B:7:0x06d4). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        long j6;
        List list;
        long j7;
        Map map;
        List<C0718an> list2;
        double d7;
        double d8;
        ConcurrentHashMap concurrentHashMap;
        Map map2;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        EnumC1466ym enumC1466ym;
        C0718an c0718an;
        C0941hn c0941hn;
        Long m974P;
        Long m1605c;
        C1687f c1687f;
        int i7;
        boolean z7;
        Object obj2;
        C0718an c0718an2;
        String str;
        String str2;
        String str3;
        String str4;
        EnumC1070lt enumC1070lt;
        EnumC1070lt enumC1070lt2;
        C1687f c1687f2;
        String obj3;
        String str5;
        String str6;
        String obj4;
        switch (this.f3666i) {
            case 0:
                AbstractC1793a0.m2972L(obj);
                return AbstractC1249rm.m2227K(this.f3668k, this.f3667j);
            case 1:
                AbstractC1793a0.m2972L(obj);
                return AbstractC1249rm.m2227K(this.f3668k, this.f3667j);
            default:
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                int i8 = this.f3668k;
                int i9 = 1;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        int i10 = 1;
                        i9 = i10;
                        if (!AbstractC0909gn.f4319c) {
                            C0442i c0442i = AbstractC0972in.f4930a;
                            List<C1248rl> list3 = this.f3667j;
                            List m1604b = AbstractC0972in.m1604b();
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                String str7 = ((C1248rl) it.next()).f7394e;
                                if (str7 != null && (obj4 = AbstractC0444k.m956t0(str7).toString()) != null && !AbstractC0444k.m937a0(obj4)) {
                                    str6 = obj4;
                                } else {
                                    str6 = null;
                                }
                                if (str6 != null) {
                                    arrayList.add(str6);
                                }
                            }
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj5 = arrayList.get(i11);
                                i11++;
                                linkedHashSet.add((String) obj5);
                            }
                            Iterator it2 = m1604b.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add((String) it2.next());
                            }
                            if (linkedHashSet.isEmpty()) {
                                String m1608f = AbstractC0972in.m1608f("ip route show default 2>/dev/null");
                                if (m1608f == null) {
                                    str5 = null;
                                } else {
                                    C0439f m927a = AbstractC0972in.f4930a.m927a(m1608f);
                                    if (m927a == null || (str5 = (String) AbstractC1805m.m3048l0(i9, m927a.m923a())) == null) {
                                        str5 = (String) AbstractC1805m.m3047k0(AbstractC0972in.m1604b());
                                    }
                                }
                                if (str5 != null) {
                                    linkedHashSet.add(str5);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (C1248rl c1248rl : list3) {
                                String str8 = c1248rl.f7394e;
                                if (str8 != null && (obj3 = AbstractC0444k.m956t0(str8).toString()) != null) {
                                    if (AbstractC0444k.m937a0(obj3)) {
                                        obj3 = null;
                                    }
                                    if (obj3 != null) {
                                        c1687f2 = new C1687f(obj3, c1248rl);
                                        if (c1687f2 == null) {
                                            arrayList2.add(c1687f2);
                                        }
                                    }
                                }
                                c1687f2 = null;
                                if (c1687f2 == null) {
                                }
                            }
                            Map m3086R = AbstractC1817y.m3086R(arrayList2);
                            ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(linkedHashSet));
                            for (String str9 : linkedHashSet) {
                                C1248rl c1248rl2 = (C1248rl) m3086R.get(str9);
                                if (c1248rl2 == null || (str2 = c1248rl2.f7390a) == null) {
                                    str2 = str9;
                                }
                                Map map3 = m3086R;
                                if (c1248rl2 == null || (str3 = c1248rl2.f7391b) == null) {
                                    if (!AbstractC0451r.m971M(str9, "rmnet", false) && !AbstractC0451r.m971M(str9, "ccmni", false) && !AbstractC0451r.m971M(str9, "wwan", false) && !AbstractC0451r.m971M(str9, "seth", false)) {
                                        if (AbstractC0451r.m971M(str9, "wlan", false)) {
                                            str4 = "WiFi";
                                        } else if (AbstractC0451r.m971M(str9, "eth", false)) {
                                            str4 = "以太网";
                                        } else if (AbstractC0451r.m971M(str9, "usb", false)) {
                                            str3 = "USB";
                                        } else {
                                            str3 = str9;
                                        }
                                        str3 = str4;
                                    } else {
                                        str3 = "移动数据";
                                    }
                                }
                                if (c1248rl2 == null || (enumC1070lt2 = c1248rl2.f7393d) == null) {
                                    if (!AbstractC0451r.m971M(str9, "rmnet", false) && !AbstractC0451r.m971M(str9, "ccmni", false) && !AbstractC0451r.m971M(str9, "wwan", false) && !AbstractC0451r.m971M(str9, "seth", false)) {
                                        if (AbstractC0451r.m971M(str9, "wlan", false)) {
                                            enumC1070lt = EnumC1070lt.f5744e;
                                        } else if (AbstractC0451r.m971M(str9, "eth", false)) {
                                            enumC1070lt = EnumC1070lt.f5746g;
                                        } else if (AbstractC0451r.m971M(str9, "usb", false)) {
                                            enumC1070lt = EnumC1070lt.f5747h;
                                        } else {
                                            enumC1070lt = EnumC1070lt.f5748i;
                                        }
                                    } else {
                                        enumC1070lt = EnumC1070lt.f5745f;
                                    }
                                    enumC1070lt2 = enumC1070lt;
                                }
                                arrayList3.add(new C1435xm(str2, str3, str9, enumC1070lt2));
                                m3086R = map3;
                            }
                            C0442i c0442i2 = AbstractC0972in.f4930a;
                            ConcurrentHashMap concurrentHashMap2 = AbstractC0909gn.f4321e;
                            AbstractC3367j.m5100e(concurrentHashMap2, "previousByInterface");
                            if (!AbstractC0972in.m1603a()) {
                                list2 = AbstractC3784a.m5817z(new C0718an(0L, null, null, 0.0d, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, false, "无法读取本机队列指标（/proc 或 sysfs 被系统拒绝）", 2097151));
                            } else if (arrayList3.isEmpty()) {
                                list2 = AbstractC3784a.m5817z(new C0718an(0L, null, null, 0.0d, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, true, "未找到可监测网卡（WiFi/移动数据/以太网）", 2097151));
                            } else {
                                long m1606d = AbstractC0972in.m1606d();
                                String m1607e = AbstractC0972in.m1607e("/proc/net/softnet_stat");
                                long j13 = 0;
                                int i12 = 2;
                                if (m1607e == null) {
                                    j6 = -1;
                                } else {
                                    Iterator it3 = AbstractC0444k.m940d0(m1607e).iterator();
                                    j6 = 0;
                                    while (true) {
                                        C0437d c0437d = (C0437d) it3;
                                        if (c0437d.hasNext()) {
                                            String obj6 = AbstractC0444k.m956t0((String) c0437d.next()).toString();
                                            Pattern compile = Pattern.compile("\\s+");
                                            AbstractC3367j.m5099d(compile, "compile(...)");
                                            AbstractC3367j.m5100e(obj6, "input");
                                            AbstractC0444k.m946j0(0);
                                            Matcher matcher = compile.matcher(obj6);
                                            if (!matcher.find()) {
                                                list = AbstractC3784a.m5817z(obj6.toString());
                                            } else {
                                                ArrayList arrayList4 = new ArrayList(10);
                                                int i13 = 0;
                                                do {
                                                    arrayList4.add(obj6.subSequence(i13, matcher.start()).toString());
                                                    i13 = matcher.end();
                                                } while (matcher.find());
                                                arrayList4.add(obj6.subSequence(i13, obj6.length()).toString());
                                                list = arrayList4;
                                            }
                                            if (list.size() >= 3) {
                                                Long m975Q = AbstractC0451r.m975Q((String) list.get(2), 16);
                                                if (m975Q != null) {
                                                    j7 = m975Q.longValue();
                                                } else {
                                                    j7 = 0;
                                                }
                                                j6 += j7;
                                            }
                                        }
                                    }
                                }
                                long j14 = j6;
                                if (m1606d >= 0 && j14 >= 0) {
                                    ArrayList arrayList5 = new ArrayList();
                                    int size2 = arrayList3.size();
                                    int i14 = 0;
                                    while (i14 < size2) {
                                        Object obj7 = arrayList3.get(i14);
                                        i14++;
                                        C1435xm c1435xm = (C1435xm) obj7;
                                        String str10 = c1435xm.f8844c;
                                        String m1608f2 = AbstractC0972in.m1608f("tc -s qdisc show dev " + str10 + " 2>/dev/null | head -n 3");
                                        if (m1608f2 == null) {
                                            c0941hn = null;
                                        } else {
                                            Iterator it4 = AbstractC0444k.m940d0(m1608f2).iterator();
                                            long j15 = j13;
                                            long j16 = j15;
                                            long j17 = j16;
                                            while (true) {
                                                C0437d c0437d2 = (C0437d) it4;
                                                if (c0437d2.hasNext()) {
                                                    String str11 = (String) c0437d2.next();
                                                    if (AbstractC0444k.m928R(str11, "dropped", false) && AbstractC0444k.m928R(str11, "requeues", false) && AbstractC0444k.m928R(str11, "Sent", false)) {
                                                        C0439f m927a2 = AbstractC0972in.f4934e.m927a(str11);
                                                        if (m927a2 != null) {
                                                            Long m974P2 = AbstractC0451r.m974P((String) ((C0438e) m927a2.m923a()).get(1));
                                                            if (m974P2 != null) {
                                                                j16 = m974P2.longValue();
                                                            } else {
                                                                j16 = j13;
                                                            }
                                                            Long m974P3 = AbstractC0451r.m974P((String) ((C0438e) m927a2.m923a()).get(i12));
                                                            if (m974P3 != null) {
                                                                j17 = m974P3.longValue();
                                                            } else {
                                                                j17 = j13;
                                                            }
                                                        }
                                                    } else if (AbstractC0451r.m971M(AbstractC0444k.m960x0(str11).toString(), "backlog ", false)) {
                                                        C0439f m927a3 = AbstractC0972in.f4932c.m927a(str11);
                                                        if (m927a3 != null) {
                                                            Long m974P4 = AbstractC0451r.m974P((String) ((C0438e) m927a3.m923a()).get(1));
                                                            if (m974P4 != null) {
                                                                j15 = m974P4.longValue();
                                                            } else {
                                                                j15 = j13;
                                                            }
                                                        }
                                                        C0439f m927a4 = AbstractC0972in.f4933d.m927a(str11);
                                                        if (m927a4 != null && (m974P = AbstractC0451r.m974P((String) ((C0438e) m927a4.m923a()).get(1))) != null) {
                                                            j17 = m974P.longValue();
                                                        }
                                                    }
                                                    i12 = 2;
                                                } else {
                                                    c0941hn = new C0941hn(j15, j16, j17);
                                                }
                                            }
                                        }
                                        if (c0941hn != null && (m1605c = AbstractC0972in.m1605c(str10, "tx_dropped")) != null) {
                                            long longValue = m1605c.longValue();
                                            Long m1605c2 = AbstractC0972in.m1605c(str10, "rx_dropped");
                                            if (m1605c2 != null) {
                                                c1687f = new C1687f(str10, new C0814dn(str10, c1435xm.f8843b, c0941hn.f4621a, c0941hn.f4622b, c0941hn.f4623c, longValue, m1605c2.longValue(), m1606d, j14));
                                                if (c1687f == null) {
                                                    arrayList5.add(c1687f);
                                                }
                                                j13 = 0;
                                                i12 = 2;
                                            }
                                        }
                                        c1687f = null;
                                        if (c1687f == null) {
                                        }
                                        j13 = 0;
                                        i12 = 2;
                                    }
                                    map = AbstractC1817y.m3086R(arrayList5);
                                    break;
                                }
                                map = null;
                                if (map == null) {
                                    list2 = AbstractC3784a.m5817z(new C0718an(0L, null, null, 0.0d, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, true, "队列采样失败", 2097151));
                                } else {
                                    C0718an c0718an3 = (C0718an) AbstractC1805m.m3046j0(concurrentHashMap2.values());
                                    ArrayList arrayList6 = new ArrayList();
                                    int size3 = arrayList3.size();
                                    int i15 = 0;
                                    while (i15 < size3) {
                                        Object obj8 = arrayList3.get(i15);
                                        i15++;
                                        C1435xm c1435xm2 = (C1435xm) obj8;
                                        C0814dn c0814dn = (C0814dn) map.get(c1435xm2.f8844c);
                                        if (c0814dn == null) {
                                            concurrentHashMap = concurrentHashMap2;
                                            map2 = map;
                                            c0718an = null;
                                        } else {
                                            C0718an c0718an4 = (C0718an) concurrentHashMap2.get(c1435xm2.f8844c);
                                            long currentTimeMillis = System.currentTimeMillis();
                                            if (c0718an4 != null) {
                                                d7 = 1.0d;
                                                d8 = Math.max((currentTimeMillis - c0718an4.f2448a) / 1000.0d, 0.25d);
                                            } else {
                                                d7 = 1.0d;
                                                d8 = 1.0d;
                                            }
                                            concurrentHashMap = concurrentHashMap2;
                                            map2 = map;
                                            long j18 = c0814dn.f3528f + c0814dn.f3529g;
                                            if (c0718an4 != null) {
                                                j8 = c0718an4.f2456i;
                                            } else {
                                                j8 = 0;
                                            }
                                            long j19 = j8;
                                            if (c0718an4 != null) {
                                                j9 = c0718an4.f2457j;
                                            } else {
                                                j9 = 0;
                                            }
                                            double max = Math.max(0L, j18 - (j19 + j9)) / d8;
                                            long j20 = c0814dn.f3530h;
                                            if (c0718an3 != null) {
                                                j10 = c0718an3.f2458k;
                                            } else if (c0718an4 != null) {
                                                j10 = c0718an4.f2458k;
                                            } else {
                                                j10 = 0;
                                            }
                                            double max2 = Math.max(0L, j20 - j10) / d8;
                                            long j21 = c0814dn.f3527e;
                                            if (c0718an4 != null) {
                                                j11 = c0718an4.f2455h;
                                            } else {
                                                j11 = 0;
                                            }
                                            double max3 = Math.max(0L, j21 - j11) / d8;
                                            long j22 = c0814dn.f3531i;
                                            if (c0718an3 != null) {
                                                j12 = c0718an3.f2459l;
                                            } else if (c0718an4 != null) {
                                                j12 = c0718an4.f2459l;
                                            } else {
                                                j12 = 0;
                                            }
                                            double max4 = Math.max(0L, j22 - j12) / d8;
                                            double min = Math.min(100.0d, (c0814dn.f3525c / 131072.0d) * 100.0d);
                                            double min2 = Math.min(100.0d, 20.0d * max);
                                            double min3 = Math.min(100.0d, max2 * 10.0d);
                                            double min4 = Math.min(100.0d, max3 * 25.0d);
                                            double min5 = Math.min(100.0d, max4 * 5.0d);
                                            double min6 = Math.min(100.0d, (0.03d * min5) + (0.07d * min4) + (0.15d * min3) + (0.4d * min2) + (0.35d * min));
                                            long j23 = c0814dn.f3525c;
                                            if (min6 < 75.0d && j23 < 262144 && max < 5.0d && max2 < 10.0d) {
                                                if (min6 < 50.0d && max < d7 && max2 < 3.0d) {
                                                    if (min6 < 25.0d && j23 <= 0 && max3 < d7) {
                                                        enumC1466ym = EnumC1466ym.f9458f;
                                                    } else {
                                                        enumC1466ym = EnumC1466ym.f9459g;
                                                    }
                                                } else {
                                                    enumC1466ym = EnumC1466ym.f9460h;
                                                }
                                            } else {
                                                enumC1466ym = EnumC1466ym.f9461i;
                                            }
                                            c0718an = new C0718an(currentTimeMillis, c0814dn.f3524b, c0814dn.f3523a, min6, enumC1466ym, j23, c0814dn.f3526d, c0814dn.f3527e, c0814dn.f3528f, c0814dn.f3529g, c0814dn.f3530h, c0814dn.f3531i, max, max2, max3, max4, min, min2, min3, min4, min5, true, null, 4194304);
                                        }
                                        if (c0718an != null) {
                                            arrayList6.add(c0718an);
                                        }
                                        concurrentHashMap2 = concurrentHashMap;
                                        map = map2;
                                    }
                                    list2 = arrayList6;
                                }
                            }
                            for (C0718an c0718an5 : list2) {
                                if (!AbstractC0444k.m937a0(c0718an5.f2450c) && c0718an5.f2470w == null) {
                                    AbstractC0909gn.f4321e.put(c0718an5.f2450c, c0718an5);
                                }
                            }
                            C0718an c0718an6 = (C0718an) AbstractC1805m.m3047k0(list2);
                            if (c0718an6 != null) {
                                i7 = 1;
                                if (c0718an6.f2469v) {
                                    z7 = true;
                                    if (list2.size() != i7) {
                                        obj2 = list2.get(0);
                                    } else {
                                        obj2 = null;
                                    }
                                    c0718an2 = (C0718an) obj2;
                                    if (c0718an2 == null) {
                                        str = c0718an2.f2470w;
                                    } else {
                                        str = null;
                                    }
                                    C1701c0 c1701c0 = AbstractC0909gn.f4317a;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj9 : list2) {
                                        C0718an c0718an7 = (C0718an) obj9;
                                        if (c0718an7.f2470w == null || !AbstractC0444k.m937a0(c0718an7.f2450c)) {
                                            arrayList7.add(obj9);
                                        }
                                    }
                                    i10 = 1;
                                    if (list2.size() != 1) {
                                        str = null;
                                    }
                                    C1497zm c1497zm = new C1497zm(arrayList7, true, z7, str);
                                    c1701c0.getClass();
                                    c1701c0.m2752j(null, c1497zm);
                                    this.f3668k = 1;
                                    if (AbstractC0525d0.m1131i(1000L, this) == enumC2465a) {
                                        return enumC2465a;
                                    }
                                    i9 = i10;
                                    if (!AbstractC0909gn.f4319c) {
                                        return C1694m.f10482a;
                                    }
                                }
                            } else {
                                i7 = 1;
                            }
                            z7 = false;
                            if (list2.size() != i7) {
                            }
                            c0718an2 = (C0718an) obj2;
                            if (c0718an2 == null) {
                            }
                            C1701c0 c1701c02 = AbstractC0909gn.f4317a;
                            ArrayList arrayList72 = new ArrayList();
                            while (r7.hasNext()) {
                            }
                            i10 = 1;
                            if (list2.size() != 1) {
                            }
                            C1497zm c1497zm2 = new C1497zm(arrayList72, true, z7, str);
                            c1701c02.getClass();
                            c1701c02.m2752j(null, c1497zm2);
                            this.f3668k = 1;
                            if (AbstractC0525d0.m1131i(1000L, this) == enumC2465a) {
                            }
                            i9 = i10;
                            if (!AbstractC0909gn.f4319c) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (!AbstractC0909gn.f4319c) {
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0832ea(List list, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f3666i = 2;
        this.f3667j = list;
    }
}
