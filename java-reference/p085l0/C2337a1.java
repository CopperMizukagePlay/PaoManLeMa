package p085l0;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.a1 */
/* loaded from: classes.dex */
public final class C2337a1 {

    /* renamed from: a */
    public final String f13328a;

    public C2337a1(String str) {
        this.f13328a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2337a1) && AbstractC3367j.m5096a(this.f13328a, ((C2337a1) obj).f13328a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13328a.hashCode();
    }

    public final String toString() {
        return AbstractC0094y0.m187n(new StringBuilder("OpaqueKey(key="), this.f13328a, ')');
    }
}
