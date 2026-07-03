package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.pm */
/* loaded from: classes.dex */
public final class C1187pm {

    /* renamed from: a */
    public final EnumC1032km f6903a;

    /* renamed from: b */
    public final String f6904b;

    /* renamed from: c */
    public final String f6905c;

    /* renamed from: d */
    public final String f6906d;

    /* renamed from: e */
    public final Double f6907e;

    /* renamed from: f */
    public final EnumC0876fm f6908f;

    public C1187pm(EnumC1032km enumC1032km, String str, String str2, String str3, Double d7, EnumC0876fm enumC0876fm) {
        AbstractC3367j.m5100e(enumC1032km, "stack");
        AbstractC3367j.m5100e(str, "target");
        AbstractC3367j.m5100e(str2, "resolved");
        AbstractC3367j.m5100e(str3, "displayPrefix");
        AbstractC3367j.m5100e(enumC0876fm, "congestionLevel");
        this.f6903a = enumC1032km;
        this.f6904b = str;
        this.f6905c = str2;
        this.f6906d = str3;
        this.f6907e = d7;
        this.f6908f = enumC0876fm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1187pm)) {
            return false;
        }
        C1187pm c1187pm = (C1187pm) obj;
        if (this.f6903a == c1187pm.f6903a && AbstractC3367j.m5096a(this.f6904b, c1187pm.f6904b) && AbstractC3367j.m5096a(this.f6905c, c1187pm.f6905c) && AbstractC3367j.m5096a(this.f6906d, c1187pm.f6906d) && AbstractC3367j.m5096a(this.f6907e, c1187pm.f6907e) && this.f6908f == c1187pm.f6908f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m175b = AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(this.f6903a.hashCode() * 31, 31, this.f6904b), 31, this.f6905c), 31, this.f6906d);
        Double d7 = this.f6907e;
        if (d7 == null) {
            hashCode = 0;
        } else {
            hashCode = d7.hashCode();
        }
        return this.f6908f.hashCode() + ((m175b + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PingStackProbe(stack=");
        sb.append(this.f6903a);
        sb.append(", target=");
        sb.append(this.f6904b);
        sb.append(", resolved=");
        AbstractC2487d.m4057u(sb, this.f6905c, ", displayPrefix=", this.f6906d, ", rttMs=");
        sb.append(this.f6907e);
        sb.append(", congestionLevel=");
        sb.append(this.f6908f);
        sb.append(")");
        return sb.toString();
    }
}
