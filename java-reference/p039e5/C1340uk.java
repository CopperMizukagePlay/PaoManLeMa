package p039e5;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.paoman.lema.SpeedWorkerSlot0Service;
import com.paoman.lema.SpeedWorkerSlot1Service;
import com.paoman.lema.SpeedWorkerSlot2Service;
import com.paoman.lema.SpeedWorkerSlot3Service;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0444k;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p054g6.C1715p;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1811s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.uk */
/* loaded from: classes.dex */
public final class C1340uk {

    /* renamed from: a */
    public final Context f7956a;

    /* renamed from: b */
    public final C1701c0 f7957b;

    /* renamed from: c */
    public final C1715p f7958c;

    /* renamed from: d */
    public final C1701c0 f7959d;

    /* renamed from: e */
    public final C1715p f7960e;

    /* renamed from: f */
    public final List f7961f;

    /* renamed from: g */
    public final LinkedHashMap f7962g;

    /* renamed from: h */
    public final LinkedHashMap f7963h;

    /* renamed from: i */
    public final LinkedHashSet f7964i;

    /* renamed from: j */
    public final ArrayDeque f7965j;

    /* renamed from: k */
    public final ArrayDeque f7966k;

    /* renamed from: l */
    public boolean f7967l;

    /* renamed from: m */
    public boolean f7968m;

    /* renamed from: n */
    public long f7969n;

    /* renamed from: o */
    public long f7970o;

    /* renamed from: p */
    public int f7971p;

    /* renamed from: q */
    public int f7972q;

    /* renamed from: r */
    public final Messenger f7973r;

