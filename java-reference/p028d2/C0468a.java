package p028d2;

import p053g5.InterfaceC1684c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.a */
/* loaded from: classes.dex */
public final class C0468a {

    /* renamed from: a */
    public final String f1638a;

    /* renamed from: b */
    public final InterfaceC1684c f1639b;

    public C0468a(String str, InterfaceC1684c interfaceC1684c) {
        this.f1638a = str;
        this.f1639b = interfaceC1684c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0468a)) {
            return false;
        }
        C0468a c0468a = (C0468a) obj;
        if (AbstractC3367j.m5096a(this.f1638a, c0468a.f1638a) && AbstractC3367j.m5096a(this.f1639b, c0468a.f1639b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = 0;
        String str = this.f1638a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = i7 * 31;
        InterfaceC1684c interfaceC1684c = this.f1639b;
        if (interfaceC1684c != null) {
            i8 = interfaceC1684c.hashCode();
        }
        return i9 + i8;
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f1638a + ", action=" + this.f1639b + ')';
    }
}
