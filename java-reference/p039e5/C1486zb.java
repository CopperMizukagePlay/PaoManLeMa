package p039e5;

import java.util.List;
import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.zb */
/* loaded from: classes.dex */
public final class C1486zb {

    /* renamed from: a */
    public final String f9844a;

    /* renamed from: b */
    public final String f9845b;

    /* renamed from: c */
    public final List f9846c;

    /* renamed from: d */
    public final List f9847d;

    /* renamed from: e */
    public final EnumC0908gm f9848e;

    public C1486zb(String str, String str2, List list, List list2, EnumC0908gm enumC0908gm) {
        AbstractC3367j.m5100e(str, "targetId");
        AbstractC3367j.m5100e(str2, "targetName");
        AbstractC3367j.m5100e(list, "gatewayProbes");
        AbstractC3367j.m5100e(list2, "externalProbes");
        this.f9844a = str;
        this.f9845b = str2;
        this.f9846c = list;
        this.f9847d = list2;
        this.f9848e = enumC0908gm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1486zb)) {
            return false;
        }
        C1486zb c1486zb = (C1486zb) obj;
        if (AbstractC3367j.m5096a(this.f9844a, c1486zb.f9844a) && AbstractC3367j.m5096a(this.f9845b, c1486zb.f9845b) && AbstractC3367j.m5096a(this.f9846c, c1486zb.f9846c) && AbstractC3367j.m5096a(this.f9847d, c1486zb.f9847d) && this.f9848e == c1486zb.f9848e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9848e.hashCode() + AbstractC0094y0.m176c(this.f9847d, AbstractC0094y0.m176c(this.f9846c, AbstractC0094y0.m175b(this.f9844a.hashCode() * 31, 31, this.f9845b), 31), 31);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("InterfacePingStatus(targetId=", this.f9844a, ", targetName=", this.f9845b, ", gatewayProbes=");
        m189p.append(this.f9846c);
        m189p.append(", externalProbes=");
        m189p.append(this.f9847d);
        m189p.append(", congestionZone=");
        m189p.append(this.f9848e);
        m189p.append(")");
        return m189p.toString();
    }
}
