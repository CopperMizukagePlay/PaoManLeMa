package p039e5;

import android.net.Network;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import p018c0.C0334d;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p040e6.C1507c;
import p047f6.C1554i;
import p047f6.InterfaceC1552g;
import p053g5.C1689h;
import p053g5.C1690i;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p069i6.AbstractC2100m;
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.wj */
/* loaded from: classes.dex */
public final class C1401wj extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f8475i = 1;

    /* renamed from: j */
    public /* synthetic */ Object f8476j;

    /* renamed from: k */
    public int f8477k;

    /* renamed from: l */
    public final /* synthetic */ int f8478l;

    /* renamed from: m */
    public final /* synthetic */ Object f8479m;

    /* renamed from: n */
    public final /* synthetic */ Object f8480n;

    /* renamed from: o */
    public final /* synthetic */ Object f8481o;

    /* renamed from: p */
    public final /* synthetic */ Object f8482p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401wj(C1219qn c1219qn, InetAddress inetAddress, int i7, int i8, Network network, InterfaceC1552g interfaceC1552g, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f8479m = c1219qn;
        this.f8480n = inetAddress;
        this.f8477k = i7;
        this.f8478l = i8;
        this.f8481o = network;
        this.f8482p = interfaceC1552g;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f8475i) {
            case 0:
                return ((C1401wj) mo28k((C0942ho) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                C1401wj c1401wj = (C1401wj) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2);
                C1694m c1694m = C1694m.f10482a;
                c1401wj.mo29m(c1694m);
                return c1694m;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f8475i) {
            case 0:
                C1401wj c1401wj = new C1401wj((AtomicLong) this.f8479m, this.f8478l, (C2349d1) this.f8480n, (InterfaceC2425y0) this.f8481o, (InterfaceC2425y0) this.f8482p, interfaceC2313c);
                c1401wj.f8476j = obj;
                return c1401wj;
            default:
                C1401wj c1401wj2 = new C1401wj((C1219qn) this.f8479m, (InetAddress) this.f8480n, this.f8477k, this.f8478l, (Network) this.f8481o, (InterfaceC1552g) this.f8482p, interfaceC2313c);
                c1401wj2.f8476j = obj;
                return c1401wj2;
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        Object obj2;
        switch (this.f8475i) {
            case 0:
                AtomicLong atomicLong = (AtomicLong) this.f8479m;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                int i7 = this.f8477k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C0942ho c0942ho = (C0942ho) this.f8476j;
                    long currentTimeMillis = System.currentTimeMillis();
                    long j6 = atomicLong.get();
                    if (currentTimeMillis - j6 >= 120 && atomicLong.compareAndSet(j6, currentTimeMillis)) {
                        C2325e c2325e = AbstractC0549l0.f1898a;
                        C1507c c1507c = AbstractC2100m.f12376a;
                        C0334d c0334d = new C0334d(this.f8478l, c0942ho, (C2349d1) this.f8480n, (InterfaceC2425y0) this.f8481o, (InterfaceC2425y0) this.f8482p, null, 11);
                        this.f8477k = 1;
                        if (AbstractC0525d0.m1122A(c1507c, c0334d, this) == enumC2465a) {
                            return enumC2465a;
                        }
                    }
                }
                return C1694m.f10482a;
            default:
                AbstractC1793a0.m2972L(obj);
                C1219qn c1219qn = (C1219qn) this.f8479m;
                InetAddress inetAddress = (InetAddress) this.f8480n;
                int i8 = this.f8477k;
                int i9 = this.f8478l;
                Network network = (Network) this.f8481o;
                try {
                    Socket socket = new Socket();
                    synchronized (c1219qn.f7139d) {
                        List list = c1219qn.f7140e;
                        if (list != null) {
                            list.add(socket);
                        }
                    }
                    try {
                        socket.setTcpNoDelay(true);
                        socket.setKeepAlive(true);
                        if (network != null) {
                            network.bindSocket(socket);
                        }
                        socket.connect(new InetSocketAddress(inetAddress, i8), i9);
                        obj2 = socket;
                        if (!c1219qn.f7137b.get()) {
                            synchronized (c1219qn.f7139d) {
                                List list2 = c1219qn.f7140e;
                                if (list2 != null) {
                                    list2.remove(socket);
                                }
                            }
                            try {
                                socket.close();
                            } catch (Throwable th) {
                                AbstractC1793a0.m2985m(th);
                            }
                            throw new IllegalStateException("测试已停止");
                        }
                    } catch (Throwable th2) {
                        synchronized (c1219qn.f7139d) {
                            List list3 = c1219qn.f7140e;
                            if (list3 != null) {
                                list3.remove(socket);
                            }
                            try {
                                socket.close();
                                throw th2;
                            } catch (Throwable th3) {
                                AbstractC1793a0.m2985m(th3);
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    obj2 = AbstractC1793a0.m2985m(th4);
                }
                if (((InterfaceC1552g) this.f8482p).mo2505v(new C1690i(obj2)) instanceof C1554i) {
                    boolean z7 = obj2 instanceof C1689h;
                    Object obj3 = obj2;
                    if (z7) {
                        obj3 = null;
                    }
                    Socket socket2 = (Socket) obj3;
                    if (socket2 != null) {
                        C1219qn c1219qn2 = (C1219qn) this.f8479m;
                        synchronized (c1219qn2.f7139d) {
                            List list4 = c1219qn2.f7140e;
                            if (list4 != null) {
                                list4.remove(socket2);
                            }
                        }
                        try {
                            socket2.close();
                        } catch (Throwable th5) {
                            AbstractC1793a0.m2985m(th5);
                        }
                    }
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401wj(AtomicLong atomicLong, int i7, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f8479m = atomicLong;
        this.f8478l = i7;
        this.f8480n = c2349d1;
        this.f8481o = interfaceC2425y0;
        this.f8482p = interfaceC2425y02;
    }
}
