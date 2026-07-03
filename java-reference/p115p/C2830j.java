package p115p;

import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p.j */
/* loaded from: classes.dex */
public final class C2830j {

    /* renamed from: a */
    public final C2361g1 f14902a = AbstractC2418w.m3980x(C2827g.f14900a);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2830j)) {
            return false;
        }
        return AbstractC3367j.m5096a((AbstractC2829i) ((C2830j) obj).f14902a.getValue(), (AbstractC2829i) this.f14902a.getValue());
    }

    public final int hashCode() {
        return ((AbstractC2829i) this.f14902a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((AbstractC2829i) this.f14902a.getValue()) + ')';
    }
}
