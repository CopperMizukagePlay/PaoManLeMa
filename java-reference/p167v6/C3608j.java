package p167v6;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p147t2.C3250c;
import p158u5.AbstractC3367j;
import p159u6.C3389g;
import p159u6.C3395m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v6.j */
/* loaded from: classes.dex */
public final class C3608j implements InterfaceC3611m {

    /* renamed from: a */
    public static final C3607i f17259a = new Object();

    @Override // p167v6.InterfaceC3611m
    /* renamed from: a */
    public final boolean mo5591a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: b */
    public final String mo5592b(SSLSocket sSLSocket) {
        if (mo5591a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: c */
    public final boolean mo5593c() {
        boolean z7 = C3389g.f16463d;
        return C3389g.f16463d;
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: d */
    public final void mo5594d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3367j.m5100e(list, "protocols");
        if (mo5591a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C3395m c3395m = C3395m.f16494a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C3250c.m4965c(list).toArray(new String[0]));
        }
    }
}
