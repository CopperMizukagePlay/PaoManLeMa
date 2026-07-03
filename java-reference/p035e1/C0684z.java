package p035e1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.z */
/* loaded from: classes.dex */
public final class C0684z {

    /* renamed from: a */
    public final int f2216a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0684z) {
            if (this.f2216a != ((C0684z) obj).f2216a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2216a);
    }

    public final String toString() {
        int i7 = this.f2216a;
        if (i7 == 0) {
            return "Argb8888";
        }
        if (i7 == 1) {
            return "Alpha8";
        }
        if (i7 == 2) {
            return "Rgb565";
        }
        if (i7 == 3) {
            return "F16";
        }
        if (i7 == 4) {
            return "Gpu";
        }
        return "Unknown";
    }
}
