package p169w0;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w0.g */
/* loaded from: classes.dex */
public final class C3650g {

    /* renamed from: a */
    public final int f17426a;

    /* renamed from: b */
    public final Integer f17427b;

    public C3650g(int i7, Integer num) {
        this.f17426a = i7;
        this.f17427b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3650g)) {
            return false;
        }
        C3650g c3650g = (C3650g) obj;
        if (this.f17426a == c3650g.f17426a && AbstractC3367j.m5096a(this.f17427b, c3650g.f17427b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f17426a) * 31;
        Integer num = this.f17427b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f17426a + ", dataOffset=" + this.f17427b + ')';
    }
}
