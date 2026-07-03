package p063i0;

import java.util.List;
import p060h5.AbstractC1806n;
import p065i2.AbstractC2064e;
import p066i3.AbstractC2067b;
import p067i4.AbstractC2072e;
import p071j0.C2122e;
import p071j0.C2124f;
import p071j0.C2155u0;
import p071j0.C2157v0;
import p071j0.InterfaceC2127g0;
import p071j0.InterfaceC2129h0;
import p085l0.InterfaceC2425y0;
import p140s2.C3101k;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p171w2.InterfaceC3774x;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3800h;
import p177x0.C3801i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.t1 */
/* loaded from: classes.dex */
public final class C2004t1 implements InterfaceC3774x {

    /* renamed from: a */
    public final int f11833a;

    /* renamed from: b */
    public final InterfaceC2425y0 f11834b;

    /* renamed from: c */
    public final C1962o f11835c;

    /* renamed from: d */
    public final C2122e f11836d;

    /* renamed from: e */
    public final C2122e f11837e;

    /* renamed from: f */
    public final C2155u0 f11838f;

    /* renamed from: g */
    public final C2155u0 f11839g;

    /* renamed from: h */
    public final C2124f f11840h;

    /* renamed from: i */
    public final C2124f f11841i;

    /* renamed from: j */
    public final C2157v0 f11842j;

    /* renamed from: k */
    public final C2157v0 f11843k;

    public C2004t1(InterfaceC3093c interfaceC3093c, int i7, InterfaceC2425y0 interfaceC2425y0, C1962o c1962o) {
        int mo4513Q = interfaceC3093c.mo4513Q(AbstractC2021v2.f11948a);
        this.f11833a = i7;
        this.f11834b = interfaceC2425y0;
        this.f11835c = c1962o;
        C3800h c3800h = C3795c.f17976q;
        this.f11836d = new C2122e(c3800h, c3800h, 0);
        C3800h c3800h2 = C3795c.f17978s;
        this.f11837e = new C2122e(c3800h2, c3800h2, 0);
        this.f11838f = new C2155u0(AbstractC3793a.f17961c);
        this.f11839g = new C2155u0(AbstractC3793a.f17962d);
        C3801i c3801i = C3795c.f17973n;
        C3801i c3801i2 = C3795c.f17975p;
        this.f11840h = new C2124f(c3801i, c3801i2, 0);
        this.f11841i = new C2124f(c3801i2, c3801i, 0);
        this.f11842j = new C2157v0(c3801i, mo4513Q);
        this.f11843k = new C2157v0(c3801i2, mo4513Q);
    }

    @Override // p171w2.InterfaceC3774x
    /* renamed from: a */
    public final long mo1252a(C3101k c3101k, long j6, EnumC3103m enumC3103m, long j7) {
        C2155u0 c2155u0;
        C3101k c3101k2;
        long j8;
        int i7;
        C2157v0 c2157v0;
        InterfaceC2425y0 interfaceC2425y0 = this.f11834b;
        if (interfaceC2425y0 != null) {
            interfaceC2425y0.getValue();
        }
        char c7 = ' ';
        long j9 = 4294967295L;
        long m3326b = AbstractC2072e.m3326b((int) (j6 >> 32), ((int) (j6 & 4294967295L)) + this.f11833a);
        int i8 = (int) (m3326b >> 32);
        if (((int) (c3101k.m4787a() >> 32)) < i8 / 2) {
            c2155u0 = this.f11838f;
        } else {
            c2155u0 = this.f11839g;
        }
        int i9 = 0;
        List m3067O = AbstractC1806n.m3067O(this.f11836d, this.f11837e, c2155u0);
        int size = m3067O.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                char c8 = c7;
                j8 = j9;
                int i11 = (int) (j7 >> c8);
                int i12 = size;
                int i13 = i10;
                c3101k2 = c3101k;
                List list = m3067O;
                i7 = ((InterfaceC2127g0) m3067O.get(i10)).mo3475a(c3101k2, m3326b, i11, enumC3103m);
                if (i13 == AbstractC1806n.m3066N(list) || (i7 >= 0 && i11 + i7 <= i8)) {
                    break;
                }
                i10 = i13 + 1;
                m3067O = list;
                size = i12;
                c7 = c8;
                j9 = j8;
            } else {
                c3101k2 = c3101k;
                j8 = j9;
                i7 = 0;
                break;
            }
        }
        int i14 = (int) (m3326b & j8);
        if (((int) (c3101k2.m4787a() & j8)) < i14 / 2) {
            c2157v0 = this.f11842j;
        } else {
            c2157v0 = this.f11843k;
        }
        List m3067O2 = AbstractC1806n.m3067O(this.f11840h, this.f11841i, c2157v0);
        int size2 = m3067O2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            int i16 = (int) (j7 & j8);
            int mo3476a = ((InterfaceC2129h0) m3067O2.get(i15)).mo3476a(c3101k2, m3326b, i16);
            if (i15 == AbstractC1806n.m3066N(m3067O2) || (mo3476a >= 0 && i16 + mo3476a <= i14)) {
                i9 = mo3476a;
                break;
            }
        }
        long m3234d = AbstractC2064e.m3234d(i7, i9);
        this.f11835c.mo22d(c3101k2, AbstractC2067b.m3278c(m3234d, j7));
        return m3234d;
    }
}
