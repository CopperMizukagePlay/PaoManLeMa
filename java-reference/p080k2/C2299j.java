package p080k2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k2.j */
/* loaded from: classes.dex */
public final class C2299j {

    /* renamed from: a */
    public final int f13230a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2299j) {
            if (this.f13230a != ((C2299j) obj).f13230a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13230a);
    }

    public final String toString() {
        int i7 = this.f13230a;
        if (i7 == 0) {
            return "None";
        }
        if (i7 == 1) {
            return "Weight";
        }
        if (i7 == 2) {
            return "Style";
        }
        if (i7 == 65535) {
            return "All";
        }
        return "Invalid";
    }
}
