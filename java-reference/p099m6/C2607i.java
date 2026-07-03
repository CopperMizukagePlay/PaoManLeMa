package p099m6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p060h5.AbstractC1805m;
import p076j5.C2178a;
import p106n6.AbstractC2721b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.i */
/* loaded from: classes.dex */
public final class C2607i {

    /* renamed from: e */
    public static final C2607i f14108e;

    /* renamed from: f */
    public static final C2607i f14109f;

    /* renamed from: a */
    public final boolean f14110a;

    /* renamed from: b */
    public final boolean f14111b;

    /* renamed from: c */
    public final String[] f14112c;

    /* renamed from: d */
    public final String[] f14113d;

    static {
        C2603g c2603g = C2603g.f14090r;
        C2603g c2603g2 = C2603g.f14091s;
        C2603g c2603g3 = C2603g.f14092t;
        C2603g c2603g4 = C2603g.f14084l;
        C2603g c2603g5 = C2603g.f14086n;
        C2603g c2603g6 = C2603g.f14085m;
        C2603g c2603g7 = C2603g.f14087o;
        C2603g c2603g8 = C2603g.f14089q;
        C2603g c2603g9 = C2603g.f14088p;
        C2603g[] c2603gArr = {c2603g, c2603g2, c2603g3, c2603g4, c2603g5, c2603g6, c2603g7, c2603g8, c2603g9};
        C2603g[] c2603gArr2 = {c2603g, c2603g2, c2603g3, c2603g4, c2603g5, c2603g6, c2603g7, c2603g8, c2603g9, C2603g.f14082j, C2603g.f14083k, C2603g.f14080h, C2603g.f14081i, C2603g.f14078f, C2603g.f14079g, C2603g.f14077e};
        C2605h c2605h = new C2605h();
        c2605h.m4151c((C2603g[]) Arrays.copyOf(c2603gArr, 9));
        EnumC2606h0 enumC2606h0 = EnumC2606h0.f14101f;
        EnumC2606h0 enumC2606h02 = EnumC2606h0.f14102g;
        c2605h.m4153e(enumC2606h0, enumC2606h02);
        c2605h.f14100d = true;
        c2605h.m4149a();
        C2605h c2605h2 = new C2605h();
        c2605h2.m4151c((C2603g[]) Arrays.copyOf(c2603gArr2, 16));
        c2605h2.m4153e(enumC2606h0, enumC2606h02);
        c2605h2.f14100d = true;
        f14108e = c2605h2.m4149a();
        C2605h c2605h3 = new C2605h();
        c2605h3.m4151c((C2603g[]) Arrays.copyOf(c2603gArr2, 16));
        c2605h3.m4153e(enumC2606h0, enumC2606h02, EnumC2606h0.f14103h, EnumC2606h0.f14104i);
        c2605h3.f14100d = true;
        c2605h3.m4149a();
        f14109f = new C2607i(false, false, null, null);
    }

    public C2607i(boolean z7, boolean z8, String[] strArr, String[] strArr2) {
        this.f14110a = z7;
        this.f14111b = z8;
        this.f14112c = strArr;
        this.f14113d = strArr2;
    }

    /* renamed from: a */
    public final List m4154a() {
        String[] strArr = this.f14112c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(C2603g.f14074b.m4128c(str));
            }
            return AbstractC1805m.m3035C0(arrayList);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m4155b(SSLSocket sSLSocket) {
        if (this.f14110a) {
            String[] strArr = this.f14113d;
            if (strArr == null || AbstractC2721b.m4364j(strArr, sSLSocket.getEnabledProtocols(), C2178a.f12607f)) {
                String[] strArr2 = this.f14112c;
                if (strArr2 != null && !AbstractC2721b.m4364j(strArr2, sSLSocket.getEnabledCipherSuites(), C2603g.f14075c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: c */
    public final List m4156c() {
        String[] strArr = this.f14113d;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(AbstractC2595c.m4133g(str));
            }
            return AbstractC1805m.m3035C0(arrayList);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2607i) {
            if (obj != this) {
                C2607i c2607i = (C2607i) obj;
                boolean z7 = c2607i.f14110a;
                boolean z8 = this.f14110a;
                if (z8 == z7) {
                    if (z8) {
                        if (!Arrays.equals(this.f14112c, c2607i.f14112c) || !Arrays.equals(this.f14113d, c2607i.f14113d) || this.f14111b != c2607i.f14111b) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        if (this.f14110a) {
            int i8 = 0;
            String[] strArr = this.f14112c;
            if (strArr != null) {
                i7 = Arrays.hashCode(strArr);
            } else {
                i7 = 0;
            }
            int i9 = (527 + i7) * 31;
            String[] strArr2 = this.f14113d;
            if (strArr2 != null) {
                i8 = Arrays.hashCode(strArr2);
            }
            return ((i9 + i8) * 31) + (!this.f14111b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        if (!this.f14110a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m4154a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m4156c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f14111b + ')';
    }
}
