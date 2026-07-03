package p050g2;

import p035e1.C0665l0;
import p035e1.C0677s;
import p049g1.AbstractC1571e;
import p071j0.AbstractC2152t;
import p080k2.AbstractC2305p;
import p080k2.C2298i;
import p080k2.C2299j;
import p080k2.C2300k;
import p092m.AbstractC2487d;
import p103n2.C2714b;
import p132r2.C3027a;
import p132r2.C3029c;
import p132r2.C3030d;
import p132r2.C3031e;
import p132r2.C3035i;
import p132r2.C3037k;
import p132r2.C3038l;
import p132r2.C3039m;
import p132r2.C3040n;
import p132r2.C3042p;
import p132r2.C3043q;
import p132r2.C3045s;
import p132r2.InterfaceC3041o;
import p140s2.C3105o;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.o0 */
/* loaded from: classes.dex */
public final class C1604o0 {

    /* renamed from: d */
    public static final C1604o0 f10308d = new C1604o0(0, 0, null, 0, 0, 0, 16777215);

    /* renamed from: a */
    public final C1588g0 f10309a;

    /* renamed from: b */
    public final C1613v f10310b;

    /* renamed from: c */
    public final C1617z f10311c;

    public C1604o0(C1588g0 c1588g0, C1613v c1613v, C1617z c1617z) {
        this.f10309a = c1588g0;
        this.f10310b = c1613v;
        this.f10311c = c1617z;
    }

    /* renamed from: a */
    public static C1604o0 m2592a(C1604o0 c1604o0, long j6, long j7, C2300k c2300k, AbstractC2305p abstractC2305p, long j8, long j9, C3035i c3035i, int i7) {
        long j10;
        long j11;
        C2300k c2300k2;
        AbstractC2305p abstractC2305p2;
        long j12;
        int i8;
        long j13;
        C1617z c1617z;
        C3035i c3035i2;
        InterfaceC3041o interfaceC3041o;
        C1616y c1616y;
        if ((i7 & 1) != 0) {
            j10 = c1604o0.f10309a.f10242a.mo4717b();
        } else {
            j10 = j6;
        }
        if ((i7 & 2) != 0) {
            j11 = c1604o0.f10309a.f10243b;
        } else {
            j11 = j7;
        }
        if ((i7 & 4) != 0) {
            c2300k2 = c1604o0.f10309a.f10244c;
        } else {
            c2300k2 = c2300k;
        }
        C1588g0 c1588g0 = c1604o0.f10309a;
        C2298i c2298i = c1588g0.f10245d;
        C2299j c2299j = c1588g0.f10246e;
        if ((i7 & 32) != 0) {
            abstractC2305p2 = c1588g0.f10247f;
        } else {
            abstractC2305p2 = abstractC2305p;
        }
        String str = c1588g0.f10248g;
        if ((i7 & 128) != 0) {
            j12 = c1588g0.f10249h;
        } else {
            j12 = j8;
        }
        C3027a c3027a = c1588g0.f10250i;
        C3042p c3042p = c1588g0.f10251j;
        C2714b c2714b = c1588g0.f10252k;
        long j14 = c1588g0.f10253l;
        C3038l c3038l = c1588g0.f10254m;
        C0665l0 c0665l0 = c1588g0.f10255n;
        AbstractC1571e abstractC1571e = c1588g0.f10257p;
        if ((i7 & 32768) != 0) {
            i8 = c1604o0.f10310b.f10339a;
        } else {
            i8 = 3;
        }
        int i9 = i8;
        C1613v c1613v = c1604o0.f10310b;
        int i10 = c1613v.f10340b;
        if ((i7 & 131072) != 0) {
            j13 = c1613v.f10341c;
        } else {
            j13 = j9;
        }
        C3043q c3043q = c1613v.f10342d;
        if ((i7 & 524288) != 0) {
            c1617z = c1604o0.f10311c;
        } else {
            c1617z = AbstractC2152t.f12529a;
        }
        if ((i7 & 1048576) != 0) {
            c3035i2 = c1613v.f10344f;
        } else {
            c3035i2 = c3035i;
        }
        int i11 = c1613v.f10345g;
        int i12 = c1613v.f10346h;
        C3045s c3045s = c1613v.f10347i;
        if (C0677s.m1454c(j10, c1588g0.f10242a.mo4717b())) {
            interfaceC3041o = c1588g0.f10242a;
        } else if (j10 != 16) {
            interfaceC3041o = new C3029c(j10);
        } else {
            interfaceC3041o = C3040n.f15609a;
        }
        C1615x c1615x = null;
        if (c1617z != null) {
            c1616y = c1617z.f10353a;
        } else {
            c1616y = null;
        }
        C1588g0 c1588g02 = new C1588g0(interfaceC3041o, j11, c2300k2, c2298i, c2299j, abstractC2305p2, str, j12, c3027a, c3042p, c2714b, j14, c3038l, c0665l0, c1616y, abstractC1571e);
        if (c1617z != null) {
            c1615x = c1617z.f10354b;
        }
        return new C1604o0(c1588g02, new C1613v(i9, i10, j13, c3043q, c1615x, c3035i2, i11, i12, c3045s), c1617z);
    }

