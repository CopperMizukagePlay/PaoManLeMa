package p116p0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import p015b6.C0296c;
import p059h3.C1781g;
import p060h5.AbstractC1799g;
import p060h5.AbstractC1804l;
import p065i2.AbstractC2064e;
import p067i4.AbstractC2072e;
import p085l0.AbstractC2389n1;
import p138s0.C3087b;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3595b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p0.f */
/* loaded from: classes.dex */
public final class C2837f extends AbstractC1799g implements Collection, InterfaceC3595b {

    /* renamed from: e */
    public AbstractC2834c f14915e;

    /* renamed from: f */
    public Object[] f14916f;

    /* renamed from: g */
    public Object[] f14917g;

    /* renamed from: h */
    public int f14918h;

    /* renamed from: i */
    public C3087b f14919i = new Object();

    /* renamed from: j */
    public Object[] f14920j;

    /* renamed from: k */
    public Object[] f14921k;

    /* renamed from: l */
    public int f14922l;

    /* JADX WARN: Type inference failed for: r4v1, types: [s0.b, java.lang.Object] */
    public C2837f(AbstractC2834c abstractC2834c, Object[] objArr, Object[] objArr2, int i7) {
        this.f14915e = abstractC2834c;
        this.f14916f = objArr;
        this.f14917g = objArr2;
        this.f14918h = i7;
        this.f14920j = objArr;
        this.f14921k = objArr2;
        this.f14922l = abstractC2834c.mo299a();
    }

    /* renamed from: d */
    public static void m4471d(Object[] objArr, int i7, Iterator it) {
        while (i7 < 32 && it.hasNext()) {
            objArr[i7] = it.next();
            i7++;
        }
    }

    /* renamed from: A */
    public final Object m4472A(Object[] objArr, int i7, int i8, int i9) {
        int i10 = this.f14922l - i7;
        if (i10 == 1) {
            Object obj = this.f14921k[0];
            m4490q(objArr, i7, i8);
            return obj;
        }
        Object[] objArr2 = this.f14921k;
        Object obj2 = objArr2[i9];
        Object[] m4484k = m4484k(objArr2);
        AbstractC1804l.m3017J(objArr2, m4484k, i9, i9 + 1, i10);
        m4484k[i10 - 1] = null;
        this.f14920j = objArr;
        this.f14921k = m4484k;
        this.f14922l = (i7 + i10) - 1;
        this.f14918h = i8;
        return obj2;
    }

    /* renamed from: B */
    public final int m4473B() {
        int i7 = this.f14922l;
        if (i7 <= 32) {
            return 0;
        }
        return (i7 - 1) & (-32);
    }

    /* renamed from: C */
    public final Object[] m4474C(Object[] objArr, int i7, int i8, Object obj, C1781g c1781g) {
        int m3337o = AbstractC2072e.m3337o(i8, i7);
        Object[] m4484k = m4484k(objArr);
        if (i7 == 0) {
            if (m4484k != objArr) {
                ((AbstractList) this).modCount++;
            }
            c1781g.f10824a = m4484k[m3337o];
            m4484k[m3337o] = obj;
            return m4484k;
        }
        Object obj2 = m4484k[m3337o];
        AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m4484k[m3337o] = m4474C((Object[]) obj2, i7 - 5, i8, obj, c1781g);
        return m4484k;
    }

