package p039e5;

import java.util.List;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.u7 */
/* loaded from: classes.dex */
public final class C1327u7 {

    /* renamed from: a */
    public final List f7895a;

    /* renamed from: b */
    public final int f7896b;

    /* renamed from: c */
    public final String f7897c;

    public C1327u7(List list, int i7, String str) {
        this.f7895a = list;
        this.f7896b = i7;
        this.f7897c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1327u7)) {
            return false;
        }
        C1327u7 c1327u7 = (C1327u7) obj;
        if (AbstractC3367j.m5096a(this.f7895a, c1327u7.f7895a) && this.f7896b == c1327u7.f7896b && AbstractC3367j.m5096a(this.f7897c, c1327u7.f7897c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m4255a = AbstractC2647h.m4255a(this.f7896b, this.f7895a.hashCode() * 31, 31);
        String str = this.f7897c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return m4255a + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DnsEcsSubnetImportResult(subnets=");
        sb.append(this.f7895a);
        sb.append(", skippedCount=");
        sb.append(this.f7896b);
        sb.append(", errorMessage=");
        return AbstractC2487d.m4046j(sb, this.f7897c, ")");
    }
}
