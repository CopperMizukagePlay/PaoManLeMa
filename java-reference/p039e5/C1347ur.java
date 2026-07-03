package p039e5;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import p060h5.AbstractC1793a0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ur */
/* loaded from: classes.dex */
public final class C1347ur extends SocketFactory {

    /* renamed from: a */
    public final SocketFactory f8010a;

    /* renamed from: b */
    public final int f8011b;

    /* renamed from: c */
    public final InetAddress f8012c;

    public C1347ur(SocketFactory socketFactory, int i7, InetAddress inetAddress) {
        this.f8010a = socketFactory;
        this.f8011b = i7;
        this.f8012c = inetAddress;
    }

    /* renamed from: a */
    public final Socket m2367a() {
        Socket createSocket = this.f8010a.createSocket();
        try {
            createSocket.setReuseAddress(true);
            createSocket.bind(new InetSocketAddress(this.f8012c, this.f8011b));
            return createSocket;
        } catch (Throwable th) {
            try {
                createSocket.close();
            } catch (Throwable th2) {
                AbstractC1793a0.m2985m(th2);
            }
            throw th;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return m2367a();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i7) {
        return m2367a();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i7, InetAddress inetAddress, int i8) {
        return m2367a();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7) {
        return m2367a();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i7, InetAddress inetAddress2, int i8) {
        return m2367a();
    }
}
