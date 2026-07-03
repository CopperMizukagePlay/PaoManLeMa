package p039e5;

import p001a0.AbstractC0094y0;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.b2 */
/* loaded from: classes.dex */
public final class C0729b2 {

    /* renamed from: a */
    public final String f2565a;

    /* renamed from: b */
    public final C1485za f2566b;

    /* renamed from: c */
    public final String f2567c;

    /* renamed from: d */
    public final int f2568d;

    /* renamed from: e */
    public final int f2569e;

    public C0729b2(String str, C1485za c1485za, String str2, int i7, int i8) {
        AbstractC3367j.m5100e(str, "server");
        AbstractC3367j.m5100e(str2, "ecsLabel");
        this.f2565a = str;
        this.f2566b = c1485za;
        this.f2567c = str2;
        this.f2568d = i7;
        this.f2569e = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0729b2)) {
            return false;
        }
        C0729b2 c0729b2 = (C0729b2) obj;
        if (AbstractC3367j.m5096a(this.f2565a, c0729b2.f2565a) && AbstractC3367j.m5096a(this.f2566b, c0729b2.f2566b) && AbstractC3367j.m5096a(this.f2567c, c0729b2.f2567c) && this.f2568d == c0729b2.f2568d && this.f2569e == c0729b2.f2569e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f2565a.hashCode() * 31;
        C1485za c1485za = this.f2566b;
        if (c1485za == null) {
            hashCode = 0;
        } else {
            hashCode = c1485za.hashCode();
        }
        return Integer.hashCode(this.f2569e) + AbstractC2647h.m4255a(this.f2568d, AbstractC0094y0.m175b((hashCode2 + hashCode) * 31, 31, this.f2567c), 31);
    }

    public final String toString() {
        return "DnsQueryJob(server=" + this.f2565a + ", ecsSubnet=" + this.f2566b + ", ecsLabel=" + this.f2567c + ", progressIndex=" + this.f2568d + ", progressTotal=" + this.f2569e + ")";
    }
}
