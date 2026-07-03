package p039e5;

import android.net.Network;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p018c0.C0334d;
import p024c6.AbstractC0444k;
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
import p082k5.InterfaceC2313c;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.kl */
/* loaded from: classes.dex */
public final class C1031kl {

    /* renamed from: g */
    public static final SecureRandom f5303g = new SecureRandom();

    /* renamed from: a */
    public final C2090c f5304a;

    /* renamed from: b */
    public final AtomicBoolean f5305b;

    /* renamed from: c */
    public C0565q1 f5306c;

    /* renamed from: d */
    public final C1701c0 f5307d;

    /* renamed from: e */
    public final C1715p f5308e;

    /* renamed from: f */
    public final Set f5309f;

    public C1031kl() {
        C0568r1 m1124b = AbstractC0525d0.m1124b();
        C2325e c2325e = AbstractC0549l0.f1898a;
        this.f5304a = AbstractC0525d0.m1123a(AbstractC2080d.m3374B(m1124b, ExecutorC2324d.f13302g));
        this.f5305b = new AtomicBoolean(false);
        C1701c0 m2771b = AbstractC1719t.m2771b(new C1062ll(null, null, null, null, 65535));
        this.f5307d = m2771b;
        this.f5308e = new C1715p(m2771b);
        this.f5309f = AbstractC1793a0.m2971K("--", "失败", "服务器不支持", "服务器无效", "不支持", "未知");
    }

