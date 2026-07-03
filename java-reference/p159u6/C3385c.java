package p159u6;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p060h5.AbstractC1806n;
import p065i2.AbstractC2064e;
import p098m5.C2586f;
import p147t2.C3250c;
import p158u5.AbstractC3367j;
import p167v6.C3600b;
import p167v6.C3604f;
import p167v6.C3606h;
import p167v6.C3608j;
import p167v6.C3610l;
import p167v6.InterfaceC3611m;
import p189y6.C3853a;
import p189y6.InterfaceC3856d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u6.c */
/* loaded from: classes.dex */
public final class C3385c extends C3395m {

    /* renamed from: e */
    public static final boolean f16457e;

    /* renamed from: c */
    public final ArrayList f16458c;

    /* renamed from: d */
    public final C2586f f16459d;

    static {
        boolean z7 = false;
        if (C3250c.m4967e() && Build.VERSION.SDK_INT < 30) {
            z7 = true;
        }
        f16457e = z7;
    }

    public C3385c() {
        C3604f c3604f;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            c3604f = new C3604f(cls);
        } catch (Exception e7) {
            C3395m.f16494a.getClass();
            C3395m.m5156i("unable to load android socket classes", 5, e7);
            c3604f = null;
        }
        int i7 = 0;
        ArrayList m3068P = AbstractC1806n.m3068P(c3604f, new C3610l(C3604f.f17252f), new C3610l(C3608j.f17259a), new C3610l(C3606h.f17258a));
        ArrayList arrayList = new ArrayList();
        int size = m3068P.size();
        while (i7 < size) {
            Object obj = m3068P.get(i7);
            i7++;
            if (((InterfaceC3611m) obj).mo5593c()) {
                arrayList.add(obj);
            }
        }
        this.f16458c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f16459d = new C2586f(method3, method2, method);
    }

    @Override // p159u6.C3395m
    /* renamed from: b */
    public final AbstractC2064e mo5114b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        C3600b c3600b = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            c3600b = new C3600b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (c3600b != null) {
            return c3600b;
        }
        return new C3853a(mo5119c(x509TrustManager));
    }

    @Override // p159u6.C3395m
    /* renamed from: c */
    public final InterfaceC3856d mo5119c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C3384b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo5119c(x509TrustManager);
        }
    }

    @Override // p159u6.C3395m
    /* renamed from: d */
    public final void mo5115d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        AbstractC3367j.m5100e(list, "protocols");
        ArrayList arrayList = this.f16458c;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                obj = arrayList.get(i7);
                i7++;
                if (((InterfaceC3611m) obj).mo5591a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC3611m interfaceC3611m = (InterfaceC3611m) obj;
        if (interfaceC3611m != null) {
            interfaceC3611m.mo5594d(sSLSocket, str, list);
        }
    }

    @Override // p159u6.C3395m
    /* renamed from: e */
    public final void mo5120e(Socket socket, InetSocketAddress inetSocketAddress, int i7) {
        AbstractC3367j.m5100e(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i7);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e7);
            }
            throw e7;
        }
    }

    @Override // p159u6.C3395m
    /* renamed from: f */
    public final String mo5116f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f16458c;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                obj = arrayList.get(i7);
                i7++;
                if (((InterfaceC3611m) obj).mo5591a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC3611m interfaceC3611m = (InterfaceC3611m) obj;
        if (interfaceC3611m == null) {
            return null;
        }
        return interfaceC3611m.mo5592b(sSLSocket);
    }

    @Override // p159u6.C3395m
    /* renamed from: g */
    public final Object mo5121g() {
        C2586f c2586f = this.f16459d;
        c2586f.getClass();
        Method method = c2586f.f14001a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = c2586f.f14002b;
                AbstractC3367j.m5097b(method2);
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // p159u6.C3395m
    /* renamed from: h */
    public final boolean mo5117h(String str) {
        AbstractC3367j.m5100e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // p159u6.C3395m
    /* renamed from: j */
    public final void mo5122j(Object obj, String str) {
        AbstractC3367j.m5100e(str, "message");
        C2586f c2586f = this.f16459d;
        c2586f.getClass();
        if (obj != null) {
            try {
                Method method = c2586f.f14003c;
                AbstractC3367j.m5097b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        C3395m.m5156i(str, 5, null);
    }
}
