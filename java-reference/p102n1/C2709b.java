package p102n1;

import android.view.KeyEvent;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n1.b */
/* loaded from: classes.dex */
public final class C2709b {

    /* renamed from: a */
    public final KeyEvent f14537a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2709b) {
            if (!AbstractC3367j.m5096a(this.f14537a, ((C2709b) obj).f14537a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14537a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f14537a + ')';
    }
}
