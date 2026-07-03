package p160v;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.o */
/* loaded from: classes.dex */
public final class C3426o {

    /* renamed from: a */
    public final int f16599a;

    /* renamed from: b */
    public final int f16600b;

    public C3426o(int i7, int i8) {
        this.f16599a = i7;
        this.f16600b = i8;
        if (i7 >= 0) {
            if (i8 >= i7) {
                return;
            } else {
                throw new IllegalArgumentException("end index greater than start");
            }
        }
        throw new IllegalArgumentException("negative start index");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3426o)) {
            return false;
        }
        C3426o c3426o = (C3426o) obj;
        if (this.f16599a == c3426o.f16599a && this.f16600b == c3426o.f16600b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16600b) + (Integer.hashCode(this.f16599a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f16599a);
        sb.append(", end=");
        return AbstractC2487d.m4045i(sb, this.f16600b, ')');
    }
}
