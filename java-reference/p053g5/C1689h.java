package p053g5;

import java.io.Serializable;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g5.h */
/* loaded from: classes.dex */
public final class C1689h implements Serializable {

    /* renamed from: e */
    public final Throwable f10473e;

    public C1689h(Throwable th) {
        AbstractC3367j.m5100e(th, "exception");
        this.f10473e = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1689h) {
            if (AbstractC3367j.m5096a(this.f10473e, ((C1689h) obj).f10473e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10473e.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f10473e + ')';
    }
}
