package p039e5;

import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ml */
/* loaded from: classes.dex */
public final class C1093ml {

    /* renamed from: a */
    public final String f5958a;

    /* renamed from: b */
    public final long f5959b;

    /* renamed from: c */
    public final long f5960c;

    public C1093ml(long j6, long j7, String str) {
        AbstractC3367j.m5100e(str, "name");
        this.f5958a = str;
        this.f5959b = j6;
        this.f5960c = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1093ml)) {
            return false;
        }
        C1093ml c1093ml = (C1093ml) obj;
        if (AbstractC3367j.m5096a(this.f5958a, c1093ml.f5958a) && this.f5959b == c1093ml.f5959b && this.f5960c == c1093ml.f5960c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5960c) + AbstractC2487d.m4039c(this.f5958a.hashCode() * 31, 31, this.f5959b);
    }

    public final String toString() {
        return "NetDevRow(name=" + this.f5958a + ", rxBytes=" + this.f5959b + ", txBytes=" + this.f5960c + ")";
    }
}
