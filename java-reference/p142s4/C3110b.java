package p142s4;

import java.util.ArrayList;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: s4.b */
/* loaded from: classes.dex */
public final class C3110b {

    /* renamed from: a */
    public final ArrayList f15719a;

    /* renamed from: b */
    public final int f15720b;

    public C3110b(int i7, ArrayList arrayList) {
        this.f15719a = new ArrayList(arrayList);
        this.f15720b = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3110b)) {
            return false;
        }
        return this.f15719a.equals(((C3110b) obj).f15719a);
    }

    public final int hashCode() {
        return this.f15719a.hashCode();
    }

    public final String toString() {
        return "{ " + this.f15719a + " }";
    }
}
