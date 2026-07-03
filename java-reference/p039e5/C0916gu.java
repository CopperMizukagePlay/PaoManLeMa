package p039e5;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.gu */
/* loaded from: classes.dex */
public final class C0916gu {

    /* renamed from: a */
    public final String f4386a;

    public C0916gu(String str) {
        AbstractC3367j.m5100e(str, "workerKey");
        this.f4386a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0916gu) && AbstractC3367j.m5096a(this.f4386a, ((C0916gu) obj).f4386a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4386a.hashCode();
    }

    public final String toString() {
        return AbstractC0094y0.m185l("WorkerCallTag(workerKey=", this.f4386a, ")");
    }
}
