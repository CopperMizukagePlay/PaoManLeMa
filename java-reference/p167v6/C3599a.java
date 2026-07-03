package p167v6;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p147t2.C3250c;
import p158u5.AbstractC3367j;
import p159u6.C3395m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v6.a */
/* loaded from: classes.dex */
public final class C3599a implements InterfaceC3611m {
    @Override // p167v6.InterfaceC3611m
    /* renamed from: a */
    public final boolean mo5591a(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: b */
    public final String mo5592b(SSLSocket sSLSocket) {
        String applicationProtocol;
        boolean equals;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null) {
            equals = true;
        } else {
            equals = applicationProtocol.equals("");
        }
        if (equals) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: c */
    public final boolean mo5593c() {
        C3395m c3395m = C3395m.f16494a;
        if (C3250c.m4967e() && Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: d */
    public final void mo5594d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3367j.m5100e(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C3395m c3395m = C3395m.f16494a;
            sSLParameters.setApplicationProtocols((String[]) C3250c.m4965c(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e7) {
            throw new IOException("Android internal error", e7);
        }
    }
}
