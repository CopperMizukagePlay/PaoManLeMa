package p006a7;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.z */
/* loaded from: classes.dex */
public final class C0143z extends C0123f {

    /* renamed from: m */
    public final Socket f567m;

    public C0143z(Socket socket) {
        this.f567m = socket;
    }

    @Override // p006a7.C0123f
    /* renamed from: k */
    public final void mo235k() {
        Socket socket = this.f567m;
        try {
            socket.close();
        } catch (AssertionError e7) {
            if (AbstractC0117b.m220e(e7)) {
                AbstractC0135r.f546a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e7);
                return;
            }
            throw e7;
        } catch (Exception e8) {
            AbstractC0135r.f546a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e8);
        }
    }

    /* renamed from: l */
    public final IOException m311l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
