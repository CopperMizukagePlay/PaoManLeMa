package p039e5;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ns */
/* loaded from: classes.dex */
public final class C1131ns {

    /* renamed from: a */
    public final double f6399a;

    /* renamed from: b */
    public final double f6400b;

    /* renamed from: c */
    public final double f6401c;

    /* renamed from: d */
    public final double f6402d;

    /* renamed from: e */
    public final int f6403e;

    public C1131ns(double d7, double d8, double d9, double d10, int i7) {
        this.f6399a = d7;
        this.f6400b = d8;
        this.f6401c = d9;
        this.f6402d = d10;
        this.f6403e = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1131ns)) {
            return false;
        }
        C1131ns c1131ns = (C1131ns) obj;
        if (Double.compare(this.f6399a, c1131ns.f6399a) == 0 && Double.compare(this.f6400b, c1131ns.f6400b) == 0 && Double.compare(this.f6401c, c1131ns.f6401c) == 0 && Double.compare(this.f6402d, c1131ns.f6402d) == 0 && this.f6403e == c1131ns.f6403e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6403e) + AbstractC0094y0.m174a(this.f6402d, AbstractC0094y0.m174a(this.f6401c, AbstractC0094y0.m174a(this.f6400b, Double.hashCode(this.f6399a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeedTestPingCongestionConfig(internalMildRttMs=");
        sb.append(this.f6399a);
        sb.append(", internalSevereRttMs=");
        sb.append(this.f6400b);
        AbstractC0094y0.m193t(sb, ", externalMildRttMs=", this.f6401c, ", externalSevereRttMs=");
        sb.append(this.f6402d);
        sb.append(", consecutiveThreshold=");
        sb.append(this.f6403e);
        sb.append(")");
        return sb.toString();
    }
}
