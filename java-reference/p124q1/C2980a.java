package p124q1;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q1.a */
/* loaded from: classes.dex */
public final class C2980a {

    /* renamed from: a */
    public long f15402a;

    /* renamed from: b */
    public float f15403b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2980a)) {
            return false;
        }
        C2980a c2980a = (C2980a) obj;
        if (this.f15402a == c2980a.f15402a && Float.compare(this.f15403b, c2980a.f15403b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15403b) + (Long.hashCode(this.f15402a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f15402a);
        sb.append(", dataPoint=");
        return AbstractC0094y0.m186m(sb, this.f15403b, ')');
    }
}
