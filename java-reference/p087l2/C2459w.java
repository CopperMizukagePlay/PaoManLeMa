package p087l2;

import p050g2.AbstractC1586f0;
import p050g2.C1587g;
import p050g2.C1602n0;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.w */
/* loaded from: classes.dex */
public final class C2459w {

    /* renamed from: a */
    public final C1587g f13723a;

    /* renamed from: b */
    public final long f13724b;

    /* renamed from: c */
    public final C1602n0 f13725c;

    public C2459w(C1587g c1587g, long j6, C1602n0 c1602n0) {
        C1602n0 c1602n02;
        this.f13723a = c1587g;
        this.f13724b = AbstractC1586f0.m2559c(c1587g.f10239f.length(), j6);
        if (c1602n0 != null) {
            c1602n02 = new C1602n0(AbstractC1586f0.m2559c(c1587g.f10239f.length(), c1602n0.f10304a));
        } else {
            c1602n02 = null;
        }
        this.f13725c = c1602n02;
    }

    /* renamed from: a */
    public static C2459w m4026a(C2459w c2459w, C1587g c1587g, long j6, int i7) {
        C1602n0 c1602n0;
        if ((i7 & 1) != 0) {
            c1587g = c2459w.f13723a;
        }
        if ((i7 & 2) != 0) {
            j6 = c2459w.f13724b;
        }
        if ((i7 & 4) != 0) {
            c1602n0 = c2459w.f13725c;
        } else {
            c1602n0 = null;
        }
        c2459w.getClass();
        return new C2459w(c1587g, j6, c1602n0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2459w)) {
            return false;
        }
        C2459w c2459w = (C2459w) obj;
        if (C1602n0.m2585a(this.f13724b, c2459w.f13724b) && AbstractC3367j.m5096a(this.f13725c, c2459w.f13725c) && AbstractC3367j.m5096a(this.f13723a, c2459w.f13723a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f13723a.hashCode() * 31;
        int i8 = C1602n0.f10303c;
        int m4039c = AbstractC2487d.m4039c(hashCode, 31, this.f13724b);
        C1602n0 c1602n0 = this.f13725c;
        if (c1602n0 != null) {
            i7 = Long.hashCode(c1602n0.f10304a);
        } else {
            i7 = 0;
        }
        return m4039c + i7;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f13723a) + "', selection=" + ((Object) C1602n0.m2591g(this.f13724b)) + ", composition=" + this.f13725c + ')';
    }

    public C2459w(String str, long j6, int i7) {
        this(new C1587g((i7 & 1) != 0 ? "" : str), (i7 & 2) != 0 ? C1602n0.f10302b : j6, (C1602n0) null);
    }
}
