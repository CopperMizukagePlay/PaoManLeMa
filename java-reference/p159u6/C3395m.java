package p159u6;

import android.util.Log;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p065i2.AbstractC2064e;
import p099m6.C2623x;
import p147t2.C3250c;
import p158u5.AbstractC3367j;
import p167v6.AbstractC3601c;
import p167v6.C3602d;
import p189y6.C3853a;
import p189y6.C3854b;
import p189y6.InterfaceC3856d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u6.m */
/* loaded from: classes.dex */
public class C3395m {

    /* renamed from: a */
    public static volatile C3395m f16494a;

    /* renamed from: b */
    public static final Logger f16495b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r0 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if (r0 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
    
        if (r0 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        if (java.lang.Integer.parseInt(r1) >= 9) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37, types: [u6.m] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    static {
        ?? r02;
        Level level;
        Object obj = null;
        if (C3250c.m4967e()) {
            for (Map.Entry entry : AbstractC3601c.f17250b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (AbstractC3601c.f17249a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    if (Log.isLoggable(str2, 3)) {
                        level = Level.FINE;
                    } else if (Log.isLoggable(str2, 4)) {
                        level = Level.INFO;
                    } else {
                        level = Level.WARNING;
                    }
                    logger.setLevel(level);
                    logger.addHandler(C3602d.f17251a);
                }
            }
            if (C3383a.f16453d) {
                r02 = new C3383a();
            } else {
                r02 = 0;
            }
            if (r02 == 0) {
                if (C3385c.f16457e) {
                    obj = new C3385c();
                }
                AbstractC3367j.m5097b(obj);
                r02 = obj;
            }
        } else {
            if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
                if (C3389g.f16463d) {
                    r02 = new C3389g();
                } else {
                    r02 = 0;
                }
            }
            if ("BC".equals(Security.getProviders()[0].getName())) {
                if (C3386d.f16460d) {
                    r02 = new C3386d();
                } else {
                    r02 = 0;
                }
            }
            if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                if (C3394l.f16492d) {
                    r02 = new C3394l();
                } else {
                    r02 = 0;
                }
            }
            if (C3392j.f16473c) {
                r02 = new Object();
            } else {
                r02 = 0;
            }
            if (r02 == 0) {
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    AbstractC3367j.m5099d(property, "jvmVersion");
                } catch (NumberFormatException unused) {
                }
            }
        }
        f16494a = r02;
        f16495b = Logger.getLogger(C2623x.class.getName());
        if (obj == null) {
            r02 = new Object();
            f16494a = r02;
            f16495b = Logger.getLogger(C2623x.class.getName());
        }
        r02 = obj;
        f16494a = r02;
        f16495b = Logger.getLogger(C2623x.class.getName());
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
            Method method = cls.getMethod("put", SSLSocket.class, cls2);
            Method method2 = cls.getMethod("get", SSLSocket.class);
            Method method3 = cls.getMethod("remove", SSLSocket.class);
            AbstractC3367j.m5099d(method, "putMethod");
            AbstractC3367j.m5099d(method2, "getMethod");
            AbstractC3367j.m5099d(method3, "removeMethod");
            AbstractC3367j.m5099d(cls3, "clientProviderClass");
            AbstractC3367j.m5099d(cls4, "serverProviderClass");
            obj = new C3391i(method, method2, method3, cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (obj == null) {
        }
        r02 = obj;
        f16494a = r02;
        f16495b = Logger.getLogger(C2623x.class.getName());
    }

    /* renamed from: i */
    public static void m5156i(String str, int i7, Throwable th) {
        Level level;
        AbstractC3367j.m5100e(str, "message");
        if (i7 == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f16495b.log(level, str, th);
    }

    /* renamed from: b */
    public AbstractC2064e mo5114b(X509TrustManager x509TrustManager) {
        return new C3853a(mo5119c(x509TrustManager));
    }

    /* renamed from: c */
    public InterfaceC3856d mo5119c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        AbstractC3367j.m5099d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C3854b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: d */
    public void mo5115d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3367j.m5100e(list, "protocols");
    }

    /* renamed from: e */
    public void mo5120e(Socket socket, InetSocketAddress inetSocketAddress, int i7) {
        AbstractC3367j.m5100e(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i7);
    }

    /* renamed from: f */
    public String mo5116f(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: g */
    public Object mo5121g() {
        if (f16495b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo5117h(String str) {
        AbstractC3367j.m5100e(str, "hostname");
        return true;
    }

    /* renamed from: j */
    public void mo5122j(Object obj, String str) {
        AbstractC3367j.m5100e(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m5156i(str, 5, (Throwable) obj);
    }

    /* renamed from: k */
    public SSLContext mo5123k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC3367j.m5099d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* renamed from: l */
    public SSLSocketFactory mo5126l(X509TrustManager x509TrustManager) {
        try {
            SSLContext mo5123k = mo5123k();
            mo5123k.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = mo5123k.getSocketFactory();
            AbstractC3367j.m5099d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e7) {
            throw new AssertionError("No System TLS: " + e7, e7);
        }
    }

    /* renamed from: m */
    public X509TrustManager mo5124m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    public void mo5127a(SSLSocket sSLSocket) {
    }
}