    public C1340uk(Context context) {
        this.f7956a = context;
        C1701c0 m2771b = AbstractC1719t.m2771b(new C0976ir(false, false, 0.0d, 0.0d, 0.0d, 0.0d, 0L, 0L, null, null, 0.0d, 0.0d, null, 0L, null, false, false, null, null, null, 0L, 0.0d, 0.0d, null, Integer.MAX_VALUE));
        this.f7957b = m2771b;
        this.f7958c = new C1715p(m2771b);
        C1701c0 m2771b2 = AbstractC1719t.m2771b(Boolean.FALSE);
        this.f7959d = m2771b2;
        this.f7960e = new C1715p(m2771b2);
        this.f7961f = AbstractC1806n.m3067O(SpeedWorkerSlot0Service.class, SpeedWorkerSlot1Service.class, SpeedWorkerSlot2Service.class, SpeedWorkerSlot3Service.class);
        this.f7962g = new LinkedHashMap();
        this.f7963h = new LinkedHashMap();
        this.f7964i = new LinkedHashSet();
        this.f7965j = new ArrayDeque();
        this.f7966k = new ArrayDeque();
        this.f7967l = true;
        this.f7968m = true;
        this.f7970o = 250L;
        this.f7971p = 120;
        this.f7973r = new Messenger(new HandlerC1309tk(this, Looper.getMainLooper(), 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0349 A[LOOP:11: B:146:0x0343->B:148:0x0349, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x036d A[LOOP:12: B:151:0x0367->B:153:0x036d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0390 A[LOOP:13: B:156:0x038a->B:158:0x0390, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01a1 A[LOOP:15: B:194:0x0199->B:196:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0184 A[LOOP:16: B:199:0x017c->B:201:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b6 A[LOOP:5: B:70:0x01b0->B:72:0x01b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01db A[LOOP:6: B:75:0x01d5->B:77:0x01db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0224  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2363a(C1340uk c1340uk) {
        double d7;
        double d8;
        boolean z7;
        double d9;
        boolean z8;
        Iterator it;
        long j6;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        long currentTimeMillis;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        double d10;
        double d11;
        double d12;
        boolean z13;
        boolean z14;
        double d13;
        long j7;
        double d14;
        String str2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        Object obj;
        LinkedHashSet linkedHashSet = c1340uk.f7964i;
        LinkedHashMap linkedHashMap2 = c1340uk.f7962g;
        ArrayDeque arrayDeque = c1340uk.f7966k;
        ArrayDeque arrayDeque2 = c1340uk.f7965j;
        LinkedHashMap linkedHashMap3 = c1340uk.f7963h;
        C1701c0 c1701c0 = c1340uk.f7959d;
        if (((Boolean) c1701c0.getValue()).booleanValue() && !linkedHashMap3.isEmpty()) {
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                String str3 = (String) entry.getKey();
                C0976ir c0976ir = (C0976ir) entry.getValue();
                if (c0976ir.f4968a || c0976ir.f4969b) {
                    linkedHashSet.add(str3);
                }
            }
            List m3035C0 = AbstractC1805m.m3035C0(linkedHashMap3.values());
            ArrayList arrayList = new ArrayList();
            Iterator it6 = m3035C0.iterator();
            while (it6.hasNext()) {
                AbstractC1811s.m3076X(((C0976ir) it6.next()).f4980m, arrayList);
            }
            int size = arrayList.size();
            double d15 = 0.0d;
            int i7 = 0;
            while (i7 < size) {
                Object obj2 = arrayList.get(i7);
                i7++;
                d15 += ((C0707ac) obj2).f2364d;
            }
            int size2 = arrayList.size();
            double d16 = 0.0d;
            int i8 = 0;
            while (i8 < size2) {
                Object obj3 = arrayList.get(i8);
                i8++;
                d16 += ((C0707ac) obj3).f2365e;
                m3035C0 = m3035C0;
                arrayList = arrayList;
            }
            List list = m3035C0;
            ArrayList arrayList2 = arrayList;
            Double valueOf = Double.valueOf(d15);
            if (d15 <= 0.0d) {
                valueOf = null;
            }
            if (valueOf != null) {
                d7 = valueOf.doubleValue();
            } else {
                Iterator it7 = list.iterator();
                double d17 = 0.0d;
                while (it7.hasNext()) {
                    d17 += ((C0976ir) it7.next()).f4970c;
                }
                d7 = d17;
            }
            Double valueOf2 = Double.valueOf(d16);
            if (d16 <= 0.0d) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                d8 = valueOf2.doubleValue();
            } else {
                Iterator it8 = list.iterator();
                double d18 = 0.0d;
                while (it8.hasNext()) {
                    d18 += ((C0976ir) it8.next()).f4971d;
                }
                d8 = d18;
            }
            double d19 = 0.001d;
            if (!list.isEmpty()) {
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    if (((C0976ir) it9.next()).f4968a) {
                        break;
                    }
                }
            }
            if (!c1340uk.f7967l || d7 <= 0.001d || linkedHashSet.isEmpty()) {
                z7 = false;
                if (!list.isEmpty()) {
                    Iterator it10 = list.iterator();
                    while (it10.hasNext()) {
                        double d20 = d19;
                        if (((C0976ir) it10.next()).f4969b) {
                            break;
                        } else {
                            d19 = d20;
                        }
                    }
                }
                double d21 = d19;
                if (c1340uk.f7968m || d8 <= d21 || linkedHashSet.isEmpty()) {
                    d9 = d8;
                    z8 = false;
                    if (!c1340uk.f7967l || arrayDeque2.isEmpty()) {
                        arrayDeque2.addLast(Double.valueOf(d7));
                        while (arrayDeque2.size() > c1340uk.f7971p) {
                            arrayDeque2.removeFirst();
                        }
                    }
                    if (!c1340uk.f7968m || arrayDeque.isEmpty()) {
                        arrayDeque.addLast(Double.valueOf(d9));
                        while (arrayDeque.size() > c1340uk.f7971p) {
                            arrayDeque.removeFirst();
                        }
                    }
                    it = list.iterator();
                    j6 = 0;
                    while (it.hasNext()) {
                        j6 += ((C0976ir) it.next()).f4974g;
                        arrayDeque2 = arrayDeque2;
                        linkedHashMap3 = linkedHashMap3;
                    }
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    linkedHashMap = linkedHashMap3;
                    it2 = list.iterator();
                    long j8 = 0;
                    while (it2.hasNext()) {
                        j8 += ((C0976ir) it2.next()).f4975h;
                        d7 = d7;
                    }
                    double d22 = d7;
                    currentTimeMillis = System.currentTimeMillis() - c1340uk.f7969n;
                    if (currentTimeMillis < 1) {
                        currentTimeMillis = 1;
                    }
                    if (linkedHashMap.size() >= linkedHashMap2.size()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (linkedHashSet.size() >= linkedHashMap2.size()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z7 && !z8 && z9 && z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(list));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(((C0976ir) it11.next()).f4986s);
                            z11 = z11;
                        }
                        z12 = z11;
                        int size3 = arrayList3.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 < size3) {
                                obj = arrayList3.get(i9);
                                i9++;
                                if (!AbstractC0444k.m937a0((String) obj)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        str = (String) obj;
                        if (str == null) {
                            str = "多进程模式二测速完成";
                        }
                    } else {
                        z12 = z11;
                        str = "";
                    }
                    String str4 = str;
                    C1701c0 c1701c02 = c1340uk.f7957b;
                    if (z7) {
                        d10 = d9;
                        d11 = d22;
                    } else {
                        d10 = d9;
                        d11 = 0.0d;
                    }
                    if (z8) {
                        d12 = d10;
                    } else {
                        d12 = 0.0d;
                    }
                    double m2180a = C1247rk.m2180a(j6, currentTimeMillis);
                    double d23 = 0.0d;
                    double m2180a2 = C1247rk.m2180a(j8, currentTimeMillis);
                    List m3035C02 = AbstractC1805m.m3035C0(arrayDeque3);
                    List m3035C03 = AbstractC1805m.m3035C0(arrayDeque);
                    if (z7 && c1340uk.f7967l) {
                        Iterator it12 = list.iterator();
                        double d24 = 0.0d;
                        while (it12.hasNext()) {
                            d24 += ((C0976ir) it12.next()).f4978k;
                            z8 = z8;
                            z7 = z7;
                        }
                        z13 = z7;
                        z14 = z8;
                        Double valueOf3 = Double.valueOf(d24);
                        if (d24 <= 0.0d) {
                            valueOf3 = null;
                        }
                        if (valueOf3 != null) {
                            d13 = valueOf3.doubleValue();
                        } else {
                            d13 = C1247rk.m2180a(j6, currentTimeMillis);
                        }
                    } else {
                        z13 = z7;
                        z14 = z8;
                        d13 = 0.0d;
                    }
                    if (z14 && c1340uk.f7968m) {
                        Iterator it13 = list.iterator();
                        double d25 = 0.0d;
                        while (it13.hasNext()) {
                            d25 += ((C0976ir) it13.next()).f4979l;
                            j6 = j6;
                        }
                        j7 = j6;
                        Double valueOf4 = Double.valueOf(d25);
                        if (d25 <= 0.0d) {
                            valueOf4 = null;
                        }
                        if (valueOf4 != null) {
                            d14 = valueOf4.doubleValue();
                        } else {
                            d14 = C1247rk.m2180a(j8, currentTimeMillis);
                        }
                    } else {
                        j7 = j6;
                        d14 = 0.0d;
                    }
                    boolean z15 = c1340uk.f7967l;
                    double d26 = d14;
                    boolean z16 = c1340uk.f7968m;
                    if (z12) {
                        str2 = "已停止：".concat(str4);
                    } else {
                        str2 = "多进程模式二测速中";
                    }
                    ArrayList arrayList4 = new ArrayList();
                    it3 = list.iterator();
                    while (it3.hasNext()) {
                        AbstractC1811s.m3076X(((C0976ir) it3.next()).f4993z, arrayList4);
                        z16 = z16;
                    }
                    boolean z17 = z16;
                    String str5 = str2;
                    long j9 = c1340uk.f7970o;
                    it4 = list.iterator();
                    double d27 = 0.0d;
                    while (it4.hasNext()) {
                        d27 += ((C0976ir) it4.next()).f4964B;
                        arrayList4 = arrayList4;
                        j9 = j9;
                    }
                    ArrayList arrayList5 = arrayList4;
                    long j10 = j9;
                    it5 = list.iterator();
                    while (it5.hasNext()) {
                        d23 += ((C0976ir) it5.next()).f4965C;
                    }
                    boolean z18 = z14;
                    boolean z19 = z13;
                    C0976ir c0976ir2 = new C0976ir(z19, z18, d11, d12, m2180a, m2180a2, j7, j8, m3035C02, m3035C03, d13, d26, arrayList2, currentTimeMillis, null, z15, z17, str5, str4, arrayList5, j10, d27, d23, AbstractC0094y0.m183j(linkedHashMap.size(), linkedHashMap2.size(), "多进程 worker=", "/", " · 每接口1进程"), 33046528);
                    c1701c02.getClass();
                    c1701c02.m2752j(null, c0976ir2);
                    if (z12) {
                        Iterator it14 = linkedHashMap2.values().iterator();
                        while (it14.hasNext()) {
                            try {
                                c1340uk.f7956a.unbindService((ServiceConnectionC1278sk) it14.next());
                            } catch (Throwable th) {
                                AbstractC1793a0.m2985m(th);
                            }
                        }
                        linkedHashMap2.clear();
                        c1701c0.m2752j(null, Boolean.FALSE);
                        return;
                    }
                    return;
                }
                d9 = d8;
                z8 = true;
                if (!c1340uk.f7967l) {
                }
                arrayDeque2.addLast(Double.valueOf(d7));
                while (arrayDeque2.size() > c1340uk.f7971p) {
                }
                if (!c1340uk.f7968m) {
                }
                arrayDeque.addLast(Double.valueOf(d9));
                while (arrayDeque.size() > c1340uk.f7971p) {
                }
                it = list.iterator();
                j6 = 0;
                while (it.hasNext()) {
                }
                ArrayDeque arrayDeque32 = arrayDeque2;
                linkedHashMap = linkedHashMap3;
                it2 = list.iterator();
                long j82 = 0;
                while (it2.hasNext()) {
                }
                double d222 = d7;
                currentTimeMillis = System.currentTimeMillis() - c1340uk.f7969n;
                if (currentTimeMillis < 1) {
                }
                if (linkedHashMap.size() >= linkedHashMap2.size()) {
                }
                if (linkedHashSet.size() >= linkedHashMap2.size()) {
                }
                if (z7) {
                }
                z11 = false;
                if (z11) {
                }
                String str42 = str;
                C1701c0 c1701c022 = c1340uk.f7957b;
                if (z7) {
                }
                if (z8) {
                }
                double m2180a3 = C1247rk.m2180a(j6, currentTimeMillis);
                double d232 = 0.0d;
                double m2180a22 = C1247rk.m2180a(j82, currentTimeMillis);
                List m3035C022 = AbstractC1805m.m3035C0(arrayDeque32);
                List m3035C032 = AbstractC1805m.m3035C0(arrayDeque);
                if (z7) {
                }
                z13 = z7;
                z14 = z8;
                d13 = 0.0d;
                if (z14) {
                }
                j7 = j6;
                d14 = 0.0d;
                boolean z152 = c1340uk.f7967l;
                double d262 = d14;
                boolean z162 = c1340uk.f7968m;
                if (z12) {
                }
                ArrayList arrayList42 = new ArrayList();
                it3 = list.iterator();
                while (it3.hasNext()) {
                }
                boolean z172 = z162;
                String str52 = str2;
                long j92 = c1340uk.f7970o;
                it4 = list.iterator();
                double d272 = 0.0d;
                while (it4.hasNext()) {
                }
                ArrayList arrayList52 = arrayList42;
                long j102 = j92;
                it5 = list.iterator();
                while (it5.hasNext()) {
                }
                boolean z182 = z14;
                boolean z192 = z13;
                C0976ir c0976ir22 = new C0976ir(z192, z182, d11, d12, m2180a3, m2180a22, j7, j82, m3035C022, m3035C032, d13, d262, arrayList2, currentTimeMillis, null, z152, z172, str52, str42, arrayList52, j102, d272, d232, AbstractC0094y0.m183j(linkedHashMap.size(), linkedHashMap2.size(), "多进程 worker=", "/", " · 每接口1进程"), 33046528);
                c1701c022.getClass();
                c1701c022.m2752j(null, c0976ir22);
                if (z12) {
                }
            }
            z7 = true;
            if (!list.isEmpty()) {
            }
            double d212 = d19;
            if (c1340uk.f7968m) {
            }
            d9 = d8;
            z8 = false;
            if (!c1340uk.f7967l) {
            }
            arrayDeque2.addLast(Double.valueOf(d7));
            while (arrayDeque2.size() > c1340uk.f7971p) {
            }
            if (!c1340uk.f7968m) {
            }
            arrayDeque.addLast(Double.valueOf(d9));
            while (arrayDeque.size() > c1340uk.f7971p) {
            }
            it = list.iterator();
            j6 = 0;
            while (it.hasNext()) {
            }
            ArrayDeque arrayDeque322 = arrayDeque2;
            linkedHashMap = linkedHashMap3;
            it2 = list.iterator();
            long j822 = 0;
            while (it2.hasNext()) {
            }
            double d2222 = d7;
            currentTimeMillis = System.currentTimeMillis() - c1340uk.f7969n;
            if (currentTimeMillis < 1) {
            }
            if (linkedHashMap.size() >= linkedHashMap2.size()) {
            }
            if (linkedHashSet.size() >= linkedHashMap2.size()) {
            }
            if (z7) {
            }
            z11 = false;
            if (z11) {
            }
            String str422 = str;
            C1701c0 c1701c0222 = c1340uk.f7957b;
            if (z7) {
            }
            if (z8) {
            }
            double m2180a32 = C1247rk.m2180a(j6, currentTimeMillis);
            double d2322 = 0.0d;
            double m2180a222 = C1247rk.m2180a(j822, currentTimeMillis);
            List m3035C0222 = AbstractC1805m.m3035C0(arrayDeque322);
            List m3035C0322 = AbstractC1805m.m3035C0(arrayDeque);
            if (z7) {
            }
            z13 = z7;
            z14 = z8;
            d13 = 0.0d;
            if (z14) {
            }
            j7 = j6;
            d14 = 0.0d;
            boolean z1522 = c1340uk.f7967l;
            double d2622 = d14;
            boolean z1622 = c1340uk.f7968m;
            if (z12) {
            }
            ArrayList arrayList422 = new ArrayList();
            it3 = list.iterator();
            while (it3.hasNext()) {
            }
            boolean z1722 = z1622;
            String str522 = str2;
            long j922 = c1340uk.f7970o;
            it4 = list.iterator();
            double d2722 = 0.0d;
            while (it4.hasNext()) {
            }
            ArrayList arrayList522 = arrayList422;
            long j1022 = j922;
            it5 = list.iterator();
            while (it5.hasNext()) {
            }
            boolean z1822 = z14;
            boolean z1922 = z13;
            C0976ir c0976ir222 = new C0976ir(z1922, z1822, d11, d12, m2180a32, m2180a222, j7, j822, m3035C0222, m3035C0322, d13, d2622, arrayList2, currentTimeMillis, null, z1522, z1722, str522, str422, arrayList522, j1022, d2722, d2322, AbstractC0094y0.m183j(linkedHashMap.size(), linkedHashMap2.size(), "多进程 worker=", "/", " · 每接口1进程"), 33046528);
            c1701c0222.getClass();
            c1701c0222.m2752j(null, c0976ir222);
            if (z12) {
            }
        }
    }

    /* renamed from: b */
    public final C1715p m2364b() {
        return this.f7960e;
    }

    /* renamed from: c */
    public final C1715p m2365c() {
        return this.f7958c;
    }

    /* renamed from: d */
    public final void m2366d() {
        Context context;
        this.f7972q++;
        LinkedHashMap linkedHashMap = this.f7962g;
        Iterator it = linkedHashMap.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            context = this.f7956a;
            if (!hasNext) {
                break;
            }
            ServiceConnectionC1278sk serviceConnectionC1278sk = (ServiceConnectionC1278sk) it.next();
            try {
                Messenger messenger = serviceConnectionC1278sk.f7619e;
                if (messenger != null) {
                    messenger.send(Message.obtain((Handler) null, 2));
                }
            } catch (Throwable th) {
                AbstractC1793a0.m2985m(th);
            }
            try {
                context.unbindService(serviceConnectionC1278sk);
            } catch (Throwable th2) {
                AbstractC1793a0.m2985m(th2);
            }
        }
        Iterator it2 = this.f7961f.iterator();
        while (it2.hasNext()) {
            try {
                context.stopService(new Intent(context, (Class<?>) it2.next()));
            } catch (Throwable th3) {
                AbstractC1793a0.m2985m(th3);
            }
        }
        linkedHashMap.clear();
        this.f7963h.clear();
        this.f7964i.clear();
        C1701c0 c1701c0 = this.f7959d;
        if (((Boolean) c1701c0.getValue()).booleanValue()) {
            C1701c0 c1701c02 = this.f7957b;
            C0976ir m1609a = C0976ir.m1609a((C0976ir) c1701c02.getValue(), false, false, 0.0d, 0.0d, ((C0976ir) c1701c02.getValue()).f4972e, ((C0976ir) c1701c02.getValue()).f4973f, null, null, "已停止：手动停止", "手动停止", null, null, 0, 2147087344);
            c1701c02.getClass();
            c1701c02.m2752j(null, m1609a);
        }
        Boolean bool = Boolean.FALSE;
        c1701c0.getClass();
        c1701c0.m2752j(null, bool);
    }
}
