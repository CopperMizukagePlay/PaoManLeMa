package p138s0;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s0.a */
/* loaded from: classes.dex */
public final class C3086a {

    /* renamed from: a */
    public int f15683a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3086a) && this.f15683a == ((C3086a) obj).f15683a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15683a);
    }

    public final String toString() {
        return AbstractC2487d.m4045i(new StringBuilder("DeltaCounter(count="), this.f15683a, ')');
    }
}
