package p026d0;

import p001a0.AbstractC0027g1;
import p050g2.AbstractC1586f0;
import p050g2.C1575a;
import p050g2.C1604o0;
import p050g2.InterfaceC1612u;
import p060h5.C1813u;
import p067i4.AbstractC2072e;
import p073j2.AbstractC2168e;
import p080k2.InterfaceC2293d;
import p110o2.C2807d;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d0.d */
/* loaded from: classes.dex */
public final class C0459d {

    /* renamed from: a */
    public String f1584a;

    /* renamed from: b */
    public C1604o0 f1585b;

    /* renamed from: c */
    public InterfaceC2293d f1586c;

    /* renamed from: d */
    public int f1587d;

    /* renamed from: e */
    public boolean f1588e;

    /* renamed from: f */
    public int f1589f;

    /* renamed from: g */
    public int f1590g;

    /* renamed from: i */
    public InterfaceC3093c f1592i;

    /* renamed from: j */
    public C1575a f1593j;

    /* renamed from: k */
    public boolean f1594k;

    /* renamed from: m */
    public C0457b f1596m;

    /* renamed from: n */
    public InterfaceC1612u f1597n;

    /* renamed from: o */
    public EnumC3103m f1598o;

    /* renamed from: h */
    public long f1591h = AbstractC0456a.f1572a;

    /* renamed from: l */
    public long f1595l = AbstractC2072e.m3326b(0, 0);

    /* renamed from: p */
    public long f1599p = AbstractC3092b.m4771h(0, 0, 0, 0);

    /* renamed from: q */
    public int f1600q = -1;

    /* renamed from: r */
    public int f1601r = -1;

    public C0459d(String str, C1604o0 c1604o0, InterfaceC2293d interfaceC2293d, int i7, boolean z7, int i8, int i9) {
        this.f1584a = str;
        this.f1585b = c1604o0;
        this.f1586c = interfaceC2293d;
        this.f1587d = i7;
        this.f1588e = z7;
        this.f1589f = i8;
        this.f1590g = i9;
    }

    /* renamed from: a */
    public final int m995a(int i7, EnumC3103m enumC3103m) {
        int i8 = this.f1600q;
        int i9 = this.f1601r;
        if (i7 == i8 && i8 != -1) {
            return i9;
        }
        int m65k = AbstractC0027g1.m65k(m996b(AbstractC3092b.m4764a(0, i7, 0, Integer.MAX_VALUE), enumC3103m).m2548b());
        this.f1600q = i7;
        this.f1601r = m65k;
        return m65k;
    }

    /* renamed from: b */
    public final C1575a m996b(long j6, EnumC3103m enumC3103m) {
        int m4760h;
        int i7;
        int i8;
        InterfaceC1612u m999e = m999e(enumC3103m);
        boolean z7 = this.f1588e;
        int i9 = this.f1587d;
        float mo2609c = m999e.mo2609c();
        if ((z7 || i9 == 2) && C3091a.m4756d(j6)) {
            m4760h = C3091a.m4760h(j6);
        } else {
            m4760h = Integer.MAX_VALUE;
        }
        if (C3091a.m4762j(j6) != m4760h) {
            m4760h = AbstractC2168e.m3530q(AbstractC0027g1.m65k(mo2609c), C3091a.m4762j(j6), m4760h);
        }
        long m3332i = AbstractC2072e.m3332i(0, m4760h, 0, C3091a.m4759g(j6));
        boolean z8 = this.f1588e;
        int i10 = this.f1587d;
        int i11 = this.f1589f;
        if ((!z8 && i10 == 2) || i11 < 1) {
            i7 = 1;
        } else {
            i7 = i11;
        }
        if (i10 == 2) {
            i8 = 2;
        } else {
            i8 = 1;
        }
        return new C1575a((C2807d) m999e, i7, i8, m3332i);
    }

    /* renamed from: c */
    public final void m997c() {
        this.f1593j = null;
        this.f1597n = null;
        this.f1598o = null;
        this.f1600q = -1;
        this.f1601r = -1;
        this.f1599p = AbstractC3092b.m4771h(0, 0, 0, 0);
        this.f1595l = AbstractC2072e.m3326b(0, 0);
        this.f1594k = false;
    }

    /* renamed from: d */
    public final void m998d(InterfaceC3093c interfaceC3093c) {
        long j6;
        InterfaceC3093c interfaceC3093c2 = this.f1592i;
        if (interfaceC3093c != null) {
            int i7 = AbstractC0456a.f1573b;
            j6 = AbstractC0456a.m994a(interfaceC3093c.mo559b(), interfaceC3093c.mo560l());
        } else {
            j6 = AbstractC0456a.f1572a;
        }
        if (interfaceC3093c2 == null) {
            this.f1592i = interfaceC3093c;
            this.f1591h = j6;
        } else {
            if (interfaceC3093c != null && this.f1591h == j6) {
                return;
            }
            this.f1592i = interfaceC3093c;
            this.f1591h = j6;
            m997c();
        }
    }

    /* renamed from: e */
    public final InterfaceC1612u m999e(EnumC3103m enumC3103m) {
        InterfaceC1612u interfaceC1612u = this.f1597n;
        if (interfaceC1612u == null || enumC3103m != this.f1598o || interfaceC1612u.mo2608b()) {
            this.f1598o = enumC3103m;
            String str = this.f1584a;
            C1604o0 m2564h = AbstractC1586f0.m2564h(this.f1585b, enumC3103m);
            InterfaceC3093c interfaceC3093c = this.f1592i;
            AbstractC3367j.m5097b(interfaceC3093c);
            InterfaceC2293d interfaceC2293d = this.f1586c;
            C1813u c1813u = C1813u.f10860e;
            interfaceC1612u = new C2807d(str, m2564h, c1813u, c1813u, interfaceC2293d, interfaceC3093c);
        }
        this.f1597n = interfaceC1612u;
        return interfaceC1612u;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        if (this.f1593j != null) {
            str = "<paragraph>";
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", lastDensity=");
        long j6 = this.f1591h;
        int i7 = AbstractC0456a.f1573b;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j6 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j6 & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
