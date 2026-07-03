package p050g2;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.q0 */
/* loaded from: classes.dex */
public final class C1608q0 implements InterfaceC1577b {

    /* renamed from: a */
    public final String f10323a;

    public C1608q0(String str) {
        this.f10323a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1608q0)) {
            return false;
        }
        if (AbstractC3367j.m5096a(this.f10323a, ((C1608q0) obj).f10323a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10323a.hashCode();
    }

    public final String toString() {
        return AbstractC0094y0.m187n(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f10323a, ')');
    }
}
