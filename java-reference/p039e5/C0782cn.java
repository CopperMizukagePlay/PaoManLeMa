package p039e5;

import p001a0.AbstractC0094y0;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.cn */
/* loaded from: classes.dex */
public final class C0782cn {

    /* renamed from: a */
    public final int f3168a;

    /* renamed from: b */
    public final String f3169b;

    /* renamed from: c */
    public final int f3170c;

    /* renamed from: d */
    public final int f3171d;

    public C0782cn(int i7, int i8, int i9, String str) {
        AbstractC3367j.m5100e(str, "name");
        this.f3168a = i7;
        this.f3169b = str;
        this.f3170c = i8;
        this.f3171d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0782cn)) {
            return false;
        }
        C0782cn c0782cn = (C0782cn) obj;
        if (this.f3168a == c0782cn.f3168a && AbstractC3367j.m5096a(this.f3169b, c0782cn.f3169b) && this.f3170c == c0782cn.f3170c && this.f3171d == c0782cn.f3171d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3171d) + AbstractC2647h.m4255a(this.f3170c, AbstractC0094y0.m175b(Integer.hashCode(this.f3168a) * 31, 31, this.f3169b), 31);
    }

    public final String toString() {
        return "RatePushProfileOption(id=" + this.f3168a + ", name=" + this.f3169b + ", downloadUrlCount=" + this.f3170c + ", uploadUrlCount=" + this.f3171d + ")";
    }
}
