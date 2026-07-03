package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.cl */
/* loaded from: classes.dex */
public final class C0780cl {

    /* renamed from: a */
    public final String f3163a;

    /* renamed from: b */
    public final String f3164b;

    /* renamed from: c */
    public final String f3165c;

    public C0780cl(String str, String str2, String str3) {
        this.f3163a = str;
        this.f3164b = str2;
        this.f3165c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0780cl)) {
            return false;
        }
        C0780cl c0780cl = (C0780cl) obj;
        if (AbstractC3367j.m5096a(this.f3163a, c0780cl.f3163a) && AbstractC3367j.m5096a(this.f3164b, c0780cl.f3164b) && AbstractC3367j.m5096a(this.f3165c, c0780cl.f3165c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3165c.hashCode() + AbstractC0094y0.m175b(this.f3163a.hashCode() * 31, 31, this.f3164b);
    }

    public final String toString() {
        return AbstractC2487d.m4046j(AbstractC0094y0.m189p("NatTypeComboRow(mapping=", this.f3163a, ", filtering=", this.f3164b, ", description="), this.f3165c, ")");
    }
}
