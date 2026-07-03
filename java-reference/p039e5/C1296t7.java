package p039e5;

import java.util.List;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.t7 */
/* loaded from: classes.dex */
public final class C1296t7 {

    /* renamed from: a */
    public final String f7761a;

    /* renamed from: b */
    public final C1485za f7762b;

    /* renamed from: c */
    public final List f7763c;

    public C1296t7(String str, C1485za c1485za, List list) {
        AbstractC3367j.m5100e(str, "dnsServer");
        AbstractC3367j.m5100e(list, "addresses");
        this.f7761a = str;
        this.f7762b = c1485za;
        this.f7763c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1296t7)) {
            return false;
        }
        C1296t7 c1296t7 = (C1296t7) obj;
        if (AbstractC3367j.m5096a(this.f7761a, c1296t7.f7761a) && AbstractC3367j.m5096a(this.f7762b, c1296t7.f7762b) && AbstractC3367j.m5096a(this.f7763c, c1296t7.f7763c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f7761a.hashCode() * 31;
        C1485za c1485za = this.f7762b;
        if (c1485za == null) {
            hashCode = 0;
        } else {
            hashCode = c1485za.hashCode();
        }
        return this.f7763c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "DnsEcsQueryResult(dnsServer=" + this.f7761a + ", subnet=" + this.f7762b + ", addresses=" + this.f7763c + ")";
    }
}
