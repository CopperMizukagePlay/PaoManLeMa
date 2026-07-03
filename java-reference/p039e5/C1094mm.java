package p039e5;

import p001a0.AbstractC0094y0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.mm */
/* loaded from: classes.dex */
public final class C1094mm {

    /* renamed from: a */
    public final int f5961a;

    /* renamed from: b */
    public final boolean f5962b;

    /* renamed from: c */
    public final double f5963c;

    /* renamed from: d */
    public final String f5964d;

    public C1094mm(int i7, boolean z7, double d7, String str) {
        AbstractC3367j.m5100e(str, "detail");
        this.f5961a = i7;
        this.f5962b = z7;
        this.f5963c = d7;
        this.f5964d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1094mm)) {
            return false;
        }
        C1094mm c1094mm = (C1094mm) obj;
        if (this.f5961a == c1094mm.f5961a && this.f5962b == c1094mm.f5962b && Double.compare(this.f5963c, c1094mm.f5963c) == 0 && AbstractC3367j.m5096a(this.f5964d, c1094mm.f5964d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5964d.hashCode() + AbstractC0094y0.m174a(this.f5963c, AbstractC2487d.m4040d(Integer.hashCode(this.f5961a) * 31, 31, this.f5962b), 31);
    }

    public final String toString() {
        return "PingProbeResult(sequence=" + this.f5961a + ", success=" + this.f5962b + ", rttMs=" + this.f5963c + ", detail=" + this.f5964d + ")";
    }
}
