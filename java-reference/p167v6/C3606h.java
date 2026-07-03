package p167v6;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p147t2.C3250c;
import p158u5.AbstractC3367j;
import p159u6.C3386d;
import p159u6.C3395m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v6.h */
/* loaded from: classes.dex */
public final class C3606h implements InterfaceC3611m {

    /* renamed from: a */
    public static final C3605g f17258a = new Object();

    @Override // p167v6.InterfaceC3611m
    /* renamed from: a */
    public final boolean mo5591a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: b */
    public final String mo5592b(SSLSocket sSLSocket) {
        boolean equals;
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
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
        boolean z7 = C3386d.f16460d;
        return C3386d.f16460d;
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: d */
    public final void mo5594d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3367j.m5100e(list, "protocols");
        if (mo5591a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C3395m c3395m = C3395m.f16494a;
            parameters.setApplicationProtocols((String[]) C3250c.m4965c(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
