package p039e5;

import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a0.AbstractC0094y0;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.C0565q1;
import p032d6.C0568r1;
import p053g5.C1689h;
import p053g5.C1694m;
import p054g6.AbstractC1719t;
import p054g6.C1701c0;
import p054g6.C1715p;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p068i5.AbstractC2080d;
import p069i6.C2090c;
import p082k5.InterfaceC2318h;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.qn */
/* loaded from: classes.dex */
public final class C1219qn {

    /* renamed from: a */
    public final C2090c f7136a;

    /* renamed from: b */
    public final AtomicBoolean f7137b;

    /* renamed from: c */
    public C0565q1 f7138c;

    /* renamed from: d */
    public final Object f7139d;

    /* renamed from: e */
    public List f7140e;

    /* renamed from: f */
    public final C1701c0 f7141f;

    /* renamed from: g */
    public final C1715p f7142g;

    public C1219qn() {
        C0568r1 m1124b = AbstractC0525d0.m1124b();
        C2325e c2325e = AbstractC0549l0.f1898a;
        this.f7136a = AbstractC0525d0.m1123a(AbstractC2080d.m3374B(m1124b, ExecutorC2324d.f13302g));
        this.f7137b = new AtomicBoolean(false);
        this.f7139d = new Object();
        C1701c0 m2771b = AbstractC1719t.m2771b(new C1281sn(null, 0, 0, 0, 0, 0, 0, 0, null, 262143));
        this.f7141f = m2771b;
        this.f7142g = new C1715p(m2771b);
    }

    /* renamed from: a */
    public static final void m2148a(C1219qn c1219qn, String str) {
        C1701c0 c1701c0 = c1219qn.f7141f;
        ArrayList m3036D0 = AbstractC1805m.m3036D0(((C1281sn) c1701c0.getValue()).f7643r);
        m3036D0.add(0, new C1250rn(System.currentTimeMillis(), str));
        if (m3036D0.size() > 120) {
            m3036D0.remove(AbstractC1806n.m3066N(m3036D0));
        }
        c1701c0.m2752j(null, C1281sn.m2332a((C1281sn) c1701c0.getValue(), null, 0, 0, 0, 0, 0, 0L, null, m3036D0, 131071));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a4 -> B:10:0x00a6). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2149b(C1219qn c1219qn, int i7, long j6, List list, AbstractC2583c abstractC2583c) {
        C1095mn c1095mn;
        C1219qn c1219qn2;
        int i8;
        int i9;
        long j7;
        C1095mn c1095mn2;
        List list2;
        if (abstractC2583c instanceof C1095mn) {
            c1095mn = (C1095mn) abstractC2583c;
            int i10 = c1095mn.f5971n;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1095mn.f5971n = i10 - Integer.MIN_VALUE;
                c1219qn2 = c1219qn;
                Object obj = c1095mn.f5969l;
                i8 = c1095mn.f5971n;
                if (i8 == 0) {
                    if (i8 == 1) {
                        int i11 = c1095mn.f5968k;
                        j7 = c1095mn.f5967j;
                        List list3 = c1095mn.f5966i;
                        C1219qn c1219qn3 = c1095mn.f5965h;
                        AbstractC1793a0.m2972L(obj);
                        c1095mn2 = c1095mn;
                        list2 = list3;
                        i9 = i11 - 1;
                        c1219qn2 = c1219qn3;
                        if (i9 > 0 && c1219qn2.f7137b.get()) {
                            InterfaceC2318h interfaceC2318h = c1095mn2.f13999f;
                            AbstractC3367j.m5097b(interfaceC2318h);
                            if (AbstractC0525d0.m1140r(interfaceC2318h)) {
                                int m2151f = m2151f(list2);
                                c1219qn2.m2155h(C1281sn.m2332a((C1281sn) c1219qn2.f7141f.getValue(), null, 0, 0, 0, m2151f, m2151f, System.currentTimeMillis() - j7, AbstractC0094y0.m183j(m2151f, i9, "保持 ", " 个连接，剩余 ", "s"), null, 139263));
                                c1095mn2.f5965h = c1219qn2;
                                c1095mn2.f5966i = list2;
                                c1095mn2.f5967j = j7;
                                c1095mn2.f5968k = i9;
                                c1095mn2.f5971n = 1;
                                Object m1131i = AbstractC0525d0.m1131i(1000L, c1095mn2);
                                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                                if (m1131i == enumC2465a) {
                                    return enumC2465a;
                                }
                                c1219qn3 = c1219qn2;
                                i11 = i9;
                                i9 = i11 - 1;
                                c1219qn2 = c1219qn3;
                                if (i9 > 0) {
                                    InterfaceC2318h interfaceC2318h2 = c1095mn2.f13999f;
                                    AbstractC3367j.m5097b(interfaceC2318h2);
                                    if (AbstractC0525d0.m1140r(interfaceC2318h2)) {
                                    }
                                }
                            }
                        }
                        return C1694m.f10482a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                i9 = i7;
                j7 = j6;
                c1095mn2 = c1095mn;
                list2 = list;
                if (i9 > 0) {
                }
                return C1694m.f10482a;
            }
        }
        c1219qn2 = c1219qn;
        c1095mn = new C1095mn(c1219qn2, abstractC2583c);
        Object obj2 = c1095mn.f5969l;
        i8 = c1095mn.f5971n;
        if (i8 == 0) {
        }
    }

    /* renamed from: e */
    public static boolean m2150e(Socket socket) {
        Object m2985m;
        boolean z7 = false;
        if (socket.isClosed() || !socket.isConnected() || socket.isInputShutdown() || socket.isOutputShutdown()) {
            return false;
        }
        try {
            int soTimeout = socket.getSoTimeout();
            boolean z8 = true;
            socket.setSoTimeout(1);
            try {
                try {
                    if (socket.getInputStream().read() != -1) {
                        z7 = true;
                    }
                    try {
                        socket.setSoTimeout(soTimeout);
                    } catch (Throwable th) {
                        AbstractC1793a0.m2985m(th);
                    }
                    z8 = z7;
                } catch (Throwable th2) {
                    AbstractC1793a0.m2985m(th2);
                }
            } catch (SocketTimeoutException unused) {
                socket.setSoTimeout(soTimeout);
            } catch (Throwable th3) {
                try {
                    socket.setSoTimeout(soTimeout);
                } catch (Throwable th4) {
                    AbstractC1793a0.m2985m(th4);
                }
                throw th3;
            }
            m2985m = Boolean.valueOf(z8);
        } catch (Throwable th5) {
            m2985m = AbstractC1793a0.m2985m(th5);
        }
        Object obj = Boolean.FALSE;
        if (m2985m instanceof C1689h) {
            m2985m = obj;
        }
        return ((Boolean) m2985m).booleanValue();
    }

    /* renamed from: f */
    public static int m2151f(List list) {
        int size;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Socket socket = (Socket) it.next();
                    if (!m2150e(socket)) {
                        try {
                            socket.close();
                        } catch (Throwable th) {
                            AbstractC1793a0.m2985m(th);
                        }
                        it.remove();
                    }
                }
                size = list.size();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return size;
    }

