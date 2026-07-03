package p039e5;

import java.util.List;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.pk */
/* loaded from: classes.dex */
public final class C1185pk {

    /* renamed from: a */
    public final Object f6898a;

    /* renamed from: b */
    public final Object f6899b;

    /* renamed from: c */
    public final int f6900c;

    public C1185pk(List list, List list2, int i7) {
        this.f6898a = list;
        this.f6899b = list2;
        this.f6900c = i7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1185pk) {
                C1185pk c1185pk = (C1185pk) obj;
                if (!this.f6898a.equals(c1185pk.f6898a) || !this.f6899b.equals(c1185pk.f6899b) || this.f6900c != c1185pk.f6900c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6900c) + ((this.f6899b.hashCode() + (this.f6898a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ParsedResourceRecord(addresses=" + this.f6898a + ", cnameTargets=" + this.f6899b + ", nextOffset=" + this.f6900c + ")";
    }
}
