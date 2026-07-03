package p039e5;

import java.util.ArrayList;
import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.z7 */
/* loaded from: classes.dex */
public final class C1482z7 {

    /* renamed from: a */
    public final String f9831a;

    /* renamed from: b */
    public final String f9832b;

    /* renamed from: c */
    public final ArrayList f9833c;

    public C1482z7(String str, String str2, ArrayList arrayList) {
        AbstractC3367j.m5100e(str, "dnsServer");
        this.f9831a = str;
        this.f9832b = str2;
        this.f9833c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1482z7) {
                C1482z7 c1482z7 = (C1482z7) obj;
                if (!AbstractC3367j.m5096a(this.f9831a, c1482z7.f9831a) || !this.f9832b.equals(c1482z7.f9832b) || !this.f9833c.equals(c1482z7.f9833c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f9833c.hashCode() + AbstractC0094y0.m175b(this.f9831a.hashCode() * 31, 31, this.f9832b);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("DnsLookupResultRow(dnsServer=", this.f9831a, ", ecsLabel=", this.f9832b, ", addresses=");
        m189p.append(this.f9833c);
        m189p.append(")");
        return m189p.toString();
    }
}
