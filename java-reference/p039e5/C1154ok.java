package p039e5;

import java.util.List;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ok */
/* loaded from: classes.dex */
public final class C1154ok {

    /* renamed from: a */
    public final Object f6636a;

    /* renamed from: b */
    public final List f6637b;

    public C1154ok(List list, List list2) {
        this.f6636a = list;
        this.f6637b = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1154ok) {
                C1154ok c1154ok = (C1154ok) obj;
                if (!this.f6636a.equals(c1154ok.f6636a) || !this.f6637b.equals(c1154ok.f6637b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6637b.hashCode() + (this.f6636a.hashCode() * 31);
    }

    public final String toString() {
        return "DnsParseResult(addresses=" + this.f6636a + ", cnameTargets=" + this.f6637b + ")";
    }
}
