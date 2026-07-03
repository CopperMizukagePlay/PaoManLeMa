package p077k;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.c */
/* loaded from: classes.dex */
public final class C2183c implements Set {

    /* renamed from: e */
    public final /* synthetic */ C2189f f12627e;

    public C2183c(C2189f c2189f) {
        this.f12627e = c2189f;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12627e.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12627e.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f12627e.m3583i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C2189f c2189f = this.f12627e;
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (c2189f.f12735g == set.size()) {
                        if (c2189f.m3583i(set)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        C2189f c2189f = this.f12627e;
        int i7 = 0;
        for (int i8 = c2189f.f12735g - 1; i8 >= 0; i8--) {
            Object m3629e = c2189f.m3629e(i8);
            if (m3629e == null) {
                hashCode = 0;
            } else {
                hashCode = m3629e.hashCode();
            }
            i7 += hashCode;
        }
        return i7;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12627e.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2181b(this.f12627e, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C2189f c2189f = this.f12627e;
        int m3627c = c2189f.m3627c(obj);
        if (m3627c >= 0) {
            c2189f.m3630f(m3627c);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f12627e.m3584j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2189f c2189f = this.f12627e;
        int i7 = c2189f.f12735g;
        for (int i8 = i7 - 1; i8 >= 0; i8--) {
            if (!collection.contains(c2189f.m3629e(i8))) {
                c2189f.m3630f(i8);
            }
        }
        if (i7 != c2189f.f12735g) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12627e.f12735g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C2189f c2189f = this.f12627e;
        int i7 = c2189f.f12735g;
        Object[] objArr = new Object[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c2189f.m3629e(i8);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2189f c2189f = this.f12627e;
        int i7 = c2189f.f12735g;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c2189f.m3629e(i8);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
