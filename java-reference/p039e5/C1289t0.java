package p039e5;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.t0 */
/* loaded from: classes.dex */
public final class C1289t0 implements InterfaceC1351v0 {

    /* renamed from: a */
    public final String f7711a;

    public C1289t0(String str) {
        AbstractC3367j.m5100e(str, "message");
        this.f7711a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1289t0) && AbstractC3367j.m5096a(this.f7711a, ((C1289t0) obj).f7711a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7711a.hashCode();
    }

    public final String toString() {
        return AbstractC0094y0.m185l("Failed(message=", this.f7711a, ")");
    }
}