    /* renamed from: c */
    public final C1281sn m2152c() {
        C1281sn c1281sn = (C1281sn) this.f7141f.getValue();
        return new C1281sn(c1281sn.f7627b, c1281sn.f7629d, c1281sn.f7630e, c1281sn.f7631f, c1281sn.f7632g, c1281sn.f7633h, c1281sn.f7634i, c1281sn.f7635j, "已停止，连接已清除", 195589);
    }

    /* renamed from: d */
    public final C1715p m2153d() {
        return this.f7142g;
    }

    /* renamed from: g */
    public final void m2154g(boolean z7) {
        Iterator it;
        this.f7137b.set(false);
        synchronized (this.f7139d) {
            try {
                List list = this.f7140e;
                if (list != null) {
                    synchronized (list) {
                        try {
                            it = list.iterator();
                        } catch (Throwable th) {
                            AbstractC1793a0.m2985m(th);
                        } finally {
                        }
                        while (it.hasNext()) {
                            ((Socket) it.next()).close();
                        }
                        list.clear();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C0565q1 c0565q1 = this.f7138c;
        if (c0565q1 != null) {
            c0565q1.mo1114c(null);
        }
        this.f7138c = null;
        if (z7) {
            C1701c0 c1701c0 = this.f7141f;
            C1281sn m2152c = m2152c();
            c1701c0.getClass();
            c1701c0.m2752j(null, m2152c);
        }
    }

    /* renamed from: h */
    public final void m2155h(C1281sn c1281sn) {
        C1701c0 c1701c0 = this.f7141f;
        c1701c0.getClass();
        c1701c0.m2752j(null, c1281sn);
    }
}
