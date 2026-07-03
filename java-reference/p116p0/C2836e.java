package p116p0;

import java.util.Arrays;
import java.util.ListIterator;
import p059h3.C1781g;
import p060h5.AbstractC1804l;
import p065i2.AbstractC2064e;
import p067i4.AbstractC2072e;
import p085l0.AbstractC2389n1;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p0.e */
/* loaded from: classes.dex */
public final class C2836e extends AbstractC2834c {

    /* renamed from: e */
    public final Object[] f14911e;

    /* renamed from: f */
    public final Object[] f14912f;

    /* renamed from: g */
    public final int f14913g;

    /* renamed from: h */
    public final int f14914h;

    public C2836e(Object[] objArr, Object[] objArr2, int i7, int i8) {
        boolean z7;
        this.f14911e = objArr;
        this.f14912f = objArr2;
        this.f14913g = i7;
        this.f14914h = i8;
        if (mo299a() > 32) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2389n1.m3828a("Trie-based persistent vector should have at least 33 elements, got " + mo299a());
        }
        int length = objArr2.length;
    }

    /* renamed from: i */
    public static Object[] m4462i(Object[] objArr, int i7, int i8, Object obj, C1781g c1781g) {
        Object[] copyOf;
        int m3337o = AbstractC2072e.m3337o(i8, i7);
        if (i7 == 0) {
            if (m3337o == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            }
            AbstractC1804l.m3017J(objArr, copyOf, m3337o + 1, m3337o, 31);
            c1781g.f10824a = objArr[31];
            copyOf[m3337o] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
        int i9 = i7 - 5;
        Object obj2 = objArr[m3337o];
        AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[m3337o] = m4462i((Object[]) obj2, i9, i8, obj, c1781g);
        while (true) {
            m3337o++;
            if (m3337o >= 32 || copyOf2[m3337o] == null) {
                break;
            }
            Object obj3 = objArr[m3337o];
            AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[m3337o] = m4462i((Object[]) obj3, i9, 0, c1781g.f10824a, c1781g);
        }
        return copyOf2;
    }

    /* renamed from: k */
    public static Object[] m4463k(Object[] objArr, int i7, int i8, C1781g c1781g) {
        Object[] m4463k;
        int m3337o = AbstractC2072e.m3337o(i8, i7);
        if (i7 == 5) {
            c1781g.f10824a = objArr[m3337o];
            m4463k = null;
        } else {
            Object obj = objArr[m3337o];
            AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            m4463k = m4463k((Object[]) obj, i7 - 5, i8, c1781g);
        }
        if (m4463k == null && m3337o == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        AbstractC3367j.m5099d(copyOf, "copyOf(...)");
        copyOf[m3337o] = m4463k;
        return copyOf;
    }

    /* renamed from: q */
    public static Object[] m4464q(Object[] objArr, int i7, int i8, Object obj) {
        int m3337o = AbstractC2072e.m3337o(i8, i7);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        AbstractC3367j.m5099d(copyOf, "copyOf(...)");
        if (i7 == 0) {
            copyOf[m3337o] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[m3337o];
        AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[m3337o] = m4464q((Object[]) obj2, i7 - 5, i8, obj);
        return copyOf;
    }

    @Override // p060h5.AbstractC1792a
    /* renamed from: a */
    public final int mo299a() {
        return this.f14913g;
    }

    @Override // p116p0.AbstractC2834c
    /* renamed from: b */
    public final AbstractC2834c mo4455b(int i7, Object obj) {
        int i8 = this.f14913g;
        AbstractC2064e.m3240m(i7, i8);
        if (i7 == i8) {
            return mo4456c(obj);
        }
        int m4470p = m4470p();
        Object[] objArr = this.f14911e;
        if (i7 >= m4470p) {
            return m4465j(objArr, i7 - m4470p, obj);
        }
        C1781g c1781g = new C1781g(null);
        return m4465j(m4462i(objArr, this.f14914h, i7, obj, c1781g), 0, c1781g.f10824a);
    }

    @Override // p116p0.AbstractC2834c
    /* renamed from: c */
    public final AbstractC2834c mo4456c(Object obj) {
        int m4470p = m4470p();
        int i7 = this.f14913g;
        int i8 = i7 - m4470p;
        Object[] objArr = this.f14911e;
        Object[] objArr2 = this.f14912f;
        if (i8 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            copyOf[i8] = obj;
            return new C2836e(objArr, copyOf, i7 + 1, this.f14914h);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return m4466l(objArr, objArr2, objArr3);
    }

    @Override // p116p0.AbstractC2834c
    /* renamed from: e */
    public final C2837f mo4458e() {
        return new C2837f(this, this.f14911e, this.f14912f, this.f14914h);
    }

    @Override // p116p0.AbstractC2834c
    /* renamed from: f */
    public final AbstractC2834c mo4459f(C2833b c2833b) {
        C2837f c2837f = new C2837f(this, this.f14911e, this.f14912f, this.f14914h);
        c2837f.m4498y(c2833b);
        return c2837f.m4477c();
    }

    @Override // p116p0.AbstractC2834c
    /* renamed from: g */
    public final AbstractC2834c mo4460g(int i7) {
        AbstractC2064e.m3239l(i7, this.f14913g);
        int m4470p = m4470p();
        Object[] objArr = this.f14911e;
        int i8 = this.f14914h;
        if (i7 >= m4470p) {
            return m4469o(objArr, m4470p, i8, i7 - m4470p);
        }
        return m4469o(m4468n(objArr, i8, i7, new C1781g(this.f14912f[0])), m4470p, i8, 0);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        AbstractC2064e.m3239l(i7, mo299a());
        if (m4470p() <= i7) {
            objArr = this.f14912f;
        } else {
            objArr = this.f14911e;
            for (int i8 = this.f14914h; i8 > 0; i8 -= 5) {
                Object obj = objArr[AbstractC2072e.m3337o(i7, i8)];
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    @Override // p116p0.AbstractC2834c
    /* renamed from: h */
    public final AbstractC2834c mo4461h(int i7, Object obj) {
        int i8 = this.f14913g;
        AbstractC2064e.m3239l(i7, i8);
        int m4470p = m4470p();
        Object[] objArr = this.f14911e;
        Object[] objArr2 = this.f14912f;
        int i9 = this.f14914h;
        if (m4470p <= i7) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            copyOf[i7 & 31] = obj;
            return new C2836e(objArr, copyOf, i8, i9);
        }
        return new C2836e(m4464q(objArr, i9, i7, obj), objArr2, i8, i9);
    }

    /* renamed from: j */
    public final C2836e m4465j(Object[] objArr, int i7, Object obj) {
        int m4470p = m4470p();
        int i8 = this.f14913g;
        int i9 = i8 - m4470p;
        Object[] objArr2 = this.f14912f;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        AbstractC3367j.m5099d(copyOf, "copyOf(...)");
        if (i9 < 32) {
            AbstractC1804l.m3017J(objArr2, copyOf, i7 + 1, i7, i9);
            copyOf[i7] = obj;
            return new C2836e(objArr, copyOf, i8 + 1, this.f14914h);
        }
        Object obj2 = objArr2[31];
        AbstractC1804l.m3017J(objArr2, copyOf, i7 + 1, i7, i9 - 1);
        copyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m4466l(objArr, copyOf, objArr3);
    }

    /* renamed from: l */
    public final C2836e m4466l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f14913g;
        int i8 = i7 >> 5;
        int i9 = this.f14914h;
        if (i8 > (1 << i9)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i10 = i9 + 5;
            return new C2836e(m4467m(i10, objArr4, objArr2), objArr3, i7 + 1, i10);
        }
        return new C2836e(m4467m(i9, objArr, objArr2), objArr3, i7 + 1, i9);
    }

    @Override // p060h5.AbstractC1797e, java.util.List
    public final ListIterator listIterator(int i7) {
        AbstractC2064e.m3240m(i7, this.f14913g);
        return new C2838g(this.f14911e, this.f14912f, i7, this.f14913g, (this.f14914h / 5) + 1);
    }

    /* renamed from: m */
    public final Object[] m4467m(int i7, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int m3337o = AbstractC2072e.m3337o(mo299a() - 1, i7);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            AbstractC3367j.m5099d(objArr3, "copyOf(...)");
        } else {
            objArr3 = new Object[32];
        }
        if (i7 == 5) {
            objArr3[m3337o] = objArr2;
            return objArr3;
        }
        objArr3[m3337o] = m4467m(i7 - 5, (Object[]) objArr3[m3337o], objArr2);
        return objArr3;
    }

    /* renamed from: n */
    public final Object[] m4468n(Object[] objArr, int i7, int i8, C1781g c1781g) {
        Object[] copyOf;
        int m3337o = AbstractC2072e.m3337o(i8, i7);
        int i9 = 31;
        if (i7 == 0) {
            if (m3337o == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            }
            AbstractC1804l.m3017J(objArr, copyOf, m3337o, m3337o + 1, 32);
            copyOf[31] = c1781g.f10824a;
            c1781g.f10824a = objArr[m3337o];
            return copyOf;
        }
        if (objArr[31] == null) {
            i9 = AbstractC2072e.m3337o(m4470p() - 1, i7);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
        int i10 = i7 - 5;
        int i11 = m3337o + 1;
        if (i11 <= i9) {
            while (true) {
                Object obj = copyOf2[i9];
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[i9] = m4468n((Object[]) obj, i10, 0, c1781g);
                if (i9 == i11) {
                    break;
                }
                i9--;
            }
        }
        Object obj2 = copyOf2[m3337o];
        AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[m3337o] = m4468n((Object[]) obj2, i10, i8, c1781g);
        return copyOf2;
    }

    /* renamed from: o */
    public final AbstractC2834c m4469o(Object[] objArr, int i7, int i8, int i9) {
        int i10 = this.f14913g - i7;
        if (i10 == 1) {
            if (i8 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                    AbstractC3367j.m5099d(objArr, "copyOf(...)");
                }
                return new C2840i(objArr);
            }
            C1781g c1781g = new C1781g(null);
            Object[] m4463k = m4463k(objArr, i8, i7 - 1, c1781g);
            AbstractC3367j.m5097b(m4463k);
            Object obj = c1781g.f10824a;
            AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) obj;
            if (m4463k[1] == null) {
                Object obj2 = m4463k[0];
                AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                return new C2836e((Object[]) obj2, objArr2, i7, i8 - 5);
            }
            return new C2836e(m4463k, objArr2, i7, i8);
        }
        Object[] objArr3 = this.f14912f;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        AbstractC3367j.m5099d(copyOf, "copyOf(...)");
        int i11 = i10 - 1;
        if (i9 < i11) {
            AbstractC1804l.m3017J(objArr3, copyOf, i9, i9 + 1, i10);
        }
        copyOf[i11] = null;
        return new C2836e(objArr, copyOf, (i7 + i10) - 1, i8);
    }

    /* renamed from: p */
    public final int m4470p() {
        return (this.f14913g - 1) & (-32);
    }
}
