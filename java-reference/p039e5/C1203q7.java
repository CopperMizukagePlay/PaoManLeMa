package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.q7 */
/* loaded from: classes.dex */
public final class C1203q7 {

    /* renamed from: a */
    public final String f7045a;

    /* renamed from: b */
    public final String f7046b;

    /* renamed from: c */
    public final String f7047c;

    public C1203q7(String str, String str2, String str3) {
        AbstractC3367j.m5100e(str, "key");
        this.f7045a = str;
        this.f7046b = str2;
        this.f7047c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1203q7)) {
            return false;
        }
        C1203q7 c1203q7 = (C1203q7) obj;
        if (AbstractC3367j.m5096a(this.f7045a, c1203q7.f7045a) && AbstractC3367j.m5096a(this.f7046b, c1203q7.f7046b) && AbstractC3367j.m5096a(this.f7047c, c1203q7.f7047c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7047c.hashCode() + AbstractC0094y0.m175b(this.f7045a.hashCode() * 31, 31, this.f7046b);
    }

    public final String toString() {
        return AbstractC2487d.m4046j(AbstractC0094y0.m189p("DnsAddressOverride(key=", this.f7045a, ", host=", this.f7046b, ", address="), this.f7047c, ")");
    }
}
