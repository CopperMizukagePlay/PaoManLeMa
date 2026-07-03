package p101n0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p158u5.AbstractC3366i;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3595b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n0.b */
/* loaded from: classes.dex */
public final class C2702b implements List, InterfaceC3595b {

    /* renamed from: e */
    public final C2705e f14511e;

    public C2702b(C2705e c2705e) {
        this.f14511e = c2705e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f14511e.m4300b(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        C2705e c2705e = this.f14511e;
        return c2705e.m4303e(c2705e.f14519g, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f14511e.m4305g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14511e.m4306h(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C2705e c2705e = this.f14511e;
        c2705e.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!c2705e.m4306h(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        AbstractC2706f.m4312a(i7, this);
        return this.f14511e.f14517e[i7];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f14511e.m4307i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.f14511e.f14519g == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2704d(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        C2705e c2705e = this.f14511e;
        Object[] objArr = c2705e.f14517e;
        for (int i7 = c2705e.f14519g - 1; i7 >= 0; i7--) {
            if (AbstractC3367j.m5096a(obj, objArr[i7])) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C2704d(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f14511e.m4308j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C2705e c2705e = this.f14511e;
        c2705e.getClass();
        if (!collection.isEmpty()) {
            int i7 = c2705e.f14519g;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                c2705e.m4308j(it.next());
            }
            if (i7 != c2705e.f14519g) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C2705e c2705e = this.f14511e;
        int i7 = c2705e.f14519g;
        for (int i8 = i7 - 1; -1 < i8; i8--) {
            if (!collection.contains(c2705e.f14517e[i8])) {
                c2705e.m4309k(i8);
            }
        }
        if (i7 != c2705e.f14519g) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        AbstractC2706f.m4312a(i7, this);
        Object[] objArr = this.f14511e.f14517e;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f14511e.f14519g;
    }

    @Override // java.util.List
    public final List subList(int i7, int i8) {
        AbstractC2706f.m4313b(this, i7, i8);
        return new C2703c(this, i7, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC3366i.m5094a(this);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        this.f14511e.m4299a(i7, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new C2704d(i7, this);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        AbstractC2706f.m4312a(i7, this);
        return this.f14511e.m4309k(i7);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC3366i.m5095b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        return this.f14511e.m4303e(i7, collection);
    }
}
