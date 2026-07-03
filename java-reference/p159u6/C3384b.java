package p159u6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import p158u5.AbstractC3367j;
import p189y6.InterfaceC3856d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u6.b */
/* loaded from: classes.dex */
public final class C3384b implements InterfaceC3856d {

    /* renamed from: a */
    public final X509TrustManager f16455a;

    /* renamed from: b */
    public final Method f16456b;

    public C3384b(X509TrustManager x509TrustManager, Method method) {
        this.f16455a = x509TrustManager;
        this.f16456b = method;
    }

    @Override // p189y6.InterfaceC3856d
    /* renamed from: a */
    public final X509Certificate mo5118a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f16456b.invoke(this.f16455a, x509Certificate);
            AbstractC3367j.m5098c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e7) {
            throw new AssertionError("unable to get issues and signature", e7);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3384b)) {
            return false;
        }
        C3384b c3384b = (C3384b) obj;
        if (AbstractC3367j.m5096a(this.f16455a, c3384b.f16455a) && AbstractC3367j.m5096a(this.f16456b, c3384b.f16456b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16456b.hashCode() + (this.f16455a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f16455a + ", findByIssuerAndSignatureMethod=" + this.f16456b + ')';
    }
}
