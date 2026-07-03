package p063i0;

import p158u5.AbstractC3367j;
import p190z.C3860d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.d5 */
/* loaded from: classes.dex */
public final class C1875d5 {

    /* renamed from: a */
    public final C3860d f11071a;

    /* renamed from: b */
    public final C3860d f11072b;

    /* renamed from: c */
    public final C3860d f11073c;

    /* renamed from: d */
    public final C3860d f11074d;

    /* renamed from: e */
    public final C3860d f11075e;

    public C1875d5() {
        C3860d c3860d = AbstractC1866c5.f11012a;
        C3860d c3860d2 = AbstractC1866c5.f11013b;
        C3860d c3860d3 = AbstractC1866c5.f11014c;
        C3860d c3860d4 = AbstractC1866c5.f11015d;
        C3860d c3860d5 = AbstractC1866c5.f11016e;
        this.f11071a = c3860d;
        this.f11072b = c3860d2;
        this.f11073c = c3860d3;
        this.f11074d = c3860d4;
        this.f11075e = c3860d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1875d5)) {
            return false;
        }
        C1875d5 c1875d5 = (C1875d5) obj;
        if (AbstractC3367j.m5096a(this.f11071a, c1875d5.f11071a) && AbstractC3367j.m5096a(this.f11072b, c1875d5.f11072b) && AbstractC3367j.m5096a(this.f11073c, c1875d5.f11073c) && AbstractC3367j.m5096a(this.f11074d, c1875d5.f11074d) && AbstractC3367j.m5096a(this.f11075e, c1875d5.f11075e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11075e.hashCode() + ((this.f11074d.hashCode() + ((this.f11073c.hashCode() + ((this.f11072b.hashCode() + (this.f11071a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f11071a + ", small=" + this.f11072b + ", medium=" + this.f11073c + ", large=" + this.f11074d + ", extraLarge=" + this.f11075e + ')';
    }
}
