package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.xk */
/* loaded from: classes.dex */
public final class C1433xk {

    /* renamed from: a */
    public final EnumC1402wk f8830a;

    /* renamed from: b */
    public final EnumC0748bl f8831b;

    /* renamed from: c */
    public final String f8832c;

    /* renamed from: d */
    public final String f8833d;

    /* renamed from: e */
    public final String f8834e;

    /* renamed from: f */
    public final String f8835f;

    /* renamed from: g */
    public final String f8836g;

    /* renamed from: h */
    public final String f8837h;

    /* renamed from: i */
    public final String f8838i;

    public /* synthetic */ C1433xk(EnumC1402wk enumC1402wk, EnumC0748bl enumC0748bl, String str, String str2, String str3, String str4, String str5, int i7) {
        this(enumC1402wk, enumC0748bl, (i7 & 4) != 0 ? "--" : str, (i7 & 8) != 0 ? "--" : str2, (i7 & 16) != 0 ? "--" : str3, (i7 & 32) != 0 ? "--" : str4, "", "", str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1433xk)) {
            return false;
        }
        C1433xk c1433xk = (C1433xk) obj;
        if (this.f8830a == c1433xk.f8830a && this.f8831b == c1433xk.f8831b && AbstractC3367j.m5096a(this.f8832c, c1433xk.f8832c) && AbstractC3367j.m5096a(this.f8833d, c1433xk.f8833d) && AbstractC3367j.m5096a(this.f8834e, c1433xk.f8834e) && AbstractC3367j.m5096a(this.f8835f, c1433xk.f8835f) && AbstractC3367j.m5096a(this.f8836g, c1433xk.f8836g) && AbstractC3367j.m5096a(this.f8837h, c1433xk.f8837h) && AbstractC3367j.m5096a(this.f8838i, c1433xk.f8838i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8838i.hashCode() + AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b((this.f8831b.hashCode() + (this.f8830a.hashCode() * 31)) * 31, 31, this.f8832c), 31, this.f8833d), 31, this.f8834e), 31, this.f8835f), 31, this.f8836g), 31, this.f8837h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NatFamilyResult(family=");
        sb.append(this.f8830a);
        sb.append(", transport=");
        sb.append(this.f8831b);
        sb.append(", natType=");
        AbstractC2487d.m4057u(sb, this.f8832c, ", bindingResult=", this.f8833d, ", mappingBehavior=");
        AbstractC2487d.m4057u(sb, this.f8834e, ", filteringBehavior=", this.f8835f, ", localEndpoint=");
        AbstractC2487d.m4057u(sb, this.f8836g, ", publicEndpoint=", this.f8837h, ", status=");
        return AbstractC2487d.m4046j(sb, this.f8838i, ")");
    }

    public C1433xk(EnumC1402wk enumC1402wk, EnumC0748bl enumC0748bl, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC3367j.m5100e(enumC1402wk, "family");
        AbstractC3367j.m5100e(enumC0748bl, "transport");
        AbstractC3367j.m5100e(str, "natType");
        AbstractC3367j.m5100e(str2, "bindingResult");
        AbstractC3367j.m5100e(str3, "mappingBehavior");
        AbstractC3367j.m5100e(str4, "filteringBehavior");
        AbstractC3367j.m5100e(str5, "localEndpoint");
        AbstractC3367j.m5100e(str6, "publicEndpoint");
        AbstractC3367j.m5100e(str7, "status");
        this.f8830a = enumC1402wk;
        this.f8831b = enumC0748bl;
        this.f8832c = str;
        this.f8833d = str2;
        this.f8834e = str3;
        this.f8835f = str4;
        this.f8836g = str5;
        this.f8837h = str6;
        this.f8838i = str7;
    }
}
