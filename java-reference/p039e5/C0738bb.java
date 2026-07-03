package p039e5;

import java.util.Map;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.bb */
/* loaded from: classes.dex */
public final class C0738bb {

    /* renamed from: a */
    public final C1218qm f2635a;

    /* renamed from: b */
    public final Object f2636b;

    public C0738bb(C1218qm c1218qm, Map map) {
        this.f2635a = c1218qm;
        this.f2636b = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0738bb) {
                C0738bb c0738bb = (C0738bb) obj;
                if (!this.f2635a.equals(c0738bb.f2635a) || !this.f2636b.equals(c0738bb.f2636b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2636b.hashCode() + (this.f2635a.hashCode() * 31);
    }

    public final String toString() {
        return "ExpandedDnsSelectionStart(prepared=" + this.f2635a + ", dnsAddressSelections=" + this.f2636b + ")";
    }
}
