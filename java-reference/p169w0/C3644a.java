package p169w0;

import p073j2.AbstractC2168e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w0.a */
/* loaded from: classes.dex */
public final class C3644a {

    /* renamed from: a */
    public final Integer f17420a;

    public C3644a(AbstractC2168e abstractC2168e, Integer num) {
        this.f17420a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3644a)) {
            return false;
        }
        C3644a c3644a = (C3644a) obj;
        if (AbstractC3367j.m5096a(null, null) && AbstractC3367j.m5096a(this.f17420a, c3644a.f17420a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f17420a + ')';
    }
}
