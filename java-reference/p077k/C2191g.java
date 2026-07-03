package p077k;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1805m;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3595b;
import p166v5.InterfaceC3598e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.g */
/* loaded from: classes.dex */
public final class C2191g implements Collection, Set, InterfaceC3595b, InterfaceC3598e {

    /* renamed from: e */
    public int[] f12660e = AbstractC2334a.f13322a;

    /* renamed from: f */
    public Object[] f12661f = AbstractC2334a.f13324c;

    /* renamed from: g */
    public int f12662g;

    /* renamed from: a */
    public final Object m3585a(int i7) {
        int i8 = this.f12662g;
        Object[] objArr = this.f12661f;
        Object obj = objArr[i7];
        if (i8 <= 1) {
            clear();
            return obj;
        }
        int i9 = i8 - 1;
        int[] iArr = this.f12660e;
        int i10 = 8;
        if (iArr.length > 8 && i8 < iArr.length / 3) {
            if (i8 > 8) {
                i10 = i8 + (i8 >> 1);
            }
            int[] iArr2 = new int[i10];
            this.f12660e = iArr2;
            this.f12661f = new Object[i10];
            if (i7 > 0) {
                AbstractC1804l.m3019L(iArr, iArr2, 0, i7, 6);
                AbstractC1804l.m3020M(objArr, this.f12661f, 0, i7, 6);
            }
            if (i7 < i9) {
                int i11 = i7 + 1;
                AbstractC1804l.m3015H(iArr, this.f12660e, i7, i11, i8);
                AbstractC1804l.m3017J(objArr, this.f12661f, i7, i11, i8);
            }
        } else {
            if (i7 < i9) {
                int i12 = i7 + 1;
                AbstractC1804l.m3015H(iArr, iArr, i7, i12, i8);
                Object[] objArr2 = this.f12661f;
                AbstractC1804l.m3017J(objArr2, objArr2, i7, i12, i8);
            }
            this.f12661f[i9] = null;
        }
        if (i8 == this.f12662g) {
            this.f12662g = i9;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int m3622a;
        int i8 = this.f12662g;
        if (obj == null) {
            m3622a = AbstractC2211q.m3622a(this, null, 0);
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            m3622a = AbstractC2211q.m3622a(this, obj, hashCode);
        }
        if (m3622a >= 0) {
            return false;
        }
        int i9 = ~m3622a;
        int[] iArr = this.f12660e;
        if (i8 >= iArr.length) {
            int i10 = 8;
            if (i8 >= 8) {
                i10 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f12661f;
            int[] iArr2 = new int[i10];
            this.f12660e = iArr2;
            this.f12661f = new Object[i10];
            if (i8 == this.f12662g) {
                if (iArr2.length != 0) {
                    AbstractC1804l.m3019L(iArr, iArr2, 0, iArr.length, 6);
                    AbstractC1804l.m3020M(objArr, this.f12661f, 0, objArr.length, 6);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i8) {
            int[] iArr3 = this.f12660e;
            int i11 = i9 + 1;
            AbstractC1804l.m3015H(iArr3, iArr3, i11, i9, i8);
            Object[] objArr2 = this.f12661f;
            AbstractC1804l.m3017J(objArr2, objArr2, i11, i9, i8);
        }
        int i12 = this.f12662g;
        if (i8 == i12) {
            int[] iArr4 = this.f12660e;
            if (i9 < iArr4.length) {
                iArr4[i9] = i7;
                this.f12661f[i9] = obj;
                this.f12662g = i12 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        int size = collection.size() + this.f12662g;
        int i7 = this.f12662g;
        int[] iArr = this.f12660e;
        boolean z7 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f12661f;
            int[] iArr2 = new int[size];
            this.f12660e = iArr2;
            this.f12661f = new Object[size];
            if (i7 > 0) {
                AbstractC1804l.m3019L(iArr, iArr2, 0, i7, 6);
                AbstractC1804l.m3020M(objArr, this.f12661f, 0, this.f12662g, 6);
            }
        }
        if (this.f12662g == i7) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z7 |= add(it.next());
            }
            return z7;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f12662g != 0) {
            this.f12660e = AbstractC2334a.f13322a;
            this.f12661f = AbstractC2334a.f13324c;
            this.f12662g = 0;
        }
        if (this.f12662g == 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int m3622a;
        if (obj == null) {
            m3622a = AbstractC2211q.m3622a(this, null, 0);
        } else {
            m3622a = AbstractC2211q.m3622a(this, obj, obj.hashCode());
        }
        if (m3622a < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f12662g != ((Set) obj).size()) {
            return false;
        }
        try {
            int i7 = this.f12662g;
            for (int i8 = 0; i8 < i7; i8++) {
                if (!((Set) obj).contains(this.f12661f[i8])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f12660e;
        int i7 = this.f12662g;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f12662g <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2181b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int m3622a;
        if (obj == null) {
            m3622a = AbstractC2211q.m3622a(this, null, 0);
        } else {
            m3622a = AbstractC2211q.m3622a(this, obj, obj.hashCode());
        }
        if (m3622a < 0) {
            return false;
        }
        m3585a(m3622a);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        Iterator it = collection.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= remove(it.next());
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC3367j.m5100e(collection, "elements");
        boolean z7 = false;
        for (int i7 = this.f12662g - 1; -1 < i7; i7--) {
            if (!AbstractC1805m.m3041e0(collection, this.f12661f[i7])) {
                m3585a(i7);
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f12662g;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC1804l.m3022O(this.f12661f, 0, this.f12662g);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12662g * 14);
        sb.append('{');
        int i7 = this.f12662g;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = this.f12661f[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        AbstractC3367j.m5100e(objArr, "array");
        int i7 = this.f12662g;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        } else if (objArr.length > i7) {
            objArr[i7] = null;
        }
        AbstractC1804l.m3017J(this.f12661f, objArr, 0, 0, this.f12662g);
        return objArr;
    }
}
