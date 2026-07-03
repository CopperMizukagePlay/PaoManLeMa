package p177x0;

import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: x0.i */
/* loaded from: classes.dex */
public final class C3801i {

    /* renamed from: a */
    public final float f17983a;

    public C3801i(float f7) {
        this.f17983a = f7;
    }

    /* renamed from: a */
    public final int m5826a(int i7, int i8) {
        return Math.round((1 + this.f17983a) * ((i8 - i7) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3801i) && Float.compare(this.f17983a, ((C3801i) obj).f17983a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17983a);
    }

    public final String toString() {
        return AbstractC0094y0.m186m(new StringBuilder("Vertical(bias="), this.f17983a, ')');
    }
}
