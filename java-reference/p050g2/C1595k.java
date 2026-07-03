package p050g2;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.k */
/* loaded from: classes.dex */
public final class C1595k extends AbstractC1599m {

    /* renamed from: a */
    public final String f10274a;

    /* renamed from: b */
    public final C1600m0 f10275b;

    public C1595k(String str, C1600m0 c1600m0) {
        this.f10274a = str;
        this.f10275b = c1600m0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1595k)) {
            return false;
        }
        C1595k c1595k = (C1595k) obj;
        if (AbstractC3367j.m5096a(this.f10274a, c1595k.f10274a) && AbstractC3367j.m5096a(this.f10275b, c1595k.f10275b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10274a.hashCode() * 31;
        C1600m0 c1600m0 = this.f10275b;
        if (c1600m0 != null) {
            i7 = c1600m0.hashCode();
        } else {
            i7 = 0;
        }
        return (hashCode + i7) * 31;
    }

    public final String toString() {
        return AbstractC0094y0.m187n(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f10274a, ')');
    }
}
