package p123q0;

import java.util.Arrays;
import p037e3.C0691e;
import p060h5.AbstractC1804l;
import p068i5.AbstractC2080d;
import p073j2.AbstractC2168e;
import p085l0.AbstractC2389n1;
import p138s0.C3086a;
import p138s0.C3087b;
import p158u5.AbstractC3367j;
import p195z5.C3877b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q0.k */
/* loaded from: classes.dex */
public final class C2976k {

    /* renamed from: e */
    public static final C2976k f15392e = new C2976k(0, 0, new Object[0], null);

    /* renamed from: a */
    public int f15393a;

    /* renamed from: b */
    public int f15394b;

    /* renamed from: c */
    public final C3087b f15395c;

    /* renamed from: d */
    public Object[] f15396d;

    public C2976k(int i7, int i8, Object[] objArr, C3087b c3087b) {
        this.f15393a = i7;
        this.f15394b = i8;
        this.f15395c = c3087b;
        this.f15396d = objArr;
    }

    /* renamed from: j */
    public static C2976k m4614j(int i7, Object obj, Object obj2, int i8, Object obj3, Object obj4, int i9, C3087b c3087b) {
        Object[] objArr;
        if (i9 > 30) {
            return new C2976k(0, 0, new Object[]{obj, obj2, obj3, obj4}, c3087b);
        }
        int m3408u = AbstractC2080d.m3408u(i7, i9);
        int m3408u2 = AbstractC2080d.m3408u(i8, i9);
        if (m3408u != m3408u2) {
            if (m3408u < m3408u2) {
                objArr = new Object[]{obj, obj2, obj3, obj4};
            } else {
                objArr = new Object[]{obj3, obj4, obj, obj2};
            }
            return new C2976k((1 << m3408u) | (1 << m3408u2), 0, objArr, c3087b);
        }
        return new C2976k(0, 1 << m3408u, new Object[]{m4614j(i7, obj, obj2, i8, obj3, obj4, i9 + 5, c3087b)}, c3087b);
    }

    /* renamed from: a */
    public final Object[] m4615a(int i7, int i8, int i9, Object obj, Object obj2, int i10, C3087b c3087b) {
        int i11;
        Object obj3 = this.f15396d[i7];
        if (obj3 != null) {
            i11 = obj3.hashCode();
        } else {
            i11 = 0;
        }
        C2976k m4614j = m4614j(i11, obj3, m4637x(i7), i9, obj, obj2, i10 + 5, c3087b);
        int m4633t = m4633t(i8);
        int i12 = m4633t + 1;
        Object[] objArr = this.f15396d;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC1804l.m3020M(objArr, objArr2, 0, i7, 6);
        AbstractC1804l.m3017J(objArr, objArr2, i7, i7 + 2, i12);
        objArr2[m4633t - 1] = m4614j;
        AbstractC1804l.m3017J(objArr, objArr2, m4633t, i12, objArr.length);
        return objArr2;
    }

    /* renamed from: b */
    public final int m4616b() {
        if (this.f15394b == 0) {
            return this.f15396d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f15393a);
        int length = this.f15396d.length;
        for (int i7 = bitCount * 2; i7 < length; i7++) {
            bitCount += m4632s(i7).m4616b();
        }
        return bitCount;
    }