    /* renamed from: e */
    public static C1604o0 m2593e(C1604o0 c1604o0, long j6, long j7, C2300k c2300k, AbstractC2305p abstractC2305p, long j8, int i7, long j9, int i8) {
        long j10;
        C2300k c2300k2;
        AbstractC2305p abstractC2305p2;
        long j11;
        int i9;
        long j12;
        if ((i8 & 2) != 0) {
            j10 = C3105o.f15708c;
        } else {
            j10 = j7;
        }
        if ((i8 & 4) != 0) {
            c2300k2 = null;
        } else {
            c2300k2 = c2300k;
        }
        if ((i8 & 32) != 0) {
            abstractC2305p2 = null;
        } else {
            abstractC2305p2 = abstractC2305p;
        }
        if ((i8 & 128) != 0) {
            j11 = C3105o.f15708c;
        } else {
            j11 = j8;
        }
        long j13 = C0677s.f2209g;
        if ((32768 & i8) != 0) {
            i9 = Integer.MIN_VALUE;
        } else {
            i9 = i7;
        }
        if ((i8 & 131072) != 0) {
            j12 = C3105o.f15708c;
        } else {
            j12 = j9;
        }
        C1588g0 m2571a = AbstractC1590h0.m2571a(c1604o0.f10309a, j6, null, Float.NaN, j10, c2300k2, null, null, abstractC2305p2, null, j11, null, null, null, j13, null, null, null, null);
        C1613v m2622a = AbstractC1614w.m2622a(c1604o0.f10310b, i9, Integer.MIN_VALUE, j12, null, null, null, 0, Integer.MIN_VALUE, null);
        if (c1604o0.f10309a == m2571a && c1604o0.f10310b == m2622a) {
            return c1604o0;
        }
        return new C1604o0(m2571a, m2622a);
    }

    /* renamed from: b */
    public final long m2594b() {
        return this.f10309a.f10242a.mo4717b();
    }

