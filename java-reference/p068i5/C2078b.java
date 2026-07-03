package p068i5;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
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
/* renamed from: i5.b */
/* loaded from: classes.dex */
public final class C2078b extends AbstractC1799g implements RandomAccess, Serializable {

    /* renamed from: e */
    public Object[] f12303e;

    /* renamed from: f */
    public final int f12304f;

    /* renamed from: g */
    public int f12305g;

    /* renamed from: h */
    public final C2078b f12306h;

    /* renamed from: i */
    public final C2079c f12307i;

    public C2078b(Object[] objArr, int i7, int i8, C2078b c2078b, C2079c c2079c) {
        int i9;
        AbstractC3367j.m5100e(objArr, "backing");
        AbstractC3367j.m5100e(c2079c, "root");
        this.f12303e = objArr;
        this.f12304f = i7;
        this.f12305g = i8;
        this.f12306h = c2078b;
        this.f12307i = c2079c;
        i9 = ((AbstractList) c2079c).modCount;
        ((AbstractList) this).modCount = i9;
    }

    @Override // p060h5.AbstractC1799g
    /* renamed from: a */
    public final int mo2999a() {
        m3360f();
        return this.f12305g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3361g();
        m3360f();
        m3359e(this.f12304f + this.f12305g, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        m3361g();
        m3360f();
        int size = collection.size();
        m3358d(this.f12304f + this.f12305g, collection, size);
        return size > 0;
    }

    @Override // p060h5.AbstractC1799g
    /* renamed from: b */
    public final Object mo3000b(int i7) {
        m3361g();
        m3360f();
        int i8 = this.f12305g;
        if (i7 >= 0 && i7 < i8) {
            return m3362h(this.f12304f + i7);
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3361g();
        m3360f();
        m3363i(this.f12304f, this.f12305g);
    }

    /* renamed from: d */
    public final void m3358d(int i7, Collection collection, int i8) {
        ((AbstractList) this).modCount++;
        C2079c c2079c = this.f12307i;
        C2078b c2078b = this.f12306h;
        if (c2078b != null) {
            c2078b.m3358d(i7, collection, i8);
        } else {
            C2079c c2079c2 = C2079c.f12308h;
            c2079c.m3366d(i7, collection, i8);
        }
        this.f12303e = c2079c.f12309e;
        this.f12305g += i8;
    }

    /* renamed from: e */
    public final void m3359e(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        C2079c c2079c = this.f12307i;
        C2078b c2078b = this.f12306h;
        if (c2078b != null) {
            c2078b.m3359e(i7, obj);
        } else {
            C2079c c2079c2 = C2079c.f12308h;
            c2079c.m3367e(i7, obj);
        }
        this.f12303e = c2079c.f12309e;
        this.f12305g++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m3360f();
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.f12303e;
                int i7 = this.f12305g;
                if (i7 == list.size()) {
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (AbstractC3367j.m5096a(objArr[this.f12304f + i8], list.get(i8))) {
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
    public final void m3360f() {
        int i7;
        i7 = ((AbstractList) this.f12307i).modCount;
        if (i7 == ((AbstractList) this).modCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: g */
    public final void m3361g() {
        if (!this.f12307i.f12311g) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        m3360f();
        int i8 = this.f12305g;
        if (i7 >= 0 && i7 < i8) {
            return this.f12303e[this.f12304f + i7];
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    /* renamed from: h */
    public final Object m3362h(int i7) {
        Object m3370h;
        ((AbstractList) this).modCount++;
        C2078b c2078b = this.f12306h;
        if (c2078b != null) {
            m3370h = c2078b.m3362h(i7);
        } else {
            C2079c c2079c = C2079c.f12308h;
            m3370h = this.f12307i.m3370h(i7);
        }
        this.f12305g--;
        return m3370h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7;
        m3360f();
        Object[] objArr = this.f12303e;
        int i8 = this.f12305g;
        int i9 = 1;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[this.f12304f + i10];
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
    public final void m3363i(int i7, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        C2078b c2078b = this.f12306h;
        if (c2078b != null) {
            c2078b.m3363i(i7, i8);
        } else {
            C2079c c2079c = C2079c.f12308h;
            this.f12307i.m3371i(i7, i8);
        }
        this.f12305g -= i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m3360f();
        for (int i7 = 0; i7 < this.f12305g; i7++) {
            if (AbstractC3367j.m5096a(this.f12303e[this.f12304f + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m3360f();
        if (this.f12305g == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: j */
    public final int m3364j(int i7, int i8, Collection collection, boolean z7) {
        int m3372j;
        C2078b c2078b = this.f12306h;
        if (c2078b != null) {
            m3372j = c2078b.m3364j(i7, i8, collection, z7);
        } else {
            C2079c c2079c = C2079c.f12308h;
            m3372j = this.f12307i.m3372j(i7, i8, collection, z7);
        }
        if (m3372j > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f12305g -= m3372j;
        return m3372j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m3360f();
        for (int i7 = this.f12305g - 1; i7 >= 0; i7--) {
            if (AbstractC3367j.m5096a(this.f12303e[this.f12304f + i7], obj)) {
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
        m3361g();
        m3360f();
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
        m3361g();
        m3360f();
        if (m3364j(this.f12304f, this.f12305g, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        m3361g();
        m3360f();
        if (m3364j(this.f12304f, this.f12305g, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        m3361g();
        m3360f();
        int i8 = this.f12305g;
        if (i7 >= 0 && i7 < i8) {
            Object[] objArr = this.f12303e;
            int i9 = this.f12304f;
            Object obj2 = objArr[i9 + i7];
            objArr[i9 + i7] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        AbstractC1793a0.m2982j(i7, i8, this.f12305g);
        return new C2078b(this.f12303e, this.f12304f + i7, i8 - i7, this, this.f12307i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC3367j.m5100e(objArr, "array");
        m3360f();
        int length = objArr.length;
        int i7 = this.f12305g;
        int i8 = this.f12304f;
        if (length < i7) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f12303e, i8, i7 + i8, objArr.getClass());
            AbstractC3367j.m5099d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC1804l.m3017J(this.f12303e, objArr, 0, i8, i7 + i8);
        int i9 = this.f12305g;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m3360f();
        return AbstractC2080d.m3393f(this.f12303e, this.f12304f, this.f12305g, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        m3360f();
        int i8 = this.f12305g;
        if (i7 >= 0 && i7 <= i8) {
            return new C2077a(this, i7);
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        m3361g();
        m3360f();
        int i8 = this.f12305g;
        if (i7 >= 0 && i7 <= i8) {
            m3359e(this.f12304f + i7, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        m3361g();
        m3360f();
        int i8 = this.f12305g;
        if (i7 >= 0 && i7 <= i8) {
            int size = collection.size();
            m3358d(this.f12304f + i7, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m3360f();
        Object[] objArr = this.f12303e;
        int i7 = this.f12305g;
        int i8 = this.f12304f;
        return AbstractC1804l.m3022O(objArr, i8, i7 + i8);
    }
}
