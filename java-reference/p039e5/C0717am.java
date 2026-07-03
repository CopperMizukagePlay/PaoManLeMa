package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.am */
/* loaded from: classes.dex */
public final class C0717am {

    /* renamed from: a */
    public final String f2443a;

    /* renamed from: b */
    public final String f2444b;

    /* renamed from: c */
    public final String f2445c;

    /* renamed from: d */
    public final String f2446d;

    /* renamed from: e */
    public final String f2447e;

    public C0717am(String str, String str2, String str3, String str4, String str5) {
        this.f2443a = str;
        this.f2444b = str2;
        this.f2445c = str3;
        this.f2446d = str4;
        this.f2447e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0717am)) {
            return false;
        }
        C0717am c0717am = (C0717am) obj;
        if (AbstractC3367j.m5096a(this.f2443a, c0717am.f2443a) && AbstractC3367j.m5096a(this.f2444b, c0717am.f2444b) && AbstractC3367j.m5096a(this.f2445c, c0717am.f2445c) && AbstractC3367j.m5096a(this.f2446d, c0717am.f2446d) && AbstractC3367j.m5096a(this.f2447e, c0717am.f2447e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2447e.hashCode() + AbstractC0094y0.m175b(AbstractC0094y0.m175b(AbstractC0094y0.m175b(this.f2443a.hashCode() * 31, 31, this.f2444b), 31, this.f2445c), 31, this.f2446d);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("OpenSourceComponent(name=", this.f2443a, ", copyright=", this.f2444b, ", license=");
        AbstractC2487d.m4057u(m189p, this.f2445c, ", homepage=", this.f2446d, ", note=");
        return AbstractC2487d.m4046j(m189p, this.f2447e, ")");
    }
}
