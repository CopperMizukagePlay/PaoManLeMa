package p068i5;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p001a0.AbstractC0094y0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1799g;
import p060h5.AbstractC1804l;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i5.c */
/* loaded from: classes.dex */
public final class C2079c extends AbstractC1799g implements RandomAccess, Serializable {

    /* renamed from: h */
    public static final C2079c f12308h;

    /* renamed from: e */
    public Object[] f12309e;

    /* renamed from: f */
    public int f12310f;

    /* renamed from: g */
    public boolean f12311g;

    static {
        C2079c c2079c = new C2079c(0);
        c2079c.f12311g = true;
        f12308h = c2079c;
    }

    public C2079c(int i7) {
        if (i7 >= 0) {
            this.f12309e = new Object[i7];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    /* renamed from: c */
    public static final /* synthetic */ int m3365c(C2079c c2079c) {
        return ((AbstractList) c2079c).modCount;
    }

    @Override // p060h5.AbstractC1799g
    /* renamed from: a */
    public final int mo2999a() {
        return this.f12310f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3368f();
        int i7 = this.f12310f;
        ((AbstractList) this).modCount++;
        m3369g(i7, 1);
        this.f12309e[i7] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        m3368f();
        int size = collection.size();
        m3366d(this.f12310f, collection, size);
        return size > 0;
    }

    @Override // p060h5.AbstractC1799g
    /* renamed from: b */
    public final Object mo3000b(int i7) {
        m3368f();
        int i8 = this.f12310f;
        if (i7 >= 0 && i7 < i8) {
            return m3370h(i7);
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3368f();
        m3371i(0, this.f12310f);
    }

    /* renamed from: d */
    public final void m3366d(int i7, Collection collection, int i8) {
        ((AbstractList) this).modCount++;
        m3369g(i7, i8);
        Iterator it = collection.iterator();
        for (int i9 = 0; i9 < i8; i9++) {
            this.f12309e[i7 + i9] = it.next();
        }
    }

    /* renamed from: e */
    public final void m3367e(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        m3369g(i7, 1);
        this.f12309e[i7] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.f12309e;
                int i7 = this.f12310f;
                if (i7 == list.size()) {
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (AbstractC3367j.m5096a(objArr[i8], list.get(i8))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void m3368f() {
        if (!this.f12311g) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    public final void m3369g(int i7, int i8) {
        int i9 = this.f12310f + i8;
        if (i9 >= 0) {
            Object[] objArr = this.f12309e;
            if (i9 > objArr.length) {
                int length = objArr.length;
                int i10 = length + (length >> 1);
                if (i10 - i9 < 0) {
                    i10 = i9;
                }
                if (i10 - 2147483639 > 0) {
                    if (i9 > 2147483639) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr, i10);
                AbstractC3367j.m5099d(copyOf, "copyOf(...)");
                this.f12309e = copyOf;
            }
            Object[] objArr2 = this.f12309e;
            AbstractC1804l.m3017J(objArr2, objArr2, i7 + i8, i7, this.f12310f);
            this.f12310f += i8;
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i8 = this.f12310f;
        if (i7 >= 0 && i7 < i8) {
            return this.f12309e[i7];
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    /* renamed from: h */
    public final Object m3370h(int i7) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f12309e;
        Object obj = objArr[i7];
        AbstractC1804l.m3017J(objArr, objArr, i7, i7 + 1, this.f12310f);
        Object[] objArr2 = this.f12309e;
        int i8 = this.f12310f - 1;
        AbstractC3367j.m5100e(objArr2, "<this>");
        objArr2[i8] = null;
        this.f12310f--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7;
        Object[] objArr = this.f12309e;
        int i8 = this.f12310f;
        int i9 = 1;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            int i11 = i9 * 31;
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i9 = i11 + i7;
        }
        return i9;
    }

    /* renamed from: i */
    public final void m3371i(int i7, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f12309e;
        AbstractC1804l.m3017J(objArr, objArr, i7, i7 + i8, this.f12310f);
        Object[] objArr2 = this.f12309e;
        int i9 = this.f12310f;
        AbstractC2080d.m3380H(objArr2, i9 - i8, i9);
        this.f12310f -= i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i7 = 0; i7 < this.f12310f; i7++) {
            if (AbstractC3367j.m5096a(this.f12309e[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f12310f == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: j */
    public final int m3372j(int i7, int i8, Collection collection, boolean z7) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i7 + i9;
            if (collection.contains(this.f12309e[i11]) == z7) {
                Object[] objArr = this.f12309e;
                i9++;
                objArr[i10 + i7] = objArr[i11];
                i10++;
            } else {
                i9++;
            }
        }
        int i12 = i8 - i10;
        Object[] objArr2 = this.f12309e;
        AbstractC1804l.m3017J(objArr2, objArr2, i7 + i10, i8 + i7, this.f12310f);
        Object[] objArr3 = this.f12309e;
        int i13 = this.f12310f;
        AbstractC2080d.m3380H(objArr3, i13 - i12, i13);
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f12310f -= i12;
        return i12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i7 = this.f12310f - 1; i7 >= 0; i7--) {
            if (AbstractC3367j.m5096a(this.f12309e[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3368f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            mo3000b(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        m3368f();
        if (m3372j(0, this.f12310f, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        m3368f();
        if (m3372j(0, this.f12310f, collection, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        m3368f();
        int i8 = this.f12310f;
        if (i7 >= 0 && i7 < i8) {
            Object[] objArr = this.f12309e;
            Object obj2 = objArr[i7];
            objArr[i7] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        AbstractC1793a0.m2982j(i7, i8, this.f12310f);
        return new C2078b(this.f12309e, i7, i8 - i7, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC3367j.m5100e(objArr, "array");
        int length = objArr.length;
        int i7 = this.f12310f;
        if (length < i7) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f12309e, 0, i7, objArr.getClass());
            AbstractC3367j.m5099d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC1804l.m3017J(this.f12309e, objArr, 0, 0, i7);
        int i8 = this.f12310f;
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC2080d.m3393f(this.f12309e, 0, this.f12310f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        int i8 = this.f12310f;
        if (i7 >= 0 && i7 <= i8) {
            return new C2077a(this, i7);
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        m3368f();
        int i8 = this.f12310f;
        if (i7 >= 0 && i7 <= i8) {
            int size = collection.size();
            m3366d(i7, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        m3368f();
        int i8 = this.f12310f;
        if (i7 >= 0 && i7 <= i8) {
            ((AbstractList) this).modCount++;
            m3369g(i7, 1);
            this.f12309e[i7] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC1804l.m3022O(this.f12309e, 0, this.f12310f);
    }
}
