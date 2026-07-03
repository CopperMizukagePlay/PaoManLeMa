package p159u6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p060h5.AbstractC1807o;
import p099m6.EnumC2624y;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u6.i */
/* loaded from: classes.dex */
public final class C3391i extends C3395m {

    /* renamed from: c */
    public final Method f16468c;

    /* renamed from: d */
    public final Method f16469d;

    /* renamed from: e */
    public final Method f16470e;

    /* renamed from: f */
    public final Class f16471f;

    /* renamed from: g */
    public final Class f16472g;

    public C3391i(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f16468c = method;
        this.f16469d = method2;
        this.f16470e = method3;
        this.f16471f = cls;
        this.f16472g = cls2;
    }

    @Override // p159u6.C3395m
    /* renamed from: a */
    public final void mo5127a(SSLSocket sSLSocket) {
        try {
            this.f16470e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to remove ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to remove ALPN", e8);
        }
    }

    @Override // p159u6.C3395m
    /* renamed from: d */
    public final void mo5115d(SSLSocket sSLSocket, String str, List list) {
        AbstractC3367j.m5100e(list, "protocols");
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
        try {
            this.f16468c.invoke(null, sSLSocket, Proxy.newProxyInstance(C3395m.class.getClassLoader(), new Class[]{this.f16471f, this.f16472g}, new C3390h(arrayList2)));
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to set ALPN", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to set ALPN", e8);
        }
    }

    @Override // p159u6.C3395m
    /* renamed from: f */
    public final String mo5116f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f16469d.invoke(null, sSLSocket));
            AbstractC3367j.m5098c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            C3390h c3390h = (C3390h) invocationHandler;
            boolean z7 = c3390h.f16466b;
            if (!z7 && c3390h.f16467c == null) {
                C3395m.m5156i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z7) {
                return null;
            }
            return c3390h.f16467c;
        } catch (IllegalAccessException e7) {
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        } catch (InvocationTargetException e8) {
            throw new AssertionError("failed to get ALPN selected protocol", e8);
        }
    }
}
