package p167v6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p024c6.AbstractC0434a;
import p147t2.C3250c;
import p158u5.AbstractC3367j;
import p159u6.C3385c;
import p159u6.C3395m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v6.f */
/* loaded from: classes.dex */
public class C3604f implements InterfaceC3611m {

    /* renamed from: f */
    public static final C3603e f17252f = new Object();

    /* renamed from: a */
    public final Class f17253a;

    /* renamed from: b */
    public final Method f17254b;

    /* renamed from: c */
    public final Method f17255c;

    /* renamed from: d */
    public final Method f17256d;

    /* renamed from: e */
    public final Method f17257e;

    public C3604f(Class cls) {
        this.f17253a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC3367j.m5099d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f17254b = declaredMethod;
        this.f17255c = cls.getMethod("setHostname", String.class);
        this.f17256d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f17257e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: a */
    public final boolean mo5591a(SSLSocket sSLSocket) {
        return this.f17253a.isInstance(sSLSocket);
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: b */
    public final String mo5592b(SSLSocket sSLSocket) {
        if (this.f17253a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f17256d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC0434a.f1477a);
                }
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e8) {
                Throwable cause = e8.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC3367j.m5096a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e8);
                }
            }
        }
        return null;
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: c */
    public final boolean mo5593c() {
        boolean z7 = C3385c.f16457e;
        return C3385c.f16457e;
    }

    @Override // p167v6.InterfaceC3611m
    /* renamed from: d */
    public final void mo5594d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3367j.m5100e(list, "protocols");
        if (this.f17253a.isInstance(sSLSocket)) {
            try {
                this.f17254b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f17255c.invoke(sSLSocket, str);
                }
                Method method = this.f17257e;
                C3395m c3395m = C3395m.f16494a;
                method.invoke(sSLSocket, C3250c.m4966d(list));
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e8) {
                throw new AssertionError(e8);
            }
        }
    }
}
