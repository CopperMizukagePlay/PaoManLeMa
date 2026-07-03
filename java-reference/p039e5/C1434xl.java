package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.xl */
/* loaded from: classes.dex */
public final class C1434xl {

    /* renamed from: a */
    public final String f8839a;

    /* renamed from: b */
    public final String f8840b;

    /* renamed from: c */
    public final String f8841c;

    public C1434xl(String str, String str2, String str3) {
        AbstractC3367j.m5100e(str, "asNumber");
        this.f8839a = str;
        this.f8840b = str2;
        this.f8841c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1434xl)) {
            return false;
        }
        C1434xl c1434xl = (C1434xl) obj;
        if (AbstractC3367j.m5096a(this.f8839a, c1434xl.f8839a) && AbstractC3367j.m5096a(this.f8840b, c1434xl.f8840b) && AbstractC3367j.m5096a(this.f8841c, c1434xl.f8841c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8841c.hashCode() + AbstractC0094y0.m175b(this.f8839a.hashCode() * 31, 31, this.f8840b);
    }

    public final String toString() {
        return AbstractC2487d.m4046j(AbstractC0094y0.m189p("NextTraceGeo(asNumber=", this.f8839a, ", owner=", this.f8840b, ", location="), this.f8841c, ")");
    }
}
