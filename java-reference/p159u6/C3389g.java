package p159u6;

import java.security.KeyStore;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;
import p060h5.AbstractC1807o;
import p099m6.EnumC2624y;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u6.g */
/* loaded from: classes.dex */
public final class C3389g extends C3395m {

    /* renamed from: d */
    public static final boolean f16463d;

    /* renamed from: c */
    public final Provider f16464c;

    static {
        boolean z7 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC3387e.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (AbstractC3387e.m5125a()) {
                    z7 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f16463d = z7;
    }

    public C3389g() {
        Provider newProvider = Conscrypt.newProvider();
        AbstractC3367j.m5099d(newProvider, "newProvider()");
        this.f16464c = newProvider;
    }

    @Override // p159u6.C3395m
    /* renamed from: d */
    public final void mo5115d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3367j.m5100e(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((EnumC2624y) obj) != EnumC2624y.f14222f) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(arrayList));
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj2 = arrayList.get(i7);
                i7++;
                arrayList2.add(((EnumC2624y) obj2).f14229e);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    @Override // p159u6.C3395m
    /* renamed from: f */
    public final String mo5116f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p159u6.C3395m
    /* renamed from: k */
    public final SSLContext mo5123k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f16464c);
        AbstractC3367j.m5099d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p159u6.C3395m
    /* renamed from: l */
    public final SSLSocketFactory mo5126l(X509TrustManager x509TrustManager) {
        SSLContext mo5123k = mo5123k();
        mo5123k.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = mo5123k.getSocketFactory();
        AbstractC3367j.m5099d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p159u6.C3395m
    /* renamed from: m */
    public final X509TrustManager mo5124m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC3367j.m5097b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC3367j.m5098c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, C3388f.f16462a);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        AbstractC3367j.m5099d(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}
