package p039e5;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.al */
/* loaded from: classes.dex */
public final class C0716al {

    /* renamed from: a */
    public final String f2442a;

    public C0716al(String str) {
        AbstractC3367j.m5100e(str, "address");
        this.f2442a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0716al) && AbstractC3367j.m5096a(this.f2442a, ((C0716al) obj).f2442a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2442a.hashCode();
    }

    public final String toString() {
        return AbstractC0094y0.m185l("NatServerProfile(address=", this.f2442a, ")");
    }
}