    /* renamed from: c */
    public final boolean m4617c(Object obj) {
        C3877b m3512F = AbstractC2168e.m3512F(AbstractC2168e.m3513G(0, this.f15396d.length), 2);
        int i7 = m3512F.f18163e;
        int i8 = m3512F.f18164f;
        int i9 = m3512F.f18165g;
        if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
            while (!AbstractC3367j.m5096a(obj, this.f15396d[i7])) {
                if (i7 != i8) {
                    i7 += i9;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m4618d(int i7, int i8, Object obj) {
        int m3408u = 1 << AbstractC2080d.m3408u(i7, i8);
        if (m4622h(m3408u)) {
            return AbstractC3367j.m5096a(obj, this.f15396d[m4620f(m3408u)]);
        }
        if (m4623i(m3408u)) {
            C2976k m4632s = m4632s(m4633t(m3408u));
            if (i8 == 30) {
                return m4632s.m4617c(obj);
            }
            return m4632s.m4618d(i7, i8 + 5, obj);
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m4619e(C2976k c2976k) {
        if (this != c2976k) {
            if (this.f15394b == c2976k.f15394b && this.f15393a == c2976k.f15393a) {
                int length = this.f15396d.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if (this.f15396d[i7] == c2976k.f15396d[i7]) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int m4620f(int i7) {
        return Integer.bitCount((i7 - 1) & this.f15393a) * 2;
    }

    /* renamed from: g */
    public final Object m4621g(int i7, int i8, Object obj) {
        int m3408u = 1 << AbstractC2080d.m3408u(i7, i8);
        if (m4622h(m3408u)) {
            int m4620f = m4620f(m3408u);
            if (AbstractC3367j.m5096a(obj, this.f15396d[m4620f])) {
                return m4637x(m4620f);
            }
            return null;
        }
        if (m4623i(m3408u)) {
            C2976k m4632s = m4632s(m4633t(m3408u));
            if (i8 == 30) {
                C3877b m3512F = AbstractC2168e.m3512F(AbstractC2168e.m3513G(0, m4632s.f15396d.length), 2);
                int i9 = m3512F.f18163e;
                int i10 = m3512F.f18164f;
                int i11 = m3512F.f18165g;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (!AbstractC3367j.m5096a(obj, m4632s.f15396d[i9])) {
                        if (i9 != i10) {
                            i9 += i11;
                        } else {
                            return null;
                        }
                    }
                    return m4632s.m4637x(i9);
                }
                return null;
            }
            return m4632s.m4621g(i7, i8 + 5, obj);
        }
        return null;
    }

    /* renamed from: h */
    public final boolean m4622h(int i7) {
        if ((i7 & this.f15393a) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m4623i(int i7) {
        if ((i7 & this.f15394b) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final C2976k m4624k(int i7, C2969d c2969d) {
        c2969d.m4612b(c2969d.f15382j - 1);
        c2969d.f15380h = m4637x(i7);
        Object[] objArr = this.f15396d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f15395c == c2969d.f15378f) {
            this.f15396d = AbstractC2080d.m3391d(i7, objArr);
            return this;
        }
        return new C2976k(0, 0, AbstractC2080d.m3391d(i7, objArr), c2969d.f15378f);
    }

    /* renamed from: l */
    public final C2976k m4625l(int i7, Object obj, Object obj2, int i8, C2969d c2969d) {
        C2969d c2969d2;
        C2976k m4625l;
        int m3408u = 1 << AbstractC2080d.m3408u(i7, i8);
        boolean m4622h = m4622h(m3408u);
        C3087b c3087b = this.f15395c;
        if (m4622h) {
            int m4620f = m4620f(m3408u);
            if (AbstractC3367j.m5096a(obj, this.f15396d[m4620f])) {
                c2969d.f15380h = m4637x(m4620f);
                if (m4637x(m4620f) == obj2) {
                    return this;
                }
                if (c3087b == c2969d.f15378f) {
                    this.f15396d[m4620f + 1] = obj2;
                    return this;
                }
                c2969d.f15381i++;
                Object[] objArr = this.f15396d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                copyOf[m4620f + 1] = obj2;
                return new C2976k(this.f15393a, this.f15394b, copyOf, c2969d.f15378f);
            }
            c2969d.m4612b(c2969d.f15382j + 1);
            C3087b c3087b2 = c2969d.f15378f;
            if (c3087b == c3087b2) {
                this.f15396d = m4615a(m4620f, m3408u, i7, obj, obj2, i8, c3087b2);
                this.f15393a ^= m3408u;
                this.f15394b |= m3408u;
                return this;
            }
            return new C2976k(this.f15393a ^ m3408u, this.f15394b | m3408u, m4615a(m4620f, m3408u, i7, obj, obj2, i8, c3087b2), c3087b2);
        }
        if (m4623i(m3408u)) {
            int m4633t = m4633t(m3408u);
            C2976k m4632s = m4632s(m4633t);
            if (i8 == 30) {
                C3877b m3512F = AbstractC2168e.m3512F(AbstractC2168e.m3513G(0, m4632s.f15396d.length), 2);
                int i9 = m3512F.f18163e;
                int i10 = m3512F.f18164f;
                int i11 = m3512F.f18165g;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (!AbstractC3367j.m5096a(obj, m4632s.f15396d[i9])) {
                        if (i9 != i10) {
                            i9 += i11;
                        }
                    }
                    c2969d.f15380h = m4632s.m4637x(i9);
                    if (m4632s.f15395c == c2969d.f15378f) {
                        m4632s.f15396d[i9 + 1] = obj2;
                        m4625l = m4632s;
                    } else {
                        c2969d.f15381i++;
                        Object[] objArr2 = m4632s.f15396d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
                        copyOf2[i9 + 1] = obj2;
                        m4625l = new C2976k(0, 0, copyOf2, c2969d.f15378f);
                    }
                    c2969d2 = c2969d;
                }
                c2969d.m4612b(c2969d.f15382j + 1);
                m4625l = new C2976k(0, 0, AbstractC2080d.m3390c(m4632s.f15396d, 0, obj, obj2), c2969d.f15378f);
                c2969d2 = c2969d;
            } else {
                c2969d2 = c2969d;
                m4625l = m4632s.m4625l(i7, obj, obj2, i8 + 5, c2969d2);
            }
            if (m4632s == m4625l) {
                return this;
            }
            return m4631r(m4633t, m4625l, c2969d2.f15378f);
        }
        c2969d.m4612b(c2969d.f15382j + 1);
        C3087b c3087b3 = c2969d.f15378f;
        int m4620f2 = m4620f(m3408u);
        if (c3087b == c3087b3) {
            this.f15396d = AbstractC2080d.m3390c(this.f15396d, m4620f2, obj, obj2);
            this.f15393a |= m3408u;
            return this;
        }
        return new C2976k(this.f15393a | m3408u, this.f15394b, AbstractC2080d.m3390c(this.f15396d, m4620f2, obj, obj2), c3087b3);
    }

    /* renamed from: m */
    public final C2976k m4626m(C2976k c2976k, int i7, C3086a c3086a, C2969d c2969d) {
        C2976k c2976k2;
        Object[] objArr;
        int i8;
        int i9;
        C2976k m4614j;
        int i10;
        int i11;
        int i12;
        if (this == c2976k) {
            c3086a.f15683a += m4616b();
            return this;
        }
        int i13 = 0;
        if (i7 > 30) {
            C3087b c3087b = c2969d.f15378f;
            int i14 = c2976k.f15394b;
            Object[] objArr2 = this.f15396d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + c2976k.f15396d.length);
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            int length = this.f15396d.length;
            C3877b m3512F = AbstractC2168e.m3512F(AbstractC2168e.m3513G(0, c2976k.f15396d.length), 2);
            int i15 = m3512F.f18163e;
            int i16 = m3512F.f18164f;
            int i17 = m3512F.f18165g;
            if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                while (true) {
                    if (!m4617c(c2976k.f15396d[i15])) {
                        Object[] objArr3 = c2976k.f15396d;
                        copyOf[length] = objArr3[i15];
                        copyOf[length + 1] = objArr3[i15 + 1];
                        length += 2;
                    } else {
                        c3086a.f15683a++;
                    }
                    if (i15 == i16) {
                        break;
                    }
                    i15 += i17;
                }
            }
            if (length != this.f15396d.length) {
                if (length == c2976k.f15396d.length) {
                    return c2976k;
                }
                if (length == copyOf.length) {
                    return new C2976k(0, 0, copyOf, c3087b);
                }
                Object[] copyOf2 = Arrays.copyOf(copyOf, length);
                AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
                return new C2976k(0, 0, copyOf2, c3087b);
            }
        } else {
            int i18 = this.f15394b | c2976k.f15394b;
            int i19 = this.f15393a;
            int i20 = c2976k.f15393a;
            int i21 = (i19 ^ i20) & (~i18);
            int i22 = i19 & i20;
            int i23 = i21;
            while (i22 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i22);
                if (AbstractC3367j.m5096a(this.f15396d[m4620f(lowestOneBit)], c2976k.f15396d[c2976k.m4620f(lowestOneBit)])) {
                    i23 |= lowestOneBit;
                } else {
                    i18 |= lowestOneBit;
                }
                i22 ^= lowestOneBit;
            }
            if ((i18 & i23) != 0) {
                AbstractC2389n1.m3829b("Check failed.");
            }
            if (AbstractC3367j.m5096a(this.f15395c, c2969d.f15378f) && this.f15393a == i23 && this.f15394b == i18) {
                c2976k2 = this;
            } else {
                c2976k2 = new C2976k(i23, i18, new Object[Integer.bitCount(i18) + (Integer.bitCount(i23) * 2)], null);
            }
            int i24 = i18;
            int i25 = 0;
            while (i24 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i24);
                Object[] objArr4 = c2976k2.f15396d;
                int length2 = (objArr4.length - 1) - i25;
                if (m4623i(lowestOneBit2)) {
                    m4614j = m4632s(m4633t(lowestOneBit2));
                    if (c2976k.m4623i(lowestOneBit2)) {
                        m4614j = m4614j.m4626m(c2976k.m4632s(c2976k.m4633t(lowestOneBit2)), i7 + 5, c3086a, c2969d);
                        objArr = objArr4;
                    } else if (c2976k.m4622h(lowestOneBit2)) {
                        int m4620f = c2976k.m4620f(lowestOneBit2);
                        Object obj = c2976k.f15396d[m4620f];
                        Object m4637x = c2976k.m4637x(m4620f);
                        int i26 = c2969d.f15382j;
                        if (obj != null) {
                            i12 = obj.hashCode();
                        } else {
                            i12 = i13;
                        }
                        int i27 = i12;
                        objArr = objArr4;
                        m4614j = m4614j.m4625l(i27, obj, m4637x, i7 + 5, c2969d);
                        if (c2969d.f15382j == i26) {
                            c3086a.f15683a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (c2976k.m4623i(lowestOneBit2)) {
                        C2976k m4632s = c2976k.m4632s(c2976k.m4633t(lowestOneBit2));
                        if (m4622h(lowestOneBit2)) {
                            int m4620f2 = m4620f(lowestOneBit2);
                            Object obj2 = this.f15396d[m4620f2];
                            if (obj2 != null) {
                                i10 = obj2.hashCode();
                            } else {
                                i10 = 0;
                            }
                            int i28 = i7 + 5;
                            if (m4632s.m4618d(i10, i28, obj2)) {
                                c3086a.f15683a++;
                            } else {
                                Object m4637x2 = m4637x(m4620f2);
                                if (obj2 != null) {
                                    i11 = obj2.hashCode();
                                } else {
                                    i11 = 0;
                                }
                                m4614j = m4632s.m4625l(i11, obj2, m4637x2, i28, c2969d);
                            }
                        }
                        m4614j = m4632s;
                    } else {
                        int m4620f3 = m4620f(lowestOneBit2);
                        Object obj3 = this.f15396d[m4620f3];
                        Object m4637x3 = m4637x(m4620f3);
                        int m4620f4 = c2976k.m4620f(lowestOneBit2);
                        Object obj4 = c2976k.f15396d[m4620f4];
                        Object m4637x4 = c2976k.m4637x(m4620f4);
                        if (obj3 != null) {
                            i8 = obj3.hashCode();
                        } else {
                            i8 = 0;
                        }
                        if (obj4 != null) {
                            i9 = obj4.hashCode();
                        } else {
                            i9 = 0;
                        }
                        m4614j = m4614j(i8, obj3, m4637x3, i9, obj4, m4637x4, i7 + 5, c2969d.f15378f);
                    }
                }
                objArr[length2] = m4614j;
                i25++;
                i24 ^= lowestOneBit2;
                i13 = 0;
            }
            int i29 = 0;
            while (i23 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i23);
                int i30 = i29 * 2;
                if (!c2976k.m4622h(lowestOneBit3)) {
                    int m4620f5 = m4620f(lowestOneBit3);
                    Object[] objArr5 = c2976k2.f15396d;
                    objArr5[i30] = this.f15396d[m4620f5];
                    objArr5[i30 + 1] = m4637x(m4620f5);
                } else {
                    int m4620f6 = c2976k.m4620f(lowestOneBit3);
                    Object[] objArr6 = c2976k2.f15396d;
                    objArr6[i30] = c2976k.f15396d[m4620f6];
                    objArr6[i30 + 1] = c2976k.m4637x(m4620f6);
                    if (m4622h(lowestOneBit3)) {
                        c3086a.f15683a++;
                    }
                }
                i29++;
                i23 ^= lowestOneBit3;
            }
            if (!m4619e(c2976k2)) {
                if (c2976k.m4619e(c2976k2)) {
                    return c2976k;
                }
                return c2976k2;
            }
        }
        return this;
    }

    /* renamed from: n */
    public final C2976k m4627n(int i7, Object obj, int i8, C2969d c2969d) {
        C2976k m4627n;
        int m3408u = 1 << AbstractC2080d.m3408u(i7, i8);
        if (m4622h(m3408u)) {
            int m4620f = m4620f(m3408u);
            if (AbstractC3367j.m5096a(obj, this.f15396d[m4620f])) {
                return m4629p(m4620f, m3408u, c2969d);
            }
        } else if (m4623i(m3408u)) {
            int m4633t = m4633t(m3408u);
            C2976k m4632s = m4632s(m4633t);
            if (i8 == 30) {
                C3877b m3512F = AbstractC2168e.m3512F(AbstractC2168e.m3513G(0, m4632s.f15396d.length), 2);
                int i9 = m3512F.f18163e;
                int i10 = m3512F.f18164f;
                int i11 = m3512F.f18165g;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (!AbstractC3367j.m5096a(obj, m4632s.f15396d[i9])) {
                        if (i9 != i10) {
                            i9 += i11;
                        }
                    }
                    m4627n = m4632s.m4624k(i9, c2969d);
                }
                m4627n = m4632s;
                break;
            }
            m4627n = m4632s.m4627n(i7, obj, i8 + 5, c2969d);
            return m4630q(m4632s, m4627n, m4633t, m3408u, c2969d.f15378f);
        }
        return this;
    }

    /* renamed from: o */
    public final C2976k m4628o(int i7, Object obj, Object obj2, int i8, C2969d c2969d) {
        C2976k c2976k;
        C2976k m4628o;
        int m3408u = 1 << AbstractC2080d.m3408u(i7, i8);
        if (m4622h(m3408u)) {
            int m4620f = m4620f(m3408u);
            if (AbstractC3367j.m5096a(obj, this.f15396d[m4620f]) && AbstractC3367j.m5096a(obj2, m4637x(m4620f))) {
                return m4629p(m4620f, m3408u, c2969d);
            }
        } else if (m4623i(m3408u)) {
            int m4633t = m4633t(m3408u);
            C2976k m4632s = m4632s(m4633t);
            if (i8 == 30) {
                C3877b m3512F = AbstractC2168e.m3512F(AbstractC2168e.m3513G(0, m4632s.f15396d.length), 2);
                int i9 = m3512F.f18163e;
                int i10 = m3512F.f18164f;
                int i11 = m3512F.f18165g;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (true) {
                        if (AbstractC3367j.m5096a(obj, m4632s.f15396d[i9]) && AbstractC3367j.m5096a(obj2, m4632s.m4637x(i9))) {
                            m4628o = m4632s.m4624k(i9, c2969d);
                            break;
                        }
                        if (i9 == i10) {
                            break;
                        }
                        i9 += i11;
                    }
                    c2976k = m4632s;
                }
                m4628o = m4632s;
                c2976k = m4632s;
            } else {
                c2976k = m4632s;
                m4628o = c2976k.m4628o(i7, obj, obj2, i8 + 5, c2969d);
            }
            return m4630q(c2976k, m4628o, m4633t, m3408u, c2969d.f15378f);
        }
        return this;
    }

    /* renamed from: p */
    public final C2976k m4629p(int i7, int i8, C2969d c2969d) {
        c2969d.m4612b(c2969d.f15382j - 1);
        c2969d.f15380h = m4637x(i7);
        Object[] objArr = this.f15396d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f15395c == c2969d.f15378f) {
            this.f15396d = AbstractC2080d.m3391d(i7, objArr);
            this.f15393a ^= i8;
            return this;
        }
        return new C2976k(i8 ^ this.f15393a, this.f15394b, AbstractC2080d.m3391d(i7, objArr), c2969d.f15378f);
    }

    /* renamed from: q */
    public final C2976k m4630q(C2976k c2976k, C2976k c2976k2, int i7, int i8, C3087b c3087b) {
        C3087b c3087b2 = this.f15395c;
        if (c2976k2 == null) {
            Object[] objArr = this.f15396d;
            if (objArr.length == 1) {
                return null;
            }
            if (c3087b2 == c3087b) {
                this.f15396d = AbstractC2080d.m3392e(i7, objArr);
                this.f15394b ^= i8;
                return this;
            }
            return new C2976k(this.f15393a, i8 ^ this.f15394b, AbstractC2080d.m3392e(i7, objArr), c3087b);
        }
        if (c3087b2 != c3087b && c2976k == c2976k2) {
            return this;
        }
        return m4631r(i7, c2976k2, c3087b);
    }

    /* renamed from: r */
    public final C2976k m4631r(int i7, C2976k c2976k, C3087b c3087b) {
        Object[] objArr = this.f15396d;
        if (objArr.length == 1 && c2976k.f15396d.length == 2 && c2976k.f15394b == 0) {
            c2976k.f15393a = this.f15394b;
            return c2976k;
        }
        if (this.f15395c == c3087b) {
            objArr[i7] = c2976k;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC3367j.m5099d(copyOf, "copyOf(...)");
        copyOf[i7] = c2976k;
        return new C2976k(this.f15393a, this.f15394b, copyOf, c3087b);
    }

    /* renamed from: s */
    public final C2976k m4632s(int i7) {
        Object obj = this.f15396d[i7];
        AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C2976k) obj;
    }

    /* renamed from: t */
    public final int m4633t(int i7) {
        return (this.f15396d.length - 1) - Integer.bitCount((i7 - 1) & this.f15394b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:
    
        r14.f2245b = m4636w(r12, r4, (p123q0.C2976k) r14.f2245b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e7, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00da, code lost:
    
        if (r14 == null) goto L35;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0691e m4634u(int i7, int i8, Object obj, Object obj2) {
        C0691e m4634u;
        int m3408u = 1 << AbstractC2080d.m3408u(i7, i8);
        if (m4622h(m3408u)) {
            int m4620f = m4620f(m3408u);
            if (AbstractC3367j.m5096a(obj, this.f15396d[m4620f])) {
                if (m4637x(m4620f) != obj2) {
                    Object[] objArr = this.f15396d;
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                    copyOf[m4620f + 1] = obj2;
                    return new C0691e(new C2976k(this.f15393a, this.f15394b, copyOf, null), 0);
                }
            } else {
                return new C0691e(new C2976k(this.f15393a ^ m3408u, this.f15394b | m3408u, m4615a(m4620f, m3408u, i7, obj, obj2, i8, null), null), 1);
            }
        } else if (m4623i(m3408u)) {
            int m4633t = m4633t(m3408u);
            C2976k m4632s = m4632s(m4633t);
            if (i8 == 30) {
                C3877b m3512F = AbstractC2168e.m3512F(AbstractC2168e.m3513G(0, m4632s.f15396d.length), 2);
                int i9 = m3512F.f18163e;
                int i10 = m3512F.f18164f;
                int i11 = m3512F.f18165g;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (!AbstractC3367j.m5096a(obj, m4632s.f15396d[i9])) {
                        if (i9 != i10) {
                            i9 += i11;
                        }
                    }
                    if (obj2 == m4632s.m4637x(i9)) {
                        m4634u = null;
                    } else {
                        Object[] objArr2 = m4632s.f15396d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
                        copyOf2[i9 + 1] = obj2;
                        m4634u = new C0691e(new C2976k(0, 0, copyOf2, null), 0);
                    }
                }
                m4634u = new C0691e(new C2976k(0, 0, AbstractC2080d.m3390c(m4632s.f15396d, 0, obj, obj2), null), 1);
                break;
            }
            m4634u = m4632s.m4634u(i7, i8 + 5, obj, obj2);
        } else {
            return new C0691e(new C2976k(this.f15393a | m3408u, this.f15394b, AbstractC2080d.m3390c(this.f15396d, m4620f(m3408u), obj, obj2), null), 1);
        }
        return null;
    }

    /* renamed from: v */
    public final C2976k m4635v(int i7, int i8, Object obj) {
        C2976k m4635v;
        int m3408u = 1 << AbstractC2080d.m3408u(i7, i8);
        if (m4622h(m3408u)) {
            int m4620f = m4620f(m3408u);
            if (AbstractC3367j.m5096a(obj, this.f15396d[m4620f])) {
                Object[] objArr = this.f15396d;
                if (objArr.length != 2) {
                    return new C2976k(this.f15393a ^ m3408u, this.f15394b, AbstractC2080d.m3391d(m4620f, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (m4623i(m3408u)) {
            int m4633t = m4633t(m3408u);
            C2976k m4632s = m4632s(m4633t);
            if (i8 == 30) {
                C3877b m3512F = AbstractC2168e.m3512F(AbstractC2168e.m3513G(0, m4632s.f15396d.length), 2);
                int i9 = m3512F.f18163e;
                int i10 = m3512F.f18164f;
                int i11 = m3512F.f18165g;
                if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                    while (!AbstractC3367j.m5096a(obj, m4632s.f15396d[i9])) {
                        if (i9 != i10) {
                            i9 += i11;
                        }
                    }
                    Object[] objArr2 = m4632s.f15396d;
                    if (objArr2.length == 2) {
                        m4635v = null;
                    } else {
                        m4635v = new C2976k(0, 0, AbstractC2080d.m3391d(i9, objArr2), null);
                    }
                }
                m4635v = m4632s;
                break;
            }
            m4635v = m4632s.m4635v(i7, i8 + 5, obj);
            if (m4635v == null) {
                Object[] objArr3 = this.f15396d;
                if (objArr3.length != 1) {
                    return new C2976k(this.f15393a, m3408u ^ this.f15394b, AbstractC2080d.m3392e(m4633t, objArr3), null);
                }
                return null;
            }
            if (m4632s != m4635v) {
                return m4636w(m4633t, m3408u, m4635v);
            }
        }
        return this;
    }

    /* renamed from: w */
    public final C2976k m4636w(int i7, int i8, C2976k c2976k) {
        Object[] objArr = c2976k.f15396d;
        if (objArr.length == 2 && c2976k.f15394b == 0) {
            if (this.f15396d.length == 1) {
                c2976k.f15393a = this.f15394b;
                return c2976k;
            }
            int m4620f = m4620f(i8);
            Object[] objArr2 = this.f15396d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            AbstractC1804l.m3017J(copyOf, copyOf, i7 + 2, i7 + 1, objArr2.length);
            AbstractC1804l.m3017J(copyOf, copyOf, m4620f + 2, m4620f, i7);
            copyOf[m4620f] = obj;
            copyOf[m4620f + 1] = obj2;
            return new C2976k(this.f15393a ^ i8, i8 ^ this.f15394b, copyOf, null);
        }
        Object[] objArr3 = this.f15396d;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
        copyOf2[i7] = c2976k;
        return new C2976k(this.f15393a, this.f15394b, copyOf2, null);
    }

    /* renamed from: x */
    public final Object m4637x(int i7) {
        return this.f15396d[i7 + 1];
    }
}
