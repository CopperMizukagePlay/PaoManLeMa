package p167v6;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v6.l */
/* loaded from: classes.dex */
public final class C3610l implements InterfaceC3611m {

    /* renamed from: a */
    public final InterfaceC3609k f17260a;

    /* renamed from: b */
    public InterfaceC3611m f17261b;

    public C3610l(InterfaceC3609k interfaceC3609k) {
        this.f17260a = interfaceC3609k;
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: a */
    public final boolean mo5591a(SSLSocket sSLSocket) {
        return this.f17260a.mo5595a(sSLSocket);
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: b */
    public final String mo5592b(SSLSocket sSLSocket) {
        InterfaceC3611m m5597e = m5597e(sSLSocket);
        if (m5597e != null) {
            return m5597e.mo5592b(sSLSocket);
        }
        return null;
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: c */
    public final boolean mo5593c() {
        return true;
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: d */
    public final void mo5594d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3367j.m5100e(list, "protocols");
        InterfaceC3611m m5597e = m5597e(sSLSocket);
        if (m5597e != null) {
            m5597e.mo5594d(sSLSocket, str, list);
        }
    }

    /* renamed from: e */
    public final synchronized InterfaceC3611m m5597e(SSLSocket sSLSocket) {
        try {
            if (this.f17261b == null && this.f17260a.mo5595a(sSLSocket)) {
                this.f17261b = this.f17260a.mo5596b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f17261b;
    }
}
