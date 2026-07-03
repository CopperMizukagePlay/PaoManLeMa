package p047f6;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f6.h */
/* loaded from: classes.dex */
public final class C1553h extends C1554i {

    /* renamed from: a */
    public final Throwable f10168a;

    public C1553h(Throwable th) {
        this.f10168a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1553h) {
            if (AbstractC3367j.m5096a(this.f10168a, ((C1553h) obj).f10168a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f10168a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p047f6.C1554i
    public final String toString() {
        return "Closed(" + this.f10168a + ')';
    }
}
