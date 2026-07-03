package p039e5;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ss */
/* loaded from: classes.dex */
public final class C1286ss {

    /* renamed from: a */
    public final EnumC1032km f7664a;

    /* renamed from: b */
    public final String f7665b;

    /* renamed from: c */
    public final String f7666c;

    /* renamed from: d */
    public final String f7667d;

    public C1286ss(EnumC1032km enumC1032km, String str, String str2, String str3) {
        AbstractC3367j.m5100e(str, "target");
        AbstractC3367j.m5100e(str2, "resolved");
        this.f7664a = enumC1032km;
        this.f7665b = str;
        this.f7666c = str2;
        this.f7667d = str3;
    }

    /* renamed from: a */
    public final C1187pm m2333a(C1317ts c1317ts, EnumC0876fm enumC0876fm) {
        AbstractC3367j.m5100e(enumC0876fm, "level");
        Double valueOf = Double.valueOf(c1317ts.f7864b);
        if (!c1317ts.f7863a) {
            valueOf = null;
        }
        return new C1187pm(this.f7664a, this.f7665b, this.f7666c, this.f7667d, valueOf, enumC0876fm);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1286ss)) {
            return false;
        }
        C1286ss c1286ss = (C1286ss) obj;
        if (this.f7664a == c1286ss.f7664a && AbstractC3367j.m5096a(this.f7665b, c1286ss.f7665b) && AbstractC3367j.m5096a(this.f7666c, c1286ss.f7666c) && AbstractC3367j.m5096a(this.f7667d, c1286ss.f7667d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7667d.hashCode() + AbstractC0094y0.m175b(AbstractC0094y0.m175b(this.f7664a.hashCode() * 31, 31, this.f7665b), 31, this.f7666c);
    }

    public final String toString() {
        return "PingStackEndpoint(stack=" + this.f7664a + ", target=" + this.f7665b + ", resolved=" + this.f7666c + ", displayPrefix=" + this.f7667d + ")";
    }
}
