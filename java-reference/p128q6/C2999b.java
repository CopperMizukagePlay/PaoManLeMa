package p128q6;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p076j5.C2178a;
import p099m6.C2601f;
import p099m6.C2603g;
import p099m6.C2607i;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q6.b */
/* loaded from: classes.dex */
public final class C2999b {

    /* renamed from: a */
    public final List f15466a;

    /* renamed from: b */
    public int f15467b;

    /* renamed from: c */
    public boolean f15468c;

    /* renamed from: d */
    public boolean f15469d;

    public C2999b(List list) {
        AbstractC3367j.m5100e(list, "connectionSpecs");
        this.f15466a = list;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [m6.h, java.lang.Object] */
    /* renamed from: a */
    public final C2607i m4666a(SSLSocket sSLSocket) {
        C2607i c2607i;
        int i7;
        boolean z7;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i8 = this.f15467b;
        List list = this.f15466a;
        int size = list.size();
        while (true) {
            if (i8 < size) {
                c2607i = (C2607i) list.get(i8);
                if (c2607i.m4155b(sSLSocket)) {
                    this.f15467b = i8 + 1;
                    break;
                }
                i8++;
            } else {
                c2607i = null;
                break;
            }
        }
        if (c2607i != null) {
            int i9 = this.f15467b;
            int size2 = list.size();
            while (true) {
                i7 = 0;
                if (i9 < size2) {
                    if (((C2607i) list.get(i9)).m4155b(sSLSocket)) {
                        z7 = true;
                        break;
                    }
                    i9++;
                } else {
                    z7 = false;
                    break;
                }
            }
            this.f15468c = z7;
            boolean z8 = this.f15469d;
            String[] strArr = c2607i.f14113d;
            String[] strArr2 = c2607i.f14112c;
            if (strArr2 != null) {
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                AbstractC3367j.m5099d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
                enabledCipherSuites = AbstractC2721b.m4370p(enabledCipherSuites2, strArr2, C2603g.f14075c);
            } else {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            if (strArr != null) {
                String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
                AbstractC3367j.m5099d(enabledProtocols2, "sslSocket.enabledProtocols");
                enabledProtocols = AbstractC2721b.m4370p(enabledProtocols2, strArr, C2178a.f12607f);
            } else {
                enabledProtocols = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            AbstractC3367j.m5099d(supportedCipherSuites, "supportedCipherSuites");
            C2601f c2601f = C2603g.f14075c;
            byte[] bArr = AbstractC2721b.f14569a;
            int length = supportedCipherSuites.length;
            while (true) {
                if (i7 < length) {
                    if (c2601f.compare(supportedCipherSuites[i7], "TLS_FALLBACK_SCSV") == 0) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (z8 && i7 != -1) {
                AbstractC3367j.m5099d(enabledCipherSuites, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i7];
                AbstractC3367j.m5099d(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
                AbstractC3367j.m5099d(copyOf, "copyOf(this, newSize)");
                enabledCipherSuites = (String[]) copyOf;
                enabledCipherSuites[enabledCipherSuites.length - 1] = str;
            }
            ?? obj = new Object();
            obj.f14097a = c2607i.f14110a;
            obj.f14098b = strArr2;
            obj.f14099c = strArr;
            obj.f14100d = c2607i.f14111b;
            AbstractC3367j.m5099d(enabledCipherSuites, "cipherSuitesIntersection");
            obj.m4150b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
            AbstractC3367j.m5099d(enabledProtocols, "tlsVersionsIntersection");
            obj.m4152d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
            C2607i m4149a = obj.m4149a();
            if (m4149a.m4156c() != null) {
                sSLSocket.setEnabledProtocols(m4149a.f14113d);
            }
            if (m4149a.m4154a() != null) {
                sSLSocket.setEnabledCipherSuites(m4149a.f14112c);
            }
            return c2607i;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f15469d);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
        AbstractC3367j.m5097b(enabledProtocols3);
        String arrays = Arrays.toString(enabledProtocols3);
        AbstractC3367j.m5099d(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }
}
