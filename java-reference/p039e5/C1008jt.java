package p039e5;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.jt */
/* loaded from: classes.dex */
public final class C1008jt {

    /* renamed from: a */
    public final String f5173a;

    /* renamed from: b */
    public final String f5174b;

    public C1008jt(String str, String str2) {
        this.f5173a = str;
        this.f5174b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1008jt)) {
            return false;
        }
        C1008jt c1008jt = (C1008jt) obj;
        if (AbstractC3367j.m5096a(this.f5173a, c1008jt.f5173a) && AbstractC3367j.m5096a(this.f5174b, c1008jt.f5174b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5174b.hashCode() + (this.f5173a.hashCode() * 31);
    }

    public final String toString() {
        return "SpeedValueParts(value=" + this.f5173a + ", unit=" + this.f5174b + ")";
    }
}
