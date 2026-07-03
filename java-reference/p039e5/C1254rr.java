package p039e5;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import p060h5.AbstractC1793a0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.rr */
/* loaded from: classes.dex */
public final class C1254rr extends SocketFactory {

    /* renamed from: a */
    public final SocketFactory f7433a;

    /* renamed from: b */
    public final int f7434b;

    public C1254rr(SocketFactory socketFactory, int i7) {
        this.f7433a = socketFactory;
        this.f7434b = i7;
    }

    /* renamed from: a */
    public final void m2301a(Socket socket) {
        int i7 = this.f7434b;
        try {
            socket.setReceiveBufferSize(i7);
        } catch (Throwable th) {
            AbstractC1793a0.m2985m(th);
        }
        try {
            socket.setSendBufferSize(i7);
        } catch (Throwable th2) {
            AbstractC1793a0.m2985m(th2);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        Socket createSocket = this.f7433a.createSocket();
        AbstractC3367j.m5099d(createSocket, "createSocket(...)");
        m2301a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i7) {
        Socket createSocket = this.f7433a.createSocket(str, i7);
        AbstractC3367j.m5099d(createSocket, "createSocket(...)");
        m2301a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i7, InetAddress inetAddress, int i8) {
        Socket createSocket = this.f7433a.createSocket(str, i7, inetAddress, i8);
        AbstractC3367j.m5099d(createSocket, "createSocket(...)");
        m2301a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7) {
        Socket createSocket = this.f7433a.createSocket(inetAddress, i7);
        AbstractC3367j.m5099d(createSocket, "createSocket(...)");
        m2301a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7, InetAddress inetAddress2, int i8) {
        Socket createSocket = this.f7433a.createSocket(inetAddress, i7, inetAddress2, i8);
        AbstractC3367j.m5099d(createSocket, "createSocket(...)");
        m2301a(createSocket);
        return createSocket;
    }
}
