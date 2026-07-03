package p034e0;

import p050g2.C1598l0;
import p092m.AbstractC2487d;
import p093m0.C2530j0;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.n */
/* loaded from: classes.dex */
public final class C0619n {

    /* renamed from: a */
    public final /* synthetic */ int f2034a = 1;

    /* renamed from: b */
    public int f2035b;

    /* renamed from: c */
    public int f2036c;

    /* renamed from: d */
    public int f2037d;

    /* renamed from: e */
    public Object f2038e;

    public /* synthetic */ C0619n() {
    }

    /* renamed from: a */
    public C0621o m1274a(int i7) {
        return new C0621o(AbstractC3784a.m5813u((C1598l0) this.f2038e, i7), i7, 1L);
    }

    /* renamed from: b */
    public int m1275b() {
        return this.f2037d - this.f2036c;
    }

    /* renamed from: c */
    public int m1276c(int i7) {
        return ((C2530j0) this.f2038e).f13891c[this.f2036c + i7];
    }

    /* renamed from: d */
    public Object m1277d(int i7) {
        return ((C2530j0) this.f2038e).f13893e[this.f2037d + i7];
    }

    public String toString() {
        switch (this.f2034a) {
            case 0:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i7 = this.f2035b;
                sb.append(i7);
                sb.append('-');
                C1598l0 c1598l0 = (C1598l0) this.f2038e;
                sb.append(AbstractC3784a.m5813u(c1598l0, i7));
                sb.append(',');
                int i8 = this.f2036c;
                sb.append(i8);
                sb.append('-');
                sb.append(AbstractC3784a.m5813u(c1598l0, i8));
                sb.append("), prevOffset=");
                return AbstractC2487d.m4045i(sb, this.f2037d, ')');
            case 1:
                return "";
            default:
                return super.toString();
        }
    }

    public C0619n(C2530j0 c2530j0) {
        this.f2038e = c2530j0;
    }

    public C0619n(int i7, int i8, int i9, C1598l0 c1598l0) {
        this.f2035b = i7;
        this.f2036c = i8;
        this.f2037d = i9;
        this.f2038e = c1598l0;
    }
}
