package p099m6;

import java.util.ArrayList;
import java.util.Arrays;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.h */
/* loaded from: classes.dex */
public final class C2605h {

    /* renamed from: a */
    public boolean f14097a = true;

    /* renamed from: b */
    public String[] f14098b;

    /* renamed from: c */
    public String[] f14099c;

    /* renamed from: d */
    public boolean f14100d;

    /* renamed from: a */
    public final C2607i m4149a() {
        return new C2607i(this.f14097a, this.f14100d, this.f14098b, this.f14099c);
    }

    /* renamed from: b */
    public final void m4150b(String... strArr) {
        AbstractC3367j.m5100e(strArr, "cipherSuites");
        if (this.f14097a) {
            if (strArr.length != 0) {
                this.f14098b = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections");
    }

    /* renamed from: c */
    public final void m4151c(C2603g... c2603gArr) {
        AbstractC3367j.m5100e(c2603gArr, "cipherSuites");
        if (this.f14097a) {
            ArrayList arrayList = new ArrayList(c2603gArr.length);
            for (C2603g c2603g : c2603gArr) {
                arrayList.add(c2603g.f14093a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            m4150b((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections");
    }

    /* renamed from: d */
    public final void m4152d(String... strArr) {
        AbstractC3367j.m5100e(strArr, "tlsVersions");
        if (this.f14097a) {
            if (strArr.length != 0) {
                this.f14099c = (String[]) strArr.clone();
                return;
            }
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections");
    }

    /* renamed from: e */
    public final void m4153e(EnumC2606h0... enumC2606h0Arr) {
        if (this.f14097a) {
            ArrayList arrayList = new ArrayList(enumC2606h0Arr.length);
            for (EnumC2606h0 enumC2606h0 : enumC2606h0Arr) {
                arrayList.add(enumC2606h0.f14107e);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            m4152d((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections");
    }
}
