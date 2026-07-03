package p167v6;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p159u6.C3389g;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v6.i */
/* loaded from: classes.dex */
public final class C3607i implements InterfaceC3609k {
    @Override // p167v6.InterfaceC3609k
    /* renamed from: a */
    public final boolean mo5595a(SSLSocket sSLSocket) {
        if (C3389g.f16463d && Conscrypt.isConscrypt(sSLSocket)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [v6.m, java.lang.Object] */
    @Override // p167v6.InterfaceC3609k
    /* renamed from: b */
    public final InterfaceC3611m mo5596b(SSLSocket sSLSocket) {
        return new Object();
    }
}
