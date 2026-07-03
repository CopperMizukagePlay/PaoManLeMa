package p039e5;

import java.util.ArrayList;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.m */
/* loaded from: classes.dex */
public final class C1071m {

    /* renamed from: a */
    public final ArrayList f5750a;

    /* renamed from: b */
    public final ArrayList f5751b;

    public C1071m(ArrayList arrayList, ArrayList arrayList2) {
        this.f5750a = arrayList;
        this.f5751b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1071m) {
                C1071m c1071m = (C1071m) obj;
                if (!this.f5750a.equals(c1071m.f5750a) || !this.f5751b.equals(c1071m.f5751b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5751b.hashCode() + (this.f5750a.hashCode() * 31);
    }

    public final String toString() {
        return "DynamicDownloadState(segments=" + this.f5750a + ", completedRanges=" + this.f5751b + ")";
    }
}
