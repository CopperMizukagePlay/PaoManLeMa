package p039e5;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.net.Network;
import android.os.Build;
import android.os.SystemClock;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p001a0.AbstractC0094y0;
import p001a0.C0047l1;
import p024c6.AbstractC0444k;
import p024c6.AbstractC0451r;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1689h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1817y;
import p060h5.C1813u;
import p060h5.C1814v;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.yb */
/* loaded from: classes.dex */
public final class C1455yb extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f9311i = 1;

    /* renamed from: j */
    public List f9312j;

    /* renamed from: k */
    public int f9313k;

    /* renamed from: l */
    public final /* synthetic */ boolean f9314l;

    /* renamed from: m */
    public Object f9315m;

    /* renamed from: n */
    public /* synthetic */ Object f9316n;

    /* renamed from: o */
    public final /* synthetic */ Object f9317o;

    /* renamed from: p */
    public final /* synthetic */ Object f9318p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1455yb(C0813dm c0813dm, boolean z7, C1370vj c1370vj, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f9317o = c0813dm;
        this.f9314l = z7;
        this.f9318p = c1370vj;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f9311i) {
            case 0:
                return ((C1455yb) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            case 1:
                return ((C1455yb) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1455yb) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f9311i) {
            case 0:
                return new C1455yb(this.f9312j, (List) this.f9315m, (Context) this.f9316n, (InterfaceC2425y0) this.f9317o, (Map) this.f9318p, this.f9314l, interfaceC2313c);
            case 1:
                C1455yb c1455yb = new C1455yb((C0813dm) this.f9317o, this.f9314l, (C1370vj) this.f9318p, interfaceC2313c);
                c1455yb.f9316n = obj;
                return c1455yb;
            default:
                return new C1455yb(this.f9312j, (C0883ft) this.f9315m, (String) this.f9316n, this.f9313k, (Network) this.f9317o, this.f9314l, (EnumC1032km) this.f9318p, interfaceC2313c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /* JADX WARN: Type inference failed for: r10v10, types: [e5.eu, android.content.BroadcastReceiver] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [g5.h] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.content.Context] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        List<C1248rl> list;
        String str;
        UsbManager usbManager;
        ?? m2985m;
        int i7;
        int i8;
        C1393wb c1393wb;
        InterfaceC0516a0 interfaceC0516a0;
        C1218qm c1218qm;
        C1248rl c1248rl;
        List list2;
        Object m1126d;
        InetAddress byName;
        Object m2985m2;
        switch (this.f9311i) {
            case 0:
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                int i9 = this.f9313k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (this.f9312j.isEmpty()) {
                        ((InterfaceC2425y0) this.f9317o).setValue(C1814v.f10861e);
                        return C1694m.f10482a;
                    }
                    C0884fu c0884fu = C0884fu.f4092a;
                    if (C0884fu.f4095d == null && ((list = (List) this.f9315m) == null || !list.isEmpty())) {
                        for (C1248rl c1248rl2 : list) {
                            String str2 = c1248rl2.f7394e;
                            if (str2 != null) {
                                str = AbstractC0444k.m956t0(str2).toString();
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            String lowerCase = str.toLowerCase(Locale.ROOT);
                            AbstractC3367j.m5099d(lowerCase, "toLowerCase(...)");
                            EnumC1070lt enumC1070lt = c1248rl2.f7393d;
                            if (enumC1070lt == EnumC1070lt.f5747h || enumC1070lt == EnumC1070lt.f5746g || AbstractC0451r.m971M(lowerCase, "usb", false) || AbstractC0451r.m971M(lowerCase, "rndis", false) || AbstractC0451r.m971M(lowerCase, "ncm", false) || AbstractC0451r.m971M(lowerCase, "eth", false) || AbstractC0451r.m971M(lowerCase, "en", false)) {
                                C0884fu c0884fu2 = C0884fu.f4092a;
                                Context context = (Context) this.f9316n;
                                AbstractC3367j.m5100e(context, "context");
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                if (elapsedRealtime - C0884fu.f4097f >= 3000) {
                                    C0884fu.f4097f = elapsedRealtime;
                                    ?? applicationContext = context.getApplicationContext();
                                    Object systemService = applicationContext.getSystemService("usb");
                                    if (systemService instanceof UsbManager) {
                                        usbManager = (UsbManager) systemService;
                                    } else {
                                        usbManager = null;
                                    }
                                    if (usbManager != null) {
                                        if (!C0884fu.f4098g) {
                                            synchronized (c0884fu2) {
                                                try {
                                                    if (!C0884fu.f4098g) {
                                                        IntentFilter intentFilter = new IntentFilter("com.paoman.lema.action.USB_PERMISSION");
                                                        ?? broadcastReceiver = new BroadcastReceiver();
                                                        if (Build.VERSION.SDK_INT >= 33) {
                                                            applicationContext.registerReceiver(broadcastReceiver, intentFilter, 4);
                                                        } else {
                                                            applicationContext.registerReceiver(broadcastReceiver, intentFilter);
                                                        }
                                                        C0884fu.f4098g = true;
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                        }
                                        try {
                                            Collection<UsbDevice> values = usbManager.getDeviceList().values();
                                            AbstractC3367j.m5099d(values, "<get-values>(...)");
                                            m2985m = new ArrayList();
                                            for (Object obj2 : values) {
                                                UsbDevice usbDevice = (UsbDevice) obj2;
                                                AbstractC3367j.m5097b(usbDevice);
                                                if (!C0884fu.f4093b.contains(Integer.valueOf(usbDevice.getVendorId()))) {
                                                    int interfaceCount = usbDevice.getInterfaceCount();
                                                    for (int i10 = 0; i10 < interfaceCount; i10++) {
                                                        int interfaceClass = usbDevice.getInterface(i10).getInterfaceClass();
                                                        if (interfaceClass != 2 && interfaceClass != 10) {
                                                        }
                                                    }
                                                }
                                                m2985m.add(obj2);
                                            }
                                        } catch (Throwable th2) {
                                            m2985m = AbstractC1793a0.m2985m(th2);
                                        }
                                        boolean z7 = m2985m instanceof C1689h;
                                        List list3 = m2985m;
                                        if (z7) {
                                            list3 = null;
                                        }
                                        List<UsbDevice> list4 = list3;
                                        if (list4 == null) {
                                            list4 = C1813u.f10860e;
                                        }
                                        if (list4.isEmpty()) {
                                            C0884fu.f4094c = null;
                                            C0884fu.f4095d = null;
                                            C0884fu.f4096e = 0;
                                        } else {
                                            int i11 = 0;
                                            C0820du c0820du = null;
                                            for (UsbDevice usbDevice2 : list4) {
                                                if (usbManager.hasPermission(usbDevice2)) {
                                                    AbstractC3367j.m5097b(usbDevice2);
                                                    C0820du m1547a = C0884fu.m1547a(usbManager, usbDevice2);
                                                    if (m1547a != null) {
                                                        int i12 = m1547a.f3580d;
                                                        if (i12 <= i11) {
                                                            if (i12 == i11) {
                                                                int i13 = m1547a.f3577a;
                                                                if (c0820du != null) {
                                                                    i7 = c0820du.f3577a;
                                                                } else {
                                                                    i7 = 0;
                                                                }
                                                                if (i13 > i7) {
                                                                }
                                                            }
                                                        }
                                                        c0820du = m1547a;
                                                        i11 = i12;
                                                    }
                                                } else {
                                                    AbstractC3367j.m5097b(usbDevice2);
                                                    HashSet hashSet = C0884fu.f4099h;
                                                    synchronized (hashSet) {
                                                        if (hashSet.add(usbDevice2.getDeviceName())) {
                                                            if (Build.VERSION.SDK_INT >= 31) {
                                                                i8 = 167772160;
                                                            } else {
                                                                i8 = 134217728;
                                                            }
                                                            Intent intent = new Intent("com.paoman.lema.action.USB_PERMISSION").setPackage(applicationContext.getPackageName());
                                                            AbstractC3367j.m5099d(intent, "setPackage(...)");
                                                            try {
                                                                usbManager.requestPermission(usbDevice2, PendingIntent.getBroadcast(applicationContext, usbDevice2.getDeviceId(), intent, i8));
                                                            } catch (Throwable th3) {
                                                                AbstractC1793a0.m2985m(th3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (c0820du != null) {
                                                C0884fu c0884fu3 = C0884fu.f4092a;
                                                C0884fu.f4096e = c0820du.f3580d;
                                                C0884fu.f4094c = c0820du.f3578b;
                                                C0884fu.f4095d = c0820du.f3579c;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                do {
                    InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f9317o;
                    List list5 = this.f9312j;
                    Map map = (Map) this.f9318p;
                    Context context2 = (Context) this.f9316n;
                    boolean z8 = this.f9314l;
                    int m3082N = AbstractC1817y.m3082N(AbstractC1807o.m3073U(list5));
                    if (m3082N < 16) {
                        m3082N = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(m3082N);
                    for (Object obj3 : list5) {
                        C1248rl c1248rl3 = (C1248rl) map.get((String) obj3);
                        if (c1248rl3 != null) {
                            c1393wb = AbstractC1217ql.m2144i(context2, c1248rl3, z8);
                        } else {
                            c1393wb = new C1393wb(7, null, null, null);
                        }
                        linkedHashMap.put(obj3, c1393wb);
                    }
                    interfaceC2425y0.setValue(linkedHashMap);
                    this.f9313k = 1;
                } while (AbstractC0525d0.m1131i(2000L, this) != enumC2465a);
                return enumC2465a;
            case 1:
                C1813u c1813u = C1813u.f10860e;
                C0813dm c0813dm = (C0813dm) this.f9317o;
                Map map2 = c0813dm.f3521e;
                C1189po c1189po = c0813dm.f3517a;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                int i14 = this.f9313k;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            m1126d = obj;
                            Map m3086R = AbstractC1817y.m3086R((Iterable) m1126d);
                            List<C1006jr> list6 = c1189po.f6928c;
                            ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(list6));
                            for (C1006jr c1006jr : list6) {
                                String str3 = (String) m3086R.get(c1006jr.f5163a);
                                if (str3 == null) {
                                    str3 = c1006jr.f5163a;
                                }
                                arrayList.add(C1006jr.m1617a(c1006jr, str3));
                            }
                            C1189po m2080a = C1189po.m2080a(c1189po, 0, null, arrayList, null, 11);
                            List list7 = c0813dm.f3518b;
                            boolean z9 = c0813dm.f3519c;
                            boolean z10 = c0813dm.f3520d;
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC1817y.m3082N(map2.size()));
                            for (Map.Entry entry : map2.entrySet()) {
                                Object key = entry.getKey();
                                List<String> list8 = (List) entry.getValue();
                                ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(list8));
                                for (String str4 : list8) {
                                    String str5 = (String) m3086R.get(str4);
                                    if (str5 != null) {
                                        str4 = str5;
                                    }
                                    arrayList2.add(str4);
                                }
                                linkedHashMap2.put(key, arrayList2);
                            }
                            c1218qm = new C1218qm(m2080a, list7, z9, z10, linkedHashMap2, c0813dm.f3522f, c1813u);
                            return c1218qm;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = this.f9312j;
                    c1248rl = (C1248rl) this.f9315m;
                    interfaceC0516a0 = (InterfaceC0516a0) this.f9316n;
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    interfaceC0516a0 = (InterfaceC0516a0) this.f9316n;
                    boolean z11 = c0813dm.f3519c;
                    if (z11 && this.f9314l) {
                        c1248rl = (C1248rl) AbstractC1805m.m3047k0(c0813dm.f3518b);
                        if (c1248rl == null) {
                            c1248rl = new C1248rl("default|默认接口", "默认接口", (Network) null, (EnumC1070lt) null, (String) null, 60);
                        }
                        List m3042f0 = AbstractC1805m.m3042f0(AbstractC1805m.m3058v0(c1189po.m2081b(), AbstractC1807o.m3074V(map2.values())));
                        C1370vj c1370vj = (C1370vj) this.f9318p;
                        String m184k = AbstractC0094y0.m184k(m3042f0.size(), "302 跳转增强工作中（正在准备下载地址候选，", " 个）");
                        this.f9316n = interfaceC0516a0;
                        this.f9315m = c1248rl;
                        this.f9312j = m3042f0;
                        this.f9313k = 1;
                        if (c1370vj.mo22d(m184k, this) != enumC2465a2) {
                            list2 = m3042f0;
                        } else {
                            return enumC2465a2;
                        }
                    } else {
                        c1218qm = new C1218qm(c0813dm.f3517a, c0813dm.f3518b, z11, c0813dm.f3520d, c0813dm.f3521e, c0813dm.f3522f, c1813u);
                        return c1218qm;
                    }
                }
                InterfaceC0516a0 interfaceC0516a02 = interfaceC0516a0;
                C1248rl c1248rl4 = c1248rl;
                ArrayList arrayList3 = new ArrayList(AbstractC1807o.m3073U(list2));
                Iterator it = list2.iterator();
                while (true) {
                    InterfaceC2313c interfaceC2313c = null;
                    if (it.hasNext()) {
                        String str6 = (String) it.next();
                        C2325e c2325e = AbstractC0549l0.f1898a;
                        arrayList3.add(AbstractC0525d0.m1125c(interfaceC0516a02, ExecutorC2324d.f13302g, new C0047l1(c0813dm, c1248rl4, str6, interfaceC2313c, 2), 2));
                    } else {
                        this.f9316n = null;
                        this.f9315m = null;
                        this.f9312j = null;
                        this.f9313k = 2;
                        m1126d = AbstractC0525d0.m1126d(arrayList3, this);
                        if (m1126d == enumC2465a2) {
                            return enumC2465a2;
                        }
                        Map m3086R2 = AbstractC1817y.m3086R((Iterable) m1126d);
                        List<C1006jr> list62 = c1189po.f6928c;
                        ArrayList arrayList4 = new ArrayList(AbstractC1807o.m3073U(list62));
                        while (r4.hasNext()) {
                        }
                        C1189po m2080a2 = C1189po.m2080a(c1189po, 0, null, arrayList4, null, 11);
                        List list72 = c0813dm.f3518b;
                        boolean z92 = c0813dm.f3519c;
                        boolean z102 = c0813dm.f3520d;
                        LinkedHashMap linkedHashMap22 = new LinkedHashMap(AbstractC1817y.m3082N(map2.size()));
                        while (r0.hasNext()) {
                        }
                        c1218qm = new C1218qm(m2080a2, list72, z92, z102, linkedHashMap22, c0813dm.f3522f, c1813u);
                        return c1218qm;
                    }
                }
                break;
            default:
                AbstractC1793a0.m2972L(obj);
                Iterator it2 = this.f9312j.iterator();
                while (it2.hasNext()) {
                    int intValue = ((Number) it2.next()).intValue();
                    String str7 = (String) this.f9316n;
                    int i15 = this.f9313k;
                    Network network = (Network) this.f9317o;
                    boolean z12 = this.f9314l;
                    EnumC1032km enumC1032km = (EnumC1032km) this.f9318p;
                    List list9 = C0883ft.f4080j;
                    if (z12 && enumC1032km != null) {
                        try {
                            byName = C0883ft.m1536n(str7, network, enumC1032km);
                        } catch (Throwable th4) {
                            m2985m2 = AbstractC1793a0.m2985m(th4);
                        }
                    } else if (z12) {
                        byName = C0883ft.m1535m(str7, network);
                    } else {
                        byName = InetAddress.getByName(str7);
                    }
                    long nanoTime = System.nanoTime();
                    Socket socket = new Socket();
                    if (network != null) {
                        try {
                            try {
                                network.bindSocket(socket);
                            } finally {
                            }
                        } catch (ConnectException e7) {
                            double nanoTime2 = (System.nanoTime() - nanoTime) / 1000000.0d;
                            if (nanoTime2 > 0.0d) {
                                m2985m2 = new C1317ts(true, nanoTime2);
                            } else {
                                throw e7;
                                break;
                            }
                        }
                    }
                    socket.connect(new InetSocketAddress(byName, intValue), i15);
                    m2985m2 = new C1317ts(true, (System.nanoTime() - nanoTime) / 1000000.0d);
                    try {
                        socket.close();
                    } catch (Throwable th5) {
                        AbstractC1793a0.m2985m(th5);
                    }
                    Object c1317ts = new C1317ts(false, 0.0d);
                    if (m2985m2 instanceof C1689h) {
                        m2985m2 = c1317ts;
                    }
                    C1317ts c1317ts2 = (C1317ts) m2985m2;
                    if (c1317ts2.f7863a) {
                        return c1317ts2;
                    }
                }
                return new C1317ts(false, 0.0d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1455yb(List list, C0883ft c0883ft, String str, int i7, Network network, boolean z7, EnumC1032km enumC1032km, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f9312j = list;
        this.f9315m = c0883ft;
        this.f9316n = str;
        this.f9313k = i7;
        this.f9317o = network;
        this.f9314l = z7;
        this.f9318p = enumC1032km;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1455yb(List list, List list2, Context context, InterfaceC2425y0 interfaceC2425y0, Map map, boolean z7, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f9312j = list;
        this.f9315m = list2;
        this.f9316n = context;
        this.f9317o = interfaceC2425y0;
        this.f9318p = map;
        this.f9314l = z7;
    }
}
