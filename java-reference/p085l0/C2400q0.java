package p085l0;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.q0 */
/* loaded from: classes.dex */
public final class C2400q0 {

    /* renamed from: a */
    public final Integer f13527a;

    /* renamed from: b */
    public final Object f13528b;

    public C2400q0(Integer num, Object obj) {
        this.f13527a = num;
        this.f13528b = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2400q0) {
                C2400q0 c2400q0 = (C2400q0) obj;
                if (!this.f13527a.equals(c2400q0.f13527a) || !AbstractC3367j.m5096a(this.f13528b, c2400q0.f13528b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f13527a.hashCode() * 31;
        Object obj = this.f13528b;
        if (obj instanceof Enum) {
            i7 = ((Enum) obj).ordinal();
        } else if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        return i7 + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f13527a + ", right=" + this.f13528b + ')';
    }
}
