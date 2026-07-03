package p087l2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.j */
/* loaded from: classes.dex */
public final class C2446j {

    /* renamed from: a */
    public final int f13697a;

    /* renamed from: a */
    public static String m4020a(int i7) {
        if (i7 == -1) {
            return "Unspecified";
        }
        if (i7 == 0) {
            return "None";
        }
        if (i7 == 1) {
            return "Default";
        }
        if (i7 == 2) {
            return "Go";
        }
        if (i7 == 3) {
            return "Search";
        }
        if (i7 == 4) {
            return "Send";
        }
        if (i7 == 5) {
            return "Previous";
        }
        if (i7 == 6) {
            return "Next";
        }
        if (i7 == 7) {
            return "Done";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2446j) {
            if (this.f13697a != ((C2446j) obj).f13697a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13697a);
    }

    public final String toString() {
        return m4020a(this.f13697a);
    }
}
