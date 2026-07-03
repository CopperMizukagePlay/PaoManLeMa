package p028d2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.g */
/* loaded from: classes.dex */
public final class C0474g {

    /* renamed from: a */
    public final int f1652a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0474g) {
            if (this.f1652a != ((C0474g) obj).f1652a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1652a);
    }

    public final String toString() {
        int i7 = this.f1652a;
        if (i7 == 0) {
            return "Button";
        }
        if (i7 == 1) {
            return "Checkbox";
        }
        if (i7 == 2) {
            return "Switch";
        }
        if (i7 == 3) {
            return "RadioButton";
        }
        if (i7 == 4) {
            return "Tab";
        }
        if (i7 == 5) {
            return "Image";
        }
        if (i7 == 6) {
            return "DropdownList";
        }
        if (i7 == 7) {
            return "Picker";
        }
        if (i7 == 8) {
            return "Carousel";
        }
        return "Unknown";
    }
}