    /* renamed from: c */
    public final boolean m2595c(C1604o0 c1604o0) {
        if (this != c1604o0) {
            if (!AbstractC3367j.m5096a(this.f10310b, c1604o0.f10310b) || !this.f10309a.m2566a(c1604o0.f10309a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: d */
    public final C1604o0 m2596d(C1604o0 c1604o0) {
        if (c1604o0 != null && !c1604o0.equals(f10308d)) {
            return new C1604o0(this.f10309a.m2568c(c1604o0.f10309a), this.f10310b.m2621a(c1604o0.f10310b));
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1604o0)) {
            return false;
        }
        C1604o0 c1604o0 = (C1604o0) obj;
        if (AbstractC3367j.m5096a(this.f10309a, c1604o0.f10309a) && AbstractC3367j.m5096a(this.f10310b, c1604o0.f10310b) && AbstractC3367j.m5096a(this.f10311c, c1604o0.f10311c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (this.f10310b.hashCode() + (this.f10309a.hashCode() * 31)) * 31;
        C1617z c1617z = this.f10311c;
        if (c1617z != null) {
            i7 = c1617z.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C0677s.m1460i(m2594b()));
        sb.append(", brush=");
        C1588g0 c1588g0 = this.f10309a;
        sb.append(c1588g0.f10242a.mo4718c());
        sb.append(", alpha=");
        sb.append(c1588g0.f10242a.mo4716a());
        sb.append(", fontSize=");
        sb.append((Object) C3105o.m4797d(c1588g0.f10243b));
        sb.append(", fontWeight=");
        sb.append(c1588g0.f10244c);
        sb.append(", fontStyle=");
        sb.append(c1588g0.f10245d);
        sb.append(", fontSynthesis=");
        sb.append(c1588g0.f10246e);
        sb.append(", fontFamily=");
        sb.append(c1588g0.f10247f);
        sb.append(", fontFeatureSettings=");
        sb.append(c1588g0.f10248g);
        sb.append(", letterSpacing=");
        sb.append((Object) C3105o.m4797d(c1588g0.f10249h));
        sb.append(", baselineShift=");
        sb.append(c1588g0.f10250i);
        sb.append(", textGeometricTransform=");
        sb.append(c1588g0.f10251j);
        sb.append(", localeList=");
        sb.append(c1588g0.f10252k);
        sb.append(", background=");
        AbstractC2487d.m4051o(c1588g0.f10253l, sb, ", textDecoration=");
        sb.append(c1588g0.f10254m);
        sb.append(", shadow=");
        sb.append(c1588g0.f10255n);
        sb.append(", drawStyle=");
        sb.append(c1588g0.f10257p);
        sb.append(", textAlign=");
        C1613v c1613v = this.f10310b;
        sb.append((Object) C3037k.m4723a(c1613v.f10339a));
        sb.append(", textDirection=");
        sb.append((Object) C3039m.m4724a(c1613v.f10340b));
        sb.append(", lineHeight=");
        sb.append((Object) C3105o.m4797d(c1613v.f10341c));
        sb.append(", textIndent=");
        sb.append(c1613v.f10342d);
        sb.append(", platformStyle=");
        sb.append(this.f10311c);
        sb.append(", lineHeightStyle=");
        sb.append(c1613v.f10344f);
        sb.append(", lineBreak=");
        sb.append((Object) C3031e.m4720a(c1613v.f10345g));
        sb.append(", hyphens=");
        sb.append((Object) C3030d.m4719a(c1613v.f10346h));
        sb.append(", textMotion=");
        sb.append(c1613v.f10347i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1604o0(C1588g0 c1588g0, C1613v c1613v) {
        this(c1588g0, c1613v, (r0 == null && r1 == null) ? null : new C1617z(r0, r1));
        C1616y c1616y = c1588g0.f10256o;
        C1615x c1615x = c1613v.f10343e;
    }

    public C1604o0(long j6, long j7, C2300k c2300k, long j8, int i7, long j9, int i8) {
        this(new C1588g0((i8 & 1) != 0 ? C0677s.f2209g : j6, (i8 & 2) != 0 ? C3105o.f15708c : j7, (i8 & 4) != 0 ? null : c2300k, (C2298i) null, (C2299j) null, (i8 & 32) != 0 ? null : AbstractC2305p.f13242a, (String) null, (i8 & 128) != 0 ? C3105o.f15708c : j8, (C3027a) null, (C3042p) null, (C2714b) null, C0677s.f2209g, (C3038l) null, (C0665l0) null, (C1616y) null), new C1613v((32768 & i8) != 0 ? Integer.MIN_VALUE : i7, Integer.MIN_VALUE, (i8 & 131072) != 0 ? C3105o.f15708c : j9, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
