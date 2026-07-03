package p019c1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c1.d */
/* loaded from: classes.dex */
public final class C0360d {

    /* renamed from: a */
    public final int f1227a;

    /* renamed from: a */
    public static String m797a(int i7) {
        if (i7 == 1) {
            return "Next";
        }
        if (i7 == 2) {
            return "Previous";
        }
        if (i7 == 3) {
            return "Left";
        }
        if (i7 == 4) {
            return "Right";
        }
        if (i7 == 5) {
            return "Up";
        }
        if (i7 == 6) {
            return "Down";
        }
        if (i7 == 7) {
            return "Enter";
        }
        if (i7 == 8) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0360d) {
            if (this.f1227a != ((C0360d) obj).f1227a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1227a);
    }

    public final String toString() {
        return m797a(this.f1227a);
    }
}
