package p039e5;

import java.net.Socket;
import p099m6.AbstractC2614o;
import p128q6.C3006i;
import p128q6.C3009l;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.xr */
/* loaded from: classes.dex */
public final class C1440xr extends AbstractC2614o {

    /* renamed from: b */
    public final /* synthetic */ C1100ms f9206b;

    public C1440xr(C1100ms c1100ms) {
        this.f9206b = c1100ms;
    }

    @Override // p099m6.AbstractC2614o
    /* renamed from: a */
    public final void mo2422a(C3006i c3006i, C3009l c3009l) {
        String str;
        String hostAddress;
        C1471yr c1471yr;
        AbstractC3367j.m5100e(c3009l, "connection");
        C0916gu c0916gu = (C0916gu) C0916gu.class.cast(c3006i.f15495f.f14022e.get(C0916gu.class));
        if (c0916gu != null && (str = c0916gu.f4386a) != null && (hostAddress = c3009l.f15516b.f14096c.getAddress().getHostAddress()) != null) {
            C1471yr c1471yr2 = (C1471yr) this.f9206b.f6037P0.get(str);
            if (c1471yr2 != null) {
                c1471yr2.f9770f = hostAddress;
            }
            C1100ms c1100ms = this.f9206b;
            Socket socket = c3009l.f15518d;
            AbstractC3367j.m5097b(socket);
            int localPort = socket.getLocalPort();
            if (localPort > 0 && (c1471yr = (C1471yr) c1100ms.f6037P0.get(str)) != null) {
                c1471yr.f9771g = localPort;
            }
        }
    }
}
