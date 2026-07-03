package p039e5;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.r7 */
/* loaded from: classes.dex */
public final class C1234r7 {

    /* renamed from: a */
    public final List f7296a;

    /* renamed from: b */
    public final Object f7297b;

    /* renamed from: c */
    public final LinkedHashMap f7298c;

    public C1234r7(List list, Map map, LinkedHashMap linkedHashMap) {
        AbstractC3367j.m5100e(list, "addresses");
        this.f7296a = list;
        this.f7297b = map;
        this.f7298c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1234r7) {
                C1234r7 c1234r7 = (C1234r7) obj;
                if (!AbstractC3367j.m5096a(this.f7296a, c1234r7.f7296a) || !this.f7297b.equals(c1234r7.f7297b) || !this.f7298c.equals(c1234r7.f7298c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f7298c.hashCode() + ((this.f7297b.hashCode() + (this.f7296a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DnsEcsAggregatedResult(addresses=" + this.f7296a + ", addressSubnetLabels=" + this.f7297b + ", addressDnsServers=" + this.f7298c + ")";
    }
}
