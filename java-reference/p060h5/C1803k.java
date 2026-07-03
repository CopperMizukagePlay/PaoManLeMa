package p060h5;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p001a0.AbstractC0094y0;
import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h5.k */
/* loaded from: classes.dex */
public final class C1803k extends AbstractC1799g {

    /* renamed from: h */
    public static final Object[] f10855h = new Object[0];

    /* renamed from: e */
    public int f10856e;

    /* renamed from: f */
    public Object[] f10857f;

    /* renamed from: g */
    public int f10858g;

    public C1803k() {
        this.f10857f = f10855h;
    }

    @Override // p060h5.AbstractC1799g
    /* renamed from: a */
    public final int mo2999a() {
        return this.f10858g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        int i9 = this.f10858g;
        if (i7 < 0 || i7 > i9) {
            throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i9, "index: ", ", size: "));
        }
        if (i7 == i9) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        m3009j();
        m3003d(this.f10858g + 1);
        int m3008i = m3008i(this.f10856e + i7);
        int i10 = this.f10858g;
        if (i7 < ((i10 + 1) >> 1)) {
            if (m3008i == 0) {
                Object[] objArr = this.f10857f;
                AbstractC3367j.m5100e(objArr, "<this>");
                m3008i = objArr.length;
            }
            int i11 = m3008i - 1;
            int i12 = this.f10856e;
            if (i12 == 0) {
                Object[] objArr2 = this.f10857f;
                AbstractC3367j.m5100e(objArr2, "<this>");
                i8 = objArr2.length - 1;
            } else {
                i8 = i12 - 1;
            }
            int i13 = this.f10856e;
            if (i11 >= i13) {
                Object[] objArr3 = this.f10857f;
                objArr3[i8] = objArr3[i13];
                AbstractC1804l.m3017J(objArr3, objArr3, i13, i13 + 1, i11 + 1);
            } else {
                Object[] objArr4 = this.f10857f;
                AbstractC1804l.m3017J(objArr4, objArr4, i13 - 1, i13, objArr4.length);
                Object[] objArr5 = this.f10857f;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC1804l.m3017J(objArr5, objArr5, 0, 1, i11 + 1);
            }
            this.f10857f[i11] = obj;
            this.f10856e = i8;
        } else {
            int m3008i2 = m3008i(i10 + this.f10856e);
            if (m3008i < m3008i2) {
                Object[] objArr6 = this.f10857f;
                AbstractC1804l.m3017J(objArr6, objArr6, m3008i + 1, m3008i, m3008i2);
            } else {
                Object[] objArr7 = this.f10857f;
                AbstractC1804l.m3017J(objArr7, objArr7, 1, 0, m3008i2);
                Object[] objArr8 = this.f10857f;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC1804l.m3017J(objArr8, objArr8, m3008i + 1, m3008i, objArr8.length - 1);
            }
            this.f10857f[m3008i] = obj;
        }
        this.f10858g++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        int i8 = this.f10858g;
        if (i7 >= 0 && i7 <= i8) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i7 == this.f10858g) {
                return addAll(collection);
            }
            m3009j();
            m3003d(collection.size() + this.f10858g);
            int m3008i = m3008i(this.f10858g + this.f10856e);
            int m3008i2 = m3008i(this.f10856e + i7);
            int size = collection.size();
            if (i7 < ((this.f10858g + 1) >> 1)) {
                int i9 = this.f10856e;
                int i10 = i9 - size;
                if (m3008i2 < i9) {
                    Object[] objArr = this.f10857f;
                    AbstractC1804l.m3017J(objArr, objArr, i10, i9, objArr.length);
                    if (size >= m3008i2) {
                        Object[] objArr2 = this.f10857f;
                        AbstractC1804l.m3017J(objArr2, objArr2, objArr2.length - size, 0, m3008i2);
                    } else {
                        Object[] objArr3 = this.f10857f;
                        AbstractC1804l.m3017J(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.f10857f;
                        AbstractC1804l.m3017J(objArr4, objArr4, 0, size, m3008i2);
                    }
                } else if (i10 >= 0) {
                    Object[] objArr5 = this.f10857f;
                    AbstractC1804l.m3017J(objArr5, objArr5, i10, i9, m3008i2);
                } else {
                    Object[] objArr6 = this.f10857f;
                    i10 += objArr6.length;
                    int i11 = m3008i2 - i9;
                    int length = objArr6.length - i10;
                    if (length >= i11) {
                        AbstractC1804l.m3017J(objArr6, objArr6, i10, i9, m3008i2);
                    } else {
                        AbstractC1804l.m3017J(objArr6, objArr6, i10, i9, i9 + length);
                        Object[] objArr7 = this.f10857f;
                        AbstractC1804l.m3017J(objArr7, objArr7, 0, this.f10856e + length, m3008i2);
                    }
                }
                this.f10856e = i10;
                m3002c(m3006g(m3008i2 - size), collection);
                return true;
            }
            int i12 = m3008i2 + size;
            if (m3008i2 < m3008i) {
                int i13 = size + m3008i;
                Object[] objArr8 = this.f10857f;
                if (i13 <= objArr8.length) {
                    AbstractC1804l.m3017J(objArr8, objArr8, i12, m3008i2, m3008i);
                } else if (i12 >= objArr8.length) {
                    AbstractC1804l.m3017J(objArr8, objArr8, i12 - objArr8.length, m3008i2, m3008i);
                } else {
                    int length2 = m3008i - (i13 - objArr8.length);
                    AbstractC1804l.m3017J(objArr8, objArr8, 0, length2, m3008i);
                    Object[] objArr9 = this.f10857f;
                    AbstractC1804l.m3017J(objArr9, objArr9, i12, m3008i2, length2);
                }
            } else {
                Object[] objArr10 = this.f10857f;
                AbstractC1804l.m3017J(objArr10, objArr10, size, 0, m3008i);
                Object[] objArr11 = this.f10857f;
                if (i12 >= objArr11.length) {
                    AbstractC1804l.m3017J(objArr11, objArr11, i12 - objArr11.length, m3008i2, objArr11.length);
                } else {
                    AbstractC1804l.m3017J(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f10857f;
                    AbstractC1804l.m3017J(objArr12, objArr12, i12, m3008i2, objArr12.length - size);
                }
            }
            m3002c(m3008i2, collection);
            return true;
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    public final void addFirst(Object obj) {
        m3009j();
        m3003d(this.f10858g + 1);
        int i7 = this.f10856e;
        if (i7 == 0) {
            Object[] objArr = this.f10857f;
            AbstractC3367j.m5100e(objArr, "<this>");
            i7 = objArr.length;
        }
        int i8 = i7 - 1;
        this.f10856e = i8;
        this.f10857f[i8] = obj;
        this.f10858g++;
    }

    public final void addLast(Object obj) {
        m3009j();
        m3003d(mo2999a() + 1);
        this.f10857f[m3008i(mo2999a() + this.f10856e)] = obj;
        this.f10858g = mo2999a() + 1;
    }

    @Override // p060h5.AbstractC1799g
    /* renamed from: b */
    public final Object mo3000b(int i7) {
        int i8 = this.f10858g;
        if (i7 >= 0 && i7 < i8) {
            if (i7 == AbstractC1806n.m3066N(this)) {
                return removeLast();
            }
            if (i7 == 0) {
                return removeFirst();
            }
            m3009j();
            int m3008i = m3008i(this.f10856e + i7);
            Object[] objArr = this.f10857f;
            Object obj = objArr[m3008i];
            if (i7 < (this.f10858g >> 1)) {
                int i9 = this.f10856e;
                if (m3008i >= i9) {
                    AbstractC1804l.m3017J(objArr, objArr, i9 + 1, i9, m3008i);
                } else {
                    AbstractC1804l.m3017J(objArr, objArr, 1, 0, m3008i);
                    Object[] objArr2 = this.f10857f;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i10 = this.f10856e;
                    AbstractC1804l.m3017J(objArr2, objArr2, i10 + 1, i10, objArr2.length - 1);
                }
                Object[] objArr3 = this.f10857f;
                int i11 = this.f10856e;
                objArr3[i11] = null;
                this.f10856e = m3004e(i11);
            } else {
                int m3008i2 = m3008i(AbstractC1806n.m3066N(this) + this.f10856e);
                if (m3008i <= m3008i2) {
                    Object[] objArr4 = this.f10857f;
                    AbstractC1804l.m3017J(objArr4, objArr4, m3008i, m3008i + 1, m3008i2 + 1);
                } else {
                    Object[] objArr5 = this.f10857f;
                    AbstractC1804l.m3017J(objArr5, objArr5, m3008i, m3008i + 1, objArr5.length);
                    Object[] objArr6 = this.f10857f;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    AbstractC1804l.m3017J(objArr6, objArr6, 0, 1, m3008i2 + 1);
                }
                this.f10857f[m3008i2] = null;
            }
            this.f10858g--;
            return obj;
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, i8, "index: ", ", size: "));
    }

    /* renamed from: c */
    public final void m3002c(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f10857f.length;
        while (i7 < length && it.hasNext()) {
            this.f10857f[i7] = it.next();
            i7++;
        }
        int i8 = this.f10856e;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f10857f[i9] = it.next();
        }
        this.f10858g = collection.size() + this.f10858g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m3009j();
            m3007h(this.f10856e, m3008i(mo2999a() + this.f10856e));
        }
        this.f10856e = 0;
        this.f10858g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m3003d(int i7) {
        if (i7 >= 0) {
            Object[] objArr = this.f10857f;
            if (i7 <= objArr.length) {
                return;
            }
            if (objArr == f10855h) {
                if (i7 < 10) {
                    i7 = 10;
                }
                this.f10857f = new Object[i7];
                return;
            }
            int length = objArr.length;
            int i8 = length + (length >> 1);
            if (i8 - i7 < 0) {
                i8 = i7;
            }
            if (i8 - 2147483639 > 0) {
                if (i7 > 2147483639) {
                    i8 = Integer.MAX_VALUE;
                } else {
                    i8 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i8];
            AbstractC1804l.m3017J(objArr, objArr2, 0, this.f10856e, objArr.length);
            Object[] objArr3 = this.f10857f;
            int length2 = objArr3.length;
            int i9 = this.f10856e;
            AbstractC1804l.m3017J(objArr3, objArr2, length2 - i9, 0, i9);
            this.f10856e = 0;
            this.f10857f = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    /* renamed from: e */
    public final int m3004e(int i7) {
        AbstractC3367j.m5100e(this.f10857f, "<this>");
        if (i7 == r0.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    /* renamed from: f */
    public final Object m3005f() {
        if (isEmpty()) {
            return null;
        }
        return this.f10857f[m3008i(AbstractC1806n.m3066N(this) + this.f10856e)];
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f10857f[this.f10856e];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* renamed from: g */
    public final int m3006g(int i7) {
        if (i7 < 0) {
            return i7 + this.f10857f.length;
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int mo2999a = mo2999a();
        if (i7 >= 0 && i7 < mo2999a) {
            return this.f10857f[m3008i(this.f10856e + i7)];
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, mo2999a, "index: ", ", size: "));
    }

    /* renamed from: h */
    public final void m3007h(int i7, int i8) {
        if (i7 < i8) {
            AbstractC1804l.m3023P(this.f10857f, i7, i8);
            return;
        }
        Object[] objArr = this.f10857f;
        AbstractC1804l.m3023P(objArr, i7, objArr.length);
        AbstractC1804l.m3023P(this.f10857f, 0, i8);
    }

    /* renamed from: i */
    public final int m3008i(int i7) {
        Object[] objArr = this.f10857f;
        if (i7 >= objArr.length) {
            return i7 - objArr.length;
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int m3008i = m3008i(mo2999a() + this.f10856e);
        int i8 = this.f10856e;
        if (i8 < m3008i) {
            while (i8 < m3008i) {
                if (AbstractC3367j.m5096a(obj, this.f10857f[i8])) {
                    i7 = this.f10856e;
                } else {
                    i8++;
                }
            }
            return -1;
        }
        if (i8 >= m3008i) {
            int length = this.f10857f.length;
            while (true) {
                if (i8 < length) {
                    if (AbstractC3367j.m5096a(obj, this.f10857f[i8])) {
                        i7 = this.f10856e;
                        break;
                    }
                    i8++;
                } else {
                    for (int i9 = 0; i9 < m3008i; i9++) {
                        if (AbstractC3367j.m5096a(obj, this.f10857f[i9])) {
                            i8 = i9 + this.f10857f.length;
                            i7 = this.f10856e;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i8 - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (mo2999a() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m3009j() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f10857f[m3008i(AbstractC1806n.m3066N(this) + this.f10856e)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
        int m3008i = m3008i(this.f10858g + this.f10856e);
        int i8 = this.f10856e;
        if (i8 < m3008i) {
            length = m3008i - 1;
            if (i8 <= length) {
                while (!AbstractC3367j.m5096a(obj, this.f10857f[length])) {
                    if (length != i8) {
                        length--;
                    }
                }
                i7 = this.f10856e;
                return length - i7;
            }
            return -1;
        }
        if (i8 > m3008i) {
            int i9 = m3008i - 1;
            while (true) {
                if (-1 < i9) {
                    if (AbstractC3367j.m5096a(obj, this.f10857f[i9])) {
                        length = i9 + this.f10857f.length;
                        i7 = this.f10856e;
                        break;
                    }
                    i9--;
                } else {
                    Object[] objArr = this.f10857f;
                    AbstractC3367j.m5100e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i10 = this.f10856e;
                    if (i10 <= length) {
                        while (!AbstractC3367j.m5096a(obj, this.f10857f[length])) {
                            if (length != i10) {
                                length--;
                            }
                        }
                        i7 = this.f10856e;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        mo3000b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int m3008i;
        AbstractC3367j.m5100e(collection, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f10857f.length != 0) {
            int m3008i2 = m3008i(this.f10858g + this.f10856e);
            int i7 = this.f10856e;
            if (i7 < m3008i2) {
                m3008i = i7;
                while (i7 < m3008i2) {
                    Object obj = this.f10857f[i7];
                    if (!collection.contains(obj)) {
                        this.f10857f[m3008i] = obj;
                        m3008i++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                AbstractC1804l.m3023P(this.f10857f, m3008i, m3008i2);
            } else {
                int length = this.f10857f.length;
                boolean z8 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f10857f;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (!collection.contains(obj2)) {
                        this.f10857f[i8] = obj2;
                        i8++;
                    } else {
                        z8 = true;
                    }
                    i7++;
                }
                m3008i = m3008i(i8);
                for (int i9 = 0; i9 < m3008i2; i9++) {
                    Object[] objArr2 = this.f10857f;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (!collection.contains(obj3)) {
                        this.f10857f[m3008i] = obj3;
                        m3008i = m3004e(m3008i);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                m3009j();
                this.f10858g = m3006g(m3008i - this.f10856e);
            }
        }
        return z7;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            m3009j();
            Object[] objArr = this.f10857f;
            int i7 = this.f10856e;
            Object obj = objArr[i7];
            objArr[i7] = null;
            this.f10856e = m3004e(i7);
            this.f10858g = mo2999a() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            m3009j();
            int m3008i = m3008i(AbstractC1806n.m3066N(this) + this.f10856e);
            Object[] objArr = this.f10857f;
            Object obj = objArr[m3008i];
            objArr[m3008i] = null;
            this.f10858g = mo2999a() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        AbstractC1793a0.m2982j(i7, i8, this.f10858g);
        int i9 = i8 - i7;
        if (i9 == 0) {
            return;
        }
        if (i9 == this.f10858g) {
            clear();
            return;
        }
        if (i9 == 1) {
            mo3000b(i7);
            return;
        }
        m3009j();
        if (i7 < this.f10858g - i8) {
            int m3008i = m3008i((i7 - 1) + this.f10856e);
            int m3008i2 = m3008i((i8 - 1) + this.f10856e);
            while (i7 > 0) {
                int i10 = m3008i + 1;
                int min = Math.min(i7, Math.min(i10, m3008i2 + 1));
                Object[] objArr = this.f10857f;
                int i11 = m3008i2 - min;
                int i12 = m3008i - min;
                AbstractC1804l.m3017J(objArr, objArr, i11 + 1, i12 + 1, i10);
                m3008i = m3006g(i12);
                m3008i2 = m3006g(i11);
                i7 -= min;
            }
            int m3008i3 = m3008i(this.f10856e + i9);
            m3007h(this.f10856e, m3008i3);
            this.f10856e = m3008i3;
        } else {
            int m3008i4 = m3008i(this.f10856e + i8);
            int m3008i5 = m3008i(this.f10856e + i7);
            int i13 = this.f10858g;
            while (true) {
                i13 -= i8;
                if (i13 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f10857f;
                i8 = Math.min(i13, Math.min(objArr2.length - m3008i4, objArr2.length - m3008i5));
                Object[] objArr3 = this.f10857f;
                int i14 = m3008i4 + i8;
                AbstractC1804l.m3017J(objArr3, objArr3, m3008i5, m3008i4, i14);
                m3008i4 = m3008i(i14);
                m3008i5 = m3008i(m3008i5 + i8);
            }
            int m3008i6 = m3008i(this.f10858g + this.f10856e);
            m3007h(m3006g(m3008i6 - i9), m3008i6);
        }
        this.f10858g -= i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int m3008i;
        AbstractC3367j.m5100e(collection, "elements");
        boolean z7 = false;
        z7 = false;
        z7 = false;
        if (!isEmpty() && this.f10857f.length != 0) {
            int m3008i2 = m3008i(this.f10858g + this.f10856e);
            int i7 = this.f10856e;
            if (i7 < m3008i2) {
                m3008i = i7;
                while (i7 < m3008i2) {
                    Object obj = this.f10857f[i7];
                    if (collection.contains(obj)) {
                        this.f10857f[m3008i] = obj;
                        m3008i++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                AbstractC1804l.m3023P(this.f10857f, m3008i, m3008i2);
            } else {
                int length = this.f10857f.length;
                boolean z8 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f10857f;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        this.f10857f[i8] = obj2;
                        i8++;
                    } else {
                        z8 = true;
                    }
                    i7++;
                }
                m3008i = m3008i(i8);
                for (int i9 = 0; i9 < m3008i2; i9++) {
                    Object[] objArr2 = this.f10857f;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        this.f10857f[m3008i] = obj3;
                        m3008i = m3004e(m3008i);
                    } else {
                        z8 = true;
                    }
                }
                z7 = z8;
            }
            if (z7) {
                m3009j();
                this.f10858g = m3006g(m3008i - this.f10856e);
            }
        }
        return z7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int mo2999a = mo2999a();
        if (i7 >= 0 && i7 < mo2999a) {
            int m3008i = m3008i(this.f10856e + i7);
            Object[] objArr = this.f10857f;
            Object obj2 = objArr[m3008i];
            objArr[m3008i] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(AbstractC0094y0.m182i(i7, mo2999a, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo2999a()]);
    }

    public C1803k(int i7) {
        Object[] objArr;
        if (i7 == 0) {
            objArr = f10855h;
        } else if (i7 > 0) {
            objArr = new Object[i7];
        } else {
            throw new IllegalArgumentException(AbstractC2647h.m4256b("Illegal Capacity: ", i7));
        }
        this.f10857f = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC3367j.m5100e(objArr, "array");
        int length = objArr.length;
        int i7 = this.f10858g;
        if (length < i7) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i7);
            AbstractC3367j.m5098c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int m3008i = m3008i(this.f10858g + this.f10856e);
        int i8 = this.f10856e;
        if (i8 < m3008i) {
            AbstractC1804l.m3020M(this.f10857f, objArr, i8, m3008i, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f10857f;
            AbstractC1804l.m3017J(objArr2, objArr, 0, this.f10856e, objArr2.length);
            Object[] objArr3 = this.f10857f;
            AbstractC1804l.m3017J(objArr3, objArr, objArr3.length - this.f10856e, 0, m3008i);
        }
        int i9 = this.f10858g;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m3009j();
        m3003d(collection.size() + mo2999a());
        m3002c(m3008i(mo2999a() + this.f10856e), collection);
        return true;
    }
}
