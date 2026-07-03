package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.dn */
/* loaded from: classes.dex */
public final class C0814dn {

    /* renamed from: a */
    public final String f3523a;

    /* renamed from: b */
    public final String f3524b;

    /* renamed from: c */
    public final long f3525c;

    /* renamed from: d */
    public final long f3526d;

    /* renamed from: e */
    public final long f3527e;

    /* renamed from: f */
    public final long f3528f;

    /* renamed from: g */
    public final long f3529g;

    /* renamed from: h */
    public final long f3530h;

    /* renamed from: i */
    public final long f3531i;

    public C0814dn(String str, String str2, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        AbstractC3367j.m5100e(str, "interfaceName");
        this.f3523a = str;
        this.f3524b = str2;
        this.f3525c = j6;
        this.f3526d = j7;
        this.f3527e = j8;
        this.f3528f = j9;
        this.f3529g = j10;
        this.f3530h = j11;
        this.f3531i = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0814dn)) {
            return false;
        }
        C0814dn c0814dn = (C0814dn) obj;
        if (AbstractC3367j.m5096a(this.f3523a, c0814dn.f3523a) && AbstractC3367j.m5096a(this.f3524b, c0814dn.f3524b) && this.f3525c == c0814dn.f3525c && this.f3526d == c0814dn.f3526d && this.f3527e == c0814dn.f3527e && this.f3528f == c0814dn.f3528f && this.f3529g == c0814dn.f3529g && this.f3530h == c0814dn.f3530h && this.f3531i == c0814dn.f3531i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3531i) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC2487d.m4039c(AbstractC0094y0.m175b(this.f3523a.hashCode() * 31, 31, this.f3524b), 31, this.f3525c), 31, this.f3526d), 31, this.f3527e), 31, this.f3528f), 31, this.f3529g), 31, this.f3530h);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("RawQueueSample(interfaceName=", this.f3523a, ", displayName=", this.f3524b, ", qdiscBacklogBytes=");
        m189p.append(this.f3525c);
        AbstractC2487d.m4056t(m189p, ", qdiscDroppedTotal=", this.f3526d, ", qdiscRequeuesTotal=");
        m189p.append(this.f3527e);
        AbstractC2487d.m4056t(m189p, ", netdevTxDroppedTotal=", this.f3528f, ", netdevRxDroppedTotal=");
        m189p.append(this.f3529g);
        AbstractC2487d.m4056t(m189p, ", tcpRetransTotal=", this.f3530h, ", softnetSqueezeTotal=");
        m189p.append(this.f3531i);
        m189p.append(")");
        return m189p.toString();
    }
}
