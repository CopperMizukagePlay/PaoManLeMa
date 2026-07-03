package p050g2;

import p035e1.AbstractC0670o;
import p035e1.C0665l0;
import p035e1.C0677s;
import p049g1.AbstractC1571e;
import p080k2.AbstractC2305p;
import p080k2.C2298i;
import p080k2.C2299j;
import p080k2.C2300k;
import p092m.AbstractC2487d;
import p103n2.C2714b;
import p132r2.C3027a;
import p132r2.C3029c;
import p132r2.C3038l;
import p132r2.C3040n;
import p132r2.C3042p;
import p132r2.InterfaceC3041o;
import p140s2.C3105o;
import p140s2.C3106p;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.g0 */
/* loaded from: classes.dex */
public final class C1588g0 implements InterfaceC1577b {

    /* renamed from: a */
    public final InterfaceC3041o f10242a;

    /* renamed from: b */
    public final long f10243b;

    /* renamed from: c */
    public final C2300k f10244c;

    /* renamed from: d */
    public final C2298i f10245d;

    /* renamed from: e */
    public final C2299j f10246e;

    /* renamed from: f */
    public final AbstractC2305p f10247f;

    /* renamed from: g */
    public final String f10248g;

    /* renamed from: h */
    public final long f10249h;

    /* renamed from: i */
    public final C3027a f10250i;

    /* renamed from: j */
    public final C3042p f10251j;

    /* renamed from: k */
    public final C2714b f10252k;

    /* renamed from: l */
    public final long f10253l;

    /* renamed from: m */
    public final C3038l f10254m;

    /* renamed from: n */
    public final C0665l0 f10255n;

    /* renamed from: o */
    public final C1616y f10256o;

    /* renamed from: p */
    public final AbstractC1571e f10257p;

    public C1588g0(long j6, long j7, C2300k c2300k, C2298i c2298i, C2299j c2299j, AbstractC2305p abstractC2305p, String str, long j8, C3027a c3027a, C3042p c3042p, C2714b c2714b, long j9, C3038l c3038l, C0665l0 c0665l0, C1616y c1616y) {
        this(j6 != 16 ? new C3029c(j6) : C3040n.f15609a, j7, c2300k, c2298i, c2299j, abstractC2305p, str, j8, c3027a, c3042p, c2714b, j9, c3038l, c0665l0, c1616y, null);
    }

