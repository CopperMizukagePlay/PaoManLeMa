package p050g2;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.z */
/* loaded from: classes.dex */
public final class C1617z {

    /* renamed from: a */
    public final C1616y f10353a;

    /* renamed from: b */
    public final C1615x f10354b;

    public C1617z(C1616y c1616y, C1615x c1615x) {
        this.f10353a = c1616y;
        this.f10354b = c1615x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1617z)) {
            return false;
        }
        C1617z c1617z = (C1617z) obj;
        if (AbstractC3367j.m5096a(this.f10354b, c1617z.f10354b) && AbstractC3367j.m5096a(this.f10353a, c1617z.f10353a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = 0;
        C1616y c1616y = this.f10353a;
        if (c1616y != null) {
            i7 = c1616y.hashCode();
        } else {
            i7 = 0;
        }
        int i9 = i7 * 31;
        C1615x c1615x = this.f10354b;
        if (c1615x != null) {
            i8 = c1615x.hashCode();
        }
        return i9 + i8;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f10353a + ", paragraphSyle=" + this.f10354b + ')';
    }
}
