package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.hc */
/* loaded from: classes.dex */
public final class C0930hc {

    /* renamed from: a */
    public final double f4491a;

    /* renamed from: b */
    public final double f4492b;

    /* renamed from: c */
    public final double f4493c;

    /* renamed from: d */
    public final long f4494d;

    /* renamed from: e */
    public final long f4495e;

    public C0930hc(double d7, double d8, double d9, long j6, long j7) {
        this.f4491a = d7;
        this.f4492b = d8;
        this.f4493c = d9;
        this.f4494d = j6;
        this.f4495e = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0930hc)) {
            return false;
        }
        C0930hc c0930hc = (C0930hc) obj;
        if (Double.compare(this.f4491a, c0930hc.f4491a) == 0 && Double.compare(this.f4492b, c0930hc.f4492b) == 0 && Double.compare(this.f4493c, c0930hc.f4493c) == 0 && this.f4494d == c0930hc.f4494d && this.f4495e == c0930hc.f4495e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4495e) + AbstractC2487d.m4039c(AbstractC0094y0.m174a(this.f4493c, AbstractC0094y0.m174a(this.f4492b, Double.hashCode(this.f4491a) * 31, 31), 31), 31, this.f4494d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonUpdate(uploadBps=");
        sb.append(this.f4491a);
        sb.append(", downloadBps=");
        sb.append(this.f4492b);
        AbstractC0094y0.m193t(sb, ", elapsedSec=", this.f4493c, ", bytesSent=");
        sb.append(this.f4494d);
        sb.append(", bytesReceived=");
        sb.append(this.f4495e);
        sb.append(")");
        return sb.toString();
    }
}
