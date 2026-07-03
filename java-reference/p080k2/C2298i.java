package p080k2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k2.i */
/* loaded from: classes.dex */
public final class C2298i {

    /* renamed from: a */
    public final int f13229a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2298i) {
            if (this.f13229a != ((C2298i) obj).f13229a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13229a);
    }

    public final String toString() {
        int i7 = this.f13229a;
        if (i7 == 0) {
            return "Normal";
        }
        if (i7 == 1) {
            return "Italic";
        }
        return "Invalid";
    }
}
