package p094m1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m1.a */
/* loaded from: classes.dex */
public final class C2547a {

    /* renamed from: a */
    public final int f13915a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2547a) {
            if (this.f13915a != ((C2547a) obj).f13915a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13915a);
    }

    public final String toString() {
        int i7 = this.f13915a;
        if (i7 == 1) {
            return "Touch";
        }
        if (i7 == 2) {
            return "Keyboard";
        }
        return "Error";
    }
}
