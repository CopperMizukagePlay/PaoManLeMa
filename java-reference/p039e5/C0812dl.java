package p039e5;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.dl */
/* loaded from: classes.dex */
public final class C0812dl {

    /* renamed from: a */
    public final String f3515a;

    /* renamed from: b */
    public final int f3516b;

    public C0812dl(String str, int i7) {
        AbstractC3367j.m5100e(str, "host");
        this.f3515a = str;
        this.f3516b = i7;
    }

    /* renamed from: a */
    public final String m1518a() {
        return this.f3515a + ":" + this.f3516b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0812dl)) {
            return false;
        }
        C0812dl c0812dl = (C0812dl) obj;
        if (AbstractC3367j.m5096a(this.f3515a, c0812dl.f3515a) && this.f3516b == c0812dl.f3516b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3516b) + (this.f3515a.hashCode() * 31);
    }

    public final String toString() {
        return "NatServer(host=" + this.f3515a + ", port=" + this.f3516b + ")";
    }
}
