package p132r2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.m */
/* loaded from: classes.dex */
public final class C3039m {

    /* renamed from: a */
    public final int f15608a;

    /* renamed from: a */
    public static String m4724a(int i7) {
        if (i7 == 1) {
            return "Ltr";
        }
        if (i7 == 2) {
            return "Rtl";
        }
        if (i7 == 3) {
            return "Content";
        }
        if (i7 == 4) {
            return "ContentOrLtr";
        }
        if (i7 == 5) {
            return "ContentOrRtl";
        }
        if (i7 == Integer.MIN_VALUE) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3039m) {
            if (this.f15608a != ((C3039m) obj).f15608a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15608a);
    }

    public final String toString() {
        return m4724a(this.f15608a);
    }
}
