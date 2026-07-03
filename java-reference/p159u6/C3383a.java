package p159u6;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import p060h5.AbstractC1806n;
import p065i2.AbstractC2064e;
import p147t2.C3250c;
import p158u5.AbstractC3367j;
import p167v6.C3600b;
import p167v6.C3604f;
import p167v6.C3606h;
import p167v6.C3608j;
import p167v6.C3610l;
import p167v6.InterfaceC3611m;
import p189y6.C3853a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u6.a */
/* loaded from: classes.dex */
public final class C3383a extends C3395m {

    /* renamed from: d */
    public static final boolean f16453d;

    /* renamed from: c */
    public final ArrayList f16454c;

    static {
        boolean z7;
        if (C3250c.m4967e() && Build.VERSION.SDK_INT >= 29) {
            z7 = true;
        } else {
            z7 = false;
        }
        f16453d = z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3383a() {
        Object obj;
        if (C3250c.m4967e() && Build.VERSION.SDK_INT >= 29) {
            obj = new Object();
        } else {
            obj = null;
        }
        int i7 = 0;
        ArrayList m3068P = AbstractC1806n.m3068P(obj, new C3610l(C3604f.f17252f), new C3610l(C3608j.f17259a), new C3610l(C3606h.f17258a));
        ArrayList arrayList = new ArrayList();
        int size = m3068P.size();
        while (i7 < size) {
            Object obj2 = m3068P.get(i7);
            i7++;
            if (((InterfaceC3611m) obj2).mo5593c()) {
                arrayList.add(obj2);
            }
        }
        this.f16454c = arrayList;
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
    /* renamed from: d */
    public final void mo5115d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        AbstractC3367j.m5100e(list, "protocols");
        ArrayList arrayList = this.f16454c;
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
    /* renamed from: f */
    public final String mo5116f(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f16454c;
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
    /* renamed from: h */
    public final boolean mo5117h(String str) {
        AbstractC3367j.m5100e(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
