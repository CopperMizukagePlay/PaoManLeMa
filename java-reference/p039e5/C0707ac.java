package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ac */
/* loaded from: classes.dex */
public final class C0707ac {

    /* renamed from: a */
    public final String f2361a;

    /* renamed from: b */
    public final String f2362b;

    /* renamed from: c */
    public final String f2363c;

    /* renamed from: d */
    public final double f2364d;

    /* renamed from: e */
    public final double f2365e;

    /* renamed from: f */
    public final long f2366f;

    /* renamed from: g */
    public final long f2367g;

    public C0707ac(String str, String str2, String str3, double d7, double d8, long j6, long j7) {
        AbstractC3367j.m5100e(str, "id");
        AbstractC3367j.m5100e(str2, "name");
        this.f2361a = str;
        this.f2362b = str2;
        this.f2363c = str3;
        this.f2364d = d7;
        this.f2365e = d8;
        this.f2366f = j6;
        this.f2367g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0707ac)) {
            return false;
        }
        C0707ac c0707ac = (C0707ac) obj;
        if (AbstractC3367j.m5096a(this.f2361a, c0707ac.f2361a) && AbstractC3367j.m5096a(this.f2362b, c0707ac.f2362b) && AbstractC3367j.m5096a(this.f2363c, c0707ac.f2363c) && Double.compare(this.f2364d, c0707ac.f2364d) == 0 && Double.compare(this.f2365e, c0707ac.f2365e) == 0 && this.f2366f == c0707ac.f2366f && this.f2367g == c0707ac.f2367g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2367g) + AbstractC2487d.m4039c(AbstractC0094y0.m174a(this.f2365e, AbstractC0094y0.m174a(this.f2364d, AbstractC0094y0.m175b(AbstractC0094y0.m175b(this.f2361a.hashCode() * 31, 31, this.f2362b), 31, this.f2363c), 31), 31), 31, this.f2366f);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("InterfaceSpeedRate(id=", this.f2361a, ", name=", this.f2362b, ", interfaceName=");
        m189p.append(this.f2363c);
        m189p.append(", downloadMbps=");
        m189p.append(this.f2364d);
        AbstractC0094y0.m193t(m189p, ", uploadMbps=", this.f2365e, ", downloadBytes=");
        m189p.append(this.f2366f);
        m189p.append(", uploadBytes=");
        m189p.append(this.f2367g);
        m189p.append(")");
        return m189p.toString();
    }
}