    /* renamed from: a */
    public static final void m1619a(C1031kl c1031kl, String str) {
        C1701c0 c1701c0 = c1031kl.f5307d;
        ArrayList m3036D0 = AbstractC1805m.m3036D0(((C1062ll) c1701c0.getValue()).f5699p);
        m3036D0.add(0, new C1464yk(System.currentTimeMillis(), str));
        if (m3036D0.size() > 100) {
            m3036D0.remove(AbstractC1806n.m3066N(m3036D0));
        }
        c1701c0.m2752j(null, C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, m3036D0, 32767));
    }

    /* renamed from: b */
    public static final void m1620b(C1031kl c1031kl, DatagramSocket datagramSocket, InetAddress inetAddress, Network network) {
        String str;
        datagramSocket.setReuseAddress(true);
        if (inetAddress instanceof Inet6Address) {
            str = "::";
        } else {
            str = "0.0.0.0";
        }
        datagramSocket.bind(new InetSocketAddress(InetAddress.getByName(str), 0));
        if (network != null) {
            network.bindSocket(datagramSocket);
        }
    }

    /* renamed from: e */
    public static final boolean m1623e(C1031kl c1031kl, C1433xk c1433xk, EnumC1495zk enumC1495zk, EnumC0748bl enumC0748bl) {
        Set set = c1031kl.f5309f;
        String str = c1433xk.f8838i;
        String str2 = c1433xk.f8832c;
        if (AbstractC3367j.m5096a(str, "探测完成")) {
            if (enumC1495zk == EnumC1495zk.f9910f) {
                if (AbstractC0444k.m937a0(str2) || set.contains(str2)) {
                    return false;
                }
                return true;
            }
            if (AbstractC3367j.m5096a(c1433xk.f8833d, "成功") && !set.contains(c1433xk.f8834e)) {
                if (enumC0748bl == EnumC0748bl.f2838f && set.contains(c1433xk.f8835f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public static final InetSocketAddress m1624f(C1031kl c1031kl, DatagramSocket datagramSocket, InetSocketAddress inetSocketAddress) {
        try {
            datagramSocket.connect(inetSocketAddress);
            InetSocketAddress inetSocketAddress2 = new InetSocketAddress(datagramSocket.getLocalAddress(), datagramSocket.getLocalPort());
            datagramSocket.disconnect();
            if (!inetSocketAddress2.getAddress().isAnyLocalAddress()) {
                return inetSocketAddress2;
            }
        } catch (Throwable th) {
            AbstractC1793a0.m2985m(th);
        }
        SocketAddress localSocketAddress = datagramSocket.getLocalSocketAddress();
        AbstractC3367j.m5098c(localSocketAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        return (InetSocketAddress) localSocketAddress;
    }

    /* renamed from: g */
    public static final Object m1625g(C1031kl c1031kl, InetSocketAddress inetSocketAddress, int i7, Network network, C1000jl c1000jl) {
        C2325e c2325e = AbstractC0549l0.f1898a;
        Object m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0939hl(c1031kl, inetSocketAddress, network, i7, null, 0), c1000jl);
        if (m1122A == EnumC2465a.f13750e) {
            return m1122A;
        }
        return C1694m.f10482a;
    }

    /* renamed from: h */
    public static final Object m1626h(C1031kl c1031kl, InetSocketAddress inetSocketAddress, int i7, Network network, C1000jl c1000jl) {
        C2325e c2325e = AbstractC0549l0.f1898a;
        Object m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0939hl(c1031kl, inetSocketAddress, network, i7, null, 1), c1000jl);
        if (m1122A == EnumC2465a.f13750e) {
            return m1122A;
        }
        return C1694m.f10482a;
    }

    /* renamed from: i */
    public static final Object m1627i(C1031kl c1031kl, InetSocketAddress inetSocketAddress, int i7, Network network, EnumC0748bl enumC0748bl, C1000jl c1000jl) {
        C2325e c2325e = AbstractC0549l0.f1898a;
        Object m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0334d(inetSocketAddress, c1031kl, enumC0748bl, i7, network, (InterfaceC2313c) null), c1000jl);
        if (m1122A == EnumC2465a.f13750e) {
            return m1122A;
        }
        return C1694m.f10482a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0907gl m1628j(C1031kl c1031kl, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, int i7, Network network, EnumC0748bl enumC0748bl) {
        Socket socket;
        Object obj;
        Throwable th;
        InputStream inputStream;
        byte[] bArr;
        byte[] copyOf;
        C0843el m2277o0;
        C0875fl m2191n = C1247rk.m2191n(6, true);
        Socket socket2 = new Socket();
        socket2.setReuseAddress(true);
        socket2.setSoTimeout(i7);
        Object obj2 = null;
        if (network != null) {
            try {
                network.bindSocket(socket2);
            } catch (Throwable th2) {
                th = th2;
                socket = null;
                obj = AbstractC1793a0.m2985m(th);
                if (!(obj instanceof C1689h)) {
                }
                C0907gl c0907gl = (C0907gl) obj2;
                if (socket != null) {
                }
                if (socket != socket2) {
                }
                return c0907gl;
            }
        }
        socket2.bind(inetSocketAddress);
        socket2.connect(inetSocketAddress2, i7);
        InetSocketAddress inetSocketAddress3 = new InetSocketAddress(socket2.getLocalAddress(), socket2.getLocalPort());
        if (enumC0748bl == EnumC0748bl.f2839g) {
            SocketFactory socketFactory = SSLSocketFactory.getDefault();
            AbstractC3367j.m5098c(socketFactory, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
            socket = ((SSLSocketFactory) socketFactory).createSocket(socket2, inetSocketAddress2.getHostString(), inetSocketAddress2.getPort(), true);
        } else {
            socket = socket2;
        }
        try {
            socket.setSoTimeout(i7);
            if (socket instanceof SSLSocket) {
                ((SSLSocket) socket).startHandshake();
            }
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(m2191n.f4038a);
            outputStream.flush();
            inputStream = socket.getInputStream();
            AbstractC3367j.m5099d(inputStream, "getInputStream(...)");
            bArr = new byte[20];
            int i8 = 0;
            while (true) {
                if (i8 >= 20) {
                    break;
                }
                int read = inputStream.read(bArr, i8, 20 - i8);
                if (read < 0) {
                    bArr = null;
                    break;
                }
                i8 += read;
            }
        } catch (Throwable th3) {
            th = th3;
            obj = AbstractC1793a0.m2985m(th);
            if (!(obj instanceof C1689h)) {
            }
            C0907gl c0907gl2 = (C0907gl) obj2;
            if (socket != null) {
            }
            if (socket != socket2) {
            }
            return c0907gl2;
        }
        if (bArr != null) {
            int m2195u = C1247rk.m2195u(2, bArr);
            byte[] bArr2 = new byte[m2195u];
            int i9 = 0;
            while (true) {
                if (i9 >= m2195u) {
                    break;
                }
                int read2 = inputStream.read(bArr2, i9, m2195u - i9);
                if (read2 < 0) {
                    bArr2 = null;
                    break;
                }
                i9 += read2;
            }
            if (bArr2 != null) {
                int length = bArr.length;
                int length2 = bArr2.length;
                copyOf = Arrays.copyOf(bArr, length + length2);
                System.arraycopy(bArr2, 0, copyOf, length, length2);
                AbstractC3367j.m5097b(copyOf);
                if (copyOf != null && (m2277o0 = AbstractC1249rm.m2277o0(copyOf, m2191n)) != null) {
                    obj = new C0907gl(inetSocketAddress3, inetSocketAddress2, m2277o0);
                    if (!(obj instanceof C1689h)) {
                        obj2 = obj;
                    }
                    C0907gl c0907gl22 = (C0907gl) obj2;
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (Throwable th4) {
                            AbstractC1793a0.m2985m(th4);
                        }
                    }
                    if (socket != socket2) {
                        try {
                            socket2.close();
                        } catch (Throwable th5) {
                            AbstractC1793a0.m2985m(th5);
                        }
                    }
                    return c0907gl22;
                }
                obj = null;
                if (!(obj instanceof C1689h)) {
                }
                C0907gl c0907gl222 = (C0907gl) obj2;
                if (socket != null) {
                }
                if (socket != socket2) {
                }
                return c0907gl222;
            }
        }
        copyOf = null;
        if (copyOf != null) {
            obj = new C0907gl(inetSocketAddress3, inetSocketAddress2, m2277o0);
            if (!(obj instanceof C1689h)) {
            }
            C0907gl c0907gl2222 = (C0907gl) obj2;
            if (socket != null) {
            }
            if (socket != socket2) {
            }
            return c0907gl2222;
        }
        obj = null;
        if (!(obj instanceof C1689h)) {
        }
        C0907gl c0907gl22222 = (C0907gl) obj2;
        if (socket != null) {
        }
        if (socket != socket2) {
        }
        return c0907gl22222;
    }

    /* renamed from: k */
    public static final C1433xk m1629k(C1031kl c1031kl, C1062ll c1062ll, EnumC1402wk enumC1402wk) {
        return new C1433xk(enumC1402wk, c1062ll.f5687d, c1062ll.f5693j, c1062ll.f5694k, c1062ll.f5695l, c1062ll.f5696m, c1062ll.f5690g, c1062ll.f5691h, c1062ll.f5697n);
    }

    /* renamed from: l */
    public static final C0907gl m1630l(C1031kl c1031kl, DatagramSocket datagramSocket, InetSocketAddress inetSocketAddress, C0875fl c0875fl, InetSocketAddress inetSocketAddress2) {
        Object obj;
        AtomicBoolean atomicBoolean = c1031kl.f5305b;
        if (!atomicBoolean.get()) {
            return null;
        }
        byte[] bArr = c0875fl.f4038a;
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, inetSocketAddress.getAddress(), inetSocketAddress.getPort());
        byte[] bArr2 = new byte[2048];
        for (int i7 = 0; i7 < 2 && atomicBoolean.get(); i7++) {
            datagramSocket.send(datagramPacket);
            DatagramPacket datagramPacket2 = new DatagramPacket(bArr2, 2048);
            try {
                datagramSocket.receive(datagramPacket2);
                obj = datagramPacket2;
            } catch (Throwable th) {
                obj = AbstractC1793a0.m2985m(th);
            }
            boolean z7 = obj instanceof C1689h;
            Object obj2 = obj;
            if (z7) {
                obj2 = null;
            }
            DatagramPacket datagramPacket3 = (DatagramPacket) obj2;
            if (datagramPacket3 != null) {
                byte[] data = datagramPacket3.getData();
                AbstractC3367j.m5099d(data, "getData(...)");
                byte[] copyOf = Arrays.copyOf(data, datagramPacket3.getLength());
                AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                C0843el m2277o0 = AbstractC1249rm.m2277o0(copyOf, c0875fl);
                if (m2277o0 != null) {
                    return new C0907gl(inetSocketAddress2, new InetSocketAddress(datagramPacket3.getAddress(), datagramPacket3.getPort()), m2277o0);
                }
            }
        }
        return null;
    }

    /* renamed from: m */
    public static final void m1631m(C1031kl c1031kl, C1062ll c1062ll) {
        C1701c0 c1701c0 = c1031kl.f5307d;
        c1701c0.getClass();
        c1701c0.m2752j(null, c1062ll);
    }

    /* renamed from: n */
    public final C1715p m1632n() {
        return this.f5308e;
    }

    /* renamed from: o */
    public final void m1633o(boolean z7) {
        this.f5305b.set(false);
        C0565q1 c0565q1 = this.f5306c;
        if (c0565q1 != null) {
            c0565q1.mo1114c(null);
        }
        this.f5306c = null;
        if (z7) {
            C1701c0 c1701c0 = this.f5307d;
            C1062ll m1635a = C1062ll.m1635a((C1062ll) c1701c0.getValue(), null, null, null, null, null, null, null, null, null, null, null, "已停止", null, null, 57342);
            c1701c0.getClass();
            c1701c0.m2752j(null, m1635a);
        }
    }
}