    /* renamed from: D */
    public final void m4475D(Collection collection, int i7, Object[] objArr, int i8, Object[][] objArr2, int i9, Object[] objArr3) {
        Object[] m4486m;
        if (i9 < 1) {
            AbstractC2389n1.m3828a("requires at least one nullBuffer");
        }
        Object[] m4484k = m4484k(objArr);
        objArr2[0] = m4484k;
        int i10 = i7 & 31;
        int size = ((collection.size() + i7) - 1) & 31;
        int i11 = (i8 - i10) + size;
        if (i11 < 32) {
            AbstractC1804l.m3017J(m4484k, objArr3, size + 1, i10, i8);
        } else {
            int i12 = i11 - 31;
            if (i9 == 1) {
                m4486m = m4484k;
            } else {
                m4486m = m4486m();
                i9--;
                objArr2[i9] = m4486m;
            }
            int i13 = i8 - i12;
            AbstractC1804l.m3017J(m4484k, objArr3, 0, i13, i8);
            AbstractC1804l.m3017J(m4484k, m4486m, size + 1, i10, i13);
            objArr3 = m4486m;
        }
        Iterator it = collection.iterator();
        m4471d(m4484k, i10, it);
        for (int i14 = 1; i14 < i9; i14++) {
            Object[] m4486m2 = m4486m();
            m4471d(m4486m2, 0, it);
            objArr2[i14] = m4486m2;
        }
        m4471d(objArr3, 0, it);
    }

    /* renamed from: E */
    public final int m4476E() {
        int i7 = this.f14922l;
        if (i7 <= 32) {
            return i7;
        }
        return i7 - ((i7 - 1) & (-32));
    }

