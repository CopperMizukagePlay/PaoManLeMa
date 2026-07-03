package p087l2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.l */
/* loaded from: classes.dex */
public final class C2448l {

    /* renamed from: a */
    public final int f13705a;

    /* renamed from: a */
    public static String m4021a(int i7) {
        if (i7 == 0) {
            return "Unspecified";
        }
        if (i7 == 1) {
            return "Text";
        }
        if (i7 == 2) {
            return "Ascii";
        }
        if (i7 == 3) {
            return "Number";
        }
        if (i7 == 4) {
            return "Phone";
        }
        if (i7 == 5) {
            return "Uri";
        }
        if (i7 == 6) {
            return "Email";
        }
        if (i7 == 7) {
            return "Password";
        }
        if (i7 == 8) {
            return "NumberPassword";
        }
        if (i7 == 9) {
            return "Decimal";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2448l) {
            if (this.f13705a != ((C2448l) obj).f13705a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13705a);
    }

    public final String toString() {
        return m4021a(this.f13705a);
    }
}
