package p001a0;

import p087l2.C2448l;
import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.j1 */
/* loaded from: classes.dex */
public final class C0039j1 {

    /* renamed from: b */
    public static final C0039j1 f181b = new C0039j1(127);

    /* renamed from: a */
    public final int f182a;

    public C0039j1(int i7) {
        int i8;
        if ((i7 & 4) != 0) {
            i8 = 0;
        } else {
            i8 = 3;
        }
        this.f182a = i8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof C0039j1) && this.f182a == ((C0039j1) obj).f182a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC2647h.m4255a(-1, AbstractC2647h.m4255a(this.f182a, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) C2448l.m4021a(this.f182a)) + ", imeAction=" + ((Object) "Unspecified") + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
