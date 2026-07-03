package p167v6;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import p065i2.AbstractC2064e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v6.b */
/* loaded from: classes.dex */
public final class C3600b extends AbstractC2064e {

    /* renamed from: a */
    public final X509TrustManager f17247a;

    /* renamed from: b */
    public final X509TrustManagerExtensions f17248b;

    public C3600b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f17247a = x509TrustManager;
        this.f17248b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C3600b) && ((C3600b) obj).f17247a == this.f17247a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f17247a);
    }

    @Override // p065i2.AbstractC2064e
    /* renamed from: o */
    public final List mo3260o(String str, List list) {
        AbstractC3367j.m5100e(list, "chain");
        AbstractC3367j.m5100e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f17248b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            AbstractC3367j.m5099d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e7) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e7.getMessage());
            sSLPeerUnverifiedException.initCause(e7);
            throw sSLPeerUnverifiedException;
        }
    }
}
