package p050g2;

import p001a0.AbstractC0094y0;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.l */
/* loaded from: classes.dex */
public final class C1597l extends AbstractC1599m {

    /* renamed from: a */
    public final String f10286a;

    /* renamed from: b */
    public final C1600m0 f10287b;

    public C1597l(String str, C1600m0 c1600m0) {
        this.f10286a = str;
        this.f10287b = c1600m0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1597l)) {
            return false;
        }
        C1597l c1597l = (C1597l) obj;
        if (AbstractC3367j.m5096a(this.f10286a, c1597l.f10286a) && AbstractC3367j.m5096a(this.f10287b, c1597l.f10287b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10286a.hashCode() * 31;
        C1600m0 c1600m0 = this.f10287b;
        if (c1600m0 != null) {
            i7 = c1600m0.hashCode();
        } else {
            i7 = 0;
        }
        return (hashCode + i7) * 31;
    }

    public final String toString() {
        return AbstractC0094y0.m187n(new StringBuilder("LinkAnnotation.Url(url="), this.f10286a, ')');
    }
}
