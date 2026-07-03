package p039e5;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.pl */
/* loaded from: classes.dex */
public final class C1186pl {

    /* renamed from: a */
    public final Integer f6901a;

    /* renamed from: b */
    public final Integer f6902b;

    public C1186pl(Integer num, Integer num2) {
        this.f6901a = num;
        this.f6902b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1186pl)) {
            return false;
        }
        C1186pl c1186pl = (C1186pl) obj;
        if (AbstractC3367j.m5096a(this.f6901a, c1186pl.f6901a) && AbstractC3367j.m5096a(this.f6902b, c1186pl.f6902b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Integer num = this.f6901a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i8 = hashCode * 31;
        Integer num2 = this.f6902b;
        if (num2 != null) {
            i7 = num2.hashCode();
        }
        return i8 + i7;
    }

    public final String toString() {
        return "DlUlMbps(down=" + this.f6901a + ", up=" + this.f6902b + ")";
    }
}
