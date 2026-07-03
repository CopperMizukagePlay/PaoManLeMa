package p167v6;

import javax.net.ssl.SSLSocket;
import p024c6.AbstractC0451r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v6.e */
/* loaded from: classes.dex */
public final class C3603e implements InterfaceC3609k {
    @Override // p167v6.InterfaceC3609k
    /* renamed from: a */
    public final boolean mo5595a(SSLSocket sSLSocket) {
        return AbstractC0451r.m971M(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p167v6.InterfaceC3609k
    /* renamed from: b */
    public final InterfaceC3611m mo5596b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C3604f(cls2);
    }
}