    /* renamed from: a */
    public final boolean m2566a(C1588g0 c1588g0) {
        if (this == c1588g0) {
            return true;
        }
        if (C3105o.m4794a(this.f10243b, c1588g0.f10243b) && AbstractC3367j.m5096a(this.f10244c, c1588g0.f10244c) && AbstractC3367j.m5096a(this.f10245d, c1588g0.f10245d) && AbstractC3367j.m5096a(this.f10246e, c1588g0.f10246e) && AbstractC3367j.m5096a(this.f10247f, c1588g0.f10247f) && AbstractC3367j.m5096a(this.f10248g, c1588g0.f10248g) && C3105o.m4794a(this.f10249h, c1588g0.f10249h) && AbstractC3367j.m5096a(this.f10250i, c1588g0.f10250i) && AbstractC3367j.m5096a(this.f10251j, c1588g0.f10251j) && AbstractC3367j.m5096a(this.f10252k, c1588g0.f10252k) && C0677s.m1454c(this.f10253l, c1588g0.f10253l) && AbstractC3367j.m5096a(this.f10256o, c1588g0.f10256o)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m2567b(C1588g0 c1588g0) {
        if (!AbstractC3367j.m5096a(this.f10242a, c1588g0.f10242a) || !AbstractC3367j.m5096a(this.f10254m, c1588g0.f10254m) || !AbstractC3367j.m5096a(this.f10255n, c1588g0.f10255n) || !AbstractC3367j.m5096a(this.f10257p, c1588g0.f10257p)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final C1588g0 m2568c(C1588g0 c1588g0) {
        if (c1588g0 == null) {
            return this;
        }
        InterfaceC3041o interfaceC3041o = c1588g0.f10242a;
        return AbstractC1590h0.m2571a(this, interfaceC3041o.mo4717b(), interfaceC3041o.mo4718c(), interfaceC3041o.mo4716a(), c1588g0.f10243b, c1588g0.f10244c, c1588g0.f10245d, c1588g0.f10246e, c1588g0.f10247f, c1588g0.f10248g, c1588g0.f10249h, c1588g0.f10250i, c1588g0.f10251j, c1588g0.f10252k, c1588g0.f10253l, c1588g0.f10254m, c1588g0.f10255n, c1588g0.f10256o, c1588g0.f10257p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1588g0)) {
            return false;
        }
        C1588g0 c1588g0 = (C1588g0) obj;
        if (m2566a(c1588g0) && m2567b(c1588g0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        InterfaceC3041o interfaceC3041o = this.f10242a;
        long mo4717b = interfaceC3041o.mo4717b();
        int i19 = C0677s.f2210h;
        int hashCode = Long.hashCode(mo4717b) * 31;
        AbstractC0670o mo4718c = interfaceC3041o.mo4718c();
        int i20 = 0;
        if (mo4718c != null) {
            i7 = mo4718c.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = (Float.hashCode(interfaceC3041o.mo4716a()) + ((hashCode + i7) * 31)) * 31;
        C3106p[] c3106pArr = C3105o.f15707b;
        int m4039c = AbstractC2487d.m4039c(hashCode2, 31, this.f10243b);
        C2300k c2300k = this.f10244c;
        if (c2300k != null) {
            i8 = c2300k.f13237e;
        } else {
            i8 = 0;
        }
        int i21 = (m4039c + i8) * 31;
        C2298i c2298i = this.f10245d;
        if (c2298i != null) {
            i9 = Integer.hashCode(c2298i.f13229a);
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 31;
        C2299j c2299j = this.f10246e;
        if (c2299j != null) {
            i10 = Integer.hashCode(c2299j.f13230a);
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 31;
        AbstractC2305p abstractC2305p = this.f10247f;
        if (abstractC2305p != null) {
            i11 = abstractC2305p.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 31;
        String str = this.f10248g;
        if (str != null) {
            i12 = str.hashCode();
        } else {
            i12 = 0;
        }
        int m4039c2 = AbstractC2487d.m4039c((i24 + i12) * 31, 31, this.f10249h);
        C3027a c3027a = this.f10250i;
        if (c3027a != null) {
            i13 = Float.hashCode(c3027a.f15585a);
        } else {
            i13 = 0;
        }
        int i25 = (m4039c2 + i13) * 31;
        C3042p c3042p = this.f10251j;
        if (c3042p != null) {
            i14 = c3042p.hashCode();
        } else {
            i14 = 0;
        }
        int i26 = (i25 + i14) * 31;
        C2714b c2714b = this.f10252k;
        if (c2714b != null) {
            i15 = c2714b.f14563e.hashCode();
        } else {
            i15 = 0;
        }
        int m4039c3 = AbstractC2487d.m4039c((i26 + i15) * 31, 31, this.f10253l);
        C3038l c3038l = this.f10254m;
        if (c3038l != null) {
            i16 = c3038l.f15607a;
        } else {
            i16 = 0;
        }
        int i27 = (m4039c3 + i16) * 31;
        C0665l0 c0665l0 = this.f10255n;
        if (c0665l0 != null) {
            i17 = c0665l0.hashCode();
        } else {
            i17 = 0;
        }
        int i28 = (i27 + i17) * 31;
        C1616y c1616y = this.f10256o;
        if (c1616y != null) {
            i18 = c1616y.hashCode();
        } else {
            i18 = 0;
        }
        int i29 = (i28 + i18) * 31;
        AbstractC1571e abstractC1571e = this.f10257p;
        if (abstractC1571e != null) {
            i20 = abstractC1571e.hashCode();
        }
        return i29 + i20;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        InterfaceC3041o interfaceC3041o = this.f10242a;
        sb.append((Object) C0677s.m1460i(interfaceC3041o.mo4717b()));
        sb.append(", brush=");
        sb.append(interfaceC3041o.mo4718c());
        sb.append(", alpha=");
        sb.append(interfaceC3041o.mo4716a());
        sb.append(", fontSize=");
        sb.append((Object) C3105o.m4797d(this.f10243b));
        sb.append(", fontWeight=");
        sb.append(this.f10244c);
        sb.append(", fontStyle=");
        sb.append(this.f10245d);
        sb.append(", fontSynthesis=");
        sb.append(this.f10246e);
        sb.append(", fontFamily=");
        sb.append(this.f10247f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f10248g);
        sb.append(", letterSpacing=");
        sb.append((Object) C3105o.m4797d(this.f10249h));
        sb.append(", baselineShift=");
        sb.append(this.f10250i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f10251j);
        sb.append(", localeList=");
        sb.append(this.f10252k);
        sb.append(", background=");
        AbstractC2487d.m4051o(this.f10253l, sb, ", textDecoration=");
        sb.append(this.f10254m);
        sb.append(", shadow=");
        sb.append(this.f10255n);
        sb.append(", platformStyle=");
        sb.append(this.f10256o);
        sb.append(", drawStyle=");
        sb.append(this.f10257p);
        sb.append(')');
        return sb.toString();
    }

    public C1588g0(InterfaceC3041o interfaceC3041o, long j6, C2300k c2300k, C2298i c2298i, C2299j c2299j, AbstractC2305p abstractC2305p, String str, long j7, C3027a c3027a, C3042p c3042p, C2714b c2714b, long j8, C3038l c3038l, C0665l0 c0665l0, C1616y c1616y, AbstractC1571e abstractC1571e) {
        this.f10242a = interfaceC3041o;
        this.f10243b = j6;
        this.f10244c = c2300k;
        this.f10245d = c2298i;
        this.f10246e = c2299j;
        this.f10247f = abstractC2305p;
        this.f10248g = str;
        this.f10249h = j7;
        this.f10250i = c3027a;
        this.f10251j = c3042p;
        this.f10252k = c2714b;
        this.f10253l = j8;
        this.f10254m = c3038l;
        this.f10255n = c0665l0;
        this.f10256o = c1616y;
        this.f10257p = abstractC1571e;
    }

    public C1588g0(long j6, long j7, C2300k c2300k, C2298i c2298i, C2299j c2299j, AbstractC2305p abstractC2305p, String str, long j8, C3027a c3027a, C3042p c3042p, C2714b c2714b, long j9, C3038l c3038l, C0665l0 c0665l0, int i7) {
        this((i7 & 1) != 0 ? C0677s.f2209g : j6, (i7 & 2) != 0 ? C3105o.f15708c : j7, (i7 & 4) != 0 ? null : c2300k, (i7 & 8) != 0 ? null : c2298i, (i7 & 16) != 0 ? null : c2299j, (i7 & 32) != 0 ? null : abstractC2305p, (i7 & 64) != 0 ? null : str, (i7 & 128) != 0 ? C3105o.f15708c : j8, (i7 & 256) != 0 ? null : c3027a, (i7 & 512) != 0 ? null : c3042p, (i7 & 1024) != 0 ? null : c2714b, (i7 & 2048) != 0 ? C0677s.f2209g : j9, (i7 & 4096) != 0 ? null : c3038l, (i7 & 8192) != 0 ? null : c0665l0, (C1616y) null);
    }
}
