package p159u6;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u6.l */
/* loaded from: classes.dex */
public final class C3394l extends C3395m {

    /* renamed from: d */
    public static final boolean f16492d;

    /* renamed from: c */
    public final Provider f16493c = new OpenJSSE();

    static {
        boolean z7 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, AbstractC3393k.class.getClassLoader());
            z7 = true;
        } catch (ClassNotFoundException unused) {
        }
        f16492d = z7;
    }

    @Override // p159u6.C3395m
    /* renamed from: d */
    public final void mo5115d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3367j.m5100e(list, "protocols");
    }

    @Override // p159u6.C3395m
    /* renamed from: f */
    public final String mo5116f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p159u6.C3395m
    /* renamed from: k */
    public final SSLContext mo5123k() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f16493c);
        AbstractC3367j.m5099d(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // p159u6.C3395m
    /* renamed from: m */
    public final X509TrustManager mo5124m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f16493c);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC3367j.m5097b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC3367j.m5098c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        AbstractC3367j.m5099d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
