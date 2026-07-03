package p077k;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.e */
/* loaded from: classes.dex */
public final class C2187e implements Collection {

    /* renamed from: e */
    public final /* synthetic */ C2189f f12640e;

    public C2187e(C2189f c2189f) {
        this.f12640e = c2189f;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f12640e.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f12640e.m3625a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f12640e.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2181b(this.f12640e, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C2189f c2189f = this.f12640e;
        int m3625a = c2189f.m3625a(obj);
        if (m3625a >= 0) {
            c2189f.m3630f(m3625a);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2189f c2189f = this.f12640e;
        int i7 = c2189f.f12735g;
        int i8 = 0;
        boolean z7 = false;
        while (i8 < i7) {
            if (collection.contains(c2189f.m3632h(i8))) {
                c2189f.m3630f(i8);
                i8--;
                i7--;
                z7 = true;
            }
            i8++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2189f c2189f = this.f12640e;
        int i7 = c2189f.f12735g;
        int i8 = 0;
        boolean z7 = false;
        while (i8 < i7) {
            if (!collection.contains(c2189f.m3632h(i8))) {
                c2189f.m3630f(i8);
                i8--;
                i7--;
                z7 = true;
            }
            i8++;
        }
        return z7;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f12640e.f12735g;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C2189f c2189f = this.f12640e;
        int i7 = c2189f.f12735g;
        Object[] objArr = new Object[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c2189f.m3632h(i8);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C2189f c2189f = this.f12640e;
        int i7 = c2189f.f12735g;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        }
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = c2189f.m3632h(i8);
        }
        if (objArr.length > i7) {
            objArr[i7] = null;
        }
        return objArr;
    }
}
