package p071j0;

import java.util.List;
import p060h5.AbstractC1806n;
import p063i0.AbstractC2021v2;
import p063i0.C1962o;
import p065i2.AbstractC2064e;
import p066i3.AbstractC2067b;
import p100n.AbstractC2647h;
import p140s2.C3097g;
import p140s2.C3101k;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;
import p171w2.InterfaceC3774x;
import p177x0.AbstractC3793a;
import p177x0.C3795c;
import p177x0.C3800h;
import p177x0.C3801i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.u */
/* loaded from: classes.dex */
public final class C2154u implements InterfaceC3774x {

    /* renamed from: a */
    public final long f12532a;

    /* renamed from: b */
    public final InterfaceC3093c f12533b;

    /* renamed from: c */
    public final int f12534c;

    /* renamed from: d */
    public final C1962o f12535d;

    /* renamed from: e */
    public final C2122e f12536e;

    /* renamed from: f */
    public final C2122e f12537f;

    /* renamed from: g */
    public final C2155u0 f12538g;

    /* renamed from: h */
    public final C2155u0 f12539h;

    /* renamed from: i */
    public final C2124f f12540i;

    /* renamed from: j */
    public final C2124f f12541j;

    /* renamed from: k */
    public final C2124f f12542k;

    /* renamed from: l */
    public final C2157v0 f12543l;

    /* renamed from: m */
    public final C2157v0 f12544m;

    public C2154u(long j6, InterfaceC3093c interfaceC3093c, C1962o c1962o) {
        int mo4513Q = interfaceC3093c.mo4513Q(AbstractC2021v2.f11948a);
        this.f12532a = j6;
        this.f12533b = interfaceC3093c;
        this.f12534c = mo4513Q;
        this.f12535d = c1962o;
        int mo4513Q2 = interfaceC3093c.mo4513Q(Float.intBitsToFloat((int) (j6 >> 32)));
        C3800h c3800h = C3795c.f17976q;
        this.f12536e = new C2122e(c3800h, c3800h, mo4513Q2);
        C3800h c3800h2 = C3795c.f17978s;
        this.f12537f = new C2122e(c3800h2, c3800h2, mo4513Q2);
        this.f12538g = new C2155u0(AbstractC3793a.f17961c);
        this.f12539h = new C2155u0(AbstractC3793a.f17962d);
        int mo4513Q3 = interfaceC3093c.mo4513Q(Float.intBitsToFloat((int) (j6 & 4294967295L)));
        C3801i c3801i = C3795c.f17973n;
        C3801i c3801i2 = C3795c.f17975p;
        this.f12540i = new C2124f(c3801i, c3801i2, mo4513Q3);
        this.f12541j = new C2124f(c3801i2, c3801i, mo4513Q3);
        this.f12542k = new C2124f(C3795c.f17974o, c3801i, mo4513Q3);
        this.f12543l = new C2157v0(c3801i, mo4513Q);
        this.f12544m = new C2157v0(c3801i2, mo4513Q);
    }

    @Override // p171w2.InterfaceC3774x
    /* renamed from: a */
    public final long mo1252a(C3101k c3101k, long j6, EnumC3103m enumC3103m, long j7) {
        C2155u0 c2155u0;
        C3101k c3101k2;
        long j8;
        int i7;
        C2157v0 c2157v0;
        int i8;
        char c7 = ' ';
        int i9 = (int) (j6 >> 32);
        if (((int) (c3101k.m4787a() >> 32)) < i9 / 2) {
            c2155u0 = this.f12538g;
        } else {
            c2155u0 = this.f12539h;
        }
        int i10 = 0;
        List m3067O = AbstractC1806n.m3067O(this.f12536e, this.f12537f, c2155u0);
        int size = m3067O.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                InterfaceC2127g0 interfaceC2127g0 = (InterfaceC2127g0) m3067O.get(i11);
                int i12 = (int) (j7 >> c7);
                int i13 = size;
                int i14 = i11;
                c3101k2 = c3101k;
                j8 = j6;
                i7 = interfaceC2127g0.mo3475a(c3101k2, j8, i12, enumC3103m);
                if (i14 == AbstractC1806n.m3066N(m3067O) || (i7 >= 0 && i12 + i7 <= i9)) {
                    break;
                }
                i11 = i14 + 1;
                size = i13;
                c7 = ' ';
            } else {
                c3101k2 = c3101k;
                j8 = j6;
                i7 = 0;
                break;
            }
        }
        int i15 = (int) (j8 & 4294967295L);
        if (((int) (c3101k2.m4787a() & 4294967295L)) < i15 / 2) {
            c2157v0 = this.f12543l;
        } else {
            c2157v0 = this.f12544m;
        }
        List m3067O2 = AbstractC1806n.m3067O(this.f12540i, this.f12541j, this.f12542k, c2157v0);
        int size2 = m3067O2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            int i17 = (int) (j7 & 4294967295L);
            int mo3476a = ((InterfaceC2129h0) m3067O2.get(i16)).mo3476a(c3101k2, j8, i17);
            if (i16 == AbstractC1806n.m3066N(m3067O2) || (mo3476a >= (i8 = this.f12534c) && i17 + mo3476a <= i15 - i8)) {
                i10 = mo3476a;
                break;
            }
        }
        long m3234d = AbstractC2064e.m3234d(i7, i10);
        this.f12535d.mo22d(c3101k2, AbstractC2067b.m3278c(m3234d, j7));
        return m3234d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2154u) {
                C2154u c2154u = (C2154u) obj;
                if (this.f12532a == c2154u.f12532a && AbstractC3367j.m5096a(this.f12533b, c2154u.f12533b) && this.f12534c == c2154u.f12534c && AbstractC3367j.m5096a(this.f12535d, c2154u.f12535d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f12535d.hashCode() + AbstractC2647h.m4255a(this.f12534c, (this.f12533b.hashCode() + (Long.hashCode(this.f12532a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) C3097g.m4778a(this.f12532a)) + ", density=" + this.f12533b + ", verticalMargin=" + this.f12534c + ", onPositionCalculated=" + this.f12535d + ')';
    }
}
