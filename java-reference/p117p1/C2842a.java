package p117p1;

import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.a */
/* loaded from: classes.dex */
public final class C2842a implements InterfaceC2864o {

    /* renamed from: b */
    public final int f14934b;

    public C2842a(int i7) {
        this.f14934b = i7;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C2842a.class.equals(cls)) {
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
                if (this.f14934b != ((C2842a) obj).f14934b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14934b;
    }

    public final String toString() {
        return AbstractC2487d.m4045i(new StringBuilder("AndroidPointerIcon(type="), this.f14934b, ')');
    }
}