    @Override // p060h5.AbstractC1799g
    /* renamed from: a */
    public final int mo2999a() {
        return this.f14922l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        AbstractC2064e.m3240m(i7, mo2999a());
        if (i7 == mo2999a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int m4473B = m4473B();
        if (i7 >= m4473B) {
            m4481h(this.f14920j, i7 - m4473B, obj);
            return;
        }
        C1781g c1781g = new C1781g(null);
        Object[] objArr = this.f14920j;
        AbstractC3367j.m5097b(objArr);
        m4481h(m4480g(objArr, this.f14918h, i7, obj, c1781g), 0, c1781g.f10824a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        Collection collection2;
        C2837f c2837f;
        Object[] m4486m;
        AbstractC2064e.m3240m(i7, this.f14922l);
        if (i7 == this.f14922l) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i8 = (i7 >> 5) << 5;
        int size = ((collection.size() + (this.f14922l - i8)) - 1) / 32;
        if (size == 0) {
            int i9 = i7 & 31;
            int size2 = ((collection.size() + i7) - 1) & 31;
            Object[] objArr = this.f14921k;
            Object[] m4484k = m4484k(objArr);
            AbstractC1804l.m3017J(objArr, m4484k, size2 + 1, i9, m4476E());
            m4471d(m4484k, i9, collection.iterator());
            this.f14921k = m4484k;
            this.f14922l = collection.size() + this.f14922l;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int m4476E = m4476E();
        int size3 = collection.size() + this.f14922l;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i7 >= m4473B()) {
            m4486m = m4486m();
            collection2 = collection;
            m4475D(collection2, i7, this.f14921k, m4476E, objArr2, size, m4486m);
            c2837f = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            c2837f = this;
            if (size3 > m4476E) {
                int i10 = size3 - m4476E;
                Object[] m4485l = m4485l(i10, c2837f.f14921k);
                c2837f.m4479f(collection2, i7, i10, objArr2, size, m4485l);
                objArr2 = objArr2;
                m4486m = m4485l;
            } else {
                Object[] objArr3 = c2837f.f14921k;
                m4486m = m4486m();
                int i11 = m4476E - size3;
                AbstractC1804l.m3017J(objArr3, m4486m, 0, i11, m4476E);
                int i12 = 32 - i11;
                Object[] m4485l2 = m4485l(i12, c2837f.f14921k);
                int i13 = size - 1;
                objArr2[i13] = m4485l2;
                c2837f.m4479f(collection2, i7, i12, objArr2, i13, m4485l2);
                collection2 = collection2;
            }
        }
        c2837f.f14920j = m4492s(c2837f.f14920j, i8, objArr2);
        c2837f.f14921k = m4486m;
        c2837f.f14922l = collection2.size() + c2837f.f14922l;
        return true;
    }

    @Override // p060h5.AbstractC1799g
    /* renamed from: b */
    public final Object mo3000b(int i7) {
        AbstractC2064e.m3239l(i7, mo2999a());
        ((AbstractList) this).modCount++;
        int m4473B = m4473B();
        if (i7 >= m4473B) {
            return m4472A(this.f14920j, m4473B, this.f14918h, i7 - m4473B);
        }
        C1781g c1781g = new C1781g(this.f14921k[0]);
        Object[] objArr = this.f14920j;
        AbstractC3367j.m5097b(objArr);
        m4472A(m4499z(objArr, this.f14918h, i7, c1781g), m4473B, this.f14918h, 0);
        return c1781g.f10824a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [s0.b, java.lang.Object] */
    /* renamed from: c */
    public final AbstractC2834c m4477c() {
        AbstractC2834c c2836e;
        Object[] objArr = this.f14920j;
        if (objArr == this.f14916f && this.f14921k == this.f14917g) {
            c2836e = this.f14915e;
        } else {
            this.f14919i = new Object();
            this.f14916f = objArr;
            Object[] objArr2 = this.f14921k;
            this.f14917g = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    c2836e = C2840i.f14929f;
                } else {
                    Object[] copyOf = Arrays.copyOf(objArr2, this.f14922l);
                    AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                    c2836e = new C2840i(copyOf);
                }
            } else {
                c2836e = new C2836e(objArr, objArr2, this.f14922l, this.f14918h);
            }
        }
        this.f14915e = c2836e;
        return c2836e;
    }

    /* renamed from: e */
    public final int m4478e() {
        return ((AbstractList) this).modCount;
    }

    /* renamed from: f */
    public final void m4479f(Collection collection, int i7, int i8, Object[][] objArr, int i9, Object[] objArr2) {
        if (this.f14920j != null) {
            int i10 = i7 >> 5;
            AbstractC2832a m4483j = m4483j(m4473B() >> 5);
            int i11 = i9;
            Object[] objArr3 = objArr2;
            while (m4483j.f14905e - 1 != i10) {
                Object[] objArr4 = (Object[]) m4483j.previous();
                AbstractC1804l.m3017J(objArr4, objArr3, 0, 32 - i8, 32);
                objArr3 = m4485l(i8, objArr4);
                i11--;
                objArr[i11] = objArr3;
            }
            Object[] objArr5 = (Object[]) m4483j.previous();
            int m4473B = i9 - (((m4473B() >> 5) - 1) - i10);
            if (m4473B < i9) {
                objArr2 = objArr[m4473B];
                AbstractC3367j.m5097b(objArr2);
            }
            m4475D(collection, i7, objArr5, 32, objArr, m4473B, objArr2);
            return;
        }
        throw new IllegalStateException("root is null");
    }

    /* renamed from: g */
    public final Object[] m4480g(Object[] objArr, int i7, int i8, Object obj, C1781g c1781g) {
        Object obj2;
        int m3337o = AbstractC2072e.m3337o(i8, i7);
        if (i7 == 0) {
            c1781g.f10824a = objArr[31];
            Object[] m4484k = m4484k(objArr);
            AbstractC1804l.m3017J(objArr, m4484k, m3337o + 1, m3337o, 31);
            m4484k[m3337o] = obj;
            return m4484k;
        }
        Object[] m4484k2 = m4484k(objArr);
        int i9 = i7 - 5;
        Object obj3 = m4484k2[m3337o];
        AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m4484k2[m3337o] = m4480g((Object[]) obj3, i9, i8, obj, c1781g);
        while (true) {
            m3337o++;
            if (m3337o >= 32 || (obj2 = m4484k2[m3337o]) == null) {
                break;
            }
            m4484k2[m3337o] = m4480g((Object[]) obj2, i9, 0, c1781g.f10824a, c1781g);
        }
        return m4484k2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        AbstractC2064e.m3239l(i7, mo2999a());
        if (m4473B() <= i7) {
            objArr = this.f14921k;
        } else {
            objArr = this.f14920j;
            AbstractC3367j.m5097b(objArr);
            for (int i8 = this.f14918h; i8 > 0; i8 -= 5) {
                Object obj = objArr[AbstractC2072e.m3337o(i7, i8)];
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    /* renamed from: h */
    public final void m4481h(Object[] objArr, int i7, Object obj) {
        int m4476E = m4476E();
        Object[] m4484k = m4484k(this.f14921k);
        if (m4476E < 32) {
            AbstractC1804l.m3017J(this.f14921k, m4484k, i7 + 1, i7, m4476E);
            m4484k[i7] = obj;
            this.f14920j = objArr;
            this.f14921k = m4484k;
            this.f14922l++;
            return;
        }
        Object[] objArr2 = this.f14921k;
        Object obj2 = objArr2[31];
        AbstractC1804l.m3017J(objArr2, m4484k, i7 + 1, i7, 31);
        m4484k[i7] = obj;
        m4493t(objArr, m4484k, m4487n(obj2));
    }

    /* renamed from: i */
    public final boolean m4482i(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.f14919i) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: j */
    public final AbstractC2832a m4483j(int i7) {
        Object[] objArr = this.f14920j;
        if (objArr != null) {
            int m4473B = m4473B() >> 5;
            AbstractC2064e.m3240m(i7, m4473B);
            int i8 = this.f14918h;
            if (i8 == 0) {
                return new C2835d(i7, objArr);
            }
            return new C2841j(objArr, i7, m4473B, i8 / 5);
        }
        throw new IllegalStateException("Invalid root");
    }

    /* renamed from: k */
    public final Object[] m4484k(Object[] objArr) {
        if (objArr == null) {
            return m4486m();
        }
        if (m4482i(objArr)) {
            return objArr;
        }
        Object[] m4486m = m4486m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC1804l.m3020M(objArr, m4486m, 0, length, 6);
        return m4486m;
    }

    /* renamed from: l */
    public final Object[] m4485l(int i7, Object[] objArr) {
        if (m4482i(objArr)) {
            AbstractC1804l.m3017J(objArr, objArr, i7, 0, 32 - i7);
            return objArr;
        }
        Object[] m4486m = m4486m();
        AbstractC1804l.m3017J(objArr, m4486m, i7, 0, 32 - i7);
        return m4486m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        AbstractC2064e.m3240m(i7, this.f14922l);
        return new C2839h(this, i7);
    }

    /* renamed from: m */
    public final Object[] m4486m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f14919i;
        return objArr;
    }

    /* renamed from: n */
    public final Object[] m4487n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f14919i;
        return objArr;
    }

    /* renamed from: o */
    public final Object[] m4488o(Object[] objArr, int i7, int i8) {
        if (i8 < 0) {
            AbstractC2389n1.m3828a("shift should be positive");
        }
        if (i8 == 0) {
            return objArr;
        }
        int m3337o = AbstractC2072e.m3337o(i7, i8);
        Object obj = objArr[m3337o];
        AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object m4488o = m4488o((Object[]) obj, i7, i8 - 5);
        if (m3337o < 31) {
            int i9 = m3337o + 1;
            if (objArr[i9] != null) {
                if (m4482i(objArr)) {
                    Arrays.fill(objArr, i9, 32, (Object) null);
                }
                Object[] m4486m = m4486m();
                AbstractC1804l.m3017J(objArr, m4486m, 0, 0, i9);
                objArr = m4486m;
            }
        }
        if (m4488o != objArr[m3337o]) {
            Object[] m4484k = m4484k(objArr);
            m4484k[m3337o] = m4488o;
            return m4484k;
        }
        return objArr;
    }

    /* renamed from: p */
    public final Object[] m4489p(Object[] objArr, int i7, int i8, C1781g c1781g) {
        Object[] m4489p;
        int m3337o = AbstractC2072e.m3337o(i8 - 1, i7);
        if (i7 == 5) {
            c1781g.f10824a = objArr[m3337o];
            m4489p = null;
        } else {
            Object obj = objArr[m3337o];
            AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            m4489p = m4489p((Object[]) obj, i7 - 5, i8, c1781g);
        }
        if (m4489p == null && m3337o == 0) {
            return null;
        }
        Object[] m4484k = m4484k(objArr);
        m4484k[m3337o] = m4489p;
        return m4484k;
    }

    /* renamed from: q */
    public final void m4490q(Object[] objArr, int i7, int i8) {
        if (i8 == 0) {
            this.f14920j = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f14921k = objArr;
            this.f14922l = i7;
            this.f14918h = i8;
            return;
        }
        C1781g c1781g = new C1781g(null);
        AbstractC3367j.m5097b(objArr);
        Object[] m4489p = m4489p(objArr, i8, i7, c1781g);
        AbstractC3367j.m5097b(m4489p);
        Object obj = c1781g.f10824a;
        AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f14921k = (Object[]) obj;
        this.f14922l = i7;
        if (m4489p[1] == null) {
            this.f14920j = (Object[]) m4489p[0];
            this.f14918h = i8 - 5;
        } else {
            this.f14920j = m4489p;
            this.f14918h = i8;
        }
    }

    /* renamed from: r */
    public final Object[] m4491r(Object[] objArr, int i7, int i8, Iterator it) {
        boolean z7;
        if (!it.hasNext()) {
            AbstractC2389n1.m3828a("invalid buffersIterator");
        }
        if (i8 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2389n1.m3828a("negative shift");
        }
        if (i8 == 0) {
            return (Object[]) it.next();
        }
        Object[] m4484k = m4484k(objArr);
        int m3337o = AbstractC2072e.m3337o(i7, i8);
        int i9 = i8 - 5;
        m4484k[m3337o] = m4491r((Object[]) m4484k[m3337o], i7, i9, it);
        while (true) {
            m3337o++;
            if (m3337o >= 32 || !it.hasNext()) {
                break;
            }
            m4484k[m3337o] = m4491r((Object[]) m4484k[m3337o], 0, i9, it);
        }
        return m4484k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m4498y(new C2833b(1, collection));
    }

    /* renamed from: s */
    public final Object[] m4492s(Object[] objArr, int i7, Object[][] objArr2) {
        Object[] m4484k;
        C0296c m5103h = AbstractC3367j.m5103h(objArr2);
        int i8 = i7 >> 5;
        int i9 = this.f14918h;
        if (i8 < (1 << i9)) {
            m4484k = m4491r(objArr, i7, i9, m5103h);
        } else {
            m4484k = m4484k(objArr);
        }
        while (m5103h.hasNext()) {
            this.f14918h += 5;
            m4484k = m4487n(m4484k);
            int i10 = this.f14918h;
            m4491r(m4484k, 1 << i10, i10, m5103h);
        }
        return m4484k;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        AbstractC2064e.m3239l(i7, mo2999a());
        if (m4473B() <= i7) {
            Object[] m4484k = m4484k(this.f14921k);
            if (m4484k != this.f14921k) {
                ((AbstractList) this).modCount++;
            }
            int i8 = i7 & 31;
            Object obj2 = m4484k[i8];
            m4484k[i8] = obj;
            this.f14921k = m4484k;
            return obj2;
        }
        C1781g c1781g = new C1781g(null);
        Object[] objArr = this.f14920j;
        AbstractC3367j.m5097b(objArr);
        this.f14920j = m4474C(objArr, this.f14918h, i7, obj, c1781g);
        return c1781g.f10824a;
    }

    /* renamed from: t */
    public final void m4493t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f14922l;
        int i8 = i7 >> 5;
        int i9 = this.f14918h;
        if (i8 > (1 << i9)) {
            this.f14920j = m4494u(this.f14918h + 5, m4487n(objArr), objArr2);
            this.f14921k = objArr3;
            this.f14918h += 5;
            this.f14922l++;
            return;
        }
        if (objArr == null) {
            this.f14920j = objArr2;
            this.f14921k = objArr3;
            this.f14922l = i7 + 1;
        } else {
            this.f14920j = m4494u(i9, objArr, objArr2);
            this.f14921k = objArr3;
            this.f14922l++;
        }
    }

    /* renamed from: u */
    public final Object[] m4494u(int i7, Object[] objArr, Object[] objArr2) {
        int m3337o = AbstractC2072e.m3337o(mo2999a() - 1, i7);
        Object[] m4484k = m4484k(objArr);
        if (i7 == 5) {
            m4484k[m3337o] = objArr2;
            return m4484k;
        }
        m4484k[m3337o] = m4494u(i7 - 5, (Object[]) m4484k[m3337o], objArr2);
        return m4484k;
    }

    /* renamed from: v */
    public final int m4495v(InterfaceC3279c interfaceC3279c, Object[] objArr, int i7, int i8, C1781g c1781g, ArrayList arrayList, ArrayList arrayList2) {
        Object[] m4486m;
        if (m4482i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c1781g.f10824a;
        AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj2 = objArr[i9];
            if (!((Boolean) interfaceC3279c.mo23f(obj2)).booleanValue()) {
                if (i8 == 32) {
                    if (!arrayList.isEmpty()) {
                        m4486m = (Object[]) arrayList.remove(arrayList.size() - 1);
                    } else {
                        m4486m = m4486m();
                    }
                    objArr3 = m4486m;
                    i8 = 0;
                }
                objArr3[i8] = obj2;
                i8++;
            }
        }
        c1781g.f10824a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i8;
    }

    /* renamed from: w */
    public final int m4496w(InterfaceC3279c interfaceC3279c, Object[] objArr, int i7, C1781g c1781g) {
        Object[] objArr2 = objArr;
        int i8 = i7;
        boolean z7 = false;
        for (int i9 = 0; i9 < i7; i9++) {
            Object obj = objArr[i9];
            if (((Boolean) interfaceC3279c.mo23f(obj)).booleanValue()) {
                if (!z7) {
                    objArr2 = m4484k(objArr);
                    z7 = true;
                    i8 = i9;
                }
            } else if (z7) {
                objArr2[i8] = obj;
                i8++;
            }
        }
        c1781g.f10824a = objArr2;
        return i8;
    }

    /* renamed from: x */
    public final int m4497x(InterfaceC3279c interfaceC3279c, int i7, C1781g c1781g) {
        int m4496w = m4496w(interfaceC3279c, this.f14921k, i7, c1781g);
        if (m4496w == i7) {
            return i7;
        }
        Object obj = c1781g.f10824a;
        AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, m4496w, i7, (Object) null);
        this.f14921k = objArr;
        this.f14922l -= i7 - m4496w;
        return m4496w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (m4497x(r1, r8, r5) != r8) goto L6;
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4498y(InterfaceC3279c interfaceC3279c) {
        Object[] m4491r;
        int i7;
        InterfaceC3279c interfaceC3279c2 = interfaceC3279c;
        int m4476E = m4476E();
        Object[] objArr = null;
        C1781g c1781g = new C1781g(null);
        boolean z7 = false;
        if (this.f14920j != null) {
            AbstractC2832a m4483j = m4483j(0);
            int i8 = 32;
            while (i8 == 32 && m4483j.hasNext()) {
                i8 = m4496w(interfaceC3279c2, (Object[]) m4483j.next(), 32, c1781g);
            }
            if (i8 == 32) {
                int m4497x = m4497x(interfaceC3279c2, m4476E, c1781g);
                if (m4497x == 0) {
                    m4490q(this.f14920j, this.f14922l, this.f14918h);
                }
            } else {
                int i9 = (m4483j.f14905e - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i10 = i8;
                while (m4483j.hasNext()) {
                    i10 = m4495v(interfaceC3279c2, (Object[]) m4483j.next(), 32, i10, c1781g, arrayList2, arrayList);
                    interfaceC3279c2 = interfaceC3279c;
                }
                int m4495v = m4495v(interfaceC3279c, this.f14921k, m4476E, i10, c1781g, arrayList2, arrayList);
                Object obj = c1781g.f10824a;
                AbstractC3367j.m5098c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, m4495v, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    m4491r = this.f14920j;
                    AbstractC3367j.m5097b(m4491r);
                } else {
                    m4491r = m4491r(this.f14920j, i9, this.f14918h, arrayList.iterator());
                }
                int size = i9 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC2389n1.m3828a("invalid size");
                }
                if (size == 0) {
                    this.f14918h = 0;
                } else {
                    int i11 = size - 1;
                    while (true) {
                        i7 = this.f14918h;
                        if ((i11 >> i7) != 0) {
                            break;
                        }
                        this.f14918h = i7 - 5;
                        Object[] objArr3 = m4491r[0];
                        AbstractC3367j.m5098c(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        m4491r = objArr3;
                    }
                    objArr = m4488o(m4491r, i11, i7);
                }
                this.f14920j = objArr;
                this.f14921k = objArr2;
                this.f14922l = size + m4495v;
            }
            z7 = true;
        }
        if (z7) {
            ((AbstractList) this).modCount++;
        }
        return z7;
    }

    /* renamed from: z */
    public final Object[] m4499z(Object[] objArr, int i7, int i8, C1781g c1781g) {
        int m3337o = AbstractC2072e.m3337o(i8, i7);
        int i9 = 31;
        if (i7 == 0) {
            Object obj = objArr[m3337o];
            Object[] m4484k = m4484k(objArr);
            AbstractC1804l.m3017J(objArr, m4484k, m3337o, m3337o + 1, 32);
            m4484k[31] = c1781g.f10824a;
            c1781g.f10824a = obj;
            return m4484k;
        }
        if (objArr[31] == null) {
            i9 = AbstractC2072e.m3337o(m4473B() - 1, i7);
        }
        Object[] m4484k2 = m4484k(objArr);
        int i10 = i7 - 5;
        int i11 = m3337o + 1;
        if (i11 <= i9) {
            while (true) {
                Object obj2 = m4484k2[i9];
                AbstractC3367j.m5098c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                m4484k2[i9] = m4499z((Object[]) obj2, i10, 0, c1781g);
                if (i9 == i11) {
                    break;
                }
                i9--;
            }
        }
        Object obj3 = m4484k2[m3337o];
        AbstractC3367j.m5098c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        m4484k2[m3337o] = m4499z((Object[]) obj3, i10, i8, c1781g);
        return m4484k2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int m4476E = m4476E();
        if (m4476E < 32) {
            Object[] m4484k = m4484k(this.f14921k);
            m4484k[m4476E] = obj;
            this.f14921k = m4484k;
            this.f14922l = mo2999a() + 1;
        } else {
            m4493t(this.f14920j, this.f14921k, m4487n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int m4476E = m4476E();
        Iterator it = collection.iterator();
        if (32 - m4476E >= collection.size()) {
            Object[] m4484k = m4484k(this.f14921k);
            m4471d(m4484k, m4476E, it);
            this.f14921k = m4484k;
            this.f14922l = collection.size() + this.f14922l;
            return true;
        }
        int size = ((collection.size() + m4476E) - 1) / 32;
        Object[][] objArr = new Object[size];
        Object[] m4484k2 = m4484k(this.f14921k);
        m4471d(m4484k2, m4476E, it);
        objArr[0] = m4484k2;
        for (int i7 = 1; i7 < size; i7++) {
            Object[] m4486m = m4486m();
            m4471d(m4486m, 0, it);
            objArr[i7] = m4486m;
        }
        this.f14920j = m4492s(this.f14920j, m4473B(), objArr);
        Object[] m4486m2 = m4486m();
        m4471d(m4486m2, 0, it);
        this.f14921k = m4486m2;
        this.f14922l = collection.size() + this.f14922l;
        return true;
    }
}
