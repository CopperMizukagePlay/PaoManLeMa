package p100n;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.c1 */
/* loaded from: classes.dex */
public final class C2634c1 {

    /* renamed from: a */
    public final Object f14255a;

    /* renamed from: b */
    public final Object f14256b;

    public C2634c1(Object obj, Object obj2) {
        this.f14255a = obj;
        this.f14256b = obj2;
    }

    /* renamed from: a */
    public final boolean m4202a(Object obj, Object obj2) {
        if (obj.equals(this.f14255a) && obj2.equals(this.f14256b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2634c1) {
            C2634c1 c2634c1 = (C2634c1) obj;
            if (AbstractC3367j.m5096a(this.f14255a, c2634c1.f14255a) && AbstractC3367j.m5096a(this.f14256b, c2634c1.f14256b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = 0;
        Object obj = this.f14255a;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = i7 * 31;
        Object obj2 = this.f14256b;
        if (obj2 != null) {
            i8 = obj2.hashCode();
        }
        return i9 + i8;
    }
}
