package p050g2;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.i0 */
/* loaded from: classes.dex */
public final class C1592i0 implements InterfaceC1577b {

    /* renamed from: a */
    public final String f10271a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1592i0) {
            if (!AbstractC3367j.m5096a(this.f10271a, ((C1592i0) obj).f10271a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10271a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.f10271a + ')';
    }
}
