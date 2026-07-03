package p008b;

import androidx.lifecycle.InterfaceC0213t;
import p067i4.AbstractC2072e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.b0 */
/* loaded from: classes.dex */
public final class C0224b0 extends AbstractC2072e {

    /* renamed from: a */
    public final C0238i0 f900a;

    /* renamed from: b */
    public final InterfaceC0213t f901b;

    public C0224b0(C0238i0 c0238i0, InterfaceC0213t interfaceC0213t) {
        AbstractC3367j.m5100e(c0238i0, "callback");
        this.f900a = c0238i0;
        this.f901b = interfaceC0213t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0224b0)) {
            return false;
        }
        C0224b0 c0224b0 = (C0224b0) obj;
        if (AbstractC3367j.m5096a(this.f900a, c0224b0.f900a) && AbstractC3367j.m5096a(this.f901b, c0224b0.f901b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f900a.hashCode() * 31;
        InterfaceC0213t interfaceC0213t = this.f901b;
        if (interfaceC0213t == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC0213t.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f900a + ", owner=" + this.f901b + ')';
    }
}
