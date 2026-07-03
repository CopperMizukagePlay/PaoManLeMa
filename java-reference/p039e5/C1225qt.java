package p039e5;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.qt */
/* loaded from: classes.dex */
public final class C1225qt {

    /* renamed from: a */
    public final String f7186a;

    /* renamed from: b */
    public final double f7187b;

    /* renamed from: c */
    public final boolean f7188c;

    public C1225qt(String str, double d7, boolean z7) {
        this.f7186a = str;
        this.f7187b = d7;
        this.f7188c = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1225qt)) {
            return false;
        }
        C1225qt c1225qt = (C1225qt) obj;
        if (AbstractC3367j.m5096a(this.f7186a, c1225qt.f7186a) && Double.compare(this.f7187b, c1225qt.f7187b) == 0 && this.f7188c == c1225qt.f7188c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7188c) + AbstractC0094y0.m174a(this.f7187b, this.f7186a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SingleProbeResult(ip=" + this.f7186a + ", rttMs=" + this.f7187b + ", success=" + this.f7188c + ")";
    }
}
